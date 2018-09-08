// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.blocks.tiles;

import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class TileWeaponRack extends TileNpcContainer
{
    @Override
    public boolean isItemValidForSlot(final int var1, final ItemStack itemstack) {
        return (itemstack == null || !(itemstack.getItem() instanceof ItemBlock)) && super.isItemValidForSlot(var1, itemstack);
    }
    
    @Override
    public int getSizeInventory() {
        return 3;
    }
    
    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        return AxisAlignedBB.getBoundingBox((double)this.xCoord, (double)this.yCoord, (double)this.zCoord, (double)(this.xCoord + 1), (double)(this.yCoord + 2), (double)(this.zCoord + 1));
    }
    
    @Override
    public String getName() {
        return "tile.npcWeaponRack.name";
    }
    
    @Override
    public Packet getDescriptionPacket() {
        final NBTTagCompound compound = new NBTTagCompound();
        this.writeToNBT(compound);
        final S35PacketUpdateTileEntity packet = new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 0, compound);
        return (Packet)packet;
    }
    
    @Override
    public int powerProvided() {
        int power = 0;
        for (int i = 0; i < 3; ++i) {
            if (this.getStackInSlot(i) != null) {
                power += 5;
            }
        }
        return power;
    }
}
