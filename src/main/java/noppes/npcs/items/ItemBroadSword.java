// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.items;

import org.lwjgl.opengl.GL11;
import net.minecraft.item.Item;

public class ItemBroadSword extends ItemNpcWeaponInterface
{
    public ItemBroadSword(final Item.ToolMaterial tool) {
        super(tool);
    }
    
    @Override
    public void renderSpecial() {
        GL11.glScalef(1.0f, 1.2f, 1.0f);
        GL11.glTranslatef(-0.12f, 0.14f, -0.16f);
        GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
    }
}
