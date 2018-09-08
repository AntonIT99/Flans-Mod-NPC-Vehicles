// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.swing;

import java.awt.event.WindowEvent;
import java.awt.Component;
import javax.swing.JScrollPane;
import org.lwjgl.opengl.Display;
import javax.swing.JTextArea;
import noppes.npcs.client.gui.util.IJTextAreaListener;
import java.awt.event.WindowListener;
import javax.swing.JDialog;

public class GuiJTextArea extends JDialog implements WindowListener
{
    public IJTextAreaListener listener;
    private JTextArea area;
    
    public GuiJTextArea(final String text) {
        this.setDefaultCloseOperation(2);
        this.setSize(Display.getWidth() - 40, Display.getHeight() - 40);
        this.setLocation(Display.getX() + 20, Display.getY() + 20);
        final JScrollPane scroll = new JScrollPane(this.area = new JTextArea(text));
        scroll.setVerticalScrollBarPolicy(22);
        this.add(scroll);
        this.addWindowListener(this);
        this.setVisible(true);
    }
    
    public GuiJTextArea setListener(final IJTextAreaListener listener) {
        this.listener = listener;
        return this;
    }
    
    @Override
    public void windowOpened(final WindowEvent e) {
    }
    
    @Override
    public void windowClosing(final WindowEvent e) {
    }
    
    @Override
    public void windowClosed(final WindowEvent e) {
        if (this.listener != null) {
            this.listener.saveText(this.area.getText());
        }
    }
    
    @Override
    public void windowIconified(final WindowEvent e) {
    }
    
    @Override
    public void windowDeiconified(final WindowEvent e) {
    }
    
    @Override
    public void windowActivated(final WindowEvent e) {
    }
    
    @Override
    public void windowDeactivated(final WindowEvent e) {
    }
}
