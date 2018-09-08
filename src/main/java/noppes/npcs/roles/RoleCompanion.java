// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.roles;

import net.minecraft.entity.Entity;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import noppes.npcs.constants.EnumAnimation;
import net.minecraft.init.Items;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.SharedMonsterAttributes;
import com.google.common.collect.HashMultimap;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import net.minecraft.item.ItemArmor;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemSword;
import java.util.UUID;
import noppes.npcs.NoppesUtilServer;
import noppes.npcs.constants.EnumGuiType;
import noppes.npcs.roles.companion.CompanionGuard;
import noppes.npcs.roles.companion.CompanionFarmer;
import noppes.npcs.roles.companion.CompanionTrader;
import java.util.Iterator;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.entity.EntityCustomNpc;
import java.util.Random;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.util.Vec3;
import noppes.npcs.controllers.PlayerData;
import noppes.npcs.controllers.PlayerDataController;
import java.util.TreeMap;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.item.ItemStack;
import noppes.npcs.roles.companion.CompanionFoodStats;
import noppes.npcs.roles.companion.CompanionJobInterface;
import noppes.npcs.constants.EnumCompanionJobs;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.constants.EnumCompanionStage;
import noppes.npcs.constants.EnumCompanionTalent;
import java.util.Map;
import noppes.npcs.NpcMiscInventory;

public class RoleCompanion extends RoleInterface
{
    public NpcMiscInventory inventory;
    public String uuid;
    public String ownerName;
    public Map<EnumCompanionTalent, Integer> talents;
    public boolean canAge;
    public long ticksActive;
    public EnumCompanionStage stage;
    public EntityPlayer owner;
    public int companionID;
    public EnumCompanionJobs job;
    public CompanionJobInterface jobInterface;
    public boolean hasInv;
    public boolean defendOwner;
    public CompanionFoodStats foodstats;
    private int eatingTicks;
    private ItemStack eating;
    private int eatingDelay;
    public int currentExp;
    
    public RoleCompanion(final EntityNPCInterface npc) {
        super(npc);
        this.uuid = "";
        this.ownerName = "";
        this.talents = new TreeMap<EnumCompanionTalent, Integer>();
        this.canAge = true;
        this.ticksActive = 0L;
        this.stage = EnumCompanionStage.FULLGROWN;
        this.owner = null;
        this.job = EnumCompanionJobs.NONE;
        this.jobInterface = null;
        this.hasInv = true;
        this.defendOwner = true;
        this.foodstats = new CompanionFoodStats();
        this.eatingTicks = 20;
        this.eating = null;
        this.eatingDelay = 0;
        this.currentExp = 0;
        this.inventory = new NpcMiscInventory(12);
    }
    
    @Override
    public boolean aiShouldExecute() {
        final EntityPlayer prev = this.owner;
        this.owner = this.getOwner();
        if (this.jobInterface != null && this.jobInterface.isSelfSufficient()) {
            return true;
        }
        if (this.owner == null && !this.uuid.isEmpty()) {
            this.npc.isDead = true;
        }
        else if (prev != this.owner && this.owner != null) {
            this.ownerName = this.owner.getDisplayName();
            final PlayerData data = PlayerDataController.instance.getPlayerData(this.owner);
            if (data.companionID != this.companionID) {
                this.npc.isDead = true;
            }
        }
        return this.owner != null;
    }
    
    @Override
    public void aiUpdateTask() {
        if (this.owner != null && (this.jobInterface == null || !this.jobInterface.isSelfSufficient())) {
            this.foodstats.onUpdate(this.npc);
        }
        if (this.foodstats.getFoodLevel() >= 18) {
            this.npc.stats.healthRegen = 0;
            this.npc.stats.combatRegen = 0;
        }
        if (this.foodstats.needFood() && this.isSitting()) {
            if (this.eatingDelay > 0) {
                --this.eatingDelay;
                return;
            }
            final ItemStack prev = this.eating;
            this.eating = this.getFood();
            if (prev != null && this.eating == null) {
                this.npc.setRoleDataWatcher("");
            }
            if (prev == null && this.eating != null) {
                this.npc.setRoleDataWatcher("eating");
                this.eatingTicks = 20;
            }
            if (this.isEating()) {
                this.doEating();
            }
        }
        else if (this.eating != null && !this.isSitting()) {
            this.eating = null;
            this.eatingDelay = 20;
            this.npc.setRoleDataWatcher("");
        }
        ++this.ticksActive;
        if (this.canAge && this.stage != EnumCompanionStage.FULLGROWN) {
            if (this.stage == EnumCompanionStage.BABY && this.ticksActive > EnumCompanionStage.CHILD.matureAge) {
                this.matureTo(EnumCompanionStage.CHILD);
            }
            else if (this.stage == EnumCompanionStage.CHILD && this.ticksActive > EnumCompanionStage.TEEN.matureAge) {
                this.matureTo(EnumCompanionStage.TEEN);
            }
            else if (this.stage == EnumCompanionStage.TEEN && this.ticksActive > EnumCompanionStage.ADULT.matureAge) {
                this.matureTo(EnumCompanionStage.ADULT);
            }
            else if (this.stage == EnumCompanionStage.ADULT && this.ticksActive > EnumCompanionStage.FULLGROWN.matureAge) {
                this.matureTo(EnumCompanionStage.FULLGROWN);
            }
        }
    }
    
    @Override
    public void clientUpdate() {
        if (this.npc.getRoleDataWatcher().equals("eating")) {
            this.eating = this.getFood();
            if (this.isEating()) {
                this.doEating();
            }
        }
        else if (this.eating != null) {
            this.eating = null;
        }
    }
    
    private void doEating() {
        if (this.npc.worldObj.isRemote) {
            final Random rand = this.npc.getRNG();
            for (int j = 0; j < 2; ++j) {
                final Vec3 vec3 = Vec3.createVectorHelper((rand.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
                vec3.rotateAroundX(-this.npc.rotationPitch * 3.1415927f / 180.0f);
                vec3.rotateAroundY(-this.npc.renderYawOffset * 3.1415927f / 180.0f);
                Vec3 vec4 = Vec3.createVectorHelper((rand.nextFloat() - 0.5) * 0.3, -rand.nextFloat() * 0.6 - 0.3, this.npc.width / 2.0f + 0.1);
                vec4.rotateAroundX(-this.npc.rotationPitch * 3.1415927f / 180.0f);
                vec4.rotateAroundY(-this.npc.renderYawOffset * 3.1415927f / 180.0f);
                vec4 = vec4.addVector(this.npc.posX, this.npc.posY + this.npc.height + 0.1, this.npc.posZ);
                String s = "iconcrack_" + Item.getIdFromItem(this.eating.getItem());
                if (this.eating.getHasSubtypes()) {
                    s = s + "_" + this.eating.getItemDamage();
                }
                this.npc.worldObj.spawnParticle(s, vec4.xCoord, vec4.yCoord, vec4.zCoord, vec3.xCoord, vec3.yCoord + 0.0, vec3.zCoord);
            }
        }
        else {
            --this.eatingTicks;
            if (this.eatingTicks <= 0) {
                if (this.inventory.decrStackSize(this.eating, 1)) {
                    final ItemFood food = (ItemFood)this.eating.getItem();
                    this.foodstats.onFoodEaten(food, this.eating);
                    this.npc.playSound("random.burp", 0.5f, this.npc.getRNG().nextFloat() * 0.1f + 0.9f);
                }
                this.eatingDelay = 20;
                this.npc.setRoleDataWatcher("");
                this.eating = null;
            }
            else if (this.eatingTicks > 3 && this.eatingTicks % 2 == 0) {
                final Random rand = this.npc.getRNG();
                this.npc.playSound("random.eat", 0.5f + 0.5f * rand.nextInt(2), (rand.nextFloat() - rand.nextFloat()) * 0.2f + 1.0f);
            }
        }
    }
    
    public void matureTo(final EnumCompanionStage stage) {
        this.stage = stage;
        final EntityCustomNpc npc = (EntityCustomNpc)this.npc;
        npc.ai.animationType = stage.animation;
        if (stage == EnumCompanionStage.BABY) {
            npc.modelData.arms.setScale(0.5f, 0.5f, 0.5f);
            npc.modelData.legs.setScale(0.5f, 0.5f, 0.5f);
            npc.modelData.body.setScale(0.5f, 0.5f, 0.5f);
            npc.modelData.head.setScale(0.7f, 0.7f, 0.7f);
            npc.ai.onAttack = 1;
            npc.ai.setWalkingSpeed(3);
            if (!this.talents.containsKey(EnumCompanionTalent.INVENTORY)) {
                this.talents.put(EnumCompanionTalent.INVENTORY, 0);
            }
        }
        if (stage == EnumCompanionStage.CHILD) {
            npc.modelData.arms.setScale(0.6f, 0.6f, 0.6f);
            npc.modelData.legs.setScale(0.6f, 0.6f, 0.6f);
            npc.modelData.body.setScale(0.6f, 0.6f, 0.6f);
            npc.modelData.head.setScale(0.8f, 0.8f, 0.8f);
            npc.ai.onAttack = 0;
            npc.ai.setWalkingSpeed(4);
            if (!this.talents.containsKey(EnumCompanionTalent.SWORD)) {
                this.talents.put(EnumCompanionTalent.SWORD, 0);
            }
        }
        if (stage == EnumCompanionStage.TEEN) {
            npc.modelData.arms.setScale(0.8f, 0.8f, 0.8f);
            npc.modelData.legs.setScale(0.8f, 0.8f, 0.8f);
            npc.modelData.body.setScale(0.8f, 0.8f, 0.8f);
            npc.modelData.head.setScale(0.9f, 0.9f, 0.9f);
            npc.ai.onAttack = 0;
            npc.ai.setWalkingSpeed(5);
            if (!this.talents.containsKey(EnumCompanionTalent.ARMOR)) {
                this.talents.put(EnumCompanionTalent.ARMOR, 0);
            }
        }
        if (stage == EnumCompanionStage.ADULT || stage == EnumCompanionStage.FULLGROWN) {
            npc.modelData.arms.setScale(1.0f, 1.0f, 1.0f);
            npc.modelData.legs.setScale(1.0f, 1.0f, 1.0f);
            npc.modelData.body.setScale(1.0f, 1.0f, 1.0f);
            npc.modelData.head.setScale(1.0f, 1.0f, 1.0f);
            npc.ai.onAttack = 0;
            npc.ai.setWalkingSpeed(5);
        }
    }
    
    @Override
    public NBTTagCompound writeToNBT(final NBTTagCompound compound) {
        compound.setTag("CompanionInventory", (NBTBase)this.inventory.getToNBT());
        compound.setString("CompanionOwner", this.uuid);
        compound.setString("CompanionOwnerName", this.ownerName);
        compound.setInteger("CompanionID", this.companionID);
        compound.setInteger("CompanionStage", this.stage.ordinal());
        compound.setInteger("CompanionExp", this.currentExp);
        compound.setBoolean("CompanionCanAge", this.canAge);
        compound.setLong("CompanionAge", this.ticksActive);
        compound.setBoolean("CompanionHasInv", this.hasInv);
        compound.setBoolean("CompanionDefendOwner", this.defendOwner);
        this.foodstats.writeNBT(compound);
        compound.setInteger("CompanionJob", this.job.ordinal());
        if (this.jobInterface != null) {
            compound.setTag("CompanionJobData", (NBTBase)this.jobInterface.getNBT());
        }
        final NBTTagList list = new NBTTagList();
        for (final EnumCompanionTalent talent : this.talents.keySet()) {
            final NBTTagCompound c = new NBTTagCompound();
            c.setInteger("Talent", talent.ordinal());
            c.setInteger("Exp", (int)this.talents.get(talent));
            list.appendTag((NBTBase)c);
        }
        compound.setTag("CompanionTalents", (NBTBase)list);
        return compound;
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound compound) {
        this.inventory.setFromNBT(compound.getCompoundTag("CompanionInventory"));
        this.uuid = compound.getString("CompanionOwner");
        this.ownerName = compound.getString("CompanionOwnerName");
        this.companionID = compound.getInteger("CompanionID");
        this.stage = EnumCompanionStage.values()[compound.getInteger("CompanionStage")];
        this.currentExp = compound.getInteger("CompanionExp");
        this.canAge = compound.getBoolean("CompanionCanAge");
        this.ticksActive = compound.getLong("CompanionAge");
        this.hasInv = compound.getBoolean("CompanionHasInv");
        this.defendOwner = compound.getBoolean("CompanionDefendOwner");
        this.foodstats.readNBT(compound);
        final NBTTagList list = compound.getTagList("CompanionTalents", 10);
        final Map<EnumCompanionTalent, Integer> talents = new TreeMap<EnumCompanionTalent, Integer>();
        for (int i = 0; i < list.tagCount(); ++i) {
            final NBTTagCompound c = list.getCompoundTagAt(i);
            final EnumCompanionTalent talent = EnumCompanionTalent.values()[c.getInteger("Talent")];
            talents.put(talent, c.getInteger("Exp"));
        }
        this.talents = talents;
        this.setJob(compound.getInteger("CompanionJob"));
        if (this.jobInterface != null) {
            this.jobInterface.setNBT(compound.getCompoundTag("CompanionJobData"));
        }
        this.setStats();
    }
    
    private void setJob(final int i) {
        this.job = EnumCompanionJobs.values()[i];
        if (this.job == EnumCompanionJobs.SHOP) {
            this.jobInterface = new CompanionTrader();
        }
        else if (this.job == EnumCompanionJobs.FARMER) {
            this.jobInterface = new CompanionFarmer();
        }
        else if (this.job == EnumCompanionJobs.GUARD) {
            this.jobInterface = new CompanionGuard();
        }
        else {
            this.jobInterface = null;
        }
        if (this.jobInterface != null) {
            this.jobInterface.npc = this.npc;
        }
    }
    
    @Override
    public void interact(final EntityPlayer player) {
        if (player != null && this.job == EnumCompanionJobs.SHOP) {
            ((CompanionTrader)this.jobInterface).interact(player);
        }
        if (player != this.owner || !this.npc.isEntityAlive() || this.npc.isAttacking()) {
            return;
        }
        if (player.isSneaking()) {
            this.openGui(player);
        }
        else {
            this.setSitting(!this.isSitting());
        }
    }
    
    public int getTotalLevel() {
        int level = 0;
        for (final EnumCompanionTalent talent : this.talents.keySet()) {
            level += this.getTalentLevel(talent);
        }
        return level;
    }
    
    public int getMaxExp() {
        return 500 + this.getTotalLevel() * 200;
    }
    
    public void addExp(final int exp) {
        if (this.canAddExp(exp)) {
            this.currentExp += exp;
        }
    }
    
    public boolean canAddExp(final int exp) {
        final int newExp = this.currentExp + exp;
        return newExp >= 0 && newExp < this.getMaxExp();
    }
    
    public void gainExp(final int chance) {
        if (this.npc.getRNG().nextInt(chance) == 0) {
            this.addExp(1);
        }
    }
    
    private void openGui(final EntityPlayer player) {
        NoppesUtilServer.sendOpenGui(player, EnumGuiType.Companion, this.npc);
    }
    
    public EntityPlayer getOwner() {
        if (this.uuid == null || this.uuid.isEmpty()) {
            return null;
        }
        try {
            final UUID id = UUID.fromString(this.uuid);
            if (id != null) {
                return NoppesUtilServer.getPlayer(id);
            }
        }
        catch (IllegalArgumentException ex) {}
        return null;
    }
    
    public void setOwner(final EntityPlayer player) {
        this.uuid = player.getUniqueID().toString();
    }
    
    public boolean hasTalent(final EnumCompanionTalent talent) {
        return this.getTalentLevel(talent) > 0;
    }
    
    public int getTalentLevel(final EnumCompanionTalent talent) {
        if (!this.talents.containsKey(talent)) {
            return 0;
        }
        final int exp = this.talents.get(talent);
        if (exp >= 5000) {
            return 5;
        }
        if (exp >= 3000) {
            return 4;
        }
        if (exp >= 1700) {
            return 3;
        }
        if (exp >= 1000) {
            return 2;
        }
        if (exp >= 400) {
            return 1;
        }
        return 0;
    }
    
    public Integer getNextLevel(final EnumCompanionTalent talent) {
        if (!this.talents.containsKey(talent)) {
            return 0;
        }
        final int exp = this.talents.get(talent);
        if (exp < 400) {
            return 400;
        }
        if (exp < 1000) {
            return 700;
        }
        if (exp < 1700) {
            return 1700;
        }
        if (exp < 3000) {
            return 3000;
        }
        return 5000;
    }
    
    public void levelSword() {
        if (!this.talents.containsKey(EnumCompanionTalent.SWORD)) {
            return;
        }
    }
    
    public void levelTalent(final EnumCompanionTalent talent, final int exp) {
        if (!this.talents.containsKey(EnumCompanionTalent.SWORD)) {
            return;
        }
        this.talents.put(talent, exp + this.talents.get(talent));
    }
    
    public int getExp(final EnumCompanionTalent talent) {
        if (this.talents.containsKey(talent)) {
            return this.talents.get(talent);
        }
        return -1;
    }
    
    public void setExp(final EnumCompanionTalent talent, final int exp) {
        this.talents.put(talent, exp);
    }
    
    private boolean isWeapon(final ItemStack item) {
        return item != null && item.getItem() != null && (item.getItem() instanceof ItemSword || item.getItem() instanceof ItemBow || item.getItem() == Item.getItemFromBlock(Blocks.cobblestone));
    }
    
    public boolean canWearWeapon(final ItemStack item) {
        if (item == null || item.getItem() == null) {
            return false;
        }
        if (item.getItem() instanceof ItemSword) {
            return this.canWearSword(item);
        }
        if (item.getItem() instanceof ItemBow) {
            return this.getTalentLevel(EnumCompanionTalent.RANGED) > 2;
        }
        return item.getItem() == Item.getItemFromBlock(Blocks.cobblestone) && this.getTalentLevel(EnumCompanionTalent.RANGED) > 1;
    }
    
    public boolean canWearArmor(final ItemStack item) {
        /*final int level = this.getTalentLevel(EnumCompanionTalent.ARMOR);
        if (item == null || !(item.getItem() instanceof ItemArmor) || level <= 0) {
            return false;
        }
        if (level >= 5) {
            return true;
        }
        final ItemArmor armor = (ItemArmor)item.getItem();
        final int reduction = ObfuscationReflectionHelper.getPrivateValue((Class)ItemArmor.ArmorMaterial.class, (Object)armor.getArmorMaterial(), 5);
        return (reduction <= 5 && level >= 1) || (reduction <= 7 && level >= 2) || (reduction <= 15 && level >= 3) || (reduction <= 33 && level >= 4);*/
    	return true;
    }
    
    public boolean canWearSword(final ItemStack item) {
        final int level = this.getTalentLevel(EnumCompanionTalent.SWORD);
        return item != null && item.getItem() instanceof ItemSword && level > 0 && (level >= 5 || this.getSwordDamage(item) - level < 4.0);
    }
    
    private double getSwordDamage(final ItemStack item) {
        if (item == null || !(item.getItem() instanceof ItemSword)) {
            return 0.0;
        }
        final HashMultimap map = (HashMultimap)item.getAttributeModifiers();
        /*for (final Map.Entry entry : map.entries()) {
            if (entry.getKey().equals(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName())) {
                final AttributeModifier mod = (AttributeModifier) entry.getValue();
                return mod.getAmount();
            }
        }*/
        return 0.0;
    }
    
    public void setStats() {
        final ItemStack weapon = this.npc.inventory.getWeapon();
        this.npc.stats.setAttackStrength((int)(1.0 + this.getSwordDamage(weapon)));
        this.npc.stats.healthRegen = 0;
        this.npc.stats.combatRegen = 0;
        final int ranged = this.getTalentLevel(EnumCompanionTalent.RANGED);
        if (ranged > 0 && weapon != null) {
            if (ranged > 0 && weapon.getItem() == Item.getItemFromBlock(Blocks.cobblestone)) {
                this.npc.inventory.setProjectile(weapon);
            }
            if (ranged > 0 && weapon.getItem() instanceof ItemBow) {
                this.npc.inventory.setProjectile(new ItemStack(Items.arrow));
            }
        }
        this.inventory.setSize(2 + this.getTalentLevel(EnumCompanionTalent.INVENTORY) * 2);
    }
    
    public void setSelfsuficient(final boolean bo) {
        if (this.owner == null || (this.jobInterface != null && bo == this.jobInterface.isSelfSufficient())) {
            return;
        }
        final PlayerData data = PlayerDataController.instance.getPlayerData(this.owner);
        if (!bo && data.hasCompanion()) {
            return;
        }
        data.setCompanion(bo ? null : this.npc);
        if (this.job == EnumCompanionJobs.GUARD) {
            ((CompanionGuard)this.jobInterface).isStanding = bo;
        }
        else if (this.job == EnumCompanionJobs.FARMER) {
            ((CompanionFarmer)this.jobInterface).isStanding = bo;
        }
    }
    
    public void setSitting(final boolean sit) {
        if (sit) {
            this.npc.ai.animationType = EnumAnimation.SITTING;
            this.npc.ai.onAttack = 3;
            this.npc.ai.startPos = new int[] { MathHelper.floor_double(this.npc.posX), MathHelper.floor_double(this.npc.posY), MathHelper.floor_double(this.npc.posZ) };
            this.npc.getNavigator().clearPathEntity();
            this.npc.setPositionAndUpdate(this.npc.ai.startPos[0] + 0.5, this.npc.posY, this.npc.ai.startPos[2] + 0.5);
        }
        else {
            this.npc.ai.animationType = this.stage.animation;
            this.npc.ai.onAttack = 0;
        }
        this.npc.setResponse();
    }
    
    public boolean isSitting() {
        return this.npc.ai.animationType == EnumAnimation.SITTING;
    }
    
    public float applyArmorCalculations(final DamageSource source, float damage) {
        if (!this.hasInv || this.getTalentLevel(EnumCompanionTalent.ARMOR) <= 0) {
            return damage;
        }
        if (!source.isUnblockable()) {
            this.damageArmor(damage);
            final int i = 25 - this.getTotalArmorValue();
            final float f1 = damage * i;
            damage = f1 / 25.0f;
        }
        return damage;
    }
    
    private void damageArmor(float damage) {
        damage /= 4.0f;
        if (damage < 1.0f) {
            damage = 1.0f;
        }
        boolean hasArmor = false;
        final Iterator<Map.Entry<Integer, ItemStack>> ita = this.npc.inventory.armor.entrySet().iterator();
        while (ita.hasNext()) {
            final Map.Entry<Integer, ItemStack> entry = ita.next();
            final ItemStack item = entry.getValue();
            if (item != null) {
                if (!(item.getItem() instanceof ItemArmor)) {
                    continue;
                }
                hasArmor = true;
                item.damageItem((int)damage, (EntityLivingBase)this.npc);
                if (item.stackSize > 0) {
                    continue;
                }
                ita.remove();
            }
        }
        this.gainExp(hasArmor ? 4 : 8);
    }
    
    public int getTotalArmorValue() {
        int armorValue = 0;
        for (final ItemStack armor : this.npc.inventory.getArmor().values()) {
            if (armor != null && armor.getItem() instanceof ItemArmor) {
                armorValue += ((ItemArmor)armor.getItem()).damageReduceAmount;
            }
        }
        return armorValue;
    }
    
    public boolean isFollowing() {
        return (this.jobInterface == null || !this.jobInterface.isSelfSufficient()) && this.owner != null && !this.isSitting();
    }
    
    @Override
    public boolean defendOwner() {
        return this.defendOwner && this.owner != null && this.stage != EnumCompanionStage.BABY && (this.jobInterface == null || !this.jobInterface.isSelfSufficient());
    }
    
    public int followRange() {
        return 9 + 12 * this.stage.ordinal();
    }
    
    public boolean hasOwner() {
        return !this.uuid.isEmpty();
    }
    
    public void addMovementStat(final double x, final double y, final double z) {
        final int i = Math.round(MathHelper.sqrt_double(x * x + y * y + z * z) * 100.0f);
        if (this.npc.isAttacking()) {
            this.foodstats.addExhaustion(0.04f * i * 0.01f);
        }
        else {
            this.foodstats.addExhaustion(0.02f * i * 0.01f);
        }
    }
    
    private ItemStack getFood() {
        final List<ItemStack> food = new ArrayList<ItemStack>(this.inventory.items.values());
        final Iterator<ItemStack> ite = food.iterator();
        int i = -1;
        while (ite.hasNext()) {
            final ItemStack is = ite.next();
            if (is == null || !(is.getItem() instanceof ItemFood)) {
                ite.remove();
            }
            else {
                final int amount = ((ItemFood)is.getItem()).func_150905_g(is);
                if (i != -1 && amount >= i) {
                    continue;
                }
                i = amount;
            }
        }
        for (final ItemStack is2 : food) {
            if (((ItemFood)is2.getItem()).func_150905_g(is2) == i) {
                return is2;
            }
        }
        return null;
    }
    
    public ItemStack getHeldItem() {
        if (this.eating != null) {
            return this.eating;
        }
        return this.npc.inventory.getWeapon();
    }
    
    public boolean isEating() {
        return this.eating != null;
    }
    
    public boolean hasInv() {
        return this.hasInv && (this.hasTalent(EnumCompanionTalent.INVENTORY) || this.hasTalent(EnumCompanionTalent.ARMOR) || this.hasTalent(EnumCompanionTalent.SWORD));
    }
    
    public void attackedEntity(final Entity entity) {
        final ItemStack weapon = this.npc.inventory.getWeapon();
        this.gainExp((weapon == null) ? 8 : 4);
        if (weapon == null) {
            return;
        }
        weapon.damageItem(1, (EntityLivingBase)this.npc);
        if (weapon.stackSize <= 0) {
            this.npc.inventory.setWeapon(null);
        }
    }
    
    public void addTalentExp(final EnumCompanionTalent talent, int exp) {
        if (this.talents.containsKey(talent)) {
            exp += this.talents.get(talent);
        }
        this.talents.put(talent, exp);
    }
}
