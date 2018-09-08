//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Kar98k
// Model Creator: 
// Created on: 26.08.2016 - 20:14:22
// Last changed on: 26.08.2016 - 20:14:22

package com.flansmod.client.model.mineworld; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPanzerbuechse39 extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelPanzerbuechse39() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[58];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBody
		gunModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import ImportUnderbody
		gunModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import ImportBarrelguard
		gunModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import ImportEndbarrel
		gunModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import ImportSightback
		gunModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import ImportStock
		gunModel[6] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Import ImportStock
		gunModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportStock
		gunModel[8] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import ImportTrigger
		gunModel[9] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import ImportBullet
		gunModel[10] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Import Box3
		gunModel[11] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box3
		gunModel[12] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Import Box12
		gunModel[13] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box1
		gunModel[14] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box2
		gunModel[15] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import ImportSightfront
		gunModel[16] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import Box2
		gunModel[17] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import Box9
		gunModel[18] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Import Box10
		gunModel[19] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import Box11
		gunModel[20] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import Box15
		gunModel[21] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 0
		gunModel[22] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 2
		gunModel[23] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 33
		gunModel[24] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 35
		gunModel[25] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 36
		gunModel[26] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 37
		gunModel[27] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 38
		gunModel[28] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 39
		gunModel[29] = new ModelRendererTurbo(this, 112, 25, textureX, textureY); // Box 40
		gunModel[30] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 41
		gunModel[31] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 43
		gunModel[32] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 44
		gunModel[33] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 45
		gunModel[34] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 46
		gunModel[35] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 47
		gunModel[36] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 48
		gunModel[37] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 49
		gunModel[38] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 50
		gunModel[39] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 53
		gunModel[40] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 54
		gunModel[41] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 55
		gunModel[42] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 56
		gunModel[43] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 57
		gunModel[44] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 58
		gunModel[45] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 59
		gunModel[46] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 60
		gunModel[47] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 61
		gunModel[48] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 71
		gunModel[49] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 75
		gunModel[50] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 76
		gunModel[51] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 77
		gunModel[52] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 78
		gunModel[53] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 79
		gunModel[54] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 80
		gunModel[55] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 81
		gunModel[56] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 82
		gunModel[57] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 83

		gunModel[0].addShapeBox(0F, -1F, 0F, 21, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBody
		gunModel[0].setRotationPoint(8F, -10F, -1.5F);

		gunModel[1].addBox(0F, 1F, 0F, 6, 2, 3, 0F); // Import ImportUnderbody
		gunModel[1].setRotationPoint(2F, -11.5F, -1.5F);

		gunModel[2].addShapeBox(0F, -1.5F, 0F, 2, 3, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Import ImportBarrelguard
		gunModel[2].setRotationPoint(29F, -11F, -1F);

		gunModel[3].addShapeBox(0F, -1.5F, 0F, 43, 1, 1, 0F, 0F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Import ImportEndbarrel
		gunModel[3].setRotationPoint(5F, -10.5F, -0.5F);

		gunModel[4].addShapeBox(5F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportSightback
		gunModel[4].setRotationPoint(2F, -12.5F, -1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportStock
		gunModel[5].setRotationPoint(1F, -11F, -1.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F, 0F, -1F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F); // Import ImportStock
		gunModel[6].setRotationPoint(-9F, -11F, -1.5F);

		gunModel[7].addShapeBox(2F, 1F, 0F, 2, 1, 3, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 1F, -1F, -0.7F, 0.25F, -1F, -0.7F, 0.25F, -1F, -0.5F, 1F, -1F); // Import ImportStock
		gunModel[7].setRotationPoint(-13F, -9.5F, -1.5F);

		gunModel[8].addShapeBox(0.5F, -0.4F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Import ImportTrigger
		gunModel[8].setRotationPoint(2F, -8F, -0.5F);
		gunModel[8].rotateAngleZ = 0.15707963F;

		gunModel[9].addShapeBox(3F, 0F, -0.5F, 6, 1, 3, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBullet
		gunModel[9].setRotationPoint(-1F, -11F, -1F);

		gunModel[10].addShapeBox(4F, -1.5F, 0F, 1, 1, 3, 0F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F); // Import Box3
		gunModel[10].setRotationPoint(15F, -11F, -1.5F);

		gunModel[11].addBox(0F, -1F, 0F, 3, 2, 1, 0F); // Import Box3
		gunModel[11].setRotationPoint(1.5F, -8F, -0.5F);

		gunModel[12].addShapeBox(0F, -0.5F, 0F, 3, 1, 2, 0F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F); // Import Box12
		gunModel[12].setRotationPoint(12F, -12.5F, -1F);
		gunModel[12].rotateAngleZ = -0.05235988F;

		gunModel[13].addShapeBox(0F, -1.5F, 0F, 1, 1, 1, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Import Box1
		gunModel[13].setRotationPoint(11.63F, -11.5F, -0.7F);

		gunModel[14].addShapeBox(0F, -1.5F, 0F, 1, 1, 1, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Import Box2
		gunModel[14].setRotationPoint(11.63F, -11.5F, -0.3F);

		gunModel[15].addShapeBox(10F, -2.5F, 0F, 1, 3, 1, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Import ImportSightfront
		gunModel[15].setRotationPoint(35.5F, -11.5F, -0.5F);

		gunModel[16].addShapeBox(10F, -2F, 0.5F, 1, 1, 1, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Import Box2
		gunModel[16].setRotationPoint(35.5F, -12.25F, 1.5F);
		gunModel[16].rotateAngleX = 1.57079633F;

		gunModel[17].addShapeBox(10F, -3F, 0F, 1, 1, 1, 0F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F); // Import Box9
		gunModel[17].setRotationPoint(35.5F, -11.2F, -0.13F);

		gunModel[18].addShapeBox(10F, -3F, 0F, 1, 1, 1, 0F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F); // Import Box10
		gunModel[18].setRotationPoint(35.5F, -11.2F, -0.87F);

		gunModel[19].addShapeBox(10F, -2F, 0.5F, 1, 1, 1, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Import Box11
		gunModel[19].setRotationPoint(35.5F, -13.2F, 1.5F);
		gunModel[19].rotateAngleX = 1.57079633F;

		gunModel[20].addShapeBox(10F, -3F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Import Box15
		gunModel[20].setRotationPoint(34.5F, -9.75F, -0.5F);

		gunModel[21].addShapeBox(25F, -10F, -1F, 2, 10, 1, 0F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -0.5F, 0F, 4.75F, -0.5F, 0F, 4.75F, -0.5F, 0F, -5.25F, -0.5F, 0F, -5.25F); // Box 0
		gunModel[21].setRotationPoint(4F, -1F, 0F);

		gunModel[22].addShapeBox(27F, 0F, -6F, 2, 1, 1, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.7F, 0.5F, -0.3F, -0.7F, 0.5F, -0.3F, -0.7F, -0.2F, -0.3F, -0.7F, -0.2F); // Box 2
		gunModel[22].setRotationPoint(2F, -1F, 0F);

		gunModel[23].addShapeBox(-1F, -0.5F, 0.5F, 2, 4, 2, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0.8F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, 0F, -0.4F, 0.8F, 0F, -0.4F); // Box 33
		gunModel[23].setRotationPoint(2F, -8F, -1.5F);

		gunModel[24].addShapeBox(0F, 0.4F, 0F, 2, 3, 2, 0F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -1.2F, -0.3F, 0.2F, -1.2F, -0.3F, 0.2F, -1.2F, -0.3F, 0.2F, -1.2F, -0.3F); // Box 35
		gunModel[24].setRotationPoint(45F, -13F, -1F);

		gunModel[25].addShapeBox(-10.5F, -3.5F, 0F, 2, 3, 2, 0F, -0.4F, 0F, -3.6F, -0.4F, 0F, -3.6F, -0.4F, 0F, 2.2F, -0.4F, 0F, 2.2F, -0.4F, -1F, -1.2F, -0.4F, -1F, -1.2F, -0.4F, -1F, -0.2F, -0.4F, -1F, -0.2F); // Box 36
		gunModel[25].setRotationPoint(29F, -11F, -1F);

		gunModel[26].addShapeBox(-11.9F, -2.5F, 3.4F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		gunModel[26].setRotationPoint(29F, -13F, -1F);

		gunModel[27].addBox(-3F, 0F, 2F, 6, 4, 2, 0F); // Box 38
		gunModel[27].setRotationPoint(11F, -12.5F, -1F);
		gunModel[27].rotateAngleZ = 0.6981317F;

		gunModel[28].addBox(-3F, 0F, -2F, 6, 4, 2, 0F); // Box 39
		gunModel[28].setRotationPoint(11F, -12.5F, -1F);
		gunModel[28].rotateAngleZ = 0.6981317F;

		gunModel[29].addShapeBox(0F, 4F, 2F, 6, 1, 2, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		gunModel[29].setRotationPoint(11.25F, -7.5F, -1.5F);
		gunModel[29].rotateAngleX = 1.57079633F;
		gunModel[29].rotateAngleZ = 0.6981317F;

		gunModel[30].addShapeBox(-3F, -1F, -2F, 6, 1, 2, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		gunModel[30].setRotationPoint(11F, -12.5F, -1F);
		gunModel[30].rotateAngleZ = 0.6981317F;

		gunModel[31].addShapeBox(2F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 43
		gunModel[31].setRotationPoint(3F, -12.5F, -1F);

		gunModel[32].addShapeBox(2F, 0F, 1F, 2, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 44
		gunModel[32].setRotationPoint(3F, -12.5F, -1F);

		gunModel[33].addShapeBox(1F, -1F, 1F, 1, 2, 1, 0F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 45
		gunModel[33].setRotationPoint(3F, -11.5F, -1F);

		gunModel[34].addShapeBox(2F, -1F, 0F, 1, 2, 1, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 46
		gunModel[34].setRotationPoint(2F, -11.5F, -1F);

		gunModel[35].addShapeBox(12F, -1.6F, 0F, 1, 3, 2, 0F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -1.25F, -0.35F, 0F, -1.25F, -0.35F, 0F, -1.25F, -0.35F, 0F, -1.25F, -0.35F); // Box 47
		gunModel[35].setRotationPoint(27F, -11F, -1F);

		gunModel[36].addShapeBox(25F, -10F, 0F, 2, 10, 1, 0F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -0.5F, 0F, -5.25F, -0.5F, 0F, -5.25F, -0.5F, 0F, 4.75F, -0.5F, 0F, 4.75F); // Box 48
		gunModel[36].setRotationPoint(4F, -1F, 0F);

		gunModel[37].addShapeBox(27F, 0F, 5F, 2, 1, 1, 0F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, -0.7F, -0.2F, -0.3F, -0.7F, -0.2F, -0.3F, -0.7F, 0.5F, -0.3F, -0.7F, 0.5F); // Box 49
		gunModel[37].setRotationPoint(2F, -1F, 0F);

		gunModel[38].addShapeBox(-2F, 0F, 0F, 2, 2, 3, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F); // Box 50
		gunModel[38].setRotationPoint(-9F, -10F, -1.5F);

		gunModel[39].addShapeBox(2F, -1.5F, 0F, 2, 1, 3, 0F, 0.5F, 1F, -1F, -0.7F, 0F, -1F, -0.7F, 0F, -1F, 0.5F, 1F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 53
		gunModel[39].setRotationPoint(-13F, -9.5F, -1.5F);

		gunModel[40].addShapeBox(1F, -1F, 0F, 2, 1, 3, 0F, -0.5F, 0F, -1.2F, -1.25F, 1F, -1.2F, -1.25F, 1F, -1.2F, -0.5F, 0F, -1.2F, -1F, 0F, -1.2F, 0.5F, 0F, -1.2F, 0.5F, 0.25F, -1.2F, -1F, 0F, -1.2F); // Box 54
		gunModel[40].setRotationPoint(-13F, -9.5F, -1.5F);

		gunModel[41].addShapeBox(1F, 0.5F, 0F, 2, 1, 3, 0F, -1F, 0F, -1.2F, -0.5F, 0.25F, -1.2F, -0.5F, 0.25F, -1.2F, -1F, 0F, -1.2F, -1.2F, 1F, -1.2F, -0.5F, 1F, -1.2F, -0.5F, 1F, -1.2F, -1.2F, 1F, -1.2F); // Box 55
		gunModel[41].setRotationPoint(-13F, -9.5F, -1.5F);

		gunModel[42].addShapeBox(20F, -1.6F, 0F, 2, 3, 2, 0F, 0.2F, -1.8F, -0.2F, 0.2F, -1.8F, -0.2F, 0.2F, -1.8F, -0.2F, 0.2F, -1.8F, -0.2F, 0.2F, -1F, -0.2F, 0.2F, -1F, -0.2F, 0.2F, -1F, -0.2F, 0.2F, -1F, -0.2F); // Box 56
		gunModel[42].setRotationPoint(27F, -11F, -1F);

		gunModel[43].addShapeBox(20F, -1.6F, 0F, 1, 3, 2, 0F, 0.2F, -0.3F, -1.6F, -0.5F, -0.3F, -1.6F, -0.5F, -0.3F, -0.2F, 0.2F, -0.3F, -0.2F, 0.2F, -1F, -1.6F, -0.5F, -1F, -1.6F, -0.5F, -1F, -0.2F, 0.2F, -1F, -0.2F); // Box 57
		gunModel[43].setRotationPoint(27F, -11F, -1F);

		gunModel[44].addShapeBox(22.2F, -1.6F, 0F, 1, 3, 2, 0F, 0.5F, -0.3F, -0.2F, -1F, -0.3F, -0.2F, -1F, -0.3F, -1.6F, 0.5F, -0.3F, -1.6F, 0.5F, -1F, -0.2F, -1F, -1F, -0.2F, -1F, -1F, -1.6F, 0.5F, -1F, -1.6F); // Box 58
		gunModel[44].setRotationPoint(27F, -11F, -1F);

		gunModel[45].addShapeBox(20F, -1.6F, 0F, 1, 3, 2, 0F, 0.2F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -1.6F, 0.2F, -0.3F, -1.6F, 0.2F, -1F, -0.2F, -0.5F, -1F, -0.2F, -0.5F, -1F, -1.6F, 0.2F, -1F, -1.6F); // Box 59
		gunModel[45].setRotationPoint(27F, -11F, -1F);

		gunModel[46].addShapeBox(22.2F, -1.6F, 0F, 1, 3, 2, 0F, 0.5F, -0.3F, -1.6F, -1F, -0.3F, -1.6F, -1F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.5F, -1F, -1.6F, -1F, -1F, -1.6F, -1F, -1F, -0.2F, 0.5F, -1F, -0.2F); // Box 60
		gunModel[46].setRotationPoint(27F, -11F, -1F);

		gunModel[47].addShapeBox(20F, -2.35F, 0F, 2, 3, 2, 0F, 0.2F, -1F, -0.2F, 0.2F, -1F, -0.2F, 0.2F, -1F, -0.2F, 0.2F, -1F, -0.2F, 0.2F, -1.8F, -0.2F, 0.2F, -1.8F, -0.2F, 0.2F, -1.8F, -0.2F, 0.2F, -1.8F, -0.2F); // Box 61
		gunModel[47].setRotationPoint(27F, -11F, -1F);

		gunModel[48].addShapeBox(3F, -9F, 2.5F, 4, 3, 1, 0F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F); // Box 71
		gunModel[48].setRotationPoint(4.5F, -11.5F, -0.5F);
		gunModel[48].rotateAngleZ = -0.78539816F;

		gunModel[49].addShapeBox(3F, -8F, 2.5F, 4, 3, 1, 0F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F); // Box 75
		gunModel[49].setRotationPoint(4.5F, -11.5F, -0.5F);
		gunModel[49].rotateAngleZ = -0.78539816F;

		gunModel[50].addShapeBox(3F, -7F, 2.5F, 4, 3, 1, 0F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F); // Box 76
		gunModel[50].setRotationPoint(4.5F, -11.5F, -0.5F);
		gunModel[50].rotateAngleZ = -0.78539816F;

		gunModel[51].addShapeBox(3F, -6F, 2.5F, 4, 3, 1, 0F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F); // Box 77
		gunModel[51].setRotationPoint(4.5F, -11.5F, -0.5F);
		gunModel[51].rotateAngleZ = -0.78539816F;

		gunModel[52].addShapeBox(3F, -5F, 2.5F, 4, 3, 1, 0F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F); // Box 78
		gunModel[52].setRotationPoint(4.5F, -11.5F, -0.5F);
		gunModel[52].rotateAngleZ = -0.78539816F;

		gunModel[53].addShapeBox(3F, -9F, 1.5F, 4, 3, 1, 0F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F); // Box 79
		gunModel[53].setRotationPoint(4.5F, -11.5F, -0.5F);
		gunModel[53].rotateAngleZ = -0.78539816F;

		gunModel[54].addShapeBox(3F, -8F, 1.5F, 4, 3, 1, 0F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F); // Box 80
		gunModel[54].setRotationPoint(4.5F, -11.5F, -0.5F);
		gunModel[54].rotateAngleZ = -0.78539816F;

		gunModel[55].addShapeBox(3F, -7F, 1.5F, 4, 3, 1, 0F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F); // Box 81
		gunModel[55].setRotationPoint(4.5F, -11.5F, -0.5F);
		gunModel[55].rotateAngleZ = -0.78539816F;

		gunModel[56].addShapeBox(3F, -6F, 1.5F, 4, 3, 1, 0F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F); // Box 82
		gunModel[56].setRotationPoint(4.5F, -11.5F, -0.5F);
		gunModel[56].rotateAngleZ = -0.78539816F;

		gunModel[57].addShapeBox(3F, -5F, 1.5F, 4, 3, 1, 0F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F); // Box 83
		gunModel[57].setRotationPoint(4.5F, -11.5F, -0.5F);
		gunModel[57].rotateAngleZ = -0.78539816F;


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 83, 17, textureX, textureY); // Box 62

		ammoModel[0].addShapeBox(0F, 1F, 0F, 4, 3, 1, 0F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F); // Import Box0
		ammoModel[0].setRotationPoint(4.5F, -12.5F, -0.5F);

		ammoModel[1].addShapeBox(3.6F, 1F, 0F, 2, 3, 1, 0F, -0.2F, -1.25F, -0.25F, -0.2F, -1.5F, -0.5F, -0.2F, -1.5F, -0.5F, -0.2F, -1.25F, -0.25F, -0.2F, -1.25F, -0.25F, -0.2F, -1.5F, -0.5F, -0.2F, -1.5F, -0.5F, -0.2F, -1.25F, -0.25F); // Box 62
		ammoModel[1].setRotationPoint(4.5F, -12.5F, -0.5F);


		unloadClipTime = 0.0F;
		animationType = EnumAnimationType.RIFLE_TOP;
		numBulletsInReloadAnimation = 1;

		translateAll(0F, 3F, 0F);


		flipAll();
	}
}