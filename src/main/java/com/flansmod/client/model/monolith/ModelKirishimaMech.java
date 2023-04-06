//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKirishimaMech extends ModelMecha //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelKirishimaMech() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[51];
		bodyModel[0] = new ModelRendererTurbo(this, 60, 0, textureX, textureY); // Import ImportMammaryRight
		bodyModel[1] = new ModelRendererTurbo(this, 75, 0, textureX, textureY); // Import ImportMammaryLeft
		bodyModel[2] = new ModelRendererTurbo(this, 120, 3, textureX, textureY); // Import ImportNeck
		bodyModel[3] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Import ImportApron
		bodyModel[4] = new ModelRendererTurbo(this, 20, 200, textureX, textureY); // Import ImportApron
		bodyModel[5] = new ModelRendererTurbo(this, 0, 250, textureX, textureY); // Import ImportApron
		bodyModel[6] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import ImportApron
		bodyModel[7] = new ModelRendererTurbo(this, 160, 0, textureX, textureY); // Import ImportTop
		bodyModel[8] = new ModelRendererTurbo(this, 180, 0, textureX, textureY); // Import ImportBottom
		bodyModel[9] = new ModelRendererTurbo(this, 100, 250, textureX, textureY); // Import ImportLowerLeftsleeve
		bodyModel[10] = new ModelRendererTurbo(this, 120, 0, textureX, textureY); // Import ImportTop
		bodyModel[11] = new ModelRendererTurbo(this, 140, 0, textureX, textureY); // Import ImportBottom
		bodyModel[12] = new ModelRendererTurbo(this, 100, 250, textureX, textureY); // Import ImportLowerRightsleeve
		bodyModel[13] = new ModelRendererTurbo(this, 0, 30, textureX, textureY); // Import ImportRibCage
		bodyModel[14] = new ModelRendererTurbo(this, 375, 30, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 375, 30, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 375, 30, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 375, 30, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 375, 30, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 375, 30, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 375, 30, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 375, 30, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 375, 30, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 375, 30, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 375, 30, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 200, 400, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 150, 400, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 250, 400, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 200, 400, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 150, 400, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 250, 400, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 100, 400, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 100, 400, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 300, 400, textureX, textureY); // Box 35
		bodyModel[34] = new ModelRendererTurbo(this, 450, 400, textureX, textureY); // Box 36
		bodyModel[35] = new ModelRendererTurbo(this, 450, 400, textureX, textureY); // Box 37
		bodyModel[36] = new ModelRendererTurbo(this, 450, 400, textureX, textureY); // Box 38
		bodyModel[37] = new ModelRendererTurbo(this, 323, 416, textureX, textureY); // Box 39
		bodyModel[38] = new ModelRendererTurbo(this, 320, 416, textureX, textureY); // Box 40
		bodyModel[39] = new ModelRendererTurbo(this, 350, 400, textureX, textureY); // Box 41
		bodyModel[40] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Box 42
		bodyModel[41] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Box 43
		bodyModel[42] = new ModelRendererTurbo(this, 350, 400, textureX, textureY); // Box 44
		bodyModel[43] = new ModelRendererTurbo(this, 400, 450, textureX, textureY); // Box 45
		bodyModel[44] = new ModelRendererTurbo(this, 400, 450, textureX, textureY); // Box 46
		bodyModel[45] = new ModelRendererTurbo(this, 400, 450, textureX, textureY); // Box 47
		bodyModel[46] = new ModelRendererTurbo(this, 400, 450, textureX, textureY); // Box 48
		bodyModel[47] = new ModelRendererTurbo(this, 350, 400, textureX, textureY); // Box 49
		bodyModel[48] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Box 50
		bodyModel[49] = new ModelRendererTurbo(this, 350, 400, textureX, textureY); // Box 53
		bodyModel[50] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Box 54

		bodyModel[0].addBox(-3.5F, -0.5F, -4.5F, 3, 3, 3, 0F); // Import ImportMammaryRight
		bodyModel[0].setRotationPoint(0F, -25F, 0F);
		bodyModel[0].rotateAngleX = 0.9250245F;
		bodyModel[0].rotateAngleY = 1.57079633F;
		bodyModel[0].rotateAngleZ = 0.12217305F;

		bodyModel[1].addBox(0.5F, -0.5F, -4.5F, 3, 3, 3, 0F); // Import ImportMammaryLeft
		bodyModel[1].setRotationPoint(0F, -25F, 0F);
		bodyModel[1].rotateAngleX = 0.9250245F;
		bodyModel[1].rotateAngleY = 1.57079633F;
		bodyModel[1].rotateAngleZ = -0.12217305F;

		bodyModel[2].addShapeBox(-1F, -1F, -1F, 2, 2, 2, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0.8F, 0.3F, 0F, 0.8F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.4F, 0F, 1F, 0.4F, 0F, 1F); // Import ImportNeck
		bodyModel[2].setRotationPoint(0F, -25F, 0F);
		bodyModel[2].rotateAngleY = 1.57079633F;

		bodyModel[3].addBox(-3.6F, -0.7F, -4.6F, 3, 3, 3, 0F); // Import ImportApron
		bodyModel[3].setRotationPoint(0F, -25F, 0F);
		bodyModel[3].rotateAngleX = 0.9250245F;
		bodyModel[3].rotateAngleY = 1.57079633F;
		bodyModel[3].rotateAngleZ = 0.17453293F;

		bodyModel[4].addBox(0.6F, -0.7F, -4.6F, 3, 3, 3, 0F); // Import ImportApron
		bodyModel[4].setRotationPoint(0F, -25F, 0F);
		bodyModel[4].rotateAngleX = 0.9250245F;
		bodyModel[4].rotateAngleY = 1.57079633F;
		bodyModel[4].rotateAngleZ = -0.17453293F;

		bodyModel[5].addBox(-3F, 0.2F, -1.5F, 6, 8, 4, 0F); // Import ImportApron
		bodyModel[5].setRotationPoint(0F, -25.02F, 0F);
		bodyModel[5].rotateAngleX = -0.08726646F;
		bodyModel[5].rotateAngleY = 1.57079633F;

		bodyModel[6].addShapeBox(-3.5F, 0.2F, -1.15F, 7, 8, 3, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Import ImportApron
		bodyModel[6].setRotationPoint(0F, -25F, 0F);
		bodyModel[6].rotateAngleX = -0.08726646F;
		bodyModel[6].rotateAngleY = 1.57079633F;

		bodyModel[7].addBox(-0.5F, 0F, -1F, 2, 6, 3, 0F); // Import ImportTop
		bodyModel[7].setRotationPoint(0F, -24F, 2.5F);
		bodyModel[7].rotateAngleX = 0.10471976F;
		bodyModel[7].rotateAngleY = 1.57079633F;
		bodyModel[7].rotateAngleZ = 0.34906585F;

		bodyModel[8].addBox(-0.3F, 5.5F, -0.3F, 2, 6, 3, 0F); // Import ImportBottom
		bodyModel[8].setRotationPoint(0F, -24F, 2.5F);
		bodyModel[8].rotateAngleY = 1.57079633F;
		bodyModel[8].rotateAngleZ = 0.31415927F;

		bodyModel[9].addShapeBox(-0.8F, 5.5F, -0.8F, 3, 5, 4, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportLowerLeftsleeve
		bodyModel[9].setRotationPoint(0F, -24F, 2.5F);
		bodyModel[9].rotateAngleY = 1.57079633F;
		bodyModel[9].rotateAngleZ = 0.31415927F;

		bodyModel[10].addBox(-1.5F, 1F, -1F, 2, 6, 3, 0F); // Import ImportTop
		bodyModel[10].setRotationPoint(0F, -25F, -2F);
		bodyModel[10].rotateAngleX = 0.10471976F;
		bodyModel[10].rotateAngleY = 1.57079633F;
		bodyModel[10].rotateAngleZ = -0.34906585F;

		bodyModel[11].addBox(-1.7F, 6.5F, -0.3F, 2, 6, 3, 0F); // Import ImportBottom
		bodyModel[11].setRotationPoint(0F, -25F, -2F);
		bodyModel[11].rotateAngleY = 1.57079633F;
		bodyModel[11].rotateAngleZ = -0.31415927F;

		bodyModel[12].addShapeBox(-2.2F, 6.5F, -0.8F, 3, 5, 4, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportLowerRightsleeve
		bodyModel[12].setRotationPoint(0F, -25F, -2F);
		bodyModel[12].rotateAngleY = 1.57079633F;
		bodyModel[12].rotateAngleZ = -0.31415927F;

		bodyModel[13].addShapeBox(-3F, 0.2F, -1.3F, 6, 8, 3, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Import ImportRibCage
		bodyModel[13].setRotationPoint(0F, -25F, 0F);
		bodyModel[13].rotateAngleX = -0.08726646F;
		bodyModel[13].rotateAngleY = 1.57079633F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F); // Box 15
		bodyModel[14].setRotationPoint(4F, -28F, -1F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F); // Box 16
		bodyModel[15].setRotationPoint(4F, -27.5F, -3F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F); // Box 17
		bodyModel[16].setRotationPoint(4F, -27.5F, 1F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, -0.8F, -0.4F, -0.37F, -0.8F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, -0.8F, -0.4F, -1F, -0.8F); // Box 18
		bodyModel[17].setRotationPoint(4F, -28F, 0.9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, -0.8F, -0.4F, -0.37F, -0.8F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, -0.8F, -0.4F, -1F, -0.8F); // Box 19
		bodyModel[18].setRotationPoint(4F, -28F, -1.1F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, -0.8F, -0.4F, -0.37F, -0.8F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, -0.8F, -0.4F, -1F, -0.8F); // Box 20
		bodyModel[19].setRotationPoint(4F, -28F, -3.1F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, -0.8F, -0.4F, -0.37F, -0.8F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, -0.8F, -0.4F, -1F, -0.8F); // Box 21
		bodyModel[20].setRotationPoint(4F, -28F, 2.9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F); // Box 22
		bodyModel[21].setRotationPoint(4F, -28F, -4.1F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F); // Box 23
		bodyModel[22].setRotationPoint(4F, -28F, 3.1F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, -0.8F, -0.4F, -0.37F, -0.8F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, -0.8F, -0.4F, -1F, -0.8F); // Box 24
		bodyModel[23].setRotationPoint(1F, -27.7F, -4.2F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, -0.8F, -0.4F, -0.37F, -0.8F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, -0.8F, -0.4F, -1F, -0.8F); // Box 25
		bodyModel[24].setRotationPoint(1F, -27.7F, 4F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 12, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 26
		bodyModel[25].setRotationPoint(-6F, -17F, -13F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 14, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[26].setRotationPoint(-6F, -19F, -15F);
		bodyModel[26].rotateAngleX = 0.08726646F;
		bodyModel[26].rotateAngleZ = -0.03490659F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 9, 10, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 28
		bodyModel[27].setRotationPoint(-11F, -21F, -13F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 12, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 29
		bodyModel[28].setRotationPoint(-6F, -17F, 7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 14, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[29].setRotationPoint(-6F, -19F, 14F);
		bodyModel[29].rotateAngleX = -0.08726646F;
		bodyModel[29].rotateAngleZ = -0.03490659F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 9, 10, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 31
		bodyModel[30].setRotationPoint(-11F, -21F, 5F);

		bodyModel[31].addShapeBox(0F, -3F, 0F, 10, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[31].setRotationPoint(-12F, -19F, 14F);
		bodyModel[31].rotateAngleX = -0.08726646F;
		bodyModel[31].rotateAngleZ = -0.03490659F;

		bodyModel[32].addShapeBox(0F, -3F, 0F, 10, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[32].setRotationPoint(-12F, -19F, -15F);
		bodyModel[32].rotateAngleX = 0.08726646F;
		bodyModel[32].rotateAngleZ = -0.03490659F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 9, 11, 15, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[33].setRotationPoint(-13F, -22F, -7.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[34].setRotationPoint(-10F, -31F, -0.5F);
		bodyModel[34].rotateAngleZ = -0.06981317F;

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[35].setRotationPoint(-9F, -31F, -0.5F);
		bodyModel[35].rotateAngleX = 0.31415927F;
		bodyModel[35].rotateAngleZ = 0.10471976F;

		bodyModel[36].addShapeBox(0F, -0.25F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[36].setRotationPoint(-9F, -31F, -0.5F);
		bodyModel[36].rotateAngleX = -0.31415927F;
		bodyModel[36].rotateAngleZ = 0.10471976F;

		bodyModel[37].addShapeBox(0F, 3F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[37].setRotationPoint(-10F, -30F, -1.5F);

		bodyModel[38].addShapeBox(0F, 3F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[38].setRotationPoint(-10F, -34F, -1.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[39].setRotationPoint(-1F, -20F, -12.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[40].setRotationPoint(-1F, -20.2F, -13.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[41].setRotationPoint(-1F, -20.2F, 6.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[42].setRotationPoint(-1F, -20F, 7.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[43].setRotationPoint(5F, -19.5F, -12F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[44].setRotationPoint(5F, -19.5F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[45].setRotationPoint(5F, -19.5F, 11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[46].setRotationPoint(5F, -19.5F, 8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[47].setRotationPoint(-10F, -24F, 7.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[48].setRotationPoint(-10F, -24.2F, 6.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[49].setRotationPoint(-10F, -24F, -12.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[50].setRotationPoint(-10F, -24.2F, -13.5F);


		headModel = new ModelRendererTurbo[7];
		headModel[0] = new ModelRendererTurbo(this, 30, 0, textureX, textureY); // Import ImportHead
		headModel[1] = new ModelRendererTurbo(this, 400, 50, textureX, textureY); // Import ImportSidePonyTail
		headModel[2] = new ModelRendererTurbo(this, 300, 80, textureX, textureY); // Box 7
		headModel[3] = new ModelRendererTurbo(this, 350, 110, textureX, textureY); // Box 8
		headModel[4] = new ModelRendererTurbo(this, 300, 0, textureX, textureY); // Box 12
		headModel[5] = new ModelRendererTurbo(this, 300, 0, textureX, textureY); // Box 13
		headModel[6] = new ModelRendererTurbo(this, 300, 0, textureX, textureY); // Box 14

		headModel[0].addBox(-4F, -8.2F, -4F, 8, 8, 8, 0F); // Import ImportHead
		headModel[0].setRotationPoint(0F, -25.5F, 0F);
		headModel[0].rotateAngleX = 0.03490659F;
		headModel[0].rotateAngleY = 1.57079633F;

		headModel[1].addBox(3F, -0.2F, -1F, 1, 2, 5, 0F); // Import ImportSidePonyTail
		headModel[1].setRotationPoint(0F, -25.5F, 0F);
		headModel[1].rotateAngleX = 0.03490659F;
		headModel[1].rotateAngleY = 1.57079633F;

		headModel[2].addBox(-4F, -0.2F, -1F, 1, 2, 5, 0F); // Box 7
		headModel[2].setRotationPoint(0F, -25.5F, 0F);
		headModel[2].rotateAngleX = 0.03490659F;
		headModel[2].rotateAngleY = 1.57079633F;

		headModel[3].addBox(-4F, -0.2F, -3F, 1, 2, 6, 0F); // Box 8
		headModel[3].setRotationPoint(0F, -25.5F, 0F);
		headModel[3].rotateAngleZ = -0.03490659F;

		headModel[4].addShapeBox(-4F, -8.4F, -1F, 8, 4, 1, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 12
		headModel[4].setRotationPoint(0F, -25.5F, 0F);
		headModel[4].rotateAngleX = 0.03490659F;
		headModel[4].rotateAngleY = 1.57079633F;

		headModel[5].addShapeBox(-0.6F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F); // Box 13
		headModel[5].setRotationPoint(0.8F, -31.2F, 4F);
		headModel[5].rotateAngleX = 0.12217305F;
		headModel[5].rotateAngleY = 0.43633231F;
		headModel[5].rotateAngleZ = -0.13962634F;

		headModel[6].addShapeBox(-0.6F, 0F, -4F, 1, 1, 4, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		headModel[6].setRotationPoint(0.8F, -31.2F, -4F);
		headModel[6].rotateAngleX = -0.12217305F;
		headModel[6].rotateAngleY = -0.43633231F;
		headModel[6].rotateAngleZ = -0.13962634F;


		hipsModel = new ModelRendererTurbo[2];
		hipsModel[0] = new ModelRendererTurbo(this, 40, 80, textureX, textureY); // Import ImportPelvis
		hipsModel[1] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import ImportApron

		hipsModel[0].addShapeBox(-4F, 7.5F, -3F, 8, 3, 4, 0F, -1.1F, 0.5F, 0.2F, -1.1F, 0.5F, 0.2F, -1.1F, 0.5F, -0.5F, -1.1F, 0.5F, -0.5F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F); // Import ImportPelvis
		hipsModel[0].setRotationPoint(0F, -25F, 0F);
		hipsModel[0].rotateAngleX = 0.12217305F;
		hipsModel[0].rotateAngleY = 1.57079633F;

		hipsModel[1].addShapeBox(-5F, 0.45F, -3.5F, 10, 3, 5, 0F, -2F, 0.5F, -0.5F, -2F, 0.5F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, 0F); // Import ImportApron
		hipsModel[1].setRotationPoint(-0.5F, -19F, 0F);
		hipsModel[1].rotateAngleX = 0.12217305F;
		hipsModel[1].rotateAngleY = 1.57079633F;


		leftArmModel = new ModelRendererTurbo[2];
		leftArmModel[0] = new ModelRendererTurbo(this, 100, 403, textureX, textureY); // Box 51
		leftArmModel[1] = new ModelRendererTurbo(this, 100, 403, textureX, textureY); // Box 52

		leftArmModel[0].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		leftArmModel[0].setRotationPoint(-4F, 0F, -2F);

		leftArmModel[1].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		leftArmModel[1].setRotationPoint(-4F, 0F, 1F);


		rightArmModel = new ModelRendererTurbo[2];
		rightArmModel[0] = new ModelRendererTurbo(this, 100, 403, textureX, textureY); // Box 55
		rightArmModel[1] = new ModelRendererTurbo(this, 100, 403, textureX, textureY); // Box 56

		rightArmModel[0].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		rightArmModel[0].setRotationPoint(-4F, 0F, 1F);

		rightArmModel[1].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		rightArmModel[1].setRotationPoint(-4F, 0F, -2F);


		leftLegModel = new ModelRendererTurbo[4];
		leftLegModel[0] = new ModelRendererTurbo(this, 0, 120, textureX, textureY); // Import ImportFemur
		leftLegModel[1] = new ModelRendererTurbo(this, 100, 300, textureX, textureY); // Import ImportApron
		leftLegModel[2] = new ModelRendererTurbo(this, 0, 80, textureX, textureY); // Import ImportThigh
		leftLegModel[3] = new ModelRendererTurbo(this, 100, 300, textureX, textureY); // Box 9

		leftLegModel[0].addBox(0.4F, 7F, -2.6F, 3, 9, 3, 0F); // Import ImportFemur
		leftLegModel[0].setRotationPoint(0F, -16F, 0F);
		leftLegModel[0].rotateAngleX = 0.05235988F;
		leftLegModel[0].rotateAngleY = 1.57079633F;

		leftLegModel[1].addShapeBox(-2F, 0.5F, -3F, 7, 6, 6, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, -2F, 0F, 2.5F); // Import ImportApron
		leftLegModel[1].setRotationPoint(0F, -18F, 0F);
		leftLegModel[1].rotateAngleX = -0.03490659F;
		leftLegModel[1].rotateAngleY = 1.65806279F;
		leftLegModel[1].rotateAngleZ = 0.03490659F;

		leftLegModel[2].addShapeBox(0.5F, 1.5F, -2.3F, 3, 6, 4, 0F, 1.1F, 0F, -0.1F, 0F, -1.4F, 0.6F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.4F, 1F, -0.6F, -0.3F, 1F, 0F, 0F, 1F, -0.8F, 0F, 1F, -0.8F); // Import ImportThigh
		leftLegModel[2].setRotationPoint(0F, -17F, 0F);
		leftLegModel[2].rotateAngleX = -0.06981317F;
		leftLegModel[2].rotateAngleY = 1.74532925F;
		leftLegModel[2].rotateAngleZ = -0.03490659F;

		leftLegModel[3].addShapeBox(-2F, 0.6F, -3F, 7, 6, 6, 0F, -1F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0.5F, -1F, -1F, 0.5F, -1F, 0F, 0.5F, 0F, -3F, 0.5F, 1.5F); // Box 9
		leftLegModel[3].setRotationPoint(0F, -18F, 0F);
		leftLegModel[3].rotateAngleX = -0.03490659F;
		leftLegModel[3].rotateAngleY = 1.65806279F;
		leftLegModel[3].rotateAngleZ = 0.03490659F;


		rightLegModel = new ModelRendererTurbo[4];
		rightLegModel[0] = new ModelRendererTurbo(this, 0, 120, textureX, textureY); // Import ImportFemur
		rightLegModel[1] = new ModelRendererTurbo(this, 50, 300, textureX, textureY); // Import ImportApron
		rightLegModel[2] = new ModelRendererTurbo(this, 0, 80, textureX, textureY); // Import ImportThigh
		rightLegModel[3] = new ModelRendererTurbo(this, 50, 300, textureX, textureY); // Box 9

		rightLegModel[0].addBox(-3.4F, 7F, -2.6F, 3, 9, 3, 0F); // Import ImportFemur
		rightLegModel[0].setRotationPoint(0F, -16F, 0F);
		rightLegModel[0].rotateAngleX = 0.05235988F;
		rightLegModel[0].rotateAngleY = 1.57079633F;

		rightLegModel[1].addShapeBox(-5F, 0.5F, -3F, 7, 6, 6, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2.5F, 1F, 0F, 1F); // Import ImportApron
		rightLegModel[1].setRotationPoint(0F, -18F, 0F);
		rightLegModel[1].rotateAngleX = -0.03490659F;
		rightLegModel[1].rotateAngleY = 1.48352986F;
		rightLegModel[1].rotateAngleZ = -0.03490659F;

		rightLegModel[2].addShapeBox(-3.4F, 1.5F, -2.3F, 3, 6, 4, 0F, 0F, -1.4F, 0.6F, 1.1F, 0F, -0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.5F, 0.1F, -0.4F, 1F, 0F, 0.4F, 1F, -0.6F, 0F, 1F, -0.8F, 0F, 1F, -0.8F); // Import ImportThigh
		rightLegModel[2].setRotationPoint(0F, -17F, 0F);
		rightLegModel[2].rotateAngleX = -0.06981317F;
		rightLegModel[2].rotateAngleY = 1.3962634F;

		rightLegModel[3].addShapeBox(-5F, 0.6F, -3F, 7, 6, 6, 0F, -2F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0.5F, -1F, -1F, 0.5F, -1F, -3F, 0.5F, 1.5F, 0F, 0.5F, 0F); // Box 9
		rightLegModel[3].setRotationPoint(0F, -18F, 0F);
		rightLegModel[3].rotateAngleX = -0.03490659F;
		rightLegModel[3].rotateAngleY = 1.48352986F;
		rightLegModel[3].rotateAngleZ = -0.03490659F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}