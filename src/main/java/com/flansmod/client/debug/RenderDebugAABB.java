package com.flansmod.client.debug;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ResourceLocation;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerHandler;

public class RenderDebugAABB extends Render 
{
	@Override
	public void doRender(Entity entity, double d0, double d1, double d2, float f, float f1) 
	{
		//if(!FlansMod.DEBUG)	make them visible for energy shield
		//	return;
		EntityDebugAABB ent = (EntityDebugAABB)entity;
		
		
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		//GL11.glDisable(GL11.GL_DEPTH_TEST);
		GL11.glEnable(GL11.GL_BLEND);
	//before color fuck	GL11.glColor4f(ent.red, ent.green, ent.blue, 0.2F);
		if(FlansMod.DEBUG)
		GL11.glColor4f(5, 5, 5, 0.5F); //normal hitbox
		else
			GL11.glColor4f(1, 1, 5, 0.3F); //visible force field
		
		// System.out.println("from render debug" + ent.opacity);
		
		GL11.glPushMatrix();
	    GL11.glTranslatef((float)d0, (float)d1, (float)d2);
	    GL11.glRotatef(-ent.rotationYaw, 0F, 1F, 0F);
	    GL11.glRotatef(ent.rotationPitch, 1F, 0F, 0F);
	    GL11.glRotatef(ent.rotationRoll, 0F, 0F, 1F);
	    renderAABB(AxisAlignedBB.getBoundingBox(ent.offset.x, ent.offset.y, ent.offset.z, ent.offset.x + ent.vector.x, ent.offset.y + ent.vector.y, ent.offset.z + ent.vector.z));
	    GL11.glPopMatrix();
		GL11.glDisable(GL11.GL_BLEND);
	    GL11.glEnable(GL11.GL_TEXTURE_2D);
	    GL11.glEnable(GL11.GL_DEPTH_TEST);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return null;
	}

}
