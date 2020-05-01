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

public class ModelPanzerIVJ extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPanzerIVJ() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[227];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportImportImportBox1
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportImportImportBox2
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import ImportImportImportBox3
		bodyModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import ImportImportImportBox4
		bodyModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import ImportImportImportBox5
		bodyModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import ImportImportImportBox6
		bodyModel[6] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import ImportImportImportBox7
		bodyModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import ImportImportImportBox8
		bodyModel[8] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import ImportImportImportBox9
		bodyModel[9] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import ImportImportImportBox10
		bodyModel[10] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import ImportImportImportBox11
		bodyModel[11] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import ImportImportImportBox12
		bodyModel[12] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import ImportImportImportBox13
		bodyModel[13] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import ImportImportImportBox14
		bodyModel[14] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import ImportImportImportBox17
		bodyModel[15] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import ImportImportImportBox18
		bodyModel[16] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import ImportImportImportBox21
		bodyModel[17] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import ImportImportImportBox22
		bodyModel[18] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import ImportImportImportBox25
		bodyModel[19] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import ImportImportImportBox26
		bodyModel[20] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import ImportImportImportBox29
		bodyModel[21] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import ImportImportImportBox30
		bodyModel[22] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import ImportImportImportBox33
		bodyModel[23] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import ImportImportImportBox34
		bodyModel[24] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import ImportImportImportBox35
		bodyModel[25] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import ImportImportImportBox36
		bodyModel[26] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import ImportImportImportBox37
		bodyModel[27] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import ImportImportImportBox38
		bodyModel[28] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Import ImportImportImportBox39
		bodyModel[29] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Import ImportImportImportBox40
		bodyModel[30] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import ImportImportImportBox75
		bodyModel[31] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Import ImportImportImportBox77
		bodyModel[32] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Import ImportImportImportBox78
		bodyModel[33] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Import ImportImportImportBox79
		bodyModel[34] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Import ImportImportImportBox80
		bodyModel[35] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Import ImportImportImportBox81
		bodyModel[36] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Import ImportImportImportBox82
		bodyModel[37] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportImportImportBox83
		bodyModel[38] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Import ImportImportImportBox84
		bodyModel[39] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Import ImportImportImportBox85
		bodyModel[40] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Import ImportImportImportBox86
		bodyModel[41] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Import ImportImportImportBox87
		bodyModel[42] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Import ImportImportImportBox88
		bodyModel[43] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Import ImportImportImportBox89
		bodyModel[44] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Import ImportImportImportBox90
		bodyModel[45] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Import ImportImportImportBox91
		bodyModel[46] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Import ImportImportImportBox92
		bodyModel[47] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Import ImportImportImportBox93
		bodyModel[48] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Import ImportImportImportBox94
		bodyModel[49] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Import ImportImportImportBox145
		bodyModel[50] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Import ImportImportImportBox149
		bodyModel[51] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Import ImportImportImportBox150
		bodyModel[52] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Import ImportImportImportBox151
		bodyModel[53] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Import ImportImportImportBox152
		bodyModel[54] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import ImportImportImportBox153
		bodyModel[55] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Import ImportImportImportBox154
		bodyModel[56] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Import ImportImportImportBox155
		bodyModel[57] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Import ImportImportImportBox156
		bodyModel[58] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Import ImportImportImportBox157
		bodyModel[59] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Import ImportImportImportBox158
		bodyModel[60] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import ImportImportImportBox159
		bodyModel[61] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Import ImportImportImportBox160
		bodyModel[62] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Import ImportImportImportBox161
		bodyModel[63] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import ImportImportImportBox162
		bodyModel[64] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Import ImportImportImportBox163
		bodyModel[65] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Import ImportImportImportBox164
		bodyModel[66] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import ImportImportImportBox165
		bodyModel[67] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Import ImportImportImportBox166
		bodyModel[68] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Import ImportImportImportBox167
		bodyModel[69] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Import ImportImportImportBox168
		bodyModel[70] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Import ImportImportImportBox169
		bodyModel[71] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Import ImportImportImportBox170
		bodyModel[72] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Import ImportImportImportBox171
		bodyModel[73] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import ImportImportImportBox172
		bodyModel[74] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Import ImportImportImportBox173
		bodyModel[75] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Import ImportImportImportBox174
		bodyModel[76] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Import ImportImportImportBox175
		bodyModel[77] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Import ImportImportImportBox176
		bodyModel[78] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Import ImportImportImportBox177
		bodyModel[79] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Import ImportImportImportBox178
		bodyModel[80] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import ImportImportImportBox179
		bodyModel[81] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Import ImportImportImportBox180
		bodyModel[82] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Import ImportImportImportBox181
		bodyModel[83] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Import ImportImportImportBox182
		bodyModel[84] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Import ImportImportImportBox183
		bodyModel[85] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Import ImportImportImportBox184
		bodyModel[86] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Import ImportImportImportBox185
		bodyModel[87] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Import ImportImportImportBox186
		bodyModel[88] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import ImportImportImportBox187
		bodyModel[89] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Import ImportImportImportBox188
		bodyModel[90] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Import ImportImportImportBox189
		bodyModel[91] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Import ImportImportImportBox190
		bodyModel[92] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Import ImportImportImportBox191
		bodyModel[93] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Import ImportImportImportBox192
		bodyModel[94] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import ImportImportImportBox194
		bodyModel[95] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import ImportImportImportBox195
		bodyModel[96] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Import ImportImportImportBox196
		bodyModel[97] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Import ImportImportImportBox197
		bodyModel[98] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Import ImportImportImportBox198
		bodyModel[99] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Import ImportImportImportBox199
		bodyModel[100] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Import ImportImportImportBox200
		bodyModel[101] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Import ImportImportImportBox215
		bodyModel[102] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Import ImportImportImportBox216
		bodyModel[103] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Import ImportImportImportBox217
		bodyModel[104] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Import ImportImportImportBox218
		bodyModel[105] = new ModelRendererTurbo(this, 41, 241, textureX, textureY); // Import ImportImportImportBox290
		bodyModel[106] = new ModelRendererTurbo(this, 217, 209, textureX, textureY); // Import ImportImportImportBox378
		bodyModel[107] = new ModelRendererTurbo(this, 441, 217, textureX, textureY); // Import ImportImportImportBox379
		bodyModel[108] = new ModelRendererTurbo(this, 489, 233, textureX, textureY); // Import ImportImportImportBox380
		bodyModel[109] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Import ImportImportImportBox390
		bodyModel[110] = new ModelRendererTurbo(this, 489, 281, textureX, textureY); // Import ImportImportImportBox46
		bodyModel[111] = new ModelRendererTurbo(this, 209, 369, textureX, textureY); // Import ImportImportImportBox185
		bodyModel[112] = new ModelRendererTurbo(this, 89, 329, textureX, textureY); // Import ImportImportImportBox45
		bodyModel[113] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Import ImportImportImportBox0
		bodyModel[114] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import ImportImportImportBox26
		bodyModel[115] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import ImportImportImportBox27
		bodyModel[116] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import ImportImportImportBox28
		bodyModel[117] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import ImportImportImportBox29
		bodyModel[118] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import ImportImportImportBox30
		bodyModel[119] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import ImportImportImportBox31
		bodyModel[120] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import ImportImportImportBox32
		bodyModel[121] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import ImportImportImportBox33
		bodyModel[122] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import ImportImportImportBox34
		bodyModel[123] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import ImportImportImportBox35
		bodyModel[124] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import ImportImportImportBox36
		bodyModel[125] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import ImportImportImportBox37
		bodyModel[126] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import ImportImportImportBox38
		bodyModel[127] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import ImportImportImportBox39
		bodyModel[128] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import ImportImportImportBox40
		bodyModel[129] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import ImportImportImportBox41
		bodyModel[130] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import ImportImportImportBox42
		bodyModel[131] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import ImportImportImportBox43
		bodyModel[132] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import ImportImportImportBox44
		bodyModel[133] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import ImportImportImportBox50
		bodyModel[134] = new ModelRendererTurbo(this, 185, 321, textureX, textureY); // Import ImportImportImportBox1
		bodyModel[135] = new ModelRendererTurbo(this, 121, 361, textureX, textureY); // Import ImportImportImportBox2
		bodyModel[136] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Import ImportImportImportBox53
		bodyModel[137] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Import ImportImportImportBox6
		bodyModel[138] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import ImportImportImportBox7
		bodyModel[139] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Import ImportImportImportBox8
		bodyModel[140] = new ModelRendererTurbo(this, 497, 177, textureX, textureY); // Import ImportImportImportBox9
		bodyModel[141] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Import ImportImportImportBox10
		bodyModel[142] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Import ImportImportImportBox11
		bodyModel[143] = new ModelRendererTurbo(this, 497, 185, textureX, textureY); // Import ImportImportImportBox12
		bodyModel[144] = new ModelRendererTurbo(this, 105, 425, textureX, textureY); // Import ImportImportImportBox13
		bodyModel[145] = new ModelRendererTurbo(this, 161, 425, textureX, textureY); // Import ImportImportImportBox14
		bodyModel[146] = new ModelRendererTurbo(this, 25, 193, textureX, textureY); // Import ImportImportImportBox32
		bodyModel[147] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Import ImportImportImportBox33
		bodyModel[148] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Import ImportImportImportBox34
		bodyModel[149] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Import ImportImportImportBox35
		bodyModel[150] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Import ImportImportImportBox1
		bodyModel[151] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import ImportImportImportBox1
		bodyModel[152] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import ImportImportImportBox2
		bodyModel[153] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import ImportImportImportBox3
		bodyModel[154] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import ImportImportImportBox4
		bodyModel[155] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import ImportImportImportBox5
		bodyModel[156] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import ImportImportImportBox6
		bodyModel[157] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import ImportImportImportBox7
		bodyModel[158] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import ImportImportImportBox8
		bodyModel[159] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import ImportImportImportBox9
		bodyModel[160] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import ImportImportImportBox10
		bodyModel[161] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import ImportImportImportBox11
		bodyModel[162] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import ImportImportImportBox12
		bodyModel[163] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import ImportImportImportBox13
		bodyModel[164] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import ImportImportImportBox14
		bodyModel[165] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import ImportImportImportBox15
		bodyModel[166] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import ImportImportImportBox16
		bodyModel[167] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import ImportImportImportBox17
		bodyModel[168] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import ImportImportImportBox18
		bodyModel[169] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import ImportImportImportBox19
		bodyModel[170] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import ImportImportImportBox25
		bodyModel[171] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Import ImportImportImportBox1
		bodyModel[172] = new ModelRendererTurbo(this, 150, 490, textureX, textureY); // Import ImportImportImportBox2
		bodyModel[173] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import ImportImportImportBox3
		bodyModel[174] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import ImportImportImportBox4
		bodyModel[175] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import ImportImportImportBox5
		bodyModel[176] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import ImportImportImportBox6
		bodyModel[177] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Import ImportImportImportBox24
		bodyModel[178] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import ImportImportImportBox25
		bodyModel[179] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import ImportImportImportBox26
		bodyModel[180] = new ModelRendererTurbo(this, 150, 490, textureX, textureY); // Import ImportImportImportBox27
		bodyModel[181] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import ImportImportImportBox28
		bodyModel[182] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import ImportImportImportBox29
		bodyModel[183] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Import ImportImportImportBox34
		bodyModel[184] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Import ImportImportImportBox50
		bodyModel[185] = new ModelRendererTurbo(this, 150, 490, textureX, textureY); // Import ImportImportImportBox51
		bodyModel[186] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import ImportImportImportBox52
		bodyModel[187] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import ImportImportImportBox53
		bodyModel[188] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import ImportImportImportBox54
		bodyModel[189] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import ImportImportImportBox55
		bodyModel[190] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import ImportImportImportBox57
		bodyModel[191] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import ImportImportImportBox58
		bodyModel[192] = new ModelRendererTurbo(this, 150, 490, textureX, textureY); // Import ImportImportImportBox59
		bodyModel[193] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import ImportImportImportBox60
		bodyModel[194] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import ImportImportImportBox61
		bodyModel[195] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Import ImportImportImportBox70
		bodyModel[196] = new ModelRendererTurbo(this, 150, 490, textureX, textureY); // Import ImportImportImportBox71
		bodyModel[197] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import ImportImportImportBox72
		bodyModel[198] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import ImportImportImportBox73
		bodyModel[199] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import ImportImportImportBox74
		bodyModel[200] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import ImportImportImportBox75
		bodyModel[201] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Import ImportImportImportBox76
		bodyModel[202] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import ImportImportImportBox77
		bodyModel[203] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import ImportImportImportBox78
		bodyModel[204] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import ImportImportImportBox79
		bodyModel[205] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import ImportImportImportBox80
		bodyModel[206] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Import ImportImportImportBox81
		bodyModel[207] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Import ImportImportImportBox82
		bodyModel[208] = new ModelRendererTurbo(this, 150, 490, textureX, textureY); // Import ImportImportImportBox83
		bodyModel[209] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import ImportImportImportBox84
		bodyModel[210] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import ImportImportImportBox85
		bodyModel[211] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import ImportImportImportBox86
		bodyModel[212] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import ImportImportImportBox87
		bodyModel[213] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import ImportImportImportBox88
		bodyModel[214] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import ImportImportImportBox89
		bodyModel[215] = new ModelRendererTurbo(this, 150, 490, textureX, textureY); // Import ImportImportImportBox90
		bodyModel[216] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import ImportImportImportBox91
		bodyModel[217] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import ImportImportImportBox92
		bodyModel[218] = new ModelRendererTurbo(this, 41, 241, textureX, textureY); // Import ImportImportImportBox96
		bodyModel[219] = new ModelRendererTurbo(this, 258, 440, textureX, textureY); // Import ImportImporttoadd
		bodyModel[220] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import Importwheel
		bodyModel[221] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import Importwheel
		
		bodyModel[222] = new ModelRendererTurbo(this, 1, 510, textureX, textureY); // Box 4

		bodyModel[222].addBox(-3F, -0.5F, -0.5F, 1, 1, 1, 0F); // Box 4
		bodyModel[222].setRotationPoint(44F, -19F, -9.5F);

		bodyModel[223] = new ModelRendererTurbo(this, 0, 506, textureX, textureY); // Box 0
		bodyModel[224] = new ModelRendererTurbo(this, 1, 510, textureX, textureY); // Box 1
		bodyModel[225] = new ModelRendererTurbo(this, 11, 510, textureX, textureY); // Box 2
		bodyModel[226] = new ModelRendererTurbo(this, 6, 510, textureX, textureY); // Box 3

		bodyModel[223].addBox(-2F, -0.5F, -0.5F, 8, 1, 1, 0F); // Box 0

		bodyModel[224].addShapeBox(4F, -1.5F, -0.5F, 1, 1, 1, 0F,-0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.1F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F); // Box 1

		bodyModel[225].addShapeBox(6F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 2

		bodyModel[226].addShapeBox(7F, -0.5F, -0.5F, 1, 1, 1, 0F,0.1F, -0.1F, -0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.1F, -0.1F); // Box 3

		//Gun Origin
		for (int i = 223; i<227; i++)
		{
			bodyModel[i].setRotationPoint(44F, -19F, -9.5F);
		}

		bodyModel[0].addShapeBox(0F, 0F, 0F, 18, 15, 42, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox1
		bodyModel[0].setRotationPoint(43F, -16F, -21F);

		bodyModel[1].addShapeBox(6F, -1F, 0F, 3, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox2
		bodyModel[1].setRotationPoint(43F, -16F, -16F);
		bodyModel[1].rotateAngleZ = -0.3217497F;

		bodyModel[2].addShapeBox(9F, -1F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox3
		bodyModel[2].setRotationPoint(43F, -16F, -16F);
		bodyModel[2].rotateAngleZ = -0.3217497F;

		bodyModel[3].addShapeBox(14F, -0.5F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox4
		bodyModel[3].setRotationPoint(43F, -16F, -16F);
		bodyModel[3].rotateAngleZ = -0.3217497F;

		bodyModel[4].addShapeBox(14F, -0.5F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox5
		bodyModel[4].setRotationPoint(43F, -16F, 13F);
		bodyModel[4].rotateAngleZ = -0.3217497F;

		bodyModel[5].addShapeBox(6F, -1F, 0F, 3, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox6
		bodyModel[5].setRotationPoint(43F, -16F, 13F);
		bodyModel[5].rotateAngleZ = -0.3217497F;

		bodyModel[6].addShapeBox(9F, -1F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox7
		bodyModel[6].setRotationPoint(43F, -16F, 13F);
		bodyModel[6].rotateAngleZ = -0.3217497F;

		bodyModel[7].addShapeBox(3F, -0.2F, 0F, 11, 1, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox8
		bodyModel[7].setRotationPoint(43F, -16F, -9F);
		bodyModel[7].rotateAngleZ = -0.3217497F;

		bodyModel[8].addShapeBox(4F, -1F, 1F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox9
		bodyModel[8].setRotationPoint(43F, -16F, -9F);
		bodyModel[8].rotateAngleZ = -0.3217497F;

		bodyModel[9].addShapeBox(9F, -1F, 1F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox10
		bodyModel[9].setRotationPoint(43F, -16F, -9F);
		bodyModel[9].rotateAngleZ = -0.3217497F;

		bodyModel[10].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox11
		bodyModel[10].setRotationPoint(43F, -16F, -8F);
		bodyModel[10].rotateAngleZ = -0.3217497F;

		bodyModel[11].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportImportBox12
		bodyModel[11].setRotationPoint(43F, -16F, -6F);
		bodyModel[11].rotateAngleZ = -0.3217497F;

		bodyModel[12].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportImportBox13
		bodyModel[12].setRotationPoint(43F, -16F, -3F);
		bodyModel[12].rotateAngleZ = -0.3217497F;

		bodyModel[13].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox14
		bodyModel[13].setRotationPoint(43F, -16F, -5F);
		bodyModel[13].rotateAngleZ = -0.3217497F;

		bodyModel[14].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportImportBox17
		bodyModel[14].setRotationPoint(43F, -16F, 0F);
		bodyModel[14].rotateAngleZ = -0.3217497F;

		bodyModel[15].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox18
		bodyModel[15].setRotationPoint(43F, -16F, -2F);
		bodyModel[15].rotateAngleZ = -0.3217497F;

		bodyModel[16].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportImportBox21
		bodyModel[16].setRotationPoint(43F, -16F, 3F);
		bodyModel[16].rotateAngleZ = -0.3217497F;

		bodyModel[17].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox22
		bodyModel[17].setRotationPoint(43F, -16F, 1F);
		bodyModel[17].rotateAngleZ = -0.3217497F;

		bodyModel[18].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportImportBox25
		bodyModel[18].setRotationPoint(43F, -16F, 6F);
		bodyModel[18].rotateAngleZ = -0.3217497F;

		bodyModel[19].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox26
		bodyModel[19].setRotationPoint(43F, -16F, 4F);
		bodyModel[19].rotateAngleZ = -0.3217497F;

		bodyModel[20].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportImportBox29
		bodyModel[20].setRotationPoint(43F, -16F, 9F);
		bodyModel[20].rotateAngleZ = -0.3217497F;

		bodyModel[21].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox30
		bodyModel[21].setRotationPoint(43F, -16F, 7F);
		bodyModel[21].rotateAngleZ = -0.3217497F;

		bodyModel[22].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox33
		bodyModel[22].setRotationPoint(43F, -16F, 7F);
		bodyModel[22].rotateAngleZ = -0.3217497F;

		bodyModel[23].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox34
		bodyModel[23].setRotationPoint(43F, -16F, 4F);
		bodyModel[23].rotateAngleZ = -0.3217497F;

		bodyModel[24].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox35
		bodyModel[24].setRotationPoint(43F, -16F, 1F);
		bodyModel[24].rotateAngleZ = -0.3217497F;

		bodyModel[25].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox36
		bodyModel[25].setRotationPoint(43F, -16F, -2F);
		bodyModel[25].rotateAngleZ = -0.3217497F;

		bodyModel[26].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox37
		bodyModel[26].setRotationPoint(43F, -16F, -5F);
		bodyModel[26].rotateAngleZ = -0.3217497F;

		bodyModel[27].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox38
		bodyModel[27].setRotationPoint(43F, -16F, -8F);
		bodyModel[27].rotateAngleZ = -0.3217497F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 89, 18, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox39
		bodyModel[28].setRotationPoint(-46F, -15.5F, -21F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 16, 3, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -6F, 0.5F, 0F, -6F, 0.5F, 0F, 0F, 1.5F, 0F); // Import ImportImportImportBox40
		bodyModel[29].setRotationPoint(43F, -1F, -21F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 30, 3, 54, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox75
		bodyModel[30].setRotationPoint(-17F, -18.5F, -27F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 80, 9, 50, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox77
		bodyModel[31].setRotationPoint(-46F, -24.5F, -25F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox78
		bodyModel[32].setRotationPoint(-37F, -26.5F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox79
		bodyModel[33].setRotationPoint(-35F, -25F, 9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox80
		bodyModel[34].setRotationPoint(-35F, -25F, 18F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import ImportImportImportBox81
		bodyModel[35].setRotationPoint(-36F, -25F, 9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportImportImportBox82
		bodyModel[36].setRotationPoint(-22F, -25F, 9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox83
		bodyModel[37].setRotationPoint(-25F, -24.7F, 10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox84
		bodyModel[38].setRotationPoint(-28F, -24.7F, 10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox85
		bodyModel[39].setRotationPoint(-31F, -24.7F, 10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox86
		bodyModel[40].setRotationPoint(-34F, -24.7F, 10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox87
		bodyModel[41].setRotationPoint(-37F, -24.7F, -15F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox88
		bodyModel[42].setRotationPoint(-34F, -24.7F, -15F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox89
		bodyModel[43].setRotationPoint(-31F, -24.7F, -15F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox90
		bodyModel[44].setRotationPoint(-28F, -24.7F, -15F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox91
		bodyModel[45].setRotationPoint(-38F, -25F, -16F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox92
		bodyModel[46].setRotationPoint(-38F, -25F, -7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import ImportImportImportBox93
		bodyModel[47].setRotationPoint(-39F, -25F, -16F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportImportImportBox94
		bodyModel[48].setRotationPoint(-25F, -25F, -16F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox145
		bodyModel[49].setRotationPoint(3F, -23.5F, 26F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 6, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import ImportImportImportBox149
		bodyModel[50].setRotationPoint(6F, -24.5F, -32F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox150
		bodyModel[51].setRotationPoint(3F, -24.5F, 26F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox151
		bodyModel[52].setRotationPoint(0F, -24.5F, 26F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox152
		bodyModel[53].setRotationPoint(0F, -23.5F, 26F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox153
		bodyModel[54].setRotationPoint(-3F, -24.5F, 26F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox154
		bodyModel[55].setRotationPoint(-3F, -23.5F, 26F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox155
		bodyModel[56].setRotationPoint(-6F, -24.5F, 26F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox156
		bodyModel[57].setRotationPoint(-6F, -23.5F, 26F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox157
		bodyModel[58].setRotationPoint(-9F, -24.5F, 26F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox158
		bodyModel[59].setRotationPoint(-9F, -23.5F, 26F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox159
		bodyModel[60].setRotationPoint(-12F, -24.5F, 26F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox160
		bodyModel[61].setRotationPoint(-12F, -23.5F, 26F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox161
		bodyModel[62].setRotationPoint(-14F, -21.5F, -28F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox162
		bodyModel[63].setRotationPoint(-14F, -23.5F, -28F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox163
		bodyModel[64].setRotationPoint(-13F, -24.5F, -28F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportImportBox164
		bodyModel[65].setRotationPoint(-14F, -18.5F, -28F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportImportImportBox165
		bodyModel[66].setRotationPoint(-13F, -20.5F, -28F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportImportImportBox166
		bodyModel[67].setRotationPoint(-13F, -16.5F, -31F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportImportBox167
		bodyModel[68].setRotationPoint(-14F, -18.5F, -31F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox168
		bodyModel[69].setRotationPoint(-14F, -21.5F, -31F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox169
		bodyModel[70].setRotationPoint(-14F, -23.5F, -31F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox170
		bodyModel[71].setRotationPoint(-13F, -24.5F, -31F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox171
		bodyModel[72].setRotationPoint(-12.5F, -22F, -29F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox172
		bodyModel[73].setRotationPoint(-12.5F, -24F, -29F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportImportImportBox173
		bodyModel[74].setRotationPoint(-12.5F, -19F, -29F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportImportImportBox174
		bodyModel[75].setRotationPoint(-2.5F, -19F, -29F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox175
		bodyModel[76].setRotationPoint(-2.5F, -22F, -29F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox176
		bodyModel[77].setRotationPoint(-2.5F, -24F, -29F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportImportBox177
		bodyModel[78].setRotationPoint(-4F, -18.5F, -28F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportImportImportBox178
		bodyModel[79].setRotationPoint(-3F, -20.5F, -28F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox179
		bodyModel[80].setRotationPoint(-4F, -21.5F, -28F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox180
		bodyModel[81].setRotationPoint(-4F, -23.5F, -28F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox181
		bodyModel[82].setRotationPoint(-3F, -24.5F, -28F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox182
		bodyModel[83].setRotationPoint(-3F, -24.5F, -31F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox183
		bodyModel[84].setRotationPoint(-4F, -23.5F, -31F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox184
		bodyModel[85].setRotationPoint(-4F, -21.5F, -31F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportImportBox185
		bodyModel[86].setRotationPoint(-4F, -18.5F, -31F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportImportImportBox186
		bodyModel[87].setRotationPoint(-3F, -16.5F, -31F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox187
		bodyModel[88].setRotationPoint(-44F, -23.5F, -25F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox188
		bodyModel[89].setRotationPoint(-44F, -22F, -25.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox189
		bodyModel[90].setRotationPoint(-44F, -22F, 24.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox190
		bodyModel[91].setRotationPoint(-44F, -23.5F, 24F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 6, 2, 23, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox191
		bodyModel[92].setRotationPoint(-53F, -15.5F, -17F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 6, 2, 23, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox192
		bodyModel[93].setRotationPoint(-53F, -13.5F, -17F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 6, 2, 23, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportImportImportBox194
		bodyModel[94].setRotationPoint(-53F, -11.5F, -17F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import ImportImportImportBox195
		bodyModel[95].setRotationPoint(-54F, -11.5F, -16F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import ImportImportImportBox196
		bodyModel[96].setRotationPoint(-54F, -11.5F, 0F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 103, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox197
		bodyModel[97].setRotationPoint(-49F, -16F, -31F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 7, 2, 11, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox198
		bodyModel[98].setRotationPoint(54F, -16F, -31F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox199
		bodyModel[99].setRotationPoint(61F, -14F, -31F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 12, 2, 11, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F); // Import ImportImportImportBox200
		bodyModel[100].setRotationPoint(-61F, -16F, -31F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 103, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox215
		bodyModel[101].setRotationPoint(-49F, -16F, 20F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 7, 2, 11, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox216
		bodyModel[102].setRotationPoint(54F, -16F, 20F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox217
		bodyModel[103].setRotationPoint(61F, -14F, 20F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 12, 2, 11, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F); // Import ImportImportImportBox218
		bodyModel[104].setRotationPoint(-61F, -16F, 20F);

		bodyModel[105].addShapeBox(0F, 0F, 0.5F, 76, 3, 8, 0F, 5F, 0F, 0F, 5F, 1F, 0F, 5F, 1F, 0F, 5F, 0F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, -2F, 2F, 1F, -2F); // Import ImportImportImportBox290
		bodyModel[105].setRotationPoint(-33F, 2.5F, -21F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 6, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import ImportImportImportBox378
		bodyModel[106].setRotationPoint(-15F, -24.5F, -32F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 6, 9, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox379
		bodyModel[107].setRotationPoint(-15F, -24.5F, 23F);

		bodyModel[108].addShapeBox(0F, 0F, -2F, 1, 6, 9, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox380
		bodyModel[108].setRotationPoint(6F, -24.5F, 25F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 8, 9, 50, 0F, 0F, 0F, -1F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, -5F, 2F, 0F, -5F, 0F, 0F, 0F); // Import ImportImportImportBox390
		bodyModel[109].setRotationPoint(34.01F, -24.5F, -25F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 6, 5, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F); // Import ImportImportImportBox46
		bodyModel[110].setRotationPoint(41F, -22F, -12F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F); // Import ImportImportImportBox185
		bodyModel[111].setRotationPoint(42F, -23F, 3.5F);
		bodyModel[111].rotateAngleZ = -0.34906585F;

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F); // Import ImportImportImportBox45
		bodyModel[112].setRotationPoint(43F, -21.5F, 4F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox0
		bodyModel[113].setRotationPoint(-53F, -17.5F, 3F);
		bodyModel[113].rotateAngleZ = 0.2443461F;

		bodyModel[114].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportImportBox26
		bodyModel[114].setRotationPoint(62F, -12F, 11F);
		bodyModel[114].rotateAngleY = 0.13962634F;
		bodyModel[114].rotateAngleZ = -1.78782627F;

		bodyModel[115].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox27
		bodyModel[115].setRotationPoint(62F, -12F, 9F);
		bodyModel[115].rotateAngleY = 0.13962634F;
		bodyModel[115].rotateAngleZ = -1.78782627F;

		bodyModel[116].addShapeBox(7F, -2.5F, 8F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox28
		bodyModel[116].setRotationPoint(62F, -12F, 9F);
		bodyModel[116].rotateAngleY = 0.13962634F;
		bodyModel[116].rotateAngleZ = -1.78782627F;

		bodyModel[117].addShapeBox(7F, -2.5F, 8F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox29
		bodyModel[117].setRotationPoint(62F, -12F, 6F);
		bodyModel[117].rotateAngleY = 0.13962634F;
		bodyModel[117].rotateAngleZ = -1.78782627F;

		bodyModel[118].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox30
		bodyModel[118].setRotationPoint(62F, -12F, 6F);
		bodyModel[118].rotateAngleY = 0.13962634F;
		bodyModel[118].rotateAngleZ = -1.78782627F;

		bodyModel[119].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox31
		bodyModel[119].setRotationPoint(62F, -12F, 3F);
		bodyModel[119].rotateAngleY = 0.13962634F;
		bodyModel[119].rotateAngleZ = -1.78782627F;

		bodyModel[120].addShapeBox(7F, -2.5F, 8F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox32
		bodyModel[120].setRotationPoint(62F, -12F, 3F);
		bodyModel[120].rotateAngleY = 0.13962634F;
		bodyModel[120].rotateAngleZ = -1.78782627F;

		bodyModel[121].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportImportBox33
		bodyModel[121].setRotationPoint(62F, -12F, 5F);
		bodyModel[121].rotateAngleY = 0.13962634F;
		bodyModel[121].rotateAngleZ = -1.78782627F;

		bodyModel[122].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox34
		bodyModel[122].setRotationPoint(62F, -12F, 0F);
		bodyModel[122].rotateAngleY = 0.13962634F;
		bodyModel[122].rotateAngleZ = -1.78782627F;

		bodyModel[123].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportImportBox35
		bodyModel[123].setRotationPoint(62F, -12F, 2F);
		bodyModel[123].rotateAngleY = 0.13962634F;
		bodyModel[123].rotateAngleZ = -1.78782627F;

		bodyModel[124].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportImportBox36
		bodyModel[124].setRotationPoint(62F, -12F, -1F);
		bodyModel[124].rotateAngleY = 0.13962634F;
		bodyModel[124].rotateAngleZ = -1.78782627F;

		bodyModel[125].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox37
		bodyModel[125].setRotationPoint(62F, -12F, -3F);
		bodyModel[125].rotateAngleY = 0.13962634F;
		bodyModel[125].rotateAngleZ = -1.78782627F;

		bodyModel[126].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportImportBox38
		bodyModel[126].setRotationPoint(62F, -12F, -4F);
		bodyModel[126].rotateAngleY = 0.13962634F;
		bodyModel[126].rotateAngleZ = -1.78782627F;

		bodyModel[127].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox39
		bodyModel[127].setRotationPoint(62F, -12F, -6F);
		bodyModel[127].rotateAngleY = 0.13962634F;
		bodyModel[127].rotateAngleZ = -1.78782627F;

		bodyModel[128].addShapeBox(7F, -2.5F, 8F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox40
		bodyModel[128].setRotationPoint(62F, -12F, -6F);
		bodyModel[128].rotateAngleY = 0.13962634F;
		bodyModel[128].rotateAngleZ = -1.78782627F;

		bodyModel[129].addShapeBox(7F, -2.5F, 8F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox41
		bodyModel[129].setRotationPoint(62F, -12F, -3F);
		bodyModel[129].rotateAngleY = 0.13962634F;
		bodyModel[129].rotateAngleZ = -1.78782627F;

		bodyModel[130].addShapeBox(7F, -2.5F, 8F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox42
		bodyModel[130].setRotationPoint(62F, -12F, 0F);
		bodyModel[130].rotateAngleY = 0.13962634F;
		bodyModel[130].rotateAngleZ = -1.78782627F;

		bodyModel[131].addShapeBox(9F, -1F, 8F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox43
		bodyModel[131].setRotationPoint(62F, -12F, -7F);
		bodyModel[131].rotateAngleY = 0.13962634F;
		bodyModel[131].rotateAngleZ = -1.78782627F;

		bodyModel[132].addShapeBox(4F, -1F, 8F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox44
		bodyModel[132].setRotationPoint(62F, -12F, -7F);
		bodyModel[132].rotateAngleY = 0.13962634F;
		bodyModel[132].rotateAngleZ = -1.78782627F;

		bodyModel[133].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportImportBox50
		bodyModel[133].setRotationPoint(62F, -12F, 8F);
		bodyModel[133].rotateAngleY = 0.13962634F;
		bodyModel[133].rotateAngleZ = -1.78782627F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F); // Import ImportImportImportBox1
		bodyModel[134].setRotationPoint(41.3F, -22.5F, 20F);
		bodyModel[134].rotateAngleY = 1.09955743F;
		bodyModel[134].rotateAngleZ = 0.12217305F;

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F); // Import ImportImportImportBox2
		bodyModel[135].setRotationPoint(35F, -22.5F, -23.5F);
		bodyModel[135].rotateAngleY = -1.09955743F;
		bodyModel[135].rotateAngleZ = 0.12217305F;

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox53
		bodyModel[136].setRotationPoint(49F, -21F, 24F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox6
		bodyModel[137].setRotationPoint(50F, -19F, 25.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Import ImportImportImportBox7
		bodyModel[138].setRotationPoint(50F, -17F, 25.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportImportImportBox8
		bodyModel[139].setRotationPoint(49F, -20F, 24F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox9
		bodyModel[140].setRotationPoint(49F, -21F, -28F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox10
		bodyModel[141].setRotationPoint(50F, -19F, -26.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Import ImportImportImportBox11
		bodyModel[142].setRotationPoint(50F, -17F, -26.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportImportImportBox12
		bodyModel[143].setRotationPoint(49F, -20F, -28F);

		bodyModel[144].addBox(0F, 0F, 0F, 12, 1, 12, 0F); // Import ImportImportImportBox13
		bodyModel[144].setRotationPoint(28F, -25F, 4F);

		bodyModel[145].addBox(0F, 0F, 0F, 12, 1, 12, 0F); // Import ImportImportImportBox14
		bodyModel[145].setRotationPoint(28F, -25F, -16F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Import ImportImportImportBox32
		bodyModel[146].setRotationPoint(28F, -25.5F, 4F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Import ImportImportImportBox33
		bodyModel[147].setRotationPoint(28F, -25.5F, -16F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import ImportImportImportBox34
		bodyModel[148].setRotationPoint(38F, -25.5F, -11F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import ImportImportImportBox35
		bodyModel[149].setRotationPoint(38F, -25.5F, 9F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox1
		bodyModel[150].setRotationPoint(-49F, -9.5F, 12.5F);

		bodyModel[151].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportImportBox1
		bodyModel[151].setRotationPoint(61F, -12F, 9F);
		bodyModel[151].rotateAngleZ = -1.80527957F;

		bodyModel[152].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox2
		bodyModel[152].setRotationPoint(61F, -12F, 7F);
		bodyModel[152].rotateAngleZ = -1.80527957F;

		bodyModel[153].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox3
		bodyModel[153].setRotationPoint(61F, -12F, 7F);
		bodyModel[153].rotateAngleZ = -1.80527957F;

		bodyModel[154].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox4
		bodyModel[154].setRotationPoint(61F, -12F, 4F);
		bodyModel[154].rotateAngleZ = -1.80527957F;

		bodyModel[155].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox5
		bodyModel[155].setRotationPoint(61F, -12F, 4F);
		bodyModel[155].rotateAngleZ = -1.80527957F;

		bodyModel[156].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox6
		bodyModel[156].setRotationPoint(61F, -12F, 1F);
		bodyModel[156].rotateAngleZ = -1.80527957F;

		bodyModel[157].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox7
		bodyModel[157].setRotationPoint(61F, -12F, 1F);
		bodyModel[157].rotateAngleZ = -1.80527957F;

		bodyModel[158].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportImportBox8
		bodyModel[158].setRotationPoint(61F, -12F, 3F);
		bodyModel[158].rotateAngleZ = -1.80527957F;

		bodyModel[159].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox9
		bodyModel[159].setRotationPoint(61F, -12F, -2F);
		bodyModel[159].rotateAngleZ = -1.80527957F;

		bodyModel[160].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportImportBox10
		bodyModel[160].setRotationPoint(61F, -12F, 0F);
		bodyModel[160].rotateAngleZ = -1.80527957F;

		bodyModel[161].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportImportBox11
		bodyModel[161].setRotationPoint(61F, -12F, -3F);
		bodyModel[161].rotateAngleZ = -1.80527957F;

		bodyModel[162].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox12
		bodyModel[162].setRotationPoint(61F, -12F, -5F);
		bodyModel[162].rotateAngleZ = -1.80527957F;

		bodyModel[163].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportImportBox13
		bodyModel[163].setRotationPoint(61F, -12F, -6F);
		bodyModel[163].rotateAngleZ = -1.80527957F;

		bodyModel[164].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox14
		bodyModel[164].setRotationPoint(61F, -12F, -8F);
		bodyModel[164].rotateAngleZ = -1.80527957F;

		bodyModel[165].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox15
		bodyModel[165].setRotationPoint(61F, -12F, -8F);
		bodyModel[165].rotateAngleZ = -1.80527957F;

		bodyModel[166].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox16
		bodyModel[166].setRotationPoint(61F, -12F, -5F);
		bodyModel[166].rotateAngleZ = -1.80527957F;

		bodyModel[167].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox17
		bodyModel[167].setRotationPoint(61F, -12F, -2F);
		bodyModel[167].rotateAngleZ = -1.80527957F;

		bodyModel[168].addShapeBox(9F, -1F, -10F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox18
		bodyModel[168].setRotationPoint(61F, -12F, -9F);
		bodyModel[168].rotateAngleZ = -1.80527957F;

		bodyModel[169].addShapeBox(4F, -1F, -10F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox19
		bodyModel[169].setRotationPoint(61F, -12F, -9F);
		bodyModel[169].rotateAngleZ = -1.80527957F;

		bodyModel[170].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportImportBox25
		bodyModel[170].setRotationPoint(61F, -12F, 6F);
		bodyModel[170].rotateAngleZ = -1.80527957F;

		bodyModel[171].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F); // Import ImportImportImportBox1
		bodyModel[171].setRotationPoint(33F, -0.5F, 18F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox2
		bodyModel[172].setRotationPoint(32F, 3.5F, 20F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox3
		bodyModel[173].setRotationPoint(39F, 3.5F, 20F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportImportImportBox4
		bodyModel[174].setRotationPoint(31F, 3.5F, 20F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox5
		bodyModel[175].setRotationPoint(40F, 4.5F, 20F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox6
		bodyModel[176].setRotationPoint(29F, 4.5F, 20F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F); // Import ImportImportImportBox24
		bodyModel[177].setRotationPoint(-30F, -0.5F, 18F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox25
		bodyModel[178].setRotationPoint(-24F, 3.5F, 20F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportImportImportBox26
		bodyModel[179].setRotationPoint(-32F, 3.5F, 20F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox27
		bodyModel[180].setRotationPoint(-31F, 3.5F, 20F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox28
		bodyModel[181].setRotationPoint(-34F, 4.5F, 20F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox29
		bodyModel[182].setRotationPoint(-23F, 4.5F, 20F);

		bodyModel[183].addShapeBox(-1F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F); // Import ImportImportImportBox34
		bodyModel[183].setRotationPoint(-8F, -0.5F, 18F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F); // Import ImportImportImportBox50
		bodyModel[184].setRotationPoint(12F, -0.5F, 18F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox51
		bodyModel[185].setRotationPoint(11F, 3.5F, 20F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox52
		bodyModel[186].setRotationPoint(18F, 3.5F, 20F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox53
		bodyModel[187].setRotationPoint(19F, 4.5F, 20F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox54
		bodyModel[188].setRotationPoint(8F, 4.5F, 20F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportImportImportBox55
		bodyModel[189].setRotationPoint(10F, 3.5F, 20F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox57
		bodyModel[190].setRotationPoint(-2F, 4.5F, 20F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox58
		bodyModel[191].setRotationPoint(-3F, 3.5F, 20F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox59
		bodyModel[192].setRotationPoint(-10F, 3.5F, 20F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportImportImportBox60
		bodyModel[193].setRotationPoint(-11F, 3.5F, 20F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox61
		bodyModel[194].setRotationPoint(-13F, 4.5F, 20F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Import ImportImportImportBox70
		bodyModel[195].setRotationPoint(33F, -0.5F, -22F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox71
		bodyModel[196].setRotationPoint(32F, 3.5F, -23F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox72
		bodyModel[197].setRotationPoint(39F, 3.5F, -23F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportImportImportBox73
		bodyModel[198].setRotationPoint(31F, 3.5F, -23F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox74
		bodyModel[199].setRotationPoint(40F, 4.5F, -27F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox75
		bodyModel[200].setRotationPoint(29F, 4.5F, -27F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Import ImportImportImportBox76
		bodyModel[201].setRotationPoint(-30F, -0.5F, -22F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox77
		bodyModel[202].setRotationPoint(-24F, 3.5F, -23F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportImportImportBox78
		bodyModel[203].setRotationPoint(-32F, 3.5F, -23F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox79
		bodyModel[204].setRotationPoint(-34F, 4.5F, -27F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox80
		bodyModel[205].setRotationPoint(-23F, 4.5F, -27F);

		bodyModel[206].addShapeBox(-1F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Import ImportImportImportBox81
		bodyModel[206].setRotationPoint(-8F, -0.5F, -22F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Import ImportImportImportBox82
		bodyModel[207].setRotationPoint(12F, -0.5F, -22F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox83
		bodyModel[208].setRotationPoint(11F, 3.5F, -23F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox84
		bodyModel[209].setRotationPoint(18F, 3.5F, -23F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox85
		bodyModel[210].setRotationPoint(19F, 4.5F, -27F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox86
		bodyModel[211].setRotationPoint(8F, 4.5F, -27F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportImportImportBox87
		bodyModel[212].setRotationPoint(10F, 3.5F, -23F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox88
		bodyModel[213].setRotationPoint(-2F, 4.5F, -27F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox89
		bodyModel[214].setRotationPoint(-3F, 3.5F, -23F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox90
		bodyModel[215].setRotationPoint(-10F, 3.5F, -23F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportImportImportBox91
		bodyModel[216].setRotationPoint(-11F, 3.5F, -23F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox92
		bodyModel[217].setRotationPoint(-13F, 4.5F, -27F);

		bodyModel[218].addShapeBox(0F, 0F, -0.5F, 76, 3, 8, 0F, 5F, 0F, 0F, 5F, 1F, 0F, 5F, 1F, 0F, 5F, 0F, 0F, 2F, 1F, -2F, 2F, 1F, -2F, 2F, 1F, 0F, 2F, 1F, 0F); // Import ImportImportImportBox96
		bodyModel[218].setRotationPoint(-33F, 2.5F, 13F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 26, 4, 64, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImporttoadd
		bodyModel[219].setRotationPoint(-17F, -18.5F, -32F);

		bodyModel[220].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Importwheel
		bodyModel[220].setRotationPoint(0F, 0F, 0F);

		bodyModel[221].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Importwheel
		bodyModel[221].setRotationPoint(0F, 0F, 0F);


		turretModel = new ModelRendererTurbo[84];
		turretModel[0] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Import ImportImportImportBox59
		turretModel[1] = new ModelRendererTurbo(this, 345, 305, textureX, textureY); // Import ImportImportImportBox188
		turretModel[2] = new ModelRendererTurbo(this, 385, 305, textureX, textureY); // Import ImportImportImportBox66
		turretModel[3] = new ModelRendererTurbo(this, 401, 305, textureX, textureY); // Import ImportImportImportBox68
		turretModel[4] = new ModelRendererTurbo(this, 369, 305, textureX, textureY); // Import ImportImportImportBox64
		turretModel[5] = new ModelRendererTurbo(this, 81, 321, textureX, textureY); // Import ImportImportImportBox67
		turretModel[6] = new ModelRendererTurbo(this, 169, 321, textureX, textureY); // Import ImportImportImportBox73
		turretModel[7] = new ModelRendererTurbo(this, 225, 321, textureX, textureY); // Import ImportImportImportBox60
		turretModel[8] = new ModelRendererTurbo(this, 265, 321, textureX, textureY); // Import ImportImportImportBox74
		turretModel[9] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Import ImportImportImportBox162
		turretModel[10] = new ModelRendererTurbo(this, 321, 329, textureX, textureY); // Import ImportImportImportBox61
		turretModel[11] = new ModelRendererTurbo(this, 393, 345, textureX, textureY); // Import ImportImportImportBox62
		turretModel[12] = new ModelRendererTurbo(this, 449, 305, textureX, textureY); // Import ImportImportImportBox161
		turretModel[13] = new ModelRendererTurbo(this, 65, 361, textureX, textureY); // Import ImportImportImportBox57
		turretModel[14] = new ModelRendererTurbo(this, 137, 321, textureX, textureY); // Import ImportImportImportBox55
		turretModel[15] = new ModelRendererTurbo(this, 225, 353, textureX, textureY); // Import ImportImportImportBox56
		turretModel[16] = new ModelRendererTurbo(this, 145, 321, textureX, textureY); // Import ImportImportImportBox72
		turretModel[17] = new ModelRendererTurbo(this, 121, 361, textureX, textureY); // Import ImportImportImportBox71
		turretModel[18] = new ModelRendererTurbo(this, 65, 329, textureX, textureY); // Import ImportImportImportBox75
		turretModel[19] = new ModelRendererTurbo(this, 465, 329, textureX, textureY); // Import ImportImportImportBox74
		turretModel[20] = new ModelRendererTurbo(this, 465, 353, textureX, textureY); // Import ImportImportImportBox214
		turretModel[21] = new ModelRendererTurbo(this, 265, 361, textureX, textureY); // Import ImportImportImportBox218
		turretModel[22] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Import ImportImportImportBox215
		turretModel[23] = new ModelRendererTurbo(this, 185, 369, textureX, textureY); // Import ImportImportImportBox217
		turretModel[24] = new ModelRendererTurbo(this, 297, 369, textureX, textureY); // Import ImportImportImportBox219
		turretModel[25] = new ModelRendererTurbo(this, 49, 377, textureX, textureY); // Import ImportImportImportBox76
		turretModel[26] = new ModelRendererTurbo(this, 329, 377, textureX, textureY); // Import ImportImportImportBox216
		turretModel[27] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Import ImportImportImportBox176
		turretModel[28] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Import ImportImportImportBox177
		turretModel[29] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Import ImportImportImportBox178
		turretModel[30] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import ImportImportImportBox181
		turretModel[31] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Import ImportImportImportBox180
		turretModel[32] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Import ImportImportImportBox179
		turretModel[33] = new ModelRendererTurbo(this, 225, 321, textureX, textureY); // Import ImportImportImportBox388
		turretModel[34] = new ModelRendererTurbo(this, 273, 321, textureX, textureY); // Import ImportImportImportBox389
		turretModel[35] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Import ImportImportImportBox391
		turretModel[36] = new ModelRendererTurbo(this, 321, 329, textureX, textureY); // Import ImportImportImportBox394
		turretModel[37] = new ModelRendererTurbo(this, 393, 337, textureX, textureY); // Import ImportImportImportBox395
		turretModel[38] = new ModelRendererTurbo(this, 121, 401, textureX, textureY); // Import ImportImportImportBox397
		turretModel[39] = new ModelRendererTurbo(this, 1, 345, textureX, textureY); // Import ImportImportImportBox398
		turretModel[40] = new ModelRendererTurbo(this, 489, 353, textureX, textureY); // Import ImportImportImportBox0
		turretModel[41] = new ModelRendererTurbo(this, 33, 377, textureX, textureY); // Import ImportImportImportBox1
		turretModel[42] = new ModelRendererTurbo(this, 393, 417, textureX, textureY); // Import ImportImportImportBox2
		turretModel[43] = new ModelRendererTurbo(this, 441, 417, textureX, textureY); // Import ImportImportImportBox4
		turretModel[44] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Import ImportImportImportBox7
		turretModel[45] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Import ImportImportImportBox8
		turretModel[46] = new ModelRendererTurbo(this, 457, 329, textureX, textureY); // Import ImportImportImportBox18
		turretModel[47] = new ModelRendererTurbo(this, 441, 201, textureX, textureY); // Import ImportImportImportBox23
		turretModel[48] = new ModelRendererTurbo(this, 225, 337, textureX, textureY); // Import ImportImportImportBox24
		turretModel[49] = new ModelRendererTurbo(this, 337, 209, textureX, textureY); // Import ImportImportImportBox25
		turretModel[50] = new ModelRendererTurbo(this, 273, 337, textureX, textureY); // Import ImportImportImportBox26
		turretModel[51] = new ModelRendererTurbo(this, 65, 353, textureX, textureY); // Import ImportImportImportBox27
		turretModel[52] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Import ImportImportImportBox0
		turretModel[53] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Import ImportImportImportBox3
		turretModel[54] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Import ImportImportImportBox15
		turretModel[55] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Import ImportImportImportBox16
		turretModel[56] = new ModelRendererTurbo(this, 249, 193, textureX, textureY); // Import ImportImportImportBox29
		turretModel[57] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import ImportImportImportBox30
		turretModel[58] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import ImportImportImportBox31
		turretModel[59] = new ModelRendererTurbo(this, 377, 433, textureX, textureY); // Import ImportImportImportBox36
		turretModel[60] = new ModelRendererTurbo(this, 73, 433, textureX, textureY); // Import ImportImportImportBox37
		turretModel[61] = new ModelRendererTurbo(this, 145, 409, textureX, textureY); // Import ImportImportImportBox40
		turretModel[62] = new ModelRendererTurbo(this, 417, 433, textureX, textureY); // Import ImportImportImportBox41
		turretModel[63] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Import ImportImportImportBox0
		turretModel[64] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Import ImportImportImportBox1
		turretModel[65] = new ModelRendererTurbo(this, 176, 456, textureX, textureY); // Import ImportImportImportImportBox395
		turretModel[66] = new ModelRendererTurbo(this, 163, 462, textureX, textureY); // Import ImportImportImportImportBox397
		turretModel[67] = new ModelRendererTurbo(this, 175, 465, textureX, textureY); // Import ImportImportImportImportMG42
		turretModel[68] = new ModelRendererTurbo(this, 203, 450, textureX, textureY); // Import ImportImportImportImportMG42
		turretModel[69] = new ModelRendererTurbo(this, 194, 445, textureX, textureY); // Import ImportImportImportImportMG42
		turretModel[70] = new ModelRendererTurbo(this, 207, 465, textureX, textureY); // Import ImportImportImportImportMG42
		turretModel[71] = new ModelRendererTurbo(this, 175, 447, textureX, textureY); // Import ImportImportImportImportMG42
		turretModel[72] = new ModelRendererTurbo(this, 208, 443, textureX, textureY); // Import ImportImportImportImportMG42
		turretModel[73] = new ModelRendererTurbo(this, 186, 450, textureX, textureY); // Import ImportImportImportImportMG42
		turretModel[74] = new ModelRendererTurbo(this, 205, 471, textureX, textureY); // Import ImportImportImportImportMG42
		turretModel[75] = new ModelRendererTurbo(this, 217, 456, textureX, textureY); // Import ImportImportImportImportMG42
		turretModel[76] = new ModelRendererTurbo(this, 147, 469, textureX, textureY); // Import ImportImportImportImportMG42
		turretModel[77] = new ModelRendererTurbo(this, 216, 446, textureX, textureY); // Import ImportImportImportImportMG42
		turretModel[78] = new ModelRendererTurbo(this, 207, 459, textureX, textureY); // Import ImportImportImportImportMG42
		turretModel[79] = new ModelRendererTurbo(this, 178, 473, textureX, textureY); // Import ImportImportImportImportMG42
		turretModel[80] = new ModelRendererTurbo(this, 216, 474, textureX, textureY); // Import ImportImportImportImportMG42
		turretModel[81] = new ModelRendererTurbo(this, 169, 460, textureX, textureY); // Import ImportImportImportImportMG42
		turretModel[82] = new ModelRendererTurbo(this, 139, 458, textureX, textureY); // Import ImportImportImportImportMG42
		turretModel[83] = new ModelRendererTurbo(this, 153, 449, textureX, textureY); // Import ImportImportImportImportBox416

		turretModel[0].addShapeBox(12F, -13F, -11F, 10, 5, 4, 0F, 0F, 0F, 1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -5F, 0F, 1F, 0F, 0F, 0F, 0F, -6F); // Import ImportImportImportBox59
		turretModel[0].setRotationPoint(2F, -17F, -4F);

		turretModel[1].addShapeBox(22F, -13.5F, -8F, 2, 3, 16, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Import ImportImportImportBox188
		turretModel[1].setRotationPoint(2F, -17F, 0F);

		turretModel[2].addShapeBox(22F, -16.5F, -8F, 2, 3, 16, 0F, 0F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Import ImportImportImportBox66
		turretModel[2].setRotationPoint(2F, -18F, 0F);

		turretModel[3].addShapeBox(12F, -13F, -11F, 10, 5, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox68
		turretModel[3].setRotationPoint(2F, -17F, 0F);

		turretModel[4].addShapeBox(12F, -13F, 11F, 10, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.8F, 0F, 0F, -6F, 1F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 2F); // Import ImportImportImportBox64
		turretModel[4].setRotationPoint(2F, -17F, 0F);

		turretModel[5].addShapeBox(12F, -19F, -15F, 10, 6, 30, 0F, 0F, 0F, 1.5F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.8F); // Import ImportImportImportBox67
		turretModel[5].setRotationPoint(2F, -17F, 0F);

		turretModel[6].addShapeBox(3F, -19F, -17F, 9, 10, 34, 0F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 1F, 4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 4F); // Import ImportImportImportBox73
		turretModel[6].setRotationPoint(2F, -17F, 0F);

		turretModel[7].addShapeBox(12F, -20F, -14F, 8, 1, 28, 0F, 0F, 0F, 0F, -2F, -1F, -4F, -2F, -1F, -4F, 0F, 0F, 0F, 0F, 1F, 2.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 2.5F); // Import ImportImportImportBox60
		turretModel[7].setRotationPoint(2F, -18F, 0F);

		turretModel[8].addShapeBox(3F, -20F, -17F, 9, 1, 34, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 1F, 2F, 0F, 1F, -0.51F, 0F, 1F, -0.51F, 0F, 1F, 2F); // Import ImportImportImportBox74
		turretModel[8].setRotationPoint(2F, -18F, 0F);

		turretModel[9].addShapeBox(-11F, -18F, -16.5F, 12, 7, 35, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 1F, 2.5F, 0F, 1F, 3F, 0F, 1F, 3F, 0F, 1F, 2.5F); // Import ImportImportImportBox162
		turretModel[9].setRotationPoint(0F, -17F, -1F);

		turretModel[10].addShapeBox(-14F, -19F, -17F, 17, 10, 34, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 1F, 3F, 0F, 1F, 4F, 0F, 1F, 4F, 0F, 1F, 3F); // Import ImportImportImportBox61
		turretModel[10].setRotationPoint(2F, -17F, 0F);

		turretModel[11].addShapeBox(-14F, -20F, -16F, 17, 1, 32, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 1F, 2F, 0F, 1F, 3F, 0F, 1F, 3F, 0F, 1F, 2F); // Import ImportImportImportBox62
		turretModel[11].setRotationPoint(2F, -18F, 0F);

		turretModel[12].addShapeBox(-17F, -18F, -17F, 8, 11, 2, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 2F); // Import ImportImportImportBox161
		turretModel[12].setRotationPoint(-3F, -18F, -2F);

		turretModel[13].addShapeBox(-22F, -20F, -18F, 8, 2, 36, 0F, -4F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import ImportImportImportBox57
		turretModel[13].setRotationPoint(2F, -18F, 0F);

		turretModel[14].addShapeBox(-22F, -18F, 17F, 8, 11, 2, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F); // Import ImportImportImportBox55
		turretModel[14].setRotationPoint(2F, -18F, 0F);

		turretModel[15].addShapeBox(-24F, -18F, -16F, 2, 11, 32, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Import ImportImportImportBox56
		turretModel[15].setRotationPoint(2F, -18F, 0F);

		turretModel[16].addShapeBox(-27F, -20F, -10F, 8, 8, 18, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportImportImportBox72
		turretModel[16].setRotationPoint(0F, -15F, 1F);

		turretModel[17].addShapeBox(-27F, -20F, -11F, 11, 3, 20, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F); // Import ImportImportImportBox71
		turretModel[17].setRotationPoint(0F, -18F, 1F);

		turretModel[18].addShapeBox(-22F, -37F, -7.5F, 4, 2, 15, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import ImportImportImportBox75
		turretModel[18].setRotationPoint(2F, -2F, 0F);

		turretModel[19].addBox(-18F, -36F, -7.5F, 8, 1, 15, 0F); // Import ImportImportImportBox74
		turretModel[19].setRotationPoint(2F, -3F, 0F);

		turretModel[20].addShapeBox(-21.5F, -37F, -7F, 4, 2, 14, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import ImportImportImportBox214
		turretModel[20].setRotationPoint(2F, -4F, 0F);

		turretModel[21].addBox(-18F, -39F, -7.5F, 8, 1, 15, 0F); // Import ImportImportImportBox218
		turretModel[21].setRotationPoint(2F, -3F, 0F);

		turretModel[22].addBox(-17.5F, -37F, -7F, 7, 2, 14, 0F); // Import ImportImportImportBox215
		turretModel[22].setRotationPoint(2F, -4F, 0F);

		turretModel[23].addShapeBox(-22F, -39F, -7.5F, 4, 1, 15, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import ImportImportImportBox217
		turretModel[23].setRotationPoint(2F, -3F, 0F);

		turretModel[24].addShapeBox(-10F, -39F, -7.5F, 4, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import ImportImportImportBox219
		turretModel[24].setRotationPoint(2F, -3F, 0F);

		turretModel[25].addShapeBox(-10F, -37F, -7.5F, 4, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import ImportImportImportBox76
		turretModel[25].setRotationPoint(2F, -2F, 0F);

		turretModel[26].addShapeBox(-10.5F, -37F, -7F, 4, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import ImportImportImportBox216
		turretModel[26].setRotationPoint(2F, -4F, 0F);

		turretModel[27].addBox(22F, -8F, 9F, 4, 1, 1, 0F); // Import ImportImportImportBox176
		turretModel[27].setRotationPoint(1F, -18F, 0F);
		turretModel[27].rotateAngleY = 0.4712389F;
		turretModel[27].rotateAngleZ = 0.43633231F;

		turretModel[28].addBox(22F, -8F, 9F, 4, 1, 1, 0F); // Import ImportImportImportBox177
		turretModel[28].setRotationPoint(2F, -18F, 0F);
		turretModel[28].rotateAngleY = 0.38397244F;
		turretModel[28].rotateAngleZ = 0.40142573F;

		turretModel[29].addBox(23F, -8F, 9F, 4, 1, 1, 0F); // Import ImportImportImportBox178
		turretModel[29].setRotationPoint(2F, -18F, 0F);
		turretModel[29].rotateAngleY = 0.29670597F;
		turretModel[29].rotateAngleZ = 0.36651914F;

		turretModel[30].addBox(23.5F, -10F, -5F, 4, 1, 1, 0F); // Import ImportImportImportBox181
		turretModel[30].setRotationPoint(2F, -17.5F, -1F);
		turretModel[30].rotateAngleY = -0.62831853F;
		turretModel[30].rotateAngleZ = 0.36651914F;

		turretModel[31].addBox(24.5F, -8.5F, -5F, 4, 1, 1, 0F); // Import ImportImportImportBox180
		turretModel[31].setRotationPoint(2F, -17.5F, -1F);
		turretModel[31].rotateAngleY = -0.54105207F;
		turretModel[31].rotateAngleZ = 0.40142573F;

		turretModel[32].addBox(25.5F, -7F, -5F, 4, 1, 1, 0F); // Import ImportImportImportBox179
		turretModel[32].setRotationPoint(2F, -17.5F, -1F);
		turretModel[32].rotateAngleY = -0.45378561F;
		turretModel[32].rotateAngleZ = 0.43633231F;

		turretModel[33].addShapeBox(-16F, -20F, -26F, 10, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox388
		turretModel[33].setRotationPoint(0F, -18F, 0F);

		turretModel[34].addShapeBox(-16F, -20F, 25F, 10, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox389
		turretModel[34].setRotationPoint(0F, -18F, 0F);

		turretModel[35].addShapeBox(-29F, -20F, 25F, 13, 11, 1, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Import ImportImportImportBox391
		turretModel[35].setRotationPoint(0F, -18F, 0F);

		turretModel[36].addShapeBox(-41F, -20F, 15F, 12, 11, 1, 0F, -9F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -11F, -9F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -11F); // Import ImportImportImportBox394
		turretModel[36].setRotationPoint(0F, -18F, 0F);

		turretModel[37].addShapeBox(-29F, -20F, -26F, 13, 11, 1, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F); // Import ImportImportImportBox395
		turretModel[37].setRotationPoint(0F, -18F, 0F);

		turretModel[38].addShapeBox(-33F, -20F, -5F, 1, 11, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox397
		turretModel[38].setRotationPoint(0F, -18F, 0F);

		turretModel[39].addShapeBox(-41F, -20F, -16F, 12, 11, 1, 0F, -8F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 10F, -8F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 10F); // Import ImportImportImportBox398
		turretModel[39].setRotationPoint(0F, -18F, 0F);

		turretModel[40].addShapeBox(-6F, -20F, 25F, 10, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox0
		turretModel[40].setRotationPoint(0F, -18F, 0F);

		turretModel[41].addShapeBox(-6F, -20F, -26F, 10, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox1
		turretModel[41].setRotationPoint(0F, -18F, 0F);

		turretModel[42].addShapeBox(4F, -20F, 25F, 20, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F); // Import ImportImportImportBox2
		turretModel[42].setRotationPoint(0F, -18F, 0F);

		turretModel[43].addShapeBox(4F, -20F, -20F, 20, 11, 1, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Import ImportImportImportBox4
		turretModel[43].setRotationPoint(0F, -18F, 0F);

		turretModel[44].addShapeBox(24F, -20F, -14F, 5, 11, 1, 0F, 0F, 0F, 6F, 0.5F, -7F, 0F, 0F, -7F, -1F, 0F, 0F, -6F, 0F, 0F, 6F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -6F); // Import ImportImportImportBox7
		turretModel[44].setRotationPoint(0F, -18F, 0F);

		turretModel[45].addShapeBox(24F, -20F, 13F, 5, 11, 1, 0F, 0F, 0F, -6F, 0F, -7F, -1F, 0.5F, -7F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 6F); // Import ImportImportImportBox8
		turretModel[45].setRotationPoint(0F, -18F, 0F);

		turretModel[46].addShapeBox(-0.5F, -19F, -25F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import ImportImportImportBox18
		turretModel[46].setRotationPoint(2F, -18F, 0F);

		turretModel[47].addShapeBox(-10.5F, -19F, -28.5F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import ImportImportImportBox23
		turretModel[47].setRotationPoint(2F, -18F, 0F);
		turretModel[47].rotateAngleY = -0.34906585F;

		turretModel[48].addShapeBox(5.5F, -19F, -25F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import ImportImportImportBox24
		turretModel[48].setRotationPoint(2F, -18F, 0F);
		turretModel[48].rotateAngleY = 0.27925268F;

		turretModel[49].addShapeBox(-10.5F, -19F, 17.5F, 1, 1, 11, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox25
		turretModel[49].setRotationPoint(2F, -18F, 0F);
		turretModel[49].rotateAngleY = 0.34906585F;

		turretModel[50].addShapeBox(-0.5F, -19F, 15F, 1, 1, 10, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox26
		turretModel[50].setRotationPoint(2F, -18F, 0F);

		turretModel[51].addShapeBox(5.5F, -19F, 16F, 1, 1, 9, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox27
		turretModel[51].setRotationPoint(2F, -18F, 0F);
		turretModel[51].rotateAngleY = -0.27925268F;

		turretModel[52].addShapeBox(20F, -16F, 10F, 3, 3, 2, 0F, 0F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Import ImportImportImportBox0
		turretModel[52].setRotationPoint(2F, -18F, 0F);

		turretModel[53].addShapeBox(20F, -16F, -11F, 3, 3, 1, 0F, 0F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Import ImportImportImportBox3
		turretModel[53].setRotationPoint(2F, -18F, 0F);

		turretModel[54].addShapeBox(3.5F, -20F, 25.3F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox15
		turretModel[54].setRotationPoint(0F, -18F, 0F);

		turretModel[55].addShapeBox(3.5F, -20F, -26.3F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox16
		turretModel[55].setRotationPoint(0F, -18F, 0F);

		turretModel[56].addBox(11F, -35.5F, -5.5F, 3, 2, 5, 0F); // Import ImportImportImportBox29
		turretModel[56].setRotationPoint(2F, -3F, 0F);

		turretModel[57].addShapeBox(10F, -35.5F, -5.5F, 1, 2, 5, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import ImportImportImportBox30
		turretModel[57].setRotationPoint(2F, -3F, 0F);

		turretModel[58].addShapeBox(14F, -35.5F, -5.5F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportImportImportBox31
		turretModel[58].setRotationPoint(2F, -3F, 0F);

		turretModel[59].addShapeBox(-30F, -20F, -9F, 3, 3, 16, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Import ImportImportImportBox36
		turretModel[59].setRotationPoint(0F, -18F, 1F);

		turretModel[60].addShapeBox(-32F, -20F, -7F, 2, 3, 12, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Import ImportImportImportBox37
		turretModel[60].setRotationPoint(0F, -18F, 1F);

		turretModel[61].addShapeBox(-32F, -17F, -6F, 2, 8, 10, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Import ImportImportImportBox40
		turretModel[61].setRotationPoint(0F, -18F, 1F);

		turretModel[62].addShapeBox(-30F, -17F, -8F, 3, 8, 14, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Import ImportImportImportBox41
		turretModel[62].setRotationPoint(0F, -18F, 1F);

		turretModel[63].addShapeBox(-16.5F, -20F, 25.3F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox0
		turretModel[63].setRotationPoint(0F, -18F, 0F);

		turretModel[64].addShapeBox(-16.5F, -20F, -26.3F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox1
		turretModel[64].setRotationPoint(0F, -18F, 0F);

		turretModel[65].addBox(11F, -35.5F, -5.5F, 10, 1, 1, 0F); // Import ImportImportImportImportBox395
		turretModel[65].setRotationPoint(-15F, -5F, 5F);

		turretModel[66].addBox(11F, -35.5F, -5.5F, 1, 6, 1, 0F); // Import ImportImportImportImportBox397
		turretModel[66].setRotationPoint(-6F, -10F, 5F);

		turretModel[67].addShapeBox(11F, -35.5F, -5.5F, 11, 1, 1, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0.1F); // Import ImportImportImportImportMG42
		turretModel[67].setRotationPoint(-6F, -11F, 5F);

		turretModel[68].addShapeBox(9F, -35.5F, -5.5F, 1, 1, 1, 0F, 0.1F, 0.05F, 0.05F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.05F, 0.05F, 0.1F, 0.05F, 0.05F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.05F, 0.05F); // Import ImportImportImportImportMG42
		turretModel[68].setRotationPoint(7F, -11F, 5F);

		turretModel[69].addShapeBox(9F, -35.5F, -5.5F, 1, 1, 1, 0F, 0.1F, -0.1F, -0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.1F, -0.1F); // Import ImportImportImportImportMG42
		turretModel[69].setRotationPoint(8F, -11F, 5F);

		turretModel[70].addShapeBox(11F, -35.5F, -5.5F, 8, 1, 1, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Import ImportImportImportImportMG42
		turretModel[70].setRotationPoint(-14F, -11F, 5F);

		turretModel[71].addShapeBox(11F, -35.5F, -5.5F, 3, 1, 1, 0F, 0.1F, 0.1F, -0.15F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, -0.15F, 0.1F, 0.1F, -0.15F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, -0.15F); // Import ImportImportImportImportMG42
		turretModel[71].setRotationPoint(-17F, -11F, 5F);

		turretModel[72].addShapeBox(11.5F, -35.5F, -5.5F, 1, 3, 1, 0F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 1.1F, -0.7F, -0.1F, -0.9F, -0.4F, -0.1F, -0.9F, -0.4F, -0.1F, 1F, -0.7F, -0.1F); // Import ImportImportImportImportMG42
		turretModel[72].setRotationPoint(-11F, -10F, 5F);

		turretModel[73].addShapeBox(11.5F, -35.5F, -5.5F, 2, 1, 1, 0F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F); // Import ImportImportImportImportMG42
		turretModel[73].setRotationPoint(-11F, -10F, 5F);

		turretModel[74].addShapeBox(11F, -35.5F, -5.5F, 2, 1, 1, 0F, 0.6F, -0.4F, -0.15F, -1.9F, -0.4F, -0.1F, -1.9F, -0.4F, -0.1F, 0.6F, -0.4F, -0.15F, 0.1F, 0.1F, -0.15F, 0.1F, 0.1F, 0.02F, 0.1F, 0.1F, 0.02F, 0.1F, 0.1F, -0.15F); // Import ImportImportImportImportMG42
		turretModel[74].setRotationPoint(-17F, -12.2F, 5F);

		turretModel[75].addShapeBox(11F, -35.5F, -5.5F, 3, 1, 1, 0F, 0.1F, 0.1F, -0.15F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, -0.15F, 0.1F, 0.1F, -0.15F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, 0.1F, 0.1F, -0.15F); // Import ImportImportImportImportMG42
		turretModel[75].setRotationPoint(-17F, -9.8F, 5F);

		turretModel[76].addShapeBox(11F, -35.5F, -5.5F, 1, 1, 1, 0F, -0.4F, -0.25F, 0F, -0.1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import ImportImportImportImportMG42
		turretModel[76].setRotationPoint(-9.2F, -11F, 4.1F);

		turretModel[77].addShapeBox(9F, -35.5F, -5.5F, 2, 1, 1, 0F, -0.1F, -0.2F, -0.3F, -0.9F, -0.2F, -0.3F, -0.9F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F); // Import ImportImportImportImportMG42
		turretModel[77].setRotationPoint(-3F, -12.2F, 5F);

		turretModel[78].addShapeBox(9F, -35.5F, -5.5F, 1, 1, 1, 0F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.1F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F); // Import ImportImportImportImportMG42
		turretModel[78].setRotationPoint(5F, -12.2F, 5F);

		turretModel[79].addShapeBox(11F, -35.5F, -5.5F, 8, 1, 1, 0F, -4.9F, -0.5F, 0.1F, -0.3F, -0.5F, 0.1F, -0.3F, -0.5F, 0.1F, -4.9F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Import ImportImportImportImportMG42
		turretModel[79].setRotationPoint(-14F, -12.1F, 5F);

		turretModel[80].addShapeBox(11F, -35.5F, -5.5F, 1, 2, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import ImportImportImportImportMG42
		turretModel[80].setRotationPoint(-9F, -11.5F, 4F);

		turretModel[81].addShapeBox(11F, -35.5F, -5.5F, 2, 1, 1, 0F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F); // Import ImportImportImportImportMG42
		turretModel[81].setRotationPoint(-8.6F, -11.2F, 5.3F);

		turretModel[82].addShapeBox(11F, -35.5F, -5.5F, 1, 0, 3, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Import ImportImportImportImportMG42
		turretModel[82].setRotationPoint(-8.1F, -10.5F, -2F);
		turretModel[82].rotateAngleX = -0.20943951F;

		turretModel[83].addBox(11F, -35.5F, -5.5F, 2, 3, 4, 0F); // Import ImportImportImportImportBox416
		turretModel[83].setRotationPoint(-8.6F, -10.4F, 5F);


		barrelModel = new ModelRendererTurbo[22];
		barrelModel[0] = new ModelRendererTurbo(this, 1, 510, textureX, textureY); // Import ImportImportImportBox77
		barrelModel[1] = new ModelRendererTurbo(this, 473, 313, textureX, textureY); // Import ImportImportImportBox64
		barrelModel[2] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import ImportImportImportBox203
		barrelModel[3] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Import ImportImportImportBox67
		barrelModel[4] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import ImportImportImportBox204
		barrelModel[5] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Import ImportImportImportBox63
		barrelModel[6] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import ImportImportImportBox68
		barrelModel[7] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Import ImportImportImportBox246
		barrelModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportImportImportBox248
		barrelModel[9] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import ImportImportImportBox247
		barrelModel[10] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Import ImportImportImportBox245
		barrelModel[11] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Import ImportImportImportBox249
		barrelModel[12] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Import ImportImportImportBox250
		barrelModel[13] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Import ImportImportImportBox237
		barrelModel[14] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Import ImportImportImportBox238
		barrelModel[15] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import ImportImportImportBox239
		barrelModel[16] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Import ImportImportImportBox242
		barrelModel[17] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import ImportImportImportBox244
		barrelModel[18] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Import ImportImportImportBox243
		barrelModel[19] = new ModelRendererTurbo(this, 11, 510, textureX, textureY); // Import ImportImportImportBox77
		barrelModel[20] = new ModelRendererTurbo(this, 1, 510, textureX, textureY); // Import ImportImportImportBox77
		barrelModel[21] = new ModelRendererTurbo(this, 0, 506, textureX, textureY); // Import ImportImportImportBox77

		barrelModel[0].addShapeBox(2F, -7F, -7F, 1, 1, 1, 0F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.1F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F); // Import ImportImportImportBox77
		barrelModel[0].setRotationPoint(28F, -25F, 0F);

		barrelModel[1].addShapeBox(-3F, -3F, -4F, 9, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox64
		barrelModel[1].setRotationPoint(25F, -31F, 0F);

		barrelModel[2].addShapeBox(6F, -3F, -4F, 1, 5, 10, 0F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Import ImportImportImportBox203
		barrelModel[2].setRotationPoint(25F, -31F, 0F);

		barrelModel[3].addShapeBox(6F, -2F, -0.5F, 6, 3, 3, 0F, 0F, 0.8F, 0.8F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.8F, 0.8F); // Import ImportImportImportBox67
		barrelModel[3].setRotationPoint(25F, -31F, 0F);

		barrelModel[4].addShapeBox(12F, -2F, 0F, 1, 3, 3, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F); // Import ImportImportImportBox204
		barrelModel[4].setRotationPoint(25F, -31F, -0.5F);

		barrelModel[5].addShapeBox(-2F, -2F, -0.5F, 49, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox63
		barrelModel[5].setRotationPoint(25F, -31F, 0F);

		barrelModel[6].addShapeBox(47F, -2F, -0.5F, 2, 3, 3, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0F, 0F); // Import ImportImportImportBox68
		barrelModel[6].setRotationPoint(25F, -31F, 0F);

		barrelModel[7].addShapeBox(55F, 1F, -1.5F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportImportImportBox246
		barrelModel[7].setRotationPoint(25F, -31F, 0F);

		barrelModel[8].addShapeBox(55F, -2F, -1.5F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox248
		barrelModel[8].setRotationPoint(25F, -31F, 0F);

		barrelModel[9].addShapeBox(55F, -2F, 2.5F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox247
		barrelModel[9].setRotationPoint(25F, -31F, 0F);

		barrelModel[10].addShapeBox(55F, -3F, -1.5F, 2, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox245
		barrelModel[10].setRotationPoint(25F, -31F, 0F);

		barrelModel[11].addShapeBox(53F, -3F, -0.5F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox249
		barrelModel[11].setRotationPoint(25F, -31F, 0F);

		barrelModel[12].addShapeBox(53F, 1F, -0.5F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox250
		barrelModel[12].setRotationPoint(25F, -31F, 0F);

		barrelModel[13].addShapeBox(49F, -2.5F, 0F, 3, 1, 2, 0F, 0F, -0.3F, 0.8F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.3F, 0.8F, 0F, -0.7F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.7F, 0.8F); // Import ImportImportImportBox237
		barrelModel[13].setRotationPoint(25F, -31F, 0F);

		barrelModel[14].addShapeBox(49F, 0.5F, 0F, 3, 1, 2, 0F, 0F, -0.7F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.7F, 1F, 0F, -0.3F, 1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.3F, 1F); // Import ImportImportImportBox238
		barrelModel[14].setRotationPoint(25F, -31F, 0F);

		barrelModel[15].addShapeBox(52F, -3F, -1.5F, 1, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox239
		barrelModel[15].setRotationPoint(25F, -31F, 0F);

		barrelModel[16].addShapeBox(52F, -2F, 2.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox242
		barrelModel[16].setRotationPoint(25F, -31F, 0F);

		barrelModel[17].addShapeBox(52F, 1F, -1.5F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportImportImportBox244
		barrelModel[17].setRotationPoint(25F, -31F, 0F);

		barrelModel[18].addShapeBox(52F, -2F, -1.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox243
		barrelModel[18].setRotationPoint(25F, -31F, 0F);

		barrelModel[19].addShapeBox(3F, -6F, -7F, 1, 1, 1, 0F, 0F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Import ImportImportImportBox77
		barrelModel[19].setRotationPoint(29F, -25F, 0F);

		barrelModel[20].addShapeBox(4F, -6F, -7F, 1, 1, 1, 0F, 0.1F, -0.1F, -0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.1F, -0.1F); // Import ImportImportImportBox77
		barrelModel[20].setRotationPoint(29F, -25F, 0F);

		barrelModel[21].addShapeBox(-4F, -6F, -7F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox77
		barrelModel[21].setRotationPoint(28F, -25F, 0F);


		leftTrackWheelModels = new ModelRendererTurbo[14];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 270, 450, textureX, textureY); // Import ImportImportImportShape6
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 270, 450, textureX, textureY); // Import ImportImportImportShape19
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import ImportImportImportShape0
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import Importwheel
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import ImportImportImportShape30
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import ImportImportImportShape31
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import ImportImportImportShape33
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import ImportImportImportShape48
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import ImportImportImportShape49
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import ImportImportImportShape56
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 235, 473, textureX, textureY); // Import Importwheel
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 235, 473, textureX, textureY); // Import Importwheel
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 235, 473, textureX, textureY); // Import Importwheel
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 235, 473, textureX, textureY); // Import Importwheel

		leftTrackWheelModels[0].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3) }), 7, 13, 13, 48, 7, ModelRendererTurbo.MR_FRONT, new float[] {5 ,7 ,5 ,7 ,5 ,7 ,5 ,7}); // Import ImportImportImportShape6
		leftTrackWheelModels[0].setRotationPoint(54.5F, -4.5F, 28F);

		leftTrackWheelModels[1].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3) }), 5, 13, 13, 48, 5, ModelRendererTurbo.MR_FRONT, new float[] {5 ,7 ,5 ,7 ,5 ,7 ,5 ,7}); // Import ImportImportImportShape19
		leftTrackWheelModels[1].setRotationPoint(-48F, -3.5F, 27F);

		leftTrackWheelModels[2].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import ImportImportImportShape0
		leftTrackWheelModels[2].setRotationPoint(41F, 5.5F, 24.5F);

		leftTrackWheelModels[3].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import Importwheel
		leftTrackWheelModels[3].setRotationPoint(30F, 5.5F, 24.5F);

		leftTrackWheelModels[4].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import ImportImportImportShape30
		leftTrackWheelModels[4].setRotationPoint(-22F, 5.5F, 24.5F);

		leftTrackWheelModels[5].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import ImportImportImportShape31
		leftTrackWheelModels[5].setRotationPoint(-33F, 5.5F, 24.5F);

		leftTrackWheelModels[6].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import ImportImportImportShape33
		leftTrackWheelModels[6].setRotationPoint(-11F, 5.5F, 24.5F);

		leftTrackWheelModels[7].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import ImportImportImportShape48
		leftTrackWheelModels[7].setRotationPoint(20F, 5.5F, 24.5F);

		leftTrackWheelModels[8].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import ImportImportImportShape49
		leftTrackWheelModels[8].setRotationPoint(9F, 5.5F, 24.5F);

		leftTrackWheelModels[9].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import ImportImportImportShape56
		leftTrackWheelModels[9].setRotationPoint(-1F, 5.5F, 24.5F);

		leftTrackWheelModels[10].addShape3D(5F, -5F, -7F, new Shape2D(new Coord2D[] { new Coord2D(4, 2, 4, 2), new Coord2D(6, 2, 6, 2), new Coord2D(8, 4, 8, 4), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(4, 8, 4, 8), new Coord2D(2, 6, 2, 6), new Coord2D(2, 4, 2, 4) }), 7, 8, 8, 20, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Importwheel
		leftTrackWheelModels[10].setRotationPoint(35.5F, -7F, -26.5F);

		leftTrackWheelModels[11].addShape3D(5F, -5F, -7F, new Shape2D(new Coord2D[] { new Coord2D(4, 2, 4, 2), new Coord2D(6, 2, 6, 2), new Coord2D(8, 4, 8, 4), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(4, 8, 4, 8), new Coord2D(2, 6, 2, 6), new Coord2D(2, 4, 2, 4) }), 7, 8, 8, 20, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Importwheel
		leftTrackWheelModels[11].setRotationPoint(14.5F, -7F, -26.5F);

		leftTrackWheelModels[12].addShape3D(5F, -5F, -7F, new Shape2D(new Coord2D[] { new Coord2D(4, 2, 4, 2), new Coord2D(6, 2, 6, 2), new Coord2D(8, 4, 8, 4), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(4, 8, 4, 8), new Coord2D(2, 6, 2, 6), new Coord2D(2, 4, 2, 4) }), 7, 8, 8, 20, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Importwheel
		leftTrackWheelModels[12].setRotationPoint(-6F, -7F, -26.5F);

		leftTrackWheelModels[13].addShape3D(5F, -5F, -7F, new Shape2D(new Coord2D[] { new Coord2D(4, 2, 4, 2), new Coord2D(6, 2, 6, 2), new Coord2D(8, 4, 8, 4), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(4, 8, 4, 8), new Coord2D(2, 6, 2, 6), new Coord2D(2, 4, 2, 4) }), 7, 8, 8, 20, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Importwheel
		leftTrackWheelModels[13].setRotationPoint(-27.5F, -7F, -26.5F);


		rightTrackWheelModels = new ModelRendererTurbo[14];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 270, 450, textureX, textureY); // Import ImportImportImportShape17
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 270, 450, textureX, textureY); // Import ImportImportImportShape18
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import ImportImportImportShape62
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import ImportImportImportShape63
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import ImportImportImportShape64
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import ImportImportImportShape65
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import ImportImportImportShape66
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import ImportImportImportShape67
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import ImportImportImportShape68
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import ImportImportImportShape69
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 235, 473, textureX, textureY); // Import Importwheel
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 235, 473, textureX, textureY); // Import Importwheel
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 235, 473, textureX, textureY); // Import Importwheel
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 235, 473, textureX, textureY); // Import Importwheel

		rightTrackWheelModels[0].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3) }), 7, 13, 13, 48, 7, ModelRendererTurbo.MR_FRONT, new float[] {5 ,7 ,5 ,7 ,5 ,7 ,5 ,7}); // Import ImportImportImportShape17
		rightTrackWheelModels[0].setRotationPoint(54.5F, -4.5F, -22F);

		rightTrackWheelModels[1].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3) }), 5, 13, 13, 48, 5, ModelRendererTurbo.MR_FRONT, new float[] {5 ,7 ,5 ,7 ,5 ,7 ,5 ,7}); // Import ImportImportImportShape18
		rightTrackWheelModels[1].setRotationPoint(-47.5F, -3.5F, -23F);

		rightTrackWheelModels[2].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import ImportImportImportShape62
		rightTrackWheelModels[2].setRotationPoint(41F, 5.5F, -27.5F);

		rightTrackWheelModels[3].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import ImportImportImportShape63
		rightTrackWheelModels[3].setRotationPoint(30F, 5.5F, -27.5F);

		rightTrackWheelModels[4].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import ImportImportImportShape64
		rightTrackWheelModels[4].setRotationPoint(20F, 5.5F, -27.5F);

		rightTrackWheelModels[5].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import ImportImportImportShape65
		rightTrackWheelModels[5].setRotationPoint(9F, 5.5F, -27.5F);

		rightTrackWheelModels[6].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import ImportImportImportShape66
		rightTrackWheelModels[6].setRotationPoint(-1F, 5.5F, -27.5F);

		rightTrackWheelModels[7].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import ImportImportImportShape67
		rightTrackWheelModels[7].setRotationPoint(-11F, 5.5F, -27.5F);

		rightTrackWheelModels[8].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import ImportImportImportShape68
		rightTrackWheelModels[8].setRotationPoint(-22F, 5.5F, -27.5F);

		rightTrackWheelModels[9].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import ImportImportImportShape69
		rightTrackWheelModels[9].setRotationPoint(-33F, 5.5F, -27.5F);

		rightTrackWheelModels[10].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 2, 4, 2), new Coord2D(6, 2, 6, 2), new Coord2D(8, 4, 8, 4), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(4, 8, 4, 8), new Coord2D(2, 6, 2, 6), new Coord2D(2, 4, 2, 4) }), 7, 8, 8, 20, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Importwheel
		rightTrackWheelModels[10].setRotationPoint(35F, -7F, 26.5F);

		rightTrackWheelModels[11].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 2, 4, 2), new Coord2D(6, 2, 6, 2), new Coord2D(8, 4, 8, 4), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(4, 8, 4, 8), new Coord2D(2, 6, 2, 6), new Coord2D(2, 4, 2, 4) }), 7, 8, 8, 20, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Importwheel
		rightTrackWheelModels[11].setRotationPoint(14F, -7F, 26.5F);

		rightTrackWheelModels[12].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 2, 4, 2), new Coord2D(6, 2, 6, 2), new Coord2D(8, 4, 8, 4), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(4, 8, 4, 8), new Coord2D(2, 6, 2, 6), new Coord2D(2, 4, 2, 4) }), 7, 8, 8, 20, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Importwheel
		rightTrackWheelModels[12].setRotationPoint(-6F, -7F, 26.5F);

		rightTrackWheelModels[13].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 2, 4, 2), new Coord2D(6, 2, 6, 2), new Coord2D(8, 4, 8, 4), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(4, 8, 4, 8), new Coord2D(2, 6, 2, 6), new Coord2D(2, 4, 2, 4) }), 7, 8, 8, 20, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Importwheel
		rightTrackWheelModels[13].setRotationPoint(-27.5F, -7F, 26.5F);


		leftTrackModel = new ModelRendererTurbo[9];
		leftTrackModel[0] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Import ImportImportImportBox281
		leftTrackModel[1] = new ModelRendererTurbo(this, 313, 209, textureX, textureY); // Import ImportImportImportBox282
		leftTrackModel[2] = new ModelRendererTurbo(this, 353, 209, textureX, textureY); // Import ImportImportImportBox283
		leftTrackModel[3] = new ModelRendererTurbo(this, 393, 209, textureX, textureY); // Import ImportImportImportBox284
		leftTrackModel[4] = new ModelRendererTurbo(this, 241, 225, textureX, textureY); // Import ImportImportImportBox285
		leftTrackModel[5] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Import ImportImportImportBox286
		leftTrackModel[6] = new ModelRendererTurbo(this, 417, 225, textureX, textureY); // Import ImportImportImportBox287
		leftTrackModel[7] = new ModelRendererTurbo(this, 457, 225, textureX, textureY); // Import ImportImportImportBox288
		leftTrackModel[8] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Import ImportImportImportBox289

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 110, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox281
		leftTrackModel[0].setRotationPoint(-51F, -12.1F, -30F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox282
		leftTrackModel[1].setRotationPoint(59F, -12F, -30F);
		leftTrackModel[1].rotateAngleZ = -1.04719755F;

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox283
		leftTrackModel[2].setRotationPoint(63F, -5F, -30F);
		leftTrackModel[2].rotateAngleZ = -1.95476876F;

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 19, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox284
		leftTrackModel[3].setRotationPoint(60F, 2.4F, -30F);
		leftTrackModel[3].rotateAngleZ = -2.67035376F;

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 77, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox285
		leftTrackModel[4].setRotationPoint(43F, 11F, -30F);
		leftTrackModel[4].rotateAngleZ = -3.14159265F;

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 18, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox286
		leftTrackModel[5].setRotationPoint(-34F, 11F, -30F);
		leftTrackModel[5].rotateAngleZ = -3.43829863F;

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox287
		leftTrackModel[6].setRotationPoint(-51.2F, 5.7F, -30F);
		leftTrackModel[6].rotateAngleZ = -4.01425728F;

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox288
		leftTrackModel[7].setRotationPoint(-55.7F, 0.3F, -30F);
		leftTrackModel[7].rotateAngleZ = -4.72984227F;

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox289
		leftTrackModel[8].setRotationPoint(-55.7F, -6.7F, -30F);
		leftTrackModel[8].rotateAngleZ = -5.44542727F;


		rightTrackModel = new ModelRendererTurbo[9];
		rightTrackModel[0] = new ModelRendererTurbo(this, 217, 241, textureX, textureY); // Import ImportImportImportBox291
		rightTrackModel[1] = new ModelRendererTurbo(this, 257, 241, textureX, textureY); // Import ImportImportImportBox292
		rightTrackModel[2] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Import ImportImportImportBox293
		rightTrackModel[3] = new ModelRendererTurbo(this, 41, 257, textureX, textureY); // Import ImportImportImportBox294
		rightTrackModel[4] = new ModelRendererTurbo(this, 105, 257, textureX, textureY); // Import ImportImportImportBox295
		rightTrackModel[5] = new ModelRendererTurbo(this, 281, 257, textureX, textureY); // Import ImportImportImportBox296
		rightTrackModel[6] = new ModelRendererTurbo(this, 337, 257, textureX, textureY); // Import ImportImportImportBox297
		rightTrackModel[7] = new ModelRendererTurbo(this, 377, 257, textureX, textureY); // Import ImportImportImportBox298
		rightTrackModel[8] = new ModelRendererTurbo(this, 417, 257, textureX, textureY); // Import ImportImportImportBox299

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox291
		rightTrackModel[0].setRotationPoint(59F, -12F, 21F);
		rightTrackModel[0].rotateAngleZ = -1.04719755F;

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 110, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox292
		rightTrackModel[1].setRotationPoint(-51F, -12.1F, 21F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox293
		rightTrackModel[2].setRotationPoint(63F, -5F, 21F);
		rightTrackModel[2].rotateAngleZ = -1.95476876F;

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 19, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox294
		rightTrackModel[3].setRotationPoint(60F, 2.4F, 21F);
		rightTrackModel[3].rotateAngleZ = -2.67035376F;

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 77, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox295
		rightTrackModel[4].setRotationPoint(43F, 11F, 21F);
		rightTrackModel[4].rotateAngleZ = -3.14159265F;

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 18, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox296
		rightTrackModel[5].setRotationPoint(-34F, 11F, 21F);
		rightTrackModel[5].rotateAngleZ = -3.43829863F;

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox297
		rightTrackModel[6].setRotationPoint(-55.7F, 0.3F, 21F);
		rightTrackModel[6].rotateAngleZ = -4.72984227F;

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox298
		rightTrackModel[7].setRotationPoint(-51.2F, 5.7F, 21F);
		rightTrackModel[7].rotateAngleZ = -4.01425728F;

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox299
		rightTrackModel[8].setRotationPoint(-55.7F, -6.7F, 21F);
		rightTrackModel[8].rotateAngleZ = -5.44542727F;


		steeringWheelModel = new ModelRendererTurbo[5];
		steeringWheelModel[0] = new ModelRendererTurbo(this, 169, 369, textureX, textureY); // Import ImportImportImportBox17
		steeringWheelModel[1] = new ModelRendererTurbo(this, 121, 385, textureX, textureY); // Import ImportImportImportBox18
		steeringWheelModel[2] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Import ImportImportImportBox19
		steeringWheelModel[3] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import ImportImportImportBox21
		steeringWheelModel[4] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Import ImportImportImportBox0

		steeringWheelModel[0].addShapeBox(-6F, 4.5F, -3F, 6, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Import ImportImportImportBox17
		steeringWheelModel[0].setRotationPoint(-46F, -10F, 13F);

		steeringWheelModel[1].addShapeBox(-6F, 3.5F, -3F, 6, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Import ImportImportImportBox18
		steeringWheelModel[1].setRotationPoint(-46F, -10F, 13F);

		steeringWheelModel[2].addShapeBox(-4F, -0.5F, -3F, 1, 4, 1, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox19
		steeringWheelModel[2].setRotationPoint(-46F, -10F, 13F);

		steeringWheelModel[3].addShapeBox(-1F, -0.5F, -2F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox21
		steeringWheelModel[3].setRotationPoint(-46F, -10F, 13F);

		steeringWheelModel[4].addShapeBox(-4F, -0.5F, 2F, 1, 4, 1, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportBox0
		steeringWheelModel[4].setRotationPoint(-46F, -10F, 13F);



		// Passenger 3
		//ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		//gun_1_Model[0] = new ModelRendererTurbo[1];
		//gun_1_Model[0][0] = new ModelRendererTurbo(this, 1, 510, textureX, textureY); // Box 4

		//gun_1_Model[0][0].addBox(-3F, -0.5F, -0.5F, 1, 1, 1, 0F); // Box 4

		//Gun Origin
		/*for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(44F, -19F, -9.5F);
		}*/


		//gun_1_Model[1] = new ModelRendererTurbo[0];

		//gun_1_Model[2] = new ModelRendererTurbo[4];
		//gun_1_Model[2][0] = new ModelRendererTurbo(this, 0, 506, textureX, textureY); // Box 0
		//gun_1_Model[2][1] = new ModelRendererTurbo(this, 1, 510, textureX, textureY); // Box 1
		//gun_1_Model[2][2] = new ModelRendererTurbo(this, 11, 510, textureX, textureY); // Box 2
		//gun_1_Model[2][3] = new ModelRendererTurbo(this, 6, 510, textureX, textureY); // Box 3

		//gun_1_Model[2][0].addBox(-2F, -0.5F, -0.5F, 8, 1, 1, 0F); // Box 0

		/*gun_1_Model[2][1].addShapeBox(4F, -1.5F, -0.5F, 1, 1, 1, 0F,-0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.1F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F); // Box 1

		gun_1_Model[2][2].addShapeBox(6F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 2

		gun_1_Model[2][3].addShapeBox(7F, -0.5F, -0.5F, 1, 1, 1, 0F,0.1F, -0.1F, -0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.1F, -0.1F); // Box 3

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[2])
		{
			gunPart.setRotationPoint(44F, -19F, -9.5F);
		}


		registerGunModel("FrontMG", gun_1_Model);*/

		translateAll(0F, 0F, 0F);


		flipAll();
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < bodyModel.length; i++)
		{
			bodyModel[i].render(f5);
		}
		for(int i = 0; i < turretModel.length; i++)
		{
			turretModel[i].render(f5);
		}
		for(int i = 0; i < barrelModel.length; i++)
		{
			barrelModel[i].render(f5);
		}
		for(int i = 0; i < leftTrackModel.length; i++)
		{
			leftTrackModel[i].render(f5);
		}
		for(int i = 0; i < rightTrackModel.length; i++)
		{
			rightTrackModel[i].render(f5);
		}
		for(int i = 0; i < leftTrackWheelModels.length; i++)
		{
			leftTrackWheelModels[i].render(f5);
		}
		for(int i = 0; i < rightTrackWheelModels.length; i++)
		{
			rightTrackWheelModels[i].render(f5);
		}
		for(int i = 0; i < steeringWheelModel.length; i++)
		{
			steeringWheelModel[i].render(f5);
		}
	}
}