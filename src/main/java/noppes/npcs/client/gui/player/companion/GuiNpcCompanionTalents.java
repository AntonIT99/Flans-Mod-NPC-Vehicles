// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.player.companion;

import net.minecraft.client.renderer.RenderHelper;
import org.lwjgl.opengl.GL11;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import noppes.npcs.client.CustomNpcResourceListener;
import net.minecraft.client.gui.Gui;
import org.lwjgl.input.Mouse;
import noppes.npcs.NoppesUtilPlayer;
import noppes.npcs.constants.EnumPlayerPacket;
import noppes.npcs.constants.EnumGuiType;
import noppes.npcs.CustomNpcs;
import net.minecraft.client.gui.GuiButton;
import java.util.Iterator;
import noppes.npcs.constants.EnumCompanionTalent;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.NoppesStringUtils;
import java.util.HashMap;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.client.gui.util.GuiNpcButton;
import java.util.Map;
import noppes.npcs.roles.RoleCompanion;
import noppes.npcs.client.gui.util.GuiNPCInterface;

public class GuiNpcCompanionTalents extends GuiNPCInterface
{
    private RoleCompanion role;
    private Map<Integer, GuiTalent> talents;
    private GuiNpcButton selected;
    private long lastPressedTime;
    private long startPressedTime;
    
    public GuiNpcCompanionTalents(final EntityNPCInterface npc) {
        super(npc);
        this.talents = new HashMap<Integer, GuiTalent>();
        this.lastPressedTime = 0L;
        this.startPressedTime = 0L;
        this.role = (RoleCompanion)npc.roleInterface;
        this.closeOnEsc = true;
        this.setBackground("companion_empty.png");
        this.xSize = 171;
        this.ySize = 166;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.talents.clear();
        final int y = this.guiTop + 12;
        this.addLabel(new GuiNpcLabel(0, NoppesStringUtils.translate("quest.exp", ": "), this.guiLeft + 4, this.guiTop + 10));
        GuiNpcCompanionStats.addTopMenu(this.role, this, 2);
        int i = 0;
        for (final EnumCompanionTalent e : this.role.talents.keySet()) {
            this.addTalent(i++, e);
        }
    }
    
    private void addTalent(final int i, final EnumCompanionTalent talent) {
        int y = this.guiTop + 28 + i / 2 * 26;
        final int x = this.guiLeft + 4 + i % 2 * 84;
        this.talents.put(i, new GuiTalent(this.role, talent, x, y));
        if (this.role.getTalentLevel(talent) < 5) {
            this.addButton(new GuiNpcButton(i + 10, x + 26, y, 14, 14, "+"));
            y += 8;
        }
        this.addLabel(new GuiNpcLabel(i, this.role.talents.get(talent) + "/" + this.role.getNextLevel(talent), x + 26, y + 8));
    }
    
    public void actionPerformed(final GuiButton guibutton) {
        super.actionPerformed(guibutton);
        final int id = guibutton.id;
        if (id == 1) {
            CustomNpcs.proxy.openGui(this.npc, EnumGuiType.Companion);
        }
        if (id == 3) {
            NoppesUtilPlayer.sendData(EnumPlayerPacket.CompanionOpenInv, new Object[0]);
        }
        if (id >= 10) {
            this.selected = (GuiNpcButton)guibutton;
            final long worldTime = this.mc.theWorld.getWorldTime();
            this.startPressedTime = worldTime;
            this.lastPressedTime = worldTime;
            this.addExperience(1);
        }
    }
    
    private void addExperience(int exp) {
        final EnumCompanionTalent talent = this.talents.get(this.selected.id - 10).talent;
        if (!this.role.canAddExp(-exp) && this.role.currentExp <= 0) {
            return;
        }
        if (exp > this.role.currentExp) {
            exp = this.role.currentExp;
        }
        NoppesUtilPlayer.sendData(EnumPlayerPacket.CompanionTalentExp, talent.ordinal(), exp);
        this.role.talents.put(talent, this.role.talents.get(talent) + exp);
        this.role.addExp(-exp);
        this.getLabel(this.selected.id - 10).label = this.role.talents.get(talent) + "/" + this.role.getNextLevel(talent);
    }
    
    @Override
    public void drawScreen(final int i, final int j, final float f) {
        super.drawScreen(i, j, f);
        if (this.selected != null && this.mc.theWorld.getWorldTime() - this.startPressedTime > 4L && this.lastPressedTime < this.mc.theWorld.getWorldTime() && this.mc.theWorld.getWorldTime() % 4L == 0L) {
            if (this.selected.mousePressed(this.mc, i, j) && Mouse.isButtonDown(0)) {
                this.lastPressedTime = this.mc.theWorld.getWorldTime();
                if (this.lastPressedTime - this.startPressedTime < 20L) {
                    this.addExperience(1);
                }
                else if (this.lastPressedTime - this.startPressedTime < 40L) {
                    this.addExperience(2);
                }
                else if (this.lastPressedTime - this.startPressedTime < 60L) {
                    this.addExperience(4);
                }
                else if (this.lastPressedTime - this.startPressedTime < 90L) {
                    this.addExperience(8);
                }
                else if (this.lastPressedTime - this.startPressedTime < 140L) {
                    this.addExperience(14);
                }
                else {
                    this.addExperience(28);
                }
            }
            else {
                this.lastPressedTime = 0L;
                this.selected = null;
            }
        }
        this.mc.getTextureManager().bindTexture(Gui.icons);
        this.drawTexturedModalRect(this.guiLeft + 4, this.guiTop + 20, 10, 64, 162, 5);
        if (this.role.currentExp > 0) {
            float v = 1.0f * this.role.currentExp / this.role.getMaxExp();
            if (v > 1.0f) {
                v = 1.0f;
            }
            this.drawTexturedModalRect(this.guiLeft + 4, this.guiTop + 20, 10, 69, (int)(v * 162.0f), 5);
        }
        final String s = this.role.currentExp + "\\" + this.role.getMaxExp();
        this.mc.fontRenderer.drawString(s, this.guiLeft + this.xSize / 2 - this.mc.fontRenderer.getStringWidth(s) / 2, this.guiTop + 10, CustomNpcResourceListener.DefaultTextColor);
        for (final GuiTalent talent : this.talents.values()) {
            talent.drawScreen(i, j, f);
        }
    }
    
    @Override
    public void save() {
    }
    
    public static class GuiTalent extends GuiScreen
    {
        private EnumCompanionTalent talent;
        private int x;
        private int y;
        private RoleCompanion role;
        private static final ResourceLocation resource;
        
        public GuiTalent(final RoleCompanion role, final EnumCompanionTalent talent, final int x, final int y) {
            this.talent = talent;
            this.x = x;
            this.y = y;
            this.role = role;
        }
        
        public void drawScreen(final int i, final int j, final float f) {
            final Minecraft mc = Minecraft.getMinecraft();
            mc.getTextureManager().bindTexture(GuiTalent.resource);
            ItemStack item = this.talent.item;
            if (item.getItem() == null) {
                item = new ItemStack(Blocks.dirt);
            }
            GL11.glPushMatrix();
            GL11.glColor3f(1.0f, 1.0f, 1.0f);
            GL11.glEnable(3042);
            final boolean hover = this.x < i && this.x + 24 > i && this.y < j && this.y + 24 > j;
            this.drawTexturedModalRect(this.x, this.y, 0, hover ? 24 : 0, 24, 24);
            this.zLevel = 100.0f;
            GuiTalent.itemRender.zLevel = 100.0f;
            GL11.glEnable(2896);
            GL11.glEnable(32826);
            RenderHelper.enableGUIStandardItemLighting();
            GuiTalent.itemRender.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.getTextureManager(), item, this.x + 4, this.y + 4);
            GuiTalent.itemRender.renderItemOverlayIntoGUI(mc.fontRenderer, mc.getTextureManager(), item, this.x + 4, this.y + 4);
            RenderHelper.disableStandardItemLighting();
            GL11.glDisable(2896);
            GL11.glTranslatef(0.0f, 0.0f, 200.0f);
            this.drawCenteredString(mc.fontRenderer, this.role.getTalentLevel(this.talent) + "", this.x + 20, this.y + 16, 16777215);
            GuiTalent.itemRender.zLevel = 0.0f;
            this.zLevel = 0.0f;
            GL11.glPopMatrix();
        }
        
        static {
            resource = new ResourceLocation("customnpcs:textures/gui/talent.png");
        }
    }
}
