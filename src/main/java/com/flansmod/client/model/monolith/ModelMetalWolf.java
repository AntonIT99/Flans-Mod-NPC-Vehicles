//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MetalWolf
// Model Creator: 
// Created on: 28.08.2019 - 16:03:01
// Last changed on: 28.08.2019 - 16:03:01

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMetalWolf extends ModelMecha //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelMetalWolf() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[168];
		hipsModel = new ModelRendererTurbo[32];
		leftArmModel = new ModelRendererTurbo[62];
		rightArmModel = new ModelRendererTurbo[62];
		leftLegModel = new ModelRendererTurbo[63];
		rightLegModel = new ModelRendererTurbo[63];
		leftFootModel = new ModelRendererTurbo[12];
		rightFootModel = new ModelRendererTurbo[12];

		initbodyModel_1();
		inithipsModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
		initleftFootModel_1();
		initrightFootModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 155, 52, textureX, textureY); // CoreTorso1
		bodyModel[1] = new ModelRendererTurbo(this, 66, 96, textureX, textureY); // CoreTorso10
		bodyModel[2] = new ModelRendererTurbo(this, 153, 124, textureX, textureY); // CoreTorso100
		bodyModel[3] = new ModelRendererTurbo(this, 60, 83, textureX, textureY); // CoreTorso101
		bodyModel[4] = new ModelRendererTurbo(this, 14, 309, textureX, textureY); // CoreTorso102
		bodyModel[5] = new ModelRendererTurbo(this, 155, 52, textureX, textureY); // CoreTorso103
		bodyModel[6] = new ModelRendererTurbo(this, 76, 92, textureX, textureY); // CoreTorso104
		bodyModel[7] = new ModelRendererTurbo(this, 14, 309, textureX, textureY); // CoreTorso105
		bodyModel[8] = new ModelRendererTurbo(this, 76, 92, textureX, textureY); // CoreTorso106
		bodyModel[9] = new ModelRendererTurbo(this, 67, 50, textureX, textureY); // CoreTorso107
		bodyModel[10] = new ModelRendererTurbo(this, 96, 52, textureX, textureY); // CoreTorso108
		bodyModel[11] = new ModelRendererTurbo(this, 14, 309, textureX, textureY); // CoreTorso109
		bodyModel[12] = new ModelRendererTurbo(this, 161, 101, textureX, textureY); // CoreTorso11
		bodyModel[13] = new ModelRendererTurbo(this, 67, 50, textureX, textureY); // CoreTorso110
		bodyModel[14] = new ModelRendererTurbo(this, 170, 309, textureX, textureY); // CoreTorso111
		bodyModel[15] = new ModelRendererTurbo(this, 170, 347, textureX, textureY); // CoreTorso112
		bodyModel[16] = new ModelRendererTurbo(this, 76, 92, textureX, textureY); // CoreTorso113
		bodyModel[17] = new ModelRendererTurbo(this, 67, 50, textureX, textureY); // CoreTorso114
		bodyModel[18] = new ModelRendererTurbo(this, 204, 393, textureX, textureY); // CoreTorso115
		bodyModel[19] = new ModelRendererTurbo(this, 96, 52, textureX, textureY); // CoreTorso117
		bodyModel[20] = new ModelRendererTurbo(this, 76, 92, textureX, textureY); // CoreTorso118
		bodyModel[21] = new ModelRendererTurbo(this, 67, 50, textureX, textureY); // CoreTorso119
		bodyModel[22] = new ModelRendererTurbo(this, 8, 126, textureX, textureY); // CoreTorso12
		bodyModel[23] = new ModelRendererTurbo(this, 289, 393, textureX, textureY); // CoreTorso120
		bodyModel[24] = new ModelRendererTurbo(this, 69, 92, textureX, textureY); // CoreTorso121
		bodyModel[25] = new ModelRendererTurbo(this, 36, 56, textureX, textureY); // CoreTorso122
		bodyModel[26] = new ModelRendererTurbo(this, 288, 435, textureX, textureY); // CoreTorso123
		bodyModel[27] = new ModelRendererTurbo(this, 76, 92, textureX, textureY); // CoreTorso124
		bodyModel[28] = new ModelRendererTurbo(this, 13, 53, textureX, textureY); // CoreTorso125
		bodyModel[29] = new ModelRendererTurbo(this, 204, 435, textureX, textureY); // CoreTorso126
		bodyModel[30] = new ModelRendererTurbo(this, 68, 89, textureX, textureY); // CoreTorso127
		bodyModel[31] = new ModelRendererTurbo(this, 60, 80, textureX, textureY); // CoreTorso128
		bodyModel[32] = new ModelRendererTurbo(this, 92, 80, textureX, textureY); // CoreTorso129
		bodyModel[33] = new ModelRendererTurbo(this, 34, 276, textureX, textureY); // CoreTorso13
		bodyModel[34] = new ModelRendererTurbo(this, 148, 101, textureX, textureY); // CoreTorso130
		bodyModel[35] = new ModelRendererTurbo(this, 155, 52, textureX, textureY); // CoreTorso131
		bodyModel[36] = new ModelRendererTurbo(this, 210, 80, textureX, textureY); // CoreTorso132
		bodyModel[37] = new ModelRendererTurbo(this, 76, 92, textureX, textureY); // CoreTorso133
		bodyModel[38] = new ModelRendererTurbo(this, 13, 58, textureX, textureY); // CoreTorso134
		bodyModel[39] = new ModelRendererTurbo(this, 39, 316, textureX, textureY); // CoreTorso135
		bodyModel[40] = new ModelRendererTurbo(this, 76, 92, textureX, textureY); // CoreTorso136
		bodyModel[41] = new ModelRendererTurbo(this, 13, 58, textureX, textureY); // CoreTorso137
		bodyModel[42] = new ModelRendererTurbo(this, 76, 92, textureX, textureY); // CoreTorso138
		bodyModel[43] = new ModelRendererTurbo(this, 13, 58, textureX, textureY); // CoreTorso139
		bodyModel[44] = new ModelRendererTurbo(this, 148, 101, textureX, textureY); // CoreTorso14
		bodyModel[45] = new ModelRendererTurbo(this, 13, 58, textureX, textureY); // CoreTorso140
		bodyModel[46] = new ModelRendererTurbo(this, 92, 80, textureX, textureY); // CoreTorso141
		bodyModel[47] = new ModelRendererTurbo(this, 13, 58, textureX, textureY); // CoreTorso142
		bodyModel[48] = new ModelRendererTurbo(this, 92, 80, textureX, textureY); // CoreTorso143
		bodyModel[49] = new ModelRendererTurbo(this, 13, 58, textureX, textureY); // CoreTorso144
		bodyModel[50] = new ModelRendererTurbo(this, 92, 80, textureX, textureY); // CoreTorso145
		bodyModel[51] = new ModelRendererTurbo(this, 13, 58, textureX, textureY); // CoreTorso146
		bodyModel[52] = new ModelRendererTurbo(this, 13, 58, textureX, textureY); // CoreTorso147
		bodyModel[53] = new ModelRendererTurbo(this, 50, 54, textureX, textureY); // CoreTorso149
		bodyModel[54] = new ModelRendererTurbo(this, 124, 309, textureX, textureY); // CoreTorso15
		bodyModel[55] = new ModelRendererTurbo(this, 210, 80, textureX, textureY); // CoreTorso150
		bodyModel[56] = new ModelRendererTurbo(this, 64, 101, textureX, textureY); // CoreTorso151
		bodyModel[57] = new ModelRendererTurbo(this, 148, 101, textureX, textureY); // CoreTorso152
		bodyModel[58] = new ModelRendererTurbo(this, 60, 86, textureX, textureY); // CoreTorso153
		bodyModel[59] = new ModelRendererTurbo(this, 62, 104, textureX, textureY); // CoreTorso155
		bodyModel[60] = new ModelRendererTurbo(this, 14, 309, textureX, textureY); // CoreTorso156
		bodyModel[61] = new ModelRendererTurbo(this, 78, 87, textureX, textureY); // CoreTorso157
		bodyModel[62] = new ModelRendererTurbo(this, 76, 92, textureX, textureY); // CoreTorso158
		bodyModel[63] = new ModelRendererTurbo(this, 78, 87, textureX, textureY); // CoreTorso159
		bodyModel[64] = new ModelRendererTurbo(this, 155, 52, textureX, textureY); // CoreTorso16
		bodyModel[65] = new ModelRendererTurbo(this, 14, 309, textureX, textureY); // CoreTorso160
		bodyModel[66] = new ModelRendererTurbo(this, 155, 52, textureX, textureY); // CoreTorso161
		bodyModel[67] = new ModelRendererTurbo(this, 148, 101, textureX, textureY); // CoreTorso162
		bodyModel[68] = new ModelRendererTurbo(this, 210, 80, textureX, textureY); // CoreTorso163
		bodyModel[69] = new ModelRendererTurbo(this, 14, 309, textureX, textureY); // CoreTorso164
		bodyModel[70] = new ModelRendererTurbo(this, 148, 101, textureX, textureY); // CoreTorso165
		bodyModel[71] = new ModelRendererTurbo(this, 210, 80, textureX, textureY); // CoreTorso167
		bodyModel[72] = new ModelRendererTurbo(this, 78, 87, textureX, textureY); // CoreTorso168
		bodyModel[73] = new ModelRendererTurbo(this, 66, 96, textureX, textureY); // CoreTorso169
		bodyModel[74] = new ModelRendererTurbo(this, 78, 87, textureX, textureY); // CoreTorso17
		bodyModel[75] = new ModelRendererTurbo(this, 155, 52, textureX, textureY); // CoreTorso170
		bodyModel[76] = new ModelRendererTurbo(this, 148, 101, textureX, textureY); // CoreTorso171
		bodyModel[77] = new ModelRendererTurbo(this, 78, 87, textureX, textureY); // CoreTorso18
		bodyModel[78] = new ModelRendererTurbo(this, 39, 316, textureX, textureY); // CoreTorso19
		bodyModel[79] = new ModelRendererTurbo(this, 2, 163, textureX, textureY); // CoreTorso2
		bodyModel[80] = new ModelRendererTurbo(this, 66, 96, textureX, textureY); // CoreTorso20
		bodyModel[81] = new ModelRendererTurbo(this, 68, 89, textureX, textureY); // CoreTorso21
		bodyModel[82] = new ModelRendererTurbo(this, 34, 276, textureX, textureY); // CoreTorso22
		bodyModel[83] = new ModelRendererTurbo(this, 155, 52, textureX, textureY); // CoreTorso23
		bodyModel[84] = new ModelRendererTurbo(this, 50, 54, textureX, textureY); // CoreTorso24
		bodyModel[85] = new ModelRendererTurbo(this, 14, 309, textureX, textureY); // CoreTorso25
		bodyModel[86] = new ModelRendererTurbo(this, 92, 80, textureX, textureY); // CoreTorso26
		bodyModel[87] = new ModelRendererTurbo(this, 210, 80, textureX, textureY); // CoreTorso27
		bodyModel[88] = new ModelRendererTurbo(this, 50, 54, textureX, textureY); // CoreTorso28
		bodyModel[89] = new ModelRendererTurbo(this, 148, 101, textureX, textureY); // CoreTorso29
		bodyModel[90] = new ModelRendererTurbo(this, 3, 181, textureX, textureY); // CoreTorso3
		bodyModel[91] = new ModelRendererTurbo(this, 155, 52, textureX, textureY); // CoreTorso30
		bodyModel[92] = new ModelRendererTurbo(this, 76, 92, textureX, textureY); // CoreTorso34
		bodyModel[93] = new ModelRendererTurbo(this, 14, 309, textureX, textureY); // CoreTorso35
		bodyModel[94] = new ModelRendererTurbo(this, 66, 86, textureX, textureY); // CoreTorso36
		bodyModel[95] = new ModelRendererTurbo(this, 75, 80, textureX, textureY); // CoreTorso37
		bodyModel[96] = new ModelRendererTurbo(this, 76, 92, textureX, textureY); // CoreTorso38
		bodyModel[97] = new ModelRendererTurbo(this, 170, 309, textureX, textureY); // CoreTorso39
		bodyModel[98] = new ModelRendererTurbo(this, 155, 52, textureX, textureY); // CoreTorso4
		bodyModel[99] = new ModelRendererTurbo(this, 161, 101, textureX, textureY); // CoreTorso40
		bodyModel[100] = new ModelRendererTurbo(this, 166, 59, textureX, textureY); // CoreTorso41
		bodyModel[101] = new ModelRendererTurbo(this, 148, 101, textureX, textureY); // CoreTorso42
		bodyModel[102] = new ModelRendererTurbo(this, 75, 80, textureX, textureY); // CoreTorso43
		bodyModel[103] = new ModelRendererTurbo(this, 170, 347, textureX, textureY); // CoreTorso44
		bodyModel[104] = new ModelRendererTurbo(this, 76, 92, textureX, textureY); // CoreTorso45
		bodyModel[105] = new ModelRendererTurbo(this, 155, 52, textureX, textureY); // CoreTorso46
		bodyModel[106] = new ModelRendererTurbo(this, 66, 96, textureX, textureY); // CoreTorso47
		bodyModel[107] = new ModelRendererTurbo(this, 76, 92, textureX, textureY); // CoreTorso48
		bodyModel[108] = new ModelRendererTurbo(this, 75, 80, textureX, textureY); // CoreTorso49
		bodyModel[109] = new ModelRendererTurbo(this, 155, 52, textureX, textureY); // CoreTorso5
		bodyModel[110] = new ModelRendererTurbo(this, 148, 101, textureX, textureY); // CoreTorso50
		bodyModel[111] = new ModelRendererTurbo(this, 14, 393, textureX, textureY); // CoreTorso51
		bodyModel[112] = new ModelRendererTurbo(this, 75, 80, textureX, textureY); // CoreTorso52
		bodyModel[113] = new ModelRendererTurbo(this, 166, 59, textureX, textureY); // CoreTorso53
		bodyModel[114] = new ModelRendererTurbo(this, 66, 96, textureX, textureY); // CoreTorso54
		bodyModel[115] = new ModelRendererTurbo(this, 99, 393, textureX, textureY); // CoreTorso55
		bodyModel[116] = new ModelRendererTurbo(this, 76, 92, textureX, textureY); // CoreTorso56
		bodyModel[117] = new ModelRendererTurbo(this, 14, 435, textureX, textureY); // CoreTorso57
		bodyModel[118] = new ModelRendererTurbo(this, 147, 124, textureX, textureY); // CoreTorso58
		bodyModel[119] = new ModelRendererTurbo(this, 5, 99, textureX, textureY); // CoreTorso59
		bodyModel[120] = new ModelRendererTurbo(this, 148, 101, textureX, textureY); // CoreTorso6
		bodyModel[121] = new ModelRendererTurbo(this, 75, 80, textureX, textureY); // CoreTorso60
		bodyModel[122] = new ModelRendererTurbo(this, 76, 92, textureX, textureY); // CoreTorso61
		bodyModel[123] = new ModelRendererTurbo(this, 73, 101, textureX, textureY); // CoreTorso62
		bodyModel[124] = new ModelRendererTurbo(this, 76, 92, textureX, textureY); // CoreTorso63
		bodyModel[125] = new ModelRendererTurbo(this, 76, 92, textureX, textureY); // CoreTorso64
		bodyModel[126] = new ModelRendererTurbo(this, 147, 124, textureX, textureY); // CoreTorso65
		bodyModel[127] = new ModelRendererTurbo(this, 75, 80, textureX, textureY); // CoreTorso66
		bodyModel[128] = new ModelRendererTurbo(this, 155, 52, textureX, textureY); // CoreTorso67
		bodyModel[129] = new ModelRendererTurbo(this, 98, 435, textureX, textureY); // CoreTorso68
		bodyModel[130] = new ModelRendererTurbo(this, 14, 309, textureX, textureY); // CoreTorso69
		bodyModel[131] = new ModelRendererTurbo(this, 124, 340, textureX, textureY); // CoreTorso7
		bodyModel[132] = new ModelRendererTurbo(this, 4, 75, textureX, textureY); // CoreTorso70
		bodyModel[133] = new ModelRendererTurbo(this, 66, 82, textureX, textureY); // CoreTorso71
		bodyModel[134] = new ModelRendererTurbo(this, 76, 92, textureX, textureY); // CoreTorso72
		bodyModel[135] = new ModelRendererTurbo(this, 75, 80, textureX, textureY); // CoreTorso73
		bodyModel[136] = new ModelRendererTurbo(this, 148, 101, textureX, textureY); // CoreTorso74
		bodyModel[137] = new ModelRendererTurbo(this, 14, 309, textureX, textureY); // CoreTorso75
		bodyModel[138] = new ModelRendererTurbo(this, 69, 92, textureX, textureY); // CoreTorso76
		bodyModel[139] = new ModelRendererTurbo(this, 75, 80, textureX, textureY); // CoreTorso77
		bodyModel[140] = new ModelRendererTurbo(this, 76, 92, textureX, textureY); // CoreTorso78
		bodyModel[141] = new ModelRendererTurbo(this, 44, 75, textureX, textureY); // CoreTorso79
		bodyModel[142] = new ModelRendererTurbo(this, 76, 92, textureX, textureY); // CoreTorso8
		bodyModel[143] = new ModelRendererTurbo(this, 155, 52, textureX, textureY); // CoreTorso80
		bodyModel[144] = new ModelRendererTurbo(this, 116, 102, textureX, textureY); // CoreTorso81
		bodyModel[145] = new ModelRendererTurbo(this, 124, 309, textureX, textureY); // CoreTorso82
		bodyModel[146] = new ModelRendererTurbo(this, 7, 45, textureX, textureY); // CoreTorso83
		bodyModel[147] = new ModelRendererTurbo(this, 124, 340, textureX, textureY); // CoreTorso84
		bodyModel[148] = new ModelRendererTurbo(this, 76, 92, textureX, textureY); // CoreTorso85
		bodyModel[149] = new ModelRendererTurbo(this, 66, 82, textureX, textureY); // CoreTorso86
		bodyModel[150] = new ModelRendererTurbo(this, 116, 126, textureX, textureY); // CoreTorso87
		bodyModel[151] = new ModelRendererTurbo(this, 155, 52, textureX, textureY); // CoreTorso88
		bodyModel[152] = new ModelRendererTurbo(this, 210, 80, textureX, textureY); // CoreTorso89
		bodyModel[153] = new ModelRendererTurbo(this, 78, 87, textureX, textureY); // CoreTorso9
		bodyModel[154] = new ModelRendererTurbo(this, 148, 101, textureX, textureY); // CoreTorso90
		bodyModel[155] = new ModelRendererTurbo(this, 66, 86, textureX, textureY); // CoreTorso91
		bodyModel[156] = new ModelRendererTurbo(this, 76, 92, textureX, textureY); // CoreTorso92
		bodyModel[157] = new ModelRendererTurbo(this, 14, 309, textureX, textureY); // CoreTorso93
		bodyModel[158] = new ModelRendererTurbo(this, 50, 54, textureX, textureY); // CoreTorso94
		bodyModel[159] = new ModelRendererTurbo(this, 14, 309, textureX, textureY); // CoreTorso95
		bodyModel[160] = new ModelRendererTurbo(this, 76, 92, textureX, textureY); // CoreTorso96
		bodyModel[161] = new ModelRendererTurbo(this, 20, 72, textureX, textureY); // CoreTorso97
		bodyModel[162] = new ModelRendererTurbo(this, 66, 82, textureX, textureY); // CoreTorso98
		bodyModel[163] = new ModelRendererTurbo(this, 116, 114, textureX, textureY); // CoreTorso99
		bodyModel[164] = new ModelRendererTurbo(this, 340, 151, textureX, textureY); // PresidentSeal1
		bodyModel[165] = new ModelRendererTurbo(this, 338, 196, textureX, textureY); // PresidentSeal2
		bodyModel[166] = new ModelRendererTurbo(this, 338, 196, textureX, textureY); // PresidentSeal4
		bodyModel[167] = new ModelRendererTurbo(this, 340, 151, textureX, textureY); // PresidentSeal3

		bodyModel[0].addShapeBox(-10F, -1F, -11F, 22, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // CoreTorso1
		bodyModel[0].setRotationPoint(0F, -63F, 0F);

		bodyModel[1].addShapeBox(17.7F, -20.5F, 1.5F, 2, 2, 1, 0F,0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.3F, 0F, 0F, -.2F); // CoreTorso10
		bodyModel[1].setRotationPoint(0F, -63F, 0F);

		bodyModel[2].addBox(-19F, -20F, -15F, 3, 3, 30, 0F); // CoreTorso100
		bodyModel[2].setRotationPoint(0F, -63F, 0F);

		bodyModel[3].addShapeBox(19.5F, -21.7F, -0.5F, 1, 1, 1, 0F,-.45F, -.3F, .2F, -.45F, -.3F, 0F, -.45F, -.3F, 0F, -.45F, -.3F, .2F, -.45F, -.3F, .2F, -.45F, -.3F, 0F, -.45F, -.3F, 0F, -.45F, -.3F, .2F); // CoreTorso101
		bodyModel[3].setRotationPoint(0F, -63F, 0F);

		bodyModel[4].addShapeBox(-71F, -14F, -30F, 26, 16, 22, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -4F); // CoreTorso102
		bodyModel[4].setRotationPoint(0F, -63F, 0F);
		bodyModel[4].rotateAngleY = 0.17453293F;
		bodyModel[4].rotateAngleZ = -0.26179939F;

		bodyModel[5].addShapeBox(14F, -12F, -9F, 4, 8, 18, 0F,0F, 0F, 1F, 2F, 0F, -4F, 2F, 0F, -4F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 01F, 0F); // CoreTorso103
		bodyModel[5].setRotationPoint(0F, -63F, 0F);

		bodyModel[6].addShapeBox(13F, -23F, 2F, 1, 3, 1, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -.7F, -.5F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F); // CoreTorso104
		bodyModel[6].setRotationPoint(0F, -63F, 0F);

		bodyModel[7].addShapeBox(-45F, -24F, -30F, 17, 10, 22, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // CoreTorso105
		bodyModel[7].setRotationPoint(0F, -63F, 0F);
		bodyModel[7].rotateAngleY = 0.17453293F;
		bodyModel[7].rotateAngleZ = -0.26179939F;

		bodyModel[8].addShapeBox(19F, -23F, 2F, 1, 1, 1, 0F,0F, .5F, 0F, 0F, -.5F, 0F, -1F, -.5F, -.7F, 0F, -.5F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.7F, 0F, 0F, -.7F); // CoreTorso106
		bodyModel[8].setRotationPoint(0F, -63F, 0F);

		bodyModel[9].addShapeBox(14F, -14F, -9F, 4, 2, 18, 0F,1F, 0F, 1F, 1F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, -4F, 2F, 0F, -4F, 0F, 0F, 1F); // CoreTorso107
		bodyModel[9].setRotationPoint(0F, -63F, 0F);

		bodyModel[10].addShapeBox(14F, -27F, -9F, 4, 13, 4, 0F,6F, -3F, 1F, -6F, -3F, -2.35F, -6F, -3F, 0F, 6F, -3F, 0F, 1F, 0F, 1F, -1F, 0F, -2.35F, -1F, 0F, 0F, 1F, 0F, 0F); // CoreTorso108
		bodyModel[10].setRotationPoint(0F, -63F, 0F);

		bodyModel[11].addShapeBox(-71F, -24F, -30F, 26, 10, 22, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 3F, 0F, 0F, 0F); // CoreTorso109
		bodyModel[11].setRotationPoint(0F, -63F, 0F);
		bodyModel[11].rotateAngleY = 0.17453293F;
		bodyModel[11].rotateAngleZ = -0.26179939F;

		bodyModel[12].addShapeBox(-22F, -22F, 4.5F, 4, 7, 1, 0F,0F, 0F, 0F, -.5F, -3F, 0F, -.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso11
		bodyModel[12].setRotationPoint(0F, -63F, 0F);

		bodyModel[13].addShapeBox(17F, -18F, -5F, 2, 4, 3, 0F,2F, 0F, 1.65F, -2F, -.5F, 0F, -2F, -1F, -1F, 1F, -1F, -1F, 0F, 0F, 1.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso110
		bodyModel[13].setRotationPoint(0F, -63F, 0F);

		bodyModel[14].addShapeBox(-73F, -24F, -30F, 2, 10, 22, 0F,0F, -2F, -6F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, -2F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // CoreTorso111
		bodyModel[14].setRotationPoint(0F, -63F, 0F);
		bodyModel[14].rotateAngleY = 0.17453293F;
		bodyModel[14].rotateAngleZ = -0.26179939F;

		bodyModel[15].addShapeBox(-73F, -14F, -30F, 2, 16, 22, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -6F, -5F, 0F, -4F, -4F, 0F, -5F, -4F, 0F, -7F, -5F); // CoreTorso112
		bodyModel[15].setRotationPoint(0F, -63F, 0F);
		bodyModel[15].rotateAngleY = 0.17453293F;
		bodyModel[15].rotateAngleZ = -0.26179939F;

		bodyModel[16].addShapeBox(15F, -24F, -3F, 2, 4, 1, 0F,0F, -1F, -.5F, 0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso113
		bodyModel[16].setRotationPoint(0F, -63F, 0F);

		bodyModel[17].addShapeBox(8F, -27F, -11F, 4, 3, 22, 0F,0F, 0F, -4F, -2F, -1F, -5F, -2F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -4.35F, 0F, 0F, -4.35F, 0F, 0F, -1F); // CoreTorso114
		bodyModel[17].setRotationPoint(0F, -63F, 0F);

		bodyModel[18].addShapeBox(-45F, -25F, -32F, 16, 11, 20, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // CoreTorso115
		bodyModel[18].setRotationPoint(0F, -63F, 0F);
		bodyModel[18].rotateAngleY = 0.17453293F;
		bodyModel[18].rotateAngleZ = -0.26179939F;

		bodyModel[19].addShapeBox(14F, -27F, 5F, 4, 13, 4, 0F,6F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, -2.35F, 6F, -3F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2.35F, 1F, 0F, 1F); // CoreTorso117
		bodyModel[19].setRotationPoint(0F, -63F, 0F);

		bodyModel[20].addShapeBox(19F, -23F, -3F, 1, 1, 1, 0F,0F, -.5F, -.7F, -1F, -.5F, -.7F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, 0F, -.7F, -1F, 0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso118
		bodyModel[20].setRotationPoint(0F, -63F, 0F);

		bodyModel[21].addShapeBox(17F, -18F, 2F, 2, 4, 3, 0F,1F, -1F, -1F, -2F, -1F, -1F, -2F, -.5F, 0F, 2F, 0F, 1.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.65F); // CoreTorso119
		bodyModel[21].setRotationPoint(0F, -63F, 0F);

		bodyModel[22].addShapeBox(12F, -12F, -10F, 2, 11, 20, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 1F); // CoreTorso12
		bodyModel[22].setRotationPoint(0F, -63F, 0F);

		bodyModel[23].addShapeBox(-68F, -25F, -32F, 23, 11, 20, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 3F, 0F, 0F, 0F); // CoreTorso120
		bodyModel[23].setRotationPoint(0F, -63F, 0F);
		bodyModel[23].rotateAngleY = 0.17453293F;
		bodyModel[23].rotateAngleZ = -0.26179939F;

		bodyModel[24].addShapeBox(19F, -24F, -2F, 2, 2, 1, 0F,0F, -.5F, 0F, -1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso121
		bodyModel[24].setRotationPoint(0F, -63F, 0F);

		bodyModel[25].addShapeBox(17.2F, -14.2F, -1.5F, 1, 2, 3, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // CoreTorso122
		bodyModel[25].setRotationPoint(0F, -63F, 0F);

		bodyModel[26].addShapeBox(-68F, -14F, -32F, 23, 13, 22, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -4F); // CoreTorso123
		bodyModel[26].setRotationPoint(0F, -63F, 0F);
		bodyModel[26].rotateAngleY = 0.17453293F;
		bodyModel[26].rotateAngleZ = -0.26179939F;

		bodyModel[27].addShapeBox(17F, -25F, -2F, 2, 5, 1, 0F,0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso124
		bodyModel[27].setRotationPoint(0F, -63F, 0F);

		bodyModel[28].addShapeBox(16.2F, -13.7F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F); // CoreTorso125
		bodyModel[28].setRotationPoint(0F, -65F, 0F);

		bodyModel[29].addShapeBox(-45F, -14F, -32F, 16, 13, 22, 0F,0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F); // CoreTorso126
		bodyModel[29].setRotationPoint(0F, -63F, 0F);
		bodyModel[29].rotateAngleY = 0.17453293F;
		bodyModel[29].rotateAngleZ = -0.26179939F;

		bodyModel[30].addShapeBox(17.5F, -21.8F, -3F, 2, 1, 1, 0F,-1F, 0F, 0F, .5F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, .5F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // CoreTorso127
		bodyModel[30].setRotationPoint(0F, -63F, 0F);

		bodyModel[31].addShapeBox(19.5F, -22.1F, -0.5F, 1, 1, 1, 0F,-.45F, -.3F, -.2F, -.45F, -.4F, -.3F, -.45F, -.4F, -.3F, -.45F, -.3F, -.2F, -.45F, -.3F, .2F, -.45F, -.3F, 0F, -.45F, -.3F, 0F, -.45F, -.3F, .2F); // CoreTorso128
		bodyModel[31].setRotationPoint(0F, -63F, 0F);

		bodyModel[32].addShapeBox(13F, -20F, -3F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // CoreTorso129
		bodyModel[32].setRotationPoint(0F, -63F, 0F);

		bodyModel[33].addShapeBox(0F, -17F, -19F, 4, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso13
		bodyModel[33].setRotationPoint(0F, -63F, 0F);

		bodyModel[34].addShapeBox(-73F, -25F, -5F, 10, 3, 10, 0F,-3F, -.5F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, -.5F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // CoreTorso130
		bodyModel[34].setRotationPoint(0F, -63F, 0F);

		bodyModel[35].addShapeBox(-23F, -26F, -5F, 2, 2, 10, 0F,-.5F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -.5F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso131
		bodyModel[35].setRotationPoint(0F, -63F, 0F);

		bodyModel[36].addShapeBox(-3F, -17F, 11F, 10, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso132
		bodyModel[36].setRotationPoint(0F, -63F, 0F);

		bodyModel[37].addShapeBox(15F, -25F, -2F, 2, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso133
		bodyModel[37].setRotationPoint(0F, -63F, 0F);

		bodyModel[38].addShapeBox(16.2F, -14.7F, -0.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso134
		bodyModel[38].setRotationPoint(0F, -65F, 0F);

		bodyModel[39].addShapeBox(-28F, -24F, -11F, 3, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // CoreTorso135
		bodyModel[39].setRotationPoint(0F, -63F, 0F);
		bodyModel[39].rotateAngleY = 0.17453293F;
		bodyModel[39].rotateAngleZ = -0.26179939F;

		bodyModel[40].addShapeBox(14F, -25F, -2F, 1, 5, 1, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso136
		bodyModel[40].setRotationPoint(0F, -63F, 0F);

		bodyModel[41].addShapeBox(16.2F, -12.7F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // CoreTorso137
		bodyModel[41].setRotationPoint(0F, -65F, 0F);

		bodyModel[42].addShapeBox(13F, -24F, -2F, 1, 4, 1, 0F,0F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso138
		bodyModel[42].setRotationPoint(0F, -63F, 0F);

		bodyModel[43].addShapeBox(16.2F, -14.7F, 0.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // CoreTorso139
		bodyModel[43].setRotationPoint(0F, -65F, 0F);

		bodyModel[44].addShapeBox(-31F, -22F, 4.5F, 9, 7, 1, 0F,0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // CoreTorso14
		bodyModel[44].setRotationPoint(0F, -63F, 0F);

		bodyModel[45].addShapeBox(16.2F, -12.7F, 0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // CoreTorso140
		bodyModel[45].setRotationPoint(0F, -65F, 0F);

		bodyModel[46].addShapeBox(13F, -20F, -2F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // CoreTorso141
		bodyModel[46].setRotationPoint(0F, -63F, 0F);

		bodyModel[47].addShapeBox(16.2F, -13.7F, 0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // CoreTorso142
		bodyModel[47].setRotationPoint(0F, -65F, 0F);

		bodyModel[48].addShapeBox(14F, -20F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // CoreTorso143
		bodyModel[48].setRotationPoint(0F, -63F, 0F);

		bodyModel[49].addShapeBox(16.2F, -14.7F, -1.5F, 3, 1, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso144
		bodyModel[49].setRotationPoint(0F, -65F, 0F);

		bodyModel[50].addShapeBox(17F, -20F, 2F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F); // CoreTorso145
		bodyModel[50].setRotationPoint(0F, -63F, 0F);

		bodyModel[51].addShapeBox(16.2F, -13.7F, -1.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso146
		bodyModel[51].setRotationPoint(0F, -65F, 0F);

		bodyModel[52].addShapeBox(16.2F, -12.7F, -1.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // CoreTorso147
		bodyModel[52].setRotationPoint(0F, -65F, 0F);

		bodyModel[53].addShapeBox(15F, -18F, 4F, 2, 4, 2, 0F,-2F, -.5F, -2F, 2F, -1F, -2F, 2F, -2.5F, 1F, -2F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // CoreTorso149
		bodyModel[53].setRotationPoint(0F, -63F, 0F);

		bodyModel[54].addShapeBox(-20F, -22F, 10F, 3, 8, 18, 0F,0F, 0F, -3F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // CoreTorso15
		bodyModel[54].setRotationPoint(0F, -63F, 0F);
		bodyModel[54].rotateAngleY = -0.17453293F;
		bodyModel[54].rotateAngleZ = -0.26179939F;

		bodyModel[55].addShapeBox(-3F, -13F, -12F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // CoreTorso150
		bodyModel[55].setRotationPoint(0F, -63F, 0F);

		bodyModel[56].addShapeBox(14F, -20F, -3F, 3, 1, 1, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso151
		bodyModel[56].setRotationPoint(0F, -63F, 0F);

		bodyModel[57].addShapeBox(-63F, -15F, -5F, 35, 1, 10, 0F,0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso152
		bodyModel[57].setRotationPoint(0F, -63F, 0F);

		bodyModel[58].addShapeBox(19.5F, -21.3F, -0.5F, 1, 1, 1, 0F,-.45F, -.3F, .2F, -.45F, -.3F, 0F, -.45F, -.3F, 0F, -.45F, -.3F, .2F, -.45F, -.3F, -.2F, -.45F, -.4F, -.3F, -.45F, -.4F, -.3F, -.45F, -.3F, -.2F); // CoreTorso153
		bodyModel[58].setRotationPoint(0F, -63F, 0F);

		bodyModel[59].addShapeBox(9F, -20F, -3F, 5, 6, 6, 0F,-7F, 1F, -2F, 3F, -1F, -2F, 3F, -1F, -2F, -7F, 1F, -2F, 1F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -7.5F, 0F); // CoreTorso155
		bodyModel[59].setRotationPoint(0F, -63F, 0F);

		bodyModel[60].addShapeBox(-28F, -14F, 8F, 8, 16, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, -2F, -3F); // CoreTorso156
		bodyModel[60].setRotationPoint(0F, -63F, 0F);
		bodyModel[60].rotateAngleY = -0.17453293F;
		bodyModel[60].rotateAngleZ = -0.26179939F;

		bodyModel[61].addBox(15.5F, -23.5F, 2F, 1, 3, 1, 0F); // CoreTorso157
		bodyModel[61].setRotationPoint(0F, -63F, 0F);

		bodyModel[62].addBox(15F, -25F, -1F, 2, 5, 2, 0F); // CoreTorso158
		bodyModel[62].setRotationPoint(0F, -63F, 0F);

		bodyModel[63].addShapeBox(16.5F, -23.5F, 2F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // CoreTorso159
		bodyModel[63].setRotationPoint(0F, -63F, 0F);

		bodyModel[64].addShapeBox(-14F, -24F, -10F, 4, 23, 20, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -3F, 0F); // CoreTorso16
		bodyModel[64].setRotationPoint(0F, -63F, 0F);

		bodyModel[65].addShapeBox(-45F, -14F, 8F, 17, 16, 22, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F); // CoreTorso160
		bodyModel[65].setRotationPoint(0F, -63F, 0F);
		bodyModel[65].rotateAngleY = -0.17453293F;
		bodyModel[65].rotateAngleZ = -0.26179939F;

		bodyModel[66].addShapeBox(-3F, 0F, -10F, 8, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // CoreTorso161
		bodyModel[66].setRotationPoint(0F, -63F, 0F);

		bodyModel[67].addShapeBox(-28F, -15F, -5F, 5, 1, 10, 0F,0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso162
		bodyModel[67].setRotationPoint(0F, -63F, 0F);

		bodyModel[68].addShapeBox(-3F, -17F, -12F, 10, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso163
		bodyModel[68].setRotationPoint(0F, -63F, 0F);

		bodyModel[69].addShapeBox(-71F, -14F, 8F, 26, 16, 22, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F); // CoreTorso164
		bodyModel[69].setRotationPoint(0F, -63F, 0F);
		bodyModel[69].rotateAngleY = -0.17453293F;
		bodyModel[69].rotateAngleZ = -0.26179939F;

		bodyModel[70].addShapeBox(-63F, -14F, -5F, 35, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -2F, 0F, 0F, -.5F, 0F, 0F, -.5F, -6F, 0F, -2F); // CoreTorso165
		bodyModel[70].setRotationPoint(0F, -63F, 0F);

		bodyModel[71].addShapeBox(-3F, -20F, -12F, 10, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso167
		bodyModel[71].setRotationPoint(0F, -63F, 0F);

		bodyModel[72].addShapeBox(14.5F, -23.5F, 2F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // CoreTorso168
		bodyModel[72].setRotationPoint(0F, -63F, 0F);

		bodyModel[73].addShapeBox(17.7F, -20.5F, 0F, 3, 2, 1, 0F,0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F); // CoreTorso169
		bodyModel[73].setRotationPoint(0F, -63F, -0.5F);

		bodyModel[74].addBox(15.5F, -23.5F, -3F, 1, 3, 1, 0F); // CoreTorso17
		bodyModel[74].setRotationPoint(0F, -63F, 0F);

		bodyModel[75].addShapeBox(-10F, -24F, 10F, 16, 23, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso170
		bodyModel[75].setRotationPoint(0F, -63F, 0F);

		bodyModel[76].addShapeBox(-28F, -14F, -5F, 5, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -3F, -.5F, 0F, -3F, -.5F, 0F, 0F, -.5F); // CoreTorso171
		bodyModel[76].setRotationPoint(0F, -63F, 0F);

		bodyModel[77].addShapeBox(14.5F, -23.5F, -3F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // CoreTorso18
		bodyModel[77].setRotationPoint(0F, -63F, 0F);

		bodyModel[78].addShapeBox(-28F, -24F, 8F, 3, 10, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso19
		bodyModel[78].setRotationPoint(0F, -63F, 0F);
		bodyModel[78].rotateAngleY = -0.17453293F;
		bodyModel[78].rotateAngleZ = -0.26179939F;

		bodyModel[79].addBox(-8F, -3F, -6F, 14, 2, 12, 0F); // CoreTorso2
		bodyModel[79].setRotationPoint(0F, -63F, 0F);

		bodyModel[80].addShapeBox(17.7F, -20.5F, 0.5F, 3, 2, 1, 0F,0F, -.2F, 0F, 0F, -.2F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // CoreTorso20
		bodyModel[80].setRotationPoint(0F, -63F, 0F);

		bodyModel[81].addShapeBox(17.5F, -21.8F, 2F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, .5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, .5F, 0F, -1F, -1F, 0F, 0F); // CoreTorso21
		bodyModel[81].setRotationPoint(0F, -63F, 0F);

		bodyModel[82].addShapeBox(0F, -17F, 12F, 4, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso22
		bodyModel[82].setRotationPoint(0F, -63F, 0F);

		bodyModel[83].addShapeBox(-18F, -26F, -10F, 4, 2, 20, 0F,0F, 0F, -7F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // CoreTorso23
		bodyModel[83].setRotationPoint(0F, -63F, 0F);

		bodyModel[84].addShapeBox(12.5F, -21.5F, 6F, 2, 6, 2, 0F,-.2F, -2F, -3F, -.2F, -2F, -3F, -.2F, -3F, 2F, -.2F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso24
		bodyModel[84].setRotationPoint(0F, -63F, 0F);

		bodyModel[85].addShapeBox(-28F, -24F, 8F, 8, 10, 22, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso25
		bodyModel[85].setRotationPoint(0F, -63F, 0F);
		bodyModel[85].rotateAngleY = -0.17453293F;
		bodyModel[85].rotateAngleZ = -0.26179939F;

		bodyModel[86].addShapeBox(13F, -20F, 2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // CoreTorso26
		bodyModel[86].setRotationPoint(0F, -63F, 0F);

		bodyModel[87].addShapeBox(-3F, -20F, 11F, 10, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso27
		bodyModel[87].setRotationPoint(0F, -63F, 0F);

		bodyModel[88].addShapeBox(15F, -18F, -6F, 2, 4, 2, 0F,-2F, -2F, 1F, 2F, -2.5F, 1F, 2F, -1F, -2F, -2F, -.5F, -2F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso28
		bodyModel[88].setRotationPoint(0F, -63F, 0F);

		bodyModel[89].addShapeBox(-63F, -25F, -5F, 40, 3, 10, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso29
		bodyModel[89].setRotationPoint(0F, -63F, 0F);

		bodyModel[90].addBox(-8F, -18F, -6F, 3, 15, 12, 0F); // CoreTorso3
		bodyModel[90].setRotationPoint(0F, -63F, 0F);

		bodyModel[91].addBox(-23F, -24F, -5F, 5, 15, 10, 0F); // CoreTorso30
		bodyModel[91].setRotationPoint(0F, -63F, 0F);

		bodyModel[92].addShapeBox(14F, -24F, -3F, 1, 4, 1, 0F,0F, -1.7F, -.5F, 0F, -1F, -.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso34
		bodyModel[92].setRotationPoint(0F, -63F, 0F);

		bodyModel[93].addShapeBox(-45F, -24F, 8F, 17, 10, 22, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F); // CoreTorso35
		bodyModel[93].setRotationPoint(0F, -63F, 0F);
		bodyModel[93].rotateAngleY = -0.17453293F;
		bodyModel[93].rotateAngleZ = -0.26179939F;

		bodyModel[94].addShapeBox(16.3F, -21.8F, 2.8F, 3, 1, 1, 0F,-.5F, 0F, -.6F, 0F, 0F, 1F, .5F, -.2F, -1.2F, -1F, -.2F, .2F, -.5F, 0F, -.6F, 0F, 0F, 1F, .5F, -.2F, -1.2F, -1F, -.2F, .2F); // CoreTorso36
		bodyModel[94].setRotationPoint(1F, -63F, 0F);

		bodyModel[95].addShapeBox(15.5F, -24.5F, 3F, 1, 4, 1, 0F,0F, 0F, -.2F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, .2F, 0F, .2F, -.2F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, .2F); // CoreTorso37
		bodyModel[95].setRotationPoint(0F, -63F, 0F);

		bodyModel[96].addShapeBox(14F, -25F, -1F, 1, 5, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso38
		bodyModel[96].setRotationPoint(0F, -63F, 0F);

		bodyModel[97].addShapeBox(-73F, -24F, 8F, 2, 10, 22, 0F,0F, -2F, -6F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, -2F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // CoreTorso39
		bodyModel[97].setRotationPoint(0F, -63F, 0F);
		bodyModel[97].rotateAngleY = -0.17453293F;
		bodyModel[97].rotateAngleZ = -0.26179939F;

		bodyModel[98].addShapeBox(-9F, 0F, -10F, 6, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -8F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, -8F); // CoreTorso4
		bodyModel[98].setRotationPoint(0F, -63F, 0F);

		bodyModel[99].addShapeBox(-22F, -22F, -5.5F, 4, 7, 1, 0F,0F, 0F, 0F, -.5F, -3F, 0F, -.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso40
		bodyModel[99].setRotationPoint(0F, -63F, 0F);

		bodyModel[100].addShapeBox(6F, -24F, 10F, 6, 23, 1, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso41
		bodyModel[100].setRotationPoint(0F, -63F, 0F);

		bodyModel[101].addShapeBox(-31F, -22F, -5.5F, 9, 7, 1, 0F,0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // CoreTorso42
		bodyModel[101].setRotationPoint(0F, -63F, 0F);

		bodyModel[102].addShapeBox(16.5F, -23.5F, 3F, 1, 3, 1, 0F,0F, .2F, 0F, .2F, -1F, .3F, .2F, -1F, -.3F, 0F, .2F, 0F, 0F, .2F, 0F, .2F, -1F, .3F, .2F, -1F, -.3F, 0F, .2F, 0F); // CoreTorso43
		bodyModel[102].setRotationPoint(0F, -63F, 0F);

		bodyModel[103].addShapeBox(-73F, -14F, 8F, 2, 16, 22, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -7F, -5F, 0F, -5F, -4F, 0F, -4F, -4F, 0F, -6F, -5F); // CoreTorso44
		bodyModel[103].setRotationPoint(0F, -63F, 0F);
		bodyModel[103].rotateAngleY = -0.17453293F;
		bodyModel[103].rotateAngleZ = -0.26179939F;

		bodyModel[104].addShapeBox(13F, -24F, -1F, 1, 4, 2, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso45
		bodyModel[104].setRotationPoint(0F, -63F, 0F);

		bodyModel[105].addShapeBox(-10F, -24F, -11F, 16, 23, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso46
		bodyModel[105].setRotationPoint(0F, -63F, 0F);

		bodyModel[106].addShapeBox(17.7F, -20.5F, -2.5F, 2, 2, 1, 0F,0F, 0F, 0F, -.5F, 0F, -.2F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -1F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso47
		bodyModel[106].setRotationPoint(0F, -63F, 0F);

		bodyModel[107].addShapeBox(19F, -24F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso48
		bodyModel[107].setRotationPoint(0F, -63F, 0F);

		bodyModel[108].addShapeBox(14.5F, -25.5F, 3.2F, 1, 5, 1, 0F,0F, -.3F, -.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -.3F, .2F, 0F, -1F, -.25F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, -1F, .2F); // CoreTorso49
		bodyModel[108].setRotationPoint(0F, -63F, 0F);

		bodyModel[109].addShapeBox(5F, 0F, -10F, 6, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -8F, -4F, 0F, -8F, 0F, 0F, -4F); // CoreTorso5
		bodyModel[109].setRotationPoint(0F, -63F, 0F);

		bodyModel[110].addShapeBox(-61F, -25F, 3F, 4, 4, 3, 0F,.5F, 0F, 0F, 0F, 0F, 0F, -2F, -.5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -3F); // CoreTorso50
		bodyModel[110].setRotationPoint(0F, -63F, 0F);

		bodyModel[111].addShapeBox(-45F, -25F, 12F, 16, 11, 20, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F); // CoreTorso51
		bodyModel[111].setRotationPoint(0F, -63F, 0F);
		bodyModel[111].rotateAngleY = -0.17453293F;
		bodyModel[111].rotateAngleZ = -0.26179939F;

		bodyModel[112].addShapeBox(11.5F, -25.5F, 3.4F, 3, 4, 1, 0F,0F, 1.5F, -.8F, 0F, -.3F, -.05F, 0F, -.3F, 0F, 0F, 1.5F, .45F, .5F, -5F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -5F, .45F); // CoreTorso52
		bodyModel[112].setRotationPoint(0F, -63F, 0F);

		bodyModel[113].addShapeBox(6F, -24F, -11F, 6, 23, 1, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso53
		bodyModel[113].setRotationPoint(0F, -63F, 0F);

		bodyModel[114].addShapeBox(17.7F, -20.5F, -1.5F, 3, 2, 1, 0F,0F, 0F, 0F, -.5F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F); // CoreTorso54
		bodyModel[114].setRotationPoint(0F, -63F, 0F);

		bodyModel[115].addShapeBox(-68F, -25F, 12F, 23, 11, 20, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 5F, 0F, 0F, 0F); // CoreTorso55
		bodyModel[115].setRotationPoint(0F, -63F, 0F);
		bodyModel[115].rotateAngleY = -0.17453293F;
		bodyModel[115].rotateAngleZ = -0.26179939F;

		bodyModel[116].addShapeBox(13F, -24F, 1F, 1, 4, 1, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso56
		bodyModel[116].setRotationPoint(0F, -63F, 0F);

		bodyModel[117].addShapeBox(-45F, -14F, 10F, 16, 13, 22, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F); // CoreTorso57
		bodyModel[117].setRotationPoint(0F, -63F, 0F);
		bodyModel[117].rotateAngleY = -0.17453293F;
		bodyModel[117].rotateAngleZ = -0.26179939F;

		bodyModel[118].addShapeBox(-63F, -24.6F, 3.5F, 3, 2, 2, 0F,0F, 0F, -1.5F, 0F, -.6F, -.6F, 1F, -.6F, -.6F, -1F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, -.6F, -.6F, 1F, -.6F, -.6F, -1F, 0F, 1.5F); // CoreTorso58
		bodyModel[118].setRotationPoint(0F, -63F, 0F);

		bodyModel[119].addShapeBox(-10F, -27F, -11F, 16, 3, 22, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso59
		bodyModel[119].setRotationPoint(0F, -63F, 0F);

		bodyModel[120].addShapeBox(-63F, -22F, -5F, 40, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // CoreTorso6
		bodyModel[120].setRotationPoint(0F, -63F, 0F);

		bodyModel[121].addShapeBox(11.5F, -25.5F, -4.4F, 3, 4, 1, 0F,0F, 1.5F, .45F, 0F, -.3F, 0F, 0F, -.3F, -.05F, 0F, 1.5F, -.8F, .5F, -5F, .45F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -5F, -.8F); // CoreTorso60
		bodyModel[121].setRotationPoint(0F, -63F, 0F);

		bodyModel[122].addShapeBox(14F, -25F, 1F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso61
		bodyModel[122].setRotationPoint(0F, -63F, 0F);

		bodyModel[123].addShapeBox(17F, -20F, -3F, 2, 1, 1, 0F,0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F); // CoreTorso62
		bodyModel[123].setRotationPoint(0F, -63F, 0F);

		bodyModel[124].addShapeBox(15F, -25F, 1F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso63
		bodyModel[124].setRotationPoint(0F, -63F, 0F);

		bodyModel[125].addShapeBox(17F, -24F, -3F, 2, 4, 1, 0F,0F, -1F, -.5F, 0F, -1.5F, -.7F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso64
		bodyModel[125].setRotationPoint(0F, -63F, 0F);

		bodyModel[126].addShapeBox(-63F, -24.6F, -5.5F, 3, 2, 2, 0F,-1F, 0F, 1.5F, 1F, -.6F, -.6F, 0F, -.6F, -.6F, 0F, 0F, -1.5F, -1F, 0F, 1.5F, 1F, -.6F, -.6F, 0F, -.6F, -.6F, 0F, 0F, -1.5F); // CoreTorso65
		bodyModel[126].setRotationPoint(0F, -63F, 0F);

		bodyModel[127].addShapeBox(14.5F, -25.5F, -4.2F, 1, 5, 1, 0F,0F, -.3F, .2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -.3F, -.25F, 0F, -1F, .2F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, -1F, -.25F); // CoreTorso66
		bodyModel[127].setRotationPoint(0F, -63F, 0F);

		bodyModel[128].addShapeBox(-14F, -27F, -11F, 4, 3, 22, 0F,0F, -1F, -6F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // CoreTorso67
		bodyModel[128].setRotationPoint(0F, -63F, 0F);

		bodyModel[129].addShapeBox(-68F, -14F, 10F, 23, 13, 22, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F); // CoreTorso68
		bodyModel[129].setRotationPoint(0F, -63F, 0F);
		bodyModel[129].rotateAngleY = -0.17453293F;
		bodyModel[129].rotateAngleZ = -0.26179939F;

		bodyModel[130].addShapeBox(-28F, -24F, -30F, 8, 10, 22, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso69
		bodyModel[130].setRotationPoint(0F, -63F, 0F);
		bodyModel[130].rotateAngleY = 0.17453293F;
		bodyModel[130].rotateAngleZ = -0.26179939F;

		bodyModel[131].addShapeBox(-20F, -14F, 10F, 3, 12, 18, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -2F, -3F); // CoreTorso7
		bodyModel[131].setRotationPoint(0F, -63F, 0F);
		bodyModel[131].rotateAngleY = -0.17453293F;
		bodyModel[131].rotateAngleZ = -0.26179939F;

		bodyModel[132].addShapeBox(12F, -27F, 5F, 2, 15, 5, 0F,6F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 6F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // CoreTorso70
		bodyModel[132].setRotationPoint(0F, -63F, 0F);

		bodyModel[133].addShapeBox(18F, -21.7F, -1F, 2, 1, 2, 0F,0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F); // CoreTorso71
		bodyModel[133].setRotationPoint(0F, -63F, 0F);

		bodyModel[134].addShapeBox(17F, -25F, 1F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso72
		bodyModel[134].setRotationPoint(0F, -63F, 0F);

		bodyModel[135].addShapeBox(15.5F, -24.5F, -4F, 1, 4, 1, 0F,0F, 0F, .2F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, -.2F, 0F, .2F, .2F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, -.2F); // CoreTorso73
		bodyModel[135].setRotationPoint(0F, -63F, 0F);

		bodyModel[136].addShapeBox(-61F, -25F, -5F, 4, 4, 3, 0F,0F, 0F, -2F, -2F, -.5F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso74
		bodyModel[136].setRotationPoint(0F, -63F, -1F);

		bodyModel[137].addShapeBox(-28F, -14F, -30F, 8, 16, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, -2F, -3F); // CoreTorso75
		bodyModel[137].setRotationPoint(0F, -63F, 0F);
		bodyModel[137].rotateAngleY = 0.17453293F;
		bodyModel[137].rotateAngleZ = -0.26179939F;

		bodyModel[138].addShapeBox(19F, -24F, 1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // CoreTorso76
		bodyModel[138].setRotationPoint(0F, -63F, 0F);

		bodyModel[139].addShapeBox(16.5F, -23.5F, -4F, 1, 3, 1, 0F,0F, .2F, 0F, .2F, -1F, -.3F, .2F, -1F, .3F, 0F, .2F, 0F, 0F, .2F, 0F, .2F, -1F, -.3F, .2F, -1F, .3F, 0F, .2F, 0F); // CoreTorso77
		bodyModel[139].setRotationPoint(0F, -63F, 0F);

		bodyModel[140].addShapeBox(15F, -24F, 2F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, 0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // CoreTorso78
		bodyModel[140].setRotationPoint(0F, -63F, 0F);

		bodyModel[141].addShapeBox(12F, -27F, -10F, 2, 15, 5, 0F,6F, -3F, 1F, -6F, -3F, 0F, -6F, -3F, 0F, 6F, -3F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso79
		bodyModel[141].setRotationPoint(0F, -63F, 0F);

		bodyModel[142].addShapeBox(17F, -25F, -1F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso8
		bodyModel[142].setRotationPoint(0F, -63F, 0F);

		bodyModel[143].addShapeBox(-18F, -24F, -10F, 4, 20, 20, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -5F); // CoreTorso80
		bodyModel[143].setRotationPoint(0F, -63F, 0F);

		bodyModel[144].addShapeBox(-62F, -29.5F, -3.5F, 7, 2, 7, 0F,0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // CoreTorso81
		bodyModel[144].setRotationPoint(0F, -63F, 0F);
		bodyModel[144].rotateAngleZ = 0.26179939F;

		bodyModel[145].addShapeBox(-20F, -22F, -28F, 3, 8, 18, 0F,0F, 0F, -3F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // CoreTorso82
		bodyModel[145].setRotationPoint(0F, -63F, 0F);
		bodyModel[145].rotateAngleY = 0.17453293F;
		bodyModel[145].rotateAngleZ = -0.26179939F;

		bodyModel[146].addShapeBox(6F, -27F, -11F, 2, 3, 22, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // CoreTorso83
		bodyModel[146].setRotationPoint(0F, -63F, 0F);

		bodyModel[147].addShapeBox(-20F, -14F, -28F, 3, 12, 18, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -2F, -3F); // CoreTorso84
		bodyModel[147].setRotationPoint(0F, -63F, 0F);
		bodyModel[147].rotateAngleY = 0.17453293F;
		bodyModel[147].rotateAngleZ = -0.26179939F;

		bodyModel[148].addShapeBox(17F, -24F, 2F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1.5F, -.7F, 0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -.5F); // CoreTorso85
		bodyModel[148].setRotationPoint(0F, -63F, 0F);

		bodyModel[149].addShapeBox(18F, -21.1F, -1F, 2, 1, 2, 0F,0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.6F, 0F, -.2F, -.6F, 0F, -.2F, -.6F, 0F, -.2F, -.6F); // CoreTorso86
		bodyModel[149].setRotationPoint(0F, -63F, 0F);

		bodyModel[150].addShapeBox(-62F, -24.5F, -3.5F, 7, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F); // CoreTorso87
		bodyModel[150].setRotationPoint(0F, -63F, 0F);
		bodyModel[150].rotateAngleZ = 0.26179939F;

		bodyModel[151].addShapeBox(-21F, -26F, -5F, 3, 2, 10, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso88
		bodyModel[151].setRotationPoint(0F, -63F, 0F);

		bodyModel[152].addShapeBox(-3F, -13F, 11F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // CoreTorso89
		bodyModel[152].setRotationPoint(0F, -63F, 0F);

		bodyModel[153].addShapeBox(16.5F, -23.5F, -3F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // CoreTorso9
		bodyModel[153].setRotationPoint(0F, -63F, 0F);

		bodyModel[154].addShapeBox(-73F, -22F, -5F, 10, 7, 10, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, -5F, -4F, 0F, 0F, -.5F, 0F, 0F, -.5F, -1F, -5F, -4F); // CoreTorso90
		bodyModel[154].setRotationPoint(0F, -63F, 0F);

		bodyModel[155].addShapeBox(16.3F, -21.8F, -3.8F, 3, 1, 1, 0F,-1F, -.2F, .2F, .5F, -.2F, -1.2F, 0F, 0F, 1F, -.5F, 0F, -.6F, -1F, -.2F, .2F, .5F, -.2F, -1.2F, 0F, 0F, 1F, -.5F, 0F, -.6F); // CoreTorso91
		bodyModel[155].setRotationPoint(1F, -63F, 0F);

		bodyModel[156].addShapeBox(13F, -23F, -3F, 1, 3, 1, 0F,0F, -1.5F, -1F, 0F, -.7F, -.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso92
		bodyModel[156].setRotationPoint(0F, -63F, 0F);

		bodyModel[157].addShapeBox(-71F, -24F, 8F, 26, 10, 22, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 5F, 0F, 0F, 0F); // CoreTorso93
		bodyModel[157].setRotationPoint(0F, -63F, 0F);
		bodyModel[157].rotateAngleY = -0.17453293F;
		bodyModel[157].rotateAngleZ = -0.26179939F;

		bodyModel[158].addShapeBox(12.5F, -21.5F, -8F, 2, 6, 2, 0F,-.2F, -3F, 2F, -.2F, -3F, 2F, -.2F, -2F, -3F, -.2F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CoreTorso94
		bodyModel[158].setRotationPoint(0F, -63F, 0F);

		bodyModel[159].addShapeBox(-45F, -14F, -30F, 17, 16, 22, 0F,0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F); // CoreTorso95
		bodyModel[159].setRotationPoint(0F, -63F, 0F);
		bodyModel[159].rotateAngleY = 0.17453293F;
		bodyModel[159].rotateAngleZ = -0.26179939F;

		bodyModel[160].addShapeBox(14F, -24F, 2F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, 0F, -1.7F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // CoreTorso96
		bodyModel[160].setRotationPoint(0F, -63F, 0F);

		bodyModel[161].addShapeBox(12F, -27F, -5F, 1, 15, 10, 0F,6F, -3F, .5F, -6F, -3F, .5F, -6F, -3F, .5F, 6F, -3F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F); // CoreTorso97
		bodyModel[161].setRotationPoint(0F, -63F, 0F);

		bodyModel[162].addShapeBox(18F, -22.3F, -1F, 2, 1, 2, 0F,0F, -.2F, -.6F, 0F, -.2F, -.6F, 0F, -.2F, -.6F, 0F, -.2F, -.6F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F); // CoreTorso98
		bodyModel[162].setRotationPoint(0F, -63F, 0F);

		bodyModel[163].addShapeBox(-62F, -27.5F, -3.5F, 7, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // CoreTorso99
		bodyModel[163].setRotationPoint(0F, -63F, 0F);
		bodyModel[163].rotateAngleZ = 0.26179939F;

		bodyModel[164].addShapeBox(-95F, -44F, 22.2F, 50, 30, 10, 0F,-27F, -19F, -4F, 0F, -19F, 0F, 0F, -19F, 0F, -27F, -19F, -5F, -27F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 5F, -27F, 0F, 0F); // PresidentSeal1
		bodyModel[164].setRotationPoint(0F, -63F, 0F);
		bodyModel[164].rotateAngleY = -0.17453293F;
		bodyModel[164].rotateAngleZ = -0.26179939F;

		bodyModel[165].addShapeBox(-95F, -14F, 22.2F, 50, 25, 10, 0F,-27F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 5F, -27F, 0F, 0F, -27F, -16F, -4F, 0F, -12F, 0F, 0F, -12F, 0F, -27F, -16F, -3F); // PresidentSeal2
		bodyModel[165].setRotationPoint(0F, -63F, 0F);
		bodyModel[165].rotateAngleY = -0.17453293F;
		bodyModel[165].rotateAngleZ = -0.26179939F;

		bodyModel[166].addShapeBox(-95F, -14F, -32.2F, 50, 25, 10, 0F,-27F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 3F, -27F, 0F, 0F, -27F, -16F, -3F, 0F, -12F, 0F, 0F, -12F, 0F, -27F, -16F, -4F); // PresidentSeal4
		bodyModel[166].setRotationPoint(0F, -63F, 0F);
		bodyModel[166].rotateAngleY = 0.17453293F;
		bodyModel[166].rotateAngleZ = -0.26179939F;

		bodyModel[167].addShapeBox(-95F, -44F, -32.2F, 50, 30, 10, 0F,-27F, -19F, -5F, 0F, -19F, 0F, 0F, -19F, 0F, -27F, -19F, -4F, -27F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 3F, -27F, 0F, 0F); // PresidentSeal3
		bodyModel[167].setRotationPoint(0F, -63F, 0F);
		bodyModel[167].rotateAngleY = 0.17453293F;
		bodyModel[167].rotateAngleZ = -0.26179939F;
	}

	private void inithipsModel_1()
	{
		hipsModel[0] = new ModelRendererTurbo(this, 156, 176, textureX, textureY); // Hip1
		hipsModel[1] = new ModelRendererTurbo(this, 151, 235, textureX, textureY); // Hip10
		hipsModel[2] = new ModelRendererTurbo(this, 141, 219, textureX, textureY); // Hip11
		hipsModel[3] = new ModelRendererTurbo(this, 156, 176, textureX, textureY); // Hip12
		hipsModel[4] = new ModelRendererTurbo(this, 156, 176, textureX, textureY); // Hip13
		hipsModel[5] = new ModelRendererTurbo(this, 156, 176, textureX, textureY); // Hip14
		hipsModel[6] = new ModelRendererTurbo(this, 134, 177, textureX, textureY); // Hip15
		hipsModel[7] = new ModelRendererTurbo(this, 134, 205, textureX, textureY); // Hip16
		hipsModel[8] = new ModelRendererTurbo(this, 134, 217, textureX, textureY); // Hip17
		hipsModel[9] = new ModelRendererTurbo(this, 156, 176, textureX, textureY); // Hip18
		hipsModel[10] = new ModelRendererTurbo(this, 156, 176, textureX, textureY); // Hip19
		hipsModel[11] = new ModelRendererTurbo(this, 156, 176, textureX, textureY); // Hip2
		hipsModel[12] = new ModelRendererTurbo(this, 156, 176, textureX, textureY); // Hip20
		hipsModel[13] = new ModelRendererTurbo(this, 167, 212, textureX, textureY); // Hip21
		hipsModel[14] = new ModelRendererTurbo(this, 180, 212, textureX, textureY); // Hip22
		hipsModel[15] = new ModelRendererTurbo(this, 155, 212, textureX, textureY); // Hip23
		hipsModel[16] = new ModelRendererTurbo(this, 134, 177, textureX, textureY); // Hip24
		hipsModel[17] = new ModelRendererTurbo(this, 134, 205, textureX, textureY); // Hip25
		hipsModel[18] = new ModelRendererTurbo(this, 134, 217, textureX, textureY); // Hip26
		hipsModel[19] = new ModelRendererTurbo(this, 156, 176, textureX, textureY); // Hip27
		hipsModel[20] = new ModelRendererTurbo(this, 156, 176, textureX, textureY); // Hip28
		hipsModel[21] = new ModelRendererTurbo(this, 156, 176, textureX, textureY); // Hip29
		hipsModel[22] = new ModelRendererTurbo(this, 156, 176, textureX, textureY); // Hip3
		hipsModel[23] = new ModelRendererTurbo(this, 180, 212, textureX, textureY); // Hip30
		hipsModel[24] = new ModelRendererTurbo(this, 155, 212, textureX, textureY); // Hip31
		hipsModel[25] = new ModelRendererTurbo(this, 167, 212, textureX, textureY); // Hip32
		hipsModel[26] = new ModelRendererTurbo(this, 156, 176, textureX, textureY); // Hip4
		hipsModel[27] = new ModelRendererTurbo(this, 156, 176, textureX, textureY); // Hip5
		hipsModel[28] = new ModelRendererTurbo(this, 156, 176, textureX, textureY); // Hip6
		hipsModel[29] = new ModelRendererTurbo(this, 151, 227, textureX, textureY); // Hip7
		hipsModel[30] = new ModelRendererTurbo(this, 151, 221, textureX, textureY); // Hip8
		hipsModel[31] = new ModelRendererTurbo(this, 151, 216, textureX, textureY); // Hip9

		hipsModel[0].addShapeBox(-3F, 3F, -8F, 8, 1, 16, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hip1
		hipsModel[0].setRotationPoint(0F, -63F, 0F);

		hipsModel[1].addShapeBox(10F, 5F, -2F, 3, 3, 4, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, -.6F); // Hip10
		hipsModel[1].setRotationPoint(0F, -63F, 0F);
		hipsModel[1].rotateAngleZ = -0.55850536F;

		hipsModel[2].addBox(-2F, 6F, -13F, 6, 6, 26, 0F); // Hip11
		hipsModel[2].setRotationPoint(0F, -63F, 0F);

		hipsModel[3].addShapeBox(-7F, 7F, -7F, 2, 15, 14, 0F,-.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -.5F, 0F, -3F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Hip12
		hipsModel[3].setRotationPoint(0F, -63F, 0F);
		hipsModel[3].rotateAngleZ = -0.38397244F;

		hipsModel[4].addShapeBox(-7F, 22F, -7F, 2, 4, 7, 0F,-.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, 0F, -.5F, -2F, 0F); // Hip13
		hipsModel[4].setRotationPoint(0F, -63F, 0F);
		hipsModel[4].rotateAngleZ = -0.38397244F;

		hipsModel[5].addShapeBox(-7F, 22F, 0F, 2, 4, 7, 0F,-.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, -.5F, 0F, 1F); // Hip14
		hipsModel[5].setRotationPoint(0F, -63F, 0F);
		hipsModel[5].rotateAngleZ = -0.38397244F;

		hipsModel[6].addShapeBox(-7F, 8F, 1F, 2, 19, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hip15
		hipsModel[6].setRotationPoint(0F, -63F, 0F);
		hipsModel[6].rotateAngleX = 0.26179939F;
		hipsModel[6].rotateAngleZ = -0.38397244F;

		hipsModel[7].addShapeBox(-7F, 27F, 1F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Hip16
		hipsModel[7].setRotationPoint(0F, -63F, 0F);
		hipsModel[7].rotateAngleX = 0.26179939F;
		hipsModel[7].rotateAngleZ = -0.38397244F;

		hipsModel[8].addShapeBox(-7F, 29F, 1.5F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Hip17
		hipsModel[8].setRotationPoint(0F, -63F, 0F);
		hipsModel[8].rotateAngleX = 0.26179939F;
		hipsModel[8].rotateAngleZ = -0.38397244F;

		hipsModel[9].addShapeBox(-9F, 8F, 1F, 2, 13, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hip18
		hipsModel[9].setRotationPoint(0F, -63F, 0F);
		hipsModel[9].rotateAngleX = 0.26179939F;
		hipsModel[9].rotateAngleZ = -0.38397244F;

		hipsModel[10].addShapeBox(-10F, 8F, 1F, 1, 13, 5, 0F,0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // Hip19
		hipsModel[10].setRotationPoint(0F, -63F, 0F);
		hipsModel[10].rotateAngleX = 0.26179939F;
		hipsModel[10].rotateAngleZ = -0.38397244F;

		hipsModel[11].addShapeBox(-7F, 3F, -8F, 4, 1, 16, 0F,0F, 0F, -5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Hip2
		hipsModel[11].setRotationPoint(0F, -63F, 0F);

		hipsModel[12].addShapeBox(-11F, 8F, 1.5F, 1, 13, 4, 0F,-.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -1F, -.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -1F); // Hip20
		hipsModel[12].setRotationPoint(0F, -63F, 0F);
		hipsModel[12].rotateAngleX = 0.26179939F;
		hipsModel[12].rotateAngleZ = -0.38397244F;

		hipsModel[13].addShapeBox(-11F, 21F, 2.5F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hip21
		hipsModel[13].setRotationPoint(1F, -63F, 0F);
		hipsModel[13].rotateAngleX = 0.26179939F;
		hipsModel[13].rotateAngleZ = -0.38397244F;

		hipsModel[14].addShapeBox(-11F, 21F, 1.5F, 4, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hip22
		hipsModel[14].setRotationPoint(1F, -63F, 0F);
		hipsModel[14].rotateAngleX = 0.26179939F;
		hipsModel[14].rotateAngleZ = -0.38397244F;

		hipsModel[15].addShapeBox(-11F, 21F, 4.5F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Hip23
		hipsModel[15].setRotationPoint(1F, -63F, 0F);
		hipsModel[15].rotateAngleX = 0.26179939F;
		hipsModel[15].rotateAngleZ = -0.38397244F;

		hipsModel[16].addShapeBox(-7F, 8F, -6F, 2, 19, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hip24
		hipsModel[16].setRotationPoint(0F, -63F, 0F);
		hipsModel[16].rotateAngleX = -0.26179939F;
		hipsModel[16].rotateAngleZ = -0.38397244F;

		hipsModel[17].addShapeBox(-7F, 27F, -6F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Hip25
		hipsModel[17].setRotationPoint(0F, -63F, 0F);
		hipsModel[17].rotateAngleX = -0.26179939F;
		hipsModel[17].rotateAngleZ = -0.38397244F;

		hipsModel[18].addShapeBox(-7F, 29F, -5.5F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Hip26
		hipsModel[18].setRotationPoint(0F, -63F, 0F);
		hipsModel[18].rotateAngleX = -0.26179939F;
		hipsModel[18].rotateAngleZ = -0.38397244F;

		hipsModel[19].addShapeBox(-9F, 8F, -6F, 2, 13, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hip27
		hipsModel[19].setRotationPoint(0F, -63F, 0F);
		hipsModel[19].rotateAngleX = -0.26179939F;
		hipsModel[19].rotateAngleZ = -0.38397244F;

		hipsModel[20].addShapeBox(-10F, 8F, -6F, 1, 13, 5, 0F,0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // Hip28
		hipsModel[20].setRotationPoint(0F, -63F, 0F);
		hipsModel[20].rotateAngleX = -0.26179939F;
		hipsModel[20].rotateAngleZ = -0.38397244F;

		hipsModel[21].addShapeBox(-11F, 8F, -5.5F, 1, 13, 4, 0F,-.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -1F, -.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -1F); // Hip29
		hipsModel[21].setRotationPoint(0F, -63F, 0F);
		hipsModel[21].rotateAngleX = -0.26179939F;
		hipsModel[21].rotateAngleZ = -0.38397244F;

		hipsModel[22].addShapeBox(5F, 3F, -8F, 4, 1, 16, 0F,0F, 0F, -1.5F, -1F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Hip3
		hipsModel[22].setRotationPoint(0F, -63F, 0F);

		hipsModel[23].addShapeBox(-10F, 21F, -5.5F, 4, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hip30
		hipsModel[23].setRotationPoint(0F, -63F, 0F);
		hipsModel[23].rotateAngleX = -0.26179939F;
		hipsModel[23].rotateAngleZ = -0.38397244F;

		hipsModel[24].addShapeBox(-10F, 21F, -2.5F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Hip31
		hipsModel[24].setRotationPoint(0F, -63F, 0F);
		hipsModel[24].rotateAngleX = -0.26179939F;
		hipsModel[24].rotateAngleZ = -0.38397244F;

		hipsModel[25].addShapeBox(-10F, 21F, -4.5F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hip32
		hipsModel[25].setRotationPoint(0F, -63F, 0F);
		hipsModel[25].rotateAngleX = -0.26179939F;
		hipsModel[25].rotateAngleZ = -0.38397244F;

		hipsModel[26].addShapeBox(-8F, 4F, -8F, 5, 9, 16, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 4F, 0F, -4F); // Hip4
		hipsModel[26].setRotationPoint(0F, -63F, 0F);

		hipsModel[27].addShapeBox(5F, 4F, -8F, 4, 9, 16, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, .5F, -7F, -5F, .5F, -7F, -5F, 0F, 0F, -4F); // Hip5
		hipsModel[27].setRotationPoint(0F, -63F, 0F);

		hipsModel[28].addShapeBox(-3F, 4F, -8F, 8, 9, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Hip6
		hipsModel[28].setRotationPoint(0F, -63F, 0F);

		hipsModel[29].addShapeBox(10F, 2F, -2F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // Hip7
		hipsModel[29].setRotationPoint(0F, -63F, 0F);
		hipsModel[29].rotateAngleZ = -0.55850536F;

		hipsModel[30].addShapeBox(10F, 1F, -2F, 3, 1, 4, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hip8
		hipsModel[30].setRotationPoint(0F, -63F, 0F);
		hipsModel[30].rotateAngleZ = -0.55850536F;

		hipsModel[31].addShapeBox(10F, 0F, -1.5F, 3, 1, 3, 0F,0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hip9
		hipsModel[31].setRotationPoint(0F, -63F, 0F);
		hipsModel[31].rotateAngleZ = -0.55850536F;
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 49, 219, textureX, textureY); // LeftArm1
		leftArmModel[1] = new ModelRendererTurbo(this, 13, 229, textureX, textureY); // LeftArm10
		leftArmModel[2] = new ModelRendererTurbo(this, 67, 234, textureX, textureY); // LeftArm11
		leftArmModel[3] = new ModelRendererTurbo(this, 13, 229, textureX, textureY); // LeftArm12
		leftArmModel[4] = new ModelRendererTurbo(this, 13, 229, textureX, textureY); // LeftArm13
		leftArmModel[5] = new ModelRendererTurbo(this, 6, 250, textureX, textureY); // LeftArm14
		leftArmModel[6] = new ModelRendererTurbo(this, 14, 263, textureX, textureY); // LeftArm15
		leftArmModel[7] = new ModelRendererTurbo(this, 13, 229, textureX, textureY); // LeftArm16
		leftArmModel[8] = new ModelRendererTurbo(this, 40, 262, textureX, textureY); // LeftArm17
		leftArmModel[9] = new ModelRendererTurbo(this, 13, 229, textureX, textureY); // LeftArm18
		leftArmModel[10] = new ModelRendererTurbo(this, 15, 270, textureX, textureY); // LeftArm19
		leftArmModel[11] = new ModelRendererTurbo(this, 13, 216, textureX, textureY); // LeftArm2
		leftArmModel[12] = new ModelRendererTurbo(this, 13, 229, textureX, textureY); // LeftArm20
		leftArmModel[13] = new ModelRendererTurbo(this, 106, 264, textureX, textureY); // LeftArm21
		leftArmModel[14] = new ModelRendererTurbo(this, 14, 277, textureX, textureY); // LeftArm22
		leftArmModel[15] = new ModelRendererTurbo(this, 81, 236, textureX, textureY); // LeftArm23
		leftArmModel[16] = new ModelRendererTurbo(this, 13, 284, textureX, textureY); // LeftArm24
		leftArmModel[17] = new ModelRendererTurbo(this, 134, 275, textureX, textureY); // LeftArm25
		leftArmModel[18] = new ModelRendererTurbo(this, 124, 274, textureX, textureY); // LeftArm26
		leftArmModel[19] = new ModelRendererTurbo(this, 114, 274, textureX, textureY); // LeftArm27
		leftArmModel[20] = new ModelRendererTurbo(this, 103, 274, textureX, textureY); // LeftArm28
		leftArmModel[21] = new ModelRendererTurbo(this, 103, 280, textureX, textureY); // LeftArm29
		leftArmModel[22] = new ModelRendererTurbo(this, 49, 219, textureX, textureY); // LeftArm3
		leftArmModel[23] = new ModelRendererTurbo(this, 114, 281, textureX, textureY); // LeftArm30
		leftArmModel[24] = new ModelRendererTurbo(this, 134, 281, textureX, textureY); // LeftArm31
		leftArmModel[25] = new ModelRendererTurbo(this, 134, 286, textureX, textureY); // LeftArm32
		leftArmModel[26] = new ModelRendererTurbo(this, 81, 249, textureX, textureY); // LeftArm33
		leftArmModel[27] = new ModelRendererTurbo(this, 13, 216, textureX, textureY); // LeftArm34
		leftArmModel[28] = new ModelRendererTurbo(this, 124, 281, textureX, textureY); // LeftArm35
		leftArmModel[29] = new ModelRendererTurbo(this, 124, 286, textureX, textureY); // LeftArm36
		leftArmModel[30] = new ModelRendererTurbo(this, 114, 287, textureX, textureY); // LeftArm37
		leftArmModel[31] = new ModelRendererTurbo(this, 104, 286, textureX, textureY); // LeftArm38
		leftArmModel[32] = new ModelRendererTurbo(this, 103, 291, textureX, textureY); // LeftArm39
		leftArmModel[33] = new ModelRendererTurbo(this, 81, 224, textureX, textureY); // LeftArm4
		leftArmModel[34] = new ModelRendererTurbo(this, 61, 133, textureX, textureY); // LeftArm40
		leftArmModel[35] = new ModelRendererTurbo(this, 61, 133, textureX, textureY); // LeftArm41
		leftArmModel[36] = new ModelRendererTurbo(this, 61, 133, textureX, textureY); // LeftArm42
		leftArmModel[37] = new ModelRendererTurbo(this, 13, 216, textureX, textureY); // LeftArm43
		leftArmModel[38] = new ModelRendererTurbo(this, 34, 245, textureX, textureY); // LeftArm44
		leftArmModel[39] = new ModelRendererTurbo(this, 61, 133, textureX, textureY); // LeftArm45
		leftArmModel[40] = new ModelRendererTurbo(this, 61, 194, textureX, textureY); // LeftArm46
		leftArmModel[41] = new ModelRendererTurbo(this, 61, 207, textureX, textureY); // LeftArm47
		leftArmModel[42] = new ModelRendererTurbo(this, 61, 133, textureX, textureY); // LeftArm48
		leftArmModel[43] = new ModelRendererTurbo(this, 61, 133, textureX, textureY); // LeftArm49
		leftArmModel[44] = new ModelRendererTurbo(this, 13, 229, textureX, textureY); // LeftArm5
		leftArmModel[45] = new ModelRendererTurbo(this, 61, 133, textureX, textureY); // LeftArm50
		leftArmModel[46] = new ModelRendererTurbo(this, 61, 152, textureX, textureY); // LeftArm51
		leftArmModel[47] = new ModelRendererTurbo(this, 61, 165, textureX, textureY); // LeftArm52
		leftArmModel[48] = new ModelRendererTurbo(this, 61, 133, textureX, textureY); // LeftArm53
		leftArmModel[49] = new ModelRendererTurbo(this, 61, 133, textureX, textureY); // LeftArm54
		leftArmModel[50] = new ModelRendererTurbo(this, 13, 216, textureX, textureY); // LeftArm55
		leftArmModel[51] = new ModelRendererTurbo(this, 34, 245, textureX, textureY); // LeftArm56
		leftArmModel[52] = new ModelRendererTurbo(this, 61, 133, textureX, textureY); // LeftArm57
		leftArmModel[53] = new ModelRendererTurbo(this, 13, 216, textureX, textureY); // LeftArm58
		leftArmModel[54] = new ModelRendererTurbo(this, 34, 245, textureX, textureY); // LeftArm59
		leftArmModel[55] = new ModelRendererTurbo(this, 13, 216, textureX, textureY); // LeftArm6
		leftArmModel[56] = new ModelRendererTurbo(this, 19, 291, textureX, textureY); // LeftArm60
		leftArmModel[57] = new ModelRendererTurbo(this, 13, 216, textureX, textureY); // LeftArm61
		leftArmModel[58] = new ModelRendererTurbo(this, 13, 216, textureX, textureY); // LeftArm62
		leftArmModel[59] = new ModelRendererTurbo(this, 19, 291, textureX, textureY); // LeftArm7 
		leftArmModel[60] = new ModelRendererTurbo(this, 13, 229, textureX, textureY); // LeftArm8
		leftArmModel[61] = new ModelRendererTurbo(this, 19, 291, textureX, textureY); // LeftArm9

		leftArmModel[0].addShapeBox(-3F, 0F, -12F, 6, 4, 7, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 5F, -6F, 0F, 5F, -6F, 0F, 2F, 4F, 0F, 2F, 4F); // LeftArm1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
		leftArmModel[0].rotateAngleZ = -0.31415927F;

		leftArmModel[1].addShapeBox(-5.5F, 7F, -2F, 11, 4, 5, 0F,-3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftArm10
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
		leftArmModel[1].rotateAngleZ = -0.31415927F;

		leftArmModel[2].addShapeBox(-5.5F, 23F, -6F, 1, 5, 4, 0F,-1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, -1F, -4F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, -1F, -4F, 0F, 0F); // LeftArm11
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
		leftArmModel[2].rotateAngleZ = 0.20943951F;

		leftArmModel[3].addShapeBox(-5.5F, 11F, -2F, 11, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftArm12
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);
		leftArmModel[3].rotateAngleZ = -0.31415927F;

		leftArmModel[4].addShapeBox(-5.5F, 7F, -5F, 11, 4, 3, 0F,-3.5F, -4F, 0F, -3.5F, -4F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftArm13
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);
		leftArmModel[4].rotateAngleZ = -0.31415927F;

		leftArmModel[5].addBox(-3.1F, 31F, -2F, 6, 2, 5, 0F); // LeftArm14
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(-3.1F, 33F, -2F, 7, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, .5F, 0F); // LeftArm15
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(-5.5F, 11F, -5F, 11, 4, 3, 0F,-3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftArm16
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);
		leftArmModel[7].rotateAngleZ = -0.31415927F;

		leftArmModel[8].addShapeBox(-3.1F, 33F, 1F, 7, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftArm17
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(-5.5F, 15F, -5F, 11, 4, 3, 0F,-3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -4F, 0F, -3.5F, -4F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // LeftArm18
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);
		leftArmModel[9].rotateAngleZ = -0.31415927F;

		leftArmModel[10].addShapeBox(1.9F, 35F, -2F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, .5F, 1F, 0F, .5F, 1F, 0F, -.5F, -1F, 0F, -.5F); // LeftArm19
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);

		leftArmModel[11].addShapeBox(-5.5F, 2F, -14F, 11, 4, 3, 0F,-3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -4F, 0F, -3.5F, -4F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // LeftArm2
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);
		leftArmModel[11].rotateAngleZ = -0.31415927F;

		leftArmModel[12].addShapeBox(-5.5F, 15F, -2F, 11, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // LeftArm20
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);
		leftArmModel[12].rotateAngleZ = -0.31415927F;

		leftArmModel[13].addShapeBox(-3.1F, 33F, 3F, 7, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F); // LeftArm21
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);

		leftArmModel[14].addShapeBox(2.9F, 37F, -2.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, .5F, 0F); // LeftArm22
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);

		leftArmModel[15].addShapeBox(-13.6F, 12F, -2F, 13, 5, 5, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // LeftArm23
		leftArmModel[15].setRotationPoint(0F, 0F, 0F);
		leftArmModel[15].rotateAngleZ = 0.20943951F;

		leftArmModel[16].addShapeBox(0.9F, 37.5F, -2.5F, 2, 2, 2, 0F,0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F); // LeftArm24
		leftArmModel[16].setRotationPoint(0F, 0F, 0F);

		leftArmModel[17].addShapeBox(-3.1F, 38F, 1F, 2, 2, 2, 0F,-.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 2F, 0F, -.2F, 2F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // LeftArm25
		leftArmModel[17].setRotationPoint(0F, 0F, 0F);

		leftArmModel[18].addShapeBox(-1.4F, 37.5F, 1F, 2, 3, 2, 0F,-.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 2F, 0F, -.2F, 2F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // LeftArm26
		leftArmModel[18].setRotationPoint(0F, 0F, 0F);

		leftArmModel[19].addShapeBox(0.3F, 38F, 1F, 2, 3, 2, 0F,-.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 2F, 0F, -.2F, 2F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // LeftArm27
		leftArmModel[19].setRotationPoint(0F, 0F, 0F);

		leftArmModel[20].addShapeBox(2F, 38F, 1F, 2, 2, 2, 0F,-.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // LeftArm28
		leftArmModel[20].setRotationPoint(0F, 0F, 0F);

		leftArmModel[21].addShapeBox(2F, 40F, 1F, 2, 2, 2, 0F,-.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 1F, 0F, -.2F, 1F, 0F, -.2F, -.5F, -.5F, -.2F, -.5F, -.5F); // LeftArm29
		leftArmModel[21].setRotationPoint(0F, 0F, 0F);

		leftArmModel[22].addShapeBox(-3F, 9F, -6F, 6, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, .5F, 0F, -2.5F, .5F, 0F, -2.5F, .5F, -4.5F, 4F, .5F, -4.5F, 4F); // LeftArm3
		leftArmModel[22].setRotationPoint(0F, 0F, 0F);
		leftArmModel[22].rotateAngleZ = -0.31415927F;

		leftArmModel[23].addShapeBox(0.3F, 41F, -1F, 2, 2, 2, 0F,-.2F, 0F, 1F, -.2F, 0F, 1F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // LeftArm30
		leftArmModel[23].setRotationPoint(0F, 0F, 0F);

		leftArmModel[24].addShapeBox(-3.1F, 40F, -1F, 2, 2, 2, 0F,-.2F, 0F, 1F, -.2F, 0F, 1F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // LeftArm31
		leftArmModel[24].setRotationPoint(0F, 0F, 0F);

		leftArmModel[25].addShapeBox(-3.1F, 38F, -2F, 2, 2, 2, 0F,-.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // LeftArm32
		leftArmModel[25].setRotationPoint(0F, 0F, 0F);

		leftArmModel[26].addShapeBox(-13.6F, 12F, -6F, 13, 5, 4, 0F,-4F, -2F, 0F, -4F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -4F, 0F, 1F, -4F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // LeftArm33
		leftArmModel[26].setRotationPoint(0F, 0F, 0F);
		leftArmModel[26].rotateAngleZ = 0.20943951F;

		leftArmModel[27].addShapeBox(-5.5F, -2F, -14F, 11, 4, 3, 0F,-3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftArm34
		leftArmModel[27].setRotationPoint(0F, 0F, 0F);
		leftArmModel[27].rotateAngleZ = -0.31415927F;

		leftArmModel[28].addShapeBox(-1.4F, 40.5F, -1F, 2, 2, 2, 0F,-.2F, 0F, 1F, -.2F, 0F, 1F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // LeftArm35
		leftArmModel[28].setRotationPoint(0F, 0F, 0F);

		leftArmModel[29].addShapeBox(-1.4F, 38.5F, -2F, 2, 2, 2, 0F,-.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // LeftArm36
		leftArmModel[29].setRotationPoint(0F, 0F, 0F);

		leftArmModel[30].addShapeBox(0.3F, 39F, -2F, 2, 2, 2, 0F,-.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // LeftArm37
		leftArmModel[30].setRotationPoint(0F, 0F, 0F);

		leftArmModel[31].addShapeBox(2F, 41F, 0F, 2, 2, 1, 0F,-.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, .5F, 0F, -.2F, .5F, 0F, -.2F, .5F, 0F, -.2F, .5F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // LeftArm38
		leftArmModel[31].setRotationPoint(0F, 0F, 0F);

		leftArmModel[32].addShapeBox(2F, 41.5F, -2F, 2, 2, 2, 0F,-.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.5F, -.5F, -.2F, -.5F, -.5F, -.2F, 0F, 0F, -.2F, 0F, 0F); // LeftArm39
		leftArmModel[32].setRotationPoint(0F, 0F, 0F);

		leftArmModel[33].addShapeBox(-13.6F, 12F, 3F, 13, 5, 4, 0F,0F, 3F, 0F, 0F, -1F, 0F, -4F, 0F, 0F, -4F, 3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 1F, -4F, 0F, 1F); // LeftArm4
		leftArmModel[33].setRotationPoint(0F, 0F, 0F);
		leftArmModel[33].rotateAngleZ = 0.20943951F;

		leftArmModel[34].addShapeBox(-7.5F, -4F, -21F, 15, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftArm40
		leftArmModel[34].setRotationPoint(0F, 0F, 0F);

		leftArmModel[35].addShapeBox(-7.5F, -10F, -21F, 15, 6, 8, 0F,-4F, -1F, -3F, -4F, -1F, -3F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftArm41
		leftArmModel[35].setRotationPoint(0F, 0F, 0F);

		leftArmModel[36].addShapeBox(-7.5F, -10F, -13F, 15, 6, 7, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftArm42
		leftArmModel[36].setRotationPoint(0F, 0F, 0F);

		leftArmModel[37].addShapeBox(-5.5F, 2F, -11F, 11, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // LeftArm43
		leftArmModel[37].setRotationPoint(0F, 0F, 0F);
		leftArmModel[37].rotateAngleZ = -0.31415927F;

		leftArmModel[38].addShapeBox(-14.6F, 17F, -2F, 15, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // LeftArm44
		leftArmModel[38].setRotationPoint(0F, 0F, 0F);
		leftArmModel[38].rotateAngleZ = 0.20943951F;

		leftArmModel[39].addShapeBox(-7.5F, -4F, -13F, 15, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -2F); // LeftArm45
		leftArmModel[39].setRotationPoint(0F, 0F, 0F);

		leftArmModel[40].addShapeBox(-7.5F, -10F, -6F, 15, 6, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -5F, -2F, -2F, -5F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // LeftArm46
		leftArmModel[40].setRotationPoint(0F, 0F, 0F);

		leftArmModel[41].addShapeBox(-7.5F, -4F, -6F, 15, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F); // LeftArm47
		leftArmModel[41].setRotationPoint(0F, 0F, 0F);

		leftArmModel[42].addShapeBox(7.5F, 1F, -21F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // LeftArm48
		leftArmModel[42].setRotationPoint(0F, 0F, 0F);

		leftArmModel[43].addShapeBox(7.5F, -2F, -21F, 2, 3, 10, 0F,0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // LeftArm49
		leftArmModel[43].setRotationPoint(0F, 0F, 0F);

		leftArmModel[44].addShapeBox(-5.5F, 11F, 3F, 11, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // LeftArm5
		leftArmModel[44].setRotationPoint(0F, 0F, 0F);
		leftArmModel[44].rotateAngleZ = -0.31415927F;

		leftArmModel[45].addShapeBox(7.5F, 5F, -21F, 2, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -3F); // LeftArm50
		leftArmModel[45].setRotationPoint(0F, 0F, 0F);

		leftArmModel[46].addShapeBox(-8F, -10.5F, -15F, 16, 7, 3, 0F,-3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftArm51
		leftArmModel[46].setRotationPoint(0F, 0F, 0F);

		leftArmModel[47].addBox(-8F, -3.5F, -15F, 16, 8, 3, 0F); // LeftArm52
		leftArmModel[47].setRotationPoint(0F, 0F, 0F);

		leftArmModel[48].addShapeBox(-9.5F, -2F, -21F, 2, 3, 10, 0F,0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // LeftArm53
		leftArmModel[48].setRotationPoint(0F, 0F, 0F);

		leftArmModel[49].addShapeBox(-9.5F, 1F, -21F, 2, 4, 10, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // LeftArm54
		leftArmModel[49].setRotationPoint(0F, 0F, 0F);

		leftArmModel[50].addShapeBox(-5.5F, -2F, -11F, 11, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftArm55
		leftArmModel[50].setRotationPoint(0F, 0F, 0F);
		leftArmModel[50].rotateAngleZ = -0.31415927F;

		leftArmModel[51].addShapeBox(-14.6F, 17F, 3F, 15, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, -2F, -6F, 0F, -2F); // LeftArm56
		leftArmModel[51].setRotationPoint(0F, 0F, 0F);
		leftArmModel[51].rotateAngleZ = 0.20943951F;

		leftArmModel[52].addShapeBox(-9.5F, 5F, -21F, 2, 3, 10, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -3F); // LeftArm57
		leftArmModel[52].setRotationPoint(0F, 0F, 0F);

		leftArmModel[53].addShapeBox(-5.5F, -6F, -11F, 11, 4, 5, 0F,-3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftArm58
		leftArmModel[53].setRotationPoint(0F, 0F, 0F);
		leftArmModel[53].rotateAngleZ = -0.31415927F;

		leftArmModel[54].addShapeBox(-14.6F, 17F, -7F, 15, 8, 5, 0F,-5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -2F, -6F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F); // LeftArm59
		leftArmModel[54].setRotationPoint(0F, 0F, 0F);
		leftArmModel[54].rotateAngleZ = 0.20943951F;

		leftArmModel[55].addShapeBox(-5.5F, -2F, -6F, 11, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // LeftArm6
		leftArmModel[55].setRotationPoint(0F, 0F, 0F);
		leftArmModel[55].rotateAngleZ = -0.31415927F;

		leftArmModel[56].addShapeBox(-13.1F, 25F, -2F, 12, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftArm60
		leftArmModel[56].setRotationPoint(0F, 0F, 0F);
		leftArmModel[56].rotateAngleZ = 0.20943951F;

		leftArmModel[57].addShapeBox(-5.5F, -6F, -6F, 11, 4, 3, 0F,-3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, -4F, 0F, -3.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // LeftArm61
		leftArmModel[57].setRotationPoint(0F, 0F, 0F);
		leftArmModel[57].rotateAngleZ = -0.31415927F;

		leftArmModel[58].addShapeBox(-5.5F, 2F, -6F, 11, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, -4F, 0F, -3.5F, -4F, 0F); // LeftArm62
		leftArmModel[58].setRotationPoint(0F, 0F, 0F);
		leftArmModel[58].rotateAngleZ = -0.31415927F;

		leftArmModel[59].addShapeBox(-13.1F, 25F, 3F, 12, 6, 3, 0F,0F, 2F, 0F, 0F, 0F, 0F, -4F, 0F, .5F, -4F, 2F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, .5F, -4F, 0F, .5F); // LeftArm7 
		leftArmModel[59].setRotationPoint(0F, 0F, 0F);
		leftArmModel[59].rotateAngleZ = 0.20943951F;

		leftArmModel[60].addShapeBox(-5.5F, 7F, 3F, 11, 4, 3, 0F,-3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, -4F, 0F, -3.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // LeftArm8
		leftArmModel[60].setRotationPoint(0F, 0F, 0F);
		leftArmModel[60].rotateAngleZ = -0.31415927F;

		leftArmModel[61].addShapeBox(-13.1F, 25F, -5F, 12, 6, 3, 0F,-4F, 0F, .5F, -4F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, .5F, -4F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftArm9
		leftArmModel[61].setRotationPoint(0F, 0F, 0F);
		leftArmModel[61].rotateAngleZ = 0.20943951F;
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 61, 133, textureX, textureY); // RightArm1
		rightArmModel[1] = new ModelRendererTurbo(this, 13, 216, textureX, textureY); // RightArm10
		rightArmModel[2] = new ModelRendererTurbo(this, 13, 216, textureX, textureY); // RightArm11
		rightArmModel[3] = new ModelRendererTurbo(this, 13, 216, textureX, textureY); // RightArm12
		rightArmModel[4] = new ModelRendererTurbo(this, 61, 133, textureX, textureY); // RightArm13
		rightArmModel[5] = new ModelRendererTurbo(this, 13, 216, textureX, textureY); // RightArm14
		rightArmModel[6] = new ModelRendererTurbo(this, 13, 216, textureX, textureY); // RightArm15
		rightArmModel[7] = new ModelRendererTurbo(this, 49, 219, textureX, textureY); // RightArm16
		rightArmModel[8] = new ModelRendererTurbo(this, 49, 219, textureX, textureY); // RightArm17
		rightArmModel[9] = new ModelRendererTurbo(this, 13, 229, textureX, textureY); // RightArm18
		rightArmModel[10] = new ModelRendererTurbo(this, 13, 229, textureX, textureY); // RightArm19
		rightArmModel[11] = new ModelRendererTurbo(this, 61, 133, textureX, textureY); // RightArm2
		rightArmModel[12] = new ModelRendererTurbo(this, 13, 229, textureX, textureY); // RightArm20
		rightArmModel[13] = new ModelRendererTurbo(this, 13, 229, textureX, textureY); // RightArm21
		rightArmModel[14] = new ModelRendererTurbo(this, 13, 229, textureX, textureY); // RightArm22
		rightArmModel[15] = new ModelRendererTurbo(this, 13, 229, textureX, textureY); // RightArm23
		rightArmModel[16] = new ModelRendererTurbo(this, 61, 133, textureX, textureY); // RightArm24
		rightArmModel[17] = new ModelRendererTurbo(this, 13, 229, textureX, textureY); // RightArm25
		rightArmModel[18] = new ModelRendererTurbo(this, 13, 229, textureX, textureY); // RightArm26
		rightArmModel[19] = new ModelRendererTurbo(this, 81, 249, textureX, textureY); // RightArm27
		rightArmModel[20] = new ModelRendererTurbo(this, 81, 236, textureX, textureY); // RightArm28
		rightArmModel[21] = new ModelRendererTurbo(this, 81, 224, textureX, textureY); // RightArm29
		rightArmModel[22] = new ModelRendererTurbo(this, 61, 133, textureX, textureY); // RightArm3
		rightArmModel[23] = new ModelRendererTurbo(this, 34, 245, textureX, textureY); // RightArm30
		rightArmModel[24] = new ModelRendererTurbo(this, 34, 245, textureX, textureY); // RightArm31
		rightArmModel[25] = new ModelRendererTurbo(this, 34, 245, textureX, textureY); // RightArm32
		rightArmModel[26] = new ModelRendererTurbo(this, 19, 291, textureX, textureY); // RightArm33
		rightArmModel[27] = new ModelRendererTurbo(this, 19, 291, textureX, textureY); // RightArm34
		rightArmModel[28] = new ModelRendererTurbo(this, 61, 133, textureX, textureY); // RightArm35
		rightArmModel[29] = new ModelRendererTurbo(this, 19, 291, textureX, textureY); // RightArm36
		rightArmModel[30] = new ModelRendererTurbo(this, 67, 234, textureX, textureY); // RightArm37
		rightArmModel[31] = new ModelRendererTurbo(this, 6, 250, textureX, textureY); // RightArm38
		rightArmModel[32] = new ModelRendererTurbo(this, 40, 262, textureX, textureY); // RightArm39
		rightArmModel[33] = new ModelRendererTurbo(this, 61, 133, textureX, textureY); // RightArm4
		rightArmModel[34] = new ModelRendererTurbo(this, 14, 263, textureX, textureY); // RightArm40
		rightArmModel[35] = new ModelRendererTurbo(this, 61, 263, textureX, textureY); // RightArm41
		rightArmModel[36] = new ModelRendererTurbo(this, 15, 270, textureX, textureY); // RightArm42
		rightArmModel[37] = new ModelRendererTurbo(this, 14, 277, textureX, textureY); // RightArm43
		rightArmModel[38] = new ModelRendererTurbo(this, 13, 284, textureX, textureY); // RightArm44
		rightArmModel[39] = new ModelRendererTurbo(this, 60, 289, textureX, textureY); // RightArm45
		rightArmModel[40] = new ModelRendererTurbo(this, 61, 152, textureX, textureY); // RightArm46
		rightArmModel[41] = new ModelRendererTurbo(this, 60, 284, textureX, textureY); // RightArm47
		rightArmModel[42] = new ModelRendererTurbo(this, 60, 278, textureX, textureY); // RightArm48
		rightArmModel[43] = new ModelRendererTurbo(this, 60, 272, textureX, textureY); // RightArm49
		rightArmModel[44] = new ModelRendererTurbo(this, 61, 133, textureX, textureY); // RightArm5
		rightArmModel[45] = new ModelRendererTurbo(this, 71, 273, textureX, textureY); // RightArm50
		rightArmModel[46] = new ModelRendererTurbo(this, 82, 273, textureX, textureY); // RightArm51
		rightArmModel[47] = new ModelRendererTurbo(this, 92, 274, textureX, textureY); // RightArm52
		rightArmModel[48] = new ModelRendererTurbo(this, 71, 280, textureX, textureY); // RightArm53
		rightArmModel[49] = new ModelRendererTurbo(this, 82, 280, textureX, textureY); // RightArm54
		rightArmModel[50] = new ModelRendererTurbo(this, 82, 285, textureX, textureY); // RightArm55
		rightArmModel[51] = new ModelRendererTurbo(this, 92, 286, textureX, textureY); // RightArm56
		rightArmModel[52] = new ModelRendererTurbo(this, 61, 133, textureX, textureY); // RightArm57
		rightArmModel[53] = new ModelRendererTurbo(this, 92, 280, textureX, textureY); // RightArm58
		rightArmModel[54] = new ModelRendererTurbo(this, 71, 285, textureX, textureY); // RightArm59
		rightArmModel[55] = new ModelRendererTurbo(this, 61, 165, textureX, textureY); // RightArm6
		rightArmModel[56] = new ModelRendererTurbo(this, 61, 180, textureX, textureY); // RightArm60
		rightArmModel[57] = new ModelRendererTurbo(this, 61, 133, textureX, textureY); // RightArm61
		rightArmModel[58] = new ModelRendererTurbo(this, 61, 207, textureX, textureY); // RightArm62
		rightArmModel[59] = new ModelRendererTurbo(this, 13, 216, textureX, textureY); // RightArm7
		rightArmModel[60] = new ModelRendererTurbo(this, 13, 216, textureX, textureY); // RightArm8
		rightArmModel[61] = new ModelRendererTurbo(this, 13, 216, textureX, textureY); // RightArm9

		rightArmModel[0].addShapeBox(7.5F, 5F, 12F, 2, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -3F); // RightArm1
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-5.5F, -2F, 7F, 11, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm10
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
		rightArmModel[1].rotateAngleZ = -0.31415927F;

		rightArmModel[2].addShapeBox(-5.5F, -2F, 4F, 11, 4, 3, 0F,-3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm11
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
		rightArmModel[2].rotateAngleZ = -0.31415927F;

		rightArmModel[3].addShapeBox(-5.5F, 2F, 4F, 11, 4, 3, 0F,-3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -4F, 0F, -3.5F, -4F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // RightArm12
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);
		rightArmModel[3].rotateAngleZ = -0.31415927F;

		rightArmModel[4].addShapeBox(7.5F, -2F, 12F, 2, 3, 10, 0F,0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // RightArm13
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-5.5F, -6F, 7F, 11, 4, 5, 0F,-3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm14
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);
		rightArmModel[5].rotateAngleZ = -0.31415927F;

		rightArmModel[6].addShapeBox(-5.5F, -6F, 4F, 11, 4, 3, 0F,-3.5F, -4F, 0F, -3.5F, -4F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm15
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);
		rightArmModel[6].rotateAngleZ = -0.31415927F;

		rightArmModel[7].addShapeBox(-3F, 0F, 6F, 6, 4, 7, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 4F, 0F, 2F, 4F, 0F, 5F, -6F, 0F, 5F, -6F); // RightArm16
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);
		rightArmModel[7].rotateAngleZ = -0.31415927F;

		rightArmModel[8].addShapeBox(-3F, 9F, 1F, 6, 6, 6, 0F,0F, 3F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -4.5F, 4F, .5F, -4.5F, 4F, .5F, 0F, -2.5F, .5F, 0F, -2.5F); // RightArm17
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);
		rightArmModel[8].rotateAngleZ = -0.31415927F;

		rightArmModel[9].addShapeBox(-5.5F, 7F, -2F, 11, 4, 5, 0F,-3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm18
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);
		rightArmModel[9].rotateAngleZ = -0.31415927F;

		rightArmModel[10].addShapeBox(-5.5F, 7F, -5F, 11, 4, 3, 0F,-3.5F, -4F, 0F, -3.5F, -4F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm19
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);
		rightArmModel[10].rotateAngleZ = -0.31415927F;

		rightArmModel[11].addShapeBox(7.5F, 1F, 12F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // RightArm2
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);

		rightArmModel[12].addShapeBox(-5.5F, 11F, -2F, 11, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm20
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);
		rightArmModel[12].rotateAngleZ = -0.31415927F;

		rightArmModel[13].addShapeBox(-5.5F, 11F, 3F, 11, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // RightArm21
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);
		rightArmModel[13].rotateAngleZ = -0.31415927F;

		rightArmModel[14].addShapeBox(-5.5F, 7F, 3F, 11, 4, 3, 0F,-3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, -4F, 0F, -3.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // RightArm22
		rightArmModel[14].setRotationPoint(0F, 0F, 0F);
		rightArmModel[14].rotateAngleZ = -0.31415927F;

		rightArmModel[15].addShapeBox(-5.5F, 11F, -5F, 11, 4, 3, 0F,-3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm23
		rightArmModel[15].setRotationPoint(0F, 0F, 0F);
		rightArmModel[15].rotateAngleZ = -0.31415927F;

		rightArmModel[16].addShapeBox(-7.5F, -4F, 14F, 15, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm24
		rightArmModel[16].setRotationPoint(0F, 0F, 0F);

		rightArmModel[17].addShapeBox(-5.5F, 15F, 3F, 11, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, -4F, 0F, -3.5F, -4F, 0F); // RightArm25
		rightArmModel[17].setRotationPoint(0F, 0F, 0F);
		rightArmModel[17].rotateAngleZ = -0.31415927F;

		rightArmModel[18].addShapeBox(-5.5F, 15F, -2F, 11, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // RightArm26
		rightArmModel[18].setRotationPoint(0F, 0F, 0F);
		rightArmModel[18].rotateAngleZ = -0.31415927F;

		rightArmModel[19].addShapeBox(-13.6F, 12F, 3F, 13, 5, 4, 0F,0F, 0F, 0F, 0F, -3F, 0F, -4F, -3F, 0F, -4F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 1F, -4F, 0F, 1F); // RightArm27
		rightArmModel[19].setRotationPoint(0F, 0F, 0F);
		rightArmModel[19].rotateAngleZ = 0.20943951F;

		rightArmModel[20].addShapeBox(-13.6F, 12F, -2F, 13, 5, 5, 0F,0F, 3F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // RightArm28
		rightArmModel[20].setRotationPoint(0F, 0F, 0F);
		rightArmModel[20].rotateAngleZ = 0.20943951F;

		rightArmModel[21].addShapeBox(-13.6F, 12F, -6F, 13, 5, 4, 0F,-4F, 3F, 0F, -4F, 0F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, -4F, 0F, 1F, -4F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // RightArm29
		rightArmModel[21].setRotationPoint(0F, 0F, 0F);
		rightArmModel[21].rotateAngleZ = 0.20943951F;

		rightArmModel[22].addShapeBox(-9.5F, 5F, 12F, 2, 3, 10, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -3F); // RightArm3
		rightArmModel[22].setRotationPoint(0F, 0F, 0F);

		rightArmModel[23].addShapeBox(-14.6F, 17F, -7F, 15, 8, 5, 0F,-5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -2F, -6F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F); // RightArm30
		rightArmModel[23].setRotationPoint(0F, 0F, 0F);
		rightArmModel[23].rotateAngleZ = 0.20943951F;

		rightArmModel[24].addShapeBox(-14.6F, 17F, -2F, 15, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // RightArm31
		rightArmModel[24].setRotationPoint(0F, 0F, 0F);
		rightArmModel[24].rotateAngleZ = 0.20943951F;

		rightArmModel[25].addShapeBox(-14.6F, 17F, 3F, 15, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, -2F, -6F, 0F, -2F); // RightArm32
		rightArmModel[25].setRotationPoint(0F, 0F, 0F);
		rightArmModel[25].rotateAngleZ = 0.20943951F;

		rightArmModel[26].addShapeBox(-13.1F, 25F, 3F, 12, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, .5F, -4F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, .5F, -4F, 0F, .5F); // RightArm33
		rightArmModel[26].setRotationPoint(0F, 0F, 0F);
		rightArmModel[26].rotateAngleZ = 0.20943951F;

		rightArmModel[27].addShapeBox(-13.1F, 25F, -2F, 12, 6, 5, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm34
		rightArmModel[27].setRotationPoint(0F, 0F, 0F);
		rightArmModel[27].rotateAngleZ = 0.20943951F;

		rightArmModel[28].addShapeBox(-7.5F, -10F, 14F, 15, 6, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -4F, -1F, -3F, -4F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm35
		rightArmModel[28].setRotationPoint(0F, 0F, 0F);

		rightArmModel[29].addShapeBox(-13.1F, 25F, -5F, 12, 6, 3, 0F,-4F, 2F, .5F, -4F, 0F, .5F, 0F, 0F, 0F, 0F, 2F, 0F, -4F, 0F, .5F, -4F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm36
		rightArmModel[29].setRotationPoint(0F, 0F, 0F);
		rightArmModel[29].rotateAngleZ = 0.20943951F;

		rightArmModel[30].addShapeBox(-5.5F, 23F, 3F, 1, 5, 4, 0F,-4F, 0F, 0F, 3F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, -4F, 0F, 0F, 3F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F); // RightArm37
		rightArmModel[30].setRotationPoint(0F, 0F, 0F);
		rightArmModel[30].rotateAngleZ = 0.20943951F;

		rightArmModel[31].addBox(-3.1F, 31F, -2F, 6, 2, 5, 0F); // RightArm38
		rightArmModel[31].setRotationPoint(0F, 0F, 0F);

		rightArmModel[32].addShapeBox(-3.1F, 33F, -2F, 7, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm39
		rightArmModel[32].setRotationPoint(0F, 0F, 0F);

		rightArmModel[33].addShapeBox(-9.5F, 1F, 12F, 2, 4, 10, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // RightArm4
		rightArmModel[33].setRotationPoint(0F, 0F, 0F);

		rightArmModel[34].addShapeBox(-3.1F, 33F, 0F, 7, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm40
		rightArmModel[34].setRotationPoint(0F, 0F, 0F);

		rightArmModel[35].addShapeBox(-3.1F, 33F, -3F, 7, 6, 1, 0F,-.5F, -1F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm41
		rightArmModel[35].setRotationPoint(0F, 0F, 0F);

		rightArmModel[36].addShapeBox(1.9F, 35F, 1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, 1F, 0F, -.5F, 1F, 0F, .5F, -1F, 0F, .5F); // RightArm42
		rightArmModel[36].setRotationPoint(0F, 0F, 0F);

		rightArmModel[37].addShapeBox(2.9F, 37F, 1.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, .5F, 0F); // RightArm43
		rightArmModel[37].setRotationPoint(0F, 0F, 0F);

		rightArmModel[38].addShapeBox(0.9F, 37.5F, 1.5F, 2, 2, 2, 0F,0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F); // RightArm44
		rightArmModel[38].setRotationPoint(0F, 0F, 0F);

		rightArmModel[39].addShapeBox(2F, 41.5F, 1F, 2, 2, 2, 0F,-.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.5F, -.5F, -.2F, -.5F, -.5F); // RightArm45
		rightArmModel[39].setRotationPoint(0F, 0F, 0F);

		rightArmModel[40].addShapeBox(-8F, -10.5F, 13F, 16, 7, 3, 0F,-3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm46
		rightArmModel[40].setRotationPoint(0F, 0F, 0F);

		rightArmModel[41].addShapeBox(2F, 41F, 0F, 2, 2, 1, 0F,-.2F, .5F, 0F, -.2F, .5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, .5F, 0F, -.2F, .5F, 0F); // RightArm47
		rightArmModel[41].setRotationPoint(0F, 0F, 0F);

		rightArmModel[42].addShapeBox(2F, 40F, -2F, 2, 2, 2, 0F,-.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.5F, -.5F, -.2F, -.5F, -.5F, -.2F, 1F, 0F, -.2F, 1F, 0F); // RightArm48
		rightArmModel[42].setRotationPoint(0F, 0F, 0F);

		rightArmModel[43].addShapeBox(2F, 38F, -2F, 2, 2, 2, 0F,-.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // RightArm49
		rightArmModel[43].setRotationPoint(0F, 0F, 0F);

		rightArmModel[44].addShapeBox(-9.5F, -2F, 12F, 2, 3, 10, 0F,0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // RightArm5
		rightArmModel[44].setRotationPoint(0F, 0F, 0F);

		rightArmModel[45].addShapeBox(0.3F, 38F, -2F, 2, 3, 2, 0F,-.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 2F, 0F, -.2F, 2F, 0F); // RightArm50
		rightArmModel[45].setRotationPoint(0F, 0F, 0F);

		rightArmModel[46].addShapeBox(-1.4F, 37.5F, -2F, 2, 3, 2, 0F,-.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 2F, 0F, -.2F, 2F, 0F); // RightArm51
		rightArmModel[46].setRotationPoint(0F, 0F, 0F);

		rightArmModel[47].addShapeBox(-3.1F, 38F, -2F, 2, 2, 2, 0F,-.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 2F, 0F, -.2F, 2F, 0F); // RightArm52
		rightArmModel[47].setRotationPoint(0F, 0F, 0F);

		rightArmModel[48].addShapeBox(0.3F, 41F, 0F, 2, 2, 2, 0F,-.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 1F, -.2F, 0F, 1F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // RightArm53
		rightArmModel[48].setRotationPoint(0F, 0F, 0F);

		rightArmModel[49].addShapeBox(-1.4F, 40.5F, 0F, 2, 2, 2, 0F,-.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 1F, -.2F, 0F, 1F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // RightArm54
		rightArmModel[49].setRotationPoint(0F, 0F, 0F);

		rightArmModel[50].addShapeBox(-3.1F, 40F, 0F, 2, 2, 2, 0F,-.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 1F, -.2F, 0F, 1F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // RightArm55
		rightArmModel[50].setRotationPoint(0F, 0F, 0F);

		rightArmModel[51].addShapeBox(-3.1F, 38F, 1F, 2, 2, 2, 0F,-.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // RightArm56
		rightArmModel[51].setRotationPoint(0F, 0F, 0F);

		rightArmModel[52].addShapeBox(-7.5F, -10F, 7F, 15, 6, 7, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm57
		rightArmModel[52].setRotationPoint(0F, 0F, 0F);

		rightArmModel[53].addShapeBox(-1.4F, 38.5F, 1F, 2, 2, 2, 0F,-.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // RightArm58
		rightArmModel[53].setRotationPoint(0F, 0F, 0F);

		rightArmModel[54].addShapeBox(0.3F, 39F, 1F, 2, 2, 2, 0F,-.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // RightArm59
		rightArmModel[54].setRotationPoint(0F, 0F, 0F);

		rightArmModel[55].addBox(-8F, -3.5F, 13F, 16, 8, 3, 0F); // RightArm6
		rightArmModel[55].setRotationPoint(0F, 0F, 0F);

		rightArmModel[56].addShapeBox(-7.5F, -10F, 2F, 15, 6, 5, 0F,-5F, -2F, -2F, -5F, -2F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm60
		rightArmModel[56].setRotationPoint(0F, 0F, 0F);

		rightArmModel[57].addShapeBox(-7.5F, -4F, 7F, 15, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm61
		rightArmModel[57].setRotationPoint(0F, 0F, 0F);

		rightArmModel[58].addShapeBox(-7.5F, -4F, 2F, 15, 3, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm62
		rightArmModel[58].setRotationPoint(0F, 0F, 0F);

		rightArmModel[59].addShapeBox(-5.5F, 2F, 7F, 11, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // RightArm7
		rightArmModel[59].setRotationPoint(0F, 0F, 0F);
		rightArmModel[59].rotateAngleZ = -0.31415927F;

		rightArmModel[60].addShapeBox(-5.5F, 2F, 13F, 11, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, -4F, 0F, -3.5F, -4F, 0F); // RightArm8
		rightArmModel[60].setRotationPoint(0F, 0F, -1F);
		rightArmModel[60].rotateAngleZ = -0.31415927F;

		rightArmModel[61].addShapeBox(-5.5F, -2F, 13F, 11, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // RightArm9
		rightArmModel[61].setRotationPoint(0F, 0F, -1F);
		rightArmModel[61].rotateAngleZ = -0.31415927F;
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 212, 175, textureX, textureY); // LeftLeg1
		leftLegModel[1] = new ModelRendererTurbo(this, 230, 126, textureX, textureY); // LeftLeg10
		leftLegModel[2] = new ModelRendererTurbo(this, 230, 126, textureX, textureY); // LeftLeg11
		leftLegModel[3] = new ModelRendererTurbo(this, 217, 232, textureX, textureY); // LeftLeg12
		leftLegModel[4] = new ModelRendererTurbo(this, 217, 232, textureX, textureY); // LeftLeg13
		leftLegModel[5] = new ModelRendererTurbo(this, 248, 231, textureX, textureY); // LeftLeg14
		leftLegModel[6] = new ModelRendererTurbo(this, 267, 231, textureX, textureY); // LeftLeg15
		leftLegModel[7] = new ModelRendererTurbo(this, 290, 231, textureX, textureY); // LeftLeg16
		leftLegModel[8] = new ModelRendererTurbo(this, 290, 231, textureX, textureY); // LeftLeg17
		leftLegModel[9] = new ModelRendererTurbo(this, 267, 231, textureX, textureY); // LeftLeg18
		leftLegModel[10] = new ModelRendererTurbo(this, 248, 231, textureX, textureY); // LeftLeg19
		leftLegModel[11] = new ModelRendererTurbo(this, 230, 126, textureX, textureY); // LeftLeg2
		leftLegModel[12] = new ModelRendererTurbo(this, 154, 272, textureX, textureY); // LeftLeg20
		leftLegModel[13] = new ModelRendererTurbo(this, 181, 257, textureX, textureY); // LeftLeg21
		leftLegModel[14] = new ModelRendererTurbo(this, 282, 274, textureX, textureY); // LeftLeg22
		leftLegModel[15] = new ModelRendererTurbo(this, 256, 82, textureX, textureY); // LeftLeg23
		leftLegModel[16] = new ModelRendererTurbo(this, 277, 82, textureX, textureY); // LeftLeg24
		leftLegModel[17] = new ModelRendererTurbo(this, 255, 95, textureX, textureY); // LeftLeg25
		leftLegModel[18] = new ModelRendererTurbo(this, 223, 279, textureX, textureY); // LeftLeg26
		leftLegModel[19] = new ModelRendererTurbo(this, 277, 95, textureX, textureY); // LeftLeg27
		leftLegModel[20] = new ModelRendererTurbo(this, 181, 257, textureX, textureY); // LeftLeg28
		leftLegModel[21] = new ModelRendererTurbo(this, 230, 126, textureX, textureY); // LeftLeg29
		leftLegModel[22] = new ModelRendererTurbo(this, 230, 126, textureX, textureY); // LeftLeg3
		leftLegModel[23] = new ModelRendererTurbo(this, 198, 301, textureX, textureY); // LeftLeg30
		leftLegModel[24] = new ModelRendererTurbo(this, 282, 274, textureX, textureY); // LeftLeg31
		leftLegModel[25] = new ModelRendererTurbo(this, 192, 281, textureX, textureY); // LeftLeg32
		leftLegModel[26] = new ModelRendererTurbo(this, 192, 281, textureX, textureY); // LeftLeg33
		leftLegModel[27] = new ModelRendererTurbo(this, 192, 281, textureX, textureY); // LeftLeg34
		leftLegModel[28] = new ModelRendererTurbo(this, 192, 281, textureX, textureY); // LeftLeg35
		leftLegModel[29] = new ModelRendererTurbo(this, 192, 281, textureX, textureY); // LeftLeg36
		leftLegModel[30] = new ModelRendererTurbo(this, 192, 281, textureX, textureY); // LeftLeg37
		leftLegModel[31] = new ModelRendererTurbo(this, 192, 281, textureX, textureY); // LeftLeg38
		leftLegModel[32] = new ModelRendererTurbo(this, 207, 259, textureX, textureY); // LeftLeg39
		leftLegModel[33] = new ModelRendererTurbo(this, 251, 167, textureX, textureY); // LeftLeg4
		leftLegModel[34] = new ModelRendererTurbo(this, 192, 281, textureX, textureY); // LeftLeg40
		leftLegModel[35] = new ModelRendererTurbo(this, 223, 279, textureX, textureY); // LeftLeg42
		leftLegModel[36] = new ModelRendererTurbo(this, 223, 279, textureX, textureY); // LeftLeg43
		leftLegModel[37] = new ModelRendererTurbo(this, 154, 291, textureX, textureY); // LeftLeg44
		leftLegModel[38] = new ModelRendererTurbo(this, 289, 283, textureX, textureY); // LeftLeg46
		leftLegModel[39] = new ModelRendererTurbo(this, 230, 126, textureX, textureY); // LeftLeg5
		leftLegModel[40] = new ModelRendererTurbo(this, 223, 279, textureX, textureY); // LeftLeg55
		leftLegModel[41] = new ModelRendererTurbo(this, 223, 279, textureX, textureY); // LeftLeg56
		leftLegModel[42] = new ModelRendererTurbo(this, 198, 301, textureX, textureY); // LeftLeg59
		leftLegModel[43] = new ModelRendererTurbo(this, 251, 196, textureX, textureY); // LeftLeg6
		leftLegModel[44] = new ModelRendererTurbo(this, 192, 281, textureX, textureY); // LeftLeg60
		leftLegModel[45] = new ModelRendererTurbo(this, 223, 279, textureX, textureY); // LeftLeg61
		leftLegModel[46] = new ModelRendererTurbo(this, 192, 281, textureX, textureY); // LeftLeg62
		leftLegModel[47] = new ModelRendererTurbo(this, 232, 297, textureX, textureY); // LeftLeg63
		leftLegModel[48] = new ModelRendererTurbo(this, 232, 297, textureX, textureY); // LeftLeg64
		leftLegModel[49] = new ModelRendererTurbo(this, 232, 297, textureX, textureY); // LeftLeg65
		leftLegModel[50] = new ModelRendererTurbo(this, 192, 281, textureX, textureY); // LeftLeg66
		leftLegModel[51] = new ModelRendererTurbo(this, 232, 297, textureX, textureY); // LeftLeg67
		leftLegModel[52] = new ModelRendererTurbo(this, 232, 297, textureX, textureY); // LeftLeg68
		leftLegModel[53] = new ModelRendererTurbo(this, 192, 281, textureX, textureY); // LeftLeg69
		leftLegModel[54] = new ModelRendererTurbo(this, 244, 317, textureX, textureY); // LeftLeg7
		leftLegModel[55] = new ModelRendererTurbo(this, 232, 297, textureX, textureY); // LeftLeg70
		leftLegModel[56] = new ModelRendererTurbo(this, 232, 297, textureX, textureY); // LeftLeg71
		leftLegModel[57] = new ModelRendererTurbo(this, 232, 297, textureX, textureY); // LeftLeg72
		leftLegModel[58] = new ModelRendererTurbo(this, 192, 281, textureX, textureY); // LeftLeg73
		leftLegModel[59] = new ModelRendererTurbo(this, 232, 297, textureX, textureY); // LeftLeg74
		leftLegModel[60] = new ModelRendererTurbo(this, 232, 297, textureX, textureY); // LeftLeg75
		leftLegModel[61] = new ModelRendererTurbo(this, 230, 126, textureX, textureY); // LeftLeg8
		leftLegModel[62] = new ModelRendererTurbo(this, 192, 197, textureX, textureY); // LeftLeg9

		leftLegModel[0].addShapeBox(-4F, -4F, 0F, 8, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg1
		leftLegModel[0].setRotationPoint(1F, -53F, 13F);

		leftLegModel[1].addShapeBox(2F, 15F, -7F, 2, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F); // LeftLeg10
		leftLegModel[1].setRotationPoint(1F, -53F, 13F);

		leftLegModel[2].addShapeBox(-7F, 4F, -7F, 4, 11, 22, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // LeftLeg11
		leftLegModel[2].setRotationPoint(1F, -53F, 13F);

		leftLegModel[3].addShapeBox(6F, 14F, 0F, 4, 14, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0F); // LeftLeg12
		leftLegModel[3].setRotationPoint(0F, -53F, 13F);

		leftLegModel[4].addShapeBox(-4F, 14F, 0F, 4, 14, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0F); // LeftLeg13
		leftLegModel[4].setRotationPoint(0F, -53F, 13F);

		leftLegModel[5].addShapeBox(6F, 14F, 8F, 4, 14, 3, 0F,0F, 0F, 0F, 0F, -4F, 0F, -2F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -5F, 0F, 0F, -3F, -0F); // LeftLeg14
		leftLegModel[5].setRotationPoint(0F, -53F, 13F);

		leftLegModel[6].addShapeBox(0F, 14F, 8F, 6, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -0F); // LeftLeg15
		leftLegModel[6].setRotationPoint(0F, -53F, 13F);

		leftLegModel[7].addShapeBox(-4F, 14F, 8F, 4, 14, 3, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -5F, -0F); // LeftLeg16
		leftLegModel[7].setRotationPoint(0F, -53F, 13F);

		leftLegModel[8].addShapeBox(-4F, 14F, -3F, 4, 14, 3, 0F,-2F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -5F, -0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // LeftLeg17
		leftLegModel[8].setRotationPoint(0F, -53F, 13F);

		leftLegModel[9].addShapeBox(0F, 14F, -3F, 6, 14, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg18
		leftLegModel[9].setRotationPoint(0F, -53F, 13F);

		leftLegModel[10].addShapeBox(6F, 14F, -3F, 4, 14, 3, 0F,0F, -3F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, -0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // LeftLeg19
		leftLegModel[10].setRotationPoint(0F, -53F, 13F);

		leftLegModel[11].addShapeBox(-3F, 4F, -7F, 7, 11, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0F); // LeftLeg2
		leftLegModel[11].setRotationPoint(1F, -53F, 13F);

		leftLegModel[12].addShapeBox(-1F, 25F, 0F, 8, 6, 8, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg20
		leftLegModel[12].setRotationPoint(0F, -53F, 13F);

		leftLegModel[13].addShapeBox(17F, 19.5F, 0F, 4, 6, 8, 0F,0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -1F, -2F, 1F, -3F, -2F, 01F, -3F, 0F, 0F, -1F); // LeftLeg21
		leftLegModel[13].setRotationPoint(0F, -53F, 13F);

		leftLegModel[14].addShapeBox(-4F, 35F, 0.5F, 2, 5, 2, 0F,1F, -1F, 1F, -2F, -.5F, 1F, -2F, 0F, -2F, 1F, -.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg22
		leftLegModel[14].setRotationPoint(0F, -53F, 13F);

		leftLegModel[15].addShapeBox(-4F, 11F, -10F, 4, 7, 3, 0F,-1F, -2F, -2F, -1F, -2F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg23
		leftLegModel[15].setRotationPoint(1F, -53F, 13F);
		leftLegModel[15].rotateAngleZ = 0.87266463F;

		leftLegModel[16].addShapeBox(-4F, 11F, 15F, 4, 7, 3, 0F,0F, 0F, 2F, 0F, 0F, 2F, -1F, -2F, -2F, -1F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F); // LeftLeg24
		leftLegModel[16].setRotationPoint(1F, -53F, 13F);
		leftLegModel[16].rotateAngleZ = 0.87266463F;

		leftLegModel[17].addShapeBox(-4F, 11F, -7F, 4, 8, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // LeftLeg25
		leftLegModel[17].setRotationPoint(1F, -53F, 13F);
		leftLegModel[17].rotateAngleZ = 0.87266463F;

		leftLegModel[18].addShapeBox(-1F, 40F, -5F, 2, 8, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // LeftLeg26
		leftLegModel[18].setRotationPoint(0F, -53F, 13F);

		leftLegModel[19].addShapeBox(-4F, 11F, 13F, 4, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // LeftLeg27
		leftLegModel[19].setRotationPoint(1F, -53F, 13F);
		leftLegModel[19].rotateAngleZ = 0.87266463F;

		leftLegModel[20].addShapeBox(13F, 19.5F, 0F, 4, 5, 8, 0F,0F, 0F, 2.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2.5F, -2F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, -2F, 0F, 0F); // LeftLeg28
		leftLegModel[20].setRotationPoint(0F, -53F, 13F);

		leftLegModel[21].addShapeBox(-3F, -7F, 10F, 7, 11, 5, 0F,-3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -3F, -1F, -5F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0F); // LeftLeg29
		leftLegModel[21].setRotationPoint(1F, -53F, 13F);

		leftLegModel[22].addShapeBox(4F, -7F, -7F, 9, 11, 22, 0F,0F, 0F, -5F, 0F, -4F, -7F, 0F, -4F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // LeftLeg3
		leftLegModel[22].setRotationPoint(1F, -53F, 13F);

		leftLegModel[23].addShapeBox(-3.5F, 43F, 11.5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg30
		leftLegModel[23].setRotationPoint(0F, -53F, 13F);

		leftLegModel[24].addShapeBox(-4F, 35F, 5.5F, 2, 5, 2, 0F,1F, -.5F, -2F, -2F, 0F, -2F, -2F, -.5F, 1F, 1F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg31
		leftLegModel[24].setRotationPoint(0F, -53F, 13F);

		leftLegModel[25].addShapeBox(-5F, 42F, 5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // LeftLeg32
		leftLegModel[25].setRotationPoint(0F, -53F, 13F);

		leftLegModel[26].addShapeBox(-5F, 42F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // LeftLeg33
		leftLegModel[26].setRotationPoint(0F, -53F, 13F);

		leftLegModel[27].addShapeBox(-4F, 37F, -2F, 3, 14, 2, 0F,-1.5F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.5F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // LeftLeg34
		leftLegModel[27].setRotationPoint(0F, -53F, 13F);

		leftLegModel[28].addShapeBox(-1F, 37F, -2F, 8, 14, 2, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg35
		leftLegModel[28].setRotationPoint(0F, -53F, 13F);

		leftLegModel[29].addShapeBox(7F, 37F, -2F, 3, 14, 2, 0F,0F, -3F, 0F, -1.5F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.5F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // LeftLeg36
		leftLegModel[29].setRotationPoint(0F, -53F, 13F);

		leftLegModel[30].addShapeBox(10F, 40F, 0F, 6, 4, 8, 0F,0F, 0F, 0F, .5F, -3F, -2F, .5F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // LeftLeg37
		leftLegModel[30].setRotationPoint(0F, -53F, 13F);

		leftLegModel[31].addShapeBox(10F, 44F, 5F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, -1F, 0F, 3F, 0F); // LeftLeg38
		leftLegModel[31].setRotationPoint(0F, -53F, 13F);

		leftLegModel[32].addShapeBox(7F, 19.5F, 0F, 8, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0F); // LeftLeg39
		leftLegModel[32].setRotationPoint(0F, -53F, 13F);

		leftLegModel[33].addShapeBox(13F, -3F, -5F, 8, 7, 18, 0F,0F, 0F, -5F, 0F, -7F, -6F, 0F, -7F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // LeftLeg4
		leftLegModel[33].setRotationPoint(1F, -53F, 13F);

		leftLegModel[34].addShapeBox(10F, 44F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -2F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // LeftLeg40
		leftLegModel[34].setRotationPoint(0F, -53F, 13F);

		leftLegModel[35].addShapeBox(-1F, 40F, 10F, 2, 8, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // LeftLeg42
		leftLegModel[35].setRotationPoint(0F, -53F, 13F);

		leftLegModel[36].addShapeBox(5F, 40F, -5F, 2, 8, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // LeftLeg43
		leftLegModel[36].setRotationPoint(0F, -53F, 13F);

		leftLegModel[37].addShapeBox(-1F, 30F, 0F, 8, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg44
		leftLegModel[37].setRotationPoint(0F, -53F, 13F);

		leftLegModel[38].addShapeBox(5F, 45F, 1.5F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg46
		leftLegModel[38].setRotationPoint(0F, -53F, 13F);

		leftLegModel[39].addShapeBox(4F, 4F, -7F, 9, 11, 22, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // LeftLeg5
		leftLegModel[39].setRotationPoint(1F, -53F, 13F);

		leftLegModel[40].addShapeBox(1F, 40F, 10F, 4, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg55
		leftLegModel[40].setRotationPoint(0F, -53F, 13F);

		leftLegModel[41].addShapeBox(1F, 40F, -5F, 4, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg56
		leftLegModel[41].setRotationPoint(0F, -53F, 13F);

		leftLegModel[42].addShapeBox(-3.5F, 43F, -4.5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg59
		leftLegModel[42].setRotationPoint(0F, -53F, 13F);

		leftLegModel[43].addShapeBox(13F, 4F, -5F, 8, 11, 18, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -6F, 3F, 0F, -6F, 0F, 0F, 0F); // LeftLeg6
		leftLegModel[43].setRotationPoint(1F, -53F, 13F);

		leftLegModel[44].addShapeBox(7F, 37F, 8F, 3, 14, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, -1.5F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.5F, -5F, 0F, 0F, -3F, 0F); // LeftLeg60
		leftLegModel[44].setRotationPoint(0F, -53F, 13F);

		leftLegModel[45].addShapeBox(5F, 40F, 10F, 2, 8, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // LeftLeg61
		leftLegModel[45].setRotationPoint(0F, -53F, 13F);

		leftLegModel[46].addShapeBox(-1F, 37F, 8F, 8, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // LeftLeg62
		leftLegModel[46].setRotationPoint(0F, -53F, 13F);

		leftLegModel[47].addShapeBox(0F, 37F, 11F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg63
		leftLegModel[47].setRotationPoint(0F, -53F, 13F);

		leftLegModel[48].addShapeBox(8F, 40F, -5F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg64
		leftLegModel[48].setRotationPoint(0F, -53F, 13F);

		leftLegModel[49].addShapeBox(6F, 37F, -5F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F); // LeftLeg65
		leftLegModel[49].setRotationPoint(0F, -53F, 13F);

		leftLegModel[50].addShapeBox(-4F, 37F, 8F, 3, 14, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.5F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.5F, -5F, 0F); // LeftLeg66
		leftLegModel[50].setRotationPoint(0F, -53F, 13F);

		leftLegModel[51].addShapeBox(6F, 37F, 11F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F); // LeftLeg67
		leftLegModel[51].setRotationPoint(0F, -53F, 13F);

		leftLegModel[52].addShapeBox(0F, 37F, -5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg68
		leftLegModel[52].setRotationPoint(0F, -53F, 13F);

		leftLegModel[53].addShapeBox(-5F, 37F, 0F, 4, 5, 8, 0F,-.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg69
		leftLegModel[53].setRotationPoint(0F, -53F, 13F);

		leftLegModel[54].addShapeBox(13F, 15F, -5F, 8, 4, 18, 0F,0F, 0F, 0F, 3F, 0F, -6F, 3F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -2F); // LeftLeg7
		leftLegModel[54].setRotationPoint(1F, -53F, 13F);

		leftLegModel[55].addShapeBox(8F, 40F, 11F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg70
		leftLegModel[55].setRotationPoint(0F, -53F, 13F);

		leftLegModel[56].addShapeBox(-3F, 37F, -5F, 3, 1, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F); // LeftLeg71
		leftLegModel[56].setRotationPoint(0F, -53F, 13F);

		leftLegModel[57].addShapeBox(-3F, 37F, 11F, 3, 1, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F); // LeftLeg72
		leftLegModel[57].setRotationPoint(0F, -53F, 13F);

		leftLegModel[58].addShapeBox(7F, 37F, 0F, 3, 6, 8, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg73
		leftLegModel[58].setRotationPoint(0F, -53F, 13F);

		leftLegModel[59].addShapeBox(-3F, 40F, 11F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg74
		leftLegModel[59].setRotationPoint(0F, -53F, 13F);

		leftLegModel[60].addShapeBox(-3F, 40F, -5F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg75
		leftLegModel[60].setRotationPoint(0F, -53F, 13F);

		leftLegModel[61].addShapeBox(4F, 15F, -7F, 5, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F); // LeftLeg8
		leftLegModel[61].setRotationPoint(1F, -53F, 13F);

		leftLegModel[62].addShapeBox(9F, 15F, -7F, 4, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -2F); // LeftLeg9
		leftLegModel[62].setRotationPoint(1F, -53F, 13F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 251, 167, textureX, textureY); // RightLeg1
		rightLegModel[1] = new ModelRendererTurbo(this, 230, 126, textureX, textureY); // RightLeg10
		rightLegModel[2] = new ModelRendererTurbo(this, 230, 126, textureX, textureY); // RightLeg11
		rightLegModel[3] = new ModelRendererTurbo(this, 230, 126, textureX, textureY); // RightLeg12
		rightLegModel[4] = new ModelRendererTurbo(this, 217, 232, textureX, textureY); // RightLeg13
		rightLegModel[5] = new ModelRendererTurbo(this, 248, 231, textureX, textureY); // RightLeg14
		rightLegModel[6] = new ModelRendererTurbo(this, 267, 231, textureX, textureY); // RightLeg15
		rightLegModel[7] = new ModelRendererTurbo(this, 290, 231, textureX, textureY); // RightLeg16
		rightLegModel[8] = new ModelRendererTurbo(this, 217, 232, textureX, textureY); // RightLeg17
		rightLegModel[9] = new ModelRendererTurbo(this, 290, 231, textureX, textureY); // RightLeg18
		rightLegModel[10] = new ModelRendererTurbo(this, 267, 231, textureX, textureY); // RightLeg19
		rightLegModel[11] = new ModelRendererTurbo(this, 251, 196, textureX, textureY); // RightLeg2
		rightLegModel[12] = new ModelRendererTurbo(this, 248, 231, textureX, textureY); // RightLeg20
		rightLegModel[13] = new ModelRendererTurbo(this, 207, 259, textureX, textureY); // RightLeg21
		rightLegModel[14] = new ModelRendererTurbo(this, 181, 257, textureX, textureY); // RightLeg22
		rightLegModel[15] = new ModelRendererTurbo(this, 181, 257, textureX, textureY); // RightLeg23
		rightLegModel[16] = new ModelRendererTurbo(this, 277, 82, textureX, textureY); // RightLeg24
		rightLegModel[17] = new ModelRendererTurbo(this, 277, 95, textureX, textureY); // RightLeg25
		rightLegModel[18] = new ModelRendererTurbo(this, 255, 95, textureX, textureY); // RightLeg26
		rightLegModel[19] = new ModelRendererTurbo(this, 256, 82, textureX, textureY); // RightLeg27
		rightLegModel[20] = new ModelRendererTurbo(this, 154, 272, textureX, textureY); // RightLeg28
		rightLegModel[21] = new ModelRendererTurbo(this, 154, 291, textureX, textureY); // RightLeg29
		rightLegModel[22] = new ModelRendererTurbo(this, 244, 317, textureX, textureY); // RightLeg3
		rightLegModel[23] = new ModelRendererTurbo(this, 192, 281, textureX, textureY); // RightLeg30
		rightLegModel[24] = new ModelRendererTurbo(this, 192, 281, textureX, textureY); // RightLeg31
		rightLegModel[25] = new ModelRendererTurbo(this, 192, 281, textureX, textureY); // RightLeg32
		rightLegModel[26] = new ModelRendererTurbo(this, 192, 281, textureX, textureY); // RightLeg33
		rightLegModel[27] = new ModelRendererTurbo(this, 192, 281, textureX, textureY); // RightLeg34
		rightLegModel[28] = new ModelRendererTurbo(this, 192, 281, textureX, textureY); // RightLeg35
		rightLegModel[29] = new ModelRendererTurbo(this, 192, 281, textureX, textureY); // RightLeg36
		rightLegModel[30] = new ModelRendererTurbo(this, 282, 274, textureX, textureY); // RightLeg37
		rightLegModel[31] = new ModelRendererTurbo(this, 282, 274, textureX, textureY); // RightLeg38
		rightLegModel[32] = new ModelRendererTurbo(this, 192, 281, textureX, textureY); // RightLeg39
		rightLegModel[33] = new ModelRendererTurbo(this, 192, 197, textureX, textureY); // RightLeg4
		rightLegModel[34] = new ModelRendererTurbo(this, 192, 281, textureX, textureY); // RightLeg40
		rightLegModel[35] = new ModelRendererTurbo(this, 192, 281, textureX, textureY); // RightLeg41
		rightLegModel[36] = new ModelRendererTurbo(this, 192, 281, textureX, textureY); // RightLeg42
		rightLegModel[37] = new ModelRendererTurbo(this, 192, 281, textureX, textureY); // RightLeg43
		rightLegModel[38] = new ModelRendererTurbo(this, 192, 281, textureX, textureY); // RightLeg44
		rightLegModel[39] = new ModelRendererTurbo(this, 230, 126, textureX, textureY); // RightLeg5
		rightLegModel[40] = new ModelRendererTurbo(this, 289, 283, textureX, textureY); // RightLeg51
		rightLegModel[41] = new ModelRendererTurbo(this, 223, 279, textureX, textureY); // RightLeg58
		rightLegModel[42] = new ModelRendererTurbo(this, 223, 279, textureX, textureY); // RightLeg59
		rightLegModel[43] = new ModelRendererTurbo(this, 230, 126, textureX, textureY); // RightLeg6
		rightLegModel[44] = new ModelRendererTurbo(this, 223, 279, textureX, textureY); // RightLeg60
		rightLegModel[45] = new ModelRendererTurbo(this, 198, 301, textureX, textureY); // RightLeg61
		rightLegModel[46] = new ModelRendererTurbo(this, 232, 297, textureX, textureY); // RightLeg62
		rightLegModel[47] = new ModelRendererTurbo(this, 232, 297, textureX, textureY); // RightLeg63
		rightLegModel[48] = new ModelRendererTurbo(this, 232, 297, textureX, textureY); // RightLeg64
		rightLegModel[49] = new ModelRendererTurbo(this, 232, 297, textureX, textureY); // RightLeg65
		rightLegModel[50] = new ModelRendererTurbo(this, 232, 297, textureX, textureY); // RightLeg66
		rightLegModel[51] = new ModelRendererTurbo(this, 223, 279, textureX, textureY); // RightLeg67
		rightLegModel[52] = new ModelRendererTurbo(this, 223, 279, textureX, textureY); // RightLeg68
		rightLegModel[53] = new ModelRendererTurbo(this, 223, 279, textureX, textureY); // RightLeg69
		rightLegModel[54] = new ModelRendererTurbo(this, 230, 126, textureX, textureY); // RightLeg7
		rightLegModel[55] = new ModelRendererTurbo(this, 198, 301, textureX, textureY); // RightLeg70
		rightLegModel[56] = new ModelRendererTurbo(this, 232, 297, textureX, textureY); // RightLeg71
		rightLegModel[57] = new ModelRendererTurbo(this, 232, 297, textureX, textureY); // RightLeg72
		rightLegModel[58] = new ModelRendererTurbo(this, 232, 297, textureX, textureY); // RightLeg73
		rightLegModel[59] = new ModelRendererTurbo(this, 232, 297, textureX, textureY); // RightLeg74
		rightLegModel[60] = new ModelRendererTurbo(this, 232, 297, textureX, textureY); // RightLeg75
		rightLegModel[61] = new ModelRendererTurbo(this, 230, 126, textureX, textureY); // RightLeg8
		rightLegModel[62] = new ModelRendererTurbo(this, 212, 175, textureX, textureY); // RightLeg9

		rightLegModel[0].addShapeBox(13F, -3F, -13F, 8, 7, 18, 0F,0F, 0F, -5F, 0F, -7F, -6F, 0F, -7F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // RightLeg1
		rightLegModel[0].setRotationPoint(1F, -53F, -13F);

		rightLegModel[1].addShapeBox(-7F, 4F, -15F, 4, 11, 22, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // RightLeg10
		rightLegModel[1].setRotationPoint(1F, -53F, -13F);

		rightLegModel[2].addShapeBox(2F, 15F, -15F, 2, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F); // RightLeg11
		rightLegModel[2].setRotationPoint(1F, -53F, -13F);

		rightLegModel[3].addShapeBox(-3F, -7F, -15F, 7, 11, 5, 0F,-3F, -1F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, -0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // RightLeg12
		rightLegModel[3].setRotationPoint(1F, -53F, -13F);

		rightLegModel[4].addShapeBox(6F, 14F, -8F, 4, 14, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0F); // RightLeg13
		rightLegModel[4].setRotationPoint(0F, -53F, -13F);

		rightLegModel[5].addShapeBox(6F, 14F, 0F, 4, 14, 3, 0F,0F, 0F, 0F, 0F, -4F, 0F, -2F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -5F, 0F, 0F, -3F, -0F); // RightLeg14
		rightLegModel[5].setRotationPoint(0F, -53F, -13F);

		rightLegModel[6].addShapeBox(0F, 14F, 0F, 6, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -0F); // RightLeg15
		rightLegModel[6].setRotationPoint(0F, -53F, -13F);

		rightLegModel[7].addShapeBox(-4F, 14F, 0F, 4, 14, 3, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -5F, -0F); // RightLeg16
		rightLegModel[7].setRotationPoint(0F, -53F, -13F);

		rightLegModel[8].addShapeBox(-4F, 14F, -8F, 4, 14, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0F); // RightLeg17
		rightLegModel[8].setRotationPoint(0F, -53F, -13F);

		rightLegModel[9].addShapeBox(-4F, 14F, -11F, 4, 14, 3, 0F,-2F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -5F, -0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // RightLeg18
		rightLegModel[9].setRotationPoint(0F, -53F, -13F);

		rightLegModel[10].addShapeBox(0F, 14F, -11F, 6, 14, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg19
		rightLegModel[10].setRotationPoint(0F, -53F, -13F);

		rightLegModel[11].addShapeBox(13F, 4F, -13F, 8, 11, 18, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -6F, 3F, 0F, -6F, 0F, 0F, 0F); // RightLeg2
		rightLegModel[11].setRotationPoint(1F, -53F, -13F);

		rightLegModel[12].addShapeBox(6F, 14F, -11F, 4, 14, 3, 0F,0F, -3F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, -0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // RightLeg20
		rightLegModel[12].setRotationPoint(0F, -53F, -13F);

		rightLegModel[13].addShapeBox(7F, 19.5F, -8F, 8, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0F); // RightLeg21
		rightLegModel[13].setRotationPoint(0F, -53F, -13F);

		rightLegModel[14].addShapeBox(13F, 19.5F, -8F, 4, 5, 8, 0F,0F, 0F, 2.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2.5F, -2F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, -2F, 0F, 0F); // RightLeg22
		rightLegModel[14].setRotationPoint(0F, -53F, -13F);

		rightLegModel[15].addShapeBox(17F, 19.5F, -8F, 4, 6, 8, 0F,0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -1F, -2F, 1F, -3F, -2F, 01F, -3F, 0F, 0F, -1F); // RightLeg23
		rightLegModel[15].setRotationPoint(0F, -53F, -13F);

		rightLegModel[16].addShapeBox(-4F, 11F, 7F, 4, 7, 3, 0F,0F, 0F, 2F, 0F, 0F, 2F, -1F, -2F, -2F, -1F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F); // RightLeg24
		rightLegModel[16].setRotationPoint(1F, -53F, -13F);
		rightLegModel[16].rotateAngleZ = 0.87266463F;

		rightLegModel[17].addShapeBox(-4F, 11F, 5F, 4, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // RightLeg25
		rightLegModel[17].setRotationPoint(1F, -53F, -13F);
		rightLegModel[17].rotateAngleZ = 0.87266463F;

		rightLegModel[18].addShapeBox(-4F, 11F, -15F, 4, 8, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // RightLeg26
		rightLegModel[18].setRotationPoint(1F, -53F, -13F);
		rightLegModel[18].rotateAngleZ = 0.87266463F;

		rightLegModel[19].addShapeBox(-4F, 11F, -18F, 4, 7, 3, 0F,-1F, -2F, -2F, -1F, -2F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg27
		rightLegModel[19].setRotationPoint(1F, -53F, -13F);
		rightLegModel[19].rotateAngleZ = 0.87266463F;

		rightLegModel[20].addShapeBox(-1F, 25F, -8F, 8, 6, 8, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg28
		rightLegModel[20].setRotationPoint(0F, -53F, -13F);

		rightLegModel[21].addShapeBox(-1F, 30F, -8F, 8, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg29
		rightLegModel[21].setRotationPoint(0F, -53F, -13F);

		rightLegModel[22].addShapeBox(13F, 15F, -13F, 8, 4, 18, 0F,0F, 0F, 0F, 3F, 0F, -6F, 3F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -2F); // RightLeg3
		rightLegModel[22].setRotationPoint(1F, -53F, -13F);

		rightLegModel[23].addShapeBox(7F, 37F, -8F, 3, 6, 8, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg30
		rightLegModel[23].setRotationPoint(0F, -53F, -13F);

		rightLegModel[24].addShapeBox(10F, 40F, -8F, 6, 4, 8, 0F,0F, 0F, 0F, .5F, -3F, -2F, .5F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // RightLeg31
		rightLegModel[24].setRotationPoint(0F, -53F, -13F);

		rightLegModel[25].addShapeBox(10F, 44F, -3F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, -1F, 0F, 3F, 0F); // RightLeg32
		rightLegModel[25].setRotationPoint(0F, -53F, -13F);

		rightLegModel[26].addShapeBox(10F, 44F, -8F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -2F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // RightLeg33
		rightLegModel[26].setRotationPoint(0F, -53F, -13F);

		rightLegModel[27].addShapeBox(-5F, 37F, -8F, 4, 5, 8, 0F,-.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg34
		rightLegModel[27].setRotationPoint(0F, -53F, -13F);

		rightLegModel[28].addShapeBox(-5F, 42F, -3F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // RightLeg35
		rightLegModel[28].setRotationPoint(0F, -53F, -13F);

		rightLegModel[29].addShapeBox(-5F, 42F, -8F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // RightLeg36
		rightLegModel[29].setRotationPoint(0F, -53F, -13F);

		rightLegModel[30].addShapeBox(-4F, 35F, -7.5F, 2, 5, 2, 0F,1F, -1F, 1F, -2F, -.5F, 1F, -2F, 0F, -2F, 1F, -.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg37
		rightLegModel[30].setRotationPoint(0F, -53F, -13F);

		rightLegModel[31].addShapeBox(-4F, 35F, -2.5F, 2, 5, 2, 0F,1F, -.5F, -2F, -2F, 0F, -2F, -2F, -.5F, 1F, 1F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg38
		rightLegModel[31].setRotationPoint(0F, -53F, -13F);

		rightLegModel[32].addShapeBox(7F, 37F, 0F, 3, 14, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, -1.5F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.5F, -5F, 0F, 0F, -3F, 0F); // RightLeg39
		rightLegModel[32].setRotationPoint(0F, -53F, -13F);

		rightLegModel[33].addShapeBox(9F, 15F, -15F, 4, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -2F); // RightLeg4
		rightLegModel[33].setRotationPoint(1F, -53F, -13F);

		rightLegModel[34].addShapeBox(-1F, 37F, 0F, 8, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // RightLeg40
		rightLegModel[34].setRotationPoint(0F, -53F, -13F);

		rightLegModel[35].addShapeBox(-4F, 37F, 0F, 3, 14, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.5F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.5F, -5F, 0F); // RightLeg41
		rightLegModel[35].setRotationPoint(0F, -53F, -13F);

		rightLegModel[36].addShapeBox(7F, 37F, -10F, 3, 14, 2, 0F,0F, -3F, 0F, -1.5F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.5F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // RightLeg42
		rightLegModel[36].setRotationPoint(0F, -53F, -13F);

		rightLegModel[37].addShapeBox(-1F, 37F, -10F, 8, 14, 2, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg43
		rightLegModel[37].setRotationPoint(0F, -53F, -13F);

		rightLegModel[38].addShapeBox(-4F, 37F, -10F, 3, 14, 2, 0F,-1.5F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.5F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // RightLeg44
		rightLegModel[38].setRotationPoint(0F, -53F, -13F);

		rightLegModel[39].addShapeBox(4F, 15F, -15F, 5, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F); // RightLeg5
		rightLegModel[39].setRotationPoint(1F, -53F, -13F);

		rightLegModel[40].addShapeBox(5F, 45F, -6.5F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg51
		rightLegModel[40].setRotationPoint(0F, -53F, -13F);

		rightLegModel[41].addShapeBox(-1F, 40F, 2F, 2, 8, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // RightLeg58
		rightLegModel[41].setRotationPoint(0F, -53F, -13F);

		rightLegModel[42].addShapeBox(1F, 40F, 2F, 4, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg59
		rightLegModel[42].setRotationPoint(0F, -53F, -13F);

		rightLegModel[43].addShapeBox(4F, 4F, -15F, 9, 11, 22, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // RightLeg6
		rightLegModel[43].setRotationPoint(1F, -53F, -13F);

		rightLegModel[44].addShapeBox(5F, 40F, 2F, 2, 8, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // RightLeg60
		rightLegModel[44].setRotationPoint(0F, -53F, -13F);

		rightLegModel[45].addShapeBox(-3.5F, 43F, 3.5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg61
		rightLegModel[45].setRotationPoint(0F, -53F, -13F);

		rightLegModel[46].addShapeBox(8F, 40F, 3F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg62
		rightLegModel[46].setRotationPoint(0F, -53F, -13F);

		rightLegModel[47].addShapeBox(6F, 37F, 3F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F); // RightLeg63
		rightLegModel[47].setRotationPoint(0F, -53F, -13F);

		rightLegModel[48].addShapeBox(0F, 37F, 3F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg64
		rightLegModel[48].setRotationPoint(0F, -53F, -13F);

		rightLegModel[49].addShapeBox(-3F, 37F, 3F, 3, 1, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F); // RightLeg65
		rightLegModel[49].setRotationPoint(0F, -53F, -13F);

		rightLegModel[50].addShapeBox(-3F, 40F, 3F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg66
		rightLegModel[50].setRotationPoint(0F, -53F, -13F);

		rightLegModel[51].addShapeBox(-1F, 40F, -13F, 2, 8, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // RightLeg67
		rightLegModel[51].setRotationPoint(0F, -53F, -13F);

		rightLegModel[52].addShapeBox(1F, 40F, -13F, 4, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg68
		rightLegModel[52].setRotationPoint(0F, -53F, -13F);

		rightLegModel[53].addShapeBox(5F, 40F, -13F, 2, 8, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // RightLeg69
		rightLegModel[53].setRotationPoint(0F, -53F, -13F);

		rightLegModel[54].addShapeBox(-3F, 4F, -15F, 7, 11, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0F); // RightLeg7
		rightLegModel[54].setRotationPoint(1F, -53F, -13F);

		rightLegModel[55].addShapeBox(-3.5F, 43F, -12.5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg70
		rightLegModel[55].setRotationPoint(0F, -53F, -13F);

		rightLegModel[56].addShapeBox(8F, 40F, -13F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg71
		rightLegModel[56].setRotationPoint(0F, -53F, -13F);

		rightLegModel[57].addShapeBox(6F, 37F, -13F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F); // RightLeg72
		rightLegModel[57].setRotationPoint(0F, -53F, -13F);

		rightLegModel[58].addShapeBox(0F, 37F, -13F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg73
		rightLegModel[58].setRotationPoint(0F, -53F, -13F);

		rightLegModel[59].addShapeBox(-3F, 37F, -13F, 3, 1, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F); // RightLeg74
		rightLegModel[59].setRotationPoint(0F, -53F, -13F);

		rightLegModel[60].addShapeBox(-3F, 40F, -13F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg75
		rightLegModel[60].setRotationPoint(0F, -53F, -13F);

		rightLegModel[61].addShapeBox(4F, -7F, -15F, 9, 11, 22, 0F,0F, 0F, -5F, 0F, -4F, -7F, 0F, -4F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // RightLeg8
		rightLegModel[61].setRotationPoint(1F, -53F, -13F);

		rightLegModel[62].addShapeBox(-4F, -4F, -8F, 8, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg9
		rightLegModel[62].setRotationPoint(1F, -53F, -13F);
	}

	private void initleftFootModel_1()
	{
		leftFootModel[0] = new ModelRendererTurbo(this, 247, 256, textureX, textureY); // LeftLeg41
		leftFootModel[1] = new ModelRendererTurbo(this, 257, 289, textureX, textureY); // LeftLeg45
		leftFootModel[2] = new ModelRendererTurbo(this, 291, 257, textureX, textureY); // LeftLeg47
		leftFootModel[3] = new ModelRendererTurbo(this, 252, 277, textureX, textureY); // LeftLeg48
		leftFootModel[4] = new ModelRendererTurbo(this, 252, 277, textureX, textureY); // LeftLeg49
		leftFootModel[5] = new ModelRendererTurbo(this, 291, 257, textureX, textureY); // LeftLeg50
		leftFootModel[6] = new ModelRendererTurbo(this, 279, 261, textureX, textureY); // LeftLeg51
		leftFootModel[7] = new ModelRendererTurbo(this, 279, 261, textureX, textureY); // LeftLeg52
		leftFootModel[8] = new ModelRendererTurbo(this, 279, 261, textureX, textureY); // LeftLeg53
		leftFootModel[9] = new ModelRendererTurbo(this, 279, 261, textureX, textureY); // LeftLeg54
		leftFootModel[10] = new ModelRendererTurbo(this, 199, 310, textureX, textureY); // LeftLeg57
		leftFootModel[11] = new ModelRendererTurbo(this, 233, 310, textureX, textureY); // LeftLeg58

		leftFootModel[0].addShapeBox(0F, 41F, 1F, 6, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg41
		leftFootModel[0].setRotationPoint(0F, -53F, 13F);

		leftFootModel[1].addShapeBox(6F, 48F, 0.5F, 6, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg45
		leftFootModel[1].setRotationPoint(0F, -53F, 13F);

		leftFootModel[2].addShapeBox(12F, 49F, 0.5F, 11, 5, 7, 0F,0F, 0F, -.5F, 0F, -3F, -1.5F, 0F, -3F, -1.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // LeftLeg47
		leftFootModel[2].setRotationPoint(0F, -53F, 13F);

		leftFootModel[3].addShapeBox(12F, 48F, 1F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, -1.7F, -1.5F, 0F, -1.7F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1.5F, 0F, 2F, -1.5F, 0F, 0F, 0F); // LeftLeg48
		leftFootModel[3].setRotationPoint(0F, -53F, 13F);

		leftFootModel[4].addShapeBox(9F, 46F, 3F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg49
		leftFootModel[4].setRotationPoint(0F, -53F, 13F);

		leftFootModel[5].addShapeBox(23F, 52F, 1.5F, 3, 2, 5, 0F,0F, 0F, -.5F, -1F, -.5F, -1.5F, -1F, -.5F, -1.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // LeftLeg50
		leftFootModel[5].setRotationPoint(0F, -53F, 13F);

		leftFootModel[6].addShapeBox(19F, 51F, 5F, 1, 3, 2, 0F,0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg51
		leftFootModel[6].setRotationPoint(0F, -53F, 13F);

		leftFootModel[7].addShapeBox(21F, 51F, 5F, 1, 3, 2, 0F,0F, -.4F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg52
		leftFootModel[7].setRotationPoint(0F, -53F, 13F);

		leftFootModel[8].addShapeBox(19F, 51F, 1F, 1, 3, 2, 0F,0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg53
		leftFootModel[8].setRotationPoint(0F, -53F, 13F);

		leftFootModel[9].addShapeBox(21F, 51F, 1F, 1, 3, 2, 0F,0F, -.4F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg54
		leftFootModel[9].setRotationPoint(0F, -53F, 13F);

		leftFootModel[10].addShapeBox(-5F, 48F, 0.5F, 6, 3, 7, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F); // LeftLeg57
		leftFootModel[10].setRotationPoint(0F, -53F, 13F);

		leftFootModel[11].addShapeBox(-9F, 49F, 1.5F, 4, 5, 5, 0F,0F, -1.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // LeftLeg58
		leftFootModel[11].setRotationPoint(0F, -53F, 13F);
	}

	private void initrightFootModel_1()
	{
		rightFootModel[0] = new ModelRendererTurbo(this, 247, 256, textureX, textureY); // RightLeg45
		rightFootModel[1] = new ModelRendererTurbo(this, 199, 310, textureX, textureY); // RightLeg46
		rightFootModel[2] = new ModelRendererTurbo(this, 233, 310, textureX, textureY); // RightLeg47
		rightFootModel[3] = new ModelRendererTurbo(this, 257, 289, textureX, textureY); // RightLeg48
		rightFootModel[4] = new ModelRendererTurbo(this, 291, 257, textureX, textureY); // RightLeg49
		rightFootModel[5] = new ModelRendererTurbo(this, 252, 277, textureX, textureY); // RightLeg50
		rightFootModel[6] = new ModelRendererTurbo(this, 252, 277, textureX, textureY); // RightLeg52
		rightFootModel[7] = new ModelRendererTurbo(this, 291, 257, textureX, textureY); // RightLeg53
		rightFootModel[8] = new ModelRendererTurbo(this, 279, 261, textureX, textureY); // RightLeg54
		rightFootModel[9] = new ModelRendererTurbo(this, 279, 261, textureX, textureY); // RightLeg55
		rightFootModel[10] = new ModelRendererTurbo(this, 279, 261, textureX, textureY); // RightLeg56
		rightFootModel[11] = new ModelRendererTurbo(this, 279, 261, textureX, textureY); // RightLeg57

		rightFootModel[0].addShapeBox(0F, 41F, -7F, 6, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg45
		rightFootModel[0].setRotationPoint(0F, -53F, -13F);

		rightFootModel[1].addShapeBox(-5F, 48F, -7.5F, 6, 3, 7, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F); // RightLeg46
		rightFootModel[1].setRotationPoint(0F, -53F, -13F);

		rightFootModel[2].addShapeBox(-9F, 49F, -6.5F, 4, 5, 5, 0F,0F, -1.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // RightLeg47
		rightFootModel[2].setRotationPoint(0F, -53F, -13F);

		rightFootModel[3].addShapeBox(6F, 48F, -7.5F, 6, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg48
		rightFootModel[3].setRotationPoint(0F, -53F, -13F);

		rightFootModel[4].addShapeBox(12F, 49F, -7.5F, 11, 5, 7, 0F,0F, 0F, -.5F, 0F, -3F, -1.5F, 0F, -3F, -1.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // RightLeg49
		rightFootModel[4].setRotationPoint(0F, -53F, -13F);

		rightFootModel[5].addShapeBox(12F, 48F, -7F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, -1.7F, -1.5F, 0F, -1.7F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1.5F, 0F, 2F, -1.5F, 0F, 0F, 0F); // RightLeg50
		rightFootModel[5].setRotationPoint(0F, -53F, -13F);

		rightFootModel[6].addShapeBox(9F, 46F, -5F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg52
		rightFootModel[6].setRotationPoint(0F, -53F, -13F);

		rightFootModel[7].addShapeBox(23F, 52F, -6.5F, 3, 2, 5, 0F,0F, 0F, -.5F, -1F, -.5F, -1.5F, -1F, -.5F, -1.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // RightLeg53
		rightFootModel[7].setRotationPoint(0F, -53F, -13F);

		rightFootModel[8].addShapeBox(21F, 51F, -7F, 1, 3, 2, 0F,0F, -.4F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg54
		rightFootModel[8].setRotationPoint(0F, -53F, -13F);

		rightFootModel[9].addShapeBox(19F, 51F, -7F, 1, 3, 2, 0F,0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg55
		rightFootModel[9].setRotationPoint(0F, -53F, -13F);

		rightFootModel[10].addShapeBox(19F, 51F, -3F, 1, 3, 2, 0F,0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg56
		rightFootModel[10].setRotationPoint(0F, -53F, -13F);

		rightFootModel[11].addShapeBox(21F, 51F, -3F, 1, 3, 2, 0F,0F, -.4F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg57
		rightFootModel[11].setRotationPoint(0F, -53F, -13F);
	}
}