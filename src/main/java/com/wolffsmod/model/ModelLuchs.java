//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Luchs
// Model Creator:
// Created on:-
// Last changed on: -

package com.wolffsmod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelLuchs extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelLuchs()
	{
		luchsModel = new ModelRendererTurbo[276];
		luchsModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		luchsModel[1] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box1
		luchsModel[2] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Import Box2
		luchsModel[3] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Import Box3
		luchsModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import Box4
		luchsModel[5] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Import Box5
		luchsModel[6] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Import Box6
		luchsModel[7] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box18
		luchsModel[8] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import Box19
		luchsModel[9] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Import Box20
		luchsModel[10] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Import Box21
		luchsModel[11] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Import Box22
		luchsModel[12] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box23
		luchsModel[13] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box24
		luchsModel[14] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Import Box27
		luchsModel[15] = new ModelRendererTurbo(this, 401, 400, textureX, textureY); // Import Box106
		luchsModel[16] = new ModelRendererTurbo(this, 401, 400, textureX, textureY); // Import Box107
		luchsModel[17] = new ModelRendererTurbo(this, 401, 400, textureX, textureY); // Import Box108
		luchsModel[18] = new ModelRendererTurbo(this, 401, 400, textureX, textureY); // Import Box109
		luchsModel[19] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Import Box114
		luchsModel[20] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Import Box115
		luchsModel[21] = new ModelRendererTurbo(this, 245, 394, textureX, textureY); // Import Box116
		luchsModel[22] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Import Box117
		luchsModel[23] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Import Box118
		luchsModel[24] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Import Box119
		luchsModel[25] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Import Box121
		luchsModel[26] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import Box122
		luchsModel[27] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box123
		luchsModel[28] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Import Box124
		luchsModel[29] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box125
		luchsModel[30] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box126
		luchsModel[31] = new ModelRendererTurbo(this, 289, 240, textureX, textureY); // Import Box0
		luchsModel[32] = new ModelRendererTurbo(this, 120, 440, textureX, textureY); // Import Box2
		luchsModel[33] = new ModelRendererTurbo(this, 121, 440, textureX, textureY); // Import Box4
		luchsModel[34] = new ModelRendererTurbo(this, 258, 390, textureX, textureY); // Import Box5
		luchsModel[35] = new ModelRendererTurbo(this, 258, 390, textureX, textureY); // Import Box6
		luchsModel[36] = new ModelRendererTurbo(this, 258, 390, textureX, textureY); // Import Box7
		luchsModel[37] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Import Box12
		luchsModel[38] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import Box13
		luchsModel[39] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Import Box15
		luchsModel[40] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box18
		luchsModel[41] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Import Box35
		luchsModel[42] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import Box37
		luchsModel[43] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import Box39
		luchsModel[44] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import Box40
		luchsModel[45] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Import Box0
		luchsModel[46] = new ModelRendererTurbo(this, 240, 385, textureX, textureY); // Import Box1
		luchsModel[47] = new ModelRendererTurbo(this, 240, 385, textureX, textureY); // Import Box0
		luchsModel[48] = new ModelRendererTurbo(this, 240, 385, textureX, textureY); // Import Box1
		luchsModel[49] = new ModelRendererTurbo(this, 140, 430, textureX, textureY); // Import Box0
		luchsModel[50] = new ModelRendererTurbo(this, 289, 240, textureX, textureY); // Import Box0
		luchsModel[51] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Import Box1
		luchsModel[52] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Import Box2
		luchsModel[53] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Import Box5
		luchsModel[54] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box7
		luchsModel[55] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Import Box13
		luchsModel[56] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Import Box14
		luchsModel[57] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box15
		luchsModel[58] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box16
		luchsModel[59] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box17
		luchsModel[60] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Import Box18
		luchsModel[61] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Import Box19
		luchsModel[62] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Import Box28
		luchsModel[63] = new ModelRendererTurbo(this, 101, 427, textureX, textureY); // Import Box29
		luchsModel[64] = new ModelRendererTurbo(this, 102, 383, textureX, textureY); // Import Box30
		luchsModel[65] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Import Box31
		luchsModel[66] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box36
		luchsModel[67] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box37
		luchsModel[68] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box42
		luchsModel[69] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box43
		luchsModel[70] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Import Box50
		luchsModel[71] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Import Box51
		luchsModel[72] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box54
		luchsModel[73] = new ModelRendererTurbo(this, 25, 240, textureX, textureY); // Import Box56
		luchsModel[74] = new ModelRendererTurbo(this, 401, 400, textureX, textureY); // Import Box0
		luchsModel[75] = new ModelRendererTurbo(this, 401, 400, textureX, textureY); // Import Box1
		luchsModel[76] = new ModelRendererTurbo(this, 401, 400, textureX, textureY); // Import Box2
		luchsModel[77] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Import Box21
		luchsModel[78] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Import Box22
		luchsModel[79] = new ModelRendererTurbo(this, 140, 430, textureX, textureY); // Import Box35
		luchsModel[80] = new ModelRendererTurbo(this, 140, 430, textureX, textureY); // Import Box36
		luchsModel[81] = new ModelRendererTurbo(this, 140, 430, textureX, textureY); // Import Box37
		luchsModel[82] = new ModelRendererTurbo(this, 140, 430, textureX, textureY); // Import Box38
		luchsModel[83] = new ModelRendererTurbo(this, 140, 430, textureX, textureY); // Import Box39
		luchsModel[84] = new ModelRendererTurbo(this, 140, 430, textureX, textureY); // Import Box40
		luchsModel[85] = new ModelRendererTurbo(this, 140, 430, textureX, textureY); // Import Box41
		luchsModel[86] = new ModelRendererTurbo(this, 140, 430, textureX, textureY); // Import Box42
		luchsModel[87] = new ModelRendererTurbo(this, 125, 440, textureX, textureY); // Import Box10
		luchsModel[88] = new ModelRendererTurbo(this, 125, 440, textureX, textureY); // Import Box11
		luchsModel[89] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Import Box14
		luchsModel[90] = new ModelRendererTurbo(this, 300, 202, textureX, textureY); // Import Box15
		luchsModel[91] = new ModelRendererTurbo(this, 300, 202, textureX, textureY); // Import Box4
		luchsModel[92] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box6
		luchsModel[93] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Import Box7
		luchsModel[94] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Import Box28
		luchsModel[95] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Import Box29
		luchsModel[96] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box34
		luchsModel[97] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box36
		luchsModel[98] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box37
		luchsModel[99] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box38
		luchsModel[100] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box39
		luchsModel[101] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box40
		luchsModel[102] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box41
		luchsModel[103] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box42
		luchsModel[104] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box43
		luchsModel[105] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box48
		luchsModel[106] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box49
		luchsModel[107] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box64
		luchsModel[108] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box65
		luchsModel[109] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Import Box68
		luchsModel[110] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Import Box69
		luchsModel[111] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Import Box88
		luchsModel[112] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Import Box89
		luchsModel[113] = new ModelRendererTurbo(this, 0, 195, textureX, textureY); // Import Box0
		luchsModel[114] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Import Box5
		luchsModel[115] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Import Box6
		luchsModel[116] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Import Box7
		luchsModel[117] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Import Box8
		luchsModel[118] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Import Box9
		luchsModel[119] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Import Box12
		luchsModel[120] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box0
		luchsModel[121] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box1
		luchsModel[122] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Import Box2
		luchsModel[123] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Import Box3
		luchsModel[124] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Import Box4
		luchsModel[125] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Import Box5
		luchsModel[126] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Import Box6
		luchsModel[127] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Import Box7
		luchsModel[128] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Import Box8
		luchsModel[129] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Import Box9
		luchsModel[130] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Import Box0
		luchsModel[131] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Import Box1
		luchsModel[132] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Import Box2
		luchsModel[133] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Import Box3
		luchsModel[134] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Import Box4
		luchsModel[135] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Import Box5
		luchsModel[136] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Import Box6
		luchsModel[137] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Import Box7
		luchsModel[138] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Import Box8
		luchsModel[139] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Import Box9
		luchsModel[140] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Import Box10
		luchsModel[141] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Import Box11
		luchsModel[142] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Import Box12
		luchsModel[143] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Import Box13
		luchsModel[144] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Import Box0
		luchsModel[145] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box1
		luchsModel[146] = new ModelRendererTurbo(this, 125, 440, textureX, textureY); // Import Box2
		luchsModel[147] = new ModelRendererTurbo(this, 125, 440, textureX, textureY); // Import Box3
		luchsModel[148] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Import Box10
		luchsModel[149] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box0
		luchsModel[150] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box0
		luchsModel[151] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Import Box3
		luchsModel[152] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Import Box4
		luchsModel[153] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Import Box5
		luchsModel[154] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import Box6
		luchsModel[155] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Import Box7
		luchsModel[156] = new ModelRendererTurbo(this, 101, 427, textureX, textureY); // Import Box8
		luchsModel[157] = new ModelRendererTurbo(this, 102, 383, textureX, textureY); // Import Box9
		luchsModel[158] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Import Box10
		luchsModel[159] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Import Box0
		luchsModel[160] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Import Box1
		luchsModel[161] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Import Box2
		luchsModel[162] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Import Box3
		luchsModel[163] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Import Box4
		luchsModel[164] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Import Box5
		luchsModel[165] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Import Box6
		luchsModel[166] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Import Box7
		luchsModel[167] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Import Box8
		luchsModel[168] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Import Box9
		luchsModel[169] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Import Box10
		luchsModel[170] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Import Box11
		luchsModel[171] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Import Box12
		luchsModel[172] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Import Box13
		luchsModel[173] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Import Box14
		luchsModel[174] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Import Box15
		luchsModel[175] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Import Box16
		luchsModel[176] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Import Box17
		luchsModel[177] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box18
		luchsModel[178] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box19
		luchsModel[179] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box20
		luchsModel[180] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box21
		luchsModel[181] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box22
		luchsModel[182] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box23
		luchsModel[183] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box24
		luchsModel[184] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box25
		luchsModel[185] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box26
		luchsModel[186] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box27
		luchsModel[187] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box28
		luchsModel[188] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box29
		luchsModel[189] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box30
		luchsModel[190] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box31
		luchsModel[191] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box32
		luchsModel[192] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box33
		luchsModel[193] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box7
		luchsModel[194] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Import Box8
		luchsModel[195] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Import Box9
		luchsModel[196] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Import Box0
		luchsModel[197] = new ModelRendererTurbo(this, 450, 175, textureX, textureY); // Import Box1
		luchsModel[198] = new ModelRendererTurbo(this, 170, 370, textureX, textureY); // Import Box21
		luchsModel[199] = new ModelRendererTurbo(this, 170, 370, textureX, textureY); // Import Box22
		luchsModel[200] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Import Box207
		luchsModel[201] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Import Box208
		luchsModel[202] = new ModelRendererTurbo(this, 145, 205, textureX, textureY); // Import Box0
		luchsModel[203] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Import Box0
		luchsModel[204] = new ModelRendererTurbo(this, 401, 161, textureX, textureY); // Import Box218
		luchsModel[205] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Import Box217
		luchsModel[206] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Import Box219
		luchsModel[207] = new ModelRendererTurbo(this, 115, 432, textureX, textureY); // Import Box122
		luchsModel[208] = new ModelRendererTurbo(this, 115, 432, textureX, textureY); // Import Box123
		luchsModel[209] = new ModelRendererTurbo(this, 115, 432, textureX, textureY); // Import Box124
		luchsModel[210] = new ModelRendererTurbo(this, 260, 400, textureX, textureY); // Import Box131
		luchsModel[211] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Import Box132
		luchsModel[212] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Box181
		luchsModel[213] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Box180
		luchsModel[214] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Box179
		luchsModel[215] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Box176
		luchsModel[216] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Box177
		luchsModel[217] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Box178
		luchsModel[218] = new ModelRendererTurbo(this, 0, 284, textureX, textureY); // Import Box0
		luchsModel[219] = new ModelRendererTurbo(this, 134, 443, textureX, textureY); // Import Box1
		luchsModel[220] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Import Box2
		luchsModel[221] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box11
		luchsModel[222] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box13
		luchsModel[223] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box14
		luchsModel[224] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box15
		luchsModel[225] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box16
		luchsModel[226] = new ModelRendererTurbo(this, 233, 240, textureX, textureY); // Import Box17
		luchsModel[227] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Import Box23
		luchsModel[228] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Import Box24
		luchsModel[229] = new ModelRendererTurbo(this, 141, 380, textureX, textureY); // Import Box1
		luchsModel[230] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Import Shape52
		luchsModel[231] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Import Shape4
		luchsModel[232] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Import Shape5
		luchsModel[233] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Import Shape6
		luchsModel[234] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Import Shape7
		luchsModel[235] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Import Shape8
		luchsModel[236] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Import Shape9
		luchsModel[237] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Import Shape10
		luchsModel[238] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Import Shape11
		luchsModel[239] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Import Shape23
		luchsModel[240] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Import Shape24
		luchsModel[241] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Import Shape25
		luchsModel[242] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Import Shape26
		luchsModel[243] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Import Shape27
		luchsModel[244] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Import Shape28
		luchsModel[245] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Import Shape29
		luchsModel[246] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Import Shape30
		luchsModel[247] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Import Shape31
		luchsModel[248] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Import Box91
		luchsModel[249] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Import Box92
		luchsModel[250] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box93
		luchsModel[251] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Import Box94
		luchsModel[252] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Import Box95
		luchsModel[253] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Import Box97
		luchsModel[254] = new ModelRendererTurbo(this, 393, 244, textureX, textureY); // Import Box98
		luchsModel[255] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Box99
		luchsModel[256] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Import Box101
		luchsModel[257] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Import Box102
		luchsModel[258] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Import Box103
		luchsModel[259] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box104
		luchsModel[260] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box105
		luchsModel[261] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Import Box4
		luchsModel[262] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Import Box14
		luchsModel[263] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Import Box15
		luchsModel[264] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box16
		luchsModel[265] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Import Box17
		luchsModel[266] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Import Box18
		luchsModel[267] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Import Box19
		luchsModel[268] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Import Box20
		luchsModel[269] = new ModelRendererTurbo(this, 393, 244, textureX, textureY); // Import Box21
		luchsModel[270] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Box22
		luchsModel[271] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Import Box5
		luchsModel[272] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Import Box6
		luchsModel[273] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Import Box7
		luchsModel[274] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box8
		luchsModel[275] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box9

		luchsModel[0].addShapeBox(0F, 0F, 0F, 80, 12, 29, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F); // Import Box0
		luchsModel[0].setRotationPoint(-38F, -9F, -14.5F);

		luchsModel[1].addShapeBox(0F, 0F, 0F, 14, 4, 30, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		luchsModel[1].setRotationPoint(28F, -14F, -15F);

		luchsModel[2].addShapeBox(0F, 0F, 0F, 68, 4, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box2
		luchsModel[2].setRotationPoint(-40F, -14F, -15F);

		luchsModel[3].addShapeBox(0F, 0F, 0F, 26, 6, 34, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box3
		luchsModel[3].setRotationPoint(-1F, -20F, -17F);

		luchsModel[4].addShapeBox(0F, 0F, 0F, 22, 6, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box4
		luchsModel[4].setRotationPoint(-23F, -20F, -17F);

		luchsModel[5].addShapeBox(0F, 0F, 0F, 6, 4, 30, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box5
		luchsModel[5].setRotationPoint(-29F, -18F, -15F);

		luchsModel[6].addShapeBox(0F, 0F, 0F, 12, 3, 30, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box6
		luchsModel[6].setRotationPoint(-41F, -17F, -15F);

		luchsModel[7].addBox(0F, 0F, 0F, 1, 3, 8, 0F); // Import Box18
		luchsModel[7].setRotationPoint(24F, -18F, -11.5F);
		luchsModel[7].rotateAngleZ = -0.13962634F;

		luchsModel[8].addBox(0F, 0F, 0F, 1, 3, 8, 0F); // Import Box19
		luchsModel[8].setRotationPoint(24F, -18F, 3.5F);
		luchsModel[8].rotateAngleZ = -0.13962634F;

		luchsModel[9].addBox(0F, 0F, 0F, 62, 1, 9, 0F); // Import Box20
		luchsModel[9].setRotationPoint(-30F, -14F, -24F);

		luchsModel[10].addBox(0F, 0F, 0F, 62, 1, 9, 0F); // Import Box21
		luchsModel[10].setRotationPoint(-30F, -14F, 15F);

		luchsModel[11].addShapeBox(0F, 0F, 0F, 9, 1, 9, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box22
		luchsModel[11].setRotationPoint(32F, -14F, -24F);

		luchsModel[12].addShapeBox(0F, 0F, 0F, 9, 1, 9, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box23
		luchsModel[12].setRotationPoint(32F, -14F, 15F);

		luchsModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box24
		luchsModel[13].setRotationPoint(41F, -12F, 15F);

		luchsModel[14].addShapeBox(0F, 0F, 0F, 9, 1, 9, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Import Box27
		luchsModel[14].setRotationPoint(-39F, -9F, -24F);

		luchsModel[15].addBox(0F, 0F, 0F, 2, 2, 40, 0F); // Import Box106
		luchsModel[15].setRotationPoint(13F, 1.5F, -20F);

		luchsModel[16].addBox(0F, 0F, 0F, 2, 2, 40, 0F); // Import Box107
		luchsModel[16].setRotationPoint(-8F, 1.5F, -20F);

		luchsModel[17].addBox(0F, 0F, 0F, 2, 2, 42, 0F); // Import Box108
		luchsModel[17].setRotationPoint(-29.5F, -0.5F, -21F);

		luchsModel[18].addBox(0F, 0F, 0F, 2, 2, 42, 0F); // Import Box109
		luchsModel[18].setRotationPoint(33F, -3F, -21F);

		luchsModel[19].addBox(-1F, 0F, 0F, 3, 6, 10, 0F); // Import Box114
		luchsModel[19].setRotationPoint(-42F, -16F, 3F);
		luchsModel[19].rotateAngleZ = -0.36651914F;

		luchsModel[20].addShapeBox(-2F, 0F, 0F, 1, 6, 10, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box115
		luchsModel[20].setRotationPoint(-42F, -16F, 3F);
		luchsModel[20].rotateAngleZ = -0.36651914F;

		luchsModel[21].addBox(-1F, 1F, 10F, 2, 2, 1, 0F); // Import Box116
		luchsModel[21].setRotationPoint(-42F, -16F, 3F);
		luchsModel[21].rotateAngleZ = -0.2268928F;

		luchsModel[22].addBox(-1F, 1F, 0F, 4, 6, 4, 0F); // Import Box117
		luchsModel[22].setRotationPoint(-43.5F, -16.5F, -13F);
		luchsModel[22].rotateAngleY = -0.05235988F;
		luchsModel[22].rotateAngleZ = -0.36651914F;

		luchsModel[23].addBox(-1F, 1F, 5F, 4, 6, 4, 0F); // Import Box118
		luchsModel[23].setRotationPoint(-43F, -16.5F, -13F);
		luchsModel[23].rotateAngleZ = -0.27925268F;

		luchsModel[24].addBox(-1F, 1F, 0F, 5, 4, 10, 0F); // Import Box119
		luchsModel[24].setRotationPoint(-43F, -14F, -13.5F);
		luchsModel[24].rotateAngleZ = -0.34906585F;

		luchsModel[25].addBox(0F, 0F, 0F, 26, 4, 6, 0F); // Import Box121
		luchsModel[25].setRotationPoint(-25.5F, -18F, -23.5F);
		luchsModel[25].rotateAngleY = 0.03490659F;

		luchsModel[26].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Import Box122
		luchsModel[26].setRotationPoint(17F, -18F, 14.8F);
		luchsModel[26].rotateAngleY = 0.08726646F;

		luchsModel[27].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Import Box123
		luchsModel[27].setRotationPoint(19F, -18F, -16F);
		luchsModel[27].rotateAngleY = -0.08726646F;

		luchsModel[28].addBox(0F, 0F, 0F, 12, 6, 7, 0F); // Import Box124
		luchsModel[28].setRotationPoint(-26F, -20F, 10.1F);

		luchsModel[29].addBox(0F, 0F, 0F, 12, 5, 6, 0F); // Import Box125
		luchsModel[29].setRotationPoint(-26F, -19F, 17.5F);
		luchsModel[29].rotateAngleY = 0.01745329F;

		luchsModel[30].addBox(0F, 0F, 0F, 12, 5, 6, 0F); // Import Box126
		luchsModel[30].setRotationPoint(-13F, -19F, 17.5F);
		luchsModel[30].rotateAngleY = -0.03490659F;

		luchsModel[31].addBox(0F, 0F, 0F, 1, 1, 26, 0F); // Import Box0
		luchsModel[31].setRotationPoint(-40F, -17.3F, -13F);
		luchsModel[31].rotateAngleZ = -0.06981317F;

		luchsModel[32].addBox(0F, 0F, -4F, 2, 2, 4, 0F); // Import Box2
		luchsModel[32].setRotationPoint(-41F, -13F, 3F);
		luchsModel[32].rotateAngleZ = -0.36651914F;

		luchsModel[33].addBox(0F, 2F, -4F, 2, 4, 2, 0F); // Import Box4
		luchsModel[33].setRotationPoint(-41F, -13F, 3F);
		luchsModel[33].rotateAngleZ = -0.36651914F;

		luchsModel[34].addShapeBox(-0.5F, 6F, -4F, 3, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box5
		luchsModel[34].setRotationPoint(-41F, -13F, 3F);
		luchsModel[34].rotateAngleZ = -0.36651914F;

		luchsModel[35].addShapeBox(-0.5F, 6F, -2F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import Box6
		luchsModel[35].setRotationPoint(-41F, -13F, 3F);
		luchsModel[35].rotateAngleZ = -0.36651914F;

		luchsModel[36].addShapeBox(-0.5F, 6F, -5F, 3, 4, 1, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		luchsModel[36].setRotationPoint(-41F, -13F, 3F);
		luchsModel[36].rotateAngleZ = -0.36651914F;

		luchsModel[37].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Import Box12
		luchsModel[37].setRotationPoint(23.5F, -18F, -2.5F);
		luchsModel[37].rotateAngleZ = -0.13962634F;

		luchsModel[38].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F, 0F, 0F, 0.2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F); // Import Box13
		luchsModel[38].setRotationPoint(27F, -16F, -2F);
		luchsModel[38].rotateAngleZ = 0.13962634F;

		luchsModel[39].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		luchsModel[39].setRotationPoint(16F, -20.5F, 4F);

		luchsModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Import Box18
		luchsModel[40].setRotationPoint(31F, -15F, -15F);

		luchsModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box35
		luchsModel[41].setRotationPoint(16F, -20.7F, 4F);

		luchsModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box37
		luchsModel[42].setRotationPoint(21F, -20.7F, 7F);

		luchsModel[43].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Import Box39
		luchsModel[43].setRotationPoint(23.5F, -17.85F, 3.5F);
		luchsModel[43].rotateAngleZ = -0.29670597F;

		luchsModel[44].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Import Box40
		luchsModel[44].setRotationPoint(23.5F, -17.85F, -11.5F);
		luchsModel[44].rotateAngleZ = -0.29670597F;

		luchsModel[45].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Import Box0
		luchsModel[45].setRotationPoint(17F, -18F, 15F);
		luchsModel[45].rotateAngleX = 0.87266463F;
		luchsModel[45].rotateAngleY = 0.08726646F;

		luchsModel[46].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Import Box1
		luchsModel[46].setRotationPoint(7F, -19F, -21F);

		luchsModel[47].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F); // Import Box0
		luchsModel[47].setRotationPoint(8.2F, -19F, -21F);

		luchsModel[48].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F); // Import Box1
		luchsModel[48].setRotationPoint(5.8F, -19F, -21F);

		luchsModel[49].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Import Box0
		luchsModel[49].setRotationPoint(7F, -41F, -20F);

		luchsModel[50].addBox(8F, 0F, 0F, 1, 1, 26, 0F); // Import Box0
		luchsModel[50].setRotationPoint(-40F, -17.3F, -13F);
		luchsModel[50].rotateAngleZ = -0.06981317F;

		luchsModel[51].addBox(1F, 0F, 0F, 7, 1, 1, 0F); // Import Box1
		luchsModel[51].setRotationPoint(-40F, -17.3F, -13F);
		luchsModel[51].rotateAngleZ = -0.06981317F;

		luchsModel[52].addBox(1F, 0F, 0F, 7, 1, 1, 0F); // Import Box2
		luchsModel[52].setRotationPoint(-40F, -17.3F, 12F);
		luchsModel[52].rotateAngleZ = -0.06981317F;

		luchsModel[53].addShapeBox(7F, 0F, 1F, 1, 1, 24, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Import Box5
		luchsModel[53].setRotationPoint(-40F, -17.3F, -13F);
		luchsModel[53].rotateAngleZ = -0.06981317F;

		luchsModel[54].addShapeBox(8F, -3F, -9.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		luchsModel[54].setRotationPoint(42F, -12F, 7F);
		luchsModel[54].rotateAngleZ = 1.9623592F;

		luchsModel[55].addShapeBox(3.5F, -2F, -10F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box13
		luchsModel[55].setRotationPoint(42F, -12F, 0F);
		luchsModel[55].rotateAngleZ = 1.9623592F;

		luchsModel[56].addShapeBox(3.5F, -2F, -10F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box14
		luchsModel[56].setRotationPoint(42F, -12F, -2F);
		luchsModel[56].rotateAngleZ = 1.9623592F;

		luchsModel[57].addShapeBox(8F, -3F, -9.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		luchsModel[57].setRotationPoint(42F, -12F, -2F);
		luchsModel[57].rotateAngleZ = 1.9623592F;

		luchsModel[58].addShapeBox(8F, -3F, -9.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box16
		luchsModel[58].setRotationPoint(42F, -12F, 1F);
		luchsModel[58].rotateAngleZ = 1.9623592F;

		luchsModel[59].addShapeBox(8F, -3F, -9.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		luchsModel[59].setRotationPoint(42F, -12F, 4F);
		luchsModel[59].rotateAngleZ = 1.9623592F;

		luchsModel[60].addShapeBox(9F, -1.5F, -10F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		luchsModel[60].setRotationPoint(42F, -12F, -3F);
		luchsModel[60].rotateAngleZ = 1.9623592F;

		luchsModel[61].addShapeBox(4F, -1.5F, -10F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box19
		luchsModel[61].setRotationPoint(42F, -12F, -3F);
		luchsModel[61].rotateAngleZ = 1.9623592F;

		luchsModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box28
		luchsModel[62].setRotationPoint(28F, -18.5F, 17.5F);

		luchsModel[63].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box29
		luchsModel[63].setRotationPoint(29F, -16.5F, 19F);

		luchsModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.3F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.3F, 0.5F); // Import Box30
		luchsModel[64].setRotationPoint(29F, -14.5F, 19F);

		luchsModel[65].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box31
		luchsModel[65].setRotationPoint(28F, -17.5F, 17.5F);

		luchsModel[66].addShapeBox(8F, -3F, -3.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box36
		luchsModel[66].setRotationPoint(42F, -12F, 4F);
		luchsModel[66].rotateAngleZ = 1.9623592F;

		luchsModel[67].addShapeBox(8F, -3F, -3.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box37
		luchsModel[67].setRotationPoint(42F, -12F, 7F);
		luchsModel[67].rotateAngleZ = 1.9623592F;

		luchsModel[68].addShapeBox(8F, -3F, 2.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box42
		luchsModel[68].setRotationPoint(42F, -12F, 4F);
		luchsModel[68].rotateAngleZ = 1.9623592F;

		luchsModel[69].addShapeBox(8F, -3F, 2.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box43
		luchsModel[69].setRotationPoint(42F, -12F, 7F);
		luchsModel[69].rotateAngleZ = 1.9623592F;

		luchsModel[70].addShapeBox(-3.5F, -2.1F, -4F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box50
		luchsModel[70].setRotationPoint(36F, -11F, 7F);
		luchsModel[70].rotateAngleZ = 0.19957665F;

		luchsModel[71].addShapeBox(-3.5F, -2.1F, -4F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box51
		luchsModel[71].setRotationPoint(36F, -11F, 5F);
		luchsModel[71].rotateAngleZ = 0.19957665F;

		luchsModel[72].addShapeBox(1F, -3.1F, 2.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box54
		luchsModel[72].setRotationPoint(36F, -11F, 5F);
		luchsModel[72].rotateAngleZ = 0.19957665F;

		luchsModel[73].addShapeBox(0F, 0F, 0F, 80, 1, 29, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box56
		luchsModel[73].setRotationPoint(-38F, -10F, -14.5F);

		luchsModel[74].addBox(-1F, -1F, 0F, 2, 2, 42, 0F); // Import Box0
		luchsModel[74].setRotationPoint(23F, 2.5F, -21F);

		luchsModel[75].addBox(-1F, -1F, 0F, 2, 2, 42, 0F); // Import Box1
		luchsModel[75].setRotationPoint(-17F, 2.5F, -21F);

		luchsModel[76].addBox(-1F, -1F, 0F, 2, 2, 42, 0F); // Import Box2
		luchsModel[76].setRotationPoint(4F, 2.5F, -21F);

		luchsModel[77].addBox(0F, 0F, 0F, 3, 16, 2, 0F); // Import Box21
		luchsModel[77].setRotationPoint(19F, -13F, -15.6F);
		luchsModel[77].rotateAngleZ = -0.19198622F;

		luchsModel[78].addBox(-3F, 0F, 0F, 3, 16, 2, 0F); // Import Box22
		luchsModel[78].setRotationPoint(-12.5F, -13F, -15.6F);
		luchsModel[78].rotateAngleZ = 0.19198622F;

		luchsModel[79].addShapeBox(-0.5F, -5F, -0.5F, 1, 3, 1, 0F, -4.2F, 0F, -0.2F, 3.8F, 0F, -0.2F, 3.8F, 0F, -0.2F, -4.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Import Box35
		luchsModel[79].setRotationPoint(7.5F, -39F, -19.5F);

		luchsModel[80].addShapeBox(-0.5F, -5F, -0.5F, 1, 3, 1, 0F, -4.2F, 0F, -0.2F, 3.8F, 0F, -0.2F, 3.8F, 0F, -0.2F, -4.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Import Box36
		luchsModel[80].setRotationPoint(7.5F, -39F, -19.5F);
		luchsModel[80].rotateAngleY = 1.57079633F;

		luchsModel[81].addShapeBox(-0.5F, -5F, -0.5F, 1, 3, 1, 0F, -4.2F, 0F, -0.2F, 3.8F, 0F, -0.2F, 3.8F, 0F, -0.2F, -4.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Import Box37
		luchsModel[81].setRotationPoint(7.5F, -39F, -19.5F);
		luchsModel[81].rotateAngleY = 3.14159265F;

		luchsModel[82].addShapeBox(-0.5F, -5F, -0.5F, 1, 3, 1, 0F, -4.2F, 0F, -0.2F, 3.8F, 0F, -0.2F, 3.8F, 0F, -0.2F, -4.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Import Box38
		luchsModel[82].setRotationPoint(7.5F, -39F, -19.5F);
		luchsModel[82].rotateAngleY = 4.71238898F;

		luchsModel[83].addShapeBox(-0.5F, -5F, -0.5F, 1, 3, 1, 0F, -4.2F, 0F, -0.2F, 3.8F, 0F, -0.2F, 3.8F, 0F, -0.2F, -4.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Import Box39
		luchsModel[83].setRotationPoint(7.5F, -39F, -19.5F);
		luchsModel[83].rotateAngleY = 4.01425728F;

		luchsModel[84].addShapeBox(-0.5F, -5F, -0.5F, 1, 3, 1, 0F, -4.2F, 0F, -0.2F, 3.8F, 0F, -0.2F, 3.8F, 0F, -0.2F, -4.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Import Box40
		luchsModel[84].setRotationPoint(7.5F, -39F, -19.5F);
		luchsModel[84].rotateAngleY = 5.58505361F;

		luchsModel[85].addShapeBox(-0.5F, -5F, -0.5F, 1, 3, 1, 0F, -4.2F, 0F, -0.2F, 3.8F, 0F, -0.2F, 3.8F, 0F, -0.2F, -4.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Import Box41
		luchsModel[85].setRotationPoint(7.5F, -39F, -19.5F);
		luchsModel[85].rotateAngleY = 0.87266463F;

		luchsModel[86].addShapeBox(-0.5F, -5F, -0.5F, 1, 3, 1, 0F, -4.2F, 0F, -0.2F, 3.8F, 0F, -0.2F, 3.8F, 0F, -0.2F, -4.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Import Box42
		luchsModel[86].setRotationPoint(7.5F, -39F, -19.5F);
		luchsModel[86].rotateAngleY = 2.44346095F;

		luchsModel[87].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Import Box10
		luchsModel[87].setRotationPoint(41F, -10.5F, -15F);

		luchsModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F); // Import Box11
		luchsModel[88].setRotationPoint(41F, -7.5F, -15F);

		luchsModel[89].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Import Box14
		luchsModel[89].setRotationPoint(24F, -18F, -2.5F);
		luchsModel[89].rotateAngleZ = -0.66322512F;

		luchsModel[90].addShapeBox(0F, 0F, 0F, 12, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		luchsModel[90].setRotationPoint(-26F, -21F, 10.1F);

		luchsModel[91].addShapeBox(0F, 0F, 0F, 12, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box4
		luchsModel[91].setRotationPoint(-26F, -21F, -17.1F);

		luchsModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Import Box6
		luchsModel[92].setRotationPoint(24.5F, -14.5F, -14.9F);

		luchsModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Import Box7
		luchsModel[93].setRotationPoint(24.5F, -14.5F, -23.9F);

		luchsModel[94].addShapeBox(-3.5F, -2.1F, -7F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box28
		luchsModel[94].setRotationPoint(36F, -11F, 5F);
		luchsModel[94].rotateAngleZ = 0.19957665F;

		luchsModel[95].addShapeBox(-3.5F, -2.1F, -7F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box29
		luchsModel[95].setRotationPoint(36F, -11F, 7F);
		luchsModel[95].rotateAngleZ = 0.19957665F;

		luchsModel[96].addShapeBox(-1F, -3.1F, 2.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box34
		luchsModel[96].setRotationPoint(36F, -11F, 5F);
		luchsModel[96].rotateAngleZ = 0.19957665F;

		luchsModel[97].addShapeBox(6F, -3F, 2.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box36
		luchsModel[97].setRotationPoint(42F, -12F, 7F);
		luchsModel[97].rotateAngleZ = 1.9623592F;

		luchsModel[98].addShapeBox(6F, -3F, 2.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box37
		luchsModel[98].setRotationPoint(42F, -12F, 4F);
		luchsModel[98].rotateAngleZ = 1.9623592F;

		luchsModel[99].addShapeBox(6F, -3F, -3.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box38
		luchsModel[99].setRotationPoint(42F, -12F, 7F);
		luchsModel[99].rotateAngleZ = 1.9623592F;

		luchsModel[100].addShapeBox(6F, -3F, -3.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box39
		luchsModel[100].setRotationPoint(42F, -12F, 4F);
		luchsModel[100].rotateAngleZ = 1.9623592F;

		luchsModel[101].addShapeBox(6F, -3F, -9.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		luchsModel[101].setRotationPoint(42F, -12F, 7F);
		luchsModel[101].rotateAngleZ = 1.9623592F;

		luchsModel[102].addShapeBox(6F, -3F, -9.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box41
		luchsModel[102].setRotationPoint(42F, -12F, 4F);
		luchsModel[102].rotateAngleZ = 1.9623592F;

		luchsModel[103].addShapeBox(6F, -3F, -9.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box42
		luchsModel[103].setRotationPoint(42F, -12F, 1F);
		luchsModel[103].rotateAngleZ = 1.9623592F;

		luchsModel[104].addShapeBox(6F, -3F, -9.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box43
		luchsModel[104].setRotationPoint(42F, -12F, -2F);
		luchsModel[104].rotateAngleZ = 1.9623592F;

		luchsModel[105].addShapeBox(1F, -3.1F, 2.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box48
		luchsModel[105].setRotationPoint(36F, -11.9F, 13F);
		luchsModel[105].rotateAngleZ = 0.19957665F;

		luchsModel[106].addShapeBox(-1F, -3.1F, 2.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box49
		luchsModel[106].setRotationPoint(36F, -11.9F, 13F);
		luchsModel[106].rotateAngleZ = 0.19957665F;

		luchsModel[107].addShapeBox(1F, -3.1F, 2.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box64
		luchsModel[107].setRotationPoint(36F, -11.9F, -26F);
		luchsModel[107].rotateAngleZ = 0.19957665F;

		luchsModel[108].addShapeBox(-1F, -3.1F, 2.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box65
		luchsModel[108].setRotationPoint(36F, -11.9F, -26F);
		luchsModel[108].rotateAngleZ = 0.19957665F;

		luchsModel[109].addBox(0F, 0F, 0F, 3, 16, 2, 0F); // Import Box68
		luchsModel[109].setRotationPoint(19F, -13F, 13.6F);
		luchsModel[109].rotateAngleZ = -0.19198622F;

		luchsModel[110].addBox(-3F, 0F, 0F, 3, 16, 2, 0F); // Import Box69
		luchsModel[110].setRotationPoint(-12.5F, -13F, 13.6F);
		luchsModel[110].rotateAngleZ = 0.19198622F;

		luchsModel[111].addShapeBox(0F, 0F, 0F, 4, 1, 17, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box88
		luchsModel[111].setRotationPoint(-19F, -20.5F, -8F);

		luchsModel[112].addShapeBox(0F, 0F, 0F, 4, 1, 17, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box89
		luchsModel[112].setRotationPoint(-24F, -20.5F, -8F);

		luchsModel[113].addShapeBox(0F, 0F, 0F, 35, 1, 35, 0F, 0F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, -25F, 0F, 0F, -25F); // Import Box0
		luchsModel[113].setRotationPoint(28F, -14.2F, -13F);
		luchsModel[113].rotateAngleZ = 0.20943951F;

		luchsModel[114].addShapeBox(6F, 0F, 1F, 1, 1, 24, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Import Box5
		luchsModel[114].setRotationPoint(-40F, -17.3F, -13F);
		luchsModel[114].rotateAngleZ = -0.06981317F;

		luchsModel[115].addShapeBox(5F, 0F, 1F, 1, 1, 24, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Import Box6
		luchsModel[115].setRotationPoint(-40F, -17.3F, -13F);
		luchsModel[115].rotateAngleZ = -0.06981317F;

		luchsModel[116].addShapeBox(2F, 0F, 1F, 1, 1, 24, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Import Box7
		luchsModel[116].setRotationPoint(-40F, -17.3F, -13F);
		luchsModel[116].rotateAngleZ = -0.06981317F;

		luchsModel[117].addShapeBox(3F, 0F, 1F, 1, 1, 24, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Import Box8
		luchsModel[117].setRotationPoint(-40F, -17.3F, -13F);
		luchsModel[117].rotateAngleZ = -0.06981317F;

		luchsModel[118].addShapeBox(4F, 0F, 1F, 1, 1, 24, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Import Box9
		luchsModel[118].setRotationPoint(-40F, -17.3F, -13F);
		luchsModel[118].rotateAngleZ = -0.06981317F;

		luchsModel[119].addShapeBox(1F, 0F, 1F, 1, 1, 24, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Import Box12
		luchsModel[119].setRotationPoint(-40F, -17.3F, -13F);
		luchsModel[119].rotateAngleZ = -0.06981317F;

		luchsModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Import Box0
		luchsModel[120].setRotationPoint(31F, -15F, 13F);

		luchsModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Import Box1
		luchsModel[121].setRotationPoint(24.5F, -14.5F, 12.9F);

		luchsModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Import Box2
		luchsModel[122].setRotationPoint(31F, -15F, -23.9F);

		luchsModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Import Box3
		luchsModel[123].setRotationPoint(24.5F, -14.5F, 14.9F);

		luchsModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Import Box4
		luchsModel[124].setRotationPoint(31F, -15F, 14.9F);

		luchsModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Import Box5
		luchsModel[125].setRotationPoint(-0.5F, -14.5F, 14.9F);

		luchsModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Import Box6
		luchsModel[126].setRotationPoint(-14F, -14.5F, 14.9F);

		luchsModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Import Box7
		luchsModel[127].setRotationPoint(-27.5F, -14.5F, 14.9F);

		luchsModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Import Box8
		luchsModel[128].setRotationPoint(-27F, -14.5F, -23.9F);

		luchsModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Import Box9
		luchsModel[129].setRotationPoint(1F, -14.5F, -23.9F);

		luchsModel[130].addShapeBox(3.5F, -2F, -7F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		luchsModel[130].setRotationPoint(42F, -12F, 0F);
		luchsModel[130].rotateAngleZ = 1.9623592F;

		luchsModel[131].addShapeBox(3.5F, -2F, -7F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		luchsModel[131].setRotationPoint(42F, -12F, -2F);
		luchsModel[131].rotateAngleZ = 1.9623592F;

		luchsModel[132].addShapeBox(3.5F, -2F, -1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box2
		luchsModel[132].setRotationPoint(42F, -12F, 0F);
		luchsModel[132].rotateAngleZ = 1.9623592F;

		luchsModel[133].addShapeBox(3.5F, -2F, -1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box3
		luchsModel[133].setRotationPoint(42F, -12F, -2F);
		luchsModel[133].rotateAngleZ = 1.9623592F;

		luchsModel[134].addShapeBox(3.5F, -2F, -4F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box4
		luchsModel[134].setRotationPoint(42F, -12F, 0F);
		luchsModel[134].rotateAngleZ = 1.9623592F;

		luchsModel[135].addShapeBox(3.5F, -2F, -4F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box5
		luchsModel[135].setRotationPoint(42F, -12F, -2F);
		luchsModel[135].rotateAngleZ = 1.9623592F;

		luchsModel[136].addShapeBox(3.5F, -2F, 5F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box6
		luchsModel[136].setRotationPoint(42F, -12F, 0F);
		luchsModel[136].rotateAngleZ = 1.9623592F;

		luchsModel[137].addShapeBox(3.5F, -2F, 5F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		luchsModel[137].setRotationPoint(42F, -12F, -2F);
		luchsModel[137].rotateAngleZ = 1.9623592F;

		luchsModel[138].addShapeBox(3.5F, -2F, 2F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box8
		luchsModel[138].setRotationPoint(42F, -12F, 0F);
		luchsModel[138].rotateAngleZ = 1.9623592F;

		luchsModel[139].addShapeBox(3.5F, -2F, 2F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box9
		luchsModel[139].setRotationPoint(42F, -12F, -2F);
		luchsModel[139].rotateAngleZ = 1.9623592F;

		luchsModel[140].addShapeBox(3.5F, -2F, 11F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box10
		luchsModel[140].setRotationPoint(42F, -12F, 0F);
		luchsModel[140].rotateAngleZ = 1.9623592F;

		luchsModel[141].addShapeBox(3.5F, -2F, 11F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box11
		luchsModel[141].setRotationPoint(42F, -12F, -2F);
		luchsModel[141].rotateAngleZ = 1.9623592F;

		luchsModel[142].addShapeBox(3.5F, -2F, 8F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box12
		luchsModel[142].setRotationPoint(42F, -12F, 0F);
		luchsModel[142].rotateAngleZ = 1.9623592F;

		luchsModel[143].addShapeBox(3.5F, -2F, 8F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box13
		luchsModel[143].setRotationPoint(42F, -12F, -2F);
		luchsModel[143].rotateAngleZ = 1.9623592F;

		luchsModel[144].addShapeBox(0F, 0F, 0F, 9, 1, 9, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Import Box0
		luchsModel[144].setRotationPoint(-39F, -9F, 15F);

		luchsModel[145].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box1
		luchsModel[145].setRotationPoint(41F, -12F, -24F);

		luchsModel[146].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Import Box2
		luchsModel[146].setRotationPoint(41F, -10.5F, 14F);

		luchsModel[147].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F); // Import Box3
		luchsModel[147].setRotationPoint(41F, -7.5F, 14F);

		luchsModel[148].addShapeBox(0F, 0F, 0F, 26, 1, 6, 0F, 0.2F, 0.05F, 0.2F, 0.2F, 0.05F, 0.2F, 0.2F, 0.05F, 0.2F, 0.2F, 0.05F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Import Box10
		luchsModel[148].setRotationPoint(-25.5F, -18F, -23.5F);
		luchsModel[148].rotateAngleY = 0.03490659F;
		luchsModel[148].rotateAngleZ = -0.01745329F;

		luchsModel[149].addShapeBox(0F, 0F, 0F, 12, 1, 6, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Import Box0
		luchsModel[149].setRotationPoint(-26F, -19F, 17.5F);
		luchsModel[149].rotateAngleY = 0.01745329F;
		luchsModel[149].rotateAngleZ = -0.08726646F;

		luchsModel[150].addShapeBox(-13F, 0F, 0F, 12, 1, 6, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Import Box0
		luchsModel[150].setRotationPoint(0F, -19F, 18F);
		luchsModel[150].rotateAngleY = -0.03490659F;
		luchsModel[150].rotateAngleZ = 0.03490659F;

		luchsModel[151].addBox(0F, 0F, 0F, 12, 6, 7, 0F); // Import Box3
		luchsModel[151].setRotationPoint(-26F, -20F, -17.1F);

		luchsModel[152].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box4
		luchsModel[152].setRotationPoint(16F, -20.5F, -12F);

		luchsModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box5
		luchsModel[153].setRotationPoint(16F, -20.7F, -12F);

		luchsModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box6
		luchsModel[154].setRotationPoint(21F, -20.7F, -9F);

		luchsModel[155].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		luchsModel[155].setRotationPoint(28F, -18.5F, -21.5F);

		luchsModel[156].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		luchsModel[156].setRotationPoint(29F, -16.5F, -20F);

		luchsModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.3F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.3F, 0.5F); // Import Box9
		luchsModel[157].setRotationPoint(29F, -14.5F, -20F);

		luchsModel[158].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box10
		luchsModel[158].setRotationPoint(28F, -17.5F, -21.5F);

		luchsModel[159].addShapeBox(-3.5F, -2.1F, -1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		luchsModel[159].setRotationPoint(36F, -11F, 5F);
		luchsModel[159].rotateAngleZ = 0.19957665F;

		luchsModel[160].addShapeBox(-3.5F, -2.1F, 2F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		luchsModel[160].setRotationPoint(36F, -11F, 5F);
		luchsModel[160].rotateAngleZ = 0.19957665F;

		luchsModel[161].addShapeBox(-3.5F, -2.1F, 5F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box2
		luchsModel[161].setRotationPoint(36F, -11F, 5F);
		luchsModel[161].rotateAngleZ = 0.19957665F;

		luchsModel[162].addShapeBox(-3.5F, -3.1F, 10F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box3
		luchsModel[162].setRotationPoint(36F, -11F, 5F);
		luchsModel[162].rotateAngleZ = 0.19957665F;

		luchsModel[163].addShapeBox(-3.5F, -3.1F, 13F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box4
		luchsModel[163].setRotationPoint(36F, -11F, 5F);
		luchsModel[163].rotateAngleZ = 0.19957665F;

		luchsModel[164].addShapeBox(-3.5F, -3.1F, 16F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box5
		luchsModel[164].setRotationPoint(36F, -11F, 5F);
		luchsModel[164].rotateAngleZ = 0.19957665F;

		luchsModel[165].addShapeBox(-3.5F, -3.1F, -17F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box6
		luchsModel[165].setRotationPoint(36F, -11F, -7F);
		luchsModel[165].rotateAngleZ = 0.19957665F;

		luchsModel[166].addShapeBox(-3.5F, -3.1F, -14F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		luchsModel[166].setRotationPoint(36F, -11F, -7F);
		luchsModel[166].rotateAngleZ = 0.19957665F;

		luchsModel[167].addShapeBox(-3.5F, -3.1F, -11F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		luchsModel[167].setRotationPoint(36F, -11F, -7F);
		luchsModel[167].rotateAngleZ = 0.19957665F;

		luchsModel[168].addShapeBox(-3.5F, -2.1F, -1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box9
		luchsModel[168].setRotationPoint(36F, -11F, 7F);
		luchsModel[168].rotateAngleZ = 0.19957665F;

		luchsModel[169].addShapeBox(-3.5F, -2.1F, 2F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box10
		luchsModel[169].setRotationPoint(36F, -11F, 7F);
		luchsModel[169].rotateAngleZ = 0.19957665F;

		luchsModel[170].addShapeBox(-3.5F, -2.1F, 5F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box11
		luchsModel[170].setRotationPoint(36F, -11F, 7F);
		luchsModel[170].rotateAngleZ = 0.19957665F;

		luchsModel[171].addShapeBox(-3.5F, -3.1F, 10F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box12
		luchsModel[171].setRotationPoint(36F, -11F, 7F);
		luchsModel[171].rotateAngleZ = 0.19957665F;

		luchsModel[172].addShapeBox(-3.5F, -3.1F, 13F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box13
		luchsModel[172].setRotationPoint(36F, -11F, 7F);
		luchsModel[172].rotateAngleZ = 0.19957665F;

		luchsModel[173].addShapeBox(-3.5F, -3.1F, 16F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box14
		luchsModel[173].setRotationPoint(36F, -11F, 7F);
		luchsModel[173].rotateAngleZ = 0.19957665F;

		luchsModel[174].addShapeBox(-3.5F, -3.1F, -23F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box15
		luchsModel[174].setRotationPoint(36F, -11F, 7F);
		luchsModel[174].rotateAngleZ = 0.19957665F;

		luchsModel[175].addShapeBox(-3.5F, -3.1F, -26F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box16
		luchsModel[175].setRotationPoint(36F, -11F, 7F);
		luchsModel[175].rotateAngleZ = 0.19957665F;

		luchsModel[176].addShapeBox(-3.5F, -3.1F, -29F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box17
		luchsModel[176].setRotationPoint(36F, -11F, 7F);
		luchsModel[176].rotateAngleZ = 0.19957665F;

		luchsModel[177].addShapeBox(-1F, -3.1F, 5.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		luchsModel[177].setRotationPoint(36F, -11.9F, -26F);
		luchsModel[177].rotateAngleZ = 0.19957665F;

		luchsModel[178].addShapeBox(1F, -3.1F, 5.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box19
		luchsModel[178].setRotationPoint(36F, -11.9F, -26F);
		luchsModel[178].rotateAngleZ = 0.19957665F;

		luchsModel[179].addShapeBox(-1F, -3.1F, 8.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box20
		luchsModel[179].setRotationPoint(36F, -11.9F, -26F);
		luchsModel[179].rotateAngleZ = 0.19957665F;

		luchsModel[180].addShapeBox(1F, -3.1F, 8.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box21
		luchsModel[180].setRotationPoint(36F, -11.9F, -26F);
		luchsModel[180].rotateAngleZ = 0.19957665F;

		luchsModel[181].addShapeBox(1F, -3.1F, 5.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box22
		luchsModel[181].setRotationPoint(36F, -11F, 5F);
		luchsModel[181].rotateAngleZ = 0.19957665F;

		luchsModel[182].addShapeBox(-1F, -3.1F, 5.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box23
		luchsModel[182].setRotationPoint(36F, -11F, 5F);
		luchsModel[182].rotateAngleZ = 0.19957665F;

		luchsModel[183].addShapeBox(1F, -3.1F, -0.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box24
		luchsModel[183].setRotationPoint(36F, -11F, 5F);
		luchsModel[183].rotateAngleZ = 0.19957665F;

		luchsModel[184].addShapeBox(-1F, -3.1F, -0.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box25
		luchsModel[184].setRotationPoint(36F, -11F, 5F);
		luchsModel[184].rotateAngleZ = 0.19957665F;

		luchsModel[185].addShapeBox(1F, -3.1F, -3.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box26
		luchsModel[185].setRotationPoint(36F, -11F, 5F);
		luchsModel[185].rotateAngleZ = 0.19957665F;

		luchsModel[186].addShapeBox(-1F, -3.1F, -3.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box27
		luchsModel[186].setRotationPoint(36F, -11F, 5F);
		luchsModel[186].rotateAngleZ = 0.19957665F;

		luchsModel[187].addShapeBox(1F, -3.1F, -6.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box28
		luchsModel[187].setRotationPoint(36F, -11F, 5F);
		luchsModel[187].rotateAngleZ = 0.19957665F;

		luchsModel[188].addShapeBox(-1F, -3.1F, -6.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box29
		luchsModel[188].setRotationPoint(36F, -11F, 5F);
		luchsModel[188].rotateAngleZ = 0.19957665F;

		luchsModel[189].addShapeBox(1F, -3.1F, 5.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box30
		luchsModel[189].setRotationPoint(36F, -11.9F, 13F);
		luchsModel[189].rotateAngleZ = 0.19957665F;

		luchsModel[190].addShapeBox(-1F, -3.1F, 5.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		luchsModel[190].setRotationPoint(36F, -11.9F, 13F);
		luchsModel[190].rotateAngleZ = 0.19957665F;

		luchsModel[191].addShapeBox(1F, -3.1F, 8.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box32
		luchsModel[191].setRotationPoint(36F, -11.9F, 13F);
		luchsModel[191].rotateAngleZ = 0.19957665F;

		luchsModel[192].addShapeBox(-1F, -3.1F, 8.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box33
		luchsModel[192].setRotationPoint(36F, -11.9F, 13F);
		luchsModel[192].rotateAngleZ = 0.19957665F;

		luchsModel[193].addShapeBox(-9F, -10F, -11F, 8, 6, 22, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 4F, 0F, 0F, 0F, 3F, 3F, 0F, 3F, 3F, 4F, 0F, 0F); // Import Box7
		luchsModel[193].setRotationPoint(-2F, -19F, 0F);

		luchsModel[194].addShapeBox(0F, -9F, -11F, 9, 8, 22, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 3F); // Import Box8
		luchsModel[194].setRotationPoint(-3F, -19F, 0F);

		luchsModel[195].addShapeBox(9F, -9F, -11F, 6, 5, 22, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 3F, 2F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 3F, 2F); // Import Box9
		luchsModel[195].setRotationPoint(-3F, -19F, 0F);

		luchsModel[196].addShapeBox(9F, -4F, -11F, 6, 4, 22, 0F, 0F, -4F, 2F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, -4F, 2F, 0F, 0F, 2F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 2F); // Import Box0
		luchsModel[196].setRotationPoint(-3F, -20F, 0F);

		luchsModel[197].addShapeBox(-9F, -4F, -11F, 8, 4, 22, 0F, 4F, -1F, 0F, 0F, -4F, 3F, 0F, -4F, 3F, 4F, -1F, 0F, 2F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 2F, 0F, -1F); // Import Box1
		luchsModel[197].setRotationPoint(-2F, -20F, 0F);

		luchsModel[198].addShapeBox(14.5F, -7F, -8F, 2, 5, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box21
		luchsModel[198].setRotationPoint(-3F, -19F, 0F);

		luchsModel[199].addShapeBox(16.5F, -7F, -8F, 1, 5, 16, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box22
		luchsModel[199].setRotationPoint(-3F, -19F, 0F);

		luchsModel[200].addShapeBox(-1F, -9F, -13.5F, 4, 7, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box207
		luchsModel[200].setRotationPoint(-2F, -18.5F, 0F);
		luchsModel[200].rotateAngleX = -0.06981317F;
		luchsModel[200].rotateAngleZ = 0.08726646F;

		luchsModel[201].addShapeBox(-17F, -1.5F, -7F, 3, 6, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box208
		luchsModel[201].setRotationPoint(0F, -20F, 0F);
		luchsModel[201].rotateAngleZ = 0.57595865F;

		luchsModel[202].addShapeBox(-3F, -9F, -14F, 9, 7, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		luchsModel[202].setRotationPoint(-2F, -18.5F, 0F);
		luchsModel[202].rotateAngleX = -0.03490659F;
		luchsModel[202].rotateAngleY = 3.14159265F;
		luchsModel[202].rotateAngleZ = -0.08726646F;

		luchsModel[203].addShapeBox(4F, -9F, -13.5F, 4, 7, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		luchsModel[203].setRotationPoint(-2F, -18.5F, 0F);
		luchsModel[203].rotateAngleX = -0.06981317F;
		luchsModel[203].rotateAngleZ = 0.08726646F;

		luchsModel[204].addBox(-4F, -11F, -2F, 6, 2, 12, 0F); // Import Box218
		luchsModel[204].setRotationPoint(-3F, -19F, 0F);

		luchsModel[205].addShapeBox(-7F, -11F, -2F, 3, 2, 12, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box217
		luchsModel[205].setRotationPoint(-3F, -19F, 0F);

		luchsModel[206].addShapeBox(2F, -11F, -2F, 3, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Box219
		luchsModel[206].setRotationPoint(-3F, -19F, 0F);

		luchsModel[207].addShapeBox(-1F, -7.5F, -10.5F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F); // Import Box122
		luchsModel[207].setRotationPoint(3F, -22F, 1F);

		luchsModel[208].addShapeBox(-6F, -7.5F, -10.5F, 5, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Box123
		luchsModel[208].setRotationPoint(3F, -22F, 1F);

		luchsModel[209].addShapeBox(-7F, -7.5F, -10.5F, 1, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -1F); // Import Box124
		luchsModel[209].setRotationPoint(3F, -22F, 1F);

		luchsModel[210].addShapeBox(-0.5F, -10.6F, -8F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box131
		luchsModel[210].setRotationPoint(0F, -19F, 0F);

		luchsModel[211].addShapeBox(0F, -11.6F, -7.5F, 2, 2, 2, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Import Box132
		luchsModel[211].setRotationPoint(0F, -19F, 0F);

		luchsModel[212].addBox(9.5F, -6F, -3.5F, 4, 1, 1, 0F); // Import Box181
		luchsModel[212].setRotationPoint(4F, -18.5F, -1F);
		luchsModel[212].rotateAngleY = 0.62831853F;
		luchsModel[212].rotateAngleZ = -0.36651914F;

		luchsModel[213].addBox(10.5F, -4.5F, -3.5F, 4, 1, 1, 0F); // Import Box180
		luchsModel[213].setRotationPoint(4F, -18.5F, -1F);
		luchsModel[213].rotateAngleY = 0.54105207F;
		luchsModel[213].rotateAngleZ = -0.40142573F;

		luchsModel[214].addBox(11.5F, -3F, -3.5F, 4, 1, 1, 0F); // Import Box179
		luchsModel[214].setRotationPoint(4F, -18.5F, -1F);
		luchsModel[214].rotateAngleY = 0.45378561F;
		luchsModel[214].rotateAngleZ = -0.43633231F;

		luchsModel[215].addBox(9F, -5F, 6F, 4, 1, 1, 0F); // Import Box176
		luchsModel[215].setRotationPoint(3F, -19F, 0F);
		luchsModel[215].rotateAngleY = -0.4712389F;
		luchsModel[215].rotateAngleZ = -0.43633231F;

		luchsModel[216].addBox(9F, -5F, 6F, 4, 1, 1, 0F); // Import Box177
		luchsModel[216].setRotationPoint(4F, -19F, 0F);
		luchsModel[216].rotateAngleY = -0.38397244F;
		luchsModel[216].rotateAngleZ = -0.40142573F;

		luchsModel[217].addBox(10F, -5F, 6F, 4, 1, 1, 0F); // Import Box178
		luchsModel[217].setRotationPoint(4F, -19F, 0F);
		luchsModel[217].rotateAngleY = -0.29670597F;
		luchsModel[217].rotateAngleZ = -0.36651914F;

		luchsModel[218].addShapeBox(0F, -11.5F, -8F, 35, 1, 35, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, -30F, 0F, 0F, -30F); // Import Box0
		luchsModel[218].setRotationPoint(-3F, -19F, 0F);
		luchsModel[218].rotateAngleX = 0.01745329F;
		luchsModel[218].rotateAngleY = 1.3962634F;
		luchsModel[218].rotateAngleZ = -1.20427718F;

		luchsModel[219].addShapeBox(-1.5F, -10F, 5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		luchsModel[219].setRotationPoint(0F, -19F, 0F);
		luchsModel[219].rotateAngleX = -0.13962634F;
		luchsModel[219].rotateAngleY = 1.57079633F;

		luchsModel[220].addShapeBox(-1F, -11F, 5.5F, 2, 2, 2, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Import Box2
		luchsModel[220].setRotationPoint(0F, -19F, 0F);
		luchsModel[220].rotateAngleX = -0.13962634F;
		luchsModel[220].rotateAngleY = 1.57079633F;

		luchsModel[221].addShapeBox(0.5F, -3F, -10F, 1, 2, 20, 0F, 0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box11
		luchsModel[221].setRotationPoint(14F, -23F, 0F);

		luchsModel[222].addBox(1F, -2F, -1.5F, 4, 3, 3, 0F); // Import Box13
		luchsModel[222].setRotationPoint(14F, -22.5F, 0F);

		luchsModel[223].addBox(5F, -1.5F, -1F, 2, 2, 2, 0F); // Import Box14
		luchsModel[223].setRotationPoint(14F, -22.5F, 0F);

		luchsModel[224].addShapeBox(7F, -1F, -0.5F, 18, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Import Box15
		luchsModel[224].setRotationPoint(14F, -22.5F, 0F);

		luchsModel[225].addShapeBox(25F, -1F, -0.5F, 4, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.2F, 0.2F); // Import Box16
		luchsModel[225].setRotationPoint(14F, -22.5F, 0F);

		luchsModel[226].addShapeBox(1F, -1F, 5.5F, 3, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Import Box17
		luchsModel[226].setRotationPoint(14F, -22.5F, 0F);

		luchsModel[227].addShapeBox(0.5F, 0F, -10F, 1, 2, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F); // Import Box23
		luchsModel[227].setRotationPoint(14F, -23F, 0F);

		luchsModel[228].addShapeBox(0.5F, -1F, -10F, 1, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box24
		luchsModel[228].setRotationPoint(14F, -23F, 0F);

		luchsModel[229].addBox(1F, -1F, 5.5F, 1, 1, 1, 0F); // Import Box1
		luchsModel[229].setRotationPoint(14F, -22.5F, 0F);

		luchsModel[230].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Import Shape52
		luchsModel[230].setRotationPoint(4F, 2.5F, 18F);

		luchsModel[231].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Import Shape4
		luchsModel[231].setRotationPoint(14F, 2.5F, 21F);

		luchsModel[232].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Import Shape5
		luchsModel[232].setRotationPoint(23F, 2.5F, 18F);

		luchsModel[233].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Import Shape6
		luchsModel[233].setRotationPoint(-7F, 2.5F, 21F);

		luchsModel[234].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Import Shape7
		luchsModel[234].setRotationPoint(-17F, 2.5F, 18F);

		luchsModel[235].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Import Shape8
		luchsModel[235].setRotationPoint(-28F, 0.5F, 22F);

		luchsModel[236].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Import Shape9
		luchsModel[236].setRotationPoint(-28F, 0.5F, 17F);

		luchsModel[237].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Import Shape10
		luchsModel[237].setRotationPoint(34F, -1.6F, 21F);

		luchsModel[238].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Import Shape11
		luchsModel[238].setRotationPoint(34F, -1.6F, 16F);

		luchsModel[239].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Import Shape23
		luchsModel[239].setRotationPoint(4F, 2.5F, -20F);

		luchsModel[240].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Import Shape24
		luchsModel[240].setRotationPoint(14F, 2.5F, -23F);

		luchsModel[241].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Import Shape25
		luchsModel[241].setRotationPoint(23F, 2.5F, -20F);

		luchsModel[242].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Import Shape26
		luchsModel[242].setRotationPoint(-7F, 2.5F, -23F);

		luchsModel[243].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Import Shape27
		luchsModel[243].setRotationPoint(-17F, 2.5F, -20F);

		luchsModel[244].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Import Shape28
		luchsModel[244].setRotationPoint(-28F, 0.5F, -18F);

		luchsModel[245].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Import Shape29
		luchsModel[245].setRotationPoint(-28F, 0.5F, -23F);

		luchsModel[246].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Import Shape30
		luchsModel[246].setRotationPoint(34F, -1.6F, -17F);

		luchsModel[247].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Import Shape31
		luchsModel[247].setRotationPoint(34F, -1.6F, -22F);

		luchsModel[248].addShapeBox(0F, 0F, 0F, 9, 1, 9, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Import Box91
		luchsModel[248].setRotationPoint(23F, -8.5F, 15.5F);

		luchsModel[249].addBox(0F, 0F, 0F, 43, 1, 9, 0F); // Import Box92
		luchsModel[249].setRotationPoint(-20F, -4.5F, 15.5F);

		luchsModel[250].addBox(0F, 0F, 0F, 6, 1, 9, 0F); // Import Box93
		luchsModel[250].setRotationPoint(32F, -8.5F, 15.5F);

		luchsModel[251].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F, 3F, -1F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box94
		luchsModel[251].setRotationPoint(40.5F, -8.5F, 15.5F);

		luchsModel[252].addBox(0F, 0F, 0F, 1, 3, 9, 0F); // Import Box95
		luchsModel[252].setRotationPoint(40.5F, -3.5F, 15.5F);

		luchsModel[253].addShapeBox(0F, 0F, 0F, 12, 1, 9, 0F, 0F, -4.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -4.5F, 0F, 0F, 4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F); // Import Box97
		luchsModel[253].setRotationPoint(26F, 3.5F, 15.5F);

		luchsModel[254].addBox(0F, 0F, 0F, 47, 1, 9, 0F); // Import Box98
		luchsModel[254].setRotationPoint(-21F, 8F, 15.5F);

		luchsModel[255].addShapeBox(0F, 0F, 0F, 11, 1, 9, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F); // Import Box99
		luchsModel[255].setRotationPoint(-32F, 5.5F, 15.5F);

		luchsModel[256].addBox(0F, 0F, 0F, 1, 3, 9, 0F); // Import Box101
		luchsModel[256].setRotationPoint(-35.5F, -1.5F, 15.5F);

		luchsModel[257].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -3.5F, 0F, 0F); // Import Box102
		luchsModel[257].setRotationPoint(-35.5F, 1.5F, 15.5F);

		luchsModel[258].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F, -3.5F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box103
		luchsModel[258].setRotationPoint(-35.5F, -6.5F, 15.5F);

		luchsModel[259].addBox(0F, 0F, 0F, 6, 1, 9, 0F); // Import Box104
		luchsModel[259].setRotationPoint(-32F, -6.5F, 15.5F);

		luchsModel[260].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box105
		luchsModel[260].setRotationPoint(-26F, -6.5F, 15.5F);

		luchsModel[261].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3F, -1F, 0F); // Import Box4
		luchsModel[261].setRotationPoint(40.5F, -0.5F, 15.5F);

		luchsModel[262].addShapeBox(0F, 0F, 0F, 9, 1, 9, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Import Box14
		luchsModel[262].setRotationPoint(23F, -8.5F, -24.5F);

		luchsModel[263].addBox(0F, 0F, 0F, 43, 1, 9, 0F); // Import Box15
		luchsModel[263].setRotationPoint(-20F, -4.5F, -24.5F);

		luchsModel[264].addBox(0F, 0F, 0F, 6, 1, 9, 0F); // Import Box16
		luchsModel[264].setRotationPoint(32F, -8.5F, -24.5F);

		luchsModel[265].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F, 3F, -1F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		luchsModel[265].setRotationPoint(40.5F, -8.5F, -24.5F);

		luchsModel[266].addBox(0F, 0F, 0F, 1, 3, 9, 0F); // Import Box18
		luchsModel[266].setRotationPoint(40.5F, -3.5F, -24.5F);

		luchsModel[267].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3F, -1F, 0F); // Import Box19
		luchsModel[267].setRotationPoint(40.5F, -0.5F, -24.5F);

		luchsModel[268].addShapeBox(0F, 0F, 0F, 12, 1, 9, 0F, 0F, -4.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -4.5F, 0F, 0F, 4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F); // Import Box20
		luchsModel[268].setRotationPoint(26F, 3.5F, -24.5F);

		luchsModel[269].addBox(0F, 0F, 0F, 47, 1, 9, 0F); // Import Box21
		luchsModel[269].setRotationPoint(-21F, 8F, -24.5F);

		luchsModel[270].addShapeBox(0F, 0F, 0F, 11, 1, 9, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F); // Import Box22
		luchsModel[270].setRotationPoint(-32F, 5.5F, -24.5F);

		luchsModel[271].addBox(0F, 0F, 0F, 1, 3, 9, 0F); // Import Box5
		luchsModel[271].setRotationPoint(-35.5F, -1.5F, -24.5F);

		luchsModel[272].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -3.5F, 0F, 0F); // Import Box6
		luchsModel[272].setRotationPoint(-35.5F, 1.5F, -24.5F);

		luchsModel[273].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F, -3.5F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		luchsModel[273].setRotationPoint(-35.5F, -6.5F, -24.5F);

		luchsModel[274].addBox(0F, 0F, 0F, 6, 1, 9, 0F); // Import Box8
		luchsModel[274].setRotationPoint(-32F, -6.5F, -24.5F);

		luchsModel[275].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box9
		luchsModel[275].setRotationPoint(-26F, -6.5F, -24.5F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 276; i++)
		{
			luchsModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo luchsModel[];
}