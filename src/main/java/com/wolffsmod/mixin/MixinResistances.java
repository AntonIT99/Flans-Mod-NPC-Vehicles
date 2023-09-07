package com.wolffsmod.mixin;

import com.flansmod.common.guns.EntityDamageSourceFlans;
import com.wolffsmod.customnpc.IMixinResistances;
import noppes.npcs.Resistances;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;

@Mixin(value = Resistances.class)
public abstract class MixinResistances implements IMixinResistances
{
    @Unique
    private int arrowVulnerability;
    @Unique
    private int meleeVulnerability;
    @Unique
    private int explosionVulnerability;

    @Shadow(remap = false)
    public float knockback;
    @Shadow(remap = false)
    public float arrow;
    @Shadow(remap = false)
    public float playermelee;
    @Shadow(remap = false)
    public float explosion;
    @Shadow(remap = false)
    public boolean disableDamage;

    /**
     * @author Wolff
     * @reason Flan's projectiles and weapons damage absorbed by NPC's resistance
     */
    @Overwrite(remap = false)
    public float applyResistance(DamageSource source, float damage)
    {
        if(disableDamage)
        {
            return 0F;
        }

        if(source.damageType.equals("arrow") || source.damageType.equals("thrown") || source.isProjectile())
        {
            if (arrowVulnerability != 0 && damage < arrowVulnerability)
                return 0F;
            damage *= (2F - arrow);
        }
        else if(source.damageType.equals("player") || source.damageType.equals("mob") || (source instanceof EntityDamageSourceFlans && ((EntityDamageSourceFlans) source).melee))
        {
            if (meleeVulnerability != 0 && damage < meleeVulnerability)
                return 0F;
            damage *= (2F - playermelee);
        }
        else if(source.damageType.equals("explosion") || source.damageType.equals("explosion.player") || source.isExplosion())
        {
            if (explosionVulnerability != 0 && damage < explosionVulnerability)
                return 0F;
            damage *= (2F - explosion);
        }

        return damage;
    }

    /**
     * @author Wolff
     * @reason modify the NBTTagCompound
     */
    @Overwrite
    public NBTTagCompound writeToNBT()
    {
        NBTTagCompound compound = new NBTTagCompound();
        compound.setFloat("Knockback", this.knockback);
        compound.setFloat("Arrow", arrow);
        compound.setFloat("Melee", playermelee);
        compound.setFloat("Explosion", explosion);
        compound.setBoolean("disableDamage", disableDamage);
        compound.setInteger("ArrowVulnerability", arrowVulnerability);
        compound.setInteger("MeleeVulnerability", meleeVulnerability);
        compound.setInteger("ExplosionVulnerability", explosionVulnerability);
        return compound;
    }

    @Inject(method = "readToNBT", at = @At(value = "TAIL"), remap = false)
    public void onReadToNBT(NBTTagCompound nbttagcompound, CallbackInfo callbackInfo)
    {
        arrowVulnerability = nbttagcompound.getInteger("ArrowVulnerability");
        meleeVulnerability = nbttagcompound.getInteger("MeleeVulnerability");
        explosionVulnerability = nbttagcompound.getInteger("ExplosionVulnerability");
    }

    @Override
    public int getArrowVulnerability()
    {
        return arrowVulnerability;
    }

    @Override
    public int getMeleeVulnerability()
    {
        return meleeVulnerability;
    }

    @Override
    public int getExplosionVulnerability()
    {
        return explosionVulnerability;
    }

    @Override
    public void setArrowVulnerability(int damage)
    {
        arrowVulnerability = damage;
    }

    @Override
    public void setMeleeVulnerability(int damage)
    {
        meleeVulnerability = damage;
    }

    @Override
    public void setExplosionVulnerability(int damage)
    {
        explosionVulnerability = damage;
    }
}
