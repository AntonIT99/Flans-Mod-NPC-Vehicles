// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.roles;

import noppes.npcs.constants.EnumJobType;
import noppes.npcs.NoppesUtilServer;
import noppes.npcs.constants.EnumGuiType;
import java.util.UUID;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import noppes.npcs.NoppesStringUtils;
import net.minecraft.nbt.NBTBase;
import noppes.npcs.NBTTags;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.StatCollector;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.NpcMiscInventory;
import java.util.HashMap;

public class RoleFollower extends RoleInterface
{
    private String ownerUUID;
    public boolean isFollowing;
    public HashMap<Integer, Integer> rates;
    public NpcMiscInventory inventory;
    public String dialogHire;
    public String dialogFarewell;
    public int daysHired;
    public long hiredTime;
    public boolean disableGui;
    public boolean infiniteDays;
    public boolean refuseSoulStone;
    public EntityPlayer owner;
    
    public RoleFollower(final EntityNPCInterface npc) {
        super(npc);
        this.isFollowing = true;
        this.dialogHire = StatCollector.translateToLocal("follower.hireText") + " {days} " + StatCollector.translateToLocal("follower.days");
        this.dialogFarewell = StatCollector.translateToLocal("follower.farewellText") + " {player}";
        this.disableGui = false;
        this.infiniteDays = false;
        this.refuseSoulStone = false;
        this.owner = null;
        this.inventory = new NpcMiscInventory(3);
        this.rates = new HashMap<Integer, Integer>();
    }
    
    @Override
    public NBTTagCompound writeToNBT(final NBTTagCompound nbttagcompound) {
        nbttagcompound.setInteger("MercenaryDaysHired", this.daysHired);
        nbttagcompound.setLong("MercenaryHiredTime", this.hiredTime);
        nbttagcompound.setString("MercenaryDialogHired", this.dialogHire);
        nbttagcompound.setString("MercenaryDialogFarewell", this.dialogFarewell);
        if (this.hasOwner()) {
            nbttagcompound.setString("MercenaryOwner", this.ownerUUID);
        }
        nbttagcompound.setTag("MercenaryDayRates", (NBTBase)NBTTags.nbtIntegerIntegerMap(this.rates));
        nbttagcompound.setTag("MercenaryInv", (NBTBase)this.inventory.getToNBT());
        nbttagcompound.setBoolean("MercenaryIsFollowing", this.isFollowing);
        nbttagcompound.setBoolean("MercenaryDisableGui", this.disableGui);
        nbttagcompound.setBoolean("MercenaryInfiniteDays", this.infiniteDays);
        nbttagcompound.setBoolean("MercenaryRefuseSoulstone", this.refuseSoulStone);
        return nbttagcompound;
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound nbttagcompound) {
        this.ownerUUID = nbttagcompound.getString("MercenaryOwner");
        this.daysHired = nbttagcompound.getInteger("MercenaryDaysHired");
        this.hiredTime = nbttagcompound.getLong("MercenaryHiredTime");
        this.dialogHire = nbttagcompound.getString("MercenaryDialogHired");
        this.dialogFarewell = nbttagcompound.getString("MercenaryDialogFarewell");
        this.rates = NBTTags.getIntegerIntegerMap(nbttagcompound.getTagList("MercenaryDayRates", 10));
        this.inventory.setFromNBT(nbttagcompound.getCompoundTag("MercenaryInv"));
        this.isFollowing = nbttagcompound.getBoolean("MercenaryIsFollowing");
        this.disableGui = nbttagcompound.getBoolean("MercenaryDisableGui");
        this.infiniteDays = nbttagcompound.getBoolean("MercenaryInfiniteDays");
        this.refuseSoulStone = nbttagcompound.getBoolean("MercenaryRefuseSoulstone");
    }
    
    @Override
    public boolean aiShouldExecute() {
        this.owner = this.getOwner();
        if (!this.infiniteDays && this.owner != null && this.getDaysLeft() <= 0) {
            this.owner.addChatMessage((IChatComponent)new ChatComponentTranslation(NoppesStringUtils.formatText(this.dialogFarewell, this.owner, this.npc), new Object[0]));
            this.killed();
        }
        return false;
    }
    
    public EntityPlayer getOwner() {
        if (this.ownerUUID == null || this.ownerUUID.isEmpty()) {
            return null;
        }
        try {
            final UUID uuid = UUID.fromString(this.ownerUUID);
            if (uuid != null) {
                return this.npc.worldObj.func_152378_a(uuid);
            }
        }
        catch (IllegalArgumentException ex) {}
        return this.npc.worldObj.getPlayerEntityByName(this.ownerUUID);
    }
    
    public boolean hasOwner() {
        return (this.infiniteDays || this.daysHired > 0) && this.ownerUUID != null && !this.ownerUUID.isEmpty();
    }
    
    @Override
    public void killed() {
        this.ownerUUID = null;
        this.daysHired = 0;
        this.hiredTime = 0L;
        this.isFollowing = true;
    }
    
    public int getDaysLeft() {
        if (this.infiniteDays) {
            return 100;
        }
        if (this.daysHired <= 0) {
            return 0;
        }
        final int days = (int)((this.npc.worldObj.getTotalWorldTime() - this.hiredTime) / 24000L);
        return this.daysHired - days;
    }
    
    public void addDays(final int days) {
        this.daysHired = days + this.getDaysLeft();
        this.hiredTime = this.npc.worldObj.getTotalWorldTime();
    }
    
    @Override
    public void interact(final EntityPlayer player) {
        if (this.ownerUUID == null || this.ownerUUID.isEmpty()) {
            this.npc.say(player, this.npc.advanced.getInteractLine());
            NoppesUtilServer.sendOpenGui(player, EnumGuiType.PlayerFollowerHire, this.npc);
        }
        else if (player == this.owner && !this.disableGui) {
            NoppesUtilServer.sendOpenGui(player, EnumGuiType.PlayerFollower, this.npc);
        }
    }
    
    @Override
    public boolean defendOwner() {
        return this.isFollowing() && this.npc.advanced.job == EnumJobType.Guard;
    }
    
    @Override
    public void delete() {
    }
    
    public boolean isFollowing() {
        return this.owner != null && this.isFollowing && this.getDaysLeft() > 0;
    }
    
    public void setOwner(final EntityPlayer player) {
        final UUID id = player.getUniqueID();
        if (this.ownerUUID == null || id == null || !this.ownerUUID.equals(id)) {
            this.killed();
        }
        this.ownerUUID = id.toString();
    }
}
