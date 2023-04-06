package com.hfr.render.tileentity;

import org.lwjgl.opengl.GL11;

import com.hfr.main.ResourceManager;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public class RenderCoalGen extends TileEntitySpecialRenderer {

	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float f) {
		
        GL11.glPushMatrix();
        GL11.glTranslated(x + 0.5D, y, z + 0.5D);
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glEnable(GL11.GL_CULL_FACE);
        GL11.glRotatef(90, 0F, 1F, 0F);

		switch(tile.getBlockMetadata())
		{
		case 2: GL11.glRotatef(90, 0F, 1F, 0F); break;
		case 4: GL11.glRotatef(180, 0F, 1F, 0F); break;
		case 3: GL11.glRotatef(270, 0F, 1F, 0F); break;
		case 5: GL11.glRotatef(0, 0F, 1F, 0F); break;
		}

        bindTexture(ResourceManager.coalgen_tex);
        
        GL11.glShadeModel(GL11.GL_SMOOTH);
        ResourceManager.coal_gen.renderAll();
        GL11.glShadeModel(GL11.GL_FLAT);

        GL11.glPopMatrix();

	}
}
