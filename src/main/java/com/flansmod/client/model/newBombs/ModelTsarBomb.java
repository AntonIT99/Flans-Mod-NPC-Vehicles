//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:31.07.2018 - 02:11:37
// Last changed on: 31.07.2018 - 02:11:37

package com.flansmod.client.model.newBombs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTsarBomb extends ModelBase
{
	int textureX = 1024;
	int textureY = 512;

	public ModelTsarBomb()
	{
		tsarbombModel = new ModelRendererTurbo[68];
		tsarbombModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		tsarbombModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 1
		tsarbombModel[2] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 2
		tsarbombModel[3] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 3
		tsarbombModel[4] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 4
		tsarbombModel[5] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 5
		tsarbombModel[6] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 6
		tsarbombModel[7] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 7
		tsarbombModel[8] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Box 8
		tsarbombModel[9] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 9
		tsarbombModel[10] = new ModelRendererTurbo(this, 937, 49, textureX, textureY); // Box 10
		tsarbombModel[11] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 11
		tsarbombModel[12] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 12
		tsarbombModel[13] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 13
		tsarbombModel[14] = new ModelRendererTurbo(this, 529, 65, textureX, textureY); // Box 14
		tsarbombModel[15] = new ModelRendererTurbo(this, 633, 65, textureX, textureY); // Box 21
		tsarbombModel[16] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 24
		tsarbombModel[17] = new ModelRendererTurbo(this, 761, 65, textureX, textureY); // Box 26
		tsarbombModel[18] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 27
		tsarbombModel[19] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 28
		tsarbombModel[20] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Box 29
		tsarbombModel[21] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 30
		tsarbombModel[22] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 31
		tsarbombModel[23] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 32
		tsarbombModel[24] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 33
		tsarbombModel[25] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 34
		tsarbombModel[26] = new ModelRendererTurbo(this, 521, 113, textureX, textureY); // Box 35
		tsarbombModel[27] = new ModelRendererTurbo(this, 729, 113, textureX, textureY); // Box 37
		tsarbombModel[28] = new ModelRendererTurbo(this, 593, 121, textureX, textureY); // Box 38
		tsarbombModel[29] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 39
		tsarbombModel[30] = new ModelRendererTurbo(this, 905, 121, textureX, textureY); // Box 48
		tsarbombModel[31] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 49
		tsarbombModel[32] = new ModelRendererTurbo(this, 153, 153, textureX, textureY); // Box 50
		tsarbombModel[33] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Box 51
		tsarbombModel[34] = new ModelRendererTurbo(this, 817, 233, textureX, textureY); // Box 52
		tsarbombModel[35] = new ModelRendererTurbo(this, 425, 241, textureX, textureY); // Box 53
		tsarbombModel[36] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 54
		tsarbombModel[37] = new ModelRendererTurbo(this, 73, 249, textureX, textureY); // Box 55
		tsarbombModel[38] = new ModelRendererTurbo(this, 689, 233, textureX, textureY); // Box 56
		tsarbombModel[39] = new ModelRendererTurbo(this, 529, 249, textureX, textureY); // Box 57
		tsarbombModel[40] = new ModelRendererTurbo(this, 833, 137, textureX, textureY); // Box 58
		tsarbombModel[41] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 59
		tsarbombModel[42] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Box 60
		tsarbombModel[43] = new ModelRendererTurbo(this, 921, 249, textureX, textureY); // Box 61
		tsarbombModel[44] = new ModelRendererTurbo(this, 761, 249, textureX, textureY); // Box 62
		tsarbombModel[45] = new ModelRendererTurbo(this, 345, 257, textureX, textureY); // Box 63
		tsarbombModel[46] = new ModelRendererTurbo(this, 609, 257, textureX, textureY); // Box 64
		tsarbombModel[47] = new ModelRendererTurbo(this, 145, 281, textureX, textureY); // Box 65
		tsarbombModel[48] = new ModelRendererTurbo(this, 201, 289, textureX, textureY); // Box 66
		tsarbombModel[49] = new ModelRendererTurbo(this, 249, 305, textureX, textureY); // Box 68
		tsarbombModel[50] = new ModelRendererTurbo(this, 297, 305, textureX, textureY); // Box 69
		tsarbombModel[51] = new ModelRendererTurbo(this, 761, 321, textureX, textureY); // Box 70
		tsarbombModel[52] = new ModelRendererTurbo(this, 529, 329, textureX, textureY); // Box 71
		tsarbombModel[53] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Box 72
		tsarbombModel[54] = new ModelRendererTurbo(this, 809, 361, textureX, textureY); // Box 73
		tsarbombModel[55] = new ModelRendererTurbo(this, 313, 337, textureX, textureY); // Box 74
		tsarbombModel[56] = new ModelRendererTurbo(this, 929, 321, textureX, textureY); // Box 75
		tsarbombModel[57] = new ModelRendererTurbo(this, 129, 353, textureX, textureY); // Box 76
		tsarbombModel[58] = new ModelRendererTurbo(this, 617, 353, textureX, textureY); // Box 77
		tsarbombModel[59] = new ModelRendererTurbo(this, 193, 369, textureX, textureY); // Box 78
		tsarbombModel[60] = new ModelRendererTurbo(this, 441, 369, textureX, textureY); // Box 79
		tsarbombModel[61] = new ModelRendererTurbo(this, 713, 385, textureX, textureY); // Box 80
		tsarbombModel[62] = new ModelRendererTurbo(this, 537, 385, textureX, textureY); // Box 81
		tsarbombModel[63] = new ModelRendererTurbo(this, 257, 385, textureX, textureY); // Box 82
		tsarbombModel[64] = new ModelRendererTurbo(this, 929, 385, textureX, textureY); // Box 83
		tsarbombModel[65] = new ModelRendererTurbo(this, 121, 401, textureX, textureY); // Box 84
		tsarbombModel[66] = new ModelRendererTurbo(this, 577, 393, textureX, textureY); // Box 85
		tsarbombModel[67] = new ModelRendererTurbo(this, 289, 401, textureX, textureY); // Box 86

		tsarbombModel[0].addShapeBox(0F, 0F, 0F, 30, 40, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		tsarbombModel[0].setRotationPoint(15F, -67F, 15F);

		tsarbombModel[1].addShapeBox(0F, 0F, 0F, 30, 40, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		tsarbombModel[1].setRotationPoint(15F, -67F, 45F);

		tsarbombModel[2].addShapeBox(0F, 0F, 0F, 30, 40, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		tsarbombModel[2].setRotationPoint(15F, -67F, -5F);

		tsarbombModel[3].addShapeBox(0F, 0F, 0F, 20, 40, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		tsarbombModel[3].setRotationPoint(45F, -67F, 15F);

		tsarbombModel[4].addShapeBox(0F, 0F, 0F, 20, 40, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		tsarbombModel[4].setRotationPoint(-5F, -67F, 15F);

		tsarbombModel[5].addShapeBox(0F, 0F, 0F, 20, 40, 20, 0F, -8F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		tsarbombModel[5].setRotationPoint(-5F, -67F, -5F);

		tsarbombModel[6].addShapeBox(0F, 0F, 0F, 20, 40, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -8F); // Box 6
		tsarbombModel[6].setRotationPoint(-5F, -67F, 45F);

		tsarbombModel[7].addShapeBox(0F, 0F, 0F, 20, 40, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -8F, 0F, 0F, 0F); // Box 7
		tsarbombModel[7].setRotationPoint(45F, -67F, 45F);

		tsarbombModel[8].addShapeBox(0F, 0F, 0F, 20, 40, 20, 0F, 0F, 0F, 0F, -8F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		tsarbombModel[8].setRotationPoint(45F, -67F, -5F);

		tsarbombModel[9].addShapeBox(0F, 0F, 0F, 3, 40, 30, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Box 9
		tsarbombModel[9].setRotationPoint(-8F, -67F, 15F);

		tsarbombModel[10].addShapeBox(0F, 0F, 0F, 3, 40, 30, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 10
		tsarbombModel[10].setRotationPoint(65F, -67F, 15F);

		tsarbombModel[11].addShapeBox(0F, 0F, 0F, 30, 40, 3, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		tsarbombModel[11].setRotationPoint(15F, -67F, -8F);

		tsarbombModel[12].addShapeBox(0F, 0F, 0F, 30, 40, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Box 12
		tsarbombModel[12].setRotationPoint(15F, -67F, 65F);

		tsarbombModel[13].addShapeBox(0F, 0F, 0F, 30, 24, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, -10F, 0F, -6F, -10F, 0F, -6F); // Box 13
		tsarbombModel[13].setRotationPoint(15F, -27F, 65F);

		tsarbombModel[14].addShapeBox(0F, 0F, 0F, 30, 24, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 14
		tsarbombModel[14].setRotationPoint(15F, -27F, 45F);

		tsarbombModel[15].addShapeBox(0F, 0F, 0F, 30, 24, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		tsarbombModel[15].setRotationPoint(15F, -27F, 15F);

		tsarbombModel[16].addShapeBox(0F, 0F, 0F, 20, 24, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -12F, 0F, -12F, 0F, 0F, -6F); // Box 24
		tsarbombModel[16].setRotationPoint(45F, -27F, 45F);

		tsarbombModel[17].addShapeBox(0F, 0F, 0F, 20, 24, 20, 0F, 0F, 0F, 0F, -8F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -12F, 0F, -12F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 26
		tsarbombModel[17].setRotationPoint(45F, -27F, -5F);

		tsarbombModel[18].addShapeBox(0F, 0F, 0F, 30, 24, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		tsarbombModel[18].setRotationPoint(15F, -27F, -5F);

		tsarbombModel[19].addShapeBox(0F, 0F, 0F, 20, 24, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 28
		tsarbombModel[19].setRotationPoint(45F, -27F, 15F);

		tsarbombModel[20].addShapeBox(0F, 0F, 0F, 20, 24, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 29
		tsarbombModel[20].setRotationPoint(-5F, -27F, 15F);

		tsarbombModel[21].addShapeBox(0F, 0F, 0F, 20, 24, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -8F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -12F, 0F, -12F); // Box 30
		tsarbombModel[21].setRotationPoint(-5F, -27F, 45F);

		tsarbombModel[22].addShapeBox(0F, 0F, 0F, 20, 24, 20, 0F, -8F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -12F, 0F, 0F, -6F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 31
		tsarbombModel[22].setRotationPoint(-5F, -27F, -5F);

		tsarbombModel[23].addShapeBox(0F, 0F, 0F, 30, 24, 3, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -6F, -10F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 32
		tsarbombModel[23].setRotationPoint(15F, -27F, -8F);

		tsarbombModel[24].addShapeBox(0F, 0F, 0F, 3, 24, 30, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, -10F, -6F, 0F, -10F, 6F, 0F, 0F); // Box 33
		tsarbombModel[24].setRotationPoint(65F, -27F, 15F);

		tsarbombModel[25].addShapeBox(0F, 0F, 0F, 3, 24, 30, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -6F, 0F, -10F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, -10F); // Box 34
		tsarbombModel[25].setRotationPoint(-8F, -27F, 15F);

		tsarbombModel[26].addShapeBox(0F, 0F, 0F, 3, 105, 30, 0F, -14F, 0F, -12F, 13F, 0F, -6F, 13F, 0F, -6F, -14F, 0F, -12F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Box 35
		tsarbombModel[26].setRotationPoint(-8F, -172F, 15F);

		tsarbombModel[27].addShapeBox(0F, 0F, 0F, 20, 105, 30, 0F, -13F, 0F, -6F, 6F, 0F, -6F, 6F, 0F, -6F, -13F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		tsarbombModel[27].setRotationPoint(-5F, -172F, 15F);

		tsarbombModel[28].addShapeBox(0F, 0F, 0F, 30, 105, 30, 0F, -6F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		tsarbombModel[28].setRotationPoint(15F, -172F, 15F);

		tsarbombModel[29].addShapeBox(0F, 0F, 0F, 20, 105, 20, 0F, -18F, 0F, -18F, 6F, 0F, -13F, 6F, 0F, 6F, -13F, 0F, 6F, -8F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		tsarbombModel[29].setRotationPoint(-5F, -172F, -5F);

		tsarbombModel[30].addShapeBox(0F, 0F, 0F, 20, 105, 20, 0F, -13F, 0F, 6F, 6F, 0F, 6F, 6F, 0F, -13F, -18F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -8F); // Box 48
		tsarbombModel[30].setRotationPoint(-5F, -172F, 45F);

		tsarbombModel[31].addShapeBox(0F, 0F, 0F, 20, 105, 20, 0F, 6F, 0F, 6F, -13F, 0F, 6F, -18F, 0F, -18F, 6F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -8F, 0F, 0F, 0F); // Box 49
		tsarbombModel[31].setRotationPoint(45F, -172F, 45F);

		tsarbombModel[32].addShapeBox(0F, 0F, 0F, 20, 105, 20, 0F, 6F, 0F, -13F, -18F, 0F, -18F, -13F, 0F, 6F, 6F, 0F, 6F, 0F, 0F, 0F, -8F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		tsarbombModel[32].setRotationPoint(45F, -172F, -5F);

		tsarbombModel[33].addShapeBox(0F, 0F, 0F, 20, 105, 30, 0F, 6F, 0F, -6F, -13F, 0F, -6F, -13F, 0F, -6F, 6F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		tsarbombModel[33].setRotationPoint(45F, -172F, 15F);

		tsarbombModel[34].addShapeBox(0F, 0F, 0F, 30, 105, 20, 0F, -6F, 0F, -13F, -6F, 0F, -13F, -6F, 0F, 6F, -6F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		tsarbombModel[34].setRotationPoint(15F, -172F, -5F);

		tsarbombModel[35].addShapeBox(0F, 0F, 0F, 30, 105, 20, 0F, -6F, 0F, 6F, -6F, 0F, 6F, -6F, 0F, -13F, -6F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		tsarbombModel[35].setRotationPoint(15F, -172F, 45F);

		tsarbombModel[36].addShapeBox(0F, 0F, 0F, 30, 105, 3, 0F, -12F, 0F, -14F, -12F, 0F, -14F, -6F, 0F, 13F, -6F, 0F, 13F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		tsarbombModel[36].setRotationPoint(15F, -172F, -8F);

		tsarbombModel[37].addShapeBox(0F, 0F, 0F, 30, 105, 3, 0F, -6F, 0F, 13F, -6F, 0F, 13F, -12F, 0F, -14F, -12F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Box 55
		tsarbombModel[37].setRotationPoint(15F, -172F, 65F);

		tsarbombModel[38].addShapeBox(0F, 0F, 0F, 3, 105, 30, 0F, 13F, 0F, -6F, -14F, 0F, -12F, -14F, 0F, -12F, 13F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 56
		tsarbombModel[38].setRotationPoint(65F, -172F, 15F);

		tsarbombModel[39].addShapeBox(0F, 0F, 0F, 18, 57, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		tsarbombModel[39].setRotationPoint(21F, -229F, 21F);

		tsarbombModel[40].addShapeBox(0F, 0F, 0F, 13, 57, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		tsarbombModel[40].setRotationPoint(39F, -229F, 21F);

		tsarbombModel[41].addShapeBox(0F, 0F, 0F, 18, 57, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		tsarbombModel[41].setRotationPoint(21F, -229F, 39F);

		tsarbombModel[42].addShapeBox(0F, 0F, 0F, 13, 57, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		tsarbombModel[42].setRotationPoint(8F, -229F, 21F);

		tsarbombModel[43].addShapeBox(0F, 0F, 0F, 18, 57, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		tsarbombModel[43].setRotationPoint(21F, -229F, 8F);

		tsarbombModel[44].addShapeBox(0F, 0F, 0F, 13, 57, 13, 0F, 0F, 0F, 0F, -5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		tsarbombModel[44].setRotationPoint(39F, -229F, 8F);

		tsarbombModel[45].addShapeBox(0F, 0F, 0F, 13, 57, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, 0F, 0F, 0F); // Box 63
		tsarbombModel[45].setRotationPoint(39F, -229F, 39F);

		tsarbombModel[46].addShapeBox(0F, 0F, 0F, 13, 57, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F); // Box 64
		tsarbombModel[46].setRotationPoint(8F, -229F, 39F);

		tsarbombModel[47].addShapeBox(0F, 0F, 0F, 13, 57, 13, 0F, -5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		tsarbombModel[47].setRotationPoint(8F, -229F, 8F);

		tsarbombModel[48].addShapeBox(0F, 0F, 0F, 2, 57, 18, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 66
		tsarbombModel[48].setRotationPoint(6F, -229F, 21F);

		tsarbombModel[49].addShapeBox(0F, 0F, 0F, 2, 57, 18, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 68
		tsarbombModel[49].setRotationPoint(52F, -229F, 21F);

		tsarbombModel[50].addShapeBox(0F, 0F, 0F, 18, 57, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 69
		tsarbombModel[50].setRotationPoint(21F, -229F, 52F);

		tsarbombModel[51].addShapeBox(0F, 0F, 0F, 18, 57, 2, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		tsarbombModel[51].setRotationPoint(21F, -229F, 6F);

		tsarbombModel[52].addShapeBox(0F, 0F, 0F, 56, 49, 2, 0F, -29F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -29F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		tsarbombModel[52].setRotationPoint(29.5F, -221F, 29.5F);

		tsarbombModel[53].addShapeBox(0F, 0F, 0F, 56, 49, 2, 0F, -29F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -29F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		tsarbombModel[53].setRotationPoint(29.5F, -221F, 29.5F);
		tsarbombModel[53].rotateAngleX = 0.01745329F;
		tsarbombModel[53].rotateAngleY = -2.23402144F;
		tsarbombModel[53].rotateAngleZ = 0.01745329F;

		tsarbombModel[54].addShapeBox(0F, 0F, 0F, 56, 49, 2, 0F, -29F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -29F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		tsarbombModel[54].setRotationPoint(29.5F, -221F, 29.5F);
		tsarbombModel[54].rotateAngleY = -4.10152374F;

		tsarbombModel[55].addShapeBox(0F, 0F, 0F, 30, 27, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F); // Box 74
		tsarbombModel[55].setRotationPoint(15F, -3F, 15F);

		tsarbombModel[56].addShapeBox(0F, 0F, 0F, 14, 27, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, -10F, 10F, 0F, -10F, 10F, 0F, -10F, -24F, 0F, -10F); // Box 75
		tsarbombModel[56].setRotationPoint(1F, -3F, 15F);

		tsarbombModel[57].addShapeBox(0F, 0F, 0F, 14, 27, 14, 0F, -6F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, -24F, 10F, 0F, -24F, 10F, 0F, 10F, -24F, 0F, 10F); // Box 76
		tsarbombModel[57].setRotationPoint(1F, -3F, 1F);

		tsarbombModel[58].addShapeBox(0F, 0F, 0F, 14, 27, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, -10F, -24F, 0F, -10F, -24F, 0F, -10F, 10F, 0F, -10F); // Box 77
		tsarbombModel[58].setRotationPoint(45F, -3F, 15F);

		tsarbombModel[59].addShapeBox(0F, 0F, 0F, 14, 27, 14, 0F, 0F, 0F, 0F, -6F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, -24F, -24F, 0F, -24F, -24F, 0F, 10F, 10F, 0F, 10F); // Box 78
		tsarbombModel[59].setRotationPoint(45F, -3F, 1F);

		tsarbombModel[60].addShapeBox(0F, 0F, 0F, 30, 27, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -24F, -10F, 0F, -24F, -10F, 0F, 10F, -10F, 0F, 10F); // Box 79
		tsarbombModel[60].setRotationPoint(15F, -3F, 1F);

		tsarbombModel[61].addShapeBox(0F, 0F, 0F, 30, 27, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 10F, -10F, 0F, 10F, -10F, 0F, -24F, -10F, 0F, -24F); // Box 80
		tsarbombModel[61].setRotationPoint(15F, -3F, 45F);

		tsarbombModel[62].addShapeBox(0F, 0F, 0F, 30, 27, 3, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -27F, -10F, 0F, -27F, -10F, 0F, 24F, -10F, 0F, 24F); // Box 81
		tsarbombModel[62].setRotationPoint(15F, -3F, -2F);

		tsarbombModel[63].addShapeBox(0F, 0F, 0F, 14, 27, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -6F, 0F, 0F, 0F, 10F, 0F, 10F, -24F, 0F, 10F, -24F, 0F, -24F, 10F, 0F, -24F); // Box 82
		tsarbombModel[63].setRotationPoint(45F, -3F, 45F);

		tsarbombModel[64].addShapeBox(0F, 0F, 0F, 14, 27, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -6F, -24F, 0F, 10F, 10F, 0F, 10F, 10F, 0F, -24F, -24F, 0F, -24F); // Box 83
		tsarbombModel[64].setRotationPoint(1F, -3F, 45F);

		tsarbombModel[65].addShapeBox(0F, 0F, 0F, 30, 27, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 24F, -10F, 0F, 24F, -10F, 0F, -27F, -10F, 0F, -27F); // Box 84
		tsarbombModel[65].setRotationPoint(15F, -3F, 59F);

		tsarbombModel[66].addShapeBox(0F, 0F, 0F, 3, 27, 30, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -27F, 0F, -10F, 24F, 0F, -10F, 24F, 0F, -10F, -27F, 0F, -10F); // Box 85
		tsarbombModel[66].setRotationPoint(-2F, -3F, 15F);

		tsarbombModel[67].addShapeBox(0F, 0F, 0F, 3, 27, 30, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 24F, 0F, -10F, -27F, 0F, -10F, -27F, 0F, -10F, 24F, 0F, -10F); // Box 86
		tsarbombModel[67].setRotationPoint(59F, -3F, 15F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 68; i++)
		{
			tsarbombModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo tsarbombModel[];
}