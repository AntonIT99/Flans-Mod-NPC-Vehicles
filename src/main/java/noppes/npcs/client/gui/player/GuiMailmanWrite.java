// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.player;

import net.minecraft.util.IChatComponent;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.client.resources.I18n;
import org.lwjgl.opengl.GL11;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ChatAllowedCharacters;
import net.minecraft.client.gui.GuiYesNo;
import net.minecraft.util.StatCollector;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.client.NoppesUtil;
import noppes.npcs.NoppesUtilPlayer;
import noppes.npcs.constants.EnumPlayerPacket;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import org.lwjgl.input.Keyboard;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.inventory.Container;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.containers.ContainerMail;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import net.minecraft.client.Minecraft;
import noppes.npcs.controllers.PlayerMail;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiButtonNextPage;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiYesNoCallback;
import noppes.npcs.client.gui.util.IGuiClose;
import noppes.npcs.client.gui.util.IGuiError;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.client.gui.util.GuiContainerNPCInterface;

@SideOnly(Side.CLIENT)
public class GuiMailmanWrite extends GuiContainerNPCInterface implements ITextfieldListener, IGuiError, IGuiClose, GuiYesNoCallback
{
    private static final ResourceLocation bookGuiTextures;
    private static final ResourceLocation bookWidgets;
    private static final ResourceLocation bookInventory;
    private int updateCount;
    private int bookImageWidth;
    private int bookImageHeight;
    private int bookTotalPages;
    private int currPage;
    private NBTTagList bookPages;
    private GuiButtonNextPage buttonNextPage;
    private GuiButtonNextPage buttonPreviousPage;
    private boolean canEdit;
    private boolean canSend;
    public static GuiScreen parent;
    public static PlayerMail mail;
    private Minecraft mc;
    private String username;
    private GuiNpcLabel error;
    
    public GuiMailmanWrite(final ContainerMail container, final boolean canEdit, final boolean canSend) {
        super(null, container);
        this.bookImageWidth = 192;
        this.bookImageHeight = 192;
        this.bookTotalPages = 1;
        this.mc = Minecraft.getMinecraft();
        this.username = "";
        this.title = "";
        this.canEdit = canEdit;
        this.canSend = canSend;
        if (GuiMailmanWrite.mail.message.hasKey("pages")) {
            this.bookPages = GuiMailmanWrite.mail.message.getTagList("pages", 8);
        }
        if (this.bookPages != null) {
            this.bookPages = (NBTTagList)this.bookPages.copy();
            this.bookTotalPages = this.bookPages.tagCount();
            if (this.bookTotalPages < 1) {
                this.bookTotalPages = 1;
            }
        }
        else {
            (this.bookPages = new NBTTagList()).appendTag((NBTBase)new NBTTagString(""));
            this.bookTotalPages = 1;
        }
        this.xSize = 360;
        this.ySize = 260;
        this.drawDefaultBackground = false;
        this.closeOnEsc = true;
    }
    
    @Override
    public void updateScreen() {
        super.updateScreen();
        ++this.updateCount;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.buttonList.clear();
        Keyboard.enableRepeatEvents(true);
        if (this.canEdit && !this.canSend) {
            this.addLabel(new GuiNpcLabel(0, "mailbox.sender", this.guiLeft + 170, this.guiTop + 32, 0));
        }
        else {
            this.addLabel(new GuiNpcLabel(0, "mailbox.username", this.guiLeft + 170, this.guiTop + 32, 0));
        }
        if (this.canEdit && !this.canSend) {
            this.addTextField(new GuiNpcTextField(2, (GuiScreen)this, this.fontRendererObj, this.guiLeft + 170, this.guiTop + 42, 114, 20, GuiMailmanWrite.mail.sender));
        }
        else if (this.canEdit) {
            this.addTextField(new GuiNpcTextField(0, (GuiScreen)this, this.fontRendererObj, this.guiLeft + 170, this.guiTop + 42, 114, 20, this.username));
        }
        else {
            this.addLabel(new GuiNpcLabel(10, GuiMailmanWrite.mail.sender, this.guiLeft + 170, this.guiTop + 42, 0));
        }
        this.addLabel(new GuiNpcLabel(1, "mailbox.subject", this.guiLeft + 170, this.guiTop + 72, 0));
        if (this.canEdit) {
            this.addTextField(new GuiNpcTextField(1, (GuiScreen)this, this.fontRendererObj, this.guiLeft + 170, this.guiTop + 82, 114, 20, GuiMailmanWrite.mail.subject));
        }
        else {
            this.addLabel(new GuiNpcLabel(11, GuiMailmanWrite.mail.subject, this.guiLeft + 170, this.guiTop + 82, 0));
        }
        this.addLabel(this.error = new GuiNpcLabel(2, "", this.guiLeft + 170, this.guiTop + 114, 16711680));
        if (this.canEdit && !this.canSend) {
            this.addButton(new GuiNpcButton(0, this.guiLeft + 200, this.guiTop + 171, 60, 20, "gui.done"));
        }
        else if (this.canEdit) {
            this.addButton(new GuiNpcButton(0, this.guiLeft + 200, this.guiTop + 171, 60, 20, "mailbox.send"));
        }
        if (!this.canEdit && !this.canSend) {
            this.addButton(new GuiNpcButton(4, this.guiLeft + 200, this.guiTop + 171, 60, 20, "selectWorld.deleteButton"));
        }
        if (!this.canEdit || this.canSend) {
            this.addButton(new GuiNpcButton(3, this.guiLeft + 200, this.guiTop + 194, 60, 20, "gui.cancel"));
        }
        this.buttonList.add(this.buttonNextPage = new GuiButtonNextPage(1, this.guiLeft + 120, this.guiTop + 156, true));
        this.buttonList.add(this.buttonPreviousPage = new GuiButtonNextPage(2, this.guiLeft + 38, this.guiTop + 156, false));
        this.updateButtons();
    }
    
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents(false);
    }
    
    private void updateButtons() {
        this.buttonNextPage.setVisible(this.currPage < this.bookTotalPages - 1 || this.canEdit);
        this.buttonPreviousPage.setVisible(this.currPage > 0);
    }
    
    public void confirmClicked(final boolean flag, final int i) {
        if (flag) {
            NoppesUtilPlayer.sendData(EnumPlayerPacket.MailDelete, GuiMailmanWrite.mail.time, GuiMailmanWrite.mail.sender);
            this.close();
        }
        else {
            NoppesUtil.openGUI((EntityPlayer)this.player, this);
        }
    }
    
    @Override
    protected void actionPerformed(final GuiButton par1GuiButton) {
        if (par1GuiButton.enabled) {
            final int id = par1GuiButton.id;
            if (id == 0) {
                GuiMailmanWrite.mail.message.setTag("pages", (NBTBase)this.bookPages);
                if (this.canSend) {
                    NoppesUtilPlayer.sendData(EnumPlayerPacket.MailSend, this.username, GuiMailmanWrite.mail.writeNBT());
                }
                else {
                    this.close();
                }
            }
            if (id == 3) {
                this.close();
            }
            if (id == 4) {
                final GuiYesNo guiyesno = new GuiYesNo((GuiYesNoCallback)this, "Confirm", StatCollector.translateToLocal("gui.delete"), 0);
                this.displayGuiScreen((GuiScreen)guiyesno);
            }
            else if (id == 1) {
                if (this.currPage < this.bookTotalPages - 1) {
                    ++this.currPage;
                }
                else if (this.canEdit) {
                    this.addNewPage();
                    if (this.currPage < this.bookTotalPages - 1) {
                        ++this.currPage;
                    }
                }
            }
            else if (id == 2 && this.currPage > 0) {
                --this.currPage;
            }
            this.updateButtons();
        }
    }
    
    private void addNewPage() {
        if (this.bookPages != null && this.bookPages.tagCount() < 50) {
            this.bookPages.appendTag((NBTBase)new NBTTagString(""));
            ++this.bookTotalPages;
        }
    }
    
    public void keyTyped(final char par1, final int par2) {
        if (!GuiNpcTextField.isActive() && this.canEdit) {
            this.keyTypedInBook(par1, par2);
        }
        else {
            super.keyTyped(par1, par2);
        }
    }
    
    private void keyTypedInBook(final char par1, final int par2) {
        switch (par1) {
            case '\u0016': {
                this.func_74160_b(GuiScreen.getClipboardString());
            }
            default: {
                switch (par2) {
                    case 14: {
                        final String s = this.func_74158_i();
                        if (s.length() > 0) {
                            this.func_74159_a(s.substring(0, s.length() - 1));
                        }
                        return;
                    }
                    case 28:
                    case 156: {
                        this.func_74160_b("\n");
                        return;
                    }
                    default: {
                        if (ChatAllowedCharacters.isAllowedCharacter(par1)) {
                            this.func_74160_b(Character.toString(par1));
                        }
                        return;
                    }
                }
            }
        }
    }
    
    private String func_74158_i() {
        if (this.bookPages != null && this.currPage >= 0 && this.currPage < this.bookPages.tagCount()) {
            return this.bookPages.getStringTagAt(this.currPage);
        }
        return "";
    }
    
    private void func_74159_a(final String par1Str) {
        if (this.bookPages != null && this.currPage >= 0 && this.currPage < this.bookPages.tagCount()) {
            this.bookPages.func_150304_a(this.currPage, (NBTBase)new NBTTagString(par1Str));
        }
    }
    
    private void func_74160_b(final String par1Str) {
        final String s1 = this.func_74158_i();
        final String s2 = s1 + par1Str;
        final int i = this.mc.fontRenderer.splitStringWidth(s2 + "" + EnumChatFormatting.BLACK + "_", 118);
        if (i <= 118 && s2.length() < 256) {
            this.func_74159_a(s2);
        }
    }
    
    @Override
    public void drawScreen(final int par1, final int par2, final float par3) {
        this.drawWorldBackground(0);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(GuiMailmanWrite.bookGuiTextures);
        this.drawTexturedModalRect(this.guiLeft + 130, this.guiTop + 22, 0, 0, this.bookImageWidth, this.bookImageHeight / 3);
        this.drawTexturedModalRect(this.guiLeft + 130, this.guiTop + 22 + this.bookImageHeight / 3, 0, this.bookImageHeight / 2, this.bookImageWidth, this.bookImageHeight / 2);
        this.drawTexturedModalRect(this.guiLeft, this.guiTop + 2, 0, 0, this.bookImageWidth, this.bookImageHeight);
        this.mc.getTextureManager().bindTexture(GuiMailmanWrite.bookInventory);
        this.drawTexturedModalRect(this.guiLeft + 20, this.guiTop + 173, 0, 82, 180, 55);
        this.drawTexturedModalRect(this.guiLeft + 20, this.guiTop + 228, 0, 140, 180, 28);
        final String s = I18n.format("book.pageIndicator", new Object[] { this.currPage + 1, this.bookTotalPages });
        String s2 = "";
        if (this.bookPages != null && this.currPage >= 0 && this.currPage < this.bookPages.tagCount()) {
            s2 = this.bookPages.getStringTagAt(this.currPage);
        }
        if (this.canEdit) {
            if (this.mc.fontRenderer.getBidiFlag()) {
                s2 += "_";
            }
            else if (this.updateCount / 6 % 2 == 0) {
                s2 = s2 + "" + EnumChatFormatting.BLACK + "_";
            }
            else {
                s2 = s2 + "" + EnumChatFormatting.GRAY + "_";
            }
        }
        final int l = this.mc.fontRenderer.getStringWidth(s);
        this.mc.fontRenderer.drawString(s, this.guiLeft - l + this.bookImageWidth - 44, this.guiTop + 18, 0);
        this.mc.fontRenderer.drawSplitString(s2, this.guiLeft + 36, this.guiTop + 18 + 16, 116, 0);
        this.drawGradientRect(this.guiLeft + 175, this.guiTop + 136, this.guiLeft + 269, this.guiTop + 154, -1072689136, -804253680);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(GuiMailmanWrite.bookWidgets);
        for (int i = 0; i < 4; ++i) {
            this.drawTexturedModalRect(this.guiLeft + 175 + i * 24, this.guiTop + 134, 0, 22, 24, 24);
        }
        super.drawScreen(par1, par2, par3);
    }
    
    @Override
    public void close() {
        this.mc.displayGuiScreen(GuiMailmanWrite.parent);
        GuiMailmanWrite.parent = null;
        GuiMailmanWrite.mail = new PlayerMail();
    }
    
    @Override
    public void unFocused(final GuiNpcTextField textField) {
        if (textField.id == 0) {
            this.username = textField.getText();
        }
        if (textField.id == 1) {
            GuiMailmanWrite.mail.subject = textField.getText();
        }
        if (textField.id == 2) {
            GuiMailmanWrite.mail.sender = textField.getText();
        }
    }
    
    @Override
    public void setError(final int i, final NBTTagCompound data) {
        if (i == 0) {
            this.error.label = StatCollector.translateToLocal("mailbox.errorUsername");
        }
        if (i == 1) {
            this.error.label = StatCollector.translateToLocal("mailbox.errorSubject");
        }
    }
    
    @Override
    public void setClose(final int i, final NBTTagCompound data) {
        this.player.addChatMessage((IChatComponent)new ChatComponentTranslation("mailbox.succes", new Object[] { data.getString("username") }));
    }
    
    @Override
    public void save() {
    }
    
    static {
        bookGuiTextures = new ResourceLocation("textures/gui/book.png");
        bookWidgets = new ResourceLocation("textures/gui/widgets.png");
        bookInventory = new ResourceLocation("textures/gui/container/inventory.png");
        GuiMailmanWrite.mail = new PlayerMail();
    }
}
