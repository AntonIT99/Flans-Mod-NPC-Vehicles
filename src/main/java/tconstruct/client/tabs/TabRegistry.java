// 
// Decompiled by Procyon v0.5.30
// 

package tconstruct.client.tabs;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.Loader;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C0DPacketCloseWindow;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraft.client.Minecraft;
import java.util.ArrayList;
import net.minecraft.client.entity.EntityPlayerSP;

public class TabRegistry
{
    private static ArrayList<AbstractTab> tabList;
    private static Minecraft mc;
    
    public static void registerTab(final AbstractTab tab) {
        TabRegistry.tabList.add(tab);
    }
    
    public static ArrayList<AbstractTab> getTabList() {
        return TabRegistry.tabList;
    }
    
    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void guiPostInit(final GuiScreenEvent.InitGuiEvent.Post event) {
        if (event.gui instanceof GuiInventory) {
            final int xSize = 176;
            final int ySize = 166;
            int guiLeft = (event.gui.width - xSize) / 2;
            final int guiTop = (event.gui.height - ySize) / 2;
            guiLeft += getPotionOffset();
            updateTabValues(guiLeft, guiTop, InventoryTabVanilla.class);
            addTabsToList(event.buttonList);
        }
    }
    
    public static void openInventoryGui() {
        TabRegistry.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C0DPacketCloseWindow(TabRegistry.mc.thePlayer.openContainer.windowId));
        final GuiInventory inventory = new GuiInventory((EntityPlayer)TabRegistry.mc.thePlayer);
        TabRegistry.mc.displayGuiScreen((GuiScreen)inventory);
    }
    
    public static void updateTabValues(final int cornerX, final int cornerY, final Class<?> selectedButton) {
        int count = 2;
        for (int i = 0; i < TabRegistry.tabList.size(); ++i) {
            final AbstractTab t = TabRegistry.tabList.get(i);
            if (t.shouldAddToList()) {
                t.id = count;
                t.xPosition = cornerX + (count - 2) * 28;
                t.yPosition = cornerY - 28;
                t.enabled = !t.getClass().equals(selectedButton);
                ++count;
            }
        }
    }
    
    public static void addTabsToList(final List buttonList) {
        for (final AbstractTab tab : TabRegistry.tabList) {
            if (tab.shouldAddToList()) {
                buttonList.add(tab);
            }
        }
    }
    
    public static int getPotionOffset() {
        if (!TabRegistry.mc.thePlayer.getActivePotionEffects().isEmpty()) {
            if (!Loader.isModLoaded("NotEnoughItems")) {
                return 60;
            }
            try {
                final Class<?> c = Class.forName("codechicken.nei.NEIClientConfig");
                final Object hidden = c.getMethod("isHidden", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
                final Object enabled = c.getMethod("isEnabled", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
                if (hidden != null && hidden instanceof Boolean && enabled != null && enabled instanceof Boolean) {
                    return 60;
                }
            }
            catch (Exception e) {}
        }
        return 0;
    }
    
    static {
        TabRegistry.tabList = new ArrayList<AbstractTab>();
        TabRegistry.mc = FMLClientHandler.instance().getClient();
    }
}
