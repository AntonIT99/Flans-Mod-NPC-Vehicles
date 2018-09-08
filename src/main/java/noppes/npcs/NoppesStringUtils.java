// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs;

import net.minecraft.util.StatCollector;
import java.io.IOException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Arrays;

public class NoppesStringUtils
{
    static final int[] illegalChars;
    
    public static String cleanFileName(final String badFileName) {
        final StringBuilder cleanName = new StringBuilder();
        for (int i = 0; i < badFileName.length(); ++i) {
            final int c = badFileName.charAt(i);
            if (Arrays.binarySearch(NoppesStringUtils.illegalChars, c) < 0) {
                cleanName.append((char)c);
            }
        }
        return cleanName.toString();
    }
    
    public static String formatText(String text, final Object... obs) {
        for (final Object ob : obs) {
            if (ob instanceof EntityPlayer) {
                final String username = ((EntityPlayer)ob).getDisplayName();
                text = text.replace("{player}", username);
                text = text.replace("@p", username);
            }
            else if (ob instanceof EntityNPCInterface) {
                text = text.replace("@npc", ((EntityNPCInterface)ob).getCommandSenderName());
            }
        }
        text = text.replace("&", Character.toChars(167)[0] + "");
        return text;
    }
    
    public static void setClipboardContents(final String aString) {
        final StringSelection stringSelection = new StringSelection(aString);
        final Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, new ClipboardOwner() {
            @Override
            public void lostOwnership(final Clipboard arg0, final Transferable arg1) {
            }
        });
    }
    
    public static String getClipboardContents() {
        String result = "";
        final Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        final Transferable contents = clipboard.getContents(null);
        final boolean hasTransferableText = contents != null && contents.isDataFlavorSupported(DataFlavor.stringFlavor);
        if (hasTransferableText) {
            try {
                result = (String)contents.getTransferData(DataFlavor.stringFlavor);
            }
            catch (UnsupportedFlavorException ex) {
                System.err.println(ex);
                ex.printStackTrace();
            }
            catch (IOException ex2) {
                System.err.println(ex2);
                ex2.printStackTrace();
            }
        }
        return result;
    }
    
    public static String translate(final Object... arr) {
        String s = "";
        for (final Object str : arr) {
            s += StatCollector.translateToLocal(str.toString());
        }
        return s;
    }
    
    static {
        Arrays.sort(illegalChars = new int[] { 34, 60, 62, 124, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 58, 42, 63, 92, 47 });
    }
}
