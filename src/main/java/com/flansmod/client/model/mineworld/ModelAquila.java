//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.7
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.mineworld;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAquila extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelAquila()
	{
		gunModel = new ModelRendererTurbo[19];
		gunModel[0] = new ModelRendererTurbo(this, 4, 26, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 0, 9, textureX, textureY); // Box 2
		gunModel[2] = new ModelRendererTurbo(this, 22, 21, textureX, textureY); // Box 3
		gunModel[3] = new ModelRendererTurbo(this, 27, 18, textureX, textureY); // Box 5
		gunModel[4] = new ModelRendererTurbo(this, 26, 23, textureX, textureY); // Box 6
		gunModel[5] = new ModelRendererTurbo(this, 32, 18, textureX, textureY); // Box 7
		gunModel[6] = new ModelRendererTurbo(this, 35, 2, textureX, textureY); // Box 8
		gunModel[7] = new ModelRendererTurbo(this, 32, 11, textureX, textureY); // Box 9
		gunModel[8] = new ModelRendererTurbo(this, 27, 12, textureX, textureY); // Box 10
		gunModel[9] = new ModelRendererTurbo(this, 19, 12, textureX, textureY); // Box 12
		gunModel[10] = new ModelRendererTurbo(this, 28, 2, textureX, textureY); // Box 13
		gunModel[11] = new ModelRendererTurbo(this, 23, 2, textureX, textureY); // Box 14
		gunModel[12] = new ModelRendererTurbo(this, 6, 2, textureX, textureY); // Box 15
		gunModel[13] = new ModelRendererTurbo(this, 16, 2, textureX, textureY); // Box 16
		gunModel[14] = new ModelRendererTurbo(this, 20, 18, textureX, textureY); // Box 17
		gunModel[15] = new ModelRendererTurbo(this, 19, 8, textureX, textureY); // Box 18
		gunModel[16] = new ModelRendererTurbo(this, 26, 9, textureX, textureY); // Box 19
		gunModel[17] = new ModelRendererTurbo(this, 11, 0, textureX, textureY); // Box 20
		gunModel[18] = new ModelRendererTurbo(this, 4, 18, textureX, textureY); // Box 21

		gunModel[0].addShapeBox(0F, 0F, -1F, 2, 48, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		gunModel[0].setRotationPoint(0F, -28F, 0F);

		gunModel[1].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 2
		gunModel[1].setRotationPoint(0F, -29F, -3F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 3
		gunModel[2].setRotationPoint(0.5F, -31F, -1F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 5
		gunModel[3].setRotationPoint(0.5F, -31F, 0F);

		gunModel[4].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 6
		gunModel[4].setRotationPoint(0.5F, -34F, -1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[5].setRotationPoint(0.5F, -35F, -1F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0.75F, -1F, 0F, 0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[6].setRotationPoint(0.5F, -34F, -3F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, -1F, 0F, 1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 9
		gunModel[7].setRotationPoint(0.5F, -34F, -5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 1.5F, 1F, 0F, 1.5F, 1F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.1F, 0.7F, 0F, -1.1F, 0.7F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 10
		gunModel[8].setRotationPoint(0.5F, -34F, -3F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, -1F, 0F, 1.5F, -1F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 12
		gunModel[9].setRotationPoint(0.5F, -32F, -5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, -1F, 0F, 0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 13
		gunModel[10].setRotationPoint(0.5F, -34F, 1F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 1.5F, 1F, 0F, 1.5F, 1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.1F, 0.7F, 0F, -1.1F, 0.7F); // Box 14
		gunModel[11].setRotationPoint(0.5F, -34F, 2F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 1.5F, -1F, 0F, 1.5F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[12].setRotationPoint(0.5F, -34F, 3F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 1.5F, -1F, 0F, 1.5F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -1.25F, -1F, 0F, -1.25F, -1F); // Box 16
		gunModel[13].setRotationPoint(0.5F, -32F, 3F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[14].setRotationPoint(0.5F, -36.5F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.6F, 0.25F, 0F, -0.6F, 0.25F, 0F, -0.9F, -0.75F, 0F, -0.9F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 18
		gunModel[15].setRotationPoint(0.5F, -36.25F, 0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0.25F, 0F, -0.6F, 0.25F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		gunModel[16].setRotationPoint(0.5F, -36.5F, 0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.6F, 0.25F, 0F, -0.6F, 0.25F, 0F, -0.9F, -0.75F, 0F, -0.9F, -0.75F); // Box 20
		gunModel[17].setRotationPoint(0.5F, -35.25F, 0.5F);

		gunModel[18].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 21
		gunModel[18].setRotationPoint(0F, -27F, -1F);
        
		flipAll();
	}
}