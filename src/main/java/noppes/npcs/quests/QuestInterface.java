// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.quests;

import java.util.Vector;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;

public abstract class QuestInterface
{
    public int questId;
    
    public abstract void writeEntityToNBT(final NBTTagCompound p0);
    
    public abstract void readEntityFromNBT(final NBTTagCompound p0);
    
    public abstract boolean isCompleted(final EntityPlayer p0);
    
    public abstract void handleComplete(final EntityPlayer p0);
    
    public abstract Vector<String> getQuestLogStatus(final EntityPlayer p0);
}
