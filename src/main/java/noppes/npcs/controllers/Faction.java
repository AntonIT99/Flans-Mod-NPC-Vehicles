// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTBase;
import noppes.npcs.NBTTags;
import net.minecraft.nbt.NBTTagCompound;
import java.util.HashSet;

public class Faction
{
    public String name;
    public int color;
    public HashSet<Integer> attackFactions;
    public int id;
    public int neutralPoints;
    public int friendlyPoints;
    public int defaultPoints;
    public boolean hideFaction;
    public boolean getsAttacked;
    
    public Faction() {
        this.name = "";
        this.color = Integer.parseInt("FF00", 16);
        this.id = -1;
        this.neutralPoints = 500;
        this.friendlyPoints = 1500;
        this.defaultPoints = 1000;
        this.hideFaction = false;
        this.getsAttacked = false;
        this.attackFactions = new HashSet<Integer>();
    }
    
    public Faction(final int id, final String name, final int color, final int defaultPoints) {
        this.name = "";
        this.color = Integer.parseInt("FF00", 16);
        this.id = -1;
        this.neutralPoints = 500;
        this.friendlyPoints = 1500;
        this.defaultPoints = 1000;
        this.hideFaction = false;
        this.getsAttacked = false;
        this.name = name;
        this.color = color;
        this.defaultPoints = defaultPoints;
        this.id = id;
        this.attackFactions = new HashSet<Integer>();
    }
    
    public static String formatName(String name) {
        name = name.toLowerCase().trim();
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
    
    public void readNBT(final NBTTagCompound compound) {
        this.name = compound.getString("Name");
        this.color = compound.getInteger("Color");
        this.id = compound.getInteger("Slot");
        this.neutralPoints = compound.getInteger("NeutralPoints");
        this.friendlyPoints = compound.getInteger("FriendlyPoints");
        this.defaultPoints = compound.getInteger("DefaultPoints");
        this.hideFaction = compound.getBoolean("HideFaction");
        this.getsAttacked = compound.getBoolean("GetsAttacked");
        this.attackFactions = NBTTags.getIntegerSet(compound.getTagList("AttackFactions", 10));
    }
    
    public void writeNBT(final NBTTagCompound compound) {
        compound.setInteger("Slot", this.id);
        compound.setString("Name", this.name);
        compound.setInteger("Color", this.color);
        compound.setInteger("NeutralPoints", this.neutralPoints);
        compound.setInteger("FriendlyPoints", this.friendlyPoints);
        compound.setInteger("DefaultPoints", this.defaultPoints);
        compound.setBoolean("HideFaction", this.hideFaction);
        compound.setBoolean("GetsAttacked", this.getsAttacked);
        compound.setTag("AttackFactions", (NBTBase)NBTTags.nbtIntegerSet(this.attackFactions));
    }
    
    public boolean isFriendlyToPlayer(final EntityPlayer player) {
        final PlayerFactionData data = PlayerDataController.instance.getPlayerData(player).factionData;
        return data.getFactionPoints(this.id) >= this.friendlyPoints;
    }
    
    public boolean isAggressiveToPlayer(final EntityPlayer player) {
        final PlayerFactionData data = PlayerDataController.instance.getPlayerData(player).factionData;
        return data.getFactionPoints(this.id) < this.neutralPoints;
    }
    
    public boolean isNeutralToPlayer(final EntityPlayer player) {
        final PlayerFactionData data = PlayerDataController.instance.getPlayerData(player).factionData;
        final int points = data.getFactionPoints(this.id);
        return points >= this.neutralPoints && points < this.friendlyPoints;
    }
    
    public boolean isAggressiveToNpc(final EntityNPCInterface entity) {
        return this.attackFactions.contains(entity.faction.id);
    }
}
