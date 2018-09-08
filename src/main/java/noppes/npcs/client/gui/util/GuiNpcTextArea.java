// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.util;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;
import org.lwjgl.opengl.GL11;
import org.lwjgl.input.Mouse;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.MathHelper;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.ClientProxy;

public class GuiNpcTextArea extends GuiNpcTextField
{
    public boolean inMenu;
    public boolean numbersOnly;
    private int posX;
    private int posY;
    private int width;
    private int height;
    private int cursorCounter;
    private ClientProxy.FontContainer font;
    private int cursorPosition;
    private int listHeight;
    private float scrolledY;
    private int startClick;
    private boolean clickVerticalBar;
    private boolean wrapLine;
    
    public GuiNpcTextArea(final int id, final GuiScreen guiscreen, final int i, final int j, final int k, final int l, final String s) {
        super(id, guiscreen, i, j, k, l, s);
        this.inMenu = true;
        this.numbersOnly = false;
        this.cursorPosition = 0;
        this.scrolledY = 0.0f;
        this.startClick = -1;
        this.clickVerticalBar = false;
        this.wrapLine = true;
        this.posX = i;
        this.posY = j;
        this.width = k;
        this.height = l;
        this.listHeight = l;
        this.font = ClientProxy.Font;
        this.setMaxStringLength(Integer.MAX_VALUE);
        this.setText(s);
    }
    
    public void updateCursorCounter() {
        ++this.cursorCounter;
    }
    
    @Override
    public boolean textboxKeyTyped(final char c, final int i) {
        if (this.isFocused() && this.canEdit) {
            final String originalText = this.getText();
            this.setText(originalText);
            if (c == '\r' || c == '\n') {
                this.setText(originalText.substring(0, this.cursorPosition) + c + originalText.substring(this.cursorPosition));
            }
            this.setCursorPositionZero();
            this.moveCursorBy(this.cursorPosition);
            final boolean bo = super.textboxKeyTyped(c, i);
            final String newText = this.getText();
            if (i != 211) {
                this.cursorPosition += newText.length() - originalText.length();
            }
            if (i == 203 && this.cursorPosition > 0) {
                --this.cursorPosition;
            }
            if (i == 205 && this.cursorPosition < newText.length()) {
                ++this.cursorPosition;
            }
            return bo;
        }
        return false;
    }
    
    @Override
    public void mouseClicked(final int i, final int j, final int k) {
        final boolean wasFocused = this.isFocused();
        super.mouseClicked(i, j, k);
        if (this.hoverVerticalScrollBar(i, j)) {
            this.clickVerticalBar = true;
            this.startClick = -1;
            return;
        }
        if (k != 0 || !this.canEdit) {
            return;
        }
        final int x = i - this.posX;
        final int y = (j - this.posY - 4) / this.font.height() + this.getStartLineY();
        this.cursorPosition = 0;
        final List<String> lines = this.getLines();
        int charCount = 0;
        int lineCount = 0;
        final int maxSize = this.width - (this.isScrolling() ? 14 : 4);
        for (int g = 0; g < lines.size(); ++g) {
            final String wholeLine = lines.get(g);
            String line = "";
            for (final char c : wholeLine.toCharArray()) {
                this.cursorPosition = charCount;
                if (this.font.width(line + c) > maxSize && this.wrapLine) {
                    ++lineCount;
                    line = "";
                    if (y < lineCount) {
                        break;
                    }
                }
                if (lineCount == y && x <= this.font.width(line + c)) {
                    return;
                }
                ++charCount;
                line += c;
            }
            this.cursorPosition = charCount;
            ++lineCount;
            ++charCount;
            if (y < lineCount) {
                break;
            }
        }
        if (y >= lineCount) {
            this.cursorPosition = this.getText().length();
        }
    }
    
    private List<String> getLines() {
        final List<String> list = new ArrayList<String>();
        String line = "";
        for (final char c : this.getText().toCharArray()) {
            if (c == '\r' || c == '\n') {
                list.add(line);
                line = "";
            }
            else {
                line += c;
            }
        }
        list.add(line);
        return list;
    }
    
    private int getStartLineY() {
        if (!this.isScrolling()) {
            this.scrolledY = 0.0f;
        }
        return MathHelper.ceiling_double_int((double)(this.scrolledY * this.listHeight / this.font.height()));
    }
    
    @Override
    public void drawTextBox(final int mouseX, final int mouseY) {
        drawRect(this.posX - 1, this.posY - 1, this.posX + this.width + 1, this.posY + this.height + 1, -6250336);
        drawRect(this.posX, this.posY, this.posX + this.width, this.posY + this.height, -16777216);
        final int color = 14737632;
        final boolean flag = this.isFocused() && this.cursorCounter / 6 % 2 == 0;
        final int startLine = this.getStartLineY();
        final int maxLine = this.height / this.font.height() + startLine;
        final List<String> lines = this.getLines();
        int charCount = 0;
        int lineCount = 0;
        final int maxSize = this.width - (this.isScrolling() ? 14 : 4);
        for (int i = 0; i < lines.size(); ++i) {
            final String wholeLine = lines.get(i);
            String line = "";
            for (final char c : wholeLine.toCharArray()) {
                if (this.font.width(line + c) > maxSize && this.wrapLine) {
                    if (lineCount >= startLine && lineCount < maxLine) {
                        this.drawString(null, line, this.posX + 4, this.posY + 4 + (lineCount - startLine) * this.font.height(), color);
                    }
                    line = "";
                    ++lineCount;
                }
                if (flag && charCount == this.cursorPosition && lineCount >= startLine && lineCount < maxLine && this.canEdit) {
                    final int xx = this.posX + this.font.width(line) + 4;
                    final int yy = this.posY + (lineCount - startLine) * this.font.height() + 4;
                    if (this.getText().length() == this.cursorPosition) {
                        this.font.drawString("_", xx, yy, color);
                    }
                    else {
                        this.drawCursorVertical(xx, yy, xx + 1, yy + this.font.height());
                    }
                }
                ++charCount;
                line += c;
            }
            if (lineCount >= startLine && lineCount < maxLine) {
                this.drawString(null, line, this.posX + 4, this.posY + 4 + (lineCount - startLine) * this.font.height(), color);
                if (flag && charCount == this.cursorPosition && this.canEdit) {
                    final int xx2 = this.posX + this.font.width(line) + 4;
                    final int yy2 = this.posY + (lineCount - startLine) * this.font.height() + 4;
                    if (this.getText().length() == this.cursorPosition) {
                        this.font.drawString("_", xx2, yy2, color);
                    }
                    else {
                        this.drawCursorVertical(xx2, yy2, xx2 + 1, yy2 + this.font.height());
                    }
                }
            }
            ++lineCount;
            ++charCount;
        }
        final int k2 = Mouse.getDWheel();
        if (k2 != 0 && this.isFocused()) {
            this.addScrollY((k2 < 0) ? -10 : 10);
        }
        if (Mouse.isButtonDown(0)) {
            if (this.clickVerticalBar) {
                if (this.startClick >= 0) {
                    this.addScrollY(this.startClick - (mouseY - this.posY));
                }
                if (this.hoverVerticalScrollBar(mouseX, mouseY)) {
                    this.startClick = mouseY - this.posY;
                }
                this.startClick = mouseY - this.posY;
            }
        }
        else {
            this.clickVerticalBar = false;
        }
        this.listHeight = lineCount * this.font.height();
        this.drawVerticalScrollBar();
    }
    
    public void drawString(final FontRenderer fontRendererIn, final String text, final int x, final int y, final int color) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.font.drawString(text, x, y, color);
    }
    
    private boolean isScrolling() {
        return this.listHeight > this.height - 4;
    }
    
    private void addScrollY(final int scrolled) {
        this.scrolledY -= 1.0f * scrolled / this.height;
        if (this.scrolledY < 0.0f) {
            this.scrolledY = 0.0f;
        }
        final float max = 1.0f - 1.0f * (this.height + 2) / this.listHeight;
        if (this.scrolledY > max) {
            this.scrolledY = max;
        }
    }
    
    private boolean hoverVerticalScrollBar(final int x, final int y) {
        return this.listHeight > this.height - 4 && (this.posY < y && this.posY + this.height > y && x < this.posX + this.width && x > this.posX + (this.width - 8));
    }
    
    private void drawCursorVertical(int p_146188_1_, int p_146188_2_, int p_146188_3_, int p_146188_4_) {
        if (p_146188_1_ < p_146188_3_) {
            final int i1 = p_146188_1_;
            p_146188_1_ = p_146188_3_;
            p_146188_3_ = i1;
        }
        if (p_146188_2_ < p_146188_4_) {
            final int i1 = p_146188_2_;
            p_146188_2_ = p_146188_4_;
            p_146188_4_ = i1;
        }
        if (p_146188_3_ > this.posX + this.width) {
            p_146188_3_ = this.posX + this.width;
        }
        if (p_146188_1_ > this.posX + this.width) {
            p_146188_1_ = this.posX + this.width;
        }
        final Tessellator tessellator = Tessellator.instance;
        GL11.glColor4f(0.0f, 0.0f, 255.0f, 255.0f);
        GL11.glDisable(3553);
        GL11.glEnable(3058);
        GL11.glLogicOp(5387);
        tessellator.startDrawingQuads();
        tessellator.addVertex((double)p_146188_1_, (double)p_146188_4_, 0.0);
        tessellator.addVertex((double)p_146188_3_, (double)p_146188_4_, 0.0);
        tessellator.addVertex((double)p_146188_3_, (double)p_146188_2_, 0.0);
        tessellator.addVertex((double)p_146188_1_, (double)p_146188_2_, 0.0);
        tessellator.draw();
        GL11.glDisable(3058);
        GL11.glEnable(3553);
    }
    
    private int getVerticalBarSize() {
        return (int)(1.0f * this.height / this.listHeight * (this.height - 4));
    }
    
    private void drawVerticalScrollBar() {
        if (this.listHeight <= this.height - 4) {
            return;
        }
        Minecraft.getMinecraft().renderEngine.bindTexture(GuiCustomScroll.resource);
        final int x = this.posX + this.width - 6;
        final int y = (int)(this.posY + this.scrolledY * this.height) + 2;
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        final int sbSize = this.getVerticalBarSize();
        this.drawTexturedModalRect(x, y, this.width, 9, 5, 1);
        for (int k = 0; k < sbSize; ++k) {
            this.drawTexturedModalRect(x, y + k, this.width, 10, 5, 1);
        }
        this.drawTexturedModalRect(x, y, this.width, 11, 5, 1);
    }
}
