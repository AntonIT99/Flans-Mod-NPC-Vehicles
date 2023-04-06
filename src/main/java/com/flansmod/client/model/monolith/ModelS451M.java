//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: S451M
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelS451M extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelS451M() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[53];
		noseModel = new ModelRendererTurbo[7];
		tailModel = new ModelRendererTurbo[12];
		leftWingModel = new ModelRendererTurbo[11];
		rightWingModel = new ModelRendererTurbo[11];
		yawFlapModel = new ModelRendererTurbo[5];
		pitchFlapLeftModel = new ModelRendererTurbo[3];
		pitchFlapRightModel = new ModelRendererTurbo[2];
		tailWheelModel = new ModelRendererTurbo[4];
		leftWingWheelModel = new ModelRendererTurbo[8];
		rightWingWheelModel = new ModelRendererTurbo[8];
		leftWingPos1Model = new ModelRendererTurbo[2];
		leftWingPos2Model = new ModelRendererTurbo[2];
		rightWingPos1Model = new ModelRendererTurbo[4];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		inittailWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();
		initleftWingPos1Model_1();
		initleftWingPos2Model_1();
		initrightWingPos1Model_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 10
		bodyModel[1] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 11
		bodyModel[2] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 12
		bodyModel[3] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 13
		bodyModel[4] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 14
		bodyModel[5] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 16
		bodyModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 17
		bodyModel[7] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 18
		bodyModel[8] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 19
		bodyModel[9] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 20
		bodyModel[10] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 21
		bodyModel[11] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 22
		bodyModel[12] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 23
		bodyModel[13] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 24
		bodyModel[14] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 25
		bodyModel[15] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 26
		bodyModel[16] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 27
		bodyModel[17] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 28
		bodyModel[18] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 29
		bodyModel[19] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 30
		bodyModel[20] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 31
		bodyModel[21] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 32
		bodyModel[22] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 33
		bodyModel[23] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 34
		bodyModel[24] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 35
		bodyModel[25] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 36
		bodyModel[26] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 37
		bodyModel[27] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 38
		bodyModel[28] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 39
		bodyModel[29] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 40
		bodyModel[30] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 42
		bodyModel[31] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 43
		bodyModel[32] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 44
		bodyModel[33] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 45
		bodyModel[34] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 46
		bodyModel[35] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 47
		bodyModel[36] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 48
		bodyModel[37] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 63
		bodyModel[38] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 67
		bodyModel[39] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 68
		bodyModel[40] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 87
		bodyModel[41] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 221
		bodyModel[42] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 222
		bodyModel[43] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 223
		bodyModel[44] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 224
		bodyModel[45] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 225
		bodyModel[46] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 226
		bodyModel[47] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 227
		bodyModel[48] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 228
		bodyModel[49] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 229
		bodyModel[50] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 89
		bodyModel[51] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 90
		bodyModel[52] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 91

		bodyModel[0].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, 1F, 0F); // Box 10
		bodyModel[0].setRotationPoint(-52.5F, -16F, -6F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F,0F, 0F, -3.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 11
		bodyModel[1].setRotationPoint(-52.5F, -20F, -6F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 8, 3, 12, 0F,0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0.8F, -3.5F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, 0.8F, -3.5F); // Box 12
		bodyModel[2].setRotationPoint(-52.5F, -11F, -6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 11, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[3].setRotationPoint(-44.5F, -16F, -7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 11, 4, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, -4F); // Box 14
		bodyModel[4].setRotationPoint(-44.5F, -9F, -7F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0.5F, -3.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, 1.5F, 0F, 0.5F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[5].setRotationPoint(-44.5F, -20F, -7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0.5F, -1.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[6].setRotationPoint(-40.5F, -18F, -7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 10, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[7].setRotationPoint(-33.5F, -16F, -7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 10, 4, 14, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.5F, -4F, 0F, 0.5F, -4F, 0F, 0F, -4F); // Box 19
		bodyModel[8].setRotationPoint(-33.5F, -7F, -7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[9].setRotationPoint(-33.5F, -17F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 20, 10, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[10].setRotationPoint(-23.5F, -16F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 20, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F); // Box 22
		bodyModel[11].setRotationPoint(-23.5F, -6F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 20, 2, 14, 0F,0F, -0.5F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[12].setRotationPoint(-23.5F, -18F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 10, 5, 12, 0F,-3.5F, 2F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, -3.5F, 2F, -3F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F); // Box 24
		bodyModel[13].setRotationPoint(-23.5F, -22.5F, -6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F,0F, 0F, -2F, 0.5F, -4.9F, -3.2F, 0.5F, -4.9F, -3.2F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0F, 0F, 0F); // Box 25
		bodyModel[14].setRotationPoint(-13.5F, -22.5F, -4F);

		bodyModel[15].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[15].setRotationPoint(-38.5F, -25.5F, -1.5F);
		bodyModel[15].rotateAngleY = 0.2443461F;
		bodyModel[15].rotateAngleZ = -0.82030475F;

		bodyModel[16].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[16].setRotationPoint(-38.5F, -25.5F, 1.5F);
		bodyModel[16].rotateAngleY = -0.2443461F;
		bodyModel[16].rotateAngleZ = -0.82030475F;

		bodyModel[17].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[17].setRotationPoint(-38.5F, -25.8F, -1.5F);

		bodyModel[18].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[18].setRotationPoint(-35F, -27F, -1.5F);

		bodyModel[19].addShapeBox(-3.5F, -0.5F, -0.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[19].setRotationPoint(-35F, -26.5F, -1.5F);
		bodyModel[19].rotateAngleZ = 0.34906585F;

		bodyModel[20].addShapeBox(-3.5F, -0.5F, -0.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[20].setRotationPoint(-35F, -26.5F, 1.5F);
		bodyModel[20].rotateAngleZ = 0.34906585F;

		bodyModel[21].addShapeBox(-0.5F, 0F, -0.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[21].setRotationPoint(-35F, -27F, -1.5F);
		bodyModel[21].rotateAngleX = -0.41887902F;
		bodyModel[21].rotateAngleZ = 0.12217305F;

		bodyModel[22].addShapeBox(-0.5F, 0F, -0.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[22].setRotationPoint(-35F, -27F, 1.5F);
		bodyModel[22].rotateAngleX = 0.41887902F;
		bodyModel[22].rotateAngleZ = 0.12217305F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 19, 8, 14, 0F,0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 34
		bodyModel[23].setRotationPoint(-3.5F, -14F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 19, 4, 14, 0F,0F, 0F, -3F, 0F, -1.5F, -3.5F, 0F, -1.5F, -3.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F); // Box 35
		bodyModel[24].setRotationPoint(-3.5F, -18F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 19, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4F); // Box 36
		bodyModel[25].setRotationPoint(-3.5F, -6F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 19, 8, 12, 0F,0F, -1F, 0.5F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F); // Box 37
		bodyModel[26].setRotationPoint(15.5F, -14F, -6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 19, 3, 12, 0F,0F, -0.5F, -2.5F, 0F, -4.5F, -4F, 0F, -4.5F, -4F, 0F, -0.5F, -2.5F, 0F, 1F, 0.5F, 0F, 4F, -1.5F, 0F, 4F, -1.5F, 0F, 1F, 0.5F); // Box 38
		bodyModel[27].setRotationPoint(15.5F, -17F, -6F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 0.4F, 0.4F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 0.4F, 0.4F); // Box 39
		bodyModel[28].setRotationPoint(-47.5F, -6.5F, -1F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, -0.2F, -0.2F); // Box 40
		bodyModel[29].setRotationPoint(-61.5F, -6.5F, -1F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 42
		bodyModel[30].setRotationPoint(-64.5F, -6.5F, -1F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 11, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[31].setRotationPoint(-44.5F, -16F, 6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0.5F, 3.5F, 0F, -1.5F, 1.5F, 0F, -1.5F, -1.5F, 0F, 0.5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[32].setRotationPoint(-44.5F, -20F, 6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0.5F, 1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[33].setRotationPoint(-40.5F, -18F, 6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 10, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[34].setRotationPoint(-33.5F, -16F, 6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[35].setRotationPoint(-33.5F, -17F, 6F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 19, 3, 9, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0.5F, -2F, 0F, 0F, -2.5F, 0F, 0F, -3F, 0F, 0.5F, -2F); // Box 48
		bodyModel[36].setRotationPoint(15.5F, -6F, -4.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 30, 4, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 1F, 1F, 1F, 1F, 1F); // Box 63
		bodyModel[37].setRotationPoint(-21.5F, -10F, -9F);

		bodyModel[38].addShapeBox(-0.5F, 0F, -0.5F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[38].setRotationPoint(-35F, -27F, 0F);

		bodyModel[39].addShapeBox(-0.5F, -0.5F, -0.5F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[39].setRotationPoint(-27F, -26.5F, 0F);
		bodyModel[39].rotateAngleZ = -0.34906585F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 30, 4, 3, 0F,1F, 0.5F, 0F, 2F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 1F, 2F, 1F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[40].setRotationPoint(-21.5F, -10F, 6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 6, 18, 0F,0F, 0F, -6F, 0F, 0.5F, -6F, 0F, 0.5F, -6F, 0F, 0F, -6F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 221
		bodyModel[41].setRotationPoint(-45F, -20F, -9F);
		bodyModel[41].rotateAngleZ = 0.27925268F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 222
		bodyModel[42].setRotationPoint(-41F, -20.7F, -1F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[43].setRotationPoint(-44.5F, -20.5F, -1F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 224
		bodyModel[44].setRotationPoint(-42F, -23.55F, -1F);

		bodyModel[45].addShapeBox(0F, 1F, 6F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 225
		bodyModel[45].setRotationPoint(-45F, -20F, -9.5F);
		bodyModel[45].rotateAngleZ = 0.27925268F;

		bodyModel[46].addShapeBox(0F, 1F, 11F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 226
		bodyModel[46].setRotationPoint(-45F, -20F, -10.5F);
		bodyModel[46].rotateAngleZ = 0.27925268F;

		bodyModel[47].addShapeBox(0F, 4F, 11F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 227
		bodyModel[47].setRotationPoint(-45F, -20F, -10F);
		bodyModel[47].rotateAngleZ = 0.27925268F;

		bodyModel[48].addShapeBox(0F, 4F, 6F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 228
		bodyModel[48].setRotationPoint(-45F, -20F, -10F);
		bodyModel[48].rotateAngleZ = 0.27925268F;

		bodyModel[49].addShapeBox(0F, 3F, 8.5F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 229
		bodyModel[49].setRotationPoint(-45F, -20F, -10F);
		bodyModel[49].rotateAngleZ = 0.27925268F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 89
		bodyModel[50].setRotationPoint(-25F, -24F, -1F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 12, 4, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 90
		bodyModel[51].setRotationPoint(-25F, -20F, -2F);
		bodyModel[51].rotateAngleZ = -0.12217305F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 9, 8, 6, 0F,0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 91
		bodyModel[52].setRotationPoint(-35F, -14F, -3F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		noseModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
		noseModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 4
		noseModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		noseModel[4] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 7
		noseModel[5] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 8
		noseModel[6] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 9

		noseModel[0].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -3F); // Box 2
		noseModel[0].setRotationPoint(-63.5F, -16F, -4.5F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F,-2F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 3
		noseModel[1].setRotationPoint(-63.5F, -19F, -4.5F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F,0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, -2F, -0.5F, -3F, 0F, 1F, -3F, 0F, 1F, -3F, -2F, -0.5F, -3F); // Box 4
		noseModel[2].setRotationPoint(-63.5F, -13F, -4.5F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -1F); // Box 5
		noseModel[3].setRotationPoint(-64.5F, -16F, -1.5F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, -3F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F); // Box 7
		noseModel[4].setRotationPoint(-58.5F, -19F, -4.5F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 2F, 1.5F, 0F, 2F, 1.5F, 0F, 0.5F, 0F); // Box 8
		noseModel[5].setRotationPoint(-58.5F, -16F, -4.5F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 6, 4, 9, 0F,0F, -0.5F, 0F, 0F, -2F, 1.5F, 0F, -2F, 1.5F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 1.8F, -2F, 0F, 1.8F, -2F, 0F, 0F, -3F); // Box 9
		noseModel[6].setRotationPoint(-58.5F, -13F, -4.5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 49
		tailModel[1] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 50
		tailModel[2] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 51
		tailModel[3] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 52
		tailModel[4] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 53
		tailModel[5] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 54
		tailModel[6] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 55
		tailModel[7] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 58
		tailModel[8] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 59
		tailModel[9] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 60
		tailModel[10] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 61
		tailModel[11] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 109

		tailModel[0].addShapeBox(0F, 0F, 0F, 19, 4, 9, 0F,0F, 0F, 0F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 0F, 0F); // Box 49
		tailModel[0].setRotationPoint(34.5F, -10F, -4.5F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 19, 2, 9, 0F,0F, 0.5F, -2.5F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 3F, -4F, 0F, 3F, -4F, 0F, 0F, 0F); // Box 50
		tailModel[1].setRotationPoint(34.5F, -12F, -4.5F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 19, 2, 9, 0F,0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 1F, -2.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, -2.5F); // Box 51
		tailModel[2].setRotationPoint(34.5F, -6F, -4.5F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 0F, 0F, 4F, -0.3F, 0F, 4F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 52
		tailModel[3].setRotationPoint(53.5F, -8F, -0.5F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,-1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -0.8F, 0F, 0F, 4F, 0.3F, 0F, 4F, 0.3F, 0F, -0.8F, 0F, 0F); // Box 53
		tailModel[4].setRotationPoint(53.5F, -11F, -0.5F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 7, 21, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		tailModel[5].setRotationPoint(47.5F, -29F, -0.5F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 55
		tailModel[6].setRotationPoint(45.5F, -14.5F, -20.5F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 8, 21, 1, 0F,0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		tailModel[7].setRotationPoint(39.5F, -29F, -0.5F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 32, 6, 1, 0F,0F, -0.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		tailModel[8].setRotationPoint(7.5F, -17F, -0.5F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,-2F, -0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		tailModel[9].setRotationPoint(47.5F, -31F, -0.5F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0.5F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 61
		tailModel[10].setRotationPoint(52.5F, -31F, -0.5F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 20, 0F,4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		tailModel[11].setRotationPoint(45.5F, -14.5F, 0.5F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 64
		leftWingModel[1] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 69
		leftWingModel[2] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 71
		leftWingModel[3] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 72
		leftWingModel[4] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 74
		leftWingModel[5] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 75
		leftWingModel[6] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 77
		leftWingModel[7] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 78
		leftWingModel[8] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 129
		leftWingModel[9] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 130
		leftWingModel[10] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 131

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 26, 4, 17, 0F,-0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F); // Box 64
		leftWingModel[0].setRotationPoint(-21.5F, -10F, -26F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 7, 3, 9, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 69
		leftWingModel[1].setRotationPoint(-27F, -10.5F, -30.5F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 7, 3, 9, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -3F); // Box 71
		leftWingModel[2].setRotationPoint(-27F, -7.5F, -30.5F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 15, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 72
		leftWingModel[3].setRotationPoint(-20F, -10.5F, -30.5F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 15, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 74
		leftWingModel[4].setRotationPoint(-20F, -7.5F, -30.5F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 11, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 75
		leftWingModel[5].setRotationPoint(-5F, -10.5F, -29.5F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 11, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.9F, -2F, 0F, -2.9F, -2F, 0F, 0F, -2F); // Box 77
		leftWingModel[6].setRotationPoint(-5F, -7.5F, -29.5F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		leftWingModel[7].setRotationPoint(5.5F, -9.5F, -26.5F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 15, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 129
		leftWingModel[8].setRotationPoint(-20F, -13.5F, -30.5F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 7, 3, 9, 0F,0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 130
		leftWingModel[9].setRotationPoint(-27F, -13.5F, -30.5F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 11, 3, 7, 0F,0F, 0F, -2F, 0F, -2.9F, -2F, 0F, -2.9F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 131
		leftWingModel[10].setRotationPoint(-5F, -13.5F, -29.5F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 88
		rightWingModel[1] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 132
		rightWingModel[2] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 133
		rightWingModel[3] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 134
		rightWingModel[4] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 135
		rightWingModel[5] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 136
		rightWingModel[6] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 137
		rightWingModel[7] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 138
		rightWingModel[8] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 139
		rightWingModel[9] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 140
		rightWingModel[10] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 141

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 26, 4, 17, 0F,0F, 0F, 0F, 3.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F); // Box 88
		rightWingModel[0].setRotationPoint(-21.5F, -10F, 9F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 7, 3, 9, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 132
		rightWingModel[1].setRotationPoint(-27F, -10.5F, 21.5F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 7, 3, 9, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -3F); // Box 133
		rightWingModel[2].setRotationPoint(-27F, -7.5F, 21.5F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 15, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 134
		rightWingModel[3].setRotationPoint(-20F, -10.5F, 21.5F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 15, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 135
		rightWingModel[4].setRotationPoint(-20F, -7.5F, 21.5F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 11, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 136
		rightWingModel[5].setRotationPoint(-5F, -10.5F, 22.5F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 11, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.9F, -2F, 0F, -2.9F, -2F, 0F, 0F, -2F); // Box 137
		rightWingModel[6].setRotationPoint(-5F, -7.5F, 22.5F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		rightWingModel[7].setRotationPoint(5.5F, -9.5F, 25.5F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 15, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 139
		rightWingModel[8].setRotationPoint(-20F, -13.5F, 21.5F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 7, 3, 9, 0F,0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 140
		rightWingModel[9].setRotationPoint(-27F, -13.5F, 21.5F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 11, 3, 7, 0F,0F, 0F, -2F, 0F, -2.9F, -2F, 0F, -2.9F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 141
		rightWingModel[10].setRotationPoint(-5F, -13.5F, 22.5F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 62
		yawFlapModel[1] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 106
		yawFlapModel[2] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 107
		yawFlapModel[3] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 232
		yawFlapModel[4] = new ModelRendererTurbo(this, 176, 114, textureX, textureY); // Box 132

		yawFlapModel[0].addShapeBox(0F, 0F, -0.5F, 7, 18, 1, 0F,0F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 4F, 3F, -0.2F, 4F, 3F, -0.2F, 0F, 0F, -0.2F); // Box 62
		yawFlapModel[0].setRotationPoint(55.5F, -29F, 0F);
		yawFlapModel[0].rotateAngleZ = -0.05235988F;

		yawFlapModel[1].addShapeBox(-4F, 0F, 2.5F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		yawFlapModel[1].setRotationPoint(-40F, -9F, 0F);
		yawFlapModel[1].rotateAngleZ = -0.43633231F;

		yawFlapModel[2].addShapeBox(-4F, 0F, -5.5F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		yawFlapModel[2].setRotationPoint(-40F, -9F, 0F);
		yawFlapModel[2].rotateAngleZ = -0.43633231F;

		yawFlapModel[3].addShapeBox(-3F, -0.95F, -6.5F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		yawFlapModel[3].setRotationPoint(-40F, -8.8F, 0F);
		yawFlapModel[3].rotateAngleZ = -0.43633231F;

		yawFlapModel[4].addShapeBox(-0.1F, 8F, -0.5F, 5, 3, 1, 0F,0F, 1F, -0.1F, 3F, 1F, -0.1F, 3F, 1F, -0.1F, 0F, 1F, -0.1F, 0F, 1F, -0.1F, 4.2F, 1F, -0.1F, 4.2F, 1F, -0.1F, 0F, 1F, -0.1F); // Box 132
		yawFlapModel[4].setRotationPoint(55.5F, -29F, 0F);
		yawFlapModel[4].rotateAngleZ = -0.05235988F;
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 56
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 57
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 108

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 21, 0F,0F, -0.1F, 0F, -1F, -0.1F, 0F, 2F, -0.1F, 0.5F, 0F, -0.1F, 1F, 0F, -0.1F, 0F, -1F, -0.1F, 0F, 2F, -0.1F, 0.5F, 0F, -0.1F, 1F); // Box 56
		pitchFlapLeftModel[0].setRotationPoint(49.5F, -14.5F, -23.5F);

		pitchFlapLeftModel[1].addShapeBox(-3F, 0F, 0F, 3, 1, 3, 0F,0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 1F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 1F, -0.1F, 0F); // Box 57
		pitchFlapLeftModel[1].setRotationPoint(49.5F, -14.5F, -23.5F);

		pitchFlapLeftModel[2].addShapeBox(-0.5F, -16F, -0.5F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		pitchFlapLeftModel[2].setRotationPoint(-36F, -5F, 0F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 110
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 111

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 21, 0F,0F, -0.1F, 1F, 2F, -0.1F, 0.5F, -1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 2F, -0.1F, 0.5F, -1F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 110
		pitchFlapRightModel[0].setRotationPoint(49.5F, -14.5F, 2.5F);

		pitchFlapRightModel[1].addShapeBox(-3F, 0F, 0F, 3, 1, 3, 0F,1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.3F, -0.1F, 0F, 1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.3F, -0.1F, 0F); // Box 111
		pitchFlapRightModel[1].setRotationPoint(49.5F, -14.5F, 20.5F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 77
		tailWheelModel[1] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 78
		tailWheelModel[2] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 79
		tailWheelModel[3] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 80

		tailWheelModel[0].addShapeBox(-1F, 0F, 0F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		tailWheelModel[0].setRotationPoint(54F, -5F, -1F);
		tailWheelModel[0].rotateAngleZ = -0.6981317F;

		tailWheelModel[1].addShapeBox(-1F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		tailWheelModel[1].setRotationPoint(55.2F, -2.7F, -0.5F);

		tailWheelModel[2].addShapeBox(-1F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 79
		tailWheelModel[2].setRotationPoint(55.2F, -0.699999999999999F, -0.5F);

		tailWheelModel[3].addShapeBox(-1F, 0F, 0F, 6, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		tailWheelModel[3].setRotationPoint(55.2F, -4.7F, -0.5F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 79
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 80
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 81
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 82
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 83
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 84
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 85
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 86

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		leftWingWheelModel[0].setRotationPoint(-22F, 4F, -18.5F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 80
		leftWingWheelModel[1].setRotationPoint(-22F, 7F, -18.5F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		leftWingWheelModel[2].setRotationPoint(-22F, 1F, -18.5F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		leftWingWheelModel[3].setRotationPoint(-22.5F, 0F, -20F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 83
		leftWingWheelModel[4].setRotationPoint(-22.5F, 3F, -20F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 84
		leftWingWheelModel[5].setRotationPoint(-18.5F, -6F, -20F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		leftWingWheelModel[6].setRotationPoint(-18F, -7F, -19F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 86
		leftWingWheelModel[7].setRotationPoint(-18F, -7F, -13F);
		leftWingWheelModel[7].rotateAngleX = -0.78539816F;
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 101
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 102
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 103
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 104
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 105
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 106
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 107
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 108

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		rightWingWheelModel[0].setRotationPoint(-22F, 4F, 15.5F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 102
		rightWingWheelModel[1].setRotationPoint(-22F, 7F, 15.5F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		rightWingWheelModel[2].setRotationPoint(-22F, 1F, 15.5F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		rightWingWheelModel[3].setRotationPoint(-22.5F, 0F, 19F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 105
		rightWingWheelModel[4].setRotationPoint(-22.5F, 3F, 19F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 106
		rightWingWheelModel[5].setRotationPoint(-18.5F, -6F, 19F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		rightWingWheelModel[6].setRotationPoint(-18F, -7F, 18F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 108
		rightWingWheelModel[7].setRotationPoint(-18F, -7F, 12.5F);
		rightWingWheelModel[7].rotateAngleX = 0.78539816F;
	}

	private void initleftWingPos1Model_1()
	{
		leftWingPos1Model[0] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 65
		leftWingPos1Model[1] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 66

		leftWingPos1Model[0].addShapeBox(0F, 0F, -36F, 26, 3, 36, 0F,-2F, 1.5F, 0F, -11F, 1.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, -3F, 0F, -11F, -3F, 0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 65
		leftWingPos1Model[0].setRotationPoint(-21.5F, -10.5F, -26F);

		leftWingPos1Model[1].addShapeBox(0F, 0F, -38F, 13, 1, 2, 0F,-2F, 0.2F, 0F, -6F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F); // Box 66
		leftWingPos1Model[1].setRotationPoint(-19.5F, -12F, -26F);
	}

	private void initleftWingPos2Model_1()
	{
		leftWingPos2Model[0] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 142
		leftWingPos2Model[1] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 143

		leftWingPos2Model[0].addShapeBox(0F, -1F, -36F, 26, 3, 36, 0F,-2F, 1.5F, 0F, -11F, 1.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, -3F, 0F, -11F, -3F, 0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 142
		leftWingPos2Model[0].setRotationPoint(-21.5F, -13.5F, -28F);
		leftWingPos2Model[0].rotateAngleX = -1.91986218F;

		leftWingPos2Model[1].addShapeBox(0F, -2.5F, -38F, 13, 1, 2, 0F,-2F, 0.2F, 0F, -6F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F); // Box 143
		leftWingPos2Model[1].setRotationPoint(-19.5F, -13.5F, -28F);
		leftWingPos2Model[1].rotateAngleX = -1.91986218F;
	}

	private void initrightWingPos1Model_1()
	{
		rightWingPos1Model[0] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 146
		rightWingPos1Model[1] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 147
		rightWingPos1Model[2] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 148
		rightWingPos1Model[3] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 149

		rightWingPos1Model[0].addShapeBox(0F, 0F, 0F, 26, 3, 36, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -11F, 1.5F, 0.5F, -2F, 1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -11F, -3F, 0.5F, -2F, -3F, 0F); // Box 146
		rightWingPos1Model[0].setRotationPoint(-21.5F, -10.5F, 26F);

		rightWingPos1Model[1].addShapeBox(0F, 0F, 36F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, -6F, 0.2F, 0F, -2F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -6F, 0F, 0F, -2F, 0F, 0F); // Box 147
		rightWingPos1Model[1].setRotationPoint(-19.5F, -12F, 26F);

		rightWingPos1Model[2].addShapeBox(0F, 0F, 0F, 26, 3, 36, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -11F, 1.5F, 0.5F, -2F, 1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -11F, -3F, 0.5F, -2F, -3F, 0F); // Box 148
		rightWingPos1Model[2].setRotationPoint(-21.5F, -13.5F, 28F);
		rightWingPos1Model[2].rotateAngleX = 1.91986218F;

		rightWingPos1Model[3].addShapeBox(0F, -1.5F, 36F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, -6F, 0.2F, 0F, -2F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -6F, 0F, 0F, -2F, 0F, 0F); // Box 149
		rightWingPos1Model[3].setRotationPoint(-19.5F, -13.5F, 28F);
		rightWingPos1Model[3].rotateAngleX = 1.91986218F;
	}
}