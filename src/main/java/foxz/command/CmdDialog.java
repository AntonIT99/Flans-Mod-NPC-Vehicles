// 
// Decompiled by Procyon v0.5.30
// 

package foxz.command;

import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.NoppesUtilServer;
import noppes.npcs.controllers.DialogOption;
import net.minecraft.entity.EntityLivingBase;
import noppes.npcs.client.EntityUtil;
import noppes.npcs.entity.EntityDialogNpc;
import noppes.npcs.controllers.Dialog;
import net.minecraft.command.CommandBase;
import noppes.npcs.controllers.DialogController;
import foxz.commandhelper.permissions.ParamCheck;
import foxz.commandhelper.permissions.OpOnly;
import foxz.commandhelper.annotations.SubCommand;
import java.util.Iterator;
import java.util.List;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.controllers.PlayerData;
import foxz.commandhelper.annotations.Command;
import foxz.commandhelper.ChMcLogger;

@Command(name = "dialog", desc = "dialog operations", usage = "help")
public class CmdDialog extends ChMcLogger
{
    public CmdDialog(final Object sender) {
        super(sender);
    }
    
    @SubCommand(desc = "force read", usage = "<player> <dialog>", permissions = { OpOnly.class, ParamCheck.class })
    public boolean read(final String[] args) {
        final String playername = args[0];
        int diagid;
        try {
            diagid = Integer.parseInt(args[1]);
        }
        catch (NumberFormatException ex) {
            this.sendmessage("DialogID must be an integer");
            return false;
        }
        final List<PlayerData> data = this.getPlayersData(playername);
        if (data.isEmpty()) {
            this.sendmessage(String.format("Unknow player '%s'", playername));
            return false;
        }
        for (final PlayerData playerdata : data) {
            playerdata.dialogData.dialogsRead.add(diagid);
            playerdata.saveNBTData(null);
        }
        return true;
    }
    
    @SubCommand(desc = "force unread dialog", usage = "<player> <dialog>", permissions = { OpOnly.class, ParamCheck.class })
    public boolean unread(final String[] args) {
        final String playername = args[0];
        int diagid;
        try {
            diagid = Integer.parseInt(args[1]);
        }
        catch (NumberFormatException ex) {
            this.sendmessage("DialogID must be an integer");
            return false;
        }
        final List<PlayerData> data = this.getPlayersData(playername);
        if (data.isEmpty()) {
            this.sendmessage(String.format("Unknow player '%s'", playername));
            return false;
        }
        for (final PlayerData playerdata : data) {
            playerdata.dialogData.dialogsRead.remove(diagid);
            playerdata.saveNBTData(null);
        }
        return true;
    }
    
    @SubCommand(desc = "reload dialogs from disk", permissions = { OpOnly.class })
    public boolean reload(final String[] args) {
        new DialogController();
        return true;
    }
    
    @SubCommand(desc = "show dialog", usage = "<player> <dialog> <name>", permissions = { OpOnly.class })
    public void show(final String[] args) {
        final EntityPlayer player = (EntityPlayer)CommandBase.getPlayer(this.pcParam, args[0]);
        if (player == null) {
            this.sendmessage(String.format("Unknow player '%s'", args[0]));
            return;
        }
        int diagid;
        try {
            diagid = Integer.parseInt(args[1]);
        }
        catch (NumberFormatException ex) {
            this.sendmessage("DialogID must be an integer: " + args[1]);
            return;
        }
        final Dialog dialog = DialogController.instance.dialogs.get(diagid);
        if (dialog == null) {
            this.sendmessage("Unknown dialog id: " + args[1]);
            return;
        }
        final EntityDialogNpc npc = new EntityDialogNpc(this.pcParam.getEntityWorld());
        npc.display.name = args[2];
        EntityUtil.Copy((EntityLivingBase)player, (EntityLivingBase)npc);
        final DialogOption option = new DialogOption();
        option.dialogId = diagid;
        option.title = dialog.title;
        npc.dialogs.put(0, option);
        NoppesUtilServer.openDialog(player, npc, dialog);
    }
}
