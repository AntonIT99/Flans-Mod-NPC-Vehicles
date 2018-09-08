// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.roles;

import noppes.npcs.util.ValueUtil;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.entity.EntityNPCInterface;

public class JobPuppet extends JobInterface
{
    public PartConfig head;
    public PartConfig larm;
    public PartConfig rarm;
    public PartConfig body;
    public PartConfig lleg;
    public PartConfig rleg;
    public boolean whileStanding;
    public boolean whileAttacking;
    public boolean whileMoving;
    
    public JobPuppet(final EntityNPCInterface npc) {
        super(npc);
        this.head = new PartConfig();
        this.larm = new PartConfig();
        this.rarm = new PartConfig();
        this.body = new PartConfig();
        this.lleg = new PartConfig();
        this.rleg = new PartConfig();
        this.whileStanding = true;
        this.whileAttacking = false;
        this.whileMoving = false;
    }
    
    @Override
    public NBTTagCompound writeToNBT(final NBTTagCompound compound) {
        compound.setTag("PuppetHead", (NBTBase)this.head.writeNBT());
        compound.setTag("PuppetLArm", (NBTBase)this.larm.writeNBT());
        compound.setTag("PuppetRArm", (NBTBase)this.rarm.writeNBT());
        compound.setTag("PuppetBody", (NBTBase)this.body.writeNBT());
        compound.setTag("PuppetLLeg", (NBTBase)this.lleg.writeNBT());
        compound.setTag("PuppetRLeg", (NBTBase)this.rleg.writeNBT());
        compound.setBoolean("PuppetStanding", this.whileStanding);
        compound.setBoolean("PuppetAttacking", this.whileAttacking);
        compound.setBoolean("PuppetMoving", this.whileMoving);
        return compound;
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound compound) {
        this.head.readNBT(compound.getCompoundTag("PuppetHead"));
        this.larm.readNBT(compound.getCompoundTag("PuppetLArm"));
        this.rarm.readNBT(compound.getCompoundTag("PuppetRArm"));
        this.body.readNBT(compound.getCompoundTag("PuppetBody"));
        this.lleg.readNBT(compound.getCompoundTag("PuppetLLeg"));
        this.rleg.readNBT(compound.getCompoundTag("PuppetRLeg"));
        this.whileStanding = compound.getBoolean("PuppetStanding");
        this.whileAttacking = compound.getBoolean("PuppetAttacking");
        this.whileMoving = compound.getBoolean("PuppetMoving");
    }
    
    @Override
    public boolean aiShouldExecute() {
        return false;
    }
    
    @Override
    public void reset() {
    }
    
    @Override
    public void delete() {
    }
    
    public boolean isActive() {
        return this.npc.isEntityAlive() && ((this.whileAttacking && this.npc.isAttacking()) || (this.whileMoving && this.npc.isWalking()) || (this.whileStanding && !this.npc.isWalking()));
    }
    
    public static class PartConfig
    {
        public float rotationX;
        public float rotationY;
        public float rotationZ;
        public boolean disabled;
        
        public PartConfig() {
            this.rotationX = 0.0f;
            this.rotationY = 0.0f;
            this.rotationZ = 0.0f;
            this.disabled = false;
        }
        
        public NBTTagCompound writeNBT() {
            final NBTTagCompound compound = new NBTTagCompound();
            compound.setFloat("RotationX", this.rotationX);
            compound.setFloat("RotationY", this.rotationY);
            compound.setFloat("RotationZ", this.rotationZ);
            compound.setBoolean("Disabled", this.disabled);
            return compound;
        }
        
        public void readNBT(final NBTTagCompound compound) {
            this.rotationX = ValueUtil.correctFloat(compound.getFloat("RotationX"), -0.5f, 0.5f);
            this.rotationY = ValueUtil.correctFloat(compound.getFloat("RotationY"), -0.5f, 0.5f);
            this.rotationZ = ValueUtil.correctFloat(compound.getFloat("RotationZ"), -0.5f, 0.5f);
            this.disabled = compound.getBoolean("Disabled");
        }
    }
}
