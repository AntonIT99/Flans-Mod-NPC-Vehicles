// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.ai;

import noppes.npcs.controllers.Line;
import net.minecraft.entity.EntityCreature;
import noppes.npcs.CustomNpcs;
import java.util.Iterator;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.util.Vec3;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;
import noppes.npcs.ai.selector.NPCInteractSelector;
import noppes.npcs.constants.AiMutex;
import net.minecraft.command.IEntitySelector;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAIWander extends EntityAIBase
{
    private EntityNPCInterface entity;
    public final IEntitySelector selector;
    private double xPosition;
    private double yPosition;
    private double zPosition;
    private EntityNPCInterface nearbyNPC;
    
    public EntityAIWander(final EntityNPCInterface npc) {
        this.entity = npc;
        this.setMutexBits((int)AiMutex.PASSIVE);
        this.selector = (IEntitySelector)new NPCInteractSelector(npc);
    }
    
    public boolean shouldExecute() {
        if (this.entity.getAge() >= 100 || !this.entity.getNavigator().noPath() || this.entity.isInteracting() || this.entity.getRNG().nextInt(80) != 0) {
            return false;
        }
        if (this.entity.ai.npcInteracting && this.entity.getRNG().nextInt(4) == 1) {
            this.nearbyNPC = this.getNearbyNPC();
        }
        if (this.nearbyNPC != null) {
            this.xPosition = MathHelper.floor_double(this.nearbyNPC.posX);
            this.yPosition = MathHelper.floor_double(this.nearbyNPC.posY);
            this.zPosition = MathHelper.floor_double(this.nearbyNPC.posZ);
            this.nearbyNPC.addInteract((EntityLivingBase)this.entity);
        }
        else {
            final Vec3 vec = this.getVec();
            if (vec == null) {
                return false;
            }
            this.xPosition = vec.xCoord;
            this.yPosition = vec.yCoord;
            this.zPosition = vec.zCoord;
        }
        return true;
    }
    
    public void updateTask() {
        if (this.nearbyNPC != null) {
            this.nearbyNPC.getNavigator().clearPathEntity();
        }
    }
    
    private EntityNPCInterface getNearbyNPC() {
        final List<EntityNPCInterface> list = (List<EntityNPCInterface>)this.entity.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this.entity, this.entity.boundingBox.expand((double)this.entity.ai.walkingRange, (this.entity.ai.walkingRange > 7) ? 7.0 : ((double)this.entity.ai.walkingRange), (double)this.entity.ai.walkingRange), this.selector);
        final Iterator<EntityNPCInterface> ita = list.iterator();
        while (ita.hasNext()) {
            final EntityNPCInterface npc = ita.next();
            if (!npc.ai.stopAndInteract || npc.isAttacking() || !npc.isEntityAlive() || this.entity.faction.isAggressiveToNpc(npc)) {
                ita.remove();
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return list.get(this.entity.getRNG().nextInt(list.size()));
    }
    
    private Vec3 getVec() {
        if (this.entity.ai.walkingRange <= 0) {
            return RandomPositionGeneratorAlt.findRandomTarget(this.entity, CustomNpcs.NpcNavRange, 7);
        }
        final double distance = this.entity.getDistanceSq((double)this.entity.getStartXPos(), this.entity.getStartYPos(), (double)this.entity.getStartZPos());
        int range = (int)MathHelper.sqrt_double(this.entity.ai.walkingRange * this.entity.ai.walkingRange - distance);
        if (range > CustomNpcs.NpcNavRange) {
            range = CustomNpcs.NpcNavRange;
        }
        if (range < 3) {
            range = this.entity.ai.walkingRange;
            if (range > CustomNpcs.NpcNavRange) {
                range = CustomNpcs.NpcNavRange;
            }
            final Vec3 start = Vec3.createVectorHelper((double)this.entity.getStartXPos(), this.entity.getStartYPos(), (double)this.entity.getStartZPos());
            return RandomPositionGeneratorAlt.findRandomTargetBlockTowards(this.entity, range / 2, (range / 2 > 7) ? 7 : (range / 2), start);
        }
        return RandomPositionGeneratorAlt.findRandomTarget(this.entity, range, (range / 2 > 7) ? 7 : (range / 2));
    }
    
    public boolean continueExecuting() {
        return (this.nearbyNPC == null || (this.selector.isEntityApplicable((Entity)this.nearbyNPC) && this.entity.getDistanceSqToEntity((Entity)this.nearbyNPC) >= this.entity.width * 1.5)) && !this.entity.getNavigator().noPath() && this.entity.isEntityAlive() && !this.entity.isInteracting();
    }
    
    public void startExecuting() {
        this.entity.getNavigator().tryMoveToXYZ(this.xPosition, this.yPosition, this.zPosition, 1.0);
    }
    
    public void resetTask() {
        if (this.nearbyNPC != null && this.entity.getDistanceSqToEntity((Entity)this.nearbyNPC) < 12.0) {
            final Line line = new Line(".........");
            line.hideText = true;
            if (this.entity.getRNG().nextBoolean()) {
                this.entity.saySurrounding(line);
            }
            else {
                this.nearbyNPC.saySurrounding(line);
            }
            this.entity.addInteract((EntityLivingBase)this.nearbyNPC);
            this.nearbyNPC.addInteract((EntityLivingBase)this.entity);
        }
        this.nearbyNPC = null;
    }
}
