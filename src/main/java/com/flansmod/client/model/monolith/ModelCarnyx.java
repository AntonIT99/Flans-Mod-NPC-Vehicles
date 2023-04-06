//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCarnyx extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelCarnyx() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[20];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 0
		gunModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		gunModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		gunModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
		gunModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		gunModel[6] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 5
		gunModel[7] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 6
		gunModel[8] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 7
		gunModel[9] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 12
		gunModel[11] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 13
		gunModel[12] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 14
		gunModel[13] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 15
		gunModel[14] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 16
		gunModel[15] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 17
		gunModel[16] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 18
		gunModel[17] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 19
		gunModel[18] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 20
		gunModel[19] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 21

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 40F, 0F, 0F, 40F, 0F, 0F, 40F, 0F, 0F, 40F, 0F); // Box 0
		gunModel[0].setRotationPoint(0F, -65F, 3F);

		gunModel[1].addShapeBox(-1F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[1].setRotationPoint(1F, -7F, 3F);
		gunModel[1].rotateAngleZ = -0.27925268F;

		gunModel[2].addShapeBox(-1F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[2].setRotationPoint(0.5F, -5F, 3F);
		gunModel[2].rotateAngleZ = -0.89011792F;

		gunModel[3].addShapeBox(-1F, 3F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 2
		gunModel[3].setRotationPoint(0.5F, -5F, 3F);
		gunModel[3].rotateAngleZ = -0.89011792F;

		gunModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[4].setRotationPoint(-1F, -10F, 2F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[5].setRotationPoint(-1F, -26F, 2F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[6].setRotationPoint(-1F, -46F, 2F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[7].setRotationPoint(-1F, -64F, 2F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0.2F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[8].setRotationPoint(0F, -71F, 3F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0.8F, 2F, -1F, 0.8F, 2F, -1F, 0.8F, -0.5F, 0F, 0.8F, 0.2F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.2F, 0F, 0.5F); // Box 9
		gunModel[9].setRotationPoint(0F, -74F, 3F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-1F, -0.5F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -1F, -0.5F, 0.3F, 0F, 0F, 0.3F, -0.5F, 1F, 0.3F, -0.5F, 1F, 0.3F, 0F, 0F, 0.3F); // Box 12
		gunModel[10].setRotationPoint(0.5F, -76.01F, 2.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, 0F, 0.3F); // Box 13
		gunModel[11].setRotationPoint(3F, -76.01F, 2.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[12].setRotationPoint(6F, -77.5F, 1F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 7, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, -0.8F, 0F, 0F); // Box 15
		gunModel[13].setRotationPoint(13F, -77.5F, 1F);
		gunModel[13].rotateAngleZ = -0.2268928F;

		gunModel[14].addShapeBox(0F, -1F, 0F, 6, 2, 5, 0F,0F, 0F, -0.2F, 0F, -0.7F, -1.5F, 0F, -0.7F, -1.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, -1F, -0.5F, -1.5F, -1F, -0.5F, -1.5F, 0F, 0F, 0F); // Box 16
		gunModel[14].setRotationPoint(13F, -73.5F, 1F);
		gunModel[14].rotateAngleZ = -0.19198622F;

		gunModel[15].addShapeBox(0F, -5F, 0F, 2, 6, 3, 0F,0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[15].setRotationPoint(7F, -76.5F, 0.5F);

		gunModel[16].addShapeBox(0F, -5F, 0F, 2, 6, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 18
		gunModel[16].setRotationPoint(7F, -76.5F, 3.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 19
		gunModel[17].setRotationPoint(1F, -80.01F, 3F);
		gunModel[17].rotateAngleZ = 0.27925268F;

		gunModel[18].addShapeBox(-6F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 20
		gunModel[18].setRotationPoint(1F, -80.01F, 3F);
		gunModel[18].rotateAngleZ = 0.9250245F;

		gunModel[19].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F); // Box 21
		gunModel[19].setRotationPoint(-2.6F, -75.3F, 3F);
		gunModel[19].rotateAngleZ = 0.08726646F;
	}
}