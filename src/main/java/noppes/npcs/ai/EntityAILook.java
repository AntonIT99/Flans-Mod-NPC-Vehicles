// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.ai;

import java.util.Iterator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import noppes.npcs.constants.EnumStandingType;
import noppes.npcs.constants.AiMutex;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAILook extends EntityAIBase
{
    private final EntityNPCInterface npc;
    private int idle;
    private double lookX;
    private double lookZ;
    boolean rotatebody;
    
    public EntityAILook(final EntityNPCInterface npc) {
        this.idle = 0;
        this.npc = npc;
        this.setMutexBits((int)AiMutex.LOOK);
    }
    
    public boolean shouldExecute() {
        return !this.npc.isAttacking() && this.npc.getNavigator().noPath() && !this.npc.isPlayerSleeping() && this.npc.isEntityAlive();
    }
    
    public void startExecuting() {
        this.rotatebody = (this.npc.ai.standingType == EnumStandingType.RotateBody || this.npc.ai.standingType == EnumStandingType.HeadRotation);
    }
    
    public void resetTask() {
        this.rotatebody = false;
    }
    
    public void updateTask() {
        if (this.npc.ai.standingType == EnumStandingType.Stalking) {
            final EntityPlayer player = this.npc.worldObj.getClosestPlayerToEntity((Entity)this.npc, 16.0);
            if (player == null) {
                this.rotatebody = true;
            }
            else {
                this.npc.getLookHelper().setLookPositionWithEntity((Entity)player, 10.0f, (float)this.npc.getVerticalFaceSpeed());
            }
        }
        if (this.npc.isInteracting()) {
            final Iterator<EntityLivingBase> ita = this.npc.interactingEntities.iterator();
            EntityLivingBase closest = null;
            double closestDistance = 12.0;
            while (ita.hasNext()) {
                final EntityLivingBase entity = ita.next();
                final double distance = entity.getDistanceSqToEntity((Entity)this.npc);
                if (distance < closestDistance) {
                    closestDistance = entity.getDistanceSqToEntity((Entity)this.npc);
                    closest = entity;
                }
                else {
                    if (distance <= 12.0) {
                        continue;
                    }
                    ita.remove();
                }
            }
            if (closest != null) {
                this.npc.getLookHelper().setLookPositionWithEntity((Entity)closest, 10.0f, (float)this.npc.getVerticalFaceSpeed());
                return;
            }
        }
        if (this.rotatebody) {
            if (this.idle == 0 && this.npc.getRNG().nextFloat() < 0.02f) {
                double var1 = 6.283185307179586 * this.npc.getRNG().nextDouble();
                if (this.npc.ai.standingType == EnumStandingType.HeadRotation) {
                    var1 = 0.017453292519943295 * this.npc.ai.orientation + 0.6283185307179586 + 1.8849555921538759 * this.npc.getRNG().nextDouble();
                }
                this.lookX = Math.cos(var1);
                this.lookZ = Math.sin(var1);
                this.idle = 20 + this.npc.getRNG().nextInt(20);
            }
            if (this.idle > 0) {
                --this.idle;
                this.npc.getLookHelper().setLookPosition(this.npc.posX + this.lookX, this.npc.posY + this.npc.getEyeHeight(), this.npc.posZ + this.lookZ, 10.0f, (float)this.npc.getVerticalFaceSpeed());
            }
        }
        if (this.npc.ai.standingType == EnumStandingType.NoRotation) {
            final EntityNPCInterface npc = this.npc;
            final EntityNPCInterface npc2 = this.npc;
            final EntityNPCInterface npc3 = this.npc;
            final float rotationYawHead = this.npc.ai.orientation;
            npc3.renderYawOffset = rotationYawHead;
            npc2.rotationYaw = rotationYawHead;
            npc.rotationYawHead = rotationYawHead;
        }
    }
}
