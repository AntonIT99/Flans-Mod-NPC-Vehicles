// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.scripted;

import net.minecraft.entity.Entity;
import noppes.npcs.controllers.ScriptController;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EntityLiving;

public class ScriptLiving extends ScriptLivingBase
{
    private EntityLiving entity;
    
    public ScriptLiving(final EntityLiving entity) {
        super((EntityLivingBase)entity);
        this.entity = entity;
    }
    
    @Override
    public boolean isAttacking() {
        return super.isAttacking() || this.entity.getAttackTarget() != null;
    }
    
    @Override
    public void setAttackTarget(final ScriptLivingBase living) {
        if (living == null) {
            this.entity.setAttackTarget((EntityLivingBase)null);
        }
        else {
            this.entity.setAttackTarget(living.entity);
        }
        super.setAttackTarget(living);
    }
    
    @Override
    public ScriptLivingBase getAttackTarget() {
        final ScriptLivingBase base = (ScriptLivingBase)ScriptController.Instance.getScriptForEntity((Entity)this.entity.getAttackTarget());
        return (base != null) ? base : super.getAttackTarget();
    }
    
    public void navigateTo(final double x, final double y, final double z, final double speed) {
        this.entity.getNavigator().tryMoveToXYZ(x, y, z, speed);
    }
    
    public void clearNavigation() {
        this.entity.getNavigator().clearPathEntity();
    }
    
    public boolean isNavigating() {
        return !this.entity.getNavigator().noPath();
    }
    
    @Override
    public boolean canSeeEntity(final ScriptEntity entity) {
        return this.entity.getEntitySenses().canSee(entity.entity);
    }
}
