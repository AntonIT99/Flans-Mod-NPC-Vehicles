package com.flansmod.common.network;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.ItemGun;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

public class PacketChangeZoom extends PacketBase {

    public boolean isPositive;

    @SuppressWarnings("unused")
    public PacketChangeZoom() {
    }

    public PacketChangeZoom(boolean isPositive) {
        this.isPositive=isPositive;
    }


    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeBoolean(isPositive);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        isPositive=data.readBoolean();
    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) {
        ItemStack currentItem = playerEntity.inventory.getCurrentItem();
        if (currentItem != null && currentItem.getItem() instanceof ItemGun) {
            ItemGun itemGun = (ItemGun) currentItem.getItem();
            System.out.println(isPositive);

            if(isPositive)
                itemGun.increaseZoom(currentItem);
            else
                itemGun.decreaseZoom(currentItem);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void handleClientSide(EntityPlayer clientPlayer) {
        FlansMod.log("Received increase zoom packet on client. Skipping.");
    }
}
