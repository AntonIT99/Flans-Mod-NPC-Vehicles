//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Churchill
// Model Creator:
// Created on:23.08.2018 - 01:06:40
// Last changed on: 23.08.2018 - 01:06:40

package com.wolffsmod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelChurchill extends ModelBase
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelChurchill()
	{
		churchillModel = new ModelRendererTurbo[111];
		churchillModel[0] = new ModelRendererTurbo(this, 0, 50, textureX, textureY); // Import ImportBody1
		churchillModel[1] = new ModelRendererTurbo(this, 0, 155, textureX, textureY); // Import ImportBody4
		churchillModel[2] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Import ImportBody5
		churchillModel[3] = new ModelRendererTurbo(this, 0, 245, textureX, textureY); // Import ImportBody6
		churchillModel[4] = new ModelRendererTurbo(this, 0, 295, textureX, textureY); // Import ImportBody7
		churchillModel[5] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import ImportBody8
		churchillModel[6] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import ImportBody9
		churchillModel[7] = new ModelRendererTurbo(this, 0, 420, textureX, textureY); // Import ImportBody10
		churchillModel[8] = new ModelRendererTurbo(this, 0, 445, textureX, textureY); // Import ImportBody11
		churchillModel[9] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import ImportBody12
		churchillModel[10] = new ModelRendererTurbo(this, 0, 470, textureX, textureY); // Import ImportBody13
		churchillModel[11] = new ModelRendererTurbo(this, 0, 470, textureX, textureY); // Import ImportBody14
		churchillModel[12] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Import ImportBody15
		churchillModel[13] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Import ImportBody16
		churchillModel[14] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Import ImportBody17
		churchillModel[15] = new ModelRendererTurbo(this, 0, 95, textureX, textureY); // Import ImportBody19
		churchillModel[16] = new ModelRendererTurbo(this, 0, 125, textureX, textureY); // Import ImportBody20
		churchillModel[17] = new ModelRendererTurbo(this, 0, 155, textureX, textureY); // Import ImportBody21
		churchillModel[18] = new ModelRendererTurbo(this, 0, 570, textureX, textureY); // Import ImportBody23
		churchillModel[19] = new ModelRendererTurbo(this, 0, 630, textureX, textureY); // Import ImportBody24
		churchillModel[20] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Import ImportBody25
		churchillModel[21] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Import ImportBody27
		churchillModel[22] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Import ImportBody28
		churchillModel[23] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Import ImportBody29
		churchillModel[24] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Import ImportBody30
		churchillModel[25] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Import ImportBody31
		churchillModel[26] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Import ImportBody32
		churchillModel[27] = new ModelRendererTurbo(this, 0, 870, textureX, textureY); // Import ImportLeftTrack4
		churchillModel[28] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Import ImportBody33
		churchillModel[29] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Import ImportBody34
		churchillModel[30] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Import ImportBody35
		churchillModel[31] = new ModelRendererTurbo(this, 0, 870, textureX, textureY); // Import ImportRightTrack4
		churchillModel[32] = new ModelRendererTurbo(this, 0, 900, textureX, textureY); // Import ImportRightTrack5
		churchillModel[33] = new ModelRendererTurbo(this, 0, 920, textureX, textureY); // Import ImportRightTrack6
		churchillModel[34] = new ModelRendererTurbo(this, 0, 950, textureX, textureY); // Import ImportRightTrack7
		churchillModel[35] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import ImportRightTrack8
		churchillModel[36] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Import ImportRightTrack9
		churchillModel[37] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import ImportRightTrack10
		churchillModel[38] = new ModelRendererTurbo(this, 0, 95, textureX, textureY); // Import Box0
		churchillModel[39] = new ModelRendererTurbo(this, 0, 125, textureX, textureY); // Import Box1
		churchillModel[40] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Import Box56
		churchillModel[41] = new ModelRendererTurbo(this, 0, 920, textureX, textureY); // Import Box57
		churchillModel[42] = new ModelRendererTurbo(this, 0, 950, textureX, textureY); // Import Box58
		churchillModel[43] = new ModelRendererTurbo(this, 0, 900, textureX, textureY); // Import Box59
		churchillModel[44] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box60
		churchillModel[45] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Import Box61
		churchillModel[46] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box62
		churchillModel[47] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box63
		churchillModel[48] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Import Box64
		churchillModel[49] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box65
		churchillModel[50] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box69
		churchillModel[51] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Import Box70
		churchillModel[52] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box71
		churchillModel[53] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box72
		churchillModel[54] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Import Box73
		churchillModel[55] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box74
		churchillModel[56] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box78
		churchillModel[57] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Import Box79
		churchillModel[58] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box80
		churchillModel[59] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box0
		churchillModel[60] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Import Box1
		churchillModel[61] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box2
		churchillModel[62] = new ModelRendererTurbo(this, 0, 900, textureX, textureY); // Import Box6
		churchillModel[63] = new ModelRendererTurbo(this, 0, 920, textureX, textureY); // Import Box7
		churchillModel[64] = new ModelRendererTurbo(this, 0, 950, textureX, textureY); // Import Box8
		churchillModel[65] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Import Box9
		churchillModel[66] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box10
		churchillModel[67] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box11
		churchillModel[68] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box12
		churchillModel[69] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Import Box13
		churchillModel[70] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box14
		churchillModel[71] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box15
		churchillModel[72] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Import Box16
		churchillModel[73] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box17
		churchillModel[74] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box18
		churchillModel[75] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Import Box19
		churchillModel[76] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box20
		churchillModel[77] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box21
		churchillModel[78] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Import Box22
		churchillModel[79] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box23
		churchillModel[80] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box24
		churchillModel[81] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Import Box25
		churchillModel[82] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box26
		churchillModel[83] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box27
		churchillModel[84] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Import Box28
		churchillModel[85] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box29
		churchillModel[86] = new ModelRendererTurbo(this, 0, 920, textureX, textureY); // Import Box30
		churchillModel[87] = new ModelRendererTurbo(this, 0, 900, textureX, textureY); // Import Box31
		churchillModel[88] = new ModelRendererTurbo(this, 0, 950, textureX, textureY); // Import Box32
		churchillModel[89] = new ModelRendererTurbo(this, 0, 50, textureX, textureY); // Import Box111
		churchillModel[90] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Import ImportTurret1
		churchillModel[91] = new ModelRendererTurbo(this, 502, 100, textureX, textureY); // Import ImportTurret2
		churchillModel[92] = new ModelRendererTurbo(this, 400, 160, textureX, textureY); // Import ImportTurret3
		churchillModel[93] = new ModelRendererTurbo(this, 400, 200, textureX, textureY); // Import ImportTurret4
		churchillModel[94] = new ModelRendererTurbo(this, 400, 230, textureX, textureY); // Import ImportTurret5
		churchillModel[95] = new ModelRendererTurbo(this, 400, 100, textureX, textureY); // Import Box0
		churchillModel[96] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Import Box106
		churchillModel[97] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Import Box110
		churchillModel[98] = new ModelRendererTurbo(this, 400, 200, textureX, textureY); // Import Box110
		churchillModel[99] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Box111
		churchillModel[100] = new ModelRendererTurbo(this, 296, 4, textureX, textureY); // Import Box114
		churchillModel[101] = new ModelRendererTurbo(this, 296, 4, textureX, textureY); // Import Box115
		churchillModel[102] = new ModelRendererTurbo(this, 400, 300, textureX, textureY); // Import ImportBarrel1
		churchillModel[103] = new ModelRendererTurbo(this, 400, 340, textureX, textureY); // Import ImportBarrel2
		churchillModel[104] = new ModelRendererTurbo(this, 400, 370, textureX, textureY); // Import ImportBarrel3
		churchillModel[105] = new ModelRendererTurbo(this, 0, 780, textureX, textureY); // Import ImportRightTrack1
		churchillModel[106] = new ModelRendererTurbo(this, 0, 830, textureX, textureY); // Import ImportRightTrack2
		churchillModel[107] = new ModelRendererTurbo(this, 0, 850, textureX, textureY); // Import ImportRightTrack3
		churchillModel[108] = new ModelRendererTurbo(this, 0, 780, textureX, textureY); // Import ImportLeftTrack1
		churchillModel[109] = new ModelRendererTurbo(this, 0, 830, textureX, textureY); // Import ImportLeftTrack2
		churchillModel[110] = new ModelRendererTurbo(this, 0, 850, textureX, textureY); // Import ImportLeftTrack3

		churchillModel[0].addShapeBox(0F, 0F, 0F, 113, 18, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Import ImportBody1
		churchillModel[0].setRotationPoint(-50F, -22F, 19F);

		churchillModel[1].addBox(0F, 0F, 0F, 4, 18, 18, 0F); // Import ImportBody4
		churchillModel[1].setRotationPoint(-54F, -22F, 19F);

		churchillModel[2].addShapeBox(0F, 0F, 0F, 16, 19, 16, 0F, -3F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBody5
		churchillModel[2].setRotationPoint(-70F, -22F, 19F);

		churchillModel[3].addShapeBox(0F, 0F, 0F, 89, 13, 30, 0F, 0F, 0F, 5F, 2F, 0F, 5F, 2F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 2F, 0F, 5F, 2F, 0F, 5F, 0F, 0F, 5F); // Import ImportBody6
		churchillModel[3].setRotationPoint(-54F, -23F, -15F);

		churchillModel[4].addShapeBox(0F, 0F, 0F, 106, 5, 30, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Import ImportBody7
		churchillModel[4].setRotationPoint(-54F, -11F, -15F);

		churchillModel[5].addShapeBox(0F, 0F, 0F, 120, 9, 30, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, -10F, 0F, 5F, -5F, 0F, 5F, -5F, 0F, 5F, -10F, 0F, 5F); // Import ImportBody8
		churchillModel[5].setRotationPoint(-68F, -6F, -15F);

		churchillModel[6].addShapeBox(0F, 0F, 0F, 13, 6, 30, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 10F, 0F, 5F, 10F, 0F, 5F, 0F, 0F, 5F); // Import ImportBody9
		churchillModel[6].setRotationPoint(29F, -17F, -15F);

		churchillModel[7].addBox(0F, 0F, 0F, 1, 8, 10, 0F); // Import ImportBody10
		churchillModel[7].setRotationPoint(35F, -23F, 4F);

		churchillModel[8].addBox(0F, 0F, 0F, 3, 4, 6, 0F); // Import ImportBody11
		churchillModel[8].setRotationPoint(36F, -22F, 6F);

		churchillModel[9].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import ImportBody12
		churchillModel[9].setRotationPoint(39F, -21F, 8F);

		churchillModel[10].addBox(0F, 0F, 0F, 10, 1, 10, 0F); // Import ImportBody13
		churchillModel[10].setRotationPoint(26F, -24F, 5F);

		churchillModel[11].addBox(0F, 0F, -10F, 10, 1, 10, 0F); // Import ImportBody14
		churchillModel[11].setRotationPoint(26F, -24F, -5F);

		churchillModel[12].addBox(0F, 0F, 0F, 26, 10, 8, 0F); // Import ImportBody15
		churchillModel[12].setRotationPoint(-34F, -20F, 37F);

		churchillModel[13].addBox(0F, 0F, 0F, 26, 4, 8, 0F); // Import ImportBody16
		churchillModel[13].setRotationPoint(-34F, -10F, 35F);

		churchillModel[14].addBox(0F, 0F, 0F, 20, 3, 4, 0F); // Import ImportBody17
		churchillModel[14].setRotationPoint(-31F, -23F, 37F);

		churchillModel[15].addShapeBox(0F, 0F, -16F, 16, 5, 16, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBody19
		churchillModel[15].setRotationPoint(63F, -22F, -19F);

		churchillModel[16].addShapeBox(0F, 0F, -16F, 16, 11, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Import ImportBody20
		churchillModel[16].setRotationPoint(63F, -17F, -19F);

		churchillModel[17].addBox(0F, 0F, -18F, 4, 18, 18, 0F); // Import ImportBody21
		churchillModel[17].setRotationPoint(-54F, -22F, -19F);

		churchillModel[18].addShapeBox(-15F, 0F, 0F, 15, 14, 30, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F); // Import ImportBody23
		churchillModel[18].setRotationPoint(-53F, -25F, -15F);
		churchillModel[18].rotateAngleZ = -0.17453293F;

		churchillModel[19].addShapeBox(-14F, 0F, 0F, 15, 17, 30, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F); // Import ImportBody24
		churchillModel[19].setRotationPoint(-54F, -23F, -15F);

		churchillModel[20].addBox(0F, 0F, 0F, 7, 13, 4, 0F); // Import ImportBody25
		churchillModel[20].setRotationPoint(-75F, -23F, -15F);

		churchillModel[21].addBox(0F, 0F, 0F, 7, 13, 4, 0F); // Import ImportBody27
		churchillModel[21].setRotationPoint(-75F, -23F, 11F);

		churchillModel[22].addBox(0F, 0F, 0F, 3, 13, 4, 0F); // Import ImportBody28
		churchillModel[22].setRotationPoint(-78F, -23F, -15F);

		churchillModel[23].addBox(0F, 0F, 0F, 3, 13, 4, 0F); // Import ImportBody29
		churchillModel[23].setRotationPoint(-78F, -23F, 11F);

		churchillModel[24].addBox(0F, 0F, 0F, 3, 9, 22, 0F); // Import ImportBody30
		churchillModel[24].setRotationPoint(-71F, -21F, -11F);

		churchillModel[25].addBox(0F, 0F, 0F, 3, 9, 22, 0F); // Import ImportBody31
		churchillModel[25].setRotationPoint(-74F, -21F, -11F);

		churchillModel[26].addBox(0F, 0F, 0F, 3, 9, 22, 0F); // Import ImportBody32
		churchillModel[26].setRotationPoint(-77F, -21F, -11F);

		churchillModel[27].addBox(0F, 0F, 0F, 113, 7, 10, 0F); // Import ImportLeftTrack4
		churchillModel[27].setRotationPoint(-51F, -5F, 23F);

		churchillModel[28].addBox(0F, 0F, -8F, 26, 10, 8, 0F); // Import ImportBody33
		churchillModel[28].setRotationPoint(-34F, -20F, -35F);

		churchillModel[29].addBox(0F, 0F, -8F, 26, 4, 8, 0F); // Import ImportBody34
		churchillModel[29].setRotationPoint(-34F, -10F, -35F);

		churchillModel[30].addBox(0F, 0F, -4F, 20, 3, 4, 0F); // Import ImportBody35
		churchillModel[30].setRotationPoint(-31F, -23F, -37F);

		churchillModel[31].addBox(0F, 0F, -10F, 113, 7, 10, 0F); // Import ImportRightTrack4
		churchillModel[31].setRotationPoint(-51F, -5F, -23F);

		churchillModel[32].addShapeBox(0F, 0F, -14F, 9, 3, 14, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportRightTrack5
		churchillModel[32].setRotationPoint(-53F, -4F, -20F);

		churchillModel[33].addBox(0F, 0F, -14F, 9, 3, 14, 0F); // Import ImportRightTrack6
		churchillModel[33].setRotationPoint(-53F, -1F, -20F);

		churchillModel[34].addShapeBox(0F, 0F, -14F, 9, 3, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import ImportRightTrack7
		churchillModel[34].setRotationPoint(-53F, 2F, -20F);

		churchillModel[35].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportRightTrack8
		churchillModel[35].setRotationPoint(-42F, -2F, -20F);

		churchillModel[36].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // Import ImportRightTrack9
		churchillModel[36].setRotationPoint(-42F, 2F, -20F);

		churchillModel[37].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportRightTrack10
		churchillModel[37].setRotationPoint(-42F, 6F, -20F);

		churchillModel[38].addShapeBox(0F, 0F, -16F, 16, 5, 16, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		churchillModel[38].setRotationPoint(63F, -22F, 35F);

		churchillModel[39].addShapeBox(0F, 0F, -16F, 16, 11, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		churchillModel[39].setRotationPoint(63F, -17F, 35F);

		churchillModel[40].addShapeBox(0F, 0F, 0F, 16, 19, 16, 0F, -3F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box56
		churchillModel[40].setRotationPoint(-70F, -22F, -35F);

		churchillModel[41].addBox(0F, 0F, -14F, 9, 3, 14, 0F); // Import Box57
		churchillModel[41].setRotationPoint(56F, -1F, -20F);

		churchillModel[42].addShapeBox(0F, 0F, -14F, 9, 3, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box58
		churchillModel[42].setRotationPoint(56F, 2F, -20F);

		churchillModel[43].addShapeBox(0F, 0F, -14F, 9, 3, 14, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box59
		churchillModel[43].setRotationPoint(56F, -4F, -20F);

		churchillModel[44].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box60
		churchillModel[44].setRotationPoint(-28F, -2F, -20F);

		churchillModel[45].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // Import Box61
		churchillModel[45].setRotationPoint(-28F, 2F, -20F);

		churchillModel[46].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box62
		churchillModel[46].setRotationPoint(-28F, 6F, -20F);

		churchillModel[47].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box63
		churchillModel[47].setRotationPoint(0F, -2F, -20F);

		churchillModel[48].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // Import Box64
		churchillModel[48].setRotationPoint(0F, 2F, -20F);

		churchillModel[49].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box65
		churchillModel[49].setRotationPoint(0F, 6F, -20F);

		churchillModel[50].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box69
		churchillModel[50].setRotationPoint(-14F, -2F, -20F);

		churchillModel[51].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // Import Box70
		churchillModel[51].setRotationPoint(-14F, 2F, -20F);

		churchillModel[52].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box71
		churchillModel[52].setRotationPoint(-14F, 6F, -20F);

		churchillModel[53].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box72
		churchillModel[53].setRotationPoint(14F, -2F, -20F);

		churchillModel[54].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // Import Box73
		churchillModel[54].setRotationPoint(14F, 2F, -20F);

		churchillModel[55].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box74
		churchillModel[55].setRotationPoint(14F, 6F, -20F);

		churchillModel[56].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box78
		churchillModel[56].setRotationPoint(42F, 6F, -20F);

		churchillModel[57].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // Import Box79
		churchillModel[57].setRotationPoint(42F, 2F, -20F);

		churchillModel[58].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box80
		churchillModel[58].setRotationPoint(42F, -2F, -20F);

		churchillModel[59].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		churchillModel[59].setRotationPoint(28F, -2F, -20F);

		churchillModel[60].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // Import Box1
		churchillModel[60].setRotationPoint(28F, 2F, -20F);

		churchillModel[61].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box2
		churchillModel[61].setRotationPoint(28F, 6F, -20F);

		churchillModel[62].addShapeBox(0F, 0F, -14F, 9, 3, 14, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box6
		churchillModel[62].setRotationPoint(56F, -4F, 34F);

		churchillModel[63].addBox(0F, 0F, -14F, 9, 3, 14, 0F); // Import Box7
		churchillModel[63].setRotationPoint(56F, -1F, 34F);

		churchillModel[64].addShapeBox(0F, 0F, -14F, 9, 3, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box8
		churchillModel[64].setRotationPoint(56F, 2F, 34F);

		churchillModel[65].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // Import Box9
		churchillModel[65].setRotationPoint(42F, 2F, 34F);

		churchillModel[66].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box10
		churchillModel[66].setRotationPoint(42F, -2F, 34F);

		churchillModel[67].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box11
		churchillModel[67].setRotationPoint(42F, 6F, 34F);

		churchillModel[68].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box12
		churchillModel[68].setRotationPoint(28F, 6F, 34F);

		churchillModel[69].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // Import Box13
		churchillModel[69].setRotationPoint(28F, 2F, 34F);

		churchillModel[70].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box14
		churchillModel[70].setRotationPoint(28F, -2F, 34F);

		churchillModel[71].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		churchillModel[71].setRotationPoint(14F, -2F, 34F);

		churchillModel[72].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // Import Box16
		churchillModel[72].setRotationPoint(14F, 2F, 34F);

		churchillModel[73].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box17
		churchillModel[73].setRotationPoint(14F, 6F, 34F);

		churchillModel[74].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box18
		churchillModel[74].setRotationPoint(0F, 6F, 34F);

		churchillModel[75].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // Import Box19
		churchillModel[75].setRotationPoint(0F, 2F, 34F);

		churchillModel[76].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box20
		churchillModel[76].setRotationPoint(0F, -2F, 34F);

		churchillModel[77].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box21
		churchillModel[77].setRotationPoint(-14F, -2F, 34F);

		churchillModel[78].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // Import Box22
		churchillModel[78].setRotationPoint(-14F, 2F, 34F);

		churchillModel[79].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box23
		churchillModel[79].setRotationPoint(-14F, 6F, 34F);

		churchillModel[80].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box24
		churchillModel[80].setRotationPoint(-28F, 6F, 34F);

		churchillModel[81].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // Import Box25
		churchillModel[81].setRotationPoint(-28F, 2F, 34F);

		churchillModel[82].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box26
		churchillModel[82].setRotationPoint(-28F, -2F, 34F);

		churchillModel[83].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box27
		churchillModel[83].setRotationPoint(-42F, -2F, 34F);

		churchillModel[84].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // Import Box28
		churchillModel[84].setRotationPoint(-42F, 2F, 34F);

		churchillModel[85].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box29
		churchillModel[85].setRotationPoint(-42F, 6F, 34F);

		churchillModel[86].addBox(0F, 0F, -14F, 9, 3, 14, 0F); // Import Box30
		churchillModel[86].setRotationPoint(-53F, -1F, 34F);

		churchillModel[87].addShapeBox(0F, 0F, -14F, 9, 3, 14, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		churchillModel[87].setRotationPoint(-53F, -4F, 34F);

		churchillModel[88].addShapeBox(0F, 0F, -14F, 9, 3, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box32
		churchillModel[88].setRotationPoint(-53F, 2F, 34F);

		churchillModel[89].addShapeBox(0F, 0F, 0F, 113, 18, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Import Box111
		churchillModel[89].setRotationPoint(-50F, -22F, -37F);

		churchillModel[90].addShapeBox(0F, 0F, 0F, 25, 16, 32, 0F, -13F, 0F, 5F, 0F, -2F, -2F, 0F, -2F, -2F, -13F, 0F, 5F, -13F, 0F, 5F, 0F, 0F, -2F, 0F, 0F, -2F, -13F, 0F, 5F); // Import ImportTurret1
		churchillModel[90].setRotationPoint(-8F, -39F, -16F);

		churchillModel[91].addShapeBox(-26F, -39F, -16F, 18, 16, 32, 0F, 2F, 0F, -6F, 0F, 0F, 5F, 0F, 0F, 5F, 2F, 0F, -6F, 2F, -2F, -8F, 0F, 0F, 5F, 0F, 0F, 5F, 2F, -2F, -8F); // Import ImportTurret2
		churchillModel[91].setRotationPoint(0F, 0F, 0F);

		churchillModel[92].addShapeBox(-36F, -39F, -8F, 8, 8, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import ImportTurret3
		churchillModel[92].setRotationPoint(0F, 0F, 0F);

		churchillModel[93].addBox(-16F, -40F, 0F, 12, 1, 12, 0F); // Import ImportTurret4
		churchillModel[93].setRotationPoint(0F, 0F, 0F);

		churchillModel[94].addShapeBox(0F, -6F, -10F, 4, 12, 20, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F); // Import ImportTurret5
		churchillModel[94].setRotationPoint(17F, -30F, 0F);

		churchillModel[95].addShapeBox(-11F, -39F, -16F, 18, 16, 32, 0F, -3F, 0F, 5F, -2F, 0F, 5F, -2F, 0F, 5F, -3F, 0F, 5F, -3F, 0F, 5F, -2F, 0F, 5F, -2F, 0F, 5F, -3F, 0F, 5F); // Import Box0
		churchillModel[95].setRotationPoint(0F, 0F, 0F);

		churchillModel[96].addShapeBox(-3F, -38F, -3F, 25, 16, 32, 0F, 0F, -2.5F, -10F, 0F, -2.5F, -10F, 0F, -2.5F, -15F, 0F, -2.5F, -15F, 0F, -2.5F, -10F, 0F, -2.5F, -10F, 0F, -2.5F, -15F, 0F, -2.5F, -15F); // Import Box106
		churchillModel[96].setRotationPoint(0F, 0F, 0F);

		churchillModel[97].addShapeBox(-3F, -38F, -24F, 25, 16, 32, 0F, 0F, -2.5F, -10F, 0F, -2.5F, -10F, 0F, -2.5F, -15F, 0F, -2.5F, -15F, 0F, -2.5F, -10F, 0F, -2.5F, -10F, 0F, -2.5F, -15F, 0F, -2.5F, -15F); // Import Box110
		churchillModel[97].setRotationPoint(0F, 0F, 0F);

		churchillModel[98].addShapeBox(-14F, -39.3F, -21F, 12, 1, 12, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F); // Import Box110
		churchillModel[98].setRotationPoint(0F, 0F, 0F);
		churchillModel[98].rotateAngleY = 0.52359878F;

		churchillModel[99].addShapeBox(21F, -32F, 4F, 7, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box111
		churchillModel[99].setRotationPoint(0F, 0F, 0F);

		churchillModel[100].addShapeBox(17F, -36.5F, -14F, 5, 1, 28, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box114
		churchillModel[100].setRotationPoint(0F, 0F, 0F);

		churchillModel[101].addShapeBox(17F, -24.5F, -14F, 5, 1, 28, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box115
		churchillModel[101].setRotationPoint(0F, 0F, 0F);

		churchillModel[102].addBox(0F, -4F, -5F, 7, 8, 8, 0F); // Import ImportBarrel1
		churchillModel[102].setRotationPoint(17F, -30F, 0F);

		churchillModel[103].addShapeBox(7F, -2F, -3F, 38, 4, 4, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F); // Import ImportBarrel2
		churchillModel[103].setRotationPoint(17F, -30F, 0F);

		churchillModel[104].addShapeBox(45F, -2F, -3.5F, 9, 5, 5, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F); // Import ImportBarrel3
		churchillModel[104].setRotationPoint(17F, -30.5F, 0F);

		churchillModel[105].addBox(-2F, 0F, -14F, 2, 25, 14, 0F); // Import ImportRightTrack1
		churchillModel[105].setRotationPoint(76F, -8F, -20F);
		churchillModel[105].rotateAngleZ = 0.66322512F;

		churchillModel[106].addBox(-2F, 0F, -14F, 105, 2, 14, 0F); // Import ImportRightTrack2
		churchillModel[106].setRotationPoint(-42F, 10F, -20F);

		churchillModel[107].addBox(-28F, -2F, -14F, 28, 2, 14, 0F); // Import ImportRightTrack3
		churchillModel[107].setRotationPoint(-44F, 12F, -20F);
		churchillModel[107].rotateAngleZ = 0.66322512F;

		churchillModel[108].addBox(-2F, 0F, 0F, 2, 25, 14, 0F); // Import ImportLeftTrack1
		churchillModel[108].setRotationPoint(76F, -8F, 20F);
		churchillModel[108].rotateAngleZ = 0.66322512F;

		churchillModel[109].addBox(-2F, 0F, 0F, 105, 2, 14, 0F); // Import ImportLeftTrack2
		churchillModel[109].setRotationPoint(-42F, 10F, 20F);

		churchillModel[110].addBox(-28F, -2F, 0F, 28, 2, 14, 0F); // Import ImportLeftTrack3
		churchillModel[110].setRotationPoint(-44F, 12F, 20F);
		churchillModel[110].rotateAngleZ = 0.66322512F;


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 111; i++)
		{
			churchillModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo churchillModel[];
}