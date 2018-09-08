// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.roles;

import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTBase;
import noppes.npcs.NBTTags;
import net.minecraft.nbt.NBTTagCompound;
import java.util.ArrayList;
import noppes.npcs.entity.EntityNPCInterface;
import java.util.List;

public class JobGuard extends JobInterface
{
    public boolean attacksAnimals;
    public boolean attackHostileMobs;
    public boolean attackCreepers;
    public List<String> targets;
    public boolean specific;
    
    public JobGuard(final EntityNPCInterface npc) {
        super(npc);
        this.attacksAnimals = false;
        this.attackHostileMobs = true;
        this.attackCreepers = false;
        this.targets = new ArrayList<String>();
        this.specific = false;
    }
    
    @Override
    public NBTTagCompound writeToNBT(final NBTTagCompound nbttagcompound) {
        nbttagcompound.setBoolean("GuardAttackAnimals", this.attacksAnimals);
        nbttagcompound.setBoolean("GuardAttackMobs", this.attackHostileMobs);
        nbttagcompound.setBoolean("GuardAttackCreepers", this.attackCreepers);
        nbttagcompound.setBoolean("GuardSpecific", this.specific);
        nbttagcompound.setTag("GuardTargets", (NBTBase)NBTTags.nbtStringList(this.targets));
        return nbttagcompound;
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound nbttagcompound) {
        this.attacksAnimals = nbttagcompound.getBoolean("GuardAttackAnimals");
        this.attackHostileMobs = nbttagcompound.getBoolean("GuardAttackMobs");
        this.attackCreepers = nbttagcompound.getBoolean("GuardAttackCreepers");
        this.specific = nbttagcompound.getBoolean("GuardSpecific");
        this.targets = NBTTags.getStringList(nbttagcompound.getTagList("GuardTargets", 10));
    }
    
    public boolean isEntityApplicable(final Entity entity) {
        if (entity instanceof EntityPlayer || entity instanceof EntityNPCInterface) {
            return false;
        }
        if (this.specific && this.targets.contains("entity." + EntityList.getEntityString(entity) + ".name")) {
            return true;
        }
        if (entity instanceof EntityAnimal) {
            return this.attacksAnimals && (!(entity instanceof EntityTameable) || ((EntityTameable)entity).getOwner() == null);
        }
        if (entity instanceof EntityCreeper) {
            return this.attackCreepers;
        }
        return (entity instanceof IMob || entity instanceof EntityDragon) && this.attackHostileMobs;
    }
}
