// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client;

import java.net.URLConnection;
import net.minecraft.client.entity.EntityPlayerSP;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IChatComponent;
import net.minecraft.event.ClickEvent;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.client.Minecraft;

public class VersionChecker extends Thread
{
    private int revision;
    
    public VersionChecker() {
        this.revision = 15;
    }
    
    @Override
    public void run() {
        final String name = "§2CustomNpcsÂ§f";
        final String link = "§9Â§nClick here";
        String text = name + " installed. For more info " + link;
        if (this.hasUpdate()) {
            text = name + '§' + "4 update available " + link;
        }
        try {
            final EntityPlayer player = (EntityPlayer)Minecraft.getMinecraft().thePlayer;
        }
        catch (NoSuchMethodError e2) {
            return;
        }
        EntityPlayer player;
        while ((player = (EntityPlayer)Minecraft.getMinecraft().thePlayer) == null) {
            try {
                Thread.sleep(2000L);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        final ChatComponentTranslation message = new ChatComponentTranslation(text, new Object[0]);
        message.getChatStyle().setChatClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "http://www.kodevelopment.nl/minecraft/customnpcs/"));
        player.addChatMessage((IChatComponent)message);
    }
    
    private boolean hasUpdate() {
        try {
            final URL url = new URL("https://dl.dropboxusercontent.com/u/3096920/update/minecraft/1.7/CustomNPCs.txt");
            final URLConnection yc = url.openConnection();
            final BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
            final String inputLine = in.readLine();
            if (inputLine == null) {
                return false;
            }
            final int newVersion = Integer.parseInt(inputLine);
            return this.revision < newVersion;
        }
        catch (Exception e) {
            return false;
        }
    }
}
