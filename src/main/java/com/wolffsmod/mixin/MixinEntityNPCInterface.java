package com.wolffsmod.mixin;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.common.FlansMod;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.ItemPlane;
import com.flansmod.common.driveables.ItemVehicle;
import com.flansmod.common.driveables.ShootPoint;
import com.flansmod.common.guns.AAGunType;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.EntityShootable;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemAAGun;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.guns.ItemGrenade;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.ItemShootable;
import com.flansmod.common.guns.ShootableType;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.vector.Vector3f;
import com.wolffsmod.customnpc.IMixinDataDisplay;
import com.wolffsmod.customnpc.IMixinDataAI;
import com.wolffsmod.customnpc.IMixinEntityNPCInterface;
import com.wolffsmod.customnpc.NPCInterfaceUtil;
import com.wolffsmod.customnpc.VehicleMobilityProfile;
import com.wolffsmod.customnpc.GroundVehicleController;
import com.wolffsmod.customnpc.AircraftFlightController;
import com.wolffsmod.customnpc.SubmarineController;
import com.wolffsmod.entity.EntityFlanAAGunNPC;
import com.wolffsmod.entity.EntityFlanDriveableNPC;
import com.wolffsmod.entity.Seat;
import com.wolffsmod.flansmod.EntityNPCFlanBullet;
import com.wolffsmod.flansmod.FlanUtils;
import com.wolffsmod.customnpc.IMixinDataInventory;
import com.wolffsmod.network.EnumAnimPacket;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import noppes.npcs.CustomNpcs;
import noppes.npcs.DataAdvanced;
import noppes.npcs.DataAI;
import noppes.npcs.DataAbilities;
import noppes.npcs.DataDisplay;
import noppes.npcs.DataInventory;
import noppes.npcs.DataStats;
import noppes.npcs.EventHooks;
import noppes.npcs.NpcDamageSource;
import noppes.npcs.api.entity.ICustomNpc;
import noppes.npcs.constants.EnumPotionType;
import noppes.npcs.constants.EnumRoleType;
import noppes.npcs.controllers.data.Faction;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.entity.EntityProjectile;
import noppes.npcs.roles.RoleCompanion;
import noppes.npcs.roles.RoleInterface;
import noppes.npcs.scripted.event.NpcEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.block.Block;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.NPCEntityHelper;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.item.EntityExpBottle;
import net.minecraft.entity.item.EntityFireworkRocket;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.Item;
import net.minecraft.item.ItemEgg;
import net.minecraft.item.ItemExpBottle;
import net.minecraft.item.ItemFirework;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Mixin(value = EntityNPCInterface.class)
public abstract class MixinEntityNPCInterface extends EntityCreature implements IMixinEntityNPCInterface, IEntityAdditionalSpawnData, ICommandSender, IRangedAttackMob, IBossDisplayData
{
    @Unique
    protected Seat driver = new Seat();
    @Unique
    protected Map<Integer, Seat> passengers = new HashMap<>();
    @Unique
    protected boolean lastBurst = false;
    @Unique
    protected int soundPosition;

    @Shadow(remap = false)
    public ICustomNpc wrappedNPC;
    @Shadow(remap = false)
    public DataDisplay display;
    @Shadow(remap = false)
    public DataStats stats;
    @Shadow(remap = false)
    public DataInventory inventory;
    @Shadow(remap = false)
    public DataAdvanced advanced;
    @Shadow(remap = false)
    public RoleInterface roleInterface;
    @Shadow(remap = false)
    public Faction faction;
    @Shadow(remap = false)
    public DataAbilities abilities;
    @Shadow(remap = false)
    public DataAI ais;

    @Shadow(remap = false)
    public abstract boolean isRemote();
    @Shadow(remap = false)
    public abstract void reset();
    @Shadow(remap = false)
    public abstract void updateTasks();
    @Shadow(remap = false)
    public abstract EntityLivingBase getOwner();
    @Shadow(remap = false)
    public abstract ItemStack getOffHand();
    @Shadow(remap = false)
    public abstract boolean isKilled();
    @Shadow(remap = false)
    public abstract boolean isAttacking();
    @Shadow(remap = false)
    public abstract EntityProjectile shoot(EntityLivingBase entity, int accuracy, ItemStack proj, boolean indirect);
    protected MixinEntityNPCInterface(World w)
    {
        super(w);
    }

    @Inject(method = "func_70071_h_", at = @At(value = "TAIL"), remap = false)
    private void updateSoundPosition(CallbackInfo callbackInfo)
    {
        if (soundPosition > 0)
            soundPosition--;
    }

    /**
     * @author Wolff
     * @reason step sound from Flan's driveables
     */
    @Override
    @Overwrite(remap = false)
    protected void func_145780_a(int par1, int par2, int par3, Block block)
    {
        if (((IMixinDataInventory)inventory).getUseDriveableStats())
        {
            Optional<DriveableType> driveableType = getHeldDriveable();
            if (driveableType.isPresent() && driveableType.get().engineSound != null && !driveableType.get().engineSound.isEmpty())
            {
                if (soundPosition == 0)
                {
                    PacketPlaySound.sendSoundPacket(posX, posY, posZ, driveableType.get().engineSoundRange, dimension, driveableType.get().engineSound, false);
                    soundPosition = driveableType.get().startSoundLength;
                }
                return;
            }
        }

        if (!this.advanced.stepSound.equals(""))
        {
            this.playSound(this.advanced.stepSound, 0.15F, 1.0F);
        }
        else
        {
            super.func_145780_a(par1, par2, par3, block);
        }

    }

    /**
     * @author Wolff
     * @reason added Flan's Melee animations
     */
    @Override
    @Overwrite
    public boolean attackEntityAsMob(Entity par1Entity)
    {
        if (!AircraftFlightController.canAttack((EntityNPCInterface)(Object)this))
            return false;
        float f = stats.getAttackStrength();

        if (stats.attackSpeed < 10){
            par1Entity.hurtResistantTime = 0;
        }
        if(par1Entity instanceof EntityLivingBase && !isRemote()){
            NpcEvent.MeleeAttackEvent event = new NpcEvent.MeleeAttackEvent(wrappedNPC, f, (EntityLivingBase)par1Entity);
            if(EventHooks.onNPCMeleeAttack((EntityNPCInterface)(Object)this, event))
                return false;
            f = event.getDamage();
        }

        boolean var4 = par1Entity.attackEntityFrom(new NpcDamageSource("mob", this), f);

        if (((IMixinDataDisplay)display).getHasFlanMeleeAnimation())
            NPCInterfaceUtil.sendPacketWhenInRenderingRange(this, EnumAnimPacket.FLAN_MELEE);

        if (var4){
            if(getOwner() instanceof EntityPlayer && par1Entity instanceof EntityLivingBase)
                NPCEntityHelper.setRecentlyHit((EntityLivingBase)par1Entity);
            if (stats.knockback > 0){
                par1Entity.addVelocity((-MathHelper.sin(rotationYaw * (float)Math.PI / 180.0F) * stats.knockback * 0.5F), 0.1D, (MathHelper.cos(rotationYaw * (float)Math.PI / 180.0F) * stats.knockback * 0.5F));
                motionX *= 0.6D;
                motionZ *= 0.6D;
            }
            if(advanced.role == EnumRoleType.Companion){
                ((RoleCompanion)roleInterface).attackedEntity(par1Entity);
            }
        }

        if (stats.potionType == EnumPotionType.Fire){
            par1Entity.setFire(stats.potionDuration);
        }
        else if (stats.potionType != EnumPotionType.None && par1Entity instanceof EntityLivingBase){
            int potionId = stats.potionType.getResolvedPotionId(stats.potionManualId);
            if (EnumPotionType.isValidPotionId(potionId))
                ((EntityLivingBase)par1Entity).addPotionEffect(new PotionEffect(potionId, stats.potionDuration * 20, stats.potionAmp));
        }
        return var4;
    }

    /**
     * @author Wolff
     * @reason Flan damage multipliers vs planes/vehicles apply to NPC planes/vehicles
     */
    @Override
    @Overwrite
    public boolean attackEntityFrom(DamageSource damagesource, float i)
    {
        if (this.worldObj.isRemote || CustomNpcs.FreezeNPCs || (damagesource.damageType != null && damagesource.damageType.equals("inWall"))){
            return false;
        }
        if(damagesource.damageType != null && damagesource.damageType.equals("outOfWorld") && isKilled()){
            reset();
        }

        if (isFlanDriveable())
        {
            Entity sourceOfDamage = damagesource.getSourceOfDamage();
            if (sourceOfDamage instanceof EntityShootable)
            {
                ShootableType type = FlanUtils.getType((EntityShootable)sourceOfDamage);
                float baseDamage = i / type.damageVsLiving;
                i = isFlanPlane() ? baseDamage * type.damageVsPlanes : baseDamage * type.damageVsVehicles;
            }
        }

        i = stats.resistances.applyResistance(damagesource, i);
        if(this.hurtResistantTime > this.maxHurtResistantTime / 2.0F && i <= this.lastDamage)
            return false;

        Entity entity = damagesource.getEntity();

        EntityLivingBase attackingEntity = null;

        if (entity instanceof EntityLivingBase)
            attackingEntity = (EntityLivingBase) entity;

        if ((entity instanceof EntityArrow) && ((EntityArrow) entity).shootingEntity instanceof EntityLivingBase)
            attackingEntity = (EntityLivingBase) ((EntityArrow) entity).shootingEntity;
        else if ((entity instanceof EntityThrowable))
            attackingEntity = ((EntityThrowable) entity).getThrower();

        if(attackingEntity != null && attackingEntity == getOwner())
            return false;
        else if (attackingEntity instanceof EntityNPCInterface)
        {
            EntityNPCInterface npc = (EntityNPCInterface) attackingEntity;
            if(npc.faction.id == faction.id)
                return false;
            if(npc.getOwner() instanceof EntityPlayer)
                this.recentlyHit = 100;
        }
        else if (attackingEntity instanceof EntityPlayer && faction.isFriendlyToPlayer((EntityPlayer) attackingEntity))
            return false;
        NpcEvent.DamagedEvent event = new NpcEvent.DamagedEvent(this.wrappedNPC, attackingEntity, i, damagesource);
        if(EventHooks.onNPCDamaged((EntityNPCInterface)(Object)this, event) || isKilled())
            return false;
        i = event.getDamage();

        if(isKilled())
            return false;

        if(attackingEntity == null)
            return super.attackEntityFrom(damagesource, i);

        try
        {
            if (isAttacking())
            {
                if(getAttackTarget() != null && this.getDistanceSqToEntity(getAttackTarget()) > this.getDistanceSqToEntity(attackingEntity)){
                    setAttackTarget(attackingEntity);
                }
                return super.attackEntityFrom(damagesource, i);
            }

            if (i > 0)
            {
                List<EntityNPCInterface> inRange = worldObj.getEntitiesWithinAABB(EntityNPCInterface.class, this.boundingBox.expand(32D, 16D, 32D));
                for (EntityNPCInterface npc : inRange) {
                    if (npc.isKilled() || !npc.advanced.defendFaction || npc.faction.id != faction.id)
                        continue;

                    if (npc.canSee(this) || npc.ais.directLOS || npc.canSee(attackingEntity))
                        npc.onAttack(attackingEntity);
                }
                setAttackTarget(attackingEntity);
            }
            return super.attackEntityFrom(damagesource, i);
        }
        finally
        {
            if(event.getClearTarget())
            {
                setAttackTarget(null);
                setRevengeTarget(null);
            }
        }
    }

    /**
     * @author Wolff
     * @reason shoot Flan bullet and use Flan stats
     */
    @Overwrite
    public void attackEntityWithRangedAttack(EntityLivingBase entity, float f)
    {
        if (!AircraftFlightController.canAttack((EntityNPCInterface)(Object)this))
            return;
        ItemStack proj = inventory.getProjectile();
        if(proj == null)
        {
            updateTasks();
            return;
        }
        if (!isRemote())
        {
            NpcEvent.RangedLaunchedEvent event = new NpcEvent.RangedLaunchedEvent(wrappedNPC,stats.pDamage,entity);
            if (EventHooks.onNPCRangedAttack((EntityNPCInterface)(Object)this, event))
                return;

            List<ItemStack> guns = getGuns();
            ItemStack shotFrom = guns.isEmpty() ? null : guns.get(0);
            for (int i = 0; i < stats.shotCount; i++)
                shootProjectile(entity, event, shotFrom, proj, f);

            playSound(stats.fireSound, 2.0F, 1.0f);

            if (((IMixinDataDisplay)display).getHasFlanShootAnimation())
                NPCInterfaceUtil.sendPacketWhenInRenderingRange(this, EnumAnimPacket.FLAN_SHOOT);
        }
    }

    protected void shootProjectile(EntityLivingBase entity, NpcEvent.RangedLaunchedEvent event, ItemStack gunItemStack, ItemStack projectileItemStack, float f)
    {
        Item projectileItem = projectileItemStack.getItem();
        if (projectileItem instanceof ItemShootable)
        {
            shootFlanProjectile(gunItemStack, projectileItemStack, entity);
        }
        else if (projectileItem instanceof ItemPotion)
        {
            shootThrowable(new EntityPotion(worldObj, this, projectileItemStack), entity, f == 1);
        }
        else if (projectileItem instanceof ItemExpBottle)
        {
            shootThrowable(new EntityExpBottle(worldObj, this), entity, f == 1);
        }
        else if (projectileItem instanceof ItemEgg)
        {
            shootThrowable(new EntityEgg(worldObj, this), entity, f == 1);
        }
        else if (projectileItem instanceof ItemFirework)
        {
            worldObj.spawnEntityInWorld(new EntityFireworkRocket(worldObj, posX, posY, posZ, projectileItemStack));
        }
        else
        {
            EntityProjectile projectile = shoot(entity, stats.accuracy, projectileItemStack, f == 1);
            projectile.damage = event.getDamage();
        }
    }

    protected void shootThrowable(EntityThrowable throwable, EntityLivingBase entity, boolean indirect)
    {
        double varX = entity.posX - this.posX;
        double varY = entity.boundingBox.minY + (entity.height / 2.0F) - (this.posY + this.getEyeHeight());
        double varZ = entity.posZ - this.posZ;
        float varF = stats.pPhysics ? MathHelper.sqrt_double(varX * varX + varZ * varZ) : 0.0F;
        float angle = NPCInterfaceUtil.getAngleForXYZ(stats.pSpeed, varY, varF, indirect);
        float acc = 20.0F - MathHelper.floor_float(stats.accuracy / 5.0F);
        NPCInterfaceUtil.setThrowableHeading(throwable, stats.pSpeed, stats.pPhysics, varX, varY, varZ, angle, acc);
        worldObj.spawnEntityInWorld(throwable);
    }

    protected Optional<DriveableType> getHeldDriveable()
    {
        ItemStack item = getHeldItem();
        if (item != null)
        {
            if (item.getItem() instanceof ItemVehicle)
                return Optional.of(((ItemVehicle)item.getItem()).type);
            else if (item.getItem() instanceof ItemPlane)
                return Optional.of(((ItemPlane)item.getItem()).type);
        }
        return Optional.empty();
    }

    protected Optional<AAGunType> getHeldAAGun()
    {
        ItemStack item = getHeldItem();
        if (item != null && item.getItem() instanceof ItemAAGun)
        {
            return Optional.of(((ItemAAGun)item.getItem()).type);
        }
        return Optional.empty();
    }

    protected void shootFlanProjectile(ItemStack itemStackGun, ItemStack itemStackShootable, EntityLivingBase target)
    {
        boolean shotgun;
        float spread;
        float damage;
        float speed;
        float yaw = rotationYawHead;
        float pitch = rotationPitch;
        Vec3 origin = Vec3.createVectorHelper(posX, posY + getEyeHeight(), posZ);

        damage = stats.pDamage;
        speed = Math.max(stats.pSpeed, 0.01F);
        spread = NPCInterfaceUtil.accuracyToBulletSpread(stats.accuracy);
        shotgun = (stats.shotCount > 1);

        Optional<EntityFlanDriveableNPC> optionalDriveable = getFlanDriveableEntity();

        if (optionalDriveable.isPresent())
        {
            optionalDriveable.get().syncRotationWithClient();
            yaw = driver.getGlobalYaw(renderYawOffset);
            pitch = driver.getPitch();
        }

        if (optionalDriveable.isPresent() && (!optionalDriveable.get().shootPointsPrimary.isEmpty()))
        {
            EntityFlanDriveableNPC driveable = optionalDriveable.get();
            float driverYaw = driveable.driver.getLocalYaw();

            for (ShootPoint shootPoint: driveable.shootPointsPrimary)
            {
                Vector3f gunVector = NPCInterfaceUtil.getFiringPosition(shootPoint, driveable.turretOrigin, driverYaw, pitch, renderYawOffset);

                if (display.modelSize != 5)
                {
                    float modelScale = display.modelSize / 5F;
                    gunVector.x *= modelScale;
                    gunVector.y *= modelScale;
                    gunVector.z *= modelScale;
                }

                origin = (Vector3f.add(new Vector3f(posX, posY + driveable.yDriveableOffset * (display.modelSize / 5F), posZ), gunVector, null)).toVec3();
                NPCInterfaceUtil.spawnParticle(driveable.shootParticlesPrimary, shootPoint, gunVector, driverYaw, pitch, renderYawOffset, posX, posY + driveable.yDriveableOffset, posZ, dimension, display.modelSize / 5F);
                spawnFlanShootable((ItemShootable)itemStackShootable.getItem(), com.wolffsmod.customnpc.TransparentBlockLos.projectileOrigin((EntityNPCInterface)(Object)this, target, origin), yaw, pitch, spread, damage, speed, shotgun);
            }
        }
        else
        {
            if (optionalDriveable.isPresent() && optionalDriveable.get() instanceof EntityFlanAAGunNPC)
            {
                EntityFlanAAGunNPC aaGun = (EntityFlanAAGunNPC)optionalDriveable.get();
                for (int currentBarrel=0; currentBarrel<aaGun.numBarrels; currentBarrel++)
                {
                    RotatedAxes axes = new RotatedAxes(yaw, pitch, 0F);
                    axes.rotateLocalYaw(90F);
                    Vec3 barrel = axes.findLocalVectorGlobally(new Vector3f(aaGun.barrelX[currentBarrel] / 16D, aaGun.barrelY[currentBarrel] / 16D, aaGun.barrelZ[currentBarrel] / 16D)).toVec3();
                    origin = barrel.addVector(posX, posY, posZ);
                    spawnFlanShootable((ItemShootable)itemStackShootable.getItem(), com.wolffsmod.customnpc.TransparentBlockLos.projectileOrigin((EntityNPCInterface)(Object)this, target, origin), yaw, pitch, spread, damage, speed, shotgun);
                }
            }
            else
            {
                spawnFlanShootable((ItemShootable)itemStackShootable.getItem(), com.wolffsmod.customnpc.TransparentBlockLos.projectileOrigin((EntityNPCInterface)(Object)this, target, origin), yaw, pitch, spread, damage, speed, shotgun);
            }
        }
    }

    protected void spawnFlanShootable(ItemShootable item, Vec3 origin, float yaw, float pitch, float spread, float damage, float speed, boolean shotgun)
    {
        EntityShootable shot = null;

        if (item instanceof ItemGrenade)
        {
            shot = ((ItemGrenade) item).getGrenade(worldObj, this);
        }
        else if (item instanceof ItemBullet)
        {
            shot = new EntityNPCFlanBullet(
                    worldObj,
                    origin,
                    yaw,
                    pitch,
                    this,
                    spread,
                    damage,
                    ((ItemBullet)item).type,
                    speed,
                    item.type);

            ((EntityBullet) shot).shotgun = shotgun;
        }

        if (shot != null)
            worldObj.spawnEntityInWorld(shot);
    }

    @Override
    public boolean isFlanDriveable()
    {
        return false;
    }

    @Override
    public Optional<EntityFlanDriveableNPC> getFlanDriveableEntity()
    {
        return Optional.empty();
    }

    @Override
    public boolean isFlanPlane()
    {
        return false;
    }

    @Override
    public void animateFlanGunMelee()
    {
        if (!((IMixinDataDisplay)display).getHasFlanMeleeAnimation())
            return;

        ItemStack heldItem = getHeldItem();
        ItemStack offHandItem = getOffHand();
        if (heldItem != null && heldItem.getItem() instanceof ItemGun)
        {
            GunAnimations animations = FlansModClient.getGunAnimations(this, false);

            animations.doMelee(stats.attackSpeed);
        }
        if (offHandItem != null && offHandItem.getItem() instanceof ItemGun)
        {
            GunAnimations animations = FlansModClient.getGunAnimations(this, true);

            animations.doMelee(stats.attackSpeed);
        }
    }

    @Override
    public void animateFlanGunReload()
    {
        if (!((IMixinDataDisplay)display).getHasFlanReloadAnimation())
            return;

        ItemStack heldItem = getHeldItem();
        ItemStack offHandItem = getOffHand();
        if (heldItem != null && heldItem.getItem() instanceof ItemGun)
        {
            GunType gunType = ((ItemGun)heldItem.getItem()).type;
            GunAnimations animations = FlansModClient.getGunAnimations(this, false);

            int pumpDelay = gunType.model == null ? 0 : gunType.model.pumpDelayAfterReload;
            int pumpTime = gunType.model == null ? 1 : gunType.model.pumpTime;
            int chargeDelay = gunType.model == null ? 0 : gunType.model.chargeDelayAfterReload;
            int chargeTime = gunType.model == null ? 1 : gunType.model.chargeTime;

            FlanUtils.doReloadAnimation(animations, stats.minDelay, pumpDelay, pumpTime, chargeDelay, chargeTime, 1, false);
        }
        if (offHandItem != null && offHandItem.getItem() instanceof ItemGun)
        {
            GunType gunType = ((ItemGun)offHandItem.getItem()).type;
            GunAnimations animations = FlansModClient.getGunAnimations(this, true);

            int pumpDelay = gunType.model == null ? 0 : gunType.model.pumpDelayAfterReload;
            int pumpTime = gunType.model == null ? 1 : gunType.model.pumpTime;
            int chargeDelay = gunType.model == null ? 0 : gunType.model.chargeDelayAfterReload;
            int chargeTime = gunType.model == null ? 1 : gunType.model.chargeTime;

            FlanUtils.doReloadAnimation(animations, stats.minDelay, pumpDelay, pumpTime, chargeDelay, chargeTime, 1, false);
        }
    }

    @Override
    public void animateFlanGunShoot()
    {
        if (!((IMixinDataDisplay)display).getHasFlanShootAnimation())
            return;

        ItemStack heldItem = getHeldItem();
        ItemStack offHandItem = getOffHand();
        if (heldItem != null && heldItem.getItem() instanceof ItemGun)
        {
            GunType gunType = ((ItemGun)heldItem.getItem()).type;
            GunAnimations animations = FlansModClient.getGunAnimations(this, false);

            int pumpDelay = gunType.model == null ? 0 : gunType.model.pumpDelay;
            int pumpTime = gunType.model == null ? 1 : gunType.model.pumpTime;
            int hammerDelay = gunType.model == null ? 0 : gunType.model.hammerDelay;
            int casingDelay = gunType.model == null ? 0 : gunType.model.casingDelay;
            float hammerAngle = gunType.model == null ? 0 : gunType.model.hammerAngle;
            float althammerAngle = gunType.model == null ? 0 : gunType.model.althammerAngle;

            FlanUtils.doShootAnimation(animations, pumpDelay, pumpTime, hammerDelay,
                    hammerAngle, althammerAngle, casingDelay);
        }
        if (offHandItem != null && offHandItem.getItem() instanceof ItemGun)
        {
            GunType gunType = ((ItemGun)offHandItem.getItem()).type;
            GunAnimations animations = FlansModClient.getGunAnimations(this, true);

            int pumpDelay = gunType.model == null ? 0 : gunType.model.pumpDelay;
            int pumpTime = gunType.model == null ? 1 : gunType.model.pumpTime;
            int hammerDelay = gunType.model == null ? 0 : gunType.model.hammerDelay;
            int casingDelay = gunType.model == null ? 0 : gunType.model.casingDelay;
            float hammerAngle = gunType.model == null ? 0 : gunType.model.hammerAngle;
            float althammerAngle = gunType.model == null ? 0 : gunType.model.althammerAngle;

            FlanUtils.doShootAnimation(animations, pumpDelay, pumpTime, hammerDelay,
                    hammerAngle, althammerAngle, casingDelay);
        }
    }

    @Override
    public List<ItemStack> getGuns()
    {
        ArrayList<ItemStack> guns = new ArrayList<>();
        ItemStack mainHand = getHeldItem();
        ItemStack offHand = getOffHand();

        if(mainHand != null && mainHand.getItem() instanceof ItemGun && (NPCInterfaceUtil.isGunRangedWeapon((ItemGun) mainHand.getItem())))
        {
            guns.add(mainHand);
        }
        if(offHand != null && offHand.getItem() instanceof ItemGun && (NPCInterfaceUtil.isGunRangedWeapon((ItemGun) offHand.getItem())))
        {
            guns.add(offHand);
        }
        return guns;
    }

    @Override
    public void reloadGuns()
    {
        // This method only produces Flan reload feedback; the ranged attack
        // cooldown and firing state are handled by EntityAIRangedAttack. Keep
        // both the reload sound and animation disabled for "Only Shoot" (and
        // "Disabled") instead of suppressing just the animation packet.
        if (!((IMixinDataDisplay)display).getHasFlanReloadAnimation())
            return;

        for(ItemStack gun: getGuns())
            NPCInterfaceUtil.playGunReloadSound(gun, posX, posY, posZ, dimension);
        Optional<DriveableType> driveableType = getHeldDriveable();
        Optional<AAGunType> aaGunType = getHeldAAGun();
        if (((IMixinDataInventory)inventory).getUseDriveableStats())
        {
            String reloadSound = "";
            if (driveableType.isPresent())
                reloadSound = driveableType.get().shootReloadSound;
            if (aaGunType.isPresent())
                reloadSound = aaGunType.get().reloadSound;

            if (reloadSound != null && !reloadSound.isEmpty())
                PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, reloadSound, false);
        }

        NPCInterfaceUtil.sendPacketWhenInRenderingRange(this, EnumAnimPacket.FLAN_RELOAD);
    }

    @Inject(method = "getSpeed", at = @At("RETURN"), cancellable = true, remap = false)
    private void wolffsmod$profileSpeed(CallbackInfoReturnable<Float> ci)
    {
        IMixinDataAI mobility = (IMixinDataAI)ais;
        VehicleMobilityProfile profile = mobility.getVehicleMobilityProfile();
        if (profile == VehicleMobilityProfile.LEGACY)
            return;
        double speed = profile == VehicleMobilityProfile.GROUND && mobility.getGroundDrivingEnabled() ? mobility.getGroundMaxForwardSpeed()
                : profile == VehicleMobilityProfile.WATERCRAFT
                || profile == VehicleMobilityProfile.AMPHIBIOUS && isInWater()
                ? mobility.getVehicleWaterSpeed() : mobility.getVehicleLandSpeed();
        ci.setReturnValue((float)(speed / 20.0D));
    }

    /** Stable server-side controller; it replaces drag loss rather than multiplying motion. */
    @Inject(method = "func_70612_e(FF)V", at = @At("TAIL"), remap = false)
    private void wolffsmod$applyTerrainSpeed(float strafe, float forward, CallbackInfo ci)
    {
        if (worldObj.isRemote || !isInWater() || Math.abs(moveForward) + Math.abs(moveStrafing) < 0.01F)
            return;
        IMixinDataAI mobility = (IMixinDataAI)ais;
        VehicleMobilityProfile profile = mobility.getVehicleMobilityProfile();
        if (profile == VehicleMobilityProfile.LEGACY)
            return;
        double speed = profile == VehicleMobilityProfile.WATERCRAFT
                || profile == VehicleMobilityProfile.AMPHIBIOUS
                ? mobility.getVehicleWaterSpeed() : mobility.getVehicleLandSpeed();
        double target = speed / 20.0D;
        double current = Math.sqrt(motionX * motionX + motionZ * motionZ);
        double directionX;
        double directionZ;
        if (current > 1.0E-5D) {
            directionX = motionX / current;
            directionZ = motionZ / current;
        } else {
            double yaw = Math.toRadians(rotationYaw);
            directionX = -Math.sin(yaw);
            directionZ = Math.cos(yaw);
        }
        double acceleration = Math.max(0.005D, target * 0.15D);
        double next = current < target ? Math.min(target, current + acceleration) : Math.max(target, current - acceleration);
        motionX = directionX * next;
        motionZ = directionZ * next;
    }

    /**
     * Tracked/wheeled hulls slow while their gradual body rotation catches the
     * requested travel direction. This prevents full-speed sideways/reverse
     * pursuit without coupling the turret or head aim to the hull.
     */
    @Inject(method = "func_70612_e(FF)V", at = @At("TAIL"), remap = false)
    private void wolffsmod$limitMisalignedVehicleTravel(float strafe, float forward, CallbackInfo ci)
    {
        if (worldObj.isRemote || !isFlanDriveable() || isFlanPlane())
            return;
        IMixinDataAI groundData = (IMixinDataAI)ais;
        if (groundData.getVehicleMobilityProfile() == VehicleMobilityProfile.GROUND && groundData.getGroundDrivingEnabled())
            return;
        double speedSq = motionX * motionX + motionZ * motionZ;
        if (speedSq < 1.0E-8D)
            return;
        float movementYaw = (float)(Math.atan2(motionZ, motionX) * 180.0D / Math.PI) - 90.0F;
        float error = Math.abs(MathHelper.wrapAngleTo180_float(movementYaw - renderYawOffset));
        if (error <= 20.0F)
            return;
        double forwardAlignment = Math.max(0.0D, Math.cos(Math.toRadians(error)));
        double scale = 0.15D + 0.85D * forwardAlignment;
        motionX *= scale;
        motionZ *= scale;
    }

    /**
     * Collision resolution can make the final displacement differ slightly
     * from the controller's requested motion.  Make the visible hull consume
     * that final travel heading, and never alter it while stopped.  Head/seat
     * rotation remains independent for turrets and weapon aiming.
     */
    @Inject(method = "func_70612_e(FF)V", at = @At("TAIL"), remap = false)
    private void wolffsmod$faceGroundHullAlongActualTravel(float strafe, float forward, CallbackInfo ci)
    {
        if (isFlanPlane() || !isFlanDriveable())
            return;
        IMixinDataAI data = (IMixinDataAI)ais;
        if (data.getVehicleMobilityProfile() != VehicleMobilityProfile.GROUND || !data.getGroundDrivingEnabled())
            return;
        double dx = posX - prevPosX;
        double dz = posZ - prevPosZ;
        if (dx * dx + dz * dz <= 2.500000277905201E-7D)
            return;
        float travelYaw = (float)(Math.atan2(dz, dx) * 180.0D / Math.PI) - 90.0F;
        rotationYaw = travelYaw;
        renderYawOffset = travelYaw;
    }

    /*
     * Run before vanilla applies motion.  At TAIL the entity had already moved
     * using the previous tick's heading, while the model displayed the newly
     * steered heading; that one-tick phase error was very visible on fast cars
     * and tanks as angled/sideways travel.
     */
    @Inject(method = "func_70612_e(FF)V", at = @At("HEAD"), remap = false)
    private void wolffsmod$driveGroundVehicle(float strafe, float forward, CallbackInfo ci)
    {
        AircraftFlightController.update((EntityNPCInterface)(Object)this);
        SubmarineController.update((EntityNPCInterface)(Object)this);
        GroundVehicleController.update((EntityNPCInterface)(Object)this);
    }

    /** The dedicated controller supplies all horizontal motion; reject vanilla strafe input. */
    @ModifyVariable(method = "func_70612_e(FF)V", at = @At("HEAD"), ordinal = 0, argsOnly = true, remap = false)
    private float wolffsmod$removeGroundVehicleStrafe(float strafe)
    {
        IMixinDataAI data = (IMixinDataAI)ais;
        return data.getVehicleMobilityProfile() == VehicleMobilityProfile.GROUND && data.getGroundDrivingEnabled()
                ? 0.0F : strafe;
    }

    /** The controller's motion vector replaces vanilla forward acceleration as well. */
    @ModifyVariable(method = "func_70612_e(FF)V", at = @At("HEAD"), ordinal = 1, argsOnly = true, remap = false)
    private float wolffsmod$removeGroundVehicleForwardInput(float forward)
    {
        IMixinDataAI data = (IMixinDataAI)ais;
        return data.getVehicleMobilityProfile() == VehicleMobilityProfile.GROUND && data.getGroundDrivingEnabled()
                ? 0.0F : forward;
    }

    @Override
    public Seat getDriver()
    {
        return driver;
    }

    @Override
    public Map<Integer, Seat> getPassengers()
    {
        return passengers;
    }

    @Override
    public boolean getLastBurst()
    {
        return lastBurst;
    }

    @Override
    public void setLastBurst(boolean lastBurst)
    {
        this.lastBurst = lastBurst;
    }

    @Override
    public DataAbilities getNpcAbilities()
    {
        return abilities;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void performHurtAnimation()
    {
        super.performHurtAnimation();
        removeHurtEffectWhenTurnedOff();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void handleHealthUpdate(byte b)
    {
        super.handleHealthUpdate(b);
        removeHurtEffectWhenTurnedOff();
    }

    @Unique
    private void removeHurtEffectWhenTurnedOff()
    {
        if (!((IMixinDataDisplay)display).getDisplayHurtEffect())
            maxHurtTime = hurtTime = 0;
    }

    @Inject(method = "func_70609_aI", at = @At(value = "HEAD"), remap = false)
    private void beforeDeathUpdate(CallbackInfo callbackInfo)
    {
        if (!((IMixinDataDisplay)display).getDisplayHurtEffect() && stats.hideKilledBody)
            deathTime = 20;
    }
}
