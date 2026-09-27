package com.wolffsmod.mixin;

import com.wolffsmod.config.RangeConfig;
import net.minecraft.nbt.NBTTagCompound;
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
    @Shadow(remap = false)
    private float attackStrength;
    @Shadow(remap = false)
    public int rangedRange;
    @Shadow(remap = false)
    public int aggroRange;
    @Shadow(remap = false)
    public float pDamage;
    @Shadow(remap = false)
    public byte aimType;

    @Inject(method = "<init>", at = @At("RETURN"), remap = false)
    public void onDataStatsInit(EntityNPCInterface npc, CallbackInfo ci)
    {
        attackStrength = 1F;
        rangedRange = 64;
        aggroRange = 64;
        pDamage = 1F;
        aimType = 1;
    }

    @Inject(method = { "readEntityFromNBT", "readToNBT" }, at = @At("RETURN"), remap = false)
    private void wolffsmod$applyConfiguredCombatLimit(NBTTagCompound compound, CallbackInfo callbackInfo)
    {
        int maximum = RangeConfig.getMaximumNPCCombatRange();
        aggroRange = Math.min(aggroRange, maximum);
        rangedRange = Math.min(rangedRange, maximum);
    }
}
