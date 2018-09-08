// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.model;

import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import net.minecraft.client.renderer.entity.NPCRendererHelper;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.entity.EntityFakeLiving;
import java.lang.reflect.Method;
import net.minecraft.nbt.NBTBase;
import java.util.Set;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagByte;
import net.minecraft.client.Minecraft;
import noppes.npcs.client.gui.util.GuiCustomScroll;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import net.minecraft.entity.Entity;
import noppes.npcs.controllers.PixelmonHelper;
import noppes.npcs.entity.EntityNPCInterface;
import java.util.Iterator;
import java.util.Map;
import java.util.Comparator;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import java.lang.reflect.Modifier;
import net.minecraft.world.World;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityList;
import noppes.npcs.entity.EntityCustomNpc;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiNpcButton;
import java.util.List;
import net.minecraft.entity.EntityLivingBase;
import java.util.HashMap;
import noppes.npcs.client.gui.util.ICustomScrollListener;
import noppes.npcs.client.gui.util.GuiModelInterface;

public class GuiCreationScreen extends GuiModelInterface implements ICustomScrollListener
{
    public HashMap<String, Class<? extends EntityLivingBase>> data;
    private List<String> list;
    private final String[] ignoredTags;
    private GuiNpcButton prev;
    private GuiNpcButton next;
    private GuiScreen parent;
    private HashMap<Integer, String> mapped;
    
    public GuiCreationScreen(final GuiScreen parent, final EntityCustomNpc npc) {
        super(npc);
        this.data = new HashMap<String, Class<? extends EntityLivingBase>>();
        this.ignoredTags = new String[] { "CanBreakDoors", "Bred", "PlayerCreated", "Tame", "HasReproduced" };
        this.mapped = new HashMap<Integer, String>();
        this.parent = parent;
        final Map<?, ?> mapping = (Map<?, ?>)EntityList.stringToClassMapping;
        for (final Object name : mapping.keySet()) {
            final Class<?> c = (Class<?>)mapping.get(name);
            try {
                if (EntityCustomNpc.class.isAssignableFrom(c) || !EntityLiving.class.isAssignableFrom(c) || c.getConstructor(World.class) == null || Modifier.isAbstract(c.getModifiers()) || !(RenderManager.instance.getEntityClassRenderObject((Class)c) instanceof RendererLivingEntity)) {
                    continue;
                }
                this.data.put(name.toString(), c.asSubclass(EntityLivingBase.class));
            }
            catch (SecurityException e) {
                e.printStackTrace();
            }
            catch (NoSuchMethodException ex) {}
        }
        Collections.sort(this.list = new ArrayList<String>(this.data.keySet()), String.CASE_INSENSITIVE_ORDER);
    }
    
    @Override
    public void initGui() {
        final EntityLivingBase entity = this.playerdata.getEntity(this.npc);
        this.xOffset = ((entity == null) ? 0 : 50);
        super.initGui();
        String title = "CustomNPC";
        if (entity != null) {
            title = (String) EntityList.classToStringMapping.get(this.playerdata.getEntityClass());
        }
        this.addButton(new GuiNpcButton(1, this.guiLeft + 140, this.guiTop, 100, 20, title));
        this.addButton(this.prev = new GuiNpcButton(0, this.guiLeft + 118, this.guiTop, 20, 20, "<"));
        this.addButton(this.next = new GuiNpcButton(2, this.guiLeft + 242, this.guiTop, 20, 20, ">"));
        this.prev.enabled = (this.getCurrentEntityIndex() >= 0);
        this.next.enabled = (this.getCurrentEntityIndex() < this.list.size() - 1);
        if (entity == null) {
            this.showPlayerButtons();
        }
        else if (PixelmonHelper.isPixelmon((Entity)entity)) {
            this.showPixelmonMenu(entity);
        }
        else {
            this.showEntityButtons(entity);
        }
    }
    
    private void showPlayerButtons() {
        int y = this.guiTop;
        final int i = 8;
        final int j = this.guiLeft + 4;
        y += 22;
        this.addButton(new GuiNpcButton(i, j, y, 96, 20, "model.scale"));
        final int k = 4;
        final int l = this.guiLeft + 50;
        y += 22;
        this.addButton(new GuiNpcButton(k, l, y, 50, 20, "selectServer.edit"));
        this.addLabel(new GuiNpcLabel(1, "Head", this.guiLeft, y + 5, 16777215));
        final int m = 5;
        final int j2 = this.guiLeft + 50;
        y += 22;
        this.addButton(new GuiNpcButton(m, j2, y, 50, 20, "selectServer.edit"));
        this.addLabel(new GuiNpcLabel(2, "Body", this.guiLeft, y + 5, 16777215));
        final int i2 = 6;
        final int j3 = this.guiLeft + 50;
        y += 22;
        this.addButton(new GuiNpcButton(i2, j3, y, 50, 20, "selectServer.edit"));
        this.addLabel(new GuiNpcLabel(3, "Arms", this.guiLeft, y + 5, 16777215));
        final int i3 = 7;
        final int j4 = this.guiLeft + 50;
        y += 22;
        this.addButton(new GuiNpcButton(i3, j4, y, 50, 20, "selectServer.edit"));
        this.addLabel(new GuiNpcLabel(4, "Legs", this.guiLeft, y + 5, 16777215));
        this.addButton(new GuiNpcButton(44, this.guiLeft + 310, this.guiTop + 14, 80, 20, "Save Model"));
        this.addButton(new GuiNpcButton(45, this.guiLeft + 310, this.guiTop + 36, 80, 20, "Load Model"));
    }
    
    private void showPixelmonMenu(final EntityLivingBase entity) {
        final GuiCustomScroll scroll = new GuiCustomScroll(this, 0);
        scroll.setSize(120, 200);
        scroll.guiLeft = this.guiLeft;
        scroll.guiTop = this.guiTop + 20;
        this.addScroll(scroll);
        scroll.setList(PixelmonHelper.getPixelmonList());
        scroll.setSelected(PixelmonHelper.getName(entity));
        Minecraft.getMinecraft().thePlayer.sendChatMessage(PixelmonHelper.getName(entity));
    }
    
    private void showEntityButtons(final EntityLivingBase entity) {
        this.mapped.clear();
        if (entity instanceof EntityNPCInterface) {
            return;
        }
        final int y = this.guiTop + 20;
        final NBTTagCompound compound = this.getExtras(entity);
        final Set<String> keys = (Set<String>)compound.func_150296_c();
        int i = 0;
        for (final String name : keys) {
            if (this.isIgnored(name)) {
                continue;
            }
            final NBTBase base = compound.getTag(name);
            if (name.equals("Age")) {
                ++i;
                this.addLabel(new GuiNpcLabel(0, "Child", this.guiLeft, y + 5 + i * 22, 16777215));
                this.addButton(new GuiNpcButton(30, this.guiLeft + 80, y + i * 22, 50, 20, new String[] { "gui.no", "gui.yes" }, (int)(entity.isChild() ? 1 : 0)));
            }
            else {
                if (base.getId() != 1) {
                    continue;
                }
                byte b = ((NBTTagByte)base).func_150290_f();
                if (b != 0 && b != 1) {
                    continue;
                }
                if (this.playerdata.extra.hasKey(name)) {
                    b = this.playerdata.extra.getByte(name);
                }
                ++i;
                this.addLabel(new GuiNpcLabel(100 + i, name, this.guiLeft, y + 5 + i * 22, 16777215));
                this.addButton(new GuiNpcButton(100 + i, this.guiLeft + 80, y + i * 22, 50, 20, new String[] { "gui.no", "gui.yes" }, b));
                this.mapped.put(i, name);
            }
        }
        if (EntityList.getEntityString((Entity)entity).equals("doggystyle.Dog")) {
            int breed = 0;
            try {
                final Method method = entity.getClass().getMethod("getBreedID", (Class<?>[])new Class[0]);
                breed = (Integer) method.invoke(entity, new Object[0]);
            }
            catch (Exception ex) {}
            ++i;
            this.addLabel(new GuiNpcLabel(201, "Breed", this.guiLeft, y + 5 + i * 22, 16777215));
            this.addButton(new GuiNpcButton(201, this.guiLeft + 80, y + i * 22, 50, 20, new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16" }, breed));
        }
    }
    
    private boolean isIgnored(final String tag) {
        for (final String s : this.ignoredTags) {
            if (s.equals(tag)) {
                return true;
            }
        }
        return false;
    }
    
    private NBTTagCompound getExtras(final EntityLivingBase entity) {
        final NBTTagCompound fake = new NBTTagCompound();
        new EntityFakeLiving(entity.worldObj).writeEntityToNBT(fake);
        final NBTTagCompound compound = new NBTTagCompound();
        try {
            entity.writeEntityToNBT(compound);
        }
        catch (Exception ex) {}
        final Set<String> keys = (Set<String>)fake.func_150296_c();
        for (final String name : keys) {
            compound.removeTag(name);
        }
        return compound;
    }
    
    private int getCurrentEntityIndex() {
        return this.list.indexOf(EntityList.classToStringMapping.get(this.playerdata.getEntityClass()));
    }
    
    @Override
    protected void actionPerformed(final GuiButton btn) {
        super.actionPerformed(btn);
        final GuiNpcButton button = (GuiNpcButton)btn;
        if (button.id == 0) {
            int index = this.getCurrentEntityIndex();
            if (!this.prev.enabled) {
                return;
            }
            --index;
            try {
                if (index < 0) {
                    this.playerdata.setEntityClass((Class<? extends EntityLivingBase>)null);
                    this.npc.display.texture = "customnpcs:textures/entity/humanmale/Steve.png";
                }
                else {
                    this.playerdata.setEntityClass(this.data.get(this.list.get(index)));
                    final EntityLivingBase entity = this.playerdata.getEntity(this.npc);
                    if (entity != null) {
                        final RendererLivingEntity render = (RendererLivingEntity)RenderManager.instance.getEntityRenderObject((Entity)entity);
                        this.npc.display.texture = NPCRendererHelper.getTexture(render, (Entity)entity);
                    }
                }
                this.npc.display.glowTexture = "";
                this.npc.textureLocation = null;
                this.npc.textureGlowLocation = null;
                this.npc.updateHitbox();
            }
            catch (Exception ex) {
                this.npc.display.texture = "customnpcs:textures/entity/humanmale/Steve.png";
            }
            this.initGui();
        }
        if (button.id == 2) {
            int index = this.getCurrentEntityIndex();
            if (!this.next.enabled) {
                return;
            }
            ++index;
            this.playerdata.setEntityClass(this.data.get(this.list.get(index)));
            this.updateTexture();
            this.initGui();
        }
        if (button.id == 1) {
            this.mc.displayGuiScreen((GuiScreen)new GuiEntitySelection(this, this.playerdata, this.npc));
        }
        if (button.id == 4) {
            this.mc.displayGuiScreen((GuiScreen)new GuiModelHead(this, this.npc));
        }
        if (button.id == 5) {
            this.mc.displayGuiScreen((GuiScreen)new GuiModelBody(this, this.npc));
        }
        if (button.id == 6) {
            this.mc.displayGuiScreen((GuiScreen)new GuiModelArms(this, this.npc));
        }
        if (button.id == 7) {
            this.mc.displayGuiScreen((GuiScreen)new GuiModelLegs(this, this.npc));
        }
        if (button.id == 8) {
            this.mc.displayGuiScreen((GuiScreen)new GuiModelScale(this, this.playerdata, this.npc));
        }
        if (button.id == 30) {
            this.playerdata.extra.setInteger("Age", (button.getValue() == 1) ? -24000 : 0);
            this.playerdata.clearEntity();
        }
        if (button.id == 44) {
            this.mc.displayGuiScreen((GuiScreen)new GuiPresetSave(this, this.playerdata));
        }
        if (button.id == 45) {
            this.mc.displayGuiScreen((GuiScreen)new GuiPresetSelection(this, this.playerdata));
        }
        if (button.id >= 100 && button.id < 200) {
            final String name = this.mapped.get(button.id - 100);
            if (name != null) {
                this.playerdata.extra.setBoolean(name, button.getValue() == 1);
                this.playerdata.clearEntity();
            }
        }
        if (button.id == 201) {
            try {
                final EntityLivingBase entity2 = this.playerdata.getEntity(this.npc);
                final Method method = entity2.getClass().getMethod("setBreedID", Integer.TYPE);
                method.invoke(entity2, button.getValue());
                final NBTTagCompound comp = new NBTTagCompound();
                entity2.writeEntityToNBT(comp);
                this.playerdata.extra.setString("EntityData21", comp.getString("EntityData21"));
                this.playerdata.clearEntity();
                this.updateTexture();
            }
            catch (Exception ex2) {}
        }
    }
    
    private void updateTexture() {
        try {
            final EntityLivingBase entity = this.playerdata.getEntity(this.npc);
            if (entity != null) {
                final RendererLivingEntity render = (RendererLivingEntity)RenderManager.instance.getEntityRenderObject((Entity)entity);
                this.npc.display.texture = NPCRendererHelper.getTexture(render, (Entity)entity);
            }
            else {
                this.npc.display.texture = "customnpcs:textures/entity/humanmale/Steve.png";
            }
            this.npc.display.glowTexture = "";
            this.npc.textureLocation = null;
            this.npc.textureGlowLocation = null;
            this.npc.updateHitbox();
        }
        catch (Exception ex) {
            this.npc.display.texture = "customnpcs:textures/entity/humanmale/Steve.png";
        }
    }
    
    @Override
    public void close() {
        Client.sendData(EnumPacketServer.ModelDataSave, this.playerdata.writeToNBT());
        this.displayGuiScreen(this.parent);
    }
    
    @Override
    public void customScrollClicked(final int i, final int j, final int k, final GuiCustomScroll scroll) {
        this.playerdata.clearEntity();
        this.playerdata.extra.setString("Name", scroll.getSelected());
        final EntityLivingBase entity = this.playerdata.getEntity(this.npc);
        final RendererLivingEntity render = (RendererLivingEntity)RenderManager.instance.getEntityRenderObject((Entity)entity);
        this.npc.display.texture = NPCRendererHelper.getTexture(render, (Entity)entity);
        this.npc.textureLocation = null;
    }
}
