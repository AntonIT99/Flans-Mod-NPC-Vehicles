package com.flansmod.client;

import org.lwjgl.opengl.GL11;

import com.flansmod.common.FlansMod;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityShellCasing extends EntityFX
{
	public static ResourceLocation icon = new ResourceLocation("flansmod", "particle/Boom1.png");
	public EntityShellCasing(World w, double px, double py, double pz, double mx, double my, double mz)
	{
		super(w, px, py, pz, mx, my, mz);
		this.particleMaxAge = 100;
		this.particleGravity = 5;
		this.motionX = mx;
		this.motionY = my;
		this.motionZ = mz;
		icon = new ResourceLocation("flansmod", "particle/Casing1.png");
	}
	
	public int getFXLayer()
	{
			 return 3;
	}

	public float getEntityBrightness(float f)
	{
			return 1.0F;
	}
	
    public void renderParticle(Tessellator par1Tessellator, float par2, float par3, float par4, float par5, float par6, float par7)
    {
        //func_98187_b() = bindTexture();
    	GL11.glPushMatrix();
   	 	par1Tessellator.startDrawingQuads();
		GL11.glAlphaFunc(GL11.GL_GREATER, 0.001F);
		GL11.glEnable(GL11.GL_BLEND);
		int srcBlend = GL11.glGetInteger(GL11.GL_BLEND_SRC);
		int dstBlend = GL11.glGetInteger(GL11.GL_BLEND_DST);
		GL11.glBlendFunc(1, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glDepthMask(false); 
    	FMLClientHandler.instance().getClient().renderEngine.bindTexture(icon);

        float scale = 0.1F;
        float xPos = (float) (this.prevPosX + (this.posX - this.prevPosX) * (double) par2 - interpPosX);
        float yPos = (float) (this.prevPosY + (this.posY - this.prevPosY) * (double) par2 - interpPosY);
        float zPos = (float) (this.prevPosZ + (this.posZ - this.prevPosZ) * (double) par2 - interpPosZ);
        float colorIntensity = 1.0F;
        par1Tessellator.setColorOpaque_F(this.particleRed * colorIntensity, this.particleGreen * colorIntensity, this.particleBlue * colorIntensity);//, 1.0F);

        par1Tessellator.addVertexWithUV((double) (xPos - par3 * scale - par6 * scale), (double) (yPos - par4 * scale), (double) (zPos - par5 * scale - par7 * scale), 0D, 1D);
        par1Tessellator.addVertexWithUV((double) (xPos - par3 * scale + par6 * scale), (double) (yPos + par4 * scale), (double) (zPos - par5 * scale + par7 * scale), 1D, 1D);
        par1Tessellator.addVertexWithUV((double) (xPos + par3 * scale + par6 * scale), (double) (yPos + par4 * scale), (double) (zPos + par5 * scale + par7 * scale), 1D, 0D);
        par1Tessellator.addVertexWithUV((double) (xPos + par3 * scale - par6 * scale), (double) (yPos - par4 * scale), (double) (zPos + par5 * scale - par7 * scale), 0D, 0D);
        par1Tessellator.draw();
		GL11.glBlendFunc(srcBlend, dstBlend);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glDepthMask(true); 
		GL11.glPopMatrix();
    }

	public void onUpdate()
	{
		this.prevPosX = this.posX;
		this.prevPosY = this.posY;
		this.prevPosZ = this.posZ;

		if(this.particleAge++ >= this.particleMaxAge)
		{
			this.setDead();
		}

		if(this.onGround)
		{
			this.setDead();
		}
		
		if(this.particleAge == 1)icon = new ResourceLocation("flansmod", "particle/Casing2.png");
		if(this.particleAge == 2)icon = new ResourceLocation("flansmod", "particle/Casing3.png");
		if(this.particleAge == 3)icon = new ResourceLocation("flansmod", "particle/Casing4.png");
		if(this.particleAge == 4)icon = new ResourceLocation("flansmod", "particle/Casing5.png");
		if(this.particleAge == 5)icon = new ResourceLocation("flansmod", "particle/Casing6.png");
		if(this.particleAge == 6)icon = new ResourceLocation("flansmod", "particle/Casing1.png");
		if(this.particleAge == 7)icon = new ResourceLocation("flansmod", "particle/Casing2.png");
		if(this.particleAge == 8)icon = new ResourceLocation("flansmod", "particle/Casing3.png");
		if(this.particleAge == 9)icon = new ResourceLocation("flansmod", "particle/Casing4.png");
		if(this.particleAge == 10)icon = new ResourceLocation("flansmod", "particle/Casing5.png");
		if(this.particleAge == 11)icon = new ResourceLocation("flansmod", "particle/Casing6.png");
		if(this.particleAge == 12)icon = new ResourceLocation("flansmod", "particle/Casing1.png");
		if(this.particleAge == 13)icon = new ResourceLocation("flansmod", "particle/Casing2.png");
		if(this.particleAge == 14)icon = new ResourceLocation("flansmod", "particle/Casing3.png");
		if(this.particleAge == 15)icon = new ResourceLocation("flansmod", "particle/Casing4.png");
		if(this.particleAge == 16)icon = new ResourceLocation("flansmod", "particle/Casing5.png");
		if(this.particleAge == 17)icon = new ResourceLocation("flansmod", "particle/Casing6.png");
		if(this.particleAge == 18)icon = new ResourceLocation("flansmod", "particle/Casing1.png");
		if(this.particleAge == 19)icon = new ResourceLocation("flansmod", "particle/Casing2.png");
		if(this.particleAge == 20)icon = new ResourceLocation("flansmod", "particle/Casing3.png");
		if(this.particleAge == 21)icon = new ResourceLocation("flansmod", "particle/Casing4.png");
		if(this.particleAge == 22)icon = new ResourceLocation("flansmod", "particle/Casing5.png");
		if(this.particleAge == 23)icon = new ResourceLocation("flansmod", "particle/Casing6.png");
		if(this.particleAge == 24)icon = new ResourceLocation("flansmod", "particle/Casing1.png");
		if(this.particleAge == 25)icon = new ResourceLocation("flansmod", "particle/Casing2.png");
		if(this.particleAge == 20)icon = new ResourceLocation("flansmod", "particle/Casing3.png");
		if(this.particleAge == 26)icon = new ResourceLocation("flansmod", "particle/Casing4.png");
		if(this.particleAge == 27)icon = new ResourceLocation("flansmod", "particle/Casing5.png");
		if(this.particleAge == 28)icon = new ResourceLocation("flansmod", "particle/Casing6.png");
		if(this.particleAge == 29)icon = new ResourceLocation("flansmod", "particle/Casing1.png");
		if(this.particleAge == 30)icon = new ResourceLocation("flansmod", "particle/Casing2.png");
		if(this.particleAge == 31)icon = new ResourceLocation("flansmod", "particle/Casing3.png");
		if(this.particleAge == 32)icon = new ResourceLocation("flansmod", "particle/Casing4.png");
		if(this.particleAge == 33)icon = new ResourceLocation("flansmod", "particle/Casing5.png");
		if(this.particleAge == 34)icon = new ResourceLocation("flansmod", "particle/Casing6.png");
		if(this.particleAge == 35)icon = new ResourceLocation("flansmod", "particle/Casing1.png");
		if(this.particleAge == 36)icon = new ResourceLocation("flansmod", "particle/Casing2.png");
		if(this.particleAge == 37)icon = new ResourceLocation("flansmod", "particle/Casing3.png");
		if(this.particleAge == 38)icon = new ResourceLocation("flansmod", "particle/Casing4.png");
		if(this.particleAge == 39)icon = new ResourceLocation("flansmod", "particle/Casing5.png");
		if(this.particleAge == 40)icon = new ResourceLocation("flansmod", "particle/Casing6.png");
		if(this.particleAge == 41)icon = new ResourceLocation("flansmod", "particle/Casing1.png");
		if(this.particleAge == 42)icon = new ResourceLocation("flansmod", "particle/Casing2.png");
		if(this.particleAge == 43)icon = new ResourceLocation("flansmod", "particle/Casing3.png");
		if(this.particleAge == 44)icon = new ResourceLocation("flansmod", "particle/Casing4.png");
		if(this.particleAge == 45)icon = new ResourceLocation("flansmod", "particle/Casing5.png");
		if(this.particleAge == 46)icon = new ResourceLocation("flansmod", "particle/Casing6.png");
		if(this.particleAge == 47)icon = new ResourceLocation("flansmod", "particle/Casing1.png");
		if(this.particleAge == 48)icon = new ResourceLocation("flansmod", "particle/Casing2.png");
		if(this.particleAge == 49)icon = new ResourceLocation("flansmod", "particle/Casing3.png");
		if(this.particleAge == 50)icon = new ResourceLocation("flansmod", "particle/Casing4.png");
		if(this.particleAge == 51)icon = new ResourceLocation("flansmod", "particle/Casing5.png");
		if(this.particleAge == 52)icon = new ResourceLocation("flansmod", "particle/Casing6.png");
		if(this.particleAge == 53)icon = new ResourceLocation("flansmod", "particle/Casing1.png");
		if(this.particleAge == 54)icon = new ResourceLocation("flansmod", "particle/Casing2.png");
		if(this.particleAge == 55)icon = new ResourceLocation("flansmod", "particle/Casing3.png");
		if(this.particleAge == 56)icon = new ResourceLocation("flansmod", "particle/Casing4.png");
		if(this.particleAge == 57)icon = new ResourceLocation("flansmod", "particle/Casing5.png");
		if(this.particleAge == 58)icon = new ResourceLocation("flansmod", "particle/Casing6.png");
		if(this.particleAge == 59)icon = new ResourceLocation("flansmod", "particle/Casing1.png");
		if(this.particleAge == 60)icon = new ResourceLocation("flansmod", "particle/Casing2.png");
		if(this.particleAge == 61)icon = new ResourceLocation("flansmod", "particle/Casing3.png");
		if(this.particleAge == 62)icon = new ResourceLocation("flansmod", "particle/Casing5.png");
		if(this.particleAge == 63)icon = new ResourceLocation("flansmod", "particle/Casing6.png");
		if(this.particleAge == 64)icon = new ResourceLocation("flansmod", "particle/Casing1.png");
		if(this.particleAge == 65)icon = new ResourceLocation("flansmod", "particle/Casing2.png");
		if(this.particleAge == 66)icon = new ResourceLocation("flansmod", "particle/Casing4.png");
		if(this.particleAge == 67)icon = new ResourceLocation("flansmod", "particle/Casing5.png");
		if(this.particleAge == 68)icon = new ResourceLocation("flansmod", "particle/Casing6.png");
		if(this.particleAge == 69)icon = new ResourceLocation("flansmod", "particle/Casing1.png");
		if(this.particleAge == 70)icon = new ResourceLocation("flansmod", "particle/Casing2.png");
		if(this.particleAge == 71)icon = new ResourceLocation("flansmod", "particle/Casing3.png");
		if(this.particleAge == 72)icon = new ResourceLocation("flansmod", "particle/Casing4.png");
		if(this.particleAge == 73)icon = new ResourceLocation("flansmod", "particle/Casing5.png");
		if(this.particleAge == 74)icon = new ResourceLocation("flansmod", "particle/Casing6.png");
		if(this.particleAge == 75)icon = new ResourceLocation("flansmod", "particle/Casing1.png");
		if(this.particleAge == 76)icon = new ResourceLocation("flansmod", "particle/Casing2.png");
		if(this.particleAge == 77)icon = new ResourceLocation("flansmod", "particle/Casing3.png");
		if(this.particleAge == 78)icon = new ResourceLocation("flansmod", "particle/Casing4.png");
		if(this.particleAge == 79)icon = new ResourceLocation("flansmod", "particle/Casing5.png");
		if(this.particleAge == 80)icon = new ResourceLocation("flansmod", "particle/Casing6.png");
		if(this.particleAge == 81)icon = new ResourceLocation("flansmod", "particle/Casing1.png");
		if(this.particleAge == 82)icon = new ResourceLocation("flansmod", "particle/Casing2.png");
		if(this.particleAge == 83)icon = new ResourceLocation("flansmod", "particle/Casing3.png");
		if(this.particleAge == 84)icon = new ResourceLocation("flansmod", "particle/Casing4.png");
		if(this.particleAge == 85)icon = new ResourceLocation("flansmod", "particle/Casing5.png");
		if(this.particleAge == 86)icon = new ResourceLocation("flansmod", "particle/Casing6.png");
		if(this.particleAge == 87)icon = new ResourceLocation("flansmod", "particle/Casing1.png");
		if(this.particleAge == 88)icon = new ResourceLocation("flansmod", "particle/Casing2.png");
		if(this.particleAge == 89)icon = new ResourceLocation("flansmod", "particle/Casing3.png");
		if(this.particleAge == 90)icon = new ResourceLocation("flansmod", "particle/Casing4.png");
		if(this.particleAge == 91)icon = new ResourceLocation("flansmod", "particle/Casing5.png");
		if(this.particleAge == 92)icon = new ResourceLocation("flansmod", "particle/Casing6.png");
		if(this.particleAge == 93)icon = new ResourceLocation("flansmod", "particle/Casing1.png");
		if(this.particleAge == 94)icon = new ResourceLocation("flansmod", "particle/Casing2.png");
		if(this.particleAge == 95)icon = new ResourceLocation("flansmod", "particle/Casing3.png");
		if(this.particleAge == 96)icon = new ResourceLocation("flansmod", "particle/Casing4.png");
		if(this.particleAge == 97)icon = new ResourceLocation("flansmod", "particle/Casing5.png");
		if(this.particleAge == 98)icon = new ResourceLocation("flansmod", "particle/Casing6.png");
		if(this.particleAge == 99)icon = new ResourceLocation("flansmod", "particle/Casing1.png");
		if(this.particleAge == 100)icon = new ResourceLocation("flansmod", "particle/Casing2.png");
		
		
    	FMLClientHandler.instance().getClient().renderEngine.bindTexture(icon);

	}
}
