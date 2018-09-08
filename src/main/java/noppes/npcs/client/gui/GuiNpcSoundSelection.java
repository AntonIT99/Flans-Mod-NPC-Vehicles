// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui;

import noppes.npcs.client.controllers.MusicController;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiNPCInterface2;
import java.util.Collection;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.audio.SoundRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.util.StatCollector;
import noppes.npcs.entity.EntityNPCInterface;
import java.util.List;
import java.util.HashMap;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiNPCStringSlot;
import noppes.npcs.client.gui.util.GuiNPCInterface;

public class GuiNpcSoundSelection extends GuiNPCInterface
{
    public GuiNPCStringSlot slot;
    private String domain;
    private GuiScreen parent;
    private String up;
    private HashMap<String, List<String>> domains;
    
    public GuiNpcSoundSelection(final EntityNPCInterface npc, final GuiScreen parent, final String sound) {
        super(npc);
        this.up = "..<" + StatCollector.translateToLocal("gui.up") + ">..";
        this.domains = new HashMap<String, List<String>>();
        final SoundHandler handler = Minecraft.getMinecraft().getSoundHandler();
        final SoundRegistry registry = (SoundRegistry)ObfuscationReflectionHelper.getPrivateValue((Class)SoundHandler.class, (Object)handler, 4);
        final Set<ResourceLocation> set = (Set<ResourceLocation>)registry.getKeys();
        for (final ResourceLocation location : set) {
            List<String> list = this.domains.get(location.getResourceDomain());
            if (list == null) {
                this.domains.put(location.getResourceDomain(), list = new ArrayList<String>());
            }
            list.add(location.getResourcePath());
            this.domains.put(location.getResourceDomain(), list);
        }
        this.drawDefaultBackground = false;
        this.parent = parent;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        String ss = "Current domain: " + this.domain;
        if (this.domain == null) {
            ss = "Select domain";
        }
        this.addLabel(new GuiNpcLabel(0, ss, this.width / 2 - this.fontRendererObj.getStringWidth(ss) / 2, 20, 16777215));
        Collection<String> col = this.domains.keySet();
        if (this.domain != null) {
            col = this.domains.get(this.domain);
            if (!col.contains(this.up)) {
                col.add(this.up);
            }
        }
        (this.slot = new GuiNPCStringSlot(col, this, false, 18)).registerScrollButtons(4, 5);
        if (this.domain != null) {
            this.addButton(new GuiNpcButton(1, this.width / 2 - 100, this.height - 27, 198, 20, "gui.play"));
            this.addButton(new GuiNpcButton(3, this.width / 2 - 100, this.height - 50, 98, 20, "gui.done"));
        }
        else {
            this.addButton(new GuiNpcButton(4, this.width / 2 - 100, this.height - 50, 98, 20, "gui.open"));
        }
        this.addButton(new GuiNpcButton(2, this.width / 2 + 2, this.height - 50, 98, 20, "gui.cancel"));
    }
    
    @Override
    public void drawScreen(final int i, final int j, final float f) {
        this.slot.drawScreen(i, j, f);
        super.drawScreen(i, j, f);
    }
    
    @Override
    public void doubleClicked() {
        if (this.slot.selected == null || this.slot.selected.isEmpty()) {
            return;
        }
        if (this.slot.selected.equals(this.up)) {
            this.domain = null;
            this.initGui();
        }
        else if (this.domain == null) {
            this.domain = this.slot.selected;
            this.initGui();
        }
        else {
            if (this.parent instanceof GuiNPCInterface) {
                ((GuiNPCInterface)this.parent).elementClicked();
            }
            else if (this.parent instanceof GuiNPCInterface2) {
                ((GuiNPCInterface2)this.parent).elementClicked();
            }
            this.displayGuiScreen(this.parent);
        }
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        super.actionPerformed(guibutton);
        if (guibutton.id == 1) {
            MusicController.Instance.stopMusic();
            MusicController.Instance.playSound(this.getSelected(), (float)this.player.posX, (float)this.player.posY, (float)this.player.posZ);
        }
        if (guibutton.id == 2) {
            this.displayGuiScreen(this.parent);
        }
        if (guibutton.id == 3) {
            if (this.slot.selected == null || this.slot.selected.equals(this.up)) {
                return;
            }
            this.doubleClicked();
        }
        if (guibutton.id == 4) {
            this.doubleClicked();
        }
    }
    
    @Override
    public void save() {
    }
    
    public String getSelected() {
        if (this.slot.selected == null || this.slot.selected.isEmpty()) {
            return "";
        }
        return this.domain + ":" + this.slot.selected;
    }
}
