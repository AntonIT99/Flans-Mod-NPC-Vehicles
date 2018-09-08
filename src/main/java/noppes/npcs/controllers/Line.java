// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;

public class Line
{
    public String text;
    public String sound;
    public boolean hideText;
    
    public Line() {
        this.text = "";
        this.sound = "";
        this.hideText = false;
    }
    
    public Line(final String text) {
        this.text = "";
        this.sound = "";
        this.hideText = false;
        this.text = text;
    }
    
    public Line copy() {
        final Line line = new Line(this.text);
        line.sound = this.sound;
        line.hideText = this.hideText;
        return line;
    }
    
    public Line formatTarget(final EntityLivingBase entity) {
        if (entity == null) {
            return this;
        }
        final Line line = this.copy();
        if (entity instanceof EntityPlayer) {
            line.text = line.text.replace("@target", ((EntityPlayer)entity).getDisplayName());
        }
        else {
            line.text = line.text.replace("@target", entity.getCommandSenderName());
        }
        return line;
    }
}
