package com.flansmod.common.network;

import java.util.ArrayList;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveableData;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.guns.ItemBullet;

import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

public class PacketCurrentMissile extends PacketBase 
{
    public int entityid;
    public ItemStack missile;
    
    public PacketCurrentMissile() {}
    
    public PacketCurrentMissile(int entityid, ItemStack missile)
    {
        this.entityid = entityid;
        this.missile = missile;
    }
    
    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
    {
        data.writeInt(entityid);
        ByteBufUtils.writeItemStack(data, missile);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
    {
        entityid = data.readInt();
        missile = ByteBufUtils.readItemStack(data);
    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) 
    {
    	//System.out.println("packet trying to work");
        Entity e = playerEntity.worldObj.getEntityByID(entityid);
        if(e!=null&&e instanceof EntityDriveable) {
        	EntityDriveable v = (EntityDriveable)e;
            if(!v.worldObj.isRemote&&System.currentTimeMillis()-v.lastshellswitchedat>1000L) {
                v.lastshellswitchedat = System.currentTimeMillis();
                DriveableData dd = v.getDriveableData();
                ArrayList<ItemStack> notnull = new ArrayList<ItemStack>();
                for(ItemStack is : dd.missiles) if(is!=null) notnull.add(is);
                if(notnull.size()>0) {
                    ItemStack[] newmissiles = new ItemStack[v.getDriveableType().numMissileSlots];
                    newmissiles[notnull.size()-1] = notnull.get(0);
                    int i = -1;
                    for(ItemStack is : notnull) {
                        i++;
                        if(i==0) continue;
                        newmissiles[i-1] = is;
                    }
                    dd.missiles = newmissiles;
                    
                    PacketPlaySound.sendSoundPacket(e.posX, e.posY, e.posZ, 4f, e.dimension, "AnalogComputerSound", false);
					
                    //send packet to client so the gui works
                }
            }
        }
    }
    

    @Override
    public void handleClientSide(EntityPlayer clientPlayer) 
    {
        Entity e = clientPlayer.worldObj.getEntityByID(entityid);
        if(e!=null&&e instanceof EntityDriveable && missile.getItem() instanceof ItemBullet) {
        	//System.out.println("ioverwriting ammo: " + missile);
            ((EntityDriveable)e).currentAmmo = ((ItemBullet)missile.getItem()).type.name;
        }
    }

}