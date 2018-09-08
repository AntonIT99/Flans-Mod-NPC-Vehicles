// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.entity.EntityPlayerSP;
import noppes.npcs.client.gui.player.GuiQuestLog;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import noppes.npcs.client.controllers.MusicController;
import noppes.npcs.client.renderer.RenderNPCInterface;
import noppes.npcs.CustomNpcs;
import noppes.npcs.NoppesUtilPlayer;
import noppes.npcs.constants.EnumPlayerPacket;
import net.minecraft.inventory.ContainerPlayer;
import net.minecraft.client.Minecraft;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.world.World;

public class ClientTickHandler
{
    private World prevWorld;
    private boolean otherContainer;
    
    public ClientTickHandler() {
        this.otherContainer = false;
    }
    
    @SubscribeEvent(priority = EventPriority.LOWEST)
    public void onClientTick(final TickEvent.ClientTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            return;
        }
        final Minecraft mc = Minecraft.getMinecraft();
        if (mc.thePlayer != null && mc.thePlayer.openContainer instanceof ContainerPlayer) {
            if (this.otherContainer) {
                NoppesUtilPlayer.sendData(EnumPlayerPacket.CheckQuestCompletion, new Object[0]);
                this.otherContainer = false;
            }
        }
        else {
            this.otherContainer = true;
        }
        ++CustomNpcs.ticks;
        ++RenderNPCInterface.LastTextureTick;
        if (this.prevWorld != mc.theWorld) {
            this.prevWorld = (World)mc.theWorld;
            MusicController.Instance.stopMusic();
        }
    }
    
    @SubscribeEvent
    public void onKey(final InputEvent.KeyInputEvent event) {
        if (ClientProxy.QuestLog.isPressed()) {
            final Minecraft mc = Minecraft.getMinecraft();
            if (mc.currentScreen == null) {
                NoppesUtil.openGUI((EntityPlayer)mc.thePlayer, new GuiQuestLog((EntityPlayer)mc.thePlayer));
            }
            else if (mc.currentScreen instanceof GuiQuestLog) {
                mc.setIngameFocus();
            }
        }
    }
}
