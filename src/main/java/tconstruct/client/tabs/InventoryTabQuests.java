// 
// Decompiled by Procyon v0.5.30
// 

package tconstruct.client.tabs;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.client.gui.player.GuiQuestLog;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import noppes.npcs.CustomItems;
import net.minecraft.client.entity.EntityPlayerSP;

public class InventoryTabQuests extends AbstractTab
{
    public InventoryTabQuests() {
        super(0, 0, 0, new ItemStack(CustomItems.letter));
        if (CustomItems.letter == null) {
            this.renderStack = new ItemStack(Items.book);
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
                mc.displayGuiScreen((GuiScreen)new GuiQuestLog((EntityPlayer)mc.thePlayer));
            }
        };
        t.start();
    }
    
    @Override
    public boolean shouldAddToList() {
        return true;
    }
}
