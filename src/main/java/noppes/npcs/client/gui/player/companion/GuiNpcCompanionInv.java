// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.player.companion;

import noppes.npcs.constants.EnumCompanionTalent;
import org.lwjgl.opengl.GL11;
import noppes.npcs.constants.EnumGuiType;
import noppes.npcs.CustomNpcs;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.inventory.Container;
import noppes.npcs.containers.ContainerNPCCompanion;
import noppes.npcs.roles.RoleCompanion;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.util.ResourceLocation;
import noppes.npcs.client.gui.util.GuiContainerNPCInterface;

public class GuiNpcCompanionInv extends GuiContainerNPCInterface
{
    private final ResourceLocation resource;
    private final ResourceLocation slot;
    private EntityNPCInterface npc;
    private RoleCompanion role;
    
    public GuiNpcCompanionInv(final EntityNPCInterface npc, final ContainerNPCCompanion container) {
        super(npc, container);
        this.resource = new ResourceLocation("customnpcs", "textures/gui/companioninv.png");
        this.slot = new ResourceLocation("customnpcs", "textures/gui/slot.png");
        this.npc = npc;
        this.role = (RoleCompanion)npc.roleInterface;
        this.closeOnEsc = true;
        this.xSize = 171;
        this.ySize = 166;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        GuiNpcCompanionStats.addTopMenu(this.role, (GuiScreen)this, 3);
    }
    
    public void actionPerformed(final GuiButton guibutton) {
        super.actionPerformed(guibutton);
        final int id = guibutton.id;
        if (id == 1) {
            CustomNpcs.proxy.openGui(this.npc, EnumGuiType.Companion);
        }
        if (id == 2) {
            CustomNpcs.proxy.openGui(this.npc, EnumGuiType.CompanionTalent);
        }
    }
    
    @Override
    protected void drawGuiContainerForegroundLayer(final int par1, final int par2) {
    }
    
    @Override
    protected void drawGuiContainerBackgroundLayer(final float f, final int xMouse, final int yMouse) {
        this.drawWorldBackground(0);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.renderEngine.bindTexture(this.resource);
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
        this.mc.renderEngine.bindTexture(this.slot);
        if (this.role.getTalentLevel(EnumCompanionTalent.ARMOR) > 0) {
            for (int i = 0; i < 4; ++i) {
                this.drawTexturedModalRect(this.guiLeft + 5, this.guiTop + 7 + i * 18, 0, 0, 18, 18);
            }
        }
        if (this.role.getTalentLevel(EnumCompanionTalent.SWORD) > 0) {
            this.drawTexturedModalRect(this.guiLeft + 78, this.guiTop + 16, 0, (this.npc.inventory.weapons.get(0) == null) ? 18 : 0, 18, 18);
        }
        if (this.role.getTalentLevel(EnumCompanionTalent.RANGED) > 0) {}
        if (this.role.talents.containsKey(EnumCompanionTalent.INVENTORY)) {
            for (int size = (this.role.getTalentLevel(EnumCompanionTalent.INVENTORY) + 1) * 2, j = 0; j < size; ++j) {
                this.drawTexturedModalRect(this.guiLeft + 113 + j % 3 * 18, this.guiTop + 7 + j / 3 * 18, 0, 0, 18, 18);
            }
        }
        super.drawNpc(52, 70);
    }
    
    @Override
    public void drawScreen(final int i, final int j, final float f) {
        super.drawScreen(i, j, f);
    }
    
    @Override
    public void save() {
    }
}
