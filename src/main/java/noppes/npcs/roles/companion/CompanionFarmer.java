// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.roles.companion;

import net.minecraft.nbt.NBTTagCompound;

public class CompanionFarmer extends CompanionJobInterface
{
    public boolean isStanding;
    
    public CompanionFarmer() {
        this.isStanding = false;
    }
    
    @Override
    public NBTTagCompound getNBT() {
        final NBTTagCompound compound = new NBTTagCompound();
        compound.setBoolean("CompanionFarmerStanding", this.isStanding);
        return compound;
    }
    
    @Override
    public void setNBT(final NBTTagCompound compound) {
        this.isStanding = compound.getBoolean("CompanionFarmerStanding");
    }
    
    @Override
    public boolean isSelfSufficient() {
        return this.isStanding;
    }
    
    @Override
    public void onUpdate() {
    }
}
