// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs;

import net.minecraft.entity.passive.EntityHorse;
import java.util.Iterator;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTBase;
import java.util.HashMap;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.EntityLivingBase;

public class ModelDataShared
{
    public ModelPartConfig arms;
    public ModelPartConfig body;
    public ModelPartConfig legs;
    public ModelPartConfig head;
    public ModelPartData legParts;
    public Class<? extends EntityLivingBase> entityClass;
    public EntityLivingBase entity;
    public NBTTagCompound extra;
    private HashMap<String, ModelPartData> parts;
    public byte breasts;
    public byte headwear;
    
    public ModelDataShared() {
        this.arms = new ModelPartConfig();
        this.body = new ModelPartConfig();
        this.legs = new ModelPartConfig();
        this.head = new ModelPartConfig();
        this.legParts = new ModelPartData();
        this.extra = new NBTTagCompound();
        this.parts = new HashMap<String, ModelPartData>();
        this.breasts = 0;
        this.headwear = 2;
    }
    
    public NBTTagCompound writeToNBT() {
        final NBTTagCompound compound = new NBTTagCompound();
        if (this.entityClass != null) {
            compound.setString("EntityClass", this.entityClass.getCanonicalName());
        }
        compound.setTag("ArmsConfig", (NBTBase)this.arms.writeToNBT());
        compound.setTag("BodyConfig", (NBTBase)this.body.writeToNBT());
        compound.setTag("LegsConfig", (NBTBase)this.legs.writeToNBT());
        compound.setTag("HeadConfig", (NBTBase)this.head.writeToNBT());
        compound.setTag("LegParts", (NBTBase)this.legParts.writeToNBT());
        compound.setByte("Headwear", this.headwear);
        compound.setByte("Breasts", this.breasts);
        compound.setTag("ExtraData", (NBTBase)this.extra);
        final NBTTagList list = new NBTTagList();
        for (final String name : this.parts.keySet()) {
            final NBTTagCompound item = this.parts.get(name).writeToNBT();
            item.setString("PartName", name);
            list.appendTag((NBTBase)item);
        }
        compound.setTag("Parts", (NBTBase)list);
        return compound;
    }
    
    public void readFromNBT(final NBTTagCompound compound) {
        this.setEntityClass(compound.getString("EntityClass"));
        this.arms.readFromNBT(compound.getCompoundTag("ArmsConfig"));
        this.body.readFromNBT(compound.getCompoundTag("BodyConfig"));
        this.legs.readFromNBT(compound.getCompoundTag("LegsConfig"));
        this.head.readFromNBT(compound.getCompoundTag("HeadConfig"));
        this.legParts.readFromNBT(compound.getCompoundTag("LegParts"));
        this.headwear = compound.getByte("Headwear");
        this.breasts = compound.getByte("Breasts");
        this.extra = compound.getCompoundTag("ExtraData");
        final HashMap<String, ModelPartData> parts = new HashMap<String, ModelPartData>();
        final NBTTagList list = compound.getTagList("Parts", 10);
        for (int i = 0; i < list.tagCount(); ++i) {
            final NBTTagCompound item = list.getCompoundTagAt(i);
            final ModelPartData part = new ModelPartData();
            part.readFromNBT(item);
            parts.put(item.getString("PartName"), part);
        }
        this.parts = parts;
    }
    
    private void setEntityClass(final String string) {
        this.entityClass = null;
        this.entity = null;
        try {
            final Class<?> cls = Class.forName(string);
            if (EntityLivingBase.class.isAssignableFrom(cls)) {
                this.entityClass = cls.asSubclass(EntityLivingBase.class);
            }
        }
        catch (ClassNotFoundException ex) {}
    }
    
    public void setEntityClass(final Class<? extends EntityLivingBase> entityClass) {
        this.entityClass = entityClass;
        this.entity = null;
        this.extra = new NBTTagCompound();
        if (entityClass == EntityHorse.class) {
            this.extra.setInteger("Type", -1);
        }
    }
    
    public Class<? extends EntityLivingBase> getEntityClass() {
        return this.entityClass;
    }
    
    public float offsetY() {
        if (this.entity == null) {
            return -this.getBodyY();
        }
        return this.entity.height - 1.8f;
    }
    
    public void clearEntity() {
        this.entity = null;
    }
    
    public ModelPartData getPartData(final String type) {
        return this.parts.get(type);
    }
    
    public void removePart(final String type) {
        this.parts.remove(type);
    }
    
    public ModelPartData getOrCreatePart(final String type) {
        ModelPartData part = this.parts.get(type);
        if (part == null) {
            this.parts.put(type, part = new ModelPartData());
        }
        return part;
    }
    
    public float getBodyY() {
        if (this.legParts.type == 3) {
            return (0.9f - this.body.scaleY) * 0.75f + this.getLegsY();
        }
        if (this.legParts.type == 3) {
            return (0.5f - this.body.scaleY) * 0.75f + this.getLegsY();
        }
        return (1.0f - this.body.scaleY) * 0.75f + this.getLegsY();
    }
    
    public float getLegsY() {
        if (this.legParts.type == 3) {
            return (0.87f - this.legs.scaleY) * 1.0f;
        }
        return (1.0f - this.legs.scaleY) * 0.75f;
    }
}
