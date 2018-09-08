// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.items;

import org.lwjgl.opengl.GL11;
import net.minecraft.item.Item;

public class ItemClaw extends ItemNpcWeaponInterface
{
    public ItemClaw(final int par1, final Item.ToolMaterial material) {
        super(par1, material);
    }
    
    @Override
    public void renderSpecial() {
        GL11.glScalef(0.6f, 0.6f, 0.6f);
        GL11.glTranslatef(-0.6f, 0.2f, -0.2f);
        GL11.glRotatef(90.0f, 0.0f, 0.0f, -1.0f);
        GL11.glRotatef(6.0f, 1.0f, 0.0f, 0.0f);
    }
}
