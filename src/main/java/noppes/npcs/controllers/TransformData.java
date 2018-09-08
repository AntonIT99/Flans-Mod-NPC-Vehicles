// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import noppes.npcs.constants.EnumAnimation;
import noppes.npcs.NBTTags;
import java.util.Iterator;
import java.util.Set;
import noppes.npcs.entity.EntityCustomNpc;
import noppes.npcs.constants.EnumRoleType;
import noppes.npcs.constants.EnumJobType;
import net.minecraft.nbt.NBTBase;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.nbt.NBTTagCompound;

public class TransformData
{
    public NBTTagCompound display;
    public NBTTagCompound ai;
    public NBTTagCompound advanced;
    public NBTTagCompound inv;
    public NBTTagCompound stats;
    public NBTTagCompound role;
    public NBTTagCompound job;
    public boolean hasDisplay;
    public boolean hasAi;
    public boolean hasAdvanced;
    public boolean hasInv;
    public boolean hasStats;
    public boolean hasRole;
    public boolean hasJob;
    public boolean isActive;
    private EntityNPCInterface npc;
    public boolean editingModus;
    
    public TransformData(final EntityNPCInterface npc) {
        this.editingModus = false;
        this.npc = npc;
    }
    
    public NBTTagCompound writeToNBT(final NBTTagCompound compound) {
        compound.setBoolean("TransformIsActive", this.isActive);
        this.writeOptions(compound);
        if (this.hasDisplay) {
            compound.setTag("TransformDisplay", (NBTBase)this.display);
        }
        if (this.hasAi) {
            compound.setTag("TransformAI", (NBTBase)this.ai);
        }
        if (this.hasAdvanced) {
            compound.setTag("TransformAdvanced", (NBTBase)this.advanced);
        }
        if (this.hasInv) {
            compound.setTag("TransformInv", (NBTBase)this.inv);
        }
        if (this.hasStats) {
            compound.setTag("TransformStats", (NBTBase)this.stats);
        }
        if (this.hasRole) {
            compound.setTag("TransformRole", (NBTBase)this.role);
        }
        if (this.hasJob) {
            compound.setTag("TransformJob", (NBTBase)this.job);
        }
        return compound;
    }
    
    public Object writeOptions(final NBTTagCompound compound) {
        compound.setBoolean("TransformHasDisplay", this.hasDisplay);
        compound.setBoolean("TransformHasAI", this.hasAi);
        compound.setBoolean("TransformHasAdvanced", this.hasAdvanced);
        compound.setBoolean("TransformHasInv", this.hasInv);
        compound.setBoolean("TransformHasStats", this.hasStats);
        compound.setBoolean("TransformHasRole", this.hasRole);
        compound.setBoolean("TransformHasJob", this.hasJob);
        compound.setBoolean("TransformEditingModus", this.editingModus);
        return compound;
    }
    
    public void readToNBT(final NBTTagCompound compound) {
        this.isActive = compound.getBoolean("TransformIsActive");
        this.readOptions(compound);
        this.display = (this.hasDisplay ? compound.getCompoundTag("TransformDisplay") : this.getDisplay());
        this.ai = (this.hasAi ? compound.getCompoundTag("TransformAI") : this.npc.ai.writeToNBT(new NBTTagCompound()));
        this.advanced = (this.hasAdvanced ? compound.getCompoundTag("TransformAdvanced") : this.getAdvanced());
        this.inv = (this.hasInv ? compound.getCompoundTag("TransformInv") : this.npc.inventory.writeEntityToNBT(new NBTTagCompound()));
        this.stats = (this.hasStats ? compound.getCompoundTag("TransformStats") : this.npc.stats.writeToNBT(new NBTTagCompound()));
        this.job = (this.hasJob ? compound.getCompoundTag("TransformJob") : this.getJob());
        this.role = (this.hasRole ? compound.getCompoundTag("TransformRole") : this.getRole());
    }
    
    public NBTTagCompound getJob() {
        final NBTTagCompound compound = new NBTTagCompound();
        compound.setInteger("NpcJob", this.npc.advanced.job.ordinal());
        if (this.npc.advanced.job != EnumJobType.None && this.npc.jobInterface != null) {
            this.npc.jobInterface.writeToNBT(compound);
        }
        return compound;
    }
    
    public NBTTagCompound getRole() {
        final NBTTagCompound compound = new NBTTagCompound();
        compound.setInteger("Role", this.npc.advanced.role.ordinal());
        if (this.npc.advanced.role != EnumRoleType.None && this.npc.roleInterface != null) {
            this.npc.roleInterface.writeToNBT(compound);
        }
        return compound;
    }
    
    public NBTTagCompound getDisplay() {
        final NBTTagCompound compound = this.npc.display.writeToNBT(new NBTTagCompound());
        if (this.npc instanceof EntityCustomNpc) {
            compound.setTag("ModelData", (NBTBase)((EntityCustomNpc)this.npc).modelData.writeToNBT());
        }
        return compound;
    }
    
    public NBTTagCompound getAdvanced() {
        final EnumJobType jopType = this.npc.advanced.job;
        final EnumRoleType roleType = this.npc.advanced.role;
        this.npc.advanced.job = EnumJobType.None;
        this.npc.advanced.role = EnumRoleType.None;
        final NBTTagCompound compound = this.npc.advanced.writeToNBT(new NBTTagCompound());
        compound.removeTag("Role");
        compound.removeTag("NpcJob");
        this.npc.advanced.job = jopType;
        this.npc.advanced.role = roleType;
        return compound;
    }
    
    public void readOptions(final NBTTagCompound compound) {
        final boolean hadDisplay = this.hasDisplay;
        final boolean hadAI = this.hasAi;
        final boolean hadAdvanced = this.hasAdvanced;
        final boolean hadInv = this.hasInv;
        final boolean hadStats = this.hasStats;
        final boolean hadRole = this.hasRole;
        final boolean hadJob = this.hasJob;
        this.hasDisplay = compound.getBoolean("TransformHasDisplay");
        this.hasAi = compound.getBoolean("TransformHasAI");
        this.hasAdvanced = compound.getBoolean("TransformHasAdvanced");
        this.hasInv = compound.getBoolean("TransformHasInv");
        this.hasStats = compound.getBoolean("TransformHasStats");
        this.hasRole = compound.getBoolean("TransformHasRole");
        this.hasJob = compound.getBoolean("TransformHasJob");
        this.editingModus = compound.getBoolean("TransformEditingModus");
        if (this.hasDisplay && !hadDisplay) {
            this.display = this.getDisplay();
        }
        if (this.hasAi && !hadAI) {
            this.ai = this.npc.ai.writeToNBT(new NBTTagCompound());
        }
        if (this.hasStats && !hadStats) {
            this.stats = this.npc.stats.writeToNBT(new NBTTagCompound());
        }
        if (this.hasInv && !hadInv) {
            this.inv = this.npc.inventory.writeEntityToNBT(new NBTTagCompound());
        }
        if (this.hasAdvanced && !hadAdvanced) {
            this.advanced = this.getAdvanced();
        }
        if (this.hasJob && !hadJob) {
            this.job = this.getJob();
        }
        if (this.hasRole && !hadRole) {
            this.role = this.getRole();
        }
    }
    
    public boolean isValid() {
        return this.hasAdvanced || this.hasAi || this.hasDisplay || this.hasInv || this.hasStats || this.hasJob || this.hasRole;
    }
    
    public NBTTagCompound processAdvanced(NBTTagCompound compoundAdv, NBTTagCompound compoundRole, NBTTagCompound compoundJob) {
        if (this.hasAdvanced) {
            compoundAdv = this.advanced;
        }
        if (this.hasRole) {
            compoundRole = this.role;
        }
        if (this.hasJob) {
            compoundJob = this.job;
        }
        Set<String> names = (Set<String>)compoundRole.func_150296_c();
        for (final String name : names) {
            compoundAdv.setTag(name, compoundRole.getTag(name));
        }
        names = (Set<String>)compoundJob.func_150296_c();
        for (final String name : names) {
            compoundAdv.setTag(name, compoundJob.getTag(name));
        }
        return compoundAdv;
    }
    
    public void transform(final boolean isActive) {
        if (this.isActive == isActive) {
            return;
        }
        if (this.hasDisplay) {
            final NBTTagCompound compound = this.getDisplay();
            this.npc.display.readToNBT(NBTTags.NBTMerge(compound, this.display));
            if (this.npc instanceof EntityCustomNpc) {
                ((EntityCustomNpc)this.npc).modelData.readFromNBT(NBTTags.NBTMerge(compound.getCompoundTag("ModelData"), this.display.getCompoundTag("ModelData")));
            }
            this.display = compound;
        }
        if (this.hasStats) {
            final NBTTagCompound compound = this.npc.stats.writeToNBT(new NBTTagCompound());
            this.npc.stats.readToNBT(NBTTags.NBTMerge(compound, this.stats));
            this.stats = compound;
        }
        if (this.hasAdvanced || this.hasJob || this.hasRole) {
            final NBTTagCompound compoundAdv = this.getAdvanced();
            final NBTTagCompound compoundRole = this.getRole();
            final NBTTagCompound compoundJob = this.getJob();
            final NBTTagCompound compound2 = this.processAdvanced(compoundAdv, compoundRole, compoundJob);
            this.npc.advanced.readToNBT(compound2);
            if (this.npc.advanced.role != EnumRoleType.None && this.npc.roleInterface != null) {
                this.npc.roleInterface.readFromNBT(NBTTags.NBTMerge(compoundRole, compound2));
            }
            if (this.npc.advanced.job != EnumJobType.None && this.npc.jobInterface != null) {
                this.npc.jobInterface.readFromNBT(NBTTags.NBTMerge(compoundJob, compound2));
            }
            if (this.hasAdvanced) {
                this.advanced = compoundAdv;
            }
            if (this.hasRole) {
                this.role = compoundRole;
            }
            if (this.hasJob) {
                this.job = compoundJob;
            }
        }
        if (this.hasAi) {
            final NBTTagCompound compound = this.npc.ai.writeToNBT(new NBTTagCompound());
            this.npc.ai.readToNBT(NBTTags.NBTMerge(compound, this.ai));
            this.ai = compound;
            this.npc.setCurrentAnimation(EnumAnimation.NONE);
        }
        if (this.hasInv) {
            final NBTTagCompound compound = this.npc.inventory.writeEntityToNBT(new NBTTagCompound());
            this.npc.inventory.readEntityFromNBT(NBTTags.NBTMerge(compound, this.inv));
            this.inv = compound;
        }
        this.npc.updateHitbox();
        this.isActive = isActive;
        this.npc.updateAI = true;
        this.npc.updateClient = true;
    }
}
