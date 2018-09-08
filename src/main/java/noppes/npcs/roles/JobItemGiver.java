// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.roles;

import net.minecraft.entity.Entity;
import java.util.Collection;
import net.minecraft.item.Item;
import noppes.npcs.controllers.PlayerItemGiverData;
import noppes.npcs.controllers.Line;
import net.minecraft.item.ItemStack;
import java.util.Vector;
import noppes.npcs.controllers.PlayerDataController;
import java.util.Iterator;
import net.minecraft.nbt.NBTTagList;
import java.util.HashMap;
import noppes.npcs.controllers.GlobalDataController;
import net.minecraft.nbt.NBTBase;
import noppes.npcs.NBTTags;
import net.minecraft.nbt.NBTTagCompound;
import java.util.ArrayList;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.controllers.Availability;
import net.minecraft.entity.player.EntityPlayer;
import java.util.List;
import noppes.npcs.NpcMiscInventory;

public class JobItemGiver extends JobInterface
{
    public int cooldownType;
    public int givingMethod;
    public int cooldown;
    public NpcMiscInventory inventory;
    public int itemGiverId;
    public List<String> lines;
    private int ticks;
    private List<EntityPlayer> recentlyChecked;
    private List<EntityPlayer> toCheck;
    public Availability availability;
    
    public JobItemGiver(final EntityNPCInterface npc) {
        super(npc);
        this.cooldownType = 0;
        this.givingMethod = 0;
        this.cooldown = 10;
        this.itemGiverId = 0;
        this.lines = new ArrayList<String>();
        this.ticks = 10;
        this.recentlyChecked = new ArrayList<EntityPlayer>();
        this.availability = new Availability();
        this.inventory = new NpcMiscInventory(9);
        this.lines.add("Have these items {player}");
    }
    
    @Override
    public NBTTagCompound writeToNBT(final NBTTagCompound nbttagcompound) {
        nbttagcompound.setInteger("igCooldownType", this.cooldownType);
        nbttagcompound.setInteger("igGivingMethod", this.givingMethod);
        nbttagcompound.setInteger("igCooldown", this.cooldown);
        nbttagcompound.setInteger("ItemGiverId", this.itemGiverId);
        nbttagcompound.setTag("igLines", (NBTBase)NBTTags.nbtStringList(this.lines));
        nbttagcompound.setTag("igJobInventory", (NBTBase)this.inventory.getToNBT());
        nbttagcompound.setTag("igAvailability", (NBTBase)this.availability.writeToNBT(new NBTTagCompound()));
        return nbttagcompound;
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound nbttagcompound) {
        this.itemGiverId = nbttagcompound.getInteger("ItemGiverId");
        this.cooldownType = nbttagcompound.getInteger("igCooldownType");
        this.givingMethod = nbttagcompound.getInteger("igGivingMethod");
        this.cooldown = nbttagcompound.getInteger("igCooldown");
        this.lines = NBTTags.getStringList(nbttagcompound.getTagList("igLines", 10));
        this.inventory.setFromNBT(nbttagcompound.getCompoundTag("igJobInventory"));
        if (this.itemGiverId == 0 && GlobalDataController.instance != null) {
            this.itemGiverId = GlobalDataController.instance.incrementItemGiverId();
        }
        this.availability.readFromNBT(nbttagcompound.getCompoundTag("igAvailability"));
    }
    
    public NBTTagList newHashMapNBTList(final HashMap<String, Long> lines) {
        final NBTTagList nbttaglist = new NBTTagList();
        for (final String s : lines.keySet()) {
            final NBTTagCompound nbttagcompound = new NBTTagCompound();
            nbttagcompound.setString("Line", s);
            nbttagcompound.setLong("Time", (long)lines.get(s));
            nbttaglist.appendTag((NBTBase)nbttagcompound);
        }
        return nbttaglist;
    }
    
    public HashMap<String, Long> getNBTLines(final NBTTagList tagList) {
        final HashMap<String, Long> map = new HashMap<String, Long>();
        for (int i = 0; i < tagList.tagCount(); ++i) {
            final NBTTagCompound nbttagcompound = tagList.getCompoundTagAt(i);
            final String line = nbttagcompound.getString("Line");
            final long time = nbttagcompound.getLong("Time");
            map.put(line, time);
        }
        return map;
    }
    
    private boolean giveItems(final EntityPlayer player) {
        final PlayerItemGiverData data = PlayerDataController.instance.getPlayerData(player).itemgiverData;
        if (!this.canPlayerInteract(data)) {
            return false;
        }
        final Vector<ItemStack> items = new Vector<ItemStack>();
        Vector<ItemStack> toGive = new Vector<ItemStack>();
        for (final ItemStack is : this.inventory.items.values()) {
            if (is != null) {
                items.add(is.copy());
            }
        }
        if (items.isEmpty()) {
            return false;
        }
        if (this.isAllGiver()) {
            toGive = items;
        }
        else if (this.isRemainingGiver()) {
            for (final ItemStack is : items) {
                if (!this.playerHasItem(player, is.getItem())) {
                    toGive.add(is);
                }
            }
        }
        else if (this.isRandomGiver()) {
            toGive.add(items.get(this.npc.worldObj.rand.nextInt(items.size())).copy());
        }
        else if (this.isGiverWhenNotOwnedAny()) {
            boolean ownsItems = false;
            for (final ItemStack is2 : items) {
                if (this.playerHasItem(player, is2.getItem())) {
                    ownsItems = true;
                    break;
                }
            }
            if (ownsItems) {
                return false;
            }
            toGive = items;
        }
        else if (this.isChainedGiver()) {
            final int itemIndex = data.getItemIndex(this);
            int i = 0;
            for (final ItemStack item : this.inventory.items.values()) {
                if (i == itemIndex) {
                    toGive.add(item);
                    break;
                }
                ++i;
            }
        }
        if (toGive.isEmpty()) {
            return false;
        }
        if (this.givePlayerItems(player, toGive)) {
            if (!this.lines.isEmpty()) {
                this.npc.say(player, new Line(this.lines.get(this.npc.getRNG().nextInt(this.lines.size()))));
            }
            if (this.isDaily()) {
                data.setTime(this, this.getDay());
            }
            else {
                data.setTime(this, System.currentTimeMillis());
            }
            if (this.isChainedGiver()) {
                data.setItemIndex(this, (data.getItemIndex(this) + 1) % this.inventory.items.size());
            }
            return true;
        }
        return false;
    }
    
    private int getDay() {
        return (int)(this.npc.worldObj.getTotalWorldTime() / 24000L);
    }
    
    private boolean canPlayerInteract(final PlayerItemGiverData data) {
        if (this.inventory.items.isEmpty()) {
            return false;
        }
        if (this.isOnTimer()) {
            return !data.hasInteractedBefore(this) || data.getTime(this) + this.cooldown * 1000 < System.currentTimeMillis();
        }
        if (this.isGiveOnce()) {
            return !data.hasInteractedBefore(this);
        }
        return this.isDaily() && (!data.hasInteractedBefore(this) || this.getDay() > data.getTime(this));
    }
    
    private boolean givePlayerItems(final EntityPlayer player, final Vector<ItemStack> toGive) {
        if (toGive.isEmpty()) {
            return false;
        }
        if (this.freeInventorySlots(player) < toGive.size()) {
            return false;
        }
        for (final ItemStack is : toGive) {
            this.npc.givePlayerItem(player, is);
        }
        return true;
    }
    
    private boolean playerHasItem(final EntityPlayer player, final Item item) {
        for (final ItemStack is : player.inventory.mainInventory) {
            if (is != null && is.getItem() == item) {
                return true;
            }
        }
        for (final ItemStack is : player.inventory.armorInventory) {
            if (is != null && is.getItem() == item) {
                return true;
            }
        }
        return false;
    }
    
    private int freeInventorySlots(final EntityPlayer player) {
        int i = 0;
        for (final ItemStack is : player.inventory.mainInventory) {
            if (is == null) {
                ++i;
            }
        }
        return i;
    }
    
    private boolean isRandomGiver() {
        return this.givingMethod == 0;
    }
    
    private boolean isAllGiver() {
        return this.givingMethod == 1;
    }
    
    private boolean isRemainingGiver() {
        return this.givingMethod == 2;
    }
    
    private boolean isGiverWhenNotOwnedAny() {
        return this.givingMethod == 3;
    }
    
    private boolean isChainedGiver() {
        return this.givingMethod == 4;
    }
    
    public boolean isOnTimer() {
        return this.cooldownType == 0;
    }
    
    private boolean isGiveOnce() {
        return this.cooldownType == 1;
    }
    
    private boolean isDaily() {
        return this.cooldownType == 2;
    }
    
    @Override
    public boolean aiShouldExecute() {
        if (this.npc.isAttacking()) {
            return false;
        }
        --this.ticks;
        if (this.ticks > 0) {
            return false;
        }
        this.ticks = 10;
        (this.toCheck = (List<EntityPlayer>)this.npc.worldObj.getEntitiesWithinAABB((Class)EntityPlayer.class, this.npc.boundingBox.expand(3.0, 3.0, 3.0))).removeAll(this.recentlyChecked);
        final List<EntityPlayer> listMax = (List<EntityPlayer>)this.npc.worldObj.getEntitiesWithinAABB((Class)EntityPlayer.class, this.npc.boundingBox.expand(10.0, 10.0, 10.0));
        this.recentlyChecked.retainAll(listMax);
        this.recentlyChecked.addAll(this.toCheck);
        return this.toCheck.size() > 0;
    }
    
    @Override
    public void aiStartExecuting() {
        for (final EntityPlayer player : this.toCheck) {
            if (this.npc.canSee((Entity)player) && this.availability.isAvailable(player)) {
                this.recentlyChecked.add(player);
                this.interact(player);
            }
        }
    }
    
    @Override
    public void killed() {
    }
    
    private boolean interact(final EntityPlayer player) {
        if (!this.giveItems(player)) {
            this.npc.say(player, this.npc.advanced.getInteractLine());
        }
        return true;
    }
    
    @Override
    public void delete() {
    }
}
