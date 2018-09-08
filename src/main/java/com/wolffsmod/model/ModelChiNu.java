//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ChiNu
// Model Creator:
// Created on:-
// Last changed on: -

package com.wolffsmod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelChiNu extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelChiNu()
	{
		chinuModel = new ModelRendererTurbo[107];
		chinuModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportTrackCoverLeft
		chinuModel[1] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import ImportTrackCoverRight
		chinuModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportMainBodyBack
		chinuModel[3] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import ImportMainB0dyFront
		chinuModel[4] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Import ImportSmallCoverUp
		chinuModel[5] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import ImportEngineThingLeft
		chinuModel[6] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Import ImportDWC
		chinuModel[7] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Import ImportCW6
		chinuModel[8] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Import ImportBox98
		chinuModel[9] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Import Box12
		chinuModel[10] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Import Box13
		chinuModel[11] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Import Box14
		chinuModel[12] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Import Box15
		chinuModel[13] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Import Box16
		chinuModel[14] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Import Box17
		chinuModel[15] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Import Box18
		chinuModel[16] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Import Box19
		chinuModel[17] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Import Box20
		chinuModel[18] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Import Box21
		chinuModel[19] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Import Box22
		chinuModel[20] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Import Box23
		chinuModel[21] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import Box24
		chinuModel[22] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Import Box25
		chinuModel[23] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Import Box26
		chinuModel[24] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Import Box27
		chinuModel[25] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Import Box28
		chinuModel[26] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Import Box31
		chinuModel[27] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Import Box33
		chinuModel[28] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Import Box35
		chinuModel[29] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Import Box39
		chinuModel[30] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Import Box40
		chinuModel[31] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Import Box41
		chinuModel[32] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Import Box42
		chinuModel[33] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Import Box45
		chinuModel[34] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Import Box46
		chinuModel[35] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Import Box47
		chinuModel[36] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Import Box48
		chinuModel[37] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Import Box49
		chinuModel[38] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Import Box50
		chinuModel[39] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Import Box51
		chinuModel[40] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Import Box53
		chinuModel[41] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Import Box54
		chinuModel[42] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import Box55
		chinuModel[43] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Import Box56
		chinuModel[44] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Import Box57
		chinuModel[45] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Import Box58
		chinuModel[46] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Import Box59
		chinuModel[47] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Import Box60
		chinuModel[48] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Import Box61
		chinuModel[49] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Import Box62
		chinuModel[50] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Import Box63
		chinuModel[51] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Import Box64
		chinuModel[52] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Import Box65
		chinuModel[53] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Import Box66
		chinuModel[54] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Import Box67
		chinuModel[55] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Import Box68
		chinuModel[56] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Import Box69
		chinuModel[57] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Import Box70
		chinuModel[58] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Import Box73
		chinuModel[59] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Import Box74
		chinuModel[60] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Import Box75
		chinuModel[61] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Import Box79
		chinuModel[62] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Import Box80
		chinuModel[63] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import Box81
		chinuModel[64] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Import Box82
		chinuModel[65] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Import Box83
		chinuModel[66] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Import Box84
		chinuModel[67] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Import Box85
		chinuModel[68] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Import Box86
		chinuModel[69] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Import Box87
		chinuModel[70] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Import Box88
		chinuModel[71] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box90
		chinuModel[72] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Import Box91
		chinuModel[73] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Import Box92
		chinuModel[74] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Import Box132
		chinuModel[75] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Import Box135
		chinuModel[76] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Import Box139
		chinuModel[77] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import Box140
		chinuModel[78] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Import Box142
		chinuModel[79] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Import Box144
		chinuModel[80] = new ModelRendererTurbo(this, 137, 185, textureX, textureY); // Import Box132
		chinuModel[81] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Import Box133
		chinuModel[82] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Import Box134
		chinuModel[83] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Import Box135
		chinuModel[84] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Import Box136
		chinuModel[85] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Import Box137
		chinuModel[86] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Import Box138
		chinuModel[87] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Import Box139
		chinuModel[88] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import Box140
		chinuModel[89] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Import Box141
		chinuModel[90] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Import Box142
		chinuModel[91] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Import Box143
		chinuModel[92] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Import Box144
		chinuModel[93] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Import Box145
		chinuModel[94] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Import Box146
		chinuModel[95] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import Box148
		chinuModel[96] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box149
		chinuModel[97] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Import Box150
		chinuModel[98] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Import Box151
		chinuModel[99] = new ModelRendererTurbo(this, 249, 177, textureX, textureY); // Import Box152
		chinuModel[100] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Import Box153
		chinuModel[101] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Import Box154
		chinuModel[102] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Import Box155
		chinuModel[103] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Import Box160
		chinuModel[104] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Import Box161
		chinuModel[105] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Import Box162
		chinuModel[106] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Import Box164

		chinuModel[0].addBox(0F, 0F, 0F, 90, 1, 8, 0F); // Import ImportTrackCoverLeft
		chinuModel[0].setRotationPoint(-56.5F, -13.5F, 13F);

		chinuModel[1].addBox(0F, 0F, 0F, 90, 1, 8, 0F); // Import ImportTrackCoverRight
		chinuModel[1].setRotationPoint(-56.5F, -13.5F, -21F);

		chinuModel[2].addShapeBox(0F, 0F, 0F, 72, 16, 26, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, -3F, .3F, 0F); // Import ImportMainBodyBack
		chinuModel[2].setRotationPoint(-53F, -13.5F, -13F);

		chinuModel[3].addShapeBox(0F, 0F, 0F, 11, 5, 26, 0F, 0F, 2F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 2F, 0F, 0F, 5.3F, 0F, 7F, 2F, 0F, 7F, 2F, 0F, 0F, 5.3F, 0F); // Import ImportMainB0dyFront
		chinuModel[3].setRotationPoint(19F, -7.5F, -13F);

		chinuModel[4].addShapeBox(0F, 0F, 0F, 2, 5, 26, 0F, 4F, -10.3F, 0F, 12F, -7.0F, 0F, 12F, -7.0F, 0F, 3F, -10.3F, 0F, 4F, 5.3F, 0F, 7F, 5.3F, 0F, 7F, 5.3F, 0F, 4F, 5.3F, 0F); // Import ImportSmallCoverUp
		chinuModel[4].setRotationPoint(23F, -7.5F, -13F);

		chinuModel[5].addBox(0F, 0F, -0.5F, 16, 4, 5, 0F); // Import ImportEngineThingLeft
		chinuModel[5].setRotationPoint(-53F, -17F, 15.5F);

		chinuModel[6].addBox(0F, 0F, 0F, 7, 3, 6, 0F); // Import ImportDWC
		chinuModel[6].setRotationPoint(31F, -7F, 13F);

		chinuModel[7].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Import ImportCW6
		chinuModel[7].setRotationPoint(-43F, 3F, 13F);

		chinuModel[8].addBox(-2F, 0F, 0F, 5, 3, 4, 0F); // Import ImportBox98
		chinuModel[8].setRotationPoint(20F, -7.5F, 13F);

		chinuModel[9].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box12
		chinuModel[9].setRotationPoint(-43F, -1F, 13F);

		chinuModel[10].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box13
		chinuModel[10].setRotationPoint(-43F, -1F, 13F);

		chinuModel[11].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box14
		chinuModel[11].setRotationPoint(-30F, -1F, 13F);

		chinuModel[12].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Import Box15
		chinuModel[12].setRotationPoint(-30F, 3F, 13F);

		chinuModel[13].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box16
		chinuModel[13].setRotationPoint(-30F, -1F, 13F);

		chinuModel[14].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box17
		chinuModel[14].setRotationPoint(-17F, -1F, 13F);

		chinuModel[15].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Import Box18
		chinuModel[15].setRotationPoint(-17F, 3F, 13F);

		chinuModel[16].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box19
		chinuModel[16].setRotationPoint(-17F, -1F, 13F);

		chinuModel[17].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box20
		chinuModel[17].setRotationPoint(-4F, -1F, 13F);

		chinuModel[18].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Import Box21
		chinuModel[18].setRotationPoint(-4F, 3F, 13F);

		chinuModel[19].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box22
		chinuModel[19].setRotationPoint(-4F, -1F, 13F);

		chinuModel[20].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box23
		chinuModel[20].setRotationPoint(9F, -1F, 13F);

		chinuModel[21].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Import Box24
		chinuModel[21].setRotationPoint(9F, 3F, 13F);

		chinuModel[22].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box25
		chinuModel[22].setRotationPoint(9F, -1F, 13F);

		chinuModel[23].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box26
		chinuModel[23].setRotationPoint(22F, -1F, 13F);

		chinuModel[24].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Import Box27
		chinuModel[24].setRotationPoint(22F, 3F, 13F);

		chinuModel[25].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box28
		chinuModel[25].setRotationPoint(22F, -1F, 13F);

		chinuModel[26].addBox(-3F, 0F, 0F, 3, 1, 8, 0F); // Import Box31
		chinuModel[26].setRotationPoint(-56.5F, -13.5F, 13F);
		chinuModel[26].rotateAngleZ = -0.64577182F;

		chinuModel[27].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box33
		chinuModel[27].setRotationPoint(31F, -9F, 13F);

		chinuModel[28].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box35
		chinuModel[28].setRotationPoint(31F, -4F, 13F);

		chinuModel[29].addBox(0F, 0F, 0F, 7, 3, 6, 0F); // Import Box39
		chinuModel[29].setRotationPoint(-56F, -6.5F, 13F);

		chinuModel[30].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		chinuModel[30].setRotationPoint(-56F, -8.5F, 13F);

		chinuModel[31].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box41
		chinuModel[31].setRotationPoint(-56F, -3.5F, 13F);

		chinuModel[32].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box42
		chinuModel[32].setRotationPoint(20F, -8.5F, 13F);

		chinuModel[33].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box45
		chinuModel[33].setRotationPoint(20F, -4.5F, 13F);

		chinuModel[34].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box46
		chinuModel[34].setRotationPoint(-6F, -8.5F, 13F);

		chinuModel[35].addBox(-2F, 0F, 0F, 5, 3, 4, 0F); // Import Box47
		chinuModel[35].setRotationPoint(-6F, -7.5F, 13F);

		chinuModel[36].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box48
		chinuModel[36].setRotationPoint(-6F, -4.5F, 13F);

		chinuModel[37].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box49
		chinuModel[37].setRotationPoint(-32F, -8.5F, 13F);

		chinuModel[38].addBox(-2F, 0F, 0F, 5, 3, 4, 0F); // Import Box50
		chinuModel[38].setRotationPoint(-32F, -7.5F, 13F);

		chinuModel[39].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box51
		chinuModel[39].setRotationPoint(-32F, -4.5F, 13F);

		chinuModel[40].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box53
		chinuModel[40].setRotationPoint(-43F, -1F, -19F);

		chinuModel[41].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Import Box54
		chinuModel[41].setRotationPoint(-43F, 3F, -19F);

		chinuModel[42].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box55
		chinuModel[42].setRotationPoint(-43F, -1F, -19F);

		chinuModel[43].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box56
		chinuModel[43].setRotationPoint(-30F, -1F, -19F);

		chinuModel[44].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Import Box57
		chinuModel[44].setRotationPoint(-30F, 3F, -19F);

		chinuModel[45].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box58
		chinuModel[45].setRotationPoint(-30F, -1F, -19F);

		chinuModel[46].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box59
		chinuModel[46].setRotationPoint(-17F, -1F, -19F);

		chinuModel[47].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Import Box60
		chinuModel[47].setRotationPoint(-17F, 3F, -19F);

		chinuModel[48].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box61
		chinuModel[48].setRotationPoint(-17F, -1F, -19F);

		chinuModel[49].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Import Box62
		chinuModel[49].setRotationPoint(-4F, 3F, -19F);

		chinuModel[50].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box63
		chinuModel[50].setRotationPoint(-4F, -1F, -19F);

		chinuModel[51].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box64
		chinuModel[51].setRotationPoint(-4F, -1F, -19F);

		chinuModel[52].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box65
		chinuModel[52].setRotationPoint(9F, -1F, -19F);

		chinuModel[53].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Import Box66
		chinuModel[53].setRotationPoint(9F, 3F, -19F);

		chinuModel[54].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box67
		chinuModel[54].setRotationPoint(9F, -1F, -19F);

		chinuModel[55].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box68
		chinuModel[55].setRotationPoint(22F, -1F, -19F);

		chinuModel[56].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Import Box69
		chinuModel[56].setRotationPoint(22F, 3F, -19F);

		chinuModel[57].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box70
		chinuModel[57].setRotationPoint(22F, -1F, -19F);

		chinuModel[58].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box73
		chinuModel[58].setRotationPoint(31F, -4F, -19F);

		chinuModel[59].addBox(0F, 0F, 0F, 7, 3, 6, 0F); // Import Box74
		chinuModel[59].setRotationPoint(31F, -7F, -19F);

		chinuModel[60].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box75
		chinuModel[60].setRotationPoint(31F, -9F, -19F);

		chinuModel[61].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box79
		chinuModel[61].setRotationPoint(20F, -8.5F, -17F);

		chinuModel[62].addBox(-2F, 0F, 0F, 5, 3, 4, 0F); // Import Box80
		chinuModel[62].setRotationPoint(20F, -7.5F, -17F);

		chinuModel[63].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box81
		chinuModel[63].setRotationPoint(20F, -4.5F, -17F);

		chinuModel[64].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box82
		chinuModel[64].setRotationPoint(-6F, -4.5F, -17F);

		chinuModel[65].addBox(-2F, 0F, 0F, 5, 3, 4, 0F); // Import Box83
		chinuModel[65].setRotationPoint(-6F, -7.5F, -17F);

		chinuModel[66].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box84
		chinuModel[66].setRotationPoint(-6F, -8.5F, -17F);

		chinuModel[67].addBox(0F, 0F, 0F, 30, 2, 2, 0F); // Import Box85
		chinuModel[67].setRotationPoint(-21F, -3F, -14F);

		chinuModel[68].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box86
		chinuModel[68].setRotationPoint(-32F, -4.5F, -17F);

		chinuModel[69].addBox(-2F, 0F, 0F, 5, 3, 4, 0F); // Import Box87
		chinuModel[69].setRotationPoint(-32F, -7.5F, -17F);

		chinuModel[70].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box88
		chinuModel[70].setRotationPoint(-32F, -8.5F, -17F);

		chinuModel[71].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box90
		chinuModel[71].setRotationPoint(-56F, -3.5F, -19F);

		chinuModel[72].addBox(0F, 0F, 0F, 7, 3, 6, 0F); // Import Box91
		chinuModel[72].setRotationPoint(-56F, -6.5F, -19F);

		chinuModel[73].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box92
		chinuModel[73].setRotationPoint(-56F, -8.5F, -19F);

		chinuModel[74].addBox(-3F, 0F, 0F, 3, 1, 8, 0F); // Import Box132
		chinuModel[74].setRotationPoint(-56.5F, -13.5F, -21F);
		chinuModel[74].rotateAngleZ = -0.64577182F;

		chinuModel[75].addBox(0F, 0F, 0F, 48, 5, 32, 0F); // Import Box135
		chinuModel[75].setRotationPoint(-31F, -18F, -16F);

		chinuModel[76].addShapeBox(0F, 0F, 0F, 9, 6, 6, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box139
		chinuModel[76].setRotationPoint(17F, -18F, -16F);

		chinuModel[77].addShapeBox(0F, 0F, 0F, 20, 6, 26, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box140
		chinuModel[77].setRotationPoint(19F, -13.5F, -13F);

		chinuModel[78].addShapeBox(0F, 0F, -14F, 9, 6, 20, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box142
		chinuModel[78].setRotationPoint(17F, -18F, 4F);

		chinuModel[79].addShapeBox(0F, 0F, 0F, 19, 6, 0, 0F, 0F, -2F, 0F, -4.5F, -2F, 0F, -4.5F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -4F, 0F); // Import Box144
		chinuModel[79].setRotationPoint(19F, -14.5F, 13F);

		chinuModel[80].addShapeBox(0F, 0F, 0F, 48, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box132
		chinuModel[80].setRotationPoint(-31F, -18F, 16F);

		chinuModel[81].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box133
		chinuModel[81].setRotationPoint(17F, -18F, -20F);

		chinuModel[82].addShapeBox(0F, 0F, 0F, 48, 5, 4, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box134
		chinuModel[82].setRotationPoint(-31F, -18F, -20F);

		chinuModel[83].addBox(0F, 0F, 0F, 24, 5, 32, 0F); // Import Box135
		chinuModel[83].setRotationPoint(-55F, -18F, -16F);

		chinuModel[84].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box136
		chinuModel[84].setRotationPoint(-35F, -18F, -20F);

		chinuModel[85].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Import Box137
		chinuModel[85].setRotationPoint(-35F, -18F, 16F);

		chinuModel[86].addBox(0F, 0F, 0F, 10, 1, 10, 0F); // Import Box138
		chinuModel[86].setRotationPoint(26F, -12.5F, 1F);
		chinuModel[86].rotateAngleZ = 0.12217305F;

		chinuModel[87].addBox(0F, 0F, 0F, 10, 1, 10, 0F); // Import Box139
		chinuModel[87].setRotationPoint(26F, -12.5F, -11F);
		chinuModel[87].rotateAngleZ = 0.12217305F;

		chinuModel[88].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import Box140
		chinuModel[88].setRotationPoint(26F, -12.8F, 10F);
		chinuModel[88].rotateAngleZ = 0.12217305F;

		chinuModel[89].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import Box141
		chinuModel[89].setRotationPoint(34F, -11.8F, 10F);
		chinuModel[89].rotateAngleZ = 0.12217305F;

		chinuModel[90].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import Box142
		chinuModel[90].setRotationPoint(34F, -11.8F, -11F);
		chinuModel[90].rotateAngleZ = 0.12217305F;

		chinuModel[91].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import Box143
		chinuModel[91].setRotationPoint(26F, -12.8F, -11F);
		chinuModel[91].rotateAngleZ = 0.12217305F;

		chinuModel[92].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Import Box144
		chinuModel[92].setRotationPoint(24F, -17.5F, 4F);

		chinuModel[93].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Import Box145
		chinuModel[93].setRotationPoint(25F, -17F, 5F);

		chinuModel[94].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box146
		chinuModel[94].setRotationPoint(27F, -16F, 6F);

		chinuModel[95].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Import Box148
		chinuModel[95].setRotationPoint(24F, -17.5F, -9F);

		chinuModel[96].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Import Box149
		chinuModel[96].setRotationPoint(25.4F, -16.5F, -9F);

		chinuModel[97].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Import Box150
		chinuModel[97].setRotationPoint(25.4F, -15F, -9F);

		chinuModel[98].addBox(0F, 0F, 0F, 12, 1, 14, 0F); // Import Box151
		chinuModel[98].setRotationPoint(-51F, -18.2F, -15F);

		chinuModel[99].addBox(0F, 0F, 0F, 12, 1, 14, 0F); // Import Box152
		chinuModel[99].setRotationPoint(-51F, -18.2F, 1F);

		chinuModel[100].addBox(0F, 0F, 0F, 5, 1, 14, 0F); // Import Box153
		chinuModel[100].setRotationPoint(-38F, -18.2F, 1F);

		chinuModel[101].addBox(0F, 0F, 0F, 5, 1, 14, 0F); // Import Box154
		chinuModel[101].setRotationPoint(-38F, -18.2F, -15F);

		chinuModel[102].addBox(0F, 0F, -0.5F, 16, 4, 5, 0F); // Import Box155
		chinuModel[102].setRotationPoint(-53F, -17F, -19.5F);

		chinuModel[103].addBox(0F, 0F, 0F, 30, 2, 2, 0F); // Import Box160
		chinuModel[103].setRotationPoint(-21F, -3F, 12F);

		chinuModel[104].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Import Box161
		chinuModel[104].setRotationPoint(17F, -18F, 16F);

		chinuModel[105].addShapeBox(0F, 0F, 0F, 9, 6, 6, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Box162
		chinuModel[105].setRotationPoint(17F, -18F, 10F);

		chinuModel[106].addShapeBox(0F, 0F, 0F, 19, 6, 0, 0F, 0F, -2F, 0F, -4.5F, -2F, 0F, -4.5F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -4F, 0F); // Import Box164
		chinuModel[106].setRotationPoint(19F, -14.5F, -13F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 107; i++)
		{
			chinuModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo chinuModel[];
}