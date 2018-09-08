// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.blocks.tiles;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.network.NetworkManager;
import java.util.Iterator;
import java.util.List;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import noppes.npcs.controllers.Availability;
import net.minecraft.command.IEntitySelector;
import net.minecraft.tileentity.TileEntity;

public class TileBorder extends TileEntity implements IEntitySelector
{
    public Availability availability;
    public AxisAlignedBB boundingbox;
    public int rotation;
    public int height;
    public String message;
    
    public TileBorder() {
        this.availability = new Availability();
        this.rotation = 0;
        this.height = 10;
        this.message = "availability.areaNotAvailble";
    }
    
    public void readFromNBT(final NBTTagCompound compound) {
        super.readFromNBT(compound);
        this.readExtraNBT(compound);
    }
    
    public void readExtraNBT(final NBTTagCompound compound) {
        this.availability.readFromNBT(compound.getCompoundTag("BorderAvailability"));
        this.rotation = compound.getInteger("BorderRotation");
        this.height = compound.getInteger("BorderHeight");
        this.message = compound.getString("BorderMessage");
    }
    
    public void writeToNBT(final NBTTagCompound compound) {
        super.writeToNBT(compound);
        this.writeExtraNBT(compound);
    }
    
    public void writeExtraNBT(final NBTTagCompound compound) {
        compound.setTag("BorderAvailability", (NBTBase)this.availability.writeToNBT(new NBTTagCompound()));
        compound.setInteger("BorderRotation", this.rotation);
        compound.setInteger("BorderHeight", this.height);
        compound.setString("BorderMessage", this.message);
    }
    
    public void updateEntity() {
        if (this.worldObj.isRemote) {
            return;
        }
        final AxisAlignedBB box = AxisAlignedBB.getBoundingBox((double)this.xCoord, (double)this.yCoord, (double)this.zCoord, (double)(this.xCoord + 1), (double)(this.yCoord + this.height + 1), (double)(this.zCoord + 1));
        final List<Entity> list = (List<Entity>)this.worldObj.selectEntitiesWithinAABB((Class)Entity.class, box, (IEntitySelector)this);
        for (final Entity entity : list) {
            if (entity instanceof EntityEnderPearl) {
                final EntityEnderPearl pearl = (EntityEnderPearl)entity;
                if (!(pearl.getThrower() instanceof EntityPlayer) || this.availability.isAvailable((EntityPlayer)pearl.getThrower())) {
                    continue;
                }
                entity.isDead = true;
            }
            else {
                final EntityPlayer player = (EntityPlayer)entity;
                if (this.availability.isAvailable(player)) {
                    continue;
                }
                int posX = this.xCoord;
                int posZ = this.zCoord;
                int posY = this.yCoord;
                if (this.rotation == 0) {
                    --posZ;
                }
                else if (this.rotation == 2) {
                    ++posZ;
                }
                else if (this.rotation == 1) {
                    ++posX;
                }
                else if (this.rotation == 3) {
                    --posX;
                }
                while (!this.worldObj.isAirBlock(posX, posY, posZ)) {
                    ++posY;
                }
                player.setPositionAndUpdate(posX + 0.5, (double)posY, posZ + 0.5);
                if (this.message.isEmpty()) {
                    continue;
                }
                player.addChatComponentMessage((IChatComponent)new ChatComponentTranslation(this.message, new Object[0]));
            }
        }
    }
    
    public void onDataPacket(final NetworkManager net, final S35PacketUpdateTileEntity pkt) {
        final NBTTagCompound compound = pkt.func_148857_g();
        this.rotation = compound.getInteger("Rotation");
    }
    
    public Packet getDescriptionPacket() {
        final NBTTagCompound compound = new NBTTagCompound();
        compound.setInteger("Rotation", this.rotation);
        final S35PacketUpdateTileEntity packet = new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 0, compound);
        return (Packet)packet;
    }
    
    public boolean canUpdate() {
        return true;
    }
    
    public boolean isEntityApplicable(final Entity var1) {
        return var1 instanceof EntityPlayerMP || var1 instanceof EntityEnderPearl;
    }
}
