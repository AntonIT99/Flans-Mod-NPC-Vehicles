// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.mainmenu;

import noppes.npcs.client.gui.global.GuiNpcNaturalSpawns;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.client.gui.global.GuiNpcManagePlayerData;
import noppes.npcs.client.NoppesUtil;
import noppes.npcs.constants.EnumGuiType;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.NoppesStringUtils;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.client.gui.util.GuiNPCInterface2;

public class GuiNPCGlobalMainMenu extends GuiNPCInterface2
{
    public GuiNPCGlobalMainMenu(final EntityNPCInterface npc) {
        super(npc, 5);
    }
    
    @Override
    public void initGui() {
        super.initGui();
        int y = this.guiTop + 10;
        this.addButton(new GuiNpcButton(2, this.guiLeft + 85, y, "global.banks"));
        final int i = 3;
        final int j = this.guiLeft + 85;
        y += 22;
        this.addButton(new GuiNpcButton(i, j, y, "menu.factions"));
        final int k = 4;
        final int l = this.guiLeft + 85;
        y += 22;
        this.addButton(new GuiNpcButton(k, l, y, "dialog.dialogs"));
        final int m = 11;
        final int j2 = this.guiLeft + 85;
        y += 22;
        this.addButton(new GuiNpcButton(m, j2, y, "quest.quests"));
        final int i2 = 12;
        final int j3 = this.guiLeft + 85;
        y += 22;
        this.addButton(new GuiNpcButton(i2, j3, y, "global.transport"));
        final int i3 = 13;
        final int j4 = this.guiLeft + 85;
        y += 22;
        this.addButton(new GuiNpcButton(i3, j4, y, "global.playerdata"));
        final int i4 = 14;
        final int j5 = this.guiLeft + 85;
        y += 22;
        this.addButton(new GuiNpcButton(i4, j5, y, "global.recipes"));
        final int i5 = 15;
        final int j6 = this.guiLeft + 85;
        y += 22;
        this.addButton(new GuiNpcButton(i5, j6, y, NoppesStringUtils.translate("global.naturalspawn", "(WIP)")));
        final int i6 = 16;
        final int j7 = this.guiLeft + 85;
        y += 22;
        this.addButton(new GuiNpcButton(i6, j7, y, "global.linked"));
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final int id = guibutton.id;
        if (id == 11) {
            NoppesUtil.requestOpenGUI(EnumGuiType.ManageQuests);
        }
        if (id == 2) {
            NoppesUtil.requestOpenGUI(EnumGuiType.ManageBanks);
        }
        if (id == 3) {
            NoppesUtil.requestOpenGUI(EnumGuiType.ManageFactions);
        }
        if (id == 4) {
            NoppesUtil.requestOpenGUI(EnumGuiType.ManageDialogs);
        }
        if (id == 12) {
            NoppesUtil.requestOpenGUI(EnumGuiType.ManageTransport);
        }
        if (id == 13) {
            NoppesUtil.openGUI((EntityPlayer)this.player, new GuiNpcManagePlayerData(this.npc, this));
        }
        if (id == 14) {
            NoppesUtil.requestOpenGUI(EnumGuiType.ManageRecipes, 4, 0, 0);
        }
        if (id == 15) {
            NoppesUtil.openGUI((EntityPlayer)this.player, new GuiNpcNaturalSpawns(this.npc));
        }
        if (id == 16) {
            NoppesUtil.requestOpenGUI(EnumGuiType.ManageLinked);
        }
    }
    
    @Override
    public void save() {
    }
}
