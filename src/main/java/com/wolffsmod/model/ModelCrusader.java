//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Crusader
// Model Creator:
// Created on:-
// Last changed on: -

package com.wolffsmod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCrusader extends ModelBase
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelCrusader()
	{
		crusaderModel = new ModelRendererTurbo[98];
		crusaderModel[0] = new ModelRendererTurbo(this, 0, 50, textureX, textureY); // Import ImportCR,MainBody
		crusaderModel[1] = new ModelRendererTurbo(this, 0, 110, textureX, textureY); // Import ImportCR,EngineBlock
		crusaderModel[2] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Import ImportCR,RightWheelfront
		crusaderModel[3] = new ModelRendererTurbo(this, 0, 275, textureX, textureY); // Import Box0
		crusaderModel[4] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import Box1
		crusaderModel[5] = new ModelRendererTurbo(this, 0, 330, textureX, textureY); // Import Box2
		crusaderModel[6] = new ModelRendererTurbo(this, 0, 375, textureX, textureY); // Import Box8
		crusaderModel[7] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Import Box9
		crusaderModel[8] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Import Box10
		crusaderModel[9] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Import Box11
		crusaderModel[10] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Import Box12
		crusaderModel[11] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Import Box13
		crusaderModel[12] = new ModelRendererTurbo(this, 0, 515, textureX, textureY); // Import Box14
		crusaderModel[13] = new ModelRendererTurbo(this, 0, 515, textureX, textureY); // Import Box15
		crusaderModel[14] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Import Box18
		crusaderModel[15] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Import Box20
		crusaderModel[16] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Import Box21
		crusaderModel[17] = new ModelRendererTurbo(this, 0, 565, textureX, textureY); // Import Box0
		crusaderModel[18] = new ModelRendererTurbo(this, 0, 580, textureX, textureY); // Import Box1
		crusaderModel[19] = new ModelRendererTurbo(this, 0, 580, textureX, textureY); // Import Box2
		crusaderModel[20] = new ModelRendererTurbo(this, 0, 565, textureX, textureY); // Import Box3
		crusaderModel[21] = new ModelRendererTurbo(this, 0, 595, textureX, textureY); // Import Box4
		crusaderModel[22] = new ModelRendererTurbo(this, 0, 635, textureX, textureY); // Import Box5
		crusaderModel[23] = new ModelRendererTurbo(this, 0, 635, textureX, textureY); // Import Box6
		crusaderModel[24] = new ModelRendererTurbo(this, 0, 645, textureX, textureY); // Import Box7
		crusaderModel[25] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Import Box8
		crusaderModel[26] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Import Box9
		crusaderModel[27] = new ModelRendererTurbo(this, 0, 690, textureX, textureY); // Import Box10
		crusaderModel[28] = new ModelRendererTurbo(this, 0, 690, textureX, textureY); // Import Box11
		crusaderModel[29] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Import Box70
		crusaderModel[30] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Import Box71
		crusaderModel[31] = new ModelRendererTurbo(this, 100, 0, textureX, textureY); // Import Box72
		crusaderModel[32] = new ModelRendererTurbo(this, 100, 15, textureX, textureY); // Import Box82
		crusaderModel[33] = new ModelRendererTurbo(this, 100, 15, textureX, textureY); // Import Box83
		crusaderModel[34] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Import Box85
		crusaderModel[35] = new ModelRendererTurbo(this, 100, 15, textureX, textureY); // Import Box86
		crusaderModel[36] = new ModelRendererTurbo(this, 100, 15, textureX, textureY); // Import Box87
		crusaderModel[37] = new ModelRendererTurbo(this, 100, 15, textureX, textureY); // Import Box88
		crusaderModel[38] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Import Box89
		crusaderModel[39] = new ModelRendererTurbo(this, 100, 15, textureX, textureY); // Import Box90
		crusaderModel[40] = new ModelRendererTurbo(this, 100, 15, textureX, textureY); // Import Box106
		crusaderModel[41] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Import Box107
		crusaderModel[42] = new ModelRendererTurbo(this, 100, 15, textureX, textureY); // Import Box108
		crusaderModel[43] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Import Box96
		crusaderModel[44] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Import Box97
		crusaderModel[45] = new ModelRendererTurbo(this, 100, 0, textureX, textureY); // Import Box98
		crusaderModel[46] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Import Box99
		crusaderModel[47] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Import Box100
		crusaderModel[48] = new ModelRendererTurbo(this, 100, 0, textureX, textureY); // Import Box101
		crusaderModel[49] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Import Box102
		crusaderModel[50] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Import Box103
		crusaderModel[51] = new ModelRendererTurbo(this, 100, 0, textureX, textureY); // Import Box104
		crusaderModel[52] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Import Box105
		crusaderModel[53] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Import Box106
		crusaderModel[54] = new ModelRendererTurbo(this, 100, 0, textureX, textureY); // Import Box107
		crusaderModel[55] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Import Box108
		crusaderModel[56] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Import Box109
		crusaderModel[57] = new ModelRendererTurbo(this, 100, 0, textureX, textureY); // Import Box110
		crusaderModel[58] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Import Box112
		crusaderModel[59] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Import Box113
		crusaderModel[60] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Import Box114
		crusaderModel[61] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Import Box115
		crusaderModel[62] = new ModelRendererTurbo(this, 100, 0, textureX, textureY); // Import Box116
		crusaderModel[63] = new ModelRendererTurbo(this, 100, 0, textureX, textureY); // Import Box117
		crusaderModel[64] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Import Box118
		crusaderModel[65] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Import Box119
		crusaderModel[66] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Import Box120
		crusaderModel[67] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Import Box121
		crusaderModel[68] = new ModelRendererTurbo(this, 100, 0, textureX, textureY); // Import Box122
		crusaderModel[69] = new ModelRendererTurbo(this, 100, 0, textureX, textureY); // Import Box123
		crusaderModel[70] = new ModelRendererTurbo(this, 0, 580, textureX, textureY); // Import Box124
		crusaderModel[71] = new ModelRendererTurbo(this, 0, 580, textureX, textureY); // Import Box125
		crusaderModel[72] = new ModelRendererTurbo(this, 300, 88, textureX, textureY); // Import Box16
		crusaderModel[73] = new ModelRendererTurbo(this, 268, 40, textureX, textureY); // Import Box17
		crusaderModel[74] = new ModelRendererTurbo(this, 200, 75, textureX, textureY); // Import Box21
		crusaderModel[75] = new ModelRendererTurbo(this, 200, 120, textureX, textureY); // Import Box22
		crusaderModel[76] = new ModelRendererTurbo(this, 200, 160, textureX, textureY); // Import Box23
		crusaderModel[77] = new ModelRendererTurbo(this, 200, 185, textureX, textureY); // Import Box24
		crusaderModel[78] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Import Box26
		crusaderModel[79] = new ModelRendererTurbo(this, 200, 215, textureX, textureY); // Import Box29
		crusaderModel[80] = new ModelRendererTurbo(this, 200, 235, textureX, textureY); // Import Box32
		crusaderModel[81] = new ModelRendererTurbo(this, 200, 235, textureX, textureY); // Import Box67
		crusaderModel[82] = new ModelRendererTurbo(this, 1, 0, textureX, textureY); // Import Box96
		crusaderModel[83] = new ModelRendererTurbo(this, 200, 250, textureX, textureY); // Import Box27
		crusaderModel[84] = new ModelRendererTurbo(this, 200, 260, textureX, textureY); // Import Box28
		crusaderModel[85] = new ModelRendererTurbo(this, 200, 270, textureX, textureY); // Import Box30
		crusaderModel[86] = new ModelRendererTurbo(this, 0, 190, textureX, textureY); // Import ImportLT,Top
		crusaderModel[87] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Import ImportLT,Front
		crusaderModel[88] = new ModelRendererTurbo(this, 0, 220, textureX, textureY); // Import ImportLT,Bottom
		crusaderModel[89] = new ModelRendererTurbo(this, 0, 230, textureX, textureY); // Import ImportLT,Back
		crusaderModel[90] = new ModelRendererTurbo(this, 0, 250, textureX, textureY); // Import ImportLT,Frontcorner
		crusaderModel[91] = new ModelRendererTurbo(this, 0, 250, textureX, textureY); // Import ImportLT,Backcorner
		crusaderModel[92] = new ModelRendererTurbo(this, 0, 190, textureX, textureY); // Import ImportRT,Top
		crusaderModel[93] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Import ImportRT,Front
		crusaderModel[94] = new ModelRendererTurbo(this, 0, 220, textureX, textureY); // Import ImportRT,Bottom
		crusaderModel[95] = new ModelRendererTurbo(this, 0, 230, textureX, textureY); // Import ImportRT,Back
		crusaderModel[96] = new ModelRendererTurbo(this, 0, 250, textureX, textureY); // Import ImportRT,Frontcorner
		crusaderModel[97] = new ModelRendererTurbo(this, 0, 250, textureX, textureY); // Import ImportRT,Backcorner

		crusaderModel[0].addShapeBox(0F, 0F, 0F, 31, 12, 30, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import ImportCR,MainBody
		crusaderModel[0].setRotationPoint(3F, -8F, -15F);

		crusaderModel[1].addShapeBox(0F, 0F, 0F, 50, 7, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportCR,EngineBlock
		crusaderModel[1].setRotationPoint(-26F, -15F, -15F);

		crusaderModel[2].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Import ImportCR,RightWheelfront
		crusaderModel[2].setRotationPoint(29F, -7F, 15F);

		crusaderModel[3].addShapeBox(0F, 0F, 0F, 2, 5, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		crusaderModel[3].setRotationPoint(24F, -15F, -12F);

		crusaderModel[4].addShapeBox(0F, 0F, 0F, 3, 5, 15, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import Box1
		crusaderModel[4].setRotationPoint(26F, -15F, -12F);

		crusaderModel[5].addShapeBox(0F, 0F, 0F, 13, 3, 30, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box2
		crusaderModel[5].setRotationPoint(24F, -11F, -15F);

		crusaderModel[6].addShapeBox(0F, 0F, 0F, 26, 12, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		crusaderModel[6].setRotationPoint(-23F, -8F, -15F);

		crusaderModel[7].addShapeBox(0F, 0F, 0F, 31, 12, 30, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box9
		crusaderModel[7].setRotationPoint(-54F, -8F, -15F);

		crusaderModel[8].addBox(0F, 0F, 0F, 79, 1, 7, 0F); // Import Box10
		crusaderModel[8].setRotationPoint(-49F, -10.5F, -22F);

		crusaderModel[9].addBox(0F, 0F, 0F, 79, 1, 7, 0F); // Import Box11
		crusaderModel[9].setRotationPoint(-49F, -10.5F, 15F);

		crusaderModel[10].addBox(0F, 0F, 0F, 8, 1, 7, 0F); // Import Box12
		crusaderModel[10].setRotationPoint(-56.8F, -8.8F, -22F);
		crusaderModel[10].rotateAngleZ = -0.20943951F;

		crusaderModel[11].addBox(0F, 0F, 0F, 8, 1, 7, 0F); // Import Box13
		crusaderModel[11].setRotationPoint(-56.8F, -8.8F, 15F);
		crusaderModel[11].rotateAngleZ = -0.20943951F;

		crusaderModel[12].addBox(0F, 0F, 0F, 8, 1, 7, 0F); // Import Box14
		crusaderModel[12].setRotationPoint(29.9F, -10.5F, 15F);
		crusaderModel[12].rotateAngleZ = 0.20943951F;

		crusaderModel[13].addBox(0F, 0F, 0F, 8, 1, 7, 0F); // Import Box15
		crusaderModel[13].setRotationPoint(29.9F, -10.5F, -22F);
		crusaderModel[13].rotateAngleZ = 0.20943951F;

		crusaderModel[14].addBox(0F, 0F, 0F, 3, 9, 22, 0F); // Import Box18
		crusaderModel[14].setRotationPoint(-57F, -11F, -11F);

		crusaderModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 22, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 1F, 0F); // Import Box20
		crusaderModel[15].setRotationPoint(-60F, -7F, -11F);

		crusaderModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 22, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 4F, 0F); // Import Box21
		crusaderModel[16].setRotationPoint(-54F, -7F, -11F);

		crusaderModel[17].addShapeBox(0F, 0F, 0F, 30, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, -1F, 0F, 0F, -1F, -1F); // Import Box0
		crusaderModel[17].setRotationPoint(-39F, -14.2F, 16F);
		crusaderModel[17].rotateAngleX = -0.36651914F;

		crusaderModel[18].addShapeBox(0F, 0F, 0F, 22, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, -1F, 0F, 0F, -1F, -1F); // Import Box1
		crusaderModel[18].setRotationPoint(-6F, -14.2F, 16F);
		crusaderModel[18].rotateAngleX = -0.36651914F;

		crusaderModel[19].addShapeBox(0F, 0F, 0F, 22, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, -1F, 0F, 0F, -1F, -1F); // Import Box2
		crusaderModel[19].setRotationPoint(16F, -14.2F, -16F);
		crusaderModel[19].rotateAngleX = -0.36651914F;
		crusaderModel[19].rotateAngleY = 3.14159265F;

		crusaderModel[20].addShapeBox(0F, 0F, 0F, 30, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, -1F, 0F, 0F, -1F, -1F); // Import Box3
		crusaderModel[20].setRotationPoint(-9F, -14.2F, -16F);
		crusaderModel[20].rotateAngleX = -0.36651914F;
		crusaderModel[20].rotateAngleY = 3.14159265F;

		crusaderModel[21].addShapeBox(0F, 0F, 1F, 20, 7, 25, 0F, 0F, -2F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -2F, -5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Import Box4
		crusaderModel[21].setRotationPoint(-46F, -15F, -14F);

		crusaderModel[22].addShapeBox(0F, 0F, 0F, 20, 3, 2, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box5
		crusaderModel[22].setRotationPoint(-46F, -11F, -15F);

		crusaderModel[23].addShapeBox(0F, 0F, 0F, 20, 3, 2, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box6
		crusaderModel[23].setRotationPoint(-46F, -11F, 13F);

		crusaderModel[24].addShapeBox(0F, 0F, 0F, 8, 2, 30, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Import Box7
		crusaderModel[24].setRotationPoint(-54F, -9F, -15F);

		crusaderModel[25].addShapeBox(0F, 0F, 0F, 8, 6, 0, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Import Box8
		crusaderModel[25].setRotationPoint(-57F, -10.1F, 15F);

		crusaderModel[26].addShapeBox(0F, 0F, 0F, 8, 6, 0, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Import Box9
		crusaderModel[26].setRotationPoint(-57F, -10.1F, -15F);

		crusaderModel[27].addShapeBox(0F, 0F, 0F, 19, 8, 0, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -4.3F, 0F, 0F, -4.3F, 0F, 0F, -1.3F, 0F); // Import Box10
		crusaderModel[27].setRotationPoint(-49F, -11.1F, 15F);

		crusaderModel[28].addShapeBox(0F, 0F, 0F, 19, 8, 0, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -4.3F, 0F, 0F, -4.3F, 0F, 0F, -1.3F, 0F); // Import Box11
		crusaderModel[28].setRotationPoint(-49F, -11.1F, -15F);

		crusaderModel[29].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Import Box70
		crusaderModel[29].setRotationPoint(18F, -3.5F, 15F);

		crusaderModel[30].addShapeBox(0F, 0F, 0F, 10, 10, 5, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F); // Import Box71
		crusaderModel[30].setRotationPoint(16.5F, -2F, 15F);

		crusaderModel[31].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Import Box72
		crusaderModel[31].setRotationPoint(18F, 7.5F, 15F);

		crusaderModel[32].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Import Box82
		crusaderModel[32].setRotationPoint(29F, -9.5F, 15F);

		crusaderModel[33].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F); // Import Box83
		crusaderModel[33].setRotationPoint(29F, -4.5F, 15F);

		crusaderModel[34].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Import Box85
		crusaderModel[34].setRotationPoint(-52F, -7F, 15F);

		crusaderModel[35].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F); // Import Box86
		crusaderModel[35].setRotationPoint(-52F, -4.5F, 15F);

		crusaderModel[36].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Import Box87
		crusaderModel[36].setRotationPoint(-52F, -9.5F, 15F);

		crusaderModel[37].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Import Box88
		crusaderModel[37].setRotationPoint(-52F, -9.5F, -20F);

		crusaderModel[38].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Import Box89
		crusaderModel[38].setRotationPoint(-52F, -7F, -20F);

		crusaderModel[39].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F); // Import Box90
		crusaderModel[39].setRotationPoint(-52F, -4.5F, -20F);

		crusaderModel[40].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F); // Import Box106
		crusaderModel[40].setRotationPoint(29F, -4.5F, -20F);

		crusaderModel[41].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Import Box107
		crusaderModel[41].setRotationPoint(29F, -7F, -20F);

		crusaderModel[42].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Import Box108
		crusaderModel[42].setRotationPoint(29F, -9.5F, -20F);

		crusaderModel[43].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Import Box96
		crusaderModel[43].setRotationPoint(3F, -3.5F, 15F);

		crusaderModel[44].addShapeBox(0F, 0F, 0F, 10, 10, 5, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F); // Import Box97
		crusaderModel[44].setRotationPoint(1.5F, -2F, 15F);

		crusaderModel[45].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Import Box98
		crusaderModel[45].setRotationPoint(3F, 7.5F, 15F);

		crusaderModel[46].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Import Box99
		crusaderModel[46].setRotationPoint(-12F, -3.5F, 15F);

		crusaderModel[47].addShapeBox(0F, 0F, 0F, 10, 10, 5, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F); // Import Box100
		crusaderModel[47].setRotationPoint(-13.5F, -2F, 15F);

		crusaderModel[48].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Import Box101
		crusaderModel[48].setRotationPoint(-12F, 7.5F, 15F);

		crusaderModel[49].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Import Box102
		crusaderModel[49].setRotationPoint(-27F, -3.5F, 15F);

		crusaderModel[50].addShapeBox(0F, 0F, 0F, 10, 10, 5, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F); // Import Box103
		crusaderModel[50].setRotationPoint(-28.5F, -2F, 15F);

		crusaderModel[51].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Import Box104
		crusaderModel[51].setRotationPoint(-27F, 7.5F, 15F);

		crusaderModel[52].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Import Box105
		crusaderModel[52].setRotationPoint(-42F, -3.5F, 15F);

		crusaderModel[53].addShapeBox(0F, 0F, 0F, 10, 10, 5, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F); // Import Box106
		crusaderModel[53].setRotationPoint(-43.5F, -2F, 15F);

		crusaderModel[54].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Import Box107
		crusaderModel[54].setRotationPoint(-42F, 7.5F, 15F);

		crusaderModel[55].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Import Box108
		crusaderModel[55].setRotationPoint(18F, -3.5F, -20F);

		crusaderModel[56].addShapeBox(0F, 0F, 0F, 10, 10, 5, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F); // Import Box109
		crusaderModel[56].setRotationPoint(16.5F, -2F, -20F);

		crusaderModel[57].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Import Box110
		crusaderModel[57].setRotationPoint(18F, 7.5F, -20F);

		crusaderModel[58].addShapeBox(0F, 0F, 0F, 10, 10, 5, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F); // Import Box112
		crusaderModel[58].setRotationPoint(1.5F, -2F, -20F);

		crusaderModel[59].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Import Box113
		crusaderModel[59].setRotationPoint(3F, -3.5F, -20F);

		crusaderModel[60].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Import Box114
		crusaderModel[60].setRotationPoint(-12F, -3.5F, -20F);

		crusaderModel[61].addShapeBox(0F, 0F, 0F, 10, 10, 5, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F); // Import Box115
		crusaderModel[61].setRotationPoint(-13.5F, -2F, -20F);

		crusaderModel[62].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Import Box116
		crusaderModel[62].setRotationPoint(-12F, 7.5F, -20F);

		crusaderModel[63].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Import Box117
		crusaderModel[63].setRotationPoint(-27F, 7.5F, -20F);

		crusaderModel[64].addShapeBox(0F, 0F, 0F, 10, 10, 5, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F); // Import Box118
		crusaderModel[64].setRotationPoint(-28.5F, -2F, -20F);

		crusaderModel[65].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Import Box119
		crusaderModel[65].setRotationPoint(-27F, -3.5F, -20F);

		crusaderModel[66].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Import Box120
		crusaderModel[66].setRotationPoint(-42F, -3.5F, -20F);

		crusaderModel[67].addShapeBox(0F, 0F, 0F, 10, 10, 5, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F); // Import Box121
		crusaderModel[67].setRotationPoint(-43.5F, -2F, -20F);

		crusaderModel[68].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Import Box122
		crusaderModel[68].setRotationPoint(-42F, 7.5F, -20F);

		crusaderModel[69].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Import Box123
		crusaderModel[69].setRotationPoint(3F, 7.5F, -20F);

		crusaderModel[70].addShapeBox(0F, 0F, 0F, 22, 4, 6, 0F, 35F, 2F, 0F, 35F, 2F, 0F, 35F, 2F, -5F, 35F, 2F, -5F, 30F, 2F, 0F, 30F, 2F, 0F, 30F, 2F, -5F, 30F, 2F, -5F); // Import Box124
		crusaderModel[70].setRotationPoint(-20F, -7.2F, 22F);

		crusaderModel[71].addShapeBox(0F, 0F, 0F, 22, 4, 6, 0F, 35F, 2F, -5F, 35F, 2F, -5F, 35F, 2F, 0F, 35F, 2F, 0F, 30F, 2F, -5F, 30F, 2F, -5F, 30F, 2F, 0F, 30F, 2F, 0F); // Import Box125
		crusaderModel[71].setRotationPoint(-20F, -7.2F, -28F);

		crusaderModel[72].addShapeBox(5F, -15F, -14F, 11, 1, 28, 0F, 0F, 2F, 2F, 2F, 2F, -3F, 2F, 2F, -3F, 0F, 2F, 2F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, -1F, 0F); // Import Box16
		crusaderModel[72].setRotationPoint(0F, 0F, 0F);

		crusaderModel[73].addShapeBox(-13F, -15F, -14F, 18, 1, 28, 0F, 5F, 2F, -2F, 0F, 2F, 2F, 0F, 2F, 2F, 5F, 2F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F); // Import Box17
		crusaderModel[73].setRotationPoint(0F, 0F, 0F);

		crusaderModel[74].addShapeBox(5F, -25F, -15F, 11, 8, 30, 0F, 0F, 0F, -5F, -1F, 0F, -8F, -1F, 0F, -8F, 0F, 0F, -5F, 0F, 0F, 2F, 2F, 0F, -3F, 2F, 0F, -3F, 0F, 0F, 2F); // Import Box21
		crusaderModel[74].setRotationPoint(0F, 0F, 0F);

		crusaderModel[75].addShapeBox(-16F, -23F, -15F, 21, 6, 30, 0F, 0F, 2F, -8F, 0F, 2F, -5F, 0F, 2F, -5F, 0F, 2F, -8F, 5F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 5F, 0F, -2F); // Import Box22
		crusaderModel[75].setRotationPoint(0F, 0F, 0F);

		crusaderModel[76].addShapeBox(-30F, -12F, -7F, 5, 7, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box23
		crusaderModel[76].setRotationPoint(0F, 0F, 0F);
		crusaderModel[76].rotateAngleZ = 0.55850536F;

		crusaderModel[77].addShapeBox(5F, -26F, -6F, 9, 1, 12, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0.8F, 0F, 1.3F, 0.8F, 0F, 1.3F, 0F, 0F, 4F); // Import Box24
		crusaderModel[77].setRotationPoint(0F, 0F, 0F);

		crusaderModel[78].addShapeBox(-15F, -26F, -6F, 10, 1, 12, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 2.5F, 0F, 0F, 4F, 0F, 0F, 4F, 0.8F, 0F, 2.5F); // Import Box26
		crusaderModel[78].setRotationPoint(10F, 0F, 0F);

		crusaderModel[79].addShapeBox(15F, -23F, -5F, 3, 4, 10, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Import Box29
		crusaderModel[79].setRotationPoint(0F, 0F, 0F);

		crusaderModel[80].addShapeBox(-13.5F, -12F, 28.5F, 9, 8, 1, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F); // Import Box32
		crusaderModel[80].setRotationPoint(0F, 3F, 0F);
		crusaderModel[80].rotateAngleX = 1.74532925F;
		crusaderModel[80].rotateAngleY = 0.13962634F;

		crusaderModel[81].addShapeBox(-13.5F, -13F, -30F, 9, 8, 1, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F); // Import Box67
		crusaderModel[81].setRotationPoint(0F, 3F, -1F);
		crusaderModel[81].rotateAngleX = -1.74532925F;
		crusaderModel[81].rotateAngleY = -0.13962634F;

		crusaderModel[82].addShapeBox(-6F, -24F, -14F, 6, 5, 28, 0F, 0F, 0F, -4.6F, 2F, 0F, -3.3F, 2F, 0F, -3.3F, 0F, 0F, -4.6F, 0F, 0F, 0F, 2F, 0F, 1.2F, 2F, 0F, 1.2F, 0F, 0F, 0F); // Import Box96
		crusaderModel[82].setRotationPoint(0F, 0F, 0F);

		crusaderModel[83].addShapeBox(-5F, -1F, -1F, 22, 2, 2, 0F, 0F, -0.5F, -0.5F, 5F, -0.5F, -0.5F, 5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 5F, -0.5F, -0.5F, 5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box27
		crusaderModel[83].setRotationPoint(18F, -21F, -2F);

		crusaderModel[84].addShapeBox(22F, -1F, -1F, 6, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box28
		crusaderModel[84].setRotationPoint(18F, -21F, -2F);

		crusaderModel[85].addShapeBox(0F, -1F, 4F, 6, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Import Box30
		crusaderModel[85].setRotationPoint(18F, -21F, -2F);

		crusaderModel[86].addBox(0F, 0F, 0F, 87, 1, 6, 0F); // Import ImportLT,Top
		crusaderModel[86].setRotationPoint(-52F, -8F, -21F);

		crusaderModel[87].addBox(0F, 0F, 0F, 1, 7, 6, 0F); // Import ImportLT,Front
		crusaderModel[87].setRotationPoint(35F, -8F, -21F);

		crusaderModel[88].addBox(0F, 0F, 0F, 70, 1, 6, 0F); // Import ImportLT,Bottom
		crusaderModel[88].setRotationPoint(-44F, 9.5F, -21F);

		crusaderModel[89].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Import ImportLT,Back
		crusaderModel[89].setRotationPoint(-53F, -8F, -21F);

		crusaderModel[90].addBox(0F, 0F, 0F, 1, 15, 6, 0F); // Import ImportLT,Frontcorner
		crusaderModel[90].setRotationPoint(35.5F, -1.5F, -21F);
		crusaderModel[90].rotateAngleZ = 0.71558499F;

		crusaderModel[91].addBox(0F, 0F, 0F, 1, 15, 6, 0F); // Import ImportLT,Backcorner
		crusaderModel[91].setRotationPoint(-53F, -2F, -21F);
		crusaderModel[91].rotateAngleZ = -0.62831853F;

		crusaderModel[92].addBox(0F, 0F, 0F, 87, 1, 6, 0F); // Import ImportRT,Top
		crusaderModel[92].setRotationPoint(-52F, -8F, 15F);

		crusaderModel[93].addBox(0F, 0F, 0F, 1, 7, 6, 0F); // Import ImportRT,Front
		crusaderModel[93].setRotationPoint(35F, -8F, 15F);

		crusaderModel[94].addBox(0F, 0F, 0F, 70, 1, 6, 0F); // Import ImportRT,Bottom
		crusaderModel[94].setRotationPoint(-44F, 9.5F, 15F);

		crusaderModel[95].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Import ImportRT,Back
		crusaderModel[95].setRotationPoint(-53F, -8F, 15F);

		crusaderModel[96].addBox(0F, 0F, 0F, 1, 15, 6, 0F); // Import ImportRT,Frontcorner
		crusaderModel[96].setRotationPoint(35.3F, -1.5F, 15F);
		crusaderModel[96].rotateAngleZ = 0.71558499F;

		crusaderModel[97].addBox(0F, 0F, 3F, 1, 15, 6, 0F); // Import ImportRT,Backcorner
		crusaderModel[97].setRotationPoint(-53F, -2F, 12F);
		crusaderModel[97].rotateAngleZ = -0.62831853F;


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 98; i++)
		{
			crusaderModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo crusaderModel[];
}