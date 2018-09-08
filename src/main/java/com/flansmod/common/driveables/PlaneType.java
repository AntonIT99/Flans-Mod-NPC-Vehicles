/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 */
package com.flansmod.common.driveables;

import com.flansmod.client.model.ModelDriveable;
import com.flansmod.client.model.ModelPlane;
import com.flansmod.common.CommonProxy;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.EnumPlaneMode;
import com.flansmod.common.driveables.Propeller;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.vector.Vector3f;
import java.util.ArrayList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PlaneType
extends DriveableType {
    public EnumPlaneMode mode = EnumPlaneMode.PLANE;
    public float lookDownModifier = 1.0f;
    public float lookUpModifier = 1.0f;
    public float rollLeftModifier = 1.0f;
    public float rollRightModifier = 1.0f;
    public float turnLeftModifier = 1.0f;
    public float turnRightModifier = 1.0f;
    public float lift = 1.0f;
    public Vector3f bombPosition;
    public int planeShootDelay;
    public int planeBombDelay;
    public ArrayList<Propeller> propellers = new ArrayList();
    public ArrayList<Propeller> heliPropellers = new ArrayList();
    public ArrayList<Propeller> heliTailPropellers = new ArrayList();
    public boolean hasGear = false;
    public boolean hasDoor = false;
    public boolean hasWing = false;
    public float restingPitch = 0.0f;
    public boolean invInflight = true;
    public boolean hasFlare = false;
    public int flareDelay = 200;
    public String flareSound = "";
    public int timeFlareUsing = 5;
    public static ArrayList<PlaneType> types = new ArrayList();

    public PlaneType(TypeFile file) {
        super(file);
        types.add(this);
    }

    @Override
    public void preRead(TypeFile file) {
        super.preRead(file);
    }

    @Override
    protected void read(String[] split, TypeFile file) {
        super.read(split, file);
        try {
            Propeller propeller;
            if (split[0].equals("Mode")) {
                this.mode = EnumPlaneMode.getMode(split[1]);
            }
            if (split[0].equals("TurnLeftSpeed")) {
                this.turnLeftModifier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("TurnRightSpeed")) {
                this.turnRightModifier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("LookUpSpeed")) {
                this.lookUpModifier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("LookDownSpeed")) {
                this.lookDownModifier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("RollLeftSpeed")) {
                this.rollLeftModifier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("RollRightSpeed")) {
                this.rollRightModifier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("Lift")) {
                this.lift = Float.parseFloat(split[1]);
            }
            if (split[0].equals("ShootDelay")) {
                this.planeShootDelay = Integer.parseInt(split[1]);
            }
            if (split[0].equals("BombDelay")) {
                this.planeBombDelay = Integer.parseInt(split[1]);
            }
            if (split[0].equals("Propeller")) {
                propeller = new Propeller(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), EnumDriveablePart.getPart(split[5]), PartType.getPart(split[6]));
                this.propellers.add(propeller);
                this.recipe.add(new ItemStack(propeller.itemType.item));
            }
            if (split[0].equals("HeliPropeller")) {
                propeller = new Propeller(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), EnumDriveablePart.getPart(split[5]), PartType.getPart(split[6]));
                this.heliPropellers.add(propeller);
                this.recipe.add(new ItemStack(propeller.itemType.item));
            }
            if (split[0].equals("HeliTailPropeller")) {
                propeller = new Propeller(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), EnumDriveablePart.getPart(split[5]), PartType.getPart(split[6]));
                this.heliTailPropellers.add(propeller);
                this.recipe.add(new ItemStack(propeller.itemType.item));
            }
            if (split[0].equals("HasFlare")) {
                this.hasFlare = split[1].equals("True");
            }
            if (split[0].equals("FlareDelay")) {
                this.flareDelay = Integer.parseInt(split[1]);
                if (this.flareDelay <= 0) {
                    this.flareDelay = 1;
                }
            }
            if (split[0].equals("TimeFlareUsing")) {
                this.timeFlareUsing = Integer.parseInt(split[1]);
                if (this.timeFlareUsing <= 0) {
                    this.timeFlareUsing = 1;
                }
            }
            if (split[0].equals("PropSoundLength")) {
                this.engineSoundLength = Integer.parseInt(split[1]);
            }
            if (split[0].equals("PropSound")) {
                this.engineSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            if (split[0].equals("ShootSound")) {
                this.shootSoundPrimary = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            if (split[0].equals("BombSound")) {
                this.shootSoundSecondary = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            if (split[0].equals("FlareSound")) {
                this.flareSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            if (split[0].equals("HasGear")) {
                this.hasGear = split[1].equals("True");
            }
            if (split[0].equals("HasDoor")) {
                this.hasDoor = split[1].equals("True");
            }
            if (split[0].equals("HasWing")) {
                this.hasWing = split[1].equals("True");
            }
            if (split[0].equals("RestingPitch")) {
                this.restingPitch = Float.parseFloat(split[1]);
            }
            if (split[0].equals("InflightInventory")) {
                this.invInflight = split[1].equals("False");
            }
        }
        catch (Exception ignored) {
            // empty catch block
        }
    }

    @Override
    public int numEngines() {
        switch (this.mode) {
            case VTOL: {
                return Math.max(this.propellers.size(), this.heliPropellers.size());
            }
            case PLANE: {
                return this.propellers.size();
            }
            case HELI: {
                return this.heliPropellers.size();
            }
        }
        return 1;
    }

    @Override
    public ArrayList<ItemStack> getItemsRequired(DriveablePart part, PartType engine) {
        ArrayList<ItemStack> stacks = super.getItemsRequired(part, engine);
        for (Propeller propeller : this.propellers) {
            if (propeller.planePart != part.type) continue;
            stacks.add(new ItemStack(propeller.itemType.item));
            stacks.add(new ItemStack(engine.item));
        }
        return stacks;
    }

    public static PlaneType getPlane(String find) {
        for (PlaneType type : types) {
            if (!type.shortName.equals(find)) continue;
            return type;
        }
        return null;
    }

    @Override
    public void reloadModel() {
        this.model = (ModelDriveable)((Object)FlansMod.proxy.loadModel(this.modelString, this.shortName, ModelPlane.class));
    }

}

