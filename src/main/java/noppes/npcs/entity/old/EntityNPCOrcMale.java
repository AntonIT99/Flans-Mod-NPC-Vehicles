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

public class EntityNPCOrcMale extends EntityNPCInterface
{
    public EntityNPCOrcMale(final World world) {
        super(world);
        this.scaleY = 1.0f;
        final float n = 1.2f;
        this.scaleZ = n;
        this.scaleX = n;
        this.display.texture = "customnpcs:textures/entity/orcmale/StrandedOrc.png";
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
            data.legs.setScale(1.2f, 1.05f);
            data.arms.setScale(1.2f, 1.05f);
            data.body.setScale(1.4f, 1.1f, 1.5f);
            data.head.setScale(1.2f, 1.1f);
            this.worldObj.spawnEntityInWorld((Entity)npc);
        }
        super.onUpdate();
    }
}
