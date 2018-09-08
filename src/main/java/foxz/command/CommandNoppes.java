// 
// Decompiled by Procyon v0.5.30
// 

package foxz.command;

import java.util.List;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.CommandBase;

public class CommandNoppes extends CommandBase
{
    public CmdNoppes noppes;
    
    public CommandNoppes() {
        this.noppes = new CmdNoppes(this);
    }
    
    public String getCommandName() {
        return this.noppes.commandHelper.name;
    }
    
    public String getCommandUsage(final ICommandSender var1) {
        return this.noppes.commandHelper.usage;
    }
    
    public void processCommand(final ICommandSender var1, final String[] var2) {
        this.noppes.processCommand(var1, var2);
    }
    
    public List addTabCompletionOptions(final ICommandSender par1, final String[] par2) {
        return this.noppes.addTabCompletion(par1, par2);
    }
    
    public int getRequiredPermissionLevel() {
        return 2;
    }
}
