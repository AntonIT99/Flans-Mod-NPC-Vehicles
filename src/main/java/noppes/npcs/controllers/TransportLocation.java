// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import net.minecraft.nbt.NBTTagCompound;

public class TransportLocation
{
    public int id;
    public String name;
    public double posX;
    public double posY;
    public double posZ;
    public int type;
    public int dimension;
    public TransportCategory category;
    
    public TransportLocation() {
        this.id = -1;
        this.name = "default name";
        this.type = 0;
        this.dimension = 0;
    }
    
    public void readNBT(final NBTTagCompound compound) {
        if (compound == null) {
            return;
        }
        this.id = compound.getInteger("Id");
        this.posX = compound.getDouble("PosX");
        this.posY = compound.getDouble("PosY");
        this.posZ = compound.getDouble("PosZ");
        this.type = compound.getInteger("Type");
        this.dimension = compound.getInteger("Dimension");
        this.name = compound.getString("Name");
    }
    
    public NBTTagCompound writeNBT() {
        final NBTTagCompound compound = new NBTTagCompound();
        compound.setInteger("Id", this.id);
        compound.setDouble("PosX", this.posX);
        compound.setDouble("PosY", this.posY);
        compound.setDouble("PosZ", this.posZ);
        compound.setInteger("Type", this.type);
        compound.setInteger("Dimension", this.dimension);
        compound.setString("Name", this.name);
        return compound;
    }
    
    public boolean isDefault() {
        return this.type == 1;
    }
}
