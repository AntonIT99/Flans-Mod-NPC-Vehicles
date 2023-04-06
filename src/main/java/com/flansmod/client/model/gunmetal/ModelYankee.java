//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: U.S Sharpshooters Uniform Coat
// Model Creator: 
// Created on: 28.07.2017 - 10:13:26
// Last changed on: 28.07.2017 - 10:13:26

package com.flansmod.client.model.gunmetal; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelYankee extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelYankee() //Same as Filename
	{
		headModel = new ModelRendererTurbo[7];
		bodyModel = new ModelRendererTurbo[131];
		leftArmModel = new ModelRendererTurbo[8];
		rightArmModel = new ModelRendererTurbo[8];
		leftLegModel = new ModelRendererTurbo[14];
		rightLegModel = new ModelRendererTurbo[12];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 33
		headModel[1] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 34
		headModel[2] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 36
		headModel[3] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 37
		headModel[4] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 38
		headModel[5] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 42
		headModel[6] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 183

		headModel[0].addShapeBox(-4F, -8F, -5F, 8, 1, 1, 0F,0.100000000000001F, -0.8F, -0.1F, 0.0999999999999983F, -0.9F, -0.1F, 0.0999999999999996F, -0.8F, -0.100000000000001F, 0.0999999999999994F, -0.699999999999999F, -0.0999999999999996F, 0.1F, 1.02695629777827E-15F, -0.1F, 0.0999999999999996F, 0.1F, -0.100000000000001F, 0.0999999999999996F, -2.77555756156289E-17F, -0.1F, 0.1F, -0.1F, -0.0999999999999996F); // Box 33
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -8F, -4F, 8, 1, 8, 0F,0.100000000000001F, -0.2F, 0.1F, 0.0999999999999996F, -0.3F, 0.100000000000001F, 0.0999999999999996F, 0.0999999999999999F, -1.42941214420489E-15F, 0.0999999999999992F, 0.1F, 0.0999999999999989F, 0.1F, -0.100000000000001F, 0.1F, 0.0999999999999995F, 0F, 0.1F, 0.100000000000001F, 0F, -9.29811783123569E-16F, 0.0999999999999996F, 0F, 0.1F); // Box 34
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -9F, -4F, 8, 1, 8, 0F,9.85322934354826E-16F, -0.899999999999998F, 3.60822483003176E-16F, -1.81799020282369E-15F, -1F, 1.02695629777827E-15F, -4.16333634234434E-17F, 0.0999999999999999F, -0.200000000000001F, -0.100000000000001F, 0.1F, -0.100000000000001F, 0.1F, 0.199999999999999F, 0.1F, 0.0999999999999995F, 0.3F, 0.1F, 0.100000000000001F, -0.0999999999999996F, -9.29811783123569E-16F, 0.0999999999999996F, -0.0999999999999996F, 0.1F); // Box 36
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -10F, -4F, 8, 1, 8, 0F,-0.0999999999999989F, -1.4F, -0.199999999999999F, -1.36002320516582E-15F, -1.5F, -0.299999999999999F, -0.200000000000001F, 0.0999999999999999F, -1.1F, -0.300000000000001F, 0.1F, -1F, -1.38777878078145E-16F, 0.899999999999998F, -3.60822483003176E-16F, -1.38777878078145E-16F, 0.999999999999999F, -8.32667268468867E-17F, 1.36002320516582E-15F, -0.0999999999999996F, -0.200000000000001F, -0.0999999999999997F, -0.0999999999999996F, -0.1F); // Box 37
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -11F, -4F, 8, 1, 8, 0F,-0.0999999999999987F, -2.1F, 0.700000000000001F, -0.2F, -2.1F, 0.600000000000001F, -0.300000000000001F, 0.0999999999999999F, -2.8F, -0.400000000000001F, 0.1F, -2.8F, -0.0999999999999999F, 1.4F, -0.2F, 3.60822483003176E-16F, 1.5F, -0.3F, -0.199999999999999F, -0.0999999999999994F, -1.1F, -0.3F, -0.0999999999999996F, -1F); // Box 38
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -12F, -4F, 8, 1, 8, 0F,1.36002320516582E-15F, -2.9F, 0.700000000000001F, -0.2F, -2.9F, 0.700000000000001F, -0.300000000000001F, 0.0999999999999999F, -3.1F, -0.400000000000001F, 0.1F, -3.1F, -0.0999999999999999F, 2.1F, 0.699999999999999F, -0.2F, 2.1F, 0.6F, -0.299999999999999F, -0.0999999999999994F, -2.8F, -0.400000000000001F, -0.0999999999999996F, -2.8F); // Box 42
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -8F, -6F, 8, 1, 1, 0F,-0.299999999999999F, -1.1F, -0.6F, -0.300000000000002F, -1.2F, -0.6F, 0.0999999999999996F, -0.9F, 0.099999999999999F, 0.0999999999999994F, -0.799999999999999F, 0.1F, -0.3F, 0.200000000000001F, -0.6F, -0.3F, 0.3F, -0.600000000000001F, 0.0999999999999996F, 0.1F, 0.1F, 0.1F, 8.32667268468867E-17F, 0.1F); // Box 183
		headModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
		bodyModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 4
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		bodyModel[3] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 15
		bodyModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 18
		bodyModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 19
		bodyModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 23
		bodyModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 28
		bodyModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 29
		bodyModel[9] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 29
		bodyModel[10] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 1
		bodyModel[12] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 2
		bodyModel[13] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 3
		bodyModel[14] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 4
		bodyModel[15] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 5
		bodyModel[16] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 7
		bodyModel[17] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 11
		bodyModel[18] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 13
		bodyModel[19] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 14
		bodyModel[20] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 15
		bodyModel[21] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 4
		bodyModel[23] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 5
		bodyModel[24] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 6
		bodyModel[25] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 7
		bodyModel[26] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 8
		bodyModel[27] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 9
		bodyModel[28] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 10
		bodyModel[29] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 11
		bodyModel[30] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 12
		bodyModel[31] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 15
		bodyModel[32] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 1
		bodyModel[33] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 2
		bodyModel[34] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 3
		bodyModel[35] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 10
		bodyModel[36] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 13
		bodyModel[37] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 14
		bodyModel[38] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 18
		bodyModel[39] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 19
		bodyModel[40] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 22
		bodyModel[41] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 24
		bodyModel[42] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 115
		bodyModel[43] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 116
		bodyModel[44] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 117
		bodyModel[45] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 118
		bodyModel[46] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 0
		bodyModel[47] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 1
		bodyModel[48] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 2
		bodyModel[49] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 3
		bodyModel[50] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 5
		bodyModel[51] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 6
		bodyModel[52] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 10
		bodyModel[53] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 11
		bodyModel[54] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 12
		bodyModel[55] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 13
		bodyModel[56] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 14
		bodyModel[57] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 15
		bodyModel[58] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 16
		bodyModel[59] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 17
		bodyModel[60] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 18
		bodyModel[61] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 19
		bodyModel[62] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 21
		bodyModel[63] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 23
		bodyModel[64] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 24
		bodyModel[65] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 25
		bodyModel[66] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 26
		bodyModel[67] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 26
		bodyModel[68] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 27
		bodyModel[69] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 28
		bodyModel[70] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 110
		bodyModel[71] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 111
		bodyModel[72] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 100
		bodyModel[73] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 101
		bodyModel[74] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 102
		bodyModel[75] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 103
		bodyModel[76] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 104
		bodyModel[77] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 105
		bodyModel[78] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 106
		bodyModel[79] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 107
		bodyModel[80] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 108
		bodyModel[81] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 109
		bodyModel[82] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 110
		bodyModel[83] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 123
		bodyModel[84] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 124
		bodyModel[85] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 125
		bodyModel[86] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 126
		bodyModel[87] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 127
		bodyModel[88] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 128
		bodyModel[89] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 129
		bodyModel[90] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 130
		bodyModel[91] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 131
		bodyModel[92] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 132
		bodyModel[93] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 133
		bodyModel[94] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 134
		bodyModel[95] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 135
		bodyModel[96] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 136
		bodyModel[97] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 137
		bodyModel[98] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 138
		bodyModel[99] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 139
		bodyModel[100] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 151
		bodyModel[101] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 152
		bodyModel[102] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 153
		bodyModel[103] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 154
		bodyModel[104] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 155
		bodyModel[105] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 156
		bodyModel[106] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 157
		bodyModel[107] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 158
		bodyModel[108] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 159
		bodyModel[109] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 160
		bodyModel[110] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 161
		bodyModel[111] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 162
		bodyModel[112] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 163
		bodyModel[113] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 164
		bodyModel[114] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 165
		bodyModel[115] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 166
		bodyModel[116] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 167
		bodyModel[117] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 168
		bodyModel[118] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 169
		bodyModel[119] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 170
		bodyModel[120] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 171
		bodyModel[121] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 173
		bodyModel[122] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 174
		bodyModel[123] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 175
		bodyModel[124] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 176
		bodyModel[125] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 177
		bodyModel[126] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 178
		bodyModel[127] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 179
		bodyModel[128] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 181
		bodyModel[129] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 182
		bodyModel[130] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 179

		bodyModel[0].addShapeBox(0F, 0F, -3F, 9, 12, 1, 0F,0F, -1.1F, -0.8F, -5F, 0.0999999999999999F, -0.8F, -5F, 0.0999999999999996F, 4.2F, 0F, 0.1F, 4.2F, 0F, 0F, -0.8F, -5F, 0F, -0.8F, -5F, 0F, 4.2F, 0F, 0F, 4.2F); // Box 3
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 0F, -3F, 4, 10, 5, 0F,-0.0000000000000011657341758564F, 0.0999999999999996F, -0.8F, 0F, -1.1F, -0.8F, 0F, 0.0999999999999996F, 0.200000000000001F, -9.85322934354826E-16F, 0.050000000000001F, 0.2F, -1.66533453693773E-16F, 2F, -0.8F, 0F, 2F, -0.8F, 0F, 2F, 0.2F, 5.55111512312578E-17F, 2F, 0.200000000000001F); // Box 4
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-1F, 8F, -2.6F, 1, 1, 1, 0F,3.1F, -0.2F, -0.300000000000001F, 4.1F, -0.2F, -0.300000000000002F, 4.1F, -0.2F, 3.9F, 3.1F, -0.2F, 3.9F, 3.1F, -0.0999999999999989F, -0.299999999999999F, 4.1F, -0.100000000000001F, -0.299999999999999F, 4.1F, -0.2F, 3.9F, 3.1F, -0.2F, 3.9F); // Box 14
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(3F, 0F, -2.6F, 1, 1, 1, 0F,7.1F, -10.7F, -0.300000000000002F, -0.099999999999997F, 1.72084568816899E-15F, -0.200000000000001F, 2.22044604925031E-16F, -0.2F, -0.200000000000001F, 7.2F, -10.7F, -0.400000000000001F, 7.2F, 10.7F, -0.300000000000001F, -0.1F, 0.100000000000001F, -0.199999999999999F, 0.199999999999999F, -1.66533453693773E-16F, -0.200000000000001F, 7.2F, 10.9F, -0.5F); // Box 15
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(3F, 0F, 2.4F, 1, 1, 1, 0F,7.2F, -10.7F, 0.299999999999996F, -5.4F, -7F, 0.300000000000002F, -5.4F, -7F, -1.1F, 7.2F, -10.7F, -1.1F, 7.2F, 10.8F, 0.299999999999999F, -5.1F, 6.5F, 0.300000000000003F, -5.1F, 6.5F, -1.1F, 7.2F, 10.8F, -1.1F); // Box 18
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(3F, 0F, -2.6F, 1, 1, 1, 0F,-1F, -10.7F, -0.200000000000001F, -8.1F, 0.100000000000001F, -0.200000000000002F, -8.1F, 0.100000000000001F, 3.9F, -1F, -10.7F, 4F, -1F, 10.6F, -0.20000000000001F, -8.1F, -0.1F, -0.299999999999999F, -8F, -0.3F, 3.9F, -1F, 10.6F, 4F); // Box 19
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0F, 0F, -3F, 1, 1, 1, 0F,0F, 0.1F, -0.9F, 3F, 0.1F, -0.9F, 2.9F, 0.1F, 3.9F, 0F, 0.1F, 3.9F, 0F, 0.1F, -0.9F, 2.9F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0.500000000000001F); // Box 23
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-1F, 2F, -2.6F, 1, 1, 1, 0F,-0.7F, -0.2F, -0.300000000000001F, 0.2F, -0.2F, -0.300000000000002F, 0.2F, -0.2F, -0.300000000000001F, -0.7F, -0.2F, -0.300000000000001F, -0.7F, -0.5F, -0.299999999999999F, 0.2F, -0.5F, -0.299999999999999F, 0.2F, -0.5F, -0.300000000000001F, -0.7F, -0.5F, -0.300000000000001F); // Box 28
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-1F, 0.2F, -2.6F, 1, 1, 1, 0F,-0.9F, -0.4F, -0.400000000000001F, 0.0999999999999999F, -0.4F, -0.400000000000002F, 0.0999999999999999F, -0.4F, -0.300000000000001F, -0.9F, -0.4F, -0.300000000000001F, -0.9F, -0.400000000000001F, -0.399999999999999F, 0.1F, -0.400000000000001F, -0.399999999999999F, 0.0999999999999999F, -0.4F, -0.300000000000001F, -0.9F, -0.4F, -0.300000000000001F); // Box 29
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-1F, 8F, -2.6F, 1, 1, 1, 0F,-0.5F, -0.3F, -0.200000000000001F, 0.9F, -0.3F, -0.200000000000002F, 0.9F, -0.3F, -0.700000000000001F, -0.5F, -0.3F, -0.700000000000001F, -0.5F, -0.2F, -0.199999999999998F, 0.9F, -0.199999999999999F, -0.199999999999999F, 0.9F, -0.200000000000001F, -0.700000000000001F, -0.499999999999998F, -0.199999999999999F, -0.700000000000001F); // Box 29
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-7F, 10F, 0F, 3, 5, 3, 0F,-2F, 0.3F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.2F, 0.699999999999999F, 0F, 0F, 0.699999999999998F, 0F, 0F, 0.6F, 0F, -2.4F, 0.5F, 0F); // Box 0
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-8F, 10F, 1F, 3, 5, 2, 0F,-2.4F, 0.2F, 1F, 0F, 0.3F, 1F, 0F, 0F, 0F, -2.5F, 0F, -0.4F, -2.5F, -0.0999999999999999F, 1F, 0.2F, 0.699999999999998F, 1F, 0.4F, 0.5F, 0F, -2.4F, -0.299999999999999F, -0.4F); // Box 1
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-5F, 10F, -3F, 3, 5, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0.4F, 0F, 0F, 0.3F, 0F, -0.2F, 0.500000000000001F, 0F, -2F, 0.599999999999998F, 0F, -2F, 0.699999999999999F, 0F, -0.2F, 0.699999999999999F, 0F); // Box 2
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-6F, 10F, -3F, 3, 5, 3, 0F,-0.3F, 0F, 0F, -2F, 0F, 0F, -2F, 0.3F, 0F, -0.299999999999999F, 0.2F, 0F, -0.5F, -0.300000000000004F, -0.1F, -1.8F, 0.500000000000001F, 0F, -1.8F, 0.700000000000001F, 0F, -0.499999999999999F, -0.099999999999999F, 0F); // Box 3
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-6F, 10F, -0.2F, 1, 2, 1, 0F,-0.3F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.6F, -0.3F, 0.199999999999999F, -0.6F, -0.3F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, -0.3F, 0F, -0.600000000000001F); // Box 4
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-6F, 12F, -0.2F, 1, 2, 1, 0F,-0.3F, 2.77555756156289E-16F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, -0.6F, -0.3F, -6.93889390390723E-16F, -0.6F, -0.3F, -0.699999999999999F, -0.0999999999999996F, -0.5F, -0.7F, -0.100000000000001F, -0.5F, -0.7F, -0.7F, -0.3F, -0.7F, -0.700000000000002F); // Box 5
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-6F, 12F, -1F, 1, 1, 1, 0F,-0.2F, -0.7F, -0.799999999999999F, -0.399999999999999F, -0.7F, -0.699999999999999F, -0.300000000000001F, -0.7F, 0.3F, -0.2F, -0.7F, 0.2F, -0.2F, -0.0999999999999996F, -0.8F, -0.2F, -0.0999999999999996F, -0.700000000000001F, -0.200000000000002F, -0.100000000000001F, 0.3F, -0.2F, -0.100000000000001F, 0.2F); // Box 7
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-6F, 11F, -0.75F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.899999999999999F, -0.7F, -0.4F, -0.9F, -0.7F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.2F, -0.9F, -0.7F, -0.2F, -0.9F, -0.7F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 11
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-6F, 11F, -0.75F, 1, 1, 1, 0F,-0.2F, -0.7F, -0.5F, -0.7F, -0.7F, -0.5F, -0.7F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.2F, -0.5F, -0.7F, -0.2F, -0.5F, -0.7F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 13
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-6F, 11F, -1.15F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.899999999999999F, -0.7F, -0.4F, -0.9F, -0.7F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.2F, -0.9F, -0.7F, -0.2F, -0.9F, -0.7F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 14
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-6F, 10.6F, -0.75F, 1, 1, 1, 0F,-0.2F, -0.7F, -0.5F, -0.7F, -0.7F, -0.5F, -0.7F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.2F, -0.5F, -0.7F, -0.2F, -0.5F, -0.7F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 15
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addBox(-4F, 0F, 2F, 8, 9, 3, 0F); // Box 0
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-3F, 0F, 5F, 1, 9, 1, 0F,-0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -0.4F, 0F, -0.9F); // Box 4
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(2F, 0F, 5F, 1, 9, 1, 0F,-0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -0.4F, 0F, -0.9F); // Box 5
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-3F, 9F, 5F, 1, 2, 1, 0F,-0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -1.5F, -0.4F, 0F, -1.5F); // Box 6
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(2F, 9F, 5F, 1, 2, 1, 0F,-0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, 0.6F, 0F, 0F, 0.600000000000001F, 0F, 0F, -1.5F, -0.4F, 0F, -1.5F); // Box 7
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-3F, 9F, 4F, 1, 2, 1, 0F,-0.4F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -1.5F, -0.4F, 0F, -1.5F, -0.4F, 0F, -0.3F, 0F, 0F, -0.300000000000001F, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F); // Box 8
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(2F, 9F, 4F, 1, 2, 1, 0F,-0.4F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -1.5F, -0.4F, 0F, -1.5F, -0.4F, 0F, -0.3F, 0F, 0F, -0.300000000000001F, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F); // Box 9
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-3F, -1F, 6F, 1, 1, 1, 0F,-0.4F, 0.2F, 0.600000000000001F, 0F, 0.2F, 0.599999999999999F, 0F, 0.2F, -1.5F, -0.4F, 0.2F, -1.5F, -0.4F, 0.1F, 0.9F, 0F, 0.1F, 0.9F, 0F, 0F, -1.8F, -0.4F, 0F, -1.8F); // Box 10
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(2F, -1F, 6F, 1, 1, 1, 0F,-0.4F, 0.2F, 0.700000000000001F, 0F, 0.2F, 0.7F, 0F, 0.2F, -1.5F, -0.4F, 0.2F, -1.5F, -0.4F, 0.1F, 0.9F, 0F, 0.1F, 0.9F, 0F, 0F, -1.8F, -0.4F, 0F, -1.8F); // Box 11
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(2F, -3F, 6F, 1, 2, 1, 0F,-0.4F, -0.8F, 0.6F, 0F, -0.800000000000001F, 0.6F, 0F, -0.800000000000001F, -1.5F, -0.4F, -0.800000000000001F, -1.5F, -0.4F, -0.199999999999999F, 0.600000000000001F, 0F, -0.2F, 0.6F, 0F, -0.2F, -1.5F, -0.4F, -0.2F, -1.5F); // Box 12
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(2F, -4F, 6F, 1, 2, 1, 0F,-0.4F, -0.8F, 1F, 0F, -0.800000000000001F, 0.999999999999999F, 0F, -0.800000000000001F, -1.9F, -0.4F, -0.800000000000001F, -1.9F, -0.4F, -0.199999999999999F, 0.600000000000001F, 0F, -0.2F, 0.6F, 0F, -0.2F, -1.5F, -0.4F, -0.2F, -1.5F); // Box 15
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-4F, -2F, 2F, 8, 2, 3, 0F,0.0999999999999999F, -0.8F, 0.3F, 0.1F, -0.799999999999999F, 0.3F, 0.0999999999999996F, -0.8F, 0.4F, 0.1F, -0.8F, 0.4F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.0999999999999999F, 0.0999999999999999F, 0F, 0.1F, 0.0999999999999999F, 0F, 0.100000000000001F); // Box 1
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-4F, -3F, 2F, 8, 2, 3, 0F,0.0999999999999999F, -0.8F, 0.3F, 0.1F, -0.799999999999999F, 0.3F, 0.0999999999999995F, -0.799999999999999F, 0.4F, 0.1F, -0.8F, 0.4F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.3F, 0.0999999999999999F, -0.2F, 0.4F, 0.0999999999999999F, -0.2F, 0.4F); // Box 2
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-4F, -3F, 2F, 8, 2, 3, 0F,0.1F, 0.0999999999999996F, 0F, 0.1F, 0.0999999999999996F, 0F, 0.0999999999999999F, 0.1F, 0F, 0.0999999999999999F, 0.1F, 0F, 0.0999999999999999F, -1.2F, 0.3F, 0.1F, -1.2F, 0.3F, 0.0999999999999996F, -1.2F, 0.4F, 0.1F, -1.2F, 0.4F); // Box 3
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(1F, -1F, 4F, 1, 1, 1, 0F,-0.4F, 0.2F, 0.700000000000001F, 0F, 0.2F, 0.7F, 0F, 0.2F, -1.5F, -0.4F, 0.2F, -1.5F, -0.4F, 0.1F, 0.9F, 0F, 0.1F, 0.9F, 0F, 0F, -1.8F, -0.4F, 0F, -1.8F); // Box 10
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-3F, -3F, 6F, 1, 2, 1, 0F,-0.4F, -0.8F, 0.6F, 0F, -0.800000000000001F, 0.6F, 0F, -0.800000000000001F, -1.5F, -0.4F, -0.800000000000001F, -1.5F, -0.4F, -0.199999999999999F, 0.600000000000001F, 0F, -0.2F, 0.6F, 0F, -0.2F, -1.5F, -0.4F, -0.2F, -1.5F); // Box 13
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-3F, -4F, 6F, 1, 2, 1, 0F,-0.4F, -0.8F, 1F, 0F, -0.800000000000001F, 1F, 0F, -0.800000000000001F, -1.9F, -0.4F, -0.800000000000001F, -1.9F, -0.4F, -0.199999999999999F, 0.600000000000001F, 0F, -0.2F, 0.6F, 0F, -0.2F, -1.5F, -0.4F, -0.2F, -1.5F); // Box 14
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(2F, -5F, 5F, 1, 2, 1, 0F,-0.4F, -1.9F, 3F, 0F, -1.9F, 3F, 0F, -1.8F, -4.1F, -0.4F, -1.8F, -4.1F, -0.4F, -0.199999999999999F, -0.0999999999999992F, 0F, -0.2F, -0.1F, 0F, -0.300000000000001F, -1F, -0.4F, -0.300000000000001F, -1F); // Box 18
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(2.4F, -4F, 0F, 1, 2, 1, 0F,0F, -0.800000000000001F, -1.9F, -0.4F, -0.800000000000001F, -1.9F, -0.4F, -0.8F, 1.1F, 0F, -0.800000000000001F, 1.1F, 0F, -0.2F, -1.5F, -0.4F, -0.2F, -1.5F, -0.4F, -0.199999999999999F, 0.700000000000001F, 0F, -0.2F, 0.7F); // Box 19
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(2F, -3F, 2F, 1, 2, 1, 0F,-0.4F, -0.799999999999999F, 0.5F, 0F, -0.800000000000001F, 0.5F, 0F, -0.800000000000001F, -1.2F, -0.4F, -0.800000000000001F, -1.2F, -0.4F, -0.199999999999999F, 0.600000000000001F, 0F, -0.2F, 0.6F, 0F, -0.2F, -1.2F, -0.4F, -0.2F, -1.2F); // Box 22
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(2.4F, -1F, 0F, 1, 1, 1, 0F,0F, 0.2F, -1.4F, -0.4F, 0.2F, -1.4F, -0.4F, 0.2F, 0.700000000000001F, 0F, 0.2F, 0.7F, 0F, 0.1F, -1.8F, -0.4F, 0.1F, -1.8F, -0.4F, 0.1F, 0.9F, 0F, 0.1F, 0.9F); // Box 24
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-3F, -5F, 5F, 1, 2, 1, 0F,-0.4F, -1.9F, 3F, 0F, -1.9F, 3F, 0F, -1.8F, -4.1F, -0.4F, -1.8F, -4.1F, -0.4F, -0.199999999999999F, -0.0999999999999992F, 0F, -0.2F, -0.1F, 0F, -0.300000000000001F, -1F, -0.4F, -0.300000000000001F, -1F); // Box 115
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-2.6F, -4F, 0F, 1, 2, 1, 0F,0F, -0.800000000000001F, -1.9F, -0.4F, -0.800000000000001F, -1.9F, -0.4F, -0.8F, 1F, 0F, -0.800000000000001F, 1.1F, 0F, -0.2F, -1.5F, -0.4F, -0.2F, -1.5F, -0.4F, -0.199999999999999F, 0.700000000000001F, 0F, -0.2F, 0.7F); // Box 116
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-3F, -3F, 2F, 1, 2, 1, 0F,-0.4F, -0.799999999999999F, 0.5F, 0F, -0.800000000000001F, 0.5F, 0F, -0.800000000000001F, -1.2F, -0.4F, -0.800000000000001F, -1.2F, -0.4F, -0.199999999999999F, 0.600000000000001F, 0F, -0.2F, 0.6F, 0F, -0.2F, -1.2F, -0.4F, -0.2F, -1.2F); // Box 117
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-2.6F, -1F, 0F, 1, 1, 1, 0F,0F, 0.2F, -1.4F, -0.4F, 0.2F, -1.4F, -0.4F, 0.2F, 0.700000000000001F, 0F, 0.2F, 0.7F, 0F, 0.1F, -1.8F, -0.4F, 0.1F, -1.8F, -0.4F, 0.1F, 0.9F, 0F, 0.1F, 0.9F); // Box 118
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(3.9F, 10F, -4F, 1, 4, 7, 0F,0F, 0F, -1.2F, 0F, 0F, -1.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(4F, 10F, -4F, 1, 1, 7, 0F,0.1F, 0.1F, -1.1F, 0F, 0.100000000000001F, -1F, -0.1F, 0.1F, 0.100000000000001F, 0.0999999999999989F, 0.100000000000001F, 0.0999999999999989F, 0.0999999999999996F, -1F, -1.1F, 0F, -1F, -1F, -0.1F, -1F, 0.0999999999999999F, 0.0999999999999999F, -1F, 0.0999999999999989F); // Box 1
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(4.1F, 10F, -4F, 1, 1, 7, 0F,-0.8F, 0.1F, -1F, -0.0999999999999996F, 0.1F, -1F, -0.2F, 0.1F, 0.0999999999999999F, -0.7F, 0.1F, 0.0999999999999999F, -0.9F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, -0.100000000000001F, 0F, -0.9F, 0F, 0F); // Box 2
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(4.1F, 10F, -4F, 1, 4, 7, 0F,-0.9F, -1F, -1.1F, 4.85722573273506E-16F, -1F, -1.1F, 1.66533453693773E-16F, -0.899999999999999F, -8.32667268468867E-17F, -0.9F, -0.900000000000002F, -1.94289029309402E-16F, -0.9F, -1.1F, -1.2F, 0F, -1.1F, -1.2F, 0F, -1.2F, 0F, -0.9F, -1.2F, 0F); // Box 3
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(4.1F, 13F, -4F, 1, 3, 4, 0F,-0.9F, 0.0999999999999998F, -1.2F, 4.85722573273506E-16F, 0.100000000000001F, -1.2F, 0.100000000000001F, 0.0999999999999994F, -8.32667268468867E-17F, -0.9F, 3.60822483003176E-16F, -1.94289029309402E-16F, -0.9F, -2.3F, -1.4F, 0F, -2.3F, -1.4F, 0F, -2.3F, 0F, -0.9F, -2.3F, 0F); // Box 5
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(5F, 14F, 0F, 1, 4, 4, 0F,1.66533453693773E-16F, 0.299999999999999F, -8.32667268468867E-17F, -0.9F, 0.300000000000001F, -1.94289029309402E-16F, -0.9F, 0.3F, -1F, 4.85722573273506E-16F, 0.300000000000001F, -1F, 0F, -3.3F, 0F, -0.9F, -3.3F, 0F, -0.9F, -3.5F, -1.6F, 0F, -3.5F, -1.6F); // Box 6
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(4.2F, 12.3F, -3F, 1, 4, 5, 0F,-0.8F, -1.4F, -2.3F, 4.85722573273506E-16F, -1.4F, -2.3F, 1.66533453693773E-16F, -1.4F, -1.2F, -0.8F, -1.4F, -1.2F, -0.8F, -2.4F, -2.3F, 0F, -2.4F, -2.3F, 0F, -2.4F, -1.2F, -0.799999999999999F, -2.4F, -1.2F); // Box 10
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-16F, 11.5F, -1F, 1, 1, 2, 0F,-20.05F, 0F, 0.2F, 20.2F, -0.2F, 0.2F, 20.2F, -0.2F, 0.3F, -20.05F, 0F, 0.3F, -20.05F, 0F, 0.2F, 20.2F, 0F, 0.2F, 20.2F, 0F, 0.3F, -20.05F, 0F, 0.3F); // Box 11
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(-16F, 12.5F, -1F, 1, 1, 2, 0F,-20.05F, 0F, 0.2F, 20.2F, 0F, 0.2F, 20.2F, 0F, 0.3F, -20.05F, 0F, 0.3F, -20.05F, -0.700000000000001F, -0.4F, 20.2F, -0.7F, -0.4F, 20.2F, -0.700000000000001F, -0.3F, -20.05F, -0.700000000000001F, -0.3F); // Box 12
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(-16F, 10.5F, -1F, 1, 1, 2, 0F,-20.05F, -0.7F, -0.4F, 20.3F, -0.9F, -0.4F, 20.3F, -0.9F, -0.4F, -20.05F, -0.7F, -0.4F, -20.05F, 0F, 0.2F, 20.2F, 0.2F, 0.2F, 20.2F, 0.2F, 0.3F, -20.05F, 0F, 0.3F); // Box 13
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(4.3F, 11.5F, -1.3F, 1, 1, 1, 0F,-0.8F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.3F, -0.8F, -0.1F, 0.3F, -0.8F, -0.8F, -1F, 0F, -0.8F, -1F, 0F, -0.8F, 0.3F, -0.8F, -0.8F, 0.3F); // Box 14
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(4.3F, 11.6F, -1.8F, 1, 2, 1, 0F,-0.8F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, 0.2F, -0.8F, -0.0999999999999999F, 0.2F, -0.8F, -1.4F, -1.1F, 0F, -1.4F, -1.1F, 0F, -1.4F, 0.2F, -0.8F, -1.4F, 0.2F); // Box 15
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(4.3F, 12.6F, -1.3F, 1, 1, 1, 0F,-0.8F, 0.2F, -1.1F, 0F, 0.2F, -1.1F, 0F, 0.3F, 0.2F, -0.8F, 0.3F, 0.2F, -0.8F, -1.4F, -1.1F, 0F, -1.4F, -1.1F, 0F, -1.4F, 0.2F, -0.8F, -1.4F, 0.2F); // Box 16
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(4.3F, 12.6F, -0.5F, 1, 1, 1, 0F,-0.8F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.2F, -1.1F, -0.8F, 0.2F, -1.1F, -0.8F, -1.4F, 0.2F, 0F, -1.4F, 0.2F, 0F, -1.4F, -1.1F, -0.8F, -1.4F, -1.1F); // Box 17
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(4.3F, 12.6F, -1.3F, 1, 1, 1, 0F,-0.8F, 0.2F, -0.7F, 0F, 0.2F, -0.7F, 0F, 0.2F, 0.1F, -0.8F, 0.2F, 0.1F, -0.8F, -1.3F, -0.7F, 0F, -1.3F, -0.7F, 0F, -1.3F, 0.0999999999999999F, -0.8F, -1.3F, 0.0999999999999999F); // Box 18
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(4.3F, 11.6F, -1.3F, 1, 2, 1, 0F,-0.8F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, 0.2F, -0.8F, -0.0999999999999999F, 0.2F, -0.8F, -1.4F, -1.1F, 0F, -1.4F, -1.1F, 0F, -1.4F, 0.2F, -0.8F, -1.4F, 0.2F); // Box 19
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(4.3F, 11.5F, 1F, 1, 1, 1, 0F,-0.8F, -0.0999999999999996F, 0.6F, 0F, -0.1F, 0.6F, 0F, -0.1F, -1.2F, -0.8F, -0.1F, -1.2F, -0.8F, -0.9F, 0.7F, 0F, -0.8F, 0.7F, 0F, -0.8F, -1.2F, -0.8F, -0.9F, -1.2F); // Box 21
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(4.3F, 11.6F, 0.5F, 1, 2, 1, 0F,-0.8F, 0F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1.1F, -0.8F, 0F, -1.1F, -0.8F, -1.7F, 0.2F, 0F, -1.7F, 0.2F, 0F, -1.7F, -1.1F, -0.8F, -1.7F, -1.1F); // Box 23
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(4.3F, 11F, 1F, 1, 1, 1, 0F,-0.8F, -0.9F, 0.7F, 0F, -0.9F, 0.7F, 0F, -0.9F, -1.2F, -0.8F, -0.9F, -1.3F, -0.8F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -1.3F, -0.8F, 0F, -1.3F); // Box 24
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(4.3F, 12F, 1F, 1, 2, 1, 0F,-0.8F, 3.60822483003176E-16F, 0.3F, 0F, 3.60822483003176E-16F, 0.3F, 0F, 0.1F, -1.2F, -0.8F, 0.0999999999999999F, -1.2F, -0.8F, -1.6F, 0.3F, 0F, -1.6F, 0.3F, 0F, -1.7F, -1.2F, -0.8F, -1.7F, -1.2F); // Box 25
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(4.3F, 12.6F, 0.4F, 1, 1, 1, 0F,-0.8F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, -0.7F, -0.8F, 0.2F, -0.7F, -0.8F, -1.3F, 0.0999999999999999F, 0F, -1.3F, 0.0999999999999999F, 0F, -1.3F, -0.7F, -0.8F, -1.3F, -0.7F); // Box 26
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(4.1F, 13F, 0F, 1, 3, 3, 0F,-0.9F, 1.38777878078145E-16F, -8.32667268468867E-17F, 0.0999999999999999F, 0.0999999999999997F, 1.38777878078145E-16F, 1.66533453693773E-16F, 0.200000000000001F, -8.32667268468867E-17F, -0.9F, 0.2F, -1.94289029309402E-16F, -0.9F, -2.3F, 0F, 0F, -2.3F, 0F, 0F, -2.3F, 0F, -0.9F, -2.3F, 0F); // Box 26
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(4.3F, 11.5F, -1.8F, 1, 1, 1, 0F,-0.8F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.3F, -0.8F, -0.1F, 0.3F, -0.8F, -0.8F, -1F, 0F, -0.8F, -1F, 0F, -0.8F, 0.3F, -0.8F, -0.8F, 0.3F); // Box 27
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(5F, 14F, -4F, 1, 4, 4, 0F,4.85722573273506E-16F, 0.300000000000001F, -1.4F, -0.9F, 0.3F, -1.4F, -0.9F, 0.300000000000001F, -1.94289029309402E-16F, 1.66533453693773E-16F, 0.299999999999999F, -8.32667268468867E-17F, 0F, -3.5F, -1.9F, -0.9F, -3.5F, -1.9F, -0.9F, -3.3F, 0F, 0F, -3.3F, 0F); // Box 28
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(-4F, -1.5F, -2.5F, 1, 1, 1, 0F,5.55111512312578E-17F, -1.4F, -0.2F, 3F, -2.6F, -0.1F, 3F, -2.6F, -0.7F, -0.0999999999999999F, -1.5F, -0.3F, -0.7F, 1.1F, -0.1F, 2.7F, 1.9F, -0.2F, 2.7F, 1.9F, -0.7F, -0.7F, 1.1F, -0.299999999999999F); // Box 110
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(-4F, -1F, -2.5F, 1, 1, 1, 0F,-0.7F, -1.6F, -0.1F, 2.7F, -2.4F, -0.2F, 2.7F, -2.4F, -0.7F, -0.7F, -1.6F, -0.6F, -1.1F, 1F, -0.2F, 1.3F, 1.5F, -0.2F, 1.3F, 1.5F, -0.7F, -1.1F, 1F, -0.599999999999999F); // Box 111
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(-1F, 1F, -2.6F, 1, 1, 1, 0F,-0.8F, -1.1F, -0.300000000000001F, 0.1F, -1.1F, -0.300000000000002F, 0.0999999999999999F, -1.1F, -0.300000000000001F, -0.8F, -1.1F, -0.300000000000001F, -0.7F, 0.2F, -0.299999999999999F, 0.2F, 0.2F, -0.299999999999999F, 0.2F, 0.2F, -0.300000000000001F, -0.7F, 0.2F, -0.300000000000001F); // Box 100
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(-1F, 2.7F, -2.6F, 1, 1, 1, 0F,-0.7F, 0.2F, -0.299999999999999F, 0.2F, 0.2F, -0.299999999999999F, 0.2F, 0.2F, -0.300000000000001F, -0.7F, 0.2F, -0.300000000000001F, -0.8F, -1.1F, -0.300000000000001F, 0.1F, -1.1F, -0.300000000000002F, 0.0999999999999999F, -1.1F, -0.300000000000001F, -0.8F, -1.1F, -0.300000000000001F); // Box 101
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(-1F, 4F, -2.6F, 1, 1, 1, 0F,-0.7F, -0.2F, -0.300000000000001F, 0.2F, -0.2F, -0.300000000000002F, 0.2F, -0.2F, -0.300000000000001F, -0.7F, -0.2F, -0.300000000000001F, -0.7F, -0.5F, -0.299999999999999F, 0.2F, -0.5F, -0.299999999999999F, 0.2F, -0.5F, -0.300000000000001F, -0.7F, -0.5F, -0.300000000000001F); // Box 102
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(-1F, 6F, -2.6F, 1, 1, 1, 0F,-0.7F, -0.2F, -0.300000000000001F, 0.2F, -0.2F, -0.300000000000002F, 0.2F, -0.2F, -0.300000000000001F, -0.7F, -0.2F, -0.300000000000001F, -0.7F, -0.5F, -0.299999999999999F, 0.2F, -0.5F, -0.299999999999999F, 0.2F, -0.5F, -0.300000000000001F, -0.7F, -0.5F, -0.300000000000001F); // Box 103
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(-1F, 9.5F, -2.6F, 1, 1, 1, 0F,-0.7F, -0.2F, -0.300000000000001F, 0.2F, -0.2F, -0.300000000000002F, 0.2F, -0.2F, -0.300000000000001F, -0.7F, -0.2F, -0.300000000000001F, -0.7F, -0.5F, -0.299999999999999F, 0.2F, -0.5F, -0.299999999999999F, 0.2F, -0.5F, -0.300000000000001F, -0.7F, -0.5F, -0.300000000000001F); // Box 104
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addShapeBox(-1F, 3F, -2.6F, 1, 1, 1, 0F,-0.8F, -1.1F, -0.300000000000001F, 0.1F, -1.1F, -0.300000000000002F, 0.0999999999999999F, -1.1F, -0.300000000000001F, -0.8F, -1.1F, -0.300000000000001F, -0.7F, 0.2F, -0.299999999999999F, 0.2F, 0.2F, -0.299999999999999F, 0.2F, 0.2F, -0.300000000000001F, -0.7F, 0.2F, -0.300000000000001F); // Box 105
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addShapeBox(-1F, 5F, -2.6F, 1, 1, 1, 0F,-0.8F, -1.1F, -0.300000000000001F, 0.1F, -1.1F, -0.300000000000002F, 0.0999999999999999F, -1.1F, -0.300000000000001F, -0.8F, -1.1F, -0.300000000000001F, -0.7F, 0.2F, -0.299999999999999F, 0.2F, 0.2F, -0.299999999999999F, 0.2F, 0.2F, -0.300000000000001F, -0.7F, 0.2F, -0.300000000000001F); // Box 106
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addShapeBox(-1F, 8.5F, -2.6F, 1, 1, 1, 0F,-0.8F, -1.1F, -0.300000000000001F, 0.1F, -1.1F, -0.300000000000002F, 0.0999999999999999F, -1.1F, -0.300000000000001F, -0.8F, -1.1F, -0.300000000000001F, -0.7F, 0.2F, -0.299999999999999F, 0.2F, 0.2F, -0.299999999999999F, 0.2F, 0.2F, -0.300000000000001F, -0.7F, 0.2F, -0.300000000000001F); // Box 107
		bodyModel[79].setRotationPoint(0F, 0F, 0F);

		bodyModel[80].addShapeBox(-1F, 4.7F, -2.6F, 1, 1, 1, 0F,-0.7F, 0.2F, -0.299999999999999F, 0.2F, 0.2F, -0.299999999999999F, 0.2F, 0.2F, -0.300000000000001F, -0.7F, 0.2F, -0.300000000000001F, -0.8F, -1.1F, -0.300000000000001F, 0.1F, -1.1F, -0.300000000000002F, 0.0999999999999999F, -1.1F, -0.300000000000001F, -0.8F, -1.1F, -0.300000000000001F); // Box 108
		bodyModel[80].setRotationPoint(0F, 0F, 0F);

		bodyModel[81].addShapeBox(-1F, 6.7F, -2.6F, 1, 1, 1, 0F,-0.7F, 0.2F, -0.299999999999999F, 0.2F, 0.2F, -0.299999999999999F, 0.2F, 0.2F, -0.300000000000001F, -0.7F, 0.2F, -0.300000000000001F, -0.8F, -1.1F, -0.300000000000001F, 0.1F, -1.1F, -0.300000000000002F, 0.0999999999999999F, -1.1F, -0.300000000000001F, -0.8F, -1.1F, -0.300000000000001F); // Box 109
		bodyModel[81].setRotationPoint(0F, 0F, 0F);

		bodyModel[82].addShapeBox(-1F, 10.2F, -2.6F, 1, 1, 1, 0F,-0.7F, 0.2F, -0.299999999999999F, 0.2F, 0.2F, -0.299999999999999F, 0.2F, 0.2F, -0.300000000000001F, -0.7F, 0.2F, -0.300000000000001F, -0.8F, -1.1F, -0.300000000000001F, 0.1F, -1.1F, -0.300000000000002F, 0.0999999999999999F, -1.1F, -0.300000000000001F, -0.8F, -1.1F, -0.300000000000001F); // Box 110
		bodyModel[82].setRotationPoint(0F, 0F, 0F);

		bodyModel[83].addShapeBox(-1F, -0.3F, -2.6F, 1, 1, 1, 0F,-0.9F, -0.4F, -0.400000000000001F, 0.0999999999999999F, -0.4F, -0.400000000000002F, 0.0999999999999999F, -0.4F, -0.300000000000001F, -0.9F, -0.4F, -0.300000000000001F, -0.9F, -0.400000000000001F, -0.399999999999999F, 0.1F, -0.400000000000001F, -0.399999999999999F, 0.0999999999999999F, -0.4F, -0.300000000000001F, -0.9F, -0.4F, -0.300000000000001F); // Box 123
		bodyModel[83].setRotationPoint(0F, 0F, 0F);

		bodyModel[84].addShapeBox(-1F, 7F, -2.6F, 1, 1, 1, 0F,-0.8F, -1.1F, -0.200000000000001F, 0.6F, -1.1F, -0.200000000000002F, 0.6F, -1.1F, -0.700000000000001F, -0.8F, -1.1F, -0.700000000000001F, -0.5F, 0.3F, -0.199999999999998F, 0.9F, 0.300000000000001F, -0.199999999999999F, 0.9F, 0.299999999999999F, -0.700000000000001F, -0.499999999999998F, 0.300000000000001F, -0.700000000000001F); // Box 124
		bodyModel[84].setRotationPoint(0F, 0F, 0F);

		bodyModel[85].addShapeBox(-1F, 9.1F, -2.6F, 1, 1, 1, 0F,-0.5F, 0.3F, -0.199999999999998F, 0.9F, 0.300000000000001F, -0.199999999999999F, 0.9F, 0.299999999999999F, -0.700000000000001F, -0.499999999999998F, 0.300000000000001F, -0.700000000000001F, -0.8F, -1.1F, -0.200000000000001F, 0.6F, -1.1F, -0.200000000000002F, 0.6F, -1.1F, -0.700000000000001F, -0.8F, -1.1F, -0.700000000000001F); // Box 125
		bodyModel[85].setRotationPoint(0F, 0F, 0F);

		bodyModel[86].addShapeBox(-1.5F, -1F, 4.96F, 1, 8, 1, 0F,-0.7F, -4.3F, 0F, 0F, -4.4F, 0F, 0F, -4.4F, -0.9F, -0.7F, -4.3F, -0.9F, -0.7F, -2.3F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, -0.9F, -0.7F, -2.3F, -0.9F); // Box 126
		bodyModel[86].setRotationPoint(0F, 0F, 0F);

		bodyModel[87].addShapeBox(-1.5F, -2.3F, 4.96F, 1, 9, 1, 0F,-5.55111512312578E-17F, -5.6F, 0F, -0.3F, -5.6F, 0F, -0.3F, -5.6F, -0.9F, 5.55111512312578E-17F, -5.6F, -0.9F, -5.55111512312578E-17F, -3.2F, 0F, -0.3F, -3.2F, 0F, -0.3F, -3.2F, -0.9F, 5.55111512312578E-17F, -3.2F, -0.9F); // Box 127
		bodyModel[87].setRotationPoint(0F, 0F, 0F);

		bodyModel[88].addShapeBox(-2.5F, -1F, 4.96F, 1, 9, 1, 0F,-1.2F, -5.5F, 0F, 0.7F, -5.5F, 0F, 0.7F, -5.5F, -0.9F, -1.2F, -5.5F, -0.9F, -1.2F, -3.3F, 0F, 0.7F, -3.3F, 0F, 0.7F, -3.3F, -0.9F, -1.2F, -3.3F, -0.9F); // Box 128
		bodyModel[88].setRotationPoint(0F, 0F, 0F);

		bodyModel[89].addShapeBox(1F, -2.35F, 4.96F, 1, 9, 1, 0F,-1.38777878078145E-16F, -5.6F, 0F, -0.3F, -5.6F, 0F, -0.2F, -5.6F, -0.9F, 8.32667268468867E-17F, -5.6F, -0.9F, 0.3F, -3.2F, 0F, 1.94289029309402E-16F, -3.2F, 0F, -2.77555756156289E-17F, -3.2F, -0.9F, 0.3F, -3.2F, -0.9F); // Box 129
		bodyModel[89].setRotationPoint(0F, 0F, 0F);

		bodyModel[90].addShapeBox(1F, -0.95F, 4.96F, 1, 7, 1, 0F,-0.7F, -4.4F, 0F, 0F, -4.4F, 0F, 0F, -4.4F, -0.9F, -0.7F, -4.4F, -0.9F, -0.7F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, -0.9F, -0.7F, -1.7F, -0.9F); // Box 130
		bodyModel[90].setRotationPoint(0F, 0F, 0F);

		bodyModel[91].addShapeBox(0F, -0.95F, 4.96F, 1, 7, 1, 0F,-0.7F, -4.4F, 0F, 0F, -4.4F, 0F, 0F, -4.4F, -0.9F, -0.7F, -4.4F, -0.9F, -0.7F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, -0.9F, -0.7F, -1.7F, -0.9F); // Box 131
		bodyModel[91].setRotationPoint(0F, 0F, 0F);

		bodyModel[92].addShapeBox(1F, 0.05F, 7.96F, 1, 7, 1, 0F,-0.7F, -4.3F, 0F, 0F, -4.3F, 0F, 0F, -4.3F, -0.9F, -0.7F, -4.3F, -0.9F, -0.7F, -2.4F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -0.9F, -0.7F, -2.4F, -0.9F); // Box 132
		bodyModel[92].setRotationPoint(0F, 0F, -3F);

		bodyModel[93].addShapeBox(0.7F, 0.05F, 4.96F, 1, 7, 1, 0F,0F, -4.3F, 0F, -0.7F, -4.3F, 0F, -0.7F, -4.3F, -0.9F, 0F, -4.3F, -0.9F, 0F, -2.5F, 0F, -0.7F, -2.4F, 0F, -0.7F, -2.4F, -0.9F, 0F, -2.5F, -0.9F); // Box 133
		bodyModel[93].setRotationPoint(0F, 0F, 0F);

		bodyModel[94].addShapeBox(1F, 0.05F, 7.96F, 1, 7, 1, 0F,2.22044604925031E-16F, -4.3F, 0F, -0.3F, -4.3F, -4.16333634234434E-17F, -0.3F, -4.3F, -0.9F, 0F, -4.3F, -0.9F, 2.22044604925031E-16F, -2.4F, 0F, -0.3F, -2.4F, -4.16333634234434E-17F, -0.3F, -2.4F, -0.9F, 2.22044604925031E-16F, -2.4F, -0.9F); // Box 134
		bodyModel[94].setRotationPoint(0F, 0F, -3F);

		bodyModel[95].addShapeBox(1F, -0.95F, 4.96F, 1, 9, 1, 0F,-1.38777878078145E-16F, -5.6F, 0F, -0.3F, -5.6F, 0F, -0.2F, -5.6F, -0.9F, 8.32667268468867E-17F, -5.6F, -0.9F, 0.3F, -3.2F, 0F, 1.94289029309402E-16F, -3.2F, 0F, -2.77555756156289E-17F, -3.2F, -0.9F, 0.3F, -3.2F, -0.9F); // Box 135
		bodyModel[95].setRotationPoint(0F, 0F, 0F);

		bodyModel[96].addShapeBox(1F, 0.45F, 4.96F, 1, 7, 1, 0F,-0.7F, -4.4F, 0F, 0F, -4.4F, 0F, 0F, -4.4F, -0.9F, -0.7F, -4.4F, -0.9F, -0.7F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, -0.9F, -0.7F, -1.7F, -0.9F); // Box 136
		bodyModel[96].setRotationPoint(0F, 0F, 0F);

		bodyModel[97].addShapeBox(0F, 0.45F, 4.96F, 1, 7, 1, 0F,-0.7F, -4.4F, 0F, 0F, -4.4F, 0F, 0F, -4.4F, -0.9F, -0.7F, -4.4F, -0.9F, -0.7F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, -0.9F, -0.7F, -1.7F, -0.9F); // Box 137
		bodyModel[97].setRotationPoint(0F, 0F, 0F);

		bodyModel[98].addShapeBox(1F, 2.55F, 4.96F, 1, 9, 1, 0F,0.3F, -3.2F, 0F, 1.94289029309402E-16F, -3.2F, 0F, -2.77555756156289E-17F, -3.2F, -0.9F, 0.3F, -3.2F, -0.9F, -1.38777878078145E-16F, -5.6F, 0F, -0.2F, -5.6F, 0F, -0.2F, -5.6F, -0.9F, 8.32667268468867E-17F, -5.6F, -0.9F); // Box 138
		bodyModel[98].setRotationPoint(0F, 0F, 0F);

		bodyModel[99].addShapeBox(-4F, 0F, -3F, 1, 1, 1, 0F,0F, 0.1F, -0.9F, 3F, 0.1F, -0.9F, 3F, 0.1F, 3.9F, 0F, 0.1F, 3.9F, 0F, 0.1F, -0.9F, 3F, 0.1F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0.500000000000001F); // Box 139
		bodyModel[99].setRotationPoint(0F, 0F, 0F);

		bodyModel[100].addShapeBox(-2.5F, 0F, 4.96F, 1, 8, 1, 0F,-1F, -4.6F, 0F, 0.2F, -4.5F, 0F, 0.2F, -4.5F, -0.9F, -1F, -4.6F, -0.9F, -1F, -2.3F, 0F, 0.2F, -2.2F, 0F, 0.2F, -2.2F, -0.9F, -1F, -2.3F, -0.9F); // Box 151
		bodyModel[100].setRotationPoint(0F, 0F, 0F);

		bodyModel[101].addShapeBox(-2.5F, 0F, 4.96F, 1, 9, 1, 0F,-1.2F, -5.6F, 0F, 1F, -5.6F, 0F, 1F, -5.6F, -0.9F, -1.2F, -5.6F, -0.9F, -1.2F, -3.2F, 0F, 0.9F, -3.2F, 0F, 0.9F, -3.2F, -0.9F, -1.2F, -3.2F, -0.9F); // Box 152
		bodyModel[101].setRotationPoint(0F, 0F, 0F);

		bodyModel[102].addShapeBox(-1.7F, -3.2F, 4.96F, 4, 9, 1, 0F,-5.55111512312578E-17F, -5.6F, 0F, -0.2F, -5.6F, 0F, -0.2F, -5.6F, -0.9F, 5.55111512312578E-17F, -5.6F, -0.9F, -5.55111512312578E-17F, -3.2F, 0F, -0.2F, -3.2F, 0F, -0.2F, -3.2F, -0.9F, 5.55111512312578E-17F, -3.2F, -0.9F); // Box 153
		bodyModel[102].setRotationPoint(0F, 0F, 0F);

		bodyModel[103].addShapeBox(-1.7F, 0.9F, 4.96F, 4, 9, 1, 0F,-5.55111512312578E-17F, -5.6F, 0F, -0.2F, -5.6F, 0F, -0.2F, -5.6F, -0.9F, 5.55111512312578E-17F, -5.6F, -0.9F, -5.55111512312578E-17F, -3.2F, 0F, -0.2F, -3.2F, 0F, -0.2F, -3.2F, -0.9F, 5.55111512312578E-17F, -3.2F, -0.9F); // Box 154
		bodyModel[103].setRotationPoint(0F, 0F, 0F);

		bodyModel[104].addShapeBox(-5F, 3F, -2.6F, 9, 1, 5, 0F,-0.9F, -0.2F, -0.300000000000001F, 0.1F, -0.2F, -0.300000000000002F, 0.1F, -0.2F, -0.100000000000001F, -0.9F, -0.2F, -0.100000000000001F, -0.9F, -0.5F, -0.299999999999999F, 0.1F, -0.5F, -0.299999999999999F, 0.1F, -0.5F, -0.100000000000001F, -0.9F, -0.5F, -0.100000000000001F); // Box 155
		bodyModel[104].setRotationPoint(0F, 0F, 0F);

		bodyModel[105].addShapeBox(-5F, 0F, -2.6F, 1, 10, 5, 0F,-0.9F, 0.2F, -0.300000000000001F, 0.2F, 0.2F, -0.300000000000002F, 0.2F, 0.2F, -0.100000000000001F, -0.9F, 0.2F, -0.100000000000001F, -0.9F, -0.5F, -0.299999999999999F, 0.2F, -0.5F, -0.299999999999999F, 0.2F, -0.5F, -0.100000000000001F, -0.9F, -0.5F, -0.100000000000001F); // Box 156
		bodyModel[105].setRotationPoint(0F, 0F, 0F);

		bodyModel[106].addShapeBox(2.9F, 0F, -2.6F, 1, 10, 5, 0F,-0.9F, 0.2F, -0.300000000000001F, 0.2F, 0.2F, -0.300000000000002F, 0.2F, 0.2F, -0.100000000000001F, -0.9F, 0.2F, -0.100000000000001F, -0.9F, -0.8F, -0.299999999999999F, 0.2F, -0.8F, -0.299999999999999F, 0.2F, -0.5F, -0.100000000000001F, -0.9F, -0.5F, -0.100000000000001F); // Box 157
		bodyModel[106].setRotationPoint(0F, 0F, 0F);

		bodyModel[107].addShapeBox(-5F, 9.6F, -2.6F, 1, 1, 1, 0F,-0.9F, 0.1F, -0.300000000000001F, 0.2F, 0.1F, -0.300000000000002F, 0.2F, 0.2F, -0.100000000000001F, -0.9F, 0.2F, -0.100000000000001F, -1F, -0.5F, -0.299999999999999F, 0.1F, -0.5F, -0.299999999999999F, 0.2F, -0.5F, -0.100000000000001F, -0.9F, -0.5F, -0.100000000000001F); // Box 158
		bodyModel[107].setRotationPoint(0F, 0F, 0F);

		bodyModel[108].addShapeBox(2.9F, 9.3F, -2.6F, 1, 1, 1, 0F,-0.9F, 0.1F, -0.300000000000001F, 0.2F, 0.1F, -0.300000000000002F, 0.2F, 0.2F, -0.100000000000001F, -0.9F, 0.2F, -0.100000000000001F, -1F, -0.5F, -0.299999999999999F, 0.1F, -0.5F, -0.299999999999999F, 0.1F, -0.5F, -0.100000000000001F, -1F, -0.5F, -0.100000000000001F); // Box 159
		bodyModel[108].setRotationPoint(0F, 0F, 0F);

		bodyModel[109].addShapeBox(-1F, 3F, -2.6F, 1, 1, 1, 0F,-0.7F, -0.2F, -0.200000000000001F, 0.1F, -0.2F, -0.200000000000002F, 0.1F, -0.2F, -0.300000000000001F, -0.7F, -0.2F, -0.300000000000001F, -0.7F, -0.7F, -0.199999999999999F, 0.1F, -0.7F, -0.199999999999999F, 0.1F, -0.7F, -0.300000000000001F, -0.7F, -0.7F, -0.300000000000001F); // Box 160
		bodyModel[109].setRotationPoint(0F, 0F, 0F);

		bodyModel[110].addShapeBox(-1F, 3.2F, -2.6F, 1, 1, 1, 0F,-0.7F, -0.2F, -0.200000000000001F, 0.1F, -0.2F, -0.200000000000002F, 0.1F, -0.2F, -0.450000000000001F, -0.7F, -0.2F, -0.450000000000001F, -0.7F, -0.7F, -0.199999999999999F, 0.1F, -0.7F, -0.199999999999999F, 0.1F, -0.7F, -0.450000000000001F, -0.7F, -0.7F, -0.450000000000001F); // Box 161
		bodyModel[110].setRotationPoint(0F, 0F, 0F);

		bodyModel[111].addShapeBox(-1F, 3.2F, -2.6F, 1, 1, 1, 0F,-0.7F, 5.55111512312578E-17F, -0.200000000000001F, -0.2F, 5.55111512312578E-17F, -0.200000000000002F, -0.2F, 0F, -0.300000000000001F, -0.7F, 5.55111512312578E-17F, -0.300000000000001F, -0.7F, -0.7F, -0.199999999999999F, -0.2F, -0.7F, -0.199999999999999F, -0.2F, -0.7F, -0.300000000000001F, -0.7F, -0.7F, -0.300000000000001F); // Box 162
		bodyModel[111].setRotationPoint(0F, 0F, 0F);

		bodyModel[112].addShapeBox(-0.6F, 3.2F, -2.6F, 1, 1, 1, 0F,-0.7F, 5.55111512312578E-17F, -0.200000000000001F, -0.2F, -0.0999999999999999F, -0.200000000000002F, -0.2F, -0.1F, -0.300000000000001F, -0.7F, 5.55111512312578E-17F, -0.300000000000001F, -0.7F, -0.7F, -0.199999999999999F, -0.2F, -0.8F, -0.199999999999999F, -0.2F, -0.8F, -0.300000000000001F, -0.7F, -0.7F, -0.300000000000001F); // Box 163
		bodyModel[112].setRotationPoint(0F, 0F, 0F);

		bodyModel[113].addShapeBox(1F, 8F, -2.6F, 1, 1, 2, 0F,-0.5F, -0.3F, 0.099999999999999F, 0.9F, -0.3F, 0.099999999999998F, 0.9F, -0.3F, -0.700000000000001F, -0.5F, -0.3F, -0.700000000000001F, -0.5F, -0.1F, 0.100000000000002F, 0.9F, -0.099999999999999F, 0.100000000000001F, 0.9F, -0.100000000000001F, -0.700000000000001F, -0.499999999999998F, -0.099999999999999F, -0.700000000000001F); // Box 164
		bodyModel[113].setRotationPoint(0F, 0F, 0F);

		bodyModel[114].addShapeBox(1F, 9F, -2.6F, 1, 1, 2, 0F,-0.5F, 0.1F, 0.099999999999999F, 0.9F, 0.1F, 0.099999999999998F, 0.9F, 0.0999999999999999F, -0.700000000000001F, -0.5F, 0.1F, -0.700000000000001F, -0.6F, -0.5F, 0.100000000000002F, 0.8F, -0.499999999999999F, 0.100000000000001F, 0.8F, -0.500000000000001F, -0.700000000000001F, -0.599999999999998F, -0.499999999999999F, -0.700000000000001F); // Box 165
		bodyModel[114].setRotationPoint(0F, 0F, 0F);

		bodyModel[115].addShapeBox(1F, 7F, -2.6F, 1, 1, 1, 0F,-0.5F, -1.2F, 0.099999999999999F, 0.9F, -1.2F, 0.099999999999998F, 0.9F, -1.1F, -0.400000000000001F, -0.5F, -1.1F, -0.400000000000001F, -0.5F, 0.3F, 0.100000000000002F, 0.9F, 0.300000000000001F, 0.100000000000001F, 0.9F, 0.199999999999999F, -0.400000000000001F, -0.499999999999998F, 0.200000000000001F, -0.400000000000001F); // Box 166
		bodyModel[115].setRotationPoint(0F, 0F, 0F);

		bodyModel[116].addShapeBox(1.05F, 9.5F, -2.95F, 1, 1, 1, 0F,-1.1F, 0.1F, -0.400000000000001F, 0.2F, 0.1F, -0.400000000000002F, 0.2F, 0.0999999999999999F, -0.500000000000001F, -1.1F, 0.0999999999999999F, -0.500000000000001F, -1.1F, -0.9F, -0.399999999999999F, 0.2F, -0.9F, -0.399999999999999F, 0.2F, -0.9F, -0.500000000000001F, -1.1F, -0.9F, -0.500000000000001F); // Box 167
		bodyModel[116].setRotationPoint(0F, 0F, 0F);

		bodyModel[117].addShapeBox(1F, 7F, -2.6F, 1, 1, 1, 0F,-0.5F, -1.2F, 0.199999999999999F, 0.9F, -1.2F, 0.199999999999998F, 0.9F, -1.2F, -1.1F, -0.5F, -1.2F, -1.1F, -0.6F, 1.2F, 0.200000000000002F, 0.8F, 1.2F, 0.200000000000001F, 0.8F, 1.3F, -1.1F, -0.599999999999998F, 1.3F, -1.1F); // Box 168
		bodyModel[117].setRotationPoint(0F, 0F, 0F);

		bodyModel[118].addShapeBox(3F, -1F, -2.5F, 1, 1, 1, 0F,2.7F, -2.4F, -0.2F, -0.7F, -1.6F, -0.1F, -0.7F, -1.6F, -0.6F, 2.7F, -2.4F, -0.7F, 1.3F, 1.5F, -0.2F, -1.1F, 1F, -0.2F, -1.1F, 1F, -0.599999999999999F, 1.3F, 1.5F, -0.7F); // Box 169
		bodyModel[118].setRotationPoint(0F, 0F, 0F);

		bodyModel[119].addShapeBox(3F, -1.5F, -2.5F, 1, 1, 1, 0F,3F, -2.6F, -0.1F, 5.55111512312578E-17F, -1.4F, -0.2F, -0.0999999999999999F, -1.5F, -0.3F, 3F, -2.6F, -0.7F, 2.7F, 1.9F, -0.2F, -0.7F, 1.1F, -0.1F, -0.7F, 1.1F, -0.299999999999999F, 2.7F, 1.9F, -0.7F); // Box 170
		bodyModel[119].setRotationPoint(0F, 0F, 0F);

		bodyModel[120].addShapeBox(-4F, 7.5F, -2.6F, 1, 7, 1, 0F,-0.8F, -0.7F, -0.100000000000001F, 0.1F, -0.7F, -0.100000000000002F, 0.2F, -0.7F, -0.300000000000001F, -0.7F, -0.7F, -0.300000000000001F, -0.8F, -0.5F, -0.099999999999999F, 0.1F, -0.5F, -0.099999999999999F, 0.2F, -0.5F, -0.300000000000001F, -0.7F, -0.5F, -0.300000000000001F); // Box 171
		bodyModel[120].setRotationPoint(0F, 0F, 0F);

		bodyModel[121].addShapeBox(-4F, 13.5F, -2.6F, 1, 2, 1, 0F,-0.8F, -0.5F, -0.100000000000001F, 0.1F, -0.5F, -0.100000000000002F, 0.2F, -0.5F, -0.300000000000001F, -0.7F, -0.5F, -0.300000000000001F, -0.9F, -0.5F, -0.299999999999999F, 0F, -0.5F, -0.299999999999999F, 0F, -0.5F, -0.600000000000001F, -0.9F, -0.5F, -0.600000000000001F); // Box 173
		bodyModel[121].setRotationPoint(0F, 0F, 0F);

		bodyModel[122].addShapeBox(-4F, 8F, -2.6F, 1, 1, 1, 0F,-0.5F, -0.3F, -0.200000000000001F, 0.4F, -0.3F, -0.200000000000002F, 0.4F, -0.2F, -0.700000000000001F, -0.5F, -0.2F, -0.700000000000001F, -0.5F, -0.1F, 2.05391259555654E-15F, 0.4F, -0.099999999999999F, 7.21644966006352E-16F, 0.4F, -0.100000000000001F, -0.700000000000001F, -0.499999999999998F, -0.099999999999999F, -0.700000000000001F); // Box 174
		bodyModel[122].setRotationPoint(0F, 0F, 0F);

		bodyModel[123].addShapeBox(-4.2F, 8.2F, -2.8F, 1, 1, 1, 0F,-1.1F, 0.1F, -0.400000000000001F, 0.2F, 0.2F, -0.400000000000002F, 0.2F, 0.2F, -0.500000000000001F, -1.1F, 0.0999999999999986F, -0.500000000000001F, -1.1F, -1F, -0.399999999999999F, 0.2F, -1F, -0.399999999999999F, 0.2F, -1F, -0.500000000000001F, -1.1F, -1F, -0.500000000000001F); // Box 175
		bodyModel[123].setRotationPoint(0F, 0F, 0F);

		bodyModel[124].addShapeBox(-4.2F, 8.2F, -2.8F, 1, 1, 1, 0F,-1.2F, 0.3F, -0.400000000000001F, 0.3F, 0.3F, -0.400000000000002F, 0.3F, 0.3F, -0.500000000000001F, -1.2F, 0.3F, -0.500000000000001F, -1.2F, -1.1F, -0.399999999999999F, 0.3F, -1.2F, -0.399999999999999F, 0.3F, -1.2F, -0.500000000000001F, -1.2F, -1.1F, -0.500000000000001F); // Box 176
		bodyModel[124].setRotationPoint(0F, 0F, 0F);

		bodyModel[125].addShapeBox(-4.2F, 8F, -2.8F, 1, 1, 1, 0F,-1F, 0.9F, -0.400000000000001F, 0.4F, 0.9F, -0.400000000000002F, 0.4F, 0.9F, -0.400000000000001F, -1F, 0.9F, -0.400000000000001F, -1F, -1.1F, -0.399999999999999F, 0.4F, -1.1F, -0.399999999999999F, 0.4F, -1.1F, -0.400000000000001F, -1F, -1.1F, -0.400000000000001F); // Box 177
		bodyModel[125].setRotationPoint(0F, 0F, 0F);

		bodyModel[126].addShapeBox(-4.2F, 8F, -2.8F, 1, 1, 1, 0F,-1.1F, 0.9F, -0.300000000000001F, 0.3F, 0.9F, -0.300000000000002F, 0.4F, 0.9F, -0.600000000000001F, -1F, 0.9F, -0.600000000000001F, -1.1F, -1.1F, -0.299999999999999F, 0.3F, -1.1F, -0.299999999999999F, 0.4F, -1.1F, -0.600000000000001F, -1F, -1.1F, -0.600000000000001F); // Box 178
		bodyModel[126].setRotationPoint(0F, 0F, 0F);

		bodyModel[127].addShapeBox(-4.2F, 8F, -2.8F, 1, 1, 1, 0F,-1F, 0.7F, -0.600000000000001F, 0.4F, 0.7F, -0.600000000000001F, 0.3F, 0.7F, -0.300000000000002F, -1.1F, 0.7F, -0.300000000000001F, -1F, -1.1F, -0.600000000000001F, 0.4F, -1.1F, -0.600000000000001F, 0.3F, -1.1F, -0.299999999999999F, -1.1F, -1.1F, -0.299999999999999F); // Box 179
		bodyModel[127].setRotationPoint(0F, 0F, 0F);

		bodyModel[128].addShapeBox(2.9F, 3.3F, -2.6F, 1, 1, 1, 0F,-0.9F, 3.4F, -0.200000000000001F, 0.2F, 3.4F, -0.200000000000002F, 0.2F, 3.5F, -0.700000000000001F, -0.9F, 3.5F, -0.700000000000001F, -1F, -0.5F, -0.199999999999999F, 0.1F, -0.5F, -0.199999999999999F, 0.1F, -0.5F, -0.100000000000001F, -1F, -0.5F, -0.100000000000001F); // Box 181
		bodyModel[128].setRotationPoint(0F, 0F, 0F);

		bodyModel[129].addShapeBox(-5F, 3.3F, -2.6F, 1, 1, 1, 0F,-0.9F, 3.4F, -0.200000000000001F, 0.2F, 3.4F, -0.200000000000002F, 0.2F, 3.5F, -0.700000000000001F, -0.9F, 3.5F, -0.700000000000001F, -1F, -0.5F, -0.199999999999999F, 0.1F, -0.5F, -0.199999999999999F, 0.1F, -0.5F, -0.100000000000001F, -1F, -0.5F, -0.100000000000001F); // Box 182
		bodyModel[129].setRotationPoint(0F, 0F, 0F);

		bodyModel[130].addShapeBox(-4F, 9F, -2.6F, 1, 1, 1, 0F,-0.5F, 0.1F, -9.71445146547012E-16F, 0.4F, 0.1F, -1.99840144432528E-15F, 0.4F, 0.1F, -0.700000000000001F, -0.5F, 0.1F, -0.700000000000001F, -0.5F, -0.7F, 2.05391259555654E-15F, 0.4F, -0.699999999999999F, 7.21644966006352E-16F, 0.4F, -0.500000000000001F, -0.700000000000001F, -0.499999999999998F, -0.499999999999999F, -0.700000000000001F); // Box 179
		bodyModel[130].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		leftArmModel[1] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 8
		leftArmModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 27
		leftArmModel[3] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 111
		leftArmModel[4] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 112
		leftArmModel[5] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 113
		leftArmModel[6] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 114
		leftArmModel[7] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 115

		leftArmModel[0].addShapeBox(-1F, -2F, -3F, 4, 8, 5, 0F,0.0999999999999996F, 0.0999999999999996F, -0.8F, 0.3F, 0.0999999999999995F, -0.8F, 0.3F, 0.100000000000001F, 0.199999999999999F, 0.0999999999999995F, 0.1F, 0.200000000000001F, 0.100000000000001F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, 0F, 0.2F, 0.100000000000001F, 0F, 0.2F); // Box 2
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 6F, -3F, 4, 8, 5, 0F,0.0999999999999996F, -4.85722573273506E-16F, -0.8F, 0.3F, -4.16333634234434E-17F, -0.8F, 0.3F, 4.71844785465692E-16F, 0.199999999999999F, 0.0999999999999995F, -9.29811783123569E-16F, 0.200000000000001F, 0.0999999999999998F, -6F, -0.8F, 0.2F, -6F, -0.8F, 0.2F, -6F, 0.2F, 0.0999999999999996F, -6F, 0.2F); // Box 8
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(3F, 4F, -1F, 1, 1, 1, 0F,0.0999999999999997F, -0.4F, -0.3F, -0.600000000000002F, -0.4F, -0.3F, -0.600000000000001F, -0.4F, -0.0999999999999996F, 0.100000000000003F, -0.4F, -0.1F, 0.100000000000002F, -0.2F, -0.3F, -0.599999999999999F, -0.20000000000001F, -0.3F, -0.600000000000001F, -0.2F, -0.0999999999999996F, 0.100000000000001F, -0.2F, -0.1F); // Box 27
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(3F, 3F, -1F, 1, 1, 1, 0F,0.0999999999999997F, -1.3F, -0.4F, -0.600000000000002F, -1.3F, -0.4F, -0.600000000000001F, -1.3F, -0.2F, 0.100000000000003F, -1.3F, -0.2F, 0.100000000000002F, 0.4F, -0.3F, -0.599999999999999F, 0.39999999999999F, -0.3F, -0.600000000000001F, 0.4F, -0.0999999999999996F, 0.100000000000001F, 0.4F, -0.1F); // Box 111
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(3F, 5.2F, -1F, 1, 1, 1, 0F,0.100000000000002F, 0.4F, -0.3F, -0.599999999999999F, 0.39999999999999F, -0.3F, -0.600000000000001F, 0.4F, -0.0999999999999996F, 0.100000000000001F, 0.4F, -0.1F, 0.0999999999999997F, -1.3F, -0.4F, -0.600000000000002F, -1.3F, -0.4F, -0.600000000000001F, -1.3F, -0.2F, 0.100000000000003F, -1.3F, -0.2F); // Box 112
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(3F, 6F, -1F, 1, 1, 1, 0F,0.0999999999999997F, -0.4F, -0.3F, -0.600000000000002F, -0.4F, -0.3F, -0.600000000000001F, -0.4F, -0.0999999999999996F, 0.100000000000003F, -0.4F, -0.1F, 0.100000000000002F, -0.2F, -0.3F, -0.599999999999999F, -0.20000000000001F, -0.3F, -0.600000000000001F, -0.2F, -0.0999999999999996F, 0.100000000000001F, -0.2F, -0.1F); // Box 113
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(3F, 7.2F, -1F, 1, 1, 1, 0F,0.100000000000002F, 0.4F, -0.3F, -0.599999999999999F, 0.39999999999999F, -0.3F, -0.600000000000001F, 0.4F, -0.0999999999999996F, 0.100000000000001F, 0.4F, -0.1F, 0.0999999999999997F, -1.3F, -0.4F, -0.600000000000002F, -1.3F, -0.4F, -0.600000000000001F, -1.3F, -0.2F, 0.100000000000003F, -1.3F, -0.2F); // Box 114
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(3F, 5F, -1F, 1, 1, 1, 0F,0.0999999999999997F, -1.3F, -0.4F, -0.600000000000002F, -1.3F, -0.4F, -0.600000000000001F, -1.3F, -0.2F, 0.100000000000003F, -1.3F, -0.2F, 0.100000000000002F, 0.4F, -0.3F, -0.599999999999999F, 0.39999999999999F, -0.3F, -0.600000000000001F, 0.4F, -0.0999999999999996F, 0.100000000000001F, 0.4F, -0.1F); // Box 115
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		rightArmModel[1] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 7
		rightArmModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 116
		rightArmModel[3] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 117
		rightArmModel[4] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 118
		rightArmModel[5] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 119
		rightArmModel[6] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 120
		rightArmModel[7] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 121

		rightArmModel[0].addShapeBox(-3F, -2F, -3F, 4, 8, 5, 0F,0.199999999999999F, 0.0999999999999996F, -0.8F, 0.0999999999999996F, 0.0999999999999996F, -0.8F, 0.0999999999999996F, 0.0999999999999996F, 0.200000000000001F, 0.199999999999999F, 0.100000000000001F, 0.2F, 0.2F, 0F, -0.8F, 0.0999999999999996F, 0F, -0.8F, 0.0999999999999996F, 0F, 0.2F, 0.2F, 0F, 0.200000000000001F); // Box 1
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 6F, -3F, 4, 2, 5, 0F,0.299999999999999F, -3.60822483003176E-16F, -0.8F, 0.100000000000001F, -4.16333634234434E-17F, -0.8F, 0.0999999999999996F, -4.16333634234434E-17F, 0.200000000000001F, 0.399999999999999F, 4.44089209850063E-16F, 0.2F, 0.2F, 0F, -0.8F, 0.100000000000001F, 0F, -0.8F, 0.0999999999999994F, 0F, 0.2F, 0.2F, 0F, 0.200000000000001F); // Box 7
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3.3F, 4.1F, -1F, 1, 1, 1, 0F,0.0999999999999997F, -0.4F, -0.3F, -0.600000000000002F, -0.4F, -0.3F, -0.600000000000001F, -0.4F, -0.0999999999999996F, 0.100000000000003F, -0.4F, -0.1F, 0.100000000000002F, -0.2F, -0.3F, -0.599999999999999F, -0.20000000000001F, -0.3F, -0.600000000000001F, -0.2F, -0.0999999999999996F, 0.100000000000001F, -0.2F, -0.1F); // Box 116
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3.3F, 3.1F, -1F, 1, 1, 1, 0F,0.0999999999999997F, -1.3F, -0.4F, -0.600000000000002F, -1.3F, -0.4F, -0.600000000000001F, -1.3F, -0.2F, 0.100000000000003F, -1.3F, -0.2F, 0.100000000000002F, 0.4F, -0.3F, -0.599999999999999F, 0.39999999999999F, -0.3F, -0.600000000000001F, 0.4F, -0.0999999999999996F, 0.100000000000001F, 0.4F, -0.1F); // Box 117
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3.3F, 5.3F, -1F, 1, 1, 1, 0F,0.100000000000002F, 0.4F, -0.3F, -0.599999999999999F, 0.39999999999999F, -0.3F, -0.600000000000001F, 0.4F, -0.0999999999999996F, 0.100000000000001F, 0.4F, -0.1F, 0.0999999999999997F, -1.3F, -0.4F, -0.600000000000002F, -1.3F, -0.4F, -0.600000000000001F, -1.3F, -0.2F, 0.100000000000003F, -1.3F, -0.2F); // Box 118
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3.3F, 6.1F, -1F, 1, 1, 1, 0F,0.0999999999999997F, -0.4F, -0.3F, -0.600000000000002F, -0.4F, -0.3F, -0.600000000000001F, -0.4F, -0.0999999999999996F, 0.100000000000003F, -0.4F, -0.1F, 0.100000000000002F, -0.2F, -0.3F, -0.599999999999999F, -0.20000000000001F, -0.3F, -0.600000000000001F, -0.2F, -0.0999999999999996F, 0.100000000000001F, -0.2F, -0.1F); // Box 119
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3.3F, 7.3F, -1F, 1, 1, 1, 0F,0.100000000000002F, 0.4F, -0.3F, -0.599999999999999F, 0.39999999999999F, -0.3F, -0.600000000000001F, 0.4F, -0.0999999999999996F, 0.100000000000001F, 0.4F, -0.1F, 0.0999999999999997F, -1.3F, -0.4F, -0.600000000000002F, -1.3F, -0.4F, -0.600000000000001F, -1.3F, -0.2F, 0.100000000000003F, -1.3F, -0.2F); // Box 120
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-3.3F, 5.1F, -1F, 1, 1, 1, 0F,0.0999999999999997F, -1.3F, -0.4F, -0.600000000000002F, -1.3F, -0.4F, -0.600000000000001F, -1.3F, -0.2F, 0.100000000000003F, -1.3F, -0.2F, 0.100000000000002F, 0.4F, -0.3F, -0.599999999999999F, 0.39999999999999F, -0.3F, -0.600000000000001F, 0.4F, -0.0999999999999996F, 0.100000000000001F, 0.4F, -0.1F); // Box 121
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 6
		leftLegModel[1] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 30
		leftLegModel[2] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 0
		leftLegModel[3] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 1
		leftLegModel[4] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 2
		leftLegModel[5] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 3
		leftLegModel[6] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 5
		leftLegModel[7] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 6
		leftLegModel[8] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 7
		leftLegModel[9] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 154
		leftLegModel[10] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 155
		leftLegModel[11] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 156
		leftLegModel[12] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 157
		leftLegModel[13] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 158

		leftLegModel[0].addShapeBox(-2F, 0F, -3F, 9, 12, 1, 0F,0F, -2.58126853225349E-15F, -0.8F, -4.9F, 4.16333634234434E-17F, -0.8F, -4.9F, 0F, 4.2F, 0F, 0F, 4.2F, -1.4F, -8.7F, -0.7F, -4.9F, -8.6F, -0.8F, -4.8F, -8.6F, 4.2F, 0F, -8.7F, 4.4F); // Box 6
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, -1F, -3F, 4, 10, 5, 0F,0.099999999999999F, -1.2F, -0.9F, -9.15933995315754E-16F, -1.2F, -0.9F, 0.0999999999999999F, -1.3F, 0.100000000000003F, 0.0999999999999991F, -1.3F, 0.100000000000002F, 0.0999999999999994F, -0.8F, -0.900000000000001F, 9.71445146547012E-16F, -0.8F, -0.9F, 2.77555756156289E-17F, -0.7F, 0.0999999999999991F, 0.0999999999999996F, -0.7F, 0.100000000000003F); // Box 30
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.0999999999999999F, 0F, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.0999999999999999F, 0.0999999999999999F, 0.0999999999999999F, 0.1F); // Box 0
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 10F, -6F, 4, 2, 4, 0F,-8.32667268468867E-17F, -1.6F, -2.1F, -2.77555756156289E-17F, -1.6F, -2.1F, 0.1F, -1.2F, 2.77555756156289E-17F, 0.1F, -1.2F, 2.77555756156289E-17F, -2.77555756156289E-17F, 0.1F, -2.1F, 2.77555756156289E-17F, 0.1F, -2.1F, 0.1F, 0.1F, -8.32667268468867E-17F, 0.0999999999999999F, 0.1F, 2.77555756156289E-17F); // Box 1
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 10F, -6F, 2, 2, 4, 0F,0.1F, 0F, -3.9F, 2.77555756156289E-17F, -1.94289029309402E-16F, -3.9F, 1.38777878078145E-16F, 0F, 2.77555756156289E-17F, 0.1F, -8.32667268468867E-17F, 2.77555756156289E-17F, 0.1F, -0.7F, -3.6F, -0.3F, -1.1F, -3.9F, -0.3F, -1.1F, -8.32667268468867E-17F, 0.0999999999999999F, -0.8F, 2.77555756156289E-17F); // Box 2
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(0F, 10F, -6F, 2, 2, 4, 0F,2.77555756156289E-17F, -1.94289029309402E-16F, -3.9F, 0.0999999999999999F, 0F, -3.9F, 0.1F, -8.32667268468867E-17F, 2.77555756156289E-17F, 1.38777878078145E-16F, 0F, 2.77555756156289E-17F, -0.3F, -1.1F, -3.9F, 0F, -0.7F, -3.6F, 0.0999999999999999F, -0.8F, 2.77555756156289E-17F, -0.3F, -1.1F, -8.32667268468867E-17F); // Box 3
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-0.5F, 10F, -3F, 1, 1, 1, 0F,0F, -0.9F, -0.8F, 0F, -0.9F, -0.8F, 0F, -0.9F, 1.11022302462516E-16F, 0F, -0.9F, 2.77555756156289E-17F, 0.3F, 0F, -0.8F, 0.3F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 5.55111512312578E-17F); // Box 5
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-0.5F, 9.7F, -3F, 1, 1, 1, 0F,0F, -0.9F, -0.8F, 0F, -0.9F, -0.8F, 0F, -0.9F, 1.11022302462516E-16F, 0F, -0.9F, 2.77555756156289E-17F, 0.3F, 0F, -0.8F, 0.3F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 5.55111512312578E-17F); // Box 6
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(-0.5F, 9.4F, -3F, 1, 1, 1, 0F,0F, -0.9F, -0.8F, 0F, -0.9F, -0.8F, 0F, -0.9F, 1.11022302462516E-16F, 0F, -0.9F, 2.77555756156289E-17F, 0.3F, 0F, -0.8F, 0.3F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 5.55111512312578E-17F); // Box 7
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);

		leftLegModel[9].addShapeBox(-2F, 7F, -3F, 4, 4, 5, 0F,0.099999999999999F, -1.2F, -0.9F, -9.15933995315754E-16F, -1.2F, -0.9F, -1.38777878078145E-16F, -1.3F, 0.100000000000003F, 0.0999999999999991F, -1.3F, 0.100000000000002F, 0.0999999999999994F, -1F, -0.900000000000001F, 0.200000000000001F, -0.9F, -0.7F, 0.2F, 0F, 0.199999999999999F, 0.0999999999999996F, -0.1F, 0.200000000000003F); // Box 154
		leftLegModel[9].setRotationPoint(0F, 0F, 0F);

		leftLegModel[10].addShapeBox(-6F, 7F, -3F, 4, 4, 5, 0F,-9.15933995315754E-16F, -1.3F, -0.9F, 0.099999999999999F, -1.2F, -0.9F, 0.0999999999999991F, -1.3F, 0.100000000000002F, -1.38777878078145E-16F, -1.3F, 0.100000000000003F, 0.200000000000001F, -0.9F, -0.7F, 0.0999999999999994F, -1F, -0.900000000000001F, 0.0999999999999996F, -0.0999999999999999F, 0.200000000000003F, 0.2F, 0F, 0.199999999999999F); // Box 155
		leftLegModel[10].setRotationPoint(0F, 0F, 0F);

		leftLegModel[11].addShapeBox(0.2F, 11.3F, -3F, 1, 4, 5, 0F,-1.6F, -0.8F, -2.3F, 0.900000000000001F, -0.8F, -2.3F, 0.9F, -0.8F, -0.2F, -1.6F, -0.8F, -8.32667268468867E-17F, -1.6F, -3.1F, -2.3F, 0.9F, -3.1F, -2.3F, 0.9F, -3.1F, -0.2F, -1.6F, -3.1F, -0.2F); // Box 156
		leftLegModel[11].setRotationPoint(0F, 0F, 0F);

		leftLegModel[12].addShapeBox(0.2F, 11.3F, -3F, 1, 4, 5, 0F,2.3F, -0.8F, -4.9F, 0.900000000000001F, -0.8F, -4.8F, 0.9F, -0.8F, 0.1F, 2.3F, -0.8F, 0.1F, 2.3F, -3.1F, -4.8F, 0.9F, -3.1F, -4.8F, 0.9F, -3.1F, 0.0999999999999999F, 2.3F, -3.1F, 0.1F); // Box 157
		leftLegModel[12].setRotationPoint(0F, 0F, 0F);

		leftLegModel[13].addShapeBox(-3.8F, 11.3F, -3F, 1, 4, 5, 0F,-1.6F, -0.8F, -2.3F, 0.900000000000001F, -0.8F, -2.3F, 0.9F, -0.8F, -0.2F, -1.6F, -0.8F, -0.2F, -1.6F, -3.1F, -2.3F, 0.9F, -3.1F, -2.3F, 0.9F, -3.1F, -0.2F, -1.6F, -3.1F, -0.2F); // Box 158
		leftLegModel[13].setRotationPoint(0.1F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 5
		rightLegModel[1] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 29
		rightLegModel[2] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 8
		rightLegModel[3] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 9
		rightLegModel[4] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 10
		rightLegModel[5] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 11
		rightLegModel[6] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 12
		rightLegModel[7] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 13
		rightLegModel[8] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 14
		rightLegModel[9] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 159
		rightLegModel[10] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 160
		rightLegModel[11] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 161

		rightLegModel[0].addShapeBox(-2F, 0F, -3F, 4, 10, 5, 0F,-1.11022302462516E-15F, -9.99200722162641E-16F, -0.8F, 0F, -2.35922392732846E-15F, -0.8F, 0F, -9.29811783123569E-16F, 0.200000000000001F, -9.15933995315754E-16F, 1.36002320516582E-15F, 0.2F, 0.399999999999999F, -6.6F, -0.8F, -1.6F, -6.6F, -0.7F, 0F, -6.7F, 0.4F, 0.299999999999999F, -6.7F, 0.200000000000001F); // Box 5
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, -1F, -3F, 4, 10, 5, 0F,0.199999999999999F, -1.2F, -0.9F, 0F, -1.2F, -0.9F, 0F, -1.3F, 0.100000000000003F, 0.0999999999999991F, -1.3F, 0.100000000000002F, -1.80411241501588E-16F, -0.7F, -0.900000000000001F, 0F, -0.8F, -0.9F, 0F, -0.7F, 0.0999999999999986F, -3.88578058618805E-16F, -0.7F, 0.100000000000003F); // Box 29
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.0999999999999999F, 0F, 0.1F, 0.1F, 0F, 0.0999999999999996F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.0999999999999999F, 0.0999999999999999F, 0.0999999999999999F, 0.1F); // Box 8
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 10F, -6F, 4, 2, 4, 0F,-8.32667268468867E-17F, -1.6F, -2.1F, -2.77555756156289E-17F, -1.6F, -2.1F, 0.1F, -1.2F, 2.77555756156289E-17F, 0.1F, -1.2F, 2.77555756156289E-17F, -2.77555756156289E-17F, 0.1F, -2.1F, 2.77555756156289E-17F, 0.1F, -2.1F, 0.1F, 0.1F, -8.32667268468867E-17F, 0.0999999999999999F, 0.1F, 2.77555756156289E-17F); // Box 9
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 10F, -6F, 2, 2, 4, 0F,0.0999999999999999F, 0F, -3.9F, 2.77555756156289E-17F, -1.94289029309402E-16F, -3.9F, 1.38777878078145E-16F, 0F, 2.77555756156289E-17F, 0.1F, -8.32667268468867E-17F, 2.77555756156289E-17F, 0.1F, -0.7F, -3.6F, -0.3F, -1.1F, -3.9F, -0.3F, -1.1F, -8.32667268468867E-17F, 0.0999999999999999F, -0.8F, 2.77555756156289E-17F); // Box 10
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(0F, 10F, -6F, 2, 2, 4, 0F,2.77555756156289E-17F, -1.94289029309402E-16F, -3.9F, 0.0999999999999999F, 0F, -3.9F, 0.1F, -8.32667268468867E-17F, 2.77555756156289E-17F, 1.38777878078145E-16F, 0F, 2.77555756156289E-17F, -0.3F, -1.1F, -3.9F, 0.1F, -0.7F, -3.6F, 0.0999999999999999F, -0.8F, 2.77555756156289E-17F, -0.3F, -1.1F, -8.32667268468867E-17F); // Box 11
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-0.5F, 10F, -3F, 1, 1, 1, 0F,0F, -0.9F, -0.8F, 0F, -0.9F, -0.8F, 0F, -0.9F, 1.11022302462516E-16F, 0F, -0.9F, 2.77555756156289E-17F, 0.3F, 0F, -0.8F, 0.3F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 5.55111512312578E-17F); // Box 12
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-0.5F, 9.7F, -3F, 1, 1, 1, 0F,0F, -0.9F, -0.8F, 0F, -0.9F, -0.8F, 0F, -0.9F, 1.11022302462516E-16F, 0F, -0.9F, 2.77555756156289E-17F, 0.3F, 0F, -0.8F, 0.3F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 5.55111512312578E-17F); // Box 13
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-0.5F, 9.4F, -3F, 1, 1, 1, 0F,0F, -0.9F, -0.8F, 0F, -0.9F, -0.8F, 0F, -0.9F, 1.11022302462516E-16F, 0F, -0.9F, 2.77555756156289E-17F, 0.3F, 0F, -0.8F, 0.3F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 5.55111512312578E-17F); // Box 14
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);

		rightLegModel[9].addShapeBox(0.1F, 11.3F, -3F, 1, 4, 5, 0F,-1.6F, -0.8F, -2.3F, 0.900000000000001F, -0.8F, -2.3F, 0.9F, -0.8F, -0.2F, -1.6F, -0.8F, -0.2F, -1.6F, -3.1F, -2.3F, 0.9F, -3.1F, -2.3F, 0.9F, -3.1F, -0.2F, -1.6F, -3.1F, -0.2F); // Box 159
		rightLegModel[9].setRotationPoint(0.1F, 0F, 0F);

		rightLegModel[10].addShapeBox(0.2F, 11.3F, -3F, 1, 4, 5, 0F,2.3F, -0.8F, -4.8F, 0.900000000000001F, -0.8F, -4.8F, 0.9F, -0.8F, 0.1F, 2.3F, -0.8F, 0.1F, 2.3F, -3.1F, -4.8F, 0.9F, -3.1F, -4.8F, 0.9F, -3.1F, 0.0999999999999999F, 2.3F, -3.1F, 0.1F); // Box 160
		rightLegModel[10].setRotationPoint(0F, 0F, 0F);

		rightLegModel[11].addShapeBox(-3.7F, 11.3F, -3F, 1, 4, 5, 0F,-1.6F, -0.8F, -2.3F, 0.900000000000001F, -0.8F, -2.3F, 0.9F, -0.8F, -0.2F, -1.6F, -0.8F, -0.2F, -1.6F, -3.1F, -2.3F, 0.9F, -3.1F, -2.3F, 0.9F, -3.1F, -0.2F, -1.6F, -3.1F, -0.2F); // Box 161
		rightLegModel[11].setRotationPoint(0F, 0F, 0F);
	}
}