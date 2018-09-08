// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.scripted;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.EntityList;
import net.minecraft.block.material.Material;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.nbt.NBTBase;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import java.util.Iterator;
import java.util.List;
import noppes.npcs.controllers.ScriptController;
import java.util.ArrayList;
import net.minecraft.util.MathHelper;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.entity.Entity;

public class ScriptEntity
{
    protected Entity entity;
    private Map<String, Object> tempData;
    
    public ScriptEntity(final Entity entity) {
        this.tempData = new HashMap<String, Object>();
        this.entity = entity;
    }
    
    public double getX() {
        return this.entity.posX;
    }
    
    public void setX(final double x) {
        this.entity.posX = x;
    }
    
    public double getY() {
        return this.entity.posY;
    }
    
    public void setY(final double y) {
        this.entity.posY = y;
    }
    
    public double getZ() {
        return this.entity.posZ;
    }
    
    public void setZ(final double z) {
        this.entity.posZ = z;
    }
    
    public int getBlockX() {
        return MathHelper.floor_double(this.entity.posX);
    }
    
    public int getBlockY() {
        return MathHelper.floor_double(this.entity.posY);
    }
    
    public int getBlockZ() {
        return MathHelper.floor_double(this.entity.posZ);
    }
    
    public void setPosition(final double x, final double y, final double z) {
        this.entity.setPosition(x, y, z);
    }
    
    public ScriptEntity[] getSurroundingEntities(final int range) {
        final List<Entity> entities = (List<Entity>)this.entity.worldObj.getEntitiesWithinAABB((Class)Entity.class, this.entity.boundingBox.expand((double)range, (double)range, (double)range));
        final List<ScriptEntity> list = new ArrayList<ScriptEntity>();
        for (final Entity living : entities) {
            if (living != this.entity) {
                list.add(ScriptController.Instance.getScriptForEntity(living));
            }
        }
        return list.toArray(new ScriptEntity[list.size()]);
    }
    
    public ScriptEntity[] getSurroundingEntities(final int range, final int type) {
        Class cls = Entity.class;
        if (type == 5) {
            cls = EntityLivingBase.class;
        }
        else if (type == 1) {
            cls = EntityPlayer.class;
        }
        else if (type == 4) {
            cls = EntityAnimal.class;
        }
        else if (type == 3) {
            cls = EntityMob.class;
        }
        else if (type == 2) {
            cls = EntityNPCInterface.class;
        }
        final List<Entity> entities = (List<Entity>)this.entity.worldObj.getEntitiesWithinAABB(cls, this.entity.boundingBox.expand((double)range, (double)range, (double)range));
        final List<ScriptEntity> list = new ArrayList<ScriptEntity>();
        for (final Entity living : entities) {
            if (living != this.entity) {
                list.add(ScriptController.Instance.getScriptForEntity(living));
            }
        }
        return list.toArray(new ScriptEntity[list.size()]);
    }
    
    public boolean isAlive() {
        return this.entity.isEntityAlive();
    }
    
    public Object getTempData(final String key) {
        return this.tempData.get(key);
    }
    
    public void setTempData(final String key, final Object value) {
        this.tempData.put(key, value);
    }
    
    public boolean hasTempData(final String key) {
        return this.tempData.containsKey(key);
    }
    
    public void removeTempData(final String key) {
        this.tempData.remove(key);
    }
    
    public void clearTempData() {
        this.tempData.clear();
    }
    
    public Object getStoredData(final String key) {
        final NBTTagCompound compound = this.getStoredCompound();
        if (!compound.hasKey(key)) {
            return null;
        }
        final NBTBase base = compound.getTag(key);
        if (base instanceof NBTBase.NBTPrimitive) {
            return ((NBTBase.NBTPrimitive)base).func_150286_g();
        }
        return ((NBTTagString)base).func_150285_a_();
    }
    
    public void setStoredData(final String key, final Object value) {
        final NBTTagCompound compound = this.getStoredCompound();
        if (value instanceof Number) {
            compound.setDouble(key, ((Number)value).doubleValue());
        }
        else if (value instanceof String) {
            compound.setString(key, (String)value);
        }
        this.saveStoredCompound(compound);
    }
    
    public boolean hasStoredData(final String key) {
        return this.getStoredCompound().hasKey(key);
    }
    
    public void removeStoredData(final String key) {
        final NBTTagCompound compound = this.getStoredCompound();
        compound.removeTag(key);
        this.saveStoredCompound(compound);
    }
    
    public void clearStoredData() {
        this.entity.getEntityData().removeTag("CNPCStoredData");
    }
    
    private NBTTagCompound getStoredCompound() {
        NBTTagCompound compound = this.entity.getEntityData().getCompoundTag("CNPCStoredData");
        if (compound == null) {
            this.entity.getEntityData().setTag("CNPCStoredData", (NBTBase)(compound = new NBTTagCompound()));
        }
        return compound;
    }
    
    private void saveStoredCompound(final NBTTagCompound compound) {
        this.entity.getEntityData().setTag("CNPCStoredData", (NBTBase)compound);
    }
    
    public long getAge() {
        return this.entity.ticksExisted;
    }
    
    public void despawn() {
        this.entity.isDead = true;
    }
    
    public boolean inWater() {
        return this.entity.isInsideOfMaterial(Material.water);
    }
    
    public boolean inLava() {
        return this.entity.isInsideOfMaterial(Material.lava);
    }
    
    public boolean inFire() {
        return this.entity.isInsideOfMaterial(Material.fire);
    }
    
    public boolean isBurning() {
        return this.entity.isBurning();
    }
    
    public void setBurning(final int ticks) {
        this.entity.setFire(ticks);
    }
    
    public void extinguish() {
        this.entity.extinguish();
    }
    
    public String getTypeName() {
        return EntityList.getEntityString(this.entity);
    }
    
    public void dropItem(final ScriptItemStack item) {
        this.entity.entityDropItem(item.item, 0.0f);
    }
    
    public ScriptEntity getRider() {
        return ScriptController.Instance.getScriptForEntity(this.entity.riddenByEntity);
    }
    
    public void setRider(final ScriptEntity entity) {
        if (entity != null) {
            entity.entity.mountEntity(this.entity);
        }
        else if (this.entity.riddenByEntity != null) {
            this.entity.riddenByEntity.mountEntity((Entity)null);
        }
    }
    
    public ScriptEntity getMount() {
        return ScriptController.Instance.getScriptForEntity(this.entity.ridingEntity);
    }
    
    public void setMount(final ScriptEntity entity) {
        if (entity == null) {
            this.entity.mountEntity((Entity)null);
        }
        else {
            this.entity.mountEntity(entity.entity);
        }
    }
    
    public int getType() {
        return 0;
    }
    
    public boolean typeOf(final int type) {
        return type == 0;
    }
    
    public void setRotation(final float rotation) {
        this.entity.rotationYaw = rotation;
    }
    
    public float getRotation() {
        return this.entity.rotationYaw;
    }
    
    public void knockback(final int power, final float direction) {
        final float v = direction * 3.1415927f / 180.0f;
        this.entity.addVelocity((double)(-MathHelper.sin(v) * power), 0.1 + power * 0.04f, (double)(MathHelper.cos(v) * power));
        final Entity entity = this.entity;
        entity.motionX *= 0.6;
        final Entity entity2 = this.entity;
        entity2.motionZ *= 0.6;
        this.entity.attackEntityFrom(DamageSource.outOfWorld, 1.0E-4f);
    }
    
    public boolean isSneaking() {
        return this.entity.isSneaking();
    }
    
    public boolean isSprinting() {
        return this.entity.isSprinting();
    }
    
    public Entity getMCEntity() {
        return this.entity;
    }
}
