// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui;

import net.minecraft.client.gui.GuiButton;
import java.util.List;
import noppes.npcs.client.gui.util.GuiNpcButton;
import net.minecraft.world.biome.BiomeGenBase;
import java.util.ArrayList;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiCustomScroll;
import noppes.npcs.controllers.SpawnData;
import noppes.npcs.client.gui.util.SubGuiInterface;

public class SubGuiNpcBiomes extends SubGuiInterface
{
    private SpawnData data;
    private GuiCustomScroll scroll1;
    private GuiCustomScroll scroll2;
    
    public SubGuiNpcBiomes(final SpawnData data) {
        this.data = data;
        this.setBackground("menubg.png");
        this.xSize = 346;
        this.ySize = 216;
        this.closeOnEsc = true;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        if (this.scroll1 == null) {
            (this.scroll1 = new GuiCustomScroll(this, 0)).setSize(140, 180);
        }
        this.scroll1.guiLeft = this.guiLeft + 4;
        this.scroll1.guiTop = this.guiTop + 14;
        this.addScroll(this.scroll1);
        this.addLabel(new GuiNpcLabel(1, "spawning.availableBiomes", this.guiLeft + 4, this.guiTop + 4));
        if (this.scroll2 == null) {
            (this.scroll2 = new GuiCustomScroll(this, 1)).setSize(140, 180);
        }
        this.scroll2.guiLeft = this.guiLeft + 200;
        this.scroll2.guiTop = this.guiTop + 14;
        this.addScroll(this.scroll2);
        this.addLabel(new GuiNpcLabel(2, "spawning.spawningBiomes", this.guiLeft + 200, this.guiTop + 4));
        final List<String> biomes = new ArrayList<String>();
        for (final BiomeGenBase base : BiomeGenBase.getBiomeGenArray()) {
            if (base != null && base.biomeName != null && !this.data.biomes.contains(base.biomeName)) {
                biomes.add(base.biomeName);
            }
        }
        this.scroll1.setList(biomes);
        this.scroll2.setList(this.data.biomes);
        this.addButton(new GuiNpcButton(1, this.guiLeft + 145, this.guiTop + 40, 55, 20, ">"));
        this.addButton(new GuiNpcButton(2, this.guiLeft + 145, this.guiTop + 62, 55, 20, "<"));
        this.addButton(new GuiNpcButton(3, this.guiLeft + 145, this.guiTop + 90, 55, 20, ">>"));
        this.addButton(new GuiNpcButton(4, this.guiLeft + 145, this.guiTop + 112, 55, 20, "<<"));
        this.addButton(new GuiNpcButton(66, this.guiLeft + 260, this.guiTop + 194, 60, 20, "gui.done"));
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final GuiNpcButton button = (GuiNpcButton)guibutton;
        if (button.id == 1 && this.scroll1.hasSelected()) {
            this.data.biomes.add(this.scroll1.getSelected());
            this.scroll1.selected = -1;
            this.scroll1.selected = -1;
            this.initGui();
        }
        if (button.id == 2 && this.scroll2.hasSelected()) {
            this.data.biomes.remove(this.scroll2.getSelected());
            this.scroll2.selected = -1;
            this.initGui();
        }
        if (button.id == 3) {
            this.data.biomes.clear();
            for (final BiomeGenBase base : BiomeGenBase.getBiomeGenArray()) {
                if (base != null) {
                    this.data.biomes.add(base.biomeName);
                }
            }
            this.scroll1.selected = -1;
            this.scroll1.selected = -1;
            this.initGui();
        }
        if (button.id == 4) {
            this.data.biomes.clear();
            this.scroll1.selected = -1;
            this.scroll1.selected = -1;
            this.initGui();
        }
        if (button.id == 66) {
            this.close();
        }
    }
}
