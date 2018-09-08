//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: G41
// Model Creator: 
// Created on: 30.08.2016 - 14:19:16
// Last changed on: 30.08.2016 - 14:19:16

package com.flansmod.client.model.mineworld; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelG41 extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelG41() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[26];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportImportBody
		gunModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import ImportImportUnderbody
		gunModel[2] = new ModelRendererTurbo(this, 11, 57, textureX, textureY); // Import ImportImportBarrelguard
		gunModel[3] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import ImportImportEndbarrel
		gunModel[4] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import ImportImportSightfront
		gunModel[5] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import ImportImportRoundguard
		gunModel[6] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Import ImportBox3
		gunModel[7] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import ImportBox4
		gunModel[8] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Import ImportBox6
		gunModel[9] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import ImportBox12
		gunModel[10] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Import ImportBox14
		gunModel[11] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Import ImportBox15
		gunModel[12] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Import ImportImportStock
		gunModel[13] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import ImportImportStock
		gunModel[14] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Import ImportImportStock
		gunModel[15] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Import ImportImportStock
		gunModel[16] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import ImportImportStock
		gunModel[17] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import ImportBox1
		gunModel[18] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import ImportBox2
		gunModel[19] = new ModelRendererTurbo(this, 50, 15, textureX, textureY); // Import ImportImportTrigger
		gunModel[20] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Import ImportBox3
		gunModel[21] = new ModelRendererTurbo(this, 24, 12, textureX, textureY); // Import ImportBox0
		gunModel[22] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import ImportBox0
		gunModel[23] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import Box5
		gunModel[24] = new ModelRendererTurbo(this, 26, 59, textureX, textureY); // Box 0
		gunModel[25] = new ModelRendererTurbo(this, 37, 57, textureX, textureY); // Box 1

		gunModel[0].addShapeBox(0F, -1F, 0F, 18, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportImportBody
		gunModel[0].setRotationPoint(9F, 8F, -1.5F);

		gunModel[1].addBox(0F, -4F, 0F, 8, 3, 3, 0F); // Import ImportImportUnderbody
		gunModel[1].setRotationPoint(1F, 11F, -1.5F);

		gunModel[2].addShapeBox(0F, -1F, 0F, 4, 3, 2, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBarrelguard
		gunModel[2].setRotationPoint(27F, 7F, -1F);

		gunModel[3].addBox(0F, -1F, 0F, 8, 1, 1, 0F); // Import ImportImportEndbarrel
		gunModel[3].setRotationPoint(29F, 8F, -0.5F);

		gunModel[4].addShapeBox(0F, -2F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Import ImportImportSightfront
		gunModel[4].setRotationPoint(35.5F, 7.25F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Import ImportImportRoundguard
		gunModel[5].setRotationPoint(1F, 6F, -1F);

		gunModel[6].addShapeBox(0F, -1F, 0F, 12, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox3
		gunModel[6].setRotationPoint(15F, 7F, -1.5F);

		gunModel[7].addShapeBox(0F, -1F, 0F, 3, 1, 3, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.22F, 0F, -0.1F, -0.22F, 0F, -0.1F, -0.22F, 0F, -0.1F, -0.22F); // Import ImportBox4
		gunModel[7].setRotationPoint(12F, 7F, -1.5F);

		gunModel[8].addShapeBox(0F, -2F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Import ImportBox6
		gunModel[8].setRotationPoint(0.75F, 8F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F); // Import ImportBox12
		gunModel[9].setRotationPoint(12F, 5.5F, -1F);
		gunModel[9].rotateAngleZ = -0.05235988F;

		gunModel[10].addShapeBox(0F, -4F, 0F, 1, 3, 2, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox14
		gunModel[10].setRotationPoint(31F, 10F, -1F);

		gunModel[11].addShapeBox(0F, -2F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Import ImportBox15
		gunModel[11].setRotationPoint(34.5F, 8.25F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportImportStock
		gunModel[12].setRotationPoint(-5F, 7F, -1.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Import ImportImportStock
		gunModel[13].setRotationPoint(-14F, 8.5F, -1.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportStock
		gunModel[14].setRotationPoint(-7F, 7.5F, -1.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportStock
		gunModel[15].setRotationPoint(-14F, 7.5F, -1.5F);

		gunModel[16].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Import ImportImportStock
		gunModel[16].setRotationPoint(0F, 7F, -1.5F);

		gunModel[17].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Import ImportBox1
		gunModel[17].setRotationPoint(11.63F, 6.5F, -0.7F);

		gunModel[18].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Import ImportBox2
		gunModel[18].setRotationPoint(11.63F, 6.5F, -0.3F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Import ImportImportTrigger
		gunModel[19].setRotationPoint(1F, 10F, -0.5F);
		gunModel[19].rotateAngleZ = 0.15707963F;

		gunModel[20].addBox(0F, 2.5F, 0F, 3, 2, 1, 0F); // Import ImportBox3
		gunModel[20].setRotationPoint(0F, 7F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F); // Import ImportBox0
		gunModel[21].setRotationPoint(10F, 6.5F, -1F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, -1F, 0F, -1.3F, -1F); // Import ImportBox0
		gunModel[22].setRotationPoint(1F, 6.5F, -1.7F);

		gunModel[23].addShapeBox(0F, -1F, 0F, 2, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box5
		gunModel[23].setRotationPoint(31.5F, 9F, -0.5F);

		gunModel[24].addShapeBox(0F, -1F, -0.1F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[24].setRotationPoint(27F, 8F, -1F);

		gunModel[25].addShapeBox(0F, -1F, 0F, 1, 3, 2, 0F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 1
		gunModel[25].setRotationPoint(27F, 7F, -1F);
		gunModel[25].rotateAngleZ = -0.05235988F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import ImportImportBullet

		ammoModel[0].addBox(8F, 1.7F, -0.5F, 5, 4, 1, 0F); // Import ImportImportBullet
		ammoModel[0].setRotationPoint(1F, 8F, 0F);
		ammoModel[0].rotateAngleZ = 0.13962634F;


		slideModel = new ModelRendererTurbo[4];
		slideModel[0] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import ImportBox3
		slideModel[1] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Import ImportBox5
		slideModel[2] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import ImportBox7
		slideModel[3] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Import ImportBox8

		slideModel[0].addShapeBox(0F, -1F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox3
		slideModel[0].setRotationPoint(9F, 7F, -1.5F);

		slideModel[1].addShapeBox(0F, -1F, 0F, 2, 1, 3, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Import ImportBox5
		slideModel[1].setRotationPoint(10F, 7F, -1.5F);

		slideModel[2].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F); // Import ImportBox7
		slideModel[2].setRotationPoint(9F, 7F, 1.25F);
		slideModel[2].rotateAngleX = 0.78539816F;
		slideModel[2].rotateAngleY = 0.01745329F;

		slideModel[3].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import ImportBox8
		slideModel[3].setRotationPoint(9F, 6.25F, 2F);
		slideModel[3].rotateAngleX = 0.78539816F;
		slideModel[3].rotateAngleY = 0.01745329F;


		barrelAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		stockAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(3F / 16F, 8F / 16F, 0F / 16F);
		gripAttachPoint = new Vector3f(0 /16F, 0F /16F, 0F /16F);

		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.BOTTOM_CLIP;

		translateAll(0F, -14F, 0F);


		flipAll();
	}
}