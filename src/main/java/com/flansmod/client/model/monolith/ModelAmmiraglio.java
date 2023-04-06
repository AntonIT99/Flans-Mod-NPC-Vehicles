//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAmmiraglio extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelAmmiraglio() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[134];

		initbodyModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box1
		bodyModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box2
		bodyModel[2] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box3
		bodyModel[3] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box4
		bodyModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box5
		bodyModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box6
		bodyModel[6] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Import Box7
		bodyModel[7] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Import Box8
		bodyModel[8] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box9
		bodyModel[9] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import Box11
		bodyModel[10] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Import Box12
		bodyModel[11] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Import Box13
		bodyModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box14
		bodyModel[13] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import Box15
		bodyModel[14] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Import Box16
		bodyModel[15] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Import Box17
		bodyModel[16] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Import Box18
		bodyModel[17] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Import Box19
		bodyModel[18] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Import Box20
		bodyModel[19] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box21
		bodyModel[20] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box22
		bodyModel[21] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box23
		bodyModel[22] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box24
		bodyModel[23] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box29
		bodyModel[24] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box30
		bodyModel[25] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Import Box48
		bodyModel[26] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import Box49
		bodyModel[27] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box50
		bodyModel[28] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Import Box51
		bodyModel[29] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box52
		bodyModel[30] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Import Box55
		bodyModel[31] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box58
		bodyModel[32] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import Box60
		bodyModel[33] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import Box62
		bodyModel[34] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box69
		bodyModel[35] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import Box70
		bodyModel[36] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Import Box71
		bodyModel[37] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Import Box72
		bodyModel[38] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Import Box73
		bodyModel[39] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Import Box74
		bodyModel[40] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Import Box75
		bodyModel[41] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Import Box96
		bodyModel[42] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box97
		bodyModel[43] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box110
		bodyModel[44] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Import Box111
		bodyModel[45] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Import Box112
		bodyModel[46] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import Box116
		bodyModel[47] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Import Box117
		bodyModel[48] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Import Box118
		bodyModel[49] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Import Box160
		bodyModel[50] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Import Box161
		bodyModel[51] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Import Box162
		bodyModel[52] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import Box163
		bodyModel[53] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Import Box164
		bodyModel[54] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Import Box165
		bodyModel[55] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Import Box166
		bodyModel[56] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Import Box167
		bodyModel[57] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Import Box168
		bodyModel[58] = new ModelRendererTurbo(this, 153, 153, textureX, textureY); // Import Box169
		bodyModel[59] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import Box170
		bodyModel[60] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Import Box171
		bodyModel[61] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Import Box172
		bodyModel[62] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box179
		bodyModel[63] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Import Box180
		bodyModel[64] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Import Box181
		bodyModel[65] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box185
		bodyModel[66] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Import Box186
		bodyModel[67] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import Box187
		bodyModel[68] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Box199
		bodyModel[69] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Import Box200
		bodyModel[70] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Import Box201
		bodyModel[71] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Import Box146
		bodyModel[72] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Import Box147
		bodyModel[73] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Import Box148
		bodyModel[74] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Import Box149
		bodyModel[75] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Import Box150
		bodyModel[76] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Import Box151
		bodyModel[77] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Import Box152
		bodyModel[78] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Import Box153
		bodyModel[79] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import Box154
		bodyModel[80] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box155
		bodyModel[81] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Import Box156
		bodyModel[82] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Import Box157
		bodyModel[83] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Import Box158
		bodyModel[84] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box159
		bodyModel[85] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Import Box146
		bodyModel[86] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Import Box147
		bodyModel[87] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Import Box148
		bodyModel[88] = new ModelRendererTurbo(this, 41, 169, textureX, textureY); // Import Box149
		bodyModel[89] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Import Box150
		bodyModel[90] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Import Box151
		bodyModel[91] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Import Box152
		bodyModel[92] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Import Box153
		bodyModel[93] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Import Box154
		bodyModel[94] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Import Box155
		bodyModel[95] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Import Box156
		bodyModel[96] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Import Box157
		bodyModel[97] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Import Box158
		bodyModel[98] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Import Box159
		bodyModel[99] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Box 1
		bodyModel[100] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 2
		bodyModel[101] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Box 3
		bodyModel[102] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 4
		bodyModel[103] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 5
		bodyModel[104] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 6
		bodyModel[105] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 8
		bodyModel[106] = new ModelRendererTurbo(this, 441, 185, textureX, textureY); // Box 9
		bodyModel[107] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Box 10
		bodyModel[108] = new ModelRendererTurbo(this, 257, 185, textureX, textureY); // Box 11
		bodyModel[109] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 12
		bodyModel[110] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 13
		bodyModel[111] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 14
		bodyModel[112] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 15
		bodyModel[113] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 16
		bodyModel[114] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 17
		bodyModel[115] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 18
		bodyModel[116] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 19
		bodyModel[117] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 20
		bodyModel[118] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 21
		bodyModel[119] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 22
		bodyModel[120] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 23
		bodyModel[121] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 24
		bodyModel[122] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 25
		bodyModel[123] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 26
		bodyModel[124] = new ModelRendererTurbo(this, 289, 193, textureX, textureY); // Box 27
		bodyModel[125] = new ModelRendererTurbo(this, 329, 193, textureX, textureY); // Box 28
		bodyModel[126] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 29
		bodyModel[127] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 41
		bodyModel[128] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 42
		bodyModel[129] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 43
		bodyModel[130] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 44
		bodyModel[131] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 45
		bodyModel[132] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 46
		bodyModel[133] = new ModelRendererTurbo(this, 96, 202, textureX, textureY); // Box 47

		bodyModel[0].addShapeBox(0F, 0F, 0F, 8, 9, 36, 0F,25F, 0F, -1F, 25F, 0F, -1F, 25F, 0F, -1F, 25F, 0F, -1F, 25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F); // Import Box1
		bodyModel[0].setRotationPoint(-4F, -5F, -18F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 21, 7, 36, 0F,0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box2
		bodyModel[1].setRotationPoint(-50F, -3F, -18F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 18, 7, 35, 0F,0F, 0.2F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.2F, -3F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F); // Import Box3
		bodyModel[2].setRotationPoint(-68F, -3F, -17.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 18, 7, 31, 0F,0F, 0.5F, -5F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0.5F, -5F, 0F, 0F, -3.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3.5F); // Import Box4
		bodyModel[3].setRotationPoint(-86F, -3F, -15.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 11, 7, 23, 0F,0F, 1F, -5.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 1F, -5.5F, 0F, 0F, -4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4F); // Import Box5
		bodyModel[4].setRotationPoint(-97F, -3F, -11.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 10, 8, 14, 0F,0F, 0.2F, -5.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.2F, -5.5F, 1F, 0F, -5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, -5F); // Import Box6
		bodyModel[5].setRotationPoint(-107F, -4F, -7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 21, 7, 36, 0F,0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box7
		bodyModel[6].setRotationPoint(29F, -3F, -18F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 20, 7, 32, 0F,0F, 0F, -1F, 0F, 0.8F, -3.5F, 0F, 0.8F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Box8
		bodyModel[7].setRotationPoint(50F, -3F, -16F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 13, 8, 20, 0F,0F, 0.2F, 0F, 0F, 0.8F, -4F, 0F, 0.8F, -4F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Import Box9
		bodyModel[8].setRotationPoint(82F, -4F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 12, 7, 26, 0F,0F, 0.8F, -0.5F, 0F, 1.2F, -3F, 0F, 1.2F, -3F, 0F, 0.8F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Box11
		bodyModel[9].setRotationPoint(70F, -3F, -13F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 10, 5, 12, 0F,0F, -0.2F, 0F, -0.5F, 0F, -5.5F, -0.5F, 0F, -5.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0.2F, 0F, -5.5F, 0.2F, 0F, -5.5F, 0F, -0.2F, 0F); // Import Box12
		bodyModel[10].setRotationPoint(95F, -5F, -6F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 10, 4, 12, 0F,0F, 0F, 0F, 0.2F, 0F, -5.5F, 0.2F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -5.5F, 1.5F, 0F, -5.5F, 0F, 0F, 0F); // Import Box13
		bodyModel[11].setRotationPoint(95F, 0F, -6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Import Box14
		bodyModel[12].setRotationPoint(103F, -17F, -0.5F);
		bodyModel[12].rotateAngleZ = 0.03490659F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Import Box15
		bodyModel[13].setRotationPoint(103.2F, -9F, -0.5F);
		bodyModel[13].rotateAngleZ = -0.2443461F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 8, 10, 35, 0F,25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F); // Import Box16
		bodyModel[14].setRotationPoint(-4F, -10.5F, -17.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 8, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[15].setRotationPoint(-37F, -12.5F, -15F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 9, 10, 30, 0F,0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F); // Import Box18
		bodyModel[16].setRotationPoint(-46F, -12.5F, -15F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 11, 11, 29, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box19
		bodyModel[17].setRotationPoint(29F, -12.5F, -14.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 7, 11, 29, 0F,0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Import Box20
		bodyModel[18].setRotationPoint(40F, -12.5F, -14.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 7, 4, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box21
		bodyModel[19].setRotationPoint(-29F, -12F, -20.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 0F, -1F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box22
		bodyModel[20].setRotationPoint(-22F, -12F, -20.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,-1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box23
		bodyModel[21].setRotationPoint(20F, -12F, -19.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 7, 4, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box24
		bodyModel[22].setRotationPoint(23F, -12F, -19.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 0F, -1F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box29
		bodyModel[23].setRotationPoint(-5F, -7F, -20.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,-2.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box30
		bodyModel[24].setRotationPoint(-10F, -7F, -20.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 52, 2, 0F,-0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box48
		bodyModel[25].setRotationPoint(1F, -74.5F, -1F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box49
		bodyModel[26].setRotationPoint(0.5F, -22.5F, -1.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Import Box50
		bodyModel[27].setRotationPoint(-1.5F, -23F, -3.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 24, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Import Box51
		bodyModel[28].setRotationPoint(1.5F, -41.5F, -12F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Import Box52
		bodyModel[29].setRotationPoint(1.5F, -68.5F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Import Box55
		bodyModel[30].setRotationPoint(-2F, -24.5F, -4F);

		bodyModel[31].addShapeBox(0F, 0F, -6F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box58
		bodyModel[31].setRotationPoint(-6.5F, -5.5F, -20F);

		bodyModel[32].addShapeBox(-0.5F, 0F, -6F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box60
		bodyModel[32].setRotationPoint(26.5F, -10.5F, -19F);
		bodyModel[32].rotateAngleY = 0.78539816F;

		bodyModel[33].addShapeBox(-0.5F, 0F, -6F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box62
		bodyModel[33].setRotationPoint(-25.5F, -10.5F, -20F);
		bodyModel[33].rotateAngleY = -0.78539816F;

		bodyModel[34].addShapeBox(-6F, 1.5F, -2F, 13, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box69
		bodyModel[34].setRotationPoint(53.5F, -8.5F, 0F);

		bodyModel[35].addShapeBox(-6F, 1.5F, -6F, 13, 7, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box70
		bodyModel[35].setRotationPoint(53.5F, -8.5F, 0F);

		bodyModel[36].addShapeBox(-6F, 1.5F, 2F, 13, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box71
		bodyModel[36].setRotationPoint(53.5F, -8.5F, 0F);

		bodyModel[37].addShapeBox(-6F, 1.5F, 2F, 13, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box72
		bodyModel[37].setRotationPoint(-53F, -8F, 0F);

		bodyModel[38].addShapeBox(-6F, 1.5F, -2F, 13, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box73
		bodyModel[38].setRotationPoint(-53F, -8F, 0F);

		bodyModel[39].addShapeBox(-6F, 1.5F, -6F, 13, 9, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box74
		bodyModel[39].setRotationPoint(-53F, -8F, 0F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 11, 6, 7, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import Box75
		bodyModel[40].setRotationPoint(38F, -22F, -3.5F);

		bodyModel[41].addShapeBox(-16.8F, 0F, 0F, 21, 15, 1, 0F,-4F, -3.5F, -0.4F, -4F, -3.5F, -0.4F, -4F, -3.5F, -0.4F, -4F, -3.5F, -0.4F, -4F, -3.5F, -0.4F, -4F, -3.5F, -0.4F, -4F, -3.5F, -0.4F, -4F, -3.5F, -0.4F); // Import Box96
		bodyModel[41].setRotationPoint(-108F, -23F, -0.5F);
		bodyModel[41].rotateAngleZ = 0.03490659F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Import Box97
		bodyModel[42].setRotationPoint(-108F, -20F, -0.5F);
		bodyModel[42].rotateAngleZ = 0.05235988F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Import Box110
		bodyModel[43].setRotationPoint(15F, -22F, -7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box111
		bodyModel[44].setRotationPoint(12.5F, -22F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box112
		bodyModel[45].setRotationPoint(12.5F, -17F, -7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Import Box116
		bodyModel[46].setRotationPoint(-17F, -22F, -7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box117
		bodyModel[47].setRotationPoint(-19.5F, -22F, -7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box118
		bodyModel[48].setRotationPoint(-19.5F, -17F, -7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 8, 14, 36, 0F,25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, -3F, 25F, 0F, -3F, 25F, 0F, -3F, 25F, 0F, -3F); // Import Box160
		bodyModel[49].setRotationPoint(-4F, 4F, -18F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 21, 14, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4.5F); // Import Box161
		bodyModel[50].setRotationPoint(-50F, 4F, -18F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 18, 14, 35, 0F,0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -6F); // Import Box162
		bodyModel[51].setRotationPoint(-68F, 4F, -17.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 18, 11, 31, 0F,0F, 0F, -3.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3.5F, 0F, 0F, -9F, 0F, 3F, -4F, 0F, 3F, -4F, 0F, 0F, -9F); // Import Box163
		bodyModel[52].setRotationPoint(-86F, 4F, -15.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 11, 11, 23, 0F,0F, 0F, -4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, -2F, -9.5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -2F, -9.5F); // Import Box164
		bodyModel[53].setRotationPoint(-97F, 4F, -11.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 10, 9, 14, 0F,1F, 0F, -5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, -5F, -3F, -3F, -6F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, -3F, -6F); // Import Box165
		bodyModel[54].setRotationPoint(-107F, 4F, -7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 21, 14, 36, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -3F); // Import Box166
		bodyModel[55].setRotationPoint(29F, 4F, -18F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 20, 14, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -3F); // Import Box167
		bodyModel[56].setRotationPoint(50F, 4F, -16F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 12, 14, 26, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -3.5F); // Import Box168
		bodyModel[57].setRotationPoint(70F, 4F, -13F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 13, 11, 20, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 3F, -3F); // Import Box169
		bodyModel[58].setRotationPoint(82F, 4F, -10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 10, 4, 12, 0F,0F, 0F, 0F, 1.5F, 0F, -5.5F, 1.5F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, -0.8F, 4F, 0F, -5.5F, 4F, 0F, -5.5F, 0F, 0F, -0.8F); // Import Box170
		bodyModel[59].setRotationPoint(95F, 4F, -6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 10, 4, 12, 0F,0F, 0F, -0.8F, 4F, 0F, -5.5F, 4F, 0F, -5.5F, 0F, 0F, -0.8F, 0F, 3F, -2F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 3F, -2F); // Import Box171
		bodyModel[60].setRotationPoint(95F, 8F, -6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 10, 9, 2, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box172
		bodyModel[61].setRotationPoint(-104F, 9F, -1F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Import Box179
		bodyModel[62].setRotationPoint(15F, -22F, 4F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box180
		bodyModel[63].setRotationPoint(12.5F, -22F, 4F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box181
		bodyModel[64].setRotationPoint(12.5F, -17F, 4F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Import Box185
		bodyModel[65].setRotationPoint(-17F, -22F, 4F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box186
		bodyModel[66].setRotationPoint(-19.5F, -22F, 4F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box187
		bodyModel[67].setRotationPoint(-19.5F, -17F, 4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 26, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box199
		bodyModel[68].setRotationPoint(-27F, -36.5F, -3F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 26, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box200
		bodyModel[69].setRotationPoint(-25F, -36.5F, -3F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 26, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box201
		bodyModel[70].setRotationPoint(-29F, -36.5F, -3F);

		bodyModel[71].addShapeBox(-8.5F, -0.5F, -2F, 14, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box146
		bodyModel[71].setRotationPoint(0F, -5F, 0F);

		bodyModel[72].addShapeBox(-8.5F, -0.5F, -6F, 14, 2, 4, 0F,-6.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box147
		bodyModel[72].setRotationPoint(0F, -5F, 0F);

		bodyModel[73].addShapeBox(-8.5F, -0.5F, 2F, 14, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -6.5F, 0F, -0.5F); // Import Box148
		bodyModel[73].setRotationPoint(0F, -5F, 0F);

		bodyModel[74].addShapeBox(-8.5F, -1.5F, -2F, 14, 1, 4, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box149
		bodyModel[74].setRotationPoint(0F, -5F, 0F);

		bodyModel[75].addShapeBox(-8.5F, -1.5F, -6F, 14, 1, 4, 0F,-6.5F, 0F, -2F, -3.5F, 0F, -2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -6.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box150
		bodyModel[75].setRotationPoint(0F, -5F, 0F);

		bodyModel[76].addShapeBox(-8.5F, -1.5F, 2F, 14, 1, 4, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -3.5F, 0F, -2F, -6.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -6.5F, 0F, -0.5F); // Import Box151
		bodyModel[76].setRotationPoint(0F, -5F, 0F);

		bodyModel[77].addShapeBox(0F, -1.2F, -2.5F, 7, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box152
		bodyModel[77].setRotationPoint(0F, -5F, 0F);

		bodyModel[78].addShapeBox(0F, -1.2F, 0.5F, 7, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box153
		bodyModel[78].setRotationPoint(0F, -5F, 0F);

		bodyModel[79].addShapeBox(7F, -1.2F, 0.5F, 2, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Import Box154
		bodyModel[79].setRotationPoint(0F, -5F, 0F);

		bodyModel[80].addShapeBox(7F, -1.2F, -2.5F, 2, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Import Box155
		bodyModel[80].setRotationPoint(0F, -5F, 0F);

		bodyModel[81].addShapeBox(9F, -1.2F, -2.5F, 3, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box156
		bodyModel[81].setRotationPoint(0F, -5F, 0F);

		bodyModel[82].addShapeBox(12F, -1.2F, -2.5F, 5, 2, 2, 0F,0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Import Box157
		bodyModel[82].setRotationPoint(0F, -5F, 0F);

		bodyModel[83].addShapeBox(12F, -1.2F, 0.5F, 5, 2, 2, 0F,0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Import Box158
		bodyModel[83].setRotationPoint(0F, -5F, 0F);

		bodyModel[84].addShapeBox(9F, -1.2F, 0.5F, 3, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box159
		bodyModel[84].setRotationPoint(0F, -5F, 0F);

		bodyModel[85].addShapeBox(-8.5F, -0.5F, -2F, 14, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box146
		bodyModel[85].setRotationPoint(0F, -5F, 0F);

		bodyModel[86].addShapeBox(-8.5F, -0.5F, -6F, 14, 2, 4, 0F,-6.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box147
		bodyModel[86].setRotationPoint(0F, -5F, 0F);

		bodyModel[87].addShapeBox(-8.5F, -0.5F, 2F, 14, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -6.5F, 0F, -0.5F); // Import Box148
		bodyModel[87].setRotationPoint(0F, -5F, 0F);

		bodyModel[88].addShapeBox(-8.5F, -1.5F, -2F, 14, 1, 4, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box149
		bodyModel[88].setRotationPoint(0F, -5F, 0F);

		bodyModel[89].addShapeBox(-8.5F, -1.5F, -6F, 14, 1, 4, 0F,-6.5F, 0F, -2F, -3.5F, 0F, -2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -6.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box150
		bodyModel[89].setRotationPoint(0F, -5F, 0F);

		bodyModel[90].addShapeBox(-8.5F, -1.5F, 2F, 14, 1, 4, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -3.5F, 0F, -2F, -6.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -6.5F, 0F, -0.5F); // Import Box151
		bodyModel[90].setRotationPoint(0F, -5F, 0F);

		bodyModel[91].addShapeBox(0F, -1.2F, -2.5F, 7, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box152
		bodyModel[91].setRotationPoint(0F, -5F, 0F);

		bodyModel[92].addShapeBox(0F, -1.2F, 0.5F, 7, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box153
		bodyModel[92].setRotationPoint(0F, -5F, 0F);

		bodyModel[93].addShapeBox(7F, -1.2F, 0.5F, 2, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Import Box154
		bodyModel[93].setRotationPoint(0F, -5F, 0F);

		bodyModel[94].addShapeBox(7F, -1.2F, -2.5F, 2, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Import Box155
		bodyModel[94].setRotationPoint(0F, -5F, 0F);

		bodyModel[95].addShapeBox(9F, -1.2F, -2.5F, 3, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box156
		bodyModel[95].setRotationPoint(0F, -5F, 0F);

		bodyModel[96].addShapeBox(12F, -1.2F, -2.5F, 5, 2, 2, 0F,0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Import Box157
		bodyModel[96].setRotationPoint(0F, -5F, 0F);

		bodyModel[97].addShapeBox(12F, -1.2F, 0.5F, 5, 2, 2, 0F,0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Import Box158
		bodyModel[97].setRotationPoint(0F, -5F, 0F);

		bodyModel[98].addShapeBox(9F, -1.2F, 0.5F, 3, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box159
		bodyModel[98].setRotationPoint(0F, -5F, 0F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 26, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 1
		bodyModel[99].setRotationPoint(23F, -36.5F, -3F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 26, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[100].setRotationPoint(25F, -36.5F, -3F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 26, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 3
		bodyModel[101].setRotationPoint(27F, -36.5F, -3F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 4
		bodyModel[102].setRotationPoint(-1.5F, -44F, -3.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 5
		bodyModel[103].setRotationPoint(-2F, -45.5F, -4F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 11, 1, 7, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -4F, 0F, 0.5F, -4F, 0F, 0.5F, 0F, 0F, 2F); // Box 6
		bodyModel[104].setRotationPoint(38F, -16F, -3.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[105].setRotationPoint(33F, -22F, -5.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 10, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[106].setRotationPoint(34F, -21F, -3F);

		bodyModel[107].addShapeBox(0F, 0F, -14F, 4, 3, 15, 0F,6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[107].setRotationPoint(35F, -18F, -3.5F);

		bodyModel[108].addShapeBox(0F, 0F, -14F, 4, 3, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F); // Box 11
		bodyModel[108].setRotationPoint(35F, -18F, 16.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 0F, -1F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[109].setRotationPoint(11F, -7F, -20.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,-2.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 13
		bodyModel[110].setRotationPoint(6F, -7F, -20.5F);

		bodyModel[111].addShapeBox(0F, 0F, -6F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[111].setRotationPoint(9.5F, -5.5F, -20F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F, 0F); // Box 15
		bodyModel[112].setRotationPoint(-5F, -7F, 17.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -0.5F); // Box 16
		bodyModel[113].setRotationPoint(-10F, -7F, 17.5F);

		bodyModel[114].addShapeBox(0F, 0F, -6F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[114].setRotationPoint(-6.5F, -5.5F, 26F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F, 0F); // Box 18
		bodyModel[115].setRotationPoint(11F, -7F, 17.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -0.5F); // Box 19
		bodyModel[116].setRotationPoint(6F, -7F, 17.5F);

		bodyModel[117].addShapeBox(0F, 0F, -6F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[117].setRotationPoint(9.5F, -5.5F, 26F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 7, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 21
		bodyModel[118].setRotationPoint(-29F, -12F, 17.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F, 0F); // Box 22
		bodyModel[119].setRotationPoint(-22F, -12F, 17.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F); // Box 23
		bodyModel[120].setRotationPoint(20F, -12F, 16.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 7, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[121].setRotationPoint(23F, -12F, 16.5F);

		bodyModel[122].addShapeBox(-0.5F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[122].setRotationPoint(26.5F, -10.5F, 19F);
		bodyModel[122].rotateAngleY = -0.78539816F;

		bodyModel[123].addShapeBox(-0.5F, 0F, -6F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[123].setRotationPoint(-25.5F, -10.5F, 20F);
		bodyModel[123].rotateAngleY = -2.35619449F;

		bodyModel[124].addShapeBox(0F, 0F, -14F, 4, 3, 13, 0F,-6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[124].setRotationPoint(-35F, -18F, -1.5F);

		bodyModel[125].addShapeBox(0F, 0F, -14F, 4, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F); // Box 28
		bodyModel[125].setRotationPoint(-35F, -18F, 16.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 6, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[126].setRotationPoint(-37F, -19F, -3F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 41
		bodyModel[127].setRotationPoint(-38F, -22F, -7F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[128].setRotationPoint(-40.5F, -22F, -7F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[129].setRotationPoint(-40.5F, -17F, -7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 44
		bodyModel[130].setRotationPoint(-38F, -22F, 4F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[131].setRotationPoint(-40.5F, -22F, 4F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[132].setRotationPoint(-40.5F, -17F, 4F);

		bodyModel[133].addShapeBox(-5.3F, -1F, 0F, 7, 7, 1, 0F,-1.5F, -1.5F, -0.35F, -1.5F, -1.5F, -0.35F, -1.5F, -1.5F, -0.35F, -1.5F, -1.5F, -0.35F, -1.5F, -1.5F, -0.35F, -1.5F, -1.5F, -0.35F, -1.5F, -1.5F, -0.35F, -1.5F, -1.5F, -0.35F); // Box 47
		bodyModel[133].setRotationPoint(103F, -17F, -0.5F);
		bodyModel[133].rotateAngleZ = 0.03490659F;
	}

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[6];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 353, 193, textureX, textureY); // Box 30
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 30
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 30
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 393, 193, textureX, textureY); // Box 30
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 30
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 30

		gun_2_Model[0][0].addShapeBox(-6F, -2F, -6F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 30

		gun_2_Model[0][1].addShapeBox(2F, -2F, -2F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30

		gun_2_Model[0][2].addShapeBox(-6F, -2F, -2F, 8, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30

		gun_2_Model[0][3].addShapeBox(-6F, -2F, 2F, 12, 4, 4, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 30

		gun_2_Model[0][4].addShapeBox(2F, -2F, -6F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, -2F, -3.9F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30

		gun_2_Model[0][5].addShapeBox(2F, -2F, 2F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9F, 0F, 0F, 0F); // Box 30

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(53.5F, -9F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[4];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 30
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 30
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 30
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 30

		gun_2_Model[1][0].addShapeBox(0F, -1F, -2.5F, 8, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 30

		gun_2_Model[1][1].addShapeBox(8F, -1F, -2.5F, 8, 2, 2, 0F,0F, -0.4F, -0.4F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.4F, -0.4F); // Box 30

		gun_2_Model[1][2].addShapeBox(8F, -1F, 1.5F, 8, 2, 2, 0F,0F, -0.4F, -0.4F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.4F, -0.4F); // Box 30

		gun_2_Model[1][3].addShapeBox(0F, -1F, 1.5F, 8, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 30

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(53.5F, -9F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[6];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 353, 193, textureX, textureY); // Box 30
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 30
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 30
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 393, 193, textureX, textureY); // Box 30
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 30
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 30

		gun_3_Model[0][0].addShapeBox(-6F, -2F, -6F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 30

		gun_3_Model[0][1].addShapeBox(2F, -2F, -2F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30

		gun_3_Model[0][2].addShapeBox(-6F, -2F, -2F, 8, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30

		gun_3_Model[0][3].addShapeBox(-6F, -2F, 2F, 12, 4, 4, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 30

		gun_3_Model[0][4].addShapeBox(2F, -2F, -6F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, -2F, -3.9F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30

		gun_3_Model[0][5].addShapeBox(2F, -2F, 2F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9F, 0F, 0F, 0F); // Box 30

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(-53F, -8.5F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[4];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 30
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 30
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 30
		gun_3_Model[1][3] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 30

		gun_3_Model[1][0].addShapeBox(0F, -1F, -2.5F, 8, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 30

		gun_3_Model[1][1].addShapeBox(8F, -1F, -2.5F, 8, 2, 2, 0F,0F, -0.4F, -0.4F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.4F, -0.4F); // Box 30

		gun_3_Model[1][2].addShapeBox(8F, -1F, 1.5F, 8, 2, 2, 0F,0F, -0.4F, -0.4F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.4F, -0.4F); // Box 30

		gun_3_Model[1][3].addShapeBox(0F, -1F, 1.5F, 8, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 30

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(-53F, -8.5F, 0F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun3", gun_3_Model);
	}
}