// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.roles;

import noppes.npcs.client.Client;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.constants.EnumPacketServer;
import noppes.npcs.client.controllers.MusicController;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.client.NoppesUtil;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.client.gui.GuiNpcSoundSelection;
import noppes.npcs.roles.JobBard;
import noppes.npcs.client.gui.util.GuiNPCInterface2;

public class GuiNpcBard extends GuiNPCInterface2
{
    private JobBard job;
    private GuiNpcSoundSelection gui;
    
    public GuiNpcBard(final EntityNPCInterface npc) {
        super(npc);
        this.job = (JobBard)npc.jobInterface;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.addButton(new GuiNpcButton(1, this.guiLeft + 55, this.guiTop + 15, 20, 20, "X"));
        this.addLabel(new GuiNpcLabel(0, this.job.song, this.guiLeft + 80, this.guiTop + 20));
        this.addButton(new GuiNpcButton(0, this.guiLeft + 75, this.guiTop + 50, "gui.selectSound"));
        this.addButton(new GuiNpcButton(2, this.guiLeft + 75, this.guiTop + 71, new String[] { "gui.none", "item.npcBanjo.name", "item.npcViolin.name", "item.npcGuitar.name", "item.npcHarp.name", "item.npcFrenchHorn.name" }, this.job.getInstrument().ordinal()));
        this.addButton(new GuiNpcButton(3, this.guiLeft + 75, this.guiTop + 92, new String[] { "bard.jukebox", "bard.background" }, (int)(this.job.isStreamer ? 0 : 1)));
        this.addLabel(new GuiNpcLabel(2, "bard.ondistance", this.guiLeft + 60, this.guiTop + 143));
        this.addTextField(new GuiNpcTextField(2, this, this.fontRendererObj, this.guiLeft + 160, this.guiTop + 138, 40, 20, this.job.minRange + ""));
        this.getTextField(2).numbersOnly = true;
        this.getTextField(2).setMinMaxDefault(2, 64, 5);
        this.addLabel(new GuiNpcLabel(4, "bard.hasoff", this.guiLeft + 60, this.guiTop + 166));
        this.addButton(new GuiNpcButton(4, this.guiLeft + 160, this.guiTop + 161, 60, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.job.hasOffRange ? 1 : 0)));
        this.addLabel(new GuiNpcLabel(3, "bard.offdistance", this.guiLeft + 60, this.guiTop + 189));
        this.addTextField(new GuiNpcTextField(3, this, this.fontRendererObj, this.guiLeft + 160, this.guiTop + 184, 40, 20, this.job.maxRange + ""));
        this.getTextField(3).numbersOnly = true;
        this.getTextField(3).setMinMaxDefault(2, 64, 10);
        this.getLabel(3).enabled = this.job.hasOffRange;
        this.getTextField(3).enabled = this.job.hasOffRange;
    }
    
    @Override
    public void elementClicked() {
        this.job.song = this.gui.getSelected();
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final GuiNpcButton button = (GuiNpcButton)guibutton;
        if (button.id == 0) {
            this.gui = new GuiNpcSoundSelection(this.npc, this, this.job.song);
            NoppesUtil.openGUI((EntityPlayer)this.player, this.gui);
            this.job.song = "";
            MusicController.Instance.stopMusic();
        }
        if (button.id == 1) {
            this.job.song = "";
            this.getLabel(0).label = "";
            MusicController.Instance.stopMusic();
        }
        if (button.id == 2) {
            this.job.setInstrument(button.getValue());
        }
        if (button.id == 3) {
            this.job.isStreamer = (button.getValue() == 0);
            this.initGui();
        }
        if (button.id == 4) {
            this.job.hasOffRange = (button.getValue() == 1);
            this.initGui();
        }
    }
    
    @Override
    public void save() {
        this.job.minRange = this.getTextField(2).getInteger();
        this.job.maxRange = this.getTextField(3).getInteger();
        if (this.job.minRange > this.job.maxRange) {
            this.job.maxRange = this.job.minRange;
        }
        MusicController.Instance.stopMusic();
        Client.sendData(EnumPacketServer.JobSave, this.job.writeToNBT(new NBTTagCompound()));
    }
}
