// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.entity.old;

import noppes.npcs.ModelData;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityVillager;
import noppes.npcs.entity.EntityCustomNpc;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import noppes.npcs.entity.EntityNPCInterface;

public class EntityNPCVillager extends EntityNPCInterface
{
    public EntityNPCVillager(final World world) {
        super(world);
        this.display.texture = "textures/entity/villager/villager.png";
    }
    
    @Override
    public void onUpdate() {
        this.isDead = true;
        if (!this.worldObj.isRemote) {
            final NBTTagCompound compound = new NBTTagCompound();
            this.writeToNBT(compound);
            final EntityCustomNpc npc = new EntityCustomNpc(this.worldObj);
            npc.readFromNBT(compound);
            final ModelData data = npc.modelData;
            data.setEntityClass((Class<? extends EntityLivingBase>)EntityVillager.class);
            this.worldObj.spawnEntityInWorld((Entity)npc);
        }
        super.onUpdate();
    }
}
