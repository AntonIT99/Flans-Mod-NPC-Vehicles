//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: S49
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelS49 extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelS49() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[52];
		noseModel = new ModelRendererTurbo[29];
		tailModel = new ModelRendererTurbo[14];
		leftWingModel = new ModelRendererTurbo[6];
		rightWingModel = new ModelRendererTurbo[6];
		yawFlapModel = new ModelRendererTurbo[4];
		pitchFlapLeftModel = new ModelRendererTurbo[2];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		tailWheelModel = new ModelRendererTurbo[4];
		leftWingWheelModel = new ModelRendererTurbo[6];
		rightWingWheelModel = new ModelRendererTurbo[6];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initpitchFlapLeftWingModel_1();
		initpitchFlapRightWingModel_1();
		inittailWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 6
		bodyModel[2] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 14
		bodyModel[3] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 15
		bodyModel[4] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 16
		bodyModel[5] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 18
		bodyModel[6] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 19
		bodyModel[7] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 20
		bodyModel[8] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 21
		bodyModel[9] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 22
		bodyModel[10] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 23
		bodyModel[11] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 24
		bodyModel[12] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 25
		bodyModel[13] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 26
		bodyModel[14] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 27
		bodyModel[15] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 29
		bodyModel[16] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 30
		bodyModel[17] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 31
		bodyModel[18] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 32
		bodyModel[19] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 33
		bodyModel[20] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 34
		bodyModel[21] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 35
		bodyModel[22] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 36
		bodyModel[23] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 37
		bodyModel[24] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 38
		bodyModel[25] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 39
		bodyModel[26] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 40
		bodyModel[27] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 41
		bodyModel[28] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 42
		bodyModel[29] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 43
		bodyModel[30] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 44
		bodyModel[31] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 45
		bodyModel[32] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 46
		bodyModel[33] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 47
		bodyModel[34] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 62
		bodyModel[35] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 63
		bodyModel[36] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 67
		bodyModel[37] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 68
		bodyModel[38] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Box 71
		bodyModel[39] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 72
		bodyModel[40] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 89
		bodyModel[41] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 90
		bodyModel[42] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 91
		bodyModel[43] = new ModelRendererTurbo(this, 153, 153, textureX, textureY); // Box 221
		bodyModel[44] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 222
		bodyModel[45] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 223
		bodyModel[46] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 224
		bodyModel[47] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 225
		bodyModel[48] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 226
		bodyModel[49] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 227
		bodyModel[50] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 228
		bodyModel[51] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 229

		bodyModel[0].addShapeBox(0F, 0F, 0F, 12, 17, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[0].setRotationPoint(-40F, -31F, -7.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 12, 4, 15, 0F,0F, 0F, -4F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[1].setRotationPoint(-40F, -35F, -7.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 12, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -4F, 0F, 0.5F, -4F, 0F, 0.5F, -4F, 0F, 0.5F, -4F); // Box 14
		bodyModel[2].setRotationPoint(-40F, -14F, -7.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -4F, 0F, 0.5F, -4F, 0F, 0.5F, -4F, 0F, -0.5F, -4F); // Box 15
		bodyModel[3].setRotationPoint(-54F, -14F, -7.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 10, 2, 15, 0F,0F, 2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, -2F, -4.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -4.5F); // Box 16
		bodyModel[4].setRotationPoint(-64F, -14.5F, -7.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 11, 4, 15, 0F,0F, 1F, -4F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[5].setRotationPoint(-28F, -35F, -7.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 11, 17, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[6].setRotationPoint(-28F, -31F, -7.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 11, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0.5F, -4F); // Box 20
		bodyModel[7].setRotationPoint(-28F, -14F, -7.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 36, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 21
		bodyModel[8].setRotationPoint(-17F, -31F, -7.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 36, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1.5F, -4.5F, 0F, -1.5F, -4.5F, 0F, 0F, -4F); // Box 22
		bodyModel[9].setRotationPoint(-17F, -14F, -7.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 8, 5, 7, 0F,0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 23
		bodyModel[10].setRotationPoint(-17F, -36F, -7.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 28, 5, 7, 0F,0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -0.15F, 0F, 0F, -0.5F, 0F, 0F, -5.5F, 0F, 0F, -6F); // Box 24
		bodyModel[11].setRotationPoint(-9F, -36F, -7.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 42, 17, 14, 0F,0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, -3.5F, 0F, -5.5F, -3.5F, 0F, 0F, 0F); // Box 25
		bodyModel[12].setRotationPoint(19F, -31F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 42, 1, 14, 0F,0F, 0F, 0F, 0F, 5.5F, -3.5F, 0F, 5.5F, -3.5F, 0F, 0F, 0F, 0F, -0.5F, -4F, -15F, -3.8F, -4F, -15F, -3.8F, -4F, 0F, -0.5F, -4F); // Box 26
		bodyModel[13].setRotationPoint(19F, -14F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 42, 5, 14, 0F,0F, 0F, -3.5F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F); // Box 27
		bodyModel[14].setRotationPoint(19F, -36F, -7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 2F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, 0.5F); // Box 29
		bodyModel[15].setRotationPoint(21F, -38F, -2F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 26, 2, 4, 0F,0F, 0F, -1.5F, 0F, 3F, -1.5F, 0F, 3F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F); // Box 30
		bodyModel[16].setRotationPoint(33F, -38F, -2F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 31
		bodyModel[17].setRotationPoint(21.5F, -49F, -0.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 36, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 32
		bodyModel[18].setRotationPoint(-17F, -31F, 6.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 8, 5, 7, 0F,0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -0.15F, 0F, 0F, 0F); // Box 33
		bodyModel[19].setRotationPoint(-17F, -36F, 0.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 28, 5, 7, 0F,0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, -5.5F, 0F, 0F, -0.5F, 0F, 0F, -0.15F); // Box 34
		bodyModel[20].setRotationPoint(-9F, -36F, 0.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[21].setRotationPoint(-12F, -41F, -2.5F);
		bodyModel[21].rotateAngleZ = -0.78539816F;

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[22].setRotationPoint(-12F, -41F, 1.5F);
		bodyModel[22].rotateAngleZ = -0.78539816F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[23].setRotationPoint(-12F, -41F, -2.5F);

		bodyModel[24].addShapeBox(0F, 0F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[24].setRotationPoint(-9F, -40F, -3F);
		bodyModel[24].rotateAngleX = -0.2443461F;

		bodyModel[25].addShapeBox(0F, 0F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[25].setRotationPoint(-9F, -40F, 3F);
		bodyModel[25].rotateAngleX = 0.2443461F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[26].setRotationPoint(-12F, -41F, -2.5F);
		bodyModel[26].rotateAngleY = -0.27925268F;
		bodyModel[26].rotateAngleZ = -0.20943951F;

		bodyModel[27].addShapeBox(0F, 0F, -1F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[27].setRotationPoint(-12F, -41F, 2.5F);
		bodyModel[27].rotateAngleY = 0.27925268F;
		bodyModel[27].rotateAngleZ = -0.20943951F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[28].setRotationPoint(-9F, -42F, 0F);
		bodyModel[28].rotateAngleX = -0.41887902F;

		bodyModel[29].addShapeBox(0F, 0F, -4F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[29].setRotationPoint(-9F, -42F, 0F);
		bodyModel[29].rotateAngleX = 0.41887902F;

		bodyModel[30].addShapeBox(0F, 0F, -4F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[30].setRotationPoint(3F, -42F, 0F);
		bodyModel[30].rotateAngleX = 0.41887902F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[31].setRotationPoint(3F, -42F, 0F);
		bodyModel[31].rotateAngleX = -0.41887902F;

		bodyModel[32].addShapeBox(0F, 0F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[32].setRotationPoint(3F, -40.5F, -3F);
		bodyModel[32].rotateAngleX = -0.13962634F;

		bodyModel[33].addShapeBox(0F, 0F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[33].setRotationPoint(3F, -40.5F, 3F);
		bodyModel[33].rotateAngleX = 0.13962634F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 40, 2, 4, 0F,-7F, 0F, 0F, 1F, -1F, 6F, 16F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 6F, 16F, 0F, 0F, 4F, 1F, 0F); // Box 62
		bodyModel[34].setRotationPoint(-33F, -17F, -7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 40, 1, 4, 0F,1F, 1F, 0F, 1F, 1F, 6F, 16F, 2F, 0F, 4F, 1F, 0F, -2F, 0F, 0F, 1F, -1F, 6F, 16F, -1.5F, 0F, 0F, 0.4F, -0.5F); // Box 63
		bodyModel[35].setRotationPoint(-33F, -13F, -7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 23, 4, 10, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 67
		bodyModel[36].setRotationPoint(5F, -14F, -5F);
		bodyModel[36].rotateAngleZ = 0.08726646F;

		bodyModel[37].addShapeBox(0F, 4F, 0F, 23, 3, 8, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -2F, 0F, -2F); // Box 68
		bodyModel[37].setRotationPoint(5F, -14F, -4F);
		bodyModel[37].rotateAngleZ = 0.08726646F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 40, 2, 4, 0F,0F, 0F, 0F, 16F, 0F, 0F, 1F, -1F, 6F, -7F, 0F, 0F, 4F, 1F, 0F, 16F, 0F, 0F, 1F, 1F, 6F, 1F, 1F, 0F); // Box 71
		bodyModel[38].setRotationPoint(-33F, -17F, 3F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 40, 1, 4, 0F,4F, 1F, 0F, 16F, 2F, 0F, 1F, 1F, 6F, 1F, 1F, 0F, 0F, 0.4F, -0.5F, 16F, -1.5F, 0F, 1F, -1F, 6F, -2F, 0F, 0F); // Box 72
		bodyModel[39].setRotationPoint(-33F, -13F, 3F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 89
		bodyModel[40].setRotationPoint(2F, -40F, -1F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 18, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 90
		bodyModel[41].setRotationPoint(2F, -36F, -1F);
		bodyModel[41].rotateAngleZ = -0.12217305F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 6, 9, 2, 0F,0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 91
		bodyModel[42].setRotationPoint(-5F, -24F, -1F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 6, 18, 0F,0F, 0F, -7F, 0F, 0.5F, -7F, 0F, 0.5F, -7F, 0F, 0F, -7F, 0F, 0.8F, -2F, 0F, 0.8F, -2F, 0F, 0.8F, -2F, 0F, 0.8F, -2F); // Box 221
		bodyModel[43].setRotationPoint(-17F, -35.7F, -9F);
		bodyModel[43].rotateAngleZ = 0.27925268F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 222
		bodyModel[44].setRotationPoint(-13F, -36.4F, -1F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[45].setRotationPoint(-16.5F, -36.2F, -1F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 224
		bodyModel[46].setRotationPoint(-14F, -39.25F, -1F);

		bodyModel[47].addShapeBox(0F, 1F, 6F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 225
		bodyModel[47].setRotationPoint(-17F, -35.7F, -9.5F);
		bodyModel[47].rotateAngleZ = 0.27925268F;

		bodyModel[48].addShapeBox(0F, 1F, 11F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 226
		bodyModel[48].setRotationPoint(-17F, -35.7F, -10.5F);
		bodyModel[48].rotateAngleZ = 0.27925268F;

		bodyModel[49].addShapeBox(0F, 4F, 11F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 227
		bodyModel[49].setRotationPoint(-17F, -35.7F, -10F);
		bodyModel[49].rotateAngleZ = 0.27925268F;

		bodyModel[50].addShapeBox(0F, 4F, 6F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 228
		bodyModel[50].setRotationPoint(-17F, -35.7F, -10F);
		bodyModel[50].rotateAngleZ = 0.27925268F;

		bodyModel[51].addShapeBox(0F, 3F, 8.5F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 229
		bodyModel[51].setRotationPoint(-17F, -35.7F, -10F);
		bodyModel[51].rotateAngleZ = 0.27925268F;
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 3
		noseModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 4
		noseModel[2] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 5
		noseModel[3] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 7
		noseModel[4] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 8
		noseModel[5] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 9
		noseModel[6] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 10
		noseModel[7] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 11
		noseModel[8] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 12
		noseModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13
		noseModel[10] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 17
		noseModel[11] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 74
		noseModel[12] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 75
		noseModel[13] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Box 80
		noseModel[14] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 81
		noseModel[15] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 86
		noseModel[16] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 87
		noseModel[17] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 88
		noseModel[18] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 89
		noseModel[19] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 90
		noseModel[20] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 91
		noseModel[21] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 92
		noseModel[22] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 93
		noseModel[23] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 126
		noseModel[24] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 127
		noseModel[25] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 128
		noseModel[26] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 129
		noseModel[27] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 130
		noseModel[28] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 131

		noseModel[0].addShapeBox(0F, 0F, 0F, 14, 17, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 3
		noseModel[0].setRotationPoint(-54F, -31F, -7.5F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 10, 14, 15, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0.5F, -0.5F); // Box 4
		noseModel[1].setRotationPoint(-64F, -31F, -7.5F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 12, 14, 11, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -0.5F, 0F, -0.5F, -0.5F, -4.5F, -0.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, -0.5F, -4.5F, -0.5F); // Box 5
		noseModel[2].setRotationPoint(-76F, -31F, -5.5F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 14, 3, 15, 0F,0F, 0.2F, -4F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 0.2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		noseModel[3].setRotationPoint(-54F, -34F, -7.5F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 10, 3, 15, 0F,0F, -0.5F, -4.5F, 0F, 0.2F, -4F, 0F, 0.2F, -4F, 0F, -0.5F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 8
		noseModel[4].setRotationPoint(-64F, -34F, -7.5F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 12, 3, 11, 0F,-0.5F, -1.5F, -3.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, -0.5F, -1.5F, -3.5F, -0.5F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -0.5F, 0F, -0.5F); // Box 9
		noseModel[5].setRotationPoint(-76F, -34F, -5.5F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 9, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 10
		noseModel[6].setRotationPoint(-84.5F, -28F, -6F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 9, 4, 12, 0F,-4.5F, -1F, -4F, 0F, 0.2F, -4F, 0F, 0.2F, -4F, -4.5F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 11
		noseModel[7].setRotationPoint(-84.5F, -32F, -6F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 9, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4.5F, -1F, -4F, 0F, 0.2F, -4F, 0F, 0.2F, -4F, -4.5F, -1F, -4F); // Box 12
		noseModel[8].setRotationPoint(-84.5F, -24F, -6F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, -1.7F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.7F, -1.7F, 0F, -1.7F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.7F, -1.7F); // Box 13
		noseModel[9].setRotationPoint(-86.5F, -28F, -2F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 12, 2, 11, 0F,-0.5F, 2.5F, -0.5F, 0F, -2.5F, 1.5F, 0F, -2.5F, 1.5F, -0.5F, 2.5F, -0.5F, -0.5F, -2.2F, -3.5F, 0F, 2.5F, -2.5F, 0F, 2.5F, -2.5F, -0.5F, -2.2F, -3.5F); // Box 17
		noseModel[10].setRotationPoint(-76F, -19F, -5.5F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 25, 7, 4, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 3F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 3F, 0F, 1F); // Box 74
		noseModel[11].setRotationPoint(-64F, -24F, -10.5F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 5, 5, 4, 0F,0F, 0.5F, 0F, 0F, -1.5F, -1.5F, 4F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2F, -1.5F, 4F, -2.5F, 0F, 0F, 0F, 0F); // Box 75
		noseModel[12].setRotationPoint(-39F, -23F, -10.5F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 25, 7, 4, 0F,3F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 3F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 80
		noseModel[13].setRotationPoint(-64F, -24F, 6.5F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 5, 5, 4, 0F,0F, 0.5F, 0F, 4F, -2F, 0F, 0F, -1.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 4F, -2.5F, 0F, 0F, -2F, -1.5F, 0F, 0F, 0F); // Box 81
		noseModel[14].setRotationPoint(-39F, -23F, 6.5F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.8F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F); // Box 86
		noseModel[15].setRotationPoint(-64F, -29F, -9F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.8F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F); // Box 87
		noseModel[16].setRotationPoint(-61F, -29F, -9F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.8F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F); // Box 88
		noseModel[17].setRotationPoint(-58F, -29F, -9F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.8F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F); // Box 89
		noseModel[18].setRotationPoint(-55F, -29F, -9F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.8F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F); // Box 90
		noseModel[19].setRotationPoint(-52F, -29F, -9F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.8F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F); // Box 91
		noseModel[20].setRotationPoint(-49F, -29F, -9F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		noseModel[21].setRotationPoint(-55F, -35F, -4F);
		noseModel[21].rotateAngleZ = -0.03490659F;

		noseModel[22].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		noseModel[22].setRotationPoint(-55F, -35F, 3F);
		noseModel[22].rotateAngleZ = -0.03490659F;

		noseModel[23].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -2F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -2F); // Box 126
		noseModel[23].setRotationPoint(-64F, -29F, 5F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -2F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -2F); // Box 127
		noseModel[24].setRotationPoint(-61F, -29F, 5F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -2F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -2F); // Box 128
		noseModel[25].setRotationPoint(-58F, -29F, 5F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -2F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -2F); // Box 129
		noseModel[26].setRotationPoint(-55F, -29F, 5F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -2F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -2F); // Box 130
		noseModel[27].setRotationPoint(-52F, -29F, 5F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -2F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -2F); // Box 131
		noseModel[28].setRotationPoint(-49F, -29F, 5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 48
		tailModel[1] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 49
		tailModel[2] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 50
		tailModel[3] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 51
		tailModel[4] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 52
		tailModel[5] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 53
		tailModel[6] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 54
		tailModel[7] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 55
		tailModel[8] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 69
		tailModel[9] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 71
		tailModel[10] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 72
		tailModel[11] = new ModelRendererTurbo(this, 57, 201, textureX, textureY); // Box 82
		tailModel[12] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 83
		tailModel[13] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 84

		tailModel[0].addShapeBox(0F, 0F, 0F, 26, 11, 7, 0F,0F, 0F, 0F, 0.5F, -3F, -3F, 0.5F, -3F, -3F, 0F, 0F, 0F, 0F, 0.5F, 0F, -9F, -2.5F, -3F, -9F, -2.5F, -3F, 0F, 0.5F, 0F); // Box 48
		tailModel[0].setRotationPoint(61F, -31F, -3.5F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 26, 5, 7, 0F,0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0.5F, 3F, -3F, 0.5F, 3F, -3F, 0F, 0F, 0F); // Box 49
		tailModel[1].setRotationPoint(61F, -36F, -3.5F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		tailModel[2].setRotationPoint(59F, -41F, -0.5F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 14, 15, 1, 0F,-6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		tailModel[3].setRotationPoint(59F, -56F, -0.5F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		tailModel[4].setRotationPoint(65.5F, -60F, -0.5F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0.2F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		tailModel[5].setRotationPoint(74.5F, -60F, -0.5F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		tailModel[6].setRotationPoint(69.5F, -60F, -0.5F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		tailModel[7].setRotationPoint(72.5F, -60F, -0.5F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 10, 2, 27, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 69
		tailModel[8].setRotationPoint(64F, -36F, -27F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F,-2.5F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		tailModel[9].setRotationPoint(67F, -36F, -34F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F,0F, 0F, -0.5F, -2.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		tailModel[10].setRotationPoint(74F, -36F, -34F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 10, 2, 27, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 82
		tailModel[11].setRotationPoint(64F, -36F, 0F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -2F); // Box 83
		tailModel[12].setRotationPoint(67F, -36F, 27F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -2F, 0F, 0F, -0.5F); // Box 84
		tailModel[13].setRotationPoint(74F, -36F, 27F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 57
		leftWingModel[1] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 58
		leftWingModel[2] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 60
		leftWingModel[3] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 61
		leftWingModel[4] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 65
		leftWingModel[5] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 66

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 35, 2, 41, 0F,-8F, 0F, 0F, 0F, -1F, 0F, 6F, -1F, -6F, -7F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 6F, 1F, -6F, 1F, 1F, 0F); // Box 57
		leftWingModel[0].setRotationPoint(-33F, -17F, -48F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 20, 2, 40, 0F,-5F, 1F, 0F, 0F, 0.2F, 0F, 6F, -0.7F, 0F, -5F, 0F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 6F, 0F, 0F, 0F, 0F, 0F); // Box 58
		leftWingModel[1].setRotationPoint(-30F, -17F, -88F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 35, 2, 41, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 6F, -1F, -6F, 1F, -1F, 0F, -5F, 0F, 0F, 0F, -1F, 0F, 6F, 0F, -6F, -2F, 1F, 0F); // Box 60
		leftWingModel[2].setRotationPoint(-33F, -15F, -48F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 20, 2, 40, 0F,-3F, 1F, 0F, 0F, 1F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, 0F, -2F, 0F, 6F, -0.7F, 0F, -2F, 0F, 0F); // Box 61
		leftWingModel[3].setRotationPoint(-30F, -15F, -88F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 20, 1, 11, 0F,-9F, 0F, -2F, -3F, -0.3F, -2F, 2.5F, -0.7F, 0F, -5F, 0F, 0F, -6.5F, 1F, 0.5F, -1F, 1F, 0.5F, 4.5F, 1.2F, 0F, -3F, 1F, 0F); // Box 65
		leftWingModel[4].setRotationPoint(-30F, -18F, -99F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 20, 1, 11, 0F,-6.5F, 1F, 0.5F, -1F, 1F, 0.5F, 4.5F, 0.8F, 0F, -3F, 1F, 0F, -7.5F, -1.5F, -0.4F, -3F, -1.2F, -0.8F, 2.5F, -0.9F, 0F, -5F, -1F, 0F); // Box 66
		leftWingModel[5].setRotationPoint(-30F, -15F, -99F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 73
		rightWingModel[1] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 74
		rightWingModel[2] = new ModelRendererTurbo(this, 241, 185, textureX, textureY); // Box 75
		rightWingModel[3] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Box 76
		rightWingModel[4] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 77
		rightWingModel[5] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 78

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 35, 2, 41, 0F,-7F, 0F, 0F, 6F, -1F, -6F, 0F, -1F, 0F, -8F, 0F, 0F, 1F, 1F, 0F, 6F, 1F, -6F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 73
		rightWingModel[0].setRotationPoint(-33F, -17F, 7F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 20, 2, 40, 0F,-5F, 0F, 0F, 6F, -0.7F, 0F, 0F, 0.2F, 0F, -5F, 1F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F); // Box 74
		rightWingModel[1].setRotationPoint(-30F, -17F, 48F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 35, 2, 41, 0F,1F, -1F, 0F, 6F, -1F, -6F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 1F, 0F, 6F, 0F, -6F, 0F, -1F, 0F, -5F, 0F, 0F); // Box 75
		rightWingModel[2].setRotationPoint(-33F, -15F, 7F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 20, 2, 40, 0F,0F, 0F, 0F, 6F, 0F, 0F, 0F, 1F, 0F, -3F, 1F, 0F, -2F, 0F, 0F, 6F, -0.7F, 0F, 0F, -2F, 0F, -5F, -2F, 0F); // Box 76
		rightWingModel[3].setRotationPoint(-30F, -15F, 48F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 20, 1, 11, 0F,-5F, 0F, 0F, 2.5F, -0.7F, 0F, -3F, -0.3F, -2F, -9F, 0F, -2F, -3F, 1F, 0F, 4.5F, 1.2F, 0F, -1F, 1F, 0.5F, -6.5F, 1F, 0.5F); // Box 77
		rightWingModel[4].setRotationPoint(-30F, -18F, 88F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 20, 1, 11, 0F,-3F, 1F, 0F, 4.5F, 0.8F, 0F, -1F, 1F, 0.5F, -6.5F, 1F, 0.5F, -5F, -1F, 0F, 2.5F, -0.9F, 0F, -3F, -1.2F, -0.8F, -7.5F, -1.5F, -0.4F); // Box 78
		rightWingModel[5].setRotationPoint(-30F, -15F, 88F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 56
		yawFlapModel[1] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 106
		yawFlapModel[2] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 107
		yawFlapModel[3] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 232

		yawFlapModel[0].addShapeBox(0F, 0F, -0.5F, 6, 20, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F); // Box 56
		yawFlapModel[0].setRotationPoint(73F, -56F, 0F);

		yawFlapModel[1].addShapeBox(-4F, 0F, 2.5F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		yawFlapModel[1].setRotationPoint(-11F, -20.3F, 0F);
		yawFlapModel[1].rotateAngleZ = -0.43633231F;

		yawFlapModel[2].addShapeBox(-4F, 0F, -5.5F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		yawFlapModel[2].setRotationPoint(-11F, -20.3F, 0F);
		yawFlapModel[2].rotateAngleZ = -0.43633231F;

		yawFlapModel[3].addShapeBox(-3F, -0.95F, -7F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		yawFlapModel[3].setRotationPoint(-11F, -20.3F, 0F);
		yawFlapModel[3].rotateAngleZ = -0.43633231F;
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 73
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 108

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 6, 2, 25, 0F,0F, -0.2F, 0F, 0F, -0.5F, 0F, 2F, -0.5F, -1F, 0F, -0.2F, 1.5F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 2F, -0.5F, -1F, 0F, -0.2F, 1.5F); // Box 73
		pitchFlapLeftModel[0].setRotationPoint(74F, -36F, -27F);

		pitchFlapLeftModel[1].addShapeBox(-0.5F, -16F, -0.5F, 1, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		pitchFlapLeftModel[1].setRotationPoint(-7F, -16.5F, 0F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 113, 209, textureX, textureY); // Box 85

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 6, 2, 25, 0F,0F, -0.2F, 1.5F, 2F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1.5F, 2F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.2F, 0F); // Box 85
		pitchFlapRightModel[0].setRotationPoint(74F, -36F, 2F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 64

		pitchFlapLeftWingModel[0].addShapeBox(0F, -1F, -20F, 6, 2, 40, 0F,0F, 0.2F, 0F, -1.5F, -0.2F, -0.7F, -0.3F, -1F, 1F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1.5F, -1.2F, -0.7F, -0.3F, -0.3F, 1F, 0F, 0F, 0F); // Box 64
		pitchFlapLeftWingModel[0].setRotationPoint(-6.9F, -15.5F, -68F);
		pitchFlapLeftWingModel[0].rotateAngleY = -0.14835299F;
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 79

		pitchFlapRightWingModel[0].addShapeBox(0F, -1F, -20F, 6, 2, 40, 0F,0F, -0.5F, 0F, -0.3F, -1F, 1F, -1.5F, -0.2F, -0.7F, 0F, 0.2F, 0F, 0F, 0F, 0F, -0.3F, -0.3F, 1F, -1.5F, -1.2F, -0.7F, 0F, -1F, 0F); // Box 79
		pitchFlapRightWingModel[0].setRotationPoint(-6.9F, -15.5F, 68F);
		pitchFlapRightWingModel[0].rotateAngleY = 0.14835299F;
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 77
		tailWheelModel[1] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 78
		tailWheelModel[2] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 79
		tailWheelModel[3] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 80

		tailWheelModel[0].addShapeBox(-1F, 0F, 0F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		tailWheelModel[0].setRotationPoint(63F, -20F, -1F);
		tailWheelModel[0].rotateAngleZ = -0.6981317F;

		tailWheelModel[1].addShapeBox(-1F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		tailWheelModel[1].setRotationPoint(64.2F, -17.7F, -0.5F);

		tailWheelModel[2].addShapeBox(-1F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 79
		tailWheelModel[2].setRotationPoint(64.2F, -15.7F, -0.5F);

		tailWheelModel[3].addShapeBox(-1F, 0F, 0F, 6, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		tailWheelModel[3].setRotationPoint(64.2F, -19.7F, -0.5F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 95
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 96
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 97
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 98
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 99
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 100

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		leftWingWheelModel[0].setRotationPoint(-28F, 2.5F, -35F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		leftWingWheelModel[1].setRotationPoint(-28F, -1.5F, -35F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 97
		leftWingWheelModel[2].setRotationPoint(-28F, 6.5F, -35F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 13, 4, 1, 0F,0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 0F, 0F); // Box 98
		leftWingWheelModel[3].setRotationPoint(-28F, 1.5F, -36F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 13, 6, 1, 0F,-10F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 99
		leftWingWheelModel[4].setRotationPoint(-28F, -4.5F, -36F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 6, 9, 1, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		leftWingWheelModel[5].setRotationPoint(-18F, -13.5F, -36F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 100
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 101
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 102
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Box 103
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 104
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 105

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		rightWingWheelModel[0].setRotationPoint(-28F, 2.5F, 32F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		rightWingWheelModel[1].setRotationPoint(-28F, -1.5F, 32F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 102
		rightWingWheelModel[2].setRotationPoint(-28F, 6.5F, 32F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 13, 4, 1, 0F,0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 0F, 0F); // Box 103
		rightWingWheelModel[3].setRotationPoint(-28F, 1.5F, 35F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 13, 6, 1, 0F,-10F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 104
		rightWingWheelModel[4].setRotationPoint(-28F, -4.5F, 35F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 6, 9, 1, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		rightWingWheelModel[5].setRotationPoint(-18F, -13.5F, 35F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][3];
		propellerModels[0] = makeProp1(-78F, -26F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 186, 208, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 186, 208, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 186, 208, textureX, textureY);
		prop[0].addBox(-1F, -32F, -1.5F, 2, 32, 3, 0.0F);
		prop[1].addBox(-1F, -32F, -1.5F, 2, 32, 3, 0.0F);
		prop[2].addBox(-1F, -32F, -1.5F, 2, 32, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}