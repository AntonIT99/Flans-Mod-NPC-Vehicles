// 
// Decompiled by Procyon v0.5.30
// 

package foxz.commandhelper;

import java.util.List;
import net.minecraft.command.ICommandSender;

public abstract class CommandHelper
{
    public Helper commandHelper;
    
    public CommandHelper() {
        this.commandHelper = new Helper();
    }
    
    public List addTabCompletion(final ICommandSender par1, final String[] args) {
        return null;
    }
    
    public class Helper
    {
        public String name;
        public String usage;
        public String desc;
        public boolean hasEmptyCall;
    }
}
