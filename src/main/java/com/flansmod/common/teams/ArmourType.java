package com.flansmod.common.teams;

import java.util.ArrayList;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.common.FlansMod;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;

public class ArmourType extends InfoType
{


	public static ArrayList<ArmourType> armours = new ArrayList<ArmourType>();

	/** 0 = Helmet, 1 = Chestplate, 2 = Legs, 3 = Shoes */
	public int type;
	/** The amount of damage to absorb. From 0 to 1. Stacks additively between armour pieces */
	public double defence;
	/** The name for the armour texture. Texture path/name is assets/flansmod/armor/<armourTextureName>_1.png or _2 for legs */
	public String armourTextureName;
	/** Modifiers for various player stats */
	public float moveSpeedModifier = 1F, knockbackModifier = 0.2F, jumpModifier = 1F;
	/** If true, then the player gets a night vision buff every couple of seconds */
	public boolean nightVision = false;
	/** If true, then the player gets a invisiblity buff every couple of seconds */
	public boolean invisible = false;
	/** The overlay to display when using this helmet. Textures are pulled from the scopes directory */
	public String overlay = null;
	/** If true, then smoke effects from grenades will have no effect on players wearing this */
	public boolean smokeProtection = false;
	/** If true, the player will not receive fall damage */
	public boolean negateFallDamage = false;
	/** If true, the player will not receive fire damage */
	public boolean fireResistance = false;
	/** If true, the player can breath under water */
	public boolean waterBreathing = false;
	/** If true, the player can walk on water */
	public boolean onWaterWalking = false;
	//labjac
	public boolean energyShield = false;
	public boolean regenerate = false;
	public boolean hunger = false;
	public boolean submarine = false;
	public boolean playermodel = false;
	public int maxDamage = 9000;
	public int rechargeTimer = 85;
	public int warningSoundTimer = 10;
	public int rechargeDelay = 5;
	//secret armor
	public float armArmor=1f;
	public float legArmor=1f;
	public float headArmor=1f;
	public float napeArmor=1f;
	public float faceArmor=1f;
	public float bodyArmor=1f;
	public float backArmor=1f;
	public float ReserveLegArmor = 1;
	public float ReserveBodyArmor = 1;
	public float ReserveArmArmor = 1;
	public float ReserveHeadArmor = 1;
	public float ReserveNapeArmor = 1;
	public float ReserveFaceArmor = 1;
	public float ReserveBackArmor = 1;
	public double backupDefence=0;
	
	public int durability = 101;

	@SideOnly(Side.CLIENT)
	public ModelCustomArmour model;

	public String warningSound;

	public String rechargeSound;

	public String ShieldHit;

	public String ShieldKill;

	public float pouchMultiplier = 1f;

	public boolean hasPouch=false;
	public boolean hasOldGunPouch=false;
	public boolean hasGunPouch=false;
	public boolean hasHeavyPouch=false;
	public boolean hasBowPouch=false;

	
	//bariserinos
	public boolean hasFrontMount;
	public float frontMountY1;
	public float frontMountZ1;
	public float frontMountY2;
	public float frontMountZ2;
	public float frontMountRotation;

	//bariserinos 2
	public boolean hasTopMount;
	public float topMountY;
	public float topMountZ;
	public float topMountRotation;


	public ArmourType(TypeFile file)
	{
		super(file);
		armours.add(this);
	}
	
	@Override
	protected void preRead(TypeFile file) 
	{
	}

	@Override
	protected void postRead(TypeFile file) 
	{
	}
	
	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			if(FMLCommonHandler.instance().getSide().isClient() && split[0].equals("Model"))
			{
				model = FlansMod.proxy.loadModel(split[1], shortName, ModelCustomArmour.class);
				model.type = this;
			}
			if(split[0].equals("Type"))
			{
				if(split[1].equals("Hat") || split[1].equals("Helmet"))
					type = 0;
				if(split[1].equals("Chest") || split[1].equals("Body"))
					type = 1;
				if(split[1].equals("Legs") || split[1].equals("Pants"))
					type = 2;
				if(split[1].equals("Shoes") || split[1].equals("Boots"))
					type = 3;
			}

			//bariserinos 2
			if(split[0].equals("hasTopMount"))
				hasTopMount = Boolean.parseBoolean(split[1]);
			if(split[0].equals("topMountY"))
				topMountY = Float.parseFloat(split[1]);
			if(split[0].equals("topMountZ"))
				topMountZ = Float.parseFloat(split[1]);
			if(split[0].equals("topMountRotation"))
				topMountRotation = Float.parseFloat(split[1]);
			
			//bariserinos 1
			if(split[0].equals("hasFrontMount"))
				hasFrontMount = Boolean.parseBoolean(split[1]);
			if(split[0].equals("frontMountY1"))
				frontMountY1 = Float.parseFloat(split[1]);
			if(split[0].equals("frontMountZ1"))
				frontMountZ1 = Float.parseFloat(split[1]);
			if(split[0].equals("frontMountY2"))
				frontMountY2 = Float.parseFloat(split[1]);
			if(split[0].equals("frontMountZ2"))
				frontMountZ2 = Float.parseFloat(split[1]);
			if(split[0].equals("frontMountRotation"))
				frontMountRotation = Float.parseFloat(split[1]);
			
			
			if(split[0].equals("DamageReduction") || split[0].equals("Defence"))
				defence = Double.parseDouble(split[1]);
			if(split[0].equals("MoveSpeedModifier") || split[0].equals("Slowness"))
				moveSpeedModifier = Float.parseFloat(split[1]);
			if(split[0].equals("JumpModifier"))
				jumpModifier = Float.parseFloat(split[1]);
			if(split[0].equals("KnockbackReduction") || split[0].equals("KnockbackModifier"))
				knockbackModifier = Float.parseFloat(split[1]);
			
			//labjac secret armor
			if(split[0].equals("armArmor") || split[0].equals("gauntletArmor"))
				armArmor = Float.parseFloat(split[1]);
			if(split[0].equals("legArmor") || split[0].equals("leggingArmor"))
				legArmor = Float.parseFloat(split[1]);
			if(split[0].equals("headArmor") || split[0].equals("helmetArmor"))
				headArmor = Float.parseFloat(split[1]);
			if(split[0].equals("neckArmor") || split[0].equals("napeArmor"))
				napeArmor = Float.parseFloat(split[1]);
			if(split[0].equals("faceArmor") || split[0].equals("maskArmor"))
				faceArmor = Float.parseFloat(split[1]);
			if(split[0].equals("bodyArmor") || split[0].equals("chestArmor"))
				bodyArmor = Float.parseFloat(split[1]);
			if(split[0].equals("backArmor") || split[0].equals("rearArmor"))
				backArmor = Float.parseFloat(split[1]);
			//reserve armor if energyshield turned off but not naked without shield
			if(split[0].equals("ReserveArmArmor"))
				ReserveArmArmor = Float.parseFloat(split[1]);
			if(split[0].equals("ReserveBackArmor"))
				ReserveBackArmor = Float.parseFloat(split[1]);
			if(split[0].equals("ReserveLegArmor"))
				ReserveLegArmor = Float.parseFloat(split[1]);
			if(split[0].equals("ReserveHeadArmor"))
				ReserveHeadArmor = Float.parseFloat(split[1]);
			if(split[0].equals("ReserveNapeArmor"))
				ReserveNapeArmor = Float.parseFloat(split[1]);
			if(split[0].equals("ReserveFaceArmor"))
				ReserveFaceArmor = Float.parseFloat(split[1]);
			if(split[0].equals("ReserveBodyArmor"))
				ReserveBodyArmor = Float.parseFloat(split[1]);
			if(split[0].equals("BackupDefence"))
				backupDefence = Float.parseFloat(split[1]);
			
			//mag pouch effects
			if(split[0].equals("pouchMultiplier") || split[0].equals("reloadMultiplier"))
				pouchMultiplier = Float.parseFloat(split[1]);
			if(split[0].equals("hasPouch")|| split[0].equals("hasMagPouch"))
				hasPouch = Boolean.parseBoolean(split[1]);
			if(split[0].equals("hasOldGunPouch"))
				hasOldGunPouch = Boolean.parseBoolean(split[1]);
			if(split[0].equals("hasBowPouch"))
				hasBowPouch = Boolean.parseBoolean(split[1]);
			if(split[0].equals("hasHeavyPouch"))
				hasHeavyPouch = Boolean.parseBoolean(split[1]);
			if(split[0].equals("hasGunPouch"))
				hasGunPouch = Boolean.parseBoolean(split[1]);

			//halo
			if(split[0].equals("energyShield")|| split[0].equals("forceField"))
				energyShield = Boolean.parseBoolean(split[1]);
			if(split[0].equals("rechargeTimer"))
				rechargeTimer = Integer.parseInt(split[1]);
			if(split[0].equals("RechargeSound"))
				rechargeSound = split[1];
			if(split[0].equals("WarningSound"))
				warningSound = split[1];
			if(split[0].equals("rechargeDelay"))
				rechargeDelay = Integer.parseInt(split[1]);
			if(split[0].equals("WarningSoundTimer"))
				warningSoundTimer = Integer.parseInt(split[1]);
			if(split[0].equals("ShieldHitSound"))
				ShieldHit = split[1];
			if(split[0].equals("ShieldKillSound"))
				ShieldKill = split[1];

			if(split[0].equals("NightVision"))
				nightVision = Boolean.parseBoolean(split[1]);
			if(split[0].equals("Invisible"))
				invisible = Boolean.parseBoolean(split[1]);
			if(split[0].equals("NegateFallDamage"))
				negateFallDamage = Boolean.parseBoolean(split[1]);
			if(split[0].equals("FireResistance"))
				fireResistance = Boolean.parseBoolean(split[1]);
			if(split[0].equals("WaterBreathing"))
				waterBreathing = Boolean.parseBoolean(split[1]);
			if(split[0].equals("Overlay"))
				overlay = split[1];

			if(split[0].equals("SmokeProtection"))
				smokeProtection = Boolean.parseBoolean(split[1]);

			if(split[0].equals("OnWaterWalking"))
				onWaterWalking = Boolean.parseBoolean(split[1]);

							if(split[0].equals("submarine"))
				submarine = Boolean.parseBoolean(split[1]);
							if(split[0].equals("playermodel"))
								playermodel = Boolean.parseBoolean(split[1]);
											if(split[0].equals("regenerate"))
				regenerate = Boolean.parseBoolean(split[1]);
											if(split[0].equals("hunger"))
				hunger = Boolean.parseBoolean(split[1]);

			if(split[0].equals("Durability"))
				durability = Integer.parseInt(split[1]);
			
			if(split[0].equals("damageLimit"))
				maxDamage = Integer.parseInt(split[1]);


			if(split[0].equals("ArmourTexture") || split[0].equals("ArmorTexture"))
			{
				armourTextureName = split[1];
			}
		} catch (Exception e)
		{
			System.out.println("Reading armour file failed.");
			if(FlansMod.printStackTrace)
			{
				e.printStackTrace();
			}
		}
	}

	public static ArmourType getArmourType(String string)
	{
		for(ArmourType armour : armours)
		{
			if(armour.shortName.equals(string))
				return armour;
		}
		return null;
	}

	/** To be overriden by subtypes for model reloading */
	public void reloadModel()
	{
		model = FlansMod.proxy.loadModel(modelString, shortName, ModelCustomArmour.class);
		if(model != null)
			model.type = this;
	}

	@Override
	public float GetRecommendedScale() 
	{
		return 50.0f;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBase GetModel() 
	{
		return model;
	}
}
