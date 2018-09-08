// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client;

import net.minecraft.tileentity.TileEntity;
import noppes.npcs.client.gui.player.GuiDialogInteract;
import noppes.npcs.controllers.Dialog;
import noppes.npcs.controllers.DialogController;
import noppes.npcs.NoppesUtilPlayer;
import noppes.npcs.constants.EnumPlayerPacket;
import noppes.npcs.client.gui.player.GuiQuestCompletion;
import noppes.npcs.controllers.Quest;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Collection;
import noppes.npcs.client.gui.util.GuiContainerNPCInterface;
import net.minecraft.client.gui.GuiScreen;
import java.util.Vector;
import noppes.npcs.client.gui.util.IScrollData;
import noppes.npcs.client.gui.util.GuiNPCInterface;
import org.lwjgl.Sys;
import java.net.URI;
import net.minecraft.util.Util;
import java.io.File;
import noppes.npcs.CustomNpcs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.util.ResourceLocation;
import java.io.IOException;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.client.Minecraft;
import noppes.npcs.Server;
import io.netty.buffer.ByteBuf;
import noppes.npcs.constants.EnumPacketServer;
import noppes.npcs.constants.EnumGuiType;
import java.util.HashMap;
import noppes.npcs.entity.EntityNPCInterface;

public class NoppesUtil
{
    private static EntityNPCInterface lastNpc;
    private static HashMap<String, Integer> data;
    
    public static void requestOpenGUI(final EnumGuiType gui) {
        requestOpenGUI(gui, 0, 0, 0);
    }
    
    public static void requestOpenGUI(final EnumGuiType gui, final int i, final int j, final int k) {
        Client.sendData(EnumPacketServer.Gui, gui.ordinal(), i, j, k);
    }
    
    public static void spawnParticle(final ByteBuf buffer) throws IOException {
        final double posX = buffer.readDouble();
        final double posY = buffer.readDouble();
        final double posZ = buffer.readDouble();
        final float height = buffer.readFloat();
        final float width = buffer.readFloat();
        final float yOffset = buffer.readFloat();
        final String particle = Server.readString(buffer);
        final World worldObj = (World)Minecraft.getMinecraft().theWorld;
        final Random rand = worldObj.rand;
        if (particle.equals("heal")) {
            for (int k = 0; k < 6; ++k) {
                worldObj.spawnParticle("instantSpell", posX + (rand.nextDouble() - 0.5) * width, posY + rand.nextDouble() * height - yOffset, posZ + (rand.nextDouble() - 0.5) * width, 0.0, 0.0, 0.0);
                worldObj.spawnParticle("spell", posX + (rand.nextDouble() - 0.5) * width, posY + rand.nextDouble() * height - yOffset, posZ + (rand.nextDouble() - 0.5) * width, 0.0, 0.0, 0.0);
            }
        }
    }
    
    public static void clickSound() {
        Minecraft.getMinecraft().getSoundHandler().playSound((ISound)PositionedSoundRecord.func_147674_a(new ResourceLocation("gui.button.press"), 1.0f));
    }
    
    public static EntityNPCInterface getLastNpc() {
        return NoppesUtil.lastNpc;
    }
    
    public static void setLastNpc(final EntityNPCInterface npc) {
        NoppesUtil.lastNpc = npc;
    }
    
    public static void openGUI(final EntityPlayer player, final Object guiscreen) {
        CustomNpcs.proxy.openGui(player, guiscreen);
    }
    
    public static void openFolder(final File dir) {
        final String s = dir.getAbsolutePath();
        Label_0072: {
            if (Util.getOSType() == Util.EnumOS.OSX) {
                try {
                    Runtime.getRuntime().exec(new String[] { "/usr/bin/open", s });
                    return;
                }
                catch (IOException ioexception1) {
                    break Label_0072;
                }
            }
            if (Util.getOSType() == Util.EnumOS.WINDOWS) {
                final String s2 = String.format("cmd.exe /C start \"Open file\" \"%s\"", s);
                try {
                    Runtime.getRuntime().exec(s2);
                    return;
                }
                catch (IOException ex) {}
            }
        }
        boolean flag = false;
        try {
            final Class oclass = Class.forName("java.awt.Desktop");
            final Object object = oclass.getMethod("getDesktop", (Class[])new Class[0]).invoke(null, new Object[0]);
            oclass.getMethod("browse", URI.class).invoke(object, dir.toURI());
        }
        catch (Throwable throwable) {
            flag = true;
        }
        if (flag) {
            Sys.openURL("file://" + s);
        }
    }
    
    public static void setScrollList(final ByteBuf buffer) {
        GuiScreen gui = Minecraft.getMinecraft().currentScreen;
        if (gui instanceof GuiNPCInterface && ((GuiNPCInterface)gui).hasSubGui()) {
            gui = ((GuiNPCInterface)gui).getSubGui();
        }
        if (gui == null || !(gui instanceof IScrollData)) {
            return;
        }
        final Vector<String> data = new Vector<String>();
        try {
            for (int size = buffer.readInt(), i = 0; i < size; ++i) {
                data.add(Server.readString(buffer));
            }
        }
        catch (Exception ex) {}
        ((IScrollData)gui).setData(data, null);
    }
    
    public static void addScrollData(final ByteBuf buffer) {
        try {
            for (int size = buffer.readInt(), i = 0; i < size; ++i) {
                final int id = buffer.readInt();
                final String name = Server.readString(buffer);
                NoppesUtil.data.put(name, id);
            }
        }
        catch (Exception ex) {}
    }
    
    public static void setScrollData(final ByteBuf buffer) {
        GuiScreen gui = Minecraft.getMinecraft().currentScreen;
        if (gui == null) {
            return;
        }
        try {
            for (int size = buffer.readInt(), i = 0; i < size; ++i) {
                final int id = buffer.readInt();
                final String name = Server.readString(buffer);
                NoppesUtil.data.put(name, id);
            }
        }
        catch (Exception ex) {}
        if (gui instanceof GuiNPCInterface && ((GuiNPCInterface)gui).hasSubGui()) {
            gui = ((GuiNPCInterface)gui).getSubGui();
        }
        if (gui instanceof GuiContainerNPCInterface && ((GuiContainerNPCInterface)gui).hasSubGui()) {
            gui = ((GuiContainerNPCInterface)gui).getSubGui();
        }
        if (gui instanceof IScrollData) {
            ((IScrollData)gui).setData(new Vector<String>(NoppesUtil.data.keySet()), NoppesUtil.data);
        }
        NoppesUtil.data = new HashMap<String, Integer>();
    }
    
    public static void guiQuestCompletion(final EntityPlayer player, final NBTTagCompound read) {
        final Quest quest = new Quest();
        quest.readNBT(read);
        if (!quest.completeText.equals("")) {
            openGUI(player, new GuiQuestCompletion(quest));
        }
        else {
            NoppesUtilPlayer.sendData(EnumPlayerPacket.QuestCompletion, quest.id);
        }
    }
    
    public static void openDialog(final NBTTagCompound compound, final EntityNPCInterface npc, final EntityPlayer player) {
        if (DialogController.instance == null) {
            DialogController.instance = new DialogController();
        }
        final Dialog dialog = new Dialog();
        dialog.readNBT(compound);
        final GuiScreen gui = Minecraft.getMinecraft().currentScreen;
        if (gui == null || !(gui instanceof GuiDialogInteract)) {
            CustomNpcs.proxy.openGui(player, new GuiDialogInteract(npc, dialog));
        }
        else {
            final GuiDialogInteract dia = (GuiDialogInteract)gui;
            dia.appendDialog(dialog);
        }
    }
    
    public static void saveRedstoneBlock(final EntityPlayer player, final NBTTagCompound compound) {
        final int x = compound.getInteger("x");
        final int y = compound.getInteger("y");
        final int z = compound.getInteger("z");
        final TileEntity tile = player.worldObj.getTileEntity(x, y, z);
        tile.readFromNBT(compound);
        CustomNpcs.proxy.openGui(x, y, z, EnumGuiType.RedstoneBlock, player);
    }
    
    public static void saveWayPointBlock(final EntityPlayer player, final NBTTagCompound compound) {
        final int x = compound.getInteger("x");
        final int y = compound.getInteger("y");
        final int z = compound.getInteger("z");
        final TileEntity tile = player.worldObj.getTileEntity(x, y, z);
        tile.readFromNBT(compound);
        CustomNpcs.proxy.openGui(x, y, z, EnumGuiType.Waypoint, player);
    }
    
    static {
        NoppesUtil.data = new HashMap<String, Integer>();
    }
}
