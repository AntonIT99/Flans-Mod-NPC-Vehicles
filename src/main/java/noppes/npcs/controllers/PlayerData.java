// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import net.minecraft.world.World;
import net.minecraft.nbt.NBTBase;
import net.minecraft.entity.Entity;
import noppes.npcs.roles.RoleCompanion;
import noppes.npcs.constants.EnumRoleType;
import noppes.npcs.entity.EntityCustomNpc;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraftforge.common.IExtendedEntityProperties;

public class PlayerData implements IExtendedEntityProperties
{
    public PlayerDialogData dialogData;
    public PlayerBankData bankData;
    public PlayerQuestData questData;
    public PlayerTransportData transportData;
    public PlayerFactionData factionData;
    public PlayerItemGiverData itemgiverData;
    public PlayerMailData mailData;
    public EntityNPCInterface editingNpc;
    public NBTTagCompound cloned;
    public EntityPlayer player;
    public String playername;
    public String uuid;
    private EntityNPCInterface activeCompanion;
    public int companionID;
    
    public PlayerData() {
        this.dialogData = new PlayerDialogData();
        this.bankData = new PlayerBankData();
        this.questData = new PlayerQuestData();
        this.transportData = new PlayerTransportData();
        this.factionData = new PlayerFactionData();
        this.itemgiverData = new PlayerItemGiverData();
        this.mailData = new PlayerMailData();
        this.playername = "";
        this.uuid = "";
        this.activeCompanion = null;
        this.companionID = 0;
    }
    
    public void saveNBTData(final NBTTagCompound compound) {
        PlayerDataController.instance.savePlayerData(this);
    }
    
    public void loadNBTData(final NBTTagCompound compound) {
        NBTTagCompound data = PlayerDataController.instance.loadPlayerData(this.player.getPersistentID().toString());
        if (data.hasNoTags()) {
            data = PlayerDataController.instance.loadPlayerDataOld(this.player.getCommandSenderName());
        }
        this.setNBT(data);
    }
    
    public void setNBT(final NBTTagCompound data) {
        this.dialogData.loadNBTData(data);
        this.bankData.loadNBTData(data);
        this.questData.loadNBTData(data);
        this.transportData.loadNBTData(data);
        this.factionData.loadNBTData(data);
        this.itemgiverData.loadNBTData(data);
        this.mailData.loadNBTData(data);
        if (this.player != null) {
            this.playername = this.player.getCommandSenderName();
            this.uuid = this.player.getPersistentID().toString();
        }
        else {
            this.playername = data.getString("PlayerName");
            this.uuid = data.getString("UUID");
        }
        this.companionID = data.getInteger("PlayerCompanionId");
        if (data.hasKey("PlayerCompanion") && !this.hasCompanion()) {
            final EntityCustomNpc npc = new EntityCustomNpc(this.player.worldObj);
            npc.readEntityFromNBT(data.getCompoundTag("PlayerCompanion"));
            npc.setPosition(this.player.posX, this.player.posY, this.player.posZ);
            if (npc.advanced.role == EnumRoleType.Companion) {
                this.setCompanion(npc);
                ((RoleCompanion)npc.roleInterface).setSitting(false);
                this.player.worldObj.spawnEntityInWorld((Entity)npc);
            }
        }
    }
    
    public NBTTagCompound getNBT() {
        if (this.player != null) {
            this.playername = this.player.getCommandSenderName();
            this.uuid = this.player.getPersistentID().toString();
        }
        final NBTTagCompound compound = new NBTTagCompound();
        this.dialogData.saveNBTData(compound);
        this.bankData.saveNBTData(compound);
        this.questData.saveNBTData(compound);
        this.transportData.saveNBTData(compound);
        this.factionData.saveNBTData(compound);
        this.itemgiverData.saveNBTData(compound);
        this.mailData.saveNBTData(compound);
        compound.setString("PlayerName", this.playername);
        compound.setString("UUID", this.uuid);
        compound.setInteger("PlayerCompanionId", this.companionID);
        if (this.hasCompanion()) {
            final NBTTagCompound nbt = new NBTTagCompound();
            if (this.activeCompanion.writeToNBTOptional(nbt)) {
                compound.setTag("PlayerCompanion", (NBTBase)nbt);
            }
        }
        return compound;
    }
    
    public void init(final Entity entity, final World world) {
    }
    
    public boolean hasCompanion() {
        return this.activeCompanion != null && !this.activeCompanion.isDead;
    }
    
    public void setCompanion(final EntityNPCInterface npc) {
        if (npc != null && npc.advanced.role != EnumRoleType.Companion) {
            return;
        }
        ++this.companionID;
        if ((this.activeCompanion = npc) != null) {
            ((RoleCompanion)npc.roleInterface).companionID = this.companionID;
        }
        this.saveNBTData(null);
    }
    
    public void updateCompanion(final World world) {
        if (!this.hasCompanion() || world == this.activeCompanion.worldObj) {
            return;
        }
        final RoleCompanion role = (RoleCompanion)this.activeCompanion.roleInterface;
        role.owner = this.player;
        if (!role.isFollowing()) {
            return;
        }
        final NBTTagCompound nbt = new NBTTagCompound();
        this.activeCompanion.writeToNBTOptional(nbt);
        this.activeCompanion.isDead = true;
        final EntityCustomNpc npc = new EntityCustomNpc(world);
        npc.readEntityFromNBT(nbt);
        npc.setPosition(this.player.posX, this.player.posY, this.player.posZ);
        this.setCompanion(npc);
        ((RoleCompanion)npc.roleInterface).setSitting(false);
        world.spawnEntityInWorld((Entity)npc);
    }
}
