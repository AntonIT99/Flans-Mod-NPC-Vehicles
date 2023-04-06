//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSzentIstvan extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSzentIstvan() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[123];

		initbodyModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 20
		bodyModel[15] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 21
		bodyModel[16] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 22
		bodyModel[17] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 23
		bodyModel[18] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 24
		bodyModel[19] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 25
		bodyModel[20] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 33
		bodyModel[21] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 34
		bodyModel[22] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 35
		bodyModel[23] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 39
		bodyModel[24] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 40
		bodyModel[25] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 41
		bodyModel[26] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 51
		bodyModel[27] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 65
		bodyModel[28] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 71
		bodyModel[29] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 72
		bodyModel[30] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 73
		bodyModel[31] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 74
		bodyModel[32] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 97
		bodyModel[33] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 98
		bodyModel[34] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 99
		bodyModel[35] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 100
		bodyModel[36] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Box 101
		bodyModel[37] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 102
		bodyModel[38] = new ModelRendererTurbo(this, 177, 169, textureX, textureY); // Box 103
		bodyModel[39] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 104
		bodyModel[40] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 105
		bodyModel[41] = new ModelRendererTurbo(this, 81, 177, textureX, textureY); // Box 106
		bodyModel[42] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 107
		bodyModel[43] = new ModelRendererTurbo(this, 305, 201, textureX, textureY); // Box 108
		bodyModel[44] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 109
		bodyModel[45] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 110
		bodyModel[46] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 111
		bodyModel[47] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 117
		bodyModel[48] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 39
		bodyModel[49] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 40
		bodyModel[50] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 41
		bodyModel[51] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 84
		bodyModel[52] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 85
		bodyModel[53] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Box 86
		bodyModel[54] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 105
		bodyModel[55] = new ModelRendererTurbo(this, 113, 201, textureX, textureY); // Box 106
		bodyModel[56] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 11
		bodyModel[57] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 12
		bodyModel[58] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Box 13
		bodyModel[59] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 14
		bodyModel[60] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 15
		bodyModel[61] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Box 2
		bodyModel[62] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 3
		bodyModel[63] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Box 4
		bodyModel[64] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Box 5
		bodyModel[65] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Box 6
		bodyModel[66] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Box 7
		bodyModel[67] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Box 8
		bodyModel[68] = new ModelRendererTurbo(this, 201, 201, textureX, textureY); // Box 9
		bodyModel[69] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 10
		bodyModel[70] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 11
		bodyModel[71] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 12
		bodyModel[72] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 13
		bodyModel[73] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 14
		bodyModel[74] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 15
		bodyModel[75] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 16
		bodyModel[76] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 17
		bodyModel[77] = new ModelRendererTurbo(this, 433, 209, textureX, textureY); // Box 18
		bodyModel[78] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 19
		bodyModel[79] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 20
		bodyModel[80] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 21
		bodyModel[81] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 22
		bodyModel[82] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 24
		bodyModel[83] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 25
		bodyModel[84] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 26
		bodyModel[85] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 27
		bodyModel[86] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 28
		bodyModel[87] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 29
		bodyModel[88] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 30
		bodyModel[89] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 31
		bodyModel[90] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box116
		bodyModel[91] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box117
		bodyModel[92] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Import Box118
		bodyModel[93] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 24
		bodyModel[94] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 25
		bodyModel[95] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 26
		bodyModel[96] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 27
		bodyModel[97] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 28
		bodyModel[98] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 29
		bodyModel[99] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 30
		bodyModel[100] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 31
		bodyModel[101] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 32
		bodyModel[102] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 33
		bodyModel[103] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 34
		bodyModel[104] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 35
		bodyModel[105] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 47
		bodyModel[106] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 48
		bodyModel[107] = new ModelRendererTurbo(this, 33, 153, textureX, textureY); // Box 49
		bodyModel[108] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 50
		bodyModel[109] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 51
		bodyModel[110] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 52
		bodyModel[111] = new ModelRendererTurbo(this, 33, 169, textureX, textureY); // Box 53
		bodyModel[112] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 55
		bodyModel[113] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 56
		bodyModel[114] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 57
		bodyModel[115] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Box 58
		bodyModel[116] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 59
		bodyModel[117] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 60
		bodyModel[118] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 61
		bodyModel[119] = new ModelRendererTurbo(this, 41, 217, textureX, textureY); // Box 62
		bodyModel[120] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 0
		bodyModel[121] = new ModelRendererTurbo(this, 433, 209, textureX, textureY); // Box 1
		bodyModel[122] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 2

		bodyModel[0].addShapeBox(0F, 0F, 0F, 10, 11, 57, 0F,20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-13F, -7F, -28F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 11, 51, 0F,19F, 0F, 0F, 19F, 0F, 3F, 19F, 0F, 3F, 19F, 0F, 0F, 19F, 0F, 0F, 19F, 0F, 3F, 19F, 0F, 3F, 19F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-53F, -7F, -25F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 11, 45, 0F,10F, 0F, 0F, 10F, 0F, 3F, 10F, 0F, 3F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 3F, 10F, 0F, 3F, 10F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(-83F, -7F, -22F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 15, 11, 39, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(-108F, -7F, -19F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 12, 11, 29, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(-120F, -7F, -14F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 12, 11, 19, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(-132F, -7F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 7, 11, 9, 0F,0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 1F); // Box 7
		bodyModel[6].setRotationPoint(-139F, -7F, -4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 7, 11, 9, 0F,-0.5F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, -3F); // Box 8
		bodyModel[7].setRotationPoint(-146F, -7F, -4F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 11, 57, 0F,16.5F, 0F, 0F, 16.5F, 0F, -4F, 16.5F, 0F, -4F, 16.5F, 0F, 0F, 16.5F, 0F, 0F, 16.5F, 0F, -4F, 16.5F, 0F, -4F, 16.5F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(33.5F, -7F, -28F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 11, 49, 0F,10F, 0F, 0F, 10F, 0F, -5F, 10F, 0F, -5F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, -4F, 10F, 0F, -4F, 10F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(62F, -7F, -24F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 15, 11, 41, 0F,0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(73F, -7F, -20F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 7, 1, 16, 0F,0F, 6F, 0F, 0F, 6.2F, -5F, 0F, 6.2F, -5F, 0F, 6F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -5F, 0F, 0.5F, -5F, 0F, 0.5F, 0F); // Box 13
		bodyModel[11].setRotationPoint(133F, -5.5F, -7.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 6.2F, 0F, -0.5F, 6.4F, -2.5F, -0.5F, 6.4F, -2.5F, 0F, 6.2F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, -2.5F, 0.5F, 0.5F, -2.5F, 0F, 0.5F, 0F); // Box 14
		bodyModel[12].setRotationPoint(140F, -5.5F, -2.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 48, 8, 25, 0F,0F, -0.5F, 5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 5F, 0F, -0.5F, 5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 5F); // Box 15
		bodyModel[13].setRotationPoint(63F, -11.5F, -12F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 8, 5, 44, 0F,0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0.5F); // Box 20
		bodyModel[14].setRotationPoint(55F, -11F, -21.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 16, 8, 54, 0F,15F, 0F, 0.5F, 15F, 0F, -5F, 15F, 0F, -4F, 15F, 0F, 0.5F, 15F, 0F, 0.5F, 15F, 0F, -5F, 15F, 0F, -4F, 15F, 0F, 0.5F); // Box 21
		bodyModel[15].setRotationPoint(24F, -11F, -27F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 23, 8, 54, 0F,15F, 0F, -1F, 15F, 0F, 0.5F, 15F, 0F, 0.5F, 15F, 0F, -1F, 15F, 0F, -1F, 15F, 0F, 0.5F, 15F, 0F, 0.5F, 15F, 0F, -1F); // Box 22
		bodyModel[16].setRotationPoint(-29F, -11F, -27F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 8, 8, 26, 0F,0F, 0F, 8F, 0F, 0F, 13.5F, 0F, 0F, 12.5F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 13.5F, 0F, 0F, 12.5F, 0F, 0F, 8F); // Box 23
		bodyModel[17].setRotationPoint(-52F, -11F, -12.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 36, 8, 26, 0F,9F, 0F, 6F, 9F, 0F, 8F, 9F, 0F, 8F, 9F, 0F, 6F, 9F, 0F, 6F, 9F, 0F, 8F, 9F, 0F, 8F, 9F, 0F, 6F); // Box 24
		bodyModel[18].setRotationPoint(-97F, -11F, -12.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 21, 8, 20, 0F,0F, 0F, 1F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 1F); // Box 25
		bodyModel[19].setRotationPoint(-127F, -11F, -9.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Box 33
		bodyModel[20].setRotationPoint(18F, -10F, -12F);

		bodyModel[21].addShapeBox(-8.5F, 0F, -2.5F, 17, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[21].setRotationPoint(26.5F, -10F, -14.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[22].setRotationPoint(18F, -10F, -23F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Box 39
		bodyModel[23].setRotationPoint(-89F, -13F, 3.5F);

		bodyModel[24].addShapeBox(-8.5F, 0F, -2.5F, 17, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[24].setRotationPoint(-80.5F, -13F, 1F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[25].setRotationPoint(-89F, -13F, -7.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 35, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[26].setRotationPoint(17F, -45F, -3F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[27].setRotationPoint(-147F, -32F, 0F);
		bodyModel[27].rotateAngleZ = 0.17453293F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 50F, 1F, 1F, 50F, 1F, 1F, 50F, 1F, 1F, 50F, 1F); // Box 71
		bodyModel[28].setRotationPoint(31.5F, -65F, 0F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 72
		bodyModel[29].setRotationPoint(31.5F, -62F, 0F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 40F, -0.2F, -0.2F, 40F, -0.2F, -0.2F, 40F, -0.2F, -0.2F, 40F, -0.2F); // Box 73
		bodyModel[30].setRotationPoint(31F, -108F, 0F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 34, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 74
		bodyModel[31].setRotationPoint(31F, -58F, -17F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 15, 1, 41, 0F,0F, 7F, 0F, 0F, 7F, -3.5F, 0F, 7F, -3.5F, 0F, 7F, 0F, 0F, 7F, -6F, 0F, 7F, -8.5F, 0F, 7F, -8.5F, 0F, 7F, -6F); // Box 97
		bodyModel[32].setRotationPoint(73F, 11F, -20F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 49, 0F,10F, 7F, 0F, 10F, 7F, -4F, 10F, 7F, -4F, 10F, 7F, 0F, 10F, 7F, -5F, 10F, 7F, -10F, 10F, 7F, -10F, 10F, 7F, -5F); // Box 98
		bodyModel[33].setRotationPoint(62F, 11F, -24F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 57, 0F,16.5F, 7F, 0F, 16.5F, 7F, -4F, 16.5F, 7F, -4F, 16.5F, 7F, 0F, 16.5F, 7F, -5F, 16.5F, 7F, -9F, 16.5F, 7F, -9F, 16.5F, 7F, -5F); // Box 99
		bodyModel[34].setRotationPoint(33.5F, 11F, -28F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 10, 1, 57, 0F,20F, 7F, 0F, 20F, 7F, 0F, 20F, 7F, 0F, 20F, 7F, 0F, 20F, 7F, -5F, 20F, 7F, -5F, 20F, 7F, -5F, 20F, 7F, -5F); // Box 100
		bodyModel[35].setRotationPoint(-13F, 11F, -28F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 51, 0F,19F, 7F, 0F, 19F, 7F, 3F, 19F, 7F, 3F, 19F, 7F, 0F, 19F, 7F, -5F, 19F, 7F, -2F, 19F, 7F, -2F, 19F, 7F, -5F); // Box 101
		bodyModel[36].setRotationPoint(-53F, 11F, -25F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 45, 0F,10F, 7F, 0F, 10F, 7F, 3F, 10F, 7F, 3F, 10F, 7F, 0F, 10F, 7F, -5F, 10F, 7F, -2F, 10F, 7F, -2F, 10F, 7F, -5F); // Box 102
		bodyModel[37].setRotationPoint(-83F, 11F, -22F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 12, 1, 29, 0F,0F, 7F, 0F, 0F, 7F, 5F, 0F, 7F, 5F, 0F, 7F, 0F, -4F, 6F, -4F, 0F, 7F, -2F, 0F, 7F, -2F, -4F, 6F, -4F); // Box 103
		bodyModel[38].setRotationPoint(-120F, 11F, -14F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 15, 1, 39, 0F,0F, 7F, 0F, 0F, 7F, 3F, 0F, 7F, 3F, 0F, 7F, 0F, 0F, 7F, -7F, 0F, 7F, -2F, 0F, 7F, -2F, 0F, 7F, -7F); // Box 104
		bodyModel[39].setRotationPoint(-108F, 11F, -19F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 7, 6, 9, 0F,0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 1F, 0F, -2F, -2F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, -2F, -2F); // Box 105
		bodyModel[40].setRotationPoint(-139F, 4F, -4F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 12, 8, 19, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -4F, 4F, 6F, 1F, 4F, 6F, 1F, 0F, 0F, -4F); // Box 106
		bodyModel[41].setRotationPoint(-132F, 4F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 7, 3, 9, 0F,-1F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, -3F, -3F, -1F, -3F, 0F, 1F, -2F, 0F, 1F, -2F, -3F, -1F, -3F); // Box 107
		bodyModel[42].setRotationPoint(-146F, 4F, -4F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 45, 5, 34, 0F,0F, 5F, 0F, 0F, 5F, -9F, 0F, 5F, -9F, 0F, 5F, 0F, 0F, 5F, -5F, -8F, 4F, -14F, -8F, 4F, -14F, 0F, 5F, -5F); // Box 108
		bodyModel[43].setRotationPoint(88F, 9F, -16.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 10, 14, 16, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 8F, 0F, -5F, -2F, -6F, -7F, -2F, -6F, -7F, 8F, 0F, -5F); // Box 109
		bodyModel[44].setRotationPoint(133F, 4F, -7.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 8, 6, 0F,0F, 0F, 0F, 1F, 0F, -2.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 2F, 0F, -2F, 0F, -3F, -2.8F, 0F, -3F, -2.8F, 2F, 0F, -2F); // Box 110
		bodyModel[45].setRotationPoint(143F, 4F, -2.5F);

		bodyModel[46].addShapeBox(-12F, 1F, 0F, 12, 9, 1, 0F,-0.2F, -1F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.2F, -1F, -0.3F, 0.5F, 0.7F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.5F, 0.7F, -0.3F); // Box 111
		bodyModel[46].setRotationPoint(-147F, -32F, 0F);
		bodyModel[46].rotateAngleZ = 0.17453293F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 117
		bodyModel[47].setRotationPoint(140.5F, -25.5F, 0F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 17, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Box 39
		bodyModel[48].setRotationPoint(51F, -19F, 3.5F);

		bodyModel[49].addShapeBox(-8.5F, 0F, -2.5F, 17, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[49].setRotationPoint(59.5F, -19F, 1F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 17, 9, 6, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[50].setRotationPoint(51F, -19F, -7.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 17, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Box 84
		bodyModel[51].setRotationPoint(72F, -13F, 3.5F);

		bodyModel[52].addShapeBox(-8.5F, 0F, -2.5F, 17, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[52].setRotationPoint(80.5F, -13F, 1F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 17, 9, 6, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[53].setRotationPoint(72F, -13F, -7.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 6, 25, 0F,10F, 4.5F, 0F, 10F, 5F, -4.5F, 10F, 5F, -4.5F, 10F, 4.5F, 0F, 10F, 4.5F, 0F, 10F, 4.5F, -4.5F, 10F, 4.5F, -4.5F, 10F, 4.5F, 0F); // Box 105
		bodyModel[54].setRotationPoint(121F, -6.5F, -12F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 23, 11, 34, 0F,0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F); // Box 106
		bodyModel[55].setRotationPoint(88F, -7F, -16.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 35, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 11
		bodyModel[56].setRotationPoint(22F, -45F, -3F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 35, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 12
		bodyModel[57].setRotationPoint(15F, -45F, -3F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 35, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 13
		bodyModel[58].setRotationPoint(-3F, -45F, -3F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 35, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 14
		bodyModel[59].setRotationPoint(4F, -45F, -3F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 5, 35, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[60].setRotationPoint(-1F, -45F, -3F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 12, 8, 14, 0F,0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -2F); // Box 2
		bodyModel[61].setRotationPoint(-139F, -11F, -6.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 6, 8, 6, 0F,0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F); // Box 3
		bodyModel[62].setRotationPoint(-145F, -11F, -2.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 17, 9, 6, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[63].setRotationPoint(-65F, -19F, -7.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 17, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Box 5
		bodyModel[64].setRotationPoint(-65F, -19F, 3.5F);

		bodyModel[65].addShapeBox(-8.5F, 0F, -2.5F, 17, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[65].setRotationPoint(-56.5F, -19F, 1F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 5, 16, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[66].setRotationPoint(40F, -27F, -5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 16, 10, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 8
		bodyModel[67].setRotationPoint(45F, -27F, -5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 16, 10, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 9
		bodyModel[68].setRotationPoint(38F, -27F, -5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 7, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F); // Box 10
		bodyModel[69].setRotationPoint(32F, -33.5F, -4F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 15, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[70].setRotationPoint(25F, -34.5F, -5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 11, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[71].setRotationPoint(14F, -34.5F, -6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F); // Box 13
		bodyModel[72].setRotationPoint(-34F, -21F, -5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 5, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[73].setRotationPoint(-39F, -21F, -5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 10, 10, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 15
		bodyModel[74].setRotationPoint(-41F, -21F, -5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 50F, 1F, 1F, 50F, 1F, 1F, 50F, 1F, 1F, 50F, 1F); // Box 16
		bodyModel[75].setRotationPoint(-32.5F, -65F, 0F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 17
		bodyModel[76].setRotationPoint(-32.5F, -62F, 0F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 34, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 18
		bodyModel[77].setRotationPoint(-32F, -58F, -17F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 40F, -0.2F, -0.2F, 40F, -0.2F, -0.2F, 40F, -0.2F, -0.2F, 40F, -0.2F); // Box 19
		bodyModel[78].setRotationPoint(-32F, -108F, 0F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 5, 8, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 20
		bodyModel[79].setRotationPoint(-40.8F, -26F, -4F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[80].setRotationPoint(-38.8F, -26F, -4F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 22
		bodyModel[81].setRotationPoint(-35.8F, -26F, -4F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[82].setRotationPoint(-38F, -9.5F, 25F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[83].setRotationPoint(42F, -9.5F, 23F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[84].setRotationPoint(13F, -9.5F, 26F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[85].setRotationPoint(-13F, -9.5F, 26F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[86].setRotationPoint(-38F, -9.5F, -35F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[87].setRotationPoint(42F, -9.5F, -33F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[88].setRotationPoint(13F, -9.5F, -36F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[89].setRotationPoint(-13F, -9.5F, -36F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Import Box116
		bodyModel[90].setRotationPoint(-27F, -28F, -1.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box117
		bodyModel[91].setRotationPoint(-29.5F, -28F, -1.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 13, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box118
		bodyModel[92].setRotationPoint(-29.5F, -23F, -1.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.3F, -1F); // Box 24
		bodyModel[93].setRotationPoint(-14.5F, -18.5F, 3.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -1F); // Box 25
		bodyModel[94].setRotationPoint(-20.5F, -18.5F, 3.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.4F, -2.4F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2.4F, -2.4F); // Box 26
		bodyModel[95].setRotationPoint(-24.5F, -18.5F, 3.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.3F, -1F); // Box 27
		bodyModel[96].setRotationPoint(-15.5F, -13.5F, 8.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -1F); // Box 28
		bodyModel[97].setRotationPoint(-21.5F, -13.5F, 8.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.4F, -2.4F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2.4F, -2.4F); // Box 29
		bodyModel[98].setRotationPoint(-25.5F, -13.5F, 8.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.3F, -1F); // Box 30
		bodyModel[99].setRotationPoint(-15.5F, -13.5F, -13.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -1F); // Box 31
		bodyModel[100].setRotationPoint(-21.5F, -13.5F, -13.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.4F, -2.4F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2.4F, -2.4F); // Box 32
		bodyModel[101].setRotationPoint(-25.5F, -13.5F, -13.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.3F, -1F); // Box 33
		bodyModel[102].setRotationPoint(-14.5F, -18.5F, -8.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -1F); // Box 34
		bodyModel[103].setRotationPoint(-20.5F, -18.5F, -8.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.4F, -2.4F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2.4F, -2.4F); // Box 35
		bodyModel[104].setRotationPoint(-24.5F, -18.5F, -8.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 14, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[105].setRotationPoint(-23.5F, -15.5F, -7F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.3F, -1F); // Box 48
		bodyModel[106].setRotationPoint(12.5F, -16.5F, -8.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -1F); // Box 49
		bodyModel[107].setRotationPoint(6.5F, -16.5F, -8.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.4F, -2.4F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2.4F, -2.4F); // Box 50
		bodyModel[108].setRotationPoint(2.5F, -16.5F, -8.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.4F, -2.4F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2.4F, -2.4F); // Box 51
		bodyModel[109].setRotationPoint(2.5F, -16.5F, 3.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -1F); // Box 52
		bodyModel[110].setRotationPoint(6.5F, -16.5F, 3.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.3F, -1F); // Box 53
		bodyModel[111].setRotationPoint(12.5F, -16.5F, 3.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 55
		bodyModel[112].setRotationPoint(-145F, -21F, 0F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,1F, 0.5F, 0F, -0.5F, 0.5F, -2.5F, -0.5F, 0.5F, -2.5F, 1F, 0.5F, 0F, -2F, 6.5F, 0F, 3F, 6.5F, -2.5F, 3F, 6.5F, -2.5F, -2F, 6.5F, 0F); // Box 56
		bodyModel[113].setRotationPoint(141F, -3.5F, -2.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 8, 1, 16, 0F,0F, 0.5F, 0F, -1F, 0.5F, -5F, -1F, 0.5F, -5F, 0F, 0.5F, 0F, 0F, 6.5F, 0F, 2F, 6.5F, -5F, 2F, 6.5F, -5F, 0F, 6.5F, 0F); // Box 57
		bodyModel[114].setRotationPoint(133F, -3.5F, -7.5F);

		bodyModel[115].addShapeBox(-12F, 1F, 0F, 12, 9, 1, 0F,-4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -4F, -0.3F, -0.3F, -4F, -2.3F, -0.3F, 0F, -2.3F, -0.3F, 0F, -2.3F, -0.3F, -4F, -2.3F, -0.3F); // Box 58
		bodyModel[115].setRotationPoint(140.5F, -26.5F, 0F);
		bodyModel[115].rotateAngleZ = 0.03490659F;

		bodyModel[116].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F,1F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, 1F, -0.2F, -0.2F); // Box 59
		bodyModel[116].setRotationPoint(32.5F, -58F, 0F);
		bodyModel[116].rotateAngleZ = -1.13446401F;

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,30F, -0.2F, -0.2F, 30F, -0.2F, -0.2F, 30F, -0.2F, -0.2F, 30F, -0.2F, -0.2F, 30F, -0.2F, -0.2F, 30F, -0.2F, -0.2F, 30F, -0.2F, -0.2F, 30F, -0.2F, -0.2F); // Box 60
		bodyModel[117].setRotationPoint(-1F, -106F, 0F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,30F, -0.2F, -0.2F, 30F, -0.2F, -0.2F, 30F, -0.2F, -0.2F, 30F, -0.2F, -0.2F, 30F, -0.2F, -0.2F, 30F, -0.2F, -0.2F, 30F, -0.2F, -0.2F, 30F, -0.2F, -0.2F); // Box 61
		bodyModel[118].setRotationPoint(-1F, -85F, 7F);

		bodyModel[119].addShapeBox(-1F, 0F, 0F, 49, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 62
		bodyModel[119].setRotationPoint(-48F, -12F, 0F);
		bodyModel[119].rotateAngleZ = 1.25663706F;

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 34, 0F,-0.2F, -0.2F, -8F, -0.2F, -0.2F, -8F, -0.2F, -0.2F, -8F, -0.2F, -0.2F, -8F, -0.2F, -0.2F, -8F, -0.2F, -0.2F, -8F, -0.2F, -0.2F, -8F, -0.2F, -0.2F, -8F); // Box 0
		bodyModel[120].setRotationPoint(31F, -85F, -17F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 34, 0F,-0.2F, -0.2F, -8F, -0.2F, -0.2F, -8F, -0.2F, -0.2F, -8F, -0.2F, -0.2F, -8F, -0.2F, -0.2F, -8F, -0.2F, -0.2F, -8F, -0.2F, -0.2F, -8F, -0.2F, -0.2F, -8F); // Box 1
		bodyModel[121].setRotationPoint(-32F, -85F, -17F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,30F, -0.2F, -0.2F, 30F, -0.2F, -0.2F, 30F, -0.2F, -0.2F, 30F, -0.2F, -0.2F, 30F, -0.2F, -0.2F, 30F, -0.2F, -0.2F, 30F, -0.2F, -0.2F, 30F, -0.2F, -0.2F); // Box 2
		bodyModel[122].setRotationPoint(-1F, -85F, -8F);
	}

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[6];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 233, 217, textureX, textureY); // Box 63
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 281, 217, textureX, textureY); // Box 63
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 57, 225, textureX, textureY); // Box 63
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Box 63
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 63
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 63

		gun_2_Model[0][0].addShapeBox(-11.5F, -2F, -2.5F, 18, 3, 5, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F); // Box 63

		gun_2_Model[0][1].addShapeBox(-11.5F, -2F, -7.5F, 18, 3, 5, 0F,-3.5F, 0F, -1F, -5F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0.5F, 0F, 1F, 0F, 0F, 0F); // Box 63

		gun_2_Model[0][2].addShapeBox(-11.5F, -2F, 2.5F, 18, 3, 5, 0F,0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, -1F, -3.5F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 1F, -4F, -2F, 0F, -4F, -2F, 0F); // Box 63

		gun_2_Model[0][3].addShapeBox(-11.5F, -1F, -7.5F, 18, 3, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0.5F, -2F, 1F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 0F); // Box 63

		gun_2_Model[0][4].addShapeBox(-11.5F, -1F, 2.5F, 18, 3, 5, 0F,0F, -2F, 0F, 0.5F, -2F, 1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 63

		gun_2_Model[0][5].addShapeBox(-11.5F, 1F, -2.5F, 18, 1, 5, 0F,0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F); // Box 63

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(60F, -21F, 1F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[3];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 63
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 63
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 63

		gun_2_Model[1][0].addShapeBox(0F, -1.2F, -1F, 20, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F); // Box 63

		gun_2_Model[1][1].addShapeBox(0F, -1.2F, 3.2F, 20, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F); // Box 63

		gun_2_Model[1][2].addShapeBox(0F, -1.2F, -5.2F, 20, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F); // Box 63

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(60F, -21F, 1F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[6];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 233, 217, textureX, textureY); // Box 63
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 281, 217, textureX, textureY); // Box 63
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 57, 225, textureX, textureY); // Box 63
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Box 63
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 63
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 63

		gun_3_Model[0][0].addShapeBox(-11.5F, -2F, -2.5F, 18, 3, 5, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F); // Box 63

		gun_3_Model[0][1].addShapeBox(-11.5F, -2F, -7.5F, 18, 3, 5, 0F,-3.5F, 0F, -1F, -5F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0.5F, 0F, 1F, 0F, 0F, 0F); // Box 63

		gun_3_Model[0][2].addShapeBox(-11.5F, -2F, 2.5F, 18, 3, 5, 0F,0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, -1F, -3.5F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 1F, -4F, -2F, 0F, -4F, -2F, 0F); // Box 63

		gun_3_Model[0][3].addShapeBox(-11.5F, -1F, -7.5F, 18, 3, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0.5F, -2F, 1F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 0F); // Box 63

		gun_3_Model[0][4].addShapeBox(-11.5F, -1F, 2.5F, 18, 3, 5, 0F,0F, -2F, 0F, 0.5F, -2F, 1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 63

		gun_3_Model[0][5].addShapeBox(-11.5F, 1F, -2.5F, 18, 1, 5, 0F,0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F); // Box 63

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(81F, -15F, 1F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[3];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 63
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 63
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 63

		gun_3_Model[1][0].addShapeBox(0F, -1.2F, -1F, 20, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F); // Box 63

		gun_3_Model[1][1].addShapeBox(0F, -1.2F, 3.2F, 20, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F); // Box 63

		gun_3_Model[1][2].addShapeBox(0F, -1.2F, -5.2F, 20, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F); // Box 63

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(81F, -15F, 1F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun3", gun_3_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[6];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 233, 217, textureX, textureY); // Box 63
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 281, 217, textureX, textureY); // Box 63
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 57, 225, textureX, textureY); // Box 63
		gun_4_Model[0][3] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Box 63
		gun_4_Model[0][4] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 63
		gun_4_Model[0][5] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 63

		gun_4_Model[0][0].addShapeBox(-11.5F, -2F, -2.5F, 18, 3, 5, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F); // Box 63

		gun_4_Model[0][1].addShapeBox(-11.5F, -2F, -7.5F, 18, 3, 5, 0F,-3.5F, 0F, -1F, -5F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0.5F, 0F, 1F, 0F, 0F, 0F); // Box 63

		gun_4_Model[0][2].addShapeBox(-11.5F, -2F, 2.5F, 18, 3, 5, 0F,0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, -1F, -3.5F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 1F, -4F, -2F, 0F, -4F, -2F, 0F); // Box 63

		gun_4_Model[0][3].addShapeBox(-11.5F, -1F, -7.5F, 18, 3, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0.5F, -2F, 1F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 0F); // Box 63

		gun_4_Model[0][4].addShapeBox(-11.5F, -1F, 2.5F, 18, 3, 5, 0F,0F, -2F, 0F, 0.5F, -2F, 1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 63

		gun_4_Model[0][5].addShapeBox(-11.5F, 1F, -2.5F, 18, 1, 5, 0F,0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F); // Box 63

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(-56F, -21F, 1F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[3];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 63
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 63
		gun_4_Model[1][2] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 63

		gun_4_Model[1][0].addShapeBox(0F, -1.2F, -1F, 20, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F); // Box 63

		gun_4_Model[1][1].addShapeBox(0F, -1.2F, 3.2F, 20, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F); // Box 63

		gun_4_Model[1][2].addShapeBox(0F, -1.2F, -5.2F, 20, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F); // Box 63

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(-56F, -21F, 1F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun4", gun_4_Model);

		// Passenger 7
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[6];
		gun_5_Model[0][0] = new ModelRendererTurbo(this, 233, 217, textureX, textureY); // Box 63
		gun_5_Model[0][1] = new ModelRendererTurbo(this, 281, 217, textureX, textureY); // Box 63
		gun_5_Model[0][2] = new ModelRendererTurbo(this, 57, 225, textureX, textureY); // Box 63
		gun_5_Model[0][3] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Box 63
		gun_5_Model[0][4] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 63
		gun_5_Model[0][5] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 63

		gun_5_Model[0][0].addShapeBox(-11.5F, -2F, -2.5F, 18, 3, 5, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F); // Box 63

		gun_5_Model[0][1].addShapeBox(-11.5F, -2F, -7.5F, 18, 3, 5, 0F,-3.5F, 0F, -1F, -5F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0.5F, 0F, 1F, 0F, 0F, 0F); // Box 63

		gun_5_Model[0][2].addShapeBox(-11.5F, -2F, 2.5F, 18, 3, 5, 0F,0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, -1F, -3.5F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 1F, -4F, -2F, 0F, -4F, -2F, 0F); // Box 63

		gun_5_Model[0][3].addShapeBox(-11.5F, -1F, -7.5F, 18, 3, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0.5F, -2F, 1F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 0F); // Box 63

		gun_5_Model[0][4].addShapeBox(-11.5F, -1F, 2.5F, 18, 3, 5, 0F,0F, -2F, 0F, 0.5F, -2F, 1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 63

		gun_5_Model[0][5].addShapeBox(-11.5F, 1F, -2.5F, 18, 1, 5, 0F,0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F); // Box 63

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[0])
		{
			gunPart.setRotationPoint(-80.5F, -15F, 1F);
		}


		gun_5_Model[1] = new ModelRendererTurbo[3];
		gun_5_Model[1][0] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 63
		gun_5_Model[1][1] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 63
		gun_5_Model[1][2] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 63

		gun_5_Model[1][0].addShapeBox(0F, -1.2F, -1F, 20, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F); // Box 63

		gun_5_Model[1][1].addShapeBox(0F, -1.2F, 3.2F, 20, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F); // Box 63

		gun_5_Model[1][2].addShapeBox(0F, -1.2F, -5.2F, 20, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F); // Box 63

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[1])
		{
			gunPart.setRotationPoint(-80.5F, -15F, 1F);
		}


		gun_5_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun5", gun_5_Model);
	}
}