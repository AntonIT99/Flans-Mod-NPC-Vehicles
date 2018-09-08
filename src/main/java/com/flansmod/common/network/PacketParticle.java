/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 */
package com.flansmod.common.network;

import com.flansmod.common.CommonProxy;
import com.flansmod.common.FlansMod;
import com.flansmod.common.network.PacketBase;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketParticle
extends PacketBase {
    public float x;
    public float y;
    public float z;
    public float mx;
    public float my;
    public float mz;
    public String particleType;

    public PacketParticle() {
    }

    public PacketParticle(String s, double x1, double y1, double z1, double x2, double y2, double z2) {
        this.x = (float)x1;
        this.y = (float)y1;
        this.z = (float)z1;
        this.mx = (float)x2;
        this.my = (float)y2;
        this.mz = (float)z2;
        this.particleType = s;
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeFloat(this.x);
        data.writeFloat(this.y);
        data.writeFloat(this.z);
        data.writeFloat(this.mx);
        data.writeFloat(this.my);
        data.writeFloat(this.mz);
        this.writeUTF(data, this.particleType);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        this.x = data.readFloat();
        this.y = data.readFloat();
        this.z = data.readFloat();
        this.mx = data.readFloat();
        this.my = data.readFloat();
        this.mz = data.readFloat();
        this.particleType = this.readUTF(data);
    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) {
        FlansMod.log("Received particle packet on server. Disregarding.");
    }

    @SideOnly(value=Side.CLIENT)
    @Override
    public void handleClientSide(EntityPlayer clientPlayer) {
        FlansMod.proxy.spawnParticle(this.particleType, this.x, this.y, this.z, this.mx, this.my, this.mz);
    }
}

