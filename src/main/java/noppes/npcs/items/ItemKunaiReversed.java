// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.items;

import noppes.npcs.CustomItems;
import net.minecraft.client.renderer.texture.IIconRegister;
import org.lwjgl.opengl.GL11;
import net.minecraft.item.Item;

public class ItemKunaiReversed extends ItemKunai
{
    public ItemKunaiReversed(final int par1, final Item.ToolMaterial tool) {
        super(par1, tool);
    }
    
    @Override
    public void renderSpecial() {
        GL11.glScalef(0.4f, 0.4f, 0.4f);
        GL11.glRotatef(180.0f, 1.0f, 0.0f, 0.0f);
        GL11.glTranslatef(-0.4f, -0.9f, 0.2f);
    }
    
    public void registerIcons(final IIconRegister par1IconRegister) {
        this.itemIcon = CustomItems.kunai.getIconFromDamage(0);
    }
}
