//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:30.07.2018 - 22:50:49
// Last changed on: 30.07.2018 - 22:50:49

package com.flansmod.client.model.newBombs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelbomb1000kg extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public Modelbomb1000kg()
	{
		bomb1000kgModel = new ModelRendererTurbo[44];
		bomb1000kgModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 8
		bomb1000kgModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 9
		bomb1000kgModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 10
		bomb1000kgModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 11
		bomb1000kgModel[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 12
		bomb1000kgModel[5] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 13
		bomb1000kgModel[6] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 14
		bomb1000kgModel[7] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 15
		bomb1000kgModel[8] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 16
		bomb1000kgModel[9] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 21
		bomb1000kgModel[10] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 23
		bomb1000kgModel[11] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 24
		bomb1000kgModel[12] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 25
		bomb1000kgModel[13] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 26
		bomb1000kgModel[14] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 27
		bomb1000kgModel[15] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 28
		bomb1000kgModel[16] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 29
		bomb1000kgModel[17] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 30
		bomb1000kgModel[18] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 31
		bomb1000kgModel[19] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 32
		bomb1000kgModel[20] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 33
		bomb1000kgModel[21] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 34
		bomb1000kgModel[22] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 35
		bomb1000kgModel[23] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 36
		bomb1000kgModel[24] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 37
		bomb1000kgModel[25] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 38
		bomb1000kgModel[26] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 39
		bomb1000kgModel[27] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 40
		bomb1000kgModel[28] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 43
		bomb1000kgModel[29] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 44
		bomb1000kgModel[30] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 45
		bomb1000kgModel[31] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 47
		bomb1000kgModel[32] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 49
		bomb1000kgModel[33] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 50
		bomb1000kgModel[34] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 51
		bomb1000kgModel[35] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 52
		bomb1000kgModel[36] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 53
		bomb1000kgModel[37] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 54
		bomb1000kgModel[38] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 55
		bomb1000kgModel[39] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 56
		bomb1000kgModel[40] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 57
		bomb1000kgModel[41] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 58
		bomb1000kgModel[42] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 59
		bomb1000kgModel[43] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 60

		bomb1000kgModel[0].addShapeBox(0F, 0F, 0F, 6, 27, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bomb1000kgModel[0].setRotationPoint(0F, -23F, 6F);

		bomb1000kgModel[1].addShapeBox(0F, 0F, 0F, 6, 27, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bomb1000kgModel[1].setRotationPoint(0F, -23F, -6F);

		bomb1000kgModel[2].addShapeBox(0F, 0F, 0F, 6, 27, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bomb1000kgModel[2].setRotationPoint(6F, -23F, 0F);

		bomb1000kgModel[3].addShapeBox(0F, 0F, 0F, 6, 27, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bomb1000kgModel[3].setRotationPoint(-6F, -23F, 0F);

		bomb1000kgModel[4].addShapeBox(0F, 0F, 0F, 6, 27, 6, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bomb1000kgModel[4].setRotationPoint(-6F, -23F, -6F);

		bomb1000kgModel[5].addShapeBox(0F, 0F, 0F, 6, 27, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 13
		bomb1000kgModel[5].setRotationPoint(-6F, -23F, 6F);

		bomb1000kgModel[6].addShapeBox(0F, 0F, 0F, 6, 27, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 14
		bomb1000kgModel[6].setRotationPoint(6F, -23F, 6F);

		bomb1000kgModel[7].addShapeBox(0F, 0F, 0F, 6, 27, 6, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bomb1000kgModel[7].setRotationPoint(6F, -23F, -6F);

		bomb1000kgModel[8].addShapeBox(0F, 0F, 0F, 6, 11, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, -8F, -2F, 0F, -8F); // Box 16
		bomb1000kgModel[8].setRotationPoint(0F, 4F, 6F);

		bomb1000kgModel[9].addShapeBox(0F, 0F, 0F, 6, 11, 6, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -8F, 2F, 0F, -8F, 2F, 0F, 2F, -8F, 0F, 2F); // Box 21
		bomb1000kgModel[9].setRotationPoint(-6F, 4F, -6F);

		bomb1000kgModel[10].addShapeBox(0F, 0F, 0F, 6, 11, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -8F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, -8F, -8F, 0F, -8F); // Box 23
		bomb1000kgModel[10].setRotationPoint(-6F, 4F, 6F);

		bomb1000kgModel[11].addShapeBox(0F, 0F, 0F, 6, 11, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -8F, -2F, 0F, -8F, -2F, 0F, 3F, -2F, 0F, 3F); // Box 24
		bomb1000kgModel[11].setRotationPoint(0F, 4F, -6F);

		bomb1000kgModel[12].addShapeBox(0F, 0F, 0F, 6, 11, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -2F, 3F, 0F, -2F, 3F, 0F, -2F, -8F, 0F, -2F); // Box 25
		bomb1000kgModel[12].setRotationPoint(-6F, 4F, 0F);

		bomb1000kgModel[13].addShapeBox(0F, 0F, 0F, 6, 11, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -2F, -8F, 0F, -2F, -8F, 0F, -2F, 3F, 0F, -2F); // Box 26
		bomb1000kgModel[13].setRotationPoint(6F, 4F, 0F);

		bomb1000kgModel[14].addShapeBox(0F, 0F, 0F, 6, 11, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 2F, -8F, 0F, 2F, -8F, 0F, -8F, 2F, 0F, -8F); // Box 27
		bomb1000kgModel[14].setRotationPoint(6F, 4F, 6F);

		bomb1000kgModel[15].addShapeBox(0F, 0F, 0F, 6, 11, 6, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -8F, -8F, 0F, -8F, -8F, 0F, 2F, 2F, 0F, 2F); // Box 28
		bomb1000kgModel[15].setRotationPoint(6F, 4F, -6F);

		bomb1000kgModel[16].addShapeBox(0F, 0F, 0F, 6, 25, 6, 0F, 2F, 0F, 2F, -8F, 0F, 2F, -8F, 0F, -8F, 2F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 29
		bomb1000kgModel[16].setRotationPoint(6F, -48F, 6F);

		bomb1000kgModel[17].addShapeBox(0F, 0F, 0F, 6, 25, 6, 0F, 2F, 0F, -8F, -8F, 0F, -8F, -8F, 0F, 2F, 2F, 0F, 2F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bomb1000kgModel[17].setRotationPoint(6F, -48F, -6F);

		bomb1000kgModel[18].addShapeBox(0F, 0F, 0F, 6, 25, 6, 0F, -2F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, -8F, -2F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bomb1000kgModel[18].setRotationPoint(0F, -48F, 6F);

		bomb1000kgModel[19].addShapeBox(0F, 0F, 0F, 6, 25, 6, 0F, 3F, 0F, -2F, -8F, 0F, -2F, -8F, 0F, -2F, 3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bomb1000kgModel[19].setRotationPoint(6F, -48F, 0F);

		bomb1000kgModel[20].addShapeBox(0F, 0F, 0F, 6, 25, 6, 0F, -8F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, -8F, -8F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 33
		bomb1000kgModel[20].setRotationPoint(-6F, -48F, 6F);

		bomb1000kgModel[21].addShapeBox(0F, 0F, 0F, 6, 25, 6, 0F, -8F, 0F, -2F, 3F, 0F, -2F, 3F, 0F, -2F, -8F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bomb1000kgModel[21].setRotationPoint(-6F, -48F, 0F);

		bomb1000kgModel[22].addShapeBox(0F, 0F, 0F, 6, 25, 6, 0F, -8F, 0F, -8F, 2F, 0F, -8F, 2F, 0F, 2F, -8F, 0F, 2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bomb1000kgModel[22].setRotationPoint(-6F, -48F, -6F);

		bomb1000kgModel[23].addShapeBox(0F, 0F, 0F, 6, 25, 6, 0F, -2F, 0F, -8F, -2F, 0F, -8F, -2F, 0F, 3F, -2F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bomb1000kgModel[23].setRotationPoint(0F, -48F, -6F);

		bomb1000kgModel[24].addShapeBox(0F, 0F, 0F, 10, 30, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 37
		bomb1000kgModel[24].setRotationPoint(-7F, -55F, 2.5F);

		bomb1000kgModel[25].addShapeBox(0F, 0F, 0F, 1, 30, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 38
		bomb1000kgModel[25].setRotationPoint(2.5F, -55F, -7F);

		bomb1000kgModel[26].addShapeBox(0F, 0F, 0F, 1, 30, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bomb1000kgModel[26].setRotationPoint(2.5F, -55F, 3F);

		bomb1000kgModel[27].addShapeBox(0F, 0F, 0F, 10, 30, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F); // Box 40
		bomb1000kgModel[27].setRotationPoint(3F, -55F, 2.5F);

		bomb1000kgModel[28].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bomb1000kgModel[28].setRotationPoint(0F, -58F, -7F);

		bomb1000kgModel[29].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 44
		bomb1000kgModel[29].setRotationPoint(-4F, -58F, -7F);

		bomb1000kgModel[30].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bomb1000kgModel[30].setRotationPoint(-7F, -58F, 0F);

		bomb1000kgModel[31].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bomb1000kgModel[31].setRotationPoint(0F, -58F, 12F);

		bomb1000kgModel[32].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bomb1000kgModel[32].setRotationPoint(-7F, -58F, -4F);

		bomb1000kgModel[33].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bomb1000kgModel[33].setRotationPoint(-5F, -58F, -5F);

		bomb1000kgModel[34].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 51
		bomb1000kgModel[34].setRotationPoint(-4F, -58F, 12F);

		bomb1000kgModel[35].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 52
		bomb1000kgModel[35].setRotationPoint(-5F, -58F, 10F);

		bomb1000kgModel[36].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 53
		bomb1000kgModel[36].setRotationPoint(-7F, -58F, 6F);

		bomb1000kgModel[37].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 54
		bomb1000kgModel[37].setRotationPoint(6F, -58F, 12F);

		bomb1000kgModel[38].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bomb1000kgModel[38].setRotationPoint(10F, -58F, 10F);

		bomb1000kgModel[39].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 56
		bomb1000kgModel[39].setRotationPoint(12F, -58F, 6F);

		bomb1000kgModel[40].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bomb1000kgModel[40].setRotationPoint(12F, -58F, -4F);

		bomb1000kgModel[41].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bomb1000kgModel[41].setRotationPoint(10F, -58F, -5F);

		bomb1000kgModel[42].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 59
		bomb1000kgModel[42].setRotationPoint(6F, -58F, -7F);

		bomb1000kgModel[43].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bomb1000kgModel[43].setRotationPoint(12F, -58F, 0F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 44; i++)
		{
			bomb1000kgModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo bomb1000kgModel[];
}