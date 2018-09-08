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

public class EntityNPCFurryMale extends EntityNPCInterface
{
    public EntityNPCFurryMale(final World world) {
        super(world);
        this.display.texture = "customnpcs:textures/entity/furrymale/WolfGrey.png";
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
            final ModelPartData hair = data.getOrCreatePart("ears");
            hair.playerTexture = true;
            final ModelPartData snout = data.getOrCreatePart("snout");
            snout.playerTexture = true;
            snout.type = 1;
            final ModelPartData tail = data.getOrCreatePart("tail");
            tail.playerTexture = true;
            this.worldObj.spawnEntityInWorld((Entity)npc);
        }
        super.onUpdate();
    }
}
