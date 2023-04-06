//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKirishimaStatue extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelKirishimaStatue() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[72];
		bodyModel[0] = new ModelRendererTurbo(this, 60, 0, textureX, textureY); // Import ImportImportMammaryRight
		bodyModel[1] = new ModelRendererTurbo(this, 75, 0, textureX, textureY); // Import ImportImportMammaryLeft
		bodyModel[2] = new ModelRendererTurbo(this, 120, 3, textureX, textureY); // Import ImportImportNeck
		bodyModel[3] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Import ImportImportApron
		bodyModel[4] = new ModelRendererTurbo(this, 20, 200, textureX, textureY); // Import ImportImportApron
		bodyModel[5] = new ModelRendererTurbo(this, 0, 250, textureX, textureY); // Import ImportImportApron
		bodyModel[6] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import ImportImportApron
		bodyModel[7] = new ModelRendererTurbo(this, 160, 0, textureX, textureY); // Import ImportImportTop
		bodyModel[8] = new ModelRendererTurbo(this, 180, 0, textureX, textureY); // Import ImportImportBottom
		bodyModel[9] = new ModelRendererTurbo(this, 100, 250, textureX, textureY); // Import ImportImportLowerLeftsleeve
		bodyModel[10] = new ModelRendererTurbo(this, 120, 0, textureX, textureY); // Import ImportImportTop
		bodyModel[11] = new ModelRendererTurbo(this, 140, 0, textureX, textureY); // Import ImportImportBottom
		bodyModel[12] = new ModelRendererTurbo(this, 100, 250, textureX, textureY); // Import ImportImportLowerRightsleeve
		bodyModel[13] = new ModelRendererTurbo(this, 0, 30, textureX, textureY); // Import ImportImportRibCage
		bodyModel[14] = new ModelRendererTurbo(this, 375, 30, textureX, textureY); // Import Box15
		bodyModel[15] = new ModelRendererTurbo(this, 375, 30, textureX, textureY); // Import Box16
		bodyModel[16] = new ModelRendererTurbo(this, 375, 30, textureX, textureY); // Import Box17
		bodyModel[17] = new ModelRendererTurbo(this, 375, 30, textureX, textureY); // Import Box18
		bodyModel[18] = new ModelRendererTurbo(this, 375, 30, textureX, textureY); // Import Box19
		bodyModel[19] = new ModelRendererTurbo(this, 375, 30, textureX, textureY); // Import Box20
		bodyModel[20] = new ModelRendererTurbo(this, 375, 30, textureX, textureY); // Import Box21
		bodyModel[21] = new ModelRendererTurbo(this, 375, 30, textureX, textureY); // Import Box22
		bodyModel[22] = new ModelRendererTurbo(this, 375, 30, textureX, textureY); // Import Box23
		bodyModel[23] = new ModelRendererTurbo(this, 375, 20, textureX, textureY); // Import Box24
		bodyModel[24] = new ModelRendererTurbo(this, 375, 20, textureX, textureY); // Import Box25
		bodyModel[25] = new ModelRendererTurbo(this, 200, 400, textureX, textureY); // Import Box26
		bodyModel[26] = new ModelRendererTurbo(this, 150, 400, textureX, textureY); // Import Box27
		bodyModel[27] = new ModelRendererTurbo(this, 250, 400, textureX, textureY); // Import Box28
		bodyModel[28] = new ModelRendererTurbo(this, 200, 400, textureX, textureY); // Import Box29
		bodyModel[29] = new ModelRendererTurbo(this, 150, 400, textureX, textureY); // Import Box30
		bodyModel[30] = new ModelRendererTurbo(this, 250, 400, textureX, textureY); // Import Box31
		bodyModel[31] = new ModelRendererTurbo(this, 100, 400, textureX, textureY); // Import Box32
		bodyModel[32] = new ModelRendererTurbo(this, 100, 400, textureX, textureY); // Import Box33
		bodyModel[33] = new ModelRendererTurbo(this, 300, 400, textureX, textureY); // Import Box35
		bodyModel[34] = new ModelRendererTurbo(this, 450, 400, textureX, textureY); // Import Box36
		bodyModel[35] = new ModelRendererTurbo(this, 450, 400, textureX, textureY); // Import Box37
		bodyModel[36] = new ModelRendererTurbo(this, 450, 400, textureX, textureY); // Import Box38
		bodyModel[37] = new ModelRendererTurbo(this, 323, 416, textureX, textureY); // Import Box39
		bodyModel[38] = new ModelRendererTurbo(this, 320, 416, textureX, textureY); // Import Box40
		bodyModel[39] = new ModelRendererTurbo(this, 350, 400, textureX, textureY); // Import Box41
		bodyModel[40] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import Box42
		bodyModel[41] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import Box43
		bodyModel[42] = new ModelRendererTurbo(this, 350, 400, textureX, textureY); // Import Box44
		bodyModel[43] = new ModelRendererTurbo(this, 400, 450, textureX, textureY); // Import Box45
		bodyModel[44] = new ModelRendererTurbo(this, 400, 450, textureX, textureY); // Import Box46
		bodyModel[45] = new ModelRendererTurbo(this, 400, 450, textureX, textureY); // Import Box47
		bodyModel[46] = new ModelRendererTurbo(this, 400, 450, textureX, textureY); // Import Box48
		bodyModel[47] = new ModelRendererTurbo(this, 350, 400, textureX, textureY); // Import Box49
		bodyModel[48] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import Box50
		bodyModel[49] = new ModelRendererTurbo(this, 350, 400, textureX, textureY); // Import Box53
		bodyModel[50] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import Box54
		bodyModel[51] = new ModelRendererTurbo(this, 30, 0, textureX, textureY); // Import ImportImportHead
		bodyModel[52] = new ModelRendererTurbo(this, 400, 50, textureX, textureY); // Import ImportImportSidePonyTail
		bodyModel[53] = new ModelRendererTurbo(this, 300, 80, textureX, textureY); // Import Box7
		bodyModel[54] = new ModelRendererTurbo(this, 350, 110, textureX, textureY); // Import Box8
		bodyModel[55] = new ModelRendererTurbo(this, 300, 0, textureX, textureY); // Import Box12
		bodyModel[56] = new ModelRendererTurbo(this, 300, 0, textureX, textureY); // Import Box13
		bodyModel[57] = new ModelRendererTurbo(this, 300, 0, textureX, textureY); // Import Box14
		bodyModel[58] = new ModelRendererTurbo(this, 40, 80, textureX, textureY); // Import ImportImportPelvis
		bodyModel[59] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import ImportImportApron
		bodyModel[60] = new ModelRendererTurbo(this, 100, 403, textureX, textureY); // Import Box51
		bodyModel[61] = new ModelRendererTurbo(this, 100, 403, textureX, textureY); // Import Box52
		bodyModel[62] = new ModelRendererTurbo(this, 100, 403, textureX, textureY); // Import Box55
		bodyModel[63] = new ModelRendererTurbo(this, 100, 403, textureX, textureY); // Import Box56
		bodyModel[64] = new ModelRendererTurbo(this, 0, 120, textureX, textureY); // Import ImportImportFemur
		bodyModel[65] = new ModelRendererTurbo(this, 100, 300, textureX, textureY); // Import ImportImportApron
		bodyModel[66] = new ModelRendererTurbo(this, 0, 80, textureX, textureY); // Import ImportImportThigh
		bodyModel[67] = new ModelRendererTurbo(this, 100, 300, textureX, textureY); // Import Box9
		bodyModel[68] = new ModelRendererTurbo(this, 0, 120, textureX, textureY); // Import ImportImportFemur
		bodyModel[69] = new ModelRendererTurbo(this, 50, 300, textureX, textureY); // Import ImportImportApron
		bodyModel[70] = new ModelRendererTurbo(this, 0, 80, textureX, textureY); // Import ImportImportThigh
		bodyModel[71] = new ModelRendererTurbo(this, 50, 300, textureX, textureY); // Import Box9

		bodyModel[0].addBox(-3.5F, -0.5F, -4.5F, 3, 3, 3, 0F); // Import ImportImportMammaryRight
		bodyModel[0].setRotationPoint(0F, -15F, 0F);
		bodyModel[0].rotateAngleX = 0.9250245F;
		bodyModel[0].rotateAngleY = 1.57079633F;
		bodyModel[0].rotateAngleZ = 0.12217305F;

		bodyModel[1].addBox(0.5F, -0.5F, -4.5F, 3, 3, 3, 0F); // Import ImportImportMammaryLeft
		bodyModel[1].setRotationPoint(0F, -15F, 0F);
		bodyModel[1].rotateAngleX = 0.9250245F;
		bodyModel[1].rotateAngleY = 1.57079633F;
		bodyModel[1].rotateAngleZ = -0.12217305F;

		bodyModel[2].addShapeBox(-1F, -1F, -1F, 2, 2, 2, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0.8F, 0.3F, 0F, 0.8F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.4F, 0F, 1F, 0.4F, 0F, 1F); // Import ImportImportNeck
		bodyModel[2].setRotationPoint(0F, -15F, 0F);
		bodyModel[2].rotateAngleY = 1.57079633F;

		bodyModel[3].addBox(-3.6F, -0.7F, -4.6F, 3, 3, 3, 0F); // Import ImportImportApron
		bodyModel[3].setRotationPoint(0F, -15F, 0F);
		bodyModel[3].rotateAngleX = 0.9250245F;
		bodyModel[3].rotateAngleY = 1.57079633F;
		bodyModel[3].rotateAngleZ = 0.17453293F;

		bodyModel[4].addBox(0.6F, -0.7F, -4.6F, 3, 3, 3, 0F); // Import ImportImportApron
		bodyModel[4].setRotationPoint(0F, -15F, 0F);
		bodyModel[4].rotateAngleX = 0.9250245F;
		bodyModel[4].rotateAngleY = 1.57079633F;
		bodyModel[4].rotateAngleZ = -0.17453293F;

		bodyModel[5].addBox(-3F, 0.2F, -1.5F, 6, 8, 4, 0F); // Import ImportImportApron
		bodyModel[5].setRotationPoint(0F, -15.02F, 0F);
		bodyModel[5].rotateAngleX = -0.08726646F;
		bodyModel[5].rotateAngleY = 1.57079633F;

		bodyModel[6].addShapeBox(-3.5F, 0.2F, -1.15F, 7, 8, 3, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Import ImportImportApron
		bodyModel[6].setRotationPoint(0F, -15F, 0F);
		bodyModel[6].rotateAngleX = -0.08726646F;
		bodyModel[6].rotateAngleY = 1.57079633F;

		bodyModel[7].addBox(-0.5F, 0F, -1F, 2, 6, 3, 0F); // Import ImportImportTop
		bodyModel[7].setRotationPoint(0F, -14F, 2.5F);
		bodyModel[7].rotateAngleX = -1.36135682F;
		bodyModel[7].rotateAngleY = 1.74532925F;
		bodyModel[7].rotateAngleZ = 0.34906585F;

		bodyModel[8].addBox(-0.3F, 5.5F, -0.3F, 2, 6, 3, 0F); // Import ImportImportBottom
		bodyModel[8].setRotationPoint(0F, -14F, 2.5F);
		bodyModel[8].rotateAngleX = -1.46607657F;
		bodyModel[8].rotateAngleY = 1.74532926F;
		bodyModel[8].rotateAngleZ = 0.31415927F;

		bodyModel[9].addShapeBox(-0.8F, 5.5F, -0.8F, 3, 5, 4, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportLowerLeftsleeve
		bodyModel[9].setRotationPoint(0F, -14F, 2.5F);
		bodyModel[9].rotateAngleX = -1.46607657F;
		bodyModel[9].rotateAngleY = 1.74532926F;
		bodyModel[9].rotateAngleZ = 0.31415927F;

		bodyModel[10].addBox(-1.5F, 1F, -1F, 2, 6, 3, 0F); // Import ImportImportTop
		bodyModel[10].setRotationPoint(0F, -15F, -2F);
		bodyModel[10].rotateAngleX = 0.15707963F;
		bodyModel[10].rotateAngleY = 1.57079633F;
		bodyModel[10].rotateAngleZ = -0.41887902F;

		bodyModel[11].addBox(-1.7F, 6.5F, -0.3F, 2, 6, 3, 0F); // Import ImportImportBottom
		bodyModel[11].setRotationPoint(0F, -15F, -2F);
		bodyModel[11].rotateAngleX = 0.05235988F;
		bodyModel[11].rotateAngleY = 1.57079633F;
		bodyModel[11].rotateAngleZ = -0.33161256F;

		bodyModel[12].addShapeBox(-2.2F, 6.5F, -0.8F, 3, 5, 4, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportLowerRightsleeve
		bodyModel[12].setRotationPoint(0F, -15F, -2F);
		bodyModel[12].rotateAngleX = 0.05235988F;
		bodyModel[12].rotateAngleY = 1.57079633F;
		bodyModel[12].rotateAngleZ = -0.38397244F;

		bodyModel[13].addShapeBox(-3F, 0.2F, -1.3F, 6, 8, 3, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Import ImportImportRibCage
		bodyModel[13].setRotationPoint(0F, -15F, 0F);
		bodyModel[13].rotateAngleX = -0.08726646F;
		bodyModel[13].rotateAngleY = 1.57079633F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F); // Import Box15
		bodyModel[14].setRotationPoint(4F, -18F, -1F);
		bodyModel[14].rotateAngleX = 0.01745329F;
		bodyModel[14].rotateAngleZ = 0.01745329F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F); // Import Box16
		bodyModel[15].setRotationPoint(4F, -17.5F, -3F);
		bodyModel[15].rotateAngleX = 0.01745329F;
		bodyModel[15].rotateAngleZ = 0.01745329F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F); // Import Box17
		bodyModel[16].setRotationPoint(4F, -17.5F, 1F);
		bodyModel[16].rotateAngleX = 0.01745329F;
		bodyModel[16].rotateAngleZ = 0.01745329F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, -0.8F, -0.4F, -0.37F, -0.8F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, -0.8F, -0.4F, -1F, -0.8F); // Import Box18
		bodyModel[17].setRotationPoint(4F, -18F, 0.9F);
		bodyModel[17].rotateAngleX = 0.01745329F;
		bodyModel[17].rotateAngleZ = 0.01745329F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, -0.8F, -0.4F, -0.37F, -0.8F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, -0.8F, -0.4F, -1F, -0.8F); // Import Box19
		bodyModel[18].setRotationPoint(4F, -18F, -1.1F);
		bodyModel[18].rotateAngleX = 0.01745329F;
		bodyModel[18].rotateAngleZ = 0.01745329F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, -0.8F, -0.4F, -0.37F, -0.8F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, -0.8F, -0.4F, -1F, -0.8F); // Import Box20
		bodyModel[19].setRotationPoint(4F, -18F, -3.1F);
		bodyModel[19].rotateAngleX = 0.01745329F;
		bodyModel[19].rotateAngleZ = 0.01745329F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, -0.8F, -0.4F, -0.37F, -0.8F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, -0.8F, -0.4F, -1F, -0.8F); // Import Box21
		bodyModel[20].setRotationPoint(4F, -18F, 2.9F);
		bodyModel[20].rotateAngleX = 0.01745329F;
		bodyModel[20].rotateAngleZ = 0.01745329F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F); // Import Box22
		bodyModel[21].setRotationPoint(4F, -18F, -4.1F);
		bodyModel[21].rotateAngleX = 0.01745329F;
		bodyModel[21].rotateAngleZ = 0.01745329F;

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F); // Import Box23
		bodyModel[22].setRotationPoint(4F, -18F, 3.1F);
		bodyModel[22].rotateAngleX = 0.01745329F;
		bodyModel[22].rotateAngleZ = 0.01745329F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, -0.8F, -0.4F, -0.37F, -0.8F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, -0.8F, -0.4F, -1F, -0.8F); // Import Box24
		bodyModel[23].setRotationPoint(1F, -17.7F, -4.2F);
		bodyModel[23].rotateAngleX = 0.01745329F;
		bodyModel[23].rotateAngleZ = 0.01745329F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.37F, -0.8F, -0.4F, -0.37F, -0.8F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, -0.8F, -0.4F, -1F, -0.8F); // Import Box25
		bodyModel[24].setRotationPoint(1F, -17.7F, 4F);
		bodyModel[24].rotateAngleX = 0.01745329F;
		bodyModel[24].rotateAngleZ = 0.01745329F;

		bodyModel[25].addShapeBox(0F, 0F, 0F, 12, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Import Box26
		bodyModel[25].setRotationPoint(-6F, -7F, -13F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 14, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import Box27
		bodyModel[26].setRotationPoint(-6F, -9F, -15F);
		bodyModel[26].rotateAngleX = 0.08726646F;
		bodyModel[26].rotateAngleZ = -0.03490659F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 9, 10, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Import Box28
		bodyModel[27].setRotationPoint(-11F, -11F, -13F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 12, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Import Box29
		bodyModel[28].setRotationPoint(-6F, -7F, 7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 14, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import Box30
		bodyModel[29].setRotationPoint(-6F, -9F, 14F);
		bodyModel[29].rotateAngleX = -0.08726646F;
		bodyModel[29].rotateAngleZ = -0.03490659F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 9, 10, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Import Box31
		bodyModel[30].setRotationPoint(-11F, -11F, 5F);

		bodyModel[31].addShapeBox(0F, -3F, 0F, 10, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box32
		bodyModel[31].setRotationPoint(-12F, -9F, 14F);
		bodyModel[31].rotateAngleX = -0.08726646F;
		bodyModel[31].rotateAngleZ = -0.03490659F;

		bodyModel[32].addShapeBox(0F, -3F, 0F, 10, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box33
		bodyModel[32].setRotationPoint(-12F, -9F, -15F);
		bodyModel[32].rotateAngleX = 0.08726646F;
		bodyModel[32].rotateAngleZ = -0.03490659F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 9, 11, 15, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box35
		bodyModel[33].setRotationPoint(-13F, -12F, -7.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box36
		bodyModel[34].setRotationPoint(-10F, -21F, -0.5F);
		bodyModel[34].rotateAngleZ = -0.06981317F;

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box37
		bodyModel[35].setRotationPoint(-9F, -21F, -0.5F);
		bodyModel[35].rotateAngleX = 0.31415927F;
		bodyModel[35].rotateAngleZ = 0.10471976F;

		bodyModel[36].addShapeBox(0F, -0.25F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box38
		bodyModel[36].setRotationPoint(-9F, -21F, -0.5F);
		bodyModel[36].rotateAngleX = -0.31415927F;
		bodyModel[36].rotateAngleZ = 0.10471976F;

		bodyModel[37].addShapeBox(0F, 3F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box39
		bodyModel[37].setRotationPoint(-10F, -20F, -1.5F);

		bodyModel[38].addShapeBox(0F, 3F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		bodyModel[38].setRotationPoint(-10F, -24F, -1.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box41
		bodyModel[39].setRotationPoint(-1F, -10F, -12.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box42
		bodyModel[40].setRotationPoint(-1F, -10.2F, -13.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box43
		bodyModel[41].setRotationPoint(-1F, -10.2F, 6.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box44
		bodyModel[42].setRotationPoint(-1F, -10F, 7.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box45
		bodyModel[43].setRotationPoint(5F, -9.5F, -12F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box46
		bodyModel[44].setRotationPoint(5F, -9.5F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box47
		bodyModel[45].setRotationPoint(5F, -9.5F, 11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box48
		bodyModel[46].setRotationPoint(5F, -9.5F, 8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box49
		bodyModel[47].setRotationPoint(-10F, -14F, 7.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box50
		bodyModel[48].setRotationPoint(-10F, -14.2F, 6.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box53
		bodyModel[49].setRotationPoint(-10F, -14F, -12.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box54
		bodyModel[50].setRotationPoint(-10F, -14.2F, -13.5F);

		bodyModel[51].addBox(-4F, -8.2F, -4F, 8, 8, 8, 0F); // Import ImportImportHead
		bodyModel[51].setRotationPoint(0F, -15.5F, 0F);
		bodyModel[51].rotateAngleX = -0.03490659F;
		bodyModel[51].rotateAngleY = 1.57079633F;
		bodyModel[51].rotateAngleZ = 0.01745329F;

		bodyModel[52].addBox(3F, -0.2F, -1F, 1, 2, 5, 0F); // Import ImportImportSidePonyTail
		bodyModel[52].setRotationPoint(0F, -15.5F, 0F);
		bodyModel[52].rotateAngleX = -0.03490658F;
		bodyModel[52].rotateAngleY = 1.57079633F;
		bodyModel[52].rotateAngleZ = 0.01745329F;

		bodyModel[53].addBox(-4F, -0.2F, -1F, 1, 2, 5, 0F); // Import Box7
		bodyModel[53].setRotationPoint(0F, -15.5F, 0F);
		bodyModel[53].rotateAngleX = -0.03490658F;
		bodyModel[53].rotateAngleY = 1.57079633F;
		bodyModel[53].rotateAngleZ = 0.01745329F;

		bodyModel[54].addBox(-4F, -0.2F, -3F, 1, 2, 6, 0F); // Import Box8
		bodyModel[54].setRotationPoint(0F, -15.5F, 0F);
		bodyModel[54].rotateAngleZ = -0.03490659F;

		bodyModel[55].addShapeBox(-4F, -8.4F, -1F, 8, 4, 1, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Import Box12
		bodyModel[55].setRotationPoint(0F, -15.5F, 0F);
		bodyModel[55].rotateAngleX = -0.03490658F;
		bodyModel[55].rotateAngleY = 1.57079633F;
		bodyModel[55].rotateAngleZ = 0.01745329F;

		bodyModel[56].addShapeBox(-0.6F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F); // Import Box13
		bodyModel[56].setRotationPoint(0.8F, -21.2F, 4F);
		bodyModel[56].rotateAngleX = 0.05235988F;
		bodyModel[56].rotateAngleY = 0.43633231F;
		bodyModel[56].rotateAngleZ = -0.12217305F;

		bodyModel[57].addShapeBox(-0.6F, 0F, -4F, 1, 1, 4, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box14
		bodyModel[57].setRotationPoint(0.8F, -21.2F, -4F);
		bodyModel[57].rotateAngleX = -0.19198622F;
		bodyModel[57].rotateAngleY = -0.43633231F;
		bodyModel[57].rotateAngleZ = -0.12217305F;

		bodyModel[58].addShapeBox(-4F, 7.5F, -3F, 8, 3, 4, 0F, -1.1F, 0.5F, 0.2F, -1.1F, 0.5F, 0.2F, -1.1F, 0.5F, -0.5F, -1.1F, 0.5F, -0.5F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F); // Import ImportImportPelvis
		bodyModel[58].setRotationPoint(0F, -15F, 0F);
		bodyModel[58].rotateAngleX = 0.2443461F;
		bodyModel[58].rotateAngleY = 1.57079633F;
		bodyModel[58].rotateAngleZ = -0.03490659F;

		bodyModel[59].addShapeBox(-5F, 0.45F, -3.5F, 10, 3, 5, 0F, -2F, 0.5F, -0.5F, -2F, 0.5F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, 0F); // Import ImportImportApron
		bodyModel[59].setRotationPoint(-0.5F, -9F, 0F);
		bodyModel[59].rotateAngleX = 0.13962635F;
		bodyModel[59].rotateAngleY = 1.44862328F;
		bodyModel[59].rotateAngleZ = 0.01745329F;

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box51
		bodyModel[60].setRotationPoint(-4F, -12F, 8F);
		bodyModel[60].rotateAngleZ = 1.57079633F;

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box52
		bodyModel[61].setRotationPoint(-4F, -12F, 11F);
		bodyModel[61].rotateAngleZ = 1.57079633F;

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box55
		bodyModel[62].setRotationPoint(-4F, -12F, -9F);
		bodyModel[62].rotateAngleZ = 1.57079633F;

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box56
		bodyModel[63].setRotationPoint(-4F, -12F, -12F);
		bodyModel[63].rotateAngleZ = 1.57079633F;

		bodyModel[64].addBox(0.4F, 7F, -2.6F, 3, 9, 3, 0F); // Import ImportImportFemur
		bodyModel[64].setRotationPoint(0F, -6F, 0F);
		bodyModel[64].rotateAngleX = -0.01745329F;
		bodyModel[64].rotateAngleY = 1.51843645F;
		bodyModel[64].rotateAngleZ = 0.01745329F;

		bodyModel[65].addShapeBox(-2F, 0.5F, -3F, 7, 6, 6, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, -2F, 0F, 2.5F); // Import ImportImportApron
		bodyModel[65].setRotationPoint(0F, -8F, 0F);
		bodyModel[65].rotateAngleX = -0.06981317F;
		bodyModel[65].rotateAngleY = 1.53588974F;
		bodyModel[65].rotateAngleZ = 0.05235988F;

		bodyModel[66].addShapeBox(0.5F, 1.5F, -2.3F, 3, 6, 4, 0F, 1.1F, 0F, -0.1F, 0F, -1.4F, 0.6F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.4F, 1F, -0.6F, -0.3F, 1F, 0F, 0F, 1F, -0.8F, 0F, 1F, -0.8F); // Import ImportImportThigh
		bodyModel[66].setRotationPoint(-1F, -7F, 0F);
		bodyModel[66].rotateAngleX = -0.26179939F;
		bodyModel[66].rotateAngleY = 1.69296937F;
		bodyModel[66].rotateAngleZ = -0.01745329F;

		bodyModel[67].addShapeBox(-2F, 0.6F, -3F, 7, 6, 6, 0F, -1F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0.5F, -1F, -1F, 0.5F, -1F, 0F, 0.5F, 0F, -3F, 0.5F, 1.5F); // Import Box9
		bodyModel[67].setRotationPoint(0F, -8F, 0F);
		bodyModel[67].rotateAngleX = -0.03490659F;
		bodyModel[67].rotateAngleY = 1.65806279F;
		bodyModel[67].rotateAngleZ = 0.03490659F;

		bodyModel[68].addBox(-2.4F, 7F, -3.6F, 3, 9, 3, 0F); // Import ImportImportFemur
		bodyModel[68].setRotationPoint(0F, -6F, -0.5F);
		bodyModel[68].rotateAngleX = 0.31415927F;
		bodyModel[68].rotateAngleY = 1.57079633F;
		bodyModel[68].rotateAngleZ = -0.03490659F;

		bodyModel[69].addShapeBox(-5F, 0.5F, -3F, 7, 6, 6, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2.5F, 1F, 0F, 1F); // Import ImportImportApron
		bodyModel[69].setRotationPoint(0F, -8F, 0F);
		bodyModel[69].rotateAngleX = -0.01745329F;
		bodyModel[69].rotateAngleY = 1.36135682F;
		bodyModel[69].rotateAngleZ = -0.01745329F;

		bodyModel[70].addShapeBox(-3.4F, 1.5F, -2.3F, 3, 6, 4, 0F, 0F, -1.4F, 0.6F, 1.1F, 0F, -0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.5F, 0.1F, -0.4F, 1F, 0F, 0.4F, 1F, -0.6F, 0F, 1F, -0.8F, 0F, 1F, -0.8F); // Import ImportImportThigh
		bodyModel[70].setRotationPoint(0F, -7F, 0F);
		bodyModel[70].rotateAngleX = 0.05235988F;
		bodyModel[70].rotateAngleY = 1.3962634F;

		bodyModel[71].addShapeBox(-5F, 0.6F, -3F, 7, 6, 6, 0F, -2F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0.5F, -1F, -1F, 0.5F, -1F, -3F, 0.5F, 1.5F, 0F, 0.5F, 0F); // Import Box9
		bodyModel[71].setRotationPoint(0F, -8F, 0F);
		bodyModel[71].rotateAngleX = -0.03490659F;
		bodyModel[71].rotateAngleY = 1.48352986F;
		bodyModel[71].rotateAngleZ = -0.03490659F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}