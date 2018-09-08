// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.scripted;

import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.Potion;
import noppes.npcs.controllers.ScriptController;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ScriptLivingBase extends ScriptEntity
{
    protected EntityLivingBase entity;
    
    public ScriptLivingBase(final EntityLivingBase entity) {
        super((Entity)entity);
        this.entity = entity;
    }
    
    public float getHealth() {
        return this.entity.getHealth();
    }
    
    public void setHealth(final float health) {
        this.entity.setHealth(health);
    }
    
    public float getMaxHealth() {
        return this.entity.getMaxHealth();
    }
    
    public boolean isAttacking() {
        return this.entity.getAITarget() != null;
    }
    
    public void setAttackTarget(final ScriptLivingBase living) {
        if (living == null) {
            this.entity.setRevengeTarget((EntityLivingBase)null);
        }
        else {
            this.entity.setRevengeTarget(living.entity);
        }
    }
    
    public ScriptLivingBase getAttackTarget() {
        return (ScriptLivingBase)ScriptController.Instance.getScriptForEntity((Entity)this.entity.getAITarget());
    }
    
    @Override
    public int getType() {
        return 5;
    }
    
    @Override
    public boolean typeOf(final int type) {
        return type == 5 || super.typeOf(type);
    }
    
    public boolean canSeeEntity(final ScriptEntity entity) {
        return this.entity.canEntityBeSeen(entity.entity);
    }
    
    public EntityLivingBase getMinecraftEntity() {
        return this.entity;
    }
    
    public void swingHand() {
        this.entity.swingItem();
    }
    
    public void addPotionEffect(final int effect, int duration, int strength, final boolean hideParticles) {
        if (effect < 0 || effect >= Potion.potionTypes.length || Potion.potionTypes[effect] == null) {
            return;
        }
        if (strength < 0) {
            strength = 0;
        }
        else if (strength > 255) {
            strength = 255;
        }
        if (duration < 0) {
            duration = 0;
        }
        else if (duration > 1000000) {
            duration = 1000000;
        }
        if (!Potion.potionTypes[effect].isInstant()) {
            duration *= 20;
        }
        if (duration == 0) {
            this.entity.removePotionEffect(effect);
        }
        else {
            this.entity.addPotionEffect(new PotionEffect(effect, duration, strength));
        }
    }
    
    public void clearPotionEffects() {
        this.entity.clearActivePotions();
    }
    
    public int getPotionEffect(final int effect) {
        final PotionEffect pf = this.entity.getActivePotionEffect(Potion.potionTypes[effect]);
        if (pf == null) {
            return -1;
        }
        return pf.getAmplifier();
    }
    
    public ScriptItemStack getHeldItem() {
        final ItemStack item = this.entity.getHeldItem();
        if (item == null) {
            return null;
        }
        return new ScriptItemStack(item);
    }
    
    public void setHeldItem(final ScriptItemStack item) {
        this.entity.setCurrentItemOrArmor(0, (item == null) ? null : item.item);
    }
    
    public ScriptItemStack getArmor(final int slot) {
        final ItemStack item = this.entity.getEquipmentInSlot(slot + 1);
        if (item == null) {
            return null;
        }
        return new ScriptItemStack(item);
    }
    
    public void setArmor(final int slot, final ScriptItemStack item) {
        this.entity.setCurrentItemOrArmor(slot + 1, (item == null) ? null : item.item);
    }
}
