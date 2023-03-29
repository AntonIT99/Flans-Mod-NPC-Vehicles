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

public class PacketGunFire extends PacketBase {
    public boolean held;
    public boolean left;
    public float yaw;
    public float pitch;

    @SuppressWarnings("unused")
    public PacketGunFire() {
    }

    public PacketGunFire(boolean left, boolean held, float yaw, float pitch) {
        this.left = left;
        this.held = held;
        this.yaw = yaw;
        this.pitch = pitch;
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeBoolean(held);
        data.writeBoolean(left);
        data.writeFloat(yaw);
        data.writeFloat(pitch);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        held = data.readBoolean();
        left = data.readBoolean();
        yaw = data.readFloat();
        pitch = data.readFloat();
    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) {
        ItemStack currentItem = playerEntity.inventory.getCurrentItem();
        if (currentItem != null && currentItem.getItem() instanceof ItemGun) {
            float bkYaw = playerEntity.rotationYaw;
            float bkPitch = playerEntity.rotationPitch;
            playerEntity.rotationYaw = yaw;
            playerEntity.rotationPitch = pitch;
            ((ItemGun) currentItem.getItem()).onMouseHeld(currentItem, playerEntity.worldObj, playerEntity, left, held);
            playerEntity.rotationYaw = bkYaw;
            playerEntity.rotationPitch = bkPitch;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void handleClientSide(EntityPlayer clientPlayer) {
        FlansMod.log("Received gun button packet on client. Skipping.");
    }
}
