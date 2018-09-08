// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.mainmenu;

import noppes.npcs.client.gui.roles.GuiNpcPuppet;
import net.minecraft.client.entity.EntityPlayerSP;
import noppes.npcs.entity.EntityCustomNpc;
import noppes.npcs.client.gui.roles.GuiNpcConversation;
import noppes.npcs.client.gui.roles.GuiNpcSpawner;
import noppes.npcs.client.gui.roles.GuiNpcFollowerJob;
import noppes.npcs.client.gui.roles.GuiNpcGuard;
import noppes.npcs.client.gui.roles.GuiNpcHealer;
import noppes.npcs.client.gui.roles.GuiNpcBard;
import noppes.npcs.client.gui.roles.GuiNpcCompanion;
import noppes.npcs.client.gui.roles.GuiNpcTransporter;
import noppes.npcs.constants.EnumGuiType;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.client.gui.advanced.GuiNPCAdvancedLinkedNpc;
import noppes.npcs.client.gui.advanced.GuiNPCNightSetup;
import noppes.npcs.client.gui.advanced.GuiNPCLinesMenu;
import noppes.npcs.client.gui.advanced.GuiNPCSoundsMenu;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.advanced.GuiNPCDialogNpcOptions;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.client.NoppesUtil;
import noppes.npcs.client.gui.advanced.GuiNPCFactionSetup;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.constants.EnumJobType;
import noppes.npcs.constants.EnumRoleType;
import noppes.npcs.NoppesStringUtils;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.GuiNPCInterface2;

public class GuiNpcAdvanced extends GuiNPCInterface2 implements IGuiData
{
    private boolean hasChanges;
    
    public GuiNpcAdvanced(final EntityNPCInterface npc) {
        super(npc, 4);
        this.hasChanges = false;
        Client.sendData(EnumPacketServer.MainmenuAdvancedGet, new Object[0]);
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.addButton(new GuiNpcButton(3, this.guiLeft + 85 + 160, this.guiTop + 20, 52, 20, "selectServer.edit"));
        this.addButton(new GuiNpcButton(8, this.guiLeft + 85, this.guiTop + 20, 155, 20, new String[] { "role.none", "role.trader", "role.follower", "role.bank", "role.transporter", "role.mailman", NoppesStringUtils.translate("role.companion", "(WIP)") }, this.npc.advanced.role.ordinal()));
        this.getButton(3).setEnabled(this.npc.advanced.role != EnumRoleType.None && this.npc.advanced.role != EnumRoleType.Postman);
        this.addButton(new GuiNpcButton(4, this.guiLeft + 85 + 160, this.guiTop + 43, 52, 20, "selectServer.edit"));
        this.addButton(new GuiNpcButton(5, this.guiLeft + 85, this.guiTop + 43, 155, 20, new String[] { "job.none", "job.bard", "job.healer", "job.guard", "job.itemgiver", "role.follower", "job.spawner", "job.conversation", "job.chunkloader", "job.puppet" }, this.npc.advanced.job.ordinal()));
        this.getButton(4).setEnabled(this.npc.advanced.job != EnumJobType.None && this.npc.advanced.job != EnumJobType.ChunkLoader);
        this.addButton(new GuiNpcButton(7, this.guiLeft + 85, this.guiTop + 66, 214, 20, "advanced.lines"));
        this.addButton(new GuiNpcButton(9, this.guiLeft + 85, this.guiTop + 89, 214, 20, "menu.factions"));
        this.addButton(new GuiNpcButton(10, this.guiLeft + 85, this.guiTop + 112, 214, 20, "dialog.dialogs"));
        this.addButton(new GuiNpcButton(11, this.guiLeft + 85, this.guiTop + 135, 214, 20, "advanced.sounds"));
        this.addButton(new GuiNpcButton(12, this.guiLeft + 85, this.guiTop + 158, 214, 20, "advanced.night"));
        this.addButton(new GuiNpcButton(13, this.guiLeft + 85, this.guiTop + 181, 214, 20, "global.linked"));
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final GuiNpcButton button = (GuiNpcButton)guibutton;
        if (button.id == 3) {
            this.save();
            Client.sendData(EnumPacketServer.RoleGet, new Object[0]);
        }
        if (button.id == 8) {
            this.hasChanges = true;
            this.npc.advanced.setRole(button.getValue());
            this.getButton(3).setEnabled(this.npc.advanced.role != EnumRoleType.None && this.npc.advanced.role != EnumRoleType.Postman);
        }
        if (button.id == 4) {
            this.save();
            Client.sendData(EnumPacketServer.JobGet, new Object[0]);
        }
        if (button.id == 5) {
            this.hasChanges = true;
            this.npc.advanced.setJob(button.getValue());
            this.getButton(4).setEnabled(this.npc.advanced.job != EnumJobType.None && this.npc.advanced.job != EnumJobType.ChunkLoader);
        }
        if (button.id == 9) {
            this.save();
            NoppesUtil.openGUI((EntityPlayer)this.player, new GuiNPCFactionSetup(this.npc));
        }
        if (button.id == 10) {
            this.save();
            NoppesUtil.openGUI((EntityPlayer)this.player, new GuiNPCDialogNpcOptions(this.npc, this));
        }
        if (button.id == 11) {
            this.save();
            NoppesUtil.openGUI((EntityPlayer)this.player, new GuiNPCSoundsMenu(this.npc));
        }
        if (button.id == 7) {
            this.save();
            NoppesUtil.openGUI((EntityPlayer)this.player, new GuiNPCLinesMenu(this.npc));
        }
        if (button.id == 12) {
            this.save();
            NoppesUtil.openGUI((EntityPlayer)this.player, new GuiNPCNightSetup(this.npc));
        }
        if (button.id == 13) {
            this.save();
            NoppesUtil.openGUI((EntityPlayer)this.player, new GuiNPCAdvancedLinkedNpc(this.npc));
        }
    }
    
    @Override
    public void setGuiData(final NBTTagCompound compound) {
        if (compound.hasKey("RoleData")) {
            if (this.npc.roleInterface != null) {
                this.npc.roleInterface.readFromNBT(compound);
            }
            if (this.npc.advanced.role == EnumRoleType.Trader) {
                NoppesUtil.requestOpenGUI(EnumGuiType.SetupTrader);
            }
            else if (this.npc.advanced.role == EnumRoleType.Follower) {
                NoppesUtil.requestOpenGUI(EnumGuiType.SetupFollower);
            }
            else if (this.npc.advanced.role == EnumRoleType.Bank) {
                NoppesUtil.requestOpenGUI(EnumGuiType.SetupBank);
            }
            else if (this.npc.advanced.role == EnumRoleType.Transporter) {
                this.displayGuiScreen(new GuiNpcTransporter(this.npc));
            }
            else if (this.npc.advanced.role == EnumRoleType.Companion) {
                this.displayGuiScreen(new GuiNpcCompanion(this.npc));
            }
        }
        else if (compound.hasKey("JobData")) {
            if (this.npc.jobInterface != null) {
                this.npc.jobInterface.readFromNBT(compound);
            }
            if (this.npc.advanced.job == EnumJobType.Bard) {
                NoppesUtil.openGUI((EntityPlayer)this.player, new GuiNpcBard(this.npc));
            }
            else if (this.npc.advanced.job == EnumJobType.Healer) {
                NoppesUtil.openGUI((EntityPlayer)this.player, new GuiNpcHealer(this.npc));
            }
            else if (this.npc.advanced.job == EnumJobType.Guard) {
                NoppesUtil.openGUI((EntityPlayer)this.player, new GuiNpcGuard(this.npc));
            }
            else if (this.npc.advanced.job == EnumJobType.ItemGiver) {
                NoppesUtil.requestOpenGUI(EnumGuiType.SetupItemGiver);
            }
            else if (this.npc.advanced.job == EnumJobType.Follower) {
                NoppesUtil.openGUI((EntityPlayer)this.player, new GuiNpcFollowerJob(this.npc));
            }
            else if (this.npc.advanced.job == EnumJobType.Spawner) {
                NoppesUtil.openGUI((EntityPlayer)this.player, new GuiNpcSpawner(this.npc));
            }
            else if (this.npc.advanced.job == EnumJobType.Conversation) {
                NoppesUtil.openGUI((EntityPlayer)this.player, new GuiNpcConversation(this.npc));
            }
            else if (this.npc.advanced.job == EnumJobType.Puppet) {
                NoppesUtil.openGUI((EntityPlayer)this.player, new GuiNpcPuppet(this, (EntityCustomNpc)this.npc));
            }
        }
        else {
            this.npc.advanced.readToNBT(compound);
            this.initGui();
        }
    }
    
    @Override
    public void save() {
        if (this.hasChanges) {
            Client.sendData(EnumPacketServer.MainmenuAdvancedSave, this.npc.advanced.writeToNBT(new NBTTagCompound()));
            this.hasChanges = false;
        }
    }
}
