// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client;

import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.Minecraft;
import noppes.npcs.NoppesStringUtils;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatStyle;
import noppes.npcs.TextBlock;

public class TextBlockClient extends TextBlock
{
    private ChatStyle style;
    public int color;
    private String name;
    private ICommandSender sender;
    
    public TextBlockClient(final ICommandSender sender, final String text, final int lineWidth, final int color, final Object... obs) {
        this(text, lineWidth, false, obs);
        this.color = color;
        this.sender = sender;
    }
    
    public TextBlockClient(final String name, final String text, final int lineWidth, final int color, final Object... obs) {
        this(text, lineWidth, false, obs);
        this.color = color;
        this.name = name;
    }
    
    public String getName() {
        if (this.sender != null) {
            return this.sender.getCommandSenderName();
        }
        return this.name;
    }
    
    public TextBlockClient(String text, final int lineWidth, final boolean mcFont, final Object... obs) {
        this.color = 14737632;
        this.style = new ChatStyle();
        text = NoppesStringUtils.formatText(text, obs);
        String line = "";
        text = text.replace("\n", " \n ");
        text = text.replace("\r", " \r ");
        final String[] words = text.split(" ");
        final FontRenderer font = Minecraft.getMinecraft().fontRenderer;
        for (final String word : words) {
            Label_0235: {
                if (!word.isEmpty()) {
                    if (word.length() == 1) {
                        final char c = word.charAt(0);
                        if (c == '\r' || c == '\n') {
                            this.addLine(line);
                            line = "";
                            break Label_0235;
                        }
                    }
                    String newLine;
                    if (line.isEmpty()) {
                        newLine = word;
                    }
                    else {
                        newLine = line + " " + word;
                    }
                    if ((mcFont ? font.getStringWidth(newLine) : ClientProxy.Font.width(newLine)) > lineWidth) {
                        this.addLine(line);
                        line = word.trim();
                    }
                    else {
                        line = newLine;
                    }
                }
            }
        }
        if (!line.isEmpty()) {
            this.addLine(line);
        }
    }
    
    private void addLine(final String text) {
        final ChatComponentText line = new ChatComponentText(text);
        line.setChatStyle(this.style);
        this.lines.add((IChatComponent)line);
    }
}
