package com.wolffsmod.mixin;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.wolffsmod.benchmark.VehicleBenchmark;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

/** Optional counters scoped by Wolff model entry; never cancel or redirect rendering. */
@Mixin(value = ModelRendererTurbo.class, remap = false)
public abstract class MixinBenchmarkTurbo {
    @ModifyVariable(method = "render(FZ)V", at = @At("HEAD"), argsOnly = true, ordinal = 0, require = 0)
    private float wolffsmod$benchmarkRender(float scale) {
        VehicleBenchmark.operation(1);
        return scale;
    }

    @ModifyArg(method = "callDisplayList()V", at = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glCallList(I)V"), index = 0, require = 0)
    private int wolffsmod$benchmarkDispatch(int list) {
        VehicleBenchmark.operation(2);
        return list;
    }

    @ModifyVariable(method = "compileDisplayList(F)V", at = @At("HEAD"), argsOnly = true, ordinal = 0, require = 0)
    private float wolffsmod$benchmarkCompile(float scale) {
        VehicleBenchmark.operation(4);
        return scale;
    }
}
