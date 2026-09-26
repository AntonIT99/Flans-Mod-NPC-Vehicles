package com.wolffsmod.mixin;

import com.wolffsmod.benchmark.VehicleBenchmark;
import net.minecraft.entity.Entity;
import noppes.npcs.client.model.ModelMPM;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/** Client-only, observational hooks. Armor passes use separate ModelMPM instances. */
@Mixin(value = ModelMPM.class, remap = false)
public abstract class MixinBenchmarkHumanoid {
    @Unique private long wolffsmod$humanStart;

    @Inject(method = {"render", "func_78088_a"}, at = @At("HEAD"), require = 0)
    private void wolffsmod$begin(Entity entity, float a, float b, float c, float d, float e, float f, CallbackInfo ci) {
        wolffsmod$humanStart = 0;
    }

    // Only the native humanoid branch reaches this call, after scripted invisibility returns.
    @Inject(method = {"render", "func_78088_a"}, at = @At(value = "INVOKE",
            target = "Lnoppes/npcs/client/model/ModelMPM;setPlayerData(Lnoppes/npcs/entity/EntityCustomNpc;)V"), require = 0)
    private void wolffsmod$nativeModel(Entity entity, float a, float b, float c, float d, float e, float f, CallbackInfo ci) {
        wolffsmod$humanStart = VehicleBenchmark.beginHumanoid(entity);
    }

    @Inject(method = {"render", "func_78088_a"}, at = @At("RETURN"), require = 0)
    private void wolffsmod$end(Entity entity, float a, float b, float c, float d, float e, float f, CallbackInfo ci) {
        VehicleBenchmark.endHumanoid(entity, wolffsmod$humanStart);
        wolffsmod$humanStart = 0;
    }
}
