//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 21.02.2016 - 14:19:00
// Last changed on: 21.02.2016 - 14:19:00

package com.wolffsmod.model.tankcraft; //Path where the model is located

import com.wolffsmod.model.ModelFlanVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;
import com.flansmod.common.vector.Vector3f;

public class ModelTCChieftain extends ModelFlanVehicle //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelTCChieftain() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[180];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 136, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 164, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 0, 136, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 0, 164, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 0, 189, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 0, 189, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 0, 221, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 0, 221, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 0, 252, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 0, 283, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 0, 305, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 0, 283, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 0, 305, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 0, 330, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 0, 379, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 0, 379, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 0, 410, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 0, 426, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 0, 410, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 0, 426, textureX, textureY); // Box 26
		bodyModel[24] = new ModelRendererTurbo(this, 0, 444, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 0, 469, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 0, 495, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 0, 518, textureX, textureY); // Box 30
		bodyModel[28] = new ModelRendererTurbo(this, 0, 518, textureX, textureY); // Box 31
		bodyModel[29] = new ModelRendererTurbo(this, 0, 518, textureX, textureY); // Box 32
		bodyModel[30] = new ModelRendererTurbo(this, 0, 520, textureX, textureY); // Box 33
		bodyModel[31] = new ModelRendererTurbo(this, 0, 543, textureX, textureY); // Box 34
		bodyModel[32] = new ModelRendererTurbo(this, 0, 561, textureX, textureY); // Box 35
		bodyModel[33] = new ModelRendererTurbo(this, 0, 574, textureX, textureY); // Box 36
		bodyModel[34] = new ModelRendererTurbo(this, 0, 592, textureX, textureY); // Box 37
		bodyModel[35] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Box 38
		bodyModel[36] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Box 39
		bodyModel[37] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Box 40
		bodyModel[38] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Box 41
		bodyModel[39] = new ModelRendererTurbo(this, 0, 613, textureX, textureY); // Box 42
		bodyModel[40] = new ModelRendererTurbo(this, 0, 632, textureX, textureY); // Box 43
		bodyModel[41] = new ModelRendererTurbo(this, 0, 444, textureX, textureY); // Box 44
		bodyModel[42] = new ModelRendererTurbo(this, 0, 469, textureX, textureY); // Box 45
		bodyModel[43] = new ModelRendererTurbo(this, 0, 495, textureX, textureY); // Box 46
		bodyModel[44] = new ModelRendererTurbo(this, 0, 518, textureX, textureY); // Box 47
		bodyModel[45] = new ModelRendererTurbo(this, 0, 518, textureX, textureY); // Box 48
		bodyModel[46] = new ModelRendererTurbo(this, 0, 518, textureX, textureY); // Box 49
		bodyModel[47] = new ModelRendererTurbo(this, 0, 520, textureX, textureY); // Box 50
		bodyModel[48] = new ModelRendererTurbo(this, 0, 543, textureX, textureY); // Box 51
		bodyModel[49] = new ModelRendererTurbo(this, 0, 561, textureX, textureY); // Box 52
		bodyModel[50] = new ModelRendererTurbo(this, 0, 574, textureX, textureY); // Box 53
		bodyModel[51] = new ModelRendererTurbo(this, 0, 592, textureX, textureY); // Box 54
		bodyModel[52] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Box 55
		bodyModel[53] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Box 56
		bodyModel[54] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Box 57
		bodyModel[55] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Box 58
		bodyModel[56] = new ModelRendererTurbo(this, 0, 613, textureX, textureY); // Box 59
		bodyModel[57] = new ModelRendererTurbo(this, 0, 632, textureX, textureY); // Box 60
		bodyModel[58] = new ModelRendererTurbo(this, 0, 640, textureX, textureY); // Box 61
		bodyModel[59] = new ModelRendererTurbo(this, 0, 665, textureX, textureY); // Box 62
		bodyModel[60] = new ModelRendererTurbo(this, 0, 668, textureX, textureY); // Box 63
		bodyModel[61] = new ModelRendererTurbo(this, 0, 668, textureX, textureY); // Box 64
		bodyModel[62] = new ModelRendererTurbo(this, 0, 668, textureX, textureY); // Box 65
		bodyModel[63] = new ModelRendererTurbo(this, 0, 668, textureX, textureY); // Box 66
		bodyModel[64] = new ModelRendererTurbo(this, 0, 668, textureX, textureY); // Box 67
		bodyModel[65] = new ModelRendererTurbo(this, 0, 681, textureX, textureY); // Box 68
		bodyModel[66] = new ModelRendererTurbo(this, 0, 681, textureX, textureY); // Box 69
		bodyModel[67] = new ModelRendererTurbo(this, 0, 685, textureX, textureY); // Box 70
		bodyModel[68] = new ModelRendererTurbo(this, 0, 693, textureX, textureY); // Box 71
		bodyModel[69] = new ModelRendererTurbo(this, 0, 693, textureX, textureY); // Box 72
		bodyModel[70] = new ModelRendererTurbo(this, 0, 693, textureX, textureY); // Box 73
		bodyModel[71] = new ModelRendererTurbo(this, 0, 693, textureX, textureY); // Box 74
		bodyModel[72] = new ModelRendererTurbo(this, 0, 693, textureX, textureY); // Box 75
		bodyModel[73] = new ModelRendererTurbo(this, 0, 693, textureX, textureY); // Box 76
		bodyModel[74] = new ModelRendererTurbo(this, 0, 668, textureX, textureY); // Box 77
		bodyModel[75] = new ModelRendererTurbo(this, 0, 668, textureX, textureY); // Box 78
		bodyModel[76] = new ModelRendererTurbo(this, 0, 665, textureX, textureY); // Box 79
		bodyModel[77] = new ModelRendererTurbo(this, 0, 668, textureX, textureY); // Box 80
		bodyModel[78] = new ModelRendererTurbo(this, 0, 668, textureX, textureY); // Box 81
		bodyModel[79] = new ModelRendererTurbo(this, 0, 668, textureX, textureY); // Box 82
		bodyModel[80] = new ModelRendererTurbo(this, 0, 668, textureX, textureY); // Box 83
		bodyModel[81] = new ModelRendererTurbo(this, 0, 668, textureX, textureY); // Box 84
		bodyModel[82] = new ModelRendererTurbo(this, 0, 681, textureX, textureY); // Box 85
		bodyModel[83] = new ModelRendererTurbo(this, 0, 681, textureX, textureY); // Box 86
		bodyModel[84] = new ModelRendererTurbo(this, 0, 685, textureX, textureY); // Box 87
		bodyModel[85] = new ModelRendererTurbo(this, 0, 693, textureX, textureY); // Box 88
		bodyModel[86] = new ModelRendererTurbo(this, 0, 693, textureX, textureY); // Box 89
		bodyModel[87] = new ModelRendererTurbo(this, 0, 693, textureX, textureY); // Box 90
		bodyModel[88] = new ModelRendererTurbo(this, 0, 693, textureX, textureY); // Box 91
		bodyModel[89] = new ModelRendererTurbo(this, 0, 693, textureX, textureY); // Box 92
		bodyModel[90] = new ModelRendererTurbo(this, 0, 693, textureX, textureY); // Box 93
		bodyModel[91] = new ModelRendererTurbo(this, 0, 668, textureX, textureY); // Box 94
		bodyModel[92] = new ModelRendererTurbo(this, 0, 668, textureX, textureY); // Box 95
		bodyModel[93] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Box 96
		bodyModel[94] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Box 98
		bodyModel[95] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Box 99
		bodyModel[96] = new ModelRendererTurbo(this, 0, 707, textureX, textureY); // Box 100
		bodyModel[97] = new ModelRendererTurbo(this, 0, 737, textureX, textureY); // Box 101
		bodyModel[98] = new ModelRendererTurbo(this, 0, 787, textureX, textureY); // Box 102
		bodyModel[99] = new ModelRendererTurbo(this, 0, 853, textureX, textureY); // Box 103
		bodyModel[100] = new ModelRendererTurbo(this, 0, 870, textureX, textureY); // Box 104
		bodyModel[101] = new ModelRendererTurbo(this, 0, 882, textureX, textureY); // Box 105
		bodyModel[102] = new ModelRendererTurbo(this, 0, 890, textureX, textureY); // Box 106
		bodyModel[103] = new ModelRendererTurbo(this, 0, 853, textureX, textureY); // Box 107
		bodyModel[104] = new ModelRendererTurbo(this, 0, 870, textureX, textureY); // Box 108
		bodyModel[105] = new ModelRendererTurbo(this, 0, 882, textureX, textureY); // Box 109
		bodyModel[106] = new ModelRendererTurbo(this, 0, 956, textureX, textureY); // Box 110
		bodyModel[107] = new ModelRendererTurbo(this, 0, 956, textureX, textureY); // Box 111
		bodyModel[108] = new ModelRendererTurbo(this, 0, 956, textureX, textureY); // Box 112
		bodyModel[109] = new ModelRendererTurbo(this, 0, 956, textureX, textureY); // Box 113
		bodyModel[110] = new ModelRendererTurbo(this, 0, 956, textureX, textureY); // Box 114
		bodyModel[111] = new ModelRendererTurbo(this, 0, 956, textureX, textureY); // Box 115
		bodyModel[112] = new ModelRendererTurbo(this, 0, 956, textureX, textureY); // Box 116
		bodyModel[113] = new ModelRendererTurbo(this, 0, 956, textureX, textureY); // Box 117
		bodyModel[114] = new ModelRendererTurbo(this, 0, 960, textureX, textureY); // Box 118
		bodyModel[115] = new ModelRendererTurbo(this, 0, 980, textureX, textureY); // Box 119
		bodyModel[116] = new ModelRendererTurbo(this, 0, 1003, textureX, textureY); // Box 120
		bodyModel[117] = new ModelRendererTurbo(this, 0, 1019, textureX, textureY); // Box 121
		bodyModel[118] = new ModelRendererTurbo(this, 0, 1036, textureX, textureY); // Box 122
		bodyModel[119] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Box 123
		bodyModel[120] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Box 124
		bodyModel[121] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Box 125
		bodyModel[122] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Box 126
		bodyModel[123] = new ModelRendererTurbo(this, 0, 960, textureX, textureY); // Box 127
		bodyModel[124] = new ModelRendererTurbo(this, 0, 980, textureX, textureY); // Box 128
		bodyModel[125] = new ModelRendererTurbo(this, 0, 1003, textureX, textureY); // Box 129
		bodyModel[126] = new ModelRendererTurbo(this, 0, 1019, textureX, textureY); // Box 130
		bodyModel[127] = new ModelRendererTurbo(this, 0, 1036, textureX, textureY); // Box 131
		bodyModel[128] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Box 132
		bodyModel[129] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Box 133
		bodyModel[130] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Box 134
		bodyModel[131] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Box 135
		bodyModel[132] = new ModelRendererTurbo(this, 0, 1053, textureX, textureY); // Box 136
		bodyModel[133] = new ModelRendererTurbo(this, 0, 1053, textureX, textureY); // Box 137
		bodyModel[134] = new ModelRendererTurbo(this, 0, 1083, textureX, textureY); // Box 138
		bodyModel[135] = new ModelRendererTurbo(this, 0, 1135, textureX, textureY); // Box 139
		bodyModel[136] = new ModelRendererTurbo(this, 0, 1140, textureX, textureY); // Box 140
		bodyModel[137] = new ModelRendererTurbo(this, 0, 1150, textureX, textureY); // Box 141
		bodyModel[138] = new ModelRendererTurbo(this, 0, 1140, textureX, textureY); // Box 142
		bodyModel[139] = new ModelRendererTurbo(this, 0, 1191, textureX, textureY); // Box 143
		bodyModel[140] = new ModelRendererTurbo(this, 0, 1192, textureX, textureY); // Box 144
		bodyModel[141] = new ModelRendererTurbo(this, 0, 1191, textureX, textureY); // Box 145
		bodyModel[142] = new ModelRendererTurbo(this, 0, 1135, textureX, textureY); // Box 146
		bodyModel[143] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 147
		bodyModel[144] = new ModelRendererTurbo(this, 0, 1281, textureX, textureY); // Box 148
		bodyModel[145] = new ModelRendererTurbo(this, 0, 1281, textureX, textureY); // Box 149
		bodyModel[146] = new ModelRendererTurbo(this, 0, 1314, textureX, textureY); // Box 150
		bodyModel[147] = new ModelRendererTurbo(this, 0, 1331, textureX, textureY); // Box 151
		bodyModel[148] = new ModelRendererTurbo(this, 0, 1343, textureX, textureY); // Box 152
		bodyModel[149] = new ModelRendererTurbo(this, 0, 1343, textureX, textureY); // Box 153
		bodyModel[150] = new ModelRendererTurbo(this, 0, 1347, textureX, textureY); // Box 154
		bodyModel[151] = new ModelRendererTurbo(this, 0, 1347, textureX, textureY); // Box 155
		bodyModel[152] = new ModelRendererTurbo(this, 0, 1314, textureX, textureY); // Box 156
		bodyModel[153] = new ModelRendererTurbo(this, 0, 1331, textureX, textureY); // Box 157
		bodyModel[154] = new ModelRendererTurbo(this, 0, 1343, textureX, textureY); // Box 158
		bodyModel[155] = new ModelRendererTurbo(this, 0, 1343, textureX, textureY); // Box 159
		bodyModel[156] = new ModelRendererTurbo(this, 0, 1347, textureX, textureY); // Box 160
		bodyModel[157] = new ModelRendererTurbo(this, 0, 1347, textureX, textureY); // Box 161
		bodyModel[158] = new ModelRendererTurbo(this, 0, 1347, textureX, textureY); // Box 162
		bodyModel[159] = new ModelRendererTurbo(this, 0, 1392, textureX, textureY); // Box 163
		bodyModel[160] = new ModelRendererTurbo(this, 0, 1423, textureX, textureY); // Box 164
		bodyModel[161] = new ModelRendererTurbo(this, 0, 1423, textureX, textureY); // Box 165
		bodyModel[162] = new ModelRendererTurbo(this, 0, 1427, textureX, textureY); // Box 166
		bodyModel[163] = new ModelRendererTurbo(this, 0, 1445, textureX, textureY); // Box 167
		bodyModel[164] = new ModelRendererTurbo(this, 0, 1452, textureX, textureY); // Box 168
		bodyModel[165] = new ModelRendererTurbo(this, 0, 1452, textureX, textureY); // Box 171
		bodyModel[166] = new ModelRendererTurbo(this, 0, 1445, textureX, textureY); // Box 172
		bodyModel[167] = new ModelRendererTurbo(this, 0, 1457, textureX, textureY); // Box 173
		bodyModel[168] = new ModelRendererTurbo(this, 0, 1464, textureX, textureY); // Box 174
		bodyModel[169] = new ModelRendererTurbo(this, 0, 1464, textureX, textureY); // Box 175
		bodyModel[170] = new ModelRendererTurbo(this, 0, 1474, textureX, textureY); // Box 176
		bodyModel[171] = new ModelRendererTurbo(this, 0, 1480, textureX, textureY); // Box 177
		bodyModel[172] = new ModelRendererTurbo(this, 0, 1480, textureX, textureY); // Box 178
		bodyModel[173] = new ModelRendererTurbo(this, 0, 1474, textureX, textureY); // Box 179
		bodyModel[174] = new ModelRendererTurbo(this, 0, 1484, textureX, textureY); // Box 180
		bodyModel[175] = new ModelRendererTurbo(this, 0, 1490, textureX, textureY); // Box 181
		bodyModel[176] = new ModelRendererTurbo(this, 0, 1495, textureX, textureY); // Box 182
		bodyModel[177] = new ModelRendererTurbo(this, 0, 1500, textureX, textureY); // Box 183
		bodyModel[178] = new ModelRendererTurbo(this, 0, 1500, textureX, textureY); // Box 184
		bodyModel[179] = new ModelRendererTurbo(this, 0, 1505, textureX, textureY); // Box 185

		bodyModel[0].addShapeBox(0F, 0F, 0F, 6, 6, 19, 0F, 0F, 0F, 0F, 0F, -3F, -0.4285F, 1F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.8571F, 1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 0
		bodyModel[0].setRotationPoint(60F, -16F, -19.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 3, 19, 0F, 0F, 0F, -0.4285F, 0F, -2F, -0.7142F, 1F, -2F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, -0.8571F, 0F, 0F, -0.8571F, 1F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 2
		bodyModel[1].setRotationPoint(66F, -13F, -19.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 6, 6, 19, 0F, 0F, 0F, 0.5F, 1F, -3F, 0.5F, 0F, -3F, -0.4285F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, -0.8571F, 0F, 0F, 0F); // Box 4
		bodyModel[2].setRotationPoint(60F, -16F, 0.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 3, 19, 0F, -1F, 0F, 0.5F, 1F, -2F, 0.5F, 0F, -2F, -0.7142F, 0F, 0F, -0.4285F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, -0.8571F, 0F, 0F, -0.8571F); // Box 5
		bodyModel[3].setRotationPoint(66F, -13F, 0.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 9, 9, 19, 0F, 0F, 0F, 0F, -1F, 0F, -0.8571F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, -3F, -8.9F, -1.5F, -3F, -8.9F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 6
		bodyModel[4].setRotationPoint(60F, -10F, -19.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 9, 9, 19, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, -0.8571F, 0F, 0F, 0F, 0F, 0F, 0.5F, -8.9F, 0F, 0.5F, -8.9F, -1.5F, -3F, 0F, -1.5F, -3F); // Box 7
		bodyModel[5].setRotationPoint(60F, -10F, 0.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 24, 9, 19, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 8
		bodyModel[6].setRotationPoint(36F, -10F, -19.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 24, 9, 19, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, -3F, 0F, -1.5F, -3F); // Box 10
		bodyModel[7].setRotationPoint(36F, -10F, 0.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 7, 6, 22, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[8].setRotationPoint(53F, -19F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 7, 9, 9, 0F, 0F, -1.5F, 0F, 0F, -3F, -0.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[9].setRotationPoint(53F, -19F, -20F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 17, 12, 9, 0F, 0F, -3F, 1F, 0F, -4.5F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[10].setRotationPoint(36F, -22F, -20F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 7, 9, 9, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 14
		bodyModel[11].setRotationPoint(53F, -19F, 11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 17, 12, 9, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -4.5F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 15
		bodyModel[12].setRotationPoint(36F, -22F, 11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 17, 7, 22, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[13].setRotationPoint(36F, -22F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[14].setRotationPoint(32F, -24.5F, -5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[15].setRotationPoint(32F, -24.5F, 0F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[16].setRotationPoint(32F, -24.5F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 11, 6, 10, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 20
		bodyModel[17].setRotationPoint(25F, -24.5F, -21F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[18].setRotationPoint(32F, -24.5F, 5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 11, 6, 10, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[19].setRotationPoint(25F, -24.5F, 11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 13, 6, 7, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[20].setRotationPoint(14F, -24.5F, -28F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 18, 9, 6, 0F, 0F, 0F, -5F, -8F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -8F, 0F, 0F, 11F, -3F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[21].setRotationPoint(-2F, -24.5F, -34F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 13, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[22].setRotationPoint(14F, -24.5F, 21F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 18, 9, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 11F, -3F, 0F, -8F, 0F, 0F, 0F, -1F, 0F); // Box 26
		bodyModel[23].setRotationPoint(-2F, -24.5F, 28F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 9, 6, 15, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1.5F, 0F, 2F, -1.5F, 0F, 0F, 0F, 2F); // Box 27
		bodyModel[24].setRotationPoint(63F, -17.5F, -35.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 106, 6, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F); // Box 28
		bodyModel[25].setRotationPoint(-43F, -17.5F, -35.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 28, 6, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F); // Box 29
		bodyModel[26].setRotationPoint(7F, -23.5F, -35.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[27].setRotationPoint(12F, -22.5F, -36F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[28].setRotationPoint(20F, -22.5F, -36F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[29].setRotationPoint(28F, -22.5F, -36F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 15, 6, 13, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[30].setRotationPoint(36.5F, -23.5F, -35F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 11, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[31].setRotationPoint(57F, -16.5F, -36F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 101, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[32].setRotationPoint(-43F, -11.5F, -35.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 18, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[33].setRotationPoint(38.5F, -16.5F, -36F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 40, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[34].setRotationPoint(-2F, -16.5F, -36F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[35].setRotationPoint(59F, -18.5F, -36F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[36].setRotationPoint(38.5F, -18.5F, -36F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[37].setRotationPoint(32F, -18.5F, -36F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[38].setRotationPoint(0.5F, -18.5F, -36F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[39].setRotationPoint(59.5F, -18F, -35F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[40].setRotationPoint(59.5F, -18F, -19F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 9, 6, 15, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, -1.5F, 0F, 2F, -1.5F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[41].setRotationPoint(63F, -17.5F, 20.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 106, 6, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[42].setRotationPoint(-43F, -17.5F, 20.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 28, 6, 15, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[43].setRotationPoint(7F, -23.5F, 20.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[44].setRotationPoint(12F, -22.5F, 35F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[45].setRotationPoint(20F, -22.5F, 35F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[46].setRotationPoint(28F, -22.5F, 35F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 15, 6, 13, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[47].setRotationPoint(36.5F, -23.5F, 22F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 11, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[48].setRotationPoint(57F, -16.5F, 35F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 101, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[49].setRotationPoint(-43F, -11.5F, 34.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 18, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[50].setRotationPoint(38.5F, -16.5F, 35F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 40, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[51].setRotationPoint(-2F, -16.5F, 35F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[52].setRotationPoint(59F, -18.5F, 35F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[53].setRotationPoint(38.5F, -18.5F, 35F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[54].setRotationPoint(32F, -18.5F, 35F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[55].setRotationPoint(0.5F, -18.5F, 35F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[56].setRotationPoint(59.5F, -18F, 19F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[57].setRotationPoint(59.5F, -18F, 16F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 61
		bodyModel[58].setRotationPoint(68F, -15F, -10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[59].setRotationPoint(65F, -15F, -9.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[60].setRotationPoint(64F, -18F, -9.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[61].setRotationPoint(64F, -18F, -14F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[62].setRotationPoint(64F, -18F, -18.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[63].setRotationPoint(64F, -19F, -18.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[64].setRotationPoint(61F, -19F, -18.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[65].setRotationPoint(62F, -19F, -18.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[66].setRotationPoint(62F, -19F, -9.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[67].setRotationPoint(64F, -15F, -13F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[68].setRotationPoint(61F, -18F, -12.75F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[69].setRotationPoint(61F, -17F, -12.75F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 73
		bodyModel[70].setRotationPoint(61F, -16F, -12.75F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 74
		bodyModel[71].setRotationPoint(61F, -16F, -17.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[72].setRotationPoint(61F, -18F, -17.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[73].setRotationPoint(61F, -17F, -17.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[74].setRotationPoint(61F, -18F, -9.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[75].setRotationPoint(61F, -18F, -18.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[76].setRotationPoint(65F, -15F, 8.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[77].setRotationPoint(64F, -18F, 8.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[78].setRotationPoint(64F, -18F, 13F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[79].setRotationPoint(64F, -18F, 17.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[80].setRotationPoint(64F, -19F, 8.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[81].setRotationPoint(61F, -19F, 8.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[82].setRotationPoint(62F, -19F, 17.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[83].setRotationPoint(62F, -19F, 8.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[84].setRotationPoint(64F, -15F, 9F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[85].setRotationPoint(61F, -18F, 9.75F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[86].setRotationPoint(61F, -17F, 9.75F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 90
		bodyModel[87].setRotationPoint(61F, -16F, 9.75F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 91
		bodyModel[88].setRotationPoint(61F, -16F, 14.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[89].setRotationPoint(61F, -18F, 14.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[90].setRotationPoint(61F, -17F, 14.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[91].setRotationPoint(61F, -18F, 8.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[92].setRotationPoint(61F, -18F, 17.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[93].setRotationPoint(62F, -7F, -0.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[94].setRotationPoint(62F, -9F, -13.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[95].setRotationPoint(62F, -9F, 12.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 7, 6, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[96].setRotationPoint(25F, -24.5F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 11, 6, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[97].setRotationPoint(14F, -24.5F, -21F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 16, 7, 56, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[98].setRotationPoint(-2F, -24.5F, -28F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 72, 8, 6, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[99].setRotationPoint(-74F, -24.5F, -34F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 49, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[100].setRotationPoint(-72F, -23.5F, -34F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 49, 2, 4, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[101].setRotationPoint(-72F, -25.5F, -34F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 72, 8, 56, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[102].setRotationPoint(-74F, -24.5F, -28F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 72, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[103].setRotationPoint(-74F, -24.5F, 28F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 49, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[104].setRotationPoint(-72F, -23.5F, 30F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 49, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[105].setRotationPoint(-72F, -25.5F, 30F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[106].setRotationPoint(-68F, -24.5F, -34.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[107].setRotationPoint(-56F, -24.5F, -34.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[108].setRotationPoint(-42F, -24.5F, -34.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[109].setRotationPoint(-30F, -24.5F, -34.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[110].setRotationPoint(-68F, -24.5F, 33.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[111].setRotationPoint(-56F, -24.5F, 33.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[112].setRotationPoint(-42F, -24.5F, 33.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[113].setRotationPoint(-30F, -24.5F, 33.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 28, 3, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F); // Box 118
		bodyModel[114].setRotationPoint(-71F, -17.5F, -35.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 9, 6, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[115].setRotationPoint(-80F, -17.5F, -35.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 39, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[116].setRotationPoint(-41.5F, -16.5F, -36F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[117].setRotationPoint(-44.5F, -16.5F, -36F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 27, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F); // Box 122
		bodyModel[118].setRotationPoint(-71.5F, -16.5F, -36F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[119].setRotationPoint(-9.5F, -18.5F, -36F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[120].setRotationPoint(-36.5F, -18.5F, -36F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[121].setRotationPoint(-46.5F, -18.5F, -36F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[122].setRotationPoint(-68.5F, -18.5F, -36F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 28, 3, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[123].setRotationPoint(-71F, -17.5F, 20.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 9, 6, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[124].setRotationPoint(-80F, -17.5F, 20.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 39, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[125].setRotationPoint(-41.5F, -16.5F, 35F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[126].setRotationPoint(-44.5F, -16.5F, 35F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 27, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F); // Box 131
		bodyModel[127].setRotationPoint(-71.5F, -16.5F, 35F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[128].setRotationPoint(-9.5F, -18.5F, 35F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[129].setRotationPoint(-36.5F, -18.5F, 35F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[130].setRotationPoint(-46.5F, -18.5F, 35F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[131].setRotationPoint(-68.5F, -18.5F, 35F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 104, 9, 19, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, -3F, 0F, -1.5F, -3F); // Box 136
		bodyModel[132].setRotationPoint(-68F, -10F, 0.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 104, 9, 19, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 137
		bodyModel[133].setRotationPoint(-68F, -10F, -19.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 104, 7, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[134].setRotationPoint(-68F, -17F, -21F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 41, 2, 1, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[135].setRotationPoint(-54F, -26.5F, -29F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 67, 1, 7, 0F, 0F, -1F, 0F, -9F, -1F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[136].setRotationPoint(-72F, -25.5F, -26F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 67, 1, 38, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[137].setRotationPoint(-72F, -25.5F, -19F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 67, 1, 7, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 142
		bodyModel[138].setRotationPoint(-72F, -25.5F, 19F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[139].setRotationPoint(-54F, -26.5F, -27F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[140].setRotationPoint(-54F, -26.5F, -17F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[141].setRotationPoint(-54F, -26.5F, 19F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 41, 2, 1, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[142].setRotationPoint(-54F, -26.5F, 28F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 6, 7, 42, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[143].setRotationPoint(-74F, -17F, -21F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 6, 9, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4.5F, 0F, -1.5F, -4.5F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 148
		bodyModel[144].setRotationPoint(-74F, -10F, -21F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 6, 9, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1.5F, -4.5F, 0F, -2F, -4.5F); // Box 149
		bodyModel[145].setRotationPoint(-74F, -10F, 0F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 5, 6, 9, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 150
		bodyModel[146].setRotationPoint(-79F, -23.5F, -30F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F, 1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 151
		bodyModel[147].setRotationPoint(-79F, -24.5F, -30F);
		bodyModel[147].rotateAngleZ = 0.19739499F;

		bodyModel[148].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[148].setRotationPoint(-80F, -23.5F, -29F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[149].setRotationPoint(-80F, -23.5F, -23F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[150].setRotationPoint(-79F, -18.5F, -34F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[151].setRotationPoint(-79F, -19.5F, -34F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 5, 6, 9, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 156
		bodyModel[152].setRotationPoint(-79F, -23.5F, 21F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F, 1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 157
		bodyModel[153].setRotationPoint(-79F, -24.5F, 21F);
		bodyModel[153].rotateAngleZ = 0.19739499F;

		bodyModel[154].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[154].setRotationPoint(-80F, -23.5F, 28F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[155].setRotationPoint(-80F, -23.5F, 22F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[156].setRotationPoint(-79F, -18.5F, 31F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[157].setRotationPoint(-79F, -19.5F, 31F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 5, 11, 31, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[158].setRotationPoint(-79F, -24.5F, -15F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 1, 27, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[159].setRotationPoint(-78F, -25.5F, -13F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[160].setRotationPoint(-78F, -25.5F, -14F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 165
		bodyModel[161].setRotationPoint(-78F, -25.5F, 14F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 5, 9, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[162].setRotationPoint(-81F, -22.5F, -13F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[163].setRotationPoint(-81F, -24.5F, -5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[164].setRotationPoint(-81F, -20.5F, -5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 171
		bodyModel[165].setRotationPoint(-81F, -20.5F, 0F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[166].setRotationPoint(-81F, -24.5F, 0F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[167].setRotationPoint(-80F, -24.5F, -4F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[168].setRotationPoint(-80F, -22.5F, -4F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[169].setRotationPoint(-80F, -22.5F, -1F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[170].setRotationPoint(-80F, -21.5F, 3.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[171].setRotationPoint(-80F, -19.5F, 5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[172].setRotationPoint(-80F, -22.5F, 7F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[173].setRotationPoint(-80F, -21.5F, 11.5F);

		bodyModel[174].addShapeBox(-3F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[174].setRotationPoint(-78F, -23.5F, 16F);
		bodyModel[174].rotateAngleZ = 0.64577182F;

		bodyModel[175].addShapeBox(-1F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[175].setRotationPoint(-78F, -18.5F, 16F);
		bodyModel[175].rotateAngleZ = 0.64577182F;

		bodyModel[176].addShapeBox(-3F, 0F, 1F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[176].setRotationPoint(-78F, -18.5F, 16F);
		bodyModel[176].rotateAngleZ = 0.64577182F;

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[177].setRotationPoint(-75F, -11.5F, -6F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[178].setRotationPoint(-75F, -11.5F, 4F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[179].setRotationPoint(-75F, -8.5F, -1F);


		turretModel = new ModelRendererTurbo[241];
		turretModel[0] = new ModelRendererTurbo(this, 0, 1512, textureX, textureY); // Box 186
		turretModel[1] = new ModelRendererTurbo(this, 0, 1535, textureX, textureY); // Box 187
		turretModel[2] = new ModelRendererTurbo(this, 0, 1560, textureX, textureY); // Box 188
		turretModel[3] = new ModelRendererTurbo(this, 0, 1582, textureX, textureY); // Box 189
		turretModel[4] = new ModelRendererTurbo(this, 0, 1598, textureX, textureY); // Box 190
		turretModel[5] = new ModelRendererTurbo(this, 0, 1605, textureX, textureY); // Box 191
		turretModel[6] = new ModelRendererTurbo(this, 0, 1625, textureX, textureY); // Box 194
		turretModel[7] = new ModelRendererTurbo(this, 0, 1582, textureX, textureY); // Box 195
		turretModel[8] = new ModelRendererTurbo(this, 0, 1598, textureX, textureY); // Box 196
		turretModel[9] = new ModelRendererTurbo(this, 0, 1647, textureX, textureY); // Box 197
		turretModel[10] = new ModelRendererTurbo(this, 0, 1670, textureX, textureY); // Box 198
		turretModel[11] = new ModelRendererTurbo(this, 0, 1686, textureX, textureY); // Box 200
		turretModel[12] = new ModelRendererTurbo(this, 0, 1693, textureX, textureY); // Box 201
		turretModel[13] = new ModelRendererTurbo(this, 0, 1716, textureX, textureY); // Box 202
		turretModel[14] = new ModelRendererTurbo(this, 0, 1736, textureX, textureY); // Box 194
		turretModel[15] = new ModelRendererTurbo(this, 0, 1747, textureX, textureY); // Box 195
		turretModel[16] = new ModelRendererTurbo(this, 0, 1768, textureX, textureY); // Box 197
		turretModel[17] = new ModelRendererTurbo(this, 0, 1778, textureX, textureY); // Box 198
		turretModel[18] = new ModelRendererTurbo(this, 0, 1788, textureX, textureY); // Box 199
		turretModel[19] = new ModelRendererTurbo(this, 0, 1797, textureX, textureY); // Box 200
		turretModel[20] = new ModelRendererTurbo(this, 0, 1807, textureX, textureY); // Box 201
		turretModel[21] = new ModelRendererTurbo(this, 0, 1817, textureX, textureY); // Box 202
		turretModel[22] = new ModelRendererTurbo(this, 0, 1827, textureX, textureY); // Box 203
		turretModel[23] = new ModelRendererTurbo(this, 0, 1836, textureX, textureY); // Box 204
		turretModel[24] = new ModelRendererTurbo(this, 0, 1846, textureX, textureY); // Box 205
		turretModel[25] = new ModelRendererTurbo(this, 0, 1855, textureX, textureY); // Box 206
		turretModel[26] = new ModelRendererTurbo(this, 0, 1863, textureX, textureY); // Box 207
		turretModel[27] = new ModelRendererTurbo(this, 0, 1875, textureX, textureY); // Box 208
		turretModel[28] = new ModelRendererTurbo(this, 0, 1898, textureX, textureY); // Box 209
		turretModel[29] = new ModelRendererTurbo(this, 0, 1906, textureX, textureY); // Box 210
		turretModel[30] = new ModelRendererTurbo(this, 0, 1937, textureX, textureY); // Box 211
		turretModel[31] = new ModelRendererTurbo(this, 0, 1958, textureX, textureY); // Box 212
		turretModel[32] = new ModelRendererTurbo(this, 0, 1982, textureX, textureY); // Box 213
		turretModel[33] = new ModelRendererTurbo(this, 0, 2011, textureX, textureY); // Box 214
		turretModel[34] = new ModelRendererTurbo(this, 0, 2024, textureX, textureY); // Box 215
		turretModel[35] = new ModelRendererTurbo(this, 0, 2032, textureX, textureY); // Box 216
		turretModel[36] = new ModelRendererTurbo(this, 300, 0, textureX, textureY); // Box 217
		turretModel[37] = new ModelRendererTurbo(this, 300, 32, textureX, textureY); // Box 217
		turretModel[38] = new ModelRendererTurbo(this, 300, 60, textureX, textureY); // Box 218
		turretModel[39] = new ModelRendererTurbo(this, 300, 80, textureX, textureY); // Box 219
		turretModel[40] = new ModelRendererTurbo(this, 300, 80, textureX, textureY); // Box 220
		turretModel[41] = new ModelRendererTurbo(this, 300, 90, textureX, textureY); // Box 221
		turretModel[42] = new ModelRendererTurbo(this, 300, 90, textureX, textureY); // Box 222
		turretModel[43] = new ModelRendererTurbo(this, 300, 80, textureX, textureY); // Box 228
		turretModel[44] = new ModelRendererTurbo(this, 300, 90, textureX, textureY); // Box 229
		turretModel[45] = new ModelRendererTurbo(this, 300, 80, textureX, textureY); // Box 230
		turretModel[46] = new ModelRendererTurbo(this, 300, 90, textureX, textureY); // Box 231
		turretModel[47] = new ModelRendererTurbo(this, 300, 96, textureX, textureY); // Box 232
		turretModel[48] = new ModelRendererTurbo(this, 300, 103, textureX, textureY); // Box 233
		turretModel[49] = new ModelRendererTurbo(this, 300, 110, textureX, textureY); // Box 234
		turretModel[50] = new ModelRendererTurbo(this, 300, 115, textureX, textureY); // Box 235
		turretModel[51] = new ModelRendererTurbo(this, 300, 121, textureX, textureY); // Box 236
		turretModel[52] = new ModelRendererTurbo(this, 300, 127, textureX, textureY); // Box 237
		turretModel[53] = new ModelRendererTurbo(this, 300, 132, textureX, textureY); // Box 238
		turretModel[54] = new ModelRendererTurbo(this, 300, 136, textureX, textureY); // Box 239
		turretModel[55] = new ModelRendererTurbo(this, 300, 140, textureX, textureY); // Box 240
		turretModel[56] = new ModelRendererTurbo(this, 300, 145, textureX, textureY); // Box 241
		turretModel[57] = new ModelRendererTurbo(this, 300, 96, textureX, textureY); // Box 252
		turretModel[58] = new ModelRendererTurbo(this, 300, 103, textureX, textureY); // Box 253
		turretModel[59] = new ModelRendererTurbo(this, 300, 110, textureX, textureY); // Box 254
		turretModel[60] = new ModelRendererTurbo(this, 300, 115, textureX, textureY); // Box 255
		turretModel[61] = new ModelRendererTurbo(this, 300, 121, textureX, textureY); // Box 256
		turretModel[62] = new ModelRendererTurbo(this, 300, 127, textureX, textureY); // Box 257
		turretModel[63] = new ModelRendererTurbo(this, 300, 132, textureX, textureY); // Box 258
		turretModel[64] = new ModelRendererTurbo(this, 300, 145, textureX, textureY); // Box 259
		turretModel[65] = new ModelRendererTurbo(this, 300, 140, textureX, textureY); // Box 260
		turretModel[66] = new ModelRendererTurbo(this, 300, 145, textureX, textureY); // Box 261
		turretModel[67] = new ModelRendererTurbo(this, 300, 94, textureX, textureY); // Box 262
		turretModel[68] = new ModelRendererTurbo(this, 300, 155, textureX, textureY); // Box 263
		turretModel[69] = new ModelRendererTurbo(this, 300, 210, textureX, textureY); // Box 264
		turretModel[70] = new ModelRendererTurbo(this, 300, 220, textureX, textureY); // Box 265
		turretModel[71] = new ModelRendererTurbo(this, 300, 226, textureX, textureY); // Box 266
		turretModel[72] = new ModelRendererTurbo(this, 300, 230, textureX, textureY); // Box 267
		turretModel[73] = new ModelRendererTurbo(this, 300, 280, textureX, textureY); // Box 268
		turretModel[74] = new ModelRendererTurbo(this, 300, 220, textureX, textureY); // Box 269
		turretModel[75] = new ModelRendererTurbo(this, 300, 226, textureX, textureY); // Box 270
		turretModel[76] = new ModelRendererTurbo(this, 300, 230, textureX, textureY); // Box 271
		turretModel[77] = new ModelRendererTurbo(this, 300, 293, textureX, textureY); // Box 272
		turretModel[78] = new ModelRendererTurbo(this, 300, 293, textureX, textureY); // Box 273
		turretModel[79] = new ModelRendererTurbo(this, 300, 293, textureX, textureY); // Box 274
		turretModel[80] = new ModelRendererTurbo(this, 300, 298, textureX, textureY); // Box 275
		turretModel[81] = new ModelRendererTurbo(this, 300, 320, textureX, textureY); // Box 276
		turretModel[82] = new ModelRendererTurbo(this, 300, 320, textureX, textureY); // Box 277
		turretModel[83] = new ModelRendererTurbo(this, 300, 325, textureX, textureY); // Box 279
		turretModel[84] = new ModelRendererTurbo(this, 300, 345, textureX, textureY); // Box 281
		turretModel[85] = new ModelRendererTurbo(this, 300, 365, textureX, textureY); // Box 320
		turretModel[86] = new ModelRendererTurbo(this, 300, 386, textureX, textureY); // Box 321
		turretModel[87] = new ModelRendererTurbo(this, 300, 386, textureX, textureY); // Box 322
		turretModel[88] = new ModelRendererTurbo(this, 300, 438, textureX, textureY); // Box 324
		turretModel[89] = new ModelRendererTurbo(this, 300, 492, textureX, textureY); // Box 304
		turretModel[90] = new ModelRendererTurbo(this, 300, 492, textureX, textureY); // Box 305
		turretModel[91] = new ModelRendererTurbo(this, 300, 530, textureX, textureY); // Box 306
		turretModel[92] = new ModelRendererTurbo(this, 300, 533, textureX, textureY); // Box 307
		turretModel[93] = new ModelRendererTurbo(this, 300, 536, textureX, textureY); // Box 308
		turretModel[94] = new ModelRendererTurbo(this, 300, 540, textureX, textureY); // Box 309
		turretModel[95] = new ModelRendererTurbo(this, 300, 540, textureX, textureY); // Box 310
		turretModel[96] = new ModelRendererTurbo(this, 300, 536, textureX, textureY); // Box 311
		turretModel[97] = new ModelRendererTurbo(this, 300, 533, textureX, textureY); // Box 312
		turretModel[98] = new ModelRendererTurbo(this, 300, 530, textureX, textureY); // Box 313
		turretModel[99] = new ModelRendererTurbo(this, 300, 511, textureX, textureY); // Box 314
		turretModel[100] = new ModelRendererTurbo(this, 300, 550, textureX, textureY); // Box 315
		turretModel[101] = new ModelRendererTurbo(this, 300, 565, textureX, textureY); // Box 316
		turretModel[102] = new ModelRendererTurbo(this, 300, 580, textureX, textureY); // Box 318
		turretModel[103] = new ModelRendererTurbo(this, 300, 580, textureX, textureY); // Box 319
		turretModel[104] = new ModelRendererTurbo(this, 300, 580, textureX, textureY); // Box 320
		turretModel[105] = new ModelRendererTurbo(this, 300, 580, textureX, textureY); // Box 321
		turretModel[106] = new ModelRendererTurbo(this, 300, 580, textureX, textureY); // Box 322
		turretModel[107] = new ModelRendererTurbo(this, 300, 580, textureX, textureY); // Box 323
		turretModel[108] = new ModelRendererTurbo(this, 300, 580, textureX, textureY); // Box 324
		turretModel[109] = new ModelRendererTurbo(this, 300, 580, textureX, textureY); // Box 325
		turretModel[110] = new ModelRendererTurbo(this, 300, 580, textureX, textureY); // Box 326
		turretModel[111] = new ModelRendererTurbo(this, 300, 580, textureX, textureY); // Box 327
		turretModel[112] = new ModelRendererTurbo(this, 300, 590, textureX, textureY); // Box 329
		turretModel[113] = new ModelRendererTurbo(this, 300, 600, textureX, textureY); // Box 330
		turretModel[114] = new ModelRendererTurbo(this, 300, 612, textureX, textureY); // Box 331
		turretModel[115] = new ModelRendererTurbo(this, 300, 625, textureX, textureY); // Box 332
		turretModel[116] = new ModelRendererTurbo(this, 300, 640, textureX, textureY); // Box 333
		turretModel[117] = new ModelRendererTurbo(this, 300, 651, textureX, textureY); // Box 334
		turretModel[118] = new ModelRendererTurbo(this, 300, 655, textureX, textureY); // Box 335
		turretModel[119] = new ModelRendererTurbo(this, 300, 651, textureX, textureY); // Box 336
		turretModel[120] = new ModelRendererTurbo(this, 300, 658, textureX, textureY); // Box 337
		turretModel[121] = new ModelRendererTurbo(this, 300, 664, textureX, textureY); // Box 338
		turretModel[122] = new ModelRendererTurbo(this, 300, 664, textureX, textureY); // Box 339
		turretModel[123] = new ModelRendererTurbo(this, 300, 640, textureX, textureY); // Box 340
		turretModel[124] = new ModelRendererTurbo(this, 300, 655, textureX, textureY); // Box 341
		turretModel[125] = new ModelRendererTurbo(this, 300, 651, textureX, textureY); // Box 342
		turretModel[126] = new ModelRendererTurbo(this, 300, 658, textureX, textureY); // Box 343
		turretModel[127] = new ModelRendererTurbo(this, 300, 651, textureX, textureY); // Box 344
		turretModel[128] = new ModelRendererTurbo(this, 300, 673, textureX, textureY); // Box 345
		turretModel[129] = new ModelRendererTurbo(this, 300, 677, textureX, textureY); // Box 346
		turretModel[130] = new ModelRendererTurbo(this, 300, 687, textureX, textureY); // Box 347
		turretModel[131] = new ModelRendererTurbo(this, 300, 695, textureX, textureY); // Box 348
		turretModel[132] = new ModelRendererTurbo(this, 300, 705, textureX, textureY); // Box 349
		turretModel[133] = new ModelRendererTurbo(this, 300, 705, textureX, textureY); // Box 350
		turretModel[134] = new ModelRendererTurbo(this, 300, 705, textureX, textureY); // Box 351
		turretModel[135] = new ModelRendererTurbo(this, 300, 705, textureX, textureY); // Box 352
		turretModel[136] = new ModelRendererTurbo(this, 300, 705, textureX, textureY); // Box 353
		turretModel[137] = new ModelRendererTurbo(this, 300, 705, textureX, textureY); // Box 354
		turretModel[138] = new ModelRendererTurbo(this, 300, 705, textureX, textureY); // Box 355
		turretModel[139] = new ModelRendererTurbo(this, 300, 705, textureX, textureY); // Box 356
		turretModel[140] = new ModelRendererTurbo(this, 300, 705, textureX, textureY); // Box 357
		turretModel[141] = new ModelRendererTurbo(this, 300, 705, textureX, textureY); // Box 358
		turretModel[142] = new ModelRendererTurbo(this, 300, 705, textureX, textureY); // Box 359
		turretModel[143] = new ModelRendererTurbo(this, 300, 682, textureX, textureY); // Box 358
		turretModel[144] = new ModelRendererTurbo(this, 300, 727, textureX, textureY); // Box 359
		turretModel[145] = new ModelRendererTurbo(this, 300, 773, textureX, textureY); // Box 360
		turretModel[146] = new ModelRendererTurbo(this, 300, 819, textureX, textureY); // Box 361
		turretModel[147] = new ModelRendererTurbo(this, 300, 823, textureX, textureY); // Box 362
		turretModel[148] = new ModelRendererTurbo(this, 300, 826, textureX, textureY); // Box 363
		turretModel[149] = new ModelRendererTurbo(this, 300, 826, textureX, textureY); // Box 364
		turretModel[150] = new ModelRendererTurbo(this, 300, 823, textureX, textureY); // Box 365
		turretModel[151] = new ModelRendererTurbo(this, 300, 819, textureX, textureY); // Box 366
		turretModel[152] = new ModelRendererTurbo(this, 300, 837, textureX, textureY); // Box 367
		turretModel[153] = new ModelRendererTurbo(this, 300, 850, textureX, textureY); // Box 368
		turretModel[154] = new ModelRendererTurbo(this, 300, 850, textureX, textureY); // Box 369
		turretModel[155] = new ModelRendererTurbo(this, 300, 865, textureX, textureY); // Box 370
		turretModel[156] = new ModelRendererTurbo(this, 300, 865, textureX, textureY); // Box 371
		turretModel[157] = new ModelRendererTurbo(this, 300, 876, textureX, textureY); // Box 372
		turretModel[158] = new ModelRendererTurbo(this, 300, 876, textureX, textureY); // Box 373
		turretModel[159] = new ModelRendererTurbo(this, 300, 881, textureX, textureY); // Box 374
		turretModel[160] = new ModelRendererTurbo(this, 300, 876, textureX, textureY); // Box 375
		turretModel[161] = new ModelRendererTurbo(this, 300, 890, textureX, textureY); // Box 376
		turretModel[162] = new ModelRendererTurbo(this, 300, 900, textureX, textureY); // Box 377
		turretModel[163] = new ModelRendererTurbo(this, 300, 925, textureX, textureY); // Box 378
		turretModel[164] = new ModelRendererTurbo(this, 300, 935, textureX, textureY); // Box 379
		turretModel[165] = new ModelRendererTurbo(this, 300, 935, textureX, textureY); // Box 380
		turretModel[166] = new ModelRendererTurbo(this, 300, 952, textureX, textureY); // Box 381
		turretModel[167] = new ModelRendererTurbo(this, 300, 970, textureX, textureY); // Box 382
		turretModel[168] = new ModelRendererTurbo(this, 300, 982, textureX, textureY); // Box 383
		turretModel[169] = new ModelRendererTurbo(this, 300, 995, textureX, textureY); // Box 384
		turretModel[170] = new ModelRendererTurbo(this, 300, 1007, textureX, textureY); // Box 385
		turretModel[171] = new ModelRendererTurbo(this, 300, 1013, textureX, textureY); // Box 386
		turretModel[172] = new ModelRendererTurbo(this, 300, 1017, textureX, textureY); // Box 387
		turretModel[173] = new ModelRendererTurbo(this, 300, 1021, textureX, textureY); // Box 388
		turretModel[174] = new ModelRendererTurbo(this, 300, 1035, textureX, textureY); // Box 389
		turretModel[175] = new ModelRendererTurbo(this, 300, 1060, textureX, textureY); // Box 390
		turretModel[176] = new ModelRendererTurbo(this, 300, 1084, textureX, textureY); // Box 391
		turretModel[177] = new ModelRendererTurbo(this, 300, 1060, textureX, textureY); // Box 392
		turretModel[178] = new ModelRendererTurbo(this, 300, 1084, textureX, textureY); // Box 393
		turretModel[179] = new ModelRendererTurbo(this, 300, 1102, textureX, textureY); // Box 394
		turretModel[180] = new ModelRendererTurbo(this, 300, 1107, textureX, textureY); // Box 395
		turretModel[181] = new ModelRendererTurbo(this, 300, 1102, textureX, textureY); // Box 406
		turretModel[182] = new ModelRendererTurbo(this, 300, 1107, textureX, textureY); // Box 407
		turretModel[183] = new ModelRendererTurbo(this, 300, 1107, textureX, textureY); // Box 408
		turretModel[184] = new ModelRendererTurbo(this, 300, 1102, textureX, textureY); // Box 409
		turretModel[185] = new ModelRendererTurbo(this, 300, 1107, textureX, textureY); // Box 410
		turretModel[186] = new ModelRendererTurbo(this, 300, 1102, textureX, textureY); // Box 411
		turretModel[187] = new ModelRendererTurbo(this, 300, 1107, textureX, textureY); // Box 412
		turretModel[188] = new ModelRendererTurbo(this, 300, 1102, textureX, textureY); // Box 413
		turretModel[189] = new ModelRendererTurbo(this, 300, 1107, textureX, textureY); // Box 414
		turretModel[190] = new ModelRendererTurbo(this, 300, 1102, textureX, textureY); // Box 415
		turretModel[191] = new ModelRendererTurbo(this, 300, 1107, textureX, textureY); // Box 416
		turretModel[192] = new ModelRendererTurbo(this, 300, 1102, textureX, textureY); // Box 417
		turretModel[193] = new ModelRendererTurbo(this, 300, 1107, textureX, textureY); // Box 418
		turretModel[194] = new ModelRendererTurbo(this, 300, 1102, textureX, textureY); // Box 419
		turretModel[195] = new ModelRendererTurbo(this, 300, 1107, textureX, textureY); // Box 420
		turretModel[196] = new ModelRendererTurbo(this, 300, 1102, textureX, textureY); // Box 421
		turretModel[197] = new ModelRendererTurbo(this, 300, 1107, textureX, textureY); // Box 422
		turretModel[198] = new ModelRendererTurbo(this, 300, 1102, textureX, textureY); // Box 423
		turretModel[199] = new ModelRendererTurbo(this, 300, 1120, textureX, textureY); // Box 424
		turretModel[200] = new ModelRendererTurbo(this, 300, 1130, textureX, textureY); // Box 425
		turretModel[201] = new ModelRendererTurbo(this, 300, 1130, textureX, textureY); // Box 426
		turretModel[202] = new ModelRendererTurbo(this, 300, 1136, textureX, textureY); // Box 427
		turretModel[203] = new ModelRendererTurbo(this, 300, 1150, textureX, textureY); // Box 428
		turretModel[204] = new ModelRendererTurbo(this, 300, 1150, textureX, textureY); // Box 429
		turretModel[205] = new ModelRendererTurbo(this, 300, 1153, textureX, textureY); // Box 430
		turretModel[206] = new ModelRendererTurbo(this, 300, 1153, textureX, textureY); // Box 431
		turretModel[207] = new ModelRendererTurbo(this, 300, 1136, textureX, textureY); // Box 432
		turretModel[208] = new ModelRendererTurbo(this, 300, 1150, textureX, textureY); // Box 433
		turretModel[209] = new ModelRendererTurbo(this, 300, 1150, textureX, textureY); // Box 434
		turretModel[210] = new ModelRendererTurbo(this, 300, 220, textureX, textureY); // Box 435
		turretModel[211] = new ModelRendererTurbo(this, 300, 226, textureX, textureY); // Box 436
		turretModel[212] = new ModelRendererTurbo(this, 300, 230, textureX, textureY); // Box 437
		turretModel[213] = new ModelRendererTurbo(this, 300, 1851, textureX, textureY); // Box 578
		turretModel[214] = new ModelRendererTurbo(this, 300, 1857, textureX, textureY); // Box 579
		turretModel[215] = new ModelRendererTurbo(this, 300, 1860, textureX, textureY); // Box 580
		turretModel[216] = new ModelRendererTurbo(this, 300, 1865, textureX, textureY); // Box 581
		turretModel[217] = new ModelRendererTurbo(this, 300, 1870, textureX, textureY); // Box 582
		turretModel[218] = new ModelRendererTurbo(this, 300, 1873, textureX, textureY); // Box 583
		turretModel[219] = new ModelRendererTurbo(this, 300, 1880, textureX, textureY); // Box 584
		turretModel[220] = new ModelRendererTurbo(this, 300, 1890, textureX, textureY); // Box 585
		turretModel[221] = new ModelRendererTurbo(this, 300, 1896, textureX, textureY); // Box 586
		turretModel[222] = new ModelRendererTurbo(this, 300, 1900, textureX, textureY); // Box 587
		turretModel[223] = new ModelRendererTurbo(this, 300, 1900, textureX, textureY); // Box 588
		turretModel[224] = new ModelRendererTurbo(this, 300, 1905, textureX, textureY); // Box 589
		turretModel[225] = new ModelRendererTurbo(this, 300, 1905, textureX, textureY); // Box 590
		turretModel[226] = new ModelRendererTurbo(this, 300, 1910, textureX, textureY); // Box 591
		turretModel[227] = new ModelRendererTurbo(this, 300, 1916, textureX, textureY); // Box 592
		turretModel[228] = new ModelRendererTurbo(this, 300, 1910, textureX, textureY); // Box 593
		turretModel[229] = new ModelRendererTurbo(this, 300, 1924, textureX, textureY); // Box 594
		turretModel[230] = new ModelRendererTurbo(this, 300, 1929, textureX, textureY); // Box 595
		turretModel[231] = new ModelRendererTurbo(this, 300, 1933, textureX, textureY); // Box 596
		turretModel[232] = new ModelRendererTurbo(this, 300, 1937, textureX, textureY); // Box 597
		turretModel[233] = new ModelRendererTurbo(this, 300, 1940, textureX, textureY); // Box 598
		turretModel[234] = new ModelRendererTurbo(this, 300, 1943, textureX, textureY); // Box 599
		turretModel[235] = new ModelRendererTurbo(this, 300, 1947, textureX, textureY); // Box 600
		turretModel[236] = new ModelRendererTurbo(this, 300, 1950, textureX, textureY); // Box 601
		turretModel[237] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 602
		turretModel[238] = new ModelRendererTurbo(this, 300, 1158, textureX, textureY); // Box 603
		turretModel[239] = new ModelRendererTurbo(this, 300, 1165, textureX, textureY); // Box 604
		turretModel[240] = new ModelRendererTurbo(this, 300, 1119, textureX, textureY); // Box 605

		turretModel[0].addShapeBox(0F, 0F, 0F, 5, 14, 8, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		turretModel[0].setRotationPoint(26F, -38F, -4F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 12, 15, 8, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		turretModel[1].setRotationPoint(14F, -39F, -4F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 5, 14, 7, 0F, 0.5F, -1.5F, 0F, 0F, -3.5F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		turretModel[2].setRotationPoint(26F, -38F, -11F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 5, 11, 4, 0F, 0F, -0.5F, 0F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 189
		turretModel[3].setRotationPoint(31F, -35F, -8F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 190
		turretModel[4].setRotationPoint(36F, -32F, -6F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 5, 14, 4, 0F, 1.5F, -5F, 0F, 0F, -5.5F, -5F, 0F, -3.5F, 3F, 0.5F, -1.5F, 0F, 1.5F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, 0.5F, 0F, 0F); // Box 191
		turretModel[5].setRotationPoint(26F, -38F, -15F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 5, 14, 7, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3.5F, -3F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, 0F); // Box 194
		turretModel[6].setRotationPoint(26F, -38F, 4F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 5, 11, 4, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, 0F, 0F); // Box 195
		turretModel[7].setRotationPoint(31F, -35F, 4F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F); // Box 196
		turretModel[8].setRotationPoint(36F, -32F, 4F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 12, 15, 7, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -2.5F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F); // Box 197
		turretModel[9].setRotationPoint(14F, -39F, 4F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 5, 11, 4, 0F, 0F, -2.5F, 0F, 0F, -4F, -3.5F, 0F, -3F, 0F, 0F, -0.5F, -2F, 0F, 0F, 1F, 0F, -3F, -3.5F, 0F, -3F, 0F, 0F, 0F, -2F); // Box 198
		turretModel[10].setRotationPoint(31F, -35F, -10F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, -1F, -0.5F, -0.2F, -2.7F, -2.2F, 0F, -1.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.2F, -1.7F, -2.2F, 0F, -1.5F, 1.5F, 0F, 0F, 0F); // Box 200
		turretModel[11].setRotationPoint(36F, -32F, -7F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 12, 15, 7, 0F, 0F, 0F, 6F, -0.5F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		turretModel[12].setRotationPoint(14F, -39F, -11F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 11, 15, 3, 0F, 0F, -2F, 0F, -0.5F, -6F, -4F, 0.5F, -2.5F, 5F, 0F, 0F, -1F, 0F, -10F, 1F, -0.5F, 0F, -4F, 0.5F, 0F, 5F, 0F, -10F, -1F); // Box 202
		turretModel[13].setRotationPoint(14F, -39F, -19F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		turretModel[14].setRotationPoint(29F, -28.5F, -14F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 5, 4, 16, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		turretModel[15].setRotationPoint(29F, -28.5F, -9F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 9, 4, 5, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		turretModel[16].setRotationPoint(23F, -28.5F, -19F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 12, 4, 5, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 198
		turretModel[17].setRotationPoint(15F, -28.5F, -24F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 18, 4, 4, 0F, 0F, 0F, -1F, -13F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 199
		turretModel[18].setRotationPoint(2F, -28.5F, -28F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 200
		turretModel[19].setRotationPoint(26F, -32.5F, -14F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 9, 4, 5, 0F, 0F, 0F, -0.5F, -8F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 201
		turretModel[20].setRotationPoint(19F, -32.5F, -19F);

		turretModel[21].addShapeBox(0F, 0F, 0F, 12, 4, 5, 0F, 0F, 0F, -1F, -10F, 0F, -1F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 202
		turretModel[21].setRotationPoint(10F, -32.5F, -24F);

		turretModel[22].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F, 0F, 0F, -2F, -11F, 0F, -2F, -3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -8F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 203
		turretModel[22].setRotationPoint(2F, -32.5F, -27F);

		turretModel[23].addShapeBox(0F, 0F, 0F, 14, 4, 5, 0F, 0F, 0F, -1.5F, -8F, 0F, -1.5F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 204
		turretModel[23].setRotationPoint(10F, -36.5F, -19F);

		turretModel[24].addShapeBox(0F, 0F, 0F, 15, 4, 4, 0F, 0F, 0F, -2F, -6F, 0F, -2F, -1F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -5F, 0F, 0F, 3F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 205
		turretModel[24].setRotationPoint(2F, -36.5F, -23F);

		turretModel[25].addShapeBox(0F, 0F, 0F, 13, 4, 2, 0F, 0F, 0F, -3F, -11F, 0F, -3F, -4F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -11F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 206
		turretModel[25].setRotationPoint(2F, -36.5F, -25F);

		turretModel[26].addShapeBox(0F, 0F, 0F, 7, 4, 6, 0F, 0F, 0F, 0F, -1.5F, -3F, 0F, -4.5F, -2F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 4F); // Box 207
		turretModel[26].setRotationPoint(27F, -28.5F, 10F);

		turretModel[27].addShapeBox(0F, 0F, 0F, 7, 8, 14, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 4F); // Box 208
		turretModel[27].setRotationPoint(20F, -32.5F, 7F);

		turretModel[28].addShapeBox(0F, 0F, 0F, 7, 4, 3, 0F, 0F, 0F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		turretModel[28].setRotationPoint(27F, -28.5F, 7F);

		turretModel[29].addShapeBox(0F, 0F, 0F, 7, 12, 18, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 210
		turretModel[29].setRotationPoint(13F, -36.5F, 7F);

		turretModel[30].addShapeBox(0F, 0F, 0F, 12, 15, 5, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		turretModel[30].setRotationPoint(2F, -39F, 4F);

		turretModel[31].addShapeBox(0F, 0F, 0F, 12, 15, 8, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		turretModel[31].setRotationPoint(2F, -39F, -4F);

		turretModel[32].addShapeBox(0F, 0F, 0F, 12, 15, 13, 0F, 0F, 1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		turretModel[32].setRotationPoint(2F, -39F, -17F);

		turretModel[33].addShapeBox(0F, 0F, 0F, 12, 7, 4, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 214
		turretModel[33].setRotationPoint(2F, -39F, -21F);

		turretModel[34].addShapeBox(0F, 0F, 0F, 13, 2, 4, 0F, 0F, 0F, -3F, -6F, 0F, -3F, -1F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 215
		turretModel[34].setRotationPoint(3F, -38.5F, -21F);

		turretModel[35].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, -3F, -6F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -6F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F); // Box 216
		turretModel[35].setRotationPoint(2F, -38.5F, -22F);

		turretModel[36].addShapeBox(0F, 0F, 0F, 11, 15, 16, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 217
		turretModel[36].setRotationPoint(2F, -39.5F, 9F);

		turretModel[37].addShapeBox(0F, 0F, 0F, 12, 12, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		turretModel[37].setRotationPoint(-8F, -39F, -34F);

		turretModel[38].addShapeBox(0F, 0F, 0F, 12, 12, 5, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		turretModel[38].setRotationPoint(-8F, -39F, -39F);

		turretModel[39].addShapeBox(2F, 1F, -2F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 219
		turretModel[39].setRotationPoint(16F, -32.5F, -18F);
		turretModel[39].rotateAngleY = -0.90757121F;
		turretModel[39].rotateAngleZ = 0.41887902F;

		turretModel[40].addShapeBox(2F, 6F, -2F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 220
		turretModel[40].setRotationPoint(16F, -32.5F, -18F);
		turretModel[40].rotateAngleY = -0.90757121F;
		turretModel[40].rotateAngleZ = 0.41887902F;

		turretModel[41].addShapeBox(3F, 2F, -1F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		turretModel[41].setRotationPoint(16F, -32.5F, -18F);
		turretModel[41].rotateAngleY = -0.90757121F;
		turretModel[41].rotateAngleZ = 0.41887902F;

		turretModel[42].addShapeBox(3F, 2F, 3F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		turretModel[42].setRotationPoint(16F, -32.5F, -18F);
		turretModel[42].rotateAngleY = -0.90757121F;
		turretModel[42].rotateAngleZ = 0.41887902F;

		turretModel[43].addShapeBox(2F, 6F, -2F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 228
		turretModel[43].setRotationPoint(16F, -32.5F, 19F);
		turretModel[43].rotateAngleY = 0.90757121F;
		turretModel[43].rotateAngleZ = 0.41887902F;

		turretModel[44].addShapeBox(3F, 2F, -1F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		turretModel[44].setRotationPoint(16F, -32.5F, 19F);
		turretModel[44].rotateAngleY = 0.90757121F;
		turretModel[44].rotateAngleZ = 0.41887902F;

		turretModel[45].addShapeBox(2F, 1F, -2F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 230
		turretModel[45].setRotationPoint(16F, -32.5F, 19F);
		turretModel[45].rotateAngleY = 0.90757121F;
		turretModel[45].rotateAngleZ = 0.41887902F;

		turretModel[46].addShapeBox(3F, 2F, 3F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		turretModel[46].setRotationPoint(16F, -32.5F, 19F);
		turretModel[46].rotateAngleY = 0.90757121F;
		turretModel[46].rotateAngleZ = 0.41887902F;

		turretModel[47].addShapeBox(4F, 1F, -2F, 5, 1, 4, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		turretModel[47].setRotationPoint(16F, -32.5F, -18F);
		turretModel[47].rotateAngleY = -0.90757121F;
		turretModel[47].rotateAngleZ = 0.41887902F;

		turretModel[48].addShapeBox(4F, 2F, -2F, 5, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		turretModel[48].setRotationPoint(16F, -32.5F, -18F);
		turretModel[48].rotateAngleY = -0.90757121F;
		turretModel[48].rotateAngleZ = 0.41887902F;

		turretModel[49].addShapeBox(4F, 1F, 2F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F); // Box 234
		turretModel[49].setRotationPoint(16F, -32.5F, -18F);
		turretModel[49].rotateAngleY = -0.90757121F;
		turretModel[49].rotateAngleZ = 0.41887902F;

		turretModel[50].addShapeBox(4F, 2F, 2F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F); // Box 235
		turretModel[50].setRotationPoint(16F, -32.5F, -18F);
		turretModel[50].rotateAngleY = -0.90757121F;
		turretModel[50].rotateAngleZ = 0.41887902F;

		turretModel[51].addShapeBox(4F, 3F, -2F, 5, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		turretModel[51].setRotationPoint(16F, -32.5F, -18F);
		turretModel[51].rotateAngleY = -0.90757121F;
		turretModel[51].rotateAngleZ = 0.41887902F;

		turretModel[52].addShapeBox(4F, 3F, 2F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -3F); // Box 237
		turretModel[52].setRotationPoint(16F, -32.5F, -18F);
		turretModel[52].rotateAngleY = -0.90757121F;
		turretModel[52].rotateAngleZ = 0.41887902F;

		turretModel[53].addShapeBox(4F, 4F, 0F, 5, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 238
		turretModel[53].setRotationPoint(16F, -32.5F, -18F);
		turretModel[53].rotateAngleY = -0.90757121F;
		turretModel[53].rotateAngleZ = 0.41887902F;

		turretModel[54].addShapeBox(4F, 4F, 2F, 5, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F); // Box 239
		turretModel[54].setRotationPoint(16F, -32.5F, -18F);
		turretModel[54].rotateAngleY = -0.90757121F;
		turretModel[54].rotateAngleZ = 0.41887902F;

		turretModel[55].addShapeBox(4F, 5F, 0F, 5, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 240
		turretModel[55].setRotationPoint(16F, -32.5F, -18F);
		turretModel[55].rotateAngleY = -0.90757121F;
		turretModel[55].rotateAngleZ = 0.41887902F;

		turretModel[56].addShapeBox(4F, 5F, 2F, 5, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F); // Box 241
		turretModel[56].setRotationPoint(16F, -32.5F, -18F);
		turretModel[56].rotateAngleY = -0.90757121F;
		turretModel[56].rotateAngleZ = 0.41887902F;

		turretModel[57].addShapeBox(4F, 1F, 2F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 252
		turretModel[57].setRotationPoint(16F, -32.5F, 18F);
		turretModel[57].rotateAngleY = 0.90757121F;
		turretModel[57].rotateAngleZ = 0.41887902F;

		turretModel[58].addShapeBox(4F, 2F, 2F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 253
		turretModel[58].setRotationPoint(16F, -32.5F, 18F);
		turretModel[58].rotateAngleY = 0.90757121F;
		turretModel[58].rotateAngleZ = 0.41887902F;

		turretModel[59].addShapeBox(4F, 1F, -1F, 5, 1, 3, 0F, 0F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		turretModel[59].setRotationPoint(16F, -32.5F, 18F);
		turretModel[59].rotateAngleY = 0.90757121F;
		turretModel[59].rotateAngleZ = 0.41887902F;

		turretModel[60].addShapeBox(4F, 2F, -1F, 5, 1, 3, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		turretModel[60].setRotationPoint(16F, -32.5F, 18F);
		turretModel[60].rotateAngleY = 0.90757121F;
		turretModel[60].rotateAngleZ = 0.41887902F;

		turretModel[61].addShapeBox(4F, 3F, 2F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F); // Box 256
		turretModel[61].setRotationPoint(16F, -32.5F, 18F);
		turretModel[61].rotateAngleY = 0.90757121F;
		turretModel[61].rotateAngleZ = 0.41887902F;

		turretModel[62].addShapeBox(4F, 3F, -1F, 5, 1, 3, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		turretModel[62].setRotationPoint(16F, -32.5F, 18F);
		turretModel[62].rotateAngleY = 0.90757121F;
		turretModel[62].rotateAngleZ = 0.41887902F;

		turretModel[63].addShapeBox(4F, 4F, 2F, 5, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 258
		turretModel[63].setRotationPoint(16F, -32.5F, 18F);
		turretModel[63].rotateAngleY = 0.90757121F;
		turretModel[63].rotateAngleZ = 0.41887902F;

		turretModel[64].addShapeBox(4F, 4F, 1F, 5, 1, 1, 0F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 259
		turretModel[64].setRotationPoint(16F, -32.5F, 18F);
		turretModel[64].rotateAngleY = 0.90757121F;
		turretModel[64].rotateAngleZ = 0.41887902F;

		turretModel[65].addShapeBox(4F, 5F, 2F, 5, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 260
		turretModel[65].setRotationPoint(16F, -32.5F, 18F);
		turretModel[65].rotateAngleY = 0.90757121F;
		turretModel[65].rotateAngleZ = 0.41887902F;

		turretModel[66].addShapeBox(4F, 5F, 1F, 5, 1, 1, 0F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 261
		turretModel[66].setRotationPoint(16F, -32.5F, 18F);
		turretModel[66].rotateAngleY = 0.90757121F;
		turretModel[66].rotateAngleZ = 0.41887902F;

		turretModel[67].addShapeBox(0F, 0F, 0F, 10, 4, 56, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 1F, -1.9354F, 0F, 1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 262
		turretModel[67].setRotationPoint(-8F, -28.5F, -28F);

		turretModel[68].addShapeBox(0F, 0F, 0F, 10, 12, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		turretModel[68].setRotationPoint(-8F, -40F, -20F);

		turretModel[69].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		turretModel[69].setRotationPoint(8F, -38.5F, -23F);

		turretModel[70].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		turretModel[70].setRotationPoint(8.5F, -41.5F, -22.5F);

		turretModel[71].addTrapezoid(0F, 0F, 0F, 2, 2, 2, 0F, -0.80F, ModelRendererTurbo.MR_TOP); // Box 266
		turretModel[71].setRotationPoint(8.5F, -43.5F, -22.5F);

		turretModel[72].addShapeBox(0F, 0F, 0F, 2, 20, 2, 0F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F); // Box 267
		turretModel[72].setRotationPoint(8.5F, -63.5F, -22.5F);

		turretModel[73].addShapeBox(0F, 0F, 0F, 8, 5, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		turretModel[73].setRotationPoint(4F, -34.5F, 23F);

		turretModel[74].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		turretModel[74].setRotationPoint(6.5F, -37.5F, 25.5F);

		turretModel[75].addTrapezoid(0F, 0F, 0F, 2, 2, 2, 0F, -0.80F, ModelRendererTurbo.MR_TOP); // Box 270
		turretModel[75].setRotationPoint(6.5F, -39.5F, 25.5F);

		turretModel[76].addShapeBox(0F, 0F, 0F, 2, 47, 2, 0F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F); // Box 271
		turretModel[76].setRotationPoint(6.5F, -85.5F, 25.5F);

		turretModel[77].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		turretModel[77].setRotationPoint(5F, -29.5F, 26F);

		turretModel[78].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		turretModel[78].setRotationPoint(5F, -28.5F, 26F);

		turretModel[79].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 274
		turretModel[79].setRotationPoint(5F, -27.5F, 26F);

		turretModel[80].addShapeBox(0F, 0F, 0F, 19, 11, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		turretModel[80].setRotationPoint(-17F, -40F, 22F);

		turretModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		turretModel[81].setRotationPoint(-14F, -38.5F, 31.5F);

		turretModel[82].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		turretModel[82].setRotationPoint(-2F, -38.5F, 31.5F);

		turretModel[83].addShapeBox(0F, 0F, 0F, 20, 12, 6, 0F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 2.5F, -1F, 0F, 2.5F, 0F, 0F, 0F, 0F); // Box 279
		turretModel[83].setRotationPoint(-28F, -40F, -26F);

		turretModel[84].addShapeBox(0F, 0F, 0F, 10, 12, 6, 0F, 0F, 0F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		turretModel[84].setRotationPoint(-8F, -40F, -26F);

		turretModel[85].addShapeBox(0F, 0F, 0F, 11, 12, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 1.375F, 0F, 0F, 1.375F, -3F, 0F, 0F, -5F); // Box 320
		turretModel[85].setRotationPoint(-28F, -40F, 19F);

		turretModel[86].addShapeBox(0F, 0F, 0F, 9, 12, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 1.375F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, -1F, 0F, 1.375F, -3F); // Box 321
		turretModel[86].setRotationPoint(-17F, -40F, 19F);

		turretModel[87].addShapeBox(0F, 0F, 0F, 20, 12, 39, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F); // Box 322
		turretModel[87].setRotationPoint(-28F, -40F, -20F);

		turretModel[88].addShapeBox(0F, 0F, 0F, 10, 12, 41, 0F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, -1F); // Box 324
		turretModel[88].setRotationPoint(-38F, -40F, -20F);

		turretModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		turretModel[89].setRotationPoint(-11F, -41F, -23F);

		turretModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		turretModel[90].setRotationPoint(-11F, -41F, -38F);

		turretModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		turretModel[91].setRotationPoint(-13F, -38F, -39F);

		turretModel[92].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F); // Box 307
		turretModel[92].setRotationPoint(-38F, -38F, -39F);

		turretModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		turretModel[93].setRotationPoint(-39F, -38F, -28F);

		turretModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 309
		turretModel[94].setRotationPoint(-39F, -38F, -26F);

		turretModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 310
		turretModel[95].setRotationPoint(-39F, -30F, -26F);

		turretModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		turretModel[96].setRotationPoint(-39F, -30F, -28F);

		turretModel[97].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F); // Box 312
		turretModel[97].setRotationPoint(-38F, -30F, -39F);

		turretModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		turretModel[98].setRotationPoint(-13F, -30F, -39F);

		turretModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		turretModel[99].setRotationPoint(-11F, -30F, -38F);

		turretModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		turretModel[100].setRotationPoint(-13F, -30F, -38F);

		turretModel[101].addShapeBox(0F, 0F, 0F, 25, 1, 12, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 6F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 6F); // Box 316
		turretModel[101].setRotationPoint(-38F, -30F, -38F);

		turretModel[102].addShapeBox(0F, 1F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		turretModel[102].setRotationPoint(-39F, -38F, -26F);
		turretModel[102].rotateAngleY = -0.27829799F;

		turretModel[103].addShapeBox(0F, 1F, 3F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		turretModel[103].setRotationPoint(-39F, -38F, -26F);
		turretModel[103].rotateAngleY = -0.27829799F;

		turretModel[104].addShapeBox(0F, 1F, 6F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		turretModel[104].setRotationPoint(-39F, -38F, -26F);
		turretModel[104].rotateAngleY = -0.27829799F;

		turretModel[105].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		turretModel[105].setRotationPoint(-13F, -37F, -39F);

		turretModel[106].addShapeBox(-4F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		turretModel[106].setRotationPoint(-13F, -37F, -39F);
		turretModel[106].rotateAngleY = -0.41450523F;

		turretModel[107].addShapeBox(-8F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		turretModel[107].setRotationPoint(-13F, -37F, -39F);
		turretModel[107].rotateAngleY = -0.41450523F;

		turretModel[108].addShapeBox(-12F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		turretModel[108].setRotationPoint(-13F, -37F, -39F);
		turretModel[108].rotateAngleY = -0.41450523F;

		turretModel[109].addShapeBox(-16F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		turretModel[109].setRotationPoint(-13F, -37F, -39F);
		turretModel[109].rotateAngleY = -0.41450523F;

		turretModel[110].addShapeBox(-20F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		turretModel[110].setRotationPoint(-13F, -37F, -39F);
		turretModel[110].rotateAngleY = -0.41450523F;

		turretModel[111].addShapeBox(-24F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		turretModel[111].setRotationPoint(-13F, -37F, -39F);
		turretModel[111].rotateAngleY = -0.41450523F;

		turretModel[112].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		turretModel[112].setRotationPoint(-11F, -38F, -37F);

		turretModel[113].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		turretModel[113].setRotationPoint(-11F, -39F, -33F);

		turretModel[114].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		turretModel[114].setRotationPoint(-11F, -39F, -29F);

		turretModel[115].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		turretModel[115].setRotationPoint(-11F, -40F, -25F);

		turretModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 333
		turretModel[116].setRotationPoint(-20F, -38F, 22F);

		turretModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 334
		turretModel[117].setRotationPoint(-19F, -38F, 31F);

		turretModel[118].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		turretModel[118].setRotationPoint(-38F, -38F, 32F);

		turretModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 336
		turretModel[119].setRotationPoint(-39F, -38F, 31F);

		turretModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		turretModel[120].setRotationPoint(-39F, -38F, 27F);

		turretModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 338
		turretModel[121].setRotationPoint(-37F, -38F, 20F);

		turretModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 339
		turretModel[122].setRotationPoint(-37F, -30F, 20F);

		turretModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 340
		turretModel[123].setRotationPoint(-20F, -30F, 22F);

		turretModel[124].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		turretModel[124].setRotationPoint(-38F, -30F, 32F);

		turretModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 342
		turretModel[125].setRotationPoint(-19F, -30F, 31F);

		turretModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		turretModel[126].setRotationPoint(-39F, -30F, 27F);

		turretModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 344
		turretModel[127].setRotationPoint(-39F, -30F, 31F);

		turretModel[128].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		turretModel[128].setRotationPoint(-38F, -30F, 31F);

		turretModel[129].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 346
		turretModel[129].setRotationPoint(-28F, -30F, 23F);

		turretModel[130].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		turretModel[130].setRotationPoint(-38F, -30F, 27F);

		turretModel[131].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 348
		turretModel[131].setRotationPoint(-36F, -30F, 20F);

		turretModel[132].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		turretModel[132].setRotationPoint(-38F, -37F, 32F);

		turretModel[133].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		turretModel[133].setRotationPoint(-34F, -37F, 32F);

		turretModel[134].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		turretModel[134].setRotationPoint(-30F, -37F, 32F);

		turretModel[135].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		turretModel[135].setRotationPoint(-26F, -37F, 32F);

		turretModel[136].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		turretModel[136].setRotationPoint(-22F, -37F, 32F);

		turretModel[137].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		turretModel[137].setRotationPoint(-39F, -37F, 29F);

		turretModel[138].addShapeBox(0F, 0F, -2F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		turretModel[138].setRotationPoint(-39F, -37F, 27F);
		turretModel[138].rotateAngleY = 0.27829799F;

		turretModel[139].addShapeBox(0F, 0F, -6F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		turretModel[139].setRotationPoint(-39F, -37F, 27F);
		turretModel[139].rotateAngleY = 0.27829799F;

		turretModel[140].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		turretModel[140].setRotationPoint(-19F, -37F, 31F);

		turretModel[141].addShapeBox(0F, 0F, -4F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		turretModel[141].setRotationPoint(-19F, -37F, 31F);
		turretModel[141].rotateAngleY = -0.11065562F;

		turretModel[142].addShapeBox(0F, 0F, -8F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		turretModel[142].setRotationPoint(-19F, -37F, 31F);
		turretModel[142].rotateAngleY = -0.11065562F;

		turretModel[143].addShapeBox(0F, 0F, 0F, 2, 9, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		turretModel[143].setRotationPoint(-40F, -38.5F, -16F);

		turretModel[144].addShapeBox(0F, 0F, 0F, 1, 9, 36, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 359
		turretModel[144].setRotationPoint(-41F, -38.5F, -17F);

		turretModel[145].addShapeBox(0F, 0F, 0F, 7, 9, 36, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		turretModel[145].setRotationPoint(-48F, -38.5F, -17F);

		turretModel[146].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		turretModel[146].setRotationPoint(-48F, -37.5F, -18F);

		turretModel[147].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		turretModel[147].setRotationPoint(-49F, -37F, -18F);

		turretModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		turretModel[148].setRotationPoint(-49F, -37F, -17F);

		turretModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		turretModel[149].setRotationPoint(-49F, -32F, -17F);

		turretModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		turretModel[150].setRotationPoint(-49F, -32F, -18F);

		turretModel[151].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		turretModel[151].setRotationPoint(-48F, -32.5F, -18F);

		turretModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		turretModel[152].setRotationPoint(-49F, -36F, -11F);

		turretModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		turretModel[153].setRotationPoint(-49F, -36F, 0F);

		turretModel[154].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		turretModel[154].setRotationPoint(-49F, -38.5F, 9F);

		turretModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		turretModel[155].setRotationPoint(-50F, -38.5F, 9F);

		turretModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		turretModel[156].setRotationPoint(-50F, -34.5F, 9F);

		turretModel[157].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		turretModel[157].setRotationPoint(-50F, -37.5F, 9F);

		turretModel[158].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		turretModel[158].setRotationPoint(-50F, -37.5F, 11F);

		turretModel[159].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		turretModel[159].setRotationPoint(-50F, -37.5F, 12.5F);

		turretModel[160].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		turretModel[160].setRotationPoint(-50F, -37.5F, 17F);

		turretModel[161].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		turretModel[161].setRotationPoint(-50F, -33.5F, 12F);

		turretModel[162].addShapeBox(0F, 0F, 0F, 5, 15, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		turretModel[162].setRotationPoint(7F, -41.5F, 9F);

		turretModel[163].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		turretModel[163].setRotationPoint(9F, -42.5F, 9F);

		turretModel[164].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		turretModel[164].setRotationPoint(6F, -41.5F, 9F);

		turretModel[165].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		turretModel[165].setRotationPoint(6F, -41.5F, 13F);

		turretModel[166].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		turretModel[166].setRotationPoint(6F, -41.5F, 15F);

		turretModel[167].addShapeBox(0F, 0F, 0F, 7, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		turretModel[167].setRotationPoint(-11F, -41F, -16F);
		turretModel[167].rotateAngleY = 0.34906585F;

		turretModel[168].addShapeBox(-3F, 0F, 0F, 3, 1, 10, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 383
		turretModel[168].setRotationPoint(-11F, -41F, -16F);
		turretModel[168].rotateAngleY = 0.34906585F;

		turretModel[169].addShapeBox(7F, 0F, 0F, 3, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 384
		turretModel[169].setRotationPoint(-11F, -41F, -16F);
		turretModel[169].rotateAngleY = 0.34906585F;

		turretModel[170].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		turretModel[170].setRotationPoint(-2F, -42F, -17F);

		turretModel[171].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		turretModel[171].setRotationPoint(-23F, -41F, -4.5F);

		turretModel[172].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 387
		turretModel[172].setRotationPoint(-12F, -41F, -4.5F);

		turretModel[173].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		turretModel[173].setRotationPoint(-27F, -41F, -0.5F);

		turretModel[174].addShapeBox(0F, 0F, 0F, 7, 2, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		turretModel[174].setRotationPoint(-15F, -41.5F, 0F);

		turretModel[175].addShapeBox(0F, 0F, 0F, 4, 2, 21, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 390
		turretModel[175].setRotationPoint(-19F, -41.5F, 0F);

		turretModel[176].addShapeBox(0F, 0F, 0F, 3, 2, 15, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 391
		turretModel[176].setRotationPoint(-22F, -41.5F, 3F);

		turretModel[177].addShapeBox(0F, 0F, 0F, 4, 2, 21, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 392
		turretModel[177].setRotationPoint(-8F, -41.5F, 0F);

		turretModel[178].addShapeBox(0F, 0F, 0F, 3, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 393
		turretModel[178].setRotationPoint(-4F, -41.5F, 3F);

		turretModel[179].addShapeBox(-3.5F, -1.5F, 8.5F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 394
		turretModel[179].setRotationPoint(-11.5F, -41.5F, 10.5F);

		turretModel[180].addShapeBox(-3.5F, -2.5F, 0F, 7, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 395
		turretModel[180].setRotationPoint(-11.5F, -41.5F, 10.5F);

		turretModel[181].addShapeBox(-3.5F, -1.5F, 8.5F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 406
		turretModel[181].setRotationPoint(-11.5F, -41.5F, 10.5F);
		turretModel[181].rotateAngleY = -0.62831853F;

		turretModel[182].addShapeBox(-3.5F, -2.5F, 0F, 7, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 407
		turretModel[182].setRotationPoint(-11.5F, -41.5F, 10.5F);
		turretModel[182].rotateAngleY = -0.62831853F;

		turretModel[183].addShapeBox(-3.5F, -2.5F, 0F, 7, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 408
		turretModel[183].setRotationPoint(-11.5F, -41.5F, 10.5F);
		turretModel[183].rotateAngleY = -1.25663706F;

		turretModel[184].addShapeBox(-3.5F, -1.5F, 8.5F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 409
		turretModel[184].setRotationPoint(-11.5F, -41.5F, 10.5F);
		turretModel[184].rotateAngleY = -1.25663706F;

		turretModel[185].addShapeBox(-3.5F, -2.5F, 0F, 7, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 410
		turretModel[185].setRotationPoint(-11.5F, -41.5F, 10.5F);
		turretModel[185].rotateAngleY = -1.88495559F;

		turretModel[186].addShapeBox(-3.5F, -1.5F, 8.5F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 411
		turretModel[186].setRotationPoint(-11.5F, -41.5F, 10.5F);
		turretModel[186].rotateAngleY = -1.88495559F;

		turretModel[187].addShapeBox(-3.5F, -2.5F, 0F, 7, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 412
		turretModel[187].setRotationPoint(-11.5F, -41.5F, 10.5F);
		turretModel[187].rotateAngleY = -2.51327412F;

		turretModel[188].addShapeBox(-3.5F, -1.5F, 8.5F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 413
		turretModel[188].setRotationPoint(-11.5F, -41.5F, 10.5F);
		turretModel[188].rotateAngleY = -2.51327412F;

		turretModel[189].addShapeBox(-3.5F, -2.5F, 0F, 7, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 414
		turretModel[189].setRotationPoint(-11.5F, -41.5F, 10.5F);
		turretModel[189].rotateAngleY = -3.14159265F;

		turretModel[190].addShapeBox(-3.5F, -1.5F, 8.5F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 415
		turretModel[190].setRotationPoint(-11.5F, -41.5F, 10.5F);
		turretModel[190].rotateAngleY = -3.14159265F;

		turretModel[191].addShapeBox(-3.5F, -2.5F, 0F, 7, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 416
		turretModel[191].setRotationPoint(-11.5F, -41.5F, 10.5F);
		turretModel[191].rotateAngleY = -3.76991118F;

		turretModel[192].addShapeBox(-3.5F, -1.5F, 8.5F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 417
		turretModel[192].setRotationPoint(-11.5F, -41.5F, 10.5F);
		turretModel[192].rotateAngleY = -3.76991118F;

		turretModel[193].addShapeBox(-3.5F, -2.5F, 0F, 7, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 418
		turretModel[193].setRotationPoint(-11.5F, -41.5F, 10.5F);
		turretModel[193].rotateAngleY = -4.39822972F;

		turretModel[194].addShapeBox(-3.5F, -1.5F, 8.5F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 419
		turretModel[194].setRotationPoint(-11.5F, -41.5F, 10.5F);
		turretModel[194].rotateAngleY = -4.39822972F;

		turretModel[195].addShapeBox(-3.5F, -2.5F, 0F, 7, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 420
		turretModel[195].setRotationPoint(-11.5F, -41.5F, 10.5F);
		turretModel[195].rotateAngleY = -5.02654825F;

		turretModel[196].addShapeBox(-3.5F, -1.5F, 8.5F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 421
		turretModel[196].setRotationPoint(-11.5F, -41.5F, 10.5F);
		turretModel[196].rotateAngleY = -5.02654825F;

		turretModel[197].addShapeBox(-3.5F, -2.5F, 0F, 7, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 422
		turretModel[197].setRotationPoint(-11.5F, -41.5F, 10.5F);
		turretModel[197].rotateAngleY = -5.65486678F;

		turretModel[198].addShapeBox(-3.5F, -1.5F, 8.5F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 423
		turretModel[198].setRotationPoint(-11.5F, -41.5F, 10.5F);
		turretModel[198].rotateAngleY = -5.65486678F;

		turretModel[199].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		turretModel[199].setRotationPoint(-18.5F, -45.5F, 7.5F);

		turretModel[200].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		turretModel[200].setRotationPoint(-18.5F, -45.5F, 4.5F);

		turretModel[201].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 426
		turretModel[201].setRotationPoint(-18.5F, -45.5F, 13.5F);

		turretModel[202].addShapeBox(-9F, -0.5F, 1F, 8, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		turretModel[202].setRotationPoint(-28F, -40F, -18F);
		turretModel[202].rotateAngleZ = 0.1488888F;

		turretModel[203].addShapeBox(-9F, -0.5F, 0F, 8, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		turretModel[203].setRotationPoint(-28F, -40F, -18F);
		turretModel[203].rotateAngleZ = 0.1488888F;

		turretModel[204].addShapeBox(-9F, -0.5F, 13F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 429
		turretModel[204].setRotationPoint(-28F, -40F, -18F);
		turretModel[204].rotateAngleZ = 0.1488888F;

		turretModel[205].addShapeBox(-10F, -1F, 3F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		turretModel[205].setRotationPoint(-28F, -40F, -18F);
		turretModel[205].rotateAngleZ = 0.1488888F;

		turretModel[206].addShapeBox(-10F, -1F, 9F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		turretModel[206].setRotationPoint(-28F, -40F, -18F);
		turretModel[206].rotateAngleZ = 0.1488888F;

		turretModel[207].addShapeBox(-9F, -0.5F, 23F, 8, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		turretModel[207].setRotationPoint(-28F, -40F, -18F);
		turretModel[207].rotateAngleZ = 0.1488888F;

		turretModel[208].addShapeBox(-9F, -0.5F, 22F, 8, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		turretModel[208].setRotationPoint(-28F, -40F, -18F);
		turretModel[208].rotateAngleZ = 0.1488888F;

		turretModel[209].addShapeBox(-9F, -0.5F, 35F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 434
		turretModel[209].setRotationPoint(-28F, -40F, -18F);
		turretModel[209].rotateAngleZ = 0.1488888F;

		turretModel[210].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		turretModel[210].setRotationPoint(-24.5F, -42.5F, -18.5F);

		turretModel[211].addTrapezoid(0F, 0F, 0F, 2, 2, 2, 0F, -0.80F, ModelRendererTurbo.MR_TOP); // Box 436
		turretModel[211].setRotationPoint(-24.5F, -44.5F, -18.5F);

		turretModel[212].addShapeBox(0F, 0F, 0F, 2, 25, 2, 0F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F); // Box 437
		turretModel[212].setRotationPoint(-24.5F, -69.5F, -18.5F);

		turretModel[213].addShapeBox(-1F, 0F, -2F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		turretModel[213].setRotationPoint(-7.5F, -44.5F, 6F);

		turretModel[214].addShapeBox(-1F, -4F, -2F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 579
		turretModel[214].setRotationPoint(-7.5F, -44.5F, 6F);

		turretModel[215].addShapeBox(-1F, -3F, -2F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 580
		turretModel[215].setRotationPoint(-7.5F, -44.5F, 6F);

		turretModel[216].addShapeBox(-1F, -3F, 1F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 581
		turretModel[216].setRotationPoint(-7.5F, -44.5F, 6F);

		turretModel[217].addShapeBox(-1F, -4F, 1F, 2, 1, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 582
		turretModel[217].setRotationPoint(-7.5F, -44.5F, 6F);

		turretModel[218].addShapeBox(-1F, -4F, 2F, 3, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		turretModel[218].setRotationPoint(-7.5F, -44.5F, 6F);

		turretModel[219].addShapeBox(-1F, -3F, 2F, 3, 3, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		turretModel[219].setRotationPoint(-7.5F, -44.5F, 6F);

		turretModel[220].addShapeBox(-1F, -4F, 7F, 3, 4, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		turretModel[220].setRotationPoint(-7.5F, -44.5F, 6F);

		turretModel[221].addShapeBox(-1F, -3.5F, 8F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		turretModel[221].setRotationPoint(-7.5F, -44.5F, 6F);

		turretModel[222].addShapeBox(-1F, -5.5F, 8F, 3, 2, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		turretModel[222].setRotationPoint(-7.5F, -44.5F, 6F);

		turretModel[223].addShapeBox(-1F, -1.5F, 8F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 588
		turretModel[223].setRotationPoint(-7.5F, -44.5F, 6F);

		turretModel[224].addShapeBox(-1F, -5.5F, 10F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		turretModel[224].setRotationPoint(-7.5F, -44.5F, 6F);

		turretModel[225].addShapeBox(-1F, -0.5F, 10F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		turretModel[225].setRotationPoint(-7.5F, -44.5F, 6F);

		turretModel[226].addShapeBox(-0.5F, -4.5F, 9.5F, 2, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591
		turretModel[226].setRotationPoint(-7.5F, -44.5F, 6F);

		turretModel[227].addShapeBox(-0.5F, -3.5F, 9.5F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		turretModel[227].setRotationPoint(-7.5F, -44.5F, 6F);

		turretModel[228].addShapeBox(-0.5F, -1.5F, 9.5F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 593
		turretModel[228].setRotationPoint(-7.5F, -44.5F, 6F);

		turretModel[229].addShapeBox(-1F, -1F, -1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		turretModel[229].setRotationPoint(-7.5F, -46.5F, 6F);

		turretModel[230].addShapeBox(-1F, 0F, -1F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 595
		turretModel[230].setRotationPoint(-7.5F, -46.5F, 6F);

		turretModel[231].addShapeBox(-0.8F, -2F, -0.5F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 596
		turretModel[231].setRotationPoint(-7.5F, -46.5F, 6F);

		turretModel[232].addShapeBox(7.2F, -1.5F, -0.5F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 597
		turretModel[232].setRotationPoint(-7.5F, -46.5F, 6F);

		turretModel[233].addShapeBox(7.2F, -2.3F, -0.5F, 9, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 598
		turretModel[233].setRotationPoint(-7.5F, -46.5F, 6F);

		turretModel[234].addShapeBox(7.2F, -1.5F, -0.5F, 5, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 599
		turretModel[234].setRotationPoint(-7.5F, -46.5F, 6F);

		turretModel[235].addShapeBox(12.2F, -1.5F, -0.5F, 3, 1, 1, 0F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 600
		turretModel[235].setRotationPoint(-7.5F, -46.5F, 6F);

		turretModel[236].addShapeBox(16.2F, -2.3F, -0.5F, 3, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.3F, -0.3F); // Box 601
		turretModel[236].setRotationPoint(-7.5F, -46.5F, 6F);

		turretModel[237].addShapeBox(5.2F, -2.5F, -1F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		turretModel[237].setRotationPoint(-7.5F, -46.5F, 6F);

		turretModel[238].addShapeBox(0F, -3F, 0F, 7, 4, 2, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603
		turretModel[238].setRotationPoint(-12.5F, -44.5F, 0F);
		turretModel[238].rotateAngleY = 0.2443461F;

		turretModel[239].addShapeBox(0F, -4F, 0F, 7, 4, 2, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 604
		turretModel[239].setRotationPoint(-12.5F, -44.5F, 0F);
		turretModel[239].rotateAngleY = 0.2443461F;

		turretModel[240].addShapeBox(0F, 0F, 0F, 18, 3, 54, 0F, 0F, 0F, -18F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F); // Box 605
		turretModel[240].setRotationPoint(-16F, -27.5F, -27F);


		barrelModel = new ModelRendererTurbo[10];
		barrelModel[0] = new ModelRendererTurbo(this, 300, 1177, textureX, textureY); // Box 285
		barrelModel[1] = new ModelRendererTurbo(this, 300, 1194, textureX, textureY); // Box 286
		barrelModel[2] = new ModelRendererTurbo(this, 300, 1194, textureX, textureY); // Box 287
		barrelModel[3] = new ModelRendererTurbo(this, 300, 1206, textureX, textureY); // Box 288
		barrelModel[4] = new ModelRendererTurbo(this, 300, 1329, textureX, textureY); // Box 571
		barrelModel[5] = new ModelRendererTurbo(this, 300, 1334, textureX, textureY); // Box 572
		barrelModel[6] = new ModelRendererTurbo(this, 300, 1340, textureX, textureY); // Box 573
		barrelModel[7] = new ModelRendererTurbo(this, 300, 1340, textureX, textureY); // Box 574
		barrelModel[8] = new ModelRendererTurbo(this, 300, 1340, textureX, textureY); // Box 576
		barrelModel[9] = new ModelRendererTurbo(this, 300, 1345, textureX, textureY); // Box 577

		barrelModel[0].addShapeBox(0F, -5F, -3F, 7, 10, 6, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 285
		barrelModel[0].setRotationPoint(31F, -30F, 0F);

		barrelModel[1].addShapeBox(0F, -5F, -4F, 7, 10, 1, 0F, 0F, -1F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 286
		barrelModel[1].setRotationPoint(31F, -30F, 0F);

		barrelModel[2].addShapeBox(0F, -5F, 3F, 7, 10, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -1F, 0F); // Box 287
		barrelModel[2].setRotationPoint(31F, -30F, 0F);

		barrelModel[3].addShapeBox(7F, -2F, -3F, 1, 6, 6, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 288
		barrelModel[3].setRotationPoint(31F, -30F, 0F);

		barrelModel[4].addShapeBox(0F, -4.5F, -3F, 5, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
		barrelModel[4].setRotationPoint(31F, -30F, 0F);

		barrelModel[5].addShapeBox(5F, -4.5F, -2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		barrelModel[5].setRotationPoint(31F, -30F, 0F);

		barrelModel[6].addShapeBox(0F, -1.5F, -1F, 3, 1, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		barrelModel[6].setRotationPoint(31F, -29F, -8.5F);

		barrelModel[7].addShapeBox(0F, -0.5F, -1F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		barrelModel[7].setRotationPoint(31F, -29F, -8.5F);

		barrelModel[8].addShapeBox(0F, 0.5F, -1F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 576
		barrelModel[8].setRotationPoint(31F, -29F, -8.5F);

		barrelModel[9].addShapeBox(3F, -0.5F, -0.5F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		barrelModel[9].setRotationPoint(31F, -29F, -8.5F);


		leftTrackModel = new ModelRendererTurbo[65];
		leftTrackModel[0] = new ModelRendererTurbo(this, 300, 1350, textureX, textureY); // Box 512
		leftTrackModel[1] = new ModelRendererTurbo(this, 300, 1365, textureX, textureY); // Box 513
		leftTrackModel[2] = new ModelRendererTurbo(this, 300, 1380, textureX, textureY); // Box 514
		leftTrackModel[3] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Box 515
		leftTrackModel[4] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Box 516
		leftTrackModel[5] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Box 517
		leftTrackModel[6] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Box 518
		leftTrackModel[7] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Box 519
		leftTrackModel[8] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Box 520
		leftTrackModel[9] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Box 521
		leftTrackModel[10] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Box 522
		leftTrackModel[11] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Box 523
		leftTrackModel[12] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Box 524
		leftTrackModel[13] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Box 525
		leftTrackModel[14] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Box 526
		leftTrackModel[15] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Box 527
		leftTrackModel[16] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Box 528
		leftTrackModel[17] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Box 529
		leftTrackModel[18] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Box 530
		leftTrackModel[19] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Box 531
		leftTrackModel[20] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Box 532
		leftTrackModel[21] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Box 533
		leftTrackModel[22] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Box 534
		leftTrackModel[23] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Box 535
		leftTrackModel[24] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Box 536
		leftTrackModel[25] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Box 537
		leftTrackModel[26] = new ModelRendererTurbo(this, 300, 1808, textureX, textureY); // Box 538
		leftTrackModel[27] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Box 539
		leftTrackModel[28] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Box 540
		leftTrackModel[29] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Box 541
		leftTrackModel[30] = new ModelRendererTurbo(this, 300, 1792, textureX, textureY); // Box 542
		leftTrackModel[31] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Box 543
		leftTrackModel[32] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Box 544
		leftTrackModel[33] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Box 545
		leftTrackModel[34] = new ModelRendererTurbo(this, 300, 1808, textureX, textureY); // Box 546
		leftTrackModel[35] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Box 547
		leftTrackModel[36] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Box 548
		leftTrackModel[37] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Box 549
		leftTrackModel[38] = new ModelRendererTurbo(this, 300, 1792, textureX, textureY); // Box 550
		leftTrackModel[39] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Box 551
		leftTrackModel[40] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Box 552
		leftTrackModel[41] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Box 553
		leftTrackModel[42] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Box 554
		leftTrackModel[43] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Box 555
		leftTrackModel[44] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Box 556
		leftTrackModel[45] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Box 557
		leftTrackModel[46] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Box 558
		leftTrackModel[47] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Box 559
		leftTrackModel[48] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Box 560
		leftTrackModel[49] = new ModelRendererTurbo(this, 300, 1451, textureX, textureY); // Box 561
		leftTrackModel[50] = new ModelRendererTurbo(this, 300, 1463, textureX, textureY); // Box 562
		leftTrackModel[51] = new ModelRendererTurbo(this, 300, 1474, textureX, textureY); // Box 563
		leftTrackModel[52] = new ModelRendererTurbo(this, 300, 1484, textureX, textureY); // Box 564
		leftTrackModel[53] = new ModelRendererTurbo(this, 300, 1495, textureX, textureY); // Box 565
		leftTrackModel[54] = new ModelRendererTurbo(this, 300, 1792, textureX, textureY); // Box 566
		leftTrackModel[55] = new ModelRendererTurbo(this, 300, 1808, textureX, textureY); // Box 567
		leftTrackModel[56] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Box 568
		leftTrackModel[57] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Box 569
		leftTrackModel[58] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Box 570
		leftTrackModel[59] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Box 571
		leftTrackModel[60] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Box 572
		leftTrackModel[61] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Box 573
		leftTrackModel[62] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 605
		leftTrackModel[63] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 606
		leftTrackModel[64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 607

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		leftTrackModel[0].setRotationPoint(58F, -11.5F, 22.5F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 513
		leftTrackModel[1].setRotationPoint(58F, -7.5F, 22.5F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 514
		leftTrackModel[2].setRotationPoint(58F, -15.5F, 22.5F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515
		leftTrackModel[3].setRotationPoint(39.5F, -4F, 24.5F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 516
		leftTrackModel[4].setRotationPoint(39.5F, 2F, 24.5F);

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 517
		leftTrackModel[5].setRotationPoint(41.5F, 6F, 24.5F);

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		leftTrackModel[6].setRotationPoint(39.5F, -8F, 24.5F);

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		leftTrackModel[7].setRotationPoint(41.5F, -10F, 24.5F);

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520
		leftTrackModel[8].setRotationPoint(23F, -10F, 24.5F);

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 521
		leftTrackModel[9].setRotationPoint(21F, -8F, 24.5F);

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		leftTrackModel[10].setRotationPoint(21F, -4F, 24.5F);

		leftTrackModel[11].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 523
		leftTrackModel[11].setRotationPoint(21F, 2F, 24.5F);

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 524
		leftTrackModel[12].setRotationPoint(23F, 6F, 24.5F);

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		leftTrackModel[13].setRotationPoint(-0.5F, -10F, 24.5F);

		leftTrackModel[14].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		leftTrackModel[14].setRotationPoint(-2.5F, -8F, 24.5F);

		leftTrackModel[15].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		leftTrackModel[15].setRotationPoint(-2.5F, -4F, 24.5F);

		leftTrackModel[16].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 528
		leftTrackModel[16].setRotationPoint(-2.5F, 2F, 24.5F);

		leftTrackModel[17].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 529
		leftTrackModel[17].setRotationPoint(-0.5F, 6F, 24.5F);

		leftTrackModel[18].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		leftTrackModel[18].setRotationPoint(-19.5F, -10F, 24.5F);

		leftTrackModel[19].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531
		leftTrackModel[19].setRotationPoint(-21.5F, -8F, 24.5F);

		leftTrackModel[20].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		leftTrackModel[20].setRotationPoint(-21.5F, -4F, 24.5F);

		leftTrackModel[21].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 533
		leftTrackModel[21].setRotationPoint(-21.5F, 2F, 24.5F);

		leftTrackModel[22].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 534
		leftTrackModel[22].setRotationPoint(-19.5F, 6F, 24.5F);

		leftTrackModel[23].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 535
		leftTrackModel[23].setRotationPoint(-15.5F, -3F, 16.5F);

		leftTrackModel[24].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 536
		leftTrackModel[24].setRotationPoint(-14.5F, -4F, 16.5F);

		leftTrackModel[25].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 537
		leftTrackModel[25].setRotationPoint(1.5F, -4F, 16.5F);

		leftTrackModel[26].addShapeBox(0F, 0F, 0F, 8, 13, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		leftTrackModel[26].setRotationPoint(-6.5F, -12F, 16.5F);

		leftTrackModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		leftTrackModel[27].setRotationPoint(-13.5F, -2F, 19.5F);

		leftTrackModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
		leftTrackModel[28].setRotationPoint(6.5F, -2F, 19.5F);

		leftTrackModel[29].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 541
		leftTrackModel[29].setRotationPoint(9.5F, -3F, 16.5F);

		leftTrackModel[30].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 542
		leftTrackModel[30].setRotationPoint(-6.5F, -12F, 20.5F);

		leftTrackModel[31].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 543
		leftTrackModel[31].setRotationPoint(25.5F, -3F, 16.5F);

		leftTrackModel[32].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 544
		leftTrackModel[32].setRotationPoint(26.5F, -4F, 16.5F);

		leftTrackModel[33].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 545
		leftTrackModel[33].setRotationPoint(42.5F, -4F, 16.5F);

		leftTrackModel[34].addShapeBox(0F, 0F, 0F, 8, 13, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		leftTrackModel[34].setRotationPoint(34.5F, -12F, 16.5F);

		leftTrackModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 547
		leftTrackModel[35].setRotationPoint(27.5F, -2F, 19.5F);

		leftTrackModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 548
		leftTrackModel[36].setRotationPoint(47.5F, -2F, 19.5F);

		leftTrackModel[37].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 549
		leftTrackModel[37].setRotationPoint(50.5F, -3F, 16.5F);

		leftTrackModel[38].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 550
		leftTrackModel[38].setRotationPoint(34.5F, -12F, 20.5F);

		leftTrackModel[39].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		leftTrackModel[39].setRotationPoint(-40F, -10F, 24.5F);

		leftTrackModel[40].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 552
		leftTrackModel[40].setRotationPoint(-42F, -8F, 24.5F);

		leftTrackModel[41].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		leftTrackModel[41].setRotationPoint(-42F, -4F, 24.5F);

		leftTrackModel[42].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 554
		leftTrackModel[42].setRotationPoint(-42F, 2F, 24.5F);

		leftTrackModel[43].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 555
		leftTrackModel[43].setRotationPoint(-40F, 6F, 24.5F);

		leftTrackModel[44].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 556
		leftTrackModel[44].setRotationPoint(-58.5F, -10F, 24.5F);

		leftTrackModel[45].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
		leftTrackModel[45].setRotationPoint(-60.5F, -8F, 24.5F);

		leftTrackModel[46].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
		leftTrackModel[46].setRotationPoint(-60.5F, -4F, 24.5F);

		leftTrackModel[47].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 559
		leftTrackModel[47].setRotationPoint(-60.5F, 2F, 24.5F);

		leftTrackModel[48].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 560
		leftTrackModel[48].setRotationPoint(-58.5F, 6F, 24.5F);

		leftTrackModel[49].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561
		leftTrackModel[49].setRotationPoint(-74.5F, -9F, 24.5F);

		leftTrackModel[50].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 562
		leftTrackModel[50].setRotationPoint(-74.5F, -11F, 24.5F);

		leftTrackModel[51].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		leftTrackModel[51].setRotationPoint(-73.5F, -12F, 24.5F);

		leftTrackModel[52].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 564
		leftTrackModel[52].setRotationPoint(-74.5F, -6F, 24.5F);

		leftTrackModel[53].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 565
		leftTrackModel[53].setRotationPoint(-73.5F, -4F, 24.5F);

		leftTrackModel[54].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 566
		leftTrackModel[54].setRotationPoint(-46.5F, -12F, 20.5F);

		leftTrackModel[55].addShapeBox(0F, 0F, 0F, 8, 13, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 567
		leftTrackModel[55].setRotationPoint(-46.5F, -12F, 16.5F);

		leftTrackModel[56].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 568
		leftTrackModel[56].setRotationPoint(-38.5F, -4F, 16.5F);

		leftTrackModel[57].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 569
		leftTrackModel[57].setRotationPoint(-30.5F, -3F, 16.5F);

		leftTrackModel[58].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 570
		leftTrackModel[58].setRotationPoint(-54.5F, -4F, 16.5F);

		leftTrackModel[59].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 571
		leftTrackModel[59].setRotationPoint(-55.5F, -3F, 16.5F);

		leftTrackModel[60].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		leftTrackModel[60].setRotationPoint(-33.5F, -2F, 19.5F);

		leftTrackModel[61].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		leftTrackModel[61].setRotationPoint(-53.5F, -2F, 19.5F);

		leftTrackModel[62].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 605
		leftTrackModel[62].setRotationPoint(62F, -10.5F, 13.5F);

		leftTrackModel[63].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		leftTrackModel[63].setRotationPoint(62F, -11.5F, 13.5F);

		leftTrackModel[64].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 607
		leftTrackModel[64].setRotationPoint(62F, -8.5F, 13.5F);


		rightTrackModel = new ModelRendererTurbo[65];
		rightTrackModel[0] = new ModelRendererTurbo(this, 300, 1350, textureX, textureY); // Box 438
		rightTrackModel[1] = new ModelRendererTurbo(this, 300, 1365, textureX, textureY); // Box 439
		rightTrackModel[2] = new ModelRendererTurbo(this, 300, 1380, textureX, textureY); // Box 440
		rightTrackModel[3] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Box 441
		rightTrackModel[4] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Box 442
		rightTrackModel[5] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Box 443
		rightTrackModel[6] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Box 444
		rightTrackModel[7] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Box 445
		rightTrackModel[8] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Box 446
		rightTrackModel[9] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Box 447
		rightTrackModel[10] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Box 448
		rightTrackModel[11] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Box 449
		rightTrackModel[12] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Box 450
		rightTrackModel[13] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Box 451
		rightTrackModel[14] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Box 452
		rightTrackModel[15] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Box 453
		rightTrackModel[16] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Box 454
		rightTrackModel[17] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Box 455
		rightTrackModel[18] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Box 456
		rightTrackModel[19] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Box 457
		rightTrackModel[20] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Box 458
		rightTrackModel[21] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Box 459
		rightTrackModel[22] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Box 460
		rightTrackModel[23] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Box 461
		rightTrackModel[24] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Box 462
		rightTrackModel[25] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Box 463
		rightTrackModel[26] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Box 464
		rightTrackModel[27] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Box 465
		rightTrackModel[28] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Box 466
		rightTrackModel[29] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Box 467
		rightTrackModel[30] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Box 468
		rightTrackModel[31] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Box 469
		rightTrackModel[32] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Box 470
		rightTrackModel[33] = new ModelRendererTurbo(this, 300, 1451, textureX, textureY); // Box 471
		rightTrackModel[34] = new ModelRendererTurbo(this, 300, 1463, textureX, textureY); // Box 473
		rightTrackModel[35] = new ModelRendererTurbo(this, 300, 1474, textureX, textureY); // Box 474
		rightTrackModel[36] = new ModelRendererTurbo(this, 300, 1484, textureX, textureY); // Box 475
		rightTrackModel[37] = new ModelRendererTurbo(this, 300, 1495, textureX, textureY); // Box 476
		rightTrackModel[38] = new ModelRendererTurbo(this, 300, 1792, textureX, textureY); // Box 485
		rightTrackModel[39] = new ModelRendererTurbo(this, 300, 1808, textureX, textureY); // Box 486
		rightTrackModel[40] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Box 487
		rightTrackModel[41] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Box 488
		rightTrackModel[42] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Box 489
		rightTrackModel[43] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Box 490
		rightTrackModel[44] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Box 491
		rightTrackModel[45] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Box 492
		rightTrackModel[46] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Box 493
		rightTrackModel[47] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Box 494
		rightTrackModel[48] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Box 495
		rightTrackModel[49] = new ModelRendererTurbo(this, 300, 1808, textureX, textureY); // Box 496
		rightTrackModel[50] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Box 497
		rightTrackModel[51] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Box 498
		rightTrackModel[52] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Box 499
		rightTrackModel[53] = new ModelRendererTurbo(this, 300, 1792, textureX, textureY); // Box 500
		rightTrackModel[54] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Box 501
		rightTrackModel[55] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Box 502
		rightTrackModel[56] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Box 503
		rightTrackModel[57] = new ModelRendererTurbo(this, 300, 1808, textureX, textureY); // Box 504
		rightTrackModel[58] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Box 505
		rightTrackModel[59] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Box 506
		rightTrackModel[60] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Box 507
		rightTrackModel[61] = new ModelRendererTurbo(this, 300, 1792, textureX, textureY); // Box 508
		rightTrackModel[62] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 509
		rightTrackModel[63] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 510
		rightTrackModel[64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 511

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		rightTrackModel[0].setRotationPoint(58F, -11.5F, -32.5F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 439
		rightTrackModel[1].setRotationPoint(58F, -7.5F, -32.5F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		rightTrackModel[2].setRotationPoint(58F, -15.5F, -32.5F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		rightTrackModel[3].setRotationPoint(39.5F, -4F, -30.5F);

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 442
		rightTrackModel[4].setRotationPoint(39.5F, 2F, -30.5F);

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 443
		rightTrackModel[5].setRotationPoint(41.5F, 6F, -30.5F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		rightTrackModel[6].setRotationPoint(39.5F, -8F, -30.5F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		rightTrackModel[7].setRotationPoint(41.5F, -10F, -30.5F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		rightTrackModel[8].setRotationPoint(23F, -10F, -30.5F);

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		rightTrackModel[9].setRotationPoint(21F, -8F, -30.5F);

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		rightTrackModel[10].setRotationPoint(21F, -4F, -30.5F);

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 449
		rightTrackModel[11].setRotationPoint(21F, 2F, -30.5F);

		rightTrackModel[12].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 450
		rightTrackModel[12].setRotationPoint(23F, 6F, -30.5F);

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		rightTrackModel[13].setRotationPoint(-0.5F, -10F, -30.5F);

		rightTrackModel[14].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		rightTrackModel[14].setRotationPoint(-2.5F, -8F, -30.5F);

		rightTrackModel[15].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		rightTrackModel[15].setRotationPoint(-2.5F, -4F, -30.5F);

		rightTrackModel[16].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 454
		rightTrackModel[16].setRotationPoint(-2.5F, 2F, -30.5F);

		rightTrackModel[17].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 455
		rightTrackModel[17].setRotationPoint(-0.5F, 6F, -30.5F);

		rightTrackModel[18].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		rightTrackModel[18].setRotationPoint(-19.5F, -10F, -30.5F);

		rightTrackModel[19].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		rightTrackModel[19].setRotationPoint(-21.5F, -8F, -30.5F);

		rightTrackModel[20].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		rightTrackModel[20].setRotationPoint(-21.5F, -4F, -30.5F);

		rightTrackModel[21].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 459
		rightTrackModel[21].setRotationPoint(-21.5F, 2F, -30.5F);

		rightTrackModel[22].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 460
		rightTrackModel[22].setRotationPoint(-19.5F, 6F, -30.5F);

		rightTrackModel[23].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		rightTrackModel[23].setRotationPoint(-40F, -10F, -30.5F);

		rightTrackModel[24].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		rightTrackModel[24].setRotationPoint(-42F, -8F, -30.5F);

		rightTrackModel[25].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		rightTrackModel[25].setRotationPoint(-42F, -4F, -30.5F);

		rightTrackModel[26].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 464
		rightTrackModel[26].setRotationPoint(-42F, 2F, -30.5F);

		rightTrackModel[27].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 465
		rightTrackModel[27].setRotationPoint(-40F, 6F, -30.5F);

		rightTrackModel[28].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		rightTrackModel[28].setRotationPoint(-58.5F, -10F, -30.5F);

		rightTrackModel[29].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		rightTrackModel[29].setRotationPoint(-60.5F, -8F, -30.5F);

		rightTrackModel[30].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		rightTrackModel[30].setRotationPoint(-60.5F, -4F, -30.5F);

		rightTrackModel[31].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 469
		rightTrackModel[31].setRotationPoint(-60.5F, 2F, -30.5F);

		rightTrackModel[32].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 470
		rightTrackModel[32].setRotationPoint(-58.5F, 6F, -30.5F);

		rightTrackModel[33].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		rightTrackModel[33].setRotationPoint(-74.5F, -9F, -32.5F);

		rightTrackModel[34].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		rightTrackModel[34].setRotationPoint(-74.5F, -11F, -32.5F);

		rightTrackModel[35].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		rightTrackModel[35].setRotationPoint(-73.5F, -12F, -32.5F);

		rightTrackModel[36].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 475
		rightTrackModel[36].setRotationPoint(-74.5F, -6F, -32.5F);

		rightTrackModel[37].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 476
		rightTrackModel[37].setRotationPoint(-73.5F, -4F, -32.5F);

		rightTrackModel[38].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		rightTrackModel[38].setRotationPoint(-46.5F, -12F, -22.5F);

		rightTrackModel[39].addShapeBox(0F, 0F, 0F, 8, 13, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		rightTrackModel[39].setRotationPoint(-46.5F, -12F, -20.5F);

		rightTrackModel[40].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 487
		rightTrackModel[40].setRotationPoint(-38.5F, -4F, -19.5F);

		rightTrackModel[41].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 488
		rightTrackModel[41].setRotationPoint(-30.5F, -3F, -19.5F);

		rightTrackModel[42].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 489
		rightTrackModel[42].setRotationPoint(-54.5F, -4F, -19.5F);

		rightTrackModel[43].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 490
		rightTrackModel[43].setRotationPoint(-55.5F, -3F, -19.5F);

		rightTrackModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		rightTrackModel[44].setRotationPoint(-33.5F, -2F, -24.5F);

		rightTrackModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		rightTrackModel[45].setRotationPoint(-53.5F, -2F, -24.5F);

		rightTrackModel[46].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 493
		rightTrackModel[46].setRotationPoint(-15.5F, -3F, -19.5F);

		rightTrackModel[47].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 494
		rightTrackModel[47].setRotationPoint(-14.5F, -4F, -19.5F);

		rightTrackModel[48].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 495
		rightTrackModel[48].setRotationPoint(1.5F, -4F, -19.5F);

		rightTrackModel[49].addShapeBox(0F, 0F, 0F, 8, 13, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		rightTrackModel[49].setRotationPoint(-6.5F, -12F, -20.5F);

		rightTrackModel[50].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		rightTrackModel[50].setRotationPoint(-13.5F, -2F, -24.5F);

		rightTrackModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		rightTrackModel[51].setRotationPoint(6.5F, -2F, -24.5F);

		rightTrackModel[52].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 499
		rightTrackModel[52].setRotationPoint(9.5F, -3F, -19.5F);

		rightTrackModel[53].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
		rightTrackModel[53].setRotationPoint(-6.5F, -12F, -22.5F);

		rightTrackModel[54].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 501
		rightTrackModel[54].setRotationPoint(25.5F, -3F, -19.5F);

		rightTrackModel[55].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 502
		rightTrackModel[55].setRotationPoint(26.5F, -4F, -19.5F);

		rightTrackModel[56].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 503
		rightTrackModel[56].setRotationPoint(42.5F, -4F, -19.5F);

		rightTrackModel[57].addShapeBox(0F, 0F, 0F, 8, 13, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		rightTrackModel[57].setRotationPoint(34.5F, -12F, -20.5F);

		rightTrackModel[58].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 505
		rightTrackModel[58].setRotationPoint(27.5F, -2F, -24.5F);

		rightTrackModel[59].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506
		rightTrackModel[59].setRotationPoint(47.5F, -2F, -24.5F);

		rightTrackModel[60].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 507
		rightTrackModel[60].setRotationPoint(50.5F, -3F, -19.5F);

		rightTrackModel[61].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		rightTrackModel[61].setRotationPoint(34.5F, -12F, -22.5F);

		rightTrackModel[62].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 509
		rightTrackModel[62].setRotationPoint(62F, -10.5F, -23.5F);

		rightTrackModel[63].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		rightTrackModel[63].setRotationPoint(62F, -11.5F, -23.5F);

		rightTrackModel[64].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 511
		rightTrackModel[64].setRotationPoint(62F, -8.5F, -23.5F);
		
		leftAnimTrackModel = new ModelRendererTurbo[3][];
		rightAnimTrackModel = new ModelRendererTurbo[3][];

		leftAnimTrackModel[0] = new ModelRendererTurbo[8];
		leftAnimTrackModel[0][0] = new ModelRendererTurbo(this, 300, 1505, textureX, textureY); // Import ImportBox574
		leftAnimTrackModel[0][1] = new ModelRendererTurbo(this, 300, 1523, textureX, textureY); // Import ImportBox575
		leftAnimTrackModel[0][2] = new ModelRendererTurbo(this, 300, 1541, textureX, textureY); // Import ImportBox576
		leftAnimTrackModel[0][3] = new ModelRendererTurbo(this, 300, 1577, textureX, textureY); // Import ImportBox577
		leftAnimTrackModel[0][4] = new ModelRendererTurbo(this, 300, 1596, textureX, textureY); // Import ImportBox578
		leftAnimTrackModel[0][5] = new ModelRendererTurbo(this, 300, 1714, textureX, textureY); // Import ImportBox579
		leftAnimTrackModel[0][6] = new ModelRendererTurbo(this, 300, 1750, textureX, textureY); // Import ImportBox580
		leftAnimTrackModel[0][7] = new ModelRendererTurbo(this, 300, 1770, textureX, textureY); // Import ImportBox581

		leftAnimTrackModel[0][0].addShapeBox(-1F, -1F, 0F, 1, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox574
		leftAnimTrackModel[0][0].setRotationPoint(70.5F, -12.5F, 21F);
		leftAnimTrackModel[0][0].rotateAngleZ = 0.33161256F;

		leftAnimTrackModel[0][1].addShapeBox(-1F, 0F, 0F, 1, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F); // Import ImportBox575
		leftAnimTrackModel[0][1].setRotationPoint(71.47F, -9.65F, 21F);
		leftAnimTrackModel[0][1].rotateAngleZ = -0.27925268F;

		leftAnimTrackModel[0][2].addShapeBox(-1F, 0F, 0F, 1, 22, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox576
		leftAnimTrackModel[0][2].setRotationPoint(70.4F, -5.7F, 21F);
		leftAnimTrackModel[0][2].rotateAngleZ = -0.90757121F;

		leftAnimTrackModel[0][3].addShapeBox(-1F, 0F, 0F, 1, 5, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox577
		leftAnimTrackModel[0][3].setRotationPoint(53.1F, 7.8F, 21F);
		leftAnimTrackModel[0][3].rotateAngleZ = -1.32645023F;

		leftAnimTrackModel[0][4].addShapeBox(-1F, 0F, 0F, 1, 104, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox578
		leftAnimTrackModel[0][4].setRotationPoint(48.2F, 9F, 21F);
		leftAnimTrackModel[0][4].rotateAngleZ = -1.57079633F;

		leftAnimTrackModel[0][5].addShapeBox(-1F, 0F, 0F, 1, 22, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox579
		leftAnimTrackModel[0][5].setRotationPoint(-55.8F, 9F, 21F);
		leftAnimTrackModel[0][5].rotateAngleZ = -2.12930169F;

		leftAnimTrackModel[0][6].addShapeBox(-1F, 0F, 0F, 1, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox580
		leftAnimTrackModel[0][6].setRotationPoint(-74.5F, -2.7F, 21F);
		leftAnimTrackModel[0][6].rotateAngleZ = -2.75762022F;

		leftAnimTrackModel[0][7].addShapeBox(-1F, 0F, 0F, 1, 8, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox581
		leftAnimTrackModel[0][7].setRotationPoint(-76F, -6.4F, 21F);
		leftAnimTrackModel[0][7].rotateAngleZ = -3.24631241F;


		rightAnimTrackModel[0] = new ModelRendererTurbo[9];
		rightAnimTrackModel[0][0] = new ModelRendererTurbo(this, 300, 1505, textureX, textureY); // Import ImportBox477
		rightAnimTrackModel[0][1] = new ModelRendererTurbo(this, 300, 1523, textureX, textureY); // Import ImportBox478
		rightAnimTrackModel[0][2] = new ModelRendererTurbo(this, 300, 1541, textureX, textureY); // Import ImportBox479
		rightAnimTrackModel[0][3] = new ModelRendererTurbo(this, 300, 1577, textureX, textureY); // Import ImportBox480
		rightAnimTrackModel[0][4] = new ModelRendererTurbo(this, 300, 1596, textureX, textureY); // Import ImportBox481
		rightAnimTrackModel[0][5] = new ModelRendererTurbo(this, 300, 1714, textureX, textureY); // Import ImportBox482
		rightAnimTrackModel[0][6] = new ModelRendererTurbo(this, 300, 1750, textureX, textureY); // Import ImportBox483
		rightAnimTrackModel[0][7] = new ModelRendererTurbo(this, 300, 1770, textureX, textureY); // Import ImportBox484
		rightAnimTrackModel[0][8] = new ModelRendererTurbo(this, 300, 1792, textureX, textureY); // Import ImportBox500

		rightAnimTrackModel[0][0].addShapeBox(-1F, -1F, 0F, 1, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox477
		rightAnimTrackModel[0][0].setRotationPoint(70.5F, -12.5F, -34F);
		rightAnimTrackModel[0][0].rotateAngleZ = 0.33161256F;

		rightAnimTrackModel[0][1].addShapeBox(-1F, 0F, 0F, 1, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F); // Import ImportBox478
		rightAnimTrackModel[0][1].setRotationPoint(71.47F, -9.65F, -34F);
		rightAnimTrackModel[0][1].rotateAngleZ = -0.27925268F;

		rightAnimTrackModel[0][2].addShapeBox(-1F, 0F, 0F, 1, 22, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox479
		rightAnimTrackModel[0][2].setRotationPoint(70.4F, -5.7F, -34F);
		rightAnimTrackModel[0][2].rotateAngleZ = -0.90757121F;

		rightAnimTrackModel[0][3].addShapeBox(-1F, 0F, 0F, 1, 5, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox480
		rightAnimTrackModel[0][3].setRotationPoint(53.1F, 7.8F, -34F);
		rightAnimTrackModel[0][3].rotateAngleZ = -1.32645023F;

		rightAnimTrackModel[0][4].addShapeBox(-1F, 0F, 0F, 1, 104, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox481
		rightAnimTrackModel[0][4].setRotationPoint(48.2F, 9F, -34F);
		rightAnimTrackModel[0][4].rotateAngleZ = -1.57079633F;

		rightAnimTrackModel[0][5].addShapeBox(-1F, 0F, 0F, 1, 22, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox482
		rightAnimTrackModel[0][5].setRotationPoint(-55.8F, 9F, -34F);
		rightAnimTrackModel[0][5].rotateAngleZ = -2.12930169F;

		rightAnimTrackModel[0][6].addShapeBox(-1F, 0F, 0F, 1, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox483
		rightAnimTrackModel[0][6].setRotationPoint(-74.5F, -2.7F, -34F);
		rightAnimTrackModel[0][6].rotateAngleZ = -2.75762022F;

		rightAnimTrackModel[0][7].addShapeBox(-1F, 0F, 0F, 1, 8, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox484
		rightAnimTrackModel[0][7].setRotationPoint(-76F, -6.4F, -34F);
		rightAnimTrackModel[0][7].rotateAngleZ = -3.24631241F;

		rightAnimTrackModel[0][8].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox500
		rightAnimTrackModel[0][8].setRotationPoint(-6.5F, -12F, -22.5F);
		
		leftAnimTrackModel[1] = new ModelRendererTurbo[8];
		leftAnimTrackModel[1][0] = new ModelRendererTurbo(this, 700, 1505, textureX, textureY); // Import ImportImportBox574
		leftAnimTrackModel[1][1] = new ModelRendererTurbo(this, 700, 1523, textureX, textureY); // Import ImportImportBox575
		leftAnimTrackModel[1][2] = new ModelRendererTurbo(this, 700, 1541, textureX, textureY); // Import ImportImportBox576
		leftAnimTrackModel[1][3] = new ModelRendererTurbo(this, 700, 1577, textureX, textureY); // Import ImportImportBox577
		leftAnimTrackModel[1][4] = new ModelRendererTurbo(this, 700, 1596, textureX, textureY); // Import ImportImportBox578
		leftAnimTrackModel[1][5] = new ModelRendererTurbo(this, 700, 1714, textureX, textureY); // Import ImportImportBox579
		leftAnimTrackModel[1][6] = new ModelRendererTurbo(this, 700, 1750, textureX, textureY); // Import ImportImportBox580
		leftAnimTrackModel[1][7] = new ModelRendererTurbo(this, 700, 1770, textureX, textureY); // Import ImportImportBox581

		leftAnimTrackModel[1][0].addShapeBox(-1F, -1F, 0F, 1, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox574
		leftAnimTrackModel[1][0].setRotationPoint(70.5F, -12.5F, 21F);
		leftAnimTrackModel[1][0].rotateAngleZ = 0.33161256F;

		leftAnimTrackModel[1][1].addShapeBox(-1F, 0F, 0F, 1, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F); // Import ImportImportBox575
		leftAnimTrackModel[1][1].setRotationPoint(71.47F, -9.65F, 21F);
		leftAnimTrackModel[1][1].rotateAngleZ = -0.27925268F;

		leftAnimTrackModel[1][2].addShapeBox(-1F, 0F, 0F, 1, 22, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox576
		leftAnimTrackModel[1][2].setRotationPoint(70.4F, -5.7F, 21F);
		leftAnimTrackModel[1][2].rotateAngleZ = -0.90757121F;

		leftAnimTrackModel[1][3].addShapeBox(-1F, 0F, 0F, 1, 5, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox577
		leftAnimTrackModel[1][3].setRotationPoint(53.1F, 7.8F, 21F);
		leftAnimTrackModel[1][3].rotateAngleZ = -1.32645023F;

		leftAnimTrackModel[1][4].addShapeBox(-1F, 0F, 0F, 1, 104, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox578
		leftAnimTrackModel[1][4].setRotationPoint(48.2F, 9F, 21F);
		leftAnimTrackModel[1][4].rotateAngleZ = -1.57079633F;

		leftAnimTrackModel[1][5].addShapeBox(-1F, 0F, 0F, 1, 22, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox579
		leftAnimTrackModel[1][5].setRotationPoint(-55.8F, 9F, 21F);
		leftAnimTrackModel[1][5].rotateAngleZ = -2.12930169F;

		leftAnimTrackModel[1][6].addShapeBox(-1F, 0F, 0F, 1, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox580
		leftAnimTrackModel[1][6].setRotationPoint(-74.5F, -2.7F, 21F);
		leftAnimTrackModel[1][6].rotateAngleZ = -2.75762022F;

		leftAnimTrackModel[1][7].addShapeBox(-1F, 0F, 0F, 1, 8, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox581
		leftAnimTrackModel[1][7].setRotationPoint(-76F, -6.4F, 21F);
		leftAnimTrackModel[1][7].rotateAngleZ = -3.24631241F;


		rightAnimTrackModel[1] = new ModelRendererTurbo[8];
		rightAnimTrackModel[1][0] = new ModelRendererTurbo(this, 700, 1505, textureX, textureY); // Import ImportImportBox477
		rightAnimTrackModel[1][1] = new ModelRendererTurbo(this, 700, 1523, textureX, textureY); // Import ImportImportBox478
		rightAnimTrackModel[1][2] = new ModelRendererTurbo(this, 700, 1541, textureX, textureY); // Import ImportImportBox479
		rightAnimTrackModel[1][3] = new ModelRendererTurbo(this, 700, 1577, textureX, textureY); // Import ImportImportBox480
		rightAnimTrackModel[1][4] = new ModelRendererTurbo(this, 700, 1596, textureX, textureY); // Import ImportImportBox481
		rightAnimTrackModel[1][5] = new ModelRendererTurbo(this, 700, 1714, textureX, textureY); // Import ImportImportBox482
		rightAnimTrackModel[1][6] = new ModelRendererTurbo(this, 700, 1750, textureX, textureY); // Import ImportImportBox483
		rightAnimTrackModel[1][7] = new ModelRendererTurbo(this, 700, 1770, textureX, textureY); // Import ImportImportBox484

		rightAnimTrackModel[1][0].addShapeBox(-1F, -1F, 0F, 1, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox477
		rightAnimTrackModel[1][0].setRotationPoint(70.5F, -12.5F, -34F);
		rightAnimTrackModel[1][0].rotateAngleZ = 0.33161256F;

		rightAnimTrackModel[1][1].addShapeBox(-1F, 0F, 0F, 1, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F); // Import ImportImportBox478
		rightAnimTrackModel[1][1].setRotationPoint(71.47F, -9.65F, -34F);
		rightAnimTrackModel[1][1].rotateAngleZ = -0.27925268F;

		rightAnimTrackModel[1][2].addShapeBox(-1F, 0F, 0F, 1, 22, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox479
		rightAnimTrackModel[1][2].setRotationPoint(70.4F, -5.7F, -34F);
		rightAnimTrackModel[1][2].rotateAngleZ = -0.90757121F;

		rightAnimTrackModel[1][3].addShapeBox(-1F, 0F, 0F, 1, 5, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox480
		rightAnimTrackModel[1][3].setRotationPoint(53.1F, 7.8F, -34F);
		rightAnimTrackModel[1][3].rotateAngleZ = -1.32645023F;

		rightAnimTrackModel[1][4].addShapeBox(-1F, 0F, 0F, 1, 104, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox481
		rightAnimTrackModel[1][4].setRotationPoint(48.2F, 9F, -34F);
		rightAnimTrackModel[1][4].rotateAngleZ = -1.57079633F;

		rightAnimTrackModel[1][5].addShapeBox(-1F, 0F, 0F, 1, 22, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox482
		rightAnimTrackModel[1][5].setRotationPoint(-55.8F, 9F, -34F);
		rightAnimTrackModel[1][5].rotateAngleZ = -2.12930169F;

		rightAnimTrackModel[1][6].addShapeBox(-1F, 0F, 0F, 1, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox483
		rightAnimTrackModel[1][6].setRotationPoint(-74.5F, -2.7F, -34F);
		rightAnimTrackModel[1][6].rotateAngleZ = -2.75762022F;

		rightAnimTrackModel[1][7].addShapeBox(-1F, 0F, 0F, 1, 8, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox484
		rightAnimTrackModel[1][7].setRotationPoint(-76F, -6.4F, -34F);
		rightAnimTrackModel[1][7].rotateAngleZ = -3.24631241F;
		
		leftAnimTrackModel[2] = new ModelRendererTurbo[8];
		leftAnimTrackModel[2][0] = new ModelRendererTurbo(this, 800, 1505, textureX, textureY); // Import ImportImportBox574
		leftAnimTrackModel[2][1] = new ModelRendererTurbo(this, 800, 1523, textureX, textureY); // Import ImportImportBox575
		leftAnimTrackModel[2][2] = new ModelRendererTurbo(this, 800, 1541, textureX, textureY); // Import ImportImportBox576
		leftAnimTrackModel[2][3] = new ModelRendererTurbo(this, 800, 1577, textureX, textureY); // Import ImportImportBox577
		leftAnimTrackModel[2][4] = new ModelRendererTurbo(this, 800, 1596, textureX, textureY); // Import ImportImportBox578
		leftAnimTrackModel[2][5] = new ModelRendererTurbo(this, 800, 1714, textureX, textureY); // Import ImportImportBox579
		leftAnimTrackModel[2][6] = new ModelRendererTurbo(this, 800, 1750, textureX, textureY); // Import ImportImportBox580
		leftAnimTrackModel[2][7] = new ModelRendererTurbo(this, 800, 1770, textureX, textureY); // Import ImportImportBox581

		leftAnimTrackModel[2][0].addShapeBox(-1F, -1F, 0F, 1, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox574
		leftAnimTrackModel[2][0].setRotationPoint(70.5F, -12.5F, 21F);
		leftAnimTrackModel[2][0].rotateAngleZ = 0.33161256F;

		leftAnimTrackModel[2][1].addShapeBox(-1F, 0F, 0F, 1, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F); // Import ImportImportBox575
		leftAnimTrackModel[2][1].setRotationPoint(71.47F, -9.65F, 21F);
		leftAnimTrackModel[2][1].rotateAngleZ = -0.27925268F;

		leftAnimTrackModel[2][2].addShapeBox(-1F, 0F, 0F, 1, 22, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox576
		leftAnimTrackModel[2][2].setRotationPoint(70.4F, -5.7F, 21F);
		leftAnimTrackModel[2][2].rotateAngleZ = -0.90757121F;

		leftAnimTrackModel[2][3].addShapeBox(-1F, 0F, 0F, 1, 5, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox577
		leftAnimTrackModel[2][3].setRotationPoint(53.1F, 7.8F, 21F);
		leftAnimTrackModel[2][3].rotateAngleZ = -1.32645023F;

		leftAnimTrackModel[2][4].addShapeBox(-1F, 0F, 0F, 1, 104, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox578
		leftAnimTrackModel[2][4].setRotationPoint(48.2F, 9F, 21F);
		leftAnimTrackModel[2][4].rotateAngleZ = -1.57079633F;

		leftAnimTrackModel[2][5].addShapeBox(-1F, 0F, 0F, 1, 22, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox579
		leftAnimTrackModel[2][5].setRotationPoint(-55.8F, 9F, 21F);
		leftAnimTrackModel[2][5].rotateAngleZ = -2.12930169F;

		leftAnimTrackModel[2][6].addShapeBox(-1F, 0F, 0F, 1, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox580
		leftAnimTrackModel[2][6].setRotationPoint(-74.5F, -2.7F, 21F);
		leftAnimTrackModel[2][6].rotateAngleZ = -2.75762022F;

		leftAnimTrackModel[2][7].addShapeBox(-1F, 0F, 0F, 1, 8, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox581
		leftAnimTrackModel[2][7].setRotationPoint(-76F, -6.4F, 21F);
		leftAnimTrackModel[2][7].rotateAngleZ = -3.24631241F;


		rightAnimTrackModel[2] = new ModelRendererTurbo[8];
		rightAnimTrackModel[2][0] = new ModelRendererTurbo(this, 800, 1505, textureX, textureY); // Import ImportImportBox477
		rightAnimTrackModel[2][1] = new ModelRendererTurbo(this, 800, 1523, textureX, textureY); // Import ImportImportBox478
		rightAnimTrackModel[2][2] = new ModelRendererTurbo(this, 800, 1541, textureX, textureY); // Import ImportImportBox479
		rightAnimTrackModel[2][3] = new ModelRendererTurbo(this, 800, 1577, textureX, textureY); // Import ImportImportBox480
		rightAnimTrackModel[2][4] = new ModelRendererTurbo(this, 800, 1596, textureX, textureY); // Import ImportImportBox481
		rightAnimTrackModel[2][5] = new ModelRendererTurbo(this, 800, 1714, textureX, textureY); // Import ImportImportBox482
		rightAnimTrackModel[2][6] = new ModelRendererTurbo(this, 800, 1750, textureX, textureY); // Import ImportImportBox483
		rightAnimTrackModel[2][7] = new ModelRendererTurbo(this, 800, 1770, textureX, textureY); // Import ImportImportBox484

		rightAnimTrackModel[2][0].addShapeBox(-1F, -1F, 0F, 1, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox477
		rightAnimTrackModel[2][0].setRotationPoint(70.5F, -12.5F, -34F);
		rightAnimTrackModel[2][0].rotateAngleZ = 0.33161256F;

		rightAnimTrackModel[2][1].addShapeBox(-1F, 0F, 0F, 1, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F); // Import ImportImportBox478
		rightAnimTrackModel[2][1].setRotationPoint(71.47F, -9.65F, -34F);
		rightAnimTrackModel[2][1].rotateAngleZ = -0.27925268F;

		rightAnimTrackModel[2][2].addShapeBox(-1F, 0F, 0F, 1, 22, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox479
		rightAnimTrackModel[2][2].setRotationPoint(70.4F, -5.7F, -34F);
		rightAnimTrackModel[2][2].rotateAngleZ = -0.90757121F;

		rightAnimTrackModel[2][3].addShapeBox(-1F, 0F, 0F, 1, 5, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox480
		rightAnimTrackModel[2][3].setRotationPoint(53.1F, 7.8F, -34F);
		rightAnimTrackModel[2][3].rotateAngleZ = -1.32645023F;

		rightAnimTrackModel[2][4].addShapeBox(-1F, 0F, 0F, 1, 104, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox481
		rightAnimTrackModel[2][4].setRotationPoint(48.2F, 9F, -34F);
		rightAnimTrackModel[2][4].rotateAngleZ = -1.57079633F;

		rightAnimTrackModel[2][5].addShapeBox(-1F, 0F, 0F, 1, 22, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox482
		rightAnimTrackModel[2][5].setRotationPoint(-55.8F, 9F, -34F);
		rightAnimTrackModel[2][5].rotateAngleZ = -2.12930169F;

		rightAnimTrackModel[2][6].addShapeBox(-1F, 0F, 0F, 1, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox483
		rightAnimTrackModel[2][6].setRotationPoint(-74.5F, -2.7F, -34F);
		rightAnimTrackModel[2][6].rotateAngleZ = -2.75762022F;

		rightAnimTrackModel[2][7].addShapeBox(-1F, 0F, 0F, 1, 8, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox484
		rightAnimTrackModel[2][7].setRotationPoint(-76F, -6.4F, -34F);
		rightAnimTrackModel[2][7].rotateAngleZ = -3.24631241F;
		

		animBarrelModel = new ModelRendererTurbo[11];
		animBarrelModel[0] = new ModelRendererTurbo(this, 300, 1220, textureX, textureY); // Box 289
		animBarrelModel[1] = new ModelRendererTurbo(this, 300, 1230, textureX, textureY); // Box 292
		animBarrelModel[2] = new ModelRendererTurbo(this, 300, 1240, textureX, textureY); // Box 297
		animBarrelModel[3] = new ModelRendererTurbo(this, 300, 1250, textureX, textureY); // Box 299
		animBarrelModel[4] = new ModelRendererTurbo(this, 300, 1260, textureX, textureY); // Box 301
		animBarrelModel[5] = new ModelRendererTurbo(this, 300, 1270, textureX, textureY); // Box 305
		animBarrelModel[6] = new ModelRendererTurbo(this, 300, 1280, textureX, textureY); // Box 308
		animBarrelModel[7] = new ModelRendererTurbo(this, 300, 1290, textureX, textureY); // Box 311
		animBarrelModel[8] = new ModelRendererTurbo(this, 300, 1300, textureX, textureY); // Box 315
		animBarrelModel[9] = new ModelRendererTurbo(this, 300, 1317, textureX, textureY); // Box 316
		animBarrelModel[10] = new ModelRendererTurbo(this, 300, 1322, textureX, textureY); // Box 319

		animBarrelModel[0].addShapeBox(7F, 0F, -3F, 11, 2, 6, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 289
		animBarrelModel[0].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[1].addShapeBox(18F, 0F, -2.5F, 3, 2, 5, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 292
		animBarrelModel[1].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[2].addShapeBox(21F, 0F, -3F, 1, 2, 6, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 297
		animBarrelModel[2].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[3].addShapeBox(22F, 0F, -2.5F, 36, 2, 5, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 299
		animBarrelModel[3].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[4].addShapeBox(58F, 0F, -2F, 6, 2, 4, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 301
		animBarrelModel[4].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[5].addShapeBox(63F, 0F, -2.5F, 13, 2, 5, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 305
		animBarrelModel[5].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[6].addShapeBox(84F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 308
		animBarrelModel[6].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[7].addShapeBox(105F, 0F, -2.5F, 1, 2, 5, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 311
		animBarrelModel[7].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[8].addShapeBox(76F, 0F, -2F, 29, 2, 4, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 315
		animBarrelModel[8].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[9].addShapeBox(106F, 0.5F, -1.5F, 6, 1, 3, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 316
		animBarrelModel[9].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[10].addShapeBox(106F, -2.5F, -1F, 5, 3, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		animBarrelModel[10].setRotationPoint(0F, 0F, 0F);

		barrelAttach = new Vector3f(31F/16F, 30F/16F, 0F);


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}