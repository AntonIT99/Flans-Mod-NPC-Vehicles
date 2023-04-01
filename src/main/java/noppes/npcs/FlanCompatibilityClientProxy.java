package noppes.npcs;

import com.flansmod.client.model.RenderBullet;
import cpw.mods.fml.client.registry.RenderingRegistry;
import noppes.npcs.util.EntityNPCFlanBullet;

public class FlanCompatibilityClientProxy extends FlanCompatibilityCommonProxy
{
    @Override
    public void registerRenderers()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityNPCFlanBullet.class, new RenderBullet());
    }
}
