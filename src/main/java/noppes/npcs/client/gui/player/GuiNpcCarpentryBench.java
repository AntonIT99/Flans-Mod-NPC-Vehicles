// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.player;

import noppes.npcs.client.CustomNpcResourceListener;
import net.minecraft.util.StatCollector;
import org.lwjgl.opengl.GL11;
import noppes.npcs.controllers.RecipeController;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.inventory.Container;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.containers.ContainerCarpentryBench;
import net.minecraft.util.ResourceLocation;
import noppes.npcs.client.gui.util.GuiContainerNPCInterface;

public class GuiNpcCarpentryBench extends GuiContainerNPCInterface
{
    private final ResourceLocation resource;
    private ContainerCarpentryBench container;
    private GuiNpcButton button;
    
    public GuiNpcCarpentryBench(final ContainerCarpentryBench container) {
        super(null, container);
        this.resource = new ResourceLocation("customnpcs", "textures/gui/carpentry.png");
        this.container = container;
        this.title = "";
        this.allowUserInput = false;
        this.closeOnEsc = true;
        this.ySize = 180;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.addButton(this.button = new GuiNpcButton(0, this.guiLeft + 158, this.guiTop + 4, 12, 20, "..."));
    }
    
    @Override
    public void buttonEvent(final GuiButton guibutton) {
        this.displayGuiScreen(new GuiRecipes());
    }
    
    @Override
    protected void drawGuiContainerBackgroundLayer(final float f, final int i, final int j) {
        this.button.enabled = (RecipeController.instance != null && !RecipeController.instance.anvilRecipes.isEmpty());
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.renderEngine.bindTexture(this.resource);
        final int l = (this.width - this.xSize) / 2;
        final int i2 = (this.height - this.ySize) / 2;
        String title = StatCollector.translateToLocal("tile.npcCarpentyBench.name");
        if (this.container.getMetadata() >= 4) {
            title = StatCollector.translateToLocal("tile.anvil.name");
        }
        this.drawTexturedModalRect(l, i2, 0, 0, this.xSize, this.ySize);
        super.drawGuiContainerBackgroundLayer(f, i, j);
        this.fontRendererObj.drawString(title, this.guiLeft + 4, this.guiTop + 4, CustomNpcResourceListener.DefaultTextColor);
        this.fontRendererObj.drawString(StatCollector.translateToLocal("container.inventory"), this.guiLeft + 4, this.guiTop + 87, CustomNpcResourceListener.DefaultTextColor);
    }
    
    @Override
    public void save() {
    }
}
