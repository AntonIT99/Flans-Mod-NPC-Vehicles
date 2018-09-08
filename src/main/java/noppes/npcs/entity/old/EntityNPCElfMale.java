// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.entity.old;

import noppes.npcs.ModelData;
import net.minecraft.entity.Entity;
import noppes.npcs.entity.EntityCustomNpc;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import noppes.npcs.entity.EntityNPCInterface;

public class EntityNPCElfMale extends EntityNPCInterface
{
    public EntityNPCElfMale(final World world) {
        super(world);
        this.scaleX = 0.85f;
        this.scaleY = 1.07f;
        this.scaleZ = 0.85f;
        this.display.texture = "customnpcs:textures/entity/elfmale/ElfMale.png";
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
            data.legs.setScale(0.85f, 1.15f);
            data.arms.setScale(0.85f, 1.15f);
            data.body.setScale(0.85f, 1.15f);
            data.head.setScale(0.85f, 0.95f);
            this.worldObj.spawnEntityInWorld((Entity)npc);
        }
        super.onUpdate();
    }
}
