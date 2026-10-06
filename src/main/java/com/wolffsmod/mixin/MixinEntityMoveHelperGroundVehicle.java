package com.wolffsmod.mixin;

import com.wolffsmod.customnpc.IMixinDataAI;
import com.wolffsmod.customnpc.VehicleMobilityProfile;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityMoveHelper;
import noppes.npcs.entity.EntityNPCInterface;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/** Stops vanilla node-facing rotation; GroundVehicleController owns horizontal driving. */
@Mixin(EntityMoveHelper.class)
public abstract class MixinEntityMoveHelperGroundVehicle {
    @Shadow private EntityLiving entity;
    @Shadow private double posX;
    @Shadow private double posY;
    @Shadow private double posZ;
    @Shadow private boolean update;

    @Inject(method = "onUpdateMoveHelper", at = @At("HEAD"), cancellable = true)
    private void wolffsmod$groundVehicleControlsHeading(CallbackInfo ci) {
        if (!(entity instanceof EntityNPCInterface)) return;
        EntityNPCInterface npc = (EntityNPCInterface)entity;
        IMixinDataAI data = (IMixinDataAI)npc.ais;
        if (data.getVehicleMobilityProfile() != VehicleMobilityProfile.GROUND || !data.getGroundDrivingEnabled()) return;
        entity.setMoveForward(0.0F);
        if (update) {
            update = false;
            double dx = posX - entity.posX, dz = posZ - entity.posZ;
            if (posY - entity.boundingBox.minY > 0.5D && dx * dx + dz * dz < 2.25D)
                entity.getJumpHelper().setJumping();
        }
        ci.cancel();
    }
}
