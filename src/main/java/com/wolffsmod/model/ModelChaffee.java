//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Chaffee
// Model Creator:
// Created on:-
// Last changed on: -

package com.wolffsmod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelChaffee extends ModelBase
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelChaffee()
	{
		chaffeeModel = new ModelRendererTurbo[262];
		chaffeeModel[0] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import Box2
		chaffeeModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box3
		chaffeeModel[2] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Import Box4
		chaffeeModel[3] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box5
		chaffeeModel[4] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Box8
		chaffeeModel[5] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box9
		chaffeeModel[6] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Import Box10
		chaffeeModel[7] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Import Box12
		chaffeeModel[8] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box14
		chaffeeModel[9] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Import Box15
		chaffeeModel[10] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Import Box16
		chaffeeModel[11] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Import Box17
		chaffeeModel[12] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Import Box37
		chaffeeModel[13] = new ModelRendererTurbo(this, 729, 57, textureX, textureY); // Import Box38
		chaffeeModel[14] = new ModelRendererTurbo(this, 873, 57, textureX, textureY); // Import Box39
		chaffeeModel[15] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Import Box40
		chaffeeModel[16] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Import Box41
		chaffeeModel[17] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Import Box42
		chaffeeModel[18] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Import Box43
		chaffeeModel[19] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box44
		chaffeeModel[20] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box45
		chaffeeModel[21] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box46
		chaffeeModel[22] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box47
		chaffeeModel[23] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box48
		chaffeeModel[24] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box49
		chaffeeModel[25] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box50
		chaffeeModel[26] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box51
		chaffeeModel[27] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box52
		chaffeeModel[28] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Import Box60
		chaffeeModel[29] = new ModelRendererTurbo(this, 753, 81, textureX, textureY); // Import Box61
		chaffeeModel[30] = new ModelRendererTurbo(this, 833, 89, textureX, textureY); // Import Box62
		chaffeeModel[31] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Import Box63
		chaffeeModel[32] = new ModelRendererTurbo(this, 633, 41, textureX, textureY); // Import Box64
		chaffeeModel[33] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Import Box179
		chaffeeModel[34] = new ModelRendererTurbo(this, 777, 33, textureX, textureY); // Import Box180
		chaffeeModel[35] = new ModelRendererTurbo(this, 833, 105, textureX, textureY); // Import Box181
		chaffeeModel[36] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Import Box190
		chaffeeModel[37] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Import Box191
		chaffeeModel[38] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import Box192
		chaffeeModel[39] = new ModelRendererTurbo(this, 529, 65, textureX, textureY); // Import Box193
		chaffeeModel[40] = new ModelRendererTurbo(this, 737, 33, textureX, textureY); // Import Box194
		chaffeeModel[41] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Import Box195
		chaffeeModel[42] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Import Box196
		chaffeeModel[43] = new ModelRendererTurbo(this, 529, 41, textureX, textureY); // Import Box176
		chaffeeModel[44] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Import Box177
		chaffeeModel[45] = new ModelRendererTurbo(this, 921, 41, textureX, textureY); // Import Box178
		chaffeeModel[46] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Import Box179
		chaffeeModel[47] = new ModelRendererTurbo(this, 793, 49, textureX, textureY); // Import Box180
		chaffeeModel[48] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Import Box186
		chaffeeModel[49] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Import Box187
		chaffeeModel[50] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Import Box188
		chaffeeModel[51] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import Box189
		chaffeeModel[52] = new ModelRendererTurbo(this, 529, 65, textureX, textureY); // Import Box190
		chaffeeModel[53] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import Box207
		chaffeeModel[54] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import Box208
		chaffeeModel[55] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import Box210
		chaffeeModel[56] = new ModelRendererTurbo(this, 884, 142, textureX, textureY); // Import Box214
		chaffeeModel[57] = new ModelRendererTurbo(this, 884, 142, textureX, textureY); // Import Box215
		chaffeeModel[58] = new ModelRendererTurbo(this, 884, 142, textureX, textureY); // Import Box216
		chaffeeModel[59] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box217
		chaffeeModel[60] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box218
		chaffeeModel[61] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box219
		chaffeeModel[62] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box220
		chaffeeModel[63] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box221
		chaffeeModel[64] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box222
		chaffeeModel[65] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box223
		chaffeeModel[66] = new ModelRendererTurbo(this, 593, 41, textureX, textureY); // Import Box6
		chaffeeModel[67] = new ModelRendererTurbo(this, 593, 41, textureX, textureY); // Import Box7
		chaffeeModel[68] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import Box8
		chaffeeModel[69] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box9
		chaffeeModel[70] = new ModelRendererTurbo(this, 649, 57, textureX, textureY); // Import Box12
		chaffeeModel[71] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); // Import Box13
		chaffeeModel[72] = new ModelRendererTurbo(this, 673, 17, textureX, textureY); // Import Box14
		chaffeeModel[73] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import Box19
		chaffeeModel[74] = new ModelRendererTurbo(this, 553, 113, textureX, textureY); // Import Box20
		chaffeeModel[75] = new ModelRendererTurbo(this, 873, 65, textureX, textureY); // Import Box21
		chaffeeModel[76] = new ModelRendererTurbo(this, 585, 113, textureX, textureY); // Import Box22
		chaffeeModel[77] = new ModelRendererTurbo(this, 569, 73, textureX, textureY); // Import Box23
		chaffeeModel[78] = new ModelRendererTurbo(this, 590, 73, textureX, textureY); // Import Box24
		chaffeeModel[79] = new ModelRendererTurbo(this, 590, 73, textureX, textureY); // Import Box25
		chaffeeModel[80] = new ModelRendererTurbo(this, 529, 47, textureX, textureY); // Import Box26
		chaffeeModel[81] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import Box5
		chaffeeModel[82] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Import Box9
		chaffeeModel[83] = new ModelRendererTurbo(this, 553, 121, textureX, textureY); // Import Box10
		chaffeeModel[84] = new ModelRendererTurbo(this, 909, 15, textureX, textureY); // Import Box0
		chaffeeModel[85] = new ModelRendererTurbo(this, 909, 15, textureX, textureY); // Import Box1
		chaffeeModel[86] = new ModelRendererTurbo(this, 909, 15, textureX, textureY); // Import Box2
		chaffeeModel[87] = new ModelRendererTurbo(this, 909, 15, textureX, textureY); // Import Box3
		chaffeeModel[88] = new ModelRendererTurbo(this, 909, 15, textureX, textureY); // Import Box4
		chaffeeModel[89] = new ModelRendererTurbo(this, 909, 15, textureX, textureY); // Import Box5
		chaffeeModel[90] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Import Box6
		chaffeeModel[91] = new ModelRendererTurbo(this, 729, 73, textureX, textureY); // Import Box7
		chaffeeModel[92] = new ModelRendererTurbo(this, 913, 41, textureX, textureY); // Import Box8
		chaffeeModel[93] = new ModelRendererTurbo(this, 913, 41, textureX, textureY); // Import Box9
		chaffeeModel[94] = new ModelRendererTurbo(this, 882, 73, textureX, textureY); // Import Box10
		chaffeeModel[95] = new ModelRendererTurbo(this, 865, 121, textureX, textureY); // Import Box11
		chaffeeModel[96] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Import Box12
		chaffeeModel[97] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Import Box13
		chaffeeModel[98] = new ModelRendererTurbo(this, 937, 41, textureX, textureY); // Import Box14
		chaffeeModel[99] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Import Box15
		chaffeeModel[100] = new ModelRendererTurbo(this, 833, 25, textureX, textureY); // Import Box16
		chaffeeModel[101] = new ModelRendererTurbo(this, 865, 121, textureX, textureY); // Import Box18
		chaffeeModel[102] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Import Box19
		chaffeeModel[103] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Import Box20
		chaffeeModel[104] = new ModelRendererTurbo(this, 937, 41, textureX, textureY); // Import Box21
		chaffeeModel[105] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Import Box22
		chaffeeModel[106] = new ModelRendererTurbo(this, 833, 25, textureX, textureY); // Import Box23
		chaffeeModel[107] = new ModelRendererTurbo(this, 1001, 73, textureX, textureY); // Import Box26
		chaffeeModel[108] = new ModelRendererTurbo(this, 777, 89, textureX, textureY); // Import Box39
		chaffeeModel[109] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Import Box40
		chaffeeModel[110] = new ModelRendererTurbo(this, 889, 121, textureX, textureY); // Import Box41
		chaffeeModel[111] = new ModelRendererTurbo(this, 929, 121, textureX, textureY); // Import Box42
		chaffeeModel[112] = new ModelRendererTurbo(this, 793, 49, textureX, textureY); // Import Box43
		chaffeeModel[113] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Import Box44
		chaffeeModel[114] = new ModelRendererTurbo(this, 777, 137, textureX, textureY); // Import Box46
		chaffeeModel[115] = new ModelRendererTurbo(this, 817, 137, textureX, textureY); // Import Box52
		chaffeeModel[116] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Import Box0
		chaffeeModel[117] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Import Box1
		chaffeeModel[118] = new ModelRendererTurbo(this, 590, 73, textureX, textureY); // Import Box0
		chaffeeModel[119] = new ModelRendererTurbo(this, 590, 73, textureX, textureY); // Import Box1
		chaffeeModel[120] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Import Box4
		chaffeeModel[121] = new ModelRendererTurbo(this, 777, 137, textureX, textureY); // Import Box5
		chaffeeModel[122] = new ModelRendererTurbo(this, 817, 137, textureX, textureY); // Import Box6
		chaffeeModel[123] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box0
		chaffeeModel[124] = new ModelRendererTurbo(this, 569, 73, textureX, textureY); // Import Box1
		chaffeeModel[125] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box2
		chaffeeModel[126] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box3
		chaffeeModel[127] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box4
		chaffeeModel[128] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box5
		chaffeeModel[129] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box6
		chaffeeModel[130] = new ModelRendererTurbo(this, 777, 137, textureX, textureY); // Import Box7
		chaffeeModel[131] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box8
		chaffeeModel[132] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box9
		chaffeeModel[133] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box10
		chaffeeModel[134] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box11
		chaffeeModel[135] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box12
		chaffeeModel[136] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box13
		chaffeeModel[137] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box14
		chaffeeModel[138] = new ModelRendererTurbo(this, 737, 33, textureX, textureY); // Import Box18
		chaffeeModel[139] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Import Box19
		chaffeeModel[140] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Import Box20
		chaffeeModel[141] = new ModelRendererTurbo(this, 777, 33, textureX, textureY); // Import Box21
		chaffeeModel[142] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Import Box0
		chaffeeModel[143] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Import Box1
		chaffeeModel[144] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Import Box2
		chaffeeModel[145] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Import Box3
		chaffeeModel[146] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Import Box4
		chaffeeModel[147] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Import Box5
		chaffeeModel[148] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Import Box6
		chaffeeModel[149] = new ModelRendererTurbo(this, 633, 41, textureX, textureY); // Import Box7
		chaffeeModel[150] = new ModelRendererTurbo(this, 529, 47, textureX, textureY); // Import Box8
		chaffeeModel[151] = new ModelRendererTurbo(this, 593, 41, textureX, textureY); // Import Box9
		chaffeeModel[152] = new ModelRendererTurbo(this, 593, 41, textureX, textureY); // Import Box10
		chaffeeModel[153] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import Box11
		chaffeeModel[154] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import Box12
		chaffeeModel[155] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import Box13
		chaffeeModel[156] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import Box14
		chaffeeModel[157] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import Box0
		chaffeeModel[158] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Import Box24
		chaffeeModel[159] = new ModelRendererTurbo(this, 777, 25, textureX, textureY); // Import Box25
		chaffeeModel[160] = new ModelRendererTurbo(this, 913, 25, textureX, textureY); // Import Box26
		chaffeeModel[161] = new ModelRendererTurbo(this, 633, 33, textureX, textureY); // Import Box27
		chaffeeModel[162] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Import Box28
		chaffeeModel[163] = new ModelRendererTurbo(this, 833, 25, textureX, textureY); // Import Box29
		chaffeeModel[164] = new ModelRendererTurbo(this, 689, 33, textureX, textureY); // Import Box30
		chaffeeModel[165] = new ModelRendererTurbo(this, 569, 49, textureX, textureY); // Import Box31
		chaffeeModel[166] = new ModelRendererTurbo(this, 1, 178, textureX, textureY); // Import Box32
		chaffeeModel[167] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Import Box33
		chaffeeModel[168] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Import Box15
		chaffeeModel[169] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Import Box16
		chaffeeModel[170] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Import Box17
		chaffeeModel[171] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Import Box18
		chaffeeModel[172] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box299
		chaffeeModel[173] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box299
		chaffeeModel[174] = new ModelRendererTurbo(this, 921, 57, textureX, textureY); // Import Box24
		chaffeeModel[175] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Import Box27
		chaffeeModel[176] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Import Box28
		chaffeeModel[177] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Import Box29
		chaffeeModel[178] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Import Box30
		chaffeeModel[179] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Import Box31
		chaffeeModel[180] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Import Box32
		chaffeeModel[181] = new ModelRendererTurbo(this, 977, 121, textureX, textureY); // Import Box33
		chaffeeModel[182] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import Box34
		chaffeeModel[183] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box36
		chaffeeModel[184] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box37
		chaffeeModel[185] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box38
		chaffeeModel[186] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Import Box47
		chaffeeModel[187] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Import Box48
		chaffeeModel[188] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Import Box49
		chaffeeModel[189] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box50
		chaffeeModel[190] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box51
		chaffeeModel[191] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Import Box0
		chaffeeModel[192] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Import Box1
		chaffeeModel[193] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Import Box2
		chaffeeModel[194] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Import Box3
		chaffeeModel[195] = new ModelRendererTurbo(this, 40, 241, textureX, textureY); // Import Box288
		chaffeeModel[196] = new ModelRendererTurbo(this, 42, 249, textureX, textureY); // Import Box289
		chaffeeModel[197] = new ModelRendererTurbo(this, 0, 252, textureX, textureY); // Import Box290
		chaffeeModel[198] = new ModelRendererTurbo(this, 0, 252, textureX, textureY); // Import Box291
		chaffeeModel[199] = new ModelRendererTurbo(this, 26, 251, textureX, textureY); // Import Box292
		chaffeeModel[200] = new ModelRendererTurbo(this, 17, 263, textureX, textureY); // Import Box293
		chaffeeModel[201] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Import Box294
		chaffeeModel[202] = new ModelRendererTurbo(this, 24, 241, textureX, textureY); // Import Box295
		chaffeeModel[203] = new ModelRendererTurbo(this, 24, 241, textureX, textureY); // Import Box296
		chaffeeModel[204] = new ModelRendererTurbo(this, 0, 257, textureX, textureY); // Import Box297
		chaffeeModel[205] = new ModelRendererTurbo(this, 0, 246, textureX, textureY); // Import Box299
		chaffeeModel[206] = new ModelRendererTurbo(this, 162, 193, textureX, textureY); // Import Box0
		chaffeeModel[207] = new ModelRendererTurbo(this, 162, 193, textureX, textureY); // Import Box0
		chaffeeModel[208] = new ModelRendererTurbo(this, 737, 33, textureX, textureY); // Import Box34
		chaffeeModel[209] = new ModelRendererTurbo(this, 529, 41, textureX, textureY); // Import Box35
		chaffeeModel[210] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Import Box36
		chaffeeModel[211] = new ModelRendererTurbo(this, 689, 65, textureX, textureY); // Import Box194
		chaffeeModel[212] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Import Box205
		chaffeeModel[213] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box225
		chaffeeModel[214] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box226
		chaffeeModel[215] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box227
		chaffeeModel[216] = new ModelRendererTurbo(this, 673, 17, textureX, textureY); // Import Box228
		chaffeeModel[217] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Import Box17
		chaffeeModel[218] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box0
		chaffeeModel[219] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Import Box0
		chaffeeModel[220] = new ModelRendererTurbo(this, 78, 244, textureX, textureY); // Import Shape165
		chaffeeModel[221] = new ModelRendererTurbo(this, 78, 244, textureX, textureY); // Import Shape1
		chaffeeModel[222] = new ModelRendererTurbo(this, 78, 244, textureX, textureY); // Import Shape2
		chaffeeModel[223] = new ModelRendererTurbo(this, 78, 244, textureX, textureY); // Import Shape3
		chaffeeModel[224] = new ModelRendererTurbo(this, 78, 244, textureX, textureY); // Import Shape4
		chaffeeModel[225] = new ModelRendererTurbo(this, 78, 244, textureX, textureY); // Import Shape9
		chaffeeModel[226] = new ModelRendererTurbo(this, 81, 91, textureX, textureY); // Import Shape535
		chaffeeModel[227] = new ModelRendererTurbo(this, 81, 91, textureX, textureY); // Import Shape11
		chaffeeModel[228] = new ModelRendererTurbo(this, 81, 91, textureX, textureY); // Import Shape12
		chaffeeModel[229] = new ModelRendererTurbo(this, 78, 244, textureX, textureY); // Import Shape33
		chaffeeModel[230] = new ModelRendererTurbo(this, 78, 244, textureX, textureY); // Import Shape24
		chaffeeModel[231] = new ModelRendererTurbo(this, 78, 244, textureX, textureY); // Import Shape25
		chaffeeModel[232] = new ModelRendererTurbo(this, 78, 244, textureX, textureY); // Import Shape26
		chaffeeModel[233] = new ModelRendererTurbo(this, 78, 244, textureX, textureY); // Import Shape27
		chaffeeModel[234] = new ModelRendererTurbo(this, 78, 244, textureX, textureY); // Import Shape28
		chaffeeModel[235] = new ModelRendererTurbo(this, 78, 244, textureX, textureY); // Import Shape29
		chaffeeModel[236] = new ModelRendererTurbo(this, 81, 91, textureX, textureY); // Import Shape30
		chaffeeModel[237] = new ModelRendererTurbo(this, 81, 91, textureX, textureY); // Import Shape31
		chaffeeModel[238] = new ModelRendererTurbo(this, 81, 91, textureX, textureY); // Import Shape32
		chaffeeModel[239] = new ModelRendererTurbo(this, 78, 244, textureX, textureY); // Import Shape1
		chaffeeModel[240] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Import Box67
		chaffeeModel[241] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box69
		chaffeeModel[242] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Import Box70
		chaffeeModel[243] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box72
		chaffeeModel[244] = new ModelRendererTurbo(this, 833, 25, textureX, textureY); // Import Box73
		chaffeeModel[245] = new ModelRendererTurbo(this, 873, 41, textureX, textureY); // Import Box74
		chaffeeModel[246] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Import Box75
		chaffeeModel[247] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Import Box6
		chaffeeModel[248] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Import Box7
		chaffeeModel[249] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Import Box8
		chaffeeModel[250] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Import Box0
		chaffeeModel[251] = new ModelRendererTurbo(this, 617, 105, textureX, textureY); // Import Box172
		chaffeeModel[252] = new ModelRendererTurbo(this, 617, 121, textureX, textureY); // Import Box13
		chaffeeModel[253] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Import Box14
		chaffeeModel[254] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box15
		chaffeeModel[255] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Import Box16
		chaffeeModel[256] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box17
		chaffeeModel[257] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Import Box18
		chaffeeModel[258] = new ModelRendererTurbo(this, 745, 113, textureX, textureY); // Import Box19
		chaffeeModel[259] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Import Box21
		chaffeeModel[260] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Import Box22
		chaffeeModel[261] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Import Box23

		chaffeeModel[0].addShapeBox(0F, 0F, 0F, 21, 12, 19, 0F, 0F, -1F, -5F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box2
		chaffeeModel[0].setRotationPoint(24F, -21F, -19F);

		chaffeeModel[1].addShapeBox(0F, 0F, 0F, 21, 11, 7, 0F, 0F, -1F, 0F, 0F, -11F, -2F, 0F, -11F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 0F); // Import Box3
		chaffeeModel[1].setRotationPoint(24F, -20F, -21F);

		chaffeeModel[2].addShapeBox(0F, 0F, 0F, 19, 22, 7, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box4
		chaffeeModel[2].setRotationPoint(5F, -21F, -21F);

		chaffeeModel[3].addShapeBox(0F, 0F, 0F, 35, 22, 7, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box5
		chaffeeModel[3].setRotationPoint(-30F, -21F, -21F);

		chaffeeModel[4].addShapeBox(0F, 0F, 0F, 21, 14, 28, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		chaffeeModel[4].setRotationPoint(-51F, -21F, -14F);

		chaffeeModel[5].addShapeBox(0F, 0F, 0F, 19, 23, 14, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box9
		chaffeeModel[5].setRotationPoint(5F, -22F, -14F);

		chaffeeModel[6].addShapeBox(0F, 0F, 0F, 35, 23, 14, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box10
		chaffeeModel[6].setRotationPoint(-30F, -22F, -14F);

		chaffeeModel[7].addShapeBox(0F, 0F, 0F, 19, 22, 7, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box12
		chaffeeModel[7].setRotationPoint(5F, -21F, 14F);

		chaffeeModel[8].addShapeBox(0F, 0F, 0F, 19, 23, 14, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box14
		chaffeeModel[8].setRotationPoint(5F, -22F, 0F);

		chaffeeModel[9].addShapeBox(0F, 0F, 0F, 35, 23, 14, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		chaffeeModel[9].setRotationPoint(-30F, -22F, 0F);

		chaffeeModel[10].addShapeBox(0F, 0F, 0F, 35, 22, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box16
		chaffeeModel[10].setRotationPoint(-30F, -21F, 14F);

		chaffeeModel[11].addShapeBox(0F, 0F, 0F, 21, 14, 7, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		chaffeeModel[11].setRotationPoint(-51F, -21F, 14F);

		chaffeeModel[12].addShapeBox(0F, 0F, 0F, 6, 2, 27, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box37
		chaffeeModel[12].setRotationPoint(-30F, -22.5F, -13F);

		chaffeeModel[13].addShapeBox(0F, 0F, 0F, 3, 2, 27, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box38
		chaffeeModel[13].setRotationPoint(-24F, -22.5F, -13F);

		chaffeeModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 27, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box39
		chaffeeModel[14].setRotationPoint(-21F, -21.5F, -13F);

		chaffeeModel[15].addShapeBox(0F, 0F, 0F, 10, 4, 26, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		chaffeeModel[15].setRotationPoint(-50F, -19F, -13F);

		chaffeeModel[16].addShapeBox(0F, 0F, 0F, 5, 4, 20, 0F, 0F, 0F, -5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Import Box41
		chaffeeModel[16].setRotationPoint(29F, -18.5F, -10F);

		chaffeeModel[17].addShapeBox(0F, 0F, 0F, 4, 3, 20, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box42
		chaffeeModel[17].setRotationPoint(34F, -15.5F, -10F);

		chaffeeModel[18].addShapeBox(0F, 0F, 0F, 5, 4, 20, 0F, 0F, 0F, 0F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Import Box43
		chaffeeModel[18].setRotationPoint(38F, -13.5F, -10F);

		chaffeeModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box44
		chaffeeModel[19].setRotationPoint(35F, -15.5F, -7F);

		chaffeeModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box45
		chaffeeModel[20].setRotationPoint(35F, -15.5F, 6F);

		chaffeeModel[21].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box46
		chaffeeModel[21].setRotationPoint(36F, -19F, -19F);

		chaffeeModel[22].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box47
		chaffeeModel[22].setRotationPoint(36F, -18F, -16F);

		chaffeeModel[23].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box48
		chaffeeModel[23].setRotationPoint(36F, -18F, -13F);

		chaffeeModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box49
		chaffeeModel[24].setRotationPoint(36F, -16F, -15F);

		chaffeeModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box50
		chaffeeModel[25].setRotationPoint(36F, -16F, -18F);

		chaffeeModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box51
		chaffeeModel[26].setRotationPoint(36F, -19F, -16F);

		chaffeeModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box52
		chaffeeModel[27].setRotationPoint(36F, -20F, -19F);

		chaffeeModel[28].addShapeBox(0F, 0F, 0F, 21, 10, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -1F, 0F, -8F, -1F, 0F, 0F, 0F, 0F); // Import Box60
		chaffeeModel[28].setRotationPoint(24F, -9F, -21F);

		chaffeeModel[29].addShapeBox(0F, 0F, 0F, 18, 8, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box61
		chaffeeModel[29].setRotationPoint(-48F, -7F, -21F);

		chaffeeModel[30].addShapeBox(0F, 0F, 0F, 83, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box62
		chaffeeModel[30].setRotationPoint(-44F, -16F, 21F);

		chaffeeModel[31].addShapeBox(0F, 0F, 0F, 7, 4, 7, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box63
		chaffeeModel[31].setRotationPoint(-51F, -16F, 21F);

		chaffeeModel[32].addShapeBox(0F, 0F, 0F, 5, 7, 7, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Import Box64
		chaffeeModel[32].setRotationPoint(-54F, -14F, 21F);

		chaffeeModel[33].addShapeBox(0F, 0F, 0F, 4, 5, 7, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box179
		chaffeeModel[33].setRotationPoint(42F, -14F, -28F);

		chaffeeModel[34].addShapeBox(0F, 0F, 0F, 5, 4, 7, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box180
		chaffeeModel[34].setRotationPoint(39F, -16F, -28F);

		chaffeeModel[35].addShapeBox(0F, 0F, 0F, 83, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box181
		chaffeeModel[35].setRotationPoint(-44F, -16F, -28F);

		chaffeeModel[36].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box190
		chaffeeModel[36].setRotationPoint(39F, -15F, 28F);

		chaffeeModel[37].addShapeBox(0F, 0F, 0F, 20, 9, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box191
		chaffeeModel[37].setRotationPoint(19F, -15F, 28F);

		chaffeeModel[38].addShapeBox(0F, 0F, 0F, 45, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box192
		chaffeeModel[38].setRotationPoint(-26F, -15F, 28F);

		chaffeeModel[39].addShapeBox(0F, 0F, 0F, 18, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box193
		chaffeeModel[39].setRotationPoint(-44F, -15F, 28F);

		chaffeeModel[40].addShapeBox(0F, 0F, 0F, 6, 10, 2, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box194
		chaffeeModel[40].setRotationPoint(-50F, -15F, 28F);

		chaffeeModel[41].addShapeBox(0F, 0F, 0F, 3, 8, 2, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Import Box195
		chaffeeModel[41].setRotationPoint(-53F, -13F, 28F);

		chaffeeModel[42].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box196
		chaffeeModel[42].setRotationPoint(44F, -12F, 28F);

		chaffeeModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box176
		chaffeeModel[43].setRotationPoint(-34F, -18F, 21F);

		chaffeeModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box177
		chaffeeModel[44].setRotationPoint(-21F, -18F, 21F);

		chaffeeModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box178
		chaffeeModel[45].setRotationPoint(-8F, -18F, 21F);

		chaffeeModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box179
		chaffeeModel[46].setRotationPoint(15F, -18F, 20F);

		chaffeeModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box180
		chaffeeModel[47].setRotationPoint(27F, -17F, 21F);

		chaffeeModel[48].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box186
		chaffeeModel[48].setRotationPoint(44F, -12F, -30F);

		chaffeeModel[49].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box187
		chaffeeModel[49].setRotationPoint(39F, -15F, -30F);

		chaffeeModel[50].addShapeBox(0F, 0F, 0F, 20, 9, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box188
		chaffeeModel[50].setRotationPoint(19F, -15F, -30F);

		chaffeeModel[51].addShapeBox(0F, 0F, 0F, 45, 7, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box189
		chaffeeModel[51].setRotationPoint(-26F, -15F, -30F);

		chaffeeModel[52].addShapeBox(0F, 0F, 0F, 18, 10, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box190
		chaffeeModel[52].setRotationPoint(-44F, -15F, -30F);

		chaffeeModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box207
		chaffeeModel[53].setRotationPoint(-51.5F, -15F, 16.5F);

		chaffeeModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box208
		chaffeeModel[54].setRotationPoint(-51.5F, -13F, 16.5F);

		chaffeeModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box210
		chaffeeModel[55].setRotationPoint(-51.5F, -14F, 16.5F);

		chaffeeModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box214
		chaffeeModel[56].setRotationPoint(-57F, -13F, -12F);

		chaffeeModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 24, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box215
		chaffeeModel[57].setRotationPoint(-57F, -11F, -12F);

		chaffeeModel[58].addShapeBox(0F, 0F, 0F, 5, 1, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box216
		chaffeeModel[58].setRotationPoint(-56F, -10F, -12F);

		chaffeeModel[59].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box217
		chaffeeModel[59].setRotationPoint(-56F, -13F, -12F);

		chaffeeModel[60].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box218
		chaffeeModel[60].setRotationPoint(-56F, -13F, 11F);

		chaffeeModel[61].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box219
		chaffeeModel[61].setRotationPoint(-52F, -6F, -1F);

		chaffeeModel[62].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box220
		chaffeeModel[62].setRotationPoint(-50F, -5F, -1F);

		chaffeeModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box221
		chaffeeModel[63].setRotationPoint(-52F, -3F, -1F);

		chaffeeModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box222
		chaffeeModel[64].setRotationPoint(-52F, -4F, -1F);

		chaffeeModel[65].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box223
		chaffeeModel[65].setRotationPoint(-49F, -4F, -3F);

		chaffeeModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box6
		chaffeeModel[66].setRotationPoint(34F, -18F, -15F);

		chaffeeModel[67].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		chaffeeModel[67].setRotationPoint(34F, -18F, -18F);

		chaffeeModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		chaffeeModel[68].setRotationPoint(35F, -19F, -17.5F);

		chaffeeModel[69].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box9
		chaffeeModel[69].setRotationPoint(28F, -17F, -19F);

		chaffeeModel[70].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box12
		chaffeeModel[70].setRotationPoint(34F, -14F, -17F);

		chaffeeModel[71].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Import Box13
		chaffeeModel[71].setRotationPoint(41F, -14F, -17F);

		chaffeeModel[72].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box14
		chaffeeModel[72].setRotationPoint(42F, -12.5F, -15.5F);

		chaffeeModel[73].addShapeBox(0F, 0F, 0F, 8, 9, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F); // Import Box19
		chaffeeModel[73].setRotationPoint(37F, -9F, -21F);

		chaffeeModel[74].addShapeBox(0F, 0F, 0F, 8, 9, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F); // Import Box20
		chaffeeModel[74].setRotationPoint(37F, -9F, 13F);

		chaffeeModel[75].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Import Box21
		chaffeeModel[75].setRotationPoint(26F, -20F, 7F);
		chaffeeModel[75].rotateAngleZ = 0.4712389F;

		chaffeeModel[76].addShapeBox(0F, 0F, 0F, 74, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box22
		chaffeeModel[76].setRotationPoint(-39F, -17F, 21F);

		chaffeeModel[77].addShapeBox(0F, 0F, 0F, 10, 8, 5, 0F, 0F, 0F, -4F, 0F, -7F, 0F, 0F, -7F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Import Box23
		chaffeeModel[77].setRotationPoint(35F, -17F, 17F);

		chaffeeModel[78].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box24
		chaffeeModel[78].setRotationPoint(45F, -10F, 17F);

		chaffeeModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box25
		chaffeeModel[79].setRotationPoint(44F, -8F, 17F);

		chaffeeModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box26
		chaffeeModel[80].setRotationPoint(-40F, -17F, 21F);

		chaffeeModel[81].addShapeBox(-9F, 0F, -20F, 16, 2, 40, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box5
		chaffeeModel[81].setRotationPoint(1F, -21.5F, 0F);

		chaffeeModel[82].addShapeBox(7F, 0F, -20F, 8, 2, 40, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Import Box9
		chaffeeModel[82].setRotationPoint(1F, -21.5F, 0F);

		chaffeeModel[83].addShapeBox(-18F, 0F, -20F, 9, 2, 40, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Import Box10
		chaffeeModel[83].setRotationPoint(1F, -21.5F, 0F);

		chaffeeModel[84].addShapeBox(0F, 1F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		chaffeeModel[84].setRotationPoint(45F, -5F, -9F);
		chaffeeModel[84].rotateAngleX = -2.26892803F;
		chaffeeModel[84].rotateAngleY = 1.57079633F;

		chaffeeModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		chaffeeModel[85].setRotationPoint(45F, -5F, -9F);
		chaffeeModel[85].rotateAngleX = -2.26892803F;
		chaffeeModel[85].rotateAngleY = 1.57079633F;

		chaffeeModel[86].addShapeBox(0F, 1F, 3F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box2
		chaffeeModel[86].setRotationPoint(45F, -5F, -9F);
		chaffeeModel[86].rotateAngleX = -2.26892803F;
		chaffeeModel[86].rotateAngleY = 1.57079633F;

		chaffeeModel[87].addShapeBox(0F, 1F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box3
		chaffeeModel[87].setRotationPoint(45F, -5F, 10F);
		chaffeeModel[87].rotateAngleX = -2.26892803F;
		chaffeeModel[87].rotateAngleY = 1.57079633F;

		chaffeeModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box4
		chaffeeModel[88].setRotationPoint(45F, -5F, 10F);
		chaffeeModel[88].rotateAngleX = -2.26892803F;
		chaffeeModel[88].rotateAngleY = 1.57079633F;

		chaffeeModel[89].addShapeBox(0F, 1F, 3F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box5
		chaffeeModel[89].setRotationPoint(45F, -5F, 10F);
		chaffeeModel[89].rotateAngleX = -2.26892803F;
		chaffeeModel[89].rotateAngleY = 1.57079633F;

		chaffeeModel[90].addShapeBox(0F, -0.2F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box6
		chaffeeModel[90].setRotationPoint(26F, -20F, 7F);
		chaffeeModel[90].rotateAngleZ = 0.4712389F;

		chaffeeModel[91].addShapeBox(4F, -0.2F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		chaffeeModel[91].setRotationPoint(26F, -20F, 7F);
		chaffeeModel[91].rotateAngleZ = 0.4712389F;

		chaffeeModel[92].addShapeBox(1F, -0.2F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		chaffeeModel[92].setRotationPoint(26F, -20F, 7F);
		chaffeeModel[92].rotateAngleZ = 0.4712389F;

		chaffeeModel[93].addShapeBox(1F, -0.2F, 8F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box9
		chaffeeModel[93].setRotationPoint(26F, -20F, 6F);
		chaffeeModel[93].rotateAngleZ = 0.4712389F;

		chaffeeModel[94].addShapeBox(4.2F, -0.2F, 3.5F, 1, 1, 1, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Import Box10
		chaffeeModel[94].setRotationPoint(26F, -20F, 7F);
		chaffeeModel[94].rotateAngleZ = 0.4712389F;

		chaffeeModel[95].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box11
		chaffeeModel[95].setRotationPoint(17.5F, -21.5F, 7F);
		chaffeeModel[95].rotateAngleX = -0.08726646F;
		chaffeeModel[95].rotateAngleY = 0.12217305F;
		chaffeeModel[95].rotateAngleZ = 0.08726646F;

		chaffeeModel[96].addShapeBox(5F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box12
		chaffeeModel[96].setRotationPoint(17.5F, -21.5F, 7F);
		chaffeeModel[96].rotateAngleX = -0.08726646F;
		chaffeeModel[96].rotateAngleY = 0.12217305F;
		chaffeeModel[96].rotateAngleZ = 0.08726646F;

		chaffeeModel[97].addShapeBox(-1F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box13
		chaffeeModel[97].setRotationPoint(17.5F, -21.5F, 7F);
		chaffeeModel[97].rotateAngleX = -0.08726646F;
		chaffeeModel[97].rotateAngleY = 0.12217305F;
		chaffeeModel[97].rotateAngleZ = 0.08726646F;

		chaffeeModel[98].addShapeBox(-3F, 0F, 7F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box14
		chaffeeModel[98].setRotationPoint(17.5F, -21.7F, 7F);
		chaffeeModel[98].rotateAngleX = -0.08726646F;
		chaffeeModel[98].rotateAngleY = 0.12217305F;
		chaffeeModel[98].rotateAngleZ = 0.08726646F;

		chaffeeModel[99].addShapeBox(-5F, 0F, 7F, 2, 1, 2, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Import Box15
		chaffeeModel[99].setRotationPoint(17.5F, -21.7F, 7F);
		chaffeeModel[99].rotateAngleX = -0.08726646F;
		chaffeeModel[99].rotateAngleY = 0.12217305F;
		chaffeeModel[99].rotateAngleZ = 0.08726646F;

		chaffeeModel[100].addShapeBox(1F, 0F, 7F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0F); // Import Box16
		chaffeeModel[100].setRotationPoint(17.5F, -21.7F, 7F);
		chaffeeModel[100].rotateAngleX = -0.08726646F;
		chaffeeModel[100].rotateAngleY = 0.12217305F;
		chaffeeModel[100].rotateAngleZ = 0.08726646F;

		chaffeeModel[101].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		chaffeeModel[101].setRotationPoint(18.5F, -20.5F, -18F);
		chaffeeModel[101].rotateAngleX = 0.08726646F;
		chaffeeModel[101].rotateAngleY = -0.12217305F;
		chaffeeModel[101].rotateAngleZ = 0.08726646F;

		chaffeeModel[102].addShapeBox(5F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box19
		chaffeeModel[102].setRotationPoint(18.5F, -20.5F, -18F);
		chaffeeModel[102].rotateAngleX = 0.08726646F;
		chaffeeModel[102].rotateAngleY = -0.12217305F;
		chaffeeModel[102].rotateAngleZ = 0.08726646F;

		chaffeeModel[103].addShapeBox(-1F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box20
		chaffeeModel[103].setRotationPoint(18.5F, -20.5F, -18F);
		chaffeeModel[103].rotateAngleX = 0.08726646F;
		chaffeeModel[103].rotateAngleY = -0.12217305F;
		chaffeeModel[103].rotateAngleZ = 0.08726646F;

		chaffeeModel[104].addShapeBox(-3F, 0F, 2F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box21
		chaffeeModel[104].setRotationPoint(18.5F, -20.7F, -18F);
		chaffeeModel[104].rotateAngleX = 0.08726646F;
		chaffeeModel[104].rotateAngleY = -0.12217305F;
		chaffeeModel[104].rotateAngleZ = 0.08726646F;

		chaffeeModel[105].addShapeBox(-5F, 0F, 2F, 2, 1, 2, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Import Box22
		chaffeeModel[105].setRotationPoint(18.5F, -20.7F, -18F);
		chaffeeModel[105].rotateAngleX = 0.08726646F;
		chaffeeModel[105].rotateAngleY = -0.12217305F;
		chaffeeModel[105].rotateAngleZ = 0.08726646F;

		chaffeeModel[106].addShapeBox(1F, 0F, 2F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0F); // Import Box23
		chaffeeModel[106].setRotationPoint(18.5F, -20.7F, -18F);
		chaffeeModel[106].rotateAngleX = 0.08726646F;
		chaffeeModel[106].rotateAngleY = -0.12217305F;
		chaffeeModel[106].rotateAngleZ = 0.08726646F;

		chaffeeModel[107].addShapeBox(-1.05F, 0F, 0F, 1, 1, 9, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Import Box26
		chaffeeModel[107].setRotationPoint(26F, -20F, 6.5F);
		chaffeeModel[107].rotateAngleZ = 0.4712389F;

		chaffeeModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box39
		chaffeeModel[108].setRotationPoint(-34F, -18F, -28F);

		chaffeeModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		chaffeeModel[109].setRotationPoint(-21F, -18F, -28F);

		chaffeeModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box41
		chaffeeModel[110].setRotationPoint(-8F, -18F, -28F);

		chaffeeModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box42
		chaffeeModel[111].setRotationPoint(15F, -18F, -28F);

		chaffeeModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box43
		chaffeeModel[112].setRotationPoint(27F, -17F, -28F);

		chaffeeModel[113].addShapeBox(0F, 0F, 0F, 74, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box44
		chaffeeModel[113].setRotationPoint(-39F, -17F, -22F);

		chaffeeModel[114].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box46
		chaffeeModel[114].setRotationPoint(-6F, -20F, 22.5F);
		chaffeeModel[114].rotateAngleX = -0.08726646F;
		chaffeeModel[114].rotateAngleY = 0.03490659F;

		chaffeeModel[115].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box52
		chaffeeModel[115].setRotationPoint(8F, -19F, 22.5F);
		chaffeeModel[115].rotateAngleY = -0.10471976F;

		chaffeeModel[116].addShapeBox(4F, -0.5F, 5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		chaffeeModel[116].setRotationPoint(18.5F, -20.5F, -18F);
		chaffeeModel[116].rotateAngleX = 0.08726646F;
		chaffeeModel[116].rotateAngleY = -0.12217305F;
		chaffeeModel[116].rotateAngleZ = 0.08726646F;

		chaffeeModel[117].addShapeBox(4F, -0.5F, 4F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		chaffeeModel[117].setRotationPoint(17.5F, -21.5F, 7F);
		chaffeeModel[117].rotateAngleX = -0.08726646F;
		chaffeeModel[117].rotateAngleY = 0.12217305F;
		chaffeeModel[117].rotateAngleZ = 0.08726646F;

		chaffeeModel[118].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box0
		chaffeeModel[118].setRotationPoint(45F, -10F, -18F);

		chaffeeModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		chaffeeModel[119].setRotationPoint(44F, -8F, -18F);

		chaffeeModel[120].addShapeBox(0F, 0F, 0F, 21, 14, 7, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box4
		chaffeeModel[120].setRotationPoint(-51F, -21F, -21F);

		chaffeeModel[121].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box5
		chaffeeModel[121].setRotationPoint(2F, -19F, -28.5F);
		chaffeeModel[121].rotateAngleX = 0.08726646F;
		chaffeeModel[121].rotateAngleY = 0.03490659F;

		chaffeeModel[122].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box6
		chaffeeModel[122].setRotationPoint(20F, -19F, -27F);
		chaffeeModel[122].rotateAngleY = 0.10471976F;

		chaffeeModel[123].addShapeBox(0F, 0F, 0F, 21, 11, 7, 0F, 0F, 0F, 0F, 0F, -11F, -5F, 0F, -11F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box0
		chaffeeModel[123].setRotationPoint(24F, -20F, 14F);

		chaffeeModel[124].addShapeBox(0F, 0F, 0F, 10, 8, 5, 0F, 0F, 0F, 0F, 0F, -7F, -4F, 0F, -7F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F); // Import Box1
		chaffeeModel[124].setRotationPoint(35F, -17F, -22F);

		chaffeeModel[125].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box2
		chaffeeModel[125].setRotationPoint(28F, -17F, -16F);

		chaffeeModel[126].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box3
		chaffeeModel[126].setRotationPoint(28F, -17F, -13F);

		chaffeeModel[127].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box4
		chaffeeModel[127].setRotationPoint(28F, -17F, 18F);

		chaffeeModel[128].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box5
		chaffeeModel[128].setRotationPoint(28F, -17F, 15F);

		chaffeeModel[129].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box6
		chaffeeModel[129].setRotationPoint(28F, -17F, 12F);

		chaffeeModel[130].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		chaffeeModel[130].setRotationPoint(-56F, -11F, 2.5F);
		chaffeeModel[130].rotateAngleX = 1.30899694F;
		chaffeeModel[130].rotateAngleY = 1.57079633F;

		chaffeeModel[131].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		chaffeeModel[131].setRotationPoint(36F, -19F, 18F);

		chaffeeModel[132].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box9
		chaffeeModel[132].setRotationPoint(36F, -18F, 15F);

		chaffeeModel[133].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box10
		chaffeeModel[133].setRotationPoint(36F, -18F, 12F);

		chaffeeModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box11
		chaffeeModel[134].setRotationPoint(36F, -16F, 13F);

		chaffeeModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box12
		chaffeeModel[135].setRotationPoint(36F, -16F, 16F);

		chaffeeModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box13
		chaffeeModel[136].setRotationPoint(36F, -19F, 12F);

		chaffeeModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box14
		chaffeeModel[137].setRotationPoint(36F, -20F, 15F);

		chaffeeModel[138].addShapeBox(0F, 0F, 0F, 6, 10, 2, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		chaffeeModel[138].setRotationPoint(-50F, -15F, -30F);

		chaffeeModel[139].addShapeBox(0F, 0F, 0F, 3, 8, 2, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Import Box19
		chaffeeModel[139].setRotationPoint(-53F, -13F, -30F);

		chaffeeModel[140].addShapeBox(0F, 0F, 0F, 4, 5, 7, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box20
		chaffeeModel[140].setRotationPoint(42F, -14F, 21F);

		chaffeeModel[141].addShapeBox(0F, 0F, 0F, 5, 4, 7, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box21
		chaffeeModel[141].setRotationPoint(39F, -16F, 21F);

		chaffeeModel[142].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		chaffeeModel[142].setRotationPoint(39F, -15F, -21F);

		chaffeeModel[143].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box1
		chaffeeModel[143].setRotationPoint(44F, -12F, -21F);

		chaffeeModel[144].addShapeBox(0F, 0F, 0F, 20, 9, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box2
		chaffeeModel[144].setRotationPoint(19F, -15F, -21F);

		chaffeeModel[145].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box3
		chaffeeModel[145].setRotationPoint(39F, -15F, 19F);

		chaffeeModel[146].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box4
		chaffeeModel[146].setRotationPoint(44F, -12F, 19F);

		chaffeeModel[147].addShapeBox(0F, 0F, 0F, 20, 9, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box5
		chaffeeModel[147].setRotationPoint(19F, -15F, 19F);

		chaffeeModel[148].addShapeBox(0F, 0F, 0F, 7, 4, 7, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box6
		chaffeeModel[148].setRotationPoint(-51F, -16F, -28F);

		chaffeeModel[149].addShapeBox(0F, 0F, 0F, 5, 7, 7, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		chaffeeModel[149].setRotationPoint(-54F, -14F, -28F);

		chaffeeModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		chaffeeModel[150].setRotationPoint(-40F, -17F, -22F);

		chaffeeModel[151].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box9
		chaffeeModel[151].setRotationPoint(34F, -18F, 13F);

		chaffeeModel[152].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box10
		chaffeeModel[152].setRotationPoint(34F, -18F, 16F);

		chaffeeModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box11
		chaffeeModel[153].setRotationPoint(35F, -19F, 16.5F);

		chaffeeModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box12
		chaffeeModel[154].setRotationPoint(-51.5F, -15F, -19.5F);

		chaffeeModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box13
		chaffeeModel[155].setRotationPoint(-51.5F, -13F, -19.5F);

		chaffeeModel[156].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box14
		chaffeeModel[156].setRotationPoint(-51.5F, -14F, -19.5F);

		chaffeeModel[157].addShapeBox(0F, 0F, 0F, 21, 12, 19, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Import Box0
		chaffeeModel[157].setRotationPoint(24F, -21F, 0F);

		chaffeeModel[158].addShapeBox(-8F, 0F, -20F, 14, 3, 40, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Import Box24
		chaffeeModel[158].setRotationPoint(0F, -25F, 0F);

		chaffeeModel[159].addShapeBox(0F, 0F, -20F, 6, 11, 40, 0F, 0F, 0F, -5F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box25
		chaffeeModel[159].setRotationPoint(0F, -36F, 0F);

		chaffeeModel[160].addShapeBox(-8F, 0F, -20F, 8, 11, 40, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box26
		chaffeeModel[160].setRotationPoint(0F, -36F, 0F);

		chaffeeModel[161].addShapeBox(6F, 0F, -20F, 6, 9, 40, 0F, 0F, 0F, -6F, 0F, -2F, -10F, 0F, -2F, -10F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Import Box27
		chaffeeModel[161].setRotationPoint(0F, -34F, 0F);

		chaffeeModel[162].addShapeBox(-21F, 0F, -20F, 13, 11, 40, 0F, 0F, -1F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, -10F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Import Box28
		chaffeeModel[162].setRotationPoint(0F, -36F, 0F);

		chaffeeModel[163].addShapeBox(-26F, 1F, -14F, 5, 10, 28, 0F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -5F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Import Box29
		chaffeeModel[163].setRotationPoint(0F, -36F, 0F);

		chaffeeModel[164].addShapeBox(-34.5F, 3F, -12F, 8, 7, 24, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box30
		chaffeeModel[164].setRotationPoint(0F, -36F, 0F);

		chaffeeModel[165].addShapeBox(6F, 0F, -20F, 9, 3, 40, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0.5F, -1F, -1F, 0.5F, -13F, -1F, 0.5F, -13F, 0F, 0.5F, -1F); // Import Box31
		chaffeeModel[165].setRotationPoint(0F, -25F, 0F);

		chaffeeModel[166].addShapeBox(-21F, 0F, -20F, 13, 3, 40, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, -1F, 0.5F, -13F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, -1F, 0.5F, -13F); // Import Box32
		chaffeeModel[166].setRotationPoint(0F, -25F, 0F);

		chaffeeModel[167].addShapeBox(12F, 0F, -15F, 3, 7, 30, 0F, 0F, 0F, -5F, 0F, -1F, -8F, 0F, -1F, -8F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Import Box33
		chaffeeModel[167].setRotationPoint(0F, -32F, 0F);

		chaffeeModel[168].addShapeBox(-12F, 0F, -1F, 6, 6, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		chaffeeModel[168].setRotationPoint(0F, -37F, 0F);

		chaffeeModel[169].addShapeBox(-16F, 0F, -1F, 4, 6, 16, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box16
		chaffeeModel[169].setRotationPoint(0F, -37F, 0F);

		chaffeeModel[170].addShapeBox(-6F, 0F, -1F, 4, 6, 16, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box17
		chaffeeModel[170].setRotationPoint(0F, -37F, 0F);

		chaffeeModel[171].addShapeBox(-32F, 0F, 10F, 1, 39, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Import Box18
		chaffeeModel[171].setRotationPoint(0F, -69F, 0F);
		chaffeeModel[171].rotateAngleX = -0.05235988F;
		chaffeeModel[171].rotateAngleZ = -0.10471976F;

		chaffeeModel[172].addBox(5.5F, -7F, -20F, 1, 3, 1, 0F); // Import Box299
		chaffeeModel[172].setRotationPoint(0F, -36F, 0F);
		chaffeeModel[172].rotateAngleY = 1.57079633F;

		chaffeeModel[173].addShapeBox(5.5F, -4F, -20F, 1, 8, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -2.5F, 0F, 6F, 2F, 0F, 6F, 2F, 0F, -6.5F, -2.5F, 0F, -6.5F); // Import Box299
		chaffeeModel[173].setRotationPoint(0F, -36F, 0F);
		chaffeeModel[173].rotateAngleY = 1.57079633F;

		chaffeeModel[174].addShapeBox(6F, -2F, 6F, 3, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box24
		chaffeeModel[174].setRotationPoint(0F, -33.5F, 0F);
		chaffeeModel[174].rotateAngleX = 0.05235988F;
		chaffeeModel[174].rotateAngleY = -0.13962634F;
		chaffeeModel[174].rotateAngleZ = 0.20943951F;

		chaffeeModel[175].addShapeBox(7.5F, -1.2F, 7F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box27
		chaffeeModel[175].setRotationPoint(0F, -33.5F, 0F);
		chaffeeModel[175].rotateAngleX = 0.05235988F;
		chaffeeModel[175].rotateAngleY = -0.13962634F;

		chaffeeModel[176].addShapeBox(0F, -1F, 12F, 1, 2, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Import Box28
		chaffeeModel[176].setRotationPoint(0F, -36F, 0F);

		chaffeeModel[177].addShapeBox(0F, -2F, 12F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box29
		chaffeeModel[177].setRotationPoint(0F, -36F, 0F);

		chaffeeModel[178].addShapeBox(2F, -5F, 10.5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box30
		chaffeeModel[178].setRotationPoint(0F, -36F, 0F);
		chaffeeModel[178].rotateAngleY = -0.31415927F;
		chaffeeModel[178].rotateAngleZ = 0.33161256F;

		chaffeeModel[179].addShapeBox(2F, -4F, 10.5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box31
		chaffeeModel[179].setRotationPoint(0F, -36F, 0F);
		chaffeeModel[179].rotateAngleY = -0.31415927F;
		chaffeeModel[179].rotateAngleZ = 0.33161256F;

		chaffeeModel[180].addShapeBox(2F, -6F, 10.5F, 3, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box32
		chaffeeModel[180].setRotationPoint(0F, -36F, 0F);
		chaffeeModel[180].rotateAngleY = -0.31415927F;
		chaffeeModel[180].rotateAngleZ = 0.33161256F;

		chaffeeModel[181].addShapeBox(-8F, -0.5F, -14F, 7, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box33
		chaffeeModel[181].setRotationPoint(0F, -36F, 0.5F);

		chaffeeModel[182].addShapeBox(-13F, -0.5F, -14F, 5, 1, 10, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box34
		chaffeeModel[182].setRotationPoint(0F, -36F, 0.5F);

		chaffeeModel[183].addShapeBox(5.5F, -4F, -20F, 1, 1, 1, 0F, 0.3F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Import Box36
		chaffeeModel[183].setRotationPoint(0F, -36F, 0F);
		chaffeeModel[183].rotateAngleY = 1.57079633F;

		chaffeeModel[184].addShapeBox(5.5F, -4F, -20F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 6F, -2.5F, 0F, 6F, -2.5F, 0F, -6.5F, 2F, 0F, -6.5F); // Import Box37
		chaffeeModel[184].setRotationPoint(0F, -36F, 0F);
		chaffeeModel[184].rotateAngleY = 1.57079633F;

		chaffeeModel[185].addShapeBox(5.25F, -4F, -20F, 1, 8, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 6F, -0.5F, 0F, 6F); // Import Box38
		chaffeeModel[185].setRotationPoint(0F, -36F, 0F);
		chaffeeModel[185].rotateAngleY = 1.57079633F;

		chaffeeModel[186].addShapeBox(-1F, 0F, -13.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box47
		chaffeeModel[186].setRotationPoint(0F, -36.5F, 0.5F);

		chaffeeModel[187].addShapeBox(-1F, 0F, -6.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box48
		chaffeeModel[187].setRotationPoint(0F, -36.5F, 0.5F);

		chaffeeModel[188].addShapeBox(-1F, 0F, -10F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box49
		chaffeeModel[188].setRotationPoint(0F, -36.5F, 0.5F);

		chaffeeModel[189].addShapeBox(-9F, -0.5F, -13F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box50
		chaffeeModel[189].setRotationPoint(0F, -36.5F, 0.5F);

		chaffeeModel[190].addShapeBox(-9F, -0.5F, -6F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box51
		chaffeeModel[190].setRotationPoint(0F, -36.5F, 0.5F);

		chaffeeModel[191].addShapeBox(-27F, 4.8F, -9F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		chaffeeModel[191].setRotationPoint(0F, -36.5F, 0F);

		chaffeeModel[192].addShapeBox(-27F, 8.8F, -9F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		chaffeeModel[192].setRotationPoint(0F, -36.5F, 0F);

		chaffeeModel[193].addShapeBox(-27F, 8.8F, 8F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box2
		chaffeeModel[193].setRotationPoint(0F, -36.5F, 0F);

		chaffeeModel[194].addShapeBox(-27F, 4.8F, 8F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box3
		chaffeeModel[194].setRotationPoint(0F, -36.5F, 0F);

		chaffeeModel[195].addShapeBox(-28.5F, -10F, -7F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box288
		chaffeeModel[195].setRotationPoint(0F, -35F, 0F);

		chaffeeModel[196].addShapeBox(-32.5F, -10F, -7F, 4, 2, 2, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Import Box289
		chaffeeModel[196].setRotationPoint(0F, -35F, 0F);

		chaffeeModel[197].addShapeBox(-34.5F, -10.5F, -8F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box290
		chaffeeModel[197].setRotationPoint(0F, -35F, 0F);

		chaffeeModel[198].addShapeBox(-34.5F, -10.5F, -5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box291
		chaffeeModel[198].setRotationPoint(0F, -35F, 0F);

		chaffeeModel[199].addShapeBox(-19.5F, -9.5F, -6.5F, 5, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Import Box292
		chaffeeModel[199].setRotationPoint(0F, -35F, 0F);

		chaffeeModel[200].addShapeBox(-14.5F, -9.5F, -6.5F, 7, 1, 1, 0F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box293
		chaffeeModel[200].setRotationPoint(0F, -35F, 0F);

		chaffeeModel[201].addShapeBox(-25.5F, -9.8F, -8.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box294
		chaffeeModel[201].setRotationPoint(0F, -35F, 0F);

		chaffeeModel[202].addShapeBox(-33.5F, -10F, -7F, 1, 2, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box295
		chaffeeModel[202].setRotationPoint(0F, -35F, 0F);

		chaffeeModel[203].addShapeBox(-33.5F, -10F, -5F, 1, 2, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box296
		chaffeeModel[203].setRotationPoint(0F, -35F, 0F);

		chaffeeModel[204].addShapeBox(-25.5F, -9.5F, -5F, 4, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box297
		chaffeeModel[204].setRotationPoint(0F, -35F, 0F);

		chaffeeModel[205].addShapeBox(-16.5F, -8.8F, -7.5F, 1, 1, 2, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F); // Import Box299
		chaffeeModel[205].setRotationPoint(0F, -35F, 0F);

		chaffeeModel[206].addShapeBox(-8F, 9F, 12.5F, 41, 41, 1, 0F, 0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F, 0F, 0F, -35F, 0F, -35F, -35F, 0F, -35F, -35F, 0F, 0F, -35F, 0F); // Import Box0
		chaffeeModel[206].setRotationPoint(1F, -36F, 0F);
		chaffeeModel[206].rotateAngleX = 0.45378561F;

		chaffeeModel[207].addShapeBox(-8F, 9F, -13.5F, 41, 41, 1, 0F, 0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F, 0F, 0F, -35F, 0F, -35F, -35F, 0F, -35F, -35F, 0F, 0F, -35F, 0F); // Import Box0
		chaffeeModel[207].setRotationPoint(1F, -36F, 0F);
		chaffeeModel[207].rotateAngleX = -0.45378561F;

		chaffeeModel[208].addShapeBox(0F, -4F, -9F, 8, 5, 18, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import Box34
		chaffeeModel[208].setRotationPoint(10F, -27F, 0F);

		chaffeeModel[209].addShapeBox(0F, -4F, -9F, 8, 3, 18, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F); // Import Box35
		chaffeeModel[209].setRotationPoint(10F, -22F, 0F);

		chaffeeModel[210].addShapeBox(-1F, -4F, -9F, 6, 2, 18, 0F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import Box36
		chaffeeModel[210].setRotationPoint(10F, -29F, 0F);

		chaffeeModel[211].addShapeBox(13F, -4F, -1F, 29, 2, 2, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Import Box194
		chaffeeModel[211].setRotationPoint(10F, -23.5F, 0F);

		chaffeeModel[212].addShapeBox(6F, -4F, -2.5F, 7, 5, 5, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Import Box205
		chaffeeModel[212].setRotationPoint(10F, -25F, 0F);

		chaffeeModel[213].addShapeBox(5.25F, -1F, 3F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box225
		chaffeeModel[213].setRotationPoint(10F, -27F, 0F);

		chaffeeModel[214].addShapeBox(5.25F, -2F, 3F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box226
		chaffeeModel[214].setRotationPoint(10F, -27F, 0F);

		chaffeeModel[215].addShapeBox(5.25F, -2F, 5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box227
		chaffeeModel[215].setRotationPoint(10F, -27F, 0F);

		chaffeeModel[216].addShapeBox(7F, -4F, -6F, 5, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box228
		chaffeeModel[216].setRotationPoint(10F, -24F, 0F);

		chaffeeModel[217].addShapeBox(40F, -4F, -1F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		chaffeeModel[217].setRotationPoint(10F, -23.5F, 0F);

		chaffeeModel[218].addShapeBox(6F, -4F, -6F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		chaffeeModel[218].setRotationPoint(10F, -24F, 0F);

		chaffeeModel[219].addShapeBox(5.25F, -3F, 3F, 2, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		chaffeeModel[219].setRotationPoint(10F, -27F, 0F);

		chaffeeModel[220].addShape3D(6.5F, -6.5F, -5.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Import Shape165
		chaffeeModel[220].setRotationPoint(10.5F, 2.5F, 20.5F);

		chaffeeModel[221].addShape3D(6.5F, -6.5F, -5.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Import Shape1
		chaffeeModel[221].setRotationPoint(-3F, 2.5F, 20.5F);

		chaffeeModel[222].addShape3D(6.5F, -6.5F, -5.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Import Shape2
		chaffeeModel[222].setRotationPoint(24F, 2.5F, 20.5F);

		chaffeeModel[223].addShape3D(6.5F, -6.5F, -5.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Import Shape3
		chaffeeModel[223].setRotationPoint(-16.5F, 2.5F, 20.5F);

		chaffeeModel[224].addShape3D(6.5F, -6.5F, -5.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Import Shape4
		chaffeeModel[224].setRotationPoint(-30F, 2.5F, 20.5F);

		chaffeeModel[225].addShape3D(6.5F, -6.5F, -5.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Import Shape9
		chaffeeModel[225].setRotationPoint(36F, -4.35F, 20.5F);

		chaffeeModel[226].addShape3D(3F, -3F, -26F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Shape535
		chaffeeModel[226].setRotationPoint(17F, -7.5F, 0F);

		chaffeeModel[227].addShape3D(3F, -3F, -26F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Shape11
		chaffeeModel[227].setRotationPoint(3F, -7.5F, 0F);

		chaffeeModel[228].addShape3D(3F, -3F, -26F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Shape12
		chaffeeModel[228].setRotationPoint(-23F, -7.2F, 0F);

		chaffeeModel[229].addShape3D(6.5F, -6.5F, -5.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Import Shape33
		chaffeeModel[229].setRotationPoint(-42F, -4.25F, 20.5F);

		chaffeeModel[230].addShape3D(6.5F, -6.5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Import Shape24
		chaffeeModel[230].setRotationPoint(10.5F, 2.5F, -21.5F);

		chaffeeModel[231].addShape3D(6.5F, -6.5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Import Shape25
		chaffeeModel[231].setRotationPoint(-3F, 2.5F, -21.5F);

		chaffeeModel[232].addShape3D(6.5F, -6.5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Import Shape26
		chaffeeModel[232].setRotationPoint(24F, 2.5F, -21.5F);

		chaffeeModel[233].addShape3D(6.5F, -6.5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Import Shape27
		chaffeeModel[233].setRotationPoint(-16.5F, 2.5F, -21.5F);

		chaffeeModel[234].addShape3D(6.5F, -6.5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Import Shape28
		chaffeeModel[234].setRotationPoint(-30F, 2.5F, -21.5F);

		chaffeeModel[235].addShape3D(6.5F, -6.5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Import Shape29
		chaffeeModel[235].setRotationPoint(36F, -4.35F, -21.5F);

		chaffeeModel[236].addShape3D(3F, -3F, -20F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Shape30
		chaffeeModel[236].setRotationPoint(17F, -7.5F, -43F);

		chaffeeModel[237].addShape3D(3F, -3F, -20F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Shape31
		chaffeeModel[237].setRotationPoint(3F, -7.5F, -43F);

		chaffeeModel[238].addShape3D(3F, -3F, -20F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Shape32
		chaffeeModel[238].setRotationPoint(-23F, -7.2F, -43F);

		chaffeeModel[239].addShape3D(6.5F, -6.5F, -5.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Import Shape1
		chaffeeModel[239].setRotationPoint(-42F, -4.25F, -27.5F);

		chaffeeModel[240].addShapeBox(0F, 0F, 0F, 59, 1, 7, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box67
		chaffeeModel[240].setRotationPoint(-33F, 9F, 21F);

		chaffeeModel[241].addShapeBox(0F, 0F, 0F, 8, 6, 7, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Import Box69
		chaffeeModel[241].setRotationPoint(-49.5F, -13F, 21F);

		chaffeeModel[242].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box70
		chaffeeModel[242].setRotationPoint(-49.8F, -7.5F, 21F);

		chaffeeModel[243].addShapeBox(0F, 0F, 0F, 8, 6, 7, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Import Box72
		chaffeeModel[243].setRotationPoint(35.5F, -13F, 21F);

		chaffeeModel[244].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box73
		chaffeeModel[244].setRotationPoint(42.5F, -7F, 21F);

		chaffeeModel[245].addShapeBox(0F, -1F, 0F, 14, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box74
		chaffeeModel[245].setRotationPoint(26.5F, 10F, 21F);
		chaffeeModel[245].rotateAngleZ = -0.52359878F;

		chaffeeModel[246].addShapeBox(0F, 0F, 0F, 54, 4, 1, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box75
		chaffeeModel[246].setRotationPoint(-30F, -11F, 24F);

		chaffeeModel[247].addShapeBox(0F, -1F, 0F, 7, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box6
		chaffeeModel[247].setRotationPoint(38.6F, 3F, 21F);
		chaffeeModel[247].rotateAngleZ = -0.78539816F;

		chaffeeModel[248].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		chaffeeModel[248].setRotationPoint(-33F, 10F, 21F);
		chaffeeModel[248].rotateAngleZ = -2.63544717F;

		chaffeeModel[249].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		chaffeeModel[249].setRotationPoint(-45.6F, 3F, 21F);
		chaffeeModel[249].rotateAngleZ = -2.32128791F;

		chaffeeModel[250].addShapeBox(0F, 0F, 0F, 78, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		chaffeeModel[250].setRotationPoint(-42F, -13F, 21F);

		chaffeeModel[251].addShapeBox(0F, 0F, 0F, 54, 4, 1, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box172
		chaffeeModel[251].setRotationPoint(-30F, -11F, -25F);

		chaffeeModel[252].addShapeBox(0F, 0F, 0F, 59, 1, 7, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box13
		chaffeeModel[252].setRotationPoint(-33F, 9F, -28F);

		chaffeeModel[253].addShapeBox(0F, 0F, 0F, 78, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box14
		chaffeeModel[253].setRotationPoint(-42F, -13F, -28F);

		chaffeeModel[254].addShapeBox(0F, 0F, 0F, 8, 6, 7, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		chaffeeModel[254].setRotationPoint(-49.5F, -13F, -28F);

		chaffeeModel[255].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box16
		chaffeeModel[255].setRotationPoint(-49.8F, -7.5F, -28F);

		chaffeeModel[256].addShapeBox(0F, 0F, 0F, 8, 6, 7, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Import Box17
		chaffeeModel[256].setRotationPoint(35.5F, -13F, -28F);

		chaffeeModel[257].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		chaffeeModel[257].setRotationPoint(42.5F, -7F, -28F);

		chaffeeModel[258].addShapeBox(0F, -1F, 0F, 14, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box19
		chaffeeModel[258].setRotationPoint(26.5F, 10F, -28F);
		chaffeeModel[258].rotateAngleZ = -0.52359878F;

		chaffeeModel[259].addShapeBox(0F, -1F, 0F, 7, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box21
		chaffeeModel[259].setRotationPoint(38.6F, 3F, -28F);
		chaffeeModel[259].rotateAngleZ = -0.78539816F;

		chaffeeModel[260].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Import Box22
		chaffeeModel[260].setRotationPoint(-33F, 10F, -28F);
		chaffeeModel[260].rotateAngleZ = -2.63544717F;

		chaffeeModel[261].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box23
		chaffeeModel[261].setRotationPoint(-45.6F, 3F, -28F);
		chaffeeModel[261].rotateAngleZ = -2.32128791F;


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 262; i++)
		{
			chaffeeModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo chaffeeModel[];
}