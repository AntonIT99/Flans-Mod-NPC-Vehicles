//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GeballteLadung
// Model Creator:
// Created on:30.08.2016 - 14:52:35
// Last changed on: 30.08.2016 - 14:52:35

package com.flansmod.client.model.mineworld;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelStielhandgranate43 extends ModelBase
{
	int textureX = 32;
	int textureY = 32;

	public ModelStielhandgranate43()
	{
		geballteladungModel = new ModelRendererTurbo[84];
		geballteladungModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportImportBox4
		geballteladungModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		geballteladungModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 6
		geballteladungModel[3] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 8
		geballteladungModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 9
		geballteladungModel[5] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 10
		geballteladungModel[6] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 12
		geballteladungModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 13
		geballteladungModel[8] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 14
		geballteladungModel[9] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 15
		geballteladungModel[10] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 16
		geballteladungModel[11] = new ModelRendererTurbo(this, 27, 14, textureX, textureY); // Box 17
		geballteladungModel[12] = new ModelRendererTurbo(this, 14, 30, textureX, textureY); // Box 18
		geballteladungModel[13] = new ModelRendererTurbo(this, 8, 22, textureX, textureY); // Box 19
		geballteladungModel[14] = new ModelRendererTurbo(this, 2, 30, textureX, textureY); // Box 20
		geballteladungModel[15] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 21
		geballteladungModel[16] = new ModelRendererTurbo(this, 13, 20, textureX, textureY); // Box 22
		geballteladungModel[17] = new ModelRendererTurbo(this, 12, 14, textureX, textureY); // Box 23
		geballteladungModel[18] = new ModelRendererTurbo(this, 13, 1, textureX, textureY); // Box 24
		geballteladungModel[19] = new ModelRendererTurbo(this, 7, 7, textureX, textureY); // Box 25
		geballteladungModel[20] = new ModelRendererTurbo(this, 14, 23, textureX, textureY); // Box 26
		geballteladungModel[21] = new ModelRendererTurbo(this, 0, 6, textureX, textureY); // Box 27
		geballteladungModel[22] = new ModelRendererTurbo(this, 27, 22, textureX, textureY); // Box 28
		geballteladungModel[23] = new ModelRendererTurbo(this, 25, 28, textureX, textureY); // Box 29
		geballteladungModel[24] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 36
		geballteladungModel[25] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 37
		geballteladungModel[26] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 38
		geballteladungModel[27] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 39
		geballteladungModel[28] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 40
		geballteladungModel[29] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 41
		geballteladungModel[30] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 42
		geballteladungModel[31] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 43
		geballteladungModel[32] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 44
		geballteladungModel[33] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 45
		geballteladungModel[34] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 46
		geballteladungModel[35] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 47
		geballteladungModel[36] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 48
		geballteladungModel[37] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 49
		geballteladungModel[38] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 50
		geballteladungModel[39] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 51
		geballteladungModel[40] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 52
		geballteladungModel[41] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 53
		geballteladungModel[42] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 54
		geballteladungModel[43] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 55
		geballteladungModel[44] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 56
		geballteladungModel[45] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 57
		geballteladungModel[46] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 58
		geballteladungModel[47] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 59
		geballteladungModel[48] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 60
		geballteladungModel[49] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 61
		geballteladungModel[50] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 62
		geballteladungModel[51] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 64
		geballteladungModel[52] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 65
		geballteladungModel[53] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 66
		geballteladungModel[54] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 70
		geballteladungModel[55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 71
		geballteladungModel[56] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 72
		geballteladungModel[57] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 73
		geballteladungModel[58] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 74
		geballteladungModel[59] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 75
		geballteladungModel[60] = new ModelRendererTurbo(this, 20, 22, textureX, textureY); // Box 76
		geballteladungModel[61] = new ModelRendererTurbo(this, 4, 5, textureX, textureY); // Box 77
		geballteladungModel[62] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 78
		geballteladungModel[63] = new ModelRendererTurbo(this, 24, 7, textureX, textureY); // Box 79
		geballteladungModel[64] = new ModelRendererTurbo(this, 24, 7, textureX, textureY); // Box 80
		geballteladungModel[65] = new ModelRendererTurbo(this, 24, 7, textureX, textureY); // Box 81
		geballteladungModel[66] = new ModelRendererTurbo(this, 24, 7, textureX, textureY); // Box 82
		geballteladungModel[67] = new ModelRendererTurbo(this, 24, 7, textureX, textureY); // Box 83
		geballteladungModel[68] = new ModelRendererTurbo(this, 24, 7, textureX, textureY); // Box 84
		geballteladungModel[69] = new ModelRendererTurbo(this, 24, 7, textureX, textureY); // Box 85
		geballteladungModel[70] = new ModelRendererTurbo(this, 24, 7, textureX, textureY); // Box 86
		geballteladungModel[71] = new ModelRendererTurbo(this, 24, 7, textureX, textureY); // Box 87
		geballteladungModel[72] = new ModelRendererTurbo(this, 24, 7, textureX, textureY); // Box 88
		geballteladungModel[73] = new ModelRendererTurbo(this, 24, 7, textureX, textureY); // Box 89
		geballteladungModel[74] = new ModelRendererTurbo(this, 24, 7, textureX, textureY); // Box 90
		geballteladungModel[75] = new ModelRendererTurbo(this, 24, 7, textureX, textureY); // Box 91
		geballteladungModel[76] = new ModelRendererTurbo(this, 24, 7, textureX, textureY); // Box 92
		geballteladungModel[77] = new ModelRendererTurbo(this, 24, 6, textureX, textureY); // Box 93
		geballteladungModel[78] = new ModelRendererTurbo(this, 24, 6, textureX, textureY); // Box 94
		geballteladungModel[79] = new ModelRendererTurbo(this, 24, 6, textureX, textureY); // Box 95
		geballteladungModel[80] = new ModelRendererTurbo(this, 24, 6, textureX, textureY); // Box 96
		geballteladungModel[81] = new ModelRendererTurbo(this, 24, 6, textureX, textureY); // Box 97
		geballteladungModel[82] = new ModelRendererTurbo(this, 24, 6, textureX, textureY); // Box 98
		geballteladungModel[83] = new ModelRendererTurbo(this, 24, 6, textureX, textureY); // Box 99

		geballteladungModel[0].addShapeBox(-1.5F, -0.5F, -1F, 3, 1, 3, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F); // Import ImportImportBox4
		geballteladungModel[0].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[0].rotateAngleX = 4.71238898F;

		geballteladungModel[1].addShapeBox(-0.5F, -0.5F, -7F, 1, 1, 4, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 2
		geballteladungModel[1].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[1].rotateAngleX = 4.71238898F;

		geballteladungModel[2].addShapeBox(-0.5F, -0.5F, -7F, 1, 1, 4, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 6
		geballteladungModel[2].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[2].rotateAngleX = 4.71238898F;

		geballteladungModel[3].addShapeBox(-0.5F, -0.5F, -7F, 1, 1, 4, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 8
		geballteladungModel[3].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[3].rotateAngleX = 4.71238898F;

		geballteladungModel[4].addShapeBox(-1.5F, -0.5F, -1F, 3, 1, 3, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F); // Box 9
		geballteladungModel[4].setRotationPoint(0F, 0F, -0.9F);
		geballteladungModel[4].rotateAngleX = 4.71238898F;

		geballteladungModel[5].addShapeBox(-1.5F, -2.3F, -1F, 3, 1, 3, 0F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F); // Box 10
		geballteladungModel[5].setRotationPoint(0F, 0F, -0.9F);
		geballteladungModel[5].rotateAngleX = 4.71238898F;

		geballteladungModel[6].addShapeBox(-1.5F, -0.5F, -1F, 3, 1, 1, 0F, -0.05F, -0.05F, -0.9F, -0.05F, -0.05F, -0.9F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.9F, -0.05F, -0.05F, -0.9F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 12
		geballteladungModel[6].setRotationPoint(0F, -1F, 0F);
		geballteladungModel[6].rotateAngleX = 4.71238898F;

		geballteladungModel[7].addShapeBox(-1.5F, -0.5F, -1.1F, 3, 1, 1, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.9F, -0.05F, -0.05F, -0.9F, -0.8F, -0.05F, 0F, -0.8F, -0.05F, 0F, -0.8F, -0.05F, -0.9F, -0.8F, -0.05F, -0.9F); // Box 13
		geballteladungModel[7].setRotationPoint(0F, 0F, -0.9F);
		geballteladungModel[7].rotateAngleX = 4.71238898F;

		geballteladungModel[8].addShapeBox(-1.5F, -2.3F, -1.1F, 3, 1, 1, 0F, -0.8F, -0.05F, 0F, -0.8F, -0.05F, 0F, -0.8F, -0.05F, -0.9F, -0.8F, -0.05F, -0.9F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.9F, -0.05F, -0.05F, -0.9F); // Box 14
		geballteladungModel[8].setRotationPoint(0F, 0F, -0.9F);
		geballteladungModel[8].rotateAngleX = 4.71238898F;

		geballteladungModel[9].addShapeBox(-0.5F, -0.5F, -2F, 1, 1, 1, 0F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.5F, -0.125F, 0F, 0.5F, -0.125F, 0F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.5F, -0.125F, 0F, 0.5F, -0.125F, 0F); // Box 15
		geballteladungModel[9].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[9].rotateAngleX = 4.71238898F;

		geballteladungModel[10].addShapeBox(-0.5F, 0.25F, -2F, 1, 1, 1, 0F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.5F, -0.125F, 0F, 0.5F, -0.125F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 16
		geballteladungModel[10].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[10].rotateAngleX = 4.71238898F;

		geballteladungModel[11].addShapeBox(-0.5F, -1.25F, -2F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.5F, -0.125F, 0F, 0.5F, -0.125F, 0F); // Box 17
		geballteladungModel[11].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[11].rotateAngleX = 4.71238898F;

		geballteladungModel[12].addShapeBox(-0.5F, 0.25F, -2.75F, 1, 1, 1, 0F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 18
		geballteladungModel[12].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[12].rotateAngleX = 4.71238898F;

		geballteladungModel[13].addShapeBox(-0.5F, -0.5F, -2.75F, 1, 1, 1, 0F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F); // Box 19
		geballteladungModel[13].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[13].rotateAngleX = 4.71238898F;

		geballteladungModel[14].addShapeBox(-0.5F, -1.25F, -2.75F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F); // Box 20
		geballteladungModel[14].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[14].rotateAngleX = 4.71238898F;

		geballteladungModel[15].addShapeBox(-0.5F, -0.5F, -3.5F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F); // Box 21
		geballteladungModel[15].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[15].rotateAngleX = 4.71238898F;

		geballteladungModel[16].addShapeBox(-0.5F, 0.25F, -3.5F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, -0.3F, -0.75F, -0.25F, -0.3F, -0.75F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 22
		geballteladungModel[16].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[16].rotateAngleX = 4.71238898F;

		geballteladungModel[17].addShapeBox(-0.5F, -1.25F, -3.5F, 1, 1, 1, 0F, -0.3F, -0.75F, -0.25F, -0.3F, -0.75F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F); // Box 23
		geballteladungModel[17].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[17].rotateAngleX = 4.71238898F;

		geballteladungModel[18].addShapeBox(-0.5F, -0.5F, -2.75F, 1, 1, 1, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 24
		geballteladungModel[18].setRotationPoint(0F, -5F, 0F);
		geballteladungModel[18].rotateAngleX = 4.71238898F;

		geballteladungModel[19].addShapeBox(-0.5F, 0.25F, -7.75F, 1, 1, 1, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.3F, -0.75F, -0.25F, -0.3F, -0.75F, -0.25F); // Box 25
		geballteladungModel[19].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[19].rotateAngleX = 4.71238898F;

		geballteladungModel[20].addShapeBox(-0.5F, -1.25F, -7.75F, 1, 1, 1, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.3F, -0.75F, -0.25F, -0.3F, -0.75F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 26
		geballteladungModel[20].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[20].rotateAngleX = 4.71238898F;

		geballteladungModel[21].addShapeBox(-0.5F, -0.5F, -8.75F, 1, 1, 1, 0F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F); // Box 27
		geballteladungModel[21].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[21].rotateAngleX = 4.71238898F;

		geballteladungModel[22].addShapeBox(-0.5F, 0.25F, -8.75F, 1, 1, 1, 0F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 28
		geballteladungModel[22].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[22].rotateAngleX = 4.71238898F;

		geballteladungModel[23].addShapeBox(-0.5F, -1.25F, -8.75F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F); // Box 29
		geballteladungModel[23].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[23].rotateAngleX = 4.71238898F;

		geballteladungModel[24].addShapeBox(-0.5F, -1.65F, -1F, 1, 1, 3, 0F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F); // Box 36
		geballteladungModel[24].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[24].rotateAngleX = 4.71238898F;

		geballteladungModel[25].addShapeBox(-0.2F, -1.65F, -1F, 1, 1, 3, 0F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F); // Box 37
		geballteladungModel[25].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[25].rotateAngleX = 4.71238898F;

		geballteladungModel[26].addShapeBox(0.1F, -1.65F, -1F, 1, 1, 3, 0F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F); // Box 38
		geballteladungModel[26].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[26].rotateAngleX = 4.71238898F;

		geballteladungModel[27].addShapeBox(-0.8F, -1.65F, -1F, 1, 1, 3, 0F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F); // Box 39
		geballteladungModel[27].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[27].rotateAngleX = 4.71238898F;

		geballteladungModel[28].addShapeBox(-1.35F, -1.5F, -6F, 1, 1, 3, 0F, -0.55F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.55F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F); // Box 40
		geballteladungModel[28].setRotationPoint(0F, 5F, 0F);
		geballteladungModel[28].rotateAngleX = 4.71238898F;

		geballteladungModel[29].addShapeBox(-1.7F, -1.1F, -6F, 1, 1, 3, 0F, -0.55F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.55F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F); // Box 41
		geballteladungModel[29].setRotationPoint(0F, 5F, 0F);
		geballteladungModel[29].rotateAngleX = 4.71238898F;

		geballteladungModel[30].addShapeBox(-1.1F, -1.65F, -1F, 1, 1, 3, 0F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F); // Box 42
		geballteladungModel[30].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[30].rotateAngleX = 4.71238898F;

		geballteladungModel[31].addShapeBox(-1.52F, -1.3F, -6F, 1, 1, 3, 0F, -0.55F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.55F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F); // Box 43
		geballteladungModel[31].setRotationPoint(0F, 5F, 0F);
		geballteladungModel[31].rotateAngleX = 4.71238898F;

		geballteladungModel[32].addShapeBox(0.35F, -1.5F, -6F, 1, 1, 3, 0F, -0.45F, -0.45F, -0.01F, -0.55F, -0.45F, -0.01F, -0.55F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F); // Box 44
		geballteladungModel[32].setRotationPoint(0F, 5F, 0F);
		geballteladungModel[32].rotateAngleX = 4.71238898F;

		geballteladungModel[33].addShapeBox(0.52F, -1.3F, -6F, 1, 1, 3, 0F, -0.45F, -0.45F, -0.01F, -0.55F, -0.45F, -0.01F, -0.55F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F); // Box 45
		geballteladungModel[33].setRotationPoint(0F, 5F, 0F);
		geballteladungModel[33].rotateAngleX = 4.71238898F;

		geballteladungModel[34].addShapeBox(0.7F, -1.1F, -6F, 1, 1, 3, 0F, -0.45F, -0.45F, -0.01F, -0.55F, -0.45F, -0.01F, -0.55F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F); // Box 46
		geballteladungModel[34].setRotationPoint(0F, 5F, 0F);
		geballteladungModel[34].rotateAngleX = 4.71238898F;

		geballteladungModel[35].addShapeBox(-1.1F, 0.7F, -1F, 1, 1, 3, 0F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F); // Box 47
		geballteladungModel[35].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[35].rotateAngleX = 4.71238898F;

		geballteladungModel[36].addShapeBox(-0.8F, 0.7F, -1F, 1, 1, 3, 0F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F); // Box 48
		geballteladungModel[36].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[36].rotateAngleX = 4.71238898F;

		geballteladungModel[37].addShapeBox(-0.5F, 0.7F, -1F, 1, 1, 3, 0F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F); // Box 49
		geballteladungModel[37].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[37].rotateAngleX = 4.71238898F;

		geballteladungModel[38].addShapeBox(-0.2F, 0.7F, -1F, 1, 1, 3, 0F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F); // Box 50
		geballteladungModel[38].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[38].rotateAngleX = 4.71238898F;

		geballteladungModel[39].addShapeBox(0.1F, 0.7F, -1F, 1, 1, 3, 0F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F); // Box 51
		geballteladungModel[39].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[39].rotateAngleX = 4.71238898F;

		geballteladungModel[40].addShapeBox(0.75F, -0.8F, -1F, 1, 1, 3, 0F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F); // Box 52
		geballteladungModel[40].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[40].rotateAngleX = 4.71238898F;

		geballteladungModel[41].addShapeBox(0.75F, -0.6F, -1F, 1, 1, 3, 0F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F); // Box 53
		geballteladungModel[41].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[41].rotateAngleX = 4.71238898F;

		geballteladungModel[42].addShapeBox(0.75F, -0.4F, -1F, 1, 1, 3, 0F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F); // Box 54
		geballteladungModel[42].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[42].rotateAngleX = 4.71238898F;

		geballteladungModel[43].addShapeBox(0.75F, -0.2F, -1F, 1, 1, 3, 0F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F); // Box 55
		geballteladungModel[43].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[43].rotateAngleX = 4.71238898F;

		geballteladungModel[44].addShapeBox(-1.75F, -0.8F, -1F, 1, 1, 3, 0F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F); // Box 56
		geballteladungModel[44].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[44].rotateAngleX = 4.71238898F;

		geballteladungModel[45].addShapeBox(-1.75F, -0.6F, -1F, 1, 1, 3, 0F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F); // Box 57
		geballteladungModel[45].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[45].rotateAngleX = 4.71238898F;

		geballteladungModel[46].addShapeBox(-1.75F, -0.4F, -1F, 1, 1, 3, 0F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F); // Box 58
		geballteladungModel[46].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[46].rotateAngleX = 4.71238898F;

		geballteladungModel[47].addShapeBox(-1.75F, -0.2F, -1F, 1, 1, 3, 0F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F); // Box 59
		geballteladungModel[47].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[47].rotateAngleX = 4.71238898F;

		geballteladungModel[48].addShapeBox(-1.7F, 0.05F, -6F, 1, 1, 3, 0F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.55F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.55F, -0.45F, -0.01F); // Box 60
		geballteladungModel[48].setRotationPoint(0F, 5F, 0F);
		geballteladungModel[48].rotateAngleX = 4.71238898F;

		geballteladungModel[49].addShapeBox(-1.52F, 0.3F, -6F, 1, 1, 3, 0F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.55F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.55F, -0.45F, -0.01F); // Box 61
		geballteladungModel[49].setRotationPoint(0F, 5F, 0F);
		geballteladungModel[49].rotateAngleX = 4.71238898F;

		geballteladungModel[50].addShapeBox(-1.35F, 0.55F, -6F, 1, 1, 3, 0F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.55F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.55F, -0.45F, -0.01F); // Box 62
		geballteladungModel[50].setRotationPoint(0F, 5F, 0F);
		geballteladungModel[50].rotateAngleX = 4.71238898F;

		geballteladungModel[51].addShapeBox(0.35F, 0.55F, -6F, 1, 1, 3, 0F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.55F, -0.45F, -0.01F, -0.55F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F); // Box 64
		geballteladungModel[51].setRotationPoint(0F, 5F, 0F);
		geballteladungModel[51].rotateAngleX = 4.71238898F;

		geballteladungModel[52].addShapeBox(0.52F, 0.3F, -6F, 1, 1, 3, 0F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.55F, -0.45F, -0.01F, -0.55F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F); // Box 65
		geballteladungModel[52].setRotationPoint(0F, 5F, 0F);
		geballteladungModel[52].rotateAngleX = 4.71238898F;

		geballteladungModel[53].addShapeBox(0.7F, 0.05F, -6F, 1, 1, 3, 0F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F, -0.55F, -0.45F, -0.01F, -0.55F, -0.45F, -0.01F, -0.45F, -0.45F, -0.01F); // Box 66
		geballteladungModel[53].setRotationPoint(0F, 5F, 0F);
		geballteladungModel[53].rotateAngleX = 4.71238898F;

		geballteladungModel[54].addShapeBox(-0.5F, -0.35F, 1.6F, 1, 1, 1, 0F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.4F, -0.25F, -0.6F, -0.4F, -0.25F, -0.6F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F); // Box 70
		geballteladungModel[54].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[54].rotateAngleX = 4.71238898F;

		geballteladungModel[55].addShapeBox(-0.5F, -0.65F, 1.6F, 1, 1, 1, 0F, -0.4F, -0.25F, -0.6F, -0.4F, -0.25F, -0.6F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F); // Box 71
		geballteladungModel[55].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[55].rotateAngleX = 4.71238898F;

		geballteladungModel[56].addShapeBox(-0.5F, -0.5F, 1.6F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.35F, -0.4F); // Box 72
		geballteladungModel[56].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[56].rotateAngleX = 4.71238898F;

		geballteladungModel[57].addShapeBox(-0.5F, -0.65F, 1.8F, 1, 1, 1, 0F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.4F, -0.25F, -0.6F, -0.4F, -0.25F, -0.6F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F); // Box 73
		geballteladungModel[57].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[57].rotateAngleX = 4.71238898F;

		geballteladungModel[58].addShapeBox(-0.5F, -0.5F, 1.8F, 1, 1, 1, 0F, -0.2F, -0.35F, -0.4F, -0.2F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F); // Box 74
		geballteladungModel[58].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[58].rotateAngleX = 4.71238898F;

		geballteladungModel[59].addShapeBox(-0.5F, -0.35F, 1.8F, 1, 1, 1, 0F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.4F, -0.25F, -0.6F, -0.4F, -0.25F, -0.6F); // Box 75
		geballteladungModel[59].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[59].rotateAngleX = 4.71238898F;

		geballteladungModel[60].addShapeBox(-0.5F, 0.25F, 1.05F, 1, 1, 1, 0F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 76
		geballteladungModel[60].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[60].rotateAngleX = 4.71238898F;

		geballteladungModel[61].addShapeBox(-0.5F, -0.5F, 1.05F, 1, 1, 1, 0F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F); // Box 77
		geballteladungModel[61].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[61].rotateAngleX = 4.71238898F;

		geballteladungModel[62].addShapeBox(-0.5F, -1.25F, 1.05F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F); // Box 78
		geballteladungModel[62].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[62].rotateAngleX = 4.71238898F;

		geballteladungModel[63].addShapeBox(-1.5F, -0.5F, -1.2F, 3, 1, 1, 0F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F); // Box 79
		geballteladungModel[63].setRotationPoint(0F, 0F, -0.9F);
		geballteladungModel[63].rotateAngleX = 4.71238898F;

		geballteladungModel[64].addShapeBox(-1.5F, -0.5F, -0.8F, 3, 1, 1, 0F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F); // Box 80
		geballteladungModel[64].setRotationPoint(0F, 0F, -0.9F);
		geballteladungModel[64].rotateAngleX = 4.71238898F;

		geballteladungModel[65].addShapeBox(-1.5F, -0.5F, -0.4F, 3, 1, 1, 0F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F); // Box 81
		geballteladungModel[65].setRotationPoint(0F, 0F, -0.9F);
		geballteladungModel[65].rotateAngleX = 4.71238898F;

		geballteladungModel[66].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 1, 0F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F); // Box 82
		geballteladungModel[66].setRotationPoint(0F, 0F, -0.9F);
		geballteladungModel[66].rotateAngleX = 4.71238898F;

		geballteladungModel[67].addShapeBox(-1.5F, -0.5F, 0.4F, 3, 1, 1, 0F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F); // Box 83
		geballteladungModel[67].setRotationPoint(0F, 0F, -0.9F);
		geballteladungModel[67].rotateAngleX = 4.71238898F;

		geballteladungModel[68].addShapeBox(-1.5F, -0.5F, 0.8F, 3, 1, 1, 0F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F); // Box 84
		geballteladungModel[68].setRotationPoint(0F, 0F, -0.9F);
		geballteladungModel[68].rotateAngleX = 4.71238898F;

		geballteladungModel[69].addShapeBox(-1.5F, -0.5F, 1.2F, 3, 1, 1, 0F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F); // Box 85
		geballteladungModel[69].setRotationPoint(0F, 0F, -0.9F);
		geballteladungModel[69].rotateAngleX = 4.71238898F;

		geballteladungModel[70].addShapeBox(-1.5F, -2.25F, 1.2F, 3, 1, 1, 0F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F); // Box 86
		geballteladungModel[70].setRotationPoint(0F, 0F, -0.9F);
		geballteladungModel[70].rotateAngleX = 4.71238898F;

		geballteladungModel[71].addShapeBox(-1.5F, -2.25F, 0.8F, 3, 1, 1, 0F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F); // Box 87
		geballteladungModel[71].setRotationPoint(0F, 0F, -0.9F);
		geballteladungModel[71].rotateAngleX = 4.71238898F;

		geballteladungModel[72].addShapeBox(-1.5F, -2.25F, 0.4F, 3, 1, 1, 0F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F); // Box 88
		geballteladungModel[72].setRotationPoint(0F, 0F, -0.9F);
		geballteladungModel[72].rotateAngleX = 4.71238898F;

		geballteladungModel[73].addShapeBox(-1.5F, -2.25F, 0F, 3, 1, 1, 0F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F); // Box 89
		geballteladungModel[73].setRotationPoint(0F, 0F, -0.9F);
		geballteladungModel[73].rotateAngleX = 4.71238898F;

		geballteladungModel[74].addShapeBox(-1.5F, -2.25F, -0.4F, 3, 1, 1, 0F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F); // Box 90
		geballteladungModel[74].setRotationPoint(0F, 0F, -0.9F);
		geballteladungModel[74].rotateAngleX = 4.71238898F;

		geballteladungModel[75].addShapeBox(-1.5F, -2.25F, -0.8F, 3, 1, 1, 0F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F); // Box 91
		geballteladungModel[75].setRotationPoint(0F, 0F, -0.9F);
		geballteladungModel[75].rotateAngleX = 4.71238898F;

		geballteladungModel[76].addShapeBox(-1.5F, -2.25F, -1.2F, 3, 1, 1, 0F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.75F, -0.15F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F); // Box 92
		geballteladungModel[76].setRotationPoint(0F, 0F, -0.9F);
		geballteladungModel[76].rotateAngleX = 4.71238898F;

		geballteladungModel[77].addShapeBox(-1.5F, -0.5F, -1.3F, 2, 1, 2, 0F, -0.2F, -0.05F, -0.95F, 0.8F, -0.05F, -0.95F, 0.8F, -0.05F, -0.95F, -0.2F, -0.05F, -0.95F, -0.2F, -0.05F, -0.95F, 0.8F, -0.05F, -0.95F, 0.8F, -0.05F, -0.95F, -0.2F, -0.05F, -0.95F); // Box 93
		geballteladungModel[77].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[77].rotateAngleX = 4.71238898F;

		geballteladungModel[78].addShapeBox(-1.5F, -0.5F, -1.7F, 2, 1, 2, 0F, -0.2F, -0.05F, -0.95F, 0.8F, -0.05F, -0.95F, 0.8F, -0.05F, -0.95F, -0.2F, -0.05F, -0.95F, -0.2F, -0.05F, -0.95F, 0.8F, -0.05F, -0.95F, 0.8F, -0.05F, -0.95F, -0.2F, -0.05F, -0.95F); // Box 94
		geballteladungModel[78].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[78].rotateAngleX = 4.71238898F;

		geballteladungModel[79].addShapeBox(-1.5F, -0.5F, -0.9F, 2, 1, 2, 0F, -0.2F, -0.05F, -0.95F, 0.8F, -0.05F, -0.95F, 0.8F, -0.05F, -0.95F, -0.2F, -0.05F, -0.95F, -0.2F, -0.05F, -0.95F, 0.8F, -0.05F, -0.95F, 0.8F, -0.05F, -0.95F, -0.2F, -0.05F, -0.95F); // Box 95
		geballteladungModel[79].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[79].rotateAngleX = 4.71238898F;

		geballteladungModel[80].addShapeBox(-1.5F, -0.5F, -0.5F, 2, 1, 2, 0F, -0.2F, -0.05F, -0.95F, 0.8F, -0.05F, -0.95F, 0.8F, -0.05F, -0.95F, -0.2F, -0.05F, -0.95F, -0.2F, -0.05F, -0.95F, 0.8F, -0.05F, -0.95F, 0.8F, -0.05F, -0.95F, -0.2F, -0.05F, -0.95F); // Box 96
		geballteladungModel[80].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[80].rotateAngleX = 4.71238898F;

		geballteladungModel[81].addShapeBox(-1.5F, -0.5F, -0.1F, 2, 1, 2, 0F, -0.2F, -0.05F, -0.95F, 0.8F, -0.05F, -0.95F, 0.8F, -0.05F, -0.95F, -0.2F, -0.05F, -0.95F, -0.2F, -0.05F, -0.95F, 0.8F, -0.05F, -0.95F, 0.8F, -0.05F, -0.95F, -0.2F, -0.05F, -0.95F); // Box 97
		geballteladungModel[81].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[81].rotateAngleX = 4.71238898F;

		geballteladungModel[82].addShapeBox(-1.5F, -0.5F, 0.3F, 2, 1, 2, 0F, -0.2F, -0.05F, -0.95F, 0.8F, -0.05F, -0.95F, 0.8F, -0.05F, -0.95F, -0.2F, -0.05F, -0.95F, -0.2F, -0.05F, -0.95F, 0.8F, -0.05F, -0.95F, 0.8F, -0.05F, -0.95F, -0.2F, -0.05F, -0.95F); // Box 98
		geballteladungModel[82].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[82].rotateAngleX = 4.71238898F;

		geballteladungModel[83].addShapeBox(-1.5F, -0.5F, 0.7F, 2, 1, 2, 0F, -0.2F, -0.05F, -0.95F, 0.8F, -0.05F, -0.95F, 0.8F, -0.05F, -0.95F, -0.2F, -0.05F, -0.95F, -0.2F, -0.05F, -0.95F, 0.8F, -0.05F, -0.95F, 0.8F, -0.05F, -0.95F, -0.2F, -0.05F, -0.95F); // Box 99
		geballteladungModel[83].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[83].rotateAngleX = 4.71238898F;


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 84; i++)
		{
			geballteladungModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo geballteladungModel[];
}