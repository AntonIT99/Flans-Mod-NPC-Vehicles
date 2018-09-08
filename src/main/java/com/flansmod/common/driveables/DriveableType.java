/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.FMLCommonHandler
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.material.Material
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemDye
 *  net.minecraft.item.ItemStack
 */
package com.flansmod.common.driveables;

import com.flansmod.client.model.ModelDriveable;
import com.flansmod.common.CommonProxy;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.CollisionBox;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.driveables.DriveablePosition;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.EnumWeaponType;
import com.flansmod.common.driveables.PilotGun;
import com.flansmod.common.driveables.Seat;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.EnumFireMode;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.vector.Vector3f;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;

public class DriveableType
extends InfoType {
    @SideOnly(value=Side.CLIENT)
    public ModelDriveable model;
    public HashMap<EnumDriveablePart, CollisionBox> health = new HashMap();
    public HashMap<EnumDriveablePart, ItemStack[]> partwiseRecipe = new HashMap();
    public ArrayList<ItemStack> recipe = new ArrayList();
    public boolean acceptAllAmmo = true;
    public List<BulletType> ammo = new ArrayList<BulletType>();
    public boolean harvestBlocks = false;
    public ArrayList<Material> materialsHarvested = new ArrayList();
    public float fallDamageFactor = 1.0f;
    public EnumWeaponType primary = EnumWeaponType.NONE;
    public EnumWeaponType secondary = EnumWeaponType.NONE;
    public boolean alternatePrimary = false;
    public boolean alternateSecondary = false;
    public int shootDelayPrimary = 1;
    public int shootDelaySecondary = 1;
    public EnumFireMode modePrimary = EnumFireMode.FULLAUTO;
    public EnumFireMode modeSecondary = EnumFireMode.FULLAUTO;
    public String shootSoundPrimary;
    public String shootSoundSecondary;
    public ArrayList<DriveablePosition> shootPointsPrimary = new ArrayList();
    public ArrayList<DriveablePosition> shootPointsSecondary = new ArrayList();
    public ArrayList<PilotGun> pilotGuns = new ArrayList();
    public int reloadTimePrimary = 0;
    public int reloadTimeSecondary = 0;
    public String reloadSoundPrimary = "";
    public String reloadSoundSecondary = "";
    public int placeTimePrimary = 5;
    public int placeTimeSecondary = 5;
    public String placeSoundPrimary = "";
    public String placeSoundSecondary = "";
    public int numPassengers = 0;
    public Seat[] seats;
    public int numPassengerGunners = 0;
    public ArrayList<ShootParticle> shootParticlesPrimary = new ArrayList();
    public ArrayList<ShootParticle> shootParticlesSecondary = new ArrayList();
    public int numCargoSlots;
    public int numBombSlots;
    public int numMissileSlots;
    public int fuelTankSize = 100;
    public float yOffset = 0.625f;
    public float cameraDistance = 5.0f;
    public float maxThrottle = 1.0f;
    public float maxNegativeThrottle = 0.0f;
    public Vector3f turretOrigin = new Vector3f();
    public Vector3f turretOriginOffset = new Vector3f();
    public DriveablePosition[] wheelPositions = new DriveablePosition[0];
    public float wheelSpringStrength = 0.5f;
    public float wheelStepHeight = 1.0f;
    public ArrayList<DriveablePosition> collisionPoints = new ArrayList();
    public float drag = 1.0f;
    public boolean floatOnWater = false;
    public boolean placeableOnLand = true;
    public boolean placeableOnWater = false;
    public boolean placeableOnSponge = false;
    public float buoyancy = 0.0165f;
    public float floatOffset = 0.0f;
    public float bulletDetectionRadius = 5.0f;
    public boolean onRadar = false;
    public int startSoundRange = 50;
    public String startSound = "";
    public int startSoundLength;
    public int engineSoundRange = 50;
    public String engineSound = "";
    public int engineSoundLength;
    public int backSoundRange = 50;
    public String backSound = "";
    public int backSoundLength;
    public boolean collisionDamageEnable = false;
    public float collisionDamageThrottle = 0.0f;
    public float collisionDamageTimes = 0.0f;
    public boolean enableReloadTime = false;
    public boolean canMountEntity = false;
    public float bulletSpread = 0.0f;
    public float bulletSpeed = 3.0f;
    public boolean isExplosionWhenDestroyed = false;
    public String lockedOnSound = "";
    public int soundTime = 0;
    public int canLockOnAngle = 10;
    public int lockOnSoundTime = 60;
    public String lockOnSound = "";
    public int maxRangeLockOn = 500;
    public int lockedOnSoundRange = 5;
    public String lockingOnSound = "";
    public boolean lockOnToPlanes = false;
    public boolean lockOnToVehicles = false;
    public boolean lockOnToMechas = false;
    public boolean lockOnToPlayers = false;
    public boolean lockOnToLivings = false;
    public static ArrayList<DriveableType> types = new ArrayList();

    public DriveableType(TypeFile file) {
        super(file);
    }

    @Override
    public void preRead(TypeFile file) {
        String[] split;
        super.preRead(file);
        for (String line2 : file.lines) {
            if (line2 == null) break;
            if (line2.startsWith("//") || (split = line2.split(" ")).length < 2 || !split[0].equals("Passengers")) continue;
            this.numPassengers = Integer.parseInt(split[1]);
            this.seats = new Seat[this.numPassengers + 1];
            break;
        }
        for (String line2 : file.lines) {
            if (line2 == null) break;
            if (line2.startsWith("//") || (split = line2.split(" ")).length < 2 || !split[0].equals("NumWheels")) continue;
            this.wheelPositions = new DriveablePosition[Integer.parseInt(split[1])];
            break;
        }
        types.add(this);
    }

    @Override
    protected void read(String[] split, TypeFile file) {
        block211 : {
            super.read(split, file);
            try {
                if (FMLCommonHandler.instance().getSide().isClient() && split[0].equals("Model")) {
                    this.model = (ModelDriveable)((Object)FlansMod.proxy.loadModel(split[1], this.shortName, ModelDriveable.class));
                } else if (split[0].equals("Texture")) {
                    this.texture = split[1];
                } else if (split[0].equals("IsExplosionWhenDestroyed")) {
                    this.isExplosionWhenDestroyed = Boolean.parseBoolean(split[1]);
                } else if (split[0].equals("FallDamageFactor")) {
                    this.fallDamageFactor = Float.parseFloat(split[1]);
                } else if (split[0].equals("MaxThrottle")) {
                    this.maxThrottle = Float.parseFloat(split[1]);
                } else if (split[0].equals("MaxNegativeThrottle")) {
                    this.maxNegativeThrottle = Float.parseFloat(split[1]);
                } else if (split[0].equals("Drag")) {
                    this.drag = Float.parseFloat(split[1]);
                } else if (split[0].equals("TurretOrigin")) {
                    this.turretOrigin = new Vector3f(Float.parseFloat(split[1]) / 16.0f, Float.parseFloat(split[2]) / 16.0f, Float.parseFloat(split[3]) / 16.0f);
                } else if (split[0].equals("TurretOriginOffset")) {
                    this.turretOriginOffset = new Vector3f(Float.parseFloat(split[1]) / 16.0f, Float.parseFloat(split[2]) / 16.0f, Float.parseFloat(split[3]) / 16.0f);
                } else if (split[0].equals("CollisionPoint") || split[0].equals("AddCollisionPoint")) {
                    this.collisionPoints.add(new DriveablePosition(split));
                } else if (split[0].equals("CollisionDamageEnable")) {
                    this.collisionDamageEnable = Boolean.parseBoolean(split[1]);
                } else if (split[0].equals("CollisionDamageThrottle")) {
                    this.collisionDamageThrottle = Float.parseFloat(split[1]);
                } else if (split[0].equals("CollisionDamageTimes")) {
                    this.collisionDamageTimes = Float.parseFloat(split[1]);
                } else if (split[0].equals("CanLockAngle")) {
                    this.canLockOnAngle = Integer.parseInt(split[1]);
                } else if (split[0].equals("LockOnSoundTime")) {
                    this.lockOnSoundTime = Integer.parseInt(split[1]);
                } else if (split[0].equals("LockOnToDriveables")) {
                    this.lockOnToVehicles = this.lockOnToMechas = Boolean.parseBoolean(split[1].toLowerCase());
                    this.lockOnToPlanes = this.lockOnToMechas;
                } else if (split[0].equals("LockOnToVehicles")) {
                    this.lockOnToVehicles = Boolean.parseBoolean(split[1].toLowerCase());
                } else if (split[0].equals("LockOnToPlanes")) {
                    this.lockOnToPlanes = Boolean.parseBoolean(split[1].toLowerCase());
                } else if (split[0].equals("LockOnToMechas")) {
                    this.lockOnToMechas = Boolean.parseBoolean(split[1].toLowerCase());
                } else if (split[0].equals("LockOnToPlayers")) {
                    this.lockOnToPlayers = Boolean.parseBoolean(split[1].toLowerCase());
                } else if (split[0].equals("LockOnToLivings")) {
                    this.lockOnToLivings = Boolean.parseBoolean(split[1].toLowerCase());
                } else if (split[0].equals("LockedOnSoundRange")) {
                    this.lockedOnSoundRange = Integer.parseInt(split[1]);
                } else if (split[0].equals("PlaceableOnLand")) {
                    this.placeableOnLand = Boolean.parseBoolean(split[1]);
                } else if (split[0].equals("PlaceableOnWater")) {
                    this.placeableOnWater = Boolean.parseBoolean(split[1]);
                } else if (split[0].equals("PlaceableOnSponge")) {
                    this.placeableOnSponge = Boolean.parseBoolean(split[1]);
                } else if (split[0].equals("FloatOnWater")) {
                    this.floatOnWater = Boolean.parseBoolean(split[1]);
                } else if (split[0].equals("Boat")) {
                    this.placeableOnLand = false;
                    this.placeableOnWater = true;
                    this.floatOnWater = true;
                    this.wheelStepHeight = 0.0f;
                } else if (split[0].equals("Buoyancy")) {
                    this.buoyancy = Float.parseFloat(split[1]);
                } else if (split[0].equals("FloatOffset")) {
                    this.floatOffset = Float.parseFloat(split[1]);
                } else if (split[0].equals("CanMountEntity")) {
                    this.canMountEntity = Boolean.parseBoolean(split[1]);
                } else if (split[0].equals("Wheel") || split[0].equals("WheelPosition")) {
                    this.wheelPositions[Integer.parseInt((String)split[1])] = new DriveablePosition(new Vector3f(Float.parseFloat(split[2]) / 16.0f, Float.parseFloat(split[3]) / 16.0f, Float.parseFloat(split[4]) / 16.0f), split.length > 5 ? EnumDriveablePart.getPart(split[5]) : EnumDriveablePart.coreWheel);
                } else if (split[0].equals("WheelRadius") || split[0].equals("WheelStepHeight")) {
                    this.wheelStepHeight = Float.parseFloat(split[1]);
                } else if (split[0].equals("WheelSpringStrength") || split[0].equals("SpringStrength")) {
                    this.wheelSpringStrength = Float.parseFloat(split[1]);
                } else if (split[0].equals("Harvester")) {
                    this.harvestBlocks = Boolean.parseBoolean(split[1]);
                } else if (split[0].equals("HarvestMaterial")) {
                    this.materialsHarvested.add(DriveableType.getMaterial(split[1]));
                } else if (split[0].equals("HarvestToolType")) {
                    if (split[1].equals("Axe")) {
                        this.materialsHarvested.add(Material.wood);
                        this.materialsHarvested.add(Material.plants);
                        this.materialsHarvested.add(Material.vine);
                    } else if (split[1].equals("Pickaxe") || split[1].equals("Drill")) {
                        this.materialsHarvested.add(Material.iron);
                        this.materialsHarvested.add(Material.anvil);
                        this.materialsHarvested.add(Material.rock);
                    } else if (split[1].equals("Spade") || split[1].equals("Shovel") || split[1].equals("Excavator")) {
                        this.materialsHarvested.add(Material.ground);
                        this.materialsHarvested.add(Material.grass);
                        this.materialsHarvested.add(Material.sand);
                        this.materialsHarvested.add(Material.snow);
                        this.materialsHarvested.add(Material.clay);
                    } else if (split[1].equals("Hoe") || split[1].equals("Combine")) {
                        this.materialsHarvested.add(Material.plants);
                        this.materialsHarvested.add(Material.leaves);
                        this.materialsHarvested.add(Material.vine);
                        this.materialsHarvested.add(Material.cactus);
                        this.materialsHarvested.add(Material.gourd);
                    }
                } else if (split[0].equals("CargoSlots")) {
                    this.numCargoSlots = Integer.parseInt(split[1]);
                } else if (split[0].equals("BombSlots") || split[0].equals("MineSlots")) {
                    this.numBombSlots = Integer.parseInt(split[1]);
                } else if (split[0].equals("MissileSlots") || split[0].equals("ShellSlots")) {
                    this.numMissileSlots = Integer.parseInt(split[1]);
                } else if (split[0].equals("FuelTankSize")) {
                    this.fuelTankSize = Integer.parseInt(split[1]);
                } else if (split[0].equals("BulletDetection")) {
                    this.bulletDetectionRadius = Integer.parseInt(split[1]);
                } else if (split[0].equals("AddAmmo")) {
                    this.ammo.add(BulletType.getBullet(split[1]));
                } else if (split[0].equals("AllowAllAmmo") || split[0].equals("AcceptAllAmmo")) {
                    this.acceptAllAmmo = Boolean.parseBoolean(split[1]);
                } else if (split[0].equals("Primary")) {
                    this.primary = EnumWeaponType.valueOf(split[1].toUpperCase());
                } else if (split[0].equals("Secondary")) {
                    this.secondary = EnumWeaponType.valueOf(split[1].toUpperCase());
                } else if (split[0].equals("ShootDelayPrimary")) {
                    this.shootDelayPrimary = Integer.parseInt(split[1]);
                } else if (split[0].equals("ShootDelaySecondary")) {
                    this.shootDelaySecondary = Integer.parseInt(split[1]);
                } else if (split[0].equals("PlaceTimePrimary")) {
                    this.placeTimePrimary = Integer.parseInt(split[1]);
                } else if (split[0].equals("PlaceTimeSecondary")) {
                    this.placeTimeSecondary = Integer.parseInt(split[1]);
                } else if (split[0].equals("ReloadTimePrimary")) {
                    this.reloadTimePrimary = Integer.parseInt(split[1]);
                } else if (split[0].equals("ReloadTimeSecondary")) {
                    this.reloadTimeSecondary = Integer.parseInt(split[1]);
                } else if (split[0].equals("AlternatePrimary")) {
                    this.alternatePrimary = Boolean.parseBoolean(split[1]);
                } else if (split[0].equals("AlternateSecondary")) {
                    this.alternateSecondary = Boolean.parseBoolean(split[1]);
                } else if (split[0].equals("ModePrimary")) {
                    this.modePrimary = EnumFireMode.valueOf(split[1].toUpperCase());
                } else if (split[0].equals("ModeSecondary")) {
                    this.modeSecondary = EnumFireMode.valueOf(split[1].toUpperCase());
                } else if (split[0].equals("BulletSpeed")) {
                    this.bulletSpeed = Float.parseFloat(split[1]);
                } else if (split[0].equals("BulletSpread")) {
                    this.bulletSpread = Float.parseFloat(split[1]);
                } else if (split[0].equals("ShootPointPrimary")) {
                    DriveablePosition shootPoint = this.getShootPoint(split);
                    this.shootPointsPrimary.add(shootPoint);
                    if (shootPoint instanceof PilotGun) {
                        this.pilotGuns.add((PilotGun)shootPoint);
                    }
                } else if (split[0].equals("ShootPointSecondary")) {
                    DriveablePosition shootPoint = this.getShootPoint(split);
                    this.shootPointsSecondary.add(shootPoint);
                    if (shootPoint instanceof PilotGun) {
                        this.pilotGuns.add((PilotGun)shootPoint);
                    }
                } else if (split[0].equals("EnableReloadTime")) {
                    this.enableReloadTime = Boolean.parseBoolean(split[1]);
                } else if (split[0].equals("ShootParticlesPrimary")) {
                    this.shootParticlesPrimary.add(new ShootParticle(split[1], Float.valueOf(split[2]).floatValue(), Float.valueOf(split[3]).floatValue(), Float.valueOf(split[4]).floatValue()));
                } else if (split[0].equals("ShootParticlesSecondary")) {
                    this.shootParticlesSecondary.add(new ShootParticle(split[1], Float.valueOf(split[2]).floatValue(), Float.valueOf(split[3]).floatValue(), Float.valueOf(split[4]).floatValue()));
                } else if (split[0].equals("AddGun")) {
                    this.secondary = EnumWeaponType.GUN;
                    PilotGun pilotGun = (PilotGun)this.getShootPoint(split);
                    this.shootPointsSecondary.add(pilotGun);
                    this.pilotGuns.add(pilotGun);
                    this.recipe.add(new ItemStack(pilotGun.type.item));
                } else if (split[0].equals("BombPosition")) {
                    this.primary = EnumWeaponType.BOMB;
                    this.shootPointsPrimary.add(new DriveablePosition(new Vector3f(Float.parseFloat(split[1]) / 16.0f, Float.parseFloat(split[2]) / 16.0f, Float.parseFloat(split[3]) / 16.0f), EnumDriveablePart.core));
                } else if (split[0].equals("BarrelPosition")) {
                    this.primary = EnumWeaponType.SHELL;
                    this.shootPointsPrimary.add(new DriveablePosition(new Vector3f(Float.parseFloat(split[1]) / 16.0f, Float.parseFloat(split[2]) / 16.0f, Float.parseFloat(split[3]) / 16.0f), EnumDriveablePart.turret));
                } else if (split[0].equals("ShootDelay")) {
                    this.shootDelaySecondary = Integer.parseInt(split[1]);
                } else if (split[0].equals("ShellDelay") || split[0].equals("BombDelay")) {
                    this.shootDelayPrimary = Integer.parseInt(split[1]);
                } else if (split[0].equals("AddRecipeParts")) {
                    EnumDriveablePart part = EnumDriveablePart.getPart(split[1]);
                    ItemStack[] stacks = new ItemStack[(split.length - 2) / 2];
                    for (int i = 0; i < (split.length - 2) / 2; ++i) {
                        int amount = Integer.parseInt(split[2 * i + 2]);
                        boolean damaged = split[2 * i + 3].contains(".");
                        String itemName = damaged ? split[2 * i + 3].split("\\.")[0] : split[2 * i + 3];
                        int damage = damaged ? Integer.parseInt(split[2 * i + 3].split("\\.")[1]) : 0;
                        stacks[i] = DriveableType.getRecipeElement(itemName, amount, damage, this.shortName);
                        this.recipe.add(stacks[i]);
                    }
                    this.partwiseRecipe.put(part, stacks);
                } else if (split[0].equals("AddDye")) {
                    int amount = Integer.parseInt(split[1]);
                    int damage = -1;
                    for (int i = 0; i < ItemDye.field_150923_a.length; ++i) {
                        if (!ItemDye.field_150923_a[i].equals(split[2])) continue;
                        damage = i;
                    }
                    if (damage == -1) {
                        FlansMod.log("Failed to find dye colour : " + split[2] + " while adding " + file.name);
                        return;
                    }
                    this.recipe.add(new ItemStack(Items.dye, amount, damage));
                } else if (split[0].equals("SetupPart")) {
                    EnumDriveablePart part = EnumDriveablePart.getPart(split[1]);
                    CollisionBox box = new CollisionBox(Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), Integer.parseInt(split[5]), Integer.parseInt(split[6]), Integer.parseInt(split[7]), Integer.parseInt(split[8]));
                    this.health.put(part, box);
                } else if (split[0].equals("Driver") || split[0].equals("Pilot")) {
                    this.seats[0] = split.length > 4 ? new Seat(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]), Float.parseFloat(split[4]), Float.parseFloat(split[5]), Float.parseFloat(split[6]), Float.parseFloat(split[7])) : new Seat(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]));
                } else if (split[0].equals("RotatedDriverOffset")) {
                    this.seats[0].rotatedOffset = new Vector3f((float)Integer.parseInt(split[1]) / 16.0f, (float)Integer.parseInt(split[2]) / 16.0f, (float)Integer.parseInt(split[3]) / 16.0f);
                } else if (split[0].equals("RotatedPassengerOffset")) {
                    this.seats[Integer.parseInt((String)split[1])].rotatedOffset = new Vector3f((float)Integer.parseInt(split[2]) / 16.0f, (float)Integer.parseInt(split[3]) / 16.0f, (float)Integer.parseInt(split[4]) / 16.0f);
                } else if (split[0].equals("Passenger")) {
                    Seat seat = null;
                    this.seats[seat.id] = seat = new Seat(split);
                    if (seat.gunType != null) {
                        seat.gunnerID = this.numPassengerGunners++;
                        this.recipe.add(new ItemStack(seat.gunType.item));
                    }
                } else if (split[0].equals("GunOrigin")) {
                    this.seats[Integer.parseInt((String)split[1])].gunOrigin = new Vector3f(Float.parseFloat(split[2]) / 16.0f, Float.parseFloat(split[3]) / 16.0f, Float.parseFloat(split[4]) / 16.0f);
                } else if (split[0].equals("YOffset")) {
                    this.yOffset = Float.parseFloat(split[1]);
                } else if (split[0].equals("CameraDistance")) {
                    this.cameraDistance = Float.parseFloat(split[1]);
                } else if (split[0].equals("StartSoundRange")) {
                    this.startSoundRange = Integer.parseInt(split[1]);
                } else if (split[0].equals("StartSoundLength")) {
                    this.startSoundLength = Integer.parseInt(split[1]);
                } else if (split[0].equals("EngineSoundRange")) {
                    this.engineSoundRange = Integer.parseInt(split[1]);
                } else if (split[0].equals("EngineSoundLength")) {
                    this.engineSoundLength = Integer.parseInt(split[1]);
                } else if (split[0].equals("BackSoundRange")) {
                    this.backSoundRange = Integer.parseInt(split[1]);
                } else if (split[0].equals("BackSoundLength")) {
                    this.backSoundLength = Integer.parseInt(split[1]);
                } else if (split[0].equals("SoundTime")) {
                    this.soundTime = Integer.parseInt(split[1]);
                } else if (split[0].equals("StartSound")) {
                    this.startSound = split[1];
                    FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
                } else if (split[0].equals("EngineSound")) {
                    this.engineSound = split[1];
                    FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
                } else if (split[0].equals("BackSound")) {
                    this.backSound = split[1];
                    FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
                } else if (split[0].equals("ShootMainSound") || split[0].equals("ShootSoundPrimary") || split[0].equals("ShellSound") || split[0].equals("BombSound")) {
                    this.shootSoundPrimary = split[1];
                    FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
                } else if (split[0].equals("ShootSecondarySound") || split[0].equals("ShootSoundSecondary")) {
                    this.shootSoundSecondary = split[1];
                    FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
                } else if (split[0].equals("PlaceSoundPrimary")) {
                    this.placeSoundPrimary = split[1];
                    FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
                } else if (split[0].equals("PlaceSoundSecondary")) {
                    this.placeSoundSecondary = split[1];
                    FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
                } else if (split[0].equals("ReloadSoundPrimary")) {
                    this.reloadSoundPrimary = split[1];
                    FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
                } else if (split[0].equals("ReloadSoundSecondary")) {
                    this.reloadSoundSecondary = split[1];
                    FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
                } else if (split[0].equals("LockedOnSound")) {
                    this.lockedOnSound = split[1];
                    FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
                } else if (split[0].equals("LockOnSound")) {
                    this.lockOnSound = split[1];
                    FlansMod.proxy.loadSound(this.contentPack, "guns", split[1]);
                } else if (split[0].equals("LockingOnSound")) {
                    this.lockingOnSound = split[1];
                    FlansMod.proxy.loadSound(this.contentPack, "guns", split[1]);
                } else if (split[0].equals("OnRadar")) {
                    this.onRadar = split[1].equals("True");
                }
            }
            catch (Exception e) {
                if (split != null) {
                    String msg = " : ";
                    for (String s : split) {
                        msg = msg + " " + s;
                    }
                    FlansMod.log("Errored reading " + file.name + "");
                } else {
                    FlansMod.log("Errored reading " + file.name);
                }
                if (!FlansMod.printStackTrace) break block211;
                e.printStackTrace();
            }
        }
    }

    private DriveablePosition getShootPoint(String[] split) {
        if (split.length == 6) {
            return new PilotGun(split);
        }
        if (split.length == 5) {
            return new DriveablePosition(split);
        }
        return new DriveablePosition(new Vector3f(), EnumDriveablePart.core);
    }

    public ArrayList<DriveablePosition> shootPoints(boolean s) {
        return s ? this.shootPointsSecondary : this.shootPointsPrimary;
    }

    public boolean alternate(boolean s) {
        return s ? this.alternateSecondary : this.alternatePrimary;
    }

    public EnumWeaponType weaponType(boolean s) {
        return s ? this.secondary : this.primary;
    }

    public int shootDelay(boolean s) {
        return s ? this.shootDelaySecondary : this.shootDelayPrimary;
    }

    public String shootSound(boolean s) {
        return s ? this.shootSoundSecondary : this.shootSoundPrimary;
    }

    public ArrayList<ShootParticle> shootParticle(boolean s) {
        return s ? this.shootParticlesSecondary : this.shootParticlesPrimary;
    }

    public int numEngines() {
        return 1;
    }

    public int ammoSlots() {
        return this.numPassengerGunners + this.pilotGuns.size();
    }

    public boolean isValidAmmo(BulletType bulletType, EnumWeaponType weaponType) {
        return (this.acceptAllAmmo || this.ammo.contains(bulletType)) && bulletType.weaponType == weaponType;
    }

    public ArrayList<ItemStack> getItemsRequired(DriveablePart part, PartType engine) {
        ArrayList<ItemStack> stacks = new ArrayList<ItemStack>();
        if (this.partwiseRecipe.get((Object)part.type) != null) {
            for (ItemStack stack : this.partwiseRecipe.get((Object)part.type)) {
                stacks.add(stack.copy());
            }
        }
        for (PilotGun gun : this.pilotGuns) {
            if (gun.part != part.type) continue;
            stacks.add(new ItemStack(gun.type.item));
        }
        for (Seat seat : this.seats) {
            if (seat == null || seat.part != part.type || seat.gunType == null) continue;
            stacks.add(new ItemStack(seat.gunType.item));
        }
        return stacks;
    }

    public static DriveableType getDriveable(String find) {
        for (DriveableType type : types) {
            if (!type.shortName.equals(find)) continue;
            return type;
        }
        return null;
    }

    public class ShootParticle {
        float x;
        float y;
        float z;
        String name;

        public ShootParticle(String s, float x1, float y1, float z1) {
            this.x = 0.0f;
            this.y = 0.0f;
            this.z = 0.0f;
            this.x = x1;
            this.y = y1;
            this.z = z1;
            this.name = s;
        }
    }

}

