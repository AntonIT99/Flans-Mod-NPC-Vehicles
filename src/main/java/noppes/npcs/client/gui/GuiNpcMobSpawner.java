// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui;

import net.minecraft.nbt.NBTTagList;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;
import net.minecraft.command.ICommandSender;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Collection;
import noppes.npcs.client.controllers.ClientCloneController;
import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import java.util.Iterator;
import java.util.Map;
import java.lang.reflect.Modifier;
import net.minecraft.world.World;
import net.minecraft.entity.EntityLiving;
import java.util.ArrayList;
import net.minecraft.entity.EntityList;
import noppes.npcs.client.gui.util.GuiMenuSideButton;
import noppes.npcs.client.gui.util.GuiNpcButton;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiMenuTopButton;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import net.minecraft.client.gui.GuiScreen;
import java.util.List;
import noppes.npcs.client.gui.util.GuiCustomScroll;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.GuiNPCInterface;

public class GuiNpcMobSpawner extends GuiNPCInterface implements IGuiData
{
    private GuiCustomScroll scroll;
    private int posX;
    private int posY;
    private int posZ;
    private List<String> list;
    private static int showingClones;
    private static String search;
    private int activeTab;
    
    public GuiNpcMobSpawner(final int i, final int j, final int k) {
        this.activeTab = 1;
        this.xSize = 256;
        this.posX = i;
        this.posY = j;
        this.posZ = k;
        this.closeOnEsc = true;
        this.setBackground("menubg.png");
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.guiTop += 10;
        if (this.scroll == null) {
            (this.scroll = new GuiCustomScroll(this, 0)).setSize(165, 188);
        }
        else {
            this.scroll.clear();
        }
        this.scroll.guiLeft = this.guiLeft + 4;
        this.scroll.guiTop = this.guiTop + 26;
        this.addScroll(this.scroll);
        this.addTextField(new GuiNpcTextField(1, this, this.fontRendererObj, this.guiLeft + 4, this.guiTop + 4, 165, 20, GuiNpcMobSpawner.search));
        GuiMenuTopButton button;
        this.addTopButton(button = new GuiMenuTopButton(3, this.guiLeft + 4, this.guiTop - 17, "spawner.clones"));
        button.active = (GuiNpcMobSpawner.showingClones == 0);
        this.addTopButton(button = new GuiMenuTopButton(4, button, "spawner.entities"));
        button.active = (GuiNpcMobSpawner.showingClones == 1);
        this.addTopButton(button = new GuiMenuTopButton(5, button, "gui.server"));
        button.active = (GuiNpcMobSpawner.showingClones == 2);
        this.addButton(new GuiNpcButton(1, this.guiLeft + 170, this.guiTop + 6, 82, 20, "item.monsterPlacer.name"));
        this.addButton(new GuiNpcButton(2, this.guiLeft + 170, this.guiTop + 100, 82, 20, "spawner.mobspawner"));
        if (GuiNpcMobSpawner.showingClones == 0 || GuiNpcMobSpawner.showingClones == 2) {
            this.addSideButton(new GuiMenuSideButton(21, this.guiLeft - 69, this.guiTop + 2, 70, 22, "Tab 1"));
            this.addSideButton(new GuiMenuSideButton(22, this.guiLeft - 69, this.guiTop + 23, 70, 22, "Tab 2"));
            this.addSideButton(new GuiMenuSideButton(23, this.guiLeft - 69, this.guiTop + 44, 70, 22, "Tab 3"));
            this.addSideButton(new GuiMenuSideButton(24, this.guiLeft - 69, this.guiTop + 65, 70, 22, "Tab 4"));
            this.addSideButton(new GuiMenuSideButton(25, this.guiLeft - 69, this.guiTop + 86, 70, 22, "Tab 5"));
            this.addSideButton(new GuiMenuSideButton(26, this.guiLeft - 69, this.guiTop + 107, 70, 22, "Tab 6"));
            this.addSideButton(new GuiMenuSideButton(27, this.guiLeft - 69, this.guiTop + 128, 70, 22, "Tab 7"));
            this.addSideButton(new GuiMenuSideButton(28, this.guiLeft - 69, this.guiTop + 149, 70, 22, "Tab 8"));
            this.addSideButton(new GuiMenuSideButton(29, this.guiLeft - 69, this.guiTop + 170, 70, 22, "Tab 9"));
            this.addButton(new GuiNpcButton(6, this.guiLeft + 170, this.guiTop + 30, 82, 20, "gui.remove"));
            this.getSideButton(20 + this.activeTab).active = true;
            this.showClones();
        }
        else {
            this.showEntities();
        }
    }
    
    private void showEntities() {
        final Map<?, ?> data = (Map<?, ?>)EntityList.stringToClassMapping;
        final ArrayList<String> list = new ArrayList<String>();
        for (final Object name : data.keySet()) {
            final Class<?> c = (Class<?>)data.get(name);
            try {
                if (!EntityLiving.class.isAssignableFrom(c) || c.getConstructor(World.class) == null || Modifier.isAbstract(c.getModifiers())) {
                    continue;
                }
                list.add(name.toString());
            }
            catch (SecurityException e) {
                e.printStackTrace();
            }
            catch (NoSuchMethodException ex) {}
        }
        this.list = list;
        this.scroll.setList(this.getSearchList());
    }
    
    private void showClones() {
        if (GuiNpcMobSpawner.showingClones == 2) {
            Client.sendData(EnumPacketServer.CloneList, this.activeTab);
            return;
        }
        final ArrayList<String> list = new ArrayList<String>();
        this.list = ClientCloneController.Instance.getClones(this.activeTab);
        this.scroll.setList(this.getSearchList());
    }
    
    @Override
    public void keyTyped(final char c, final int i) {
        super.keyTyped(c, i);
        if (GuiNpcMobSpawner.search.equals(this.getTextField(1).getText())) {
            return;
        }
        GuiNpcMobSpawner.search = this.getTextField(1).getText().toLowerCase();
        this.scroll.setList(this.getSearchList());
    }
    
    private List<String> getSearchList() {
        if (GuiNpcMobSpawner.search.isEmpty()) {
            return new ArrayList<String>(this.list);
        }
        final List<String> list = new ArrayList<String>();
        for (final String name : this.list) {
            if (name.toLowerCase().contains(GuiNpcMobSpawner.search)) {
                list.add(name);
            }
        }
        return list;
    }
    
    private NBTTagCompound getCompound() {
        final String sel = this.scroll.getSelected();
        if (sel == null) {
            return null;
        }
        if (GuiNpcMobSpawner.showingClones == 0) {
            return ClientCloneController.Instance.getCloneData((ICommandSender)this.player, sel, this.activeTab);
        }
        final Entity entity = EntityList.createEntityByName(sel, (World)Minecraft.getMinecraft().theWorld);
        if (entity == null) {
            return null;
        }
        final NBTTagCompound compound = new NBTTagCompound();
        entity.writeToNBTOptional(compound);
        return compound;
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final int id = guibutton.id;
        if (id == 0) {
            this.close();
        }
        if (id == 1) {
            if (GuiNpcMobSpawner.showingClones == 2) {
                final String sel = this.scroll.getSelected();
                if (sel == null) {
                    return;
                }
                Client.sendData(EnumPacketServer.SpawnMob, true, this.posX, this.posY, this.posZ, sel, this.activeTab);
                this.close();
            }
            else {
                final NBTTagCompound compound = this.getCompound();
                if (compound == null) {
                    return;
                }
                Client.sendData(EnumPacketServer.SpawnMob, false, this.posX, this.posY, this.posZ, compound);
                this.close();
            }
        }
        if (id == 2) {
            if (GuiNpcMobSpawner.showingClones == 2) {
                final String sel = this.scroll.getSelected();
                if (sel == null) {
                    return;
                }
                Client.sendData(EnumPacketServer.MobSpawner, true, this.posX, this.posY, this.posZ, sel, this.activeTab);
                this.close();
            }
            else {
                final NBTTagCompound compound = this.getCompound();
                if (compound == null) {
                    return;
                }
                Client.sendData(EnumPacketServer.MobSpawner, false, this.posX, this.posY, this.posZ, compound);
                this.close();
            }
        }
        if (id == 3) {
            GuiNpcMobSpawner.showingClones = 0;
            this.initGui();
        }
        if (id == 4) {
            GuiNpcMobSpawner.showingClones = 1;
            this.initGui();
        }
        if (id == 5) {
            GuiNpcMobSpawner.showingClones = 2;
            this.initGui();
        }
        if (id == 6 && this.scroll.getSelected() != null) {
            if (GuiNpcMobSpawner.showingClones == 2) {
                Client.sendData(EnumPacketServer.CloneRemove, this.activeTab, this.scroll.getSelected());
                return;
            }
            ClientCloneController.Instance.removeClone(this.scroll.getSelected(), this.activeTab);
            this.scroll.selected = -1;
            this.initGui();
        }
        if (id > 20) {
            this.activeTab = id - 20;
            this.initGui();
        }
    }
    
    @Override
    public void save() {
    }
    
    @Override
    public void setGuiData(final NBTTagCompound compound) {
        final NBTTagList nbtlist = compound.getTagList("List", 8);
        final List<String> list = new ArrayList<String>();
        for (int i = 0; i < nbtlist.tagCount(); ++i) {
            list.add(nbtlist.getStringTagAt(i));
        }
        this.list = list;
        this.scroll.setList(this.getSearchList());
    }
    
    static {
        GuiNpcMobSpawner.showingClones = 0;
        GuiNpcMobSpawner.search = "";
    }
}
