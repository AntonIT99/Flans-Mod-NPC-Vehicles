// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs;

import net.minecraft.util.DamageSource;
import net.minecraft.nbt.NBTTagCompound;

public class Resistances
{
    public float knockback;
    public float arrow;
    public float playermelee;
    public float explosion;
    
    public Resistances() {
        this.knockback = 1.0f;
        this.arrow = 1.0f;
        this.playermelee = 1.0f;
        this.explosion = 1.0f;
    }
    
    public NBTTagCompound writeToNBT() {
        final NBTTagCompound compound = new NBTTagCompound();
        compound.setFloat("Knockback", this.knockback);
        compound.setFloat("Arrow", this.arrow);
        compound.setFloat("Melee", this.playermelee);
        compound.setFloat("Explosion", this.explosion);
        return compound;
    }
    
    public void readToNBT(final NBTTagCompound compound) {
        this.knockback = compound.getFloat("Knockback");
        this.arrow = compound.getFloat("Arrow");
        this.playermelee = compound.getFloat("Melee");
        this.explosion = compound.getFloat("Explosion");
    }
    
    public float applyResistance(final DamageSource source, float damage) {
        if (source.damageType.equals("arrow") || source.damageType.equals("thrown")) {
            damage *= 2.0f - this.arrow;
        }
        else if (source.damageType.equals("player") || source.damageType.equals("mob")) {
            damage *= 2.0f - this.playermelee;
        }
        else if (source.damageType.equals("explosion") || source.damageType.equals("explosion.player")) {
            damage *= 2.0f - this.explosion;
        }
        return damage;
    }
}
