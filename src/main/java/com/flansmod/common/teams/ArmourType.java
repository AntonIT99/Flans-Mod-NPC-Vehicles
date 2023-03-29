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

public class ArmourType extends InfoType {
    public static ArrayList<ArmourType> armours = new ArrayList<ArmourType>();

    /**
     * 0 = Helmet, 1 = Chestplate, 2 = Legs, 3 = Shoes
     */
    public int type;
    /**
     * The amount of damage to absorb. From 0 to 1. Stacks additively between armour pieces
     */
    public double defence;

    /**
     * The amount of damage to absorb. From 0 to 1. Stacks additively between armour
     * pieces. For bullet damage specifically.
     */
    public double bulletDefence;

    /**
     * How good the armour is at stopping bullets. Same units as bullet penetration. Default 0 to emulate previous behaviour
     */
    public float penetrationResistance = 0;
    /**
     * The name for the armour texture. Texture path/name is assets/flansmod/armor/<armourTextureName>_1.png or _2 for legs
     */
    public String armourTextureName;
    /**
     * Modifiers for various player stats
     */
    public float moveSpeedModifier = 1F, knockbackModifier = 0.2F, jumpModifier = 1F;
    /**
     * If true, then the player gets a night vision buff every couple of seconds
     */
    public boolean nightVision = false;
    /**
     * If true, then the player gets a invisiblity buff every couple of seconds
     */
    public boolean invisible = false;
    /**
     * The overlay to display when using this helmet. Textures are pulled from the scopes directory
     */
    public String overlay = null;
    /**
     * If true, then smoke effects from grenades will have no effect on players wearing this
     */
    public boolean smokeProtection = false;
    /**
     * If true, the player will not receive fall damage
     */
    public boolean negateFallDamage = false;
    /**
     * If true, the player will not receive fire damage
     */
    public boolean fireResistance = false;
    /**
     * If true, the player can breath under water
     */
    public boolean waterBreathing = false;
    /**
     * If true, the player can walk on water
     */
    public boolean onWaterWalking = false;
    /**
     * If true, the armor has durability
     */
    public boolean hasDurability = false;
    /**
     * The durability for the piece of armor
     */
    public int durability = 0;

    public ModelCustomArmour model;

    public ArmourType(TypeFile file) {
        super(file);
        armours.add(this);
    }

    @Override
    protected void preRead(TypeFile file) {
    }

    @Override
    protected void postRead(TypeFile file) {
    }

    @Override
    protected void read(String[] split, TypeFile file) {
        super.read(split, file);
        try {
            if (FMLCommonHandler.instance().getSide().isClient() && split[0].equals("Model")) {
                model = FlansMod.proxy.loadModel(split[1], shortName, ModelCustomArmour.class);
                model.type = this;
            }
            if (split[0].equals("Type")) {
                if (split[1].equals("Hat") || split[1].equals("Helmet"))
                    type = 0;
                if (split[1].equals("Chest") || split[1].equals("Body"))
                    type = 1;
                if (split[1].equals("Legs") || split[1].equals("Pants"))
                    type = 2;
                if (split[1].equals("Shoes") || split[1].equals("Boots"))
                    type = 3;
            }

            if (split[0].equals("DamageReduction") || split[0].equals("Defence"))
            {
                defence = Double.parseDouble(split[1]);
                bulletDefence = defence;
            }
            if (split[0].equals("BulletDefence")) {
                bulletDefence = Double.parseDouble(split[1]);
            }
            if (split[0].equals("OtherDefence")) {
                defence = Double.parseDouble(split[1]);
            }
            if (split[0].equals("MoveSpeedModifier") || split[0].equals("Slowness"))
                moveSpeedModifier = Float.parseFloat(split[1]);
            if (split[0].equals("JumpModifier"))
                jumpModifier = Float.parseFloat(split[1]);
            if (split[0].equals("KnockbackReduction") || split[0].equals("KnockbackModifier"))
                knockbackModifier = Float.parseFloat(split[1]);
            if (split[0].equals("PenetrationResistance"))
                penetrationResistance = Float.parseFloat(split[1]);

            if (split[0].equals("NightVision"))
                nightVision = Boolean.parseBoolean(split[1]);
            if (split[0].equals("Invisible"))
                invisible = Boolean.parseBoolean(split[1]);
            if (split[0].equals("NegateFallDamage"))
                negateFallDamage = Boolean.parseBoolean(split[1]);
            if (split[0].equals("FireResistance"))
                fireResistance = Boolean.parseBoolean(split[1]);
            if (split[0].equals("WaterBreathing"))
                waterBreathing = Boolean.parseBoolean(split[1]);
            if (split[0].equals("Overlay"))
                overlay = split[1];

            if (split[0].equals("SmokeProtection"))
                smokeProtection = Boolean.parseBoolean(split[1]);

            if (split[0].equals("OnWaterWalking"))
                onWaterWalking = Boolean.parseBoolean(split[1]);

            if (split[0].equals("Durability")) {
                durability = Integer.parseInt(split[1]);
                hasDurability = durability > 0;
            }

            if (split[0].equals("ArmourTexture") || split[0].equals("ArmorTexture")) {
                armourTextureName = split[1];
            }
        } catch (Exception e) {
            FlansMod.log("Reading armour file failed.");
            if (FlansMod.printStackTrace) {
                e.printStackTrace();
            }
        }
    }

    public static ArmourType getArmourType(String string) {
        for (ArmourType armour : armours) {
            if (armour.shortName.equals(string))
                return armour;
        }
        return null;
    }

    /**
     * To be overriden by subtypes for model reloading
     */
    public void reloadModel() {
        model = FlansMod.proxy.loadModel(modelString, shortName, ModelCustomArmour.class);
        if (model != null)
            model.type = this;
    }

    @Override
    public float GetRecommendedScale() {
        return 50.0f;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ModelBase GetModel() {
        return model;
    }
}
