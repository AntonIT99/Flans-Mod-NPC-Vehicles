// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.blocks.tiles;

import net.minecraft.nbt.NBTTagCompound;

public class TileCouchWool extends TileColorable
{
    public boolean hasLeft;
    public boolean hasRight;
    public boolean hasCornerLeft;
    public boolean hasCornerRight;
    
    public TileCouchWool() {
        this.hasLeft = false;
        this.hasRight = false;
        this.hasCornerLeft = false;
        this.hasCornerRight = false;
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound compound) {
        super.readFromNBT(compound);
        this.hasLeft = compound.getBoolean("CouchLeft");
        this.hasRight = compound.getBoolean("CouchRight");
        this.hasCornerLeft = compound.getBoolean("CouchCornerLeft");
        this.hasCornerRight = compound.getBoolean("CouchCornerRight");
    }
    
    @Override
    public void writeToNBT(final NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setBoolean("CouchLeft", this.hasLeft);
        compound.setBoolean("CouchRight", this.hasRight);
        compound.setBoolean("CouchCornerLeft", this.hasCornerLeft);
        compound.setBoolean("CouchCornerRight", this.hasCornerRight);
    }
}
