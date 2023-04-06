//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ConcentratedFlak
// Model Creator:
// Created on:09.07.2018 - 12:11:03
// Last changed on: 09.07.2018 - 12:11:03

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelConcentratedFlak extends ModelBase
{
	int textureX = 32;
	int textureY = 32;

	public ModelConcentratedFlak()
	{
		concentratedflakModel = new ModelRendererTurbo[72];
		concentratedflakModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportImportBox2
		concentratedflakModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import ImportImportBox8
		concentratedflakModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import ImportImportBox9
		concentratedflakModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import ImportImportBox10
		concentratedflakModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportImportBox11
		concentratedflakModel[5] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Import ImportImportBox12
		concentratedflakModel[6] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import ImportImportBox13
		concentratedflakModel[7] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Import ImportImportBox14
		concentratedflakModel[8] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 0
		concentratedflakModel[9] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		concentratedflakModel[10] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		concentratedflakModel[11] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 3
		concentratedflakModel[12] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 4
		concentratedflakModel[13] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 5
		concentratedflakModel[14] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 6
		concentratedflakModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
		concentratedflakModel[16] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 8
		concentratedflakModel[17] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 9
		concentratedflakModel[18] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 10
		concentratedflakModel[19] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 11
		concentratedflakModel[20] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 12
		concentratedflakModel[21] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 13
		concentratedflakModel[22] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 14
		concentratedflakModel[23] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		concentratedflakModel[24] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 16
		concentratedflakModel[25] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 17
		concentratedflakModel[26] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 18
		concentratedflakModel[27] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 19
		concentratedflakModel[28] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 20
		concentratedflakModel[29] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 21
		concentratedflakModel[30] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 22
		concentratedflakModel[31] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 23
		concentratedflakModel[32] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 24
		concentratedflakModel[33] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 25
		concentratedflakModel[34] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 26
		concentratedflakModel[35] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 27
		concentratedflakModel[36] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 28
		concentratedflakModel[37] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 29
		concentratedflakModel[38] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 30
		concentratedflakModel[39] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 31
		concentratedflakModel[40] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 32
		concentratedflakModel[41] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 33
		concentratedflakModel[42] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 34
		concentratedflakModel[43] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 35
		concentratedflakModel[44] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 36
		concentratedflakModel[45] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 37
		concentratedflakModel[46] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 38
		concentratedflakModel[47] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 39
		concentratedflakModel[48] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 40
		concentratedflakModel[49] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 41
		concentratedflakModel[50] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 42
		concentratedflakModel[51] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 43
		concentratedflakModel[52] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 44
		concentratedflakModel[53] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 45
		concentratedflakModel[54] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 46
		concentratedflakModel[55] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47
		concentratedflakModel[56] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 48
		concentratedflakModel[57] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 49
		concentratedflakModel[58] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 50
		concentratedflakModel[59] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 51
		concentratedflakModel[60] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 52
		concentratedflakModel[61] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 53
		concentratedflakModel[62] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 54
		concentratedflakModel[63] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 55
		concentratedflakModel[64] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 56
		concentratedflakModel[65] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 57
		concentratedflakModel[66] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 58
		concentratedflakModel[67] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 59
		concentratedflakModel[68] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 60
		concentratedflakModel[69] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 61
		concentratedflakModel[70] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 62
		concentratedflakModel[71] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 63

		concentratedflakModel[0].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportImportBox2
		concentratedflakModel[0].setRotationPoint(-1.03F, -3.01F, -25F);

		concentratedflakModel[1].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F); // Import ImportImportBox8
		concentratedflakModel[1].setRotationPoint(-1.03F, -3.01F, -23.94F);

		concentratedflakModel[2].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F); // Import ImportImportBox9
		concentratedflakModel[2].setRotationPoint(0.03F, -3.01F, -23.94F);

		concentratedflakModel[3].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox10
		concentratedflakModel[3].setRotationPoint(0.03F, -3.01F, -25F);

		concentratedflakModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox11
		concentratedflakModel[4].setRotationPoint(0.03F, 4.03F, -25F);

		concentratedflakModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Import ImportImportBox12
		concentratedflakModel[5].setRotationPoint(0.03F, 4.03F, -23.94F);

		concentratedflakModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Import ImportImportBox13
		concentratedflakModel[6].setRotationPoint(-1.03F, 4.03F, -23.94F);

		concentratedflakModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportBox14
		concentratedflakModel[7].setRotationPoint(-1.03F, 4.03F, -25F);

		concentratedflakModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 0
		concentratedflakModel[8].setRotationPoint(2.97F, 18.03F, 4.03F);

		concentratedflakModel[9].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F); // Box 1
		concentratedflakModel[9].setRotationPoint(2.97F, 10.99F, 4.03F);

		concentratedflakModel[10].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F); // Box 2
		concentratedflakModel[10].setRotationPoint(4.03F, 10.99F, 4.03F);

		concentratedflakModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 3
		concentratedflakModel[11].setRotationPoint(4.03F, 18.03F, 4.03F);

		concentratedflakModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 4
		concentratedflakModel[12].setRotationPoint(2.97F, 18.03F, 2.97F);

		concentratedflakModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 5
		concentratedflakModel[13].setRotationPoint(4.03F, 18.03F, 2.97F);

		concentratedflakModel[14].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 6
		concentratedflakModel[14].setRotationPoint(4.03F, 10.99F, 2.97F);

		concentratedflakModel[15].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 7
		concentratedflakModel[15].setRotationPoint(2.97F, 10.99F, 2.97F);

		concentratedflakModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 8
		concentratedflakModel[16].setRotationPoint(-3.03F, -34.97F, 8.03F);

		concentratedflakModel[17].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F); // Box 9
		concentratedflakModel[17].setRotationPoint(-3.03F, -42.01F, 8.03F);

		concentratedflakModel[18].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F); // Box 10
		concentratedflakModel[18].setRotationPoint(-1.97F, -42.01F, 8.03F);

		concentratedflakModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 11
		concentratedflakModel[19].setRotationPoint(-1.97F, -34.97F, 8.03F);

		concentratedflakModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 12
		concentratedflakModel[20].setRotationPoint(-3.03F, -34.97F, 6.97F);

		concentratedflakModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 13
		concentratedflakModel[21].setRotationPoint(-1.97F, -34.97F, 6.97F);

		concentratedflakModel[22].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 14
		concentratedflakModel[22].setRotationPoint(-1.97F, -42.01F, 6.97F);

		concentratedflakModel[23].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 15
		concentratedflakModel[23].setRotationPoint(-3.03F, -42.01F, 6.97F);

		concentratedflakModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 16
		concentratedflakModel[24].setRotationPoint(7.97F, -27.96F, -15F);

		concentratedflakModel[25].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F); // Box 17
		concentratedflakModel[25].setRotationPoint(7.97F, -35F, -15F);

		concentratedflakModel[26].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F); // Box 18
		concentratedflakModel[26].setRotationPoint(9.03F, -35F, -15F);

		concentratedflakModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 19
		concentratedflakModel[27].setRotationPoint(9.03F, -27.96F, -15F);

		concentratedflakModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 20
		concentratedflakModel[28].setRotationPoint(7.97F, -27.96F, -16.06F);

		concentratedflakModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 21
		concentratedflakModel[29].setRotationPoint(9.03F, -27.96F, -16.06F);

		concentratedflakModel[30].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 22
		concentratedflakModel[30].setRotationPoint(9.03F, -35F, -16.06F);

		concentratedflakModel[31].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 23
		concentratedflakModel[31].setRotationPoint(7.97F, -35F, -16.06F);

		concentratedflakModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 24
		concentratedflakModel[32].setRotationPoint(-14F, 11.04F, 11.06F);

		concentratedflakModel[33].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F); // Box 25
		concentratedflakModel[33].setRotationPoint(-14F, 4F, 11.06F);

		concentratedflakModel[34].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F); // Box 26
		concentratedflakModel[34].setRotationPoint(-12.94F, 4F, 11.06F);

		concentratedflakModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 27
		concentratedflakModel[35].setRotationPoint(-12.94F, 11.04F, 11.06F);

		concentratedflakModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 28
		concentratedflakModel[36].setRotationPoint(-14F, 11.04F, 10F);

		concentratedflakModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 29
		concentratedflakModel[37].setRotationPoint(-12.94F, 11.04F, 10F);

		concentratedflakModel[38].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 30
		concentratedflakModel[38].setRotationPoint(-12.94F, 4F, 10F);

		concentratedflakModel[39].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 31
		concentratedflakModel[39].setRotationPoint(-14F, 4F, 10F);

		concentratedflakModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 32
		concentratedflakModel[40].setRotationPoint(-11.03F, 0.03F, -0.97F);

		concentratedflakModel[41].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F); // Box 33
		concentratedflakModel[41].setRotationPoint(-11.03F, -7.01F, -0.97F);

		concentratedflakModel[42].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F); // Box 34
		concentratedflakModel[42].setRotationPoint(-9.97F, -7.01F, -0.97F);

		concentratedflakModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 35
		concentratedflakModel[43].setRotationPoint(-9.97F, 0.03F, -0.97F);

		concentratedflakModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 36
		concentratedflakModel[44].setRotationPoint(-11.03F, 0.03F, -2.03F);

		concentratedflakModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 37
		concentratedflakModel[45].setRotationPoint(-9.97F, 0.03F, -2.03F);

		concentratedflakModel[46].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 38
		concentratedflakModel[46].setRotationPoint(-9.97F, -7.01F, -2.03F);

		concentratedflakModel[47].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 39
		concentratedflakModel[47].setRotationPoint(-11.03F, -7.01F, -2.03F);

		concentratedflakModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 40
		concentratedflakModel[48].setRotationPoint(-19.06F, 28.04F, -9.97F);

		concentratedflakModel[49].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F); // Box 41
		concentratedflakModel[49].setRotationPoint(-19.06F, 21F, -9.97F);

		concentratedflakModel[50].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F); // Box 42
		concentratedflakModel[50].setRotationPoint(-18F, 21F, -9.97F);

		concentratedflakModel[51].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 43
		concentratedflakModel[51].setRotationPoint(-18F, 28.04F, -9.97F);

		concentratedflakModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 44
		concentratedflakModel[52].setRotationPoint(-19.06F, 28.04F, -11.03F);

		concentratedflakModel[53].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 45
		concentratedflakModel[53].setRotationPoint(-18F, 28.04F, -11.03F);

		concentratedflakModel[54].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 46
		concentratedflakModel[54].setRotationPoint(-18F, 21F, -11.03F);

		concentratedflakModel[55].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 47
		concentratedflakModel[55].setRotationPoint(-19.06F, 21F, -11.03F);

		concentratedflakModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 48
		concentratedflakModel[56].setRotationPoint(13.94F, -12.96F, 13.06F);

		concentratedflakModel[57].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F); // Box 49
		concentratedflakModel[57].setRotationPoint(13.94F, -20F, 13.06F);

		concentratedflakModel[58].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F); // Box 50
		concentratedflakModel[58].setRotationPoint(15F, -20F, 13.06F);

		concentratedflakModel[59].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 51
		concentratedflakModel[59].setRotationPoint(15F, -12.96F, 13.06F);

		concentratedflakModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 52
		concentratedflakModel[60].setRotationPoint(13.94F, -12.96F, 12F);

		concentratedflakModel[61].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 53
		concentratedflakModel[61].setRotationPoint(15F, -12.96F, 12F);

		concentratedflakModel[62].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 54
		concentratedflakModel[62].setRotationPoint(15F, -20F, 12F);

		concentratedflakModel[63].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 55
		concentratedflakModel[63].setRotationPoint(13.94F, -20F, 12F);

		concentratedflakModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 56
		concentratedflakModel[64].setRotationPoint(-21.06F, -5.97F, -23.94F);

		concentratedflakModel[65].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F); // Box 57
		concentratedflakModel[65].setRotationPoint(-21.06F, -13.01F, -23.94F);

		concentratedflakModel[66].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F); // Box 58
		concentratedflakModel[66].setRotationPoint(-20F, -13.01F, -23.94F);

		concentratedflakModel[67].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 59
		concentratedflakModel[67].setRotationPoint(-20F, -5.97F, -23.94F);

		concentratedflakModel[68].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 60
		concentratedflakModel[68].setRotationPoint(-21.06F, -5.97F, -25F);

		concentratedflakModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 61
		concentratedflakModel[69].setRotationPoint(-20F, -5.97F, -25F);

		concentratedflakModel[70].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 62
		concentratedflakModel[70].setRotationPoint(-20F, -13.01F, -25F);

		concentratedflakModel[71].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 63
		concentratedflakModel[71].setRotationPoint(-21.06F, -13.01F, -25F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 72; i++)
		{
			concentratedflakModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo concentratedflakModel[];
}