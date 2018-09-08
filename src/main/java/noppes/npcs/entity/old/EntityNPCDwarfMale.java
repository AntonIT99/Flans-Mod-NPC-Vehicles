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

public class EntityNPCDwarfMale extends EntityNPCInterface
{
    public EntityNPCDwarfMale(final World world) {
        super(world);
        final float n = 0.85f;
        this.scaleZ = n;
        this.scaleX = n;
        this.scaleY = 0.6875f;
        this.display.texture = "customnpcs:textures/entity/dwarfmale/Simon.png";
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
            data.legs.setScale(1.1f, 0.7f, 0.9f);
            data.arms.setScale(0.9f, 0.7f);
            data.body.setScale(1.2f, 0.7f, 1.5f);
            data.head.setScale(0.85f, 0.85f);
            this.worldObj.spawnEntityInWorld((Entity)npc);
        }
        super.onUpdate();
    }
}
