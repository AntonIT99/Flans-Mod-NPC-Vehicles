// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.player;

import java.util.Iterator;
import net.minecraft.nbt.NBTTagList;
import noppes.npcs.controllers.PlayerFactionData;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.CustomNpcResourceListener;
import net.minecraft.util.StatCollector;
import org.lwjgl.opengl.GL11;
import tconstruct.client.tabs.TabRegistry;
import tconstruct.client.tabs.InventoryTabFactions;
import noppes.npcs.NoppesUtilPlayer;
import noppes.npcs.constants.EnumPlayerPacket;
import net.minecraft.util.ResourceLocation;
import noppes.npcs.client.gui.util.GuiButtonNextPage;
import noppes.npcs.controllers.Faction;
import java.util.ArrayList;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.GuiNPCInterface;

public class GuiFaction extends GuiNPCInterface implements IGuiData
{
    private int xSize;
    private int ySize;
    private int guiLeft;
    private int guiTop;
    private ArrayList<Faction> playerFactions;
    private int page;
    private int pages;
    private GuiButtonNextPage buttonNextPage;
    private GuiButtonNextPage buttonPreviousPage;
    private ResourceLocation indicator;
    
    public GuiFaction() {
        this.playerFactions = new ArrayList<Faction>();
        this.page = 0;
        this.pages = 1;
        this.xSize = 200;
        this.ySize = 195;
        this.drawDefaultBackground = false;
        this.title = "";
        NoppesUtilPlayer.sendData(EnumPlayerPacket.FactionsGet, new Object[0]);
        this.indicator = this.getResource("standardbg.png");
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.guiLeft = (this.width - this.xSize) / 2;
        this.guiTop = (this.height - this.ySize) / 2 + 12;
        TabRegistry.updateTabValues(this.guiLeft, this.guiTop + 8, InventoryTabFactions.class);
        TabRegistry.addTabsToList(this.buttonList);
        this.buttonList.add(this.buttonNextPage = new GuiButtonNextPage(1, this.guiLeft + this.xSize - 43, this.guiTop + 180, true));
        this.buttonList.add(this.buttonPreviousPage = new GuiButtonNextPage(2, this.guiLeft + 20, this.guiTop + 180, false));
        this.updateButtons();
    }
    
    @Override
    public void drawScreen(final int i, final int j, final float f) {
        this.drawDefaultBackground();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.renderEngine.bindTexture(this.indicator);
        this.drawTexturedModalRect(this.guiLeft, this.guiTop + 8, 0, 0, this.xSize, this.ySize);
        this.drawTexturedModalRect(this.guiLeft + 4, this.guiTop + 8, 56, 0, 200, this.ySize);
        if (this.playerFactions.isEmpty()) {
            final String noFaction = StatCollector.translateToLocal("faction.nostanding");
            this.fontRendererObj.drawString(noFaction, this.guiLeft + (this.xSize - this.fontRendererObj.getStringWidth(noFaction)) / 2, this.guiTop + 80, CustomNpcResourceListener.DefaultTextColor);
        }
        else {
            this.renderScreen();
        }
        super.drawScreen(i, j, f);
    }
    
    private void renderScreen() {
        int size = 5;
        if (this.pages == 1) {
            size = this.playerFactions.size();
        }
        if (this.page == this.pages) {
            size = this.playerFactions.size() % 5;
        }
        for (int id = 0; id < size; ++id) {
            this.drawHorizontalLine(this.guiLeft + 2, this.guiLeft + this.xSize, this.guiTop + 14 + id * 30, -16777216 + CustomNpcResourceListener.DefaultTextColor);
            final Faction faction = this.playerFactions.get((this.page - 1) * 5 + id);
            final String name = faction.name;
            String points = " : " + faction.defaultPoints;
            String standing = StatCollector.translateToLocal("faction.friendly");
            int color = 65280;
            if (faction.defaultPoints < faction.neutralPoints) {
                standing = StatCollector.translateToLocal("faction.unfriendly");
                color = 16711680;
                points = points + "/" + faction.neutralPoints;
            }
            else if (faction.defaultPoints < faction.friendlyPoints) {
                standing = StatCollector.translateToLocal("faction.neutral");
                color = 15924992;
                points = points + "/" + faction.friendlyPoints;
            }
            else {
                points += "/-";
            }
            this.fontRendererObj.drawString(name, this.guiLeft + (this.xSize - this.fontRendererObj.getStringWidth(name)) / 2, this.guiTop + 19 + id * 30, faction.color);
            this.fontRendererObj.drawString(standing, this.width / 2 - this.fontRendererObj.getStringWidth(standing) - 1, this.guiTop + 33 + id * 30, color);
            this.fontRendererObj.drawString(points, this.width / 2, this.guiTop + 33 + id * 30, CustomNpcResourceListener.DefaultTextColor);
        }
        this.drawHorizontalLine(this.guiLeft + 2, this.guiLeft + this.xSize, this.guiTop + 14 + size * 30, -16777216 + CustomNpcResourceListener.DefaultTextColor);
        if (this.pages > 1) {
            final String s = this.page + "/" + this.pages;
            this.fontRendererObj.drawString(s, this.guiLeft + (this.xSize - this.fontRendererObj.getStringWidth(s)) / 2, this.guiTop + 203, CustomNpcResourceListener.DefaultTextColor);
        }
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        if (!(guibutton instanceof GuiButtonNextPage)) {
            return;
        }
        final int id = guibutton.id;
        if (id == 1) {
            ++this.page;
        }
        if (id == 2) {
            --this.page;
        }
        this.updateButtons();
    }
    
    private void updateButtons() {
        this.buttonNextPage.setVisible(this.page < this.pages);
        this.buttonPreviousPage.setVisible(this.page > 1);
    }
    
    protected void drawGuiContainerBackgroundLayer(final float f, final int i, final int j) {
    }
    
    @Override
    public void keyTyped(final char c, final int i) {
        if (i == 1 || this.isInventoryKey(i)) {
            this.close();
        }
    }
    
    @Override
    public void save() {
    }
    
    @Override
    public void setGuiData(final NBTTagCompound compound) {
        this.playerFactions = new ArrayList<Faction>();
        final NBTTagList list = compound.getTagList("FactionList", 10);
        for (int i = 0; i < list.tagCount(); ++i) {
            final Faction faction = new Faction();
            faction.readNBT(list.getCompoundTagAt(i));
            this.playerFactions.add(faction);
        }
        final PlayerFactionData data = new PlayerFactionData();
        data.loadNBTData(compound);
        for (final int id : data.factionData.keySet()) {
            final int points = data.factionData.get(id);
            for (final Faction faction2 : this.playerFactions) {
                if (faction2.id == id) {
                    faction2.defaultPoints = points;
                }
            }
        }
        this.pages = (this.playerFactions.size() - 1) / 5;
        ++this.pages;
        this.page = 1;
        this.updateButtons();
    }
}
