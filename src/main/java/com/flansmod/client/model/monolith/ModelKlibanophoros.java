//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKlibanophoros extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelKlibanophoros() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[128];
		leftArmModel = new ModelRendererTurbo[5];
		rightArmModel = new ModelRendererTurbo[5];
		leftLegModel = new ModelRendererTurbo[3];
		rightLegModel = new ModelRendererTurbo[3];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 19
		bodyModel[1] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 39
		bodyModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 96
		bodyModel[4] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 151
		bodyModel[5] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 17
		bodyModel[6] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 35
		bodyModel[7] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 36
		bodyModel[8] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 37
		bodyModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 46
		bodyModel[10] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 47
		bodyModel[11] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 56
		bodyModel[12] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 57
		bodyModel[13] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 58
		bodyModel[14] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 59
		bodyModel[15] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 60
		bodyModel[16] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 61
		bodyModel[17] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 62
		bodyModel[18] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 63
		bodyModel[19] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 64
		bodyModel[20] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 65
		bodyModel[21] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 66
		bodyModel[22] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 67
		bodyModel[23] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 68
		bodyModel[24] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 69
		bodyModel[25] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 70
		bodyModel[26] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 71
		bodyModel[27] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 72
		bodyModel[28] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 73
		bodyModel[29] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 74
		bodyModel[30] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 75
		bodyModel[31] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 76
		bodyModel[32] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 77
		bodyModel[33] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 79
		bodyModel[34] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 80
		bodyModel[35] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 81
		bodyModel[36] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 82
		bodyModel[37] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 83
		bodyModel[38] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 84
		bodyModel[39] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 85
		bodyModel[40] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 86
		bodyModel[41] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 87
		bodyModel[42] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 88
		bodyModel[43] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 89
		bodyModel[44] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 90
		bodyModel[45] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 91
		bodyModel[46] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 92
		bodyModel[47] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 93
		bodyModel[48] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 94
		bodyModel[49] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 95
		bodyModel[50] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 96
		bodyModel[51] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 97
		bodyModel[52] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 98
		bodyModel[53] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 99
		bodyModel[54] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 100
		bodyModel[55] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 101
		bodyModel[56] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 102
		bodyModel[57] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 103
		bodyModel[58] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 104
		bodyModel[59] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 105
		bodyModel[60] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 106
		bodyModel[61] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 107
		bodyModel[62] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 108
		bodyModel[63] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 109
		bodyModel[64] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 110
		bodyModel[65] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 111
		bodyModel[66] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 112
		bodyModel[67] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 113
		bodyModel[68] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 114
		bodyModel[69] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 115
		bodyModel[70] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 116
		bodyModel[71] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 117
		bodyModel[72] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 118
		bodyModel[73] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 119
		bodyModel[74] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 120
		bodyModel[75] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 121
		bodyModel[76] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 122
		bodyModel[77] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 123
		bodyModel[78] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 124
		bodyModel[79] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 125
		bodyModel[80] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 126
		bodyModel[81] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 127
		bodyModel[82] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 128
		bodyModel[83] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 129
		bodyModel[84] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 130
		bodyModel[85] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 131
		bodyModel[86] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 132
		bodyModel[87] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 133
		bodyModel[88] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 134
		bodyModel[89] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 135
		bodyModel[90] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 136
		bodyModel[91] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 137
		bodyModel[92] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 138
		bodyModel[93] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 139
		bodyModel[94] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 140
		bodyModel[95] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 141
		bodyModel[96] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 142
		bodyModel[97] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 143
		bodyModel[98] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 144
		bodyModel[99] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 145
		bodyModel[100] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 146
		bodyModel[101] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 147
		bodyModel[102] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 148
		bodyModel[103] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 149
		bodyModel[104] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 150
		bodyModel[105] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 151
		bodyModel[106] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 152
		bodyModel[107] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 153
		bodyModel[108] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 154
		bodyModel[109] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 155
		bodyModel[110] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 156
		bodyModel[111] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 157
		bodyModel[112] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 158
		bodyModel[113] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 159
		bodyModel[114] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 160
		bodyModel[115] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 161
		bodyModel[116] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 162
		bodyModel[117] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 163
		bodyModel[118] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 164
		bodyModel[119] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 165
		bodyModel[120] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 166
		bodyModel[121] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 167
		bodyModel[122] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 170
		bodyModel[123] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 171
		bodyModel[124] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 172
		bodyModel[125] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 173
		bodyModel[126] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 174
		bodyModel[127] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 179

		bodyModel[0].addShapeBox(-4F, 10.8F, -2F, 8, 7, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.7F, 0.1F, 0.7F, 0.7F, 0.1F, 0.7F, 0.7F, 0.1F, 0.7F, 0.7F, 0.1F, 0.7F); // Box 19
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 0F, -2F, 8, 9, 4, 0F,1.3F, 0.45F, 0.7F, 1.3F, 0.45F, 0.7F, 1.3F, 0.45F, 0.7F, 1.3F, 0.45F, 0.7F, 0.3F, 1.1F, 0.7F, 0.3F, 1.1F, 0.7F, 0.3F, 1.1F, 0.7F, 0.3F, 1.1F, 0.7F); // Box 39
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 10F, -2F, 8, 1, 4, 0F,0.3F, -0.1F, 0.7F, 0.3F, -0.1F, 0.7F, 0.3F, -0.1F, 0.7F, 0.3F, -0.1F, 0.7F, 0.3F, -0.1F, 0.5F, 0.3F, -0.1F, 0.5F, 0.3F, -0.1F, 0.5F, 0.3F, -0.1F, 0.5F); // Box 0
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4.5F, 16F, -3F, 1, 2, 1, 0F,-0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 96
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4.5F, 15.7F, -2.4F, 9, 1, 2, 0F,0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.7F, 0.3F, 0.1F, 0.7F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F); // Box 151
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4.5F, 16F, -3F, 1, 2, 1, 0F,-0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 17
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(3.5F, 16F, 2F, 1, 2, 1, 0F,-0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 35
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(3.5F, 16F, 2F, 1, 2, 1, 0F,-0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 36
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4.5F, 15.7F, 0F, 9, 1, 2, 0F,0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.7F, 0.3F, 0.1F, 0.7F, -0.1F, 0.1F, 0.3F, -0.1F, 0.1F, 0.3F, -0.1F, 0.1F, 0.5F, -0.1F, 0.1F, 0.5F); // Box 37
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-5F, 16F, -2.5F, 1, 2, 1, 0F,-0.1F, 0.3F, -0.5F, -0.1F, 0.3F, -0.5F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 46
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-5F, 16F, -2.5F, 1, 2, 1, 0F,-0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0.3F, -0.5F, -0.1F, 0.3F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 47
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(4F, 16F, 1.5F, 1, 2, 1, 0F,-0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0.3F, -0.5F, -0.1F, 0.3F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 56
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(4F, 16F, 1.5F, 1, 2, 1, 0F,-0.1F, 0.3F, -0.5F, -0.1F, 0.3F, -0.5F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 57
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-4.5F, 15F, -2.5F, 1, 2, 1, 0F,-0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 58
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-4.5F, 15F, -2.5F, 1, 2, 1, 0F,-0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 59
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-3.5F, 15F, -2.5F, 1, 2, 1, 0F,-0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 60
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-3.5F, 15F, -2.5F, 1, 2, 1, 0F,-0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 61
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-2.5F, 15F, -2.5F, 1, 2, 1, 0F,-0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 62
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-2.5F, 15F, -2.5F, 1, 2, 1, 0F,-0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 63
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-1.5F, 15F, -2.5F, 1, 2, 1, 0F,-0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 64
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-1.5F, 15F, -2.5F, 1, 2, 1, 0F,-0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 65
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-0.5F, 15F, -2.5F, 1, 2, 1, 0F,-0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 66
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-0.5F, 15F, -2.5F, 1, 2, 1, 0F,-0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 67
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(0.5F, 15F, -2.5F, 1, 2, 1, 0F,-0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 68
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(0.5F, 15F, -2.5F, 1, 2, 1, 0F,-0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 69
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(1.5F, 15F, -2.5F, 1, 2, 1, 0F,-0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 70
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(1.5F, 15F, -2.5F, 1, 2, 1, 0F,-0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 71
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(2.5F, 15F, -2.5F, 1, 2, 1, 0F,-0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 72
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(2.5F, 15F, -2.5F, 1, 2, 1, 0F,-0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 73
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(3.5F, 15F, -2.5F, 1, 2, 1, 0F,-0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 74
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(3.5F, 15F, -2.5F, 1, 2, 1, 0F,-0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 75
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(3.5F, 15F, 1.5F, 1, 2, 1, 0F,-0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 76
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(3.5F, 15F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 77
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(2.5F, 15F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 79
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(1.5F, 15F, 1.5F, 1, 2, 1, 0F,-0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 80
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(1.5F, 15F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 81
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(0.5F, 15F, 1.5F, 1, 2, 1, 0F,-0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 82
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(0.5F, 15F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 83
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-0.5F, 15F, 1.5F, 1, 2, 1, 0F,-0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 84
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-0.5F, 15F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 85
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-1.5F, 15F, 1.5F, 1, 2, 1, 0F,-0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 86
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-1.5F, 15F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 87
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-2.5F, 15F, 1.5F, 1, 2, 1, 0F,-0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 88
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-2.5F, 15F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 89
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-3.5F, 15F, 1.5F, 1, 2, 1, 0F,-0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 90
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-3.5F, 15F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 91
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-4.5F, 15F, 1.5F, 1, 2, 1, 0F,-0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 92
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-4.5F, 15F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 93
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(3.7F, 15F, 1.5F, 1, 2, 1, 0F,0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F, 0F, -0.05F, 0.2F, 0F, -0.05F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 94
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(3.7F, 15F, 1.5F, 1, 2, 1, 0F,0.2F, 0F, -0.05F, 0.2F, 0F, -0.05F, 0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 95
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(3.7F, 15F, 0.5F, 1, 2, 1, 0F,0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F, 0F, -0.05F, 0.2F, 0F, -0.05F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 96
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(3.7F, 15F, 0.5F, 1, 2, 1, 0F,0.2F, 0F, -0.05F, 0.2F, 0F, -0.05F, 0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 97
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(3.7F, 15F, -0.5F, 1, 2, 1, 0F,0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F, 0F, -0.05F, 0.2F, 0F, -0.05F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 98
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(3.7F, 15F, -0.5F, 1, 2, 1, 0F,0.2F, 0F, -0.05F, 0.2F, 0F, -0.05F, 0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 99
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(3.7F, 15F, -1.5F, 1, 2, 1, 0F,0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F, 0F, -0.05F, 0.2F, 0F, -0.05F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 100
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(3.7F, 15F, -1.5F, 1, 2, 1, 0F,0.2F, 0F, -0.05F, 0.2F, 0F, -0.05F, 0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 101
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(3.7F, 15F, -2.5F, 1, 2, 1, 0F,0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F, 0F, -0.05F, 0.2F, 0F, -0.05F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 102
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(3.7F, 15F, -2.5F, 1, 2, 1, 0F,0.2F, 0F, -0.05F, 0.2F, 0F, -0.05F, 0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 103
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(-4.7F, 15F, -2.5F, 1, 2, 1, 0F,0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F, 0F, -0.05F, 0.2F, 0F, -0.05F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 104
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-4.7F, 15F, -2.5F, 1, 2, 1, 0F,0.2F, 0F, -0.05F, 0.2F, 0F, -0.05F, 0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 105
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(-4.7F, 15F, -1.5F, 1, 2, 1, 0F,0.2F, 0F, -0.05F, 0.2F, 0F, -0.05F, 0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 106
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-4.7F, 15F, -1.5F, 1, 2, 1, 0F,0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F, 0F, -0.05F, 0.2F, 0F, -0.05F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 107
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(-4.7F, 15F, -0.5F, 1, 2, 1, 0F,0.2F, 0F, -0.05F, 0.2F, 0F, -0.05F, 0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 108
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(-4.7F, 15F, -0.5F, 1, 2, 1, 0F,0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F, 0F, -0.05F, 0.2F, 0F, -0.05F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 109
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(-4.7F, 15F, 0.5F, 1, 2, 1, 0F,0.2F, 0F, -0.05F, 0.2F, 0F, -0.05F, 0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 110
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(-4.7F, 15F, 0.5F, 1, 2, 1, 0F,0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F, 0F, -0.05F, 0.2F, 0F, -0.05F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 111
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(-4.7F, 15F, 1.5F, 1, 2, 1, 0F,0.2F, 0F, -0.05F, 0.2F, 0F, -0.05F, 0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 112
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(-4.7F, 15F, 1.5F, 1, 2, 1, 0F,0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F, 0F, -0.05F, 0.2F, 0F, -0.05F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 113
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(-4F, 10.8F, -2F, 8, 4, 4, 0F,0.3F, -0.1F, 0.5F, 0.3F, -0.1F, 0.5F, 0.3F, -0.1F, 0.5F, 0.3F, -0.1F, 0.5F, 1F, 0.3F, 0.8F, 1F, 0.3F, 0.8F, 1F, 0.3F, 0.8F, 1F, 0.3F, 0.8F); // Box 114
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(3F, 15F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 115
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(-5F, 16F, -1.5F, 1, 2, 1, 0F,-0.1F, 0.3F, -0.5F, -0.1F, 0.3F, -0.5F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 116
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(-5F, 16F, -1.5F, 1, 2, 1, 0F,-0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0.3F, -0.5F, -0.1F, 0.3F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 117
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(-5F, 16F, -0.5F, 1, 2, 1, 0F,-0.1F, 0.3F, -0.5F, -0.1F, 0.3F, -0.5F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 118
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(-5F, 16F, -0.5F, 1, 2, 1, 0F,-0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0.3F, -0.5F, -0.1F, 0.3F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 119
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(-5F, 16F, 0.5F, 1, 2, 1, 0F,-0.1F, 0.3F, -0.5F, -0.1F, 0.3F, -0.5F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 120
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(-5F, 16F, 0.5F, 1, 2, 1, 0F,-0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0.3F, -0.5F, -0.1F, 0.3F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 121
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(-5F, 16F, 1.5F, 1, 2, 1, 0F,-0.1F, 0.3F, -0.5F, -0.1F, 0.3F, -0.5F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 122
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addShapeBox(-5F, 16F, 1.5F, 1, 2, 1, 0F,-0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0.3F, -0.5F, -0.1F, 0.3F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 123
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addShapeBox(4F, 16F, 0.5F, 1, 2, 1, 0F,-0.1F, 0.3F, -0.5F, -0.1F, 0.3F, -0.5F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 124
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addShapeBox(4F, 16F, 0.5F, 1, 2, 1, 0F,-0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0.3F, -0.5F, -0.1F, 0.3F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 125
		bodyModel[79].setRotationPoint(0F, 0F, 0F);

		bodyModel[80].addShapeBox(4F, 16F, -0.5F, 1, 2, 1, 0F,-0.1F, 0.3F, -0.5F, -0.1F, 0.3F, -0.5F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 126
		bodyModel[80].setRotationPoint(0F, 0F, 0F);

		bodyModel[81].addShapeBox(4F, 16F, -0.5F, 1, 2, 1, 0F,-0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0.3F, -0.5F, -0.1F, 0.3F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 127
		bodyModel[81].setRotationPoint(0F, 0F, 0F);

		bodyModel[82].addShapeBox(4F, 16F, -1.5F, 1, 2, 1, 0F,-0.1F, 0.3F, -0.5F, -0.1F, 0.3F, -0.5F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 128
		bodyModel[82].setRotationPoint(0F, 0F, 0F);

		bodyModel[83].addShapeBox(4F, 16F, -1.5F, 1, 2, 1, 0F,-0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0.3F, -0.5F, -0.1F, 0.3F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 129
		bodyModel[83].setRotationPoint(0F, 0F, 0F);

		bodyModel[84].addShapeBox(4F, 16F, -2.5F, 1, 2, 1, 0F,-0.1F, 0.3F, -0.5F, -0.1F, 0.3F, -0.5F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 130
		bodyModel[84].setRotationPoint(0F, 0F, 0F);

		bodyModel[85].addShapeBox(4F, 16F, -2.5F, 1, 2, 1, 0F,-0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0.3F, -0.5F, -0.1F, 0.3F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 131
		bodyModel[85].setRotationPoint(0F, 0F, 0F);

		bodyModel[86].addShapeBox(-3.5F, 16F, -3F, 1, 2, 1, 0F,-0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 132
		bodyModel[86].setRotationPoint(0F, 0F, 0F);

		bodyModel[87].addShapeBox(-3.5F, 16F, -3F, 1, 2, 1, 0F,-0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 133
		bodyModel[87].setRotationPoint(0F, 0F, 0F);

		bodyModel[88].addShapeBox(-2.5F, 16F, -3F, 1, 2, 1, 0F,-0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 134
		bodyModel[88].setRotationPoint(0F, 0F, 0F);

		bodyModel[89].addShapeBox(-2.5F, 16F, -3F, 1, 2, 1, 0F,-0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 135
		bodyModel[89].setRotationPoint(0F, 0F, 0F);

		bodyModel[90].addShapeBox(-1.5F, 16F, -3F, 1, 2, 1, 0F,-0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 136
		bodyModel[90].setRotationPoint(0F, 0F, 0F);

		bodyModel[91].addShapeBox(-1.5F, 16F, -3F, 1, 2, 1, 0F,-0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 137
		bodyModel[91].setRotationPoint(0F, 0F, 0F);

		bodyModel[92].addShapeBox(2.5F, 16F, -3F, 1, 2, 1, 0F,-0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 138
		bodyModel[92].setRotationPoint(0F, 0F, 0F);

		bodyModel[93].addShapeBox(2.5F, 16F, -3F, 1, 2, 1, 0F,-0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 139
		bodyModel[93].setRotationPoint(0F, 0F, 0F);

		bodyModel[94].addShapeBox(1.5F, 16F, -3F, 1, 2, 1, 0F,-0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 140
		bodyModel[94].setRotationPoint(0F, 0F, 0F);

		bodyModel[95].addShapeBox(1.5F, 16F, -3F, 1, 2, 1, 0F,-0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 141
		bodyModel[95].setRotationPoint(0F, 0F, 0F);

		bodyModel[96].addShapeBox(0.5F, 16F, -3F, 1, 2, 1, 0F,-0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 142
		bodyModel[96].setRotationPoint(0F, 0F, 0F);

		bodyModel[97].addShapeBox(0.5F, 16F, -3F, 1, 2, 1, 0F,-0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 143
		bodyModel[97].setRotationPoint(0F, 0F, 0F);

		bodyModel[98].addShapeBox(-0.5F, 16F, -3F, 1, 2, 1, 0F,-0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 144
		bodyModel[98].setRotationPoint(0F, 0F, 0F);

		bodyModel[99].addShapeBox(-0.5F, 16F, -3F, 1, 2, 1, 0F,-0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 145
		bodyModel[99].setRotationPoint(0F, 0F, 0F);

		bodyModel[100].addShapeBox(3.5F, 16F, -3F, 1, 2, 1, 0F,-0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 146
		bodyModel[100].setRotationPoint(0F, 0F, 0F);

		bodyModel[101].addShapeBox(3.5F, 16F, -3F, 1, 2, 1, 0F,-0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 147
		bodyModel[101].setRotationPoint(0F, 0F, 0F);

		bodyModel[102].addShapeBox(2.5F, 16F, 2F, 1, 2, 1, 0F,-0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 148
		bodyModel[102].setRotationPoint(0F, 0F, 0F);

		bodyModel[103].addShapeBox(2.5F, 16F, 2F, 1, 2, 1, 0F,-0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 149
		bodyModel[103].setRotationPoint(0F, 0F, 0F);

		bodyModel[104].addShapeBox(1.5F, 16F, 2F, 1, 2, 1, 0F,-0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 150
		bodyModel[104].setRotationPoint(0F, 0F, 0F);

		bodyModel[105].addShapeBox(1.5F, 16F, 2F, 1, 2, 1, 0F,-0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 151
		bodyModel[105].setRotationPoint(0F, 0F, 0F);

		bodyModel[106].addShapeBox(0.5F, 16F, 2F, 1, 2, 1, 0F,-0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 152
		bodyModel[106].setRotationPoint(0F, 0F, 0F);

		bodyModel[107].addShapeBox(0.5F, 16F, 2F, 1, 2, 1, 0F,-0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 153
		bodyModel[107].setRotationPoint(0F, 0F, 0F);

		bodyModel[108].addShapeBox(-0.5F, 16F, 2F, 1, 2, 1, 0F,-0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 154
		bodyModel[108].setRotationPoint(0F, 0F, 0F);

		bodyModel[109].addShapeBox(-0.5F, 16F, 2F, 1, 2, 1, 0F,-0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 155
		bodyModel[109].setRotationPoint(0F, 0F, 0F);

		bodyModel[110].addShapeBox(-1.5F, 16F, 2F, 1, 2, 1, 0F,-0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 156
		bodyModel[110].setRotationPoint(0F, 0F, 0F);

		bodyModel[111].addShapeBox(-1.5F, 16F, 2F, 1, 2, 1, 0F,-0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 157
		bodyModel[111].setRotationPoint(0F, 0F, 0F);

		bodyModel[112].addShapeBox(-2.5F, 16F, 2F, 1, 2, 1, 0F,-0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 158
		bodyModel[112].setRotationPoint(0F, 0F, 0F);

		bodyModel[113].addShapeBox(-2.5F, 16F, 2F, 1, 2, 1, 0F,-0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 159
		bodyModel[113].setRotationPoint(0F, 0F, 0F);

		bodyModel[114].addShapeBox(-3.5F, 16F, 2F, 1, 2, 1, 0F,-0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 160
		bodyModel[114].setRotationPoint(0F, 0F, 0F);

		bodyModel[115].addShapeBox(-3.5F, 16F, 2F, 1, 2, 1, 0F,-0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 161
		bodyModel[115].setRotationPoint(0F, 0F, 0F);

		bodyModel[116].addShapeBox(-4.5F, 16F, 2F, 1, 2, 1, 0F,-0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 162
		bodyModel[116].setRotationPoint(0F, 0F, 0F);

		bodyModel[117].addShapeBox(-4.5F, 16F, 2F, 1, 2, 1, 0F,-0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 163
		bodyModel[117].setRotationPoint(0F, 0F, 0F);

		bodyModel[118].addShapeBox(-5.5F, 16F, 2F, 1, 2, 1, 0F,-0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 164
		bodyModel[118].setRotationPoint(0F, 0F, 0F);

		bodyModel[119].addShapeBox(4.5F, 16F, 2F, 1, 2, 1, 0F,-0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 165
		bodyModel[119].setRotationPoint(0F, 0F, 0F);

		bodyModel[120].addShapeBox(4.5F, 16F, -3F, 1, 2, 1, 0F,-0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 166
		bodyModel[120].setRotationPoint(0F, 0F, 0F);

		bodyModel[121].addShapeBox(-5.5F, 16F, -3F, 1, 2, 1, 0F,-0.5F, 0.3F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.5F, 0.3F, -0.1F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 167
		bodyModel[121].setRotationPoint(0F, 0F, 0F);

		bodyModel[122].addShapeBox(-4F, 1.5F, -3F, 8, 2, 4, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 170
		bodyModel[122].setRotationPoint(0F, 0F, 0F);

		bodyModel[123].addShapeBox(-4F, -0.5F, -3F, 2, 4, 6, 0F,0.5F, 0.2F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 0.3F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, 0.3F, 0.2F); // Box 171
		bodyModel[123].setRotationPoint(0F, 0F, 0F);

		bodyModel[124].addShapeBox(2F, -0.5F, -3F, 2, 4, 6, 0F,0F, 0.3F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 0.3F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 172
		bodyModel[124].setRotationPoint(0F, 0F, 0F);

		bodyModel[125].addShapeBox(-3.5F, 2.2F, -3.3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[125].setRotationPoint(0F, 0F, 0F);

		bodyModel[126].addShapeBox(2.5F, 2.2F, -3.3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[126].setRotationPoint(0F, 0F, 0F);

		bodyModel[127].addShapeBox(-4F, 9.5F, -2F, 8, 2, 4, 0F,0.4F, -0.7F, 0.8F, 0.4F, -0.7F, 0.8F, 0.4F, -0.7F, 0.8F, 0.4F, -0.7F, 0.8F, 0.4F, -0.7F, 0.8F, 0.4F, -0.7F, 0.8F, 0.4F, -0.7F, 0.8F, 0.4F, -0.7F, 0.8F); // Box 179
		bodyModel[127].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 21
		leftArmModel[1] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 31
		leftArmModel[2] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 19
		leftArmModel[3] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 29
		leftArmModel[4] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 169

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 12, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 21
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(0F, -2F, -2F, 3, 5, 4, 0F,0.4F, 0.4F, 0.5F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.4F, 0.5F, -0.6F, -0.3F, 0.5F, 1F, 0.1F, 0.4F, 1F, 0.1F, 0.4F, -0.6F, -0.3F, 0.5F); // Box 31
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 0.5F, 1.5F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F); // Box 19
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, 0.5F, -2.5F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F); // Box 29
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-1F, 4F, -2F, 4, 5, 4, 0F,0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F); // Box 169
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 20
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 30
		rightArmModel[2] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 6
		rightArmModel[3] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 17
		rightArmModel[4] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 168

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 12, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 20
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -2F, -2F, 3, 5, 4, 0F,0.4F, 0.2F, 0.4F, 0.4F, 0.4F, 0.5F, 0.4F, 0.4F, 0.5F, 0.4F, 0.2F, 0.4F, 1F, 0.1F, 0.4F, -0.6F, -0.3F, 0.5F, -0.6F, -0.3F, 0.5F, 1F, 0.1F, 0.4F); // Box 30
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(0F, 0.5F, -2.5F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 6
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(0F, 0.5F, 1.5F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 17
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3F, 4F, -2F, 4, 5, 4, 0F,0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F); // Box 168
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24
		leftLegModel[1] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 176
		leftLegModel[2] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 177

		leftLegModel[0].addShapeBox(-2F, 10.1F, -3F, 4, 2, 5, 0F,0.15F, -0.3F, 0F, 0.15F, -0.3F, 0F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F); // Box 24
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 176
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 6.5F, -2F, 7, 4, 7, 0F,0.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.2F, 0F, 0.2F, -2.7F, 0F, 0.2F, -2.7F, 0F, -2.8F, 0.2F, 0F, -2.8F); // Box 177
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 175
		rightLegModel[2] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 178

		rightLegModel[0].addShapeBox(-2F, 10.1F, -3F, 4, 2, 5, 0F,0.15F, -0.3F, 0F, 0.15F, -0.3F, 0F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 175
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 6.5F, -2F, 7, 4, 7, 0F,0.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.2F, 0F, 0.2F, -2.7F, 0F, 0.2F, -2.7F, 0F, -2.8F, 0.2F, 0F, -2.8F); // Box 178
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);
	}
}