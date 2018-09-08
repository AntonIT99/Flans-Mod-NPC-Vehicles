// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.scripted;

import net.minecraft.entity.Entity;
import noppes.npcs.controllers.ScriptController;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;

public class ScriptEventDamaged extends ScriptEvent
{
    private float damage;
    private boolean clear;
    private ScriptLivingBase source;
    private DamageSource damagesource;
    
    public ScriptEventDamaged(final float damage, final EntityLivingBase attackingEntity, final DamageSource damagesource) {
        this.clear = false;
        this.damage = damage;
        this.damagesource = damagesource;
        this.source = (ScriptLivingBase)ScriptController.Instance.getScriptForEntity((Entity)attackingEntity);
    }
    
    public ScriptLivingBase getSource() {
        return this.source;
    }
    
    public void setClearTarget(final boolean bo) {
        this.clear = bo;
    }
    
    public boolean getClearTarget() {
        return this.clear;
    }
    
    public float getDamage() {
        return this.damage;
    }
    
    public void setDamage(final float damage) {
        this.damage = damage;
    }
    
    public String getType() {
        return this.damagesource.damageType;
    }
}
