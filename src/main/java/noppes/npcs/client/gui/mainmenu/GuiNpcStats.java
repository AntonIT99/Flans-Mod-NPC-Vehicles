// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.mainmenu;

import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.client.gui.SubGuiNpcResistanceProperties;
import noppes.npcs.client.gui.SubGuiNpcProjectiles;
import net.minecraft.entity.EnumCreatureAttribute;
import noppes.npcs.client.gui.SubGuiNpcRangeProperties;
import noppes.npcs.client.gui.SubGuiNpcMeleeProperties;
import noppes.npcs.client.gui.util.SubGuiInterface;
import noppes.npcs.client.gui.SubGuiNpcRespawn;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiNpcButtonYesNo;
import noppes.npcs.client.gui.util.GuiNpcButton;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.DataStats;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.client.gui.util.GuiNPCInterface2;

public class GuiNpcStats extends GuiNPCInterface2 implements ITextfieldListener, IGuiData
{
    private DataStats stats;
    
    public GuiNpcStats(final EntityNPCInterface npc) {
        super(npc, 2);
        this.stats = npc.stats;
        Client.sendData(EnumPacketServer.MainmenuStatsGet, new Object[0]);
    }
    
    @Override
    public void initGui() {
        super.initGui();
        int y = this.guiTop + 10;
        this.addLabel(new GuiNpcLabel(0, "stats.health", this.guiLeft + 5, y + 5));
        this.addTextField(new GuiNpcTextField(0, this, this.guiLeft + 85, y, 50, 18, this.stats.maxHealth + ""));
        this.getTextField(0).numbersOnly = true;
        this.getTextField(0).setMinMaxDefault(1, Integer.MAX_VALUE, 20);
        this.addLabel(new GuiNpcLabel(1, "stats.aggro", this.guiLeft + 140, y + 5));
        this.addTextField(new GuiNpcTextField(1, this, this.fontRendererObj, this.guiLeft + 220, y, 50, 18, this.stats.aggroRange + ""));
        this.getTextField(1).numbersOnly = true;
        this.getTextField(1).setMinMaxDefault(1, 64, 2);
        this.addLabel(new GuiNpcLabel(34, "stats.creaturetype", this.guiLeft + 275, y + 5));
        this.addButton(new GuiNpcButton(8, this.guiLeft + 355, y, 56, 20, new String[] { "stats.normal", "stats.undead", "stats.arthropod" }, this.stats.creatureType.ordinal()));
        final boolean i = false;
        final int j = this.guiLeft + 82;
        y += 22;
        this.addButton(new GuiNpcButton((int)(i ? 1 : 0), j, y, 56, 20, "selectServer.edit"));
        this.addLabel(new GuiNpcLabel(2, "stats.respawn", this.guiLeft + 5, y + 5));
        final int k = 2;
        final int l = this.guiLeft + 82;
        y += 22;
        this.addButton(new GuiNpcButton(k, l, y, 56, 20, "selectServer.edit"));
        this.addLabel(new GuiNpcLabel(5, "stats.meleeproperties", this.guiLeft + 5, y + 5));
        final int m = 3;
        final int j2 = this.guiLeft + 82;
        y += 22;
        this.addButton(new GuiNpcButton(m, j2, y, 56, 20, "selectServer.edit"));
        this.addLabel(new GuiNpcLabel(6, "stats.rangedproperties", this.guiLeft + 5, y + 5));
        this.addButton(new GuiNpcButton(9, this.guiLeft + 217, y, 56, 20, "selectServer.edit"));
        this.addLabel(new GuiNpcLabel(7, "stats.projectileproperties", this.guiLeft + 140, y + 5));
        final int i2 = 15;
        final int j3 = this.guiLeft + 82;
        y += 34;
        this.addButton(new GuiNpcButton(i2, j3, y, 56, 20, "selectServer.edit"));
        this.addLabel(new GuiNpcLabel(15, "potion.resistance", this.guiLeft + 5, y + 5));
        final int i3 = 4;
        final int j4 = this.guiLeft + 82;
        y += 34;
        this.addButton(new GuiNpcButton(i3, j4, y, 56, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.npc.isImmuneToFire() ? 1 : 0)));
        this.addLabel(new GuiNpcLabel(10, "stats.fireimmune", this.guiLeft + 5, y + 5));
        this.addButton(new GuiNpcButton(5, this.guiLeft + 217, y, 56, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.stats.canDrown ? 1 : 0)));
        this.addLabel(new GuiNpcLabel(11, "stats.candrown", this.guiLeft + 140, y + 5));
        this.addTextField(new GuiNpcTextField(14, this, this.guiLeft + 355, y, 56, 20, this.stats.healthRegen + "").setNumbersOnly());
        this.addLabel(new GuiNpcLabel(14, "stats.regenhealth", this.guiLeft + 275, y + 5));
        final int id = 16;
        final int i4 = this.guiLeft + 355;
        y += 22;
        this.addTextField(new GuiNpcTextField(id, this, i4, y, 56, 20, this.stats.combatRegen + "").setNumbersOnly());
        this.addLabel(new GuiNpcLabel(16, "stats.combatregen", this.guiLeft + 275, y + 5));
        this.addButton(new GuiNpcButton(6, this.guiLeft + 82, y, 56, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.stats.burnInSun ? 1 : 0)));
        this.addLabel(new GuiNpcLabel(12, "stats.burninsun", this.guiLeft + 5, y + 5));
        this.addButton(new GuiNpcButton(7, this.guiLeft + 217, y, 56, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.stats.noFallDamage ? 1 : 0)));
        this.addLabel(new GuiNpcLabel(13, "stats.nofalldamage", this.guiLeft + 140, y + 5));
        final int id2 = 17;
        final int x = this.guiLeft + 82;
        y += 22;
        this.addButton(new GuiNpcButtonYesNo(id2, x, y, 56, 20, this.stats.potionImmune));
        this.addLabel(new GuiNpcLabel(17, "stats.potionImmune", this.guiLeft + 5, y + 5));
        this.addButton(new GuiNpcButtonYesNo(18, this.guiLeft + 217, y, 56, 20, this.stats.attackInvisible));
        this.addLabel(new GuiNpcLabel(18, "stats.attackInvisible", this.guiLeft + 140, y + 5));
    }
    
    @Override
    public void unFocused(final GuiNpcTextField textfield) {
        if (textfield.id == 0) {
            this.stats.maxHealth = textfield.getInteger();
            this.npc.heal((float)this.stats.maxHealth);
        }
        else if (textfield.id == 1) {
            this.stats.aggroRange = textfield.getInteger();
        }
        else if (textfield.id == 14) {
            this.stats.healthRegen = textfield.getInteger();
        }
        else if (textfield.id == 16) {
            this.stats.combatRegen = textfield.getInteger();
        }
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final GuiNpcButton button = (GuiNpcButton)guibutton;
        if (button.id == 0) {
            this.setSubGui(new SubGuiNpcRespawn(this.stats));
        }
        else if (button.id == 2) {
            this.setSubGui(new SubGuiNpcMeleeProperties(this.stats));
        }
        else if (button.id == 3) {
            this.setSubGui(new SubGuiNpcRangeProperties(this.stats));
        }
        else if (button.id == 4) {
            this.npc.setImmuneToFire(button.getValue() == 1);
        }
        else if (button.id == 5) {
            this.stats.canDrown = (button.getValue() == 1);
        }
        else if (button.id == 6) {
            this.stats.burnInSun = (button.getValue() == 1);
        }
        else if (button.id == 7) {
            this.stats.noFallDamage = (button.getValue() == 1);
        }
        else if (button.id == 8) {
            this.stats.creatureType = EnumCreatureAttribute.values()[button.getValue()];
        }
        else if (button.id == 9) {
            this.setSubGui(new SubGuiNpcProjectiles(this.stats));
        }
        else if (button.id == 15) {
            this.setSubGui(new SubGuiNpcResistanceProperties(this.stats.resistances));
        }
        else if (button.id == 17) {
            this.stats.potionImmune = ((GuiNpcButtonYesNo)guibutton).getBoolean();
        }
        else if (button.id == 18) {
            this.stats.potionImmune = ((GuiNpcButtonYesNo)guibutton).getBoolean();
        }
    }
    
    @Override
    public void save() {
        Client.sendData(EnumPacketServer.MainmenuStatsSave, this.stats.writeToNBT(new NBTTagCompound()));
    }
    
    @Override
    public void setGuiData(final NBTTagCompound compound) {
        this.stats.readToNBT(compound);
        this.initGui();
    }
}
