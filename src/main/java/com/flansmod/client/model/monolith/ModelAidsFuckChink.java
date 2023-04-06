//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAidsFuckChink extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelAidsFuckChink() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[61];
		tailModel = new ModelRendererTurbo[23];
		leftWingModel = new ModelRendererTurbo[5];
		rightWingModel = new ModelRendererTurbo[5];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		bodyWheelModel = new ModelRendererTurbo[12];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		initpitchFlapLeftModel_1();
		initbodyWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 13
		bodyModel[1] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 15
		bodyModel[2] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 16
		bodyModel[3] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 26
		bodyModel[4] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 27
		bodyModel[5] = new ModelRendererTurbo(this, 345, 153, textureX, textureY); // Box 28
		bodyModel[6] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 29
		bodyModel[7] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 30
		bodyModel[8] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 31
		bodyModel[9] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 32
		bodyModel[10] = new ModelRendererTurbo(this, 81, 169, textureX, textureY); // Box 33
		bodyModel[11] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Box 34
		bodyModel[12] = new ModelRendererTurbo(this, 121, 249, textureX, textureY); // Box 39
		bodyModel[13] = new ModelRendererTurbo(this, 217, 257, textureX, textureY); // Box 40
		bodyModel[14] = new ModelRendererTurbo(this, 145, 201, textureX, textureY); // Box 41
		bodyModel[15] = new ModelRendererTurbo(this, 321, 265, textureX, textureY); // Box 42
		bodyModel[16] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 43
		bodyModel[17] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 45
		bodyModel[18] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 46
		bodyModel[19] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 47
		bodyModel[20] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 48
		bodyModel[21] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 49
		bodyModel[22] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 51
		bodyModel[23] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 52
		bodyModel[24] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 53
		bodyModel[25] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 54
		bodyModel[26] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 55
		bodyModel[27] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 56
		bodyModel[28] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 58
		bodyModel[29] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 59
		bodyModel[30] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Box 60
		bodyModel[31] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Box 61
		bodyModel[32] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 62
		bodyModel[33] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 63
		bodyModel[34] = new ModelRendererTurbo(this, 417, 209, textureX, textureY); // Box 64
		bodyModel[35] = new ModelRendererTurbo(this, 417, 233, textureX, textureY); // Box 65
		bodyModel[36] = new ModelRendererTurbo(this, 73, 249, textureX, textureY); // Box 66
		bodyModel[37] = new ModelRendererTurbo(this, 417, 265, textureX, textureY); // Box 67
		bodyModel[38] = new ModelRendererTurbo(this, 417, 289, textureX, textureY); // Box 68
		bodyModel[39] = new ModelRendererTurbo(this, 105, 305, textureX, textureY); // Box 69
		bodyModel[40] = new ModelRendererTurbo(this, 145, 313, textureX, textureY); // Box 70
		bodyModel[41] = new ModelRendererTurbo(this, 225, 313, textureX, textureY); // Box 71
		bodyModel[42] = new ModelRendererTurbo(this, 449, 313, textureX, textureY); // Box 72
		bodyModel[43] = new ModelRendererTurbo(this, 345, 209, textureX, textureY); // Box 73
		bodyModel[44] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 74
		bodyModel[45] = new ModelRendererTurbo(this, 305, 321, textureX, textureY); // Box 75
		bodyModel[46] = new ModelRendererTurbo(this, 361, 321, textureX, textureY); // Box 76
		bodyModel[47] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 77
		bodyModel[48] = new ModelRendererTurbo(this, 153, 337, textureX, textureY); // Box 78
		bodyModel[49] = new ModelRendererTurbo(this, 345, 233, textureX, textureY); // Box 79
		bodyModel[50] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 84
		bodyModel[51] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 89
		bodyModel[52] = new ModelRendererTurbo(this, 217, 257, textureX, textureY); // Box 90
		bodyModel[53] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 91
		bodyModel[54] = new ModelRendererTurbo(this, 321, 249, textureX, textureY); // Box 92
		bodyModel[55] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 93
		bodyModel[56] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 95
		bodyModel[57] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 96
		bodyModel[58] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 97
		bodyModel[59] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 98
		bodyModel[60] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 99

		bodyModel[0].addShapeBox(0F, 0F, 0F, 64, 4, 40, 0F,0F, -0.5F, -9F, 0F, -1F, -9F, 0F, -1F, -9F, 0F, -0.5F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[0].setRotationPoint(11F, -23F, -20F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 30, 9, 40, 0F,0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, 0F, -0.5F); // Box 15
		bodyModel[1].setRotationPoint(45F, -19F, -20F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 30, 5, 40, 0F,0F, 0F, -0.5F, 0F, 1.5F, -2F, 0F, 1.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -6F, 0F, -1F, -7.5F, 0F, -1F, -7.5F, 0F, 0F, -6F); // Box 16
		bodyModel[2].setRotationPoint(45F, -10F, -20F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 19, 5, 40, 0F,0F, 1.5F, -15F, 0F, -1.5F, -9F, 0F, -1.5F, -9F, 0F, 1.5F, -15F, 0F, -2F, -4.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -4.5F); // Box 26
		bodyModel[3].setRotationPoint(-8F, -24F, -20F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 34, 5, 40, 0F,0F, -1.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, -1F, 0F, 0F, -3.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -3.5F); // Box 27
		bodyModel[4].setRotationPoint(11F, -10F, -20F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 34, 9, 40, 0F,0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 1.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.5F, -1F); // Box 28
		bodyModel[5].setRotationPoint(11F, -19F, -20F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 21, 5, 15, 0F,0F, -1F, -1.5F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, -3.5F, 0F, -1F, -4F, 0F, 0F, -3.5F, 0F, 0F, -1.5F, 0F, -1F, -6F); // Box 29
		bodyModel[6].setRotationPoint(-10F, -10F, -20F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 21, 5, 15, 0F,0F, -0.5F, -1.5F, 0F, 1F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, -5F, 0F, -1F, -1.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -3.5F); // Box 30
		bodyModel[7].setRotationPoint(-10F, -13F, -20F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 21, 3, 15, 0F,0F, -1F, -3.5F, 0F, 1.5F, -2F, 0F, 0.5F, -3F, 0F, -1F, -7.5F, 0F, -0.5F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, -5F); // Box 31
		bodyModel[8].setRotationPoint(-10F, -15F, -20F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 21, 5, 15, 0F,0F, -1.5F, -3.5F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, -1F, -1.5F, 0F, -1F, -6F, 0F, 0F, -1.5F, 0F, 0F, -3.5F, 0F, -1F, -4F); // Box 32
		bodyModel[9].setRotationPoint(-10F, -10F, 5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 21, 5, 15, 0F,0F, -1F, -5F, 0F, 0F, -1.5F, 0F, 1F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -1F, -1.5F); // Box 33
		bodyModel[10].setRotationPoint(-10F, -13F, 5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 21, 3, 15, 0F,0F, -1F, -7.5F, 0F, 0.5F, -3F, 0F, 1.5F, -2F, 0F, -1F, -3.5F, 0F, 0F, -5F, 0F, -1F, -1.5F, 0F, 1F, -1.5F, 0F, -0.5F, -1.5F); // Box 34
		bodyModel[11].setRotationPoint(-10F, -15F, 5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 19, 5, 50, 0F,0F, 0F, -15F, 0F, -1.5F, -13F, 0F, -1.5F, -13F, 0F, 0F, -15F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F); // Box 39
		bodyModel[12].setRotationPoint(-8F, -23F, -25F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 23, 5, 50, 0F,0F, -1.5F, -17F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, -1.5F, -17F, 0F, -1F, -11F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -1F, -11F); // Box 40
		bodyModel[13].setRotationPoint(-31F, -23F, -25F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 15, 5, 36, 0F,0F, 4.5F, -15F, 0F, 1.5F, -13F, 0F, 1.5F, -13F, 0F, 4.5F, -15F, 0F, 0F, -6F, 0F, -2F, -2.5F, 0F, -2F, -2.5F, 0F, 0F, -6F); // Box 41
		bodyModel[14].setRotationPoint(-23F, -24F, -18F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 19, 2, 50, 0F,0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, 0F, -16F, 0F, 0.5F, -13F, 0F, 0.5F, -13F, 0F, 0F, -16F); // Box 42
		bodyModel[15].setRotationPoint(-8F, -18F, -25F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 23, 2, 50, 0F,0F, 0F, -11F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -11F, 0F, 0.5F, -17F, 0F, 1F, -15F, 0F, 1F, -15F, 0F, 0.5F, -17F); // Box 43
		bodyModel[16].setRotationPoint(-31F, -19F, -25F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 14, 3, 6, 0F,0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 1F, 1.5F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 1F, -1.5F); // Box 45
		bodyModel[17].setRotationPoint(-45F, -22F, -8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 14, 3, 16, 0F,0F, -1F, 1.5F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, -1F, 1.5F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F); // Box 46
		bodyModel[18].setRotationPoint(-45F, -19F, -8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, -0.5F, -3F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F); // Box 47
		bodyModel[19].setRotationPoint(-49F, -22F, -8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 2, 16, 0F,0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -3F); // Box 48
		bodyModel[20].setRotationPoint(-49F, -18F, -8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -2F); // Box 49
		bodyModel[21].setRotationPoint(-49F, -22F, 2F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 14, 3, 6, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 1F, 1.5F); // Box 51
		bodyModel[22].setRotationPoint(-45F, -22F, 2F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, 0F, 0F, 0F, 2F, -0.8F, 0F, 1F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, 0F, 3F); // Box 52
		bodyModel[23].setRotationPoint(-31F, -25.5F, 3F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, 0F, 0F, 0F, 1F, -0.2F, 0F, 2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 4.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[24].setRotationPoint(-31F, -25.5F, -5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 16, 4, 2, 0F,0F, -2F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 3.5F, 3F); // Box 54
		bodyModel[25].setRotationPoint(-47F, -25.5F, 3F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 16, 4, 2, 0F,0F, -2.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1.8F, 0F, 3.5F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 55
		bodyModel[26].setRotationPoint(-47F, -25.5F, -5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 21, 5, 2, 0F,0F, -2F, 0F, 0F, 0F, -1.8F, 0F, -0.5F, 1F, 0F, -4.5F, 0.8F, 0F, 2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 3F, 0F, 3.5F, 3F); // Box 56
		bodyModel[27].setRotationPoint(-68F, -23.5F, 3F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 21, 5, 2, 0F,0F, -4.5F, 0.8F, 0F, -0.5F, 1F, 0F, 0F, -1.8F, 0F, -2F, 0F, 0F, 3.5F, 3F, 0F, 0.5F, 3F, 0F, 0.5F, 0F, 0F, 2.5F, 0F); // Box 58
		bodyModel[28].setRotationPoint(-68F, -23.5F, -5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, -3.79F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.79F, -1F, 0F, 1.8F, -1F, 0F, 0.5F, 3F, 0F, 0.5F, 3F, 0F, 1.8F, -1F); // Box 59
		bodyModel[29].setRotationPoint(-82.01F, -21.5F, -3F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 14, 4, 12, 0F,0F, -1.3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -4F, 0F, 2F, 1.8F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 1.8F); // Box 60
		bodyModel[30].setRotationPoint(-82F, -19F, -6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 11, 5, 12, 0F,0F, -3F, -3F, 0F, -0.3F, -4F, 0F, -0.3F, -4F, 0F, -3F, -3F, 0F, 1.5F, 1F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, 1.5F, 1F); // Box 61
		bodyModel[31].setRotationPoint(-93F, -18F, -6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 13, 5, 12, 0F,0F, -6.5F, -4F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -6.5F, -4F, 0F, 4F, -2.2F, 0F, 1.5F, 1F, 0F, 1.5F, 1F, 0F, 4F, -2.2F); // Box 62
		bodyModel[32].setRotationPoint(-106F, -18F, -6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 10, 2, 12, 0F,0F, -8F, -5.8F, 0F, -3.5F, -4F, 0F, -3.5F, -4F, 0F, -8F, -5.8F, 0F, 6.2F, -5.8F, 0F, 4F, -2.2F, 0F, 4F, -2.2F, 0F, 6.2F, -5.8F); // Box 63
		bodyModel[33].setRotationPoint(-116F, -15F, -6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 20, 3, 16, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -5F); // Box 64
		bodyModel[34].setRotationPoint(-9F, -8F, -8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 23, 3, 16, 0F,0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, -0.5F, -6F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, -6F); // Box 65
		bodyModel[35].setRotationPoint(-32F, -8F, -8F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 20, 8, 16, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 66
		bodyModel[36].setRotationPoint(-9F, -16F, -8F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 23, 8, 12, 0F,0F, 1.5F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 1.5F, 4F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 67
		bodyModel[37].setRotationPoint(-32F, -16F, -6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 15, 3, 16, 0F,0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, -0.5F, -6F); // Box 68
		bodyModel[38].setRotationPoint(-47F, -8F, -8F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 15, 9, 12, 0F,0F, 1F, 2F, 0F, 0.5F, 4F, 0F, 0.5F, 4F, 0F, 1F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 69
		bodyModel[39].setRotationPoint(-47F, -17F, -6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 21, 3, 16, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, -0.5F, -6F); // Box 70
		bodyModel[40].setRotationPoint(-68F, -8F, -8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 21, 9, 16, 0F,0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 71
		bodyModel[41].setRotationPoint(-68F, -17F, -8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 14, 3, 16, 0F,0F, -1F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -1F, -2.5F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, -0.5F, -6F); // Box 72
		bodyModel[42].setRotationPoint(-82F, -8F, -8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 14, 7, 11, 0F,0F, -2F, 2.3F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, -2F, 2.3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 73
		bodyModel[43].setRotationPoint(-82F, -15F, -5.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 11, 5, 11, 0F,0F, -1.5F, 1.5F, 0F, 0F, 2.3F, 0F, 0F, 2.3F, 0F, -1.5F, 1.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F); // Box 74
		bodyModel[44].setRotationPoint(-93F, -13F, -5.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 11, 2, 16, 0F,0F, 0F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, 0F, -6F); // Box 75
		bodyModel[45].setRotationPoint(-93F, -7F, -8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 13, 2, 16, 0F,0F, -0.5F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -5F, 0F, -0.5F, -7F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -0.5F, -7F); // Box 76
		bodyModel[46].setRotationPoint(-106F, -7F, -8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 10, 2, 10, 0F,0F, -0.205F, -4.8F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.205F, -4.8F, -1F, -1.5F, -4.88F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, -1F, -1.5F, -4.88F); // Box 77
		bodyModel[47].setRotationPoint(-116F, -7F, -5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 13, 2, 16, 0F,0F, 0F, -4.2F, 0F, 2.5F, -1.01F, 0F, 2.5F, -1.01F, 0F, 0F, -4.2F, 0F, 0.5F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.5F, -5F); // Box 78
		bodyModel[48].setRotationPoint(-106F, -9F, -8F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 10, 3, 10, 0F,-1F, -1.8F, -4.88F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, -1F, -1.8F, -4.88F, 0F, -0.8F, -4.8F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.8F, -4.8F); // Box 79
		bodyModel[49].setRotationPoint(-116F, -9F, -5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, -0.8F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F); // Box 84
		bodyModel[50].setRotationPoint(-28F, -23F, -11.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 16, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[51].setRotationPoint(-41F, -28.5F, -3F);
		bodyModel[51].rotateAngleZ = -0.29670597F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 17, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[52].setRotationPoint(-39F, -26.5F, -2F);
		bodyModel[52].rotateAngleZ = -0.17453293F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[53].setRotationPoint(-50F, -19.5F, -3F);
		bodyModel[53].rotateAngleZ = -0.10471976F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 13, 3, 7, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 92
		bodyModel[54].setRotationPoint(-68F, -21.5F, -3.5F);
		bodyModel[54].rotateAngleZ = 0.34906585F;

		bodyModel[55].addShapeBox(0F, 2F, 0F, 13, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[55].setRotationPoint(-68F, -21.5F, -2F);
		bodyModel[55].rotateAngleZ = 0.27925268F;

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F); // Box 95
		bodyModel[56].setRotationPoint(-54F, -28.5F, -4F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.8F); // Box 96
		bodyModel[57].setRotationPoint(-54F, -28.5F, 3F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 1.2F, -0.2F, -0.2F, 1.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -1.6F, -0.2F, -0.2F, -1.6F, -0.2F); // Box 97
		bodyModel[58].setRotationPoint(-54F, -28.7F, -4F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.2F, 1.2F, -0.2F, -0.2F, 1.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -1.6F, -0.2F, -0.2F, -1.6F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 98
		bodyModel[59].setRotationPoint(-54F, -28.7F, 1F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F); // Box 99
		bodyModel[60].setRotationPoint(-54F, -30.1F, -1.5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		tailModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 1
		tailModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 2
		tailModel[3] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 3
		tailModel[4] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 4
		tailModel[5] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 5
		tailModel[6] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 6
		tailModel[7] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 8
		tailModel[8] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 9
		tailModel[9] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 11
		tailModel[10] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 12
		tailModel[11] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 14
		tailModel[12] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 17
		tailModel[13] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 18
		tailModel[14] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 19
		tailModel[15] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 21
		tailModel[16] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 22
		tailModel[17] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 23
		tailModel[18] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 24
		tailModel[19] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 80
		tailModel[20] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 81
		tailModel[21] = new ModelRendererTurbo(this, 393, 321, textureX, textureY); // Box 82
		tailModel[22] = new ModelRendererTurbo(this, 185, 345, textureX, textureY); // Box 83

		tailModel[0].addShapeBox(0F, 0F, 0F, 12, 4, 13, 0F,0F, 0F, -3F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 0
		tailModel[0].setRotationPoint(104F, -21F, 2F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 12, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -3F); // Box 1
		tailModel[1].setRotationPoint(104F, -12F, 2F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 12, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 0F); // Box 2
		tailModel[2].setRotationPoint(104F, -17F, 2F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 12, 4, 13, 0F,0F, 0F, -3F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 3
		tailModel[3].setRotationPoint(104F, -21F, -15F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 12, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -3F); // Box 4
		tailModel[4].setRotationPoint(104F, -12F, -15F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 12, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 0F); // Box 5
		tailModel[5].setRotationPoint(104F, -17F, -15F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 29, 4, 40, 0F,0F, -1F, -9F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -1F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		tailModel[6].setRotationPoint(75F, -23F, -20F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 29, 4, 13, 0F,0F, 1F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 8
		tailModel[7].setRotationPoint(75F, -21F, 2F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 29, 4, 40, 0F,0F, -1F, -9F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -1F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		tailModel[8].setRotationPoint(75F, -23F, -20F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 29, 2, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		tailModel[9].setRotationPoint(75F, -19F, -20F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 29, 4, 13, 0F,0F, 1F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 12
		tailModel[10].setRotationPoint(75F, -21F, -15F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 30, 2, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 14
		tailModel[11].setRotationPoint(45F, -19F, -20F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 29, 5, 40, 0F,0F, 1.5F, -2F, 0F, 2F, -5F, 0F, 2F, -5F, 0F, 1.5F, -2F, 0F, -1F, -7.5F, 0F, -3F, -8F, 0F, -3F, -8F, 0F, -1F, -7.5F); // Box 17
		tailModel[12].setRotationPoint(75F, -10F, -20F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 29, 6, 36, 0F,0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F); // Box 18
		tailModel[13].setRotationPoint(75F, -17.5F, -18F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 41, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F); // Box 19
		tailModel[14].setRotationPoint(61F, -27F, -1.5F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 32, 7, 3, 0F,-26F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, -1F, 2F, -2F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 2F, -2F, -0.5F); // Box 21
		tailModel[15].setRotationPoint(29F, -27F, -1.5F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 10, 36, 2, 0F,0F, 0.5F, 0F, 1F, -3.5F, -0.5F, 1F, -3.5F, -0.5F, 0F, 0.5F, 0F, 43F, 0F, 0F, -13F, 0F, -0.5F, -13F, 0F, -0.5F, 43F, 0F, 0F); // Box 22
		tailModel[16].setRotationPoint(105F, -62.5F, -1F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 10, 36, 2, 0F,-8.5F, 1F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -8.5F, 1F, -0.5F, 40F, 0F, -0.5F, -43F, 0F, 0F, -43F, 0F, 0F, 40F, 0F, -0.5F); // Box 23
		tailModel[17].setRotationPoint(95F, -62.5F, -1F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0.5F); // Box 24
		tailModel[18].setRotationPoint(102F, -27F, -0.5F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F); // Box 80
		tailModel[19].setRotationPoint(104F, -19F, -20F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, 1F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 81
		tailModel[20].setRotationPoint(104F, -19F, 16F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 9, 1, 29, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 27F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 27F, 0F, 0F); // Box 82
		tailModel[21].setRotationPoint(105F, -18.5F, -49F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 9, 1, 29, 0F,27F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 27F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		tailModel[22].setRotationPoint(105F, -18.5F, 20F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 201, 193, textureX, textureY); // Box 36
		leftWingModel[1] = new ModelRendererTurbo(this, 345, 209, textureX, textureY); // Box 37
		leftWingModel[2] = new ModelRendererTurbo(this, 217, 249, textureX, textureY); // Box 85
		leftWingModel[3] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 88
		leftWingModel[4] = new ModelRendererTurbo(this, 9, 365, textureX, textureY); // Box 117

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 43, 1, 54, 0F,-32F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -32F, 1F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 2F, 0.5F, 0F); // Box 36
		leftWingModel[0].setRotationPoint(2F, -19F, -74F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 5, 1, 54, 0F,0F, 0F, 0F, 0F, -1F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 10F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 37
		leftWingModel[1].setRotationPoint(45F, -19F, -74F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 42, 2, 3, 0F,4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		leftWingModel[2].setRotationPoint(10F, -18.5F, -77F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 23, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F); // Box 88
		leftWingModel[3].setRotationPoint(19F, -17.5F, -37F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 40, 1, 40, 0F,-12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F); // Box 117
		leftWingModel[4].setRotationPoint(16F, -19.1F, -53F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 35
		rightWingModel[1] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 38
		rightWingModel[2] = new ModelRendererTurbo(this, 417, 257, textureX, textureY); // Box 86
		rightWingModel[3] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 87
		rightWingModel[4] = new ModelRendererTurbo(this, 9, 365, textureX, textureY); // Box 116

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 43, 1, 54, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -32F, -1F, 0F, 2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, -32F, 1F, 0F); // Box 35
		rightWingModel[0].setRotationPoint(2F, -19F, 20F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 5, 1, 54, 0F,0F, 0F, 0F, 10F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 10F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F); // Box 38
		rightWingModel[1].setRotationPoint(45F, -19F, 20F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 42, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 86
		rightWingModel[2].setRotationPoint(10F, -18.5F, 74F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 23, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F); // Box 87
		rightWingModel[3].setRotationPoint(19F, -17.5F, 35F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 40, 1, 40, 0F,-12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F); // Box 116
		rightWingModel[4].setRotationPoint(16F, -19F, 13F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 94

		pitchFlapLeftModel[0].addShapeBox(-0.5F, -7F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		pitchFlapLeftModel[0].setRotationPoint(-51.5F, -18.5F, 0F);
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 100
		bodyWheelModel[1] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 101
		bodyWheelModel[2] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 102
		bodyWheelModel[3] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 103
		bodyWheelModel[4] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 108
		bodyWheelModel[5] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 109
		bodyWheelModel[6] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 110
		bodyWheelModel[7] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 111
		bodyWheelModel[8] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 112
		bodyWheelModel[9] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 113
		bodyWheelModel[10] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 114
		bodyWheelModel[11] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 115

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 2, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 100
		bodyWheelModel[0].setRotationPoint(-62F, -6.5F, -1F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyWheelModel[1].setRotationPoint(-64F, 4.5F, -1F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 102
		bodyWheelModel[2].setRotationPoint(-64F, 8.5F, -1F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyWheelModel[3].setRotationPoint(-64F, 6.5F, -1F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 108
		bodyWheelModel[4].setRotationPoint(42F, 8.5F, -17F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyWheelModel[5].setRotationPoint(42F, 6.5F, -17F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyWheelModel[6].setRotationPoint(42F, 4.5F, -17F);

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 2, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 111
		bodyWheelModel[7].setRotationPoint(44F, -8.5F, -17F);

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 112
		bodyWheelModel[8].setRotationPoint(42F, 8.5F, 15F);

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyWheelModel[9].setRotationPoint(42F, 6.5F, 15F);

		bodyWheelModel[10].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyWheelModel[10].setRotationPoint(42F, 4.5F, 15F);

		bodyWheelModel[11].addShapeBox(0F, 0F, 0F, 2, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 115
		bodyWheelModel[11].setRotationPoint(44F, -8.5F, 15F);
	}
}