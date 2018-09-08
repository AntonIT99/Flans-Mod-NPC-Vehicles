// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client;

import net.minecraft.client.renderer.Tessellator;
import java.util.Iterator;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.IChatComponent;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.Minecraft;
import noppes.npcs.CustomNpcs;
import noppes.npcs.entity.EntityNPCInterface;
import java.util.TreeMap;
import java.util.Map;
import noppes.npcs.IChatMessages;

public class RenderChatMessages implements IChatMessages
{
    private Map<Long, TextBlockClient> messages;
    private int boxLength;
    private float scale;
    private String lastMessage;
    private long lastMessageTime;
    
    public RenderChatMessages() {
        this.messages = new TreeMap<Long, TextBlockClient>();
        this.boxLength = 46;
        this.scale = 0.5f;
        this.lastMessage = "";
        this.lastMessageTime = 0L;
    }
    
    @Override
    public void addMessage(final String message, final EntityNPCInterface npc) {
        if (!CustomNpcs.EnableChatBubbles) {
            return;
        }
        final long time = System.currentTimeMillis();
        if (message.equals(this.lastMessage) && this.lastMessageTime + 5000L > time) {
            return;
        }
        final Map<Long, TextBlockClient> messages = new TreeMap<Long, TextBlockClient>(this.messages);
        messages.put(time, new TextBlockClient(message, this.boxLength * 4, true, new Object[] { Minecraft.getMinecraft().thePlayer, npc }));
        if (messages.size() > 3) {
            messages.remove(messages.keySet().iterator().next());
        }
        this.messages = messages;
        this.lastMessage = message;
        this.lastMessageTime = time;
    }
    
    @Override
    public void renderMessages(final double par3, final double par5, final double par7, final float textscale) {
        final Map<Long, TextBlockClient> messages = this.getMessages();
        if (messages.isEmpty()) {
            return;
        }
        final FontRenderer font = Minecraft.getMinecraft().fontRenderer;
        final float var13 = 1.6f;
        final float var14 = 0.016666668f * var13;
        GL11.glPushMatrix();
        int size = 0;
        for (final TextBlockClient block : messages.values()) {
            size += block.lines.size();
        }
        final int textYSize = (int)(size * font.FONT_HEIGHT * this.scale);
        GL11.glTranslatef((float)par3 + 0.0f, (float)par5 + textYSize * textscale * var14, (float)par7);
        GL11.glScalef(textscale, textscale, textscale);
        GL11.glNormal3f(0.0f, 1.0f, 0.0f);
        GL11.glRotatef(-RenderManager.instance.playerViewY, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(RenderManager.instance.playerViewX, 1.0f, 0.0f, 0.0f);
        GL11.glScalef(-var14, -var14, var14);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        RenderHelper.disableStandardItemLighting();
        GL11.glDisable(3008);
        GL11.glDepthMask(true);
        GL11.glEnable(3042);
        GL11.glDepthFunc(515);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        GL11.glDisable(3553);
        this.drawRect(-this.boxLength - 2, -2, this.boxLength + 2, textYSize + 1, -1140850689, 0.11);
        this.drawRect(-this.boxLength - 1, -3, this.boxLength + 1, -2, -16777216, 0.1);
        this.drawRect(-this.boxLength - 1, textYSize + 2, -1, textYSize + 1, -16777216, 0.1);
        this.drawRect(3, textYSize + 2, this.boxLength + 1, textYSize + 1, -16777216, 0.1);
        this.drawRect(-this.boxLength - 3, -1, -this.boxLength - 2, textYSize, -16777216, 0.1);
        this.drawRect(this.boxLength + 3, -1, this.boxLength + 2, textYSize, -16777216, 0.1);
        this.drawRect(-this.boxLength - 2, -2, -this.boxLength - 1, -1, -16777216, 0.1);
        this.drawRect(this.boxLength + 2, -2, this.boxLength + 1, -1, -16777216, 0.1);
        this.drawRect(-this.boxLength - 2, textYSize + 1, -this.boxLength - 1, textYSize, -16777216, 0.1);
        this.drawRect(this.boxLength + 2, textYSize + 1, this.boxLength + 1, textYSize, -16777216, 0.1);
        this.drawRect(0, textYSize + 1, 3, textYSize + 4, -1140850689, 0.11);
        this.drawRect(-1, textYSize + 4, 1, textYSize + 5, -1140850689, 0.11);
        this.drawRect(-1, textYSize + 1, 0, textYSize + 4, -16777216, 0.1);
        this.drawRect(3, textYSize + 1, 4, textYSize + 3, -16777216, 0.1);
        this.drawRect(2, textYSize + 3, 3, textYSize + 4, -16777216, 0.1);
        this.drawRect(1, textYSize + 4, 2, textYSize + 5, -16777216, 0.1);
        this.drawRect(-2, textYSize + 4, -1, textYSize + 5, -16777216, 0.1);
        this.drawRect(-2, textYSize + 5, 1, textYSize + 6, -16777216, 0.1);
        GL11.glEnable(3553);
        GL11.glEnable(2929);
        GL11.glDepthMask(true);
        GL11.glScalef(this.scale, this.scale, this.scale);
        int index = 0;
        for (final TextBlockClient block2 : messages.values()) {
            for (final IChatComponent chat : block2.lines) {
                final String message = chat.getFormattedText();
                font.drawString(message, -font.getStringWidth(message) / 2, index * font.FONT_HEIGHT, 0);
                ++index;
            }
        }
        GL11.glEnable(2896);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glPopMatrix();
        RenderHelper.enableStandardItemLighting();
    }
    
    private void drawRect(int par0, int par1, int par2, int par3, final int par4, final double par5) {
        if (par0 < par2) {
            final int j1 = par0;
            par0 = par2;
            par2 = j1;
        }
        if (par1 < par3) {
            final int j1 = par1;
            par1 = par3;
            par3 = j1;
        }
        final float f = (par4 >> 24 & 0xFF) / 255.0f;
        final float f2 = (par4 >> 16 & 0xFF) / 255.0f;
        final float f3 = (par4 >> 8 & 0xFF) / 255.0f;
        final float f4 = (par4 & 0xFF) / 255.0f;
        final Tessellator tessellator = Tessellator.instance;
        GL11.glColor4f(f2, f3, f4, f);
        tessellator.startDrawingQuads();
        tessellator.addVertex((double)par0, (double)par3, par5);
        tessellator.addVertex((double)par2, (double)par3, par5);
        tessellator.addVertex((double)par2, (double)par1, par5);
        tessellator.addVertex((double)par0, (double)par1, par5);
        tessellator.draw();
    }
    
    private Map<Long, TextBlockClient> getMessages() {
        final Map<Long, TextBlockClient> messages = new TreeMap<Long, TextBlockClient>();
        final long time = System.currentTimeMillis();
        for (final long timestamp : this.messages.keySet()) {
            if (time > timestamp + 10000L) {
                continue;
            }
            final TextBlockClient message = this.messages.get(timestamp);
            messages.put(timestamp, message);
        }
        return this.messages = messages;
    }
}
