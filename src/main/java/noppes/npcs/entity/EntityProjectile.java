// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.entity;

import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;
import noppes.npcs.constants.EnumParticleType;
import noppes.npcs.DataStats;
import java.util.UUID;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Iterator;
import net.minecraft.potion.Potion;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S27PacketExplosion;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.Explosion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.util.DamageSource;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import java.util.List;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.entity.Entity;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.MathHelper;
import net.minecraft.init.Items;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import noppes.npcs.util.IProjectileCallback;
import noppes.npcs.constants.EnumPotionType;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.block.Block;
import net.minecraft.entity.projectile.EntityThrowable;

public class EntityProjectile extends EntityThrowable
{
    private int xTile;
    private int yTile;
    private int zTile;
    private Block inTile;
    protected boolean inGround;
    private int inData;
    public int throwableShake;
    public int arrowShake;
    public boolean canBePickedUp;
    public boolean destroyedOnEntityHit;
    private EntityLivingBase thrower;
    private EntityNPCInterface npc;
    public EntityItem entityitem;
    private String throwerName;
    private int ticksInGround;
    public int ticksInAir;
    private double accelerationX;
    private double accelerationY;
    private double accelerationZ;
    public float damage;
    public int punch;
    public boolean accelerate;
    public boolean explosive;
    public boolean explosiveDamage;
    public int explosiveRadius;
    public EnumPotionType effect;
    public int duration;
    public int amplify;
    public IProjectileCallback callback;
    public ItemStack callbackItem;
    
    public EntityProjectile(final World par1World) {
        super(par1World);
        this.xTile = -1;
        this.yTile = -1;
        this.zTile = -1;
        this.inGround = false;
        this.inData = 0;
        this.throwableShake = 0;
        this.arrowShake = 0;
        this.canBePickedUp = false;
        this.destroyedOnEntityHit = true;
        this.throwerName = null;
        this.ticksInAir = 0;
        this.damage = 5.0f;
        this.punch = 0;
        this.accelerate = false;
        this.explosive = false;
        this.explosiveDamage = true;
        this.explosiveRadius = 0;
        this.effect = EnumPotionType.None;
        this.duration = 5;
        this.amplify = 0;
        this.setSize(0.25f, 0.25f);
    }
    
    protected void entityInit() {
        this.dataWatcher.addObjectByDataType(21, 5);
        this.dataWatcher.addObject(22, (Object)String.valueOf(""));
        this.dataWatcher.addObject(23, (Object)5);
        this.dataWatcher.addObject(24, (Object)(byte)0);
        this.dataWatcher.addObject(25, (Object)10);
        this.dataWatcher.addObject(26, (Object)(byte)0);
        this.dataWatcher.addObject(27, (Object)(byte)0);
        this.dataWatcher.addObject(28, (Object)(byte)0);
        this.dataWatcher.addObject(29, (Object)(byte)0);
        this.dataWatcher.addObject(30, (Object)(byte)0);
        this.dataWatcher.addObject(31, (Object)(byte)0);
    }
    
    @SideOnly(Side.CLIENT)
    public boolean isInRangeToRenderDist(final double par1) {
        double d1 = this.boundingBox.getAverageEdgeLength() * 4.0;
        d1 *= 64.0;
        return par1 < d1 * d1;
    }
    
    public EntityProjectile(final World par1World, final EntityLivingBase par2EntityLiving, final ItemStack item, final boolean isNPC) {
        super(par1World);
        this.xTile = -1;
        this.yTile = -1;
        this.zTile = -1;
        this.inGround = false;
        this.inData = 0;
        this.throwableShake = 0;
        this.arrowShake = 0;
        this.canBePickedUp = false;
        this.destroyedOnEntityHit = true;
        this.throwerName = null;
        this.ticksInAir = 0;
        this.damage = 5.0f;
        this.punch = 0;
        this.accelerate = false;
        this.explosive = false;
        this.explosiveDamage = true;
        this.explosiveRadius = 0;
        this.effect = EnumPotionType.None;
        this.duration = 5;
        this.amplify = 0;
        this.thrower = par2EntityLiving;
        if (this.thrower != null) {
            this.throwerName = this.thrower.getUniqueID().toString();
        }
        this.setThrownItem(item);
        this.dataWatcher.updateObject(27, (Object)(byte)((this.getItem() == Items.arrow) ? 1 : 0));
        this.setSize((float)(this.dataWatcher.getWatchableObjectInt(23) / 10), (float)(this.dataWatcher.getWatchableObjectInt(23) / 10));
        this.setLocationAndAngles(par2EntityLiving.posX, par2EntityLiving.posY + par2EntityLiving.getEyeHeight(), par2EntityLiving.posZ, par2EntityLiving.rotationYaw, par2EntityLiving.rotationPitch);
        this.posX -= MathHelper.cos(this.rotationYaw / 180.0f * 3.1415927f) * 0.1f;
        this.posY -= 0.10000000149011612;
        this.posZ -= MathHelper.sin(this.rotationYaw / 180.0f * 3.1415927f) * 0.1f;
        this.setPosition(this.posX, this.posY, this.posZ);
        this.yOffset = 0.0f;
        if (isNPC) {
            this.npc = (EntityNPCInterface)this.thrower;
            this.getStatProperties(this.npc.stats);
        }
    }
    
    public void setThrownItem(final ItemStack item) {
        this.dataWatcher.updateObject(21, (Object)item);
    }
    
    public void setThrowableHeading(final double par1, final double par3, final double par5, final float par7, final float par8) {
        final float f2 = MathHelper.sqrt_double(par1 * par1 + par3 * par3 + par5 * par5);
        final float f3 = MathHelper.sqrt_double(par1 * par1 + par5 * par5);
        final float yaw = (float)(Math.atan2(par1, par5) * 180.0 / 3.141592653589793);
        final float pitch = this.hasGravity() ? par7 : ((float)(Math.atan2(par3, f3) * 180.0 / 3.141592653589793));
        final float n = yaw;
        this.rotationYaw = n;
        this.prevRotationYaw = n;
        final float n2 = pitch;
        this.rotationPitch = n2;
        this.prevRotationPitch = n2;
        this.motionX = MathHelper.sin(yaw / 180.0f * 3.1415927f) * MathHelper.cos(pitch / 180.0f * 3.1415927f);
        this.motionZ = MathHelper.cos(yaw / 180.0f * 3.1415927f) * MathHelper.cos(pitch / 180.0f * 3.1415927f);
        this.motionY = MathHelper.sin((pitch + 1.0f) / 180.0f * 3.1415927f);
        this.motionX += this.rand.nextGaussian() * 0.007499999832361937 * par8;
        this.motionZ += this.rand.nextGaussian() * 0.007499999832361937 * par8;
        this.motionY += this.rand.nextGaussian() * 0.007499999832361937 * par8;
        this.motionX *= this.getSpeed();
        this.motionZ *= this.getSpeed();
        this.motionY *= this.getSpeed();
        this.accelerationX = par1 / f2 * 0.1;
        this.accelerationY = par3 / f2 * 0.1;
        this.accelerationZ = par5 / f2 * 0.1;
        this.ticksInGround = 0;
    }
    
    public float getAngleForXYZ(final double varX, final double varY, final double varZ, final double horiDist, final boolean arc) {
        final float g = this.getGravityVelocity();
        final float var1 = this.getSpeed() * this.getSpeed();
        final double var2 = g * horiDist;
        final double var3 = g * horiDist * horiDist + 2.0 * varY * var1;
        final double var4 = var1 * var1 - g * var3;
        if (var4 < 0.0) {
            return 30.0f;
        }
        final float var5 = arc ? (var1 + MathHelper.sqrt_double(var4)) : (var1 - MathHelper.sqrt_double(var4));
        final float var6 = (float)(Math.atan2(var5, var2) * 180.0 / 3.141592653589793);
        return var6;
    }
    
    public void shoot(final float speed) {
        final double varX = -MathHelper.sin(this.rotationYaw / 180.0f * 3.1415927f) * MathHelper.cos(this.rotationPitch / 180.0f * 3.1415927f);
        final double varZ = MathHelper.cos(this.rotationYaw / 180.0f * 3.1415927f) * MathHelper.cos(this.rotationPitch / 180.0f * 3.1415927f);
        final double varY = -MathHelper.sin(this.rotationPitch / 180.0f * 3.1415927f);
        this.setThrowableHeading(varX, varY, varZ, -this.rotationPitch, speed);
    }
    
    @SideOnly(Side.CLIENT)
    public void setPositionAndRotation2(final double par1, final double par3, final double par5, final float par7, final float par8, final int par9) {
        if (this.worldObj.isRemote && this.inGround) {
            return;
        }
        this.setPosition(par1, par3, par5);
        this.setRotation(par7, par8);
    }
    
    public void onUpdate() {
        super.onEntityUpdate();
        if (this.prevRotationPitch == 0.0f && this.prevRotationYaw == 0.0f) {
            final float f = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
            final float n = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0 / 3.141592653589793);
            this.rotationYaw = n;
            this.prevRotationYaw = n;
            final float n2 = (float)(Math.atan2(this.motionY, f) * 180.0 / 3.141592653589793);
            this.rotationPitch = n2;
            this.prevRotationPitch = n2;
            if (this.isRotating()) {
                this.rotationPitch -= 20.0f;
            }
        }
        if (this.effect == EnumPotionType.Fire && !this.inGround) {
            this.setFire(1);
        }
        final Block block = this.worldObj.getBlock(this.xTile, this.yTile, this.zTile);
        if ((this.isArrow() || this.sticksToWalls()) && block != null) {
            block.setBlockBoundsBasedOnState((IBlockAccess)this.worldObj, this.xTile, this.yTile, this.zTile);
            final AxisAlignedBB axisalignedbb = block.getCollisionBoundingBoxFromPool(this.worldObj, this.xTile, this.yTile, this.zTile);
            if (axisalignedbb != null && axisalignedbb.isVecInside(Vec3.createVectorHelper(this.posX, this.posY, this.posZ))) {
                this.inGround = true;
            }
        }
        if (this.arrowShake > 0) {
            --this.arrowShake;
        }
        if (this.inGround) {
            final int j = this.worldObj.getBlockMetadata(this.xTile, this.yTile, this.zTile);
            if (block == this.inTile && j == this.inData) {
                ++this.ticksInGround;
                if (this.ticksInGround == 1200) {
                    this.setDead();
                }
            }
            else {
                this.inGround = false;
                this.motionX *= this.rand.nextFloat() * 0.2f;
                this.motionY *= this.rand.nextFloat() * 0.2f;
                this.motionZ *= this.rand.nextFloat() * 0.2f;
                this.ticksInGround = 0;
                this.ticksInAir = 0;
            }
        }
        else {
            ++this.ticksInAir;
            if (this.ticksInAir == 1200) {
                this.setDead();
            }
            Vec3 vec3 = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
            Vec3 vec4 = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
            MovingObjectPosition movingobjectposition = this.worldObj.func_147447_a(vec3, vec4, false, true, false);
            vec3 = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
            vec4 = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
            if (movingobjectposition != null) {
                vec4 = Vec3.createVectorHelper(movingobjectposition.hitVec.xCoord, movingobjectposition.hitVec.yCoord, movingobjectposition.hitVec.zCoord);
            }
            if (!this.worldObj.isRemote) {
                Entity entity = null;
                final List list = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(1.0, 1.0, 1.0));
                double d0 = 0.0;
                final EntityLivingBase entityliving = this.getThrower();
                for (int k = 0; k < list.size(); ++k) {
                    final Entity entity2 = (Entity) list.get(k);
                    if (entity2.canBeCollidedWith() && (!entity2.isEntityEqual((Entity)this.thrower) || this.ticksInAir >= 25)) {
                        final float f2 = 0.3f;
                        final AxisAlignedBB axisalignedbb2 = entity2.boundingBox.expand((double)f2, (double)f2, (double)f2);
                        final MovingObjectPosition movingobjectposition2 = axisalignedbb2.calculateIntercept(vec3, vec4);
                        if (movingobjectposition2 != null) {
                            final double d2 = vec3.distanceTo(movingobjectposition2.hitVec);
                            if (d2 < d0 || d0 == 0.0) {
                                entity = entity2;
                                d0 = d2;
                            }
                        }
                    }
                }
                if (entity != null) {
                    movingobjectposition = new MovingObjectPosition(entity);
                }
                if (this.npc != null && movingobjectposition != null && movingobjectposition.entityHit != null && movingobjectposition.entityHit instanceof EntityPlayer) {
                    final EntityPlayer entityplayer = (EntityPlayer)movingobjectposition.entityHit;
                    if (this.npc.faction.isFriendlyToPlayer(entityplayer)) {
                        movingobjectposition = null;
                    }
                }
            }
            if (movingobjectposition != null) {
                if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK && this.worldObj.getBlock(movingobjectposition.blockX, movingobjectposition.blockY, movingobjectposition.blockZ) == Blocks.portal) {
                    this.setInPortal();
                }
                else {
                    this.dataWatcher.updateObject(29, (Object)(byte)0);
                    this.onImpact(movingobjectposition);
                }
            }
            this.posX += this.motionX;
            this.posY += this.motionY;
            this.posZ += this.motionZ;
            final float f3 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
            this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0 / 3.141592653589793);
            this.rotationPitch = (float)(Math.atan2(this.motionY, f3) * 180.0 / 3.141592653589793);
            while (this.rotationPitch - this.prevRotationPitch < -180.0f) {
                this.prevRotationPitch -= 360.0f;
            }
            while (this.rotationPitch - this.prevRotationPitch >= 180.0f) {
                this.prevRotationPitch += 360.0f;
            }
            while (this.rotationYaw - this.prevRotationYaw < -180.0f) {
                this.prevRotationYaw -= 360.0f;
            }
            while (this.rotationYaw - this.prevRotationYaw >= 180.0f) {
                this.prevRotationYaw += 360.0f;
            }
            final float f4 = this.isArrow() ? 0.0f : 225.0f;
            this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) + f4 * 0.2f;
            this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2f;
            if (this.isRotating()) {
                final int spin = this.isBlock() ? 10 : 20;
                this.rotationPitch -= this.ticksInAir % 15 * spin * this.getSpeed();
            }
            float f5 = this.getMotionFactor();
            final float f6 = this.getGravityVelocity();
            if (this.isInWater()) {
                if (this.worldObj.isRemote) {
                    for (int i = 0; i < 4; ++i) {
                        final float f7 = 0.25f;
                        this.worldObj.spawnParticle("bubble", this.posX - this.motionX * f7, this.posY - this.motionY * f7, this.posZ - this.motionZ * f7, this.motionX, this.motionY, this.motionZ);
                    }
                }
                f5 = 0.8f;
            }
            this.motionX *= f5;
            this.motionY *= f5;
            this.motionZ *= f5;
            if (this.hasGravity()) {
                this.motionY -= f6;
            }
            if (this.accelerate) {
                this.motionX += this.accelerationX;
                this.motionY += this.accelerationY;
                this.motionZ += this.accelerationZ;
            }
            if (this.worldObj.isRemote && !this.dataWatcher.getWatchableObjectString(22).equals("")) {
                this.worldObj.spawnParticle(this.dataWatcher.getWatchableObjectString(22), this.posX, this.posY, this.posZ, 0.0, 0.0, 0.0);
            }
            this.setPosition(this.posX, this.posY, this.posZ);
            this.func_145775_I();
        }
    }
    
    public boolean isBlock() {
        final ItemStack item = this.getItemDisplay();
        return item != null && item.getItem() instanceof ItemBlock;
    }
    
    private Item getItem() {
        final ItemStack item = this.getItemDisplay();
        if (item == null) {
            return null;
        }
        return item.getItem();
    }
    
    protected float getMotionFactor() {
        return this.accelerate ? 0.95f : 1.0f;
    }
    
    protected void onImpact(final MovingObjectPosition movingobjectposition) {
        if (movingobjectposition.entityHit != null) {
            if (this.callback != null && this.callbackItem != null && movingobjectposition.entityHit instanceof EntityLivingBase && this.callback.onImpact(this, (EntityLivingBase)movingobjectposition.entityHit, this.callbackItem)) {
                return;
            }
            float damage = this.damage;
            if (damage == 0.0f) {
                damage = 0.001f;
            }
            if (movingobjectposition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)this.getThrower()), damage)) {
                if (movingobjectposition.entityHit instanceof EntityLivingBase && (this.isArrow() || this.sticksToWalls())) {
                    final EntityLivingBase entityliving = (EntityLivingBase)movingobjectposition.entityHit;
                    if (!this.worldObj.isRemote) {
                        entityliving.setArrowCountInEntity(entityliving.getArrowCountInEntity() + 1);
                    }
                    if (this.destroyedOnEntityHit && !(movingobjectposition.entityHit instanceof EntityEnderman)) {
                        this.setDead();
                    }
                }
                if (this.isBlock()) {
                    this.worldObj.playAuxSFX(2001, (int)movingobjectposition.entityHit.posX, (int)movingobjectposition.entityHit.posY, (int)movingobjectposition.entityHit.posZ, Item.getIdFromItem(this.getItem()));
                }
                else if (!this.isArrow() && !this.sticksToWalls()) {
                    for (int i = 0; i < 8; ++i) {
                        this.worldObj.spawnParticle("iconcrack_" + Item.getIdFromItem(this.getItem()), this.posX, this.posY, this.posZ, this.rand.nextGaussian() * 0.15, this.rand.nextGaussian() * 0.2, this.rand.nextGaussian() * 0.15);
                    }
                }
                if (this.punch > 0) {
                    final float f3 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
                    if (f3 > 0.0f) {
                        movingobjectposition.entityHit.addVelocity(this.motionX * this.punch * 0.6000000238418579 / f3, 0.1, this.motionZ * this.punch * 0.6000000238418579 / f3);
                    }
                }
                if (this.effect != EnumPotionType.None && movingobjectposition.entityHit instanceof EntityLivingBase) {
                    if (this.effect != EnumPotionType.Fire) {
                        final int p = this.getPotionEffect(this.effect);
                        ((EntityLivingBase)movingobjectposition.entityHit).addPotionEffect(new PotionEffect(p, this.duration * 20, this.amplify));
                    }
                    else {
                        movingobjectposition.entityHit.setFire(this.duration);
                    }
                }
            }
            else if (this.hasGravity() && (this.isArrow() || this.sticksToWalls())) {
                this.motionX *= -0.10000000149011612;
                this.motionY *= -0.10000000149011612;
                this.motionZ *= -0.10000000149011612;
                this.rotationYaw += 180.0f;
                this.prevRotationYaw += 180.0f;
                this.ticksInAir = 0;
            }
        }
        else if (this.isArrow() || this.sticksToWalls()) {
            this.xTile = movingobjectposition.blockX;
            this.yTile = movingobjectposition.blockY;
            this.zTile = movingobjectposition.blockZ;
            this.inTile = this.worldObj.getBlock(this.xTile, this.yTile, this.zTile);
            this.inData = this.worldObj.getBlockMetadata(this.xTile, this.yTile, this.zTile);
            this.motionX = (float)(movingobjectposition.hitVec.xCoord - this.posX);
            this.motionY = (float)(movingobjectposition.hitVec.yCoord - this.posY);
            this.motionZ = (float)(movingobjectposition.hitVec.zCoord - this.posZ);
            final float f4 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
            this.posX -= this.motionX / f4 * 0.05000000074505806;
            this.posY -= this.motionY / f4 * 0.05000000074505806;
            this.posZ -= this.motionZ / f4 * 0.05000000074505806;
            this.inGround = true;
            if (this.isArrow()) {
                this.playSound("random.bowhit", 1.0f, 1.2f / (this.rand.nextFloat() * 0.2f + 0.9f));
            }
            else {
                this.playSound("random.break", 1.0f, 1.2f / (this.rand.nextFloat() * 0.2f + 0.9f));
            }
            this.arrowShake = 7;
            if (!this.hasGravity()) {
                this.dataWatcher.updateObject(26, (Object)(byte)1);
            }
            if (this.inTile != null) {
                this.inTile.onEntityCollidedWithBlock(this.worldObj, this.xTile, this.yTile, this.zTile, (Entity)this);
            }
        }
        else if (this.isBlock()) {
            this.worldObj.playAuxSFX(2001, MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ), Item.getIdFromItem(this.getItem()));
        }
        else {
            for (int j = 0; j < 8; ++j) {
                this.worldObj.spawnParticle("iconcrack_" + Item.getIdFromItem(this.getItem()), this.posX, this.posY, this.posZ, this.rand.nextGaussian() * 0.15, this.rand.nextGaussian() * 0.2, this.rand.nextGaussian() * 0.15);
            }
        }
        if (this.explosive) {
            if (this.explosiveRadius != 0 || this.effect == EnumPotionType.None) {
                final boolean terraindamage = this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing") && this.explosiveDamage;
                final Explosion explosion = new Explosion(this.worldObj, (Entity)this, this.posX, this.posY, this.posZ, (float)this.explosiveRadius);
                explosion.isFlaming = (this.effect == EnumPotionType.Fire);
                explosion.isSmoking = terraindamage;
                if (terraindamage) {
                    explosion.doExplosionA();
                }
                explosion.doExplosionB(this.worldObj.isRemote);
                /*if (!this.worldObj.isRemote) {
                    for (final EntityPlayer entityplayer : this.worldObj.playerEntities2) {
                        if (entityplayer.getDistanceSq(this.posX, this.posY, this.posZ) < 4096.0) {
                            ((EntityPlayerMP)entityplayer).playerNetServerHandler.sendPacket((Packet)new S27PacketExplosion(this.posX, this.posY, this.posZ, (float)this.explosiveRadius, explosion.affectedBlockPositions, (Vec3)explosion.func_77277_b().get(entityplayer)));
                        }
                    }
                }*/
                if (this.explosiveRadius != 0 && (this.isArrow() || this.sticksToWalls())) {
                    this.setDead();
                }
            }
            else if (this.effect == EnumPotionType.Fire) {
                int j = movingobjectposition.blockX;
                int k = movingobjectposition.blockY;
                int l = movingobjectposition.blockZ;
                switch (movingobjectposition.sideHit) {
                    case 0: {
                        --k;
                        break;
                    }
                    case 1: {
                        ++k;
                        break;
                    }
                    case 2: {
                        --l;
                        break;
                    }
                    case 3: {
                        ++l;
                        break;
                    }
                    case 4: {
                        --j;
                        break;
                    }
                    case 5: {
                        ++j;
                        break;
                    }
                }
                if (this.worldObj.isAirBlock(j, k, l)) {
                    this.worldObj.setBlock(j, k, l, (Block)Blocks.fire);
                }
            }
            else {
                final AxisAlignedBB axisalignedbb = this.boundingBox.expand(4.0, 2.0, 4.0);
                final List list1 = this.worldObj.getEntitiesWithinAABB((Class)EntityLivingBase.class, axisalignedbb);
                /*if (list1 != null && !list1.isEmpty()) {
                    for (final EntityLivingBase entitylivingbase : list1) {
                        final double d0 = this.getDistanceSqToEntity((Entity)entitylivingbase);
                        if (d0 < 16.0) {
                            double d2 = 1.0 - Math.sqrt(d0) / 4.0;
                            if (entitylivingbase == movingobjectposition.entityHit) {
                                d2 = 1.0;
                            }
                            final int m = this.getPotionEffect(this.effect);
                            if (Potion.potionTypes[m].isInstant()) {
                                Potion.potionTypes[m].affectEntity(this.getThrower(), entitylivingbase, this.amplify, d2);
                            }
                            else {
                                final int j2 = (int)(d2 * this.duration + 0.5);
                                if (j2 <= 20) {
                                    continue;
                                }
                                entitylivingbase.addPotionEffect(new PotionEffect(m, j2, this.amplify));
                            }
                        }
                    }
                }*/
                this.worldObj.playAuxSFX(2002, (int)Math.round(this.posX), (int)Math.round(this.posY), (int)Math.round(this.posZ), this.getPotionColor(this.effect));
            }
        }
        if (!this.worldObj.isRemote && !this.isArrow() && !this.sticksToWalls()) {
            this.setDead();
        }
    }
    
    public void writeEntityToNBT(final NBTTagCompound par1NBTTagCompound) {
        par1NBTTagCompound.setShort("xTile", (short)this.xTile);
        par1NBTTagCompound.setShort("yTile", (short)this.yTile);
        par1NBTTagCompound.setShort("zTile", (short)this.zTile);
        par1NBTTagCompound.setByte("inTile", (byte)Block.getIdFromBlock(this.inTile));
        par1NBTTagCompound.setByte("inData", (byte)this.inData);
        par1NBTTagCompound.setByte("shake", (byte)this.throwableShake);
        par1NBTTagCompound.setByte("inGround", (byte)(byte)(this.inGround ? 1 : 0));
        par1NBTTagCompound.setByte("isArrow", (byte)(byte)(this.isArrow() ? 1 : 0));
        par1NBTTagCompound.setTag("direction", (NBTBase)this.newDoubleNBTList(new double[] { this.motionX, this.motionY, this.motionZ }));
        par1NBTTagCompound.setBoolean("canBePickedUp", this.canBePickedUp);
        if ((this.throwerName == null || this.throwerName.length() == 0) && this.thrower != null && this.thrower instanceof EntityPlayer) {
            this.throwerName = this.thrower.getUniqueID().toString();
        }
        par1NBTTagCompound.setString("ownerName", (this.throwerName == null) ? "" : this.throwerName);
        if (this.getItemDisplay() != null) {
            par1NBTTagCompound.setTag("Item", (NBTBase)this.getItemDisplay().writeToNBT(new NBTTagCompound()));
        }
        par1NBTTagCompound.setFloat("damagev2", this.damage);
        par1NBTTagCompound.setInteger("punch", this.punch);
        par1NBTTagCompound.setInteger("size", this.dataWatcher.getWatchableObjectInt(23));
        par1NBTTagCompound.setInteger("velocity", this.dataWatcher.getWatchableObjectInt(25));
        par1NBTTagCompound.setInteger("explosiveRadius", this.explosiveRadius);
        par1NBTTagCompound.setInteger("effectDuration", this.duration);
        par1NBTTagCompound.setBoolean("gravity", this.hasGravity());
        par1NBTTagCompound.setBoolean("accelerate", this.accelerate);
        par1NBTTagCompound.setByte("glows", this.dataWatcher.getWatchableObjectByte(24));
        par1NBTTagCompound.setBoolean("explosive", this.explosive);
        par1NBTTagCompound.setInteger("PotionEffect", this.effect.ordinal());
        par1NBTTagCompound.setString("trail", this.dataWatcher.getWatchableObjectString(22));
        par1NBTTagCompound.setByte("Render3D", this.dataWatcher.getWatchableObjectByte(28));
        par1NBTTagCompound.setByte("Spins", this.dataWatcher.getWatchableObjectByte(29));
        par1NBTTagCompound.setByte("Sticks", this.dataWatcher.getWatchableObjectByte(30));
    }
    
    public void readEntityFromNBT(final NBTTagCompound par1NBTTagCompound) {
        this.xTile = par1NBTTagCompound.getShort("xTile");
        this.yTile = par1NBTTagCompound.getShort("yTile");
        this.zTile = par1NBTTagCompound.getShort("zTile");
        this.inTile = Block.getBlockById(par1NBTTagCompound.getByte("inTile") & 0xFF);
        this.inData = (par1NBTTagCompound.getByte("inData") & 0xFF);
        this.throwableShake = (par1NBTTagCompound.getByte("shake") & 0xFF);
        this.inGround = (par1NBTTagCompound.getByte("inGround") == 1);
        this.dataWatcher.updateObject(27, (Object)par1NBTTagCompound.getByte("isArrow"));
        this.throwerName = par1NBTTagCompound.getString("ownerName");
        this.canBePickedUp = par1NBTTagCompound.getBoolean("canBePickedUp");
        this.damage = par1NBTTagCompound.getFloat("damagev2");
        this.punch = par1NBTTagCompound.getInteger("punch");
        this.explosiveRadius = par1NBTTagCompound.getInteger("explosiveRadius");
        this.duration = par1NBTTagCompound.getInteger("effectDuration");
        this.accelerate = par1NBTTagCompound.getBoolean("accelerate");
        this.explosive = par1NBTTagCompound.getBoolean("explosive");
        this.effect = EnumPotionType.values()[par1NBTTagCompound.getInteger("PotionEffect") % EnumPotionType.values().length];
        this.dataWatcher.updateObject(22, (Object)par1NBTTagCompound.getString("trail"));
        this.dataWatcher.updateObject(23, (Object)par1NBTTagCompound.getInteger("size"));
        this.dataWatcher.updateObject(24, (Object)(byte)(par1NBTTagCompound.getBoolean("glows") ? 1 : 0));
        this.dataWatcher.updateObject(25, (Object)par1NBTTagCompound.getInteger("velocity"));
        this.dataWatcher.updateObject(26, (Object)(byte)(par1NBTTagCompound.getBoolean("gravity") ? 1 : 0));
        this.dataWatcher.updateObject(28, (Object)(byte)(par1NBTTagCompound.getBoolean("Render3D") ? 1 : 0));
        this.dataWatcher.updateObject(29, (Object)(byte)(par1NBTTagCompound.getBoolean("Spins") ? 1 : 0));
        this.dataWatcher.updateObject(30, (Object)(byte)(par1NBTTagCompound.getBoolean("Sticks") ? 1 : 0));
        if (this.throwerName != null && this.throwerName.length() == 0) {
            this.throwerName = null;
        }
        if (par1NBTTagCompound.hasKey("direction")) {
            final NBTTagList nbttaglist = par1NBTTagCompound.getTagList("direction", 6);
            this.motionX = nbttaglist.func_150309_d(0);
            this.motionY = nbttaglist.func_150309_d(1);
            this.motionZ = nbttaglist.func_150309_d(2);
        }
        final NBTTagCompound var2 = par1NBTTagCompound.getCompoundTag("Item");
        final ItemStack item = ItemStack.loadItemStackFromNBT(var2);
        if (item == null) {
            this.setDead();
        }
        else {
            this.dataWatcher.updateObject(21, (Object)item);
        }
    }
    
    public EntityLivingBase getThrower() {
        if (this.throwerName == null || this.throwerName.isEmpty()) {
            return null;
        }
        try {
            final UUID uuid = UUID.fromString(this.throwerName);
            if (this.thrower == null && uuid != null) {
                this.thrower = (EntityLivingBase)this.worldObj.func_152378_a(uuid);
            }
        }
        catch (IllegalArgumentException ex) {}
        return this.thrower;
    }
    
    private int getPotionEffect(final EnumPotionType p) {
        switch (p) {
            case Poison: {
                return Potion.poison.id;
            }
            case Hunger: {
                return Potion.hunger.id;
            }
            case Weakness: {
                return Potion.weakness.id;
            }
            case Slowness: {
                return Potion.moveSlowdown.id;
            }
            case Nausea: {
                return Potion.confusion.id;
            }
            case Blindness: {
                return Potion.blindness.id;
            }
            case Wither: {
                return Potion.wither.id;
            }
            default: {
                return 0;
            }
        }
    }
    
    private int getPotionColor(final EnumPotionType p) {
        switch (p) {
            case Poison: {
                return 32660;
            }
            case Hunger: {
                return 32660;
            }
            case Weakness: {
                return 32696;
            }
            case Slowness: {
                return 32698;
            }
            case Nausea: {
                return 32732;
            }
            case Blindness: {
                return Potion.blindness.id;
            }
            case Wither: {
                return 32732;
            }
            default: {
                return 0;
            }
        }
    }
    
    public void getStatProperties(final DataStats stats) {
        this.damage = stats.pDamage;
        this.punch = stats.pImpact;
        this.accelerate = stats.pXlr8;
        this.explosive = stats.pExplode;
        this.explosiveRadius = stats.pArea;
        this.effect = stats.pEffect;
        this.duration = stats.pDur;
        this.amplify = stats.pEffAmp;
        this.setParticleEffect(stats.pTrail);
        this.dataWatcher.updateObject(23, (Object)stats.pSize);
        this.dataWatcher.updateObject(24, (Object)(byte)(stats.pGlows ? 1 : 0));
        this.setSpeed(stats.pSpeed);
        this.setHasGravity(stats.pPhysics);
        this.setIs3D(stats.pRender3D);
        this.setRotating(stats.pSpin);
        this.setStickInWall(stats.pStick);
    }
    
    public void setParticleEffect(final EnumParticleType type) {
        this.dataWatcher.updateObject(22, (Object)type.particleName);
    }
    
    public void setHasGravity(final boolean bo) {
        this.dataWatcher.updateObject(26, (Object)(byte)(bo ? 1 : 0));
    }
    
    public void setIs3D(final boolean bo) {
        this.dataWatcher.updateObject(28, (Object)(byte)(bo ? 1 : 0));
    }
    
    public void setStickInWall(final boolean bo) {
        this.dataWatcher.updateObject(30, (Object)(byte)(bo ? 1 : 0));
    }
    
    public ItemStack getItemDisplay() {
        return this.dataWatcher.getWatchableObjectItemStack(21);
    }
    
    public float getBrightness(final float par1) {
        return (this.dataWatcher.getWatchableObjectByte(24) == 1) ? 1.0f : super.getBrightness(par1);
    }
    
    @SideOnly(Side.CLIENT)
    public int getBrightnessForRender(final float par1) {
        return (this.dataWatcher.getWatchableObjectByte(24) == 1) ? 15728880 : super.getBrightnessForRender(par1);
    }
    
    public boolean hasGravity() {
        return this.dataWatcher.getWatchableObjectByte(26) == 1;
    }
    
    public void setSpeed(final int speed) {
        this.dataWatcher.updateObject(25, (Object)speed);
    }
    
    public float getSpeed() {
        return this.dataWatcher.getWatchableObjectInt(25) / 10.0f;
    }
    
    public boolean isArrow() {
        return this.dataWatcher.getWatchableObjectByte(27) == 1;
    }
    
    public void setRotating(final boolean bo) {
        this.dataWatcher.updateObject(29, (Object)(byte)(bo ? 1 : 0));
    }
    
    public boolean isRotating() {
        return this.dataWatcher.getWatchableObjectByte(29) == 1;
    }
    
    public boolean glows() {
        return this.dataWatcher.getWatchableObjectByte(24) == 1;
    }
    
    public boolean is3D() {
        return this.dataWatcher.getWatchableObjectByte(28) == 1 || this.isBlock();
    }
    
    public boolean sticksToWalls() {
        return this.is3D() && this.dataWatcher.getWatchableObjectByte(30) == 1;
    }
    
    public void onCollideWithPlayer(final EntityPlayer par1EntityPlayer) {
        if (this.worldObj.isRemote || !this.canBePickedUp || !this.inGround || this.arrowShake > 0) {
            return;
        }
        if (par1EntityPlayer.inventory.addItemStackToInventory(this.getItemDisplay())) {
            this.inGround = false;
            this.playSound("random.pop", 0.2f, ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.7f + 1.0f) * 2.0f);
            par1EntityPlayer.onItemPickup((Entity)this, 1);
            this.setDead();
        }
    }
    
    protected boolean canTriggerWalking() {
        return false;
    }
    
    public IChatComponent func_145748_c_() {
        if (this.getItemDisplay() != null) {
            return (IChatComponent)new ChatComponentTranslation(this.getItemDisplay().getDisplayName(), new Object[0]);
        }
        return super.func_145748_c_();
    }
}
