// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelBigSign extends ModelBase
{
    public ModelRenderer signBoard;
    
    public ModelBigSign() {
        (this.signBoard = new ModelRenderer((ModelBase)this, 0, 0)).addBox(-8.0f, -8.0f, -1.0f, 16, 16, 2, 0.0f);
    }
    
    public void renderSign() {
        this.signBoard.render(0.0625f);
    }
}
