package com.wolffsmod.flan;

import com.flansmod.client.model.RenderBullet;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class FlanCompatibilityClientProxy extends FlanCompatibilityCommonProxy
{
    @Override
    public void registerRenderers()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityNPCFlanBullet.class, new RenderBullet());
    }
}
