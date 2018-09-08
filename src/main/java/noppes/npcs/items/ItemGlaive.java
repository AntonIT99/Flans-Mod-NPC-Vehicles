// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.items;

import org.lwjgl.opengl.GL11;
import net.minecraft.item.Item;

public class ItemGlaive extends ItemNpcWeaponInterface
{
    public ItemGlaive(final int par1, final Item.ToolMaterial tool) {
        super(par1, tool);
    }
    
    @Override
    public void renderSpecial() {
        GL11.glTranslatef(0.03f, -0.4f, 0.08f);
    }
}
