// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs;

import net.minecraft.util.MathHelper;
import java.util.Iterator;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraftforge.common.ForgeHooks;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.item.EntityItem;
import java.util.ArrayList;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.item.ItemStack;
import java.util.HashMap;
import net.minecraft.inventory.IInventory;

public class DataInventory implements IInventory
{
    public HashMap<Integer, ItemStack> items;
    public HashMap<Integer, Integer> dropchance;
    public HashMap<Integer, ItemStack> weapons;
    public HashMap<Integer, ItemStack> armor;
    public int minExp;
    public int maxExp;
    public int lootMode;
    private EntityNPCInterface npc;
    
    public DataInventory(final EntityNPCInterface npc) {
        this.items = new HashMap<Integer, ItemStack>();
        this.dropchance = new HashMap<Integer, Integer>();
        this.weapons = new HashMap<Integer, ItemStack>();
        this.armor = new HashMap<Integer, ItemStack>();
        this.minExp = 0;
        this.maxExp = 0;
        this.lootMode = 0;
        this.npc = npc;
    }
    
    public NBTTagCompound writeEntityToNBT(final NBTTagCompound nbttagcompound) {
        nbttagcompound.setInteger("MinExp", this.minExp);
        nbttagcompound.setInteger("MaxExp", this.maxExp);
        nbttagcompound.setTag("NpcInv", (NBTBase)NBTTags.nbtItemStackList(this.items));
        nbttagcompound.setTag("Armor", (NBTBase)NBTTags.nbtItemStackList(this.getArmor()));
        nbttagcompound.setTag("Weapons", (NBTBase)NBTTags.nbtItemStackList(this.getWeapons()));
        nbttagcompound.setTag("DropChance", (NBTBase)NBTTags.nbtIntegerIntegerMap(this.dropchance));
        nbttagcompound.setInteger("LootMode", this.lootMode);
        return nbttagcompound;
    }
    
    public void readEntityFromNBT(final NBTTagCompound nbttagcompound) {
        this.minExp = nbttagcompound.getInteger("MinExp");
        this.maxExp = nbttagcompound.getInteger("MaxExp");
        this.items = NBTTags.getItemStackList(nbttagcompound.getTagList("NpcInv", 10));
        this.setArmor(NBTTags.getItemStackList(nbttagcompound.getTagList("Armor", 10)));
        this.setWeapons(NBTTags.getItemStackList(nbttagcompound.getTagList("Weapons", 10)));
        this.dropchance = NBTTags.getIntegerIntegerMap(nbttagcompound.getTagList("DropChance", 10));
        this.lootMode = nbttagcompound.getInteger("LootMode");
    }
    
    public HashMap<Integer, ItemStack> getWeapons() {
        return this.weapons;
    }
    
    public void setWeapons(final HashMap<Integer, ItemStack> list) {
        this.weapons = list;
    }
    
    public HashMap<Integer, ItemStack> getArmor() {
        return this.armor;
    }
    
    public void setArmor(final HashMap<Integer, ItemStack> list) {
        this.armor = list;
    }
    
    public ItemStack getWeapon() {
        return this.weapons.get(0);
    }
    
    public void setWeapon(final ItemStack item) {
        this.weapons.put(0, item);
    }
    
    public ItemStack getProjectile() {
        return this.weapons.get(1);
    }
    
    public void setProjectile(final ItemStack item) {
        this.weapons.put(1, item);
    }
    
    public ItemStack getOffHand() {
        return this.weapons.get(2);
    }
    
    public void setOffHand(final ItemStack item) {
        this.weapons.put(2, item);
    }
    
    public void dropStuff(final Entity entity, final DamageSource damagesource) {
        final ArrayList<EntityItem> list = new ArrayList<EntityItem>();
        for (final int i : this.items.keySet()) {
            final ItemStack item = this.items.get(i);
            if (item == null) {
                continue;
            }
            int dchance = 100;
            if (this.dropchance.containsKey(i)) {
                dchance = this.dropchance.get(i);
            }
            final int chance = this.npc.worldObj.rand.nextInt(100) + dchance;
            if (chance < 100) {
                continue;
            }
            final EntityItem e = this.getEntityItem(item.copy());
            if (e == null) {
                continue;
            }
            list.add(e);
        }
        int enchant = 0;
        if (damagesource.getEntity() instanceof EntityPlayer) {
            enchant = EnchantmentHelper.getLootingModifier((EntityLivingBase)damagesource.getEntity());
        }
        if (!ForgeHooks.onLivingDrops((EntityLivingBase)this.npc, damagesource, (ArrayList)list, enchant, true, 0)) {
            for (final EntityItem item2 : list) {
                if (this.lootMode == 1 && entity instanceof EntityPlayer) {
                    final EntityPlayer player = (EntityPlayer)entity;
                    item2.delayBeforeCanPickup = 2;
                    this.npc.worldObj.spawnEntityInWorld((Entity)item2);
                    final ItemStack stack = item2.getEntityItem();
                    final int j = stack.stackSize;
                    if (!player.inventory.addItemStackToInventory(stack)) {
                        continue;
                    }
                    this.npc.worldObj.playSoundAtEntity((Entity)item2, "random.pop", 0.2f, ((this.npc.getRNG().nextFloat() - this.npc.getRNG().nextFloat()) * 0.7f + 1.0f) * 2.0f);
                    player.onItemPickup((Entity)item2, j);
                    if (stack.stackSize > 0) {
                        continue;
                    }
                    item2.setDead();
                }
                else {
                    this.npc.worldObj.spawnEntityInWorld((Entity)item2);
                }
            }
        }
        int var1 = this.minExp;
        if (this.maxExp - this.minExp > 0) {
            var1 += this.npc.worldObj.rand.nextInt(this.maxExp - this.minExp);
        }
        while (var1 > 0) {
            final int var2 = EntityXPOrb.getXPSplit(var1);
            var1 -= var2;
            if (this.lootMode == 1 && entity instanceof EntityPlayer) {
                this.npc.worldObj.spawnEntityInWorld((Entity)new EntityXPOrb(entity.worldObj, entity.posX, entity.posY, entity.posZ, var2));
            }
            else {
                this.npc.worldObj.spawnEntityInWorld((Entity)new EntityXPOrb(this.npc.worldObj, this.npc.posX, this.npc.posY, this.npc.posZ, var2));
            }
        }
    }
    
    public EntityItem getEntityItem(final ItemStack itemstack) {
        if (itemstack == null) {
            return null;
        }
        final EntityItem entityitem = new EntityItem(this.npc.worldObj, this.npc.posX, this.npc.posY - 0.30000001192092896 + this.npc.getEyeHeight(), this.npc.posZ, itemstack);
        entityitem.delayBeforeCanPickup = 40;
        final float f2 = this.npc.getRNG().nextFloat() * 0.5f;
        final float f3 = this.npc.getRNG().nextFloat() * 3.141593f * 2.0f;
        entityitem.motionX = -MathHelper.sin(f3) * f2;
        entityitem.motionZ = MathHelper.cos(f3) * f2;
        entityitem.motionY = 0.20000000298023224;
        return entityitem;
    }
    
    public ItemStack armorItemInSlot(final int i) {
        return this.getArmor().get(i);
    }
    
    public int getSizeInventory() {
        return 15;
    }
    
    public ItemStack getStackInSlot(final int i) {
        if (i < 4) {
            return this.armorItemInSlot(i);
        }
        if (i < 7) {
            return this.getWeapons().get(i - 4);
        }
        return this.items.get(i - 7);
    }
    
    public ItemStack decrStackSize(int par1, final int par2) {
        int i = 0;
        HashMap<Integer, ItemStack> var3;
        if (par1 >= 7) {
            var3 = this.items;
            par1 -= 7;
        }
        else if (par1 >= 4) {
            var3 = this.getWeapons();
            par1 -= 4;
            i = 1;
        }
        else {
            var3 = this.getArmor();
            i = 2;
        }
        ItemStack var4 = null;
        if (var3.get(par1) != null) {
            if (var3.get(par1).stackSize <= par2) {
                var4 = var3.get(par1);
                var3.put(par1, null);
            }
            else {
                var4 = var3.get(par1).splitStack(par2);
                if (var3.get(par1).stackSize == 0) {
                    var3.put(par1, null);
                }
            }
        }
        if (i == 1) {
            this.setWeapons(var3);
        }
        if (i == 2) {
            this.setArmor(var3);
        }
        return var4;
    }
    
    public ItemStack getStackInSlotOnClosing(int par1) {
        int i = 0;
        HashMap<Integer, ItemStack> var2;
        if (par1 >= 7) {
            var2 = this.items;
            par1 -= 7;
        }
        else if (par1 >= 4) {
            var2 = this.getWeapons();
            par1 -= 4;
            i = 1;
        }
        else {
            var2 = this.getArmor();
            i = 2;
        }
        if (var2.get(par1) != null) {
            final ItemStack var3 = var2.get(par1);
            var2.put(par1, null);
            if (i == 1) {
                this.setWeapons(var2);
            }
            if (i == 2) {
                this.setArmor(var2);
            }
            return var3;
        }
        return null;
    }
    
    public void setInventorySlotContents(int par1, final ItemStack par2ItemStack) {
        int i = 0;
        HashMap<Integer, ItemStack> var3;
        if (par1 >= 7) {
            var3 = this.items;
            par1 -= 7;
        }
        else if (par1 >= 4) {
            var3 = this.getWeapons();
            par1 -= 4;
            i = 1;
        }
        else {
            var3 = this.getArmor();
            i = 2;
        }
        var3.put(par1, par2ItemStack);
        if (i == 1) {
            this.setWeapons(var3);
        }
        if (i == 2) {
            this.setArmor(var3);
        }
    }
    
    public int getInventoryStackLimit() {
        return 64;
    }
    
    public boolean isUseableByPlayer(final EntityPlayer var1) {
        return true;
    }
    
    public boolean isItemValidForSlot(final int i, final ItemStack itemstack) {
        return true;
    }
    
    public String getInventoryName() {
        return "NPC Inventory";
    }
    
    public boolean hasCustomInventoryName() {
        return true;
    }
    
    public void markDirty() {
    }
    
    public void openInventory() {
    }
    
    public void closeInventory() {
    }
}
