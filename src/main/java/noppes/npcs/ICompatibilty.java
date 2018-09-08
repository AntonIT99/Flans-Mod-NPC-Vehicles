// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs;

import net.minecraft.nbt.NBTTagCompound;

public interface ICompatibilty
{
    int getVersion();
    
    void setVersion(final int p0);
    
    NBTTagCompound writeToNBT(final NBTTagCompound p0);
}
