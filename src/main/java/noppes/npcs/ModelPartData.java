// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;

public class ModelPartData
{
    public int color;
    public String texture;
    public byte type;
    public boolean playerTexture;
    private ResourceLocation location;
    
    public ModelPartData() {
        this.color = 16777215;
        this.type = 0;
        this.playerTexture = true;
    }
    
    public ModelPartData(final String texture) {
        this.color = 16777215;
        this.type = 0;
        this.texture = texture;
        this.playerTexture = false;
    }
    
    public NBTTagCompound writeToNBT() {
        final NBTTagCompound compound = new NBTTagCompound();
        compound.setByte("Type", this.type);
        compound.setInteger("Color", this.color);
        if (this.texture != null && !this.texture.isEmpty()) {
            compound.setString("Texture", this.texture);
        }
        compound.setBoolean("PlayerTexture", this.playerTexture);
        return compound;
    }
    
    public void readFromNBT(final NBTTagCompound compound) {
        this.type = compound.getByte("Type");
        this.color = compound.getInteger("Color");
        this.texture = compound.getString("Texture");
        this.playerTexture = compound.getBoolean("PlayerTexture");
        this.location = null;
    }
    
    public ResourceLocation getResource() {
        if (this.texture.isEmpty()) {
            return null;
        }
        if (this.location != null) {
            return this.location;
        }
        return this.location = new ResourceLocation(this.texture);
    }
    
    public void setTexture(final String texture, final int type) {
        this.type = (byte)type;
        this.location = null;
        if (texture.isEmpty()) {
            this.playerTexture = true;
            this.texture = texture;
        }
        else {
            this.texture = "moreplayermodels:textures/" + texture + ".png";
            this.playerTexture = false;
        }
    }
    
    @Override
    public String toString() {
        return "Color: " + this.color + " Type: " + this.type;
    }
    
    public String getColor() {
        String str;
        for (str = Integer.toHexString(this.color); str.length() < 6; str = "0" + str) {}
        return str;
    }
}
