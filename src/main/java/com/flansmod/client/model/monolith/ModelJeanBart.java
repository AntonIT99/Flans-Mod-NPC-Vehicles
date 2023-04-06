//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelJeanBart extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelJeanBart() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[117];

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
		bodyModel[3] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 20
		bodyModel[16] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 21
		bodyModel[17] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 22
		bodyModel[18] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 23
		bodyModel[19] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 24
		bodyModel[20] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 33
		bodyModel[22] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 34
		bodyModel[23] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 35
		bodyModel[24] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 36
		bodyModel[25] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 37
		bodyModel[26] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 38
		bodyModel[27] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 39
		bodyModel[28] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 40
		bodyModel[29] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 41
		bodyModel[30] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 42
		bodyModel[31] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 43
		bodyModel[32] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 44
		bodyModel[33] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 51
		bodyModel[34] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 65
		bodyModel[35] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 71
		bodyModel[36] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 72
		bodyModel[37] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 73
		bodyModel[38] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 74
		bodyModel[39] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 97
		bodyModel[40] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 98
		bodyModel[41] = new ModelRendererTurbo(this, 345, 153, textureX, textureY); // Box 99
		bodyModel[42] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 100
		bodyModel[43] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 101
		bodyModel[44] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Box 102
		bodyModel[45] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 103
		bodyModel[46] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Box 104
		bodyModel[47] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 105
		bodyModel[48] = new ModelRendererTurbo(this, 121, 177, textureX, textureY); // Box 106
		bodyModel[49] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 107
		bodyModel[50] = new ModelRendererTurbo(this, 321, 217, textureX, textureY); // Box 108
		bodyModel[51] = new ModelRendererTurbo(this, 313, 177, textureX, textureY); // Box 109
		bodyModel[52] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 110
		bodyModel[53] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 111
		bodyModel[54] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 112
		bodyModel[55] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 113
		bodyModel[56] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 114
		bodyModel[57] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 115
		bodyModel[58] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 117
		bodyModel[59] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 39
		bodyModel[60] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Box 40
		bodyModel[61] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 41
		bodyModel[62] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 84
		bodyModel[63] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Box 85
		bodyModel[64] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 86
		bodyModel[65] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 95
		bodyModel[66] = new ModelRendererTurbo(this, 57, 193, textureX, textureY); // Box 96
		bodyModel[67] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 97
		bodyModel[68] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Box 98
		bodyModel[69] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 99
		bodyModel[70] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 100
		bodyModel[71] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 102
		bodyModel[72] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 103
		bodyModel[73] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 104
		bodyModel[74] = new ModelRendererTurbo(this, 81, 225, textureX, textureY); // Box 105
		bodyModel[75] = new ModelRendererTurbo(this, 105, 225, textureX, textureY); // Box 106
		bodyModel[76] = new ModelRendererTurbo(this, 193, 225, textureX, textureY); // Box 1
		bodyModel[77] = new ModelRendererTurbo(this, 241, 225, textureX, textureY); // Box 2
		bodyModel[78] = new ModelRendererTurbo(this, 289, 225, textureX, textureY); // Box 3
		bodyModel[79] = new ModelRendererTurbo(this, 201, 257, textureX, textureY); // Box 4
		bodyModel[80] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 5
		bodyModel[81] = new ModelRendererTurbo(this, 345, 257, textureX, textureY); // Box 6
		bodyModel[82] = new ModelRendererTurbo(this, 49, 257, textureX, textureY); // Box 7
		bodyModel[83] = new ModelRendererTurbo(this, 433, 257, textureX, textureY); // Box 8
		bodyModel[84] = new ModelRendererTurbo(this, 361, 145, textureX, textureY); // Box 9
		bodyModel[85] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 10
		bodyModel[86] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 11
		bodyModel[87] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 12
		bodyModel[88] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 13
		bodyModel[89] = new ModelRendererTurbo(this, 193, 177, textureX, textureY); // Box 14
		bodyModel[90] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Box 15
		bodyModel[91] = new ModelRendererTurbo(this, 97, 273, textureX, textureY); // Box 16
		bodyModel[92] = new ModelRendererTurbo(this, 449, 233, textureX, textureY); // Box 17
		bodyModel[93] = new ModelRendererTurbo(this, 385, 177, textureX, textureY); // Box 18
		bodyModel[94] = new ModelRendererTurbo(this, 489, 249, textureX, textureY); // Box 19
		bodyModel[95] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 20
		bodyModel[96] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 251
		bodyModel[97] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 252
		bodyModel[98] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 253
		bodyModel[99] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 24
		bodyModel[100] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 25
		bodyModel[101] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 26
		bodyModel[102] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 27
		bodyModel[103] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 28
		bodyModel[104] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 29
		bodyModel[105] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 30
		bodyModel[106] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 31
		bodyModel[107] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 32
		bodyModel[108] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 33
		bodyModel[109] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 34
		bodyModel[110] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 35
		bodyModel[111] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 43
		bodyModel[112] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 44
		bodyModel[113] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Box 45
		bodyModel[114] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 46
		bodyModel[115] = new ModelRendererTurbo(this, 137, 161, textureX, textureY); // Box 47
		bodyModel[116] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 48

		bodyModel[0].addShapeBox(0F, 0F, 0F, 10, 11, 57, 0F,20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-13F, -7F, -28F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 11, 51, 0F,19F, 0F, 0F, 19F, 0F, 3F, 19F, 0F, 3F, 19F, 0F, 0F, 19F, 0F, 0F, 19F, 0F, 3F, 19F, 0F, 3F, 19F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-53F, -7F, -25F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 9, 11, 45, 0F,10F, 0F, 0F, 10F, 0F, 3F, 10F, 0F, 3F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 3F, 10F, 0F, 3F, 10F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(-91F, -7F, -22F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 15, 11, 39, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(-116F, -7F, -19F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 18, 11, 29, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(-134F, -7F, -14F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 16, 11, 19, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(-150F, -7F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 12, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(-162F, -7F, -4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 7, 11, 9, 0F,-0.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -3F); // Box 8
		bodyModel[7].setRotationPoint(-169F, -7F, -4F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 11, 57, 0F,17.5F, 0F, 0F, 17.5F, 0F, -4F, 17.5F, 0F, -4F, 17.5F, 0F, 0F, 17.5F, 0F, 0F, 17.5F, 0F, -4F, 17.5F, 0F, -4F, 17.5F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(34.5F, -7F, -28F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 11, 49, 0F,15F, 0F, 0F, 15F, 0F, -5F, 15F, 0F, -5F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, -4F, 15F, 0F, -4F, 15F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(72F, -7F, -24F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 15, 11, 41, 0F,0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(88F, -7F, -20F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 6, 25, 0F,10F, 4.5F, 0F, 10F, 4.5F, 0F, 10F, 4.5F, 0F, 10F, 4.5F, 0F, 10F, 4.5F, 0F, 10F, 4.5F, 0F, 10F, 4.5F, 0F, 10F, 4.5F, 0F); // Box 12
		bodyModel[11].setRotationPoint(113F, -6.5F, -12F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 19, 5, 16, 0F,0F, 6F, 0F, 0F, 6.2F, -5F, 0F, 6.2F, -5F, 0F, 6F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, -5F, 0F, 4.5F, -5F, 0F, 4.5F, 0F); // Box 13
		bodyModel[12].setRotationPoint(148F, -5.5F, -7.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F,0F, 6.2F, 0F, 0F, 6.4F, -2.5F, 0F, 6.4F, -2.5F, 0F, 6.2F, 0F, 0F, 4.5F, 0F, 1F, 4.5F, -2.5F, 1F, 4.5F, -2.5F, 0F, 4.5F, 0F); // Box 14
		bodyModel[13].setRotationPoint(167F, -5.5F, -2.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 24, 8, 25, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 15
		bodyModel[14].setRotationPoint(79F, -11.5F, -12F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 19, 5, 44, 0F,0F, 0F, 0.5F, 0F, 0F, -9.5F, 0F, 0F, -9.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -9.5F, 0F, 0F, -9.5F, 0F, 0F, 0.5F); // Box 20
		bodyModel[15].setRotationPoint(60F, -11F, -21.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 21, 8, 54, 0F,15F, 0F, 0.5F, 15F, 0F, -5F, 15F, 0F, -4F, 15F, 0F, 0.5F, 15F, 0F, 0.5F, 15F, 0F, -5F, 15F, 0F, -4F, 15F, 0F, 0.5F); // Box 21
		bodyModel[16].setRotationPoint(24F, -11F, -27F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 8, 54, 0F,15F, 0F, 0F, 15F, 0F, 0.5F, 15F, 0F, 0.5F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0.5F, 15F, 0F, 0.5F, 15F, 0F, 0F); // Box 22
		bodyModel[17].setRotationPoint(-7F, -11F, -27F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 18, 8, 26, 0F,0F, 0F, 0F, 0F, 0F, 14.5F, 0F, 0F, 13.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14.5F, 0F, 0F, 13.5F, 0F, 0F, 0F); // Box 23
		bodyModel[18].setRotationPoint(-40F, -11F, -12.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 20, 8, 26, 0F,9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F); // Box 24
		bodyModel[19].setRotationPoint(-69F, -11F, -12.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 8, 20, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 25
		bodyModel[20].setRotationPoint(-81F, -11F, -9.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Box 33
		bodyModel[21].setRotationPoint(18F, -10F, -12F);

		bodyModel[22].addShapeBox(-8.5F, 0F, -2.5F, 17, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[22].setRotationPoint(26.5F, -10F, -14.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[23].setRotationPoint(18F, -10F, -23F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Box 36
		bodyModel[24].setRotationPoint(-31F, -10F, 18F);

		bodyModel[25].addShapeBox(-8.5F, 0F, -2.5F, 17, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[25].setRotationPoint(-22.5F, -10F, 15.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[26].setRotationPoint(-31F, -10F, 7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 17, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Box 39
		bodyModel[27].setRotationPoint(-89F, -16F, 3.5F);

		bodyModel[28].addShapeBox(-8.5F, 0F, -2.5F, 17, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[28].setRotationPoint(-80.5F, -16F, 1F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 17, 12, 6, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[29].setRotationPoint(-89F, -16F, -7.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 18, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Box 42
		bodyModel[30].setRotationPoint(-111.5F, -10F, 3.5F);

		bodyModel[31].addShapeBox(-9F, 0F, -2.5F, 18, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[31].setRotationPoint(-102.5F, -10F, 1F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 18, 5, 6, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[32].setRotationPoint(-111.5F, -10F, -7.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 23, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[33].setRotationPoint(23F, -38F, -3F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[34].setRotationPoint(-172F, -28F, 0F);
		bodyModel[34].rotateAngleZ = 0.17453293F;

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 50F, 1F, 1F, 50F, 1F, 1F, 50F, 1F, 1F, 50F, 1F); // Box 71
		bodyModel[35].setRotationPoint(-3.5F, -65F, 0F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 72
		bodyModel[36].setRotationPoint(-3.5F, -62F, 0F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 40F, -0.2F, -0.2F, 40F, -0.2F, -0.2F, 40F, -0.2F, -0.2F, 40F, -0.2F); // Box 73
		bodyModel[37].setRotationPoint(-3F, -108F, 0F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 74
		bodyModel[38].setRotationPoint(-3F, -64F, -10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 15, 1, 41, 0F,0F, 7F, 0F, 0F, 7F, -3.5F, 0F, 7F, -3.5F, 0F, 7F, 0F, 0F, 7F, -6F, 0F, 7F, -8.5F, 0F, 7F, -8.5F, 0F, 7F, -6F); // Box 97
		bodyModel[39].setRotationPoint(88F, 11F, -20F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 49, 0F,15F, 7F, 0F, 15F, 7F, -4F, 15F, 7F, -4F, 15F, 7F, 0F, 15F, 7F, -5F, 15F, 7F, -10F, 15F, 7F, -10F, 15F, 7F, -5F); // Box 98
		bodyModel[40].setRotationPoint(72F, 11F, -24F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 5, 1, 57, 0F,17.5F, 7F, 0F, 17.5F, 7F, -4F, 17.5F, 7F, -4F, 17.5F, 7F, 0F, 17.5F, 7F, -5F, 17.5F, 7F, -9F, 17.5F, 7F, -9F, 17.5F, 7F, -5F); // Box 99
		bodyModel[41].setRotationPoint(34.5F, 11F, -28F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 10, 1, 57, 0F,20F, 7F, 0F, 20F, 7F, 0F, 20F, 7F, 0F, 20F, 7F, 0F, 20F, 7F, -5F, 20F, 7F, -5F, 20F, 7F, -5F, 20F, 7F, -5F); // Box 100
		bodyModel[42].setRotationPoint(-13F, 11F, -28F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 51, 0F,19F, 7F, 0F, 19F, 7F, 3F, 19F, 7F, 3F, 19F, 7F, 0F, 19F, 7F, -5F, 19F, 7F, -2F, 19F, 7F, -2F, 19F, 7F, -5F); // Box 101
		bodyModel[43].setRotationPoint(-53F, 11F, -25F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 9, 1, 45, 0F,10F, 7F, 0F, 10F, 7F, 3F, 10F, 7F, 3F, 10F, 7F, 0F, 10F, 7F, -5F, 10F, 7F, -2F, 10F, 7F, -2F, 10F, 7F, -5F); // Box 102
		bodyModel[44].setRotationPoint(-91F, 11F, -22F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 18, 1, 29, 0F,0F, 7F, 0F, 0F, 7F, 5F, 0F, 7F, 5F, 0F, 7F, 0F, -4F, 6F, -5F, 0F, 7F, 0F, 0F, 7F, 0F, -4F, 6F, -5F); // Box 103
		bodyModel[45].setRotationPoint(-134F, 11F, -14F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 15, 1, 39, 0F,0F, 7F, 0F, 0F, 7F, 3F, 0F, 7F, 3F, 0F, 7F, 0F, 0F, 7F, -5F, 0F, 7F, -2F, 0F, 7F, -2F, 0F, 7F, -5F); // Box 104
		bodyModel[46].setRotationPoint(-116F, 11F, -19F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 12, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, -2F, -2F); // Box 105
		bodyModel[47].setRotationPoint(-162F, 4F, -4F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 16, 8, 19, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -3F, 4F, 5F, 0F, 4F, 5F, 0F, 0F, 0F, -3F); // Box 106
		bodyModel[48].setRotationPoint(-150F, 4F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 7, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -3F, -1.5F, -1F, -4F, 0F, 1F, -2F, 0F, 1F, -2F, -1.5F, -1F, -4F); // Box 107
		bodyModel[49].setRotationPoint(-169F, 4F, -4F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 45, 5, 34, 0F,0F, 5F, 0F, 0F, 5F, -9F, 0F, 5F, -9F, 0F, 5F, 0F, 0F, 5F, -5F, -8F, 4F, -14F, -8F, 4F, -14F, 0F, 5F, -5F); // Box 108
		bodyModel[50].setRotationPoint(103F, 9F, -16.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 19, 14, 16, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 8F, 0F, -5F, -2F, -6F, -7F, -2F, -6F, -7F, 8F, 0F, -5F); // Box 109
		bodyModel[51].setRotationPoint(148F, 4F, -7.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 8, 6, 0F,0F, 0F, 0F, 1F, 0F, -2.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 2F, 0F, -2F, 0F, -3F, -2.8F, 0F, -3F, -2.8F, 2F, 0F, -2F); // Box 110
		bodyModel[52].setRotationPoint(167F, 4F, -2.5F);

		bodyModel[53].addShapeBox(-18F, 0F, 0F, 18, 15, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 111
		bodyModel[53].setRotationPoint(-172F, -28F, 0F);
		bodyModel[53].rotateAngleZ = 0.17453293F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 40F, 0.8F, 0.8F, 40F, 0.8F, 0.8F, 40F, 0.8F, 0.8F, 40F, 0.8F); // Box 112
		bodyModel[54].setRotationPoint(-65F, -49F, 0F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 113
		bodyModel[55].setRotationPoint(-65F, -51F, 0F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 30F, -0.2F, -0.2F, 30F, -0.2F, -0.2F, 30F, -0.2F, -0.2F, 30F, -0.2F); // Box 114
		bodyModel[56].setRotationPoint(-65.5F, -85F, 0F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 115
		bodyModel[57].setRotationPoint(-65.5F, -53F, -5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 117
		bodyModel[58].setRotationPoint(168F, -25F, 0F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 17, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Box 39
		bodyModel[59].setRotationPoint(51F, -19F, 3.5F);

		bodyModel[60].addShapeBox(-8.5F, 0F, -2.5F, 17, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[60].setRotationPoint(59.5F, -19F, 1F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 17, 9, 6, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[61].setRotationPoint(51F, -19F, -7.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 17, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Box 84
		bodyModel[62].setRotationPoint(72F, -13F, 3.5F);

		bodyModel[63].addShapeBox(-8.5F, 0F, -2.5F, 17, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[63].setRotationPoint(80.5F, -13F, 1F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 17, 9, 6, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[64].setRotationPoint(72F, -13F, -7.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 17, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Box 95
		bodyModel[65].setRotationPoint(-23F, -13F, -14.5F);

		bodyModel[66].addShapeBox(-8.5F, 0F, -2.5F, 17, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[66].setRotationPoint(-14.5F, -13F, -17F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 17, 9, 6, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[67].setRotationPoint(-23F, -13F, -25.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 12, 9, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[68].setRotationPoint(34F, -25F, -5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 5, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[69].setRotationPoint(36F, -30F, -6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 100
		bodyModel[70].setRotationPoint(41F, -29F, -6F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[71].setRotationPoint(-68F, -24F, -2F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[72].setRotationPoint(-61F, -24F, -2F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[73].setRotationPoint(-69F, -25F, -4F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 6, 25, 0F,10F, 4.5F, 0F, 10F, 5F, -4.5F, 10F, 5F, -4.5F, 10F, 4.5F, 0F, 10F, 4.5F, 0F, 10F, 4.5F, -4.5F, 10F, 4.5F, -4.5F, 10F, 4.5F, 0F); // Box 105
		bodyModel[74].setRotationPoint(136F, -6.5F, -12F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 23, 11, 34, 0F,0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F); // Box 106
		bodyModel[75].setRotationPoint(103F, -7F, -16.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 17, 9, 6, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[76].setRotationPoint(-23F, -13F, 8.5F);

		bodyModel[77].addShapeBox(-8.5F, 0F, -2.5F, 17, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[77].setRotationPoint(-14.5F, -13F, 17F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 17, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Box 3
		bodyModel[78].setRotationPoint(-23F, -13F, 19.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 49, 5, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[79].setRotationPoint(-4F, -16F, -11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 11, 5, 22, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 5
		bodyModel[80].setRotationPoint(45F, -16F, -11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 19, 5, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[81].setRotationPoint(-44F, -16F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 8, 5, 22, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 7
		bodyModel[82].setRotationPoint(-25F, -16F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 8, 5, 22, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 8
		bodyModel[83].setRotationPoint(-12F, -16F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 5, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[84].setRotationPoint(-17F, -16F, -5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 25, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[85].setRotationPoint(-69F, -16F, -5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 23, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 11
		bodyModel[86].setRotationPoint(26F, -38F, -3F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 23, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 12
		bodyModel[87].setRotationPoint(21F, -38F, -3F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 23, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 13
		bodyModel[88].setRotationPoint(8F, -38F, -3F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 23, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 14
		bodyModel[89].setRotationPoint(13F, -38F, -3F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 23, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[90].setRotationPoint(10F, -38F, -3F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 29, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[91].setRotationPoint(12F, -25.5F, -7F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 6, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 17
		bodyModel[92].setRotationPoint(41F, -25.5F, -7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 23, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 18
		bodyModel[93].setRotationPoint(-38F, -38F, -3F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 23, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 19
		bodyModel[94].setRotationPoint(-43F, -38F, -3F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 23, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[95].setRotationPoint(-41F, -38F, -3F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.3F, -1F); // Box 251
		bodyModel[96].setRotationPoint(-49.5F, -18.7F, -2.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -1F); // Box 252
		bodyModel[97].setRotationPoint(-55.5F, -18.7F, -2.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.4F, -2.4F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2.4F, -2.4F); // Box 253
		bodyModel[98].setRotationPoint(-59.5F, -18.7F, -2.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.3F, -1F); // Box 24
		bodyModel[99].setRotationPoint(-49.5F, -18.5F, 3.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -1F); // Box 25
		bodyModel[100].setRotationPoint(-55.5F, -18.5F, 3.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.4F, -2.4F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2.4F, -2.4F); // Box 26
		bodyModel[101].setRotationPoint(-59.5F, -18.5F, 3.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.3F, -1F); // Box 27
		bodyModel[102].setRotationPoint(-50.5F, -13.5F, 6.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -1F); // Box 28
		bodyModel[103].setRotationPoint(-56.5F, -13.5F, 6.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.4F, -2.4F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2.4F, -2.4F); // Box 29
		bodyModel[104].setRotationPoint(-60.5F, -13.5F, 6.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.3F, -1F); // Box 30
		bodyModel[105].setRotationPoint(-50.5F, -13.5F, -11.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -1F); // Box 31
		bodyModel[106].setRotationPoint(-56.5F, -13.5F, -11.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.4F, -2.4F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2.4F, -2.4F); // Box 32
		bodyModel[107].setRotationPoint(-60.5F, -13.5F, -11.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.3F, -1F); // Box 33
		bodyModel[108].setRotationPoint(-49.5F, -18.5F, -8.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -1F); // Box 34
		bodyModel[109].setRotationPoint(-55.5F, -18.5F, -8.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.4F, -2.4F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2.4F, -2.4F); // Box 35
		bodyModel[110].setRotationPoint(-59.5F, -18.5F, -8.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -1F); // Box 43
		bodyModel[111].setRotationPoint(-18.5F, -9.5F, -32F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.4F, -2.4F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2.4F, -2.4F); // Box 44
		bodyModel[112].setRotationPoint(-22.5F, -9.5F, -32F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.3F, -1F); // Box 45
		bodyModel[113].setRotationPoint(-12.5F, -9.5F, -32F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -1F); // Box 46
		bodyModel[114].setRotationPoint(-18.5F, -9.5F, 27F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.4F, -2.4F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2.4F, -2.4F); // Box 47
		bodyModel[115].setRotationPoint(-22.5F, -9.5F, 27F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.3F, -1F); // Box 48
		bodyModel[116].setRotationPoint(-12.5F, -9.5F, 27F);
	}

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[3];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 36
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 36
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 49, 233, textureX, textureY); // Box 36

		gun_2_Model[0][0].addShapeBox(-9.55F, -3F, -1.5F, 18, 5, 5, 0F,0F, 1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 36

		gun_2_Model[0][1].addShapeBox(-9.55F, -3F, 3.5F, 18, 5, 6, 0F,0F, 1F, 0F, -1F, -1.5F, 0F, -5.5F, -1.2F, 0F, -2.5F, 0.5F, -1.5F, 1F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -1.5F, 0F, -1F); // Box 36

		gun_2_Model[0][2].addShapeBox(-9.55F, -3F, -7.5F, 18, 5, 6, 0F,-2.5F, 0.5F, -1.5F, -5.5F, -1.2F, 0F, -1F, -1.5F, 0F, 0F, 1F, 0F, -1.5F, 0F, -1F, -5.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 36

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(59.5F, -21F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[4];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 36
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 36
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 36
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 36

		gun_2_Model[1][0].addShapeBox(0F, -0.9F, -2.2F, 12, 2, 2, 0F,0F, 0.15F, 0.15F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.15F, 0.15F); // Box 36

		gun_2_Model[1][1].addShapeBox(11.5F, -0.9F, -2.2F, 16, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.2F); // Box 36

		gun_2_Model[1][2].addShapeBox(0F, -0.9F, 2.2F, 12, 2, 2, 0F,0F, 0.15F, 0.15F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.15F, 0.15F); // Box 36

		gun_2_Model[1][3].addShapeBox(11.5F, -0.9F, 2.2F, 16, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.2F); // Box 36

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(59.5F, -21F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[3];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 36
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 36
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 49, 233, textureX, textureY); // Box 36

		gun_3_Model[0][0].addShapeBox(-9.55F, -3F, -1.5F, 18, 5, 5, 0F,0F, 1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 36

		gun_3_Model[0][1].addShapeBox(-9.55F, -3F, 3.5F, 18, 5, 6, 0F,0F, 1F, 0F, -1F, -1.5F, 0F, -5.5F, -1.2F, 0F, -2.5F, 0.5F, -1.5F, 1F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -1.5F, 0F, -1F); // Box 36

		gun_3_Model[0][2].addShapeBox(-9.55F, -3F, -7.5F, 18, 5, 6, 0F,-2.5F, 0.5F, -1.5F, -5.5F, -1.2F, 0F, -1F, -1.5F, 0F, 0F, 1F, 0F, -1.5F, 0F, -1F, -5.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 36

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(80.5F, -15F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[4];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 36
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 36
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 36
		gun_3_Model[1][3] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 36

		gun_3_Model[1][0].addShapeBox(0F, -0.9F, -2.2F, 12, 2, 2, 0F,0F, 0.15F, 0.15F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.15F, 0.15F); // Box 36

		gun_3_Model[1][1].addShapeBox(11.5F, -0.9F, -2.2F, 16, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.2F); // Box 36

		gun_3_Model[1][2].addShapeBox(0F, -0.9F, 2.2F, 12, 2, 2, 0F,0F, 0.15F, 0.15F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.15F, 0.15F); // Box 36

		gun_3_Model[1][3].addShapeBox(11.5F, -0.9F, 2.2F, 16, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.2F); // Box 36

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(80.5F, -15F, 0F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun3", gun_3_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[3];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 36
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 36
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 49, 233, textureX, textureY); // Box 36

		gun_4_Model[0][0].addShapeBox(-9.55F, -3F, -1.5F, 18, 5, 5, 0F,0F, 1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 36

		gun_4_Model[0][1].addShapeBox(-9.55F, -3F, 3.5F, 18, 5, 6, 0F,0F, 1F, 0F, -1F, -1.5F, 0F, -5.5F, -1.2F, 0F, -2.5F, 0.5F, -1.5F, 1F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -1.5F, 0F, -1F); // Box 36

		gun_4_Model[0][2].addShapeBox(-9.55F, -3F, -7.5F, 18, 5, 6, 0F,-2.5F, 0.5F, -1.5F, -5.5F, -1.2F, 0F, -1F, -1.5F, 0F, 0F, 1F, 0F, -1.5F, 0F, -1F, -5.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 36

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(-80.5F, -18F, 0F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[4];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 36
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 36
		gun_4_Model[1][2] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 36
		gun_4_Model[1][3] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 36

		gun_4_Model[1][0].addShapeBox(0F, -0.9F, -2.2F, 12, 2, 2, 0F,0F, 0.15F, 0.15F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.15F, 0.15F); // Box 36

		gun_4_Model[1][1].addShapeBox(11.5F, -0.9F, -2.2F, 16, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.2F); // Box 36

		gun_4_Model[1][2].addShapeBox(0F, -0.9F, 2.2F, 12, 2, 2, 0F,0F, 0.15F, 0.15F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.15F, 0.15F); // Box 36

		gun_4_Model[1][3].addShapeBox(11.5F, -0.9F, 2.2F, 16, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.2F); // Box 36

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(-80.5F, -18F, 0F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun4", gun_4_Model);

		// Passenger 7
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[3];
		gun_5_Model[0][0] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 36
		gun_5_Model[0][1] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 36
		gun_5_Model[0][2] = new ModelRendererTurbo(this, 49, 233, textureX, textureY); // Box 36

		gun_5_Model[0][0].addShapeBox(-9.55F, -3F, -1.5F, 18, 5, 5, 0F,0F, 1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 36

		gun_5_Model[0][1].addShapeBox(-9.55F, -3F, 3.5F, 18, 5, 6, 0F,0F, 1F, 0F, -1F, -1.5F, 0F, -5.5F, -1.2F, 0F, -2.5F, 0.5F, -1.5F, 1F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -1.5F, 0F, -1F); // Box 36

		gun_5_Model[0][2].addShapeBox(-9.55F, -3F, -7.5F, 18, 5, 6, 0F,-2.5F, 0.5F, -1.5F, -5.5F, -1.2F, 0F, -1F, -1.5F, 0F, 0F, 1F, 0F, -1.5F, 0F, -1F, -5.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 36

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[0])
		{
			gunPart.setRotationPoint(-102.5F, -12F, 0F);
		}


		gun_5_Model[1] = new ModelRendererTurbo[4];
		gun_5_Model[1][0] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 36
		gun_5_Model[1][1] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 36
		gun_5_Model[1][2] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 36
		gun_5_Model[1][3] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 36

		gun_5_Model[1][0].addShapeBox(0F, -0.9F, -2.2F, 12, 2, 2, 0F,0F, 0.15F, 0.15F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.15F, 0.15F); // Box 36

		gun_5_Model[1][1].addShapeBox(11.5F, -0.9F, -2.2F, 16, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.2F); // Box 36

		gun_5_Model[1][2].addShapeBox(0F, -0.9F, 2.2F, 12, 2, 2, 0F,0F, 0.15F, 0.15F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.15F, 0.15F); // Box 36

		gun_5_Model[1][3].addShapeBox(11.5F, -0.9F, 2.2F, 16, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.2F); // Box 36

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[1])
		{
			gunPart.setRotationPoint(-102.5F, -12F, 0F);
		}


		gun_5_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun5", gun_5_Model);

		// Passenger 8
		ModelRendererTurbo[][] gun_6_Model = new ModelRendererTurbo[3][];

		gun_6_Model[0] = new ModelRendererTurbo[3];
		gun_6_Model[0][0] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 36
		gun_6_Model[0][1] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 36
		gun_6_Model[0][2] = new ModelRendererTurbo(this, 49, 233, textureX, textureY); // Box 36

		gun_6_Model[0][0].addShapeBox(-9.55F, -3F, -1.5F, 18, 5, 5, 0F,0F, 1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 36

		gun_6_Model[0][1].addShapeBox(-9.55F, -3F, 3.5F, 18, 5, 6, 0F,0F, 1F, 0F, -1F, -1.5F, 0F, -5.5F, -1.2F, 0F, -2.5F, 0.5F, -1.5F, 1F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -1.5F, 0F, -1F); // Box 36

		gun_6_Model[0][2].addShapeBox(-9.55F, -3F, -7.5F, 18, 5, 6, 0F,-2.5F, 0.5F, -1.5F, -5.5F, -1.2F, 0F, -1F, -1.5F, 0F, 0F, 1F, 0F, -1.5F, 0F, -1F, -5.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 36

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[0])
		{
			gunPart.setRotationPoint(-14.5F, -15F, 16F);
		}


		gun_6_Model[1] = new ModelRendererTurbo[4];
		gun_6_Model[1][0] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 36
		gun_6_Model[1][1] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 36
		gun_6_Model[1][2] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 36
		gun_6_Model[1][3] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 36

		gun_6_Model[1][0].addShapeBox(0F, -0.9F, -2.2F, 12, 2, 2, 0F,0F, 0.15F, 0.15F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.15F, 0.15F); // Box 36

		gun_6_Model[1][1].addShapeBox(11.5F, -0.9F, -2.2F, 16, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.2F); // Box 36

		gun_6_Model[1][2].addShapeBox(0F, -0.9F, 2.2F, 12, 2, 2, 0F,0F, 0.15F, 0.15F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.15F, 0.15F); // Box 36

		gun_6_Model[1][3].addShapeBox(11.5F, -0.9F, 2.2F, 16, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.2F); // Box 36

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[1])
		{
			gunPart.setRotationPoint(-14.5F, -15F, 16F);
		}


		gun_6_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun6", gun_6_Model);

		// Passenger 8
		ModelRendererTurbo[][] gun_7_Model = new ModelRendererTurbo[3][];

		gun_7_Model[0] = new ModelRendererTurbo[3];
		gun_7_Model[0][0] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 36
		gun_7_Model[0][1] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 36
		gun_7_Model[0][2] = new ModelRendererTurbo(this, 49, 233, textureX, textureY); // Box 36

		gun_7_Model[0][0].addShapeBox(-9.55F, -3F, -1.5F, 18, 5, 5, 0F,0F, 1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 36

		gun_7_Model[0][1].addShapeBox(-9.55F, -3F, 3.5F, 18, 5, 6, 0F,0F, 1F, 0F, -1F, -1.5F, 0F, -5.5F, -1.2F, 0F, -2.5F, 0.5F, -1.5F, 1F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -1.5F, 0F, -1F); // Box 36

		gun_7_Model[0][2].addShapeBox(-9.55F, -3F, -7.5F, 18, 5, 6, 0F,-2.5F, 0.5F, -1.5F, -5.5F, -1.2F, 0F, -1F, -1.5F, 0F, 0F, 1F, 0F, -1.5F, 0F, -1F, -5.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 36

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_7_Model[0])
		{
			gunPart.setRotationPoint(-14.5F, -15F, -18F);
		}


		gun_7_Model[1] = new ModelRendererTurbo[4];
		gun_7_Model[1][0] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 36
		gun_7_Model[1][1] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 36
		gun_7_Model[1][2] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 36
		gun_7_Model[1][3] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 36

		gun_7_Model[1][0].addShapeBox(0F, -0.9F, -2.2F, 12, 2, 2, 0F,0F, 0.15F, 0.15F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.15F, 0.15F); // Box 36

		gun_7_Model[1][1].addShapeBox(11.5F, -0.9F, -2.2F, 16, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.2F); // Box 36

		gun_7_Model[1][2].addShapeBox(0F, -0.9F, 2.2F, 12, 2, 2, 0F,0F, 0.15F, 0.15F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.15F, 0.15F); // Box 36

		gun_7_Model[1][3].addShapeBox(11.5F, -0.9F, 2.2F, 16, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.2F); // Box 36

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_7_Model[1])
		{
			gunPart.setRotationPoint(-14.5F, -15F, -18F);
		}


		gun_7_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun7", gun_7_Model);
	}
}