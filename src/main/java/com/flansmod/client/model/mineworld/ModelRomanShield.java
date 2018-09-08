package com.flansmod.client.model.mineworld;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRomanShield extends ModelGun
{
	public ModelRomanShield()
	{
		int textureX = 64;
		int textureY = 64;
		
		gunModel = new ModelRendererTurbo[1];
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import 

		gunModel[0].addBox(4F, -20F, -8F, 1, 22, 12, 0F); // Import 
	}
}