package noppes.npcs;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;

import com.flansmod.common.guns.*;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.teams.ItemTeamArmour;
import noppes.npcs.constants.EnumNpcToolMaterial;
import noppes.npcs.constants.EnumParticleType;
import noppes.npcs.constants.EnumPotionType;
import noppes.npcs.enchants.EnchantInterface;
import noppes.npcs.entity.EntityMagicProjectile;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.entity.EntityProjectile;
import noppes.npcs.items.*;
import noppes.npcs.util.NPCInterfaceUtil;

public class DataInventory implements IInventory{
	public HashMap<Integer,ItemStack> items = new HashMap<>();
	public HashMap<Integer,Double> dropchance = new HashMap<>();
	public HashMap<Integer,ItemStack> weapons = new HashMap<>();
	public HashMap<Integer,ItemStack> armor = new HashMap<>();
		
	public int minExp = 0;
	public int maxExp = 0;
	
	public int lootMode = 0;

	private EntityNPCInterface npc;

	public boolean useWeaponMeleeStats;
	public boolean useWeaponRangedStats;
	public boolean useArmorStats;
	
	public DataInventory(EntityNPCInterface npc){
		this.npc = npc;
	}
	public NBTTagCompound writeEntityToNBT(NBTTagCompound nbttagcompound){
		nbttagcompound.setInteger("MinExp", minExp);
		nbttagcompound.setInteger("MaxExp", maxExp);
		nbttagcompound.setTag("NpcInv", NBTTags.nbtItemStackList(items));
		nbttagcompound.setTag("Armor", NBTTags.nbtItemStackList(getArmor()));
		nbttagcompound.setTag("Weapons", NBTTags.nbtItemStackList(getWeapons()));
		nbttagcompound.setTag("DoubleDropChance", NBTTags.nbtIntegerDoubleMap(dropchance));
		nbttagcompound.setInteger("LootMode", lootMode);
		nbttagcompound.setBoolean("UseWeaponMeleeStats", useWeaponMeleeStats);
		nbttagcompound.setBoolean("UseWeaponRangedStats", useWeaponRangedStats);
		nbttagcompound.setBoolean("UseArmorStats", useArmorStats);
		return nbttagcompound;
	}
	public void readEntityFromNBT(NBTTagCompound nbttagcompound){
		minExp = nbttagcompound.getInteger("MinExp");
		maxExp = nbttagcompound.getInteger("MaxExp");
		items = NBTTags.getItemStackList(nbttagcompound.getTagList("NpcInv", 10));
		setArmor(NBTTags.getItemStackList(nbttagcompound.getTagList("Armor", 10)));
		setWeapons(NBTTags.getItemStackList(nbttagcompound.getTagList("Weapons", 10)));

		if(!nbttagcompound.hasKey("DoubleDropChance")) {
			dropchance.clear();
			HashMap<Integer, Integer> oldDropChance = NBTTags.getIntegerIntegerMap(nbttagcompound.getTagList("DropChance", 10));
			for(int i = 0; i < oldDropChance.entrySet().size(); i++){
				dropchance.put(i, Double.valueOf(oldDropChance.get(i)));
			}
		} else {
			dropchance = NBTTags.getIntegerDoubleMap(nbttagcompound.getTagList("DoubleDropChance", 10));
		}

		lootMode = nbttagcompound.getInteger("LootMode");
		useWeaponMeleeStats = nbttagcompound.getBoolean("UseWeaponMeleeStats");
		useWeaponRangedStats = nbttagcompound.getBoolean("UseWeaponRangedStats");
		useArmorStats = nbttagcompound.getBoolean("UseArmorStats");
	}
	public HashMap<Integer, ItemStack> getWeapons() {
		return weapons;
	}
	public void setWeapons(HashMap<Integer, ItemStack> list) {
		weapons = list;
		setWeaponStats();
		setKnockbackResistance(weapons, armor);
	}
	public HashMap<Integer, ItemStack> getArmor() {
		return armor;
	}
	public void setArmor(HashMap<Integer, ItemStack> list) {
		armor = list;
		setArmorStats(armor);
		setKnockbackResistance(weapons, armor);
	}
	public ItemStack getWeapon(){
		return weapons.get(0);
	}
	public void setWeapon(ItemStack item){
		weapons.put(0, item);
		setWeaponStats();
		setKnockbackResistance(weapons, armor);
	}
	public ItemStack getProjectile(){
		return weapons.get(1);
	}
	public void setProjectile(ItemStack item){
		weapons.put(1, item);
		setWeaponStats();
		setKnockbackResistance(weapons, armor);
	}
	public ItemStack getOffHand(){
		return weapons.get(2);
	}
	public void setOffHand(ItemStack item){
		weapons.put(2, item);
		setWeaponStats();
		setKnockbackResistance(weapons, armor);
	}

	private void setKnockbackResistance(Map<Integer, ItemStack> weapons, Map<Integer, ItemStack> armor)
	{
		if (useWeaponMeleeStats || useWeaponRangedStats || useArmorStats)
		{
			AtomicReference<Float> knockbackResistance = new AtomicReference<>(1F);
			List<ItemStack> itemList = new ArrayList<>();

			if (useWeaponMeleeStats || useWeaponRangedStats)
				itemList.addAll(weapons.values());
			if (useArmorStats)
				itemList.addAll(armor.values());

			for (ItemStack item : itemList)
			{
				getAttributeModifier(item, SharedMonsterAttributes.knockbackResistance).ifPresent(value -> knockbackResistance.set(knockbackResistance.get() + (float) value));
			}
			npc.stats.resistances.knockback = knockbackResistance.get();
		}
	}

	private void setArmorStats(HashMap<Integer, ItemStack> armor)
	{
		if (!useArmorStats)
			return;

		float meleeResistance = 1F;
		float projectileResistance = 1F;
		float explosionResistance = 1F;
		int protectionLevel = 0;
		int projectileProtectionLevel = 0;
		int blastProtectionLevel = 0;

		for (int i = 0; i < 4; i++)
		{
			if (armor.get(i) == null)
				continue;

			if (armor.get(i).getItem() instanceof ItemArmor)
			{
				if (armor.get(i).isItemEnchanted())
				{
					protectionLevel += EnchantmentHelper.getEnchantmentLevel(Enchantment.protection.effectId, armor.get(i));
					projectileProtectionLevel += EnchantmentHelper.getEnchantmentLevel(Enchantment.projectileProtection.effectId, armor.get(i));
					blastProtectionLevel += EnchantmentHelper.getEnchantmentLevel(Enchantment.blastProtection.effectId, armor.get(i));
				}

				ItemArmor item = (ItemArmor) armor.get(i).getItem();
				if (item instanceof ItemTeamArmour)
				{
					meleeResistance += ((ItemTeamArmour)item).type.defence;
					projectileResistance += ((ItemTeamArmour)item).type.bulletDefence;
					explosionResistance += ((ItemTeamArmour)item).type.defence;

					if (((ItemTeamArmour)item).type.negateFallDamage)
						npc.stats.noFallDamage = true;
					if (((ItemTeamArmour)item).type.fireResistance)
						npc.stats.immuneToFire = true;
					if (((ItemTeamArmour)item).type.waterBreathing)
						npc.stats.drowningType = 0;
				}
				else
				{
					meleeResistance += 0.04F * item.damageReduceAmount;
					projectileResistance += 0.04F * item.damageReduceAmount;
					explosionResistance += 0.04F * item.damageReduceAmount;
				}
			}
		}

		npc.stats.resistances.playermelee = meleeResistance + protectionLevel * 0.04F * (2F - meleeResistance);
		npc.stats.resistances.arrow = projectileResistance + projectileProtectionLevel * 0.04F * (2F - meleeResistance);
		npc.stats.resistances.explosion = explosionResistance + blastProtectionLevel * 0.04F * (2F - meleeResistance);
	}

	private void setWeaponStats()
	{
		if (useWeaponMeleeStats)
		{
			setMeleeStats(weapons.get(0), weapons.get(2));
		}

		if (useWeaponRangedStats)
		{
			setRangedStats(npc.getGuns(), weapons.get(0), weapons.get(1));
		}
	}

	private void setMeleeStats(ItemStack mainWeapon, ItemStack offHandWeapon)
	{
		float damageMainWeapon = 0F;
		float damageOffHandWeapon = 0F;
		int fireAspectLevel;
		int meleeTime = 1;

		if (mainWeapon != null)
		{
			damageMainWeapon = getMeleeDamage(mainWeapon);
			if (mainWeapon.getItem() instanceof ItemGun)
			{
				meleeTime = ((ItemGun) mainWeapon.getItem()).type.meleeTime;
			}
		}
		if (offHandWeapon != null)
		{
			damageOffHandWeapon = getMeleeDamage(offHandWeapon);
			if (offHandWeapon.getItem() instanceof ItemGun)
			{
				meleeTime = Math.max(meleeTime, ((ItemGun) offHandWeapon.getItem()).type.meleeTime);
			}
		}

		fireAspectLevel = Math.max(EnchantmentHelper.getEnchantmentLevel(Enchantment.fireAspect.effectId, mainWeapon), EnchantmentHelper.getEnchantmentLevel(Enchantment.knockback.effectId, offHandWeapon));

		npc.stats.setAttackStrength(Math.max(damageMainWeapon, damageOffHandWeapon) + 1F);
		npc.stats.knockback = Math.max(EnchantmentHelper.getEnchantmentLevel(Enchantment.knockback.effectId, mainWeapon), EnchantmentHelper.getEnchantmentLevel(Enchantment.knockback.effectId, offHandWeapon));

		if (fireAspectLevel > 0)
		{
			npc.stats.potionType = EnumPotionType.Fire;
			npc.stats.potionDuration = 4 * fireAspectLevel;
		}

		if (meleeTime > 1)
			npc.stats.attackSpeed = meleeTime;
	}

	private float getMeleeDamage(ItemStack item)
	{
		if (item == null)
			return 0F;

		AtomicReference<Float> damage = new AtomicReference<>(0F);
		getAttributeModifier(item, SharedMonsterAttributes.attackDamage).ifPresent(value -> damage.set((float)value));

		if (item.isItemEnchanted())
		{
			Map enchantments = EnchantmentHelper.getEnchantments(item);
			enchantments.forEach((id, level) -> damage.set(damage.get() + Enchantment.enchantmentsList[(Integer)id].func_152376_a((Integer) level, EnumCreatureAttribute.UNDEFINED)));
		}

		return damage.get();
	}

	private OptionalDouble getAttributeModifier(ItemStack item, IAttribute attribute)
	{
		if (item != null)
		{
			AttributeModifier[] attributeModifier = (AttributeModifier[]) item.getItem().getAttributeModifiers(item).get(attribute.getAttributeUnlocalizedName()).toArray(new AttributeModifier[0]);
			if (attributeModifier.length > 0)
			{
				return OptionalDouble.of(attributeModifier[0].getAmount());
			}
		}
		return OptionalDouble.empty();
	}

	private void setRangedStats(List<ItemStack> guns, ItemStack mainWeapon, ItemStack projectile)
	{

		if (!guns.isEmpty())
		{
			int shotCount = 0;
			float damage = 0F;
			float bulletSpeed = Float.MAX_VALUE;
			float bulletSpread = 0F;
			float reloadTime = 0F;
			float fireRate = 0F;
			String fireSound = null;

			for (ItemStack gunItemStack: guns)
			{
				GunType gun = ((ItemGun) gunItemStack.getItem()).type;
				damage += gun.getDamage(gunItemStack);
				shotCount += gun.getNumBullets(gunItemStack);
				reloadTime = Math.max(reloadTime, gun.getReloadTime(gunItemStack));
				fireRate = Math.max(fireRate, gun.getShootDelay(gunItemStack));
				bulletSpread = Math.max(bulletSpread, gun.getSpread(gunItemStack, false, false));

				if (fireSound == null)
					fireSound = NPCInterfaceUtil.getGunFireSound(gunItemStack, gun, false);

				if (projectile != null)
				{
					bulletSpeed = Math.min(bulletSpeed, gun.getBulletSpeed(gunItemStack, projectile));
				}
				else
				{
					bulletSpeed = Math.min(bulletSpeed, gun.getBulletSpeed(gunItemStack));
				}
			}

			npc.stats.pDamage = damage / guns.size();
			npc.stats.pSpeed = Math.round(Math.max(bulletSpeed, 1F));
			npc.stats.accuracy = NPCInterfaceUtil.bulletSpreadToAccuracy(bulletSpread);
			npc.stats.minDelay = (int)Math.floor(reloadTime);
			npc.stats.maxDelay = (int)Math.ceil(reloadTime);
			npc.stats.fireRate = Math.round(fireRate);
			npc.stats.shotCount = shotCount;

			if (fireSound != null)
				npc.stats.fireSound = "flansmod:" + fireSound;
		}

		if (projectile != null)
		{
			Item projectileItem = projectile.getItem();
			if (projectileItem instanceof ItemShootable)
			{
				ShootableType shootable = ((ItemShootable) projectileItem).type;
				npc.stats.burstCount = shootable.roundsPerItem;
			}
			else if (projectileItem instanceof noppes.npcs.items.ItemBullet && mainWeapon != null)
			{
				noppes.npcs.items.ItemBullet bullet = (noppes.npcs.items.ItemBullet) projectileItem;
				if (mainWeapon.getItem()  instanceof noppes.npcs.items.ItemGun)
				{
					noppes.npcs.items.ItemGun gunItem = (noppes.npcs.items.ItemGun) mainWeapon.getItem();
					EnumNpcToolMaterial gunMaterial = null;
					for (EnumNpcToolMaterial material: EnumNpcToolMaterial.values())
					{
						if (material.getMaxUses() == gunItem.getMaxDamage())
							gunMaterial = material;
					}

					if (gunMaterial != null)
					{
						int damage = (bullet.getBulletDamage() + gunMaterial.getDamageVsEntity() + 1) / 2 + 5;
						damage += damage * EnchantInterface.getLevel(EnchantInterface.Damage, mainWeapon) * 0.5f;
						npc.stats.pDamage = damage;
					}
					npc.stats.pSpeed = 40;
					npc.stats.pPhysics = false;
					npc.stats.fireSound = "customnpcs:gun.pistol.shot";
				}
			}
			else if (projectileItem instanceof ItemThrowingWeapon)
			{
				npc.stats.pDamage = 2;
				npc.stats.pSpeed = 12;
				npc.stats.pPhysics = true;
				npc.stats.pRender3D = true;
				npc.stats.pStick = true;
				npc.stats.pSpin = true;
				npc.stats.fireSound = "customnpcs:misc.swosh";
			}
			else if (projectileItem instanceof ItemKunai)
			{
				npc.stats.pDamage = ((ItemKunai)projectileItem).func_150931_i();
				npc.stats.pSpeed = 12;
				npc.stats.pPhysics = true;
				npc.stats.pRender3D = true;
				npc.stats.pStick = true;
			}
		}

		if (mainWeapon != null)
		{
			if (mainWeapon.getItem()  instanceof noppes.npcs.items.ItemMachineGun)
			{
				npc.stats.pDamage = 4;
				npc.stats.pSpeed = 40;
				npc.stats.pPhysics = false;
				npc.stats.fireSound = "customnpcs:gun.pistol.shot";
			}
			else if (mainWeapon.getItem()  instanceof ItemCrossbow)
			{
				npc.stats.pDamage = 10;
				npc.stats.pSpeed = 20;
				npc.stats.pPhysics = true;
				npc.stats.fireSound = "random.bow";
			}
			else if (mainWeapon.getItem()  instanceof ItemSlingshot)
			{
				npc.stats.pDamage = 4;
				npc.stats.pImpact = 1;
				npc.stats.pSpeed = 14;
				npc.stats.pPhysics = true;
				npc.stats.pSpin = true;
				npc.stats.fireSound = "random.bow";
			}
			else if (mainWeapon.getItem()  instanceof ItemMusket)
			{
				npc.stats.pDamage = 16;
				npc.stats.pSpeed = 50;
				npc.stats.pPhysics = false;
				npc.stats.pTrail = EnumParticleType.Smoke;
			}
			else if (mainWeapon.getItem()  instanceof ItemStaff)
			{
				ItemStaff staffItem = (ItemStaff) mainWeapon.getItem();
				EnumNpcToolMaterial staffMaterial = null;
				for (EnumNpcToolMaterial material: EnumNpcToolMaterial.values())
				{
					if (material.getEnchantability() == staffItem.getItemEnchantability())
						staffMaterial = material;
				}
				npc.stats.pExplode = true;
				if (staffMaterial != null)
				{
					int damage = 6 + staffMaterial.getDamageVsEntity() + npc.worldObj.rand.nextInt(4);
					damage += damage * EnchantInterface.getLevel(EnchantInterface.Damage, mainWeapon) * 0.5f;
					npc.stats.pDamage = damage;
				}
				npc.stats.pSpeed = 25;
				npc.stats.fireSound = "customnpcs:magic.shot";
			}
		}
	}

	public ArrayList<ItemStack> getDroppedItems(DamageSource damagesource) {
		ArrayList<ItemStack> drops = new ArrayList<>();

		ArrayList<EntityItem> list = new ArrayList<EntityItem>();
		for (int i : items.keySet()) {
			ItemStack item = items.get(i);
			if(item == null)
				continue;
			double dchance = 100;
			if(dropchance.containsKey(i))
				dchance = dropchance.get(i);
			double chance = Math.random()*100 + dchance;
			if(chance >= 100){
				EntityItem e = getEntityItem(item.copy());
				if(e != null)
					list.add(e);
			}
		}
		for (EntityItem e : list) {
			drops.add(e.getEntityItem());
		}

		int enchant = 0;
		if (damagesource.getEntity() instanceof EntityPlayer){
			enchant = EnchantmentHelper.getLootingModifier((EntityLivingBase)damagesource.getEntity());
		}

		if (!net.minecraftforge.common.ForgeHooks.onLivingDrops(npc, damagesource, list, enchant, true, 0)){
			return drops;
		} else {
			return new ArrayList<>();
		}
	}

	public int getDroppedXp() {
		int droppedXp = minExp;
		if (maxExp - minExp > 0)
			droppedXp += npc.worldObj.rand.nextInt(maxExp - minExp);

		return droppedXp;
	}

	public void dropXp(Entity entity, int droppedXp) {
		while (droppedXp > 0){
			int var2 = EntityXPOrb.getXPSplit(droppedXp);
			droppedXp -= var2;
			if(lootMode == 1 && entity instanceof EntityPlayer){
				npc.worldObj.spawnEntityInWorld(new EntityXPOrb(entity.worldObj, entity.posX, entity.posY, entity.posZ, var2));
			}
			else{
				npc.worldObj.spawnEntityInWorld(new EntityXPOrb(npc.worldObj, npc.posX, npc.posY, npc.posZ, var2));
			}
		}
	}

	public void dropItems(Entity entity, ArrayList<ItemStack> itemList) {
		ArrayList<EntityItem> list = new ArrayList<EntityItem>();
		for (ItemStack item : itemList) {
			if(item == null)
				continue;
			EntityItem e = getEntityItem(item.copy());
			if(e != null)
				list.add(e);
		}

		for (EntityItem item : list){
			if(lootMode == 1 && entity instanceof EntityPlayer){
				EntityPlayer player = (EntityPlayer)entity;
				item.delayBeforeCanPickup = 2;
				npc.worldObj.spawnEntityInWorld(item);
				ItemStack stack = item.getEntityItem();
				int i = stack.stackSize;

				if (player.inventory.addItemStackToInventory(stack)) {
					npc.worldObj.playSoundAtEntity(item,
							"random.pop",
							0.2F,
							((npc.getRNG().nextFloat() - npc.getRNG().nextFloat()) * 0.7F + 1.0F) * 2.0F);
					player.onItemPickup(item, i);

					if (stack.stackSize <= 0) {
						item.setDead();
					}
				}
			}
			else
				npc.worldObj.spawnEntityInWorld(item);
		}
	}
	
	public EntityItem getEntityItem(ItemStack itemstack) {
		if (itemstack == null) {
			return null;
		}
		EntityItem entityitem = new EntityItem(npc.worldObj, npc.posX,
				(npc.posY - 0.30000001192092896D) + (double) npc.getEyeHeight(), npc.posZ,
				itemstack);
		entityitem.delayBeforeCanPickup = 40;

		float f2 = npc.getRNG().nextFloat() * 0.5F;
		float f4 = npc.getRNG().nextFloat() * 3.141593F * 2.0F;
		entityitem.motionX = -MathHelper.sin(f4) * f2;
		entityitem.motionZ = MathHelper.cos(f4) * f2;
		entityitem.motionY = 0.20000000298023224D;

		return entityitem;
	}
	
	public ItemStack armorItemInSlot(int i) {
		return getArmor().get(i);
	}
	@Override
	public int getSizeInventory() {
		// TODO Auto-generated method stub
		return 15;
	}
	@Override
	public ItemStack getStackInSlot(int i) {
		if(i < 4)
			return armorItemInSlot(i);
		else if(i < 7)
			return getWeapons().get(i-4);
		else
			return items.get(i-7);
	}
	@Override
	public ItemStack decrStackSize(int par1, int par2) {
		int i =0;
        HashMap<Integer,ItemStack> var3;

        if (par1 >= 7)
        {
        	var3 = items;
            par1 -= 7;
        }
        else if (par1 >= 4)
        {
        	var3 = getWeapons();
            par1 -= 4;
            i = 1;
        }
        else{
        	var3 = getArmor();
            i = 2;
        }
        
        ItemStack var4 = null;
        if (var3.get(par1) != null)
        {

            if (var3.get(par1).stackSize <= par2)
            {
                var4 = var3.get(par1);
                var3.put(par1,null);
            }
            else
            {
                var4 = var3.get(par1).splitStack(par2);

                if (var3.get(par1).stackSize == 0)
                {
                    var3.put(par1,null);
                }
            }
        }
        if(i == 1)
        	setWeapons(var3);
        if(i == 2)
        	setArmor(var3);
        return var4;
	}
	@Override
	public ItemStack getStackInSlotOnClosing(int par1) {
		int i = 0;
        HashMap<Integer,ItemStack> var2;;

        if (par1 >= 7)
        {
        	var2 = items;
            par1 -= 7;
        }
        else if (par1 >= 4)
        {
        	var2 = getWeapons();
            par1 -= 4;
            i = 1;
        }
        else{
        	var2 = getArmor();
            i = 2;
        }

        if (var2.get(par1) != null)
        {
            ItemStack var3 = var2.get(par1);
            var2.put(par1,null);
            if(i == 1)
            	setWeapons(var2);
            if(i == 2)
            	setArmor(var2);
            return var3;
        }
        else
        {
            return null;
        }
	}
	@Override
    public void setInventorySlotContents(int par1, ItemStack par2ItemStack)
    {
		int i = 0;
        HashMap<Integer,ItemStack> var3;

        if (par1 >= 7)
        {
        	var3 = items;
            par1 -= 7;
        }
        else if (par1 >= 4)
        {
        	var3 = getWeapons();
            par1 -= 4;
            i = 1;
        }
        else{
        	var3 = getArmor();
            i = 2;
        }

        var3.put(par1,par2ItemStack);
        if(i == 1)
        	setWeapons(var3);
        if(i == 2)
        	setArmor(var3);
    }
	@Override
	public int getInventoryStackLimit() {
		return 64;
	}
	@Override
	public boolean isUseableByPlayer(EntityPlayer var1) {
		return true;
	}
	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}
	@Override
	public String getInventoryName() {
		return "NPC Inventory";
	}
	@Override
	public boolean hasCustomInventoryName() {
		return true;
	}
	@Override
	public void markDirty() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void openInventory() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void closeInventory() {
		// TODO Auto-generated method stub
		
	}
}
