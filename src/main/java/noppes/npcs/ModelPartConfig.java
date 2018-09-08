// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs;

import noppes.npcs.util.ValueUtil;
import net.minecraft.nbt.NBTTagCompound;

public class ModelPartConfig
{
    public float scaleX;
    public float scaleY;
    public float scaleZ;
    public float transX;
    public float transY;
    public float transZ;
    
    public ModelPartConfig() {
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.scaleZ = 1.0f;
        this.transX = 0.0f;
        this.transY = 0.0f;
        this.transZ = 0.0f;
    }
    
    public NBTTagCompound writeToNBT() {
        final NBTTagCompound compound = new NBTTagCompound();
        compound.setFloat("ScaleX", this.scaleX);
        compound.setFloat("ScaleY", this.scaleY);
        compound.setFloat("ScaleZ", this.scaleZ);
        compound.setFloat("TransX", this.transX);
        compound.setFloat("TransY", this.transY);
        compound.setFloat("TransZ", this.transZ);
        return compound;
    }
    
    public void readFromNBT(final NBTTagCompound compound) {
        this.scaleX = ValueUtil.correctFloat(compound.getFloat("ScaleX"), 0.5f, 1.5f);
        this.scaleY = ValueUtil.correctFloat(compound.getFloat("ScaleY"), 0.5f, 1.5f);
        this.scaleZ = ValueUtil.correctFloat(compound.getFloat("ScaleZ"), 0.5f, 1.5f);
        this.transX = compound.getFloat("TransX");
        this.transY = compound.getFloat("TransY");
        this.transZ = compound.getFloat("TransZ");
    }
    
    @Override
    public String toString() {
        return "ScaleX: " + this.scaleX + " - ScaleY: " + this.scaleY + " - ScaleZ: " + this.scaleZ;
    }
    
    public void setScale(final float x, final float y, final float z) {
        this.scaleX = x;
        this.scaleY = y;
        this.scaleZ = z;
    }
    
    public void setScale(final float x, final float y) {
        this.scaleX = x;
        this.scaleZ = x;
        this.scaleY = y;
    }
}
