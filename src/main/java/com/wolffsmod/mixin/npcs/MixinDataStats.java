package com.wolffsmod.mixin.npcs;

import noppes.npcs.DataStats;
import noppes.npcs.entity.EntityNPCInterface;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = DataStats.class)
public abstract class MixinDataStats
{
    @Shadow
    private float attackStrength;
    @Shadow
    public int rangedRange;
    @Shadow
    public int aggroRange;
    @Shadow
    public float pDamage;
    @Shadow
    public boolean aimWhileShooting;

    @Inject(method = "<init>", at = @At("RETURN"))
    public void onDataStatsInit(EntityNPCInterface npc, CallbackInfo ci)
    {
        attackStrength = 1F;
        rangedRange = 64;
        aggroRange = 64;
        pDamage = 1;
        aimWhileShooting = true;
    }
}
