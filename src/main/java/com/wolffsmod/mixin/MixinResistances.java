package com.wolffsmod.mixin;

import com.flansmod.common.guns.EntityDamageSourceFlans;
import noppes.npcs.Resistances;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import net.minecraft.util.DamageSource;

@Mixin(value = Resistances.class)
public abstract class MixinResistances
{
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

        if(source.damageType.equals("arrow") || source.damageType.equals("thrown") || source.isProjectile()){
            damage *= (2F - arrow);
        }
        else if(source.damageType.equals("player") || source.damageType.equals("mob") || (source instanceof EntityDamageSourceFlans && ((EntityDamageSourceFlans) source).melee)){
            damage *= (2F - playermelee);
        }
        else if(source.damageType.equals("explosion") || source.damageType.equals("explosion.player") || source.isExplosion()){
            damage *= (2F - explosion);
        }

        return damage;
    }
}
