// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.util;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import noppes.npcs.constants.EnumGuiType;
import noppes.npcs.CustomNpcs;
import net.minecraft.client.gui.GuiYesNo;
import net.minecraft.util.StatCollector;
import noppes.npcs.client.NoppesUtil;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiYesNoCallback;

public class GuiNpcMenu implements GuiYesNoCallback
{
    private GuiScreen parent;
    private GuiMenuTopButton[] topButtons;
    private int activeMenu;
    private EntityNPCInterface npc;
    
    public GuiNpcMenu(final GuiScreen parent, final int activeMenu, final EntityNPCInterface npc) {
        this.parent = parent;
        this.activeMenu = activeMenu;
        this.npc = npc;
    }
    
    public void initGui(final int guiLeft, final int guiTop, final int width) {
        Keyboard.enableRepeatEvents(true);
        final GuiMenuTopButton display = new GuiMenuTopButton(1, guiLeft + 4, guiTop - 17, "menu.display");
        final GuiMenuTopButton stats = new GuiMenuTopButton(2, display.xPosition + display.getWidth(), guiTop - 17, "menu.stats");
        final GuiMenuTopButton ai = new GuiMenuTopButton(6, stats.xPosition + stats.getWidth(), guiTop - 17, "menu.ai");
        final GuiMenuTopButton inv = new GuiMenuTopButton(3, ai.xPosition + ai.getWidth(), guiTop - 17, "menu.inventory");
        final GuiMenuTopButton advanced = new GuiMenuTopButton(4, inv.xPosition + inv.getWidth(), guiTop - 17, "menu.advanced");
        final GuiMenuTopButton global = new GuiMenuTopButton(5, advanced.xPosition + advanced.getWidth(), guiTop - 17, "menu.global");
        final GuiMenuTopButton close = new GuiMenuTopButton(0, guiLeft + width - 22, guiTop - 17, "X");
        final GuiMenuTopButton delete = new GuiMenuTopButton(66, guiLeft + width - 72, guiTop - 17, "selectWorld.deleteButton");
        delete.xPosition = close.xPosition - delete.getWidth();
        this.topButtons = new GuiMenuTopButton[] { display, stats, ai, inv, advanced, global, close, delete };
        for (final GuiMenuTopButton button : this.topButtons) {
            button.active = (button.id == this.activeMenu);
        }
    }
    
    private void topButtonPressed(final GuiMenuTopButton button) {
        if (button.displayString.equals(this.activeMenu)) {
            return;
        }
        final Minecraft mc = Minecraft.getMinecraft();
        NoppesUtil.clickSound();
        final int id = button.id;
        if (id == 0) {
            this.close();
            return;
        }
        if (id == 66) {
            final GuiYesNo guiyesno = new GuiYesNo((GuiYesNoCallback)this, "Confirm", StatCollector.translateToLocal("gui.delete"), 0);
            mc.displayGuiScreen((GuiScreen)guiyesno);
            return;
        }
        this.save();
        if (id == 1) {
            CustomNpcs.proxy.openGui(this.npc, EnumGuiType.MainMenuDisplay);
        }
        else if (id == 2) {
            CustomNpcs.proxy.openGui(this.npc, EnumGuiType.MainMenuStats);
        }
        else if (id == 3) {
            NoppesUtil.requestOpenGUI(EnumGuiType.MainMenuInv);
        }
        else if (id == 4) {
            CustomNpcs.proxy.openGui(this.npc, EnumGuiType.MainMenuAdvanced);
        }
        else if (id == 5) {
            CustomNpcs.proxy.openGui(this.npc, EnumGuiType.MainMenuGlobal);
        }
        else if (id == 6) {
            CustomNpcs.proxy.openGui(this.npc, EnumGuiType.MainMenuAI);
        }
        this.activeMenu = id;
    }
    
    private void save() {
        GuiNpcTextField.unfocus();
        if (this.parent instanceof GuiContainerNPCInterface2) {
            ((GuiContainerNPCInterface2)this.parent).save();
        }
        if (this.parent instanceof GuiNPCInterface2) {
            ((GuiNPCInterface2)this.parent).save();
        }
    }
    
    private void close() {
        if (this.parent instanceof GuiContainerNPCInterface2) {
            ((GuiContainerNPCInterface2)this.parent).close();
        }
        if (this.parent instanceof GuiNPCInterface2) {
            ((GuiNPCInterface2)this.parent).close();
        }
        if (this.npc != null) {
            this.npc.reset();
            Client.sendData(EnumPacketServer.NpcMenuClose, new Object[0]);
        }
    }
    
    public void mouseClicked(final int i, final int j, final int k) {
        if (k == 0) {
            final Minecraft mc = Minecraft.getMinecraft();
            for (final GuiMenuTopButton button : this.topButtons) {
                if (button.mousePressed(mc, i, j)) {
                    this.topButtonPressed(button);
                }
            }
        }
    }
    
    public void drawElements(final FontRenderer fontRenderer, final int i, final int j, final Minecraft mc, final float f) {
        for (final GuiMenuTopButton button : this.topButtons) {
            button.drawButton(mc, i, j);
        }
    }
    
    public void confirmClicked(final boolean flag, final int i) {
        final Minecraft mc = Minecraft.getMinecraft();
        if (flag) {
            Client.sendData(EnumPacketServer.Delete, new Object[0]);
            mc.displayGuiScreen((GuiScreen)null);
            mc.setIngameFocus();
        }
        else {
            NoppesUtil.openGUI((EntityPlayer)mc.thePlayer, this.parent);
        }
    }
}
