// 
// Decompiled by Procyon v0.5.30
// 

package tconstruct.client.tabs;

import net.minecraft.client.renderer.RenderHelper;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.gui.GuiButton;

public abstract class AbstractTab extends GuiButton
{
    ResourceLocation texture;
    ItemStack renderStack;
    RenderItem itemRenderer;
    
    public AbstractTab(final int id, final int posX, final int posY, final ItemStack renderStack) {
        super(id, posX, posY, 28, 32, "");
        this.texture = new ResourceLocation("textures/gui/container/creative_inventory/tabs.png");
        this.itemRenderer = new RenderItem();
        this.renderStack = renderStack;
    }
    
    public void drawButton(final Minecraft mc, final int mouseX, final int mouseY) {
        if (this.visible) {
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            final int yTexPos = this.enabled ? 3 : 32;
            final int ySize = this.enabled ? 25 : 32;
            final int xOffset = (this.id != 2) ? 1 : 0;
            final int yPos = this.yPosition + (this.enabled ? 3 : 0);
            mc.renderEngine.bindTexture(this.texture);
            this.drawTexturedModalRect(this.xPosition, yPos, xOffset * 28, yTexPos, 28, ySize);
            RenderHelper.enableGUIStandardItemLighting();
            this.zLevel = 100.0f;
            this.itemRenderer.zLevel = 100.0f;
            GL11.glEnable(2896);
            GL11.glEnable(32826);
            this.itemRenderer.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, this.renderStack, this.xPosition + 6, this.yPosition + 8);
            this.itemRenderer.renderItemOverlayIntoGUI(mc.fontRenderer, mc.renderEngine, this.renderStack, this.xPosition + 6, this.yPosition + 8);
            GL11.glDisable(2896);
            GL11.glEnable(3042);
            this.itemRenderer.zLevel = 0.0f;
            this.zLevel = 0.0f;
            RenderHelper.disableStandardItemLighting();
        }
    }
    
    public boolean mousePressed(final Minecraft mc, final int mouseX, final int mouseY) {
        final boolean inWindow = this.enabled && this.visible && mouseX >= this.xPosition && mouseY >= this.yPosition && mouseX < this.xPosition + this.width && mouseY < this.yPosition + this.height;
        if (inWindow) {
            this.onTabClicked();
        }
        return inWindow;
    }
    
    public abstract void onTabClicked();
    
    public abstract boolean shouldAddToList();
}
