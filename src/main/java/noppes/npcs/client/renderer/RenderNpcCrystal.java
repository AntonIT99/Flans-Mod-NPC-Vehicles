// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.renderer;

import net.minecraft.client.model.ModelBase;
import noppes.npcs.client.model.ModelNpcCrystal;

public class RenderNpcCrystal extends RenderNPCInterface
{
    ModelNpcCrystal mainmodel;
    
    public RenderNpcCrystal(final ModelNpcCrystal model) {
        super(model, 0.0f);
        this.mainmodel = model;
    }
}
