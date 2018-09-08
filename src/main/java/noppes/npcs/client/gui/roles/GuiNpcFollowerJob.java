// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.roles;

import noppes.npcs.client.Client;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.constants.EnumPacketServer;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.client.gui.util.GuiCustomScroll;
import noppes.npcs.roles.JobFollower;
import noppes.npcs.client.gui.util.ICustomScrollListener;
import noppes.npcs.client.gui.util.GuiNPCInterface2;

public class GuiNpcFollowerJob extends GuiNPCInterface2 implements ICustomScrollListener
{
    private JobFollower job;
    private GuiCustomScroll scroll;
    
    public GuiNpcFollowerJob(final EntityNPCInterface npc) {
        super(npc);
        this.job = (JobFollower)npc.jobInterface;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.addLabel(new GuiNpcLabel(1, "gui.name", this.guiLeft + 6, this.guiTop + 110));
        this.addTextField(new GuiNpcTextField(1, this, this.fontRendererObj, this.guiLeft + 50, this.guiTop + 105, 200, 20, this.job.name));
        (this.scroll = new GuiCustomScroll(this, 0)).setSize(143, 208);
        this.scroll.guiLeft = this.guiLeft + 268;
        this.scroll.guiTop = this.guiTop + 4;
        this.addScroll(this.scroll);
        final List<String> names = new ArrayList<String>();
        final List<EntityNPCInterface> list = (List<EntityNPCInterface>)this.npc.worldObj.getEntitiesWithinAABB((Class)EntityNPCInterface.class, this.npc.boundingBox.expand(40.0, 40.0, 40.0));
        for (final EntityNPCInterface npc : list) {
            if (npc != this.npc) {
                if (names.contains(npc.display.name)) {
                    continue;
                }
                names.add(npc.display.name);
            }
        }
        this.scroll.setList(names);
    }
    
    @Override
    public void save() {
        this.job.name = this.getTextField(1).getText();
        Client.sendData(EnumPacketServer.JobSave, this.job.writeToNBT(new NBTTagCompound()));
    }
    
    @Override
    public void customScrollClicked(final int i, final int j, final int k, final GuiCustomScroll guiCustomScroll) {
        this.getTextField(1).setText(guiCustomScroll.getSelected());
    }
}
