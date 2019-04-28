//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ChiNu
// Model Creator: 
// Created on: -
// Last changed on: -

package com.wolffsmod.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

import net.minecraft.entity.Entity;

public class ModelChiNu extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelChiNu() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[154];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportTrackCoverLeft
		bodyModel[1] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import ImportTrackCoverRight
		bodyModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportMainBodyBack
		bodyModel[3] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import ImportMainB0dyFront
		bodyModel[4] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Import ImportSmallCoverUp
		bodyModel[5] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import ImportEngineThingLeft
		bodyModel[6] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Import ImportDWC
		bodyModel[7] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Import ImportCW6
		bodyModel[8] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Import ImportBox98
		bodyModel[9] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Import Box12
		bodyModel[10] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Import Box13
		bodyModel[11] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Import Box14
		bodyModel[12] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Import Box15
		bodyModel[13] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Import Box16
		bodyModel[14] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Import Box17
		bodyModel[15] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Import Box18
		bodyModel[16] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Import Box19
		bodyModel[17] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Import Box20
		bodyModel[18] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Import Box21
		bodyModel[19] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Import Box22
		bodyModel[20] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Import Box23
		bodyModel[21] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import Box24
		bodyModel[22] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Import Box25
		bodyModel[23] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Import Box26
		bodyModel[24] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Import Box27
		bodyModel[25] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Import Box28
		bodyModel[26] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Import Box31
		bodyModel[27] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Import Box33
		bodyModel[28] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Import Box35
		bodyModel[29] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Import Box39
		bodyModel[30] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Import Box40
		bodyModel[31] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Import Box41
		bodyModel[32] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Import Box42
		bodyModel[33] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Import Box45
		bodyModel[34] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Import Box46
		bodyModel[35] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Import Box47
		bodyModel[36] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Import Box48
		bodyModel[37] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Import Box49
		bodyModel[38] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Import Box50
		bodyModel[39] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Import Box51
		bodyModel[40] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Import Box53
		bodyModel[41] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Import Box54
		bodyModel[42] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import Box55
		bodyModel[43] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Import Box56
		bodyModel[44] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Import Box57
		bodyModel[45] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Import Box58
		bodyModel[46] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Import Box59
		bodyModel[47] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Import Box60
		bodyModel[48] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Import Box61
		bodyModel[49] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Import Box62
		bodyModel[50] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Import Box63
		bodyModel[51] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Import Box64
		bodyModel[52] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Import Box65
		bodyModel[53] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Import Box66
		bodyModel[54] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Import Box67
		bodyModel[55] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Import Box68
		bodyModel[56] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Import Box69
		bodyModel[57] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Import Box70
		bodyModel[58] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Import Box73
		bodyModel[59] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Import Box74
		bodyModel[60] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Import Box75
		bodyModel[61] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Import Box79
		bodyModel[62] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Import Box80
		bodyModel[63] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import Box81
		bodyModel[64] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Import Box82
		bodyModel[65] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Import Box83
		bodyModel[66] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Import Box84
		bodyModel[67] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Import Box85
		bodyModel[68] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Import Box86
		bodyModel[69] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Import Box87
		bodyModel[70] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Import Box88
		bodyModel[71] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box90
		bodyModel[72] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Import Box91
		bodyModel[73] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Import Box92
		bodyModel[74] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Import Box132
		bodyModel[75] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Import Box135
		bodyModel[76] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Import Box139
		bodyModel[77] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import Box140
		bodyModel[78] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Import Box142
		bodyModel[79] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Import Box144
		bodyModel[80] = new ModelRendererTurbo(this, 137, 185, textureX, textureY); // Import Box132
		bodyModel[81] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Import Box133
		bodyModel[82] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Import Box134
		bodyModel[83] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Import Box135
		bodyModel[84] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Import Box136
		bodyModel[85] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Import Box137
		bodyModel[86] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Import Box138
		bodyModel[87] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Import Box139
		bodyModel[88] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import Box140
		bodyModel[89] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Import Box141
		bodyModel[90] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Import Box142
		bodyModel[91] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Import Box143
		bodyModel[92] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Import Box144
		bodyModel[93] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Import Box145
		bodyModel[94] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Import Box146
		bodyModel[95] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import Box148
		bodyModel[96] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box149
		bodyModel[97] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Import Box150
		bodyModel[98] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Import Box151
		bodyModel[99] = new ModelRendererTurbo(this, 249, 177, textureX, textureY); // Import Box152
		bodyModel[100] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Import Box153
		bodyModel[101] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Import Box154
		bodyModel[102] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Import Box155
		bodyModel[103] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Import Box160
		bodyModel[104] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Import Box161
		bodyModel[105] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Import Box162
		bodyModel[106] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Import Box164
		bodyModel[107] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import ImportBackHatch
		bodyModel[108] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import ImportRotatingThingy
		bodyModel[109] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Import ImportThesquare
		bodyModel[110] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import ImportLeftHatch
		bodyModel[111] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import ImportRightHatch
		bodyModel[112] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportAntennaBottom
		bodyModel[113] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import ImportAntennaForward
		bodyModel[114] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import ImportAntennaUpperBase
		bodyModel[115] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import ImportAntennaAngle
		bodyModel[116] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Import ImportRightSticker
		bodyModel[117] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Import Box1
		bodyModel[118] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Import Box129
		bodyModel[119] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Import Box130
		bodyModel[120] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Import Box131
		bodyModel[121] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Import Box136
		bodyModel[122] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Import Box137
		bodyModel[123] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Import Box138
		bodyModel[124] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Import Box145
		bodyModel[125] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box146
		bodyModel[126] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box147
		bodyModel[127] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Import ImportBarrelBack
		bodyModel[128] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Import ImportLeftWeeGee
		bodyModel[129] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Import ImportRightWeeGee
		bodyModel[130] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Import Box3
		bodyModel[131] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Import Box5
		bodyModel[132] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Import Box6
		bodyModel[133] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Import Box7
		bodyModel[134] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Import Box8
		bodyModel[135] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box9
		bodyModel[136] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Import Box10
		bodyModel[137] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Import Box128
		bodyModel[138] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Import ImportBottomTrackLeft
		bodyModel[139] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Import ImportTopTrackLeft
		bodyModel[140] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Import ImportFrontCornerTrack
		bodyModel[141] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Import ImportTrackFront
		bodyModel[142] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Import ImportTraclFrontAngled
		bodyModel[143] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Import ImportBackTopTrack
		bodyModel[144] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import ImportBack
		bodyModel[145] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Import ImportBackLowerAngle
		bodyModel[146] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Import Box71
		bodyModel[147] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import Box72
		bodyModel[148] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Import Box76
		bodyModel[149] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Import Box77
		bodyModel[150] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Import Box78
		bodyModel[151] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Import Box89
		bodyModel[152] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Import Box93
		bodyModel[153] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Import Box94

		bodyModel[0].addBox(0F, 0F, 0F, 90, 1, 8, 0F); // Import ImportTrackCoverLeft
		bodyModel[0].setRotationPoint(-56.5F, -13.5F, 13F);

		bodyModel[1].addBox(0F, 0F, 0F, 90, 1, 8, 0F); // Import ImportTrackCoverRight
		bodyModel[1].setRotationPoint(-56.5F, -13.5F, -21F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 72, 16, 26, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, -3F, .3F, 0F); // Import ImportMainBodyBack
		bodyModel[2].setRotationPoint(-53F, -13.5F, -13F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 11, 5, 26, 0F, 0F, 2F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 2F, 0F, 0F, 5.3F, 0F, 7F, 2F, 0F, 7F, 2F, 0F, 0F, 5.3F, 0F); // Import ImportMainB0dyFront
		bodyModel[3].setRotationPoint(19F, -7.5F, -13F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 5, 26, 0F, 4F, -10.3F, 0F, 12F, -7.0F, 0F, 12F, -7.0F, 0F, 3F, -10.3F, 0F, 4F, 5.3F, 0F, 7F, 5.3F, 0F, 7F, 5.3F, 0F, 4F, 5.3F, 0F); // Import ImportSmallCoverUp
		bodyModel[4].setRotationPoint(23F, -7.5F, -13F);

		bodyModel[5].addBox(0F, 0F, -0.5F, 16, 4, 5, 0F); // Import ImportEngineThingLeft
		bodyModel[5].setRotationPoint(-53F, -17F, 15.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 7, 3, 6, 0F); // Import ImportDWC
		bodyModel[6].setRotationPoint(31F, -7F, 13F);

		bodyModel[7].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Import ImportCW6
		bodyModel[7].setRotationPoint(-43F, 3F, 13F);

		bodyModel[8].addBox(-2F, 0F, 0F, 5, 3, 4, 0F); // Import ImportBox98
		bodyModel[8].setRotationPoint(20F, -7.5F, 13F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box12
		bodyModel[9].setRotationPoint(-43F, -1F, 13F);

		bodyModel[10].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box13
		bodyModel[10].setRotationPoint(-43F, -1F, 13F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box14
		bodyModel[11].setRotationPoint(-30F, -1F, 13F);

		bodyModel[12].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Import Box15
		bodyModel[12].setRotationPoint(-30F, 3F, 13F);

		bodyModel[13].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box16
		bodyModel[13].setRotationPoint(-30F, -1F, 13F);

		bodyModel[14].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box17
		bodyModel[14].setRotationPoint(-17F, -1F, 13F);

		bodyModel[15].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Import Box18
		bodyModel[15].setRotationPoint(-17F, 3F, 13F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box19
		bodyModel[16].setRotationPoint(-17F, -1F, 13F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box20
		bodyModel[17].setRotationPoint(-4F, -1F, 13F);

		bodyModel[18].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Import Box21
		bodyModel[18].setRotationPoint(-4F, 3F, 13F);

		bodyModel[19].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box22
		bodyModel[19].setRotationPoint(-4F, -1F, 13F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box23
		bodyModel[20].setRotationPoint(9F, -1F, 13F);

		bodyModel[21].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Import Box24
		bodyModel[21].setRotationPoint(9F, 3F, 13F);

		bodyModel[22].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box25
		bodyModel[22].setRotationPoint(9F, -1F, 13F);

		bodyModel[23].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box26
		bodyModel[23].setRotationPoint(22F, -1F, 13F);

		bodyModel[24].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Import Box27
		bodyModel[24].setRotationPoint(22F, 3F, 13F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box28
		bodyModel[25].setRotationPoint(22F, -1F, 13F);

		bodyModel[26].addBox(-3F, 0F, 0F, 3, 1, 8, 0F); // Import Box31
		bodyModel[26].setRotationPoint(-56.5F, -13.5F, 13F);
		bodyModel[26].rotateAngleZ = -0.64577182F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box33
		bodyModel[27].setRotationPoint(31F, -9F, 13F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box35
		bodyModel[28].setRotationPoint(31F, -4F, 13F);

		bodyModel[29].addBox(0F, 0F, 0F, 7, 3, 6, 0F); // Import Box39
		bodyModel[29].setRotationPoint(-56F, -6.5F, 13F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		bodyModel[30].setRotationPoint(-56F, -8.5F, 13F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box41
		bodyModel[31].setRotationPoint(-56F, -3.5F, 13F);

		bodyModel[32].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box42
		bodyModel[32].setRotationPoint(20F, -8.5F, 13F);

		bodyModel[33].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box45
		bodyModel[33].setRotationPoint(20F, -4.5F, 13F);

		bodyModel[34].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box46
		bodyModel[34].setRotationPoint(-6F, -8.5F, 13F);

		bodyModel[35].addBox(-2F, 0F, 0F, 5, 3, 4, 0F); // Import Box47
		bodyModel[35].setRotationPoint(-6F, -7.5F, 13F);

		bodyModel[36].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box48
		bodyModel[36].setRotationPoint(-6F, -4.5F, 13F);

		bodyModel[37].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box49
		bodyModel[37].setRotationPoint(-32F, -8.5F, 13F);

		bodyModel[38].addBox(-2F, 0F, 0F, 5, 3, 4, 0F); // Import Box50
		bodyModel[38].setRotationPoint(-32F, -7.5F, 13F);

		bodyModel[39].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box51
		bodyModel[39].setRotationPoint(-32F, -4.5F, 13F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box53
		bodyModel[40].setRotationPoint(-43F, -1F, -19F);

		bodyModel[41].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Import Box54
		bodyModel[41].setRotationPoint(-43F, 3F, -19F);

		bodyModel[42].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box55
		bodyModel[42].setRotationPoint(-43F, -1F, -19F);

		bodyModel[43].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box56
		bodyModel[43].setRotationPoint(-30F, -1F, -19F);

		bodyModel[44].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Import Box57
		bodyModel[44].setRotationPoint(-30F, 3F, -19F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box58
		bodyModel[45].setRotationPoint(-30F, -1F, -19F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box59
		bodyModel[46].setRotationPoint(-17F, -1F, -19F);

		bodyModel[47].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Import Box60
		bodyModel[47].setRotationPoint(-17F, 3F, -19F);

		bodyModel[48].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box61
		bodyModel[48].setRotationPoint(-17F, -1F, -19F);

		bodyModel[49].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Import Box62
		bodyModel[49].setRotationPoint(-4F, 3F, -19F);

		bodyModel[50].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box63
		bodyModel[50].setRotationPoint(-4F, -1F, -19F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box64
		bodyModel[51].setRotationPoint(-4F, -1F, -19F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box65
		bodyModel[52].setRotationPoint(9F, -1F, -19F);

		bodyModel[53].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Import Box66
		bodyModel[53].setRotationPoint(9F, 3F, -19F);

		bodyModel[54].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box67
		bodyModel[54].setRotationPoint(9F, -1F, -19F);

		bodyModel[55].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box68
		bodyModel[55].setRotationPoint(22F, -1F, -19F);

		bodyModel[56].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Import Box69
		bodyModel[56].setRotationPoint(22F, 3F, -19F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box70
		bodyModel[57].setRotationPoint(22F, -1F, -19F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box73
		bodyModel[58].setRotationPoint(31F, -4F, -19F);

		bodyModel[59].addBox(0F, 0F, 0F, 7, 3, 6, 0F); // Import Box74
		bodyModel[59].setRotationPoint(31F, -7F, -19F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box75
		bodyModel[60].setRotationPoint(31F, -9F, -19F);

		bodyModel[61].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box79
		bodyModel[61].setRotationPoint(20F, -8.5F, -17F);

		bodyModel[62].addBox(-2F, 0F, 0F, 5, 3, 4, 0F); // Import Box80
		bodyModel[62].setRotationPoint(20F, -7.5F, -17F);

		bodyModel[63].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box81
		bodyModel[63].setRotationPoint(20F, -4.5F, -17F);

		bodyModel[64].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box82
		bodyModel[64].setRotationPoint(-6F, -4.5F, -17F);

		bodyModel[65].addBox(-2F, 0F, 0F, 5, 3, 4, 0F); // Import Box83
		bodyModel[65].setRotationPoint(-6F, -7.5F, -17F);

		bodyModel[66].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box84
		bodyModel[66].setRotationPoint(-6F, -8.5F, -17F);

		bodyModel[67].addBox(0F, 0F, 0F, 30, 2, 2, 0F); // Import Box85
		bodyModel[67].setRotationPoint(-21F, -3F, -14F);

		bodyModel[68].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box86
		bodyModel[68].setRotationPoint(-32F, -4.5F, -17F);

		bodyModel[69].addBox(-2F, 0F, 0F, 5, 3, 4, 0F); // Import Box87
		bodyModel[69].setRotationPoint(-32F, -7.5F, -17F);

		bodyModel[70].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box88
		bodyModel[70].setRotationPoint(-32F, -8.5F, -17F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box90
		bodyModel[71].setRotationPoint(-56F, -3.5F, -19F);

		bodyModel[72].addBox(0F, 0F, 0F, 7, 3, 6, 0F); // Import Box91
		bodyModel[72].setRotationPoint(-56F, -6.5F, -19F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box92
		bodyModel[73].setRotationPoint(-56F, -8.5F, -19F);

		bodyModel[74].addBox(-3F, 0F, 0F, 3, 1, 8, 0F); // Import Box132
		bodyModel[74].setRotationPoint(-56.5F, -13.5F, -21F);
		bodyModel[74].rotateAngleZ = -0.64577182F;

		bodyModel[75].addBox(0F, 0F, 0F, 48, 5, 32, 0F); // Import Box135
		bodyModel[75].setRotationPoint(-31F, -18F, -16F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 9, 6, 6, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box139
		bodyModel[76].setRotationPoint(17F, -18F, -16F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 20, 6, 26, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box140
		bodyModel[77].setRotationPoint(19F, -13.5F, -13F);

		bodyModel[78].addShapeBox(0F, 0F, -14F, 9, 6, 20, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box142
		bodyModel[78].setRotationPoint(17F, -18F, 4F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 19, 6, 0, 0F, 0F, -2F, 0F, -4.5F, -2F, 0F, -4.5F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -4F, 0F); // Import Box144
		bodyModel[79].setRotationPoint(19F, -14.5F, 13F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 48, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box132
		bodyModel[80].setRotationPoint(-31F, -18F, 16F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box133
		bodyModel[81].setRotationPoint(17F, -18F, -20F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 48, 5, 4, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box134
		bodyModel[82].setRotationPoint(-31F, -18F, -20F);

		bodyModel[83].addBox(0F, 0F, 0F, 24, 5, 32, 0F); // Import Box135
		bodyModel[83].setRotationPoint(-55F, -18F, -16F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box136
		bodyModel[84].setRotationPoint(-35F, -18F, -20F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Import Box137
		bodyModel[85].setRotationPoint(-35F, -18F, 16F);

		bodyModel[86].addBox(0F, 0F, 0F, 10, 1, 10, 0F); // Import Box138
		bodyModel[86].setRotationPoint(26F, -12.5F, 1F);
		bodyModel[86].rotateAngleZ = 0.12217305F;

		bodyModel[87].addBox(0F, 0F, 0F, 10, 1, 10, 0F); // Import Box139
		bodyModel[87].setRotationPoint(26F, -12.5F, -11F);
		bodyModel[87].rotateAngleZ = 0.12217305F;

		bodyModel[88].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import Box140
		bodyModel[88].setRotationPoint(26F, -12.8F, 10F);
		bodyModel[88].rotateAngleZ = 0.12217305F;

		bodyModel[89].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import Box141
		bodyModel[89].setRotationPoint(34F, -11.8F, 10F);
		bodyModel[89].rotateAngleZ = 0.12217305F;

		bodyModel[90].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import Box142
		bodyModel[90].setRotationPoint(34F, -11.8F, -11F);
		bodyModel[90].rotateAngleZ = 0.12217305F;

		bodyModel[91].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import Box143
		bodyModel[91].setRotationPoint(26F, -12.8F, -11F);
		bodyModel[91].rotateAngleZ = 0.12217305F;

		bodyModel[92].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Import Box144
		bodyModel[92].setRotationPoint(24F, -17.5F, 4F);

		bodyModel[93].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Import Box145
		bodyModel[93].setRotationPoint(25F, -17F, 5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box146
		bodyModel[94].setRotationPoint(27F, -16F, 6F);

		bodyModel[95].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Import Box148
		bodyModel[95].setRotationPoint(24F, -17.5F, -9F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Import Box149
		bodyModel[96].setRotationPoint(25.4F, -16.5F, -9F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Import Box150
		bodyModel[97].setRotationPoint(25.4F, -15F, -9F);

		bodyModel[98].addBox(0F, 0F, 0F, 12, 1, 14, 0F); // Import Box151
		bodyModel[98].setRotationPoint(-51F, -18.2F, -15F);

		bodyModel[99].addBox(0F, 0F, 0F, 12, 1, 14, 0F); // Import Box152
		bodyModel[99].setRotationPoint(-51F, -18.2F, 1F);

		bodyModel[100].addBox(0F, 0F, 0F, 5, 1, 14, 0F); // Import Box153
		bodyModel[100].setRotationPoint(-38F, -18.2F, 1F);

		bodyModel[101].addBox(0F, 0F, 0F, 5, 1, 14, 0F); // Import Box154
		bodyModel[101].setRotationPoint(-38F, -18.2F, -15F);

		bodyModel[102].addBox(0F, 0F, -0.5F, 16, 4, 5, 0F); // Import Box155
		bodyModel[102].setRotationPoint(-53F, -17F, -19.5F);

		bodyModel[103].addBox(0F, 0F, 0F, 30, 2, 2, 0F); // Import Box160
		bodyModel[103].setRotationPoint(-21F, -3F, 12F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Import Box161
		bodyModel[104].setRotationPoint(17F, -18F, 16F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 9, 6, 6, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Box162
		bodyModel[105].setRotationPoint(17F, -18F, 10F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 19, 6, 0, 0F, 0F, -2F, 0F, -4.5F, -2F, 0F, -4.5F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -4F, 0F); // Import Box164
		bodyModel[106].setRotationPoint(19F, -14.5F, -13F);

		bodyModel[107].addBox(-27.5F, 9F, -5F, 1, 7, 10, 0F); // Import ImportBackHatch
		bodyModel[107].setRotationPoint(0F, -28F, 0F);
		bodyModel[107].rotateAngleZ = 0.34906585F;

		bodyModel[108].addShapeBox(16F, 2F, -5.5F, 2, 6, 11, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 2.2F, 0F, 0F, .5F, 0F, 0F, 0.5F, 0F, 0F, 2.2F, 0F); // Import ImportRotatingThingy
		bodyModel[108].setRotationPoint(2F, -29F, 0F);

		bodyModel[109].addBox(13.9F, -1F, -6F, 4, 11, 12, 0F); // Import ImportThesquare
		bodyModel[109].setRotationPoint(0F, -29F, 0F);

		bodyModel[110].addShapeBox(-3F, 0F, -1F, 3, 4, 1, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 2F, 5F, 0F, 0F, 5F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 2F); // Import ImportLeftHatch
		bodyModel[110].setRotationPoint(0F, -35F, 0F);

		bodyModel[111].addShapeBox(-3F, 0F, -10F, 3, 4, 1, 0F, 2F, 0F, 2F, 2F, 0F, 2F, 5F, 0F, 0F, 5F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 2F, 5F, 0F, 0F, 5F, 0F, 0F); // Import ImportRightHatch
		bodyModel[111].setRotationPoint(0F, -35F, 0F);

		bodyModel[112].addShapeBox(4.5F, 7F, 9.5F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Import ImportAntennaBottom
		bodyModel[112].setRotationPoint(0F, -43F, 0F);

		bodyModel[113].addBox(7.5F, 4.5F, 9.5F, 1, 4, 1, 0F); // Import ImportAntennaForward
		bodyModel[113].setRotationPoint(0F, -28F, 0F);
		bodyModel[113].rotateAngleZ = -1.57079633F;

		bodyModel[114].addBox(7.5F, 7F, 9.5F, 1, 3, 1, 0F); // Import ImportAntennaUpperBase
		bodyModel[114].setRotationPoint(0F, -46F, 0F);

		bodyModel[115].addShapeBox(-2F, 9F, 9.5F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportAntennaAngle
		bodyModel[115].setRotationPoint(0F, -49F, 0F);
		bodyModel[115].rotateAngleZ = -0.78539816F;

		bodyModel[116].addBox(0F, 4F, -13.3F, 6, 4, 1, 0F); // Import ImportRightSticker
		bodyModel[116].setRotationPoint(0F, -29F, 0F);
		bodyModel[116].rotateAngleX = -0.10471976F;
		bodyModel[116].rotateAngleY = -0.59341195F;

		bodyModel[117].addShapeBox(-8F, 0F, -9F, 13, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		bodyModel[117].setRotationPoint(0F, -35F, 0F);

		bodyModel[118].addShapeBox(4F, -3F, -14F, 10, 14, 28, 0F, 0F, 0F, -1F, 0F, -2F, -8F, 0F, -2F, -8F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 0F, -8F, 3F, 0F, -8F, 0F, 0F, 0F); // Import Box129
		bodyModel[118].setRotationPoint(0F, -29F, 0F);

		bodyModel[119].addShapeBox(-28F, -3F, -14F, 21, 11, 28, 0F, 0F, -2F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -6F, 3F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -5F); // Import Box130
		bodyModel[119].setRotationPoint(0F, -29F, 0F);

		bodyModel[120].addShapeBox(-7F, -3F, -14F, 11, 14, 28, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box131
		bodyModel[120].setRotationPoint(0F, -29F, 0F);

		bodyModel[121].addShapeBox(-23F, 8F, -14F, 16, 3, 28, 0F, 3F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -4F, 3F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -5F); // Import Box136
		bodyModel[121].setRotationPoint(0F, -29F, 0F);

		bodyModel[122].addBox(0F, 4F, 12F, 6, 4, 1, 0F); // Import Box137
		bodyModel[122].setRotationPoint(0F, -29F, 0F);
		bodyModel[122].rotateAngleX = 0.10471976F;
		bodyModel[122].rotateAngleY = 0.59341195F;

		bodyModel[123].addBox(-6F, 0F, 3F, 9, 1, 9, 0F); // Import Box138
		bodyModel[123].setRotationPoint(0F, -32.5F, 0F);

		bodyModel[124].addShapeBox(-6F, 1F, 12.5F, 7, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box145
		bodyModel[124].setRotationPoint(0F, -29F, 0F);
		bodyModel[124].rotateAngleX = 0.08726646F;

		bodyModel[125].addShapeBox(1F, 1F, 12.7F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box146
		bodyModel[125].setRotationPoint(0F, -29F, 0F);
		bodyModel[125].rotateAngleX = 0.08726646F;

		bodyModel[126].addShapeBox(1F, 6F, 12.7F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box147
		bodyModel[126].setRotationPoint(0F, -29F, 0F);
		bodyModel[126].rotateAngleX = 0.08726646F;

		bodyModel[127].addBox(1F, -1.2F, -1.5F, 12, 3, 3, 0F); // Import ImportBarrelBack
		bodyModel[127].setRotationPoint(16F, -24.2F, 0F);

		bodyModel[128].addBox(1F, -3.1F, 1F, 10, 1, 3, 0F); // Import ImportLeftWeeGee
		bodyModel[128].setRotationPoint(16F, -24.2F, 0F);

		bodyModel[129].addBox(0F, -3.1F, -4F, 9, 1, 3, 0F); // Import ImportRightWeeGee
		bodyModel[129].setRotationPoint(17F, -24.2F, 0F);

		bodyModel[130].addShapeBox(0F, -4.1F, -4F, 9, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box3
		bodyModel[130].setRotationPoint(17F, -24.2F, 0F);

		bodyModel[131].addShapeBox(0F, -2.1F, -4F, 9, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box5
		bodyModel[131].setRotationPoint(17F, -24.2F, 0F);

		bodyModel[132].addShapeBox(1F, -4.1F, 1F, 10, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box6
		bodyModel[132].setRotationPoint(16F, -24.2F, 0F);

		bodyModel[133].addShapeBox(1F, -2.1F, 1F, 10, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box7
		bodyModel[133].setRotationPoint(16F, -24.2F, 0F);

		bodyModel[134].addShapeBox(1F, 3.5F, 1F, 10, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box8
		bodyModel[134].setRotationPoint(16F, -24.2F, 0F);

		bodyModel[135].addBox(1F, 2.5F, 1F, 10, 1, 3, 0F); // Import Box9
		bodyModel[135].setRotationPoint(16F, -24.2F, 0F);

		bodyModel[136].addShapeBox(1F, 1.5F, 1F, 10, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box10
		bodyModel[136].setRotationPoint(16F, -24.2F, 0F);

		bodyModel[137].addShapeBox(8F, -0.7F, -1F, 55, 2, 2, 0F, 0F, 0.2F, 0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.2F, 0.2F); // Import Box128
		bodyModel[137].setRotationPoint(11F, -24.2F, 0F);

		bodyModel[138].addBox(0F, 0F, 0F, 71, 1, 7, 0F); // Import ImportBottomTrackLeft
		bodyModel[138].setRotationPoint(-42F, 7F, 13F);

		bodyModel[139].addBox(0F, 0F, 0F, 91, 1, 7, 0F); // Import ImportTopTrackLeft
		bodyModel[139].setRotationPoint(-54F, -9.5F, 13F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportFrontCornerTrack
		bodyModel[140].setRotationPoint(37F, -9.5F, 13F);
		bodyModel[140].rotateAngleZ = 0.79412481F;

		bodyModel[141].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Import ImportTrackFront
		bodyModel[141].setRotationPoint(39F, -7.5F, 13F);
		bodyModel[141].rotateAngleZ = 1.57079633F;

		bodyModel[142].addShapeBox(0F, 0F, 0F, 15, 1, 7, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportTraclFrontAngled
		bodyModel[142].setRotationPoint(39F, -3.5F, 13F);
		bodyModel[142].rotateAngleZ = 2.28638132F;

		bodyModel[143].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Import ImportBackTopTrack
		bodyModel[143].setRotationPoint(-56.8F, -6.7F, 13F);
		bodyModel[143].rotateAngleZ = -0.78539816F;

		bodyModel[144].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBack
		bodyModel[144].setRotationPoint(-56.8F, -2.7F, 13F);
		bodyModel[144].rotateAngleZ = -1.57079633F;

		bodyModel[145].addShapeBox(0F, 0F, 0F, 18, 1, 7, 0F, 0F, 0F, 0F, 0.15F, -0.1F, 0F, 0.15F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBackLowerAngle
		bodyModel[145].setRotationPoint(-42F, 8F, 13F);
		bodyModel[145].rotateAngleZ = -2.53072742F;

		bodyModel[146].addBox(0F, 0F, 0F, 71, 1, 7, 0F); // Import Box71
		bodyModel[146].setRotationPoint(-42F, 7F, -20F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 15, 1, 7, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box72
		bodyModel[147].setRotationPoint(39F, -3.5F, -20F);
		bodyModel[147].rotateAngleZ = 2.28638132F;

		bodyModel[148].addBox(0F, 0F, 0F, 91, 1, 7, 0F); // Import Box76
		bodyModel[148].setRotationPoint(-54F, -9.5F, -20F);

		bodyModel[149].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Import Box77
		bodyModel[149].setRotationPoint(39F, -7.5F, -20F);
		bodyModel[149].rotateAngleZ = 1.57079633F;

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box78
		bodyModel[150].setRotationPoint(37F, -9.5F, -20F);
		bodyModel[150].rotateAngleZ = 0.79412481F;

		bodyModel[151].addShapeBox(0F, 0F, 0F, 18, 1, 7, 0F, 0F, 0F, 0F, 0.15F, -0.1F, 0F, 0.15F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box89
		bodyModel[151].setRotationPoint(-42F, 8F, -20F);
		bodyModel[151].rotateAngleZ = -2.53072742F;

		bodyModel[152].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Import Box93
		bodyModel[152].setRotationPoint(-56.8F, -6.7F, -20F);
		bodyModel[152].rotateAngleZ = -0.78539816F;

		bodyModel[153].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box94
		bodyModel[153].setRotationPoint(-56.8F, -2.7F, -20F);
		bodyModel[153].rotateAngleZ = -1.57079633F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 154; i++)
		{
			bodyModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo bodyModel[];
}