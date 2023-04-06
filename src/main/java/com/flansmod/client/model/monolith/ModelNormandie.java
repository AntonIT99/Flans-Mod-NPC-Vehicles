//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Normandie
// Model Creator: 
// Created on: 03.08.2020 - 16:38:59
// Last changed on: 03.08.2020 - 16:38:59

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNormandie extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelNormandie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[182];

		initbodyModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 35
		bodyModel[35] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 36
		bodyModel[36] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 37
		bodyModel[37] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 38
		bodyModel[38] = new ModelRendererTurbo(this, 409, 153, textureX, textureY); // Box 39
		bodyModel[39] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 40
		bodyModel[40] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 41
		bodyModel[41] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 42
		bodyModel[42] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 43
		bodyModel[43] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 44
		bodyModel[44] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 45
		bodyModel[45] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 46
		bodyModel[46] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 47
		bodyModel[47] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 48
		bodyModel[48] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 51
		bodyModel[49] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 52
		bodyModel[50] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 53
		bodyModel[51] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 54
		bodyModel[52] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 55
		bodyModel[53] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 56
		bodyModel[54] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 57
		bodyModel[55] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 58
		bodyModel[56] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 59
		bodyModel[57] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 60
		bodyModel[58] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 61
		bodyModel[59] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 62
		bodyModel[60] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 63
		bodyModel[61] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 64
		bodyModel[62] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 65
		bodyModel[63] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 66
		bodyModel[64] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 67
		bodyModel[65] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 68
		bodyModel[66] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 69
		bodyModel[67] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 70
		bodyModel[68] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 71
		bodyModel[69] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 72
		bodyModel[70] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 73
		bodyModel[71] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 74
		bodyModel[72] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 75
		bodyModel[73] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 76
		bodyModel[74] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 77
		bodyModel[75] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 78
		bodyModel[76] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 79
		bodyModel[77] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 80
		bodyModel[78] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 81
		bodyModel[79] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 82
		bodyModel[80] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 83
		bodyModel[81] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 84
		bodyModel[82] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 85
		bodyModel[83] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 86
		bodyModel[84] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 87
		bodyModel[85] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 88
		bodyModel[86] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Box 89
		bodyModel[87] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 90
		bodyModel[88] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 91
		bodyModel[89] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 92
		bodyModel[90] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 93
		bodyModel[91] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 94
		bodyModel[92] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 95
		bodyModel[93] = new ModelRendererTurbo(this, 377, 161, textureX, textureY); // Box 96
		bodyModel[94] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Box 97
		bodyModel[95] = new ModelRendererTurbo(this, 9, 169, textureX, textureY); // Box 98
		bodyModel[96] = new ModelRendererTurbo(this, 305, 177, textureX, textureY); // Box 99
		bodyModel[97] = new ModelRendererTurbo(this, 41, 177, textureX, textureY); // Box 100
		bodyModel[98] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 101
		bodyModel[99] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 102
		bodyModel[100] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 103
		bodyModel[101] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 104
		bodyModel[102] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 105
		bodyModel[103] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 106
		bodyModel[104] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 107
		bodyModel[105] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 108
		bodyModel[106] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 135
		bodyModel[107] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 136
		bodyModel[108] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 137
		bodyModel[109] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 138
		bodyModel[110] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 135
		bodyModel[111] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Box 136
		bodyModel[112] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 137
		bodyModel[113] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 138
		bodyModel[114] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Box 139
		bodyModel[115] = new ModelRendererTurbo(this, 289, 193, textureX, textureY); // Box 140
		bodyModel[116] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 141
		bodyModel[117] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 142
		bodyModel[118] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 143
		bodyModel[119] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 144
		bodyModel[120] = new ModelRendererTurbo(this, 25, 201, textureX, textureY); // Box 145
		bodyModel[121] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Box 146
		bodyModel[122] = new ModelRendererTurbo(this, 305, 201, textureX, textureY); // Box 147
		bodyModel[123] = new ModelRendererTurbo(this, 297, 201, textureX, textureY); // Box 148
		bodyModel[124] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 149
		bodyModel[125] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Box 150
		bodyModel[126] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 151
		bodyModel[127] = new ModelRendererTurbo(this, 161, 241, textureX, textureY); // Box 152
		bodyModel[128] = new ModelRendererTurbo(this, 369, 225, textureX, textureY); // Box 153
		bodyModel[129] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 154
		bodyModel[130] = new ModelRendererTurbo(this, 281, 273, textureX, textureY); // Box 155
		bodyModel[131] = new ModelRendererTurbo(this, 401, 201, textureX, textureY); // Box 156
		bodyModel[132] = new ModelRendererTurbo(this, 273, 217, textureX, textureY); // Box 157
		bodyModel[133] = new ModelRendererTurbo(this, 369, 289, textureX, textureY); // Box 158
		bodyModel[134] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 159
		bodyModel[135] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 160
		bodyModel[136] = new ModelRendererTurbo(this, 417, 289, textureX, textureY); // Box 161
		bodyModel[137] = new ModelRendererTurbo(this, 121, 281, textureX, textureY); // Box 162
		bodyModel[138] = new ModelRendererTurbo(this, 153, 305, textureX, textureY); // Box 163
		bodyModel[139] = new ModelRendererTurbo(this, 193, 305, textureX, textureY); // Box 164
		bodyModel[140] = new ModelRendererTurbo(this, 329, 313, textureX, textureY); // Box 165
		bodyModel[141] = new ModelRendererTurbo(this, 377, 321, textureX, textureY); // Box 166
		bodyModel[142] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 167
		bodyModel[143] = new ModelRendererTurbo(this, 57, 353, textureX, textureY); // Box 168
		bodyModel[144] = new ModelRendererTurbo(this, 161, 353, textureX, textureY); // Box 169
		bodyModel[145] = new ModelRendererTurbo(this, 273, 369, textureX, textureY); // Box 170
		bodyModel[146] = new ModelRendererTurbo(this, 433, 313, textureX, textureY); // Box 171
		bodyModel[147] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 172
		bodyModel[148] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 173
		bodyModel[149] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 174
		bodyModel[150] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 175
		bodyModel[151] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 176
		bodyModel[152] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 177
		bodyModel[153] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 178
		bodyModel[154] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 179
		bodyModel[155] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 180
		bodyModel[156] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 181
		bodyModel[157] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 182
		bodyModel[158] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 183
		bodyModel[159] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 184
		bodyModel[160] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Box 185
		bodyModel[161] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Box 186
		bodyModel[162] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 187
		bodyModel[163] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 188
		bodyModel[164] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 189
		bodyModel[165] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 190
		bodyModel[166] = new ModelRendererTurbo(this, 257, 145, textureX, textureY); // Box 191
		bodyModel[167] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 192
		bodyModel[168] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Box 193
		bodyModel[169] = new ModelRendererTurbo(this, 425, 153, textureX, textureY); // Box 194
		bodyModel[170] = new ModelRendererTurbo(this, 17, 161, textureX, textureY); // Box 195
		bodyModel[171] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Box 196
		bodyModel[172] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 197
		bodyModel[173] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 198
		bodyModel[174] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 199
		bodyModel[175] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 200
		bodyModel[176] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 201
		bodyModel[177] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 202
		bodyModel[178] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 203
		bodyModel[179] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 204
		bodyModel[180] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 205
		bodyModel[181] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 206

		bodyModel[0].addShapeBox(0F, 0F, 0F, 2, 14, 54, 0F,15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-2F, -3.5F, -27F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 14, 52, 0F,20F, 0F, 0F, 20F, 0F, 1F, 20F, 0F, 1F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 1F, 20F, 0F, 1F, 20F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-39F, -3.5F, -26F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 27, 10, 48, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(-86F, 0.5F, -24F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 19, 5, 44, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, 2F, 0F, 0.5F, 0F); // Box 4
		bodyModel[3].setRotationPoint(-105F, 5F, -22F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 44, 5, 28, 0F,0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 8F, 0F, 0.5F, 8F, 0F, 0.5F, 0F); // Box 5
		bodyModel[4].setRotationPoint(-149F, 5F, -14F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 11, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 5F, 0F, 0.5F, 5F, 0F, 0.5F, 0F); // Box 6
		bodyModel[5].setRotationPoint(-160F, 5F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 8, 5, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 8F, 0F, 0.5F, 8F, 0F, -0.5F, 0F); // Box 7
		bodyModel[6].setRotationPoint(-168F, 5F, -1F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 14, 52, 0F,14F, 0F, 1F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 1F, 14F, 0F, 1F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 1F); // Box 8
		bodyModel[7].setRotationPoint(29F, -3.5F, -26F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 23, 14, 46, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 9
		bodyModel[8].setRotationPoint(44F, -3.5F, -23F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 5, 14, 38, 0F,15F, 0F, 4F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 4F, 15F, 0F, 4F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 4F); // Box 10
		bodyModel[9].setRotationPoint(82F, -3.5F, -19F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 5, 14, 24, 0F,15F, 0F, 7F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 7F, 15F, 0F, 7F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 7F); // Box 11
		bodyModel[10].setRotationPoint(117F, -3.5F, -12F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 22, 14, 10, 0F,0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F); // Box 12
		bodyModel[11].setRotationPoint(137F, -3.5F, -5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 7, 14, 2, 0F,0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F); // Box 13
		bodyModel[12].setRotationPoint(159F, -3.5F, -1F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 9, 5, 40, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 14
		bodyModel[13].setRotationPoint(-95F, 0.5F, -20F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 10, 5, 38, 0F,0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 15
		bodyModel[14].setRotationPoint(-105F, 0.5F, -19F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 14, 5, 26, 0F,0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F); // Box 16
		bodyModel[15].setRotationPoint(-119F, 0.5F, -13F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 30, 5, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[16].setRotationPoint(-149F, 0.5F, -13F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 11, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 18
		bodyModel[17].setRotationPoint(-160F, 0.5F, -8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 7, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0.5F, 0F, 0F); // Box 19
		bodyModel[18].setRotationPoint(-167F, 0.5F, -1F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 22, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 0F); // Box 20
		bodyModel[19].setRotationPoint(-81F, -3.5F, -6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 15, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[20].setRotationPoint(-81F, -8.5F, -6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 6, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[21].setRotationPoint(-66F, -8.5F, -4F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[22].setRotationPoint(-66F, -8.5F, -6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[23].setRotationPoint(-66F, -8.5F, 4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 9, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 25
		bodyModel[24].setRotationPoint(-60F, -8.5F, -4F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 26
		bodyModel[25].setRotationPoint(-78F, -23.5F, -0.5F);

		bodyModel[26].addShapeBox(-3.5F, 0F, -10.5F, 7, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[26].setRotationPoint(-97.5F, -3F, 0F);

		bodyModel[27].addShapeBox(-10.5F, 0F, -10.5F, 7, 4, 21, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 28
		bodyModel[27].setRotationPoint(-97.5F, -3F, 0F);

		bodyModel[28].addShapeBox(3.5F, 0F, -10.5F, 7, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 29
		bodyModel[28].setRotationPoint(-97.5F, -3F, 0F);

		bodyModel[29].addShapeBox(3.5F, 0F, -10.5F, 7, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 30
		bodyModel[29].setRotationPoint(-15F, -7F, 0F);

		bodyModel[30].addShapeBox(-3.5F, 0F, -10.5F, 7, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[30].setRotationPoint(-15F, -7F, 0F);

		bodyModel[31].addShapeBox(-10.5F, 0F, -10.5F, 7, 4, 21, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 32
		bodyModel[31].setRotationPoint(-15F, -7F, 0F);

		bodyModel[32].addShapeBox(3.5F, 0F, -10.5F, 7, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 33
		bodyModel[32].setRotationPoint(90.5F, -9F, 0F);

		bodyModel[33].addShapeBox(-3.5F, 0F, -10.5F, 7, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[33].setRotationPoint(90.5F, -9F, 0F);

		bodyModel[34].addShapeBox(-10.5F, 0F, -10.5F, 7, 2, 21, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 35
		bodyModel[34].setRotationPoint(90.5F, -9F, 0F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 5, 33, 0F,0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F); // Box 36
		bodyModel[35].setRotationPoint(102F, -8F, -16.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 6, 5, 24, 0F,0F, 0F, 4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F); // Box 37
		bodyModel[36].setRotationPoint(108F, -8F, -12F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 6, 5, 13, 0F,0F, 0F, 5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.5F); // Box 38
		bodyModel[37].setRotationPoint(114F, -8F, -6.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 5, 38, 0F,14F, 0F, 1F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 1F, 14F, 0F, 1F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 1F); // Box 39
		bodyModel[38].setRotationPoint(87F, -8F, -19F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 5, 40, 0F,15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F); // Box 40
		bodyModel[39].setRotationPoint(55F, -8F, -20F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 22, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 1.5F, 0F, 0F, 4F, 0F, 0F, 4F, 4F, 0F, 1.5F); // Box 41
		bodyModel[40].setRotationPoint(17F, -8F, -6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 25, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 42
		bodyModel[41].setRotationPoint(8F, -28.5F, -4.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 25, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 43
		bodyModel[42].setRotationPoint(14F, -28.5F, -4.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 25, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[43].setRotationPoint(11F, -28.5F, -4.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[44].setRotationPoint(11F, -31.5F, -4.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 46
		bodyModel[45].setRotationPoint(8F, -31.5F, -4.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 47
		bodyModel[46].setRotationPoint(14F, -31.5F, -4.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[47].setRotationPoint(10F, -30.5F, -2.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 7, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[48].setRotationPoint(43F, -30.5F, -2.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[49].setRotationPoint(44F, -31.5F, -4.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 53
		bodyModel[50].setRotationPoint(41F, -31.5F, -4.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 54
		bodyModel[51].setRotationPoint(49F, -31.5F, -4.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 21, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 55
		bodyModel[52].setRotationPoint(49F, -28.5F, -4.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 21, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[53].setRotationPoint(44F, -28.5F, -4.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 21, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 57
		bodyModel[54].setRotationPoint(41F, -28.5F, -4.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 21, 1, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 58
		bodyModel[55].setRotationPoint(53.2F, -42.5F, -0.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[56].setRotationPoint(51.2F, -27.5F, -0.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[57].setRotationPoint(51.2F, -23.5F, -0.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.4F, -2.4F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2.4F, -2.4F); // Box 61
		bodyModel[58].setRotationPoint(17F, -6.5F, -13F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -1F); // Box 62
		bodyModel[59].setRotationPoint(22F, -6.5F, -13F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 9, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.3F, -1F); // Box 63
		bodyModel[60].setRotationPoint(30F, -6.5F, -13F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -1F); // Box 64
		bodyModel[61].setRotationPoint(22F, -11F, -8.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 9, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.3F, -1F); // Box 65
		bodyModel[62].setRotationPoint(30F, -11F, -8.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.4F, -2.4F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2.4F, -2.4F); // Box 66
		bodyModel[63].setRotationPoint(17F, -11F, -8.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -1F); // Box 67
		bodyModel[64].setRotationPoint(23.5F, -14.5F, -2.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 9, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.3F, -1F); // Box 68
		bodyModel[65].setRotationPoint(31.5F, -14.5F, -2.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.4F, -2.4F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2.4F, -2.4F); // Box 69
		bodyModel[66].setRotationPoint(18.5F, -14.5F, -2.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 17, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[67].setRotationPoint(22F, -12F, -3F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 7, 4, 5, 0F,-1.5F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, -0.5F, -0.5F, -2.5F, -1.5F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, -0.5F, -2.5F, -1.5F); // Box 71
		bodyModel[68].setRotationPoint(42F, -11.5F, -19F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 8, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.3F, -1F); // Box 72
		bodyModel[69].setRotationPoint(49F, -11.5F, -19F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F,0F, 0F, 0F, 0.5F, 1F, -2F, 0.5F, 1F, -2F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -2.4F, -2.4F, 0F, -2.4F, -2.4F, 0F, -0.5F, -1F); // Box 73
		bodyModel[70].setRotationPoint(57F, -11.5F, -19F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 8, 5, 3, 0F,0F, -0.5F, -0.5F, -2F, -0.7F, -1F, -2F, -0.7F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0.5F); // Box 74
		bodyModel[71].setRotationPoint(52F, -15.5F, -18F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 75
		bodyModel[72].setRotationPoint(48F, -16F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,-0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[73].setRotationPoint(48F, -26F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 77
		bodyModel[74].setRotationPoint(48F, -14F, -11F);

		bodyModel[75].addShapeBox(-28F, -1F, -0.5F, 29, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[75].setRotationPoint(48F, -17F, -10F);
		bodyModel[75].rotateAngleY = -0.20943951F;
		bodyModel[75].rotateAngleZ = -0.64577182F;

		bodyModel[76].addShapeBox(0F, -1F, -0.5F, 1, 9, 1, 0F,-0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F); // Box 79
		bodyModel[76].setRotationPoint(26.9F, -32.5F, -5.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,0F, 16F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 16F, 0F); // Box 80
		bodyModel[77].setRotationPoint(4.5F, -39.5F, -1F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[78].setRotationPoint(4F, -14F, -1.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[79].setRotationPoint(4.5F, -57.5F, -1F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 31, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[80].setRotationPoint(4.5F, -88.5F, -0.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 26, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 84
		bodyModel[81].setRotationPoint(4.9F, -106.5F, -0.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 85
		bodyModel[82].setRotationPoint(4.1F, -86.5F, -0.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 86
		bodyModel[83].setRotationPoint(4.1F, -82.5F, -0.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 87
		bodyModel[84].setRotationPoint(-171.5F, -19.5F, -0.5F);
		bodyModel[84].rotateAngleZ = 0.38397244F;

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 88
		bodyModel[85].setRotationPoint(-165.5F, -4.5F, -0.5F);

		bodyModel[86].addShapeBox(-20.5F, 0F, 0F, 21, 15, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 89
		bodyModel[86].setRotationPoint(-171.5F, -19.5F, -0.5F);
		bodyModel[86].rotateAngleZ = 0.38397244F;

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 90
		bodyModel[87].setRotationPoint(163.5F, -18.5F, -0.5F);

		bodyModel[88].addShapeBox(-11.5F, 0F, 0F, 12, 8, 1, 0F,-0.5F, -2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, -2F, -0.2F, 0F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 3F, -0.2F); // Box 91
		bodyModel[88].setRotationPoint(163.5F, -18F, -0.5F);
		bodyModel[88].rotateAngleX = 0.03490659F;
		bodyModel[88].rotateAngleY = -0.08726646F;
		bodyModel[88].rotateAngleZ = 0.01745329F;

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 92
		bodyModel[89].setRotationPoint(163.5F, -9F, -0.5F);
		bodyModel[89].rotateAngleZ = -0.45378561F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[90].setRotationPoint(164F, -4.5F, -1F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 94
		bodyModel[91].setRotationPoint(50.5F, -15F, -2.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[92].setRotationPoint(53.5F, -15F, -10F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 17, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[93].setRotationPoint(56F, -14.5F, -5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 1, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[94].setRotationPoint(63.5F, -14.5F, -12F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 24, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 98
		bodyModel[95].setRotationPoint(66.5F, -14.5F, -12F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 99
		bodyModel[96].setRotationPoint(69.5F, -14.5F, -9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 100
		bodyModel[97].setRotationPoint(72.5F, -14.5F, -7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[98].setRotationPoint(65.5F, -17.5F, -6F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 102
		bodyModel[99].setRotationPoint(65.5F, -17.5F, 2F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[100].setRotationPoint(65.5F, -17.5F, -2F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 15, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[101].setRotationPoint(55.5F, -18.5F, -2F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[102].setRotationPoint(55.5F, -22.5F, -1.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[103].setRotationPoint(59.5F, -20.5F, -1.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[104].setRotationPoint(67.25F, -21.5F, -0.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[105].setRotationPoint(67.25F, -22.5F, -4.5F);

		bodyModel[106].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,-0.1F, -0.35F, -0.35F, 182F, -0.35F, -0.35F, 182F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, 182F, -0.35F, -0.35F, 182F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F); // Box 135
		bodyModel[106].setRotationPoint(5.4F, -99F, -0.5F);
		bodyModel[106].rotateAngleZ = -0.51487213F;

		bodyModel[107].addShapeBox(-195.5F, -0.5F, 0F, 1, 1, 1, 0F,-0.1F, -0.35F, -0.35F, 195F, -0.35F, -0.35F, 195F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, 195F, -0.35F, -0.35F, 195F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F); // Box 136
		bodyModel[107].setRotationPoint(5.4F, -98F, -0.5F);
		bodyModel[107].rotateAngleZ = 0.53232542F;

		bodyModel[108].addShapeBox(-108.5F, -0.5F, 0F, 1, 1, 1, 0F,-0.1F, -0.35F, -0.35F, 108F, -0.35F, -0.35F, 108F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, 108F, -0.35F, -0.35F, 108F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F); // Box 137
		bodyModel[108].setRotationPoint(5.4F, -84F, -0.5F);
		bodyModel[108].rotateAngleZ = 0.68940505F;

		bodyModel[109].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,-0.1F, -0.35F, -0.35F, 64F, -0.35F, -0.35F, 64F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, 64F, -0.35F, -0.35F, 64F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F); // Box 138
		bodyModel[109].setRotationPoint(5.4F, -84F, -0.5F);
		bodyModel[109].rotateAngleZ = -0.72431164F;

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F,0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F); // Box 135
		bodyModel[110].setRotationPoint(61.2F, -44.5F, -1F);

		bodyModel[111].addShapeBox(-1F, 20F, -1F, 2, 25, 2, 0F,-0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F); // Box 136
		bodyModel[111].setRotationPoint(61.7F, -54.5F, 0F);
		bodyModel[111].rotateAngleX = -0.29670597F;
		bodyModel[111].rotateAngleZ = -0.2268928F;

		bodyModel[112].addShapeBox(-1F, 20F, -1F, 2, 25, 2, 0F,-0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F); // Box 137
		bodyModel[112].setRotationPoint(61.7F, -54.5F, 0F);
		bodyModel[112].rotateAngleX = 0.29670597F;
		bodyModel[112].rotateAngleZ = -0.2268928F;

		bodyModel[113].addShapeBox(0F, 0F, 0F, 4, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[113].setRotationPoint(59.5F, -59.5F, -6F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 4, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 139
		bodyModel[114].setRotationPoint(63.5F, -59.5F, -6F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F,0.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -4F); // Box 140
		bodyModel[115].setRotationPoint(58.5F, -59.5F, -6F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[116].setRotationPoint(60.5F, -62F, -2.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[117].setRotationPoint(61.5F, -63.5F, -1.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[118].setRotationPoint(61.5F, -64.5F, -1.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[119].setRotationPoint(62.5F, -65.5F, -0.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 9, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 145
		bodyModel[120].setRotationPoint(63.5F, -54.5F, -5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 8, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 3F, 0.5F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 3F, 0.5F, 0F, -11F); // Box 146
		bodyModel[121].setRotationPoint(53.5F, -54.5F, -13F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 8, 1, 12, 0F,0.5F, 0F, -11F, 0F, 0F, 3F, 0F, 0F, -10F, 0F, 0F, 0F, 0.5F, 0F, -11F, 0F, 0F, 3F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 147
		bodyModel[122].setRotationPoint(53.5F, -54.5F, 1F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 12, 54, 0F,15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, -3F, 15F, 0F, -3F, 15F, 0F, -3F, 15F, 0F, -3F); // Box 148
		bodyModel[123].setRotationPoint(-2F, 10.5F, -27F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 12, 52, 0F,14F, 0F, 1F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 1F, 14F, 0F, -2F, 14F, 0F, -3F, 14F, 0F, -3F, 14F, 0F, -2F); // Box 149
		bodyModel[124].setRotationPoint(29F, 10.5F, -26F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 23, 12, 46, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 150
		bodyModel[125].setRotationPoint(44F, 10.5F, -23F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 12, 52, 0F,20F, 0F, 0F, 20F, 0F, 1F, 20F, 0F, 1F, 20F, 0F, 0F, 20F, 0F, -3F, 20F, 0F, -2F, 20F, 0F, -2F, 20F, 0F, -3F); // Box 151
		bodyModel[126].setRotationPoint(-39F, 10.5F, -26F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 27, 12, 48, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -4F); // Box 152
		bodyModel[127].setRotationPoint(-86F, 10.5F, -24F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 19, 12, 44, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1.5F, -5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -1.5F, -5F); // Box 153
		bodyModel[128].setRotationPoint(-105F, 10.5F, -22F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 44, 12, 28, 0F,0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, -5F, -5.5F, -6F, 0F, -1.5F, 3F, 0F, -1.5F, 3F, -5F, -5.5F, -6F); // Box 154
		bodyModel[129].setRotationPoint(-149F, 10.5F, -14F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 5, 12, 38, 0F,15F, 0F, 4F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 4F, 15F, 0F, 1F, 15F, 0F, -3F, 15F, 0F, -3F, 15F, 0F, 1F); // Box 155
		bodyModel[130].setRotationPoint(82F, 10.5F, -19F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 22, 11, 10, 0F,0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 3F, 1F, -2F, -4F, 1F, -2F, -4F, 0F, 0F, 3F); // Box 156
		bodyModel[131].setRotationPoint(137F, 10.5F, -5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 5, 12, 24, 0F,15F, 0F, 7F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 7F, 15F, 0F, 4F, 15F, -1F, -4F, 15F, -1F, -4F, 15F, 0F, 4F); // Box 157
		bodyModel[132].setRotationPoint(117F, 10.5F, -12F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 11, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -1F, -7F, 5F, 1.5F, -1F, 5F, 1.5F, -1F, 0F, -1F, -7F); // Box 158
		bodyModel[133].setRotationPoint(-160F, 10.5F, -9F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 8, 5, 2, 0F,0F, 0.5F, 0F, 0F, -0.5F, 8F, 0F, -0.5F, 8F, 0F, 0.5F, 0F, -3F, -2.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, -3F, -2.5F, 0F); // Box 159
		bodyModel[134].setRotationPoint(-168F, 10F, -1F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 7, 9, 2, 0F,0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -1F, 0F, 0F); // Box 160
		bodyModel[135].setRotationPoint(159F, 10.5F, -1F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 22, 7, 10, 0F,0F, 0F, 3F, 1F, 2F, -4F, 1F, 2F, -4F, 0F, 0F, 3F, 0F, -1F, -1F, -8F, -4F, -4F, -8F, -4F, -4F, 0F, -1F, -1F); // Box 161
		bodyModel[136].setRotationPoint(137F, 21.5F, -5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 5, 5, 24, 0F,15F, 0F, 4F, 15F, 1F, -4F, 15F, 1F, -4F, 15F, 0F, 4F, 15F, 0F, -5F, 15F, 0F, -8F, 15F, 0F, -8F, 15F, 0F, -5F); // Box 162
		bodyModel[137].setRotationPoint(117F, 22.5F, -12F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 5, 5, 32, 0F,15F, 0F, 4F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 4F, 15F, 0F, -5F, 15F, 0F, -9F, 15F, 0F, -9F, 15F, 0F, -5F); // Box 163
		bodyModel[138].setRotationPoint(82F, 22.5F, -16F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 23, 5, 40, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -6F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -6F); // Box 164
		bodyModel[139].setRotationPoint(44F, 22.5F, -20F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 5, 46, 0F,14F, 0F, 1F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 1F, 14F, 0F, -8F, 14F, 0F, -9F, 14F, 0F, -9F, 14F, 0F, -8F); // Box 165
		bodyModel[140].setRotationPoint(29F, 22.5F, -23F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 5, 48, 0F,15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, -9F, 15F, 0F, -9F, 15F, 0F, -9F, 15F, 0F, -9F); // Box 166
		bodyModel[141].setRotationPoint(-2F, 22.5F, -24F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 5, 46, 0F,20F, 0F, 0F, 20F, 0F, 1F, 20F, 0F, 1F, 20F, 0F, 0F, 20F, 0F, -9F, 20F, 0F, -8F, 20F, 0F, -8F, 20F, 0F, -9F); // Box 167
		bodyModel[142].setRotationPoint(-39F, 22.5F, -23F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 27, 5, 42, 0F,0F, 0.5F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.5F, -1F, 0F, -0.5F, -10F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -0.5F, -10F); // Box 168
		bodyModel[143].setRotationPoint(-86F, 22.5F, -21F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 19, 5, 34, 0F,0F, 1.5F, 0F, 0F, 0.5F, 3F, 0F, 0.5F, 3F, 0F, 1.5F, 0F, 0F, -1.5F, -10F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, -1.5F, -10F); // Box 169
		bodyModel[144].setRotationPoint(-105F, 22.5F, -17F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 39, 12, 16, 0F,0F, 0F, 0F, 0F, -4F, 9F, 0F, -4F, 9F, 0F, 0F, 0F, 0F, -9.5F, -6F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -9.5F, -6F); // Box 170
		bodyModel[145].setRotationPoint(-144F, 17F, -8F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 16, 12, 16, 0F,0F, 2.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, -6F, -7F, -12F, -7F, 0F, -9.5F, -6F, 0F, -9.5F, -6F, -7F, -12F, -7F); // Box 171
		bodyModel[146].setRotationPoint(-160F, 17F, -8F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 12, 3, 0F,35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F); // Box 172
		bodyModel[147].setRotationPoint(-122F, 15F, -1.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F,-1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[148].setRotationPoint(-163F, 14F, -1F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -1F, 0F); // Box 174
		bodyModel[149].setRotationPoint(-163F, 19F, -1F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[150].setRotationPoint(107F, -6F, -16.5F);
		bodyModel[150].rotateAngleY = -0.12217305F;

		bodyModel[151].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[151].setRotationPoint(114F, -6F, -11.5F);
		bodyModel[151].rotateAngleY = -0.12217305F;

		bodyModel[152].addShapeBox(-8F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[152].setRotationPoint(-107F, 3F, -19.5F);
		bodyModel[152].rotateAngleY = 0.31415927F;

		bodyModel[153].addShapeBox(-8F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[153].setRotationPoint(-91F, 3F, -21.5F);
		bodyModel[153].rotateAngleY = 0.31415927F;

		bodyModel[154].addShapeBox(-8F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[154].setRotationPoint(-114F, 3F, -15.5F);
		bodyModel[154].rotateAngleY = 0.31415927F;

		bodyModel[155].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[155].setRotationPoint(62F, -2F, -23.5F);
		bodyModel[155].rotateAngleY = -0.55850536F;

		bodyModel[156].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[156].setRotationPoint(55F, -2F, -24.5F);
		bodyModel[156].rotateAngleY = -0.55850536F;

		bodyModel[157].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[157].setRotationPoint(46F, -2F, -25.5F);
		bodyModel[157].rotateAngleY = -0.55850536F;

		bodyModel[158].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[158].setRotationPoint(-2F, -2F, -26.5F);
		bodyModel[158].rotateAngleY = -0.75049158F;

		bodyModel[159].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[159].setRotationPoint(7F, -2F, -26.5F);
		bodyModel[159].rotateAngleY = -0.75049158F;

		bodyModel[160].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[160].setRotationPoint(14F, -2F, -26.5F);
		bodyModel[160].rotateAngleY = -0.75049158F;

		bodyModel[161].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[161].setRotationPoint(107F, -6F, 15.5F);
		bodyModel[161].rotateAngleY = 0.12217305F;

		bodyModel[162].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[162].setRotationPoint(114F, -6F, 10.5F);
		bodyModel[162].rotateAngleY = 0.12217305F;

		bodyModel[163].addShapeBox(-8F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[163].setRotationPoint(-107F, 3F, 18.5F);
		bodyModel[163].rotateAngleY = -0.55850536F;

		bodyModel[164].addShapeBox(-8F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[164].setRotationPoint(-91F, 3F, 20.5F);
		bodyModel[164].rotateAngleY = -0.55850536F;

		bodyModel[165].addShapeBox(-8F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[165].setRotationPoint(-114F, 3F, 14.5F);
		bodyModel[165].rotateAngleY = -0.55850536F;

		bodyModel[166].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[166].setRotationPoint(62F, -2F, 22.5F);
		bodyModel[166].rotateAngleY = 0.31415927F;

		bodyModel[167].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[167].setRotationPoint(55F, -2F, 23.5F);
		bodyModel[167].rotateAngleY = 0.31415927F;

		bodyModel[168].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[168].setRotationPoint(46F, -2F, 24.5F);
		bodyModel[168].rotateAngleY = 0.31415927F;

		bodyModel[169].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[169].setRotationPoint(-2F, -2F, 25.5F);
		bodyModel[169].rotateAngleY = 0.50614548F;

		bodyModel[170].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[170].setRotationPoint(7F, -2F, 25.5F);
		bodyModel[170].rotateAngleY = 0.50614548F;

		bodyModel[171].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[171].setRotationPoint(14F, -2F, 25.5F);
		bodyModel[171].rotateAngleY = 0.50614548F;

		bodyModel[172].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.4F, -2.4F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2.4F, -2.4F); // Box 197
		bodyModel[172].setRotationPoint(17F, -6.5F, 8F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -1F); // Box 198
		bodyModel[173].setRotationPoint(22F, -6.5F, 8F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 9, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.3F, -1F); // Box 199
		bodyModel[174].setRotationPoint(30F, -6.5F, 8F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -1F); // Box 200
		bodyModel[175].setRotationPoint(22F, -11F, 3.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 9, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.3F, -1F); // Box 201
		bodyModel[176].setRotationPoint(30F, -11F, 3.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.4F, -2.4F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2.4F, -2.4F); // Box 202
		bodyModel[177].setRotationPoint(17F, -11F, 3.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 7, 4, 5, 0F,-1.5F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, -0.5F, -0.5F, -2.5F, -1.5F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, -0.5F, -2.5F, -1.5F); // Box 203
		bodyModel[178].setRotationPoint(42F, -11.5F, 14F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 8, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.3F, -1F); // Box 204
		bodyModel[179].setRotationPoint(49F, -11.5F, 14F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F,0F, 0F, 0F, 0.5F, 1F, -2F, 0.5F, 1F, -2F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -2.4F, -2.4F, 0F, -2.4F, -2.4F, 0F, -0.5F, -1F); // Box 205
		bodyModel[180].setRotationPoint(57F, -11.5F, 14F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 8, 5, 3, 0F,0F, -0.5F, -0.5F, -2F, -0.7F, -1F, -2F, -0.7F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0.5F); // Box 206
		bodyModel[181].setRotationPoint(52F, -15.5F, 15F);
	}

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[13];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 109
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 110
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 81, 185, textureX, textureY); // Box 111
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 241, 185, textureX, textureY); // Box 113
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 113, 185, textureX, textureY); // Box 114
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 153, 185, textureX, textureY); // Box 115
		gun_2_Model[0][6] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 116
		gun_2_Model[0][7] = new ModelRendererTurbo(this, 353, 185, textureX, textureY); // Box 117
		gun_2_Model[0][8] = new ModelRendererTurbo(this, 57, 193, textureX, textureY); // Box 118
		gun_2_Model[0][9] = new ModelRendererTurbo(this, 377, 193, textureX, textureY); // Box 119
		gun_2_Model[0][10] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 120
		gun_2_Model[0][11] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 121
		gun_2_Model[0][12] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 122

		gun_2_Model[0][0].addShapeBox(-6.5F, -2.5F, -11.5F, 5, 5, 7, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109

		gun_2_Model[0][1].addShapeBox(-1.5F, -2.5F, -11.5F, 5, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110

		gun_2_Model[0][2].addShapeBox(-11F, -2.5F, -11.5F, 5, 5, 7, 0F,0F, 1F, -3F, -0.5F, 0.5F, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 111

		gun_2_Model[0][3].addShapeBox(-14F, -2.5F, -8.5F, 3, 5, 17, 0F,0F, 1F, -5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 113

		gun_2_Model[0][4].addShapeBox(-1.5F, -2.5F, 4.5F, 5, 5, 7, 0F,0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114

		gun_2_Model[0][5].addShapeBox(-11F, -2.5F, 4.5F, 5, 5, 7, 0F,0F, 1F, 0F, 0.5F, 1F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F); // Box 115

		gun_2_Model[0][6].addShapeBox(-6.5F, -2.5F, 4.5F, 5, 5, 7, 0F,-1F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116

		gun_2_Model[0][7].addShapeBox(-11F, -2.5F, -4.5F, 5, 5, 9, 0F,0F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 117

		gun_2_Model[0][8].addShapeBox(-5.5F, -2.5F, -4.5F, 4, 5, 9, 0F,0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118

		gun_2_Model[0][9].addShapeBox(-1.5F, -2.5F, -4.5F, 5, 5, 9, 0F,0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119

		gun_2_Model[0][10].addShapeBox(3.5F, -2.5F, -11.5F, 4, 5, 7, 0F,0F, 0F, -0.5F, -1.8F, -0.2F, -3F, -0.8F, 0F, 1F, 0F, 0.2F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 0.7F, 0F, 1F, 0F, 0F, 0F); // Box 120

		gun_2_Model[0][11].addShapeBox(3.5F, -2.5F, 4.5F, 4, 5, 7, 0F,0F, 0.2F, 0F, -0.8F, 0F, 1F, -1.8F, -0.2F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.7F, 0F, 1F, -1F, 0F, -3F, 0F, 0F, 0F); // Box 121

		gun_2_Model[0][12].addShapeBox(3.5F, -2.5F, -2.5F, 4, 5, 5, 0F,0F, 0.2F, 2F, -0.8F, 0F, 1F, -0.8F, 0F, 1F, 0F, 0.2F, 2F, 0F, 0F, 0F, 0.7F, 0F, 1F, 0.7F, 0F, 1F, 0F, 0F, 0F); // Box 122

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(90.5F, -11.5F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[12];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 123
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 124
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 125
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 126
		gun_2_Model[1][4] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 127
		gun_2_Model[1][5] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 128
		gun_2_Model[1][6] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 129
		gun_2_Model[1][7] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 130
		gun_2_Model[1][8] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 131
		gun_2_Model[1][9] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 132
		gun_2_Model[1][10] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 133
		gun_2_Model[1][11] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 134

		gun_2_Model[1][0].addShapeBox(0F, -1F, -3.2F, 10, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.3F); // Box 123

		gun_2_Model[1][1].addShapeBox(10F, -1F, -3.2F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 124

		gun_2_Model[1][2].addShapeBox(14.3F, -1F, -3.2F, 12, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F); // Box 125

		gun_2_Model[1][3].addShapeBox(14.3F, -1F, -6.4F, 12, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F); // Box 126

		gun_2_Model[1][4].addShapeBox(10F, -1F, -6.4F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 127

		gun_2_Model[1][5].addShapeBox(0F, -1F, -6.4F, 10, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.3F); // Box 128

		gun_2_Model[1][6].addShapeBox(14.3F, -1F, 1.2F, 12, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F); // Box 129

		gun_2_Model[1][7].addShapeBox(10F, -1F, 1.2F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 130

		gun_2_Model[1][8].addShapeBox(0F, -1F, 1.2F, 10, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.3F); // Box 131

		gun_2_Model[1][9].addShapeBox(0F, -1F, 4.4F, 10, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.3F); // Box 132

		gun_2_Model[1][10].addShapeBox(10F, -1F, 4.4F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 133

		gun_2_Model[1][11].addShapeBox(14.3F, -1F, 4.4F, 12, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F); // Box 134

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(90.5F, -11.5F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[13];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 109
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 110
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 81, 185, textureX, textureY); // Box 111
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 241, 185, textureX, textureY); // Box 113
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 113, 185, textureX, textureY); // Box 114
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 153, 185, textureX, textureY); // Box 115
		gun_3_Model[0][6] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 116
		gun_3_Model[0][7] = new ModelRendererTurbo(this, 353, 185, textureX, textureY); // Box 117
		gun_3_Model[0][8] = new ModelRendererTurbo(this, 57, 193, textureX, textureY); // Box 118
		gun_3_Model[0][9] = new ModelRendererTurbo(this, 377, 193, textureX, textureY); // Box 119
		gun_3_Model[0][10] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 120
		gun_3_Model[0][11] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 121
		gun_3_Model[0][12] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 122

		gun_3_Model[0][0].addShapeBox(-6.5F, -2.5F, -11.5F, 5, 5, 7, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109

		gun_3_Model[0][1].addShapeBox(-1.5F, -2.5F, -11.5F, 5, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110

		gun_3_Model[0][2].addShapeBox(-11F, -2.5F, -11.5F, 5, 5, 7, 0F,0F, 1F, -3F, -0.5F, 0.5F, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 111

		gun_3_Model[0][3].addShapeBox(-14F, -2.5F, -8.5F, 3, 5, 17, 0F,0F, 1F, -5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 113

		gun_3_Model[0][4].addShapeBox(-1.5F, -2.5F, 4.5F, 5, 5, 7, 0F,0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114

		gun_3_Model[0][5].addShapeBox(-11F, -2.5F, 4.5F, 5, 5, 7, 0F,0F, 1F, 0F, 0.5F, 1F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F); // Box 115

		gun_3_Model[0][6].addShapeBox(-6.5F, -2.5F, 4.5F, 5, 5, 7, 0F,-1F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116

		gun_3_Model[0][7].addShapeBox(-11F, -2.5F, -4.5F, 5, 5, 9, 0F,0F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 117

		gun_3_Model[0][8].addShapeBox(-5.5F, -2.5F, -4.5F, 4, 5, 9, 0F,0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118

		gun_3_Model[0][9].addShapeBox(-1.5F, -2.5F, -4.5F, 5, 5, 9, 0F,0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119

		gun_3_Model[0][10].addShapeBox(3.5F, -2.5F, -11.5F, 4, 5, 7, 0F,0F, 0F, -0.5F, -1.8F, -0.2F, -3F, -0.8F, 0F, 1F, 0F, 0.2F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 0.7F, 0F, 1F, 0F, 0F, 0F); // Box 120

		gun_3_Model[0][11].addShapeBox(3.5F, -2.5F, 4.5F, 4, 5, 7, 0F,0F, 0.2F, 0F, -0.8F, 0F, 1F, -1.8F, -0.2F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.7F, 0F, 1F, -1F, 0F, -3F, 0F, 0F, 0F); // Box 121

		gun_3_Model[0][12].addShapeBox(3.5F, -2.5F, -2.5F, 4, 5, 5, 0F,0F, 0.2F, 2F, -0.8F, 0F, 1F, -0.8F, 0F, 1F, 0F, 0.2F, 2F, 0F, 0F, 0F, 0.7F, 0F, 1F, 0.7F, 0F, 1F, 0F, 0F, 0F); // Box 122

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(-15F, -9F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[12];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 123
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 124
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 125
		gun_3_Model[1][3] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 126
		gun_3_Model[1][4] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 127
		gun_3_Model[1][5] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 128
		gun_3_Model[1][6] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 129
		gun_3_Model[1][7] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 130
		gun_3_Model[1][8] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 131
		gun_3_Model[1][9] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 132
		gun_3_Model[1][10] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 133
		gun_3_Model[1][11] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 134

		gun_3_Model[1][0].addShapeBox(0F, -1F, -3.2F, 10, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.3F); // Box 123

		gun_3_Model[1][1].addShapeBox(10F, -1F, -3.2F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 124

		gun_3_Model[1][2].addShapeBox(14.3F, -1F, -3.2F, 12, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F); // Box 125

		gun_3_Model[1][3].addShapeBox(14.3F, -1F, -6.4F, 12, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F); // Box 126

		gun_3_Model[1][4].addShapeBox(10F, -1F, -6.4F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 127

		gun_3_Model[1][5].addShapeBox(0F, -1F, -6.4F, 10, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.3F); // Box 128

		gun_3_Model[1][6].addShapeBox(14.3F, -1F, 1.2F, 12, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F); // Box 129

		gun_3_Model[1][7].addShapeBox(10F, -1F, 1.2F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 130

		gun_3_Model[1][8].addShapeBox(0F, -1F, 1.2F, 10, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.3F); // Box 131

		gun_3_Model[1][9].addShapeBox(0F, -1F, 4.4F, 10, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.3F); // Box 132

		gun_3_Model[1][10].addShapeBox(10F, -1F, 4.4F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 133

		gun_3_Model[1][11].addShapeBox(14.3F, -1F, 4.4F, 12, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F); // Box 134

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(-15F, -9F, 0F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun3", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[13];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 109
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 110
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 81, 185, textureX, textureY); // Box 111
		gun_4_Model[0][3] = new ModelRendererTurbo(this, 241, 185, textureX, textureY); // Box 113
		gun_4_Model[0][4] = new ModelRendererTurbo(this, 113, 185, textureX, textureY); // Box 114
		gun_4_Model[0][5] = new ModelRendererTurbo(this, 153, 185, textureX, textureY); // Box 115
		gun_4_Model[0][6] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 116
		gun_4_Model[0][7] = new ModelRendererTurbo(this, 353, 185, textureX, textureY); // Box 117
		gun_4_Model[0][8] = new ModelRendererTurbo(this, 57, 193, textureX, textureY); // Box 118
		gun_4_Model[0][9] = new ModelRendererTurbo(this, 377, 193, textureX, textureY); // Box 119
		gun_4_Model[0][10] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 120
		gun_4_Model[0][11] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 121
		gun_4_Model[0][12] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 122

		gun_4_Model[0][0].addShapeBox(-6.5F, -2.5F, -11.5F, 5, 5, 7, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109

		gun_4_Model[0][1].addShapeBox(-1.5F, -2.5F, -11.5F, 5, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110

		gun_4_Model[0][2].addShapeBox(-11F, -2.5F, -11.5F, 5, 5, 7, 0F,0F, 1F, -3F, -0.5F, 0.5F, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 111

		gun_4_Model[0][3].addShapeBox(-14F, -2.5F, -8.5F, 3, 5, 17, 0F,0F, 1F, -5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 113

		gun_4_Model[0][4].addShapeBox(-1.5F, -2.5F, 4.5F, 5, 5, 7, 0F,0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114

		gun_4_Model[0][5].addShapeBox(-11F, -2.5F, 4.5F, 5, 5, 7, 0F,0F, 1F, 0F, 0.5F, 1F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F); // Box 115

		gun_4_Model[0][6].addShapeBox(-6.5F, -2.5F, 4.5F, 5, 5, 7, 0F,-1F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116

		gun_4_Model[0][7].addShapeBox(-11F, -2.5F, -4.5F, 5, 5, 9, 0F,0F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 117

		gun_4_Model[0][8].addShapeBox(-5.5F, -2.5F, -4.5F, 4, 5, 9, 0F,0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118

		gun_4_Model[0][9].addShapeBox(-1.5F, -2.5F, -4.5F, 5, 5, 9, 0F,0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119

		gun_4_Model[0][10].addShapeBox(3.5F, -2.5F, -11.5F, 4, 5, 7, 0F,0F, 0F, -0.5F, -1.8F, -0.2F, -3F, -0.8F, 0F, 1F, 0F, 0.2F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 0.7F, 0F, 1F, 0F, 0F, 0F); // Box 120

		gun_4_Model[0][11].addShapeBox(3.5F, -2.5F, 4.5F, 4, 5, 7, 0F,0F, 0.2F, 0F, -0.8F, 0F, 1F, -1.8F, -0.2F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.7F, 0F, 1F, -1F, 0F, -3F, 0F, 0F, 0F); // Box 121

		gun_4_Model[0][12].addShapeBox(3.5F, -2.5F, -2.5F, 4, 5, 5, 0F,0F, 0.2F, 2F, -0.8F, 0F, 1F, -0.8F, 0F, 1F, 0F, 0.2F, 2F, 0F, 0F, 0F, 0.7F, 0F, 1F, 0.7F, 0F, 1F, 0F, 0F, 0F); // Box 122

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(-97.5F, -5F, 0F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[12];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 123
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 124
		gun_4_Model[1][2] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 125
		gun_4_Model[1][3] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 126
		gun_4_Model[1][4] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 127
		gun_4_Model[1][5] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 128
		gun_4_Model[1][6] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 129
		gun_4_Model[1][7] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 130
		gun_4_Model[1][8] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 131
		gun_4_Model[1][9] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 132
		gun_4_Model[1][10] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 133
		gun_4_Model[1][11] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 134

		gun_4_Model[1][0].addShapeBox(0F, -1F, -3.2F, 10, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.3F); // Box 123

		gun_4_Model[1][1].addShapeBox(10F, -1F, -3.2F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 124

		gun_4_Model[1][2].addShapeBox(14.3F, -1F, -3.2F, 12, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F); // Box 125

		gun_4_Model[1][3].addShapeBox(14.3F, -1F, -6.4F, 12, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F); // Box 126

		gun_4_Model[1][4].addShapeBox(10F, -1F, -6.4F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 127

		gun_4_Model[1][5].addShapeBox(0F, -1F, -6.4F, 10, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.3F); // Box 128

		gun_4_Model[1][6].addShapeBox(14.3F, -1F, 1.2F, 12, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F); // Box 129

		gun_4_Model[1][7].addShapeBox(10F, -1F, 1.2F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 130

		gun_4_Model[1][8].addShapeBox(0F, -1F, 1.2F, 10, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.3F); // Box 131

		gun_4_Model[1][9].addShapeBox(0F, -1F, 4.4F, 10, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.3F); // Box 132

		gun_4_Model[1][10].addShapeBox(10F, -1F, 4.4F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 133

		gun_4_Model[1][11].addShapeBox(14.3F, -1F, 4.4F, 12, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F); // Box 134

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(-97.5F, -5F, 0F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun4", gun_4_Model);
	}
}