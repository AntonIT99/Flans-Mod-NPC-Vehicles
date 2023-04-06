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

public class ModelSlavShield extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelSlavShield() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[27];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 14
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 9
		gunModel[3] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 10
		gunModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 11
		gunModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 12
		gunModel[6] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 13
		gunModel[7] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 12
		gunModel[8] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 25
		gunModel[9] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 26
		gunModel[10] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 27
		gunModel[11] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 28
		gunModel[12] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 29
		gunModel[13] = new ModelRendererTurbo(this, 15, 18, textureX, textureY); // Box 30
		gunModel[14] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 31
		gunModel[15] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 0
		gunModel[16] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		gunModel[17] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 2
		gunModel[18] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 3
		gunModel[19] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 4
		gunModel[20] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 5
		gunModel[21] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 6
		gunModel[22] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 7
		gunModel[23] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 8
		gunModel[24] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 9
		gunModel[25] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 10
		gunModel[26] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 11

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[0].setRotationPoint(1F, -1F, -8F);

		gunModel[1].addShapeBox(0F, -5F, 0F, 1, 1, 8, 0F,0F, -0.1F, -3.5F, 0F, -0.1F, -3.5F, 0F, -0.1F, -3.5F, 0F, -0.1F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[1].setRotationPoint(1F, -3.5F, -4F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 9
		gunModel[2].setRotationPoint(1F, -7.5F, -6F);

		gunModel[3].addShapeBox(0F, -3F, 0F, 1, 3, 14, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 10
		gunModel[3].setRotationPoint(1F, -1F, -7F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 11
		gunModel[4].setRotationPoint(1.3F, -1F, -2F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 12
		gunModel[5].setRotationPoint(2.3F, -1F, -1.5F);

		gunModel[6].addShapeBox(0F, -1F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -0.95F, -1F, 0F, -0.95F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 13
		gunModel[6].setRotationPoint(2.3F, -0.99F, -1.5F);

		gunModel[7].addShapeBox(0F, -1.7F, 0F, 1, 1, 4, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 12
		gunModel[7].setRotationPoint(1.3F, -1F, -2F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 25
		gunModel[8].setRotationPoint(1F, -5.5F, -6F);

		gunModel[9].addShapeBox(0F, -1.3F, 0F, 1, 1, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 26
		gunModel[9].setRotationPoint(1.3F, 2F, -2F);

		gunModel[10].addShapeBox(0F, -1F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.95F, -1F, 0F, -0.95F, -1F, 0F, 0F, -1F); // Box 27
		gunModel[10].setRotationPoint(2.3F, 1.01F, -1.5F);

		gunModel[11].addShapeBox(0F, 1F, 0F, 1, 3, 14, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 28
		gunModel[11].setRotationPoint(1F, -1F, -7F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 29
		gunModel[12].setRotationPoint(1F, 2.5F, -6F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 30
		gunModel[13].setRotationPoint(1F, 4.5F, -6F);

		gunModel[14].addShapeBox(0F, -5F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -3.5F, 0F, -0.1F, -3.5F, 0F, -0.1F, -3.5F, 0F, -0.1F, -3.5F); // Box 31
		gunModel[14].setRotationPoint(1F, 11.5F, -4F);

		gunModel[15].addShapeBox(0.1F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 6.5F, 0F, -0.2F, 6.5F, 0F, -0.2F, 6.5F, 0F, -0.2F, 6.5F, 0F, -0.2F, 6.5F, 0F, -0.2F, 6.5F, 0F, -0.2F, 6.5F, 0F, -0.2F, 6.5F); // Box 0
		gunModel[15].setRotationPoint(1F, -1F, -0.5F);

		gunModel[16].addShapeBox(0.1F, 0F, 0F, 1, 1, 1, 0F,0F, 6.3F, 0F, 0F, 6.3F, 0F, 0F, 6.3F, 0F, 0F, 6.3F, 0F, 0F, 6.3F, 0F, 0F, 6.3F, 0F, 0F, 6.3F, 0F, 0F, 6.3F, 0F); // Box 1
		gunModel[16].setRotationPoint(1F, -1F, -0.5F);

		gunModel[17].addShapeBox(0.1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 9.5F, -9.5F, 0F, 9.5F, -9.5F, 0F, 9F, 9.1F, 0F, 9F, 9.1F); // Box 2
		gunModel[17].setRotationPoint(1F, -5.5F, -5F);

		gunModel[18].addShapeBox(0.1F, 0F, 0F, 1, 1, 1, 0F,0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 9.1F, 0F, 9F, 9.1F, 0F, 9.5F, -9.5F, 0F, 9.5F, -9.5F); // Box 3
		gunModel[18].setRotationPoint(1F, -5.5F, 4F);

		gunModel[19].addShapeBox(0.1F, 0F, 1F, 1, 1, 2, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 4
		gunModel[19].setRotationPoint(1F, -7.5F, -0.5F);

		gunModel[20].addShapeBox(0.1F, 0F, 1F, 1, 1, 2, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 5
		gunModel[20].setRotationPoint(1F, 5.5F, -3.5F);

		gunModel[21].addShapeBox(0.1F, 0F, 1F, 1, 2, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 6
		gunModel[21].setRotationPoint(1F, -0.2F, 5.4F);

		gunModel[22].addShapeBox(0.1F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 7
		gunModel[22].setRotationPoint(1F, -2.8F, -7.4F);

		gunModel[23].addShapeBox(0.1F, 0F, 1F, 1, 1, 2, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 8
		gunModel[23].setRotationPoint(1F, -6.3F, -5F);

		gunModel[24].addShapeBox(0.1F, 0F, 1F, 1, 1, 2, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -3F, -0.8F, 0F, -3F, -0.8F, 0F, -0.4F, 1F, 0F, -0.4F, 1F, 0F, 2F, -1F, 0F, 2F, -1F); // Box 9
		gunModel[24].setRotationPoint(1F, -5.7F, 4F);

		gunModel[25].addShapeBox(0.1F, 0F, 1F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 10
		gunModel[25].setRotationPoint(1F, 4.2F, 1.5F);

		gunModel[26].addShapeBox(0.1F, 0F, 0F, 1, 1, 2, 0F,0F, 2F, -1F, 0F, 2F, -1F, 0F, -0.4F, 1F, 0F, -0.4F, 1F, 0F, -3F, -0.8F, 0F, -3F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 11
		gunModel[26].setRotationPoint(1F, 3.7F, -7.1F);
	}
}