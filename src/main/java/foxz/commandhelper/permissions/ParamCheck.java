// 
// Decompiled by Procyon v0.5.30
// 

package foxz.commandhelper.permissions;

import foxz.commandhelper.AbstractCommandHelper;

public class ParamCheck extends AbstractPermission
{
    String err;
    
    @Override
    public String errorMsg() {
        return this.err;
    }
    
    @Override
    public boolean delegate(final AbstractCommandHelper parent, final String[] args) {
        final String[] np = parent.currentHelper.usage.split(" ");
        int countRequired = 0;
        for (final String command : np) {
            if (command.startsWith("<")) {
                ++countRequired;
            }
        }
        if (args.length < countRequired) {
            this.err = np[args.length] + " missing";
            return false;
        }
        return true;
    }
}
