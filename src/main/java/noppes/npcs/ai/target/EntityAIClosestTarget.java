// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.ai.target;

import net.minecraft.entity.monster.EntityMob;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAITarget;

public class EntityAIClosestTarget extends EntityAITarget
{
    private final Class targetClass;
    private final int targetChance;
    private final EntityAINearestAttackableTarget.Sorter theNearestAttackableTargetSorter;
    private final IEntitySelector targetEntitySelector;
    private EntityLivingBase targetEntity;
    
    public EntityAIClosestTarget(final EntityCreature par1EntityCreature, final Class par2Class, final int par3, final boolean par4) {
        this(par1EntityCreature, par2Class, par3, par4, false);
    }
    
    public EntityAIClosestTarget(final EntityCreature par1EntityCreature, final Class par2Class, final int par3, final boolean par4, final boolean par5) {
        this(par1EntityCreature, par2Class, par3, par4, par5, null);
    }
    
    public EntityAIClosestTarget(final EntityCreature par1EntityCreature, final Class par2Class, final int par3, final boolean par4, final boolean par5, final IEntitySelector par6IEntitySelector) {
        super(par1EntityCreature, par4, par5);
        this.targetClass = par2Class;
        this.targetChance = par3;
        this.theNearestAttackableTargetSorter = new EntityAINearestAttackableTarget.Sorter((Entity)par1EntityCreature);
        this.setMutexBits(1);
        this.targetEntitySelector = par6IEntitySelector;
    }
    
    public boolean shouldExecute() {
        if (this.targetChance > 0 && this.taskOwner.getRNG().nextInt(this.targetChance) != 0) {
            return false;
        }
        final double d0 = this.getTargetDistance();
        final List list = this.taskOwner.worldObj.selectEntitiesWithinAABB(this.targetClass, this.taskOwner.boundingBox.expand(d0, (double)MathHelper.ceiling_double_int(d0 / 2.0), d0), this.targetEntitySelector);
        Collections.sort((List<Object>)list, (Comparator<? super Object>)this.theNearestAttackableTargetSorter);
        if (list.isEmpty()) {
            return false;
        }
        this.targetEntity = (EntityLivingBase) list.get(0);
        return true;
    }
    
    public void startExecuting() {
        this.taskOwner.setAttackTarget(this.targetEntity);
        if (this.targetEntity instanceof EntityMob && ((EntityMob)this.targetEntity).getAttackTarget() == null) {
            ((EntityMob)this.targetEntity).setAttackTarget((EntityLivingBase)this.taskOwner);
            ((EntityMob)this.targetEntity).setTarget((Entity)this.taskOwner);
        }
        super.startExecuting();
    }
}
