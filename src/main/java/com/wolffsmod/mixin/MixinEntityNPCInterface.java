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
import com.wolffsmod.customnpc.IMixinEntityNPCInterface;
import com.wolffsmod.customnpc.NPCInterfaceUtil;
import com.wolffsmod.entity.EntityFlanAAGunNPC;
import com.wolffsmod.entity.EntityFlanDriveableNPC;
import com.wolffsmod.entity.Seat;
import com.wolffsmod.flan.EntityNPCFlanBullet;
import com.wolffsmod.flan.FlanUtils;
import com.wolffsmod.customnpc.IMixinDataInventory;
import com.wolffsmod.network.EnumAnimPacket;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import noppes.npcs.CustomNpcs;
import noppes.npcs.DataAdvanced;
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
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

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

    @Shadow
    public ICustomNpc wrappedNPC;
    @Shadow
    public DataDisplay display;
    @Shadow
    public DataStats stats;
    @Shadow
    public DataInventory inventory;
    @Shadow
    public DataAdvanced advanced;
    @Shadow
    public RoleInterface roleInterface;
    @Shadow
    public Faction faction;

    @Shadow
    public abstract boolean isRemote();
    @Shadow
    public abstract void reset();
    @Shadow
    public abstract void updateTasks();
    @Shadow
    public abstract EntityLivingBase getOwner();
    @Shadow
    public abstract ItemStack getOffHand();
    @Shadow
    public abstract boolean isKilled();
    @Shadow
    public abstract boolean isAttacking();
    @Shadow
    public abstract EntityProjectile shoot(EntityLivingBase entity, int accuracy, ItemStack proj, boolean indirect);
    @Shadow
    private int getPotionEffect(EnumPotionType p)
    {
        return 0; //Dummy method body
    }

    protected MixinEntityNPCInterface(World w)
    {
        super(w);
    }

    @Inject(method = "onUpdate", at = @At(value = "TAIL"), remap = false)
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
    @Overwrite(remap = false)
    public boolean attackEntityAsMob(Entity par1Entity)
    {
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

        if (stats.potionType != EnumPotionType.None){
            if (stats.potionType != EnumPotionType.Fire && par1Entity instanceof EntityLivingBase)
                ((EntityLivingBase)par1Entity).addPotionEffect(new PotionEffect(getPotionEffect(stats.potionType), stats.potionDuration * 20, stats.potionAmp));
            else
                par1Entity.setFire(stats.potionDuration);
        }
        return var4;
    }

    /**
     * @author Wolff
     * @reason Flan damage multipliers vs planes/vehicles apply to NPC planes/vehicles
     */
    @Override
    @Overwrite(remap = false)
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

                    if (npc.canSee(this) || npc.ai.directLOS || npc.canSee(attackingEntity))
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
    @Overwrite(remap = false)
    public void attackEntityWithRangedAttack(EntityLivingBase entity, float f)
    {
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

            if (!getGuns().isEmpty())
            {
                for(ItemStack gun: getGuns())
                {
                    for (int i = 0; i < ((ItemGun)gun.getItem()).type.getNumBullets(gun); i++)
                    {
                        shootProjectile(entity, event, gun, proj, f);
                    }
                }
            }
            else
            {
                for (int i = 0; i < stats.shotCount; i++)
                {
                    shootProjectile(entity, event, null, proj, f);
                }
            }

            if (((IMixinDataInventory)inventory).getUseWeaponRangedStats() && !getGuns().isEmpty())
            {
                for(ItemStack gun: getGuns())
                    NPCInterfaceUtil.playGunFireSound(gun, posX, posY, posZ, dimension, lastBurst);
            }
            else
            {
                playSound(stats.fireSound, 2.0F, 1.0f);
            }

            NPCInterfaceUtil.sendPacketWhenInRenderingRange(this, EnumAnimPacket.FLAN_SHOOT);
        }
    }

    protected void shootProjectile(EntityLivingBase entity, NpcEvent.RangedLaunchedEvent event, ItemStack gunItemStack, ItemStack projectileItemStack, float f)
    {
        Item projectileItem = projectileItemStack.getItem();
        if (projectileItem instanceof ItemShootable)
        {
            shootFlanProjectile(gunItemStack, projectileItemStack);
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
            EntityFireworkRocket entityfireworkrocket = new EntityFireworkRocket(worldObj, posX, posY, posZ, projectileItemStack);
            worldObj.spawnEntityInWorld(entityfireworkrocket);
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

    protected void shootFlanProjectile(ItemStack itemStackGun, ItemStack itemStackShootable)
    {
        boolean shotgun;
        float spread;
        float damage;
        float speed;
        float yaw = rotationYawHead;
        float pitch = rotationPitch;
        Vec3 origin = Vec3.createVectorHelper(posX, posY + getEyeHeight(), posZ);

        if(itemStackGun != null && ((IMixinDataInventory)inventory).getUseWeaponRangedStats())
        {
            GunType gunType = ((ItemGun)itemStackGun.getItem()).type;
            damage = ((ItemGun)itemStackGun.getItem()).type.getDamage(itemStackGun);
            speed = Math.round(Math.max(FlanUtils.getBulletSpeed(((ItemGun)itemStackGun.getItem()).type, itemStackGun, itemStackShootable), 1F));
            spread = gunType.getSpread(itemStackGun, isSneaking(), isSprinting());
            shotgun = (gunType.getNumBullets(itemStackGun) > 1);
        }
        else
        {
            damage = stats.pDamage;
            speed = stats.pSpeed;
            spread =  NPCInterfaceUtil.accuracyToBulletSpread(stats.accuracy);
            shotgun = (stats.shotCount > 1);

            if (((IMixinDataInventory)inventory).getUseDriveableStats())
            {
                Optional<DriveableType> driveableType = getHeldDriveable();
                Optional<AAGunType> aaGunType = getHeldAAGun();
                if (driveableType.isPresent())
                {
                    DriveableType type = driveableType.get();
                    Optional<Float> damageMultiplierPrimary = FlanUtils.getDamageMultiplierPrimary(type);
                    if (damageMultiplierPrimary.isPresent())
                        damage = damageMultiplierPrimary.get();
                    speed = (int) type.bulletSpeed;
                    spread = type.bulletSpread;
                }
                if (aaGunType.isPresent())
                {
                    AAGunType type = aaGunType.get();
                    damage = type.damage;
                    spread = type.accuracy;
                }
            }
        }

        Optional<EntityFlanDriveableNPC> optionalDriveable = getFlanDriveableEntity();

        if (optionalDriveable.isPresent())
        {
            optionalDriveable.get().syncRotationWithClient();
            yaw = driver.getGlobalYaw(renderYawOffset);
            pitch = driver.getPitch();
        }

        if (optionalDriveable.isPresent() && (optionalDriveable.get().shootPointsPrimary.isEmpty()))
        {
            EntityFlanDriveableNPC driveable = optionalDriveable.get();
            float driverYaw = driveable.driver.getLocalYaw();

            for (ShootPoint shootPoint: driveable.shootPointsPrimary)
            {
                Vector3f gunVector = NPCInterfaceUtil.getFiringPosition(shootPoint, driveable.turretOrigin, driverYaw, pitch, renderYawOffset);

                if (display.modelSize != 5)
                    gunVector.scale(display.modelSize / 5F);

                origin = (Vector3f.add(new Vector3f(posX, posY + driveable.yDriveableOffset * (display.modelSize / 5F), posZ), gunVector, null)).toVec3();
                NPCInterfaceUtil.spawnParticle(driveable.shootParticlesPrimary, shootPoint, gunVector, driverYaw, pitch, renderYawOffset, posX, posY + driveable.yDriveableOffset, posZ, dimension, display.modelSize / 5F);
                spawnFlanShootable((ItemShootable)itemStackShootable.getItem(), origin, yaw, pitch, spread, damage, speed, shotgun);
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
                    spawnFlanShootable((ItemShootable)itemStackShootable.getItem(), origin, yaw, pitch, spread, damage, speed, shotgun);
                }
            }
            else
            {
                spawnFlanShootable((ItemShootable)itemStackShootable.getItem(), origin, yaw, pitch, spread, damage, speed, shotgun);
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

            animations.doShoot(pumpDelay, pumpTime, hammerDelay, hammerAngle, althammerAngle, casingDelay);
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

            animations.doShoot(pumpDelay, pumpTime, hammerDelay, hammerAngle, althammerAngle, casingDelay);
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
}
