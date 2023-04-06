//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: DivineMachine
// Model Creator: 
// Created on: 28.03.2019 - 18:38:48
// Last changed on: 28.03.2019 - 18:38:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelDivineMachine extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelDivineMachine() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[28];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 19
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 20
		gunModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 21
		gunModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 22
		gunModel[5] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 23
		gunModel[6] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 24
		gunModel[7] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 25
		gunModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 26
		gunModel[9] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 27
		gunModel[10] = new ModelRendererTurbo(this, 0, 21, textureX, textureY); // Box 28
		gunModel[11] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 29
		gunModel[12] = new ModelRendererTurbo(this, 0, 6, textureX, textureY); // Box 30
		gunModel[13] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 31
		gunModel[14] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 32
		gunModel[15] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 33
		gunModel[16] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 34
		gunModel[17] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 35
		gunModel[18] = new ModelRendererTurbo(this, 41, 28, textureX, textureY); // Box 36
		gunModel[19] = new ModelRendererTurbo(this, 49, 28, textureX, textureY); // Box 37
		gunModel[20] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Box 38
		gunModel[21] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Box 39
		gunModel[22] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Box 40
		gunModel[23] = new ModelRendererTurbo(this, 6, 9, textureX, textureY); // Box 41
		gunModel[24] = new ModelRendererTurbo(this, 6, 9, textureX, textureY); // Box 42
		gunModel[25] = new ModelRendererTurbo(this, 6, 9, textureX, textureY); // Box 43
		gunModel[26] = new ModelRendererTurbo(this, 6, 9, textureX, textureY); // Box 44
		gunModel[27] = new ModelRendererTurbo(this, 6, 9, textureX, textureY); // Box 45

		gunModel[0].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		gunModel[0].setRotationPoint(-1F, -4F, -1F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -1.4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1.4F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F); // Box 19
		gunModel[1].setRotationPoint(-6F, -4F, -1F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -2F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -2F, 0F, 0.5F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0.5F, 1F, 0F); // Box 20
		gunModel[2].setRotationPoint(-7F, -4F, -1F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F); // Box 21
		gunModel[3].setRotationPoint(-7F, -1F, -1F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 22
		gunModel[4].setRotationPoint(-9F, 2F, -1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.5F, 0F, 0F, -0.6F, 0.5F, 0F, -0.6F, 0.5F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1.2F, -0.5F, 0F, 1.2F, -0.5F, 0F, -1F, 0F, 0F); // Box 23
		gunModel[5].setRotationPoint(-11F, 2F, -1F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 24
		gunModel[6].setRotationPoint(-1F, -5F, -1.2F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 25
		gunModel[7].setRotationPoint(-1F, -5F, 0.2F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 26
		gunModel[8].setRotationPoint(11F, -2F, -0.5F);

		gunModel[9].addShapeBox(0F, -0.5F, -0.5F, 16, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 27
		gunModel[9].setRotationPoint(11F, -2.5F, -1.3F);
		gunModel[9].rotateAngleX = 0.34906585F;

		gunModel[10].addShapeBox(0F, -0.5F, -0.5F, 16, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 28
		gunModel[10].setRotationPoint(11F, -2.5F, 1.3F);
		gunModel[10].rotateAngleX = -0.34906585F;

		gunModel[11].addShapeBox(0F, -0.5F, -0.5F, 16, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 29
		gunModel[11].setRotationPoint(11F, -4F, 0.8F);
		gunModel[11].rotateAngleX = 0.95993109F;

		gunModel[12].addShapeBox(0F, -0.5F, -0.5F, 16, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 30
		gunModel[12].setRotationPoint(11F, -4F, -0.8F);
		gunModel[12].rotateAngleX = -0.95993109F;

		gunModel[13].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 31
		gunModel[13].setRotationPoint(3F, -3.5F, -1.5F);
		gunModel[13].rotateAngleZ = -0.17453293F;

		gunModel[14].addShapeBox(5F, 0F, 0F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 1F, -0.2F, 0F, 1F, -0.2F, 0F, -0.2F, -0.2F); // Box 32
		gunModel[14].setRotationPoint(3F, -3.5F, -1.5F);
		gunModel[14].rotateAngleZ = -0.17453293F;

		gunModel[15].addShapeBox(8F, 0F, 0F, 2, 1, 1, 0F,0F, -1.2F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -1.2F, -0.2F, 0F, 1F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 1F, -0.2F); // Box 33
		gunModel[15].setRotationPoint(3F, -3.5F, -1.5F);
		gunModel[15].rotateAngleZ = -0.17453293F;

		gunModel[16].addShapeBox(10F, 0F, 0F, 2, 1, 1, 0F,0F, -0.8F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0.5F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.5F, -0.2F); // Box 34
		gunModel[16].setRotationPoint(3F, -3.5F, -1.5F);
		gunModel[16].rotateAngleZ = -0.17453293F;

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		gunModel[17].setRotationPoint(14F, -1.5F, -1.5F);

		gunModel[18].addShapeBox(0F, -0.5F, -0.5F, 2, 1, 1, 0F,0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F); // Box 36
		gunModel[18].setRotationPoint(10.8F, -2.5F, -1.3F);
		gunModel[18].rotateAngleX = 0.34906585F;

		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F); // Box 37
		gunModel[19].setRotationPoint(10.8F, -2F, -0.5F);

		gunModel[20].addShapeBox(0F, -0.5F, -0.5F, 2, 1, 1, 0F,0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F); // Box 38
		gunModel[20].setRotationPoint(10.8F, -4F, -0.8F);
		gunModel[20].rotateAngleX = -0.95993109F;

		gunModel[21].addShapeBox(0F, -0.5F, -0.5F, 2, 1, 1, 0F,0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F); // Box 39
		gunModel[21].setRotationPoint(10.8F, -4F, 0.8F);
		gunModel[21].rotateAngleX = 0.95993109F;

		gunModel[22].addShapeBox(0F, -0.5F, -0.5F, 2, 1, 1, 0F,0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F); // Box 40
		gunModel[22].setRotationPoint(10.8F, -2.5F, 1.3F);
		gunModel[22].rotateAngleX = -0.34906585F;

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F); // Box 41
		gunModel[23].setRotationPoint(18.8F, -2F, -0.5F);

		gunModel[24].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F); // Box 42
		gunModel[24].setRotationPoint(18.8F, -2.5F, 1.3F);
		gunModel[24].rotateAngleX = -0.34906585F;

		gunModel[25].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F); // Box 43
		gunModel[25].setRotationPoint(18.8F, -4F, 0.8F);
		gunModel[25].rotateAngleX = 0.95993109F;

		gunModel[26].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F); // Box 44
		gunModel[26].setRotationPoint(18.8F, -4F, -0.8F);
		gunModel[26].rotateAngleX = -0.95993109F;

		gunModel[27].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F); // Box 45
		gunModel[27].setRotationPoint(18.8F, -2.5F, -1.3F);
		gunModel[27].rotateAngleX = 0.34906585F;
		
	    translateAll(0F, -1.6F, 0F);
	}
}