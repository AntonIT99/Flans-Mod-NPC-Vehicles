// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.entity.old;

import noppes.npcs.ModelPartData;
import noppes.npcs.ModelData;
import net.minecraft.entity.Entity;
import noppes.npcs.entity.EntityCustomNpc;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import noppes.npcs.entity.EntityNPCInterface;

public class EntityNpcEnderchibi extends EntityNPCInterface
{
    public EntityNpcEnderchibi(final World world) {
        super(world);
        this.display.texture = "customnpcs:textures/entity/enderchibi/MrEnderchibi.png";
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
            data.legs.setScale(0.65f, 0.75f);
            data.arms.setScale(0.5f, 1.45f);
            final ModelPartData part = data.getOrCreatePart("particles");
            part.playerTexture = true;
            this.worldObj.spawnEntityInWorld((Entity)npc);
        }
        super.onUpdate();
    }
}
