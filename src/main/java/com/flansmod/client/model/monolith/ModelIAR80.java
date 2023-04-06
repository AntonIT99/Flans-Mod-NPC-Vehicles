//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: IAR80
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelIAR80 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 256;

	public ModelIAR80() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[48];
		noseModel = new ModelRendererTurbo[13];
		tailModel = new ModelRendererTurbo[3];
		leftWingModel = new ModelRendererTurbo[4];
		rightWingModel = new ModelRendererTurbo[4];
		yawFlapModel = new ModelRendererTurbo[4];
		pitchFlapLeftModel = new ModelRendererTurbo[2];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		leftWingWheelModel = new ModelRendererTurbo[4];
		rightWingWheelModel = new ModelRendererTurbo[4];

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
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 9
		bodyModel[1] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 10
		bodyModel[2] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 12
		bodyModel[3] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 13
		bodyModel[4] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 14
		bodyModel[5] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 15
		bodyModel[6] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 16
		bodyModel[7] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 17
		bodyModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 19
		bodyModel[9] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 20
		bodyModel[10] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 21
		bodyModel[11] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 22
		bodyModel[12] = new ModelRendererTurbo(this, 793, 17, textureX, textureY); // Box 23
		bodyModel[13] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 24
		bodyModel[14] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 25
		bodyModel[15] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 26
		bodyModel[16] = new ModelRendererTurbo(this, 561, 25, textureX, textureY); // Box 27
		bodyModel[17] = new ModelRendererTurbo(this, 777, 33, textureX, textureY); // Box 28
		bodyModel[18] = new ModelRendererTurbo(this, 881, 33, textureX, textureY); // Box 29
		bodyModel[19] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 30
		bodyModel[20] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 33
		bodyModel[21] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 36
		bodyModel[22] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 37
		bodyModel[23] = new ModelRendererTurbo(this, 985, 9, textureX, textureY); // Box 38
		bodyModel[24] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 40
		bodyModel[25] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 41
		bodyModel[26] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 75
		bodyModel[27] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 78
		bodyModel[28] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 79
		bodyModel[29] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 81
		bodyModel[30] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 89
		bodyModel[31] = new ModelRendererTurbo(this, 977, 33, textureX, textureY); // Box 90
		bodyModel[32] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 91
		bodyModel[33] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 92
		bodyModel[34] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 93
		bodyModel[35] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 94
		bodyModel[36] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Box 95
		bodyModel[37] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 96
		bodyModel[38] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 97
		bodyModel[39] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 98
		bodyModel[40] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 99
		bodyModel[41] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 100
		bodyModel[42] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 101
		bodyModel[43] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 102
		bodyModel[44] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 103
		bodyModel[45] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 104
		bodyModel[46] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 105
		bodyModel[47] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 128

		bodyModel[0].addShapeBox(0F, 0F, 0F, 37, 10, 22, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F); // Box 9
		bodyModel[0].setRotationPoint(-63F, -31F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 37, 6, 10, 0F,0F, 2.5F, 1F, 2F, 3F, -1F, 2F, 3F, -1F, 0F, 2.5F, 1F, 0F, 0F, 8F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 8F); // Box 10
		bodyModel[1].setRotationPoint(-63F, -37F, -5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 37, 7, 10, 0F,0F, 0F, 6F, 0F, -2F, 6F, 0F, -2F, 6F, 0F, 0F, 6F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 12
		bodyModel[2].setRotationPoint(-63F, -21F, -5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 7, 12, 0F,0F, 0F, 6.5F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 6.5F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, -1F); // Box 13
		bodyModel[3].setRotationPoint(-67F, -21F, -6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 8, 12, 0F,0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 6.5F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 6.5F); // Box 14
		bodyModel[4].setRotationPoint(-67F, -39F, -6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 10, 26, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 15
		bodyModel[5].setRotationPoint(-67F, -31F, -13F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 24, 13, 1, 0F,0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 0F); // Box 16
		bodyModel[6].setRotationPoint(-26F, -31F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 24, 5, 10, 0F,0F, 0F, 6F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, 0F, 0F); // Box 17
		bodyModel[7].setRotationPoint(-26F, -19F, -5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 8, 9, 1, 0F,0F, 0F, -5.5F, 0F, -5F, -3F, 0F, -5F, 3F, 0F, 0F, 5.5F, 0F, 0F, 1F, 0F, 0F, 0.4F, 0F, 0F, 0.15F, 0F, 0F, 0F); // Box 19
		bodyModel[8].setRotationPoint(-21F, -40F, -9.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, 0F, -3F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.3F, 0F, 0F, 0.15F); // Box 20
		bodyModel[9].setRotationPoint(-13F, -35F, -9.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -3.5F, 0F, 2F, -6F, 0F, 2F, 6F, 0F, 0F, 3.5F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.3F); // Box 21
		bodyModel[10].setRotationPoint(-3F, -35F, -9.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 42, 12, 18, 0F,0F, 0F, 0F, 0F, 1.5F, -4.5F, 0F, 1.5F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4.5F, 0F, -4F, -4.5F, 0F, 0F, 0F); // Box 22
		bodyModel[11].setRotationPoint(-2F, -31F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 24, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, 1F); // Box 23
		bodyModel[12].setRotationPoint(-26F, -31F, 9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 8, 9, 1, 0F,0F, 0F, 5.5F, 0F, -5F, 3F, 0F, -5F, -3F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.4F, 0F, 0F, 1F); // Box 24
		bodyModel[13].setRotationPoint(-21F, -40F, 8.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, 0F, 3F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, -3F, 0F, 0F, 0.15F, 0F, 0F, 0.3F, 0F, 0F, -0.4F, 0F, 0F, 0.4F); // Box 25
		bodyModel[14].setRotationPoint(-13F, -35F, 8.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 3.5F, 0F, 2F, 6F, 0F, 2F, -6F, 0F, 0F, -3.5F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.4F); // Box 26
		bodyModel[15].setRotationPoint(-3F, -35F, 8.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 42, 4, 18, 0F,0F, 0F, 0F, 0F, 4F, -4.5F, 0F, 4F, -4.5F, 0F, 0F, 0F, 0F, -0.5F, -6F, 0F, -4F, -7.5F, 0F, -4F, -7.5F, 0F, -0.5F, -6F); // Box 27
		bodyModel[16].setRotationPoint(-2F, -19F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 42, 6, 18, 0F,0F, 0F, -5.5F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, -1.5F, -4.5F, 0F, -1.5F, -4.5F, 0F, 0F, 0F); // Box 28
		bodyModel[17].setRotationPoint(-2F, -37F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 42, 3, 5, 0F,0F, 0F, -0.5F, 0F, -5F, -1.5F, 0F, -5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F); // Box 29
		bodyModel[18].setRotationPoint(-2F, -40F, -2.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 42, 2, 4, 0F,0F, 0F, -1.5F, 0F, -5F, -1.5F, 0F, -5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F); // Box 30
		bodyModel[19].setRotationPoint(-2F, -42F, -2F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 21, 6, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.5F, 0.5F, 0F, -5.5F, -2F, 0F, -5.5F, -2F, 0F, -1.5F, 0.5F); // Box 33
		bodyModel[20].setRotationPoint(40F, -37F, -4F);

		bodyModel[21].addShapeBox(0F, 0F, -1F, 16, 19, 2, 0F,-7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F); // Box 36
		bodyModel[21].setRotationPoint(45F, -56F, 0F);

		bodyModel[22].addShapeBox(0F, 0F, -1F, 15, 3, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[22].setRotationPoint(52F, -59F, 0F);

		bodyModel[23].addShapeBox(0F, 0F, -1F, 11, 2, 2, 0F,-4F, -0.2F, 0F, -4F, -0.2F, 0F, -4F, -0.2F, 0F, -4F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[23].setRotationPoint(54F, -61F, 0F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 16, 2, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -1F); // Box 40
		bodyModel[24].setRotationPoint(41F, -35.5F, 0F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 16, 2, 32, 0F,-10F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[25].setRotationPoint(41F, -35.5F, -32F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[26].setRotationPoint(-17.5F, -44.5F, 3F);
		bodyModel[26].rotateAngleX = 0.2443461F;
		bodyModel[26].rotateAngleZ = 0.36651914F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[27].setRotationPoint(-17.5F, -44.5F, -4F);
		bodyModel[27].rotateAngleX = -0.2443461F;
		bodyModel[27].rotateAngleZ = 0.36651914F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 1F, 4F, 0F, 1F); // Box 79
		bodyModel[28].setRotationPoint(-17.5F, -44.5F, -4.7F);
		bodyModel[28].rotateAngleZ = -0.10471976F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[29].setRotationPoint(-17.5F, -44.5F, -2.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[30].setRotationPoint(-3F, -42F, -2F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 18, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[31].setRotationPoint(-3F, -38F, -3F);
		bodyModel[31].rotateAngleZ = -0.12217305F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 8, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[32].setRotationPoint(-12F, -28F, -3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,-2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -2F, 0F, 3F, 0F, 0F, 6F, 0F, 0F, 5.5F, 0F, 0F, -4.5F, 0F, 0F, -5F); // Box 92
		bodyModel[33].setRotationPoint(-26F, -40F, -5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,-2F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -4.5F, 0F, 0F, 5.5F, 0F, 0F, 6F); // Box 93
		bodyModel[34].setRotationPoint(-26F, -40F, 4F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 94
		bodyModel[35].setRotationPoint(-18.5F, -38.8F, -4.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 95
		bodyModel[36].setRotationPoint(-18.5F, -38.8F, 1.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[37].setRotationPoint(-18F, -36.8F, -1.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[38].setRotationPoint(-25.5F, -38.5F, -1.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 98
		bodyModel[39].setRotationPoint(-18.5F, -37.5F, -1.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[40].setRotationPoint(-18.3F, -37.5F, -4F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[41].setRotationPoint(-18.3F, -34.9F, -6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[42].setRotationPoint(-18.3F, -34.9F, 3F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 102
		bodyModel[43].setRotationPoint(-18.3F, -36.9F, 1.8F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 103
		bodyModel[44].setRotationPoint(-18.3F, -36.9F, 3F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 104
		bodyModel[45].setRotationPoint(-18.5F, -37.8F, -1.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[46].setRotationPoint(-18.5F, -37.8F, -0.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 4F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, -1F, 4F, 0F, -1F); // Box 128
		bodyModel[47].setRotationPoint(-17.5F, -44.5F, 3.7F);
		bodyModel[47].rotateAngleZ = -0.10471976F;
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		noseModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 3
		noseModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 4
		noseModel[3] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 5
		noseModel[4] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 6
		noseModel[5] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 7
		noseModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 8
		noseModel[7] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 110
		noseModel[8] = new ModelRendererTurbo(this, 713, 41, textureX, textureY); // Box 111
		noseModel[9] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 112
		noseModel[10] = new ModelRendererTurbo(this, 545, 49, textureX, textureY); // Box 113
		noseModel[11] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 129
		noseModel[12] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 130

		noseModel[0].addShapeBox(0F, 0F, 0F, 12, 10, 26, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 1
		noseModel[0].setRotationPoint(-83F, -31.5F, -13F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 12, 8, 26, 0F,0F, 0F, -8F, 0F, -0.5F, -8.5F, 0F, -0.5F, -8.5F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 3
		noseModel[1].setRotationPoint(-83F, -39.5F, -13F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 12, 8, 26, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, -8F, 0F, 0F, -8.5F, 0F, 0F, -8.5F, 0F, 0.5F, -8F); // Box 4
		noseModel[2].setRotationPoint(-83F, -21.5F, -13F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 7, 8, 26, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -8.5F, 0F, 0.5F, -8F, 0F, 0.5F, -8F, 0F, -2F, -8.5F); // Box 5
		noseModel[3].setRotationPoint(-90F, -21.5F, -13F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 7, 8, 26, 0F,0F, -2.5F, -9.5F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -2.5F, -9.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 6
		noseModel[4].setRotationPoint(-90F, -39.5F, -13F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 7, 10, 26, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 7
		noseModel[5].setRotationPoint(-90F, -31.5F, -13F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 5, 10, 10, 0F,0F, -3F, -3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -3F, -3F); // Box 8
		noseModel[6].setRotationPoint(-101F, -31.5F, -5F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 6, 10, 10, 0F,0F, -0.2F, -0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.2F, -0.2F); // Box 110
		noseModel[7].setRotationPoint(-96F, -31.5F, -5F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 5, 8, 26, 0F,0F, -0.5F, -8.5F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -0.5F, -8.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 111
		noseModel[8].setRotationPoint(-71.5F, -39.5F, -13F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 5, 8, 26, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -8.5F, 0F, 0.5F, -8F, 0F, 0.5F, -8F, 0F, 0F, -8.5F); // Box 112
		noseModel[9].setRotationPoint(-71.5F, -21.5F, -13F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 5, 10, 26, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 113
		noseModel[10].setRotationPoint(-71.5F, -31.5F, -13F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 12, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 129
		noseModel[11].setRotationPoint(-83F, -13.5F, -3F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F,0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F); // Box 130
		noseModel[12].setRotationPoint(-71F, -13.5F, -3F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 31
		tailModel[1] = new ModelRendererTurbo(this, 665, 25, textureX, textureY); // Box 32
		tailModel[2] = new ModelRendererTurbo(this, 769, 17, textureX, textureY); // Box 113

		tailModel[0].addShapeBox(0F, 0F, 0F, 21, 9, 9, 0F,0F, 0.5F, 0F, 0F, 4.5F, -2.5F, 0F, 4.5F, -2.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F); // Box 31
		tailModel[0].setRotationPoint(40F, -32F, -4.5F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 21, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, -11F, -1.5F, -4F, -11F, -1.5F, -4F, 0F, 0F, -3F); // Box 32
		tailModel[1].setRotationPoint(40F, -23F, -4.5F);

		tailModel[2].addShapeBox(0F, 0F, -1F, 7, 4, 2, 0F,0F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -3F, 0F); // Box 113
		tailModel[2].setRotationPoint(50F, -22F, 0F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 117
		leftWingModel[1] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 119
		leftWingModel[2] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 126
		leftWingModel[3] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 127

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 21, 4, 84, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 4F, 0F, 0F, 4F, -3F, -1F, 0F, 0F, -1F, 0F, 8F, 2F, 4F, 0F, 2F, 4F); // Box 117
		leftWingModel[0].setRotationPoint(-64F, -24F, -94.5F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 23, 3, 10, 0F,-4F, 0F, 0.5F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.3F, 0.5F, -8F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		leftWingModel[1].setRotationPoint(-61F, -24F, -104.5F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		leftWingModel[2].setRotationPoint(-66F, -22F, -39.5F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 127
		leftWingModel[3].setRotationPoint(-65F, -22F, -42.5F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 529, 49, textureX, textureY); // Box 114
		rightWingModel[1] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); // Box 116
		rightWingModel[2] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 124
		rightWingModel[3] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 125

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 21, 4, 84, 0F,0F, 0F, 4F, 8F, 0F, 4F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 2F, 4F, 8F, 2F, 4F, 0F, -1F, 0F, -3F, -1F, 0F); // Box 114
		rightWingModel[0].setRotationPoint(-64F, -24F, 10.5F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 23, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -4F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -0.3F, 0F, -4F, -0.3F, 0.5F); // Box 116
		rightWingModel[1].setRotationPoint(-61F, -24F, 94.5F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		rightWingModel[2].setRotationPoint(-66F, -22F, 38.5F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 125
		rightWingModel[3].setRotationPoint(-65F, -22F, 41.5F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 34
		yawFlapModel[1] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 35
		yawFlapModel[2] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 106
		yawFlapModel[3] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 107

		yawFlapModel[0].addShapeBox(0F, 0F, -0.5F, 13, 14, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, -3.5F, 0F, -1.5F, -3.5F, 0F, 0F, 0.5F, 0F); // Box 34
		yawFlapModel[0].setRotationPoint(61F, -37F, 0F);

		yawFlapModel[1].addShapeBox(0F, 0F, -0.5F, 13, 19, 1, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 35
		yawFlapModel[1].setRotationPoint(61F, -56F, 0F);

		yawFlapModel[2].addShapeBox(-4F, 0F, 3.5F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		yawFlapModel[2].setRotationPoint(-19F, -23.3F, 0F);
		yawFlapModel[2].rotateAngleZ = -0.6981317F;

		yawFlapModel[3].addShapeBox(-4F, 0F, -7.5F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		yawFlapModel[3].setRotationPoint(-19F, -23.3F, 0F);
		yawFlapModel[3].rotateAngleZ = -0.6981317F;
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 44
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 993, 33, textureX, textureY); // Box 108

		pitchFlapLeftModel[0].addShapeBox(0F, -0.5F, 0F, 11, 2, 30, 0F,0F, -0.2F, 0F, -5F, -0.2F, -3F, 1F, -0.2F, -5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -5F, -0.2F, -3F, 1F, -0.2F, -5F, 0F, -0.2F, 0F); // Box 44
		pitchFlapLeftModel[0].setRotationPoint(57F, -35F, -32F);

		pitchFlapLeftModel[1].addShapeBox(-0.5F, -12F, -0.5F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		pitchFlapLeftModel[1].setRotationPoint(-13F, -24.3F, 0F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 42

		pitchFlapRightModel[0].addShapeBox(0F, -0.5F, 0F, 11, 2, 30, 0F,0F, -0.2F, 0F, 1F, -0.2F, -5F, -5F, -0.2F, -3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, -5F, -5F, -0.2F, -3F, 0F, -0.2F, 0F); // Box 42
		pitchFlapRightModel[0].setRotationPoint(57F, -35F, 2F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 697, 65, textureX, textureY); // Box 118

		pitchFlapLeftWingModel[0].addShapeBox(0F, -1.5F, -42F, 5, 3, 84, 0F,0F, 0F, 0F, 0F, -0.5F, -0.5F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, -0.5F, 2F, 1F, 0F, 0F, 2F, 0F); // Box 118
		pitchFlapLeftWingModel[0].setRotationPoint(-39F, -22F, -52.5F);
		pitchFlapLeftWingModel[0].rotateAngleY = -0.09599311F;
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 817, 49, textureX, textureY); // Box 115

		pitchFlapRightWingModel[0].addShapeBox(0F, -1.5F, -42F, 5, 3, 84, 0F,0F, 0F, 0F, 2F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, 1F, 0F, 0F, -1.5F, -0.5F, 0F, -1F, 0F); // Box 115
		pitchFlapRightWingModel[0].setRotationPoint(-39F, -22F, 52.5F);
		pitchFlapRightWingModel[0].rotateAngleY = 0.09599311F;
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 753, 41, textureX, textureY); // Box 120
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 121
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 122
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 537, 41, textureX, textureY); // Box 123

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		leftWingWheelModel[0].setRotationPoint(-64F, 2F, -36F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 121
		leftWingWheelModel[1].setRotationPoint(-64F, 6F, -36F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		leftWingWheelModel[2].setRotationPoint(-64F, -2F, -36F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 5, 26, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		leftWingWheelModel[3].setRotationPoint(-57F, -20F, -37.5F);
		leftWingWheelModel[3].rotateAngleZ = -0.17453293F;
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 63
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 849, 17, textureX, textureY); // Box 64
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Box 65
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Box 66

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		rightWingWheelModel[0].setRotationPoint(-64F, 2F, 33F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 64
		rightWingWheelModel[1].setRotationPoint(-64F, 6F, 33F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		rightWingWheelModel[2].setRotationPoint(-64F, -2F, 33F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 5, 26, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 66
		rightWingWheelModel[3].setRotationPoint(-57F, -20F, 35.5F);
		rightWingWheelModel[3].rotateAngleZ = -0.17453293F;
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][3];
		propellerModels[0] = makeProp1(-94F, -26.5F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 523, 49, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 523, 49, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 523, 49, textureX, textureY);
		prop[0].addBox(-1F, -24F, -1.5F, 2, 24, 3, 0.0F);
		prop[1].addBox(-1F, -24F, -1.5F, 2, 24, 3, 0.0F);
		prop[2].addBox(-1F, -24F, -1.5F, 2, 24, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}