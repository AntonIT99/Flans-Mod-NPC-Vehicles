// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import org.lwjgl.opengl.GL11;
import net.minecraft.item.Item;

public class ItemDaggerReversed extends ItemDagger
{
    private ItemDagger dagger;
    
    public ItemDaggerReversed(final int par1, final ItemDagger dagger, final Item.ToolMaterial tool) {
        super(par1, tool);
        this.dagger = dagger;
    }
    
    @Override
    public void renderSpecial() {
        GL11.glScalef(0.6f, 0.6f, 0.6f);
        GL11.glTranslatef(0.16f, 0.6f, -0.16f);
        GL11.glRotatef(180.0f, 1.0f, 0.0f, 0.0f);
    }
    
    public void registerIcons(final IIconRegister par1IconRegister) {
        this.itemIcon = this.dagger.getIconFromDamage(0);
    }
}
