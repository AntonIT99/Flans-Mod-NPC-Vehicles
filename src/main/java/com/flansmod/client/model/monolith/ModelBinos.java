//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Binos
// Model Creator: 
// Created on: 28.07.2022 - 00:35:26
// Last changed on: 28.07.2022 - 00:35:26

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBinos extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelBinos() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[31];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 28
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 29
		gunModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 30
		gunModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 31
		gunModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 32
		gunModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 33
		gunModel[6] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 34
		gunModel[7] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 35
		gunModel[8] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 36
		gunModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 40
		gunModel[10] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 41
		gunModel[11] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 42
		gunModel[12] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 46
		gunModel[13] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 47
		gunModel[14] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 48
		gunModel[15] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 49
		gunModel[16] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 50
		gunModel[17] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 51
		gunModel[18] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 52
		gunModel[19] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 53
		gunModel[20] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 54
		gunModel[21] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 55
		gunModel[22] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 56
		gunModel[23] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 60
		gunModel[24] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 61
		gunModel[25] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 62
		gunModel[26] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 63
		gunModel[27] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 64
		gunModel[28] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 65
		gunModel[29] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 66
		gunModel[30] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 67

		gunModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 28
		gunModel[0].setRotationPoint(-3.5F, -3F, 0.0999999999999996F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 29
		gunModel[1].setRotationPoint(-3.5F, -3.5F, 0.0999999999999996F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 30
		gunModel[2].setRotationPoint(-3.5F, -2.5F, 0.0999999999999996F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 31
		gunModel[3].setRotationPoint(-2F, -3F, -1.7F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.2F, -0.2F, -0.7F, 0.2F, -0.2F, -0.7F, 0.2F, -0.3F, -1F, 0.2F, -0.3F, -1F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 32
		gunModel[4].setRotationPoint(-2F, -4F, -1.7F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -1F, 0.2F, -0.5F, -1F); // Box 33
		gunModel[5].setRotationPoint(-2F, -2F, -1.7F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.2F, -0.2F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.2F, 0F); // Box 34
		gunModel[6].setRotationPoint(1F, -3.1F, -1.9F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.2F, -0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, -0.2F, -0.6F, 0.2F, -0.2F, 0F, 0.2F, -0.4F, 0.2F, 0.2F, -0.4F, 0.2F, 0.2F, -0.2F, 0F); // Box 35
		gunModel[7].setRotationPoint(1F, -3.7F, -1.9F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.2F, -0.2F, 0F, 0.2F, -0.4F, 0.2F, 0.2F, -0.4F, 0.2F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, -0.2F, -0.6F); // Box 36
		gunModel[8].setRotationPoint(1F, -2.5F, -1.9F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 40
		gunModel[9].setRotationPoint(-2F, -3F, 2.8F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.2F, -0.3F, -1F, 0.2F, -0.3F, -1F, 0.2F, -0.2F, -0.7F, 0.2F, -0.2F, -0.7F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 41
		gunModel[10].setRotationPoint(-2F, -4F, 2.8F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, -0.5F, -1F, 0.2F, -0.5F, -1F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F); // Box 42
		gunModel[11].setRotationPoint(-2F, -2F, 2.8F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 46
		gunModel[12].setRotationPoint(-2F, -4.2F, 1.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 47
		gunModel[13].setRotationPoint(-2F, -4.4F, 1.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 48
		gunModel[14].setRotationPoint(-2F, -4F, 1.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, 0.8F, -0.3F, -0.4F, 0.8F, -0.3F, -0.4F, -1.2F, -0.3F, -0.4F, -1.2F); // Box 49
		gunModel[15].setRotationPoint(0.2F, -4.2F, 1.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -1.2F, -0.3F, -0.4F, -1.2F, -0.3F, -0.4F, 0.8F, -0.3F, -0.4F, 0.8F); // Box 50
		gunModel[16].setRotationPoint(0.2F, -4.2F, 1.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -1.2F, -0.3F, -0.4F, -1.2F, -0.3F, -0.4F, 0.8F, -0.3F, -0.4F, 0.8F); // Box 51
		gunModel[17].setRotationPoint(-2.2F, -4.2F, 1.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, 0.8F, -0.3F, -0.4F, 0.8F, -0.3F, -0.4F, -1.2F, -0.3F, -0.4F, -1.2F); // Box 52
		gunModel[18].setRotationPoint(-2.2F, -4.2F, 1.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.2F, -0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, -0.2F, -0.6F, 0.2F, -0.2F, 0F, 0.2F, -0.4F, 0.2F, 0.2F, -0.4F, 0.2F, 0.2F, -0.2F, 0F); // Box 53
		gunModel[19].setRotationPoint(1F, -3.7F, 4F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.2F, -0.2F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.2F, 0F); // Box 54
		gunModel[20].setRotationPoint(1F, -3.1F, 4F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.2F, -0.2F, 0F, 0.2F, -0.4F, 0.2F, 0.2F, -0.4F, 0.2F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, -0.2F, -0.6F); // Box 55
		gunModel[21].setRotationPoint(1F, -2.5F, 4F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, 0.05F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, 0.05F, -0.25F, -0.2F, -0.4F, 0.4F, -0.2F, -0.25F, 0.25F, -0.2F, -0.25F, 0.25F, -0.2F, -0.4F, 0.4F); // Box 56
		gunModel[22].setRotationPoint(-4.5F, -3.5F, 0.0999999999999996F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, -0.1F, 0.4F, -0.2F, -0.25F, 0.25F, -0.2F, -0.25F, 0.25F, -0.2F, -0.1F, 0.4F, -0.2F, -0.1F, 0.4F, -0.2F, -0.25F, 0.25F, -0.2F, -0.25F, 0.25F, -0.2F, -0.1F, 0.4F); // Box 60
		gunModel[23].setRotationPoint(-4.5F, -3F, 0.0999999999999996F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, -0.4F, 0.4F, -0.2F, -0.25F, 0.25F, -0.2F, -0.25F, 0.25F, -0.2F, -0.4F, 0.4F, -0.2F, 0.05F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, 0.05F, -0.25F); // Box 61
		gunModel[24].setRotationPoint(-4.5F, -2.5F, 0.0999999999999996F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, 0.05F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, 0.05F, -0.25F, -0.2F, -0.4F, 0.4F, -0.2F, -0.25F, 0.25F, -0.2F, -0.25F, 0.25F, -0.2F, -0.4F, 0.4F); // Box 62
		gunModel[25].setRotationPoint(-4.5F, -3.5F, 3F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 63
		gunModel[26].setRotationPoint(-3.5F, -3.5F, 3F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 64
		gunModel[27].setRotationPoint(-3.5F, -3F, 3F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 65
		gunModel[28].setRotationPoint(-3.5F, -2.5F, 3F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, -0.4F, 0.4F, -0.2F, -0.25F, 0.25F, -0.2F, -0.25F, 0.25F, -0.2F, -0.4F, 0.4F, -0.2F, 0.05F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, 0.05F, -0.25F); // Box 66
		gunModel[29].setRotationPoint(-4.5F, -2.5F, 3F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, -0.1F, 0.4F, -0.2F, -0.25F, 0.25F, -0.2F, -0.25F, 0.25F, -0.2F, -0.1F, 0.4F, -0.2F, -0.1F, 0.4F, -0.2F, -0.25F, 0.25F, -0.2F, -0.25F, 0.25F, -0.2F, -0.1F, 0.4F); // Box 67
		gunModel[30].setRotationPoint(-4.5F, -3F, 3F);
	}
}