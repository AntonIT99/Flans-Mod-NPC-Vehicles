// 
// Decompiled by Procyon v0.5.30
// 

package foxz.commandhelper.permissions;

import foxz.commandhelper.AbstractCommandHelper;

public abstract class AbstractPermission
{
    public abstract String errorMsg();
    
    public abstract boolean delegate(final AbstractCommandHelper p0, final String[] p1);
}
