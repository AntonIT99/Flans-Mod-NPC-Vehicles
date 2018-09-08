// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.renderer;

import org.lwjgl.opengl.GL11;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.client.model.ModelBase;

public class RenderNpcDragon extends RenderNPCInterface
{
    public RenderNpcDragon(final ModelBase model, final float f) {
        super(model, f);
    }
    
    @Override
    protected void renderPlayerScale(final EntityNPCInterface npc, final float f) {
        GL11.glTranslatef(0.0f, 0.0f, 0.120000005f * npc.display.modelSize);
        super.renderPlayerScale(npc, f);
    }
}
