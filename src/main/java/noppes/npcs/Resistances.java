package noppes.npcs;

import com.flansmod.common.guns.EntityDamageSourceFlans;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;

public class Resistances {

	public float knockback = 1f;
	public float arrow = 1f;
	public float playermelee = 1f;
	public float explosion = 1f;

	public boolean disableDamage = false;
	
	public NBTTagCompound writeToNBT() {
		NBTTagCompound compound = new NBTTagCompound();
		compound.setFloat("Knockback", knockback);
		compound.setFloat("Arrow", arrow);
		compound.setFloat("Melee", playermelee);
		compound.setFloat("Explosion", explosion);
		compound.setBoolean("disableDamage", disableDamage);
		return compound;
	}

	public void readToNBT(NBTTagCompound compound) {
		knockback = compound.getFloat("Knockback");
		arrow = compound.getFloat("Arrow");
		playermelee = compound.getFloat("Melee");
		explosion = compound.getFloat("Explosion");
		disableDamage = compound.getBoolean("disableDamage");
	}

	public float applyResistance(DamageSource source, float damage) {
		if(disableDamage){
			return 0;
		}

		if(source.damageType.equals("arrow") || source.damageType.equals("thrown") || source.isProjectile()){
			damage *= (2 - arrow);
		}
		else if(source.damageType.equals("player") || source.damageType.equals("mob") || (source instanceof EntityDamageSourceFlans && ((EntityDamageSourceFlans) source).melee)){
			damage *= (2 - playermelee);
		}
		else if(source.damageType.equals("explosion") || source.damageType.equals("explosion.player") || source.isExplosion()){
			damage *= (2 - explosion);
		}
		
		return damage;
	}

}
