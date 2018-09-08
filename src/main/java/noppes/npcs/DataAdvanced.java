// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs;

import noppes.npcs.roles.JobPuppet;
import noppes.npcs.roles.JobChunkLoader;
import noppes.npcs.roles.JobConversation;
import noppes.npcs.roles.JobSpawner;
import noppes.npcs.roles.JobFollower;
import noppes.npcs.roles.JobItemGiver;
import noppes.npcs.roles.JobGuard;
import noppes.npcs.roles.JobHealer;
import noppes.npcs.roles.JobBard;
import noppes.npcs.roles.RoleCompanion;
import noppes.npcs.roles.RoleTransporter;
import noppes.npcs.roles.RoleTrader;
import noppes.npcs.roles.RolePostman;
import noppes.npcs.roles.RoleFollower;
import noppes.npcs.roles.RoleBank;
import noppes.npcs.controllers.Line;
import java.util.Iterator;
import noppes.npcs.controllers.DialogOption;
import java.util.HashMap;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.constants.EnumJobType;
import noppes.npcs.constants.EnumRoleType;
import noppes.npcs.controllers.FactionOptions;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.controllers.Lines;

public class DataAdvanced
{
    public Lines interactLines;
    public Lines worldLines;
    public Lines attackLines;
    public Lines killedLines;
    public Lines killLines;
    public boolean orderedLines;
    public String idleSound;
    public String angrySound;
    public String hurtSound;
    public String deathSound;
    public String stepSound;
    private EntityNPCInterface npc;
    public FactionOptions factions;
    public EnumRoleType role;
    public EnumJobType job;
    public boolean attackOtherFactions;
    public boolean defendFaction;
    public boolean disablePitch;
    
    public DataAdvanced(final EntityNPCInterface npc) {
        this.interactLines = new Lines();
        this.worldLines = new Lines();
        this.attackLines = new Lines();
        this.killedLines = new Lines();
        this.killLines = new Lines();
        this.orderedLines = false;
        this.idleSound = "";
        this.angrySound = "";
        this.hurtSound = "minecraft:game.player.hurt";
        this.deathSound = "minecraft:game.player.hurt";
        this.stepSound = "";
        this.factions = new FactionOptions();
        this.role = EnumRoleType.None;
        this.job = EnumJobType.None;
        this.attackOtherFactions = false;
        this.defendFaction = false;
        this.disablePitch = false;
        this.npc = npc;
    }
    
    public NBTTagCompound writeToNBT(final NBTTagCompound compound) {
        compound.setTag("NpcLines", (NBTBase)this.worldLines.writeToNBT());
        compound.setTag("NpcKilledLines", (NBTBase)this.killedLines.writeToNBT());
        compound.setTag("NpcInteractLines", (NBTBase)this.interactLines.writeToNBT());
        compound.setTag("NpcAttackLines", (NBTBase)this.attackLines.writeToNBT());
        compound.setTag("NpcKillLines", (NBTBase)this.killLines.writeToNBT());
        compound.setString("NpcIdleSound", this.idleSound);
        compound.setString("NpcAngrySound", this.angrySound);
        compound.setString("NpcHurtSound", this.hurtSound);
        compound.setString("NpcDeathSound", this.deathSound);
        compound.setString("NpcStepSound", this.stepSound);
        compound.setBoolean("OrderedLines", this.orderedLines);
        compound.setInteger("FactionID", this.npc.getFaction().id);
        compound.setBoolean("AttackOtherFactions", this.attackOtherFactions);
        compound.setBoolean("DefendFaction", this.defendFaction);
        compound.setBoolean("DisablePitch", this.disablePitch);
        compound.setInteger("Role", this.role.ordinal());
        compound.setInteger("NpcJob", this.job.ordinal());
        compound.setTag("FactionPoints", (NBTBase)this.factions.writeToNBT(new NBTTagCompound()));
        compound.setTag("NPCDialogOptions", (NBTBase)this.nbtDialogs(this.npc.dialogs));
        return compound;
    }
    
    public void readToNBT(final NBTTagCompound compound) {
        this.interactLines.readNBT(compound.getCompoundTag("NpcInteractLines"));
        this.worldLines.readNBT(compound.getCompoundTag("NpcLines"));
        this.attackLines.readNBT(compound.getCompoundTag("NpcAttackLines"));
        this.killedLines.readNBT(compound.getCompoundTag("NpcKilledLines"));
        this.killLines.readNBT(compound.getCompoundTag("NpcKillLines"));
        this.idleSound = compound.getString("NpcIdleSound");
        this.angrySound = compound.getString("NpcAngrySound");
        this.hurtSound = compound.getString("NpcHurtSound");
        this.deathSound = compound.getString("NpcDeathSound");
        this.stepSound = compound.getString("NpcStepSound");
        this.orderedLines = compound.getBoolean("OrderedLines");
        this.npc.setFaction(compound.getInteger("FactionID"));
        this.npc.faction = this.npc.getFaction();
        this.attackOtherFactions = compound.getBoolean("AttackOtherFactions");
        this.defendFaction = compound.getBoolean("DefendFaction");
        this.disablePitch = compound.getBoolean("DisablePitch");
        this.setRole(compound.getInteger("Role"));
        this.setJob(compound.getInteger("NpcJob"));
        this.factions.readFromNBT(compound.getCompoundTag("FactionPoints"));
        this.npc.dialogs = this.getDialogs(compound.getTagList("NPCDialogOptions", 10));
    }
    
    private HashMap<Integer, DialogOption> getDialogs(final NBTTagList tagList) {
        final HashMap<Integer, DialogOption> map = new HashMap<Integer, DialogOption>();
        for (int i = 0; i < tagList.tagCount(); ++i) {
            final NBTTagCompound nbttagcompound = tagList.getCompoundTagAt(i);
            final int slot = nbttagcompound.getInteger("DialogSlot");
            final DialogOption option = new DialogOption();
            option.readNBT(nbttagcompound.getCompoundTag("NPCDialog"));
            map.put(slot, option);
        }
        return map;
    }
    
    private NBTTagList nbtDialogs(final HashMap<Integer, DialogOption> dialogs2) {
        final NBTTagList nbttaglist = new NBTTagList();
        for (final int slot : dialogs2.keySet()) {
            final NBTTagCompound nbttagcompound = new NBTTagCompound();
            nbttagcompound.setInteger("DialogSlot", slot);
            nbttagcompound.setTag("NPCDialog", (NBTBase)dialogs2.get(slot).writeNBT());
            nbttaglist.appendTag((NBTBase)nbttagcompound);
        }
        return nbttaglist;
    }
    
    public Line getInteractLine() {
        return this.interactLines.getLine(!this.orderedLines);
    }
    
    public Line getAttackLine() {
        return this.attackLines.getLine(!this.orderedLines);
    }
    
    public Line getKilledLine() {
        return this.killedLines.getLine(!this.orderedLines);
    }
    
    public Line getKillLine() {
        return this.killLines.getLine(!this.orderedLines);
    }
    
    public Line getWorldLine() {
        return this.worldLines.getLine(!this.orderedLines);
    }
    
    public void setRole(int i) {
        if (EnumRoleType.values().length <= i) {
            i -= 2;
        }
        this.role = EnumRoleType.values()[i];
        if (this.role == EnumRoleType.None) {
            this.npc.roleInterface = null;
        }
        else if (this.role == EnumRoleType.Bank && !(this.npc.roleInterface instanceof RoleBank)) {
            this.npc.roleInterface = new RoleBank(this.npc);
        }
        else if (this.role == EnumRoleType.Follower && !(this.npc.roleInterface instanceof RoleFollower)) {
            this.npc.roleInterface = new RoleFollower(this.npc);
        }
        else if (this.role == EnumRoleType.Postman && !(this.npc.roleInterface instanceof RolePostman)) {
            this.npc.roleInterface = new RolePostman(this.npc);
        }
        else if (this.role == EnumRoleType.Trader && !(this.npc.roleInterface instanceof RoleTrader)) {
            this.npc.roleInterface = new RoleTrader(this.npc);
        }
        else if (this.role == EnumRoleType.Transporter && !(this.npc.roleInterface instanceof RoleTransporter)) {
            this.npc.roleInterface = new RoleTransporter(this.npc);
        }
        else if (this.role == EnumRoleType.Companion && !(this.npc.roleInterface instanceof RoleCompanion)) {
            this.npc.roleInterface = new RoleCompanion(this.npc);
        }
    }
    
    public void setJob(final int i) {
        if (this.npc.jobInterface != null && !this.npc.worldObj.isRemote) {
            this.npc.jobInterface.reset();
        }
        this.job = EnumJobType.values()[i % EnumJobType.values().length];
        if (this.job == EnumJobType.None) {
            this.npc.jobInterface = null;
        }
        else if (this.job == EnumJobType.Bard && !(this.npc.jobInterface instanceof JobBard)) {
            this.npc.jobInterface = new JobBard(this.npc);
        }
        else if (this.job == EnumJobType.Healer && !(this.npc.jobInterface instanceof JobHealer)) {
            this.npc.jobInterface = new JobHealer(this.npc);
        }
        else if (this.job == EnumJobType.Guard && !(this.npc.jobInterface instanceof JobGuard)) {
            this.npc.jobInterface = new JobGuard(this.npc);
        }
        else if (this.job == EnumJobType.ItemGiver && !(this.npc.jobInterface instanceof JobItemGiver)) {
            this.npc.jobInterface = new JobItemGiver(this.npc);
        }
        else if (this.job == EnumJobType.Follower && !(this.npc.jobInterface instanceof JobFollower)) {
            this.npc.jobInterface = new JobFollower(this.npc);
        }
        else if (this.job == EnumJobType.Spawner && !(this.npc.jobInterface instanceof JobSpawner)) {
            this.npc.jobInterface = new JobSpawner(this.npc);
        }
        else if (this.job == EnumJobType.Conversation && !(this.npc.jobInterface instanceof JobConversation)) {
            this.npc.jobInterface = new JobConversation(this.npc);
        }
        else if (this.job == EnumJobType.ChunkLoader && !(this.npc.jobInterface instanceof JobChunkLoader)) {
            this.npc.jobInterface = new JobChunkLoader(this.npc);
        }
        else if (this.job == EnumJobType.Puppet && !(this.npc.jobInterface instanceof JobPuppet)) {
            this.npc.jobInterface = new JobPuppet(this.npc);
        }
    }
    
    public boolean hasWorldLines() {
        return !this.worldLines.isEmpty();
    }
}
