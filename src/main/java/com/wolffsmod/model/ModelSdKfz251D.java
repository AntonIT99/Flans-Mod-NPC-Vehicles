//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Panzer4J
// Model Creator: 
// Created on: 10.08.2016 - 18:26:57
// Last changed on: 10.08.2016 - 18:26:57

package com.wolffsmod.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelSdKfz251D extends ModelVehicle //Same as Filename
{
	int textureX = 4096;
	int textureY = 3072;

	//fields
	public ModelRendererTurbo bodyModel[];
	public ModelRendererTurbo bodyDoorCloseModel[];
	public ModelRendererTurbo leftFrontWheelModel[];
	public ModelRendererTurbo rightFrontWheelModel[];
	public ModelRendererTurbo leftTrackWheelModels[];
	public ModelRendererTurbo rightTrackWheelModels[];
	public ModelRendererTurbo leftTrackModel[];
	public ModelRendererTurbo rightTrackModel[];
	public ModelRendererTurbo turretModel[];
	public ModelRendererTurbo driver[];
	public ModelRendererTurbo passenger[];

	public ModelSdKfz251D() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[172];
		bodyModel[0] = new ModelRendererTurbo(this, 289, 219, textureX, textureY); // Import ImportBox1
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox6
		bodyModel[2] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import ImportBox27
		bodyModel[3] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import ImportBox28
		bodyModel[4] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import ImportBox52
		bodyModel[5] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import ImportBox54
		bodyModel[6] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import ImportBox55
		bodyModel[7] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import ImportBox56
		bodyModel[8] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import ImportBox57
		bodyModel[9] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Import ImportBox60
		bodyModel[10] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Import ImportBox61
		bodyModel[11] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import ImportBox62
		bodyModel[12] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Import ImportBox64
		bodyModel[13] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Import ImportBox65
		bodyModel[14] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Import ImportBox66
		bodyModel[15] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Import ImportBox69
		bodyModel[16] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Import ImportBox70
		bodyModel[17] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import ImportBox71
		bodyModel[18] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import ImportBox72
		bodyModel[19] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Import ImportBox73
		bodyModel[20] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Import ImportBox75
		bodyModel[21] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Import ImportBox80
		bodyModel[22] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Import ImportBox81
		bodyModel[23] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Import ImportBox70
		bodyModel[24] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Import ImportBox71
		bodyModel[25] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Import ImportBox72
		bodyModel[26] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Import ImportBox73
		bodyModel[27] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Import ImportBox74
		bodyModel[28] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Import ImportBox75
		bodyModel[29] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Import ImportBox76
		bodyModel[30] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Import ImportBox77
		bodyModel[31] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Import ImportBox78
		bodyModel[32] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Import ImportBox79
		bodyModel[33] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Import ImportBox80
		bodyModel[34] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import ImportBox81
		bodyModel[35] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Import ImportBox82
		bodyModel[36] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Import ImportBox87
		bodyModel[37] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Import ImportBox89
		bodyModel[38] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Import ImportBox88
		bodyModel[39] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Import ImportBox89
		bodyModel[40] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import ImportBox90
		bodyModel[41] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Import ImportBox94
		bodyModel[42] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Import ImportBox95
		bodyModel[43] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import ImportBox96
		bodyModel[44] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Import ImportBox98
		bodyModel[45] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Import ImportBox99
		bodyModel[46] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Import ImportBox101
		bodyModel[47] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Import ImportBox102
		bodyModel[48] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Import ImportBox103
		bodyModel[49] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Import ImportBox104
		bodyModel[50] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import ImportBox98
		bodyModel[51] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import ImportBox99
		bodyModel[52] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import ImportBox100
		bodyModel[53] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import ImportBox101
		bodyModel[54] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import ImportBox102
		bodyModel[55] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Import ImportBox105
		bodyModel[56] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Import ImportBox106
		bodyModel[57] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Import ImportBox107
		bodyModel[58] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Import ImportBox108
		bodyModel[59] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Import ImportBox108
		bodyModel[60] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Import ImportBox110
		bodyModel[61] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Import ImportBox111
		bodyModel[62] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Import ImportBox112
		bodyModel[63] = new ModelRendererTurbo(this, 484, 124, textureX, textureY); // Import ImportBox113
		bodyModel[64] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Import ImportBox114
		bodyModel[65] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Import ImportBox115
		bodyModel[66] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Import ImportBox116
		bodyModel[67] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Import ImportBox117
		bodyModel[68] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Import ImportBox118
		bodyModel[69] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import ImportBox121
		bodyModel[70] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import ImportBox122
		bodyModel[71] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import ImportBox123
		bodyModel[72] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Import ImportBox124
		bodyModel[73] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Import ImportBox129
		bodyModel[74] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Import ImportBox130
		bodyModel[75] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Import ImportBox131
		bodyModel[76] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Import ImportBox132
		bodyModel[77] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Import ImportBox133
		bodyModel[78] = new ModelRendererTurbo(this, 243, 146, textureX, textureY); // Import ImportBox134
		bodyModel[79] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Import ImportBox135
		bodyModel[80] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Import ImportBox136
		bodyModel[81] = new ModelRendererTurbo(this, 177, 148, textureX, textureY); // Import ImportBox137
		bodyModel[82] = new ModelRendererTurbo(this, 331, 131, textureX, textureY); // Import ImportBox138
		bodyModel[83] = new ModelRendererTurbo(this, 332, 132, textureX, textureY); // Import ImportBox139
		bodyModel[84] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Import ImportBox140
		bodyModel[85] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import ImportBox141
		bodyModel[86] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Import ImportBox142
		bodyModel[87] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Import ImportBox143
		bodyModel[88] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Import ImportBox145
		bodyModel[89] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Import ImportBox146
		bodyModel[90] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Import ImportBox147
		bodyModel[91] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Import ImportBox154
		bodyModel[92] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import ImportBox155
		bodyModel[93] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Import ImportBox156
		bodyModel[94] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import ImportBox157
		bodyModel[95] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Import ImportBox158
		bodyModel[96] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Import ImportBox160
		bodyModel[97] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Import ImportBox161
		bodyModel[98] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Import ImportBox162
		bodyModel[99] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Import ImportBox163
		bodyModel[100] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Import ImportBox164
		bodyModel[101] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Import ImportBox165
		bodyModel[102] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Import ImportBox166
		bodyModel[103] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Import ImportBox167
		bodyModel[104] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Import ImportBox168
		bodyModel[105] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Import ImportBox169
		bodyModel[106] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Import ImportBox170
		bodyModel[107] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Import ImportBox171
		bodyModel[108] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Import ImportBox172
		bodyModel[109] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Import ImportBox174
		bodyModel[110] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Import ImportBox175
		bodyModel[111] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import ImportBox176
		bodyModel[112] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Import ImportBox177
		bodyModel[113] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Import ImportBox178
		bodyModel[114] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Import ImportBox179
		bodyModel[115] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Import ImportBox180
		bodyModel[116] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Import ImportBox181
		bodyModel[117] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Import ImportBox183
		bodyModel[118] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Import ImportBox184
		bodyModel[119] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Import ImportBox185
		bodyModel[120] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Import ImportBox186
		bodyModel[121] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Import ImportBox187
		bodyModel[122] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Import ImportBox188
		bodyModel[123] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Import ImportBox189
		bodyModel[124] = new ModelRendererTurbo(this, 121, 153, textureX, textureY); // Import ImportBox190
		bodyModel[125] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Import ImportBox191
		bodyModel[126] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Import ImportBox192
		bodyModel[127] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Import ImportBox193
		bodyModel[128] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Import ImportBox194
		bodyModel[129] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Import ImportBox195
		bodyModel[130] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Import ImportBox196
		bodyModel[131] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Import ImportBox197
		bodyModel[132] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Import ImportBox198
		bodyModel[133] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Import ImportBox199
		bodyModel[134] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Import ImportBox201
		bodyModel[135] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Import ImportBox202
		bodyModel[136] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import ImportBox203
		bodyModel[137] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Import ImportBox204
		bodyModel[138] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Import ImportBox205
		bodyModel[139] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Import ImportBox208
		bodyModel[140] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Import ImportBox209
		bodyModel[141] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Import ImportBox210
		bodyModel[142] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Import ImportBox211
		bodyModel[143] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Import ImportBox212
		bodyModel[144] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Import ImportBox213
		bodyModel[145] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Import ImportBox214
		bodyModel[146] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Import ImportBox215
		bodyModel[147] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Import ImportBox216
		bodyModel[148] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Import ImportBox217
		bodyModel[149] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Import ImportBox218
		bodyModel[150] = new ModelRendererTurbo(this, 137, 161, textureX, textureY); // Import ImportBox219
		bodyModel[151] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Import ImportBox220
		bodyModel[152] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Import ImportBox220
		bodyModel[153] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Import ImportBox220
		bodyModel[154] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Import ImportBox220
		bodyModel[155] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Import ImportBox220
		bodyModel[156] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Import ImportBox220
		bodyModel[157] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Import ImportBox220
		bodyModel[158] = new ModelRendererTurbo(this, 13, 292, textureX, textureY); // Import ImportBox220
		bodyModel[159] = new ModelRendererTurbo(this, 109, 309, textureX, textureY); // Import ImportBox220
		bodyModel[160] = new ModelRendererTurbo(this, 50, 292, textureX, textureY); // Import ImportBox220
		bodyModel[161] = new ModelRendererTurbo(this, 145, 309, textureX, textureY); // Import ImportBox220
		bodyModel[162] = new ModelRendererTurbo(this, 7, 311, textureX, textureY); // Import Box0
		bodyModel[163] = new ModelRendererTurbo(this, 28, 311, textureX, textureY); // Import Box4
		bodyModel[164] = new ModelRendererTurbo(this, 9, 330, textureX, textureY); // Import Ammo2
		bodyModel[165] = new ModelRendererTurbo(this, 8, 353, textureX, textureY); // Import Barrel1
		bodyModel[166] = new ModelRendererTurbo(this, 61, 319, textureX, textureY); // Import Barrel2
		bodyModel[167] = new ModelRendererTurbo(this, 60, 347, textureX, textureY); // Import Schulter1
		bodyModel[168] = new ModelRendererTurbo(this, 0, 484, textureX, textureY); // Import Ammo2
		bodyModel[169] = new ModelRendererTurbo(this, 0, 489, textureX, textureY); // Import Barrel1
		bodyModel[170] = new ModelRendererTurbo(this, 0, 492, textureX, textureY); // Import Barrel2
		bodyModel[171] = new ModelRendererTurbo(this, 22, 480, textureX, textureY); // Import Schulter1

		bodyModel[0].addShapeBox(-45F, 0F, -13.5F, 3, 16, 2, 0F, 10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox1
		bodyModel[0].setRotationPoint(-2F, -19F, 1F);

		bodyModel[1].addShapeBox(-40F, -5F, -13.5F, 60, 7, 25, 0F, 10F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 10F, 0F, 0F, 4F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 4F, -1F, -2F); // Import ImportBox6
		bodyModel[1].setRotationPoint(4.75F, 4.5F, 1F);

		bodyModel[2].addShapeBox(0F, -7F, -13.5F, 23, 8, 25, 0F, 0F, -1.75F, -3F, 0.5F, -5F, -12F, 0.5F, -5F, -12F, 0F, -1.75F, -3F, 0F, -0.5F, -3F, 2F, 1.5F, -12F, 2F, 1.5F, -12F, 0F, -0.5F, -3F); // Import ImportBox27
		bodyModel[2].setRotationPoint(26F, -8F, 1F);

		bodyModel[3].addShapeBox(0F, 7F, -13.5F, 42, 6, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox28
		bodyModel[3].setRotationPoint(9F, -12.5F, 9.5F);

		bodyModel[4].addShapeBox(-7F, 0F, 1.5F, 38, 6, 9, 0F, 0F, -2F, -2F, 0F, -4.5F, -10F, 0F, -4.5F, 7.5F, 0F, -2F, -1F, 0F, 3.5F, -8F, 2F, 4.5F, -16F, 2F, 4.5F, 7.5F, 0F, 3.5F, 2F); // Import ImportBox52
		bodyModel[4].setRotationPoint(20F, -10F, -22F);

		bodyModel[5].addShapeBox(0F, 0F, -13.5F, 4, 4, 3, 0F, 0F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, -1F, 0F, 0.6F, -1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox54
		bodyModel[5].setRotationPoint(10F, -19F, -2F);

		bodyModel[6].addShapeBox(12F, 0F, -13.5F, 3, 5, 8, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.6F, 0F, 0F, -3.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox55
		bodyModel[6].setRotationPoint(-2F, -15F, -10.6F);

		bodyModel[7].addShapeBox(0F, 0F, -1.5F, 4, 4, 3, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.6F, 0F, 0F, 0.6F); // Import ImportBox56
		bodyModel[7].setRotationPoint(10F, -19F, 14F);

		bodyModel[8].addShapeBox(12F, 0F, 27.5F, 3, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.6F, 0F, 0F, -3.6F); // Import ImportBox57
		bodyModel[8].setRotationPoint(-2F, -15F, -11.4F);

		bodyModel[9].addShapeBox(0F, 0F, -0.5F, 24, 7, 8, 0F, 0.25F, 0.75F, -7.5F, -1.25F, -2.5F, -15F, -0.75F, -2.5F, 12F, 0.25F, 0.75F, 3F, 0F, 0F, 0F, 0.75F, 0F, -10F, 0.75F, 0F, 12F, 0F, 0F, 0F); // Import ImportBox60
		bodyModel[9].setRotationPoint(26.25F, -12.5F, -20F);

		bodyModel[10].addShapeBox(-40F, -3F, -13.5F, 57, 3, 25, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F); // Import ImportBox61
		bodyModel[10].setRotationPoint(-4F, -0.5F, 1F);

		bodyModel[11].addShapeBox(-44F, 0F, 42.5F, 53, 9, 9, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -8F, 0F, 0.5F, -8F); // Import ImportBox62
		bodyModel[11].setRotationPoint(4F, -10F, -31F);

		bodyModel[12].addShapeBox(0F, 13F, -13.5F, 26, 5, 8, 0F, 0.25F, 1F, 5.9F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, 1F, 5.9F, 0.25F, 0F, 4F, -6F, -2F, 1F, -6F, -2F, 1F, 0.25F, 0F, 4F); // Import ImportBox64
		bodyModel[12].setRotationPoint(27F, -12.5F, 9.5F);

		bodyModel[13].addShapeBox(0F, 15F, -13.5F, 2, 2, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox65
		bodyModel[13].setRotationPoint(44F, -13F, -1.5F);

		bodyModel[14].addShapeBox(-2F, 7F, -13.5F, 9, 3, 25, 0F, 0F, 0F, 0F, -1F, 5F, 4F, -1F, 5F, 4F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Import ImportBox66
		bodyModel[14].setRotationPoint(10F, -14F, 1F);

		bodyModel[15].addShapeBox(-9F, 6F, -13.5F, 16, 2, 25, 0F, 0F, 0.1F, -2F, -2F, 0.1F, -2F, -2F, 0.1F, -2F, 0F, 0.1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox69
		bodyModel[15].setRotationPoint(3F, -27F, 1F);

		bodyModel[16].addShapeBox(-44F, 0F, 42.5F, 53, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0.5F, -8F, 0F, 0.5F, -8F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Import ImportBox70
		bodyModel[16].setRotationPoint(4F, -10F, -63F);

		bodyModel[17].addShapeBox(-45F, 0F, -17.5F, 49, 9, 8, 0F, 6F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Import ImportBox71
		bodyModel[17].setRotationPoint(-1F, -19F, -3F);

		bodyModel[18].addShapeBox(-45F, 0F, -13.5F, 1, 9, 8, 0F, 10F, 0F, -8F, -6F, 0F, -8F, -6F, 0F, 0F, 10F, 0F, 0F, 4.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 4.2F, 0F, 0F); // Import ImportBox72
		bodyModel[18].setRotationPoint(-2F, -19F, -7F);

		bodyModel[19].addShapeBox(-44F, 0F, 10.5F, 1, 9, 9, 0F, 8.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 8.2F, 0F, -5F, 4.25F, 0.5F, -8F, 0F, 0.5F, -8F, 0F, 0.5F, -1F, 4.25F, 0.5F, -1F); // Import ImportBox73
		bodyModel[19].setRotationPoint(3F, -10F, -31F);

		bodyModel[20].addShapeBox(-40F, -3F, -13.5F, 3, 3, 25, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F); // Import ImportBox75
		bodyModel[20].setRotationPoint(-7F, -0.5F, 1F);

		bodyModel[21].addShapeBox(-9F, 6F, -13.5F, 1, 2, 27, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox80
		bodyModel[21].setRotationPoint(3F, -25F, 0F);

		bodyModel[22].addShapeBox(0F, 0F, 0.5F, 4, 4, 7, 0F, 0F, -2.5F, 0F, -2.15F, -2.5F, 0F, -2.15F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox81
		bodyModel[22].setRotationPoint(10F, -19F, -9F);

		bodyModel[23].addShapeBox(-30F, 9F, -15.5F, 72, 1, 8, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox70
		bodyModel[23].setRotationPoint(-15F, -14F, -5F);

		bodyModel[24].addShapeBox(-28F, 10F, -15.5F, 1, 1, 8, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 2.5F, 2F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 2.5F, 2F, 0F); // Import ImportBox71
		bodyModel[24].setRotationPoint(-16F, -14F, -5F);

		bodyModel[25].addShapeBox(0F, 10F, -15.5F, 1, 1, 12, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -3F, 3F, 0F, 3.5F, 3F, 0F, 3.5F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox72
		bodyModel[25].setRotationPoint(25F, -14F, -5F);

		bodyModel[26].addShapeBox(13.5F, 10F, -15.5F, 1, 1, 13, 0F, 1.5F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 1.5F, 1F, 0F, 3.5F, 3F, 0F, -3F, 3F, 0F, -3F, 3F, 0F, 3.5F, 3F, 0F); // Import ImportBox73
		bodyModel[26].setRotationPoint(25F, -14F, -5F);

		bodyModel[27].addShapeBox(-30F, 9F, -15.5F, 8, 1, 14, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F); // Import ImportBox74
		bodyModel[27].setRotationPoint(58F, -8.5F, -5F);

		bodyModel[28].addShapeBox(-30F, 9F, -15.5F, 14, 1, 13, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox75
		bodyModel[28].setRotationPoint(67F, -15F, -5F);

		bodyModel[29].addShapeBox(-30F, 9F, 0F, 14, 1, 13, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox76
		bodyModel[29].setRotationPoint(67F, -15F, 7.5F);

		bodyModel[30].addShapeBox(13.5F, 10F, 0F, 1, 1, 13, 0F, 1.5F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 1.5F, 1F, 0F, 3.5F, 3F, 0F, -3F, 3F, 0F, -3F, 3F, 0F, 3.5F, 3F, 0F); // Import ImportBox77
		bodyModel[30].setRotationPoint(25F, -14F, 7.5F);

		bodyModel[31].addShapeBox(-30F, 9F, 0F, 8, 1, 14, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F); // Import ImportBox78
		bodyModel[31].setRotationPoint(58F, -8.5F, 6.5F);

		bodyModel[32].addShapeBox(0F, 10F, 0F, 1, 1, 12, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -3F, 3F, 0F, 3.5F, 3F, 0F, 3.5F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox79
		bodyModel[32].setRotationPoint(25F, -14F, 8.5F);

		bodyModel[33].addShapeBox(0F, 10F, 0F, 1, 1, 10, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -3F, 3F, 0F, 3.5F, 3F, 0F, 3.5F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox80
		bodyModel[33].setRotationPoint(25F, -14F, 8F);

		bodyModel[34].addShapeBox(-30F, 9F, 0F, 72, 1, 8, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox81
		bodyModel[34].setRotationPoint(-15F, -14F, 12.5F);

		bodyModel[35].addShapeBox(-28F, 10F, 0F, 1, 1, 8, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 2.5F, 2F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 2.5F, 2F, 0F); // Import ImportBox82
		bodyModel[35].setRotationPoint(-16F, -14F, 12.5F);

		bodyModel[36].addShapeBox(-30F, 10F, 0F, 57, 4, 6, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox87
		bodyModel[36].setRotationPoint(-14.25F, -19.5F, -20.5F);

		bodyModel[37].addShapeBox(0F, -5F, -13.5F, 2, 8, 25, 0F, 0F, 0F, 0F, 0F, 1F, -2.5F, 0F, 1F, -2.5F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -4.5F, 0F, -1F, -4.5F, 0F, -1F, -2F); // Import ImportBox89
		bodyModel[37].setRotationPoint(24.75F, 3.5F, 1F);

		bodyModel[38].addShapeBox(0F, 0F, -13.5F, 4, 4, 4, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox88
		bodyModel[38].setRotationPoint(10F, -19F, 1F);

		bodyModel[39].addShapeBox(0F, 0F, -13.5F, 4, 4, 4, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox89
		bodyModel[39].setRotationPoint(10F, -19F, 22F);

		bodyModel[40].addShapeBox(1F, 0F, -13.5F, 4, 4, 3, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox90
		bodyModel[40].setRotationPoint(9F, -19F, 12F);

		bodyModel[41].addShapeBox(-30F, 10F, 0F, 57, 4, 6, 0F, 0F, 0.5F, -2F, 0.25F, 0.5F, -2F, 0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox94
		bodyModel[41].setRotationPoint(-14.25F, -19.5F, 14.5F);

		bodyModel[42].addBox(-30F, 9F, -15.5F, 60, 2, 4, 0F); // Import ImportBox95
		bodyModel[42].setRotationPoint(-7F, -6F, 1F);

		bodyModel[43].addBox(-30F, 9F, 9.5F, 60, 2, 4, 0F); // Import ImportBox96
		bodyModel[43].setRotationPoint(-7F, -6F, 1F);

		bodyModel[44].addShapeBox(-30F, 10F, 0F, 13, 4, 6, 0F, 0F, 0.5F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox98
		bodyModel[44].setRotationPoint(43F, -19.5F, -20.5F);

		bodyModel[45].addShapeBox(0F, -7F, -13.5F, 13, 8, 25, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, -12F, 0F, 1.5F, -12F, 0F, -0.5F, 0F); // Import ImportBox99
		bodyModel[45].setRotationPoint(13F, -8F, 1F);

		bodyModel[46].addShapeBox(0F, 0F, -0.5F, 13, 5, 8, 0F, 0F, 0F, -4.4F, 0F, -1.75F, -7.5F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 4.5F, 0F, 0.25F, 4.5F, 0F, 0F, 0F, 0F); // Import ImportBox101
		bodyModel[46].setRotationPoint(13F, -15F, -20F);

		bodyModel[47].addShapeBox(-7F, 0F, 1.5F, 38, 6, 9, 0F, 0F, -2F, -1F, 0F, -4.5F, 7.5F, 0F, -4.5F, -10F, 0F, -2F, -2F, 0F, 3.5F, 2F, 2F, 4.5F, 7.5F, 2F, 4.5F, -16F, 0F, 3.5F, -8F); // Import ImportBox102
		bodyModel[47].setRotationPoint(20F, -10F, 10F);

		bodyModel[48].addShapeBox(0F, 0F, -0.5F, 24, 7, 8, 0F, 0.25F, 0.75F, 3F, -0.75F, -2.5F, 12F, -1.25F, -2.5F, -15F, 0.25F, 0.75F, -7.5F, 0F, 0F, 0F, 0.75F, 0F, 12F, 0.75F, 0F, -10F, 0F, 0F, 0F); // Import ImportBox103
		bodyModel[48].setRotationPoint(26.25F, -12.5F, 13F);

		bodyModel[49].addShapeBox(0F, 0F, -0.5F, 13, 5, 8, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, -7.5F, 0F, 0F, -4.4F, 0F, 0F, 0F, 0.25F, 4.5F, 0F, 0.25F, 4.5F, 0F, 0F, 0F, 0F); // Import ImportBox104
		bodyModel[49].setRotationPoint(13F, -15F, 13F);

		bodyModel[50].addShapeBox(-30F, 10F, 0F, 13, 4, 6, 0F, 0F, 0.5F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox98
		bodyModel[50].setRotationPoint(43F, -19.5F, 14.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import ImportBox99
		bodyModel[51].setRotationPoint(47F, -9F, 12F);

		bodyModel[52].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Import ImportBox100
		bodyModel[52].setRotationPoint(46F, -10.5F, 12F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Import ImportBox101
		bodyModel[53].setRotationPoint(46F, -10.5F, 13F);

		bodyModel[54].addShapeBox(0F, 0F, -2F, 3, 2, 1, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox102
		bodyModel[54].setRotationPoint(46F, -10.5F, 13F);

		bodyModel[55].addShapeBox(4F, -6F, 29F, 4, 2, 6, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -6F, 0F, 0.25F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Import ImportBox105
		bodyModel[55].setRotationPoint(-1F, -11F, -14.9F);

		bodyModel[56].addShapeBox(4F, -8F, 28F, 4, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -4.65F, 0F, 0.5F, -4.65F); // Import ImportBox106
		bodyModel[56].setRotationPoint(-1F, -11F, -15.5F);

		bodyModel[57].addShapeBox(0F, 0F, 19.5F, 3, 9, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox107
		bodyModel[57].setRotationPoint(7F, -19F, -7F);

		bodyModel[58].addShapeBox(4F, 0F, 27.5F, 4, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3.6F, 0F, 0F, -3.6F); // Import ImportBox108
		bodyModel[58].setRotationPoint(-1F, -15F, -13.4F);

		bodyModel[59].addShapeBox(-45F, 0F, 9.5F, 3, 16, 2, 0F, 10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox108
		bodyModel[59].setRotationPoint(-2F, -19F, 1F);

		bodyModel[60].addShapeBox(-9F, 6F, -13.5F, 6, 2, 25, 0F, -2F, 0.1F, -2F, -2F, 0.1F, -2F, -2F, 0.1F, -2F, -2F, 0.1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox110
		bodyModel[60].setRotationPoint(-48F, -27F, 1F);

		bodyModel[61].addShapeBox(-9F, 6F, -13.5F, 49, 2, 5, 0F, 0F, 0.1F, -2F, -2F, 0.1F, -2F, -2F, 0.1F, -2F, 0F, 0.1F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F); // Import ImportBox111
		bodyModel[61].setRotationPoint(-44F, -27F, 1F);

		bodyModel[62].addShapeBox(-9F, 6F, 6.5F, 49, 2, 5, 0F, 0F, 0.1F, -2F, -2F, 0.1F, -2F, -2F, 0.1F, -2F, 0F, 0.1F, -2F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox112
		bodyModel[62].setRotationPoint(-44F, -27F, 1F);

		bodyModel[63].addShapeBox(4F, 0F, 27.5F, 4, 5, 5, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox113
		bodyModel[63].setRotationPoint(-1F, -18F, -14.4F);

		bodyModel[64].addShapeBox(0F, 0F, 19.5F, 3, 9, 8, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Import ImportBox114
		bodyModel[64].setRotationPoint(7F, -19F, -40F);

		bodyModel[65].addShapeBox(4F, 0F, 27.5F, 4, 5, 10, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.6F, 0F, 0F, -3.6F, 0F, 0F, -2F, 0F, 0F, -2F); // Import ImportBox115
		bodyModel[65].setRotationPoint(-1F, -15F, -51.6F);

		bodyModel[66].addShapeBox(4F, -6F, 0F, 4, 2, 6, 0F, 0F, 0.25F, -6F, 0F, 0.25F, -6F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox116
		bodyModel[66].setRotationPoint(-1F, -11F, -20.1F);

		bodyModel[67].addShapeBox(4F, -8F, 0F, 4, 1, 6, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -4.65F, 0F, 0.5F, -4.65F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Import ImportBox117
		bodyModel[67].setRotationPoint(-1F, -11F, -18.5F);

		bodyModel[68].addShapeBox(4F, 0F, 27.5F, 4, 5, 8, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import ImportBox118
		bodyModel[68].setRotationPoint(-1F, -18F, -48.6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox121
		bodyModel[69].setRotationPoint(-55.4F, -16.5F, -11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox122
		bodyModel[70].setRotationPoint(-55.4F, -16.5F, 10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox123
		bodyModel[71].setRotationPoint(-49.6F, -7.5F, 10F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox124
		bodyModel[72].setRotationPoint(-49.6F, -7.5F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, -0.2F, 0F, 0.9F, -0.2F, 0F, 0.9F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0.9F, -0.5F, 0F, 0.9F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox129
		bodyModel[73].setRotationPoint(10.4F, -19F, -8.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, -0.2F, 0F, 0.9F, -0.2F, 0F, 0.9F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0.9F, -0.5F, 0F, 0.9F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox130
		bodyModel[74].setRotationPoint(10.4F, -19F, 1.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, -0.3F, -0.3F, 0.6F, -0.3F, -0.3F, 0.6F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.1F, 0.8F, -0.5F, -0.1F, 0.8F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Import ImportBox131
		bodyModel[75].setRotationPoint(10.4F, -19.2F, -8.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, -0.3F, -0.3F, 0.6F, -0.3F, -0.3F, 0.6F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.1F, 0.8F, -0.5F, -0.1F, 0.8F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Import ImportBox132
		bodyModel[76].setRotationPoint(10.4F, -19.2F, 1.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0.5F, 4, 4, 7, 0F, 0F, -2.5F, 0F, -2.15F, -2.5F, 0F, -2.15F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox133
		bodyModel[77].setRotationPoint(10F, -19F, 1F);

		bodyModel[78].addShapeBox(0F, 10F, 0F, 14, 4, 2, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox134
		bodyModel[78].setRotationPoint(-1.25F, -20F, 18.75F);

		bodyModel[79].addShapeBox(0F, 10F, 0F, 14, 4, 3, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox135
		bodyModel[79].setRotationPoint(-17.25F, -20F, 17.75F);

		bodyModel[80].addShapeBox(0F, 10F, 0F, 14, 4, 3, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox136
		bodyModel[80].setRotationPoint(-39.25F, -20F, 17.75F);

		bodyModel[81].addShapeBox(0F, 10F, 0F, 14, 4, 3, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox137
		bodyModel[81].setRotationPoint(-39.25F, -20F, -20.75F);

		bodyModel[82].addShapeBox(0F, 10F, 0F, 14, 4, 3, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox138
		bodyModel[82].setRotationPoint(-17.25F, -20F, -20.75F);

		bodyModel[83].addShapeBox(0F, 10F, 0F, 14, 4, 2, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox139
		bodyModel[83].setRotationPoint(-1.25F, -20F, -20.75F);

		bodyModel[84].addBox(0F, 0F, -1F, 6, 5, 3, 0F); // Import ImportBox140
		bodyModel[84].setRotationPoint(29F, -2F, 15.5F);

		bodyModel[85].addShapeBox(0F, 0F, -1F, 6, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F); // Import ImportBox141
		bodyModel[85].setRotationPoint(29F, -2F, 18.5F);

		bodyModel[86].addShapeBox(0F, 0F, -6F, 6, 5, 2, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox142
		bodyModel[86].setRotationPoint(29F, -2F, 18.5F);

		bodyModel[87].addShapeBox(0F, 0F, -1F, 6, 1, 2, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -2F, -0.5F, -1.5F, -2F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F); // Import ImportBox143
		bodyModel[87].setRotationPoint(29F, -3F, 18.5F);

		bodyModel[88].addShapeBox(0F, 0F, -1F, 6, 1, 3, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox145
		bodyModel[88].setRotationPoint(29F, -3F, 15.5F);

		bodyModel[89].addShapeBox(0F, 0F, -1F, 6, 1, 2, 0F, -2F, -0.5F, -1.5F, -2F, -0.5F, -1.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox146
		bodyModel[89].setRotationPoint(29F, -3F, 13.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import ImportBox147
		bodyModel[90].setRotationPoint(31F, -6F, 14F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox154
		bodyModel[91].setRotationPoint(54F, -0.5F, -5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.75F, 0F); // Import ImportBox155
		bodyModel[92].setRotationPoint(54F, -0.5F, -5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, 0F, -1F, 0F, 0F); // Import ImportBox156
		bodyModel[93].setRotationPoint(52F, -0.5F, -5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox157
		bodyModel[94].setRotationPoint(52F, -0.5F, -5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox158
		bodyModel[95].setRotationPoint(54F, -1F, -5F);

		bodyModel[96].addShapeBox(0F, 0F, 8.5F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox160
		bodyModel[96].setRotationPoint(52F, -0.5F, -5F);

		bodyModel[97].addShapeBox(0F, 0F, 8.5F, 2, 1, 1, 0F, -1F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, 0F, -1F, 0F, 0F); // Import ImportBox161
		bodyModel[97].setRotationPoint(52F, -0.5F, -5F);

		bodyModel[98].addShapeBox(0F, 0F, 8.5F, 1, 1, 1, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.75F, 0F); // Import ImportBox162
		bodyModel[98].setRotationPoint(54F, -0.5F, -5F);

		bodyModel[99].addShapeBox(0F, 0F, 8.5F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox163
		bodyModel[99].setRotationPoint(54F, -1F, -5F);

		bodyModel[100].addShapeBox(0F, 0F, 8.5F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox164
		bodyModel[100].setRotationPoint(54F, -0.5F, -5F);

		bodyModel[101].addBox(1F, 1F, 0F, 1, 2, 1, 0F); // Import ImportBox165
		bodyModel[101].setRotationPoint(-55.5F, -24F, -0.5F);

		bodyModel[102].addShapeBox(1F, 1F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Import ImportBox166
		bodyModel[102].setRotationPoint(-55.5F, -25F, -0.5F);

		bodyModel[103].addShapeBox(1F, 1F, 0F, 9, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -2.5F, -0.25F, 0F, -2.5F, -0.25F, 0F, -0.5F, -0.25F); // Import ImportBox167
		bodyModel[103].setRotationPoint(-54.5F, -24F, -0.5F);

		bodyModel[104].addShapeBox(1F, 0F, 0F, 7, 1, 1, 0F, 0F, -1F, -0.25F, -2F, 1F, -0.25F, -2F, 1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.5F, -0.25F, 0F, -2.5F, -0.25F, 0F, -2.5F, -0.25F, 0F, 0.5F, -0.25F); // Import ImportBox168
		bodyModel[104].setRotationPoint(-55.4F, -22.5F, -0.5F);

		bodyModel[105].addBox(1F, 1F, 0F, 1, 1, 1, 0F); // Import ImportBox169
		bodyModel[105].setRotationPoint(-45.5F, -26F, -0.5F);

		bodyModel[106].addShapeBox(-36F, 0F, 10.5F, 1, 9, 9, 0F, 6.2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -9F, 6.2F, 0F, -1F, 0.25F, 0.5F, -8F, -1F, 0.5F, -8F, -1F, 0.5F, -1F, 0.25F, 0.5F, -1F); // Import ImportBox170
		bodyModel[106].setRotationPoint(-9F, -10F, -31F);

		bodyModel[107].addShapeBox(-45F, 0F, -17.5F, 49, 9, 8, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 6F, 0F, -8F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox171
		bodyModel[107].setRotationPoint(-1F, -19F, 30F);

		bodyModel[108].addShapeBox(-44F, 0F, 10.5F, 1, 9, 9, 0F, 8.2F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 8.2F, 0F, 0F, 4.25F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -8F, 4.25F, 0.5F, -8F); // Import ImportBox172
		bodyModel[108].setRotationPoint(3F, -10F, 1F);

		bodyModel[109].addShapeBox(-36F, 0F, 10.5F, 1, 9, 9, 0F, 6.2F, 0F, -1F, 3F, 0F, -9F, 3F, 0F, 0F, 6.2F, 0F, 0F, 0.25F, 0.5F, -1F, -1F, 0.5F, -1F, -1F, 0.5F, -8F, 0.25F, 0.5F, -8F); // Import ImportBox174
		bodyModel[109].setRotationPoint(-9F, -10F, 1F);

		bodyModel[110].addShapeBox(-45F, 0F, -13.5F, 1, 9, 8, 0F, 10F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -8F, 10F, 0F, -8F, 4.2F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 4.2F, 0F, 0F); // Import ImportBox175
		bodyModel[110].setRotationPoint(-2F, -19F, 26F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox176
		bodyModel[111].setRotationPoint(-47F, 0F, -0.5F);

		bodyModel[112].addShapeBox(-3F, 0F, 0F, 1, 2, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox177
		bodyModel[112].setRotationPoint(-45F, -0.5F, -1F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox178
		bodyModel[113].setRotationPoint(-49.5F, -1F, -1F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox179
		bodyModel[114].setRotationPoint(-49.5F, 0.5F, -1F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import ImportBox180
		bodyModel[115].setRotationPoint(-49F, 0F, -0.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.25F, 0F, -0.25F); // Import ImportBox181
		bodyModel[116].setRotationPoint(-50F, -1.5F, -0.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -4F, 0F, 0F, 0F); // Import ImportBox183
		bodyModel[117].setRotationPoint(25.5F, -13.5F, 0.1F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, 0F, 0F, 0F, 0F); // Import ImportBox184
		bodyModel[118].setRotationPoint(25.5F, -13.5F, -9.1F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox185
		bodyModel[119].setRotationPoint(27.5F, -13.3F, 7.75F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox186
		bodyModel[120].setRotationPoint(27.5F, -13.3F, -8.75F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox187
		bodyModel[121].setRotationPoint(36.5F, -12F, 5.25F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox188
		bodyModel[122].setRotationPoint(36.5F, -12F, -6.25F);

		bodyModel[123].addShapeBox(0F, 15F, -13.5F, 1, 1, 10, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox189
		bodyModel[123].setRotationPoint(44.5F, -14F, -1.5F);

		bodyModel[124].addShapeBox(0F, 15F, -13.5F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import ImportBox190
		bodyModel[124].setRotationPoint(44.5F, -14F, 18.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Import ImportBox191
		bodyModel[125].setRotationPoint(48F, -8F, 18F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Import ImportBox192
		bodyModel[126].setRotationPoint(48F, -9.5F, 18F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.25F, 0F, -1.25F, -0.65F, 0F, -1.25F, -0.65F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import ImportBox193
		bodyModel[127].setRotationPoint(48F, -12.5F, 18F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox194
		bodyModel[128].setRotationPoint(47.5F, -12.5F, 18.75F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F); // Import ImportBox195
		bodyModel[129].setRotationPoint(47.5F, -12.5F, 19.75F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox196
		bodyModel[130].setRotationPoint(47.5F, -12.5F, 17.75F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.75F, -0.75F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.75F, -0.75F, 0F, -0.75F, -0.25F); // Import ImportBox197
		bodyModel[131].setRotationPoint(49F, -10.5F, 13F);

		bodyModel[132].addShapeBox(0F, 0F, -2F, 1, 2, 1, 0F, 0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.75F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.75F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Import ImportBox198
		bodyModel[132].setRotationPoint(49F, -10.5F, 13F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Import ImportBox199
		bodyModel[133].setRotationPoint(49F, -10.5F, 12F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Import ImportBox201
		bodyModel[134].setRotationPoint(48F, -8F, -19F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Import ImportBox202
		bodyModel[135].setRotationPoint(48F, -9.5F, -19F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.25F, 0F, 0.25F, -0.65F, 0F, 0.25F, -0.65F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import ImportBox203
		bodyModel[136].setRotationPoint(48F, -12.5F, -19F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Import ImportBox204
		bodyModel[137].setRotationPoint(47.8F, -12.5F, -19.6F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Import ImportBox205
		bodyModel[138].setRotationPoint(47.8F, -12.6F, 18.65F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Import ImportBox208
		bodyModel[139].setRotationPoint(35F, -7.25F, -17.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Import ImportBox209
		bodyModel[140].setRotationPoint(45F, -7.25F, -20.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox210
		bodyModel[141].setRotationPoint(45F, -7.25F, -16.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Import ImportBox211
		bodyModel[142].setRotationPoint(46F, -7.25F, -17.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F); // Import ImportBox212
		bodyModel[143].setRotationPoint(44F, -7.25F, -17.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F); // Import ImportBox213
		bodyModel[144].setRotationPoint(38F, -7.25F, -17.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F); // Import ImportBox214
		bodyModel[145].setRotationPoint(44F, -7.25F, 16F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Import ImportBox215
		bodyModel[146].setRotationPoint(35F, -7.25F, 16F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F); // Import ImportBox216
		bodyModel[147].setRotationPoint(38F, -7.25F, 16F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0.5F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0.25F); // Import ImportBox217
		bodyModel[148].setRotationPoint(46F, -7.25F, 15F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import ImportBox218
		bodyModel[149].setRotationPoint(31F, -1.25F, 18.5F);

		bodyModel[150].addShapeBox(-30F, 9F, -15.5F, 40, 4, 8, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox219
		bodyModel[150].setRotationPoint(-16F, -15F, 0F);

		bodyModel[151].addShapeBox(-30F, 9F, -15.5F, 40, 4, 8, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F); // Import ImportBox220
		bodyModel[151].setRotationPoint(-16F, -15F, 23F);

		bodyModel[152].addShapeBox(-30F, 1F, -15.5F, 40, 8, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox220
		bodyModel[152].setRotationPoint(-16F, -15.5F, 28F);

		bodyModel[153].addShapeBox(-30F, 1F, -15.5F, 16, 5, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox220
		bodyModel[153].setRotationPoint(-14F, -15F, 27F);

		bodyModel[154].addShapeBox(-30F, 1F, -15.5F, 17, 5, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox220
		bodyModel[154].setRotationPoint(5F, -15F, 27F);

		bodyModel[155].addShapeBox(-30F, 1F, -15.5F, 40, 8, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox220
		bodyModel[155].setRotationPoint(-16F, -15.5F, 1F);

		bodyModel[156].addShapeBox(-30F, 1F, -15.5F, 16, 5, 1, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox220
		bodyModel[156].setRotationPoint(-14F, -15F, 2F);

		bodyModel[157].addShapeBox(-30F, 1F, -15.5F, 17, 5, 1, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox220
		bodyModel[157].setRotationPoint(5F, -15F, 2F);

		bodyModel[158].addShapeBox(0F, 7F, -5.51F, 10, 10, 1, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, 0F, -6F, 0F); // Import ImportBox220
		bodyModel[158].setRotationPoint(-23F, -16.75F, -15F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 36, 9, 1, 0F, -15F, 0F, 6.25F, 0F, 0F, 6.25F, 0F, 0F, -6.25F, -15F, 0F, -6.25F, -15F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -15F, -2F, 0F); // Import ImportBox220
		bodyModel[159].setRotationPoint(-48F, -18F, 18.75F);

		bodyModel[160].addShapeBox(0F, 0F, -3.49F, 10, 10, 1, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, 0F, -6F, 0F); // Import ImportBox220
		bodyModel[160].setRotationPoint(-23F, -10F, 23F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 36, 9, 1, 0F, -15F, 0F, -6.25F, 0F, 0F, -6.25F, 0F, 0F, 6.25F, -15F, 0F, 6.25F, -15F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -15F, -2F, 0F); // Import ImportBox220
		bodyModel[161].setRotationPoint(-48F, -18F, -19.75F);

		bodyModel[162].addShapeBox(0F, 0F, -5F, 1, 1, 7, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		bodyModel[162].setRotationPoint(10F, -19F, 6.5F);

		bodyModel[163].addShapeBox(0F, 1F, -4F, 1, 1, 7, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box4
		bodyModel[163].setRotationPoint(10F, -20F, -4.5F);

		bodyModel[164].addBox(-3F, 0F, 0F, 11, 3, 11, 0F); // Import Ammo2
		bodyModel[164].setRotationPoint(0F, -6F, -12F);

		bodyModel[165].addBox(0F, 0F, 0F, 11, 3, 11, 0F); // Import Barrel1
		bodyModel[165].setRotationPoint(-3F, -6F, 1F);

		bodyModel[166].addBox(0F, -1F, 0F, 2, 8, 11, 0F); // Import Barrel2
		bodyModel[166].setRotationPoint(-3F, -13F, 1F);

		bodyModel[167].addBox(0F, -2F, 0F, 2, 8, 11, 0F); // Import Schulter1
		bodyModel[167].setRotationPoint(-3F, -12F, -12F);

		bodyModel[168].addShapeBox(-2.9F, -0.8F, 0F, 1, 0, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Ammo2
		bodyModel[168].setRotationPoint(0F, 0F, 0F);

		bodyModel[169].addShapeBox(11F, -1F, -0.5F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F); // Import Barrel1
		bodyModel[169].setRotationPoint(0F, 0F, 0F);

		bodyModel[170].addShapeBox(10F, -1F, -0.5F, 1, 1, 1, 0F, 0F, -0.05F, -0.05F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.05F, -0.05F); // Import Barrel2
		bodyModel[170].setRotationPoint(0F, 0F, 0F);

		bodyModel[171].addShapeBox(-12F, -2F, -0.5F, 2, 1, 1, 0F, 0.5F, -0.5F, -0.25F, -2F, -0.5F, -0.2F, -2F, -0.5F, -0.2F, 0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.08F, 0F, 0F, -0.08F, 0F, 0F, -0.25F); // Import Schulter1
		bodyModel[171].setRotationPoint(0F, 0F, 0F);

		bodyDoorCloseModel = new ModelRendererTurbo[2];
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 441, 169, textureX, textureY); // Import ImportBox107
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 473, 177, textureX, textureY); // Import ImportBox109

		bodyDoorCloseModel[0].addShapeBox(0F, 0F, 0F, 1, 16, 10, 0F, 10F, -0.5F, 0F, -10.5F, -0.5F, 0F, -10.5F, -0.5F, 0.5F, 10F, -0.5F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox107
		bodyDoorCloseModel[0].setRotationPoint(-47.25F, -19.5F, -10.5F);

		bodyDoorCloseModel[1].addShapeBox(0F, 0F, 0F, 1, 16, 10, 0F, 10F, -0.5F, 0.5F, -10.5F, -0.5F, 0.5F, -10.5F, -0.5F, 0F, 10F, -0.5F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox109
		bodyDoorCloseModel[1].setRotationPoint(-47.25F, -19.5F, 0.5F);


		leftFrontWheelModel = new ModelRendererTurbo[2];
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 10, 238, textureX, textureY); // Import ImportShape42
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 246, 220, textureX, textureY); // Import ImportShape207

		leftFrontWheelModel[0].addShape3D(51F, -3F, -18.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 4, 12, 12, 44, 4, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Import ImportShape42
		leftFrontWheelModel[0].setRotationPoint(0F, 0F, 0F);

		leftFrontWheelModel[1].addShape3D(50F, -2F, -18.55F, new Shape2D(new Coord2D[] { new Coord2D(3, 1, 3, 1), new Coord2D(7, 1, 7, 1), new Coord2D(9, 3, 9, 3), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(3, 9, 3, 9), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3) }), 2, 9, 9, 28, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import ImportShape207
		leftFrontWheelModel[1].setRotationPoint(0F, 0F, 0F);


		rightFrontWheelModel = new ModelRendererTurbo[2];
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 91, 241, textureX, textureY); // Import ImportShape15
		rightFrontWheelModel[1] = new ModelRendererTurbo(this, 150, 242, textureX, textureY); // Import ImportShape206

		rightFrontWheelModel[0].addShape3D(51F, -3F, 14.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 4, 12, 12, 44, 4, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Import ImportShape15
		rightFrontWheelModel[0].setRotationPoint(0F, 0F, 0F);

		rightFrontWheelModel[1].addShape3D(50F, -2F, 16.55F, new Shape2D(new Coord2D[] { new Coord2D(3, 1, 3, 1), new Coord2D(7, 1, 7, 1), new Coord2D(9, 3, 9, 3), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(3, 9, 3, 9), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3) }), 2, 9, 9, 28, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import ImportShape206
		rightFrontWheelModel[1].setRotationPoint(0F, 0F, 0F);


		leftTrackWheelModels = new ModelRendererTurbo[8];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 183, 238, textureX, textureY); // Import ImportShape43
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 211, 222, textureX, textureY); // Import ImportShape44
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 9, 270, textureX, textureY); // Import ImportShape45
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 44, 269, textureX, textureY); // Import ImportShape46
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 80, 270, textureX, textureY); // Import ImportShape47
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 118, 269, textureX, textureY); // Import ImportShape48
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 154, 269, textureX, textureY); // Import ImportShape49
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 192, 266, textureX, textureY); // Import ImportShape50

		leftTrackWheelModels[0].addShape3D(25F, -3F, -17.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 1, 3, 1), new Coord2D(7, 1, 7, 1), new Coord2D(9, 3, 9, 3), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(3, 9, 3, 9), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3) }), 2, 9, 9, 28, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import ImportShape43
		leftTrackWheelModels[0].setRotationPoint(0F, 0F, 0F);

		leftTrackWheelModels[1].addShape3D(13.5F, -1F, -16.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 1, 3, 1), new Coord2D(7, 1, 7, 1), new Coord2D(9, 3, 9, 3), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(3, 9, 3, 9), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3) }), 2, 9, 9, 28, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import ImportShape44
		leftTrackWheelModels[1].setRotationPoint(0F, 0F, 0F);

		leftTrackWheelModels[2].addShape3D(6.5F, -1F, -17.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 1, 3, 1), new Coord2D(7, 1, 7, 1), new Coord2D(9, 3, 9, 3), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(3, 9, 3, 9), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3) }), 2, 9, 9, 28, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import ImportShape45
		leftTrackWheelModels[2].setRotationPoint(0F, 0F, 0F);

		leftTrackWheelModels[3].addShape3D(-0.5F, -1F, -16.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 1, 3, 1), new Coord2D(7, 1, 7, 1), new Coord2D(9, 3, 9, 3), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(3, 9, 3, 9), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3) }), 2, 9, 9, 28, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import ImportShape46
		leftTrackWheelModels[3].setRotationPoint(0F, 0F, 0F);

		leftTrackWheelModels[4].addShape3D(-7.5F, -1F, -17.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 1, 3, 1), new Coord2D(7, 1, 7, 1), new Coord2D(9, 3, 9, 3), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(3, 9, 3, 9), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3) }), 2, 9, 9, 28, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import ImportShape47
		leftTrackWheelModels[4].setRotationPoint(0F, 0F, 0F);

		leftTrackWheelModels[5].addShape3D(-14.5F, -1F, -16.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 1, 3, 1), new Coord2D(7, 1, 7, 1), new Coord2D(9, 3, 9, 3), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(3, 9, 3, 9), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3) }), 2, 9, 9, 28, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import ImportShape48
		leftTrackWheelModels[5].setRotationPoint(0F, 0F, 0F);

		leftTrackWheelModels[6].addShape3D(-21.5F, -1F, -17.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 1, 3, 1), new Coord2D(7, 1, 7, 1), new Coord2D(9, 3, 9, 3), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(3, 9, 3, 9), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3) }), 2, 9, 9, 28, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import ImportShape49
		leftTrackWheelModels[6].setRotationPoint(0F, 0F, 0F);

		leftTrackWheelModels[7].addShape3D(-29.5F, -2F, -16.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 1, 3, 1), new Coord2D(7, 1, 7, 1), new Coord2D(9, 3, 9, 3), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(3, 9, 3, 9), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3) }), 2, 9, 9, 28, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import ImportShape50
		leftTrackWheelModels[7].setRotationPoint(0F, 0F, 0F);


		rightTrackWheelModels = new ModelRendererTurbo[8];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 227, 265, textureX, textureY); // Import ImportShape7
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 262, 263, textureX, textureY); // Import ImportShape8
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 297, 261, textureX, textureY); // Import ImportShape9
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 332, 261, textureX, textureY); // Import ImportShape10
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 78, 198, textureX, textureY); // Import ImportShape11
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 4, 208, textureX, textureY); // Import ImportShape12
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 39, 194, textureX, textureY); // Import ImportShape13
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 2, 190, textureX, textureY); // Import ImportShape14

		rightTrackWheelModels[0].addShape3D(-21.5F, -1F, 16.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 1, 3, 1), new Coord2D(7, 1, 7, 1), new Coord2D(9, 3, 9, 3), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(3, 9, 3, 9), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3) }), 2, 9, 9, 28, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import ImportShape7
		rightTrackWheelModels[0].setRotationPoint(0F, 0F, 0F);

		rightTrackWheelModels[1].addShape3D(-29.5F, -2F, 15.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 1, 3, 1), new Coord2D(7, 1, 7, 1), new Coord2D(9, 3, 9, 3), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(3, 9, 3, 9), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3) }), 2, 9, 9, 28, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import ImportShape8
		rightTrackWheelModels[1].setRotationPoint(0F, 0F, 0F);

		rightTrackWheelModels[2].addShape3D(-14.5F, -1F, 15.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 1, 3, 1), new Coord2D(7, 1, 7, 1), new Coord2D(9, 3, 9, 3), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(3, 9, 3, 9), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3) }), 2, 9, 9, 28, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import ImportShape9
		rightTrackWheelModels[2].setRotationPoint(0F, 0F, 0F);

		rightTrackWheelModels[3].addShape3D(-7.5F, -1F, 16.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 1, 3, 1), new Coord2D(7, 1, 7, 1), new Coord2D(9, 3, 9, 3), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(3, 9, 3, 9), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3) }), 2, 9, 9, 28, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import ImportShape10
		rightTrackWheelModels[3].setRotationPoint(0F, 0F, 0F);

		rightTrackWheelModels[4].addShape3D(-0.5F, -1F, 15.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 1, 3, 1), new Coord2D(7, 1, 7, 1), new Coord2D(9, 3, 9, 3), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(3, 9, 3, 9), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3) }), 2, 9, 9, 28, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import ImportShape11
		rightTrackWheelModels[4].setRotationPoint(0F, 0F, 0F);

		rightTrackWheelModels[5].addShape3D(6.5F, -1F, 16.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 1, 3, 1), new Coord2D(7, 1, 7, 1), new Coord2D(9, 3, 9, 3), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(3, 9, 3, 9), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3) }), 2, 9, 9, 28, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import ImportShape12
		rightTrackWheelModels[5].setRotationPoint(0F, 0F, 0F);

		rightTrackWheelModels[6].addShape3D(13.5F, -1F, 15.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 1, 3, 1), new Coord2D(7, 1, 7, 1), new Coord2D(9, 3, 9, 3), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(3, 9, 3, 9), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3) }), 2, 9, 9, 28, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import ImportShape13
		rightTrackWheelModels[6].setRotationPoint(0F, 0F, 0F);

		rightTrackWheelModels[7].addShape3D(25F, -3F, 16.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 1, 3, 1), new Coord2D(7, 1, 7, 1), new Coord2D(9, 3, 9, 3), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(3, 9, 3, 9), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3) }), 2, 9, 9, 28, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import ImportShape14
		rightTrackWheelModels[7].setRotationPoint(0F, 0F, 0F);


		leftTrackModel = new ModelRendererTurbo[10];
		leftTrackModel[0] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // Import ImportBox23
		leftTrackModel[1] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Import ImportBox31
		leftTrackModel[2] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Import ImportBox32
		leftTrackModel[3] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Import ImportBox33
		leftTrackModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import ImportBox34
		leftTrackModel[5] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Import ImportBox36
		leftTrackModel[6] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import ImportBox37
		leftTrackModel[7] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Import ImportBox38
		leftTrackModel[8] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Import ImportBox40
		leftTrackModel[9] = new ModelRendererTurbo(this, 157, 195, textureX, textureY); // Import ImportBox41

		leftTrackModel[0].addShapeBox(-45F, 19F, -13.5F, 49, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox23
		leftTrackModel[0].setRotationPoint(10F, -11F, 28F);

		leftTrackModel[1].addShapeBox(0F, 9F, -13.5F, 5, 1, 6, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 1.5F, 0F); // Import ImportBox31
		leftTrackModel[1].setRotationPoint(-40F, -11F, 28F);

		leftTrackModel[2].addShapeBox(-45F, 9F, -13.5F, 49, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox32
		leftTrackModel[2].setRotationPoint(10F, -11F, 28F);

		leftTrackModel[3].addShapeBox(0F, 9F, -13.5F, 9, 1, 6, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox33
		leftTrackModel[3].setRotationPoint(14F, -11F, 28F);

		leftTrackModel[4].addShapeBox(0F, 8F, -30.5F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox34
		leftTrackModel[4].setRotationPoint(23F, -11F, 45F);

		leftTrackModel[5].addShapeBox(0F, 9.5F, -13.5F, 1, 4, 6, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import ImportBox36
		leftTrackModel[5].setRotationPoint(25.25F, -9.5F, 28F);

		leftTrackModel[6].addShapeBox(9F, 8F, -13.5F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox37
		leftTrackModel[6].setRotationPoint(14F, -2F, 28F);

		leftTrackModel[7].addShapeBox(0F, 9F, -13.5F, 9, 1, 6, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox38
		leftTrackModel[7].setRotationPoint(14F, -1F, 28F);

		leftTrackModel[8].addShapeBox(0.5F, 10F, -13.5F, 5, 1, 6, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox40
		leftTrackModel[8].setRotationPoint(-40F, -4F, 28F);

		leftTrackModel[9].addShapeBox(0F, 9.5F, -13.5F, 1, 7, 6, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import ImportBox41
		leftTrackModel[9].setRotationPoint(-39.75F, -9.5F, 28F);


		rightTrackModel = new ModelRendererTurbo[10];
		rightTrackModel[0] = new ModelRendererTurbo(this, 289, 201, textureX, textureY); // Import ImportBox18
		rightTrackModel[1] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Import ImportBox19
		rightTrackModel[2] = new ModelRendererTurbo(this, 137, 195, textureX, textureY); // Import ImportBox20
		rightTrackModel[3] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Import ImportBox22
		rightTrackModel[4] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Import ImportBox21
		rightTrackModel[5] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Import ImportBox22
		rightTrackModel[6] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Import ImportBox23
		rightTrackModel[7] = new ModelRendererTurbo(this, 113, 200, textureX, textureY); // Import ImportBox24
		rightTrackModel[8] = new ModelRendererTurbo(this, 62, 211, textureX, textureY); // Import ImportBox25
		rightTrackModel[9] = new ModelRendererTurbo(this, 89, 213, textureX, textureY); // Import ImportBox39

		rightTrackModel[0].addShapeBox(-45F, 9F, -13.5F, 49, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox18
		rightTrackModel[0].setRotationPoint(10F, -11F, -7F);

		rightTrackModel[1].addShapeBox(0F, 9F, -13.5F, 5, 1, 6, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 1.5F, 0F); // Import ImportBox19
		rightTrackModel[1].setRotationPoint(-40F, -11F, -7F);

		rightTrackModel[2].addShapeBox(0F, 9.5F, -13.5F, 1, 7, 6, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import ImportBox20
		rightTrackModel[2].setRotationPoint(-39.75F, -9.5F, -7F);

		rightTrackModel[3].addShapeBox(0.5F, 10F, -13.5F, 5, 1, 6, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox22
		rightTrackModel[3].setRotationPoint(-40F, -4F, -7F);

		rightTrackModel[4].addShapeBox(0F, 9F, -13.5F, 9, 1, 6, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox21
		rightTrackModel[4].setRotationPoint(14F, -11F, -7F);

		rightTrackModel[5].addShapeBox(0F, 9F, -13.5F, 9, 1, 6, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox22
		rightTrackModel[5].setRotationPoint(14F, -1F, -7F);

		rightTrackModel[6].addShapeBox(0F, 8F, -13.5F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox23
		rightTrackModel[6].setRotationPoint(23F, -11F, -7F);

		rightTrackModel[7].addShapeBox(9F, 7F, -13.5F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox24
		rightTrackModel[7].setRotationPoint(14F, -1F, -7F);

		rightTrackModel[8].addShapeBox(0F, 9.5F, -13.5F, 1, 4, 6, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import ImportBox25
		rightTrackModel[8].setRotationPoint(25.25F, -9.5F, -7F);

		rightTrackModel[9].addShapeBox(-45F, 19F, -13.5F, 49, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox39
		rightTrackModel[9].setRotationPoint(10F, -11F, -7F);
		
		turretModel = new ModelRendererTurbo[24];
		turretModel[0] = new ModelRendererTurbo(this, 11, 507, textureX, textureY); // Box 4
		turretModel[1] = new ModelRendererTurbo(this, 11, 507, textureX, textureY); // Box 5
		turretModel[2] = new ModelRendererTurbo(this, 20, 500, textureX, textureY); // Box 24
		turretModel[3] = new ModelRendererTurbo(this, 20, 500, textureX, textureY); // Box 25
		turretModel[4] = new ModelRendererTurbo(this, 9, 480, textureX, textureY); // Ammo 1
		turretModel[5] = new ModelRendererTurbo(this, 0, 484, textureX, textureY); // Ammo 2
		turretModel[6] = new ModelRendererTurbo(this, 0, 489, textureX, textureY); // Barrel 1
		turretModel[7] = new ModelRendererTurbo(this, 0, 492, textureX, textureY); // Barrel 2
		turretModel[8] = new ModelRendererTurbo(this, 5, 489, textureX, textureY); // Barrel 3
		turretModel[9] = new ModelRendererTurbo(this, 0, 495, textureX, textureY); // Barrel 4
		turretModel[10] = new ModelRendererTurbo(this, 5, 492, textureX, textureY); // Barrel 5
		turretModel[11] = new ModelRendererTurbo(this, 5, 495, textureX, textureY); // Barrel 6
		turretModel[12] = new ModelRendererTurbo(this, 0, 498, textureX, textureY); // Barrel 7
		turretModel[13] = new ModelRendererTurbo(this, 0, 501, textureX, textureY); // Body 1
		turretModel[14] = new ModelRendererTurbo(this, 0, 504, textureX, textureY); // Body 2
		turretModel[15] = new ModelRendererTurbo(this, 0, 507, textureX, textureY); // Body 3
		turretModel[16] = new ModelRendererTurbo(this, 12, 492, textureX, textureY); // Griff 1
		turretModel[17] = new ModelRendererTurbo(this, 19, 492, textureX, textureY); // Griff 2
		turretModel[18] = new ModelRendererTurbo(this, 19, 501, textureX, textureY); // Griff 3
		turretModel[19] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Mun 1
		turretModel[20] = new ModelRendererTurbo(this, 5, 480, textureX, textureY); // Mun 2
		turretModel[21] = new ModelRendererTurbo(this, 22, 480, textureX, textureY); // Schulter 1
		turretModel[22] = new ModelRendererTurbo(this, 22, 483, textureX, textureY); // Schulter 2
		turretModel[23] = new ModelRendererTurbo(this, 22, 486, textureX, textureY); // Schulter 3

		turretModel[0].addShapeBox(0.5F, 1F, 0F, 1, 2, 1, 0F,0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.5F, 0.75F, 0F, 0.5F, 0.75F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 4

		turretModel[1].addShapeBox(0.5F, 1F, -1F, 1, 2, 1, 0F,0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 5

		turretModel[2].addShapeBox(0F, -4F, 1F, 1, 7, 5, 0F,1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -5.5F, -1.5F, 2F, 5.5F, -1.5F, 2F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 2F, 3F, 0F, 2F); // Box 24

		turretModel[3].addShapeBox(0F, -4F, -6F, 1, 7, 5, 0F,5.5F, -1.5F, 2F, -5.5F, -1.5F, 2F, -1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 3F, 0F, 2F, -3F, 0F, 2F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 25

		//Gun Origin
		for (int i = 0; i < 4; i++)
		{
			turretModel[i].setRotationPoint(2F, -24F, 0F);
		}
		

		turretModel[4].addBox(-3.4F, -0.2F, 0F, 2, 3, 4, 0F); // Ammo 1

		turretModel[5].addShapeBox(-2.9F, -0.8F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Ammo 2

		turretModel[6].addShapeBox(11F, -1F, -0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F); // Barrel 1

		turretModel[7].addShapeBox(10F, -1F, -0.5F, 1, 1, 1, 0F,0F, -0.05F, -0.05F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.05F, -0.05F); // Barrel 2

		turretModel[8].addShapeBox(-1F, -1F, -0.5F, 11, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Barrel 3

		turretModel[9].addShapeBox(8F, -1.9F, -0.5F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.3F); // Barrel 4

		turretModel[10].addShapeBox(0F, -2F, -0.5F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.4F, -1F, -0.3F, -0.4F, -1F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Barrel 5

		turretModel[11].addShapeBox(-1F, -1F, -0.5F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Barrel 6

		turretModel[12].addShapeBox(-1F, -1F, -0.5F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Barrel 7

		turretModel[13].addBox(-9F, -1F, -0.5F, 8, 1, 1, 0F); // Body 1

		turretModel[14].addShapeBox(-9F, -2F, -0.5F, 8, 1, 1, 0F,-5F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body 2

		turretModel[15].addShapeBox(-3.4F, -1.2F, -0.3F, 2, 1, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Body 3

		turretModel[16].addShapeBox(-5.5F, 0F, -0.5F, 2, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Griff 1

		turretModel[17].addShapeBox(-5.5F, 0F, -0.5F, 2, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Griff 2

		turretModel[18].addShapeBox(-5.5F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1F, -0.8F, -0.2F, -1F, -0.5F, -0.2F, -1F, -0.5F, -0.2F, 01F, -0.8F, -0.2F); // Griff 3

		turretModel[19].addShapeBox(-4.2F, -1F, -1.2F, 1, 1, 1, 0F,-0.4F, -0.25F, 0F, -0.1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Mun 1

		turretModel[20].addShapeBox(-4F, -1.5F, -1.3F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Mun 2

		turretModel[21].addShapeBox(-12F, -2F, -0.5F, 2, 1, 1, 0F,0.5F, -0.5F, -0.25F, -2F, -0.5F, -0.2F, -2F, -0.5F, -0.2F, 0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.08F, 0F, 0F, -0.08F, 0F, 0F, -0.25F); // Schulter 1

		turretModel[22].addShapeBox(-12F, -1F, -0.5F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Schulter 2

		turretModel[23].addShapeBox(-12F, 0F, -0.5F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.3F, -0.9F, 0F, -0.3F, -0.9F, 0F, 0F, 0F, -0.25F); // Schulter 3

		//Gun Origin
		for (int i = 4; i < 24; i++)
		{
			turretModel[i].setRotationPoint(2F, -24F, 0F);
		}
		
		int y = 370;
		
		driver = new ModelRendererTurbo[91];
		driver[0] = new ModelRendererTurbo(this, 3000, 3+y, textureX, textureY); // Import Import702
		driver[1] = new ModelRendererTurbo(this, 3057, 1+y, textureX, textureY); // Import Import704
		driver[2] = new ModelRendererTurbo(this, 3000, 3+y, textureX, textureY); // Import ImportBox15
		driver[3] = new ModelRendererTurbo(this, 3000, 4+y, textureX, textureY); // Import ImportBox16
		driver[4] = new ModelRendererTurbo(this, 3079, 1+y, textureX, textureY); // Import ImportBox17
		driver[5] = new ModelRendererTurbo(this, 3000, 16+y, textureX, textureY); // Import ImportBox18
		driver[6] = new ModelRendererTurbo(this, 3000, 0+y, textureX, textureY); // Import ImportBox19
		driver[7] = new ModelRendererTurbo(this, 3000, 16+y, textureX, textureY); // Import ImportBox20
		driver[8] = new ModelRendererTurbo(this, 3000, -16+y, textureX, textureY); // Import ImportBox8
		driver[9] = new ModelRendererTurbo(this, 3542, 30+y, textureX, textureY); // Import ImportBox9
		driver[10] = new ModelRendererTurbo(this, 3350, 30+y, textureX, textureY); // Import ImportBox10
		driver[11] = new ModelRendererTurbo(this, 3528, -16+y, textureX, textureY); // Import ImportBox11
		driver[12] = new ModelRendererTurbo(this, 3350, 30+y, textureX, textureY); // Import ImportBox12
		driver[13] = new ModelRendererTurbo(this, 3542, 30+y, textureX, textureY); // Import ImportBox13
		driver[14] = new ModelRendererTurbo(this, 3008, 24+y, textureX, textureY); // Import Box14
		driver[15] = new ModelRendererTurbo(this, 2, 81+y, textureX, textureY); // Import Import
		driver[16] = new ModelRendererTurbo(this, 97, 17+y, textureX, textureY); // Import Import
		driver[17] = new ModelRendererTurbo(this, 49, 25+y, textureX, textureY); // Import Import
		driver[18] = new ModelRendererTurbo(this, 73, 33+y, textureX, textureY); // Import Import
		driver[19] = new ModelRendererTurbo(this, 97, 33+y, textureX, textureY); // Import Import
		driver[20] = new ModelRendererTurbo(this, 1, 73+y, textureX, textureY); // Import Import
		driver[21] = new ModelRendererTurbo(this, 17, 41+y, textureX, textureY); // Import Import
		driver[22] = new ModelRendererTurbo(this, 49, 41+y, textureX, textureY); // Import Import
		driver[23] = new ModelRendererTurbo(this, 81, 49+y, textureX, textureY); // Import Import
		driver[24] = new ModelRendererTurbo(this, 105, 49+y, textureX, textureY); // Import Import
		driver[25] = new ModelRendererTurbo(this, 1, 57+y, textureX, textureY); // Import Import
		driver[26] = new ModelRendererTurbo(this, 25, 57+y, textureX, textureY); // Import Import
		driver[27] = new ModelRendererTurbo(this, 1, 73+y, textureX, textureY); // Import Import
		driver[28] = new ModelRendererTurbo(this, 1, 73+y, textureX, textureY); // Import Import
		driver[29] = new ModelRendererTurbo(this, 1, 73+y, textureX, textureY); // Import Import
		driver[30] = new ModelRendererTurbo(this, 1, 0+y, textureX, textureY); // Import Import
		driver[31] = new ModelRendererTurbo(this, 1, 73+y, textureX, textureY); // Import Box36
		driver[32] = new ModelRendererTurbo(this, 12, 73+y, textureX, textureY); // Import Box37
		driver[33] = new ModelRendererTurbo(this, 1, 73+y, textureX, textureY); // Import Box33
		driver[34] = new ModelRendererTurbo(this, 1, 73+y, textureX, textureY); // Import Box35
		driver[35] = new ModelRendererTurbo(this, 1, 73+y, textureX, textureY); // Import Box36
		driver[36] = new ModelRendererTurbo(this, 64, 900+y, textureX, textureY); // Import Box39
		driver[37] = new ModelRendererTurbo(this, 60, 73+y, textureX, textureY); // Import Box41
		driver[38] = new ModelRendererTurbo(this, 60, 73+y, textureX, textureY); // Import Box43
		driver[39] = new ModelRendererTurbo(this, 58, 56+y, textureX, textureY); // Import Box44
		driver[40] = new ModelRendererTurbo(this, 60, 63+y, textureX, textureY); // Import Box46
		driver[41] = new ModelRendererTurbo(this, 1240, 350+y, textureX, textureY); // Import Box52
		driver[42] = new ModelRendererTurbo(this, 60, 63+y, textureX, textureY); // Import Box53
		driver[43] = new ModelRendererTurbo(this, 25, 67+y, textureX, textureY); // Import Box50
		driver[44] = new ModelRendererTurbo(this, 25, 67+y, textureX, textureY); // Import Box51
		driver[45] = new ModelRendererTurbo(this, 25, 67+y, textureX, textureY); // Import Box52
		driver[46] = new ModelRendererTurbo(this, 58, 56+y, textureX, textureY); // Import Box55
		driver[47] = new ModelRendererTurbo(this, 64, 600+y, textureX, textureY); // Import Box52
		driver[48] = new ModelRendererTurbo(this, 280, 520+y, textureX, textureY); // Import Box53
		driver[49] = new ModelRendererTurbo(this, 280, 520+y, textureX, textureY); // Import Box52
		driver[50] = new ModelRendererTurbo(this, 135, 0+y, textureX, textureY); // Import Box52
		driver[51] = new ModelRendererTurbo(this, 135, 0+y, textureX, textureY); // Import Box53
		driver[52] = new ModelRendererTurbo(this, 135, 0+y, textureX, textureY); // Import Box54
		driver[53] = new ModelRendererTurbo(this, 135, 0+y, textureX, textureY); // Import Box55
		driver[54] = new ModelRendererTurbo(this, 135, 0+y, textureX, textureY); // Import Box56
		driver[55] = new ModelRendererTurbo(this, 135, 0+y, textureX, textureY); // Import Box57
		driver[56] = new ModelRendererTurbo(this, 135, 0+y, textureX, textureY); // Import Box58
		driver[57] = new ModelRendererTurbo(this, 135, 0+y, textureX, textureY); // Import Box59
		driver[58] = new ModelRendererTurbo(this, 135, 0+y, textureX, textureY); // Import Box60
		driver[59] = new ModelRendererTurbo(this, 75, 24+y, textureX, textureY); // Import Box61
		driver[60] = new ModelRendererTurbo(this, 58, 56+y, textureX, textureY); // Import Box62
		driver[61] = new ModelRendererTurbo(this, 60, 63+y, textureX, textureY); // Import Box65
		driver[62] = new ModelRendererTurbo(this, 60, 73+y, textureX, textureY); // Import Box66
		driver[63] = new ModelRendererTurbo(this, 58, 56+y, textureX, textureY); // Import Box67
		driver[64] = new ModelRendererTurbo(this, 60, 73+y, textureX, textureY); // Import Box68
		driver[65] = new ModelRendererTurbo(this, 60, 63+y, textureX, textureY); // Import Box69
		driver[66] = new ModelRendererTurbo(this, 12, 73+y, textureX, textureY); // Import Box70
		driver[67] = new ModelRendererTurbo(this, 12, 73+y, textureX, textureY); // Import Box71
		driver[68] = new ModelRendererTurbo(this, 12, 73+y, textureX, textureY); // Import Box72
		driver[69] = new ModelRendererTurbo(this, 25, 57+y, textureX, textureY); // Import Box64
		driver[70] = new ModelRendererTurbo(this, 25, 57+y, textureX, textureY); // Import Box65
		driver[71] = new ModelRendererTurbo(this, 1220, 70+y, textureX, textureY); // Import Import
		driver[72] = new ModelRendererTurbo(this, 900, 30+y, textureX, textureY); // Import Import
		driver[73] = new ModelRendererTurbo(this, 49, 1+y, textureX, textureY); // Import Import
		driver[74] = new ModelRendererTurbo(this, 300, 420+y, textureX, textureY); // Import Box57
		driver[75] = new ModelRendererTurbo(this, 2150, 420+y, textureX, textureY); // Import Box52
		driver[76] = new ModelRendererTurbo(this, 49, 1+y, textureX, textureY); // Import Import
		driver[77] = new ModelRendererTurbo(this, 400, 170+y, textureX, textureY); // Import Import
		driver[78] = new ModelRendererTurbo(this, 650, 30+y, textureX, textureY); // Import Import
		driver[79] = new ModelRendererTurbo(this, 264, 48+y, textureX, textureY); // Import Import
		driver[80] = new ModelRendererTurbo(this, 288, 54+y, textureX, textureY); // Import Box2
		driver[81] = new ModelRendererTurbo(this, 264, 48+y, textureX, textureY); // Import Import
		driver[82] = new ModelRendererTurbo(this, 288, 54+y, textureX, textureY); // Import Import
		driver[83] = new ModelRendererTurbo(this, 264, 8+y, textureX, textureY); // Box 0
		driver[84] = new ModelRendererTurbo(this, 304, 24+y, textureX, textureY); // Box 1
		driver[85] = new ModelRendererTurbo(this, 304, 24+y, textureX, textureY); // Box 2
		driver[86] = new ModelRendererTurbo(this, 264, 24+y, textureX, textureY); // Box 3
		driver[87] = new ModelRendererTurbo(this, 264, 24+y, textureX, textureY); // Box 4
		driver[88] = new ModelRendererTurbo(this, 280, 24+y, textureX, textureY); // Box 5
		driver[89] = new ModelRendererTurbo(this, 312, 57+y, textureX, textureY); // Box 6
		driver[90] = new ModelRendererTurbo(this, 312, 57+y, textureX, textureY); // Box 7

		driver[0].addShapeBox(-4.5F, -8F, -4.5F, 9, 2, 9, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Import702

		driver[1].addShapeBox(-4.5F, -5F, -4.5F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 1.3F, 0.35F, 0F, 1.3F, 0.35F, 0F, 0F, 0.35F, 0F, 0F); // Import Import704

		driver[2].addShapeBox(-4.5F, -9F, -4.5F, 9, 1, 9, 0F,-1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import ImportBox15

		driver[3].addBox(-4.5F, -7F, -4.5F, 9, 2, 9, 0F); // Import ImportBox16

		driver[4].addShapeBox(-5.5F, -5F, -3.5F, 11, 3, 9, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox17

		driver[5].addShapeBox(3.5F, -4F, -4.5F, 1, 4, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -2.5F, 0F, 0F, -2.5F); // Import ImportBox18

		driver[6].addShapeBox(-4.5F, 0F, -4F, 9, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F); // Import ImportBox19

		driver[7].addShapeBox(-4.5F, -4F, -4.5F, 1, 4, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, -0.4F, 0F, -2.5F); // Import ImportBox20

		driver[8].addShapeBox(-5.45F, -66F, -59.5F, 1, 256, 256, 0F,-0.9F, -59F, -59F, 0F, -59F, -59F, 0F, -59F, -195F, -0.9F, -59F, -195F, -0.9F, -195F, -59F, 0F, -195F, -59F, 0F, -195F, -195F, -0.9F, -195F, -195F); // Import ImportBox8

		driver[9].addShapeBox(-5.45F, -46.25F, -42F, 1, 80, 80, 0F,-0.9F, -39.7F, -39.7F, 0F, -39.7F, -39.7F, 0F, -39.7F, -39.7F, -0.9F, -39.7F, -39.7F, -0.9F, -39.7F, -39.7F, 0F, -39.7F, -39.7F, 0F, -39.7F, -39.7F, -0.9F, -39.7F, -39.7F); // Import ImportBox9

		driver[10].addShapeBox(-5.2F, -47.65F, -39.5F, 1, 80, 80, 0F,-1.1F, -39.7F, -39.7F, 0.2F, -39.7F, -39.7F, 0.2F, -39.7F, -39.7F, -1.1F, -39.7F, -39.7F, -0.8F, -39.7F, -39.7F, -0.1F, -39.7F, -39.7F, -0.1F, -39.7F, -39.7F, -0.8F, -39.7F, -39.7F); // Import ImportBox10

		driver[11].addShapeBox(3.55F, -66F, -59.5F, 1, 256, 256, 0F,-0.9F, -59F, -59F, 0F, -59F, -59F, 0F, -59F, -195F, -0.9F, -59F, -195F, -0.9F, -195F, -59F, 0F, -195F, -59F, 0F, -195F, -195F, -0.9F, -195F, -195F); // Import ImportBox11

		driver[12].addShapeBox(3.2F, -47.65F, -39.5F, 1, 80, 80, 0F,-0.9F, -39.7F, -39.7F, -0.2F, -39.7F, -39.7F, -0.2F, -39.7F, -39.7F, -0.9F, -39.7F, -39.7F, -1.2F, -39.7F, -39.7F, 0.1F, -39.7F, -39.7F, 0.1F, -39.7F, -39.7F, -1.2F, -39.7F, -39.7F); // Import ImportBox12

		driver[13].addShapeBox(3.45F, -46.25F, -42F, 1, 80, 80, 0F,-1.1F, -39.7F, -39.7F, 0F, -39.7F, -39.7F, 0F, -39.7F, -39.7F, -1.1F, -39.7F, -39.7F, -1.1F, -39.7F, -39.7F, 0F, -39.7F, -39.7F, 0F, -39.7F, -39.7F, -1.1F, -39.7F, -39.7F); // Import ImportBox13

		driver[14].addShapeBox(-4F, -7.8F, -4F, 8, 8, 8, 0F,0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, -0.19F, 0.01F, 0.01F, -0.19F, 0.01F, 0.01F, -0.19F, 0.01F, 0.01F, -0.19F, 0.01F); // Import Box14

		driver[15].addShapeBox(-4.5F, 7.3F, -2.2F, 16, 8, 5, 0F,0.1F, 0.0F, 0.1F, -6.9F, 0.0F, 0.1F, -6.9F, 0.0F, -0.51F, 0.1F, 0.0F, -0.5F, 0.1F, -6.7F, 0.1F, -6.9F, -6.7F, 0.1F, -6.9F, -6.7F, -0.5F, 0.1F, -6.7F, -0.5F); // Import Import

		driver[16].addShapeBox(-3.3F, 1.3F, -2.4F, 8, 13, 1, 0F,0.0F, 0.0F, 0.1F, -7.0F, 0.0F, 0.1F, -7.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, -6.7F, 0.1F, -7.0F, -6.7F, 0.1F, -7.0F, -6.7F, 0.1F, 0.0F, -6.7F, 0.1F); // Import Import

		driver[17].addShapeBox(-3.3F, 0.3F, -2.4F, 8, 8, 1, 0F,0.0F, 0.0F, 0.1F, -7.0F, 0.0F, 0.1F, -7.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, -6.7F, 0.1F, -7.0F, -6.7F, 0.1F, -7.0F, -6.7F, 0.1F, 0.0F, -6.7F, 0.1F); // Import Import

		driver[18].addShapeBox(2.3F, 0.3F, -2.4F, 8, 8, 1, 0F,0.0F, 0.0F, 0.1F, -7.0F, 0.0F, 0.1F, -7.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, -6.7F, 0.1F, -7.0F, -6.7F, 0.1F, -7.0F, -6.7F, 0.1F, 0.0F, -6.7F, 0.1F); // Import Import

		driver[19].addShapeBox(2.3F, 1.3F, -2.4F, 8, 13, 1, 0F,0.0F, 0.0F, 0.1F, -7.0F, 0.0F, 0.1F, -7.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, -6.7F, 0.1F, -7.0F, -6.7F, 0.1F, -7.0F, -6.7F, 0.1F, 0.0F, -6.7F, 0.1F); // Import Import

		driver[20].addShapeBox(-2.5F, 6.5F, -2.6F, 4, 4, 1, 0F,0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import Import

		driver[21].addShapeBox(-3.3F, 0F, -2.2F, 8, 7, 5, 0F,0.0F, 0.2F, 0.3F, -7.0F, 0.2F, 0.3F, -7.0F, 0.2F, -0.6F, 0.0F, 0.2F, -0.6F, 0.0F, -6.7F, 0.3F, -7.0F, -6.7F, 0.3F, -7.0F, -6.7F, -0.6F, 0.0F, -6.7F, -0.6F); // Import Import

		driver[22].addShapeBox(2.3F, 0F, -2.2F, 8, 7, 5, 0F,0.0F, 0.2F, 0.3F, -7.0F, 0.2F, 0.3F, -7.0F, 0.2F, -0.6F, 0.0F, 0.2F, -0.6F, 0.0F, -6.7F, 0.3F, -7.0F, -6.7F, 0.3F, -7.0F, -6.7F, -0.6F, 0.0F, -6.7F, -0.6F); // Import Import

		driver[23].addShapeBox(-3.3F, 0.4F, 1.8F, 8, 10, 1, 0F,0.0F, 0.1F, 0.1F, -7.0F, 0.1F, 0.1F, -7.0F, 0.1F, -0.6F, 0.0F, 0.1F, -0.6F, -3.0F, -6.0F, 0.1F, -5.0F, -7.7F, 0.1F, -5.0F, -7.7F, -0.6F, -3.0F, -6.0F, -0.6F); // Import Import

		driver[24].addShapeBox(-4.7F, 0.4F, 1.8F, 8, 10, 1, 0F,-7.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, -0.6F, -7.0F, 0.1F, -0.6F, -5.0F, -7.7F, 0.1F, -3.0F, -6.0F, 0.1F, -3.0F, -6.0F, -0.6F, -5.0F, -7.7F, -0.6F); // Import Import

		driver[25].addShapeBox(-0.5F, 2.7F, 1.8F, 8, 12, 1, 0F,0.1F, 0.0F, 0.1F, -7.0F, 0.0F, 0.1F, -7.0F, 0.0F, -0.51F, 0.1F, 0.0F, -0.5F, 0.1F, -6.7F, 0.1F, -7.0F, -6.7F, 0.1F, -7.0F, -6.7F, -0.5F, 0.1F, -6.7F, -0.5F); // Import Import

		driver[26].addShapeBox(-3F, 7F, 2.5F, 6, 2, 2, 0F,0.0F, 0.4F, 0.2F, 0.0F, -0.8F, 0.2F, 0.0F, -0.8F, 0.2F, 0.0F, 0.4F, 0.2F, 0.5F, -1.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0.5F, -1.2F, 0.2F); // Import Import

		driver[27].addShapeBox(-4.6F, 6.5F, -2.6F, 4, 4, 1, 0F,0.0F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2F, -1.0F, 0.0F, -2F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import Import

		driver[28].addShapeBox(0.6F, 6.5F, -2.6F, 4, 4, 1, 0F,0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import Import

		driver[29].addShapeBox(2.7F, 6.5F, -2.6F, 4, 4, 1, 0F,0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import Import

		driver[30].addShapeBox(-4.5F, 0F, -2F, 16, 36, 4, 0F,0.0F, 0.1F, 0.1F, -7.0F, 0.1F, 0.1F, -7.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, -24F, 0.1F, -7.0F, -24F, 0.1F, -7.0F, -24F, 0.1F, 0.0F, -24F, 0.1F); // Import Import

		driver[31].addShapeBox(0.6F, 6.5F, -2.8F, 4, 2, 1, 0F,0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import Box36

		driver[32].addShapeBox(1.1F, 7.5F, -2.8F, 4, 4, 1, 0F,0.0F, 0.0F, 0.0F, -3F, 0.0F, 0.0F, -3F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, -2F, 0.0F, -3F, -2F, 0.0F, -3F, -2F, 0.0F, 0.0F, -2F, 0.0F); // Import Box37

		driver[33].addShapeBox(-2.5F, 6.5F, -2.8F, 4, 2, 1, 0F,0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import Box33

		driver[34].addShapeBox(2.7F, 6.5F, -2.8F, 4, 2, 1, 0F,0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import Box35

		driver[35].addShapeBox(-4.6F, 6.5F, -2.8F, 4, 2, 1, 0F,0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import Box36

		driver[36].addShapeBox(-0.5F, 0.92F, -2.6F, 480, 240, 6, 0F,-0.5F, 0F, 0F, -478.43F, 1.07F, 0F, -478.43F, 1.07F, -5.5F, -0.5F, 0F, -5.5F, -1.2F, -239.352F, 0F, -477.75F, -240.352F, 0F, -477.75F, -240.352F, -5.5F, -1.2F, -239.352F, -5.5F); // Import Box39

		driver[37].addShapeBox(-3.5F, 3.8F, -2.3F, 8, 8, 1, 0F,0F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -6F, 0F, -5.5F, -6F, 0F, -5.5F, -6F, 0F, 0F, -6F, 0F); // Import Box41

		driver[38].addShapeBox(-4F, 8.8F, -2.3F, 8, 8, 1, 0F,0F, 0.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -5F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, 0F, -5F, 0F); // Import Box43

		driver[39].addShapeBox(-4F, 8.8F, -2.4F, 8, 4, 1, 0F,0F, 0.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, -5F, -3F, 0F, -5F, -3F, 0F, 0F, -3F, 0F); // Import Box44

		driver[40].addShapeBox(-3F, 9.8F, -2.39F, 4, 8, 1, 0F,0F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -6F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -6F, 0F); // Import Box46

		driver[41].addShapeBox(-3.5F, 1.6F, -2.2F, 800, 800, 10, 0F,0F, -0.25F, 0F, -797.5F, -0.25F, 0F, -797.5F, -0.25F, -9F, 0F, -0.25F, -9F, 0F, -798.5F, 0F, -797.5F, -798.5F, 0F, -797.5F, -798.5F, -9F, 0F, -798.5F, -9F); // Import Box52

		driver[42].addShapeBox(-2.8F, 4.8F, -2.39F, 4, 8, 1, 0F,0F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -7F, 0F, -3F, -7F, 0F, -3F, -7F, 0F, 0F, -7F, 0F); // Import Box53

		driver[43].addShapeBox(-2.3F, 0.05F, -1.69F, 8, 7, 4, 0F,0.2F, 0.2F, 0.4F, -6.75F, 0.2F, 0.4F, -6.75F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, -6.7F, 0.4F, -6.75F, -6.7F, 0.4F, -6.75F, -6.7F, -0.3F, 0.2F, -6.7F, -0.3F); // Import Box50

		driver[44].addShapeBox(1.25F, 0.05F, -1.69F, 8, 7, 4, 0F,0.2F, 0.2F, 0.4F, -6.75F, 0.2F, 0.4F, -6.75F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, -6.7F, 0.4F, -6.75F, -6.7F, 0.4F, -6.75F, -6.7F, -0.3F, 0.2F, -6.7F, -0.3F); // Import Box51

		driver[45].addShapeBox(-2.1F, 0.05F, 1.5F, 11, 7, 1, 0F,0.2F, 0.2F, 0.3F, -6.6F, 0.2F, 0.3F, -6.6F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, -6.7F, 0.3F, -6.6F, -6.7F, 0.3F, -6.6F, -6.7F, -0.3F, 0.2F, -6.7F, -0.3F); // Import Box52

		driver[46].addShapeBox(-3.5F, 3.8F, -2.4F, 8, 4, 1, 0F,0F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3.5F, 0F, -5.5F, -3.5F, 0F, -5.5F, -3.5F, 0F, 0F, -3.5F, 0F); // Import Box55

		driver[47].addShapeBox(-11.5F, 0.92F, -2.6F, 480, 240, 6, 0F,-10.43F, 1.07F, 0F, -468.5F, 0F, 0F, -468.5F, 0F, -5.5F, -10.43F, 1.07F, -5.5F, -9.75F, -240.352F, 0F, -469.2F, -239.3F, 0F, -469.2F, -239.3F, -5.5F, -9.75F, -240.352F, -5.5F); // Import Box52

		driver[48].addShapeBox(-2.44F, -0.13F, -2.6F, 40, 40, 1, 0F,0F, 0F, 0F, -38.65F, 0F, 0F, -38.65F, 0F, 0F, 0F, 0F, 0F, -0.5F, -39.5F, 0F, -39.3F, -39.3F, 0F, -39.3F, -39.3F, 0F, -0.5F, -39.5F, 0F); // Import Box53

		driver[49].addShapeBox(1.06F, -0.13F, -2.6F, 40, 40, 1, 0F,-1.35F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, 0F, -1.35F, 0F, 0F, -0.7F, -39.3F, 0F, -39.5F, -39.5F, 0F, -39.5F, -39.5F, 0F, -0.7F, -39.3F, 0F); // Import Box52

		driver[50].addShapeBox(-0.2F, 3.5F, -2.55F, 30, 30, 1, 0F,0F, 0F, -0.4F, -29.5F, 0F, -0.4F, -29.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, 0F, -29.5F, -0.4F); // Import Box52

		driver[51].addShapeBox(-0.2F, 1.5F, -2.55F, 30, 30, 1, 0F,0F, 0F, -0.4F, -29.5F, 0F, -0.4F, -29.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, 0F, -29.5F, -0.4F); // Import Box53

		driver[52].addShapeBox(-0.2F, 5.5F, -2.55F, 30, 30, 1, 0F,0F, 0F, -0.4F, -29.5F, 0F, -0.4F, -29.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, 0F, -29.5F, -0.4F); // Import Box54

		driver[53].addShapeBox(-0.2F, 9F, -2.55F, 30, 30, 1, 0F,0F, 0F, -0.4F, -29.5F, 0F, -0.4F, -29.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, 0F, -29.5F, -0.4F); // Import Box55

		driver[54].addShapeBox(-0.2F, 11F, -2.55F, 30, 30, 1, 0F,0F, 0F, -0.4F, -29.5F, 0F, -0.4F, -29.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, 0F, -29.5F, -0.4F); // Import Box56

		driver[55].addShapeBox(-2.8F, 9.3F, -2.85F, 30, 30, 1, 0F,0F, 0F, -0.4F, -29.5F, 0F, -0.4F, -29.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, 0F, -29.5F, -0.4F); // Import Box57

		driver[56].addShapeBox(2.2F, 9.3F, -2.85F, 30, 30, 1, 0F,0F, 0F, -0.4F, -29.5F, 0F, -0.4F, -29.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, 0F, -29.5F, -0.4F); // Import Box58

		driver[57].addShapeBox(-2.45F, 4F, -2.85F, 30, 30, 1, 0F,0F, 0F, -0.4F, -29.65F, 0F, -0.4F, -29.65F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -29.65F, -0.4F, -29.65F, -29.65F, -0.4F, -29.65F, -29.65F, -0.4F, 0F, -29.65F, -0.4F); // Import Box59

		driver[58].addShapeBox(2.1F, 4F, -2.85F, 30, 30, 1, 0F,0F, 0F, -0.4F, -29.65F, 0F, -0.4F, -29.65F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -29.65F, -0.4F, -29.65F, -29.65F, -0.4F, -29.65F, -29.65F, -0.4F, 0F, -29.65F, -0.4F); // Import Box60

		driver[59].addShapeBox(-0.75F, 4.2F, -2.51F, 6, 6, 1, 0F,-0.3F, -0.1F, -0.4F, -5.45F, 0.3F, -0.4F, -5.45F, 0.3F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -5.3F, -0.4F, -5F, -6.3F, -0.4F, -5F, -6.3F, -0.4F, -0.3F, -5.3F, -0.4F); // Import Box61

		driver[60].addShapeBox(1F, 3.8F, -2.4F, 8, 4, 1, 0F,0F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3.5F, 0F, -5.5F, -3.5F, 0F, -5.5F, -3.5F, 0F, 0F, -3.5F, 0F); // Import Box62

		driver[61].addShapeBox(1.8F, 4.8F, -2.39F, 4, 8, 1, 0F,0F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -7F, 0F, -3F, -7F, 0F, -3F, -7F, 0F, 0F, -7F, 0F); // Import Box65

		driver[62].addShapeBox(1F, 3.8F, -2.3F, 8, 8, 1, 0F,0F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -6F, 0F, -5.5F, -6F, 0F, -5.5F, -6F, 0F, 0F, -6F, 0F); // Import Box66

		driver[63].addShapeBox(1F, 8.8F, -2.4F, 8, 4, 1, 0F,0F, 0.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, -5F, -3F, 0F, -5F, -3F, 0F, 0F, -3F, 0F); // Import Box67

		driver[64].addShapeBox(1F, 8.8F, -2.3F, 8, 8, 1, 0F,0F, 0.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -5F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, 0F, -5F, 0F); // Import Box68

		driver[65].addShapeBox(2F, 9.8F, -2.39F, 4, 8, 1, 0F,0F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -6F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -6F, 0F); // Import Box69

		driver[66].addShapeBox(3.2F, 7.5F, -2.8F, 4, 4, 1, 0F,0.0F, 0.0F, 0.0F, -3F, 0.0F, 0.0F, -3F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, -2F, 0.0F, -3F, -2F, 0.0F, -3F, -2F, 0.0F, 0.0F, -2F, 0.0F); // Import Box70

		driver[67].addShapeBox(-2F, 7.5F, -2.8F, 4, 4, 1, 0F,0.0F, 0.0F, 0.0F, -3F, 0.0F, 0.0F, -3F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, -2F, 0.0F, -3F, -2F, 0.0F, -3F, -2F, 0.0F, 0.0F, -2F, 0.0F); // Import Box71

		driver[68].addShapeBox(-4.1F, 7.5F, -2.8F, 4, 4, 1, 0F,0.0F, 0.0F, 0.0F, -3F, 0.0F, 0.0F, -3F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, -2F, 0.0F, -3F, -2F, 0.0F, -3F, -2F, 0.0F, 0.0F, -2F, 0.0F); // Import Box72

		driver[69].addShapeBox(-3F, 7F, 2.5F, 6, 2, 2, 0F,0.75F, -1.6F, -0.8F, -0.75F, -2.8F, -0.8F, -0.75F, -2.8F, -0.8F, 0.75F, -1.6F, -0.8F, 0.5F, -1.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0.5F, -1.2F, 0.2F); // Import Box64

		driver[70].addShapeBox(-3F, 7F, 2.5F, 6, 2, 2, 0F,0.0F, 0.4F, 0.2F, 0.0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, 0.0F, 0.4F, 0.2F, -0.25F, -3.2F, -0.8F, 0.25F, -1.8F, -0.8F, 0.25F, -1.8F, -0.8F, -0.25F, -3.2F, -0.8F); // Import Box65

		driver[71].addShapeBox(-8F, 7.8F, 0F, 160, 40, 160, 0F, 0.3F, 0.0F, 0.3F, -155.7F, 0.0F, 0.3F, -155.7F, 0.0F, -155.7F, 0.3F, 0.0F, -155.7F, 0.3F, -39F, 0.3F, -155.7F, -39F, 0.3F, -155.7F, -39F, -155.7F, 0.3F, -39F, -155.7F); // Import Import
		driver[71].setRotationPoint(0F, 0F, 0F);
		driver[71].rotateAngleX = -1.04719755F;

		driver[72].addShapeBox(5.2F, -0.4F, 1.5F, 80, 1, 40, 0F, 0.4F, 0.0F, 0.15F, -77.9F, 0.0F, 0.15F, -77.9F, 0.0F, -38.85F, 0.4F, 0.0F, -38.85F, 0.4F, 0.0F, 0.15F, -77.6F, 0.0F, 0.15F, -77.6F, 0.0F, -38.85F, 0.4F, 0.0F, -38.85F); // Import Import
		driver[72].setRotationPoint(0F, 0F, 0F);
		driver[72].rotateAngleX = -1.04719755F;

		driver[73].addShapeBox(-8F, -0.2F, 0F, 8, 15, 4, 0F, 0.2F, 0.0F, 0.15F, -3.8F, 0.0F, 0.15F, -3.8F, 0.0F, 0.15F, 0.2F, 0.0F, 0.15F, 0.2F, -7F, 0.15F, -3.8F, -7F, 0.15F, -3.8F, -7F, 0.15F, 0.2F, -7F, 0.15F); // Import Import
		driver[73].setRotationPoint(0F, 0F, 0F);
		driver[73].rotateAngleX = -1.04719755F;

		driver[74].addShapeBox(7.3F, 3.5F, -16.25F, 10, 800, 800, 0F, 0F, -0.25F, -17.5F, -9F, -0.25F, -17.5F, -9F, -0.25F, -781F, 0F, -0.25F, -781F, 0F, -798.5F, -17.5F, -9F, -798.5F, -17.5F, -9F, -798.5F, -781F, 0F, -798.5F, -781F); // Import Box57
		driver[74].setRotationPoint(0F, 0F, 0F);
		driver[74].rotateAngleX = -1.04719755F;

		driver[75].addShapeBox(-1.7F, 1.6F, -16.75F, 10, 800, 800, 0F, -9F, -0.25F, -17.5F, 0F, -0.25F, -17.5F, 0F, -0.25F, -780F, -9F, -0.25F, -780F, -9F, -798.5F, -17.5F, 0F, -798.5F, -17.5F, 0F, -798.5F, -780F, -9F, -798.5F, -780F); // Import Box52
		driver[75].setRotationPoint(0F, 0F, 0F);
		driver[75].rotateAngleX = -1.04719755F;;

		driver[76].addShapeBox(4F, -0.2F, 0F, 8, 15, 4, 0F, 0.2F, 0.0F, 0.15F, -3.8F, 0.0F, 0.15F, -3.8F, 0.0F, 0.15F, 0.2F, 0.0F, 0.15F, 0.2F, -7.0F, 0.15F, -3.8F, -7.0F, 0.15F, -3.8F, -7.0F, 0.15F, 0.2F, -7.0F, 0.15F); // Import Import
		driver[76].setRotationPoint(0F, 0F, 0F);
		driver[76].rotateAngleX = -1.04719755F;

		driver[77].addShapeBox(4F, 7.8F, 0F, 160, 40, 160, 0F, 0.3F, 0F, 0.3F, -155.7F, 0F, 0.3F, -155.7F, 0F, -155.7F, 0.3F, 0F, -155.7F, 0.3F, -39F, 0.3F, -155.7F, -39F, 0.3F, -155.7F, -39F, -155.7F, 0.3F, -39F, -155.7F); // Import Import
		driver[77].setRotationPoint(0F, 0F, 0F);
		driver[77].rotateAngleX = -1.04719755F;

		driver[78].addShapeBox(-7.2F, -0.4F, 1.5F, 80, 1, 40, 0F, 0.1F, 0.0F, 0.15F, -77.6F, 0.0F, 0.15F, -77.6F, 0.0F, -38.85F, 0.1F, 0.0F, -38.85F, 0.4F, 0.0F, 0.15F, -77.6F, 0.0F, 0.15F, -77.6F, 0.0F, -38.85F, 0.4F, 0.0F, -38.85F); // Import Import
		driver[78].setRotationPoint(0F, 0F, 0F);
		driver[78].rotateAngleX = -1.04719755F;

		driver[79].addShapeBox(-4F, 5F, 8F, 4, 12, 4, 0F, 0F, 0.15F, 0.05F, 0.25F, 0.15F, 0.05F, 0.25F, 0.15F, 0.05F, 0F, 0.15F, 0.05F, 0F, 0.01F, 0.05F, 0.25F, 0.01F, 0.05F, 0.25F, 0.01F, 0.05F, 0F, 0.01F, 0.05F); // Import Import
		driver[79].setRotationPoint(0F, 0F, 0F);
		driver[79].rotateAngleX = -1.22173048F;

		driver[80].addShapeBox(-4F, 11F, 8F, 4, 6, 4, 0F, 0.5F, 0.15F, 0.45F, 0.25F, 0.15F, 0.45F, 0.25F, 0.15F, 0.45F, 0.5F, 0.15F, 0.45F, 0.5F, 0.05F, 0.45F, 0.25F, 0.05F, 0.45F, 0.25F, 0.05F, 0.45F, 0.5F, 0.05F, 0.45F); // Import Box2
		driver[80].setRotationPoint(0F, 0F, 0F);
		driver[80].rotateAngleX = -1.22173048F;

		driver[81].addShapeBox(0F, 5F, 8F, 4, 12, 4, 0F, 0.25F, 0.15F, 0.05F, 0F, 0.15F, 0.05F, 0F, 0.15F, 0.05F, 0.25F, 0.15F, 0.05F, 0.25F, 0.01F, 0.05F, 0F, 0.01F, 0.05F, 0F, 0.01F, 0.05F, 0.25F, 0.01F, 0.05F); // Import Import
		driver[81].setRotationPoint(0F, 0F, 0F);
		driver[81].rotateAngleX = -1.22173048F;

		driver[82].addShapeBox(0F, 11F, 8F, 4, 6, 4, 0F, 0.5F, 0.15F, 0.45F, 0.25F, 0.15F, 0.45F, 0.25F, 0.15F, 0.45F, 0.5F, 0.15F, 0.45F, 0.5F, 0.05F, 0.45F, 0.25F, 0.05F, 0.45F, 0.25F, 0.05F, 0.45F, 0.5F, 0.05F, 0.45F); // Import Import
		driver[82].setRotationPoint(0F, 0F, 0F);
		driver[82].rotateAngleX = -1.22173048F;

		driver[83].addShapeBox(-4F, -8F, -4F, 8, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		driver[83].setRotationPoint(0F, 0F, 0F);

		driver[84].addShapeBox(-8F, 0F, 0F, 4, 12, 4, 0F, 0F, 0.0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		driver[84].setRotationPoint(0F, 0F, 0F);
		driver[84].rotateAngleX = -1.04719755F;

		driver[85].addShapeBox(4F, 0F, 0F, 4, 12, 4, 0F, 0F, 0.0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		driver[85].setRotationPoint(0F, 0F, 0F);
		driver[85].rotateAngleX = -1.04719755F;

		driver[86].addShapeBox(-4F, 5F, 8F, 4, 12, 4, 0F, 0F, 0.0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		driver[86].setRotationPoint(0F, 0F, 0F);
		driver[86].rotateAngleX = -1.22173048F;

		driver[87].addShapeBox(0F, 5F, 8F, 4, 12, 4, 0F, 0F, 0.0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		driver[87].setRotationPoint(0F, 0F, 0F);
		driver[87].rotateAngleX = -1.22173048F;

		driver[88].addShapeBox(-4F, 0F, -2F, 8, 12, 4, 0F, 0F, 0.0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		driver[88].setRotationPoint(0F, 0F, 0F);

		driver[89].addShapeBox(-8F, 8.8F, 0F, 8, 3, 4, 0F, 0.2F, 0.0F, 0.15F, -3.8F, 0F, 0.15F, -3.8F, 0F, 0.15F, 0.2F, 0F, 0.15F, 0.2F, 0.21F, 0.15F, -3.8F, 0.21F, 0.15F, -3.8F, 0.21F, 0.15F, 0.2F, 0.21F, 0.15F); // Box 6
		driver[89].setRotationPoint(0F, 0F, 0F);
		driver[89].rotateAngleX = -1.04719755F;

		driver[90].addShapeBox(4F, 8.8F, 0F, 8, 3, 4, 0F, 0.2F, 0.0F, 0.15F, -3.8F, 0F, 0.15F, -3.8F, 0F, 0.15F, 0.2F, 0F, 0.15F, 0.2F, 0.21F, 0.15F, -3.8F, 0.21F, 0.15F, -3.8F, 0.21F, 0.15F, 0.2F, 0.21F, 0.15F); // Box 7
		driver[90].setRotationPoint(0F, 0F, 0F);
		driver[90].rotateAngleX = -1.04719755F;
		
		//Gun Origin
		for (int i = 0; i < 91; i++)
		{
			driver[i].setRotationPoint(0F, -12F, 4F);
			driver[i].rotateAngleY = -1.57079633F;
		}

		passenger = new ModelRendererTurbo[91];
		passenger[0] = new ModelRendererTurbo(this, 3000, 3+y, textureX, textureY); // Import Import702
		passenger[1] = new ModelRendererTurbo(this, 3057, 1+y, textureX, textureY); // Import Import704
		passenger[2] = new ModelRendererTurbo(this, 3000, 3+y, textureX, textureY); // Import ImportBox15
		passenger[3] = new ModelRendererTurbo(this, 3000, 4+y, textureX, textureY); // Import ImportBox16
		passenger[4] = new ModelRendererTurbo(this, 3079, 1+y, textureX, textureY); // Import ImportBox17
		passenger[5] = new ModelRendererTurbo(this, 3000, 16+y, textureX, textureY); // Import ImportBox18
		passenger[6] = new ModelRendererTurbo(this, 3000, 0+y, textureX, textureY); // Import ImportBox19
		passenger[7] = new ModelRendererTurbo(this, 3000, 16+y, textureX, textureY); // Import ImportBox20
		passenger[8] = new ModelRendererTurbo(this, 3000, -16+y, textureX, textureY); // Import ImportBox8
		passenger[9] = new ModelRendererTurbo(this, 3542, 30+y, textureX, textureY); // Import ImportBox9
		passenger[10] = new ModelRendererTurbo(this, 3350, 30+y, textureX, textureY); // Import ImportBox10
		passenger[11] = new ModelRendererTurbo(this, 3528, -16+y, textureX, textureY); // Import ImportBox11
		passenger[12] = new ModelRendererTurbo(this, 3350, 30+y, textureX, textureY); // Import ImportBox12
		passenger[13] = new ModelRendererTurbo(this, 3542, 30+y, textureX, textureY); // Import ImportBox13
		passenger[14] = new ModelRendererTurbo(this, 3008, 24+y, textureX, textureY); // Import Box14
		passenger[15] = new ModelRendererTurbo(this, 2, 81+y, textureX, textureY); // Import Import
		passenger[16] = new ModelRendererTurbo(this, 97, 17+y, textureX, textureY); // Import Import
		passenger[17] = new ModelRendererTurbo(this, 49, 25+y, textureX, textureY); // Import Import
		passenger[18] = new ModelRendererTurbo(this, 73, 33+y, textureX, textureY); // Import Import
		passenger[19] = new ModelRendererTurbo(this, 97, 33+y, textureX, textureY); // Import Import
		passenger[20] = new ModelRendererTurbo(this, 1, 73+y, textureX, textureY); // Import Import
		passenger[21] = new ModelRendererTurbo(this, 17, 41+y, textureX, textureY); // Import Import
		passenger[22] = new ModelRendererTurbo(this, 49, 41+y, textureX, textureY); // Import Import
		passenger[23] = new ModelRendererTurbo(this, 81, 49+y, textureX, textureY); // Import Import
		passenger[24] = new ModelRendererTurbo(this, 105, 49+y, textureX, textureY); // Import Import
		passenger[25] = new ModelRendererTurbo(this, 1, 57+y, textureX, textureY); // Import Import
		passenger[26] = new ModelRendererTurbo(this, 25, 57+y, textureX, textureY); // Import Import
		passenger[27] = new ModelRendererTurbo(this, 1, 73+y, textureX, textureY); // Import Import
		passenger[28] = new ModelRendererTurbo(this, 1, 73+y, textureX, textureY); // Import Import
		passenger[29] = new ModelRendererTurbo(this, 1, 73+y, textureX, textureY); // Import Import
		passenger[30] = new ModelRendererTurbo(this, 1, 0+y, textureX, textureY); // Import Import
		passenger[31] = new ModelRendererTurbo(this, 1, 73+y, textureX, textureY); // Import Box36
		passenger[32] = new ModelRendererTurbo(this, 12, 73+y, textureX, textureY); // Import Box37
		passenger[33] = new ModelRendererTurbo(this, 1, 73+y, textureX, textureY); // Import Box33
		passenger[34] = new ModelRendererTurbo(this, 1, 73+y, textureX, textureY); // Import Box35
		passenger[35] = new ModelRendererTurbo(this, 1, 73+y, textureX, textureY); // Import Box36
		passenger[36] = new ModelRendererTurbo(this, 64, 900+y, textureX, textureY); // Import Box39
		passenger[37] = new ModelRendererTurbo(this, 60, 73+y, textureX, textureY); // Import Box41
		passenger[38] = new ModelRendererTurbo(this, 60, 73+y, textureX, textureY); // Import Box43
		passenger[39] = new ModelRendererTurbo(this, 58, 56+y, textureX, textureY); // Import Box44
		passenger[40] = new ModelRendererTurbo(this, 60, 63+y, textureX, textureY); // Import Box46
		passenger[41] = new ModelRendererTurbo(this, 1240, 350+y, textureX, textureY); // Import Box52
		passenger[42] = new ModelRendererTurbo(this, 60, 63+y, textureX, textureY); // Import Box53
		passenger[43] = new ModelRendererTurbo(this, 25, 67+y, textureX, textureY); // Import Box50
		passenger[44] = new ModelRendererTurbo(this, 25, 67+y, textureX, textureY); // Import Box51
		passenger[45] = new ModelRendererTurbo(this, 25, 67+y, textureX, textureY); // Import Box52
		passenger[46] = new ModelRendererTurbo(this, 58, 56+y, textureX, textureY); // Import Box55
		passenger[47] = new ModelRendererTurbo(this, 64, 600+y, textureX, textureY); // Import Box52
		passenger[48] = new ModelRendererTurbo(this, 280, 520+y, textureX, textureY); // Import Box53
		passenger[49] = new ModelRendererTurbo(this, 280, 520+y, textureX, textureY); // Import Box52
		passenger[50] = new ModelRendererTurbo(this, 135, 0+y, textureX, textureY); // Import Box52
		passenger[51] = new ModelRendererTurbo(this, 135, 0+y, textureX, textureY); // Import Box53
		passenger[52] = new ModelRendererTurbo(this, 135, 0+y, textureX, textureY); // Import Box54
		passenger[53] = new ModelRendererTurbo(this, 135, 0+y, textureX, textureY); // Import Box55
		passenger[54] = new ModelRendererTurbo(this, 135, 0+y, textureX, textureY); // Import Box56
		passenger[55] = new ModelRendererTurbo(this, 135, 0+y, textureX, textureY); // Import Box57
		passenger[56] = new ModelRendererTurbo(this, 135, 0+y, textureX, textureY); // Import Box58
		passenger[57] = new ModelRendererTurbo(this, 135, 0+y, textureX, textureY); // Import Box59
		passenger[58] = new ModelRendererTurbo(this, 135, 0+y, textureX, textureY); // Import Box60
		passenger[59] = new ModelRendererTurbo(this, 75, 24+y, textureX, textureY); // Import Box61
		passenger[60] = new ModelRendererTurbo(this, 58, 56+y, textureX, textureY); // Import Box62
		passenger[61] = new ModelRendererTurbo(this, 60, 63+y, textureX, textureY); // Import Box65
		passenger[62] = new ModelRendererTurbo(this, 60, 73+y, textureX, textureY); // Import Box66
		passenger[63] = new ModelRendererTurbo(this, 58, 56+y, textureX, textureY); // Import Box67
		passenger[64] = new ModelRendererTurbo(this, 60, 73+y, textureX, textureY); // Import Box68
		passenger[65] = new ModelRendererTurbo(this, 60, 63+y, textureX, textureY); // Import Box69
		passenger[66] = new ModelRendererTurbo(this, 12, 73+y, textureX, textureY); // Import Box70
		passenger[67] = new ModelRendererTurbo(this, 12, 73+y, textureX, textureY); // Import Box71
		passenger[68] = new ModelRendererTurbo(this, 12, 73+y, textureX, textureY); // Import Box72
		passenger[69] = new ModelRendererTurbo(this, 25, 57+y, textureX, textureY); // Import Box64
		passenger[70] = new ModelRendererTurbo(this, 25, 57+y, textureX, textureY); // Import Box65
		passenger[71] = new ModelRendererTurbo(this, 1220, 70+y, textureX, textureY); // Import Import
		passenger[72] = new ModelRendererTurbo(this, 900, 30+y, textureX, textureY); // Import Import
		passenger[73] = new ModelRendererTurbo(this, 49, 1+y, textureX, textureY); // Import Import
		passenger[74] = new ModelRendererTurbo(this, 300, 420+y, textureX, textureY); // Import Box57
		passenger[75] = new ModelRendererTurbo(this, 2150, 420+y, textureX, textureY); // Import Box52
		passenger[76] = new ModelRendererTurbo(this, 49, 1+y, textureX, textureY); // Import Import
		passenger[77] = new ModelRendererTurbo(this, 400, 170+y, textureX, textureY); // Import Import
		passenger[78] = new ModelRendererTurbo(this, 650, 30+y, textureX, textureY); // Import Import
		passenger[79] = new ModelRendererTurbo(this, 264, 48+y, textureX, textureY); // Import Import
		passenger[80] = new ModelRendererTurbo(this, 288, 54+y, textureX, textureY); // Import Box2
		passenger[81] = new ModelRendererTurbo(this, 264, 48+y, textureX, textureY); // Import Import
		passenger[82] = new ModelRendererTurbo(this, 288, 54+y, textureX, textureY); // Import Import
		passenger[83] = new ModelRendererTurbo(this, 264, 8+y, textureX, textureY); // Box 0
		passenger[84] = new ModelRendererTurbo(this, 304, 24+y, textureX, textureY); // Box 1
		passenger[85] = new ModelRendererTurbo(this, 304, 24+y, textureX, textureY); // Box 2
		passenger[86] = new ModelRendererTurbo(this, 264, 24+y, textureX, textureY); // Box 3
		passenger[87] = new ModelRendererTurbo(this, 264, 24+y, textureX, textureY); // Box 4
		passenger[88] = new ModelRendererTurbo(this, 280, 24+y, textureX, textureY); // Box 5
		passenger[89] = new ModelRendererTurbo(this, 312, 57+y, textureX, textureY); // Box 6
		passenger[90] = new ModelRendererTurbo(this, 312, 57+y, textureX, textureY); // Box 7

		passenger[0].addShapeBox(-4.5F, -8F, -4.5F, 9, 2, 9, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Import702

		passenger[1].addShapeBox(-4.5F, -5F, -4.5F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 1.3F, 0.35F, 0F, 1.3F, 0.35F, 0F, 0F, 0.35F, 0F, 0F); // Import Import704

		passenger[2].addShapeBox(-4.5F, -9F, -4.5F, 9, 1, 9, 0F,-1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import ImportBox15

		passenger[3].addBox(-4.5F, -7F, -4.5F, 9, 2, 9, 0F); // Import ImportBox16

		passenger[4].addShapeBox(-5.5F, -5F, -3.5F, 11, 3, 9, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox17

		passenger[5].addShapeBox(3.5F, -4F, -4.5F, 1, 4, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -2.5F, 0F, 0F, -2.5F); // Import ImportBox18

		passenger[6].addShapeBox(-4.5F, 0F, -4F, 9, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F); // Import ImportBox19

		passenger[7].addShapeBox(-4.5F, -4F, -4.5F, 1, 4, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, -0.4F, 0F, -2.5F); // Import ImportBox20

		passenger[8].addShapeBox(-5.45F, -66F, -59.5F, 1, 256, 256, 0F,-0.9F, -59F, -59F, 0F, -59F, -59F, 0F, -59F, -195F, -0.9F, -59F, -195F, -0.9F, -195F, -59F, 0F, -195F, -59F, 0F, -195F, -195F, -0.9F, -195F, -195F); // Import ImportBox8

		passenger[9].addShapeBox(-5.45F, -46.25F, -42F, 1, 80, 80, 0F,-0.9F, -39.7F, -39.7F, 0F, -39.7F, -39.7F, 0F, -39.7F, -39.7F, -0.9F, -39.7F, -39.7F, -0.9F, -39.7F, -39.7F, 0F, -39.7F, -39.7F, 0F, -39.7F, -39.7F, -0.9F, -39.7F, -39.7F); // Import ImportBox9

		passenger[10].addShapeBox(-5.2F, -47.65F, -39.5F, 1, 80, 80, 0F,-1.1F, -39.7F, -39.7F, 0.2F, -39.7F, -39.7F, 0.2F, -39.7F, -39.7F, -1.1F, -39.7F, -39.7F, -0.8F, -39.7F, -39.7F, -0.1F, -39.7F, -39.7F, -0.1F, -39.7F, -39.7F, -0.8F, -39.7F, -39.7F); // Import ImportBox10

		passenger[11].addShapeBox(3.55F, -66F, -59.5F, 1, 256, 256, 0F,-0.9F, -59F, -59F, 0F, -59F, -59F, 0F, -59F, -195F, -0.9F, -59F, -195F, -0.9F, -195F, -59F, 0F, -195F, -59F, 0F, -195F, -195F, -0.9F, -195F, -195F); // Import ImportBox11

		passenger[12].addShapeBox(3.2F, -47.65F, -39.5F, 1, 80, 80, 0F,-0.9F, -39.7F, -39.7F, -0.2F, -39.7F, -39.7F, -0.2F, -39.7F, -39.7F, -0.9F, -39.7F, -39.7F, -1.2F, -39.7F, -39.7F, 0.1F, -39.7F, -39.7F, 0.1F, -39.7F, -39.7F, -1.2F, -39.7F, -39.7F); // Import ImportBox12

		passenger[13].addShapeBox(3.45F, -46.25F, -42F, 1, 80, 80, 0F,-1.1F, -39.7F, -39.7F, 0F, -39.7F, -39.7F, 0F, -39.7F, -39.7F, -1.1F, -39.7F, -39.7F, -1.1F, -39.7F, -39.7F, 0F, -39.7F, -39.7F, 0F, -39.7F, -39.7F, -1.1F, -39.7F, -39.7F); // Import ImportBox13

		passenger[14].addShapeBox(-4F, -7.8F, -4F, 8, 8, 8, 0F,0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, -0.19F, 0.01F, 0.01F, -0.19F, 0.01F, 0.01F, -0.19F, 0.01F, 0.01F, -0.19F, 0.01F); // Import Box14

		passenger[15].addShapeBox(-4.5F, 7.3F, -2.2F, 16, 8, 5, 0F,0.1F, 0.0F, 0.1F, -6.9F, 0.0F, 0.1F, -6.9F, 0.0F, -0.51F, 0.1F, 0.0F, -0.5F, 0.1F, -6.7F, 0.1F, -6.9F, -6.7F, 0.1F, -6.9F, -6.7F, -0.5F, 0.1F, -6.7F, -0.5F); // Import Import

		passenger[16].addShapeBox(-3.3F, 1.3F, -2.4F, 8, 13, 1, 0F,0.0F, 0.0F, 0.1F, -7.0F, 0.0F, 0.1F, -7.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, -6.7F, 0.1F, -7.0F, -6.7F, 0.1F, -7.0F, -6.7F, 0.1F, 0.0F, -6.7F, 0.1F); // Import Import

		passenger[17].addShapeBox(-3.3F, 0.3F, -2.4F, 8, 8, 1, 0F,0.0F, 0.0F, 0.1F, -7.0F, 0.0F, 0.1F, -7.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, -6.7F, 0.1F, -7.0F, -6.7F, 0.1F, -7.0F, -6.7F, 0.1F, 0.0F, -6.7F, 0.1F); // Import Import

		passenger[18].addShapeBox(2.3F, 0.3F, -2.4F, 8, 8, 1, 0F,0.0F, 0.0F, 0.1F, -7.0F, 0.0F, 0.1F, -7.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, -6.7F, 0.1F, -7.0F, -6.7F, 0.1F, -7.0F, -6.7F, 0.1F, 0.0F, -6.7F, 0.1F); // Import Import

		passenger[19].addShapeBox(2.3F, 1.3F, -2.4F, 8, 13, 1, 0F,0.0F, 0.0F, 0.1F, -7.0F, 0.0F, 0.1F, -7.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, -6.7F, 0.1F, -7.0F, -6.7F, 0.1F, -7.0F, -6.7F, 0.1F, 0.0F, -6.7F, 0.1F); // Import Import

		passenger[20].addShapeBox(-2.5F, 6.5F, -2.6F, 4, 4, 1, 0F,0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import Import

		passenger[21].addShapeBox(-3.3F, 0F, -2.2F, 8, 7, 5, 0F,0.0F, 0.2F, 0.3F, -7.0F, 0.2F, 0.3F, -7.0F, 0.2F, -0.6F, 0.0F, 0.2F, -0.6F, 0.0F, -6.7F, 0.3F, -7.0F, -6.7F, 0.3F, -7.0F, -6.7F, -0.6F, 0.0F, -6.7F, -0.6F); // Import Import

		passenger[22].addShapeBox(2.3F, 0F, -2.2F, 8, 7, 5, 0F,0.0F, 0.2F, 0.3F, -7.0F, 0.2F, 0.3F, -7.0F, 0.2F, -0.6F, 0.0F, 0.2F, -0.6F, 0.0F, -6.7F, 0.3F, -7.0F, -6.7F, 0.3F, -7.0F, -6.7F, -0.6F, 0.0F, -6.7F, -0.6F); // Import Import

		passenger[23].addShapeBox(-3.3F, 0.4F, 1.8F, 8, 10, 1, 0F,0.0F, 0.1F, 0.1F, -7.0F, 0.1F, 0.1F, -7.0F, 0.1F, -0.6F, 0.0F, 0.1F, -0.6F, -3.0F, -6.0F, 0.1F, -5.0F, -7.7F, 0.1F, -5.0F, -7.7F, -0.6F, -3.0F, -6.0F, -0.6F); // Import Import

		passenger[24].addShapeBox(-4.7F, 0.4F, 1.8F, 8, 10, 1, 0F,-7.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, -0.6F, -7.0F, 0.1F, -0.6F, -5.0F, -7.7F, 0.1F, -3.0F, -6.0F, 0.1F, -3.0F, -6.0F, -0.6F, -5.0F, -7.7F, -0.6F); // Import Import

		passenger[25].addShapeBox(-0.5F, 2.7F, 1.8F, 8, 12, 1, 0F,0.1F, 0.0F, 0.1F, -7.0F, 0.0F, 0.1F, -7.0F, 0.0F, -0.51F, 0.1F, 0.0F, -0.5F, 0.1F, -6.7F, 0.1F, -7.0F, -6.7F, 0.1F, -7.0F, -6.7F, -0.5F, 0.1F, -6.7F, -0.5F); // Import Import

		passenger[26].addShapeBox(-3F, 7F, 2.5F, 6, 2, 2, 0F,0.0F, 0.4F, 0.2F, 0.0F, -0.8F, 0.2F, 0.0F, -0.8F, 0.2F, 0.0F, 0.4F, 0.2F, 0.5F, -1.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0.5F, -1.2F, 0.2F); // Import Import

		passenger[27].addShapeBox(-4.6F, 6.5F, -2.6F, 4, 4, 1, 0F,0.0F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2F, -1.0F, 0.0F, -2F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import Import

		passenger[28].addShapeBox(0.6F, 6.5F, -2.6F, 4, 4, 1, 0F,0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import Import

		passenger[29].addShapeBox(2.7F, 6.5F, -2.6F, 4, 4, 1, 0F,0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import Import

		passenger[30].addShapeBox(-4.5F, 0F, -2F, 16, 36, 4, 0F,0.0F, 0.1F, 0.1F, -7.0F, 0.1F, 0.1F, -7.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, -24F, 0.1F, -7.0F, -24F, 0.1F, -7.0F, -24F, 0.1F, 0.0F, -24F, 0.1F); // Import Import

		passenger[31].addShapeBox(0.6F, 6.5F, -2.8F, 4, 2, 1, 0F,0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import Box36

		passenger[32].addShapeBox(1.1F, 7.5F, -2.8F, 4, 4, 1, 0F,0.0F, 0.0F, 0.0F, -3F, 0.0F, 0.0F, -3F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, -2F, 0.0F, -3F, -2F, 0.0F, -3F, -2F, 0.0F, 0.0F, -2F, 0.0F); // Import Box37

		passenger[33].addShapeBox(-2.5F, 6.5F, -2.8F, 4, 2, 1, 0F,0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import Box33

		passenger[34].addShapeBox(2.7F, 6.5F, -2.8F, 4, 2, 1, 0F,0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import Box35

		passenger[35].addShapeBox(-4.6F, 6.5F, -2.8F, 4, 2, 1, 0F,0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import Box36

		passenger[36].addShapeBox(-0.5F, 0.92F, -2.6F, 480, 240, 6, 0F,-0.5F, 0F, 0F, -478.43F, 1.07F, 0F, -478.43F, 1.07F, -5.5F, -0.5F, 0F, -5.5F, -1.2F, -239.352F, 0F, -477.75F, -240.352F, 0F, -477.75F, -240.352F, -5.5F, -1.2F, -239.352F, -5.5F); // Import Box39

		passenger[37].addShapeBox(-3.5F, 3.8F, -2.3F, 8, 8, 1, 0F,0F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -6F, 0F, -5.5F, -6F, 0F, -5.5F, -6F, 0F, 0F, -6F, 0F); // Import Box41

		passenger[38].addShapeBox(-4F, 8.8F, -2.3F, 8, 8, 1, 0F,0F, 0.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -5F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, 0F, -5F, 0F); // Import Box43

		passenger[39].addShapeBox(-4F, 8.8F, -2.4F, 8, 4, 1, 0F,0F, 0.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, -5F, -3F, 0F, -5F, -3F, 0F, 0F, -3F, 0F); // Import Box44

		passenger[40].addShapeBox(-3F, 9.8F, -2.39F, 4, 8, 1, 0F,0F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -6F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -6F, 0F); // Import Box46

		passenger[41].addShapeBox(-3.5F, 1.6F, -2.2F, 800, 800, 10, 0F,0F, -0.25F, 0F, -797.5F, -0.25F, 0F, -797.5F, -0.25F, -9F, 0F, -0.25F, -9F, 0F, -798.5F, 0F, -797.5F, -798.5F, 0F, -797.5F, -798.5F, -9F, 0F, -798.5F, -9F); // Import Box52

		passenger[42].addShapeBox(-2.8F, 4.8F, -2.39F, 4, 8, 1, 0F,0F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -7F, 0F, -3F, -7F, 0F, -3F, -7F, 0F, 0F, -7F, 0F); // Import Box53

		passenger[43].addShapeBox(-2.3F, 0.05F, -1.69F, 8, 7, 4, 0F,0.2F, 0.2F, 0.4F, -6.75F, 0.2F, 0.4F, -6.75F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, -6.7F, 0.4F, -6.75F, -6.7F, 0.4F, -6.75F, -6.7F, -0.3F, 0.2F, -6.7F, -0.3F); // Import Box50

		passenger[44].addShapeBox(1.25F, 0.05F, -1.69F, 8, 7, 4, 0F,0.2F, 0.2F, 0.4F, -6.75F, 0.2F, 0.4F, -6.75F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, -6.7F, 0.4F, -6.75F, -6.7F, 0.4F, -6.75F, -6.7F, -0.3F, 0.2F, -6.7F, -0.3F); // Import Box51

		passenger[45].addShapeBox(-2.1F, 0.05F, 1.5F, 11, 7, 1, 0F,0.2F, 0.2F, 0.3F, -6.6F, 0.2F, 0.3F, -6.6F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, -6.7F, 0.3F, -6.6F, -6.7F, 0.3F, -6.6F, -6.7F, -0.3F, 0.2F, -6.7F, -0.3F); // Import Box52

		passenger[46].addShapeBox(-3.5F, 3.8F, -2.4F, 8, 4, 1, 0F,0F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3.5F, 0F, -5.5F, -3.5F, 0F, -5.5F, -3.5F, 0F, 0F, -3.5F, 0F); // Import Box55

		passenger[47].addShapeBox(-11.5F, 0.92F, -2.6F, 480, 240, 6, 0F,-10.43F, 1.07F, 0F, -468.5F, 0F, 0F, -468.5F, 0F, -5.5F, -10.43F, 1.07F, -5.5F, -9.75F, -240.352F, 0F, -469.2F, -239.3F, 0F, -469.2F, -239.3F, -5.5F, -9.75F, -240.352F, -5.5F); // Import Box52

		passenger[48].addShapeBox(-2.44F, -0.13F, -2.6F, 40, 40, 1, 0F,0F, 0F, 0F, -38.65F, 0F, 0F, -38.65F, 0F, 0F, 0F, 0F, 0F, -0.5F, -39.5F, 0F, -39.3F, -39.3F, 0F, -39.3F, -39.3F, 0F, -0.5F, -39.5F, 0F); // Import Box53

		passenger[49].addShapeBox(1.06F, -0.13F, -2.6F, 40, 40, 1, 0F,-1.35F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, 0F, -1.35F, 0F, 0F, -0.7F, -39.3F, 0F, -39.5F, -39.5F, 0F, -39.5F, -39.5F, 0F, -0.7F, -39.3F, 0F); // Import Box52

		passenger[50].addShapeBox(-0.2F, 3.5F, -2.55F, 30, 30, 1, 0F,0F, 0F, -0.4F, -29.5F, 0F, -0.4F, -29.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, 0F, -29.5F, -0.4F); // Import Box52

		passenger[51].addShapeBox(-0.2F, 1.5F, -2.55F, 30, 30, 1, 0F,0F, 0F, -0.4F, -29.5F, 0F, -0.4F, -29.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, 0F, -29.5F, -0.4F); // Import Box53

		passenger[52].addShapeBox(-0.2F, 5.5F, -2.55F, 30, 30, 1, 0F,0F, 0F, -0.4F, -29.5F, 0F, -0.4F, -29.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, 0F, -29.5F, -0.4F); // Import Box54

		passenger[53].addShapeBox(-0.2F, 9F, -2.55F, 30, 30, 1, 0F,0F, 0F, -0.4F, -29.5F, 0F, -0.4F, -29.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, 0F, -29.5F, -0.4F); // Import Box55

		passenger[54].addShapeBox(-0.2F, 11F, -2.55F, 30, 30, 1, 0F,0F, 0F, -0.4F, -29.5F, 0F, -0.4F, -29.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, 0F, -29.5F, -0.4F); // Import Box56

		passenger[55].addShapeBox(-2.8F, 9.3F, -2.85F, 30, 30, 1, 0F,0F, 0F, -0.4F, -29.5F, 0F, -0.4F, -29.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, 0F, -29.5F, -0.4F); // Import Box57

		passenger[56].addShapeBox(2.2F, 9.3F, -2.85F, 30, 30, 1, 0F,0F, 0F, -0.4F, -29.5F, 0F, -0.4F, -29.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, 0F, -29.5F, -0.4F); // Import Box58

		passenger[57].addShapeBox(-2.45F, 4F, -2.85F, 30, 30, 1, 0F,0F, 0F, -0.4F, -29.65F, 0F, -0.4F, -29.65F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -29.65F, -0.4F, -29.65F, -29.65F, -0.4F, -29.65F, -29.65F, -0.4F, 0F, -29.65F, -0.4F); // Import Box59

		passenger[58].addShapeBox(2.1F, 4F, -2.85F, 30, 30, 1, 0F,0F, 0F, -0.4F, -29.65F, 0F, -0.4F, -29.65F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -29.65F, -0.4F, -29.65F, -29.65F, -0.4F, -29.65F, -29.65F, -0.4F, 0F, -29.65F, -0.4F); // Import Box60

		passenger[59].addShapeBox(-0.75F, 4.2F, -2.51F, 6, 6, 1, 0F,-0.3F, -0.1F, -0.4F, -5.45F, 0.3F, -0.4F, -5.45F, 0.3F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -5.3F, -0.4F, -5F, -6.3F, -0.4F, -5F, -6.3F, -0.4F, -0.3F, -5.3F, -0.4F); // Import Box61

		passenger[60].addShapeBox(1F, 3.8F, -2.4F, 8, 4, 1, 0F,0F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3.5F, 0F, -5.5F, -3.5F, 0F, -5.5F, -3.5F, 0F, 0F, -3.5F, 0F); // Import Box62

		passenger[61].addShapeBox(1.8F, 4.8F, -2.39F, 4, 8, 1, 0F,0F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -7F, 0F, -3F, -7F, 0F, -3F, -7F, 0F, 0F, -7F, 0F); // Import Box65

		passenger[62].addShapeBox(1F, 3.8F, -2.3F, 8, 8, 1, 0F,0F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -6F, 0F, -5.5F, -6F, 0F, -5.5F, -6F, 0F, 0F, -6F, 0F); // Import Box66

		passenger[63].addShapeBox(1F, 8.8F, -2.4F, 8, 4, 1, 0F,0F, 0.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, -5F, -3F, 0F, -5F, -3F, 0F, 0F, -3F, 0F); // Import Box67

		passenger[64].addShapeBox(1F, 8.8F, -2.3F, 8, 8, 1, 0F,0F, 0.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -5F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, 0F, -5F, 0F); // Import Box68

		passenger[65].addShapeBox(2F, 9.8F, -2.39F, 4, 8, 1, 0F,0F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -6F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -6F, 0F); // Import Box69

		passenger[66].addShapeBox(3.2F, 7.5F, -2.8F, 4, 4, 1, 0F,0.0F, 0.0F, 0.0F, -3F, 0.0F, 0.0F, -3F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, -2F, 0.0F, -3F, -2F, 0.0F, -3F, -2F, 0.0F, 0.0F, -2F, 0.0F); // Import Box70

		passenger[67].addShapeBox(-2F, 7.5F, -2.8F, 4, 4, 1, 0F,0.0F, 0.0F, 0.0F, -3F, 0.0F, 0.0F, -3F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, -2F, 0.0F, -3F, -2F, 0.0F, -3F, -2F, 0.0F, 0.0F, -2F, 0.0F); // Import Box71

		passenger[68].addShapeBox(-4.1F, 7.5F, -2.8F, 4, 4, 1, 0F,0.0F, 0.0F, 0.0F, -3F, 0.0F, 0.0F, -3F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, -2F, 0.0F, -3F, -2F, 0.0F, -3F, -2F, 0.0F, 0.0F, -2F, 0.0F); // Import Box72

		passenger[69].addShapeBox(-3F, 7F, 2.5F, 6, 2, 2, 0F,0.75F, -1.6F, -0.8F, -0.75F, -2.8F, -0.8F, -0.75F, -2.8F, -0.8F, 0.75F, -1.6F, -0.8F, 0.5F, -1.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0.5F, -1.2F, 0.2F); // Import Box64

		passenger[70].addShapeBox(-3F, 7F, 2.5F, 6, 2, 2, 0F,0.0F, 0.4F, 0.2F, 0.0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, 0.0F, 0.4F, 0.2F, -0.25F, -3.2F, -0.8F, 0.25F, -1.8F, -0.8F, 0.25F, -1.8F, -0.8F, -0.25F, -3.2F, -0.8F); // Import Box65

		passenger[71].addShapeBox(-8F, 6.8F, 0F, 160, 40, 160, 0F, 0.3F, 0.0F, 0.3F, -155.7F, 0.0F, 0.3F, -155.7F, 0.0F, -155.7F, 0.3F, 0.0F, -155.7F, 0.3F, -39F, 0.3F, -155.7F, -39F, 0.3F, -155.7F, -39F, -155.7F, 0.3F, -39F, -155.7F); // Import Import
		passenger[71].setRotationPoint(0F, 0F, 0F);
		passenger[71].rotateAngleX = -1.04719755F;

		passenger[72].addShapeBox(5.2F, -1.4F, 1.5F, 80, 1, 40, 0F, 0.4F, 0.0F, 0.15F, -77.9F, 0.0F, 0.15F, -77.9F, 0.0F, -38.85F, 0.4F, 0.0F, -38.85F, 0.4F, 0.0F, 0.15F, -77.6F, 0.0F, 0.15F, -77.6F, 0.0F, -38.85F, 0.4F, 0.0F, -38.85F); // Import Import
		passenger[72].setRotationPoint(0F, 0F, 0F);
		passenger[72].rotateAngleX = -1.04719755F;

		passenger[73].addShapeBox(-8F, -1.2F, 0F, 8, 15, 4, 0F, 0.2F, 0.0F, 0.15F, -3.8F, 0.0F, 0.15F, -3.8F, 0.0F, 0.15F, 0.2F, 0.0F, 0.15F, 0.2F, -7F, 0.15F, -3.8F, -7F, 0.15F, -3.8F, -7F, 0.15F, 0.2F, -7F, 0.15F); // Import Import
		passenger[73].setRotationPoint(0F, 0F, 0F);
		passenger[73].rotateAngleX = -1.04719755F;

		passenger[74].addShapeBox(7.3F, 2.5F, -16.25F, 10, 800, 800, 0F, 0F, -0.25F, -17.5F, -9F, -0.25F, -17.5F, -9F, -0.25F, -781F, 0F, -0.25F, -781F, 0F, -798.5F, -17.5F, -9F, -798.5F, -17.5F, -9F, -798.5F, -781F, 0F, -798.5F, -781F); // Import Box57
		passenger[74].setRotationPoint(0F, 0F, 0F);
		passenger[74].rotateAngleX = -1.04719755F;

		passenger[75].addShapeBox(-1.7F, 0.599999999999999F, -16.75F, 10, 800, 800, 0F, -9F, -0.25F, -17.5F, 0F, -0.25F, -17.5F, 0F, -0.25F, -780F, -9F, -0.25F, -780F, -9F, -798.5F, -17.5F, 0F, -798.5F, -17.5F, 0F, -798.5F, -780F, -9F, -798.5F, -780F); // Import Box52
		passenger[75].setRotationPoint(0F, 0F, 0F);
		passenger[75].rotateAngleX = -1.04719755F;

		passenger[76].addShapeBox(4F, -1.2F, 0F, 8, 15, 4, 0F, 0.2F, 0.0F, 0.15F, -3.8F, 0.0F, 0.15F, -3.8F, 0.0F, 0.15F, 0.2F, 0.0F, 0.15F, 0.2F, -7.0F, 0.15F, -3.8F, -7.0F, 0.15F, -3.8F, -7.0F, 0.15F, 0.2F, -7.0F, 0.15F); // Import Import
		passenger[76].setRotationPoint(0F, 0F, 0F);
		passenger[76].rotateAngleX = -1.04719755F;

		passenger[77].addShapeBox(4F, 6.8F, 0F, 160, 40, 160, 0F, 0.3F, 0F, 0.3F, -155.7F, 0F, 0.3F, -155.7F, 0F, -155.7F, 0.3F, 0F, -155.7F, 0.3F, -39F, 0.3F, -155.7F, -39F, 0.3F, -155.7F, -39F, -155.7F, 0.3F, -39F, -155.7F); // Import Import
		passenger[77].setRotationPoint(0F, 0F, 0F);
		passenger[77].rotateAngleX = -1.04719755F;

		passenger[78].addShapeBox(-7.2F, -1.4F, 1.5F, 80, 1, 40, 0F, 0.1F, 0.0F, 0.15F, -77.6F, 0.0F, 0.15F, -77.6F, 0.0F, -38.85F, 0.1F, 0.0F, -38.85F, 0.4F, 0.0F, 0.15F, -77.6F, 0.0F, 0.15F, -77.6F, 0.0F, -38.85F, 0.4F, 0.0F, -38.85F); // Import Import
		passenger[78].setRotationPoint(0F, 0F, 0F);
		passenger[78].rotateAngleX = -1.04719755F;

		passenger[79].addShapeBox(-4F, 12F, -2F, 4, 12, 4, 0F, 0F, 0.15F, 0.05F, 0.25F, 0.15F, 0.05F, 0.25F, 0.15F, 0.05F, 0F, 0.15F, 0.05F, 0F, 0.01F, 0.05F, 0.25F, 0.01F, 0.05F, 0.25F, 0.01F, 0.05F, 0F, 0.01F, 0.05F); // Import Import
		passenger[79].setRotationPoint(0F, 0F, 0F);

		passenger[80].addShapeBox(-4F, 18F, -2F, 4, 6, 4, 0F, 0.5F, 0.15F, 0.45F, 0.25F, 0.15F, 0.45F, 0.25F, 0.15F, 0.45F, 0.5F, 0.15F, 0.45F, 0.5F, 0.05F, 0.45F, 0.25F, 0.05F, 0.45F, 0.25F, 0.05F, 0.45F, 0.5F, 0.05F, 0.45F); // Import Box2
		passenger[80].setRotationPoint(0F, 0F, 0F);

		passenger[81].addShapeBox(0F, 12F, -2F, 4, 12, 4, 0F, 0.25F, 0.15F, 0.05F, 0F, 0.15F, 0.05F, 0F, 0.15F, 0.05F, 0.25F, 0.15F, 0.05F, 0.25F, 0.01F, 0.05F, 0F, 0.01F, 0.05F, 0F, 0.01F, 0.05F, 0.25F, 0.01F, 0.05F); // Import Import
		passenger[81].setRotationPoint(0F, 0F, 0F);

		passenger[82].addShapeBox(0F, 18F, -2F, 4, 6, 4, 0F, 0.5F, 0.15F, 0.45F, 0.25F, 0.15F, 0.45F, 0.25F, 0.15F, 0.45F, 0.5F, 0.15F, 0.45F, 0.5F, 0.05F, 0.45F, 0.25F, 0.05F, 0.45F, 0.25F, 0.05F, 0.45F, 0.5F, 0.05F, 0.45F); // Import Import
		passenger[82].setRotationPoint(0F, 0F, 0F);

		passenger[83].addShapeBox(-4F, -8F, -4F, 8, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		passenger[83].setRotationPoint(0F, 0F, 0F);

		passenger[84].addShapeBox(-8F, -1F, 0F, 4, 12, 4, 0F, 0F, 0.0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		passenger[84].setRotationPoint(0F, 0F, 0F);
		passenger[84].rotateAngleX = -1.04719755F;

		passenger[85].addShapeBox(4F, -1F, 0F, 4, 12, 4, 0F, 0F, 0.0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		passenger[85].setRotationPoint(0F, 0F, 0F);
		passenger[85].rotateAngleX = -1.04719755F;

		passenger[86].addShapeBox(-4F, 12F, -2F, 4, 12, 4, 0F, 0F, 0.0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		passenger[86].setRotationPoint(0F, 0F, 0F);

		passenger[87].addShapeBox(0F, 12F, -2F, 4, 12, 4, 0F, 0F, 0.0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		passenger[87].setRotationPoint(0F, 0F, 0F);

		passenger[88].addShapeBox(-4F, 0F, -2F, 8, 12, 4, 0F, 0F, 0.0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		passenger[88].setRotationPoint(0F, 0F, 0F);

		passenger[89].addShapeBox(-8F, 7.8F, 0F, 8, 3, 4, 0F, 0.2F, 0.0F, 0.15F, -3.8F, 0F, 0.15F, -3.8F, 0F, 0.15F, 0.2F, 0F, 0.15F, 0.2F, 0.21F, 0.15F, -3.8F, 0.21F, 0.15F, -3.8F, 0.21F, 0.15F, 0.2F, 0.21F, 0.15F); // Box 6
		passenger[89].setRotationPoint(0F, 0F, 0F);
		passenger[89].rotateAngleX = -1.04719755F;

		passenger[90].addShapeBox(4F, 7.8F, 0F, 8, 3, 4, 0F, 0.2F, 0.0F, 0.15F, -3.8F, 0F, 0.15F, -3.8F, 0F, 0.15F, 0.2F, 0F, 0.15F, 0.2F, 0.21F, 0.15F, -3.8F, 0.21F, 0.15F, -3.8F, 0.21F, 0.15F, 0.2F, 0.21F, 0.15F); // Box 7
		passenger[90].setRotationPoint(0F, 0F, 0F);
		passenger[90].rotateAngleX = -1.04719755F;
		
		//Gun Origin
		for (int i = 0; i < 91; i++)
		{
			passenger[i].setRotationPoint(-12F, -27F, 1F);
			passenger[i].rotateAngleY = -1.57079633F;
		}
		
	}
	
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		for (int i = 0; i < 172; i++)
		{
			bodyModel[i].render(f5);
		}
		for (int i = 0; i < 2; i++)
		{
			bodyDoorCloseModel[i].render(f5);
		}
		for (int i = 0; i < 2; i++)
		{
			leftFrontWheelModel[i].render(f5);
		}
		for (int i = 0; i < 2; i++)
		{
			rightFrontWheelModel[i].render(f5);
		}
		for (int i = 0; i < 8; i++)
		{
			leftTrackWheelModels[i].render(f5);
		}
		for (int i = 0; i < 8; i++)
		{
			rightTrackWheelModels[i].render(f5);
		}
		for (int i = 0; i < 10; i++)
		{
			leftTrackModel[i].render(f5);
		}
		for (int i = 0; i < 10; i++)
		{
			rightTrackModel[i].render(f5);
		}
		for (int i = 0; i < 24; i++)
		{
			turretModel[i].render(f5);
		}
		for (int i = 0; i < 91; i++)
		{
			driver[i].render(f5);
			passenger[i].render(f5);
		}
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		for (int i = 0; i < 15; i++)
		{
			passenger[i].rotateAngleY = f3 / (180F / (float)Math.PI) - 90 / (180F / (float)Math.PI);
		}
		passenger[83].rotateAngleY = f3 / (180F / (float)Math.PI) - 90 / (180F / (float)Math.PI);
		
		for (int i = 0; i < 24; i++)
		{
			turretModel[i].rotateAngleY = f3 / (180F / (float)Math.PI) / 1.5F;
		}
	    
	}
	
	protected float degToRad(float degrees)
    {
        return degrees * (float)Math.PI / 180 ;
    }
	
	protected void setRotation(ModelRendererTurbo model, float rotX, float rotY, float rotZ)
    {
        model.rotateAngleX = degToRad(rotX);
        model.rotateAngleY = degToRad(rotY);
        model.rotateAngleZ = degToRad(rotZ);        
    }
}