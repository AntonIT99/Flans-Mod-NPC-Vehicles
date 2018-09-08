// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.entity;

import net.minecraft.entity.DataWatcher;
import noppes.npcs.roles.JobFollower;
import noppes.npcs.roles.RoleFollower;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.nbt.NBTBase;
import noppes.npcs.NBTTags;
import java.io.IOException;
import io.netty.buffer.ByteBuf;
import noppes.npcs.controllers.FactionController;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Items;
import net.minecraft.util.IIcon;
import noppes.npcs.scripted.ScriptEventKilled;
import net.minecraft.util.AxisAlignedBB;
import cpw.mods.fml.common.eventhandler.Event;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ServerChatEvent;
import noppes.npcs.client.EntityUtil;
import com.mojang.authlib.GameProfile;
import net.minecraft.world.WorldServer;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.potion.Potion;
import net.minecraft.block.Block;
import noppes.npcs.ai.EntityAITransform;
import noppes.npcs.ai.EntityAIAnimation;
import noppes.npcs.ai.EntityAIRole;
import noppes.npcs.ai.EntityAIJob;
import noppes.npcs.ai.EntityAIWorldLines;
import noppes.npcs.ai.EntityAILook;
import noppes.npcs.ai.EntityAIWatchClosest;
import noppes.npcs.constants.EnumStandingType;
import noppes.npcs.ai.EntityAIFollow;
import noppes.npcs.ai.EntityAIReturn;
import noppes.npcs.ai.EntityAISprintToTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import noppes.npcs.ai.EntityAIFindShade;
import net.minecraft.entity.ai.EntityAIRestrictSun;
import noppes.npcs.ai.EntityAIMoveIndoors;
import noppes.npcs.ai.EntityAIBustDoor;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import noppes.npcs.ai.EntityAIMovingPath;
import noppes.npcs.ai.EntityAIWander;
import noppes.npcs.constants.EnumMovingType;
import noppes.npcs.constants.EnumNavType;
import noppes.npcs.ai.EntityAIAttackTarget;
import noppes.npcs.ai.EntityAIDodgeShoot;
import noppes.npcs.ai.EntityAIStalkTarget;
import noppes.npcs.ai.EntityAIAmbushTarget;
import noppes.npcs.ai.EntityAIOrbitTarget;
import noppes.npcs.ai.EntityAIZigZagTarget;
import noppes.npcs.ai.EntityAIAvoidTarget;
import noppes.npcs.ai.EntityAIPanic;
import net.minecraft.command.IEntitySelector;
import noppes.npcs.ai.EntityAIWaterNav;
import noppes.npcs.ai.target.EntityAIOwnerHurtTarget;
import noppes.npcs.ai.target.EntityAIOwnerHurtByTarget;
import noppes.npcs.ai.target.EntityAIClosestTarget;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import noppes.npcs.ai.target.EntityAIClearTarget;
import noppes.npcs.ai.selector.NPCAttackSelector;
import java.util.Collection;
import net.minecraft.entity.ai.EntityAITasks;
import noppes.npcs.scripted.ScriptEventTarget;
import noppes.npcs.scripted.ScriptEventDamaged;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.entity.projectile.EntityArrow;
import noppes.npcs.controllers.QuestData;
import noppes.npcs.controllers.PlayerQuestData;
import noppes.npcs.controllers.Dialog;
import net.minecraft.item.Item;
import noppes.npcs.NoppesUtilServer;
import net.minecraft.entity.player.EntityPlayerMP;
import noppes.npcs.controllers.PlayerDataController;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import noppes.npcs.CustomItems;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Iterator;
import noppes.npcs.roles.JobBard;
import noppes.npcs.constants.EnumJobType;
import noppes.npcs.Server;
import noppes.npcs.constants.EnumPacketClient;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.potion.PotionEffect;
import noppes.npcs.constants.EnumPotionType;
import noppes.npcs.roles.RoleCompanion;
import noppes.npcs.constants.EnumRoleType;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.NPCEntityHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import noppes.npcs.NpcDamageSource;
import noppes.npcs.scripted.ScriptEventAttack;
import net.minecraft.entity.Entity;
import noppes.npcs.constants.EnumScriptType;
import net.minecraft.entity.SharedMonsterAttributes;
import noppes.npcs.controllers.Line;
import noppes.npcs.CustomNpcs;
import noppes.npcs.VersionCompatibility;
import java.util.ArrayList;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import noppes.npcs.IChatMessages;
import noppes.npcs.constants.EnumAnimation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import java.util.List;
import net.minecraft.entity.ai.EntityAIBase;
import noppes.npcs.ai.EntityAIRangedAttack;
import noppes.npcs.controllers.Faction;
import noppes.npcs.controllers.DialogOption;
import java.util.HashMap;
import noppes.npcs.roles.JobInterface;
import noppes.npcs.roles.RoleInterface;
import noppes.npcs.controllers.LinkedNpcController;
import noppes.npcs.controllers.TransformData;
import noppes.npcs.DataScript;
import noppes.npcs.DataInventory;
import noppes.npcs.DataAdvanced;
import noppes.npcs.DataAI;
import noppes.npcs.DataStats;
import noppes.npcs.DataDisplay;
import net.minecraftforge.common.util.FakePlayer;
import noppes.npcs.util.GameProfileAlt;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.command.ICommandSender;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import net.minecraft.entity.EntityCreature;

public abstract class EntityNPCInterface extends EntityCreature implements IEntityAdditionalSpawnData, ICommandSender, IRangedAttackMob, IBossDisplayData
{
    private static final GameProfileAlt chateventProfile;
    private static FakePlayer chateventPlayer;
    public DataDisplay display;
    public DataStats stats;
    public DataAI ai;
    public DataAdvanced advanced;
    public DataInventory inventory;
    public DataScript script;
    public TransformData transform;
    public String linkedName;
    public long linkedLast;
    public LinkedNpcController.LinkedData linkedData;
    public float baseHeight;
    public float scaleX;
    public float scaleY;
    public float scaleZ;
    private boolean wasKilled;
    public RoleInterface roleInterface;
    public JobInterface jobInterface;
    public HashMap<Integer, DialogOption> dialogs;
    public boolean hasDied;
    public long killedtime;
    public long totalTicksAlive;
    private int taskCount;
    public int lastInteract;
    public Faction faction;
    private EntityAIRangedAttack aiRange;
    private EntityAIBase aiResponse;
    private EntityAIBase aiLeap;
    private EntityAIBase aiSprint;
    private EntityAIBase aiAttackTarget;
    public List<EntityLivingBase> interactingEntities;
    public ResourceLocation textureLocation;
    public ResourceLocation textureGlowLocation;
    public ResourceLocation textureCloakLocation;
    public EnumAnimation currentAnimation;
    public int npcVersion;
    public IChatMessages messages;
    public boolean updateClient;
    public boolean updateAI;
    public double field_20066_r;
    public double field_20065_s;
    public double field_20064_t;
    public double field_20063_u;
    public double field_20062_v;
    public double field_20061_w;
    private static final ItemStack[] lastActive;
    
    public EntityNPCInterface(final World world) {
        super(world);
        this.linkedName = "";
        this.linkedLast = 0L;
        this.baseHeight = 1.8f;
        this.wasKilled = false;
        this.hasDied = false;
        this.killedtime = 0L;
        this.totalTicksAlive = 0L;
        this.taskCount = 1;
        this.lastInteract = 0;
        this.interactingEntities = new ArrayList<EntityLivingBase>();
        this.textureLocation = null;
        this.textureGlowLocation = null;
        this.textureCloakLocation = null;
        this.currentAnimation = EnumAnimation.NONE;
        this.npcVersion = VersionCompatibility.ModRev;
        this.updateClient = false;
        this.updateAI = false;
        this.dialogs = new HashMap<Integer, DialogOption>();
        if (!CustomNpcs.DefaultInteractLine.isEmpty()) {
            this.advanced.interactLines.lines.put(0, new Line(CustomNpcs.DefaultInteractLine));
        }
        this.experienceValue = 0;
        final float scaleX = 0.9375f;
        this.scaleZ = scaleX;
        this.scaleY = scaleX;
        this.scaleX = scaleX;
        this.faction = this.getFaction();
        this.setFaction(this.faction.id);
        this.setSize(1.0f, 1.0f);
        this.updateTasks();
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.display = new DataDisplay(this);
        this.stats = new DataStats(this);
        this.ai = new DataAI(this);
        this.advanced = new DataAdvanced(this);
        this.inventory = new DataInventory(this);
        this.transform = new TransformData(this);
        this.script = new DataScript(this);
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue((double)this.stats.maxHealth);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue((double)CustomNpcs.NpcNavRange);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue((double)this.getSpeed());
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue((double)this.stats.getAttackStrength());
    }
    
    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(13, (Object)String.valueOf(""));
        this.dataWatcher.addObject(14, (Object)0);
        this.dataWatcher.addObject(15, (Object)0);
        this.dataWatcher.addObject(16, (Object)String.valueOf(""));
    }
    
    protected boolean isAIEnabled() {
        return true;
    }
    
    public boolean getLeashed() {
        return false;
    }
    
    public boolean isEntityAlive() {
        return super.isEntityAlive() && !this.isKilled();
    }
    
    public void onUpdate() {
        super.onUpdate();
        if (this.ticksExisted % 10 == 0) {
            this.script.callScript(EnumScriptType.TICK, new Object[0]);
        }
    }
    
    public void setWorld(final World world) {
        super.setWorld(world);
        this.script.setWorld(world);
    }
    
    public boolean attackEntityAsMob(final Entity par1Entity) {
        float f = this.stats.getAttackStrength();
        if (this.stats.attackSpeed < 10) {
            par1Entity.hurtResistantTime = 0;
        }
        if (par1Entity instanceof EntityLivingBase) {
            final ScriptEventAttack event = new ScriptEventAttack(f, (EntityLivingBase)par1Entity, false);
            if (this.script.callScript(EnumScriptType.ATTACK, "event", event, "target", par1Entity)) {
                return false;
            }
            f = event.getDamage();
        }
        final boolean var4 = par1Entity.attackEntityFrom((DamageSource)new NpcDamageSource("mob", (Entity)this), f);
        if (var4) {
            if (this.getOwner() instanceof EntityPlayer) {
                NPCEntityHelper.setRecentlyHit((EntityLivingBase)par1Entity);
            }
            if (this.stats.knockback > 0) {
                par1Entity.addVelocity((double)(-MathHelper.sin(this.rotationYaw * 3.1415927f / 180.0f) * this.stats.knockback * 0.5f), 0.1, (double)(MathHelper.cos(this.rotationYaw * 3.1415927f / 180.0f) * this.stats.knockback * 0.5f));
                this.motionX *= 0.6;
                this.motionZ *= 0.6;
            }
            if (this.advanced.role == EnumRoleType.Companion) {
                ((RoleCompanion)this.roleInterface).attackedEntity(par1Entity);
            }
        }
        if (this.stats.potionType != EnumPotionType.None) {
            if (this.stats.potionType != EnumPotionType.Fire) {
                ((EntityLivingBase)par1Entity).addPotionEffect(new PotionEffect(this.getPotionEffect(this.stats.potionType), this.stats.potionDuration * 20, this.stats.potionAmp));
            }
            else {
                par1Entity.setFire(this.stats.potionDuration);
            }
        }
        return var4;
    }
    
    public void onLivingUpdate() {
        if (CustomNpcs.FreezeNPCs) {
            return;
        }
        ++this.totalTicksAlive;
        this.updateArmSwingProgress();
        if (this.ticksExisted % 20 == 0) {
            this.faction = this.getFaction();
        }
        if (!this.worldObj.isRemote) {
            if (!this.isKilled() && this.ticksExisted % 20 == 0) {
                if (this.getHealth() < this.getMaxHealth()) {
                    if (this.stats.healthRegen > 0 && !this.isAttacking()) {
                        this.heal((float)this.stats.healthRegen);
                    }
                    if (this.stats.combatRegen > 0 && this.isAttacking()) {
                        this.heal((float)this.stats.combatRegen);
                    }
                }
                if (this.faction.getsAttacked && !this.isAttacking()) {
                    final List<EntityMob> list = (List<EntityMob>)this.worldObj.getEntitiesWithinAABB((Class)EntityMob.class, this.boundingBox.expand(16.0, 16.0, 16.0));
                    for (final EntityMob mob : list) {
                        if (mob.getAttackTarget() == null && this.canSee((Entity)mob)) {
                            if (mob instanceof EntityZombie && !mob.getEntityData().hasKey("AttackNpcs")) {
                                mob.tasks.addTask(2, (EntityAIBase)new EntityAIAttackOnCollide((EntityCreature)mob, (Class)EntityLivingBase.class, 1.0, false));
                                mob.getEntityData().setBoolean("AttackNpcs", true);
                            }
                            mob.setAttackTarget((EntityLivingBase)this);
                        }
                    }
                }
                if (this.linkedData != null && this.linkedData.time > this.linkedLast) {
                    LinkedNpcController.Instance.loadNpcData(this);
                }
                if (this.updateClient) {
                    final NBTTagCompound compound = this.writeSpawnData();
                    compound.setInteger("EntityId", this.getEntityId());
                    Server.sendAssociatedData((Entity)this, EnumPacketClient.UPDATE_NPC, compound);
                    this.updateClient = false;
                }
                if (this.updateAI) {
                    this.updateTasks();
                    this.updateAI = false;
                }
            }
            if (this.getHealth() <= 0.0f) {
                this.clearActivePotions();
                this.setBoolFlag(true, 8);
            }
            this.setBoolFlag(this.getAttackTarget() != null, 4);
            this.setBoolFlag(!this.getNavigator().noPath(), 1);
            this.setBoolFlag(this.isInteracting(), 2);
            this.onCollide();
        }
        if (this.wasKilled != this.isKilled() && this.wasKilled) {
            this.reset();
        }
        this.wasKilled = this.isKilled();
        if (this.worldObj.isDaytime() && !this.worldObj.isRemote && this.stats.burnInSun) {
            final float f = this.getBrightness(1.0f);
            if (f > 0.5f && this.rand.nextFloat() * 30.0f < (f - 0.4f) * 2.0f && this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ))) {
                this.setFire(8);
            }
        }
        super.onLivingUpdate();
        if (this.worldObj.isRemote) {
            if (this.roleInterface != null) {
                this.roleInterface.clientUpdate();
            }
            if (!this.display.cloakTexture.isEmpty()) {
                this.cloakUpdate();
            }
            if (this.currentAnimation.ordinal() != this.dataWatcher.getWatchableObjectInt(14)) {
                this.currentAnimation = EnumAnimation.values()[this.dataWatcher.getWatchableObjectInt(14)];
                this.updateHitbox();
            }
            if (this.advanced.job == EnumJobType.Bard) {
                ((JobBard)this.jobInterface).onLivingUpdate();
            }
        }
    }
    
    public boolean interact(final EntityPlayer player) {
        if (this.worldObj.isRemote) {
            return false;
        }
        final ItemStack currentItem = player.inventory.getCurrentItem();
        if (currentItem != null) {
            final Item item = currentItem.getItem();
            if (item == CustomItems.cloner || item == CustomItems.wand || item == CustomItems.mount || item == CustomItems.scripter) {
                this.setAttackTarget(null);
                this.setRevengeTarget((EntityLivingBase)null);
                return true;
            }
            if (item == CustomItems.moving) {
                this.setAttackTarget(null);
                if (currentItem.stackTagCompound == null) {
                    currentItem.stackTagCompound = new NBTTagCompound();
                }
                currentItem.stackTagCompound.setInteger("NPCID", this.getEntityId());
                player.addChatMessage((IChatComponent)new ChatComponentTranslation("Registered " + this.getCommandSenderName() + " to your NPC Pather", new Object[0]));
                return true;
            }
        }
        if (this.script.callScript(EnumScriptType.INTERACT, "player", player) || this.isAttacking() || this.isKilled() || this.faction.isAggressiveToPlayer(player)) {
            return false;
        }
        this.addInteract((EntityLivingBase)player);
        final Dialog dialog = this.getDialog(player);
        final PlayerQuestData playerdata = PlayerDataController.instance.getPlayerData(player).questData;
        final QuestData data = playerdata.getQuestCompletion(player, this);
        if (data != null) {
            Server.sendData((EntityPlayerMP)player, EnumPacketClient.QUEST_COMPLETION, data.quest.writeToNBT(new NBTTagCompound()));
        }
        else if (dialog != null) {
            NoppesUtilServer.openDialog(player, this, dialog);
        }
        else if (this.roleInterface != null) {
            this.roleInterface.interact(player);
        }
        else {
            this.say(player, this.advanced.getInteractLine());
        }
        return true;
    }
    
    public void addInteract(final EntityLivingBase entity) {
        if (!this.ai.stopAndInteract || this.isAttacking() || !entity.isEntityAlive()) {
            return;
        }
        if (this.ticksExisted - this.lastInteract < 180) {
            this.interactingEntities.clear();
        }
        this.getNavigator().clearPathEntity();
        this.lastInteract = this.ticksExisted;
        if (!this.interactingEntities.contains(entity)) {
            this.interactingEntities.add(entity);
        }
    }
    
    public boolean isInteracting() {
        return this.ticksExisted - this.lastInteract < 40 || (this.isRemote() && this.getBoolFlag(2)) || (this.ai.stopAndInteract && !this.interactingEntities.isEmpty() && this.ticksExisted - this.lastInteract < 180);
    }
    
    private Dialog getDialog(final EntityPlayer player) {
        for (final DialogOption option : this.dialogs.values()) {
            if (option == null) {
                continue;
            }
            if (!option.hasDialog()) {
                continue;
            }
            final Dialog dialog = option.getDialog();
            if (dialog.availability.isAvailable(player)) {
                return dialog;
            }
        }
        return null;
    }
    
    public boolean attackEntityFrom(final DamageSource damagesource, float i) {
        if (this.worldObj.isRemote || CustomNpcs.FreezeNPCs || damagesource.damageType.equals("inWall")) {
            return false;
        }
        if (damagesource.damageType.equals("outOfWorld") && this.isKilled()) {
            this.reset();
        }
        i = this.stats.resistances.applyResistance(damagesource, i);
        if (this.hurtResistantTime > this.maxHurtResistantTime / 2.0f && i <= this.lastDamage) {
            return false;
        }
        final Entity entity = damagesource.getEntity();
        EntityLivingBase attackingEntity = null;
        if (entity instanceof EntityLivingBase) {
            attackingEntity = (EntityLivingBase)entity;
        }
        if (entity instanceof EntityArrow && ((EntityArrow)entity).shootingEntity instanceof EntityLivingBase) {
            attackingEntity = (EntityLivingBase)((EntityArrow)entity).shootingEntity;
        }
        else if (entity instanceof EntityThrowable) {
            attackingEntity = ((EntityThrowable)entity).getThrower();
        }
        if (attackingEntity != null && attackingEntity == this.getOwner()) {
            return false;
        }
        if (attackingEntity instanceof EntityNPCInterface) {
            final EntityNPCInterface npc = (EntityNPCInterface)attackingEntity;
            if (npc.faction.id == this.faction.id) {
                return false;
            }
            if (npc.getOwner() instanceof EntityPlayer) {
                this.recentlyHit = 100;
            }
        }
        else if (attackingEntity instanceof EntityPlayer && this.faction.isFriendlyToPlayer((EntityPlayer)attackingEntity)) {
            return false;
        }
        final ScriptEventDamaged result = new ScriptEventDamaged(i, attackingEntity, damagesource);
        if (this.script.callScript(EnumScriptType.DAMAGED, "event", result) || this.isKilled()) {
            return false;
        }
        i = result.getDamage();
        if (this.isKilled()) {
            return false;
        }
        if (attackingEntity == null) {
            return super.attackEntityFrom(damagesource, i);
        }
        try {
            if (this.isAttacking()) {
                if (this.getAttackTarget() != null && attackingEntity != null && this.getDistanceSqToEntity((Entity)this.getAttackTarget()) > this.getDistanceSqToEntity((Entity)attackingEntity)) {
                    this.setAttackTarget(attackingEntity);
                }
                return super.attackEntityFrom(damagesource, i);
            }
            if (i > 0.0f) {
                final List<EntityNPCInterface> inRange = (List<EntityNPCInterface>)this.worldObj.getEntitiesWithinAABB((Class)EntityNPCInterface.class, this.boundingBox.expand(32.0, 16.0, 32.0));
                for (final EntityNPCInterface npc2 : inRange) {
                    if (!npc2.isKilled() && npc2.advanced.defendFaction) {
                        if (npc2.faction.id != this.faction.id) {
                            continue;
                        }
                        if (!npc2.canSee((Entity)this) && !npc2.ai.directLOS && !npc2.canSee((Entity)attackingEntity)) {
                            continue;
                        }
                        npc2.onAttack(attackingEntity);
                    }
                }
                this.setAttackTarget(attackingEntity);
            }
            return super.attackEntityFrom(damagesource, i);
        }
        finally {
            if (result.getClearTarget()) {
                this.setAttackTarget(null);
                this.setRevengeTarget((EntityLivingBase)null);
            }
        }
    }
    
    public void onAttack(final EntityLivingBase entity) {
        if (entity == null || entity == this || this.isAttacking() || this.ai.onAttack == 3 || entity == this.getOwner()) {
            return;
        }
        super.setAttackTarget(entity);
    }
    
    public void setAttackTarget(EntityLivingBase entity) {
        if ((entity instanceof EntityPlayer && ((EntityPlayer)entity).capabilities.disableDamage) || (entity != null && entity == this.getOwner())) {
            return;
        }
        if (this.getAttackTarget() != entity && entity != null) {
            final ScriptEventTarget event = new ScriptEventTarget(entity);
            if (this.script.callScript(EnumScriptType.TARGET, "event", event)) {
                return;
            }
            if (event.getTarget() == null) {
                entity = null;
            }
            else {
                entity = event.getTarget().getMinecraftEntity();
            }
        }
        if (entity != null && entity != this && this.ai.onAttack != 3 && !this.isAttacking() && !this.isRemote()) {
            final Line line = this.advanced.getAttackLine();
            if (line != null) {
                this.saySurrounding(line.formatTarget(entity));
            }
        }
        super.setAttackTarget(entity);
    }
    
    public void attackEntityWithRangedAttack(final EntityLivingBase entity, final float f) {
        final ItemStack proj = this.inventory.getProjectile();
        if (proj == null) {
            this.updateTasks();
            return;
        }
        final ScriptEventAttack event = new ScriptEventAttack(this.stats.pDamage, entity, true);
        if (this.script.callScript(EnumScriptType.ATTACK, "event", event, "target", entity)) {
            return;
        }
        for (int i = 0; i < this.stats.shotCount; ++i) {
            final EntityProjectile projectile = this.shoot(entity, this.stats.accuracy, proj, f == 1.0f);
            projectile.damage = event.getDamage();
        }
        this.playSound(this.stats.fireSound, 2.0f, 1.0f);
    }
    
    public EntityProjectile shoot(final EntityLivingBase entity, final int accuracy, final ItemStack proj, final boolean indirect) {
        return this.shoot(entity.posX, entity.boundingBox.minY + entity.height / 2.0f, entity.posZ, accuracy, proj, indirect);
    }
    
    public EntityProjectile shoot(final double x, final double y, final double z, final int accuracy, final ItemStack proj, final boolean indirect) {
        final EntityProjectile projectile = new EntityProjectile(this.worldObj, (EntityLivingBase)this, proj.copy(), true);
        final double varX = x - this.posX;
        final double varY = y - (this.posY + this.getEyeHeight());
        final double varZ = z - this.posZ;
        final float varF = projectile.hasGravity() ? MathHelper.sqrt_double(varX * varX + varZ * varZ) : 0.0f;
        final float angle = projectile.getAngleForXYZ(varX, varY, varZ, varF, indirect);
        final float acc = 20.0f - MathHelper.floor_float(accuracy / 5.0f);
        projectile.setThrowableHeading(varX, varY, varZ, angle, acc);
        this.worldObj.spawnEntityInWorld((Entity)projectile);
        return projectile;
    }
    
    private void clearTasks(final EntityAITasks tasks) {
        final Iterator iterator = tasks.taskEntries.iterator();
        final List<EntityAITasks.EntityAITaskEntry> list = new ArrayList<EntityAITasks.EntityAITaskEntry>(tasks.taskEntries);
        for (final EntityAITasks.EntityAITaskEntry entityaitaskentry : list) {
            this.tasks.removeTask(entityaitaskentry.action);
        }
        tasks.taskEntries = new ArrayList();
    }
    
    private void updateTasks() {
        if (this.worldObj == null || this.worldObj.isRemote) {
            return;
        }
        final EntityAIRangedAttack aiLeap = null;
        this.aiRange = aiLeap;
        this.aiSprint = aiLeap;
        this.aiResponse = aiLeap;
        this.aiAttackTarget = aiLeap;
        this.aiLeap = aiLeap;
        this.clearTasks(this.tasks);
        this.clearTasks(this.targetTasks);
        final IEntitySelector attackEntitySelector = (IEntitySelector)new NPCAttackSelector(this);
        this.targetTasks.addTask(0, (EntityAIBase)new EntityAIClearTarget(this));
        this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
        this.targetTasks.addTask(2, (EntityAIBase)new EntityAIClosestTarget(this, EntityLivingBase.class, 4, this.ai.directLOS, false, attackEntitySelector));
        this.targetTasks.addTask(3, (EntityAIBase)new EntityAIOwnerHurtByTarget(this));
        this.targetTasks.addTask(4, (EntityAIBase)new EntityAIOwnerHurtTarget(this));
        this.tasks.addTask(0, (EntityAIBase)new EntityAIWaterNav(this));
        this.taskCount = 1;
        this.doorInteractType();
        this.seekShelter();
        this.setResponse();
        this.setMoveType();
        this.addRegularEntries();
    }
    
    private void removeTask(final EntityAIBase task) {
        if (task != null) {
            this.tasks.removeTask(task);
        }
    }
    
    public void setResponse() {
        this.removeTask(this.aiLeap);
        this.removeTask(this.aiResponse);
        this.removeTask(this.aiSprint);
        this.removeTask(this.aiAttackTarget);
        this.removeTask(this.aiRange);
        final EntityAIRangedAttack aiLeap = null;
        this.aiRange = aiLeap;
        this.aiSprint = aiLeap;
        this.aiResponse = aiLeap;
        this.aiAttackTarget = aiLeap;
        this.aiLeap = aiLeap;
        if (this.ai.onAttack == 1) {
            this.tasks.addTask(this.taskCount++, this.aiResponse = new EntityAIPanic(this, 1.2f));
        }
        else if (this.ai.onAttack == 2) {
            this.tasks.addTask(this.taskCount++, this.aiResponse = new EntityAIAvoidTarget(this));
            this.setCanSprint();
        }
        else if (this.ai.onAttack == 0) {
            this.setCanLeap();
            this.setCanSprint();
            if (this.inventory.getProjectile() == null || this.ai.useRangeMelee == 2) {
                switch (this.ai.tacticalVariant) {
                    case Dodge: {
                        this.tasks.addTask(this.taskCount++, this.aiResponse = new EntityAIZigZagTarget(this, 1.0, this.ai.tacticalRadius));
                        break;
                    }
                    case Surround: {
                        this.tasks.addTask(this.taskCount++, this.aiResponse = new EntityAIOrbitTarget(this, 1.0, this.ai.tacticalRadius, true));
                        break;
                    }
                    case HitNRun: {
                        this.tasks.addTask(this.taskCount++, this.aiResponse = new EntityAIAvoidTarget(this));
                        break;
                    }
                    case Ambush: {
                        this.tasks.addTask(this.taskCount++, this.aiResponse = new EntityAIAmbushTarget(this, 1.2, this.ai.tacticalRadius, false));
                        break;
                    }
                    case Stalk: {
                        this.tasks.addTask(this.taskCount++, this.aiResponse = new EntityAIStalkTarget(this, this.ai.tacticalRadius));
                        break;
                    }
                }
            }
            else {
                switch (this.ai.tacticalVariant) {
                    case Dodge: {
                        this.tasks.addTask(this.taskCount++, this.aiResponse = new EntityAIDodgeShoot(this));
                        break;
                    }
                    case Surround: {
                        this.tasks.addTask(this.taskCount++, this.aiResponse = new EntityAIOrbitTarget(this, 1.0, this.stats.rangedRange, false));
                        break;
                    }
                    case HitNRun: {
                        this.tasks.addTask(this.taskCount++, this.aiResponse = new EntityAIAvoidTarget(this));
                        break;
                    }
                    case Ambush: {
                        this.tasks.addTask(this.taskCount++, this.aiResponse = new EntityAIAmbushTarget(this, 1.2, this.ai.tacticalRadius, false));
                        break;
                    }
                    case Stalk: {
                        this.tasks.addTask(this.taskCount++, this.aiResponse = new EntityAIStalkTarget(this, this.ai.tacticalRadius));
                        break;
                    }
                }
            }
            this.tasks.addTask(this.taskCount, this.aiAttackTarget = new EntityAIAttackTarget(this));
            ((EntityAIAttackTarget)this.aiAttackTarget).navOverride(this.ai.tacticalVariant == EnumNavType.None);
            if (this.inventory.getProjectile() != null) {
                this.tasks.addTask(this.taskCount++, (EntityAIBase)(this.aiRange = new EntityAIRangedAttack((IRangedAttackMob)this)));
                this.aiRange.navOverride(this.ai.tacticalVariant == EnumNavType.None);
            }
        }
        else if (this.ai.onAttack == 3) {}
    }
    
    public void setMoveType() {
        if (this.ai.movingType == EnumMovingType.Wandering) {
            this.tasks.addTask(this.taskCount++, (EntityAIBase)new EntityAIWander(this));
        }
        if (this.ai.movingType == EnumMovingType.MovingPath) {
            this.tasks.addTask(this.taskCount++, (EntityAIBase)new EntityAIMovingPath(this));
        }
    }
    
    public void doorInteractType() {
        EntityAIBase aiDoor = null;
        if (this.ai.doorInteract == 1) {
            this.tasks.addTask(this.taskCount++, aiDoor = (EntityAIBase)new EntityAIOpenDoor((EntityLiving)this, true));
        }
        else if (this.ai.doorInteract == 0) {
            this.tasks.addTask(this.taskCount++, aiDoor = (EntityAIBase)new EntityAIBustDoor((EntityLiving)this));
        }
        this.getNavigator().setBreakDoors(aiDoor != null);
    }
    
    public void seekShelter() {
        if (this.ai.findShelter == 0) {
            this.tasks.addTask(this.taskCount++, (EntityAIBase)new EntityAIMoveIndoors(this));
        }
        else if (this.ai.findShelter == 1) {
            this.tasks.addTask(this.taskCount++, (EntityAIBase)new EntityAIRestrictSun((EntityCreature)this));
            this.tasks.addTask(this.taskCount++, (EntityAIBase)new EntityAIFindShade(this));
        }
    }
    
    public void setCanLeap() {
        if (this.ai.canLeap) {
            this.tasks.addTask(this.taskCount++, this.aiLeap = (EntityAIBase)new EntityAILeapAtTarget((EntityLiving)this, 0.4f));
        }
    }
    
    public void setCanSprint() {
        if (this.ai.canSprint) {
            this.tasks.addTask(this.taskCount++, this.aiSprint = new EntityAISprintToTarget(this));
        }
    }
    
    public void addRegularEntries() {
        this.tasks.addTask(this.taskCount++, (EntityAIBase)new EntityAIReturn(this));
        this.tasks.addTask(this.taskCount++, (EntityAIBase)new EntityAIFollow(this));
        if (this.ai.standingType != EnumStandingType.NoRotation && this.ai.standingType != EnumStandingType.HeadRotation) {
            this.tasks.addTask(this.taskCount++, (EntityAIBase)new EntityAIWatchClosest(this, EntityLivingBase.class, 5.0f));
        }
        this.tasks.addTask(this.taskCount++, (EntityAIBase)new EntityAILook(this));
        this.tasks.addTask(this.taskCount++, (EntityAIBase)new EntityAIWorldLines(this));
        this.tasks.addTask(this.taskCount++, (EntityAIBase)new EntityAIJob(this));
        this.tasks.addTask(this.taskCount++, (EntityAIBase)new EntityAIRole(this));
        this.tasks.addTask(this.taskCount++, (EntityAIBase)new EntityAIAnimation(this));
        if (this.transform.isValid()) {
            this.tasks.addTask(this.taskCount++, (EntityAIBase)new EntityAITransform(this));
        }
    }
    
    public float getSpeed() {
        return this.ai.getWalkingSpeed() / 20.0f;
    }
    
    public float getBlockPathWeight(final int par1, final int par2, final int par3) {
        float weight = this.worldObj.getLightBrightness(par1, par2, par3) - 0.5f;
        final Block block = this.worldObj.getBlock(par1, par2, par3);
        if (block.isOpaqueCube()) {
            weight += 10.0f;
        }
        return weight;
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
    
    protected int decreaseAirSupply(final int par1) {
        if (!this.stats.canDrown) {
            return par1;
        }
        return super.decreaseAirSupply(par1);
    }
    
    public EnumCreatureAttribute getCreatureAttribute() {
        return this.stats.creatureType;
    }
    
    protected String getLivingSound() {
        if (!this.isEntityAlive()) {
            return null;
        }
        if (this.getAttackTarget() != null) {
            return this.advanced.angrySound.isEmpty() ? null : this.advanced.angrySound;
        }
        return this.advanced.idleSound.isEmpty() ? null : this.advanced.idleSound;
    }
    
    public int getTalkInterval() {
        return 160;
    }
    
    protected String getHurtSound() {
        if (this.advanced.hurtSound.isEmpty()) {
            return null;
        }
        return this.advanced.hurtSound;
    }
    
    protected String getDeathSound() {
        if (this.advanced.deathSound.isEmpty()) {
            return null;
        }
        return this.advanced.deathSound;
    }
    
    protected float getSoundPitch() {
        if (this.advanced.disablePitch) {
            return 1.0f;
        }
        return super.getSoundPitch();
    }
    
    protected void func_145780_a(final int p_145780_1_, final int p_145780_2_, final int p_145780_3_, final Block p_145780_4_) {
        if (!this.advanced.stepSound.equals("")) {
            this.playSound(this.advanced.stepSound, 0.15f, 1.0f);
        }
        else {
            super.func_145780_a(p_145780_1_, p_145780_2_, p_145780_3_, p_145780_4_);
        }
    }
    
    public EntityPlayerMP getFakePlayer() {
        if (this.worldObj.isRemote) {
            return null;
        }
        if (EntityNPCInterface.chateventPlayer == null) {
            EntityNPCInterface.chateventPlayer = new FakePlayer((WorldServer)this.worldObj, (GameProfile)EntityNPCInterface.chateventProfile);
        }
        EntityUtil.Copy((EntityLivingBase)this, (EntityLivingBase)EntityNPCInterface.chateventPlayer);
        EntityNPCInterface.chateventProfile.npc = this;
        EntityNPCInterface.chateventPlayer.refreshDisplayName();
        return (EntityPlayerMP)EntityNPCInterface.chateventPlayer;
    }
    
    public void saySurrounding(final Line line) {
        if (line == null || line.text == null) {
            return;
        }
        final ServerChatEvent event = new ServerChatEvent(this.getFakePlayer(), line.text, new ChatComponentTranslation(line.text.replace("%", "%%"), new Object[0]));
        if (MinecraftForge.EVENT_BUS.post((Event)event) || event.component == null) {
            return;
        }
        line.text = event.component.getUnformattedText().replace("%%", "%");
        final List<EntityPlayer> inRange = (List<EntityPlayer>)this.worldObj.getEntitiesWithinAABB((Class)EntityPlayer.class, this.boundingBox.expand(20.0, 20.0, 20.0));
        for (final EntityPlayer player : inRange) {
            this.say(player, line);
        }
    }
    
    public void say(final EntityPlayer player, final Line line) {
        if (line == null || !this.canSee((Entity)player) || line.text == null) {
            return;
        }
        if (!line.sound.isEmpty()) {
            Server.sendData((EntityPlayerMP)player, EnumPacketClient.PLAY_SOUND, line.sound, (float)this.posX, (float)this.posY, (float)this.posZ);
        }
        Server.sendData((EntityPlayerMP)player, EnumPacketClient.CHATBUBBLE, this.getEntityId(), line.text, !line.hideText);
    }
    
    public boolean getAlwaysRenderNameTagForRender() {
        return true;
    }
    
    public void addVelocity(final double d, final double d1, final double d2) {
        if (this.isWalking() && !this.isKilled()) {
            super.addVelocity(d, d1, d2);
        }
    }
    
    public void readEntityFromNBT(final NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        this.npcVersion = compound.getInteger("ModRev");
        VersionCompatibility.CheckNpcCompatibility(this, compound);
        this.display.readToNBT(compound);
        this.stats.readToNBT(compound);
        this.ai.readToNBT(compound);
        this.script.readFromNBT(compound);
        this.advanced.readToNBT(compound);
        if (this.advanced.role != EnumRoleType.None && this.roleInterface != null) {
            this.roleInterface.readFromNBT(compound);
        }
        if (this.advanced.job != EnumJobType.None && this.jobInterface != null) {
            this.jobInterface.readFromNBT(compound);
        }
        this.inventory.readEntityFromNBT(compound);
        this.transform.readToNBT(compound);
        this.killedtime = compound.getLong("KilledTime");
        this.totalTicksAlive = compound.getLong("TotalTicksAlive");
        this.linkedName = compound.getString("LinkedNpcName");
        if (!this.isRemote()) {
            LinkedNpcController.Instance.loadNpcData(this);
        }
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue((double)CustomNpcs.NpcNavRange);
        this.updateTasks();
    }
    
    public void writeEntityToNBT(final NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
        this.display.writeToNBT(compound);
        this.stats.writeToNBT(compound);
        this.ai.writeToNBT(compound);
        this.script.writeToNBT(compound);
        this.advanced.writeToNBT(compound);
        if (this.advanced.role != EnumRoleType.None && this.roleInterface != null) {
            this.roleInterface.writeToNBT(compound);
        }
        if (this.advanced.job != EnumJobType.None && this.jobInterface != null) {
            this.jobInterface.writeToNBT(compound);
        }
        this.inventory.writeEntityToNBT(compound);
        this.transform.writeToNBT(compound);
        compound.setLong("KilledTime", this.killedtime);
        compound.setLong("TotalTicksAlive", this.totalTicksAlive);
        compound.setInteger("ModRev", this.npcVersion);
        compound.setString("LinkedNpcName", this.linkedName);
    }
    
    public void updateHitbox() {
        if (this.currentAnimation == EnumAnimation.LYING || this.currentAnimation == EnumAnimation.CRAWLING) {
            this.width = 0.8f;
            this.height = 0.4f;
        }
        else if (this.isRiding()) {
            this.width = 0.6f;
            this.height = this.baseHeight * 0.77f;
        }
        else {
            this.width = 0.6f;
            this.height = this.baseHeight;
        }
        this.width = this.width / 5.0f * this.display.modelSize;
        this.height = this.height / 5.0f * this.display.modelSize;
        this.setPosition(this.posX, this.posY, this.posZ);
    }
    
    public void onDeathUpdate() {
        if (this.stats.spawnCycle == 3) {
            super.onDeathUpdate();
            return;
        }
        ++this.deathTime;
        if (this.worldObj.isRemote) {
            return;
        }
        if (!this.hasDied) {
            this.setDead();
        }
        if (this.killedtime < System.currentTimeMillis() && (this.stats.spawnCycle == 0 || (this.worldObj.isDaytime() && this.stats.spawnCycle == 1) || (!this.worldObj.isDaytime() && this.stats.spawnCycle == 2))) {
            this.reset();
        }
    }
    
    public void reset() {
        this.hasDied = false;
        this.isDead = false;
        this.setSprinting(this.wasKilled = false);
        this.setHealth(this.getMaxHealth());
        this.dataWatcher.updateObject(14, (Object)0);
        this.dataWatcher.updateObject(15, (Object)0);
        this.setAttackTarget(null);
        this.setRevengeTarget((EntityLivingBase)null);
        this.deathTime = 0;
        if (this.ai.returnToStart && !this.hasOwner()) {
            this.setLocationAndAngles((double)this.getStartXPos(), this.getStartYPos(), (double)this.getStartZPos(), this.rotationYaw, this.rotationPitch);
        }
        this.killedtime = 0L;
        this.extinguish();
        this.clearActivePotions();
        this.moveEntityWithHeading(0.0f, 0.0f);
        this.distanceWalkedModified = 0.0f;
        this.getNavigator().clearPathEntity();
        this.currentAnimation = EnumAnimation.NONE;
        this.updateHitbox();
        this.updateAI = true;
        this.ai.movingPos = 0;
        if (this.getOwner() != null) {
            this.getOwner().setLastAttacker((Entity)null);
        }
        if (this.jobInterface != null) {
            this.jobInterface.reset();
        }
        this.script.callScript(EnumScriptType.INIT, new Object[0]);
    }
    
    public void onCollide() {
        if (!this.isEntityAlive() || this.ticksExisted % 4 != 0) {
            return;
        }
        AxisAlignedBB axisalignedbb = null;
        if (this.ridingEntity != null && this.ridingEntity.isEntityAlive()) {
            axisalignedbb = this.boundingBox.func_111270_a(this.ridingEntity.boundingBox).expand(1.0, 0.0, 1.0);
        }
        else {
            axisalignedbb = this.boundingBox.expand(1.0, 0.5, 1.0);
        }
        final List list = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, axisalignedbb);
        if (list == null) {
            return;
        }
        for (int i = 0; i < list.size(); ++i) {
            final Entity entity = (Entity) list.get(i);
            if (entity.isEntityAlive()) {
                this.script.callScript(EnumScriptType.COLLIDE, "entity", entity);
            }
        }
    }
    
    public void setInPortal() {
    }
    
    public void cloakUpdate() {
        this.field_20066_r = this.field_20063_u;
        this.field_20065_s = this.field_20062_v;
        this.field_20064_t = this.field_20061_w;
        final double d = this.posX - this.field_20063_u;
        final double d2 = this.posY - this.field_20062_v;
        final double d3 = this.posZ - this.field_20061_w;
        final double d4 = 10.0;
        if (d > d4) {
            final double posX = this.posX;
            this.field_20063_u = posX;
            this.field_20066_r = posX;
        }
        if (d3 > d4) {
            final double posZ = this.posZ;
            this.field_20061_w = posZ;
            this.field_20064_t = posZ;
        }
        if (d2 > d4) {
            final double posY = this.posY;
            this.field_20062_v = posY;
            this.field_20065_s = posY;
        }
        if (d < -d4) {
            final double posX2 = this.posX;
            this.field_20063_u = posX2;
            this.field_20066_r = posX2;
        }
        if (d3 < -d4) {
            final double posZ2 = this.posZ;
            this.field_20061_w = posZ2;
            this.field_20064_t = posZ2;
        }
        if (d2 < -d4) {
            final double posY2 = this.posY;
            this.field_20062_v = posY2;
            this.field_20065_s = posY2;
        }
        this.field_20063_u += d * 0.25;
        this.field_20061_w += d3 * 0.25;
        this.field_20062_v += d2 * 0.25;
    }
    
    protected boolean canDespawn() {
        return this.stats.canDespawn;
    }
    
    public ItemStack getHeldItem() {
        if (this.isAttacking()) {
            return this.inventory.getWeapon();
        }
        if (this.advanced.role == EnumRoleType.Companion) {
            return ((RoleCompanion)this.roleInterface).getHeldItem();
        }
        if (this.jobInterface != null && this.jobInterface.overrideMainHand) {
            return this.jobInterface.mainhand;
        }
        return this.inventory.getWeapon();
    }
    
    public ItemStack getEquipmentInSlot(final int slot) {
        if (slot == 0) {
            return this.inventory.weapons.get(0);
        }
        return this.inventory.armorItemInSlot(4 - slot);
    }
    
    public ItemStack func_130225_q(final int slot) {
        return this.inventory.armorItemInSlot(3 - slot);
    }
    
    public void setCurrentItemOrArmor(final int slot, final ItemStack item) {
        if (slot == 0) {
            this.inventory.setWeapon(item);
        }
        else {
            this.inventory.armor.put(4 - slot, item);
        }
    }
    
    public ItemStack[] getLastActiveItems() {
        return EntityNPCInterface.lastActive;
    }
    
    public ItemStack getOffHand() {
        if (this.isAttacking()) {
            return this.inventory.getOffHand();
        }
        if (this.jobInterface != null && this.jobInterface.overrideOffHand) {
            return this.jobInterface.offhand;
        }
        return this.inventory.getOffHand();
    }
    
    public void onDeath(final DamageSource damagesource) {
        this.setSprinting(false);
        this.getNavigator().clearPathEntity();
        this.extinguish();
        this.clearActivePotions();
        final Entity entity = damagesource.getEntity();
        EntityLivingBase attackingEntity = null;
        if (entity instanceof EntityLivingBase) {
            attackingEntity = (EntityLivingBase)entity;
        }
        if (entity instanceof EntityArrow && ((EntityArrow)entity).shootingEntity instanceof EntityLivingBase) {
            attackingEntity = (EntityLivingBase)((EntityArrow)entity).shootingEntity;
        }
        else if (entity instanceof EntityThrowable) {
            attackingEntity = ((EntityThrowable)entity).getThrower();
        }
        final ScriptEventKilled result = new ScriptEventKilled(attackingEntity, damagesource);
        if (this.script.callScript(EnumScriptType.KILLED, "event", result)) {
            return;
        }
        if (!this.isRemote()) {
            if (this.recentlyHit > 0) {
                this.inventory.dropStuff(entity, damagesource);
            }
            final Line line = this.advanced.getKilledLine();
            if (line != null) {
                this.saySurrounding(line.formatTarget(attackingEntity));
            }
        }
        super.onDeath(damagesource);
    }
    
    public void setDead() {
        this.hasDied = true;
        if (this.worldObj.isRemote || this.stats.spawnCycle == 3) {
            this.spawnExplosionParticle();
            this.delete();
        }
        else {
            if (this.riddenByEntity != null) {
                this.riddenByEntity.mountEntity((Entity)null);
            }
            if (this.ridingEntity != null) {
                this.mountEntity((Entity)null);
            }
            this.setHealth(-1.0f);
            this.setSprinting(false);
            this.getNavigator().clearPathEntity();
            if (this.killedtime <= 0L) {
                this.killedtime = this.stats.respawnTime * 1000 + System.currentTimeMillis();
            }
            if (this.advanced.role != EnumRoleType.None && this.roleInterface != null) {
                this.roleInterface.killed();
            }
            if (this.advanced.job != EnumJobType.None && this.jobInterface != null) {
                this.jobInterface.killed();
            }
        }
    }
    
    public void delete() {
        if (this.advanced.role != EnumRoleType.None && this.roleInterface != null) {
            this.roleInterface.delete();
        }
        if (this.advanced.job != EnumJobType.None && this.jobInterface != null) {
            this.jobInterface.delete();
        }
        super.setDead();
    }
    
    public float getStartXPos() {
        return this.getStartPos()[0] + this.ai.bodyOffsetX / 10.0f;
    }
    
    public float getStartZPos() {
        return this.getStartPos()[2] + this.ai.bodyOffsetZ / 10.0f;
    }
    
    public int[] getStartPos() {
        if (this.ai.startPos == null || this.ai.startPos.length != 3) {
            this.ai.startPos = new int[] { MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ) };
        }
        return this.ai.startPos;
    }
    
    public boolean isVeryNearAssignedPlace() {
        final double xx = this.posX - this.getStartXPos();
        final double zz = this.posZ - this.getStartZPos();
        return xx >= -0.2 && xx <= 0.2 && zz >= -0.2 && zz <= 0.2;
    }
    
    public IIcon getItemIcon(final ItemStack par1ItemStack, final int par2) {
        if (par1ItemStack.getItem() == Items.bow) {
            return Items.bow.getIcon(par1ItemStack, par2);
        }
        final EntityPlayer player = CustomNpcs.proxy.getPlayer();
        if (player == null) {
            return super.getItemIcon(par1ItemStack, par2);
        }
        return player.getItemIcon(par1ItemStack, par2);
    }
    
    public double getStartYPos() {
        final int i = this.getStartPos()[0];
        final int j = this.getStartPos()[1];
        final int k = this.getStartPos()[2];
        double yy = 0.0;
        for (int ii = j; ii >= 0; --ii) {
            final Block block = this.worldObj.getBlock(i, ii, k);
            if (block != null) {
                final AxisAlignedBB bb = block.getCollisionBoundingBoxFromPool(this.worldObj, i, ii, k);
                if (bb != null) {
                    yy = bb.maxY;
                    break;
                }
            }
        }
        if (yy == 0.0) {
            this.setDead();
        }
        yy += 0.5;
        return yy;
    }
    
    public void givePlayerItem(final EntityPlayer player, ItemStack item) {
        if (this.worldObj.isRemote) {
            return;
        }
        item = item.copy();
        final float f = 0.7f;
        final double d = this.worldObj.rand.nextFloat() * f + (1.0f - f);
        final double d2 = this.worldObj.rand.nextFloat() * f + (1.0f - f);
        final double d3 = this.worldObj.rand.nextFloat() * f + (1.0f - f);
        final EntityItem entityitem = new EntityItem(this.worldObj, this.posX + d, this.posY + d2, this.posZ + d3, item);
        entityitem.delayBeforeCanPickup = 2;
        this.worldObj.spawnEntityInWorld((Entity)entityitem);
        final int i = item.stackSize;
        if (player.inventory.addItemStackToInventory(item)) {
            this.worldObj.playSoundAtEntity((Entity)entityitem, "random.pop", 0.2f, ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.7f + 1.0f) * 2.0f);
            player.onItemPickup((Entity)entityitem, i);
            if (item.stackSize <= 0) {
                entityitem.setDead();
            }
        }
    }
    
    public boolean isPlayerSleeping() {
        return this.currentAnimation == EnumAnimation.LYING && !this.isAttacking();
    }
    
    public boolean isRiding() {
        return (this.currentAnimation == EnumAnimation.SITTING && !this.isAttacking()) || this.ridingEntity != null;
    }
    
    public boolean isWalking() {
        return this.ai.movingType != EnumMovingType.Standing || this.isAttacking() || this.isFollower() || this.getBoolFlag(1);
    }
    
    public void setBoolFlag(final boolean bo, final int id) {
        final int i = this.dataWatcher.getWatchableObjectInt(15);
        if (bo && (i & id) == 0x0) {
            this.dataWatcher.updateObject(15, (Object)(i | id));
        }
        if (!bo && (i & id) != 0x0) {
            this.dataWatcher.updateObject(15, (Object)(i - id));
        }
    }
    
    public boolean getBoolFlag(final int id) {
        return (this.dataWatcher.getWatchableObjectInt(15) & id) != 0x0;
    }
    
    public boolean isSneaking() {
        return this.currentAnimation == EnumAnimation.SNEAKING;
    }
    
    public void knockBack(final Entity par1Entity, final float par2, final double par3, final double par5) {
        if (this.stats.resistances.knockback >= 2.0f) {
            return;
        }
        this.isAirBorne = true;
        final float f1 = MathHelper.sqrt_double(par3 * par3 + par5 * par5);
        final float f2 = 0.5f * (2.0f - this.stats.resistances.knockback);
        this.motionX /= 2.0;
        this.motionY /= 2.0;
        this.motionZ /= 2.0;
        this.motionX -= par3 / f1 * f2;
        this.motionY += 0.2 + f2 / 2.0f;
        this.motionZ -= par5 / f1 * f2;
        if (this.motionY > 0.4000000059604645) {
            this.motionY = 0.4000000059604645;
        }
    }
    
    public Faction getFaction() {
        final String[] split = this.dataWatcher.getWatchableObjectString(13).split(":");
        int faction = 0;
        if (this.worldObj == null || (split.length <= 1 && this.worldObj.isRemote)) {
            return new Faction();
        }
        if (split.length > 1) {
            faction = Integer.parseInt(split[0]);
        }
        if (this.worldObj.isRemote) {
            final Faction fac = new Faction();
            fac.id = faction;
            fac.color = Integer.parseInt(split[1]);
            fac.name = split[2];
            return fac;
        }
        Faction fac = FactionController.getInstance().getFaction(faction);
        if (fac == null) {
            faction = FactionController.getInstance().getFirstFactionId();
            fac = FactionController.getInstance().getFaction(faction);
        }
        return fac;
    }
    
    public boolean isRemote() {
        return this.worldObj == null || this.worldObj.isRemote;
    }
    
    public void setFaction(final int integer) {
        if (integer < 0 || this.isRemote()) {
            return;
        }
        final Faction faction = FactionController.getInstance().getFaction(integer);
        if (faction == null) {
            return;
        }
        String str = faction.id + ":" + faction.color + ":" + faction.name;
        if (str.length() > 64) {
            str = str.substring(0, 64);
        }
        this.dataWatcher.updateObject(13, (Object)str);
    }
    
    public boolean isPotionApplicable(final PotionEffect effect) {
        return !this.stats.potionImmune && (this.getCreatureAttribute() != EnumCreatureAttribute.ARTHROPOD || effect.getPotionID() != Potion.poison.id) && super.isPotionApplicable(effect);
    }
    
    public boolean isAttacking() {
        return this.getBoolFlag(4);
    }
    
    public boolean isKilled() {
        return this.getBoolFlag(8) || this.isDead;
    }
    
    public void writeSpawnData(final ByteBuf buffer) {
        try {
            Server.writeNBT(buffer, this.writeSpawnData());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public NBTTagCompound writeSpawnData() {
        final NBTTagCompound compound = new NBTTagCompound();
        this.display.writeToNBT(compound);
        compound.setInteger("MaxHealth", this.stats.maxHealth);
        compound.setTag("Armor", (NBTBase)NBTTags.nbtItemStackList(this.inventory.getArmor()));
        compound.setTag("Weapons", (NBTBase)NBTTags.nbtItemStackList(this.inventory.getWeapons()));
        compound.setInteger("Speed", this.ai.getWalkingSpeed());
        compound.setBoolean("DeadBody", this.stats.hideKilledBody);
        compound.setInteger("StandingState", this.ai.standingType.ordinal());
        compound.setInteger("MovingState", this.ai.movingType.ordinal());
        compound.setInteger("Orientation", this.ai.orientation);
        compound.setInteger("Role", this.advanced.role.ordinal());
        compound.setInteger("Job", this.advanced.job.ordinal());
        if (this.advanced.job == EnumJobType.Bard) {
            final NBTTagCompound bard = new NBTTagCompound();
            this.jobInterface.writeToNBT(bard);
            compound.setTag("Bard", (NBTBase)bard);
        }
        if (this.advanced.job == EnumJobType.Puppet) {
            final NBTTagCompound bard = new NBTTagCompound();
            this.jobInterface.writeToNBT(bard);
            compound.setTag("Puppet", (NBTBase)bard);
        }
        if (this.advanced.role == EnumRoleType.Companion) {
            final NBTTagCompound bard = new NBTTagCompound();
            this.roleInterface.writeToNBT(bard);
            compound.setTag("Companion", (NBTBase)bard);
        }
        if (this instanceof EntityCustomNpc) {
            compound.setTag("ModelData", (NBTBase)((EntityCustomNpc)this).modelData.writeToNBT());
        }
        return compound;
    }
    
    public void readSpawnData(final ByteBuf buf) {
        try {
            this.readSpawnData(Server.readNBT(buf));
        }
        catch (IOException ex) {}
    }
    
    public void readSpawnData(final NBTTagCompound compound) {
        this.stats.maxHealth = compound.getInteger("MaxHealth");
        this.ai.setWalkingSpeed(compound.getInteger("Speed"));
        this.stats.hideKilledBody = compound.getBoolean("DeadBody");
        this.ai.standingType = EnumStandingType.values()[compound.getInteger("StandingState") % EnumStandingType.values().length];
        this.ai.movingType = EnumMovingType.values()[compound.getInteger("MovingState") % EnumMovingType.values().length];
        this.ai.orientation = compound.getInteger("Orientation");
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue((double)this.stats.maxHealth);
        this.inventory.setArmor(NBTTags.getItemStackList(compound.getTagList("Armor", 10)));
        this.inventory.setWeapons(NBTTags.getItemStackList(compound.getTagList("Weapons", 10)));
        this.advanced.setRole(compound.getInteger("Role"));
        this.advanced.setJob(compound.getInteger("Job"));
        if (this.advanced.job == EnumJobType.Bard) {
            final NBTTagCompound bard = compound.getCompoundTag("Bard");
            this.jobInterface.readFromNBT(bard);
        }
        if (this.advanced.job == EnumJobType.Puppet) {
            final NBTTagCompound puppet = compound.getCompoundTag("Puppet");
            this.jobInterface.readFromNBT(puppet);
        }
        if (this.advanced.role == EnumRoleType.Companion) {
            final NBTTagCompound puppet = compound.getCompoundTag("Companion");
            this.roleInterface.readFromNBT(puppet);
        }
        if (this instanceof EntityCustomNpc) {
            ((EntityCustomNpc)this).modelData.readFromNBT(compound.getCompoundTag("ModelData"));
        }
        this.display.readToNBT(compound);
    }
    
    public String getCommandSenderName() {
        return this.display.name;
    }
    
    public boolean canCommandSenderUseCommand(final int var1, final String var2) {
        return CustomNpcs.NpcUseOpCommands || var1 <= 2;
    }
    
    public ChunkCoordinates getPlayerCoordinates() {
        return new ChunkCoordinates(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ));
    }
    
    public boolean canAttackClass(final Class par1Class) {
        return EntityBat.class != par1Class;
    }
    
    public void setImmuneToFire(final boolean immuneToFire) {
        this.isImmuneToFire = immuneToFire;
        this.stats.immuneToFire = immuneToFire;
    }
    
    public void setAvoidWater(final boolean avoidWater) {
        this.getNavigator().setAvoidsWater(avoidWater);
        this.ai.avoidsWater = avoidWater;
    }
    
    protected void fall(final float par1) {
        if (!this.stats.noFallDamage) {
            super.fall(par1);
        }
    }
    
    public void setInWeb() {
        if (!this.ai.ignoreCobweb) {
            super.setInWeb();
        }
    }
    
    public boolean canBeCollidedWith() {
        return !this.isKilled();
    }
    
    public EntityAIRangedAttack getRangedTask() {
        return this.aiRange;
    }
    
    public String getRoleDataWatcher() {
        return this.dataWatcher.getWatchableObjectString(16);
    }
    
    public void setRoleDataWatcher(final String s) {
        this.dataWatcher.updateObject(16, (Object)s);
    }
    
    public World getEntityWorld() {
        return this.worldObj;
    }
    
    public boolean isInvisibleToPlayer(final EntityPlayer player) {
        return this.display.visible == 1 && (player.getHeldItem() == null || player.getHeldItem().getItem() != CustomItems.wand);
    }
    
    public boolean isInvisible() {
        return this.display.visible != 0;
    }
    
    public void addChatMessage(final IChatComponent var1) {
    }
    
    public void setCurrentAnimation(final EnumAnimation animation) {
        this.currentAnimation = animation;
        this.dataWatcher.updateObject(14, (Object)animation.ordinal());
    }
    
    public boolean canSee(final Entity entity) {
        return this.getEntitySenses().canSee(entity);
    }
    
    public boolean isFollower() {
        return (this.advanced.role == EnumRoleType.Follower && ((RoleFollower)this.roleInterface).isFollowing()) || (this.advanced.role == EnumRoleType.Companion && ((RoleCompanion)this.roleInterface).isFollowing()) || (this.advanced.job == EnumJobType.Follower && ((JobFollower)this.jobInterface).isFollowing());
    }
    
    public EntityLivingBase getOwner() {
        if (this.roleInterface instanceof RoleFollower) {
            return (EntityLivingBase)((RoleFollower)this.roleInterface).owner;
        }
        if (this.roleInterface instanceof RoleCompanion) {
            return (EntityLivingBase)((RoleCompanion)this.roleInterface).owner;
        }
        if (this.jobInterface instanceof JobFollower) {
            return (EntityLivingBase)((JobFollower)this.jobInterface).following;
        }
        return null;
    }
    
    public boolean hasOwner() {
        return (this.advanced.role == EnumRoleType.Follower && ((RoleFollower)this.roleInterface).hasOwner()) || (this.advanced.role == EnumRoleType.Companion && ((RoleCompanion)this.roleInterface).hasOwner()) || (this.advanced.job == EnumJobType.Follower && ((JobFollower)this.jobInterface).hasOwner());
    }
    
    public int followRange() {
        if (this.advanced.role == EnumRoleType.Follower && ((RoleFollower)this.roleInterface).isFollowing()) {
            return 36;
        }
        if (this.advanced.role == EnumRoleType.Companion && ((RoleCompanion)this.roleInterface).isFollowing()) {
            return ((RoleCompanion)this.roleInterface).followRange();
        }
        if (this.advanced.job == EnumJobType.Follower && ((JobFollower)this.jobInterface).isFollowing()) {
            return 16;
        }
        return 225;
    }
    
    public void setHomeArea(final int x, final int y, final int z, final int range) {
        super.setHomeArea(x, y, z, range);
        this.ai.startPos = new int[] { x, y, z };
    }
    
    protected float applyArmorCalculations(final DamageSource source, float damage) {
        if (this.advanced.role == EnumRoleType.Companion) {
            damage = ((RoleCompanion)this.roleInterface).applyArmorCalculations(source, damage);
        }
        return damage;
    }
    
    public boolean isOnSameTeam(final EntityLivingBase entity) {
        return (entity instanceof EntityPlayer && !this.isRemote() && this.getFaction().isFriendlyToPlayer((EntityPlayer)entity)) || super.isOnSameTeam(entity);
    }
    
    public void setDataWatcher(final DataWatcher dataWatcher) {
        this.dataWatcher = dataWatcher;
    }
    
    public void moveEntityWithHeading(final float p_70612_1_, final float p_70612_2_) {
        final double d0 = this.posX;
        final double d2 = this.posY;
        final double d3 = this.posZ;
        super.moveEntityWithHeading(p_70612_1_, p_70612_2_);
        if (this.advanced.role == EnumRoleType.Companion && !this.isRemote()) {
            ((RoleCompanion)this.roleInterface).addMovementStat(this.posX - d0, this.posY - d2, this.posZ - d3);
        }
    }
    
    public boolean allowLeashing() {
        return false;
    }
    
    static {
        chateventProfile = new GameProfileAlt();
        lastActive = new ItemStack[0];
    }
}
