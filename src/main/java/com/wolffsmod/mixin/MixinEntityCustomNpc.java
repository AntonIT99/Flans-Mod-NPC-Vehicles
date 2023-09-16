package com.wolffsmod.mixin;

import com.wolffsmod.WolffNPCMod;
import com.wolffsmod.entity.EntityFlanDriveableNPC;
import com.wolffsmod.entity.EntityFlanPlaneNPC;
import com.wolffsmod.entity.helper.EntityNPCBodyHelper;
import noppes.npcs.CustomNpcs;
import noppes.npcs.client.EntityUtil;
import noppes.npcs.entity.EntityCustomNpc;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.entity.data.ModelData;
import noppes.npcs.entity.data.ModelPartData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;

import java.util.Optional;

@Mixin(value = EntityCustomNpc.class)
public abstract class MixinEntityCustomNpc extends MixinEntityNPCInterface
{
    @Unique
    public EntityNPCBodyHelper bodyHelperNPC;

    @Shadow(remap = false)
    public ModelData modelData;

    protected MixinEntityCustomNpc(World w)
    {
        super(w);
    }

    @Inject(method = "<init>", at = @At("RETURN"), remap = false)
    public void onEntityCustomInit(World world, CallbackInfo ci)
    {
        bodyHelperNPC = new EntityNPCBodyHelper(this);
    }

    @Inject(method = "updateHitbox", at = @At("TAIL"), remap = false)
    public void onUpdateHitbox(CallbackInfo ci)
    {
        //Rendering fix for large entities and Flan Vehicles
        if (((height >= WolffNPCMod.largeEntitySize || width >= WolffNPCMod.largeEntitySize) && WolffNPCMod.ignoreFrustumCheckForLargeEntities) || (isFlanDriveable() && WolffNPCMod.ignoreFrustumCheckForNpcVehicles))
        {
            ignoreFrustumCheck = true;
        }
    }

    /**
     * @author Wolff
     * @reason update driveable NPC entity
     */
    @Override
    @Overwrite
    public void onUpdate()
    {
        super.onUpdate();
        getFlanDriveableEntity().ifPresent(driveableNPC -> driveableNPC.updateNpc((EntityCustomNpc) (Object) this));
        if (isRemote())
        {
            ModelPartData particles = modelData.getPartData("particles");
            if (particles != null && !isKilled())
            {
                CustomNpcs.proxy.spawnParticle(this, "ModelData", modelData, particles);
            }
            EntityLivingBase entity = modelData.getEntity((EntityNPCInterface)(Object)this);
            if (entity != null)
            {
                try
                {
                    entity.onUpdate();
                }
                catch (Exception e) {}
                EntityUtil.Copy(this, entity);
            }
        }
    }

    @Override
    public void updateRiderPosition()
    {
        EntityLivingBase modelEntity = modelData.getEntity((EntityNPCInterface)(Object)this);
        if (riddenByEntity != null && modelEntity != null)
        {
            modelEntity.posX = posX;
            modelEntity.posY = posY;
            modelEntity.posZ = posZ;
            modelEntity.riddenByEntity = riddenByEntity;
            modelEntity.updateRiderPosition();
        }
        else
        {
            super.updateRiderPosition();
        }
    }

    @Override
    protected float func_110146_f(float par1, float par2)
    {
        if (this.isAIEnabled())
        {
            this.bodyHelperNPC.func_75664_a();
            return par2;
        }
        else
        {
            return super.func_110146_f(par1, par2);
        }
    }

    @Override
    public float getEyeHeight()
    {
        Optional<EntityFlanDriveableNPC> driveableNPC = getFlanDriveableEntity();
        if (driveableNPC.isPresent() && !driveableNPC.get().shootPointsPrimary.isEmpty())
        {
            return driveableNPC.get().shootPointsPrimary.get(0).rootPos.position.getY() + driveableNPC.get().yDriveableOffset;
        }
        return super.getEyeHeight();
    }

    @Override
    public boolean isFlanDriveable()
    {
        return modelData.getEntity((EntityNPCInterface)(Object)this) instanceof EntityFlanDriveableNPC;
    }

    @Override
    public Optional<EntityFlanDriveableNPC> getFlanDriveableEntity()
    {
        if (isFlanDriveable())
            return Optional.of((EntityFlanDriveableNPC) modelData.getEntity((EntityNPCInterface)(Object)this));
        else
            return Optional.empty();
    }

    @Override
    public boolean isFlanPlane()
    {
        return modelData.getEntity((EntityNPCInterface)(Object)this) instanceof EntityFlanPlaneNPC;
    }
}
