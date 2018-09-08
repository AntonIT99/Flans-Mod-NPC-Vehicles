// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client;

import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.init.Items;
import noppes.npcs.CustomItems;
import net.minecraft.stats.Achievement;

public class QuestAchievement extends Achievement
{
    private String description;
    private String message;
    
    public QuestAchievement(final String message, final String description) {
        super("", message, 0, 0, (CustomItems.letter == null) ? Items.paper : CustomItems.letter, (Achievement)null);
        this.description = description;
        this.message = message;
    }
    
    public IChatComponent func_150951_e() {
        return (IChatComponent)new ChatComponentText(this.message);
    }
    
    public String getDescription() {
        return this.description;
    }
}
