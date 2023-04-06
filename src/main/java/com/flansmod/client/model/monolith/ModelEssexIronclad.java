//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: EssexIronclad
// Model Creator: 
// Created on: 21.06.2022 - 18:11:13
// Last changed on: 21.06.2022 - 18:11:13

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelEssexIronclad extends ModelVehicle //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelEssexIronclad() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[79];
		frontWheelModel = new ModelRendererTurbo[2];

		initbodyModel_1();
		initfrontWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 97, 177, textureX, textureY); // Box 19
		bodyModel[16] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Box 20
		bodyModel[17] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 21
		bodyModel[18] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 22
		bodyModel[19] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 25
		bodyModel[20] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 26
		bodyModel[21] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 27
		bodyModel[22] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 28
		bodyModel[23] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 29
		bodyModel[24] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 30
		bodyModel[25] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 31
		bodyModel[26] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 32
		bodyModel[27] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 33
		bodyModel[28] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 34
		bodyModel[29] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 35
		bodyModel[30] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 36
		bodyModel[31] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 37
		bodyModel[32] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 38
		bodyModel[33] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 39
		bodyModel[34] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 40
		bodyModel[35] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 41
		bodyModel[36] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 42
		bodyModel[37] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 43
		bodyModel[38] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 44
		bodyModel[39] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 45
		bodyModel[40] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 46
		bodyModel[41] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 47
		bodyModel[42] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 48
		bodyModel[43] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 49
		bodyModel[44] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 51
		bodyModel[45] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 52
		bodyModel[46] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 53
		bodyModel[47] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 54
		bodyModel[48] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 55
		bodyModel[49] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 56
		bodyModel[50] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 57
		bodyModel[51] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 58
		bodyModel[52] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 59
		bodyModel[53] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Import Box110
		bodyModel[54] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Import Box111
		bodyModel[55] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Import Box112
		bodyModel[56] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 69
		bodyModel[57] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 70
		bodyModel[58] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 71
		bodyModel[59] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 72
		bodyModel[60] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 73
		bodyModel[61] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 74
		bodyModel[62] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 75
		bodyModel[63] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 76
		bodyModel[64] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 77
		bodyModel[65] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 78
		bodyModel[66] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 79
		bodyModel[67] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 80
		bodyModel[68] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 81
		bodyModel[69] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 82
		bodyModel[70] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 83
		bodyModel[71] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 84
		bodyModel[72] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 85
		bodyModel[73] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 86
		bodyModel[74] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 87
		bodyModel[75] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 88
		bodyModel[76] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 89
		bodyModel[77] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 90
		bodyModel[78] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 91

		bodyModel[0].addShapeBox(0F, 0F, 0F, 82, 10, 28, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[0].setRotationPoint(-37.5F, -2F, -14F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 10, 28, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 10F, -1F, 0F, 10F, -1F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[1].setRotationPoint(44.5F, -2F, -14F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 10, 28, 0F,0F, 0F, -8F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -8F, 2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -3F); // Box 4
		bodyModel[2].setRotationPoint(-41.5F, -2F, -14F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 10, 28, 0F,0F, 0F, -13.5F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -13.5F, 8F, -1.5F, -13F, -2F, 0F, -3F, -2F, 0F, -3F, 8F, -1.5F, -13F); // Box 5
		bodyModel[3].setRotationPoint(-45.5F, -2F, -14F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 82, 1, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[4].setRotationPoint(-37.5F, 8F, -14F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 11, 1, 28, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[5].setRotationPoint(44.5F, 8F, -14F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 6, 3, 28, 0F,0F, -1F, 0F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, -11F, -0.5F, 0F, -11F, 0F, 0F, 0F); // Box 8
		bodyModel[6].setRotationPoint(55.5F, 6F, -14F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 6, 1, 28, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 9
		bodyModel[7].setRotationPoint(-43.5F, 8F, -14F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 10, 1, 24, 0F,0F, 1.5F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 10
		bodyModel[8].setRotationPoint(-53.5F, 8F, -12F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0.5F, -3.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F); // Box 11
		bodyModel[9].setRotationPoint(-56.5F, 7F, -4F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.9F, -3.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.9F, -3.5F); // Box 12
		bodyModel[10].setRotationPoint(-56.5F, 9F, -4F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 82, 2, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -10F, 0F, 0.5F, -10F, 0F, 0.5F, -10F, 0F, 0.5F, -10F); // Box 13
		bodyModel[11].setRotationPoint(-37.5F, 9F, -14F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 6, 2, 28, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -11F, 0F, 0.5F, -10F, 0F, 0.5F, -10F, 0F, 0F, -11F); // Box 14
		bodyModel[12].setRotationPoint(-43.5F, 9F, -14F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 10, 2, 24, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -1.5F, -10.5F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -1.5F, -10.5F); // Box 15
		bodyModel[13].setRotationPoint(-53.5F, 9F, -12F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 19, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[14].setRotationPoint(-56.5F, 8.5F, -0.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 11, 2, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -10F, 0F, 0.5F, -12F, 0F, 0.5F, -12F, 0F, 0.5F, -10F); // Box 19
		bodyModel[15].setRotationPoint(44.5F, 9F, -14F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 6, 3, 28, 0F,0F, 0F, 0F, -0.5F, 0F, -11F, -0.5F, 0F, -11F, 0F, 0F, 0F, 0F, -0.5F, -12F, -1.5F, -1F, -13.5F, -1.5F, -1F, -13.5F, 0F, -0.5F, -12F); // Box 20
		bodyModel[16].setRotationPoint(55.5F, 9F, -14F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[17].setRotationPoint(21.5F, -3F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 14, 4, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 22
		bodyModel[18].setRotationPoint(21.5F, -17F, -7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 13, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 25
		bodyModel[19].setRotationPoint(-27.5F, -4F, -6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 26
		bodyModel[20].setRotationPoint(-24.5F, -5F, -6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 27
		bodyModel[21].setRotationPoint(59F, -17F, -0.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 28
		bodyModel[22].setRotationPoint(0F, -26F, -0.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 29
		bodyModel[23].setRotationPoint(-48F, -13F, -0.5F);
		bodyModel[23].rotateAngleZ = 0.2268928F;

		bodyModel[24].addShapeBox(0.3F, 0F, 0F, 20, 12, 1, 0F,-13F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -13F, 0F, -0.4F, -13F, -8F, -0.4F, -0.3F, -8F, -0.4F, -0.3F, -8F, -0.4F, -13F, -8F, -0.4F); // Box 30
		bodyModel[24].setRotationPoint(-67F, -8F, -0.5F);
		bodyModel[24].rotateAngleZ = 0.2268928F;

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 10, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 31
		bodyModel[25].setRotationPoint(36.5F, -4F, -4.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 10, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -2F); // Box 32
		bodyModel[26].setRotationPoint(33.5F, -4F, -4.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 10, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 1F); // Box 33
		bodyModel[27].setRotationPoint(39.5F, -4F, -4.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[28].setRotationPoint(36.5F, -6F, -4.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,-2.9F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, -2.9F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 35
		bodyModel[29].setRotationPoint(33.5F, -6F, -4.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, -0.5F, -3F, -2.9F, -0.5F, -3F, -2.9F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 36
		bodyModel[30].setRotationPoint(39.5F, -6F, -4.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.8F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0.8F, -0.5F, 0F); // Box 37
		bodyModel[31].setRotationPoint(-24.5F, -6F, -6F);

		bodyModel[32].addBox(0F, 0F, -0.5F, 2, 5, 1, 0F); // Box 38
		bodyModel[32].setRotationPoint(-35.5F, 2F, -10.5F);
		bodyModel[32].rotateAngleX = -0.52359878F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[33].setRotationPoint(-35F, 4.5F, -17F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[34].setRotationPoint(-15F, 4.5F, -17F);

		bodyModel[35].addBox(0F, 0F, -0.5F, 2, 5, 1, 0F); // Box 41
		bodyModel[35].setRotationPoint(-15.5F, 2F, -10.5F);
		bodyModel[35].rotateAngleX = -0.52359878F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[36].setRotationPoint(25F, 4.5F, -17F);

		bodyModel[37].addBox(0F, 0F, -0.5F, 2, 5, 1, 0F); // Box 43
		bodyModel[37].setRotationPoint(24.5F, 2F, -10.5F);
		bodyModel[37].rotateAngleX = -0.52359878F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[38].setRotationPoint(38F, 4.5F, -17F);

		bodyModel[39].addBox(0F, 0F, -0.5F, 2, 5, 1, 0F); // Box 45
		bodyModel[39].setRotationPoint(37.5F, 2F, -10.5F);
		bodyModel[39].rotateAngleX = -0.52359878F;

		bodyModel[40].addBox(-1F, 0F, -0.5F, 2, 5, 1, 0F); // Box 46
		bodyModel[40].setRotationPoint(-45.5F, 2F, -5F);
		bodyModel[40].rotateAngleX = -0.52359878F;
		bodyModel[40].rotateAngleY = -0.76794487F;
		bodyModel[40].rotateAngleZ = -0.13962634F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[41].setRotationPoint(-50.2F, 4.5F, -9F);
		bodyModel[41].rotateAngleY = -0.6981317F;

		bodyModel[42].addBox(-1F, 0F, 0F, 2, 5, 1, 0F); // Box 48
		bodyModel[42].setRotationPoint(-45.5F, 2F, 3F);
		bodyModel[42].rotateAngleX = 0.52359878F;
		bodyModel[42].rotateAngleY = 0.76794487F;
		bodyModel[42].rotateAngleZ = 0.13962634F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[43].setRotationPoint(-48F, 4.5F, 0F);
		bodyModel[43].rotateAngleY = -2.35619449F;

		bodyModel[44].addBox(-0.5F, 0F, 0.5F, 1, 5, 2, 0F); // Box 51
		bodyModel[44].setRotationPoint(49.5F, 2F, -7F);
		bodyModel[44].rotateAngleZ = 0.83775804F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[45].setRotationPoint(51F, 3.5F, -6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 5, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 53
		bodyModel[46].setRotationPoint(-44F, -7F, -4.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[47].setRotationPoint(-41F, -7F, -4.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 55
		bodyModel[48].setRotationPoint(-38F, -7F, -4.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 5, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[49].setRotationPoint(-35F, -6F, -4.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 13, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[50].setRotationPoint(-13F, -7F, -4.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 14, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[51].setRotationPoint(-13.5F, -8F, -5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 6, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[52].setRotationPoint(-35.5F, -6.5F, -5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Import Box110
		bodyModel[53].setRotationPoint(30F, -13F, -7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box111
		bodyModel[54].setRotationPoint(27.5F, -13F, -7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box112
		bodyModel[55].setRotationPoint(27.5F, -8F, -7F);

		bodyModel[56].addBox(-0.5F, 0F, 0.5F, 1, 5, 2, 0F); // Box 69
		bodyModel[56].setRotationPoint(49.5F, 2F, -1F);
		bodyModel[56].rotateAngleZ = 0.83775804F;

		bodyModel[57].addBox(-0.5F, 0F, 0.5F, 1, 5, 2, 0F); // Box 70
		bodyModel[57].setRotationPoint(49.5F, 2F, 5F);
		bodyModel[57].rotateAngleZ = 0.83775804F;

		bodyModel[58].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[58].setRotationPoint(51F, 3.5F, 6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[59].setRotationPoint(-47F, 4F, 4F);
		bodyModel[59].rotateAngleY = 0.6981317F;

		bodyModel[60].addBox(0F, 0F, -0.5F, 2, 5, 1, 0F); // Box 73
		bodyModel[60].setRotationPoint(-35.5F, 2F, 10F);
		bodyModel[60].rotateAngleX = 0.52359878F;

		bodyModel[61].addBox(0F, 0F, -0.5F, 2, 5, 1, 0F); // Box 74
		bodyModel[61].setRotationPoint(-15.5F, 2F, 10F);
		bodyModel[61].rotateAngleX = 0.52359878F;

		bodyModel[62].addBox(0F, 0F, -0.5F, 2, 5, 1, 0F); // Box 75
		bodyModel[62].setRotationPoint(24.5F, 2F, 10F);
		bodyModel[62].rotateAngleX = 0.52359878F;

		bodyModel[63].addBox(0F, 0F, -0.5F, 2, 5, 1, 0F); // Box 76
		bodyModel[63].setRotationPoint(37.5F, 2F, 10F);
		bodyModel[63].rotateAngleX = 0.52359878F;

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[64].setRotationPoint(-35F, 4.5F, 12F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[65].setRotationPoint(-15F, 4.5F, 12F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[66].setRotationPoint(25F, 4.5F, 12F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[67].setRotationPoint(38F, 4.5F, 12F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[68].setRotationPoint(21.5F, -3F, 3F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 4, 14, 4, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 82
		bodyModel[69].setRotationPoint(21.5F, -17F, 3F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 83
		bodyModel[70].setRotationPoint(30F, -13F, 4F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[71].setRotationPoint(27.5F, -13F, 4F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[72].setRotationPoint(27.5F, -8F, 4F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 86
		bodyModel[73].setRotationPoint(4F, -13F, 4F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[74].setRotationPoint(1.5F, -13F, 4F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[75].setRotationPoint(1.5F, -8F, 4F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[76].setRotationPoint(1.5F, -8F, -7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[77].setRotationPoint(1.5F, -13F, -7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 91
		bodyModel[78].setRotationPoint(4F, -13F, -7F);
	}

	private void initfrontWheelModel_1()
	{
		frontWheelModel[0] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 17
		frontWheelModel[1] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 18

		frontWheelModel[0].addShapeBox(0F, 0F, -0.5F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		frontWheelModel[0].setRotationPoint(-61.5F, 8.5F, 0F);

		frontWheelModel[1].addShapeBox(0F, 0F, -0.5F, 5, 2, 1, 0F,-4F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		frontWheelModel[1].setRotationPoint(-61.5F, 6.5F, 0F);
	}
}