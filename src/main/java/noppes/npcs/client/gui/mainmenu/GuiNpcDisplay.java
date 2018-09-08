// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.mainmenu;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import noppes.npcs.client.gui.GuiNpcTextureOverlays;
import noppes.npcs.client.gui.GuiNpcTextureCloaks;
import noppes.npcs.client.gui.GuiNPCTextures;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.client.NoppesUtil;
import noppes.npcs.client.gui.model.GuiCreationScreen;
import noppes.npcs.entity.EntityCustomNpc;
import net.minecraft.client.gui.GuiButton;
import java.util.UUID;
import com.mojang.authlib.GameProfile;
import noppes.npcs.client.gui.util.GuiNpcButton;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.DataDisplay;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.client.gui.util.GuiNPCInterface2;

public class GuiNpcDisplay extends GuiNPCInterface2 implements ITextfieldListener, IGuiData
{
    private DataDisplay display;
    
    public GuiNpcDisplay(final EntityNPCInterface npc) {
        super(npc, 1);
        this.display = npc.display;
        Client.sendData(EnumPacketServer.MainmenuDisplayGet, new Object[0]);
    }
    
    @Override
    public void initGui() {
        super.initGui();
        int y = this.guiTop + 4;
        this.addLabel(new GuiNpcLabel(0, "gui.name", this.guiLeft + 5, y + 5));
        this.addTextField(new GuiNpcTextField(0, this, this.fontRendererObj, this.guiLeft + 50, y, 200, 20, this.display.name));
        this.addButton(new GuiNpcButton(0, this.guiLeft + 253, y, 110, 20, new String[] { "display.show", "display.hide", "display.showAttacking" }, this.display.showName));
        y += 23;
        this.addLabel(new GuiNpcLabel(11, "gui.title", this.guiLeft + 5, y + 5));
        this.addTextField(new GuiNpcTextField(11, this, this.fontRendererObj, this.guiLeft + 50, y, 200, 20, this.display.title));
        y += 23;
        this.addLabel(new GuiNpcLabel(1, "display.model", this.guiLeft + 5, y + 5));
        this.addButton(new GuiNpcButton(1, this.guiLeft + 50, y, 110, 20, "selectServer.edit"));
        this.addLabel(new GuiNpcLabel(2, "display.size", this.guiLeft + 175, y + 5));
        this.addTextField(new GuiNpcTextField(2, this, this.fontRendererObj, this.guiLeft + 203, y, 40, 20, this.display.modelSize + ""));
        this.getTextField(2).numbersOnly = true;
        this.getTextField(2).setMinMaxDefault(1, 30, 5);
        this.addLabel(new GuiNpcLabel(3, "(1-30)", this.guiLeft + 246, y + 5));
        y += 23;
        this.addLabel(new GuiNpcLabel(4, "display.texture", this.guiLeft + 5, y + 5));
        this.addTextField(new GuiNpcTextField(3, this, this.fontRendererObj, this.guiLeft + 80, y, 200, 20, (this.display.skinType == 0) ? this.display.texture : this.display.url));
        this.addButton(new GuiNpcButton(3, this.guiLeft + 325, y, 38, 20, "mco.template.button.select"));
        this.addButton(new GuiNpcButton(2, this.guiLeft + 283, y, 40, 20, new String[] { "display.texture", "display.player", "display.url" }, this.display.skinType));
        this.getButton(3).setEnabled(this.display.skinType == 0);
        if (this.display.skinType == 1 && this.display.playerProfile != null) {
            this.getTextField(3).setText(this.display.playerProfile.getName());
        }
        y += 23;
        this.addLabel(new GuiNpcLabel(8, "display.cape", this.guiLeft + 5, y + 5));
        this.addTextField(new GuiNpcTextField(8, this, this.fontRendererObj, this.guiLeft + 80, y, 200, 20, this.display.cloakTexture));
        this.addButton(new GuiNpcButton(8, this.guiLeft + 283, y, 80, 20, "display.selectTexture"));
        y += 23;
        this.addLabel(new GuiNpcLabel(9, "display.overlay", this.guiLeft + 5, y + 5));
        this.addTextField(new GuiNpcTextField(9, this, this.fontRendererObj, this.guiLeft + 80, y, 200, 20, this.display.glowTexture));
        this.addButton(new GuiNpcButton(9, this.guiLeft + 283, y, 80, 20, "display.selectTexture"));
        y += 23;
        this.addLabel(new GuiNpcLabel(5, "display.livingAnimation", this.guiLeft + 5, y + 5));
        this.addButton(new GuiNpcButton(5, this.guiLeft + 120, y, 50, 20, new String[] { "gui.yes", "gui.no" }, (int)(this.display.disableLivingAnimation ? 1 : 0)));
        y += 23;
        this.addLabel(new GuiNpcLabel(7, "display.visible", this.guiLeft + 5, y + 5));
        this.addButton(new GuiNpcButton(7, this.guiLeft + 120, y, 50, 20, new String[] { "gui.yes", "gui.no", "gui.partly" }, this.display.visible));
        y += 23;
        this.addLabel(new GuiNpcLabel(10, "display.bossbar", this.guiLeft + 5, y + 5));
        this.addButton(new GuiNpcButton(10, this.guiLeft + 120, y, 110, 20, new String[] { "display.hide", "display.show", "display.showAttacking" }, this.display.showBossBar));
    }
    
    @Override
    public void unFocused(final GuiNpcTextField textfield) {
        if (textfield.id == 0) {
            if (!textfield.isEmpty()) {
                this.display.name = textfield.getText();
            }
            else {
                textfield.setText(this.display.name);
            }
        }
        else if (textfield.id == 2) {
            this.display.modelSize = textfield.getInteger();
        }
        else if (textfield.id == 3) {
            if (this.display.skinType == 2) {
                this.display.url = textfield.getText();
            }
            else if (this.display.skinType == 1) {
                if (!textfield.isEmpty()) {
                    this.display.playerProfile = new GameProfile((UUID)null, textfield.getText());
                }
                else {
                    this.display.playerProfile = null;
                }
            }
            else {
                this.display.texture = textfield.getText();
            }
        }
        else if (textfield.id == 8) {
            this.npc.textureCloakLocation = null;
            this.display.cloakTexture = textfield.getText();
        }
        else if (textfield.id == 9) {
            this.npc.textureGlowLocation = null;
            this.display.glowTexture = textfield.getText();
        }
        else if (textfield.id == 11) {
            this.display.title = textfield.getText();
        }
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final GuiNpcButton button = (GuiNpcButton)guibutton;
        if (button.id == 0) {
            this.display.showName = button.getValue();
        }
        if (button.id == 1) {
            NoppesUtil.openGUI((EntityPlayer)this.player, new GuiCreationScreen(this, (EntityCustomNpc)this.npc));
        }
        if (button.id == 2) {
            this.display.skinType = (byte)button.getValue();
            this.display.url = "";
            this.display.playerProfile = null;
            this.initGui();
        }
        else if (button.id == 3) {
            NoppesUtil.openGUI((EntityPlayer)this.player, new GuiNPCTextures(this.npc, this));
        }
        else if (button.id == 5) {
            this.display.disableLivingAnimation = (button.getValue() == 1);
        }
        else if (button.id == 7) {
            this.display.visible = button.getValue();
        }
        else if (button.id == 8) {
            NoppesUtil.openGUI((EntityPlayer)this.player, new GuiNpcTextureCloaks(this.npc, this));
        }
        else if (button.id == 9) {
            NoppesUtil.openGUI((EntityPlayer)this.player, new GuiNpcTextureOverlays(this.npc, this));
        }
        else if (button.id == 10) {
            this.display.showBossBar = (byte)button.getValue();
        }
    }
    
    @Override
    public void save() {
        if (this.display.skinType == 1) {
            this.display.loadProfile();
        }
        this.npc.textureLocation = null;
        this.mc.renderGlobal.onEntityDestroy((Entity)this.npc);
        this.mc.renderGlobal.onEntityCreate((Entity)this.npc);
        Client.sendData(EnumPacketServer.MainmenuDisplaySave, this.display.writeToNBT(new NBTTagCompound()));
    }
    
    @Override
    public void setGuiData(final NBTTagCompound compound) {
        this.display.readToNBT(compound);
        this.initGui();
    }
}
