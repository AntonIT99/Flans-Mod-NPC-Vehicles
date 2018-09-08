// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.player;

import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.LogManager;
import org.lwjgl.opengl.GL11;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ChatAllowedCharacters;
import noppes.npcs.NoppesUtilPlayer;
import noppes.npcs.constants.EnumPlayerPacket;
import net.minecraft.client.resources.I18n;
import org.lwjgl.input.Keyboard;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.init.Items;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.Logger;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.Gui;

@SideOnly(Side.CLIENT)
public class GuiBook extends GuiScreen
{
    private static final Logger logger;
    private static final ResourceLocation bookGuiTextures;
    private final EntityPlayer editingPlayer;
    private final ItemStack bookObj;
    private final boolean bookIsUnsigned;
    private boolean field_146481_r;
    private boolean field_146480_s;
    private int updateCount;
    private int bookImageWidth;
    private int bookImageHeight;
    private int bookTotalPages;
    private int currPage;
    private NBTTagList bookPages;
    private String bookTitle;
    private NextPageButton buttonNextPage;
    private NextPageButton buttonPreviousPage;
    private GuiButton buttonDone;
    private GuiButton buttonSign;
    private GuiButton buttonFinalize;
    private GuiButton buttonCancel;
    private int x;
    private int y;
    private int z;
    
    public GuiBook(final EntityPlayer par1EntityPlayer, final ItemStack item, final int x, final int y, final int z) {
        this.bookImageWidth = 192;
        this.bookImageHeight = 192;
        this.bookTotalPages = 1;
        this.bookTitle = "";
        this.x = x;
        this.y = y;
        this.z = z;
        this.editingPlayer = par1EntityPlayer;
        this.bookObj = item;
        this.bookIsUnsigned = (item.getItem() == Items.writable_book);
        if (item.hasTagCompound()) {
            final NBTTagCompound nbttagcompound = item.getTagCompound();
            this.bookPages = nbttagcompound.getTagList("pages", 8);
            if (this.bookPages != null) {
                this.bookPages = (NBTTagList)this.bookPages.copy();
                this.bookTotalPages = this.bookPages.tagCount();
                if (this.bookTotalPages < 1) {
                    this.bookTotalPages = 1;
                }
            }
        }
        if (this.bookPages == null && this.bookIsUnsigned) {
            (this.bookPages = new NBTTagList()).appendTag((NBTBase)new NBTTagString(""));
            this.bookTotalPages = 1;
        }
    }
    
    public void updateScreen() {
        super.updateScreen();
        ++this.updateCount;
    }
    
    public boolean doesGuiPauseGame() {
        return false;
    }
    
    public void initGui() {
        this.buttonList.clear();
        Keyboard.enableRepeatEvents(true);
        if (this.bookIsUnsigned) {
            this.buttonList.add(this.buttonSign = new GuiButton(3, this.width / 2 - 100, 4 + this.bookImageHeight, 98, 20, I18n.format("book.signButton", new Object[0])));
            this.buttonList.add(this.buttonDone = new GuiButton(0, this.width / 2 + 2, 4 + this.bookImageHeight, 98, 20, I18n.format("gui.done", new Object[0])));
            this.buttonList.add(this.buttonFinalize = new GuiButton(5, this.width / 2 - 100, 4 + this.bookImageHeight, 98, 20, I18n.format("book.finalizeButton", new Object[0])));
            this.buttonList.add(this.buttonCancel = new GuiButton(4, this.width / 2 + 2, 4 + this.bookImageHeight, 98, 20, I18n.format("gui.cancel", new Object[0])));
        }
        else {
            this.buttonList.add(this.buttonDone = new GuiButton(0, this.width / 2 - 100, 4 + this.bookImageHeight, 200, 20, I18n.format("gui.done", new Object[0])));
        }
        final int i = (this.width - this.bookImageWidth) / 2;
        final byte b0 = 2;
        this.buttonList.add(this.buttonNextPage = new NextPageButton(1, i + 120, b0 + 154, true));
        this.buttonList.add(this.buttonPreviousPage = new NextPageButton(2, i + 38, b0 + 154, false));
        this.updateButtons();
    }
    
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents(false);
    }
    
    private void updateButtons() {
        this.buttonNextPage.visible = (!this.field_146480_s && (this.currPage < this.bookTotalPages - 1 || this.bookIsUnsigned));
        this.buttonPreviousPage.visible = (!this.field_146480_s && this.currPage > 0);
        this.buttonDone.visible = (!this.bookIsUnsigned || !this.field_146480_s);
        if (this.bookIsUnsigned) {
            this.buttonSign.visible = !this.field_146480_s;
            this.buttonCancel.visible = this.field_146480_s;
            this.buttonFinalize.visible = this.field_146480_s;
            this.buttonFinalize.enabled = (this.bookTitle.trim().length() > 0);
        }
    }
    
    private void sendBookToServer(final boolean sign) {
        if (this.bookIsUnsigned && this.field_146481_r && this.bookPages != null) {
            while (this.bookPages.tagCount() > 1) {
                final String s = this.bookPages.getStringTagAt(this.bookPages.tagCount() - 1);
                if (s.length() != 0) {
                    break;
                }
                this.bookPages.removeTag(this.bookPages.tagCount() - 1);
            }
            if (this.bookObj.hasTagCompound()) {
                final NBTTagCompound nbttagcompound = this.bookObj.getTagCompound();
                nbttagcompound.setTag("pages", (NBTBase)this.bookPages);
            }
            else {
                this.bookObj.setTagInfo("pages", (NBTBase)this.bookPages);
            }
            if (sign) {
                this.bookObj.setTagInfo("author", (NBTBase)new NBTTagString(this.editingPlayer.getCommandSenderName()));
                this.bookObj.setTagInfo("title", (NBTBase)new NBTTagString(this.bookTitle.trim()));
                this.bookObj.func_150996_a(Items.written_book);
            }
            NoppesUtilPlayer.sendData(EnumPlayerPacket.SaveBook, this.x, this.y, this.z, sign, this.bookObj.writeToNBT(new NBTTagCompound()));
        }
    }
    
    protected void actionPerformed(final GuiButton p_146284_1_) {
        if (p_146284_1_.enabled) {
            if (p_146284_1_.id == 0) {
                this.mc.displayGuiScreen((GuiScreen)null);
                this.sendBookToServer(false);
            }
            else if (p_146284_1_.id == 3 && this.bookIsUnsigned) {
                this.field_146480_s = true;
            }
            else if (p_146284_1_.id == 1) {
                if (this.currPage < this.bookTotalPages - 1) {
                    ++this.currPage;
                }
                else if (this.bookIsUnsigned) {
                    this.addNewPage();
                    if (this.currPage < this.bookTotalPages - 1) {
                        ++this.currPage;
                    }
                }
            }
            else if (p_146284_1_.id == 2) {
                if (this.currPage > 0) {
                    --this.currPage;
                }
            }
            else if (p_146284_1_.id == 5 && this.field_146480_s) {
                this.sendBookToServer(true);
                this.mc.displayGuiScreen((GuiScreen)null);
            }
            else if (p_146284_1_.id == 4 && this.field_146480_s) {
                this.field_146480_s = false;
            }
            this.updateButtons();
        }
    }
    
    private void addNewPage() {
        if (this.bookPages != null && this.bookPages.tagCount() < 50) {
            this.bookPages.appendTag((NBTBase)new NBTTagString(""));
            ++this.bookTotalPages;
            this.field_146481_r = true;
        }
    }
    
    protected void keyTyped(final char par1, final int par2) {
        super.keyTyped(par1, par2);
        if (this.bookIsUnsigned) {
            if (this.field_146480_s) {
                this.func_146460_c(par1, par2);
            }
            else {
                this.keyTypedInBook(par1, par2);
            }
        }
    }
    
    private void keyTypedInBook(final char p_146463_1_, final int p_146463_2_) {
        switch (p_146463_1_) {
            case '\u0016': {
                this.func_146459_b(GuiScreen.getClipboardString());
            }
            default: {
                switch (p_146463_2_) {
                    case 14: {
                        final String s = this.func_146456_p();
                        if (s.length() > 0) {
                            this.func_146457_a(s.substring(0, s.length() - 1));
                        }
                        return;
                    }
                    case 28:
                    case 156: {
                        this.func_146459_b("\n");
                        return;
                    }
                    default: {
                        if (ChatAllowedCharacters.isAllowedCharacter(p_146463_1_)) {
                            this.func_146459_b(Character.toString(p_146463_1_));
                        }
                        return;
                    }
                }
            }
        }
    }
    
    private void func_146460_c(final char p_146460_1_, final int p_146460_2_) {
        switch (p_146460_2_) {
            case 14: {
                if (!this.bookTitle.isEmpty()) {
                    this.bookTitle = this.bookTitle.substring(0, this.bookTitle.length() - 1);
                    this.updateButtons();
                }
            }
            case 28:
            case 156: {
                if (!this.bookTitle.isEmpty()) {
                    this.sendBookToServer(true);
                    this.mc.displayGuiScreen((GuiScreen)null);
                }
            }
            default: {
                if (this.bookTitle.length() < 16 && ChatAllowedCharacters.isAllowedCharacter(p_146460_1_)) {
                    this.bookTitle += Character.toString(p_146460_1_);
                    this.updateButtons();
                    this.field_146481_r = true;
                }
            }
        }
    }
    
    private String func_146456_p() {
        return (this.bookPages != null && this.currPage >= 0 && this.currPage < this.bookPages.tagCount()) ? this.bookPages.getStringTagAt(this.currPage) : "";
    }
    
    private void func_146457_a(final String p_146457_1_) {
        if (this.bookPages != null && this.currPage >= 0 && this.currPage < this.bookPages.tagCount()) {
            this.bookPages.func_150304_a(this.currPage, (NBTBase)new NBTTagString(p_146457_1_));
            this.field_146481_r = true;
        }
    }
    
    private void func_146459_b(final String p_146459_1_) {
        final String s1 = this.func_146456_p();
        final String s2 = s1 + p_146459_1_;
        final int i = this.fontRendererObj.splitStringWidth(s2 + "" + EnumChatFormatting.BLACK + "_", 118);
        if (i <= 118 && s2.length() < 256) {
            this.func_146457_a(s2);
        }
    }
    
    public void drawScreen(final int par1, final int par2, final float par3) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(GuiBook.bookGuiTextures);
        final int k = (this.width - this.bookImageWidth) / 2;
        final byte b0 = 2;
        this.drawTexturedModalRect(k, (int)b0, 0, 0, this.bookImageWidth, this.bookImageHeight);
        if (this.field_146480_s) {
            String s = this.bookTitle;
            if (this.bookIsUnsigned) {
                if (this.updateCount / 6 % 2 == 0) {
                    s = s + "" + EnumChatFormatting.BLACK + "_";
                }
                else {
                    s = s + "" + EnumChatFormatting.GRAY + "_";
                }
            }
            final String s2 = I18n.format("book.editTitle", new Object[0]);
            final int l = this.fontRendererObj.getStringWidth(s2);
            this.fontRendererObj.drawString(s2, k + 36 + (116 - l) / 2, b0 + 16 + 16, 0);
            final int i1 = this.fontRendererObj.getStringWidth(s);
            this.fontRendererObj.drawString(s, k + 36 + (116 - i1) / 2, b0 + 48, 0);
            final String s3 = I18n.format("book.byAuthor", new Object[] { this.editingPlayer.getCommandSenderName() });
            final int j1 = this.fontRendererObj.getStringWidth(s3);
            this.fontRendererObj.drawString(EnumChatFormatting.DARK_GRAY + s3, k + 36 + (116 - j1) / 2, b0 + 48 + 10, 0);
            final String s4 = I18n.format("book.finalizeWarning", new Object[0]);
            this.fontRendererObj.drawSplitString(s4, k + 36, b0 + 80, 116, 0);
        }
        else {
            final String s = I18n.format("book.pageIndicator", new Object[] { this.currPage + 1, this.bookTotalPages });
            String s2 = "";
            if (this.bookPages != null && this.currPage >= 0 && this.currPage < this.bookPages.tagCount()) {
                s2 = this.bookPages.getStringTagAt(this.currPage);
            }
            if (this.bookIsUnsigned) {
                if (this.fontRendererObj.getBidiFlag()) {
                    s2 += "_";
                }
                else if (this.updateCount / 6 % 2 == 0) {
                    s2 = s2 + "" + EnumChatFormatting.BLACK + "_";
                }
                else {
                    s2 = s2 + "" + EnumChatFormatting.GRAY + "_";
                }
            }
            final int l = this.fontRendererObj.getStringWidth(s);
            this.fontRendererObj.drawString(s, k - l + this.bookImageWidth - 44, b0 + 16, 0);
            this.fontRendererObj.drawSplitString(s2, k + 36, b0 + 16 + 16, 116, 0);
        }
        super.drawScreen(par1, par2, par3);
    }
    
    static {
        logger = LogManager.getLogger();
        bookGuiTextures = new ResourceLocation("textures/gui/book.png");
    }
    
    @SideOnly(Side.CLIENT)
    static class NextPageButton extends GuiButton
    {
        private final boolean field_146151_o;
        private static final String __OBFID = "CL_00000745";
        
        public NextPageButton(final int par1, final int par2, final int par3, final boolean par4) {
            super(par1, par2, par3, 23, 13, "");
            this.field_146151_o = par4;
        }
        
        public void drawButton(final Minecraft p_146112_1_, final int p_146112_2_, final int p_146112_3_) {
            if (this.visible) {
                final boolean flag = p_146112_2_ >= this.xPosition && p_146112_3_ >= this.yPosition && p_146112_2_ < this.xPosition + this.width && p_146112_3_ < this.yPosition + this.height;
                GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                p_146112_1_.getTextureManager().bindTexture(GuiBook.bookGuiTextures);
                int k = 0;
                int l = 192;
                if (flag) {
                    k += 23;
                }
                if (!this.field_146151_o) {
                    l += 13;
                }
                this.drawTexturedModalRect(this.xPosition, this.yPosition, k, l, 23, 13);
            }
        }
    }
}
