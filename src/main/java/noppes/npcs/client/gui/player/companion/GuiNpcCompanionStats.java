// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.player.companion;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import noppes.npcs.constants.EnumCompanionTalent;
import noppes.npcs.constants.EnumGuiType;
import noppes.npcs.CustomNpcs;
import noppes.npcs.client.gui.util.GuiContainerNPCInterface;
import noppes.npcs.constants.EnumCompanionJobs;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiMenuTopButton;
import noppes.npcs.client.gui.util.GuiMenuTopIconButton;
import net.minecraft.item.ItemStack;
import noppes.npcs.CustomItems;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.NoppesStringUtils;
import noppes.npcs.NoppesUtilPlayer;
import noppes.npcs.constants.EnumPlayerPacket;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.roles.RoleCompanion;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.GuiNPCInterface;

public class GuiNpcCompanionStats extends GuiNPCInterface implements IGuiData
{
    private RoleCompanion role;
    private boolean isEating;
    
    public GuiNpcCompanionStats(final EntityNPCInterface npc) {
        super(npc);
        this.isEating = false;
        this.role = (RoleCompanion)npc.roleInterface;
        this.closeOnEsc = true;
        this.setBackground("companion.png");
        this.xSize = 171;
        this.ySize = 166;
        NoppesUtilPlayer.sendData(EnumPlayerPacket.RoleGet, new Object[0]);
    }
    
    @Override
    public void initGui() {
        super.initGui();
        int y = this.guiTop + 10;
        this.addLabel(new GuiNpcLabel(0, NoppesStringUtils.translate("gui.name", ": ", this.npc.display.name), this.guiLeft + 4, y));
        final boolean id = true;
        final String translate = NoppesStringUtils.translate("companion.owner", ": ", this.role.ownerName);
        final int x = this.guiLeft + 4;
        y += 12;
        this.addLabel(new GuiNpcLabel((int)(id ? 1 : 0), translate, x, y));
        final int id2 = 2;
        final String translate2 = NoppesStringUtils.translate("companion.age", ": ", this.role.ticksActive / 18000L + " (", this.role.stage.name, ")");
        final int x2 = this.guiLeft + 4;
        y += 12;
        this.addLabel(new GuiNpcLabel(id2, translate2, x2, y));
        final int id3 = 3;
        final String translate3 = NoppesStringUtils.translate("companion.strength", ": ", this.npc.stats.getAttackStrength());
        final int x3 = this.guiLeft + 4;
        y += 12;
        this.addLabel(new GuiNpcLabel(id3, translate3, x3, y));
        final int id4 = 4;
        final String translate4 = NoppesStringUtils.translate("companion.level", ": ", this.role.getTotalLevel());
        final int x4 = this.guiLeft + 4;
        y += 12;
        this.addLabel(new GuiNpcLabel(id4, translate4, x4, y));
        final int id5 = 5;
        final String translate5 = NoppesStringUtils.translate("job.name", ": ", "gui.none");
        final int x5 = this.guiLeft + 4;
        y += 12;
        this.addLabel(new GuiNpcLabel(id5, translate5, x5, y));
        addTopMenu(this.role, this, 1);
    }
    
    public static void addTopMenu(final RoleCompanion role, final GuiScreen screen, final int active) {
        if (screen instanceof GuiNPCInterface) {
            final GuiNPCInterface gui = (GuiNPCInterface)screen;
            GuiMenuTopIconButton button;
            gui.addTopButton(button = new GuiMenuTopIconButton(1, gui.guiLeft + 4, gui.guiTop - 27, "menu.stats", new ItemStack(CustomItems.letter)));
            gui.addTopButton(button = new GuiMenuTopIconButton(2, button, "companion.talent", new ItemStack(CustomItems.spellHoly)));
            if (role.hasInv()) {
                gui.addTopButton(button = new GuiMenuTopIconButton(3, button, "inv.inventory", new ItemStack(CustomItems.bag)));
            }
            if (role.job != EnumCompanionJobs.NONE) {
                gui.addTopButton(new GuiMenuTopIconButton(4, button, "job.name", new ItemStack(CustomItems.bag)));
            }
            gui.getTopButton(active).active = true;
        }
        if (screen instanceof GuiContainerNPCInterface) {
            final GuiContainerNPCInterface gui2 = (GuiContainerNPCInterface)screen;
            GuiMenuTopIconButton button;
            gui2.addTopButton(button = new GuiMenuTopIconButton(1, gui2.guiLeft + 4, gui2.guiTop - 27, "menu.stats", new ItemStack(CustomItems.letter)));
            gui2.addTopButton(button = new GuiMenuTopIconButton(2, button, "companion.talent", new ItemStack(CustomItems.spellHoly)));
            if (role.hasInv()) {
                gui2.addTopButton(button = new GuiMenuTopIconButton(3, button, "inv.inventory", new ItemStack(CustomItems.bag)));
            }
            if (role.job != EnumCompanionJobs.NONE) {
                gui2.addTopButton(new GuiMenuTopIconButton(4, button, "job.name", new ItemStack(CustomItems.bag)));
            }
            gui2.getTopButton(active).active = true;
        }
    }
    
    public void actionPerformed(final GuiButton guibutton) {
        super.actionPerformed(guibutton);
        final int id = guibutton.id;
        if (id == 2) {
            CustomNpcs.proxy.openGui(this.npc, EnumGuiType.CompanionTalent);
        }
        if (id == 3) {
            NoppesUtilPlayer.sendData(EnumPlayerPacket.CompanionOpenInv, new Object[0]);
        }
    }
    
    @Override
    public void drawScreen(final int i, final int j, final float f) {
        super.drawScreen(i, j, f);
        if (this.isEating && !this.role.isEating()) {
            NoppesUtilPlayer.sendData(EnumPlayerPacket.RoleGet, new Object[0]);
        }
        this.isEating = this.role.isEating();
        super.drawNpc(34, 150);
        final int y = this.drawHealth(this.guiTop + 88);
    }
    
    private int drawHealth(int y) {
        this.mc.getTextureManager().bindTexture(GuiNpcCompanionStats.icons);
        int max = this.role.getTotalArmorValue();
        if (this.role.talents.containsKey(EnumCompanionTalent.ARMOR) || max > 0) {
            for (int i = 0; i < 10; ++i) {
                final int x = this.guiLeft + 66 + i * 10;
                if (i * 2 + 1 < max) {
                    this.drawTexturedModalRect(x, y, 34, 9, 9, 9);
                }
                if (i * 2 + 1 == max) {
                    this.drawTexturedModalRect(x, y, 25, 9, 9, 9);
                }
                if (i * 2 + 1 > max) {
                    this.drawTexturedModalRect(x, y, 16, 9, 9, 9);
                }
            }
            y += 10;
        }
        max = MathHelper.ceiling_float_int(this.npc.getMaxHealth());
        int k = (int)this.npc.getHealth();
        float scale = 1.0f;
        if (max > 40) {
            scale = max / 40.0f;
            k /= (int)scale;
            max = 40;
        }
        for (int j = 0; j < max; ++j) {
            final int x2 = this.guiLeft + 66 + j % 20 * 5;
            final int offset = j / 20 * 10;
            this.drawTexturedModalRect(x2, y + offset, 52 + j % 2 * 5, 9, (j % 2 == 1) ? 4 : 5, 9);
            if (k > j) {
                this.drawTexturedModalRect(x2, y + offset, 52 + j % 2 * 5, 0, (j % 2 == 1) ? 4 : 5, 9);
            }
        }
        k = this.role.foodstats.getFoodLevel();
        y += 10;
        if (max > 20) {
            y += 10;
        }
        for (int j = 0; j < 20; ++j) {
            final int x2 = this.guiLeft + 66 + j % 20 * 5;
            this.drawTexturedModalRect(x2, y, 16 + j % 2 * 5, 27, (j % 2 == 1) ? 4 : 5, 9);
            if (k > j) {
                this.drawTexturedModalRect(x2, y, 52 + j % 2 * 5, 27, (j % 2 == 1) ? 4 : 5, 9);
            }
        }
        return y;
    }
    
    @Override
    public void save() {
    }
    
    @Override
    public void setGuiData(final NBTTagCompound compound) {
        this.role.readFromNBT(compound);
    }
}
