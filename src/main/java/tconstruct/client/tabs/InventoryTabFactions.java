// 
// Decompiled by Procyon v0.5.30
// 

package tconstruct.client.tabs;

import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.player.GuiFaction;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import noppes.npcs.CustomItems;

public class InventoryTabFactions extends AbstractTab
{
    public InventoryTabFactions() {
        super(0, 0, 0, new ItemStack(CustomItems.wallBanner, 1, 1));
        if (CustomItems.wallBanner == null) {
            this.renderStack = new ItemStack(Blocks.tnt);
        }
    }
    
    @Override
    public void onTabClicked() {
        final Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100L);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                final Minecraft mc = Minecraft.getMinecraft();
                mc.displayGuiScreen((GuiScreen)new GuiFaction());
            }
        };
        t.start();
    }
    
    @Override
    public boolean shouldAddToList() {
        return true;
    }
}
