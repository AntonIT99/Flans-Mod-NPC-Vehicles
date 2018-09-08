// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.blocks.tiles;

import net.minecraft.nbt.NBTTagCompound;

public class TileCouchWood extends TileColorable
{
    public boolean hasLeft;
    public boolean hasRight;
    
    public TileCouchWood() {
        this.hasLeft = false;
        this.hasRight = false;
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound compound) {
        super.readFromNBT(compound);
        this.hasLeft = compound.getBoolean("CouchLeft");
        this.hasRight = compound.getBoolean("CouchRight");
    }
    
    @Override
    public void writeToNBT(final NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setBoolean("CouchLeft", this.hasLeft);
        compound.setBoolean("CouchRight", this.hasRight);
    }
}
