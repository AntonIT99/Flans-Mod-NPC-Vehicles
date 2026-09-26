package com.wolffsmod.mixin;

import java.io.File;

import com.wolffsmod.config.RangeConfig;
import noppes.npcs.config.ConfigMain;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ConfigMain.class)
public abstract class MixinConfigMainRange128 {
    @Shadow(remap = false)
    public static int NpcNavRange;

    @Inject(method = "init", at = @At("RETURN"), remap = false)
    private static void wolffsmod$extendNpcNavigationRange(File configFile, CallbackInfo callbackInfo) {
        NpcNavRange = RangeConfig.getNPCNavigationRange();
    }
}
