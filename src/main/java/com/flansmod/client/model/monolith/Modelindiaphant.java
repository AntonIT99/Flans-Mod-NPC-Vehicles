//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: indiaphant
// Model Creator: 
// Created on: -
// Last changed on: -

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelindiaphant extends ModelMecha //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Modelindiaphant() //Same as Filename
	{
		hipsModel = new ModelRendererTurbo[628];
		rightArmModel = new ModelRendererTurbo[1];
		leftLegModel = new ModelRendererTurbo[60];
		rightLegModel = new ModelRendererTurbo[58];

		inithipsModel_1();
		inithipsModel_2();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void inithipsModel_1()
	{
		hipsModel[0] = new ModelRendererTurbo(this, 7, 83, textureX, textureY); // Import ImportBox0
		hipsModel[1] = new ModelRendererTurbo(this, 7, 111, textureX, textureY); // Import ImportBox3
		hipsModel[2] = new ModelRendererTurbo(this, 7, 136, textureX, textureY); // Import ImportBox4
		hipsModel[3] = new ModelRendererTurbo(this, 7, 161, textureX, textureY); // Import ImportBox5
		hipsModel[4] = new ModelRendererTurbo(this, 47, 149, textureX, textureY); // Import ImportBox8
		hipsModel[5] = new ModelRendererTurbo(this, 7, 41, textureX, textureY); // Import ImportBox9
		hipsModel[6] = new ModelRendererTurbo(this, 44, 86, textureX, textureY); // Import ImportBox10
		hipsModel[7] = new ModelRendererTurbo(this, 44, 101, textureX, textureY); // Import ImportBox11
		hipsModel[8] = new ModelRendererTurbo(this, 7, 97, textureX, textureY); // Import ImportBox12
		hipsModel[9] = new ModelRendererTurbo(this, 7, 125, textureX, textureY); // Import ImportBox13
		hipsModel[10] = new ModelRendererTurbo(this, 7, 147, textureX, textureY); // Import ImportBox14
		hipsModel[11] = new ModelRendererTurbo(this, 7, 172, textureX, textureY); // Import ImportBox15
		hipsModel[12] = new ModelRendererTurbo(this, 44, 187, textureX, textureY); // Import ImportBox16
		hipsModel[13] = new ModelRendererTurbo(this, 7, 63, textureX, textureY); // Import ImportBox17
		hipsModel[14] = new ModelRendererTurbo(this, 7, 204, textureX, textureY); // Import ImportBox18
		hipsModel[15] = new ModelRendererTurbo(this, 44, 204, textureX, textureY); // Import ImportBox19
		hipsModel[16] = new ModelRendererTurbo(this, 44, 169, textureX, textureY); // Import ImportBox20
		hipsModel[17] = new ModelRendererTurbo(this, 44, 118, textureX, textureY); // Import ImportBox21
		hipsModel[18] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox22
		hipsModel[19] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox23
		hipsModel[20] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox24
		hipsModel[21] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox25
		hipsModel[22] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox26
		hipsModel[23] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox27
		hipsModel[24] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox28
		hipsModel[25] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox29
		hipsModel[26] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox30
		hipsModel[27] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox31
		hipsModel[28] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox32
		hipsModel[29] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox33
		hipsModel[30] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox34
		hipsModel[31] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox35
		hipsModel[32] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox36
		hipsModel[33] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox37
		hipsModel[34] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox38
		hipsModel[35] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox39
		hipsModel[36] = new ModelRendererTurbo(this, 86, 185, textureX, textureY); // Import ImportBox40
		hipsModel[37] = new ModelRendererTurbo(this, 86, 156, textureX, textureY); // Import ImportBox41
		hipsModel[38] = new ModelRendererTurbo(this, 86, 170, textureX, textureY); // Import ImportBox42
		hipsModel[39] = new ModelRendererTurbo(this, 86, 199, textureX, textureY); // Import ImportBox43
		hipsModel[40] = new ModelRendererTurbo(this, 86, 211, textureX, textureY); // Import ImportBox44
		hipsModel[41] = new ModelRendererTurbo(this, 121, 211, textureX, textureY); // Import ImportBox45
		hipsModel[42] = new ModelRendererTurbo(this, 86, 144, textureX, textureY); // Import ImportBox46
		hipsModel[43] = new ModelRendererTurbo(this, 86, 130, textureX, textureY); // Import ImportBox47
		hipsModel[44] = new ModelRendererTurbo(this, 86, 115, textureX, textureY); // Import ImportBox48
		hipsModel[45] = new ModelRendererTurbo(this, 121, 158, textureX, textureY); // Import ImportBox49
		hipsModel[46] = new ModelRendererTurbo(this, 121, 176, textureX, textureY); // Import ImportBox50
		hipsModel[47] = new ModelRendererTurbo(this, 121, 194, textureX, textureY); // Import ImportBox51
		hipsModel[48] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Import ImportBox0
		hipsModel[49] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Import ImportBox1
		hipsModel[50] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Import ImportBox2
		hipsModel[51] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Import ImportBox3
		hipsModel[52] = new ModelRendererTurbo(this, 121, 120, textureX, textureY); // Import ImportBox4
		hipsModel[53] = new ModelRendererTurbo(this, 121, 140, textureX, textureY); // Import ImportBox8
		hipsModel[54] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox9
		hipsModel[55] = new ModelRendererTurbo(this, 44, 136, textureX, textureY); // Import ImportBox10
		hipsModel[56] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Import ImportBox12
		hipsModel[57] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Import ImportBox13
		hipsModel[58] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Import ImportBox14
		hipsModel[59] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Import ImportBox15
		hipsModel[60] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Import ImportBox18
		hipsModel[61] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Import ImportBox19
		hipsModel[62] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Import ImportBox20
		hipsModel[63] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Import ImportBox21
		hipsModel[64] = new ModelRendererTurbo(this, 86, 101, textureX, textureY); // Import ImportBox22
		hipsModel[65] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Import ImportBox23
		hipsModel[66] = new ModelRendererTurbo(this, 121, 100, textureX, textureY); // Import ImportBox25
		hipsModel[67] = new ModelRendererTurbo(this, 86, 81, textureX, textureY); // Import ImportBox28
		hipsModel[68] = new ModelRendererTurbo(this, 121, 62, textureX, textureY); // Import ImportBox32
		hipsModel[69] = new ModelRendererTurbo(this, 121, 80, textureX, textureY); // Import ImportBox33
		hipsModel[70] = new ModelRendererTurbo(this, 70, 55, textureX, textureY); // Import ImportBox0
		hipsModel[71] = new ModelRendererTurbo(this, 59, 44, textureX, textureY); // Import ImportBox2
		hipsModel[72] = new ModelRendererTurbo(this, 70, 64, textureX, textureY); // Import ImportBox3
		hipsModel[73] = new ModelRendererTurbo(this, 59, 52, textureX, textureY); // Import ImportBox4
		hipsModel[74] = new ModelRendererTurbo(this, 59, 61, textureX, textureY); // Import ImportBox5
		hipsModel[75] = new ModelRendererTurbo(this, 59, 70, textureX, textureY); // Import ImportBox6
		hipsModel[76] = new ModelRendererTurbo(this, 7, 41, textureX, textureY); // Import ImportBox8
		hipsModel[77] = new ModelRendererTurbo(this, 7, 83, textureX, textureY); // Import ImportBox9
		hipsModel[78] = new ModelRendererTurbo(this, 7, 97, textureX, textureY); // Import ImportBox10
		hipsModel[79] = new ModelRendererTurbo(this, 7, 111, textureX, textureY); // Import ImportBox11
		hipsModel[80] = new ModelRendererTurbo(this, 7, 125, textureX, textureY); // Import ImportBox12
		hipsModel[81] = new ModelRendererTurbo(this, 7, 136, textureX, textureY); // Import ImportBox13
		hipsModel[82] = new ModelRendererTurbo(this, 7, 147, textureX, textureY); // Import ImportBox14
		hipsModel[83] = new ModelRendererTurbo(this, 7, 161, textureX, textureY); // Import ImportBox15
		hipsModel[84] = new ModelRendererTurbo(this, 7, 172, textureX, textureY); // Import ImportBox16
		hipsModel[85] = new ModelRendererTurbo(this, 7, 204, textureX, textureY); // Import ImportBox17
		hipsModel[86] = new ModelRendererTurbo(this, 44, 204, textureX, textureY); // Import ImportBox18
		hipsModel[87] = new ModelRendererTurbo(this, 44, 187, textureX, textureY); // Import ImportBox19
		hipsModel[88] = new ModelRendererTurbo(this, 44, 169, textureX, textureY); // Import ImportBox20
		hipsModel[89] = new ModelRendererTurbo(this, 47, 149, textureX, textureY); // Import ImportBox21
		hipsModel[90] = new ModelRendererTurbo(this, 44, 136, textureX, textureY); // Import ImportBox22
		hipsModel[91] = new ModelRendererTurbo(this, 44, 118, textureX, textureY); // Import ImportBox23
		hipsModel[92] = new ModelRendererTurbo(this, 44, 101, textureX, textureY); // Import ImportBox24
		hipsModel[93] = new ModelRendererTurbo(this, 44, 86, textureX, textureY); // Import ImportBox25
		hipsModel[94] = new ModelRendererTurbo(this, 7, 63, textureX, textureY); // Import ImportBox26
		hipsModel[95] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox27
		hipsModel[96] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox28
		hipsModel[97] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox29
		hipsModel[98] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox30
		hipsModel[99] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox31
		hipsModel[100] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox32
		hipsModel[101] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox33
		hipsModel[102] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox34
		hipsModel[103] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox35
		hipsModel[104] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox36
		hipsModel[105] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox37
		hipsModel[106] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox38
		hipsModel[107] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox39
		hipsModel[108] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox40
		hipsModel[109] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox41
		hipsModel[110] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox42
		hipsModel[111] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox43
		hipsModel[112] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox44
		hipsModel[113] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Import ImportBox45
		hipsModel[114] = new ModelRendererTurbo(this, 59, 44, textureX, textureY); // Import ImportBox48
		hipsModel[115] = new ModelRendererTurbo(this, 70, 55, textureX, textureY); // Import ImportBox49
		hipsModel[116] = new ModelRendererTurbo(this, 7, 363, textureX, textureY); // Import ImportBox56
		hipsModel[117] = new ModelRendererTurbo(this, 65, 363, textureX, textureY); // Import ImportBox57
		hipsModel[118] = new ModelRendererTurbo(this, 65, 363, textureX, textureY); // Import ImportBox58
		hipsModel[119] = new ModelRendererTurbo(this, 121, 62, textureX, textureY); // Import ImportBox226
		hipsModel[120] = new ModelRendererTurbo(this, 121, 80, textureX, textureY); // Import ImportBox227
		hipsModel[121] = new ModelRendererTurbo(this, 121, 100, textureX, textureY); // Import ImportBox228
		hipsModel[122] = new ModelRendererTurbo(this, 121, 120, textureX, textureY); // Import ImportBox229
		hipsModel[123] = new ModelRendererTurbo(this, 121, 140, textureX, textureY); // Import ImportBox230
		hipsModel[124] = new ModelRendererTurbo(this, 121, 158, textureX, textureY); // Import ImportBox231
		hipsModel[125] = new ModelRendererTurbo(this, 121, 176, textureX, textureY); // Import ImportBox232
		hipsModel[126] = new ModelRendererTurbo(this, 121, 194, textureX, textureY); // Import ImportBox233
		hipsModel[127] = new ModelRendererTurbo(this, 121, 211, textureX, textureY); // Import ImportBox234
		hipsModel[128] = new ModelRendererTurbo(this, 86, 211, textureX, textureY); // Import ImportBox235
		hipsModel[129] = new ModelRendererTurbo(this, 86, 199, textureX, textureY); // Import ImportBox236
		hipsModel[130] = new ModelRendererTurbo(this, 86, 185, textureX, textureY); // Import ImportBox237
		hipsModel[131] = new ModelRendererTurbo(this, 86, 170, textureX, textureY); // Import ImportBox238
		hipsModel[132] = new ModelRendererTurbo(this, 86, 130, textureX, textureY); // Import ImportBox239
		hipsModel[133] = new ModelRendererTurbo(this, 86, 144, textureX, textureY); // Import ImportBox240
		hipsModel[134] = new ModelRendererTurbo(this, 86, 156, textureX, textureY); // Import ImportBox241
		hipsModel[135] = new ModelRendererTurbo(this, 86, 115, textureX, textureY); // Import ImportBox242
		hipsModel[136] = new ModelRendererTurbo(this, 86, 101, textureX, textureY); // Import ImportBox243
		hipsModel[137] = new ModelRendererTurbo(this, 86, 81, textureX, textureY); // Import ImportBox244
		hipsModel[138] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Import ImportBox245
		hipsModel[139] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Import ImportBox246
		hipsModel[140] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Import ImportBox247
		hipsModel[141] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Import ImportBox248
		hipsModel[142] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Import ImportBox249
		hipsModel[143] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Import ImportBox250
		hipsModel[144] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Import ImportBox251
		hipsModel[145] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Import ImportBox252
		hipsModel[146] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Import ImportBox253
		hipsModel[147] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Import ImportBox254
		hipsModel[148] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Import ImportBox255
		hipsModel[149] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Import ImportBox256
		hipsModel[150] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Import ImportBox257
		hipsModel[151] = new ModelRendererTurbo(this, 320, 409, textureX, textureY); // Import ImportBox1
		hipsModel[152] = new ModelRendererTurbo(this, 320, 419, textureX, textureY); // Import ImportBox2
		hipsModel[153] = new ModelRendererTurbo(this, 320, 434, textureX, textureY); // Import ImportBox3
		hipsModel[154] = new ModelRendererTurbo(this, 320, 443, textureX, textureY); // Import ImportBox4
		hipsModel[155] = new ModelRendererTurbo(this, 118, 431, textureX, textureY); // Import ImportBox7
		hipsModel[156] = new ModelRendererTurbo(this, 117, 438, textureX, textureY); // Import ImportBox8
		hipsModel[157] = new ModelRendererTurbo(this, 100, 426, textureX, textureY); // Import ImportBox66
		hipsModel[158] = new ModelRendererTurbo(this, 100, 426, textureX, textureY); // Import ImportBox278
		hipsModel[159] = new ModelRendererTurbo(this, 259, 161, textureX, textureY); // Import ImportBox9
		hipsModel[160] = new ModelRendererTurbo(this, 259, 152, textureX, textureY); // Import ImportBox10
		hipsModel[161] = new ModelRendererTurbo(this, 259, 137, textureX, textureY); // Import ImportBox11
		hipsModel[162] = new ModelRendererTurbo(this, 259, 127, textureX, textureY); // Import ImportBox12
		hipsModel[163] = new ModelRendererTurbo(this, 296, 172, textureX, textureY); // Import ImportBox28
		hipsModel[164] = new ModelRendererTurbo(this, 295, 161, textureX, textureY); // Import ImportBox29
		hipsModel[165] = new ModelRendererTurbo(this, 295, 152, textureX, textureY); // Import ImportBox30
		hipsModel[166] = new ModelRendererTurbo(this, 295, 137, textureX, textureY); // Import ImportBox31
		hipsModel[167] = new ModelRendererTurbo(this, 295, 127, textureX, textureY); // Import ImportBox32
		hipsModel[168] = new ModelRendererTurbo(this, 295, 192, textureX, textureY); // Import ImportBox34
		hipsModel[169] = new ModelRendererTurbo(this, 334, 125, textureX, textureY); // Import ImportBox36
		hipsModel[170] = new ModelRendererTurbo(this, 334, 140, textureX, textureY); // Import ImportBox37
		hipsModel[171] = new ModelRendererTurbo(this, 334, 155, textureX, textureY); // Import ImportBox38
		hipsModel[172] = new ModelRendererTurbo(this, 334, 164, textureX, textureY); // Import ImportBox39
		hipsModel[173] = new ModelRendererTurbo(this, 332, 171, textureX, textureY); // Import ImportBox40
		hipsModel[174] = new ModelRendererTurbo(this, 332, 181, textureX, textureY); // Import ImportBox44
		hipsModel[175] = new ModelRendererTurbo(this, 388, 125, textureX, textureY); // Import ImportBox46
		hipsModel[176] = new ModelRendererTurbo(this, 363, 123, textureX, textureY); // Import ImportBox47
		hipsModel[177] = new ModelRendererTurbo(this, 347, 161, textureX, textureY); // Import ImportBox48
		hipsModel[178] = new ModelRendererTurbo(this, 388, 139, textureX, textureY); // Import ImportBox49
		hipsModel[179] = new ModelRendererTurbo(this, 363, 140, textureX, textureY); // Import ImportBox50
		hipsModel[180] = new ModelRendererTurbo(this, 347, 172, textureX, textureY); // Import ImportBox51
		hipsModel[181] = new ModelRendererTurbo(this, 347, 179, textureX, textureY); // Import ImportBox52
		hipsModel[182] = new ModelRendererTurbo(this, 363, 154, textureX, textureY); // Import ImportBox53
		hipsModel[183] = new ModelRendererTurbo(this, 388, 150, textureX, textureY); // Import ImportBox54
		hipsModel[184] = new ModelRendererTurbo(this, 388, 170, textureX, textureY); // Import ImportBox57
		hipsModel[185] = new ModelRendererTurbo(this, 317, 48, textureX, textureY); // Import ImportBox61
		hipsModel[186] = new ModelRendererTurbo(this, 317, 39, textureX, textureY); // Import ImportBox62
		hipsModel[187] = new ModelRendererTurbo(this, 317, 24, textureX, textureY); // Import ImportBox63
		hipsModel[188] = new ModelRendererTurbo(this, 317, 14, textureX, textureY); // Import ImportBox64
		hipsModel[189] = new ModelRendererTurbo(this, 351, 82, textureX, textureY); // Import ImportBox66
		hipsModel[190] = new ModelRendererTurbo(this, 352, 62, textureX, textureY); // Import ImportBox67
		hipsModel[191] = new ModelRendererTurbo(this, 351, 51, textureX, textureY); // Import ImportBox68
		hipsModel[192] = new ModelRendererTurbo(this, 351, 42, textureX, textureY); // Import ImportBox69
		hipsModel[193] = new ModelRendererTurbo(this, 351, 27, textureX, textureY); // Import ImportBox70
		hipsModel[194] = new ModelRendererTurbo(this, 351, 17, textureX, textureY); // Import ImportBox71
		hipsModel[195] = new ModelRendererTurbo(this, 393, 71, textureX, textureY); // Import ImportBox75
		hipsModel[196] = new ModelRendererTurbo(this, 393, 71, textureX, textureY); // Import ImportBox76
		hipsModel[197] = new ModelRendererTurbo(this, 393, 47, textureX, textureY); // Import ImportBox77
		hipsModel[198] = new ModelRendererTurbo(this, 408, 92, textureX, textureY); // Import ImportBox78
		hipsModel[199] = new ModelRendererTurbo(this, 394, 92, textureX, textureY); // Import ImportBox79
		hipsModel[200] = new ModelRendererTurbo(this, 351, 98, textureX, textureY); // Import ImportBox80
		hipsModel[201] = new ModelRendererTurbo(this, 320, 97, textureX, textureY); // Import ImportBox81
		hipsModel[202] = new ModelRendererTurbo(this, 351, 82, textureX, textureY); // Import ImportBox82
		hipsModel[203] = new ModelRendererTurbo(this, 318, 77, textureX, textureY); // Import ImportBox83
		hipsModel[204] = new ModelRendererTurbo(this, 352, 62, textureX, textureY); // Import ImportBox84
		hipsModel[205] = new ModelRendererTurbo(this, 320, 57, textureX, textureY); // Import ImportBox85
		hipsModel[206] = new ModelRendererTurbo(this, 351, 17, textureX, textureY); // Import ImportBox87
		hipsModel[207] = new ModelRendererTurbo(this, 317, 14, textureX, textureY); // Import ImportBox88
		hipsModel[208] = new ModelRendererTurbo(this, 351, 27, textureX, textureY); // Import ImportBox89
		hipsModel[209] = new ModelRendererTurbo(this, 317, 24, textureX, textureY); // Import ImportBox90
		hipsModel[210] = new ModelRendererTurbo(this, 351, 42, textureX, textureY); // Import ImportBox91
		hipsModel[211] = new ModelRendererTurbo(this, 317, 39, textureX, textureY); // Import ImportBox92
		hipsModel[212] = new ModelRendererTurbo(this, 317, 48, textureX, textureY); // Import ImportBox93
		hipsModel[213] = new ModelRendererTurbo(this, 351, 51, textureX, textureY); // Import ImportBox94
		hipsModel[214] = new ModelRendererTurbo(this, 259, 127, textureX, textureY); // Import ImportBox97
		hipsModel[215] = new ModelRendererTurbo(this, 295, 127, textureX, textureY); // Import ImportBox98
		hipsModel[216] = new ModelRendererTurbo(this, 334, 125, textureX, textureY); // Import ImportBox99
		hipsModel[217] = new ModelRendererTurbo(this, 388, 125, textureX, textureY); // Import ImportBox100
		hipsModel[218] = new ModelRendererTurbo(this, 388, 139, textureX, textureY); // Import ImportBox101
		hipsModel[219] = new ModelRendererTurbo(this, 388, 150, textureX, textureY); // Import ImportBox102
		hipsModel[220] = new ModelRendererTurbo(this, 388, 170, textureX, textureY); // Import ImportBox103
		hipsModel[221] = new ModelRendererTurbo(this, 363, 174, textureX, textureY); // Import ImportBox104
		hipsModel[222] = new ModelRendererTurbo(this, 363, 154, textureX, textureY); // Import ImportBox105
		hipsModel[223] = new ModelRendererTurbo(this, 363, 140, textureX, textureY); // Import ImportBox106
		hipsModel[224] = new ModelRendererTurbo(this, 363, 123, textureX, textureY); // Import ImportBox107
		hipsModel[225] = new ModelRendererTurbo(this, 334, 140, textureX, textureY); // Import ImportBox108
		hipsModel[226] = new ModelRendererTurbo(this, 259, 137, textureX, textureY); // Import ImportBox109
		hipsModel[227] = new ModelRendererTurbo(this, 295, 137, textureX, textureY); // Import ImportBox110
		hipsModel[228] = new ModelRendererTurbo(this, 259, 152, textureX, textureY); // Import ImportBox111
		hipsModel[229] = new ModelRendererTurbo(this, 295, 152, textureX, textureY); // Import ImportBox112
		hipsModel[230] = new ModelRendererTurbo(this, 334, 155, textureX, textureY); // Import ImportBox113
		hipsModel[231] = new ModelRendererTurbo(this, 347, 161, textureX, textureY); // Import ImportBox114
		hipsModel[232] = new ModelRendererTurbo(this, 347, 172, textureX, textureY); // Import ImportBox115
		hipsModel[233] = new ModelRendererTurbo(this, 347, 179, textureX, textureY); // Import ImportBox116
		hipsModel[234] = new ModelRendererTurbo(this, 347, 196, textureX, textureY); // Import ImportBox117
		hipsModel[235] = new ModelRendererTurbo(this, 259, 161, textureX, textureY); // Import ImportBox118
		hipsModel[236] = new ModelRendererTurbo(this, 295, 161, textureX, textureY); // Import ImportBox119
		hipsModel[237] = new ModelRendererTurbo(this, 334, 164, textureX, textureY); // Import ImportBox120
		hipsModel[238] = new ModelRendererTurbo(this, 332, 171, textureX, textureY); // Import ImportBox125
		hipsModel[239] = new ModelRendererTurbo(this, 332, 181, textureX, textureY); // Import ImportBox126
		hipsModel[240] = new ModelRendererTurbo(this, 332, 197, textureX, textureY); // Import ImportBox127
		hipsModel[241] = new ModelRendererTurbo(this, 262, 170, textureX, textureY); // Import ImportBox128
		hipsModel[242] = new ModelRendererTurbo(this, 260, 190, textureX, textureY); // Import ImportBox129
		hipsModel[243] = new ModelRendererTurbo(this, 262, 210, textureX, textureY); // Import ImportBox130
		hipsModel[244] = new ModelRendererTurbo(this, 295, 208, textureX, textureY); // Import ImportBox131
		hipsModel[245] = new ModelRendererTurbo(this, 295, 192, textureX, textureY); // Import ImportBox132
		hipsModel[246] = new ModelRendererTurbo(this, 296, 172, textureX, textureY); // Import ImportBox133
		hipsModel[247] = new ModelRendererTurbo(this, 242, 491, textureX, textureY); // Import ImportBox0
		hipsModel[248] = new ModelRendererTurbo(this, 242, 472, textureX, textureY); // Import ImportBox1
		hipsModel[249] = new ModelRendererTurbo(this, 241, 453, textureX, textureY); // Import ImportBox2
		hipsModel[250] = new ModelRendererTurbo(this, 241, 443, textureX, textureY); // Import ImportBox3
		hipsModel[251] = new ModelRendererTurbo(this, 241, 434, textureX, textureY); // Import ImportBox4
		hipsModel[252] = new ModelRendererTurbo(this, 241, 419, textureX, textureY); // Import ImportBox5
		hipsModel[253] = new ModelRendererTurbo(this, 280, 461, textureX, textureY); // Import ImportBox8
		hipsModel[254] = new ModelRendererTurbo(this, 280, 480, textureX, textureY); // Import ImportBox9
		hipsModel[255] = new ModelRendererTurbo(this, 279, 442, textureX, textureY); // Import ImportBox10
		hipsModel[256] = new ModelRendererTurbo(this, 242, 491, textureX, textureY); // Import ImportBox0
		hipsModel[257] = new ModelRendererTurbo(this, 242, 472, textureX, textureY); // Import ImportBox1
		hipsModel[258] = new ModelRendererTurbo(this, 241, 453, textureX, textureY); // Import ImportBox2
		hipsModel[259] = new ModelRendererTurbo(this, 363, 174, textureX, textureY); // Import ImportBox0
		hipsModel[260] = new ModelRendererTurbo(this, 347, 196, textureX, textureY); // Import ImportBox1
		hipsModel[261] = new ModelRendererTurbo(this, 295, 208, textureX, textureY); // Import ImportBox2
		hipsModel[262] = new ModelRendererTurbo(this, 332, 197, textureX, textureY); // Import ImportBox3
		hipsModel[263] = new ModelRendererTurbo(this, 262, 210, textureX, textureY); // Import ImportBox4
		hipsModel[264] = new ModelRendererTurbo(this, 242, 491, textureX, textureY); // Import ImportBox5
		hipsModel[265] = new ModelRendererTurbo(this, 280, 480, textureX, textureY); // Import ImportBox6
		hipsModel[266] = new ModelRendererTurbo(this, 242, 491, textureX, textureY); // Import ImportBox7
		hipsModel[267] = new ModelRendererTurbo(this, 320, 97, textureX, textureY); // Import ImportBox8
		hipsModel[268] = new ModelRendererTurbo(this, 351, 98, textureX, textureY); // Import ImportBox9
		hipsModel[269] = new ModelRendererTurbo(this, 394, 92, textureX, textureY); // Import ImportBox10
		hipsModel[270] = new ModelRendererTurbo(this, 408, 92, textureX, textureY); // Import ImportBox11
		hipsModel[271] = new ModelRendererTurbo(this, 393, 47, textureX, textureY); // Import ImportBox12
		hipsModel[272] = new ModelRendererTurbo(this, 260, 190, textureX, textureY); // Import ImportBox0
		hipsModel[273] = new ModelRendererTurbo(this, 262, 170, textureX, textureY); // Import ImportBox1
		hipsModel[274] = new ModelRendererTurbo(this, 241, 453, textureX, textureY); // Import ImportBox2
		hipsModel[275] = new ModelRendererTurbo(this, 242, 472, textureX, textureY); // Import ImportBox3
		hipsModel[276] = new ModelRendererTurbo(this, 280, 461, textureX, textureY); // Import ImportBox4
		hipsModel[277] = new ModelRendererTurbo(this, 279, 442, textureX, textureY); // Import ImportBox5
		hipsModel[278] = new ModelRendererTurbo(this, 241, 453, textureX, textureY); // Import ImportBox6
		hipsModel[279] = new ModelRendererTurbo(this, 242, 472, textureX, textureY); // Import ImportBox7
		hipsModel[280] = new ModelRendererTurbo(this, 318, 77, textureX, textureY); // Import ImportBox8
		hipsModel[281] = new ModelRendererTurbo(this, 320, 57, textureX, textureY); // Import ImportBox9
		hipsModel[282] = new ModelRendererTurbo(this, 117, 451, textureX, textureY); // Import ImportBox10
		hipsModel[283] = new ModelRendererTurbo(this, 117, 458, textureX, textureY); // Import ImportBox11
		hipsModel[284] = new ModelRendererTurbo(this, 117, 464, textureX, textureY); // Import ImportBox12
		hipsModel[285] = new ModelRendererTurbo(this, 117, 469, textureX, textureY); // Import ImportBox13
		hipsModel[286] = new ModelRendererTurbo(this, 168, 477, textureX, textureY); // Import ImportBox14
		hipsModel[287] = new ModelRendererTurbo(this, 117, 477, textureX, textureY); // Import ImportBox15
		hipsModel[288] = new ModelRendererTurbo(this, 150, 477, textureX, textureY); // Import ImportBox16
		hipsModel[289] = new ModelRendererTurbo(this, 168, 477, textureX, textureY); // Import ImportBox17
		hipsModel[290] = new ModelRendererTurbo(this, 150, 477, textureX, textureY); // Import ImportBox18
		hipsModel[291] = new ModelRendererTurbo(this, 320, 409, textureX, textureY); // Import ImportBox19
		hipsModel[292] = new ModelRendererTurbo(this, 320, 419, textureX, textureY); // Import ImportBox20
		hipsModel[293] = new ModelRendererTurbo(this, 320, 434, textureX, textureY); // Import ImportBox21
		hipsModel[294] = new ModelRendererTurbo(this, 241, 419, textureX, textureY); // Import ImportBox22
		hipsModel[295] = new ModelRendererTurbo(this, 241, 434, textureX, textureY); // Import ImportBox23
		hipsModel[296] = new ModelRendererTurbo(this, 241, 443, textureX, textureY); // Import ImportBox24
		hipsModel[297] = new ModelRendererTurbo(this, 320, 443, textureX, textureY); // Import ImportBox25
		hipsModel[298] = new ModelRendererTurbo(this, 118, 431, textureX, textureY); // Import ImportBox26
		hipsModel[299] = new ModelRendererTurbo(this, 117, 438, textureX, textureY); // Import ImportBox27
		hipsModel[300] = new ModelRendererTurbo(this, 117, 451, textureX, textureY); // Import ImportBox28
		hipsModel[301] = new ModelRendererTurbo(this, 117, 458, textureX, textureY); // Import ImportBox29
		hipsModel[302] = new ModelRendererTurbo(this, 117, 464, textureX, textureY); // Import ImportBox30
		hipsModel[303] = new ModelRendererTurbo(this, 117, 469, textureX, textureY); // Import ImportBox31
		hipsModel[304] = new ModelRendererTurbo(this, 168, 477, textureX, textureY); // Import ImportBox32
		hipsModel[305] = new ModelRendererTurbo(this, 150, 477, textureX, textureY); // Import ImportBox33
		hipsModel[306] = new ModelRendererTurbo(this, 117, 477, textureX, textureY); // Import ImportBox34
		hipsModel[307] = new ModelRendererTurbo(this, 150, 477, textureX, textureY); // Import ImportBox35
		hipsModel[308] = new ModelRendererTurbo(this, 168, 477, textureX, textureY); // Import ImportBox36
		hipsModel[309] = new ModelRendererTurbo(this, 200, 479, textureX, textureY); // Import ImportBox37
		hipsModel[310] = new ModelRendererTurbo(this, 188, 479, textureX, textureY); // Import ImportBox38
		hipsModel[311] = new ModelRendererTurbo(this, 188, 479, textureX, textureY); // Import ImportBox41
		hipsModel[312] = new ModelRendererTurbo(this, 200, 479, textureX, textureY); // Import ImportBox42
		hipsModel[313] = new ModelRendererTurbo(this, 200, 479, textureX, textureY); // Import ImportBox44
		hipsModel[314] = new ModelRendererTurbo(this, 188, 479, textureX, textureY); // Import ImportBox45
		hipsModel[315] = new ModelRendererTurbo(this, 200, 479, textureX, textureY); // Import ImportBox46
		hipsModel[316] = new ModelRendererTurbo(this, 188, 479, textureX, textureY); // Import ImportBox49
		hipsModel[317] = new ModelRendererTurbo(this, 200, 479, textureX, textureY); // Import ImportBox50
		hipsModel[318] = new ModelRendererTurbo(this, 188, 479, textureX, textureY); // Import ImportBox51
		hipsModel[319] = new ModelRendererTurbo(this, 200, 479, textureX, textureY); // Import ImportBox52
		hipsModel[320] = new ModelRendererTurbo(this, 200, 479, textureX, textureY); // Import ImportBox53
		hipsModel[321] = new ModelRendererTurbo(this, 188, 479, textureX, textureY); // Import ImportBox54
		hipsModel[322] = new ModelRendererTurbo(this, 200, 479, textureX, textureY); // Import ImportBox55
		hipsModel[323] = new ModelRendererTurbo(this, 188, 479, textureX, textureY); // Import ImportBox56
		hipsModel[324] = new ModelRendererTurbo(this, 200, 479, textureX, textureY); // Import ImportBox57
		hipsModel[325] = new ModelRendererTurbo(this, 188, 479, textureX, textureY); // Import ImportBox58
		hipsModel[326] = new ModelRendererTurbo(this, 200, 479, textureX, textureY); // Import ImportBox59
		hipsModel[327] = new ModelRendererTurbo(this, 188, 479, textureX, textureY); // Import ImportBox60
		hipsModel[328] = new ModelRendererTurbo(this, 200, 479, textureX, textureY); // Import ImportBox61
		hipsModel[329] = new ModelRendererTurbo(this, 188, 479, textureX, textureY); // Import ImportBox62
		hipsModel[330] = new ModelRendererTurbo(this, 200, 479, textureX, textureY); // Import ImportBox65
		hipsModel[331] = new ModelRendererTurbo(this, 188, 479, textureX, textureY); // Import ImportBox66
		hipsModel[332] = new ModelRendererTurbo(this, 188, 479, textureX, textureY); // Import ImportBox75
		hipsModel[333] = new ModelRendererTurbo(this, 200, 479, textureX, textureY); // Import ImportBox76
		hipsModel[334] = new ModelRendererTurbo(this, 188, 479, textureX, textureY); // Import ImportBox77
		hipsModel[335] = new ModelRendererTurbo(this, 200, 479, textureX, textureY); // Import ImportBox78
		hipsModel[336] = new ModelRendererTurbo(this, 188, 479, textureX, textureY); // Import ImportBox79
		hipsModel[337] = new ModelRendererTurbo(this, 200, 479, textureX, textureY); // Import ImportBox80
		hipsModel[338] = new ModelRendererTurbo(this, 188, 479, textureX, textureY); // Import ImportBox81
		hipsModel[339] = new ModelRendererTurbo(this, 200, 479, textureX, textureY); // Import ImportBox82
		hipsModel[340] = new ModelRendererTurbo(this, 188, 479, textureX, textureY); // Import ImportBox83
		hipsModel[341] = new ModelRendererTurbo(this, 200, 479, textureX, textureY); // Import ImportBox84
		hipsModel[342] = new ModelRendererTurbo(this, 188, 479, textureX, textureY); // Import ImportBox85
		hipsModel[343] = new ModelRendererTurbo(this, 200, 479, textureX, textureY); // Import ImportBox86
		hipsModel[344] = new ModelRendererTurbo(this, 188, 479, textureX, textureY); // Import ImportBox87
		hipsModel[345] = new ModelRendererTurbo(this, 200, 479, textureX, textureY); // Import ImportBox88
		hipsModel[346] = new ModelRendererTurbo(this, 188, 479, textureX, textureY); // Import ImportBox89
		hipsModel[347] = new ModelRendererTurbo(this, 200, 479, textureX, textureY); // Import ImportBox90
		hipsModel[348] = new ModelRendererTurbo(this, 188, 479, textureX, textureY); // Import ImportBox91
		hipsModel[349] = new ModelRendererTurbo(this, 200, 479, textureX, textureY); // Import ImportBox92
		hipsModel[350] = new ModelRendererTurbo(this, 188, 479, textureX, textureY); // Import ImportBox93
		hipsModel[351] = new ModelRendererTurbo(this, 200, 479, textureX, textureY); // Import ImportBox94
		hipsModel[352] = new ModelRendererTurbo(this, 188, 479, textureX, textureY); // Import ImportBox95
		hipsModel[353] = new ModelRendererTurbo(this, 200, 479, textureX, textureY); // Import ImportBox96
		hipsModel[354] = new ModelRendererTurbo(this, 188, 479, textureX, textureY); // Import ImportBox97
		hipsModel[355] = new ModelRendererTurbo(this, 200, 479, textureX, textureY); // Import ImportBox98
		hipsModel[356] = new ModelRendererTurbo(this, 188, 479, textureX, textureY); // Import ImportBox99
		hipsModel[357] = new ModelRendererTurbo(this, 379, 418, textureX, textureY); // Import ImportBox9
		hipsModel[358] = new ModelRendererTurbo(this, 444, 453, textureX, textureY); // Import ImportBox10
		hipsModel[359] = new ModelRendererTurbo(this, 379, 453, textureX, textureY); // Import ImportBox11
		hipsModel[360] = new ModelRendererTurbo(this, 379, 418, textureX, textureY); // Import ImportBox13
		hipsModel[361] = new ModelRendererTurbo(this, 379, 418, textureX, textureY); // Import ImportBox0
		hipsModel[362] = new ModelRendererTurbo(this, 444, 453, textureX, textureY); // Import ImportBox1
		hipsModel[363] = new ModelRendererTurbo(this, 379, 453, textureX, textureY); // Import ImportBox2
		hipsModel[364] = new ModelRendererTurbo(this, 379, 418, textureX, textureY); // Import ImportBox3
		hipsModel[365] = new ModelRendererTurbo(this, 379, 453, textureX, textureY); // Import ImportBox4
		hipsModel[366] = new ModelRendererTurbo(this, 379, 418, textureX, textureY); // Import ImportBox5
		hipsModel[367] = new ModelRendererTurbo(this, 444, 453, textureX, textureY); // Import ImportBox6
		hipsModel[368] = new ModelRendererTurbo(this, 444, 418, textureX, textureY); // Import ImportBox7
		hipsModel[369] = new ModelRendererTurbo(this, 444, 453, textureX, textureY); // Import ImportBox8
		hipsModel[370] = new ModelRendererTurbo(this, 379, 418, textureX, textureY); // Import ImportBox9
		hipsModel[371] = new ModelRendererTurbo(this, 379, 453, textureX, textureY); // Import ImportBox10
		hipsModel[372] = new ModelRendererTurbo(this, 444, 418, textureX, textureY); // Import ImportBox11
		hipsModel[373] = new ModelRendererTurbo(this, 444, 453, textureX, textureY); // Import ImportBox12
		hipsModel[374] = new ModelRendererTurbo(this, 379, 418, textureX, textureY); // Import ImportBox13
		hipsModel[375] = new ModelRendererTurbo(this, 379, 453, textureX, textureY); // Import ImportBox14
		hipsModel[376] = new ModelRendererTurbo(this, 444, 418, textureX, textureY); // Import ImportBox15
		hipsModel[377] = new ModelRendererTurbo(this, 379, 418, textureX, textureY); // Import ImportBox16
		hipsModel[378] = new ModelRendererTurbo(this, 444, 453, textureX, textureY); // Import ImportBox17
		hipsModel[379] = new ModelRendererTurbo(this, 379, 418, textureX, textureY); // Import ImportBox18
		hipsModel[380] = new ModelRendererTurbo(this, 379, 453, textureX, textureY); // Import ImportBox19
		hipsModel[381] = new ModelRendererTurbo(this, 379, 418, textureX, textureY); // Import ImportBox20
		hipsModel[382] = new ModelRendererTurbo(this, 379, 418, textureX, textureY); // Import ImportBox23
		hipsModel[383] = new ModelRendererTurbo(this, 444, 418, textureX, textureY); // Import ImportBox24
		hipsModel[384] = new ModelRendererTurbo(this, 444, 453, textureX, textureY); // Import ImportBox25
		hipsModel[385] = new ModelRendererTurbo(this, 444, 453, textureX, textureY); // Import ImportBox26
		hipsModel[386] = new ModelRendererTurbo(this, 379, 418, textureX, textureY); // Import ImportBox27
		hipsModel[387] = new ModelRendererTurbo(this, 444, 418, textureX, textureY); // Import ImportBox28
		hipsModel[388] = new ModelRendererTurbo(this, 379, 453, textureX, textureY); // Import ImportBox29
		hipsModel[389] = new ModelRendererTurbo(this, 379, 453, textureX, textureY); // Import ImportBox32
		hipsModel[390] = new ModelRendererTurbo(this, 444, 418, textureX, textureY); // Import ImportBox33
		hipsModel[391] = new ModelRendererTurbo(this, 379, 453, textureX, textureY); // Import ImportBox34
		hipsModel[392] = new ModelRendererTurbo(this, 444, 418, textureX, textureY); // Import ImportBox35
		hipsModel[393] = new ModelRendererTurbo(this, 379, 418, textureX, textureY); // Import ImportBox36
		hipsModel[394] = new ModelRendererTurbo(this, 444, 453, textureX, textureY); // Import ImportBox37
		hipsModel[395] = new ModelRendererTurbo(this, 379, 453, textureX, textureY); // Import ImportBox38
		hipsModel[396] = new ModelRendererTurbo(this, 379, 418, textureX, textureY); // Import ImportBox39
		hipsModel[397] = new ModelRendererTurbo(this, 379, 418, textureX, textureY); // Import ImportBox40
		hipsModel[398] = new ModelRendererTurbo(this, 444, 453, textureX, textureY); // Import ImportBox41
		hipsModel[399] = new ModelRendererTurbo(this, 379, 418, textureX, textureY); // Import ImportBox42
		hipsModel[400] = new ModelRendererTurbo(this, 379, 453, textureX, textureY); // Import ImportBox43
		hipsModel[401] = new ModelRendererTurbo(this, 444, 418, textureX, textureY); // Import ImportBox44
		hipsModel[402] = new ModelRendererTurbo(this, 444, 453, textureX, textureY); // Import ImportBox45
		hipsModel[403] = new ModelRendererTurbo(this, 379, 418, textureX, textureY); // Import ImportBox46
		hipsModel[404] = new ModelRendererTurbo(this, 379, 453, textureX, textureY); // Import ImportBox47
		hipsModel[405] = new ModelRendererTurbo(this, 444, 453, textureX, textureY); // Import ImportBox48
		hipsModel[406] = new ModelRendererTurbo(this, 444, 418, textureX, textureY); // Import ImportBox49
		hipsModel[407] = new ModelRendererTurbo(this, 379, 453, textureX, textureY); // Import ImportBox50
		hipsModel[408] = new ModelRendererTurbo(this, 379, 418, textureX, textureY); // Import ImportBox51
		hipsModel[409] = new ModelRendererTurbo(this, 444, 453, textureX, textureY); // Import ImportBox52
		hipsModel[410] = new ModelRendererTurbo(this, 379, 453, textureX, textureY); // Import ImportBox53
		hipsModel[411] = new ModelRendererTurbo(this, 379, 418, textureX, textureY); // Import ImportBox54
		hipsModel[412] = new ModelRendererTurbo(this, 444, 418, textureX, textureY); // Import ImportBox55
		hipsModel[413] = new ModelRendererTurbo(this, 444, 453, textureX, textureY); // Import ImportBox56
		hipsModel[414] = new ModelRendererTurbo(this, 379, 418, textureX, textureY); // Import ImportBox57
		hipsModel[415] = new ModelRendererTurbo(this, 379, 453, textureX, textureY); // Import ImportBox58
		hipsModel[416] = new ModelRendererTurbo(this, 379, 418, textureX, textureY); // Import ImportBox59
		hipsModel[417] = new ModelRendererTurbo(this, 379, 418, textureX, textureY); // Import ImportBox60
		hipsModel[418] = new ModelRendererTurbo(this, 444, 453, textureX, textureY); // Import ImportBox61
		hipsModel[419] = new ModelRendererTurbo(this, 444, 418, textureX, textureY); // Import ImportBox62
		hipsModel[420] = new ModelRendererTurbo(this, 379, 418, textureX, textureY); // Import ImportBox63
		hipsModel[421] = new ModelRendererTurbo(this, 444, 418, textureX, textureY); // Import ImportBox64
		hipsModel[422] = new ModelRendererTurbo(this, 379, 453, textureX, textureY); // Import ImportBox65
		hipsModel[423] = new ModelRendererTurbo(this, 379, 418, textureX, textureY); // Import ImportBox66
		hipsModel[424] = new ModelRendererTurbo(this, 444, 453, textureX, textureY); // Import ImportBox67
		hipsModel[425] = new ModelRendererTurbo(this, 284, 304, textureX, textureY); // Import ImportBox50
		hipsModel[426] = new ModelRendererTurbo(this, 284, 294, textureX, textureY); // Import ImportBox52
		hipsModel[427] = new ModelRendererTurbo(this, 7, 277, textureX, textureY); // Import ImportBox53
		hipsModel[428] = new ModelRendererTurbo(this, 284, 284, textureX, textureY); // Import ImportBox54
		hipsModel[429] = new ModelRendererTurbo(this, 7, 248, textureX, textureY); // Import ImportBox59
		hipsModel[430] = new ModelRendererTurbo(this, 284, 316, textureX, textureY); // Import ImportBox60
		hipsModel[431] = new ModelRendererTurbo(this, 284, 329, textureX, textureY); // Import ImportBox62
		hipsModel[432] = new ModelRendererTurbo(this, 284, 340, textureX, textureY); // Import ImportBox64
		hipsModel[433] = new ModelRendererTurbo(this, 41, 337, textureX, textureY); // Import ImportBox65
		hipsModel[434] = new ModelRendererTurbo(this, 42, 253, textureX, textureY); // Import ImportBox66
		hipsModel[435] = new ModelRendererTurbo(this, 83, 243, textureX, textureY); // Import ImportBox73
		hipsModel[436] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Import ImportBox74
		hipsModel[437] = new ModelRendererTurbo(this, 110, 307, textureX, textureY); // Import ImportBox75
		hipsModel[438] = new ModelRendererTurbo(this, 404, 292, textureX, textureY); // Import ImportBox76
		hipsModel[439] = new ModelRendererTurbo(this, 347, 237, textureX, textureY); // Import ImportBox77
		hipsModel[440] = new ModelRendererTurbo(this, 310, 245, textureX, textureY); // Import ImportBox78
		hipsModel[441] = new ModelRendererTurbo(this, 310, 234, textureX, textureY); // Import ImportBox79
		hipsModel[442] = new ModelRendererTurbo(this, 82, 256, textureX, textureY); // Import ImportBox80
		hipsModel[443] = new ModelRendererTurbo(this, 22, 249, textureX, textureY); // Import ImportBox81
		hipsModel[444] = new ModelRendererTurbo(this, 320, 284, textureX, textureY); // Import ImportBox82
		hipsModel[445] = new ModelRendererTurbo(this, 320, 293, textureX, textureY); // Import ImportBox83
		hipsModel[446] = new ModelRendererTurbo(this, 320, 303, textureX, textureY); // Import ImportBox84
		hipsModel[447] = new ModelRendererTurbo(this, 320, 315, textureX, textureY); // Import ImportBox85
		hipsModel[448] = new ModelRendererTurbo(this, 319, 327, textureX, textureY); // Import ImportBox86
		hipsModel[449] = new ModelRendererTurbo(this, 317, 339, textureX, textureY); // Import ImportBox87
		hipsModel[450] = new ModelRendererTurbo(this, 358, 277, textureX, textureY); // Import ImportBox89
		hipsModel[451] = new ModelRendererTurbo(this, 358, 291, textureX, textureY); // Import ImportBox90
		hipsModel[452] = new ModelRendererTurbo(this, 357, 301, textureX, textureY); // Import ImportBox91
		hipsModel[453] = new ModelRendererTurbo(this, 358, 312, textureX, textureY); // Import ImportBox92
		hipsModel[454] = new ModelRendererTurbo(this, 359, 285, textureX, textureY); // Import ImportBox93
		hipsModel[455] = new ModelRendererTurbo(this, 383, 324, textureX, textureY); // Import ImportBox94
		hipsModel[456] = new ModelRendererTurbo(this, 62, 318, textureX, textureY); // Import ImportBox95
		hipsModel[457] = new ModelRendererTurbo(this, 385, 292, textureX, textureY); // Import ImportBox96
		hipsModel[458] = new ModelRendererTurbo(this, 386, 287, textureX, textureY); // Import ImportBox97
		hipsModel[459] = new ModelRendererTurbo(this, 385, 280, textureX, textureY); // Import ImportBox98
		hipsModel[460] = new ModelRendererTurbo(this, 7, 397, textureX, textureY); // Import ImportBox99
		hipsModel[461] = new ModelRendererTurbo(this, 29, 397, textureX, textureY); // Import ImportBox100
		hipsModel[462] = new ModelRendererTurbo(this, 359, 322, textureX, textureY); // Import ImportBox103
		hipsModel[463] = new ModelRendererTurbo(this, 368, 322, textureX, textureY); // Import ImportBox104
		hipsModel[464] = new ModelRendererTurbo(this, 64, 331, textureX, textureY); // Import ImportBox107
		hipsModel[465] = new ModelRendererTurbo(this, 89, 319, textureX, textureY); // Import ImportBox0
		hipsModel[466] = new ModelRendererTurbo(this, 41, 337, textureX, textureY); // Import ImportBox1
		hipsModel[467] = new ModelRendererTurbo(this, 64, 340, textureX, textureY); // Import ImportBox3
		hipsModel[468] = new ModelRendererTurbo(this, 78, 319, textureX, textureY); // Import ImportBox4
		hipsModel[469] = new ModelRendererTurbo(this, 89, 313, textureX, textureY); // Import ImportBox5
		hipsModel[470] = new ModelRendererTurbo(this, 42, 271, textureX, textureY); // Import ImportBox6
		hipsModel[471] = new ModelRendererTurbo(this, 38, 312, textureX, textureY); // Import ImportBox7
		hipsModel[472] = new ModelRendererTurbo(this, 42, 283, textureX, textureY); // Import ImportBox9
		hipsModel[473] = new ModelRendererTurbo(this, 38, 322, textureX, textureY); // Import ImportBox10
		hipsModel[474] = new ModelRendererTurbo(this, 89, 345, textureX, textureY); // Import ImportBox11
		hipsModel[475] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Import ImportBox14
		hipsModel[476] = new ModelRendererTurbo(this, 89, 340, textureX, textureY); // Import ImportBox18
		hipsModel[477] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Import ImportBox19
		hipsModel[478] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Import ImportBox23
		hipsModel[479] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Import ImportBox1
		hipsModel[480] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Import ImportBox2
		hipsModel[481] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Import ImportBox3
		hipsModel[482] = new ModelRendererTurbo(this, 83, 6, textureX, textureY); // Import ImportEye
		hipsModel[483] = new ModelRendererTurbo(this, 42, 294, textureX, textureY); // Import ImportBox7
		hipsModel[484] = new ModelRendererTurbo(this, 42, 294, textureX, textureY); // Import ImportBox9
		hipsModel[485] = new ModelRendererTurbo(this, 42, 294, textureX, textureY); // Import ImportBox10
		hipsModel[486] = new ModelRendererTurbo(this, 42, 294, textureX, textureY); // Import ImportBox12
		hipsModel[487] = new ModelRendererTurbo(this, 42, 303, textureX, textureY); // Import ImportBox13
		hipsModel[488] = new ModelRendererTurbo(this, 35, 0, textureX, textureY); // Import ImportBox14
		hipsModel[489] = new ModelRendererTurbo(this, 7, 428, textureX, textureY); // Import ImportBox15
		hipsModel[490] = new ModelRendererTurbo(this, 29, 428, textureX, textureY); // Import ImportBox16
		hipsModel[491] = new ModelRendererTurbo(this, 43, 428, textureX, textureY); // Import ImportBox17
		hipsModel[492] = new ModelRendererTurbo(this, 43, 397, textureX, textureY); // Import ImportBox18
		hipsModel[493] = new ModelRendererTurbo(this, 68, 397, textureX, textureY); // Import ImportBox19
		hipsModel[494] = new ModelRendererTurbo(this, 68, 428, textureX, textureY); // Import ImportBox20
		hipsModel[495] = new ModelRendererTurbo(this, 84, 397, textureX, textureY); // Import ImportBox21
		hipsModel[496] = new ModelRendererTurbo(this, 7, 248, textureX, textureY); // Import ImportBox24
		hipsModel[497] = new ModelRendererTurbo(this, 7, 277, textureX, textureY); // Import ImportBox25
		hipsModel[498] = new ModelRendererTurbo(this, 42, 253, textureX, textureY); // Import ImportBox32
		hipsModel[499] = new ModelRendererTurbo(this, 41, 337, textureX, textureY); // Import ImportBox33

		hipsModel[0].addShapeBox(14F, -25F, 0F, 8, 4, 5, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		hipsModel[0].setRotationPoint(-6F, -37F, 0F);

		hipsModel[1].addShapeBox(1F, -25F, 0F, 10, 4, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox3
		hipsModel[1].setRotationPoint(-6F, -37F, 0F);

		hipsModel[2].addShapeBox(-15F, -25F, 0F, 12, 4, 5, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox4
		hipsModel[2].setRotationPoint(-6F, -37F, 0F);

		hipsModel[3].addShapeBox(-30F, -25F, 0F, 10, 4, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox5
		hipsModel[3].setRotationPoint(-6F, -37F, 0F);

		hipsModel[4].addShapeBox(-21F, 3F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Import ImportBox8
		hipsModel[4].setRotationPoint(-6F, -37F, 0F);

		hipsModel[5].addShapeBox(22F, -21F, 0F, 6, 11, 5, 0F,0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox9
		hipsModel[5].setRotationPoint(-6F, -37F, 0F);

		hipsModel[6].addShapeBox(12F, 3F, 0F, 10, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import ImportBox10
		hipsModel[6].setRotationPoint(-6F, -37F, 0F);

		hipsModel[7].addShapeBox(1F, 3F, 0F, 11, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox11
		hipsModel[7].setRotationPoint(-6F, -37F, 0F);

		hipsModel[8].addShapeBox(11F, -25F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox12
		hipsModel[8].setRotationPoint(-6F, -37F, 0F);

		hipsModel[9].addShapeBox(-3F, -23F, 0F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox13
		hipsModel[9].setRotationPoint(-6F, -37F, 0F);

		hipsModel[10].addShapeBox(-20F, -25F, 0F, 5, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox14
		hipsModel[10].setRotationPoint(-6F, -37F, 0F);

		hipsModel[11].addShapeBox(-34F, -23F, 0F, 4, 23, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox15
		hipsModel[11].setRotationPoint(-6F, -37F, 0F);

		hipsModel[12].addShapeBox(-34F, 3F, 0F, 7, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportBox16
		hipsModel[12].setRotationPoint(-6F, -37F, 0F);

		hipsModel[13].addShapeBox(22F, -7F, 0F, 6, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F); // Import ImportBox17
		hipsModel[13].setRotationPoint(-6F, -37F, 0F);

		hipsModel[14].addShapeBox(-37F, -20F, 0F, 3, 11, 5, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox18
		hipsModel[14].setRotationPoint(-6F, -37F, 0F);

		hipsModel[15].addShapeBox(-37F, -9F, 0F, 3, 19, 5, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Import ImportBox19
		hipsModel[15].setRotationPoint(-6F, -37F, 0F);

		hipsModel[16].addShapeBox(-27F, 3F, 0F, 6, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportBox20
		hipsModel[16].setRotationPoint(-6F, -37F, 0F);

		hipsModel[17].addShapeBox(-3F, 3F, 0F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox21
		hipsModel[17].setRotationPoint(-6F, -37F, 0F);

		hipsModel[18].addShapeBox(14F, -25F, 5F, 8, 4, 9, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox22
		hipsModel[18].setRotationPoint(-6F, -37F, 0F);

		hipsModel[19].addShapeBox(11F, -25F, 5F, 3, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox23
		hipsModel[19].setRotationPoint(-6F, -37F, 0F);

		hipsModel[20].addShapeBox(1F, -25F, 5F, 10, 4, 9, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox24
		hipsModel[20].setRotationPoint(-6F, -37F, 0F);

		hipsModel[21].addShapeBox(-3F, -23F, 5F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox25
		hipsModel[21].setRotationPoint(-6F, -37F, 0F);

		hipsModel[22].addShapeBox(-15F, -25F, 5F, 12, 4, 9, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox26
		hipsModel[22].setRotationPoint(-6F, -37F, 0F);

		hipsModel[23].addShapeBox(-20F, -25F, 5F, 5, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox27
		hipsModel[23].setRotationPoint(-6F, -37F, 0F);

		hipsModel[24].addShapeBox(-30F, -25F, 5F, 10, 4, 9, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox28
		hipsModel[24].setRotationPoint(-6F, -37F, 0F);

		hipsModel[25].addShapeBox(-34F, -23F, 5F, 4, 9, 9, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox29
		hipsModel[25].setRotationPoint(-6F, -37F, 0F);

		hipsModel[26].addShapeBox(-37F, -20F, 5F, 3, 11, 9, 0F,0F, -4F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox30
		hipsModel[26].setRotationPoint(-6F, -37F, 0F);

		hipsModel[27].addShapeBox(-37F, -9F, 5F, 3, 19, 9, 0F,1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -2F, -6F, 0F); // Import ImportBox31
		hipsModel[27].setRotationPoint(-6F, -37F, 0F);

		hipsModel[28].addShapeBox(-34F, 3F, 5F, 7, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -2F, -2F, 0F); // Import ImportBox32
		hipsModel[28].setRotationPoint(-6F, -37F, 0F);

		hipsModel[29].addShapeBox(-27F, 3F, 5F, 6, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Import ImportBox33
		hipsModel[29].setRotationPoint(-6F, -37F, 0F);

		hipsModel[30].addShapeBox(-21F, 3F, 5F, 6, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox34
		hipsModel[30].setRotationPoint(-6F, -37F, 0F);

		hipsModel[31].addShapeBox(-3F, 3F, 5F, 4, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Import ImportBox35
		hipsModel[31].setRotationPoint(-6F, -37F, 0F);

		hipsModel[32].addShapeBox(1F, 3F, 5F, 11, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F); // Import ImportBox36
		hipsModel[32].setRotationPoint(-6F, -37F, 0F);

		hipsModel[33].addShapeBox(12F, 3F, 5F, 10, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F); // Import ImportBox37
		hipsModel[33].setRotationPoint(-6F, -37F, 0F);

		hipsModel[34].addShapeBox(22F, -10F, 5F, 6, 13, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, -1F, 0F, 0F, 0F); // Import ImportBox38
		hipsModel[34].setRotationPoint(-6F, -37F, 0F);

		hipsModel[35].addShapeBox(22F, -21F, 5F, 6, 11, 9, 0F,0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox39
		hipsModel[35].setRotationPoint(-6F, -37F, 0F);

		hipsModel[36].addShapeBox(-30F, -21F, 14F, 10, 7, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, 1F); // Import ImportBox40
		hipsModel[36].setRotationPoint(-6F, -37F, 0F);

		hipsModel[37].addShapeBox(-15F, -21F, 14F, 12, 7, 4, 0F,0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F); // Import ImportBox41
		hipsModel[37].setRotationPoint(-6F, -37F, 0F);

		hipsModel[38].addShapeBox(-20F, -21F, 14F, 5, 7, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Import ImportBox42
		hipsModel[38].setRotationPoint(-6F, -37F, 0F);

		hipsModel[39].addShapeBox(-35F, -21F, 14F, 5, 5, 4, 0F,-3F, -1F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, -5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 2F, 1F, -4F, 2F, 0F); // Import ImportBox43
		hipsModel[39].setRotationPoint(-6F, -37F, 0F);

		hipsModel[40].addShapeBox(-35F, -16F, 14F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 1F, -4F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 1F, -3F, 0F, 0F); // Import ImportBox44
		hipsModel[40].setRotationPoint(-6F, -37F, 0F);

		hipsModel[41].addShapeBox(-35F, -9F, 14F, 5, 14, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 1F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, -4F, -3F, -1F); // Import ImportBox45
		hipsModel[41].setRotationPoint(-6F, -37F, 0F);

		hipsModel[42].addShapeBox(-3F, -21F, 14F, 4, 7, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F); // Import ImportBox46
		hipsModel[42].setRotationPoint(-6F, -37F, 0F);

		hipsModel[43].addShapeBox(1F, -21F, 14F, 10, 7, 3, 0F,0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); // Import ImportBox47
		hipsModel[43].setRotationPoint(-6F, -37F, 0F);

		hipsModel[44].addShapeBox(11F, -21F, 14F, 3, 7, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import ImportBox48
		hipsModel[44].setRotationPoint(-6F, -37F, 0F);

		hipsModel[45].addShapeBox(-21F, 2F, 14F, 6, 4, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -2F, -1F, 0F, -1F, -1F); // Import ImportBox49
		hipsModel[45].setRotationPoint(-6F, -37F, 0F);

		hipsModel[46].addShapeBox(-27F, 2F, 14F, 6, 6, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -2F, -1F); // Import ImportBox50
		hipsModel[46].setRotationPoint(-6F, -37F, 0F);

		hipsModel[47].addShapeBox(-34F, 3F, 14F, 7, 5, 4, 0F,1F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F, 1F, -1F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -1F, -4F, -3F, -2F); // Import ImportBox51
		hipsModel[47].setRotationPoint(-6F, -37F, 0F);

		hipsModel[48].addShapeBox(-27F, -9F, 14F, 7, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		hipsModel[48].setRotationPoint(-6F, -37F, 0F);

		hipsModel[49].addShapeBox(-20F, -9F, 14F, 5, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		hipsModel[49].setRotationPoint(-6F, -37F, 0F);

		hipsModel[50].addShapeBox(-15F, -9F, 14F, 12, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F); // Import ImportBox2
		hipsModel[50].setRotationPoint(-6F, -37F, 0F);

		hipsModel[51].addShapeBox(-3F, -14F, 14F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox3
		hipsModel[51].setRotationPoint(-6F, -37F, 0F);

		hipsModel[52].addShapeBox(-3F, 1F, 14F, 4, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Import ImportBox4
		hipsModel[52].setRotationPoint(-6F, -37F, 0F);

		hipsModel[53].addShapeBox(-15F, 2F, 14F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -1F); // Import ImportBox8
		hipsModel[53].setRotationPoint(-6F, -37F, 0F);

		hipsModel[54].addShapeBox(-15F, 3F, 5F, 12, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Import ImportBox9
		hipsModel[54].setRotationPoint(-6F, -37F, 0F);

		hipsModel[55].addShapeBox(-15F, 3F, 0F, 12, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportBox10
		hipsModel[55].setRotationPoint(-6F, -37F, 0F);

		hipsModel[56].addShapeBox(-15F, -14F, 14F, 12, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox12
		hipsModel[56].setRotationPoint(-6F, -37F, 0F);

		hipsModel[57].addShapeBox(-20F, -14F, 14F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox13
		hipsModel[57].setRotationPoint(-6F, -37F, 0F);

		hipsModel[58].addShapeBox(-27F, -14F, 14F, 7, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox14
		hipsModel[58].setRotationPoint(-6F, -37F, 0F);

		hipsModel[59].addShapeBox(-3F, -9F, 14F, 4, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox15
		hipsModel[59].setRotationPoint(-6F, -37F, 0F);

		hipsModel[60].addShapeBox(1F, -9F, 14F, 10, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, 2F, -1F, 0F, 0F, 0F); // Import ImportBox18
		hipsModel[60].setRotationPoint(-6F, -37F, 0F);

		hipsModel[61].addShapeBox(11F, -9F, 14F, 3, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 2F, 0F, -2F, 2F, 0F, -2F, 2F, -2F, -1F, 2F, -2F); // Import ImportBox19
		hipsModel[61].setRotationPoint(-6F, -37F, 0F);

		hipsModel[62].addShapeBox(1F, -14F, 14F, 10, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F); // Import ImportBox20
		hipsModel[62].setRotationPoint(-6F, -37F, 0F);

		hipsModel[63].addShapeBox(11F, -14F, 14F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox21
		hipsModel[63].setRotationPoint(-6F, -37F, 0F);

		hipsModel[64].addShapeBox(14F, -21F, 14F, 8, 7, 3, 0F,0F, 2F, 0F, 0F, 0F, 0F, -2F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 2F); // Import ImportBox22
		hipsModel[64].setRotationPoint(-6F, -37F, 0F);

		hipsModel[65].addShapeBox(14F, -14F, 14F, 8, 5, 3, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F); // Import ImportBox23
		hipsModel[65].setRotationPoint(-6F, -37F, 0F);

		hipsModel[66].addShapeBox(1F, 1F, 14F, 11, 5, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F); // Import ImportBox25
		hipsModel[66].setRotationPoint(-6F, -37F, 0F);

		hipsModel[67].addShapeBox(22F, -21F, 9F, 6, 11, 3, 0F,0F, 0F, 0F, -2F, -4F, 1F, -4F, -5F, -2F, 2F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, 0F, 0F, 0F); // Import ImportBox28
		hipsModel[67].setRotationPoint(-6F, -37F, 5F);

		hipsModel[68].addShapeBox(22F, -10F, 14F, 6, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -4F, 1F, -4F, -5F, -2F, 2F, -2F, -1F); // Import ImportBox32
		hipsModel[68].setRotationPoint(-6F, -37F, 0F);

		hipsModel[69].addShapeBox(14F, -6F, 14F, 8, 10, 3, 0F,0F, 3F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 3F, 2F, 2F, 1F, 0F, 0F, -1F, 0F, -2F, -2F, -1F, 2F, -1F, -1F); // Import ImportBox33
		hipsModel[69].setRotationPoint(-6F, -37F, 0F);

		hipsModel[70].addShapeBox(-41F, -16F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F); // Import ImportBox0
		hipsModel[70].setRotationPoint(-6F, -37F, 0F);

		hipsModel[71].addShapeBox(-41F, -19F, 0F, 3, 3, 2, 0F,-1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import ImportBox2
		hipsModel[71].setRotationPoint(-6F, -37F, 0F);

		hipsModel[72].addShapeBox(-42F, -13F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox3
		hipsModel[72].setRotationPoint(-6F, -37F, 0F);

		hipsModel[73].addShapeBox(-42F, -9F, -1F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F); // Import ImportBox4
		hipsModel[73].setRotationPoint(-6F, -38F, 0F);

		hipsModel[74].addShapeBox(-41.5F, -5F, -1F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F); // Import ImportBox5
		hipsModel[74].setRotationPoint(-6F, -38F, 0F);

		hipsModel[75].addShapeBox(-41F, 0F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, -.2F, -.6F, 0F, -.2F, -.6F, 0F, -.2F, .3F, 0F, -.2F); // Import ImportBox6
		hipsModel[75].setRotationPoint(-6F, -37F, 0F);

		hipsModel[76].addShapeBox(22F, -21F, -5F, 6, 11, 5, 0F,0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		hipsModel[76].setRotationPoint(-6F, -37F, 0F);

		hipsModel[77].addShapeBox(14F, -25F, -5F, 8, 4, 5, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox9
		hipsModel[77].setRotationPoint(-6F, -37F, 0F);

		hipsModel[78].addShapeBox(11F, -25F, -5F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox10
		hipsModel[78].setRotationPoint(-6F, -37F, 0F);

		hipsModel[79].addShapeBox(1F, -25F, -5F, 10, 4, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox11
		hipsModel[79].setRotationPoint(-6F, -37F, 0F);

		hipsModel[80].addShapeBox(-3F, -23F, -5F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox12
		hipsModel[80].setRotationPoint(-6F, -37F, 0F);

		hipsModel[81].addShapeBox(-15F, -25F, -5F, 12, 4, 5, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox13
		hipsModel[81].setRotationPoint(-6F, -37F, 0F);

		hipsModel[82].addShapeBox(-20F, -25F, -5F, 5, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox14
		hipsModel[82].setRotationPoint(-6F, -37F, 0F);

		hipsModel[83].addShapeBox(-30F, -25F, -5F, 10, 4, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox15
		hipsModel[83].setRotationPoint(-6F, -37F, 0F);

		hipsModel[84].addShapeBox(-34F, -23F, -5F, 4, 23, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox16
		hipsModel[84].setRotationPoint(-6F, -37F, 0F);

		hipsModel[85].addShapeBox(-37F, -20F, -5F, 3, 11, 5, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox17
		hipsModel[85].setRotationPoint(-6F, -37F, 0F);

		hipsModel[86].addShapeBox(-37F, -9F, -5F, 3, 19, 5, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Import ImportBox18
		hipsModel[86].setRotationPoint(-6F, -37F, 0F);

		hipsModel[87].addShapeBox(-34F, 3F, -5F, 7, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportBox19
		hipsModel[87].setRotationPoint(-6F, -37F, 0F);

		hipsModel[88].addShapeBox(-27F, 3F, -5F, 6, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportBox20
		hipsModel[88].setRotationPoint(-6F, -37F, 0F);

		hipsModel[89].addShapeBox(-21F, 3F, -5F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Import ImportBox21
		hipsModel[89].setRotationPoint(-6F, -37F, 0F);

		hipsModel[90].addShapeBox(-15F, 3F, -5F, 12, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportBox22
		hipsModel[90].setRotationPoint(-6F, -37F, 0F);

		hipsModel[91].addShapeBox(-3F, 3F, -5F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox23
		hipsModel[91].setRotationPoint(-6F, -37F, 0F);

		hipsModel[92].addShapeBox(1F, 3F, -5F, 11, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox24
		hipsModel[92].setRotationPoint(-6F, -37F, 0F);

		hipsModel[93].addShapeBox(12F, 3F, -5F, 10, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import ImportBox25
		hipsModel[93].setRotationPoint(-6F, -37F, 0F);

		hipsModel[94].addShapeBox(22F, -7F, -5F, 6, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F); // Import ImportBox26
		hipsModel[94].setRotationPoint(-6F, -37F, 0F);

		hipsModel[95].addShapeBox(-34F, 3F, -14F, 7, 7, 9, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportBox27
		hipsModel[95].setRotationPoint(-6F, -37F, 0F);

		hipsModel[96].addShapeBox(-37F, -9F, -14F, 3, 19, 9, 0F,-1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -6F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Import ImportBox28
		hipsModel[96].setRotationPoint(-6F, -37F, 0F);

		hipsModel[97].addShapeBox(-37F, -20F, -14F, 3, 11, 9, 0F,-2F, -4F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox29
		hipsModel[97].setRotationPoint(-6F, -37F, 0F);

		hipsModel[98].addShapeBox(-34F, -23F, -14F, 4, 9, 9, 0F,-2F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox30
		hipsModel[98].setRotationPoint(-6F, -37F, 0F);

		hipsModel[99].addShapeBox(-30F, -25F, -14F, 10, 4, 9, 0F,0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		hipsModel[99].setRotationPoint(-6F, -37F, 0F);

		hipsModel[100].addShapeBox(-20F, -25F, -14F, 5, 4, 9, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox32
		hipsModel[100].setRotationPoint(-6F, -37F, 0F);

		hipsModel[101].addShapeBox(-15F, -25F, -14F, 12, 4, 9, 0F,0F, -2F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox33
		hipsModel[101].setRotationPoint(-6F, -37F, 0F);

		hipsModel[102].addShapeBox(-3F, -23F, -14F, 4, 2, 9, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox34
		hipsModel[102].setRotationPoint(-6F, -37F, 0F);

		hipsModel[103].addShapeBox(1F, -25F, -14F, 10, 4, 9, 0F,0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox35
		hipsModel[103].setRotationPoint(-6F, -37F, 0F);

		hipsModel[104].addShapeBox(11F, -25F, -14F, 3, 4, 9, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox36
		hipsModel[104].setRotationPoint(-6F, -37F, 0F);

		hipsModel[105].addShapeBox(14F, -25F, -14F, 8, 4, 9, 0F,0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox37
		hipsModel[105].setRotationPoint(-6F, -37F, 0F);

		hipsModel[106].addShapeBox(22F, -21F, -14F, 6, 11, 9, 0F,0F, 0F, 0F, -2F, -4F, -1F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox38
		hipsModel[106].setRotationPoint(-6F, -37F, 0F);

		hipsModel[107].addShapeBox(22F, -10F, -14F, 6, 13, 9, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, -1F, -2F, -3F, 0F, 0F, 0F, 0F); // Import ImportBox39
		hipsModel[107].setRotationPoint(-6F, -37F, 0F);

		hipsModel[108].addShapeBox(12F, 3F, -14F, 10, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import ImportBox40
		hipsModel[108].setRotationPoint(-6F, -37F, 0F);

		hipsModel[109].addShapeBox(1F, 3F, -14F, 11, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox41
		hipsModel[109].setRotationPoint(-6F, -37F, 0F);

		hipsModel[110].addShapeBox(-3F, 3F, -14F, 4, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox42
		hipsModel[110].setRotationPoint(-6F, -37F, 0F);

		hipsModel[111].addShapeBox(-15F, 3F, -14F, 12, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportBox43
		hipsModel[111].setRotationPoint(-6F, -37F, 0F);

		hipsModel[112].addShapeBox(-21F, 3F, -14F, 6, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Import ImportBox44
		hipsModel[112].setRotationPoint(-6F, -37F, 0F);

		hipsModel[113].addShapeBox(-27F, 3F, -14F, 6, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportBox45
		hipsModel[113].setRotationPoint(-6F, -37F, 0F);

		hipsModel[114].addShapeBox(-41F, -19F, -2F, 3, 3, 2, 0F,-1F, -2F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox48
		hipsModel[114].setRotationPoint(-6F, -37F, 0F);

		hipsModel[115].addShapeBox(-41F, -16F, -2F, 3, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox49
		hipsModel[115].setRotationPoint(-6F, -37F, 0F);

		hipsModel[116].addShapeBox(18F, -21F, -5F, 14, 19, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox56
		hipsModel[116].setRotationPoint(-6F, -37F, 0F);

		hipsModel[117].addShapeBox(18F, -21F, 5F, 14, 19, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import ImportBox57
		hipsModel[117].setRotationPoint(-6F, -37F, 0F);

		hipsModel[118].addShapeBox(18F, -21F, -10F, 14, 19, 5, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox58
		hipsModel[118].setRotationPoint(-6F, -37F, 0F);

		hipsModel[119].addShapeBox(22F, -10F, -17F, 6, 14, 3, 0F,0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, -2F, -1F, -4F, -5F, -2F, -2F, -4F, 1F, 0F, -1F, 0F); // Import ImportBox226
		hipsModel[119].setRotationPoint(-6F, -37F, 0F);

		hipsModel[120].addShapeBox(14F, -6F, -17F, 8, 10, 3, 0F,0F, 3F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 2F, -1F, -1F, -2F, -2F, -1F, 0F, -1F, 0F, 2F, 1F, 0F); // Import ImportBox227
		hipsModel[120].setRotationPoint(-6F, -37F, 0F);

		hipsModel[121].addShapeBox(1F, 1F, -16F, 11, 5, 2, 0F,0F, 0F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox228
		hipsModel[121].setRotationPoint(-6F, -37F, 0F);

		hipsModel[122].addShapeBox(-3F, 1F, -16F, 4, 5, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox229
		hipsModel[122].setRotationPoint(-6F, -37F, 0F);

		hipsModel[123].addShapeBox(-15F, 2F, -18F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportBox230
		hipsModel[123].setRotationPoint(-6F, -37F, 0F);

		hipsModel[124].addShapeBox(-21F, 2F, -18F, 6, 4, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 2F, 0F); // Import ImportBox231
		hipsModel[124].setRotationPoint(-6F, -37F, 0F);

		hipsModel[125].addShapeBox(-27F, 2F, -18F, 6, 6, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportBox232
		hipsModel[125].setRotationPoint(-6F, -37F, 0F);

		hipsModel[126].addShapeBox(-34F, 3F, -18F, 7, 5, 4, 0F,-3F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -4F, -3F, -2F, 0F, -2F, -1F, 0F, 1F, 0F, -2F, 0F, 0F); // Import ImportBox233
		hipsModel[126].setRotationPoint(-6F, -37F, 0F);

		hipsModel[127].addShapeBox(-35F, -9F, -18F, 5, 14, 4, 0F,-3F, 0F, 0F, 3F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, -3F, -1F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import ImportBox234
		hipsModel[127].setRotationPoint(-6F, -37F, 0F);

		hipsModel[128].addShapeBox(-35F, -16F, -18F, 5, 7, 4, 0F,-4F, -2F, 0F, 3F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox235
		hipsModel[128].setRotationPoint(-6F, -37F, 0F);

		hipsModel[129].addShapeBox(-35F, -21F, -18F, 5, 5, 4, 0F,-5F, -5F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -4F, 2F, 0F, 3F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox236
		hipsModel[129].setRotationPoint(-6F, -37F, 0F);

		hipsModel[130].addShapeBox(-30F, -21F, -18F, 10, 7, 4, 0F,-3F, -3F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox237
		hipsModel[130].setRotationPoint(-6F, -37F, 0F);

		hipsModel[131].addShapeBox(-20F, -21F, -18F, 5, 7, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox238
		hipsModel[131].setRotationPoint(-6F, -37F, 0F);

		hipsModel[132].addShapeBox(1F, -21F, -17F, 10, 7, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox239
		hipsModel[132].setRotationPoint(-6F, -37F, 0F);

		hipsModel[133].addShapeBox(-3F, -21F, -16F, 4, 7, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox240
		hipsModel[133].setRotationPoint(-6F, -37F, 0F);

		hipsModel[134].addShapeBox(-15F, -21F, -18F, 12, 7, 4, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox241
		hipsModel[134].setRotationPoint(-6F, -37F, 0F);

		hipsModel[135].addShapeBox(11F, -21F, -18F, 3, 7, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox242
		hipsModel[135].setRotationPoint(-6F, -37F, 0F);

		hipsModel[136].addShapeBox(14F, -21F, -17F, 8, 7, 3, 0F,0F, 0F, 0F, -2F, -2F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Import ImportBox243
		hipsModel[136].setRotationPoint(-6F, -37F, 0F);

		hipsModel[137].addShapeBox(22F, -21F, -22F, 6, 11, 3, 0F,2F, -2F, -1F, -4F, -5F, -2F, -2F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox244
		hipsModel[137].setRotationPoint(-6F, -37F, 5F);

		hipsModel[138].addShapeBox(14F, -14F, -17F, 8, 5, 3, 0F,0F, 0F, 2F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox245
		hipsModel[138].setRotationPoint(-6F, -37F, 0F);

		hipsModel[139].addShapeBox(11F, -14F, -19F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox246
		hipsModel[139].setRotationPoint(-6F, -37F, 0F);

		hipsModel[140].addShapeBox(1F, -14F, -17F, 10, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox247
		hipsModel[140].setRotationPoint(-6F, -37F, 0F);

		hipsModel[141].addShapeBox(-3F, -14F, -18F, 4, 5, 4, 0F,0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox248
		hipsModel[141].setRotationPoint(-6F, -37F, 0F);

		hipsModel[142].addShapeBox(-15F, -14F, -20F, 12, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox249
		hipsModel[142].setRotationPoint(-6F, -37F, 0F);

		hipsModel[143].addShapeBox(-27F, -9F, -18F, 7, 11, 4, 0F,0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox250
		hipsModel[143].setRotationPoint(-6F, -37F, 0F);

		hipsModel[144].addShapeBox(-27F, -14F, -19F, 7, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox251
		hipsModel[144].setRotationPoint(-6F, -37F, 0F);

		hipsModel[145].addShapeBox(-20F, -14F, -25F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox252
		hipsModel[145].setRotationPoint(-6F, -37F, 5F);

		hipsModel[146].addShapeBox(-20F, -9F, -18F, 5, 11, 4, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox253
		hipsModel[146].setRotationPoint(-6F, -37F, 0F);

		hipsModel[147].addShapeBox(-15F, -9F, -18F, 12, 11, 4, 0F,0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox254
		hipsModel[147].setRotationPoint(-6F, -37F, 0F);

		hipsModel[148].addShapeBox(-3F, -9F, -17F, 4, 10, 3, 0F,0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox255
		hipsModel[148].setRotationPoint(-6F, -37F, 0F);

		hipsModel[149].addShapeBox(1F, -9F, -17F, 10, 10, 3, 0F,0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, -1F, 1F, 2F, 0F, 0F, 0F, 0F); // Import ImportBox256
		hipsModel[149].setRotationPoint(-6F, -37F, 0F);

		hipsModel[150].addShapeBox(11F, -9F, -18F, 3, 10, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, -2F, -2F, 2F, -2F, -2F, 2F, 0F, -1F, 2F, 0F); // Import ImportBox257
		hipsModel[150].setRotationPoint(-6F, -37F, 0F);

		hipsModel[151].addShapeBox(-25F, -27F, 0F, 40, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		hipsModel[151].setRotationPoint(-6F, -37F, 0F);

		hipsModel[152].addShapeBox(-25F, -27F, 5F, 13, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Import ImportBox2
		hipsModel[152].setRotationPoint(-6F, -37F, 0F);

		hipsModel[153].addShapeBox(-25F, -25F, 14F, 13, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Import ImportBox3
		hipsModel[153].setRotationPoint(-6F, -37F, 0F);

		hipsModel[154].addShapeBox(-25F, -23F, 17F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Import ImportBox4
		hipsModel[154].setRotationPoint(-6F, -37F, 0F);

		hipsModel[155].addShapeBox(-23F, -28F, 0F, 36, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox7
		hipsModel[155].setRotationPoint(-6F, -37F, 0F);

		hipsModel[156].addShapeBox(-23F, -23F, 5F, 36, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		hipsModel[156].setRotationPoint(-6F, -42F, 0F);

		hipsModel[157].addShapeBox(7F, 24F, 14.5F, 2, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import ImportBox66
		hipsModel[157].setRotationPoint(-6F, -37F, 0F);
		hipsModel[157].rotateAngleZ = 1.29154365F;

		hipsModel[158].addShapeBox(7F, 24F, -17.5F, 2, 1, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import ImportBox278
		hipsModel[158].setRotationPoint(-6F, -37F, 0F);
		hipsModel[158].rotateAngleZ = 1.29154365F;

		hipsModel[159].addShapeBox(-32F, -23F, -19F, 7, 2, 2, 0F,0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Import ImportBox9
		hipsModel[159].setRotationPoint(-6F, -37F, 0F);

		hipsModel[160].addShapeBox(-32F, -25F, -17F, 7, 2, 3, 0F,0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Import ImportBox10
		hipsModel[160].setRotationPoint(-6F, -37F, 0F);

		hipsModel[161].addShapeBox(-32F, -27F, -14F, 7, 2, 9, 0F,0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Import ImportBox11
		hipsModel[161].setRotationPoint(-6F, -37F, 0F);

		hipsModel[162].addShapeBox(-32F, -27F, -5F, 7, 2, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Import ImportBox12
		hipsModel[162].setRotationPoint(-6F, -37F, 0F);

		hipsModel[163].addShapeBox(-38F, -19F, -21F, 6, 13, 2, 0F,0F, -7F, -4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 3F, 0F, 0F, -4F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 3F); // Import ImportBox28
		hipsModel[163].setRotationPoint(-6F, -37F, 0F);

		hipsModel[164].addShapeBox(-38F, -21F, -19F, 6, 2, 2, 0F,0F, -6F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, 6F, -3F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 4F, 2F); // Import ImportBox29
		hipsModel[164].setRotationPoint(-6F, -37F, 0F);

		hipsModel[165].addShapeBox(-38F, -23F, -17F, 6, 2, 3, 0F,0F, -6F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, 6F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 4F, 1F); // Import ImportBox30
		hipsModel[165].setRotationPoint(-6F, -37F, 0F);

		hipsModel[166].addShapeBox(-38F, -25F, -14F, 6, 2, 9, 0F,0F, -6F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 6F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Import ImportBox31
		hipsModel[166].setRotationPoint(-6F, -37F, 0F);

		hipsModel[167].addShapeBox(-38F, -25F, -5F, 6, 2, 5, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Import ImportBox32
		hipsModel[167].setRotationPoint(-6F, -37F, 0F);

		hipsModel[168].addShapeBox(-38F, -6F, -21F, 6, 9, 2, 0F,0F, 0F, -4F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 3F); // Import ImportBox34
		hipsModel[168].setRotationPoint(-6F, -37F, 0F);

		hipsModel[169].addShapeBox(-40F, -21F, -5F, 2, 5, 5, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox36
		hipsModel[169].setRotationPoint(-6F, -37F, 0F);

		hipsModel[170].addShapeBox(-40F, -21F, -13F, 2, 5, 8, 0F,0F, -5.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox37
		hipsModel[170].setRotationPoint(-6F, -37F, 0F);

		hipsModel[171].addShapeBox(-40F, -19F, -15F, 2, 4, 2, 0F,0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F); // Import ImportBox38
		hipsModel[171].setRotationPoint(-6F, -37F, 0F);

		hipsModel[172].addShapeBox(-40F, -17F, -16F, 2, 2, 1, 0F,0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox39
		hipsModel[172].setRotationPoint(-6F, -37F, 0F);

		hipsModel[173].addShapeBox(-40F, -15F, -17F, 2, 9, 1, 0F,0F, -4F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox40
		hipsModel[173].setRotationPoint(-6F, -37F, 0F);

		hipsModel[174].addShapeBox(-40F, -6F, -17F, 2, 9, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox44
		hipsModel[174].setRotationPoint(-6F, -37F, 0F);

		hipsModel[175].addShapeBox(-41F, -16F, -5F, 2, 5, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox46
		hipsModel[175].setRotationPoint(-6F, -37F, 0F);

		hipsModel[176].addShapeBox(-41F, -16F, -13F, 1, 5, 8, 0F,-1F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox47
		hipsModel[176].setRotationPoint(-6F, -37F, 0F);

		hipsModel[177].addShapeBox(-41F, -15F, -15F, 1, 4, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, -1F, .5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox48
		hipsModel[177].setRotationPoint(-6F, -37F, 0F);

		hipsModel[178].addShapeBox(-41F, -11F, -5F, 2, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox49
		hipsModel[178].setRotationPoint(-6F, -37F, 0F);

		hipsModel[179].addShapeBox(-41F, -11F, -13F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox50
		hipsModel[179].setRotationPoint(-6F, -37F, 0F);

		hipsModel[180].addShapeBox(-41F, -11F, -15F, 1, 5, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox51
		hipsModel[180].setRotationPoint(-6F, -37F, 0F);

		hipsModel[181].addShapeBox(-41F, -6F, -15F, 1, 9, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox52
		hipsModel[181].setRotationPoint(-6F, -37F, 0F);

		hipsModel[182].addShapeBox(-41F, -6F, -13F, 1, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox53
		hipsModel[182].setRotationPoint(-6F, -37F, 0F);

		hipsModel[183].addShapeBox(-41F, -6F, -5F, 2, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox54
		hipsModel[183].setRotationPoint(-6F, -37F, 0F);

		hipsModel[184].addShapeBox(-41F, 3F, -5F, 2, 13, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox57
		hipsModel[184].setRotationPoint(-6F, -37F, 0F);

		hipsModel[185].addShapeBox(15F, -23F, -19F, 5, 2, 2, 0F,0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import ImportBox61
		hipsModel[185].setRotationPoint(-6F, -37F, 0F);

		hipsModel[186].addShapeBox(15F, -25F, -17F, 5, 2, 3, 0F,0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import ImportBox62
		hipsModel[186].setRotationPoint(-6F, -37F, 0F);

		hipsModel[187].addShapeBox(15F, -27F, -14F, 5, 2, 9, 0F,0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import ImportBox63
		hipsModel[187].setRotationPoint(-6F, -37F, 0F);

		hipsModel[188].addShapeBox(15F, -27F, -5F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import ImportBox64
		hipsModel[188].setRotationPoint(-6F, -37F, 0F);

		hipsModel[189].addShapeBox(20F, -6F, -21F, 6, 9, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, -1F); // Import ImportBox66
		hipsModel[189].setRotationPoint(-6F, -37F, 0F);

		hipsModel[190].addShapeBox(20F, -19F, -21F, 6, 13, 2, 0F,0F, -3F, 0F, 0F, -7F, -4F, 0F, -4F, 3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 0F); // Import ImportBox67
		hipsModel[190].setRotationPoint(-6F, -37F, 0F);

		hipsModel[191].addShapeBox(20F, -21F, -19F, 6, 2, 2, 0F,0F, -2F, 0F, 0F, -6F, -3F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 6F, -3F, 0F, 4F, 2F, 0F, 0F, 0F); // Import ImportBox68
		hipsModel[191].setRotationPoint(-6F, -37F, 0F);

		hipsModel[192].addShapeBox(20F, -23F, -17F, 6, 2, 3, 0F,0F, -2F, 0F, 0F, -6F, -2F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 6F, -2F, 0F, 4F, 1F, 0F, 0F, 0F); // Import ImportBox69
		hipsModel[192].setRotationPoint(-6F, -37F, 0F);

		hipsModel[193].addShapeBox(20F, -25F, -14F, 6, 2, 9, 0F,0F, -2F, 0F, 0F, -6F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 6F, -1F, 0F, 4F, 0F, 0F, 0F, 0F); // Import ImportBox70
		hipsModel[193].setRotationPoint(-6F, -37F, 0F);

		hipsModel[194].addShapeBox(20F, -25F, -5F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Import ImportBox71
		hipsModel[194].setRotationPoint(-6F, -37F, 0F);

		hipsModel[195].addShapeBox(28F, 1F, -5F, 1, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox75
		hipsModel[195].setRotationPoint(-6F, -37F, 0F);

		hipsModel[196].addShapeBox(28F, 1F, 0F, 1, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox76
		hipsModel[196].setRotationPoint(-6F, -37F, 0F);

		hipsModel[197].addShapeBox(28F, 1F, 5F, 1, 15, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import ImportBox77
		hipsModel[197].setRotationPoint(-6F, -37F, 0F);

		hipsModel[198].addShapeBox(28F, 3F, 13F, 1, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 2F, 0F, 0F, 2F, 0F); // Import ImportBox78
		hipsModel[198].setRotationPoint(-6F, -37F, 0F);

		hipsModel[199].addShapeBox(26F, 3F, 16F, 2, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 1F, 0F, 2F, -2F, 0F, 3F, 0F); // Import ImportBox79
		hipsModel[199].setRotationPoint(-6F, -37F, 0F);

		hipsModel[200].addShapeBox(20F, 3F, 19F, 6, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 3F, 0F, 3F, -3F, 0F, 2F, 0F); // Import ImportBox80
		hipsModel[200].setRotationPoint(-6F, -37F, 0F);

		hipsModel[201].addShapeBox(15F, 3F, 20F, 5, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, .5F, 0F, 1F, 0F, 0F, 2F, 1F, 0F, 2F, -1F, 0F, 1F, 0F); // Import ImportBox81
		hipsModel[201].setRotationPoint(-6F, -37F, 0F);

		hipsModel[202].addShapeBox(20F, -6F, 19F, 6, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -1F); // Import ImportBox82
		hipsModel[202].setRotationPoint(-6F, -37F, 0F);

		hipsModel[203].addShapeBox(15F, -6F, 19F, 5, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, .5F); // Import ImportBox83
		hipsModel[203].setRotationPoint(-6F, -37F, 0F);

		hipsModel[204].addShapeBox(20F, -19F, 19F, 6, 13, 2, 0F,0F, 0F, 0F, 0F, -4F, 3F, 0F, -7F, -4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -0.5F); // Import ImportBox84
		hipsModel[204].setRotationPoint(-6F, -37F, 0F);

		hipsModel[205].addShapeBox(15F, -21F, 19F, 5, 15, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F); // Import ImportBox85
		hipsModel[205].setRotationPoint(-6F, -37F, 0F);

		hipsModel[206].addShapeBox(20F, -25F, 0F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Import ImportBox87
		hipsModel[206].setRotationPoint(-6F, -37F, 0F);

		hipsModel[207].addShapeBox(15F, -27F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import ImportBox88
		hipsModel[207].setRotationPoint(-6F, -37F, 0F);

		hipsModel[208].addShapeBox(20F, -25F, 5F, 6, 2, 9, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -6F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 6F, -1F, 0F, 2F, 0F); // Import ImportBox89
		hipsModel[208].setRotationPoint(-6F, -37F, 0F);

		hipsModel[209].addShapeBox(15F, -27F, 5F, 5, 2, 9, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 2F, 0F); // Import ImportBox90
		hipsModel[209].setRotationPoint(-6F, -37F, 0F);

		hipsModel[210].addShapeBox(20F, -23F, 14F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, -4F, 1F, 0F, -6F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 4F, 1F, 0F, 6F, -2F, 0F, 2F, 0F); // Import ImportBox91
		hipsModel[210].setRotationPoint(-6F, -37F, 0F);

		hipsModel[211].addShapeBox(15F, -25F, 14F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 2F, 0F); // Import ImportBox92
		hipsModel[211].setRotationPoint(-6F, -37F, 0F);

		hipsModel[212].addShapeBox(15F, -23F, 17F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Import ImportBox93
		hipsModel[212].setRotationPoint(-6F, -37F, 0F);

		hipsModel[213].addShapeBox(20F, -21F, 17F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, -4F, 2F, 0F, -6F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 4F, 2F, 0F, 6F, -3F, 0F, 4F, 0F); // Import ImportBox94
		hipsModel[213].setRotationPoint(-6F, -37F, 0F);

		hipsModel[214].addShapeBox(-32F, -27F, 0F, 7, 2, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Import ImportBox97
		hipsModel[214].setRotationPoint(-6F, -37F, 0F);

		hipsModel[215].addShapeBox(-38F, -25F, 0F, 6, 2, 5, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Import ImportBox98
		hipsModel[215].setRotationPoint(-6F, -37F, 0F);

		hipsModel[216].addShapeBox(-40F, -21F, 0F, 2, 5, 5, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox99
		hipsModel[216].setRotationPoint(-6F, -37F, 0F);

		hipsModel[217].addShapeBox(-41F, -16F, 1F, 2, 5, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox100
		hipsModel[217].setRotationPoint(-6F, -37F, 0F);

		hipsModel[218].addShapeBox(-41F, -11F, 1F, 2, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox101
		hipsModel[218].setRotationPoint(-6F, -37F, 0F);

		hipsModel[219].addShapeBox(-41F, -6F, 0F, 2, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox102
		hipsModel[219].setRotationPoint(-6F, -37F, 0F);

		hipsModel[220].addShapeBox(-41F, 3F, 0F, 2, 13, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox103
		hipsModel[220].setRotationPoint(-6F, -37F, 0F);

		hipsModel[221].addShapeBox(-41F, 3F, 5F, 1, 13, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import ImportBox104
		hipsModel[221].setRotationPoint(-6F, -37F, 0F);

		hipsModel[222].addShapeBox(-41F, -6F, 5F, 1, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox105
		hipsModel[222].setRotationPoint(-6F, -37F, 0F);

		hipsModel[223].addShapeBox(-41F, -11F, 5F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox106
		hipsModel[223].setRotationPoint(-6F, -37F, 0F);

		hipsModel[224].addShapeBox(-41F, -16F, 5F, 1, 5, 8, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox107
		hipsModel[224].setRotationPoint(-6F, -37F, 0F);

		hipsModel[225].addShapeBox(-40F, -21F, 5F, 2, 5, 8, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox108
		hipsModel[225].setRotationPoint(-6F, -37F, 0F);

		hipsModel[226].addShapeBox(-32F, -27F, 5F, 7, 2, 9, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F); // Import ImportBox109
		hipsModel[226].setRotationPoint(-6F, -37F, 0F);

		hipsModel[227].addShapeBox(-38F, -25F, 5F, 6, 2, 9, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -6F, -1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 6F, -1F); // Import ImportBox110
		hipsModel[227].setRotationPoint(-6F, -37F, 0F);

		hipsModel[228].addShapeBox(-32F, -25F, 14F, 7, 2, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F); // Import ImportBox111
		hipsModel[228].setRotationPoint(-6F, -37F, 0F);

		hipsModel[229].addShapeBox(-38F, -23F, 14F, 6, 2, 3, 0F,0F, -4F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -6F, -2F, 0F, 4F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 6F, -2F); // Import ImportBox112
		hipsModel[229].setRotationPoint(-6F, -37F, 0F);

		hipsModel[230].addShapeBox(-40F, -19F, 13F, 2, 4, 2, 0F,0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox113
		hipsModel[230].setRotationPoint(-6F, -37F, 0F);

		hipsModel[231].addShapeBox(-41F, -15F, 13F, 1, 4, 2, 0F,-1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox114
		hipsModel[231].setRotationPoint(-6F, -37F, 0F);

		hipsModel[232].addShapeBox(-41F, -11F, 13F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox115
		hipsModel[232].setRotationPoint(-6F, -37F, 0F);

		hipsModel[233].addShapeBox(-41F, -6F, 13F, 1, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox116
		hipsModel[233].setRotationPoint(-6F, -37F, 0F);

		hipsModel[234].addShapeBox(-41F, 3F, 13F, 1, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, -1F, 2F, 0F); // Import ImportBox117
		hipsModel[234].setRotationPoint(-6F, -37F, 0F);

		hipsModel[235].addShapeBox(-32F, -23F, 17F, 7, 2, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Import ImportBox118
		hipsModel[235].setRotationPoint(-6F, -37F, 0F);

		hipsModel[236].addShapeBox(-38F, -21F, 17F, 6, 2, 2, 0F,0F, -4F, 2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -6F, -3F, 0F, 4F, 2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 6F, -3F); // Import ImportBox119
		hipsModel[236].setRotationPoint(-6F, -37F, 0F);

		hipsModel[237].addShapeBox(-40F, -17F, 15F, 2, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import ImportBox120
		hipsModel[237].setRotationPoint(-6F, -37F, 0F);

		hipsModel[238].addShapeBox(-40F, -15F, 16F, 2, 9, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import ImportBox125
		hipsModel[238].setRotationPoint(-6F, -37F, 0F);

		hipsModel[239].addShapeBox(-40F, -6F, 16F, 2, 9, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import ImportBox126
		hipsModel[239].setRotationPoint(-6F, -37F, 0F);

		hipsModel[240].addShapeBox(-40F, 3F, 16F, 2, 13, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F, 1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 2F, -2F); // Import ImportBox127
		hipsModel[240].setRotationPoint(-6F, -37F, 0F);

		hipsModel[241].addShapeBox(-32F, -21F, 19F, 7, 15, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import ImportBox128
		hipsModel[241].setRotationPoint(-6F, -37F, 0F);

		hipsModel[242].addShapeBox(-32F, -6F, 19F, 7, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Import ImportBox129
		hipsModel[242].setRotationPoint(-6F, -37F, 0F);

		hipsModel[243].addShapeBox(-32F, 3F, 20F, 7, 13, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 3F, 1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 3F, -1F); // Import ImportBox130
		hipsModel[243].setRotationPoint(-6F, -37F, 0F);

		hipsModel[244].addShapeBox(-38F, 3F, 19F, 6, 13, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 3F, 3F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, -3F); // Import ImportBox131
		hipsModel[244].setRotationPoint(-6F, -37F, 0F);

		hipsModel[245].addShapeBox(-38F, -6F, 19F, 6, 9, 2, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F); // Import ImportBox132
		hipsModel[245].setRotationPoint(-6F, -37F, 0F);

		hipsModel[246].addShapeBox(-38F, -19F, 19F, 6, 13, 2, 0F,0F, -4F, 3F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -7F, -4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4F); // Import ImportBox133
		hipsModel[246].setRotationPoint(-6F, -37F, 0F);

		hipsModel[247].addShapeBox(2F, 3F, 19F, 13, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F); // Import ImportBox0
		hipsModel[247].setRotationPoint(-6F, -37F, 0F);

		hipsModel[248].addShapeBox(2F, -6F, 19F, 13, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -1F); // Import ImportBox1
		hipsModel[248].setRotationPoint(-6F, -37F, 0F);

		hipsModel[249].addShapeBox(2F, -21F, 19F, 13, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F); // Import ImportBox2
		hipsModel[249].setRotationPoint(-6F, -37F, 0F);

		hipsModel[250].addShapeBox(2F, -23F, 17F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Import ImportBox3
		hipsModel[250].setRotationPoint(-6F, -37F, 0F);

		hipsModel[251].addShapeBox(2F, -25F, 14F, 13, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Import ImportBox4
		hipsModel[251].setRotationPoint(-6F, -37F, 0F);

		hipsModel[252].addShapeBox(2F, -27F, 5F, 13, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Import ImportBox5
		hipsModel[252].setRotationPoint(-6F, -37F, 0F);

		hipsModel[253].addShapeBox(-12F, -6F, 19F, 14, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		hipsModel[253].setRotationPoint(-6F, -37F, 0F);

		hipsModel[254].addShapeBox(-12F, 3F, 19F, 14, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox9
		hipsModel[254].setRotationPoint(-6F, -37F, 0F);

		hipsModel[255].addShapeBox(-12F, -21F, 19F, 14, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox10
		hipsModel[255].setRotationPoint(-6F, -37F, 0F);

		hipsModel[256].addShapeBox(-25F, 3F, 19F, 13, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, 0F); // Import ImportBox0
		hipsModel[256].setRotationPoint(-6F, -37F, 0F);

		hipsModel[257].addShapeBox(-25F, -6F, 19F, 13, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox1
		hipsModel[257].setRotationPoint(-6F, -37F, 0F);

		hipsModel[258].addShapeBox(-25F, -21F, 19F, 13, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox2
		hipsModel[258].setRotationPoint(-6F, -37F, 0F);

		hipsModel[259].addShapeBox(-41F, 3F, -13F, 1, 13, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		hipsModel[259].setRotationPoint(-6F, -37F, 0F);

		hipsModel[260].addShapeBox(-41F, 3F, -15F, 1, 13, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import ImportBox1
		hipsModel[260].setRotationPoint(-6F, -37F, 0F);

		hipsModel[261].addShapeBox(-38F, 3F, -20F, 6, 13, 1, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 3F, -3F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 3F); // Import ImportBox2
		hipsModel[261].setRotationPoint(-6F, -37F, 0F);

		hipsModel[262].addShapeBox(-40F, 3F, -17F, 2, 13, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, -2F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 2F, 1F); // Import ImportBox3
		hipsModel[262].setRotationPoint(-6F, -37F, 0F);

		hipsModel[263].addShapeBox(-32F, 3F, -21F, 7, 13, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 3F, -1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 3F, 1F); // Import ImportBox4
		hipsModel[263].setRotationPoint(-6F, -37F, 0F);

		hipsModel[264].addShapeBox(-25F, 3F, -21F, 13, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F); // Import ImportBox5
		hipsModel[264].setRotationPoint(-6F, -37F, 0F);

		hipsModel[265].addShapeBox(-12F, 3F, -20F, 14, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox6
		hipsModel[265].setRotationPoint(-6F, -37F, 0F);

		hipsModel[266].addShapeBox(2F, 3F, -21F, 13, 13, 2, 0F,0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportBox7
		hipsModel[266].setRotationPoint(-6F, -37F, 0F);

		hipsModel[267].addShapeBox(15F, 3F, -21F, 5, 13, 1, 0F,0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, -1F, 0F, 2F, 1F, 0F, 1F, 0F); // Import ImportBox8
		hipsModel[267].setRotationPoint(-6F, -37F, 0F);

		hipsModel[268].addShapeBox(20F, 3F, -20F, 6, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, -3F, 0F, 3F, 3F, 0F, 2F, 0F); // Import ImportBox9
		hipsModel[268].setRotationPoint(-6F, -37F, 0F);

		hipsModel[269].addShapeBox(26F, 3F, -17F, 2, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, -2F, 0F, 2F, 1F, 0F, 3F, 0F); // Import ImportBox10
		hipsModel[269].setRotationPoint(-6F, -37F, 0F);

		hipsModel[270].addShapeBox(28F, 3F, -15F, 1, 13, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import ImportBox11
		hipsModel[270].setRotationPoint(-6F, -37F, 0F);

		hipsModel[271].addShapeBox(28F, 1F, -13F, 1, 15, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox12
		hipsModel[271].setRotationPoint(-6F, -37F, 0F);

		hipsModel[272].addShapeBox(-32F, -6F, -21F, 7, 9, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox0
		hipsModel[272].setRotationPoint(-6F, -37F, 0F);

		hipsModel[273].addShapeBox(-32F, -21F, -21F, 7, 15, 2, 0F,0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		hipsModel[273].setRotationPoint(-6F, -37F, 0F);

		hipsModel[274].addShapeBox(-25F, -21F, -21F, 13, 15, 2, 0F,0F, -3F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2
		hipsModel[274].setRotationPoint(-6F, -37F, 0F);

		hipsModel[275].addShapeBox(-25F, -6F, -21F, 13, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox3
		hipsModel[275].setRotationPoint(-6F, -37F, 0F);

		hipsModel[276].addShapeBox(-12F, -6F, -20F, 14, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox4
		hipsModel[276].setRotationPoint(-6F, -37F, 0F);

		hipsModel[277].addShapeBox(-12F, -21F, -20F, 14, 15, 1, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox5
		hipsModel[277].setRotationPoint(-6F, -37F, 0F);

		hipsModel[278].addShapeBox(2F, -21F, -21F, 13, 15, 2, 0F,0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox6
		hipsModel[278].setRotationPoint(-6F, -37F, 0F);

		hipsModel[279].addShapeBox(2F, -6F, -21F, 13, 9, 2, 0F,0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox7
		hipsModel[279].setRotationPoint(-6F, -37F, 0F);

		hipsModel[280].addShapeBox(15F, -6F, -21F, 5, 9, 2, 0F,0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox8
		hipsModel[280].setRotationPoint(-6F, -37F, 0F);

		hipsModel[281].addShapeBox(15F, -21F, -21F, 5, 15, 2, 0F,0F, -3F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox9
		hipsModel[281].setRotationPoint(-6F, -37F, 0F);

		hipsModel[282].addShapeBox(-23F, -21F, 14F, 36, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Import ImportBox10
		hipsModel[282].setRotationPoint(-6F, -42F, 0F);

		hipsModel[283].addShapeBox(-23F, -19F, 17F, 36, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Import ImportBox11
		hipsModel[283].setRotationPoint(-6F, -42F, 0F);

		hipsModel[284].addShapeBox(-23F, -17F, 19F, 36, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Import ImportBox12
		hipsModel[284].setRotationPoint(-6F, -42F, 0F);

		hipsModel[285].addShapeBox(-23F, -14F, 21F, 36, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F); // Import ImportBox13
		hipsModel[285].setRotationPoint(-6F, -42F, 0F);

		hipsModel[286].addShapeBox(-23F, -10F, 21F, 5, 6, 1, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 2F, 0F, 0F); // Import ImportBox14
		hipsModel[286].setRotationPoint(-6F, -42F, 0F);

		hipsModel[287].addShapeBox(-12F, -10F, 21F, 14, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox15
		hipsModel[287].setRotationPoint(-6F, -42F, 0F);

		hipsModel[288].addShapeBox(-18F, -10F, 21F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox16
		hipsModel[288].setRotationPoint(-6F, -42F, 0F);

		hipsModel[289].addShapeBox(8F, -10F, 21F, 5, 6, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -2F, 0F); // Import ImportBox17
		hipsModel[289].setRotationPoint(-6F, -42F, 0F);

		hipsModel[290].addShapeBox(2F, -10F, 21F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import ImportBox18
		hipsModel[290].setRotationPoint(-6F, -42F, 0F);

		hipsModel[291].addShapeBox(-25F, -27F, -5F, 40, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox19
		hipsModel[291].setRotationPoint(-6F, -37F, 0F);

		hipsModel[292].addShapeBox(-25F, -27F, -14F, 13, 2, 9, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox20
		hipsModel[292].setRotationPoint(-6F, -37F, 0F);

		hipsModel[293].addShapeBox(-25F, -25F, -17F, 13, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox21
		hipsModel[293].setRotationPoint(-6F, -37F, 0F);

		hipsModel[294].addShapeBox(2F, -27F, -14F, 13, 2, 9, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox22
		hipsModel[294].setRotationPoint(-6F, -37F, 0F);

		hipsModel[295].addShapeBox(2F, -25F, -17F, 13, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox23
		hipsModel[295].setRotationPoint(-6F, -37F, 0F);

		hipsModel[296].addShapeBox(2F, -23F, -19F, 13, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox24
		hipsModel[296].setRotationPoint(-6F, -37F, 0F);

		hipsModel[297].addShapeBox(-25F, -23F, -19F, 13, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox25
		hipsModel[297].setRotationPoint(-6F, -37F, 0F);

		hipsModel[298].addShapeBox(-23F, -28F, -5F, 36, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox26
		hipsModel[298].setRotationPoint(-6F, -37F, 0F);

		hipsModel[299].addShapeBox(-23F, -23F, -14F, 36, 3, 9, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox27
		hipsModel[299].setRotationPoint(-6F, -42F, 0F);

		hipsModel[300].addShapeBox(-23F, -21F, -17F, 36, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox28
		hipsModel[300].setRotationPoint(-6F, -42F, 0F);

		hipsModel[301].addShapeBox(-23F, -19F, -19F, 36, 1, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox29
		hipsModel[301].setRotationPoint(-6F, -42F, 0F);

		hipsModel[302].addShapeBox(-23F, -17F, -21F, 36, 1, 2, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox30
		hipsModel[302].setRotationPoint(-6F, -42F, 0F);

		hipsModel[303].addShapeBox(-23F, -14F, -22F, 36, 4, 1, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox31
		hipsModel[303].setRotationPoint(-6F, -42F, 0F);

		hipsModel[304].addShapeBox(8F, -10F, -22F, 5, 6, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -2F, 0F); // Import ImportBox32
		hipsModel[304].setRotationPoint(-6F, -42F, 0F);

		hipsModel[305].addShapeBox(2F, -10F, -22F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import ImportBox33
		hipsModel[305].setRotationPoint(-6F, -42F, 0F);

		hipsModel[306].addShapeBox(-12F, -10F, -22F, 14, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox34
		hipsModel[306].setRotationPoint(-6F, -42F, 0F);

		hipsModel[307].addShapeBox(-18F, -10F, -22F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox35
		hipsModel[307].setRotationPoint(-6F, -42F, 0F);

		hipsModel[308].addShapeBox(-23F, -10F, -22F, 5, 6, 1, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 2F, 0F, 0F); // Import ImportBox36
		hipsModel[308].setRotationPoint(-6F, -42F, 0F);

		hipsModel[309].addShapeBox(4F, 1F, 21F, 2, 4, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox37
		hipsModel[309].setRotationPoint(-6F, -42F, 0F);
		hipsModel[309].rotateAngleX = 0.27925268F;

		hipsModel[310].addShapeBox(4.5F, -2F, 21.5F, 1, 3, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Import ImportBox38
		hipsModel[310].setRotationPoint(-6F, -42F, 0F);
		hipsModel[310].rotateAngleX = 0.27925268F;

		hipsModel[311].addShapeBox(4.5F, 3F, 19.5F, 1, 3, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Import ImportBox41
		hipsModel[311].setRotationPoint(-6F, -42F, 0F);
		hipsModel[311].rotateAngleX = 0.27925268F;

		hipsModel[312].addShapeBox(4F, 6F, 19F, 2, 4, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox42
		hipsModel[312].setRotationPoint(-6F, -42F, 0F);
		hipsModel[312].rotateAngleX = 0.27925268F;

		hipsModel[313].addShapeBox(4F, 11F, 17F, 2, 4, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox44
		hipsModel[313].setRotationPoint(-6F, -42F, 0F);
		hipsModel[313].rotateAngleX = 0.27925268F;

		hipsModel[314].addShapeBox(4.5F, 13F, 16.5F, 1, 3, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Import ImportBox45
		hipsModel[314].setRotationPoint(-6F, -42F, 0F);
		hipsModel[314].rotateAngleX = 0.27925268F;

		hipsModel[315].addShapeBox(4F, 16F, 16F, 2, 4, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox46
		hipsModel[315].setRotationPoint(-6F, -42F, 0F);
		hipsModel[315].rotateAngleX = 0.27925268F;

		hipsModel[316].addShapeBox(4.5F, 24F, 14F, 1, 3, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Import ImportBox49
		hipsModel[316].setRotationPoint(-6F, -42F, 0F);
		hipsModel[316].rotateAngleX = 0.27925268F;

		hipsModel[317].addShapeBox(4F, 27F, 13.5F, 2, 4, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox50
		hipsModel[317].setRotationPoint(-6F, -42F, 0F);
		hipsModel[317].rotateAngleX = 0.27925268F;

		hipsModel[318].addShapeBox(-16.5F, 24F, 14F, 1, 3, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Import ImportBox51
		hipsModel[318].setRotationPoint(-6F, -42F, 0F);
		hipsModel[318].rotateAngleX = 0.27925268F;

		hipsModel[319].addShapeBox(-17F, 27F, 13.5F, 2, 4, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox52
		hipsModel[319].setRotationPoint(-6F, -42F, 0F);
		hipsModel[319].rotateAngleX = 0.27925268F;

		hipsModel[320].addShapeBox(-17F, 22F, 15F, 2, 4, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox53
		hipsModel[320].setRotationPoint(-6F, -42F, 0F);
		hipsModel[320].rotateAngleX = 0.27925268F;

		hipsModel[321].addShapeBox(-16.5F, 19F, 15.5F, 1, 3, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Import ImportBox54
		hipsModel[321].setRotationPoint(-6F, -42F, 0F);
		hipsModel[321].rotateAngleX = 0.27925268F;

		hipsModel[322].addShapeBox(-17F, 16F, 16F, 2, 4, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox55
		hipsModel[322].setRotationPoint(-6F, -42F, 0F);
		hipsModel[322].rotateAngleX = 0.27925268F;

		hipsModel[323].addShapeBox(-16.5F, 13F, 16.5F, 1, 3, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Import ImportBox56
		hipsModel[323].setRotationPoint(-6F, -42F, 0F);
		hipsModel[323].rotateAngleX = 0.27925268F;

		hipsModel[324].addShapeBox(-17F, 11F, 17F, 2, 4, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox57
		hipsModel[324].setRotationPoint(-6F, -42F, 0F);
		hipsModel[324].rotateAngleX = 0.27925268F;

		hipsModel[325].addShapeBox(-16.5F, 8F, 17.5F, 1, 3, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Import ImportBox58
		hipsModel[325].setRotationPoint(-6F, -42F, 0F);
		hipsModel[325].rotateAngleX = 0.27925268F;

		hipsModel[326].addShapeBox(-17F, 6F, 19F, 2, 4, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox59
		hipsModel[326].setRotationPoint(-6F, -42F, 0F);
		hipsModel[326].rotateAngleX = 0.27925268F;

		hipsModel[327].addShapeBox(-16.5F, 3F, 19.5F, 1, 3, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Import ImportBox60
		hipsModel[327].setRotationPoint(-6F, -42F, 0F);
		hipsModel[327].rotateAngleX = 0.27925268F;

		hipsModel[328].addShapeBox(-17F, 1F, 21F, 2, 4, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox61
		hipsModel[328].setRotationPoint(-6F, -42F, 0F);
		hipsModel[328].rotateAngleX = 0.27925268F;

		hipsModel[329].addShapeBox(-16.5F, -2F, 21.5F, 1, 3, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Import ImportBox62
		hipsModel[329].setRotationPoint(-6F, -42F, 0F);
		hipsModel[329].rotateAngleX = 0.27925268F;

		hipsModel[330].addShapeBox(4F, 22F, 15F, 2, 4, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox65
		hipsModel[330].setRotationPoint(-6F, -42F, 0F);
		hipsModel[330].rotateAngleX = 0.27925268F;

		hipsModel[331].addShapeBox(4.5F, 19F, 15.5F, 1, 3, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Import ImportBox66
		hipsModel[331].setRotationPoint(-6F, -42F, 0F);
		hipsModel[331].rotateAngleX = 0.27925268F;

		hipsModel[332].addShapeBox(4.5F, 8F, 17.5F, 1, 3, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Import ImportBox75
		hipsModel[332].setRotationPoint(-6F, -42F, 0F);
		hipsModel[332].rotateAngleX = 0.27925268F;

		hipsModel[333].addShapeBox(4F, 27F, -16F, 2, 4, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox76
		hipsModel[333].setRotationPoint(-6F, -42F, 0F);
		hipsModel[333].rotateAngleX = -0.27925268F;

		hipsModel[334].addShapeBox(4.5F, 24F, -15.5F, 1, 3, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Import ImportBox77
		hipsModel[334].setRotationPoint(-6F, -42F, 0F);
		hipsModel[334].rotateAngleX = -0.27925268F;

		hipsModel[335].addShapeBox(4F, 22F, -17F, 2, 4, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox78
		hipsModel[335].setRotationPoint(-6F, -42F, 0F);
		hipsModel[335].rotateAngleX = -0.27925268F;

		hipsModel[336].addShapeBox(4.5F, 19F, -16.5F, 1, 3, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Import ImportBox79
		hipsModel[336].setRotationPoint(-6F, -42F, 0F);
		hipsModel[336].rotateAngleX = -0.27925268F;

		hipsModel[337].addShapeBox(4F, 16F, -18F, 2, 4, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox80
		hipsModel[337].setRotationPoint(-6F, -42F, 0F);
		hipsModel[337].rotateAngleX = -0.27925268F;

		hipsModel[338].addShapeBox(4.5F, 13F, -17.5F, 1, 3, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Import ImportBox81
		hipsModel[338].setRotationPoint(-6F, -42F, 0F);
		hipsModel[338].rotateAngleX = -0.27925268F;

		hipsModel[339].addShapeBox(4F, 11F, -19F, 2, 4, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox82
		hipsModel[339].setRotationPoint(-6F, -42F, 0F);
		hipsModel[339].rotateAngleX = -0.27925268F;

		hipsModel[340].addShapeBox(4.5F, 8F, -18.5F, 1, 3, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Import ImportBox83
		hipsModel[340].setRotationPoint(-6F, -42F, 0F);
		hipsModel[340].rotateAngleX = -0.27925268F;

		hipsModel[341].addShapeBox(4F, 6F, -21F, 2, 4, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox84
		hipsModel[341].setRotationPoint(-6F, -42F, 0F);
		hipsModel[341].rotateAngleX = -0.27925268F;

		hipsModel[342].addShapeBox(4.5F, 3F, -20.5F, 1, 3, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Import ImportBox85
		hipsModel[342].setRotationPoint(-6F, -42F, 0F);
		hipsModel[342].rotateAngleX = -0.27925268F;

		hipsModel[343].addShapeBox(4F, 1F, -23F, 2, 4, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox86
		hipsModel[343].setRotationPoint(-6F, -42F, 0F);
		hipsModel[343].rotateAngleX = -0.27925268F;

		hipsModel[344].addShapeBox(4.5F, -2F, -22.5F, 1, 3, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Import ImportBox87
		hipsModel[344].setRotationPoint(-6F, -42F, 0F);
		hipsModel[344].rotateAngleX = -0.27925268F;

		hipsModel[345].addShapeBox(-17F, 27F, -16F, 2, 4, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox88
		hipsModel[345].setRotationPoint(-6F, -42F, 0F);
		hipsModel[345].rotateAngleX = -0.27925268F;

		hipsModel[346].addShapeBox(-16.5F, 24F, -15.5F, 1, 3, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Import ImportBox89
		hipsModel[346].setRotationPoint(-6F, -42F, 0F);
		hipsModel[346].rotateAngleX = -0.27925268F;

		hipsModel[347].addShapeBox(-17F, 22F, -17F, 2, 4, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox90
		hipsModel[347].setRotationPoint(-6F, -42F, 0F);
		hipsModel[347].rotateAngleX = -0.27925268F;

		hipsModel[348].addShapeBox(-16.5F, 19F, -16.5F, 1, 3, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Import ImportBox91
		hipsModel[348].setRotationPoint(-6F, -42F, 0F);
		hipsModel[348].rotateAngleX = -0.27925268F;

		hipsModel[349].addShapeBox(-17F, 16F, -18F, 2, 4, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox92
		hipsModel[349].setRotationPoint(-6F, -42F, 0F);
		hipsModel[349].rotateAngleX = -0.27925268F;

		hipsModel[350].addShapeBox(-16.5F, 13F, -17.5F, 1, 3, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Import ImportBox93
		hipsModel[350].setRotationPoint(-6F, -42F, 0F);
		hipsModel[350].rotateAngleX = -0.27925268F;

		hipsModel[351].addShapeBox(-17F, 11F, -19F, 2, 4, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox94
		hipsModel[351].setRotationPoint(-6F, -42F, 0F);
		hipsModel[351].rotateAngleX = -0.27925268F;

		hipsModel[352].addShapeBox(-16.5F, 8F, -18.5F, 1, 3, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Import ImportBox95
		hipsModel[352].setRotationPoint(-6F, -42F, 0F);
		hipsModel[352].rotateAngleX = -0.27925268F;

		hipsModel[353].addShapeBox(-17F, 6F, -21F, 2, 4, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox96
		hipsModel[353].setRotationPoint(-6F, -42F, 0F);
		hipsModel[353].rotateAngleX = -0.27925268F;

		hipsModel[354].addShapeBox(-16.5F, 3F, -20.5F, 1, 3, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Import ImportBox97
		hipsModel[354].setRotationPoint(-6F, -42F, 0F);
		hipsModel[354].rotateAngleX = -0.27925268F;

		hipsModel[355].addShapeBox(-17F, 1F, -23F, 2, 4, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox98
		hipsModel[355].setRotationPoint(-6F, -42F, 0F);
		hipsModel[355].rotateAngleX = -0.27925268F;

		hipsModel[356].addShapeBox(-16.5F, -2F, -22.5F, 1, 3, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Import ImportBox99
		hipsModel[356].setRotationPoint(-6F, -42F, 0F);
		hipsModel[356].rotateAngleX = -0.27925268F;

		hipsModel[357].addShapeBox(0F, -2F, 21F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox9
		hipsModel[357].setRotationPoint(-6F, -37F, 0F);

		hipsModel[358].addShapeBox(0F, -8F, 21F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox10
		hipsModel[358].setRotationPoint(-6F, -37F, 0F);

		hipsModel[359].addShapeBox(0F, -14F, 21F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox11
		hipsModel[359].setRotationPoint(-6F, -37F, 0F);

		hipsModel[360].addShapeBox(0F, -20F, 21F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox13
		hipsModel[360].setRotationPoint(-6F, -37F, 0F);

		hipsModel[361].addShapeBox(-6F, -8F, 20.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox0
		hipsModel[361].setRotationPoint(-6F, -37F, 0F);

		hipsModel[362].addShapeBox(-6F, -14F, 20.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox1
		hipsModel[362].setRotationPoint(-6F, -37F, 0F);

		hipsModel[363].addShapeBox(-6F, -2F, 20.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox2
		hipsModel[363].setRotationPoint(-6F, -37F, 0F);

		hipsModel[364].addShapeBox(-6F, -20F, 20.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox3
		hipsModel[364].setRotationPoint(-6F, -37F, 0F);

		hipsModel[365].addShapeBox(-14F, -20F, 19.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox4
		hipsModel[365].setRotationPoint(-6F, -37F, 0F);

		hipsModel[366].addShapeBox(-14F, -14F, 19.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox5
		hipsModel[366].setRotationPoint(-6F, -37F, 0F);

		hipsModel[367].addShapeBox(-14F, -8F, 19.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox6
		hipsModel[367].setRotationPoint(-6F, -37F, 0F);

		hipsModel[368].addShapeBox(-14F, -2F, 19.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox7
		hipsModel[368].setRotationPoint(-6F, -37F, 0F);

		hipsModel[369].addShapeBox(-20.5F, -20F, 19.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox8
		hipsModel[369].setRotationPoint(-6F, -37F, 0F);

		hipsModel[370].addShapeBox(-20.5F, -2F, 19.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox9
		hipsModel[370].setRotationPoint(-6F, -37F, 0F);

		hipsModel[371].addShapeBox(-20.5F, -8F, 19.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox10
		hipsModel[371].setRotationPoint(-6F, -37F, 0F);

		hipsModel[372].addShapeBox(-20.5F, -14F, 19.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox11
		hipsModel[372].setRotationPoint(-6F, -37F, 0F);

		hipsModel[373].addShapeBox(-27F, -2F, 19.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox12
		hipsModel[373].setRotationPoint(-6F, -37F, 0F);

		hipsModel[374].addShapeBox(-27F, -14F, 19.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox13
		hipsModel[374].setRotationPoint(-6F, -37F, 0F);

		hipsModel[375].addShapeBox(-27F, -8F, 19.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox14
		hipsModel[375].setRotationPoint(-6F, -37F, 0F);

		hipsModel[376].addShapeBox(-27F, -20F, 19.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox15
		hipsModel[376].setRotationPoint(-6F, -37F, 0F);

		hipsModel[377].addShapeBox(-36F, -14F, 20.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox16
		hipsModel[377].setRotationPoint(-6F, -37F, 0F);

		hipsModel[378].addShapeBox(-36F, -20F, 20.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox17
		hipsModel[378].setRotationPoint(-6F, -37F, 0F);

		hipsModel[379].addShapeBox(-36F, -2F, 20.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox18
		hipsModel[379].setRotationPoint(-6F, -37F, 0F);

		hipsModel[380].addShapeBox(-36F, -8F, 20.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox19
		hipsModel[380].setRotationPoint(-6F, -37F, 0F);

		hipsModel[381].addShapeBox(-43F, -20F, 20.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox20
		hipsModel[381].setRotationPoint(-6F, -37F, 0F);

		hipsModel[382].addShapeBox(-43F, -2F, 20.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox23
		hipsModel[382].setRotationPoint(-6F, -37F, 0F);

		hipsModel[383].addShapeBox(-43F, -14F, 20.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox24
		hipsModel[383].setRotationPoint(-6F, -37F, 0F);

		hipsModel[384].addShapeBox(-43F, -8F, 20.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox25
		hipsModel[384].setRotationPoint(-6F, -37F, 0F);

		hipsModel[385].addShapeBox(-35F, -20F, 35.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox26
		hipsModel[385].setRotationPoint(-6F, -37F, 0F);
		hipsModel[385].rotateAngleY = 0.61086524F;

		hipsModel[386].addShapeBox(-35F, -14F, 35.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox27
		hipsModel[386].setRotationPoint(-6F, -37F, 0F);
		hipsModel[386].rotateAngleY = 0.61086524F;

		hipsModel[387].addShapeBox(-35F, -2F, 35.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox28
		hipsModel[387].setRotationPoint(-6F, -37F, 0F);
		hipsModel[387].rotateAngleY = 0.61086524F;

		hipsModel[388].addShapeBox(-35F, -8F, 35.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox29
		hipsModel[388].setRotationPoint(-6F, -37F, 0F);
		hipsModel[388].rotateAngleY = 0.61086524F;

		hipsModel[389].addShapeBox(-2F, -8F, 25F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox32
		hipsModel[389].setRotationPoint(-6F, -37F, 0F);
		hipsModel[389].rotateAngleY = -0.34906585F;

		hipsModel[390].addShapeBox(-2F, -2F, 25F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox33
		hipsModel[390].setRotationPoint(-6F, -37F, 0F);
		hipsModel[390].rotateAngleY = -0.34906585F;

		hipsModel[391].addShapeBox(-2F, -8F, -26F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox34
		hipsModel[391].setRotationPoint(-6F, -37F, 0F);
		hipsModel[391].rotateAngleY = 0.34906585F;

		hipsModel[392].addShapeBox(-2F, -2F, -26F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox35
		hipsModel[392].setRotationPoint(-6F, -37F, 0F);
		hipsModel[392].rotateAngleY = 0.34906585F;

		hipsModel[393].addShapeBox(0F, -2F, -22F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox36
		hipsModel[393].setRotationPoint(-6F, -37F, 0F);

		hipsModel[394].addShapeBox(0F, -8F, -22F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox37
		hipsModel[394].setRotationPoint(-6F, -37F, 0F);

		hipsModel[395].addShapeBox(0F, -14F, -22F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox38
		hipsModel[395].setRotationPoint(-6F, -37F, 0F);

		hipsModel[396].addShapeBox(0F, -20F, -22F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox39
		hipsModel[396].setRotationPoint(-6F, -37F, 0F);

		hipsModel[397].addShapeBox(-6F, -20F, -21.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox40
		hipsModel[397].setRotationPoint(-6F, -37F, 0F);

		hipsModel[398].addShapeBox(-6F, -14F, -21.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox41
		hipsModel[398].setRotationPoint(-6F, -37F, 0F);

		hipsModel[399].addShapeBox(-6F, -8F, -21.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox42
		hipsModel[399].setRotationPoint(-6F, -37F, 0F);

		hipsModel[400].addShapeBox(-6F, -2F, -21.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox43
		hipsModel[400].setRotationPoint(-6F, -37F, 0F);

		hipsModel[401].addShapeBox(-14F, -2F, -20.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox44
		hipsModel[401].setRotationPoint(-6F, -37F, 0F);

		hipsModel[402].addShapeBox(-14F, -8F, -20.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox45
		hipsModel[402].setRotationPoint(-6F, -37F, 0F);

		hipsModel[403].addShapeBox(-14F, -14F, -20.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox46
		hipsModel[403].setRotationPoint(-6F, -37F, 0F);

		hipsModel[404].addShapeBox(-14F, -20F, -20.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox47
		hipsModel[404].setRotationPoint(-6F, -37F, 0F);

		hipsModel[405].addShapeBox(-20.5F, -20F, -20.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox48
		hipsModel[405].setRotationPoint(-6F, -37F, 0F);

		hipsModel[406].addShapeBox(-20.5F, -14F, -20.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox49
		hipsModel[406].setRotationPoint(-6F, -37F, 0F);

		hipsModel[407].addShapeBox(-20.5F, -8F, -20.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox50
		hipsModel[407].setRotationPoint(-6F, -37F, 0F);

		hipsModel[408].addShapeBox(-20.5F, -2F, -20.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox51
		hipsModel[408].setRotationPoint(-6F, -37F, 0F);

		hipsModel[409].addShapeBox(-27F, -2F, -20.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox52
		hipsModel[409].setRotationPoint(-6F, -37F, 0F);

		hipsModel[410].addShapeBox(-27F, -8F, -20.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox53
		hipsModel[410].setRotationPoint(-6F, -37F, 0F);

		hipsModel[411].addShapeBox(-27F, -14F, -20.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox54
		hipsModel[411].setRotationPoint(-6F, -37F, 0F);

		hipsModel[412].addShapeBox(-27F, -20F, -20.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox55
		hipsModel[412].setRotationPoint(-6F, -37F, 0F);

		hipsModel[413].addShapeBox(-36F, -20F, -21.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox56
		hipsModel[413].setRotationPoint(-6F, -37F, 0F);

		hipsModel[414].addShapeBox(-36F, -14F, -21.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox57
		hipsModel[414].setRotationPoint(-6F, -37F, 0F);

		hipsModel[415].addShapeBox(-36F, -8F, -21.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox58
		hipsModel[415].setRotationPoint(-6F, -37F, 0F);

		hipsModel[416].addShapeBox(-36F, -2F, -21.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox59
		hipsModel[416].setRotationPoint(-6F, -37F, 0F);

		hipsModel[417].addShapeBox(-43F, -2F, -21.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox60
		hipsModel[417].setRotationPoint(-6F, -37F, 0F);

		hipsModel[418].addShapeBox(-43F, -8F, -21.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox61
		hipsModel[418].setRotationPoint(-6F, -37F, 0F);

		hipsModel[419].addShapeBox(-43F, -14F, -21.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox62
		hipsModel[419].setRotationPoint(-6F, -37F, 0F);

		hipsModel[420].addShapeBox(-43F, -20F, -21.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox63
		hipsModel[420].setRotationPoint(-6F, -37F, 0F);

		hipsModel[421].addShapeBox(-35F, -2F, -36.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox64
		hipsModel[421].setRotationPoint(-6F, -37F, 0F);
		hipsModel[421].rotateAngleY = -0.61086524F;

		hipsModel[422].addShapeBox(-35F, -8F, -36.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox65
		hipsModel[422].setRotationPoint(-6F, -37F, 0F);
		hipsModel[422].rotateAngleY = -0.61086524F;

		hipsModel[423].addShapeBox(-35F, -14F, -36.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox66
		hipsModel[423].setRotationPoint(-6F, -37F, 0F);
		hipsModel[423].rotateAngleY = -0.61086524F;

		hipsModel[424].addShapeBox(-35F, -20F, -36.5F, 30, 30, 1, 0F,-13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F, -13F, -13F, 0F); // Import ImportBox67
		hipsModel[424].setRotationPoint(-6F, -37F, 0F);
		hipsModel[424].rotateAngleY = -0.61086524F;

		hipsModel[425].addShapeBox(0F, 0F, 0F, 9, 6, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox50
		hipsModel[425].setRotationPoint(35F, -54F, 0F);

		hipsModel[426].addShapeBox(0F, -4F, 0F, 8, 4, 3, 0F,0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox52
		hipsModel[426].setRotationPoint(35F, -54F, 0F);

		hipsModel[427].addShapeBox(-14F, -7F, 0F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox53
		hipsModel[427].setRotationPoint(35F, -54F, 0F);

		hipsModel[428].addShapeBox(-1F, -7F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportBox54
		hipsModel[428].setRotationPoint(35F, -54F, 0F);

		hipsModel[429].addShapeBox(-17F, -7F, 0F, 3, 19, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox59
		hipsModel[429].setRotationPoint(35F, -54F, 0F);

		hipsModel[430].addShapeBox(0F, 6F, 0F, 10, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox60
		hipsModel[430].setRotationPoint(35F, -54F, 0F);

		hipsModel[431].addShapeBox(0F, 12F, 0F, 11, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox62
		hipsModel[431].setRotationPoint(35F, -54F, 0F);

		hipsModel[432].addShapeBox(3F, 16F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox64
		hipsModel[432].setRotationPoint(35F, -54F, 0F);

		hipsModel[433].addShapeBox(-2F, 16F, 0F, 5, 3, 6, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox65
		hipsModel[433].setRotationPoint(35F, -54F, 0F);

		hipsModel[434].addShapeBox(3F, 19F, 0F, 7, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox66
		hipsModel[434].setRotationPoint(35F, -54F, 0F);

		hipsModel[435].addShapeBox(-14F, -7F, 3F, 13, 3, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox73
		hipsModel[435].setRotationPoint(35F, -54F, 0F);

		hipsModel[436].addShapeBox(-17F, -7F, 3F, 3, 19, 4, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox74
		hipsModel[436].setRotationPoint(35F, -54F, 0F);

		hipsModel[437].addShapeBox(-14F, 12F, 7F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F); // Import ImportBox75
		hipsModel[437].setRotationPoint(35F, -54F, 0F);

		hipsModel[438].addShapeBox(-7F, 12F, 7F, 6, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F); // Import ImportBox76
		hipsModel[438].setRotationPoint(35F, -54F, 0F);

		hipsModel[439].addShapeBox(-14F, 6F, 7F, 13, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox77
		hipsModel[439].setRotationPoint(35F, -54F, 0F);

		hipsModel[440].addShapeBox(-14F, 0F, 7F, 13, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import ImportBox78
		hipsModel[440].setRotationPoint(35F, -54F, 0F);

		hipsModel[441].addShapeBox(-14F, -4F, 7F, 13, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox79
		hipsModel[441].setRotationPoint(35F, -54F, 0F);

		hipsModel[442].addShapeBox(-14F, -6F, 7F, 13, 2, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Import ImportBox80
		hipsModel[442].setRotationPoint(35F, -54F, 0F);

		hipsModel[443].addShapeBox(-17F, -6F, 7F, 3, 18, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox81
		hipsModel[443].setRotationPoint(35F, -54F, 0F);

		hipsModel[444].addShapeBox(-1F, -7F, 3F, 7, 3, 4, 0F,0F, 0F, 0F, -3F, -1F, 0F, -3F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import ImportBox82
		hipsModel[444].setRotationPoint(35F, -54F, 0F);

		hipsModel[445].addShapeBox(0F, -4F, 3F, 8, 4, 4, 0F,0F, 0F, 0F, -2F, -1F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox83
		hipsModel[445].setRotationPoint(35F, -54F, 0F);

		hipsModel[446].addShapeBox(0F, 0F, 3F, 9, 6, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox84
		hipsModel[446].setRotationPoint(35F, -54F, 0F);

		hipsModel[447].addShapeBox(0F, 6F, 3F, 10, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox85
		hipsModel[447].setRotationPoint(35F, -54F, 0F);

		hipsModel[448].addShapeBox(0F, 12F, 3F, 11, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox86
		hipsModel[448].setRotationPoint(35F, -54F, 0F);

		hipsModel[449].addShapeBox(3F, 16F, 3F, 8, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox87
		hipsModel[449].setRotationPoint(35F, -54F, 0F);

		hipsModel[450].addShapeBox(-1F, -5F, 7F, 6, 3, 2, 0F,0F, 1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox89
		hipsModel[450].setRotationPoint(35F, -54F, 0F);

		hipsModel[451].addShapeBox(0F, 0F, 7F, 7, 6, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox90
		hipsModel[451].setRotationPoint(35F, -54F, 0F);

		hipsModel[452].addShapeBox(0F, 6F, 7F, 8, 6, 2, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox91
		hipsModel[452].setRotationPoint(35F, -54F, 0F);

		hipsModel[453].addShapeBox(0F, 12F, 7F, 9, 4, 2, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox92
		hipsModel[453].setRotationPoint(35F, -54F, 0F);

		hipsModel[454].addShapeBox(0F, -2F, 7F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox93
		hipsModel[454].setRotationPoint(35F, -54F, 0F);

		hipsModel[455].addShapeBox(-1F, 12F, 9F, 8, 4, 2, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import ImportBox94
		hipsModel[455].setRotationPoint(35F, -54F, 0F);

		hipsModel[456].addShapeBox(-1F, 6F, 9F, 6, 6, 1, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox95
		hipsModel[456].setRotationPoint(35F, -54F, 0F);

		hipsModel[457].addShapeBox(-1F, 0F, 9F, 6, 6, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F); // Import ImportBox96
		hipsModel[457].setRotationPoint(35F, -54F, 0F);

		hipsModel[458].addShapeBox(-1F, -2F, 9F, 5, 2, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox97
		hipsModel[458].setRotationPoint(35F, -54F, 0F);

		hipsModel[459].addShapeBox(-1F, -5F, 9F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox98
		hipsModel[459].setRotationPoint(35F, -54F, 0F);

		hipsModel[460].addShapeBox(-6F, -5F, 7F, 2, 18, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 1F, 0F, 5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F); // Import ImportBox99
		hipsModel[460].setRotationPoint(35F, -54F, 0F);

		hipsModel[461].addShapeBox(-11F, -6F, 13F, 2, 19, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Import ImportBox100
		hipsModel[461].setRotationPoint(35F, -54F, 0F);

		hipsModel[462].addShapeBox(8F, 16F, 7F, 1, 3, 2, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 2F, 3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import ImportBox103
		hipsModel[462].setRotationPoint(35F, -54F, 0F);

		hipsModel[463].addShapeBox(3F, 16F, 9F, 4, 3, 2, 0F,4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -1F, 0F, 1F, 1F, 2F, 1F, 0F, -1F, 0F, -.5F, 0F, 1F, -1.5F); // Import ImportBox104
		hipsModel[463].setRotationPoint(35F, -54F, 0F);

		hipsModel[464].addShapeBox(-1F, 16F, 6F, 4, 3, 3, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox107
		hipsModel[464].setRotationPoint(35F, -54F, 0F);

		hipsModel[465].addShapeBox(4F, 19F, 6F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		hipsModel[465].setRotationPoint(35F, -54F, 0F);

		hipsModel[466].addShapeBox(2F, 19F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox1
		hipsModel[466].setRotationPoint(35F, -54F, 0F);

		hipsModel[467].addShapeBox(2F, 19F, 6F, 1, 2, 3, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 1.5F, 0F, 1F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox3
		hipsModel[467].setRotationPoint(35F, -54F, 0F);

		hipsModel[468].addShapeBox(3F, 19F, 9F, 3, 2, 1, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, -1F); // Import ImportBox4
		hipsModel[468].setRotationPoint(35F, -54F, 0F);

		hipsModel[469].addShapeBox(4F, 19F, 7F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox5
		hipsModel[469].setRotationPoint(35F, -54F, 0F);

		hipsModel[470].addShapeBox(3F, 23F, 0F, 7, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -2F, 0F, 0F, -2F); // Import ImportBox6
		hipsModel[470].setRotationPoint(35F, -54F, 0F);

		hipsModel[471].addShapeBox(3F, 23F, 4F, 7, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -.5F, 0F, 2F, -2F, 0F, -2F, -2F, 0F, -2F); // Import ImportBox7
		hipsModel[471].setRotationPoint(35F, -54F, 0F);

		hipsModel[472].addShapeBox(3F, 27F, 0F, 7, 7, 2, 0F,0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -2F, -1.5F, 0F, -2F); // Import ImportBox9
		hipsModel[472].setRotationPoint(35F, -54F, 0F);

		hipsModel[473].addShapeBox(3F, 27F, 2F, 7, 7, 2, 0F,0F, 0F, 0F, -.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 2F, -1.5F, 0F, 2F, -3.5F, 0F, -2F, -3.5F, 0F, -2F); // Import ImportBox10
		hipsModel[473].setRotationPoint(35F, -54F, 0F);

		hipsModel[474].addShapeBox(4.5F, 21F, 7F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -2F, 0F, 0F); // Import ImportBox11
		hipsModel[474].setRotationPoint(35F, -54F, 0F);

		hipsModel[475].addShapeBox(4.5F, 21F, 8F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F, 0F, -.5F, 0F, -3F, -.5F, 0F); // Import ImportBox14
		hipsModel[475].setRotationPoint(35F, -54F, 0F);

		hipsModel[476].addShapeBox(8.5F, 25F, 7F, 2, 2, 1, 0F,0F, 1F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 1F, 0F, 2F, -2F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 2F, -2F, 0F); // Import ImportBox18
		hipsModel[476].setRotationPoint(35F, -54F, 0F);

		hipsModel[477].addShapeBox(8.5F, 25F, 8F, 2, 2, 1, 0F,0F, 1F, 0F, 0F, 0F, .5F, 0F, -1F, -.5F, 1F, .5F, 0F, 2F, -2F, 0F, 0F, 0F, .5F, 0F, -1F, -.5F, 1F, -2.5F, 0F); // Import ImportBox19
		hipsModel[477].setRotationPoint(35F, -54F, 0F);

		hipsModel[478].addShapeBox(10.5F, 25F, 7.5F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -1F, 0F); // Import ImportBox23
		hipsModel[478].setRotationPoint(35F, -54F, 0F);

		hipsModel[479].addShapeBox(8.5F, 25F, 6F, 2, 2, 1, 0F,1F, 0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 1F, -2.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0.5F, 2F, -2F, 0F); // Import ImportBox1
		hipsModel[479].setRotationPoint(35F, -54F, 0F);

		hipsModel[480].addShapeBox(10.5F, 25F, 6.5F, 5, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F); // Import ImportBox2
		hipsModel[480].setRotationPoint(35F, -54F, 0F);

		hipsModel[481].addShapeBox(4.5F, 21F, 6F, 3, 4, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, -2F, 0F, 0F); // Import ImportBox3
		hipsModel[481].setRotationPoint(35F, -54F, 0F);

		hipsModel[482].addShapeBox(-10F, -4F, 10F, 26, 26, 1, 0F,-10F, -10F, -.8F, -10F, -10F, .9F, -10F, -10F, -.9F, -10F, -10F, .8F, -10F, -10F, -.5F, -10F, -10F, .9F, -10F, -10F, -.9F, -10F, -10F, .5F); // Import ImportEye
		hipsModel[482].setRotationPoint(35F, -54F, 0F);

		hipsModel[483].addShapeBox(4.5F, 34F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox7
		hipsModel[483].setRotationPoint(35F, -54F, 0F);

		hipsModel[484].addShapeBox(4.5F, 38F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox9
		hipsModel[484].setRotationPoint(35F, -54F, 0F);

		hipsModel[485].addShapeBox(6.5F, 42F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -7F, 2F, 0F, 3F, -2F, 0F, 3F, 0F, 0F, -7F, 0F, 0F); // Import ImportBox10
		hipsModel[485].setRotationPoint(35F, -54F, 0F);

		hipsModel[486].addShapeBox(13.5F, 44F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Import ImportBox12
		hipsModel[486].setRotationPoint(35F, -54F, 0F);

		hipsModel[487].addShapeBox(17.5F, 44F, -1F, 4, 4, 2, 0F,0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Import ImportBox13
		hipsModel[487].setRotationPoint(35F, -54F, 0F);

		hipsModel[488].addShapeBox(17.5F, 44F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, 1F, 0F, -2F, 0F); // Import ImportBox14
		hipsModel[488].setRotationPoint(35F, -54F, 0F);

		hipsModel[489].addShapeBox(-6F, 13F, 7F, 2, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -5F, 0F, 0F, 5F, 0F, 0F); // Import ImportBox15
		hipsModel[489].setRotationPoint(35F, -54F, 0F);

		hipsModel[490].addShapeBox(-11F, 13F, 13F, 2, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 3F, -1F, 0F); // Import ImportBox16
		hipsModel[490].setRotationPoint(35F, -54F, 0F);

		hipsModel[491].addShapeBox(-14F, 13F, 16F, 2, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -4F, 0F, 7F, -4F, 0F); // Import ImportBox17
		hipsModel[491].setRotationPoint(35F, -54F, 0F);

		hipsModel[492].addShapeBox(-14F, -6F, 16F, 2, 19, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Import ImportBox18
		hipsModel[492].setRotationPoint(35F, -54F, 0F);

		hipsModel[493].addShapeBox(-21F, -5F, 24F, 2, 18, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Import ImportBox19
		hipsModel[493].setRotationPoint(35F, -54F, 0F);

		hipsModel[494].addShapeBox(-21F, 13F, 24F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, 3F, -4F, 0F); // Import ImportBox20
		hipsModel[494].setRotationPoint(35F, -54F, 0F);

		hipsModel[495].addShapeBox(-24F, -3F, 27F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 1F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, 1F, -5F, -1F); // Import ImportBox21
		hipsModel[495].setRotationPoint(35F, -54F, 0F);

		hipsModel[496].addShapeBox(-17F, -7F, -3F, 3, 19, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox24
		hipsModel[496].setRotationPoint(35F, -54F, 0F);

		hipsModel[497].addShapeBox(-14F, -7F, -3F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox25
		hipsModel[497].setRotationPoint(35F, -54F, 0F);

		hipsModel[498].addShapeBox(3F, 19F, -6F, 7, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox32
		hipsModel[498].setRotationPoint(35F, -54F, 0F);

		hipsModel[499].addShapeBox(-2F, 16F, -6F, 5, 3, 6, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox33
		hipsModel[499].setRotationPoint(35F, -54F, 0F);
	}

	private void inithipsModel_2()
	{
		hipsModel[500] = new ModelRendererTurbo(this, 41, 337, textureX, textureY); // Import ImportBox34
		hipsModel[501] = new ModelRendererTurbo(this, 42, 271, textureX, textureY); // Import ImportBox35
		hipsModel[502] = new ModelRendererTurbo(this, 42, 283, textureX, textureY); // Import ImportBox36
		hipsModel[503] = new ModelRendererTurbo(this, 42, 294, textureX, textureY); // Import ImportBox37
		hipsModel[504] = new ModelRendererTurbo(this, 42, 294, textureX, textureY); // Import ImportBox38
		hipsModel[505] = new ModelRendererTurbo(this, 42, 294, textureX, textureY); // Import ImportBox39
		hipsModel[506] = new ModelRendererTurbo(this, 42, 294, textureX, textureY); // Import ImportBox40
		hipsModel[507] = new ModelRendererTurbo(this, 38, 322, textureX, textureY); // Import ImportBox42
		hipsModel[508] = new ModelRendererTurbo(this, 38, 312, textureX, textureY); // Import ImportBox43
		hipsModel[509] = new ModelRendererTurbo(this, 35, 0, textureX, textureY); // Import ImportBox44
		hipsModel[510] = new ModelRendererTurbo(this, 89, 319, textureX, textureY); // Import ImportBox45
		hipsModel[511] = new ModelRendererTurbo(this, 89, 313, textureX, textureY); // Import ImportBox46
		hipsModel[512] = new ModelRendererTurbo(this, 78, 319, textureX, textureY); // Import ImportBox47
		hipsModel[513] = new ModelRendererTurbo(this, 64, 340, textureX, textureY); // Import ImportBox48
		hipsModel[514] = new ModelRendererTurbo(this, 82, 256, textureX, textureY); // Import ImportBox57
		hipsModel[515] = new ModelRendererTurbo(this, 22, 249, textureX, textureY); // Import ImportBox58
		hipsModel[516] = new ModelRendererTurbo(this, 110, 307, textureX, textureY); // Import ImportBox61
		hipsModel[517] = new ModelRendererTurbo(this, 122, 266, textureX, textureY); // Import ImportBox63
		hipsModel[518] = new ModelRendererTurbo(this, 122, 266, textureX, textureY); // Import ImportBox64
		hipsModel[519] = new ModelRendererTurbo(this, 122, 266, textureX, textureY); // Import ImportBox65
		hipsModel[520] = new ModelRendererTurbo(this, 62, 297, textureX, textureY); // Import ImportBox66
		hipsModel[521] = new ModelRendererTurbo(this, 62, 303, textureX, textureY); // Import ImportBox67
		hipsModel[522] = new ModelRendererTurbo(this, 62, 309, textureX, textureY); // Import ImportBox68
		hipsModel[523] = new ModelRendererTurbo(this, 62, 318, textureX, textureY); // Import ImportBox69
		hipsModel[524] = new ModelRendererTurbo(this, 78, 306, textureX, textureY); // Import ImportBox70
		hipsModel[525] = new ModelRendererTurbo(this, 78, 314, textureX, textureY); // Import ImportBox71
		hipsModel[526] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Import ImportBox72
		hipsModel[527] = new ModelRendererTurbo(this, 83, 243, textureX, textureY); // Import ImportBox78
		hipsModel[528] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Import ImportBox79
		hipsModel[529] = new ModelRendererTurbo(this, 89, 345, textureX, textureY); // Import ImportBox80
		hipsModel[530] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Import ImportBox81
		hipsModel[531] = new ModelRendererTurbo(this, 89, 340, textureX, textureY); // Import ImportBox82
		hipsModel[532] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Import ImportBox83
		hipsModel[533] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Import ImportBox84
		hipsModel[534] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Import ImportBox85
		hipsModel[535] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Import ImportBox86
		hipsModel[536] = new ModelRendererTurbo(this, 7, 397, textureX, textureY); // Import ImportBox87
		hipsModel[537] = new ModelRendererTurbo(this, 29, 397, textureX, textureY); // Import ImportBox88
		hipsModel[538] = new ModelRendererTurbo(this, 43, 397, textureX, textureY); // Import ImportBox89
		hipsModel[539] = new ModelRendererTurbo(this, 68, 397, textureX, textureY); // Import ImportBox90
		hipsModel[540] = new ModelRendererTurbo(this, 84, 397, textureX, textureY); // Import ImportBox91
		hipsModel[541] = new ModelRendererTurbo(this, 7, 428, textureX, textureY); // Import ImportBox92
		hipsModel[542] = new ModelRendererTurbo(this, 29, 428, textureX, textureY); // Import ImportBox93
		hipsModel[543] = new ModelRendererTurbo(this, 43, 428, textureX, textureY); // Import ImportBox94
		hipsModel[544] = new ModelRendererTurbo(this, 68, 428, textureX, textureY); // Import ImportBox95
		hipsModel[545] = new ModelRendererTurbo(this, 83, 6, textureX, textureY); // Import ImportBox96
		hipsModel[546] = new ModelRendererTurbo(this, 64, 331, textureX, textureY); // Import ImportBox0
		hipsModel[547] = new ModelRendererTurbo(this, 351, 347, textureX, textureY); // Import ImportBox0
		hipsModel[548] = new ModelRendererTurbo(this, 320, 275, textureX, textureY); // Import ImportBox1
		hipsModel[549] = new ModelRendererTurbo(this, 285, 276, textureX, textureY); // Import ImportBox2
		hipsModel[550] = new ModelRendererTurbo(this, 358, 263, textureX, textureY); // Import ImportBox3
		hipsModel[551] = new ModelRendererTurbo(this, 385, 302, textureX, textureY); // Import ImportBox6
		hipsModel[552] = new ModelRendererTurbo(this, 384, 319, textureX, textureY); // Import ImportBox7
		hipsModel[553] = new ModelRendererTurbo(this, 382, 306, textureX, textureY); // Import ImportBox11
		hipsModel[554] = new ModelRendererTurbo(this, 396, 306, textureX, textureY); // Import ImportBox13
		hipsModel[555] = new ModelRendererTurbo(this, 382, 313, textureX, textureY); // Import ImportBox0
		hipsModel[556] = new ModelRendererTurbo(this, 396, 313, textureX, textureY); // Import ImportBox1
		hipsModel[557] = new ModelRendererTurbo(this, 406, 282, textureX, textureY); // Import ImportBox2
		hipsModel[558] = new ModelRendererTurbo(this, 407, 273, textureX, textureY); // Import ImportBox3
		hipsModel[559] = new ModelRendererTurbo(this, 384, 266, textureX, textureY); // Import ImportBox4
		hipsModel[560] = new ModelRendererTurbo(this, 284, 354, textureX, textureY); // Import ImportBox0
		hipsModel[561] = new ModelRendererTurbo(this, 285, 367, textureX, textureY); // Import ImportBox1
		hipsModel[562] = new ModelRendererTurbo(this, 351, 353, textureX, textureY); // Import ImportBox2
		hipsModel[563] = new ModelRendererTurbo(this, 349, 359, textureX, textureY); // Import ImportBox0
		hipsModel[564] = new ModelRendererTurbo(this, 289, 380, textureX, textureY); // Import ImportBox1
		hipsModel[565] = new ModelRendererTurbo(this, 289, 393, textureX, textureY); // Import ImportBox2
		hipsModel[566] = new ModelRendererTurbo(this, 297, 390, textureX, textureY); // Import ImportBox3
		hipsModel[567] = new ModelRendererTurbo(this, 285, 268, textureX, textureY); // Import ImportBox4
		hipsModel[568] = new ModelRendererTurbo(this, 318, 265, textureX, textureY); // Import ImportBox5
		hipsModel[569] = new ModelRendererTurbo(this, 29, 456, textureX, textureY); // Import ImportBox2
		hipsModel[570] = new ModelRendererTurbo(this, 51, 456, textureX, textureY); // Import ImportBox3
		hipsModel[571] = new ModelRendererTurbo(this, 65, 456, textureX, textureY); // Import ImportBox4
		hipsModel[572] = new ModelRendererTurbo(this, 29, 456, textureX, textureY); // Import ImportBox15
		hipsModel[573] = new ModelRendererTurbo(this, 51, 456, textureX, textureY); // Import ImportBox16
		hipsModel[574] = new ModelRendererTurbo(this, 65, 456, textureX, textureY); // Import ImportBox17
		hipsModel[575] = new ModelRendererTurbo(this, 284, 340, textureX, textureY); // Import ImportBox4
		hipsModel[576] = new ModelRendererTurbo(this, 284, 329, textureX, textureY); // Import ImportBox5
		hipsModel[577] = new ModelRendererTurbo(this, 284, 316, textureX, textureY); // Import ImportBox6
		hipsModel[578] = new ModelRendererTurbo(this, 284, 304, textureX, textureY); // Import ImportBox7
		hipsModel[579] = new ModelRendererTurbo(this, 284, 294, textureX, textureY); // Import ImportBox8
		hipsModel[580] = new ModelRendererTurbo(this, 284, 284, textureX, textureY); // Import ImportBox9
		hipsModel[581] = new ModelRendererTurbo(this, 285, 276, textureX, textureY); // Import ImportBox10
		hipsModel[582] = new ModelRendererTurbo(this, 285, 268, textureX, textureY); // Import ImportBox11
		hipsModel[583] = new ModelRendererTurbo(this, 317, 339, textureX, textureY); // Import ImportBox12
		hipsModel[584] = new ModelRendererTurbo(this, 319, 327, textureX, textureY); // Import ImportBox13
		hipsModel[585] = new ModelRendererTurbo(this, 320, 315, textureX, textureY); // Import ImportBox14
		hipsModel[586] = new ModelRendererTurbo(this, 320, 303, textureX, textureY); // Import ImportBox15
		hipsModel[587] = new ModelRendererTurbo(this, 320, 293, textureX, textureY); // Import ImportBox16
		hipsModel[588] = new ModelRendererTurbo(this, 320, 284, textureX, textureY); // Import ImportBox17
		hipsModel[589] = new ModelRendererTurbo(this, 320, 275, textureX, textureY); // Import ImportBox18
		hipsModel[590] = new ModelRendererTurbo(this, 318, 265, textureX, textureY); // Import ImportBox19
		hipsModel[591] = new ModelRendererTurbo(this, 359, 322, textureX, textureY); // Import ImportBox20
		hipsModel[592] = new ModelRendererTurbo(this, 358, 312, textureX, textureY); // Import ImportBox21
		hipsModel[593] = new ModelRendererTurbo(this, 357, 301, textureX, textureY); // Import ImportBox22
		hipsModel[594] = new ModelRendererTurbo(this, 358, 291, textureX, textureY); // Import ImportBox23
		hipsModel[595] = new ModelRendererTurbo(this, 359, 285, textureX, textureY); // Import ImportBox24
		hipsModel[596] = new ModelRendererTurbo(this, 358, 277, textureX, textureY); // Import ImportBox25
		hipsModel[597] = new ModelRendererTurbo(this, 358, 263, textureX, textureY); // Import ImportBox26
		hipsModel[598] = new ModelRendererTurbo(this, 284, 354, textureX, textureY); // Import ImportBox27
		hipsModel[599] = new ModelRendererTurbo(this, 285, 367, textureX, textureY); // Import ImportBox28
		hipsModel[600] = new ModelRendererTurbo(this, 289, 380, textureX, textureY); // Import ImportBox29
		hipsModel[601] = new ModelRendererTurbo(this, 289, 393, textureX, textureY); // Import ImportBox30
		hipsModel[602] = new ModelRendererTurbo(this, 297, 390, textureX, textureY); // Import ImportBox31
		hipsModel[603] = new ModelRendererTurbo(this, 385, 292, textureX, textureY); // Import ImportBox0
		hipsModel[604] = new ModelRendererTurbo(this, 386, 287, textureX, textureY); // Import ImportBox1
		hipsModel[605] = new ModelRendererTurbo(this, 385, 280, textureX, textureY); // Import ImportBox2
		hipsModel[606] = new ModelRendererTurbo(this, 385, 302, textureX, textureY); // Import ImportBox3
		hipsModel[607] = new ModelRendererTurbo(this, 396, 306, textureX, textureY); // Import ImportBox4
		hipsModel[608] = new ModelRendererTurbo(this, 396, 313, textureX, textureY); // Import ImportBox5
		hipsModel[609] = new ModelRendererTurbo(this, 382, 306, textureX, textureY); // Import ImportBox6
		hipsModel[610] = new ModelRendererTurbo(this, 382, 313, textureX, textureY); // Import ImportBox7
		hipsModel[611] = new ModelRendererTurbo(this, 384, 319, textureX, textureY); // Import ImportBox8
		hipsModel[612] = new ModelRendererTurbo(this, 383, 324, textureX, textureY); // Import ImportBox9
		hipsModel[613] = new ModelRendererTurbo(this, 368, 322, textureX, textureY); // Import ImportBox10
		hipsModel[614] = new ModelRendererTurbo(this, 384, 266, textureX, textureY); // Import ImportBox11
		hipsModel[615] = new ModelRendererTurbo(this, 407, 273, textureX, textureY); // Import ImportBox12
		hipsModel[616] = new ModelRendererTurbo(this, 406, 282, textureX, textureY); // Import ImportBox13
		hipsModel[617] = new ModelRendererTurbo(this, 404, 292, textureX, textureY); // Import ImportBox14
		hipsModel[618] = new ModelRendererTurbo(this, 29, 456, textureX, textureY); // Import ImportBox0
		hipsModel[619] = new ModelRendererTurbo(this, 29, 456, textureX, textureY); // Import ImportBox1
		hipsModel[620] = new ModelRendererTurbo(this, 51, 456, textureX, textureY); // Import ImportBox2
		hipsModel[621] = new ModelRendererTurbo(this, 51, 456, textureX, textureY); // Import ImportBox3
		hipsModel[622] = new ModelRendererTurbo(this, 65, 456, textureX, textureY); // Import ImportBox4
		hipsModel[623] = new ModelRendererTurbo(this, 65, 456, textureX, textureY); // Import ImportBox5
		hipsModel[624] = new ModelRendererTurbo(this, 351, 347, textureX, textureY); // Import ImportBox6
		hipsModel[625] = new ModelRendererTurbo(this, 351, 353, textureX, textureY); // Import ImportBox7
		hipsModel[626] = new ModelRendererTurbo(this, 349, 359, textureX, textureY); // Import ImportBox8
		hipsModel[627] = new ModelRendererTurbo(this, 170, 60, textureX, textureY); // Import ImportBox97

		hipsModel[500].addShapeBox(2F, 19F, -6F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox34
		hipsModel[500].setRotationPoint(35F, -54F, 0F);

		hipsModel[501].addShapeBox(3F, 23F, -4F, 7, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox35
		hipsModel[501].setRotationPoint(35F, -54F, 0F);

		hipsModel[502].addShapeBox(3F, 27F, -2F, 7, 7, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -2F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Import ImportBox36
		hipsModel[502].setRotationPoint(35F, -54F, 0F);

		hipsModel[503].addShapeBox(4.5F, 34F, -2F, 4, 4, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox37
		hipsModel[503].setRotationPoint(35F, -54F, 0F);

		hipsModel[504].addShapeBox(4.5F, 38F, -2F, 4, 4, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox38
		hipsModel[504].setRotationPoint(35F, -54F, 0F);

		hipsModel[505].addShapeBox(6.5F, 42F, -2F, 4, 4, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 3F, 0F, 0F, 3F, -2F, 0F, -7F, 2F, 0F); // Import ImportBox39
		hipsModel[505].setRotationPoint(35F, -54F, 0F);

		hipsModel[506].addShapeBox(13.5F, 44F, -2F, 4, 4, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox40
		hipsModel[506].setRotationPoint(35F, -54F, 0F);

		hipsModel[507].addShapeBox(3F, 27F, -4F, 7, 7, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -2F, -3.5F, 0F, -2F, -1.5F, 0F, 2F, -1.5F, 0F, 2F); // Import ImportBox42
		hipsModel[507].setRotationPoint(35F, -54F, 0F);

		hipsModel[508].addShapeBox(3F, 23F, -6F, 7, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -0.5F, 0F, 2F, 0F, 0F, 2F); // Import ImportBox43
		hipsModel[508].setRotationPoint(35F, -54F, 0F);

		hipsModel[509].addShapeBox(17.5F, 44F, -2F, 4, 4, 2, 0F,0F, -2F, 0F, 0F, -1F, 1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 1F, 0F, -1F, -1F, 0F, 0F, 0F); // Import ImportBox44
		hipsModel[509].setRotationPoint(35F, -54F, 0F);

		hipsModel[510].addShapeBox(4F, 19F, -7F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox45
		hipsModel[510].setRotationPoint(35F, -54F, 0F);

		hipsModel[511].addShapeBox(4F, 19F, -9F, 6, 2, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import ImportBox46
		hipsModel[511].setRotationPoint(35F, -54F, 0F);

		hipsModel[512].addShapeBox(3F, 19F, -10F, 3, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, -1F, 0F, 2F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox47
		hipsModel[512].setRotationPoint(35F, -54F, 0F);

		hipsModel[513].addShapeBox(2F, 19F, -9F, 1, 2, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 1.5F, 0F, -1F, 0F, 0F); // Import ImportBox48
		hipsModel[513].setRotationPoint(35F, -54F, 0F);

		hipsModel[514].addShapeBox(-14F, -6F, -11F, 13, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox57
		hipsModel[514].setRotationPoint(35F, -54F, 0F);

		hipsModel[515].addShapeBox(-17F, -6F, -11F, 3, 18, 4, 0F,0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox58
		hipsModel[515].setRotationPoint(35F, -54F, 0F);

		hipsModel[516].addShapeBox(-14F, 12F, -11F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F); // Import ImportBox61
		hipsModel[516].setRotationPoint(35F, -54F, 0F);

		hipsModel[517].addShapeBox(-14F, 6F, -11F, 13, 6, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox63
		hipsModel[517].setRotationPoint(35F, -54F, 0F);

		hipsModel[518].addShapeBox(-14F, 0F, -11F, 13, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox64
		hipsModel[518].setRotationPoint(35F, -54F, 0F);

		hipsModel[519].addShapeBox(-14F, -4F, -11F, 13, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox65
		hipsModel[519].setRotationPoint(35F, -54F, 0F);

		hipsModel[520].addShapeBox(-1F, -4F, -10F, 3, 2, 1, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox66
		hipsModel[520].setRotationPoint(35F, -54F, 0F);

		hipsModel[521].addShapeBox(-1F, -2F, -10F, 4, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox67
		hipsModel[521].setRotationPoint(35F, -54F, 0F);

		hipsModel[522].addShapeBox(-1F, 0F, -10F, 5, 6, 1, 0F,0F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox68
		hipsModel[522].setRotationPoint(35F, -54F, 0F);

		hipsModel[523].addShapeBox(-1F, 6F, -10F, 6, 6, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox69
		hipsModel[523].setRotationPoint(35F, -54F, 0F);

		hipsModel[524].addShapeBox(-1F, 12F, -10F, 7, 4, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox70
		hipsModel[524].setRotationPoint(35F, -54F, 0F);

		hipsModel[525].addShapeBox(3F, 16F, -10F, 3, 3, 1, 0F,4F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox71
		hipsModel[525].setRotationPoint(35F, -54F, 0F);

		hipsModel[526].addShapeBox(-17F, -7F, -7F, 3, 19, 4, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox72
		hipsModel[526].setRotationPoint(35F, -54F, 0F);

		hipsModel[527].addShapeBox(-14F, -7F, -7F, 13, 3, 4, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox78
		hipsModel[527].setRotationPoint(35F, -54F, 0F);

		hipsModel[528].addShapeBox(4.5F, 21F, -9F, 3, 4, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, -2F, 0F, 0F); // Import ImportBox79
		hipsModel[528].setRotationPoint(35F, -54F, 0F);

		hipsModel[529].addShapeBox(4.5F, 21F, -8F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -2F, 0F, 0F); // Import ImportBox80
		hipsModel[529].setRotationPoint(35F, -54F, 0F);

		hipsModel[530].addShapeBox(4.5F, 21F, -7F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F, 0F, -.5F, 0F, -3F, -.5F, 0F); // Import ImportBox81
		hipsModel[530].setRotationPoint(35F, -54F, 0F);

		hipsModel[531].addShapeBox(8.5F, 25F, -8F, 2, 2, 1, 0F,0F, 1F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 1F, 0F, 2F, -2F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 2F, -2F, 0F); // Import ImportBox82
		hipsModel[531].setRotationPoint(35F, -54F, 0F);

		hipsModel[532].addShapeBox(8.5F, 25F, -9F, 2, 2, 1, 0F,1F, 0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 1F, -2.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0.5F, 2F, -2F, 0F); // Import ImportBox83
		hipsModel[532].setRotationPoint(35F, -54F, 0F);

		hipsModel[533].addShapeBox(8.5F, 25F, -7F, 2, 2, 1, 0F,0F, 1F, 0F, 0F, 0F, .5F, 0F, -1F, -.5F, 1F, .5F, 0F, 2F, -2F, 0F, 0F, 0F, .5F, 0F, -1F, -.5F, 1F, -2.5F, 0F); // Import ImportBox84
		hipsModel[533].setRotationPoint(35F, -54F, 0F);

		hipsModel[534].addShapeBox(10.5F, 25F, -8.5F, 5, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F); // Import ImportBox85
		hipsModel[534].setRotationPoint(35F, -54F, 0F);

		hipsModel[535].addShapeBox(10.5F, 25F, -7.5F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -1F, 0F); // Import ImportBox86
		hipsModel[535].setRotationPoint(35F, -54F, 0F);

		hipsModel[536].addShapeBox(-6F, -5F, -13F, 2, 18, 6, 0F,5F, 1F, 0F, -5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox87
		hipsModel[536].setRotationPoint(35F, -54F, 0F);

		hipsModel[537].addShapeBox(-11F, -6F, -16F, 2, 19, 3, 0F,3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox88
		hipsModel[537].setRotationPoint(35F, -54F, 0F);

		hipsModel[538].addShapeBox(-14F, -6F, -24F, 2, 19, 8, 0F,7F, -1F, 0F, -7F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox89
		hipsModel[538].setRotationPoint(35F, -54F, 0F);

		hipsModel[539].addShapeBox(-21F, -5F, -27F, 2, 18, 3, 0F,3F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox90
		hipsModel[539].setRotationPoint(35F, -54F, 0F);

		hipsModel[540].addShapeBox(-24F, -3F, -29F, 2, 16, 2, 0F,1F, -3F, -1F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, -1F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox91
		hipsModel[540].setRotationPoint(35F, -54F, 0F);

		hipsModel[541].addShapeBox(-6F, 13F, -13F, 2, 9, 6, 0F,5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F); // Import ImportBox92
		hipsModel[541].setRotationPoint(35F, -54F, 0F);

		hipsModel[542].addShapeBox(-11F, 13F, -16F, 2, 9, 3, 0F,3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox93
		hipsModel[542].setRotationPoint(35F, -54F, 0F);

		hipsModel[543].addShapeBox(-14F, 13F, -24F, 2, 8, 8, 0F,7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -4F, 0F, -7F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox94
		hipsModel[543].setRotationPoint(35F, -54F, 0F);

		hipsModel[544].addShapeBox(-21F, 13F, -27F, 2, 4, 3, 0F,3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -4F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox95
		hipsModel[544].setRotationPoint(35F, -54F, 0F);

		hipsModel[545].addShapeBox(-10F, -4F, -11F, 26, 26, 1, 0F,-10F, -10F, 0.8F, -10F, -10F, -0.9F, -10F, -10F, 0.9F, -10F, -10F, -0.8F, -10F, -10F, 0.5F, -10F, -10F, -0.9F, -10F, -10F, 0.9F, -10F, -10F, -0.5F); // Import ImportBox96
		hipsModel[545].setRotationPoint(35F, -54F, 0F);

		hipsModel[546].addShapeBox(-1F, 16F, -9F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Import ImportBox0
		hipsModel[546].setRotationPoint(35F, -54F, 0F);

		hipsModel[547].addShapeBox(-16F, 15F, 8F, 20, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		hipsModel[547].setRotationPoint(35F, -54F, 0F);

		hipsModel[548].addShapeBox(-7F, -8F, 3F, 6, 3, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		hipsModel[548].setRotationPoint(35F, -54F, 0F);

		hipsModel[549].addShapeBox(-7F, -8F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2
		hipsModel[549].setRotationPoint(35F, -54F, 0F);

		hipsModel[550].addShapeBox(-7F, -7F, 7F, 6, 5, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox3
		hipsModel[550].setRotationPoint(35F, -54F, 0F);

		hipsModel[551].addShapeBox(-1F, 6F, 9F, 7, 1, 2, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 2.2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 2F); // Import ImportBox6
		hipsModel[551].setRotationPoint(35F, -54F, 0F);

		hipsModel[552].addShapeBox(-1F, 11F, 9F, 7, 1, 2, 0F,0F, 0F, 0F, 2.9F, 0F, 0F, .85F, 0F, .05F, 0F, 0F, 1.2F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox7
		hipsModel[552].setRotationPoint(35F, -54F, 0F);

		hipsModel[553].addShapeBox(5F, 7F, 9F, 3, 2, 3, 0F,0F, 0F, 0F, .2F, 0F, 0F, -1.8F, 0F, -1F, 0F, 0F, -.67F, -.5F, 0F, 0F, .5F, 0F, 0F, -1.4F, 0F, -1F, -.5F, 0F, -.5F); // Import ImportBox11
		hipsModel[553].setRotationPoint(35F, -54F, 0F);

		hipsModel[554].addShapeBox(-1F, 7F, 9F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.92F, 0F, 0F, -.16F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -1F, 0F, 0F, -.5F); // Import ImportBox13
		hipsModel[554].setRotationPoint(35F, -54F, 0F);

		hipsModel[555].addShapeBox(5F, 9F, 9F, 3, 2, 2, 0F,-.5F, 0F, 0F, .5F, 0F, 0F, -1.4F, 0F, 0F, -.5F, 0F, .5F, 0F, 0F, 0F, .88F, 0F, 0F, -1.15F, 0F, .05F, 0F, 0F, .32F); // Import ImportBox0
		hipsModel[555].setRotationPoint(35F, -54F, 0F);

		hipsModel[556].addShapeBox(-1F, 9F, 9F, 3, 2, 3, 0F,0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.245F, 0F, 0F, .2F); // Import ImportBox1
		hipsModel[556].setRotationPoint(35F, -54F, 0F);

		hipsModel[557].addShapeBox(-7F, 6F, 11F, 6, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2
		hipsModel[557].setRotationPoint(35F, -54F, 0F);

		hipsModel[558].addShapeBox(-7F, 0F, 11F, 6, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import ImportBox3
		hipsModel[558].setRotationPoint(35F, -54F, 0F);

		hipsModel[559].addShapeBox(-7F, -2F, 8F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox4
		hipsModel[559].setRotationPoint(35F, -54F, 0F);

		hipsModel[560].addShapeBox(10F, 19F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		hipsModel[560].setRotationPoint(35F, -54F, 0F);

		hipsModel[561].addShapeBox(10F, 22F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, -3F, 1F, 0F, -3F); // Import ImportBox1
		hipsModel[561].setRotationPoint(35F, -54F, 0F);

		hipsModel[562].addShapeBox(-16F, 18F, 8F, 20, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 1F, -4F); // Import ImportBox2
		hipsModel[562].setRotationPoint(35F, -54F, 0F);

		hipsModel[563].addShapeBox(-16F, 21F, 0F, 20, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox0
		hipsModel[563].setRotationPoint(35F, -54F, 0F);

		hipsModel[564].addShapeBox(9F, 24F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -1F, .5F, 0F, -1F); // Import ImportBox1
		hipsModel[564].setRotationPoint(35F, -54F, 0F);

		hipsModel[565].addShapeBox(8.5F, 27F, 0F, 1, 8, 3, 0F,0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -1F, .5F, 0F, -1F); // Import ImportBox2
		hipsModel[565].setRotationPoint(35F, -54F, 0F);

		hipsModel[566].addShapeBox(8F, 35F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox3
		hipsModel[566].setRotationPoint(35F, -54F, 0F);

		hipsModel[567].addShapeBox(-14F, -8F, 0F, 7, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox4
		hipsModel[567].setRotationPoint(35F, -54F, 0F);

		hipsModel[568].addShapeBox(-14F, -8F, 3F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox5
		hipsModel[568].setRotationPoint(35F, -54F, 0F);

		hipsModel[569].addShapeBox(-5F, -5.5F, 7F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, .5F, 0F, 5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 5F, 0F, 0F); // Import ImportBox2
		hipsModel[569].setRotationPoint(35F, -54F, 0F);

		hipsModel[570].addShapeBox(-10F, -6.5F, 13F, 2, 12, 3, 0F,0F, 0F, 0F, 0F, -.5F, 0F, -3F, -.5F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, .5F, 0F, 3F, 0F, 0F); // Import ImportBox3
		hipsModel[570].setRotationPoint(35F, -54F, 0F);

		hipsModel[571].addShapeBox(-13F, -6.5F, 16F, 2, 12, 8, 0F,0F, 0F, 0F, 0F, -.5F, 0F, -7F, -1.5F, 0F, 7F, -1F, 0F, 0F, 0F, 0F, 1F, .5F, 0F, -6F, 2F, 2F, 7F, 0F, 0F); // Import ImportBox4
		hipsModel[571].setRotationPoint(35F, -54F, 0F);

		hipsModel[572].addShapeBox(-7F, -5.5F, 7F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 1F, 0F, 5F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F); // Import ImportBox15
		hipsModel[572].setRotationPoint(35F, -54F, 0F);

		hipsModel[573].addShapeBox(-12F, -6.5F, 13F, 2, 12, 3, 0F,0F, -.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Import ImportBox16
		hipsModel[573].setRotationPoint(35F, -54F, 0F);

		hipsModel[574].addShapeBox(-15F, -6.5F, 16F, 2, 12, 8, 0F,0F, -.5F, 0F, 0F, 0F, 0F, -7F, -1F, 0F, 7F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 1F, 1F); // Import ImportBox17
		hipsModel[574].setRotationPoint(35F, -54F, 0F);

		hipsModel[575].addShapeBox(3F, 16F, -3F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox4
		hipsModel[575].setRotationPoint(35F, -54F, 0F);

		hipsModel[576].addShapeBox(0F, 12F, -3F, 11, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox5
		hipsModel[576].setRotationPoint(35F, -54F, 0F);

		hipsModel[577].addShapeBox(0F, 6F, -3F, 10, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox6
		hipsModel[577].setRotationPoint(35F, -54F, 0F);

		hipsModel[578].addShapeBox(0F, 0F, -3F, 9, 6, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox7
		hipsModel[578].setRotationPoint(35F, -54F, 0F);

		hipsModel[579].addShapeBox(0F, -4F, -3F, 8, 4, 3, 0F,0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		hipsModel[579].setRotationPoint(35F, -54F, 0F);

		hipsModel[580].addShapeBox(-1F, -7F, -3F, 7, 3, 3, 0F,0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportBox9
		hipsModel[580].setRotationPoint(35F, -54F, 0F);

		hipsModel[581].addShapeBox(-7F, -8F, -3F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox10
		hipsModel[581].setRotationPoint(35F, -54F, 0F);

		hipsModel[582].addShapeBox(-14F, -8F, -3F, 7, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox11
		hipsModel[582].setRotationPoint(35F, -54F, 0F);

		hipsModel[583].addShapeBox(3F, 16F, -7F, 8, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox12
		hipsModel[583].setRotationPoint(35F, -54F, 0F);

		hipsModel[584].addShapeBox(0F, 12F, -7F, 11, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox13
		hipsModel[584].setRotationPoint(35F, -54F, 0F);

		hipsModel[585].addShapeBox(0F, 6F, -7F, 10, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox14
		hipsModel[585].setRotationPoint(35F, -54F, 0F);

		hipsModel[586].addShapeBox(0F, 0F, -7F, 9, 6, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox15
		hipsModel[586].setRotationPoint(35F, -54F, 0F);

		hipsModel[587].addShapeBox(0F, -4F, -7F, 8, 4, 4, 0F,0F, 0F, 0F, -2F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox16
		hipsModel[587].setRotationPoint(35F, -54F, 0F);

		hipsModel[588].addShapeBox(-1F, -7F, -7F, 7, 3, 4, 0F,0F, -1F, 0F, -3F, -2F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportBox17
		hipsModel[588].setRotationPoint(35F, -54F, 0F);

		hipsModel[589].addShapeBox(-7F, -8F, -7F, 6, 3, 4, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		hipsModel[589].setRotationPoint(35F, -54F, 0F);

		hipsModel[590].addShapeBox(-14F, -8F, -7F, 7, 3, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox19
		hipsModel[590].setRotationPoint(35F, -54F, 0F);

		hipsModel[591].addShapeBox(8F, 16F, -9F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 2F, 3F, 0F, 0F, 2.5F, 0F); // Import ImportBox20
		hipsModel[591].setRotationPoint(35F, -54F, 0F);

		hipsModel[592].addShapeBox(0F, 12F, -9F, 9, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox21
		hipsModel[592].setRotationPoint(35F, -54F, 0F);

		hipsModel[593].addShapeBox(0F, 6F, -9F, 8, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox22
		hipsModel[593].setRotationPoint(35F, -54F, 0F);

		hipsModel[594].addShapeBox(0F, 0F, -9F, 7, 6, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox23
		hipsModel[594].setRotationPoint(35F, -54F, 0F);

		hipsModel[595].addShapeBox(0F, -2F, -9F, 6, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox24
		hipsModel[595].setRotationPoint(35F, -54F, 0F);

		hipsModel[596].addShapeBox(-1F, -5F, -9F, 6, 3, 2, 0F,0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox25
		hipsModel[596].setRotationPoint(35F, -54F, 0F);

		hipsModel[597].addShapeBox(-7F, -7F, -11F, 6, 5, 4, 0F,0F, -2F, -1F, 0F, -2F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox26
		hipsModel[597].setRotationPoint(35F, -54F, 0F);

		hipsModel[598].addShapeBox(10F, 19F, -7F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox27
		hipsModel[598].setRotationPoint(35F, -54F, 0F);

		hipsModel[599].addShapeBox(10F, 22F, -7F, 1, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F, -1F, 0F, -3F, -.5F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox28
		hipsModel[599].setRotationPoint(35F, -54F, 0F);

		hipsModel[600].addShapeBox(9F, 24F, -4F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox29
		hipsModel[600].setRotationPoint(35F, -54F, 0F);

		hipsModel[601].addShapeBox(8.5F, 27F, -3F, 1, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox30
		hipsModel[601].setRotationPoint(35F, -54F, 0F);

		hipsModel[602].addShapeBox(8F, 35F, -2F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox31
		hipsModel[602].setRotationPoint(35F, -54F, 0F);

		hipsModel[603].addShapeBox(-1F, 0F, -11F, 6, 6, 2, 0F,0F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		hipsModel[603].setRotationPoint(35F, -54F, 0F);

		hipsModel[604].addShapeBox(-1F, -2F, -11F, 5, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		hipsModel[604].setRotationPoint(35F, -54F, 0F);

		hipsModel[605].addShapeBox(-1F, -5F, -11F, 4, 3, 2, 0F,0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2
		hipsModel[605].setRotationPoint(35F, -54F, 0F);

		hipsModel[606].addShapeBox(-1F, 6F, -11F, 7, 1, 2, 0F,0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0.2F, 0F, 0F, 2.2F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox3
		hipsModel[606].setRotationPoint(35F, -54F, 0F);

		hipsModel[607].addShapeBox(-1F, 7F, -13F, 3, 2, 4, 0F,0F, 0F, -0.16F, 0F, 0F, -0.92F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox4
		hipsModel[607].setRotationPoint(35F, -54F, 0F);

		hipsModel[608].addShapeBox(-1F, 9F, -12F, 3, 2, 3, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.245F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox5
		hipsModel[608].setRotationPoint(35F, -54F, 0F);

		hipsModel[609].addShapeBox(5F, 7F, -12F, 3, 2, 3, 0F,0F, 0F, -0.67F, -1.8F, 0F, -1F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -1.4F, 0F, -1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox6
		hipsModel[609].setRotationPoint(35F, -54F, 0F);

		hipsModel[610].addShapeBox(5F, 9F, -11F, 3, 2, 2, 0F,-0.5F, 0F, 0.5F, -1.4F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.32F, -1.15F, 0F, 0.05F, 0.88F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox7
		hipsModel[610].setRotationPoint(35F, -54F, 0F);

		hipsModel[611].addShapeBox(-1F, 11F, -11F, 7, 1, 2, 0F,0F, 0F, 1.2F, 0.85F, 0F, 0.05F, 2.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		hipsModel[611].setRotationPoint(35F, -54F, 0F);

		hipsModel[612].addShapeBox(-1F, 12F, -11F, 8, 4, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox9
		hipsModel[612].setRotationPoint(35F, -54F, 0F);

		hipsModel[613].addShapeBox(3F, 16F, -11F, 4, 3, 2, 0F,4F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 0F, 1F, -1.5F, -1F, 0F, -0.5F, 2F, 1F, 0F, 0F, 1F, 1F); // Import ImportBox10
		hipsModel[613].setRotationPoint(35F, -54F, 0F);

		hipsModel[614].addShapeBox(-7F, -2F, -12F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox11
		hipsModel[614].setRotationPoint(35F, -54F, 0F);

		hipsModel[615].addShapeBox(-7F, 0F, -12F, 6, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox12
		hipsModel[615].setRotationPoint(35F, -54F, 0F);

		hipsModel[616].addShapeBox(-7F, 6F, -12F, 6, 6, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox13
		hipsModel[616].setRotationPoint(35F, -54F, 0F);

		hipsModel[617].addShapeBox(-7F, 12F, -12F, 6, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Import ImportBox14
		hipsModel[617].setRotationPoint(35F, -54F, 0F);

		hipsModel[618].addShapeBox(-5F, -5.5F, -13F, 2, 11, 6, 0F,5F, 1F, 0F, -5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		hipsModel[618].setRotationPoint(35F, -54F, 0F);

		hipsModel[619].addShapeBox(-7F, -5.5F, -13F, 2, 11, 6, 0F,5F, 0.5F, 0F, -5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		hipsModel[619].setRotationPoint(35F, -54F, 0F);

		hipsModel[620].addShapeBox(-10F, -6.5F, -16F, 2, 12, 3, 0F,3F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2
		hipsModel[620].setRotationPoint(35F, -54F, 0F);

		hipsModel[621].addShapeBox(-12F, -6.5F, -16F, 2, 12, 3, 0F,3F, -0.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox3
		hipsModel[621].setRotationPoint(35F, -54F, 0F);

		hipsModel[622].addShapeBox(-13F, -6.5F, -24F, 2, 12, 8, 0F,7F, -1F, 0F, -7F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -6F, 2F, 2F, 1F, 0.5F, 0F, 0F, 0F, 0F); // Import ImportBox4
		hipsModel[622].setRotationPoint(35F, -54F, 0F);

		hipsModel[623].addShapeBox(-15F, -6.5F, -24F, 2, 12, 8, 0F,7F, -1.5F, 0F, -7F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 7F, 1F, 1F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox5
		hipsModel[623].setRotationPoint(35F, -54F, 0F);

		hipsModel[624].addShapeBox(-16F, 15F, -9F, 20, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox6
		hipsModel[624].setRotationPoint(35F, -54F, 0F);

		hipsModel[625].addShapeBox(-16F, 18F, -9F, 20, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Import ImportBox7
		hipsModel[625].setRotationPoint(35F, -54F, 0F);

		hipsModel[626].addShapeBox(-16F, 21F, -5F, 20, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Import ImportBox8
		hipsModel[626].setRotationPoint(35F, -54F, 0F);

		hipsModel[627].addShapeBox(-23F, -5F, -10F, 46, 9, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox97
		hipsModel[627].setRotationPoint(-11F, -43F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 37, 43, textureX, textureY); // Import ImportBox224

		rightArmModel[0].addShapeBox(-1F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox224
		rightArmModel[0].setRotationPoint(4F, -73F, 6F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 186, 34, textureX, textureY); // Import ImportBox98
		leftLegModel[1] = new ModelRendererTurbo(this, 220, 140, textureX, textureY); // Import ImportBox103
		leftLegModel[2] = new ModelRendererTurbo(this, 177, 124, textureX, textureY); // Import ImportBox104
		leftLegModel[3] = new ModelRendererTurbo(this, 220, 109, textureX, textureY); // Import ImportBox105
		leftLegModel[4] = new ModelRendererTurbo(this, 220, 154, textureX, textureY); // Import ImportBox107
		leftLegModel[5] = new ModelRendererTurbo(this, 177, 142, textureX, textureY); // Import ImportBox108
		leftLegModel[6] = new ModelRendererTurbo(this, 220, 122, textureX, textureY); // Import ImportBox109
		leftLegModel[7] = new ModelRendererTurbo(this, 177, 101, textureX, textureY); // Import ImportBox110
		leftLegModel[8] = new ModelRendererTurbo(this, 177, 156, textureX, textureY); // Import ImportBox111
		leftLegModel[9] = new ModelRendererTurbo(this, 220, 163, textureX, textureY); // Import ImportBox112
		leftLegModel[10] = new ModelRendererTurbo(this, 177, 184, textureX, textureY); // Import ImportBox117
		leftLegModel[11] = new ModelRendererTurbo(this, 220, 186, textureX, textureY); // Import ImportBox118
		leftLegModel[12] = new ModelRendererTurbo(this, 177, 196, textureX, textureY); // Import ImportBox119
		leftLegModel[13] = new ModelRendererTurbo(this, 220, 195, textureX, textureY); // Import ImportBox120
		leftLegModel[14] = new ModelRendererTurbo(this, 177, 174, textureX, textureY); // Import ImportBox121
		leftLegModel[15] = new ModelRendererTurbo(this, 220, 180, textureX, textureY); // Import ImportBox122
		leftLegModel[16] = new ModelRendererTurbo(this, 220, 203, textureX, textureY); // Import ImportBox123
		leftLegModel[17] = new ModelRendererTurbo(this, 177, 207, textureX, textureY); // Import ImportBox124
		leftLegModel[18] = new ModelRendererTurbo(this, 220, 211, textureX, textureY); // Import ImportBox125
		leftLegModel[19] = new ModelRendererTurbo(this, 177, 218, textureX, textureY); // Import ImportBox126
		leftLegModel[20] = new ModelRendererTurbo(this, 220, 122, textureX, textureY); // Import ImportBox127
		leftLegModel[21] = new ModelRendererTurbo(this, 220, 140, textureX, textureY); // Import ImportBox128
		leftLegModel[22] = new ModelRendererTurbo(this, 220, 154, textureX, textureY); // Import ImportBox129
		leftLegModel[23] = new ModelRendererTurbo(this, 220, 163, textureX, textureY); // Import ImportBox130
		leftLegModel[24] = new ModelRendererTurbo(this, 220, 180, textureX, textureY); // Import ImportBox131
		leftLegModel[25] = new ModelRendererTurbo(this, 220, 186, textureX, textureY); // Import ImportBox132
		leftLegModel[26] = new ModelRendererTurbo(this, 220, 195, textureX, textureY); // Import ImportBox133
		leftLegModel[27] = new ModelRendererTurbo(this, 220, 203, textureX, textureY); // Import ImportBox134
		leftLegModel[28] = new ModelRendererTurbo(this, 220, 211, textureX, textureY); // Import ImportBox135
		leftLegModel[29] = new ModelRendererTurbo(this, 186, 34, textureX, textureY); // Import ImportBox164
		leftLegModel[30] = new ModelRendererTurbo(this, 220, 211, textureX, textureY); // Import ImportBox166
		leftLegModel[31] = new ModelRendererTurbo(this, 177, 218, textureX, textureY); // Import ImportBox167
		leftLegModel[32] = new ModelRendererTurbo(this, 220, 211, textureX, textureY); // Import ImportBox168
		leftLegModel[33] = new ModelRendererTurbo(this, 177, 207, textureX, textureY); // Import ImportBox169
		leftLegModel[34] = new ModelRendererTurbo(this, 220, 203, textureX, textureY); // Import ImportBox170
		leftLegModel[35] = new ModelRendererTurbo(this, 220, 203, textureX, textureY); // Import ImportBox171
		leftLegModel[36] = new ModelRendererTurbo(this, 220, 195, textureX, textureY); // Import ImportBox172
		leftLegModel[37] = new ModelRendererTurbo(this, 177, 196, textureX, textureY); // Import ImportBox173
		leftLegModel[38] = new ModelRendererTurbo(this, 220, 195, textureX, textureY); // Import ImportBox174
		leftLegModel[39] = new ModelRendererTurbo(this, 220, 186, textureX, textureY); // Import ImportBox175
		leftLegModel[40] = new ModelRendererTurbo(this, 177, 184, textureX, textureY); // Import ImportBox176
		leftLegModel[41] = new ModelRendererTurbo(this, 220, 186, textureX, textureY); // Import ImportBox177
		leftLegModel[42] = new ModelRendererTurbo(this, 220, 163, textureX, textureY); // Import ImportBox178
		leftLegModel[43] = new ModelRendererTurbo(this, 220, 180, textureX, textureY); // Import ImportBox179
		leftLegModel[44] = new ModelRendererTurbo(this, 177, 174, textureX, textureY); // Import ImportBox180
		leftLegModel[45] = new ModelRendererTurbo(this, 220, 180, textureX, textureY); // Import ImportBox181
		leftLegModel[46] = new ModelRendererTurbo(this, 220, 163, textureX, textureY); // Import ImportBox182
		leftLegModel[47] = new ModelRendererTurbo(this, 177, 156, textureX, textureY); // Import ImportBox183
		leftLegModel[48] = new ModelRendererTurbo(this, 177, 142, textureX, textureY); // Import ImportBox184
		leftLegModel[49] = new ModelRendererTurbo(this, 220, 154, textureX, textureY); // Import ImportBox185
		leftLegModel[50] = new ModelRendererTurbo(this, 220, 154, textureX, textureY); // Import ImportBox186
		leftLegModel[51] = new ModelRendererTurbo(this, 220, 140, textureX, textureY); // Import ImportBox187
		leftLegModel[52] = new ModelRendererTurbo(this, 177, 124, textureX, textureY); // Import ImportBox188
		leftLegModel[53] = new ModelRendererTurbo(this, 220, 140, textureX, textureY); // Import ImportBox189
		leftLegModel[54] = new ModelRendererTurbo(this, 220, 122, textureX, textureY); // Import ImportBox190
		leftLegModel[55] = new ModelRendererTurbo(this, 220, 122, textureX, textureY); // Import ImportBox191
		leftLegModel[56] = new ModelRendererTurbo(this, 177, 101, textureX, textureY); // Import ImportBox192
		leftLegModel[57] = new ModelRendererTurbo(this, 220, 109, textureX, textureY); // Import ImportBox193
		leftLegModel[58] = new ModelRendererTurbo(this, 218, 94, textureX, textureY); // Import ImportBox194
		leftLegModel[59] = new ModelRendererTurbo(this, 218, 94, textureX, textureY); // Import ImportBox195

		leftLegModel[0].addBox(-1F, -1F, 0F, 2, 2, 19, 0F); // Import ImportBox98
		leftLegModel[0].setRotationPoint(10F, -38F, 0F);

		leftLegModel[1].addShapeBox(-7F, 8F, 16F, 12, 8, 3, 0F,3F, 0F, 0F, .5F, 0F, 0F, -3F, 0F, 1F, -1F, 0F, 1F, 4F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox103
		leftLegModel[1].setRotationPoint(10F, -38F, 0F);

		leftLegModel[2].addShapeBox(-7F, 8F, 12F, 12, 8, 4, 0F,3F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F); // Import ImportBox104
		leftLegModel[2].setRotationPoint(10F, -38F, 0F);

		leftLegModel[3].addShapeBox(-7F, -8F, 16F, 12, 4, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import ImportBox105
		leftLegModel[3].setRotationPoint(10F, -38F, 0F);

		leftLegModel[4].addShapeBox(-10F, 16F, 16F, 13, 3, 3, 0F,1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F); // Import ImportBox107
		leftLegModel[4].setRotationPoint(10F, -38F, 0F);

		leftLegModel[5].addShapeBox(-10F, 16F, 12F, 13, 3, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox108
		leftLegModel[5].setRotationPoint(10F, -38F, 0F);

		leftLegModel[6].addShapeBox(-7F, -4F, 16F, 12, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, .5F, 0F, 0F, -3F, 0F, 1F, -1F, 0F, 1F); // Import ImportBox109
		leftLegModel[6].setRotationPoint(10F, -38F, 0F);

		leftLegModel[7].addShapeBox(-7F, -4F, 12F, 12, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 3F, 0F, 0F); // Import ImportBox110
		leftLegModel[7].setRotationPoint(10F, -38F, 0F);

		leftLegModel[8].addShapeBox(-10F, 19F, 12F, 13, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F); // Import ImportBox111
		leftLegModel[8].setRotationPoint(10F, -38F, 0F);

		leftLegModel[9].addShapeBox(-10F, 19F, 16F, 13, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -8F, 0F, 0F); // Import ImportBox112
		leftLegModel[9].setRotationPoint(10F, -38F, 0F);

		leftLegModel[10].addShapeBox(-5F, 30F, 12F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F); // Import ImportBox117
		leftLegModel[10].setRotationPoint(10F, -38F, 0F);

		leftLegModel[11].addShapeBox(-5F, 30F, 16F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -2.5F, 0F, .5F, -2.5F, 0F, .5F); // Import ImportBox118
		leftLegModel[11].setRotationPoint(10F, -38F, 0F);

		leftLegModel[12].addShapeBox(-6.5F, 33F, 12F, 12, 2, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox119
		leftLegModel[12].setRotationPoint(10F, -38F, 0F);

		leftLegModel[13].addShapeBox(-6.5F, 33F, 16F, 12, 2, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, .5F, -4F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 1F, -3.5F, 0F, 1F); // Import ImportBox120
		leftLegModel[13].setRotationPoint(10F, -38F, 0F);

		leftLegModel[14].addShapeBox(-5F, 29F, 12F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox121
		leftLegModel[14].setRotationPoint(10F, -38F, 0F);

		leftLegModel[15].addShapeBox(-5F, 29F, 16F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import ImportBox122
		leftLegModel[15].setRotationPoint(10F, -38F, 0F);

		leftLegModel[16].addShapeBox(-6.5F, 35F, 16F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F); // Import ImportBox123
		leftLegModel[16].setRotationPoint(10F, -38F, 0F);

		leftLegModel[17].addShapeBox(-6.5F, 35F, 12F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox124
		leftLegModel[17].setRotationPoint(10F, -38F, 0F);

		leftLegModel[18].addShapeBox(-6.5F, 37F, 16F, 12, 1, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Import ImportBox125
		leftLegModel[18].setRotationPoint(10F, -38F, 0F);

		leftLegModel[19].addShapeBox(-6.5F, 37F, 12F, 12, 1, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox126
		leftLegModel[19].setRotationPoint(10F, -38F, 0F);

		leftLegModel[20].addShapeBox(-7F, -4F, 9F, 12, 12, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -3F, 0F, 1F, 0.5F, 0F, 0F, 3F, 0F, 0F); // Import ImportBox127
		leftLegModel[20].setRotationPoint(10F, -38F, 0F);

		leftLegModel[21].addShapeBox(-7F, 8F, 9F, 12, 8, 3, 0F,-1F, 0F, 1F, -3F, 0F, 1F, 0.5F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F); // Import ImportBox128
		leftLegModel[21].setRotationPoint(10F, -38F, 0F);

		leftLegModel[22].addShapeBox(-10F, 16F, 9F, 13, 3, 3, 0F,-4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox129
		leftLegModel[22].setRotationPoint(10F, -38F, 0F);

		leftLegModel[23].addShapeBox(-10F, 19F, 9F, 13, 10, 3, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F); // Import ImportBox130
		leftLegModel[23].setRotationPoint(10F, -38F, 0F);

		leftLegModel[24].addShapeBox(-5F, 29F, 9F, 9, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox131
		leftLegModel[24].setRotationPoint(10F, -38F, 0F);

		leftLegModel[25].addShapeBox(-5F, 30F, 9F, 9, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox132
		leftLegModel[25].setRotationPoint(10F, -38F, 0F);

		leftLegModel[26].addShapeBox(-6.5F, 33F, 9F, 12, 2, 3, 0F,-4F, 0F, 0.5F, -4F, 0F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 1F, -3.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox133
		leftLegModel[26].setRotationPoint(10F, -38F, 0F);

		leftLegModel[27].addShapeBox(-6.5F, 35F, 8F, 12, 2, 4, 0F,-3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox134
		leftLegModel[27].setRotationPoint(10F, -38F, 0F);

		leftLegModel[28].addShapeBox(-6.5F, 37F, 8F, 12, 1, 4, 0F,-3F, 0F, 1F, -3F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox135
		leftLegModel[28].setRotationPoint(10F, -38F, 0F);

		leftLegModel[29].addBox(-1F, -1F, -19F, 2, 2, 19, 0F); // Import ImportBox164
		leftLegModel[29].setRotationPoint(10F, -38F, 0F);

		leftLegModel[30].addShapeBox(-6.5F, 37F, -20F, 12, 1, 4, 0F,-3F, 0F, 1F, -3F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox166
		leftLegModel[30].setRotationPoint(10F, -38F, 0F);

		leftLegModel[31].addShapeBox(-6.5F, 37F, -16F, 12, 1, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox167
		leftLegModel[31].setRotationPoint(10F, -38F, 0F);

		leftLegModel[32].addShapeBox(-6.5F, 37F, -12F, 12, 1, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Import ImportBox168
		leftLegModel[32].setRotationPoint(10F, -38F, 0F);

		leftLegModel[33].addShapeBox(-6.5F, 35F, -16F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox169
		leftLegModel[33].setRotationPoint(10F, -38F, 0F);

		leftLegModel[34].addShapeBox(-6.5F, 35F, -20F, 12, 2, 4, 0F,-3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox170
		leftLegModel[34].setRotationPoint(10F, -38F, 0F);

		leftLegModel[35].addShapeBox(-6.5F, 35F, -12F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F); // Import ImportBox171
		leftLegModel[35].setRotationPoint(10F, -38F, 0F);

		leftLegModel[36].addShapeBox(-6.5F, 33F, -12F, 12, 2, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, .5F, -4F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 1F, -3.5F, 0F, 1F); // Import ImportBox172
		leftLegModel[36].setRotationPoint(10F, -38F, 0F);

		leftLegModel[37].addShapeBox(-6.5F, 33F, -16F, 12, 2, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox173
		leftLegModel[37].setRotationPoint(10F, -38F, 0F);

		leftLegModel[38].addShapeBox(-6.5F, 33F, -19F, 12, 2, 3, 0F,-4F, 0F, 0.5F, -4F, 0F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 1F, -3.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox174
		leftLegModel[38].setRotationPoint(10F, -38F, 0F);

		leftLegModel[39].addShapeBox(-5F, 30F, -19F, 9, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox175
		leftLegModel[39].setRotationPoint(10F, -38F, 0F);

		leftLegModel[40].addShapeBox(-5F, 30F, -16F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F); // Import ImportBox176
		leftLegModel[40].setRotationPoint(10F, -38F, 0F);

		leftLegModel[41].addShapeBox(-5F, 30F, -12F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -2.5F, 0F, .5F, -2.5F, 0F, .5F); // Import ImportBox177
		leftLegModel[41].setRotationPoint(10F, -38F, 0F);

		leftLegModel[42].addShapeBox(-10F, 19F, -12F, 13, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -8F, 0F, 0F); // Import ImportBox178
		leftLegModel[42].setRotationPoint(10F, -38F, 0F);

		leftLegModel[43].addShapeBox(-5F, 29F, -12F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import ImportBox179
		leftLegModel[43].setRotationPoint(10F, -38F, 0F);

		leftLegModel[44].addShapeBox(-5F, 29F, -16F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox180
		leftLegModel[44].setRotationPoint(10F, -38F, 0F);

		leftLegModel[45].addShapeBox(-5F, 29F, -19F, 9, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox181
		leftLegModel[45].setRotationPoint(10F, -38F, 0F);

		leftLegModel[46].addShapeBox(-10F, 19F, -19F, 13, 10, 3, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F); // Import ImportBox182
		leftLegModel[46].setRotationPoint(10F, -38F, 0F);

		leftLegModel[47].addShapeBox(-10F, 19F, -16F, 13, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F); // Import ImportBox183
		leftLegModel[47].setRotationPoint(10F, -38F, 0F);

		leftLegModel[48].addShapeBox(-10F, 16F, -16F, 13, 3, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox184
		leftLegModel[48].setRotationPoint(10F, -38F, 0F);

		leftLegModel[49].addShapeBox(-10F, 16F, -19F, 13, 3, 3, 0F,-4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox185
		leftLegModel[49].setRotationPoint(10F, -38F, 0F);

		leftLegModel[50].addShapeBox(-10F, 16F, -12F, 13, 3, 3, 0F,1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F); // Import ImportBox186
		leftLegModel[50].setRotationPoint(10F, -38F, 0F);

		leftLegModel[51].addShapeBox(-7F, 8F, -12F, 12, 8, 3, 0F,3F, 0F, 0F, .5F, 0F, 0F, -3F, 0F, 1F, -1F, 0F, 1F, 4F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox187
		leftLegModel[51].setRotationPoint(10F, -38F, 0F);

		leftLegModel[52].addShapeBox(-7F, 8F, -16F, 12, 8, 4, 0F,3F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F); // Import ImportBox188
		leftLegModel[52].setRotationPoint(10F, -38F, 0F);

		leftLegModel[53].addShapeBox(-7F, 8F, -19F, 12, 8, 3, 0F,-1F, 0F, 1F, -3F, 0F, 1F, 0.5F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F); // Import ImportBox189
		leftLegModel[53].setRotationPoint(10F, -38F, 0F);

		leftLegModel[54].addShapeBox(-7F, -4F, -19F, 12, 12, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -3F, 0F, 1F, 0.5F, 0F, 0F, 3F, 0F, 0F); // Import ImportBox190
		leftLegModel[54].setRotationPoint(10F, -38F, 0F);

		leftLegModel[55].addShapeBox(-7F, -4F, -12F, 12, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, .5F, 0F, 0F, -3F, 0F, 1F, -1F, 0F, 1F); // Import ImportBox191
		leftLegModel[55].setRotationPoint(10F, -38F, 0F);

		leftLegModel[56].addShapeBox(-7F, -4F, -16F, 12, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 3F, 0F, 0F); // Import ImportBox192
		leftLegModel[56].setRotationPoint(10F, -38F, 0F);

		leftLegModel[57].addShapeBox(-7F, -8F, -19F, 12, 4, 3, 0F,-3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox193
		leftLegModel[57].setRotationPoint(10F, -38F, 0F);

		leftLegModel[58].addShapeBox(-7F, -8F, -16F, 11, 4, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox194
		leftLegModel[58].setRotationPoint(10F, -38F, 0F);

		leftLegModel[59].addShapeBox(-7F, -8F, 12F, 11, 4, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox195
		leftLegModel[59].setRotationPoint(10F, -38F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 233, 35, textureX, textureY); // Import ImportBox102
		rightLegModel[1] = new ModelRendererTurbo(this, 185, 348, textureX, textureY); // Import ImportBox136
		rightLegModel[2] = new ModelRendererTurbo(this, 228, 341, textureX, textureY); // Import ImportBox137
		rightLegModel[3] = new ModelRendererTurbo(this, 228, 333, textureX, textureY); // Import ImportBox138
		rightLegModel[4] = new ModelRendererTurbo(this, 185, 337, textureX, textureY); // Import ImportBox139
		rightLegModel[5] = new ModelRendererTurbo(this, 228, 325, textureX, textureY); // Import ImportBox140
		rightLegModel[6] = new ModelRendererTurbo(this, 185, 326, textureX, textureY); // Import ImportBox141
		rightLegModel[7] = new ModelRendererTurbo(this, 185, 314, textureX, textureY); // Import ImportBox142
		rightLegModel[8] = new ModelRendererTurbo(this, 228, 316, textureX, textureY); // Import ImportBox143
		rightLegModel[9] = new ModelRendererTurbo(this, 228, 310, textureX, textureY); // Import ImportBox144
		rightLegModel[10] = new ModelRendererTurbo(this, 185, 304, textureX, textureY); // Import ImportBox145
		rightLegModel[11] = new ModelRendererTurbo(this, 185, 286, textureX, textureY); // Import ImportBox146
		rightLegModel[12] = new ModelRendererTurbo(this, 228, 293, textureX, textureY); // Import ImportBox147
		rightLegModel[13] = new ModelRendererTurbo(this, 228, 284, textureX, textureY); // Import ImportBox148
		rightLegModel[14] = new ModelRendererTurbo(this, 185, 272, textureX, textureY); // Import ImportBox149
		rightLegModel[15] = new ModelRendererTurbo(this, 185, 254, textureX, textureY); // Import ImportBox150
		rightLegModel[16] = new ModelRendererTurbo(this, 228, 270, textureX, textureY); // Import ImportBox151
		rightLegModel[17] = new ModelRendererTurbo(this, 185, 231, textureX, textureY); // Import ImportBox152
		rightLegModel[18] = new ModelRendererTurbo(this, 228, 252, textureX, textureY); // Import ImportBox153
		rightLegModel[19] = new ModelRendererTurbo(this, 228, 239, textureX, textureY); // Import ImportBox154
		rightLegModel[20] = new ModelRendererTurbo(this, 228, 252, textureX, textureY); // Import ImportBox155
		rightLegModel[21] = new ModelRendererTurbo(this, 228, 270, textureX, textureY); // Import ImportBox156
		rightLegModel[22] = new ModelRendererTurbo(this, 228, 284, textureX, textureY); // Import ImportBox157
		rightLegModel[23] = new ModelRendererTurbo(this, 228, 293, textureX, textureY); // Import ImportBox158
		rightLegModel[24] = new ModelRendererTurbo(this, 228, 310, textureX, textureY); // Import ImportBox159
		rightLegModel[25] = new ModelRendererTurbo(this, 228, 316, textureX, textureY); // Import ImportBox160
		rightLegModel[26] = new ModelRendererTurbo(this, 228, 325, textureX, textureY); // Import ImportBox161
		rightLegModel[27] = new ModelRendererTurbo(this, 228, 333, textureX, textureY); // Import ImportBox162
		rightLegModel[28] = new ModelRendererTurbo(this, 228, 341, textureX, textureY); // Import ImportBox163
		rightLegModel[29] = new ModelRendererTurbo(this, 233, 35, textureX, textureY); // Import ImportBox165
		rightLegModel[30] = new ModelRendererTurbo(this, 228, 239, textureX, textureY); // Import ImportBox196
		rightLegModel[31] = new ModelRendererTurbo(this, 228, 252, textureX, textureY); // Import ImportBox197
		rightLegModel[32] = new ModelRendererTurbo(this, 228, 270, textureX, textureY); // Import ImportBox198
		rightLegModel[33] = new ModelRendererTurbo(this, 228, 284, textureX, textureY); // Import ImportBox199
		rightLegModel[34] = new ModelRendererTurbo(this, 228, 293, textureX, textureY); // Import ImportBox200
		rightLegModel[35] = new ModelRendererTurbo(this, 228, 310, textureX, textureY); // Import ImportBox201
		rightLegModel[36] = new ModelRendererTurbo(this, 228, 316, textureX, textureY); // Import ImportBox202
		rightLegModel[37] = new ModelRendererTurbo(this, 228, 325, textureX, textureY); // Import ImportBox203
		rightLegModel[38] = new ModelRendererTurbo(this, 228, 333, textureX, textureY); // Import ImportBox204
		rightLegModel[39] = new ModelRendererTurbo(this, 228, 341, textureX, textureY); // Import ImportBox205
		rightLegModel[40] = new ModelRendererTurbo(this, 185, 348, textureX, textureY); // Import ImportBox206
		rightLegModel[41] = new ModelRendererTurbo(this, 185, 337, textureX, textureY); // Import ImportBox207
		rightLegModel[42] = new ModelRendererTurbo(this, 185, 326, textureX, textureY); // Import ImportBox208
		rightLegModel[43] = new ModelRendererTurbo(this, 185, 314, textureX, textureY); // Import ImportBox209
		rightLegModel[44] = new ModelRendererTurbo(this, 185, 304, textureX, textureY); // Import ImportBox210
		rightLegModel[45] = new ModelRendererTurbo(this, 185, 286, textureX, textureY); // Import ImportBox211
		rightLegModel[46] = new ModelRendererTurbo(this, 185, 272, textureX, textureY); // Import ImportBox212
		rightLegModel[47] = new ModelRendererTurbo(this, 185, 254, textureX, textureY); // Import ImportBox213
		rightLegModel[48] = new ModelRendererTurbo(this, 185, 231, textureX, textureY); // Import ImportBox214
		rightLegModel[49] = new ModelRendererTurbo(this, 228, 252, textureX, textureY); // Import ImportBox215
		rightLegModel[50] = new ModelRendererTurbo(this, 228, 270, textureX, textureY); // Import ImportBox216
		rightLegModel[51] = new ModelRendererTurbo(this, 228, 284, textureX, textureY); // Import ImportBox217
		rightLegModel[52] = new ModelRendererTurbo(this, 228, 293, textureX, textureY); // Import ImportBox218
		rightLegModel[53] = new ModelRendererTurbo(this, 228, 310, textureX, textureY); // Import ImportBox219
		rightLegModel[54] = new ModelRendererTurbo(this, 228, 316, textureX, textureY); // Import ImportBox220
		rightLegModel[55] = new ModelRendererTurbo(this, 228, 325, textureX, textureY); // Import ImportBox221
		rightLegModel[56] = new ModelRendererTurbo(this, 228, 333, textureX, textureY); // Import ImportBox222
		rightLegModel[57] = new ModelRendererTurbo(this, 228, 341, textureX, textureY); // Import ImportBox223

		rightLegModel[0].addBox(-1F, -1F, 0F, 2, 2, 19, 0F); // Import ImportBox102
		rightLegModel[0].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[1].addShapeBox(-7.5F, 37F, 12F, 12, 1, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox136
		rightLegModel[1].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[2].addShapeBox(-7.5F, 37F, 16F, 12, 1, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Import ImportBox137
		rightLegModel[2].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[3].addShapeBox(-7.5F, 35F, 16F, 12, 2, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F); // Import ImportBox138
		rightLegModel[3].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[4].addShapeBox(-7.5F, 35F, 12F, 12, 2, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox139
		rightLegModel[4].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[5].addShapeBox(-7.5F, 33F, 16F, 12, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0.5F, -3F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 1F, -3F, 0F, 1F); // Import ImportBox140
		rightLegModel[5].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[6].addShapeBox(-7.5F, 33F, 12F, 12, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox141
		rightLegModel[6].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[7].addShapeBox(-7F, 30F, 12F, 10, 3, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F); // Import ImportBox142
		rightLegModel[7].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[8].addShapeBox(-7F, 30F, 16F, 10, 3, 3, 0F,1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F); // Import ImportBox143
		rightLegModel[8].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[9].addShapeBox(-6F, 26F, 16F, 9, 4, 3, 0F,0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox144
		rightLegModel[9].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[10].addShapeBox(-6F, 26F, 12F, 9, 4, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Import ImportBox145
		rightLegModel[10].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[11].addShapeBox(-5F, 19F, 12F, 13, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox146
		rightLegModel[11].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[12].addShapeBox(-5F, 19F, 16F, 13, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox147
		rightLegModel[12].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[13].addShapeBox(-5F, 16F, 16F, 13, 3, 3, 0F,0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F); // Import ImportBox148
		rightLegModel[13].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[14].addShapeBox(-5F, 16F, 12F, 13, 3, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox149
		rightLegModel[14].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[15].addShapeBox(-7F, 8F, 12F, 12, 8, 4, 0F,2F, -3F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 2F, -3F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox150
		rightLegModel[15].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[16].addShapeBox(-7F, 8F, 16F, 12, 8, 3, 0F,2F, -3F, 0F, 6F, 0F, 0F, 2F, 0F, 1F, -3F, -3F, 1F, -2F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Import ImportBox151
		rightLegModel[16].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[17].addShapeBox(-8F, -4F, 12F, 16, 12, 4, 0F,4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -3F, 0F, 1F, 3F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 1F, 3F, 0F); // Import ImportBox152
		rightLegModel[17].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[18].addShapeBox(-8F, -4F, 16F, 13, 12, 3, 0F,4F, -3F, 0F, 3F, 0F, 0F, 0F, -2F, 1F, -2F, -3F, 1F, 1F, 3F, 0F, 6F, 0F, 0F, 2F, 0F, 1F, -4F, 3F, 1F); // Import ImportBox153
		rightLegModel[18].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[19].addShapeBox(-8F, -8F, 16F, 16, 4, 4, 0F,-1F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, -2F, -3F, 0F, -2F, 4F, 3F, 0F, 0F, 0F, 0F, -3F, 2F, 0F, -2F, 3F, 0F); // Import ImportBox154
		rightLegModel[19].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[20].addShapeBox(-8F, -4F, 9F, 13, 12, 3, 0F,-2F, -3F, 1F, 0F, -2F, 1F, 3F, 0F, 0F, 4F, -3F, 0F, -4F, 3F, 1F, 2F, 0F, 1F, 6F, 0F, 0F, 1F, 3F, 0F); // Import ImportBox155
		rightLegModel[20].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[21].addShapeBox(-7F, 8F, 9F, 12, 8, 3, 0F,-3F, -3F, 1F, 2F, 0F, 1F, 6F, 0F, 0F, 2F, -3F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox156
		rightLegModel[21].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[22].addShapeBox(-5F, 16F, 9F, 13, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox157
		rightLegModel[22].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[23].addShapeBox(-5F, 19F, 9F, 13, 7, 3, 0F,-3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox158
		rightLegModel[23].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[24].addShapeBox(-6F, 26F, 9F, 9, 4, 3, 0F,-3F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Import ImportBox159
		rightLegModel[24].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[25].addShapeBox(-7F, 30F, 9F, 10, 3, 3, 0F,-2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox160
		rightLegModel[25].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[26].addShapeBox(-7.5F, 33F, 9F, 12, 2, 3, 0F,-3F, 0F, 0.5F, -4F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 1F, -3.5F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox161
		rightLegModel[26].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[27].addShapeBox(-7.5F, 35F, 8F, 12, 2, 4, 0F,-3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox162
		rightLegModel[27].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[28].addShapeBox(-7.5F, 37F, 8F, 12, 1, 4, 0F,-3F, 0F, 1F, -3F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox163
		rightLegModel[28].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[29].addBox(-1F, -1F, -19F, 2, 2, 19, 0F); // Import ImportBox165
		rightLegModel[29].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[30].addShapeBox(-8F, -8F, -20F, 16, 4, 4, 0F,-3F, 0F, -2F, -5F, 0F, -2F, -3F, 0F, 0F, -1F, 0F, 0F, -2F, 3F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 4F, 3F, 0F); // Import ImportBox196
		rightLegModel[30].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[31].addShapeBox(-8F, -4F, -12F, 13, 12, 3, 0F,4F, -3F, 0F, 3F, 0F, 0F, 0F, -2F, 1F, -2F, -3F, 1F, 1F, 3F, 0F, 6F, 0F, 0F, 2F, 0F, 1F, -4F, 3F, 1F); // Import ImportBox197
		rightLegModel[31].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[32].addShapeBox(-7F, 8F, -12F, 12, 8, 3, 0F,2F, -3F, 0F, 6F, 0F, 0F, 2F, 0F, 1F, -3F, -3F, 1F, -2F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Import ImportBox198
		rightLegModel[32].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[33].addShapeBox(-5F, 16F, -12F, 13, 3, 3, 0F,0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F); // Import ImportBox199
		rightLegModel[33].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[34].addShapeBox(-5F, 19F, -12F, 13, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox200
		rightLegModel[34].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[35].addShapeBox(-6F, 26F, -12F, 9, 4, 3, 0F,0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox201
		rightLegModel[35].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[36].addShapeBox(-7F, 30F, -12F, 10, 3, 3, 0F,1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F); // Import ImportBox202
		rightLegModel[36].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[37].addShapeBox(-7.5F, 33F, -12F, 12, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0.5F, -3F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 1F, -3F, 0F, 1F); // Import ImportBox203
		rightLegModel[37].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[38].addShapeBox(-7.5F, 35F, -12F, 12, 2, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F); // Import ImportBox204
		rightLegModel[38].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[39].addShapeBox(-7.5F, 37F, -12F, 12, 1, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Import ImportBox205
		rightLegModel[39].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[40].addShapeBox(-7.5F, 37F, -16F, 12, 1, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox206
		rightLegModel[40].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[41].addShapeBox(-7.5F, 35F, -16F, 12, 2, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox207
		rightLegModel[41].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[42].addShapeBox(-7.5F, 33F, -16F, 12, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox208
		rightLegModel[42].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[43].addShapeBox(-7F, 30F, -16F, 10, 3, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F); // Import ImportBox209
		rightLegModel[43].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[44].addShapeBox(-6F, 26F, -16F, 9, 4, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Import ImportBox210
		rightLegModel[44].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[45].addShapeBox(-5F, 19F, -16F, 13, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox211
		rightLegModel[45].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[46].addShapeBox(-5F, 16F, -16F, 13, 3, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox212
		rightLegModel[46].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[47].addShapeBox(-7F, 8F, -16F, 12, 8, 4, 0F,2F, -3F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 2F, -3F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox213
		rightLegModel[47].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[48].addShapeBox(-8F, -4F, -16F, 16, 12, 4, 0F,4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -3F, 0F, 1F, 3F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 1F, 3F, 0F); // Import ImportBox214
		rightLegModel[48].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[49].addShapeBox(-8F, -4F, -19F, 13, 12, 3, 0F,-2F, -3F, 1F, 0F, -2F, 1F, 3F, 0F, 0F, 4F, -3F, 0F, -4F, 3F, 1F, 2F, 0F, 1F, 6F, 0F, 0F, 1F, 3F, 0F); // Import ImportBox215
		rightLegModel[49].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[50].addShapeBox(-7F, 8F, -19F, 12, 8, 3, 0F,-3F, -3F, 1F, 2F, 0F, 1F, 6F, 0F, 0F, 2F, -3F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox216
		rightLegModel[50].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[51].addShapeBox(-5F, 16F, -19F, 13, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox217
		rightLegModel[51].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[52].addShapeBox(-5F, 19F, -19F, 13, 7, 3, 0F,-3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox218
		rightLegModel[52].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[53].addShapeBox(-6F, 26F, -19F, 9, 4, 3, 0F,-3F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Import ImportBox219
		rightLegModel[53].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[54].addShapeBox(-7F, 30F, -19F, 10, 3, 3, 0F,-2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox220
		rightLegModel[54].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[55].addShapeBox(-7.5F, 33F, -19F, 12, 2, 3, 0F,-3F, 0F, 0.5F, -4F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 1F, -3.5F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox221
		rightLegModel[55].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[56].addShapeBox(-7.5F, 35F, -20F, 12, 2, 4, 0F,-3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox222
		rightLegModel[56].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[57].addShapeBox(-7.5F, 37F, -20F, 12, 1, 4, 0F,-3F, 0F, 1F, -3F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox223
		rightLegModel[57].setRotationPoint(-27F, -38F, 0F);
	}
}