//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.7
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.mineworld;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelStg44 extends ModelGun
{
	int textureX = 64;
	int textureY = 64;

	public ModelStg44()
	{
		gunModel = new ModelRendererTurbo[20];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportImportBody
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import ImportImportUnderBody
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import ImportImportGrip
		gunModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import ImportImportBarrel
		gunModel[4] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import ImportImportStock
		gunModel[5] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Import ImportImportStock
		gunModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import ImportImportStock
		gunModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportImportSightF
		gunModel[8] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import ImportImportSightR
		gunModel[9] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Import ImportBox0
		gunModel[10] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Import ImportBox0
		gunModel[11] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Import ImportBox2
		gunModel[12] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Import ImportBox3
		gunModel[13] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Import ImportBox4
		gunModel[14] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import ImportBox5
		gunModel[15] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import ImportBox20
		gunModel[16] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportBox2
		gunModel[17] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportBox10
		gunModel[18] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportBox11
		gunModel[19] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportBox4

		gunModel[0].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -0.5F, 0F,0F, -0.5F, 0F,0F, -0.5F, 0F,0F, -0.5F, 0F); // Import ImportImportBody
		gunModel[0].setRotationPoint(0F, 2F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 0F); // Import ImportImportUnderBody
		gunModel[1].setRotationPoint(0F, 3.5F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F,0F, -0.7F, 0F,0F, -0.7F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportGrip
		gunModel[2].setRotationPoint(0F, 4F, -0.5F);
		gunModel[2].rotateAngleZ = -0.29670597F;

		gunModel[3].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Import ImportImportBarrel
		gunModel[3].setRotationPoint(7F, 3.2F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F,-0.05F, 0.2F, 0F,-0.05F, 0.2F, 0F,0F, -0.25F, 0F,0F, 0F, 0F,-0.4F, -0.2F, 0F,-0.4F, -0.2F, 0F,0F, 0F, 0F); // Import ImportImportStock
		gunModel[4].setRotationPoint(-2.9F, 2.55F, -0.5F);
		gunModel[4].rotateAngleZ = 0.17453293F;

		gunModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F,0.4F, 0F, 0F,0.4F, 0F, 0F,0F, 0F, 0F,-0.8F, 0F, 0F,0.4F, 0F, 0F,0.4F, 0F, 0F,-0.8F, 0F, 0F); // Import ImportImportStock
		gunModel[5].setRotationPoint(0F, 4F, -0.5F);

		gunModel[6].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import ImportImportStock
		gunModel[6].setRotationPoint(-1F, 2F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, -0.5F, -0.3F,0F, -0.5F, -0.3F,0F, -0.5F, -0.3F,0F, -0.5F, -0.3F); // Import ImportImportSightF
		gunModel[7].setRotationPoint(14.5F, 1.3F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F,0F, -0.5F, 0F,0F, -0.5F, 0F,0F, -0.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportSightR
		gunModel[8].setRotationPoint(4.5F, 1F, -0.5F);

		gunModel[9].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Import ImportBox0
		gunModel[9].setRotationPoint(0F, 2.5F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.3F,0F, 0F, -0.3F,0F, 0F, -0.3F,0F, 0F, -0.3F,0F, -0.5F, -0.3F,0F, -0.5F, -0.3F,0F, -0.5F, -0.3F,0F, -0.5F, -0.3F); // Import ImportBox0
		gunModel[10].setRotationPoint(11F, 2.5F, -0.5F);

		gunModel[11].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Import ImportBox2
		gunModel[11].setRotationPoint(7F, 2.2F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.2F,0.4F, 0F, -0.2F,0.4F, 0F, -0.2F,0F, 0F, -0.2F,0F, 0F, -0.2F,0.4F, 0F, -0.2F,0.4F, 0F, -0.2F,0F, 0F, -0.2F); // Import ImportBox3
		gunModel[12].setRotationPoint(0.4F, 5F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.2F,0.6F, 0F, -0.2F,0.6F, 0F, -0.2F,0F, 0F, -0.2F,0F, -0.3F, -0.2F,0.6F, -0.5F, -0.2F,0.6F, -0.5F, -0.2F,0F, -0.3F, -0.2F); // Import ImportBox4
		gunModel[13].setRotationPoint(1.8F, 5F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,3F, 0.3F, 0F,-0.95F, -0.3F, 0F,-0.95F, -0.3F, 0F,3F, 0.3F, 0F,3F, 0.5F, 0F,-0.95F, 0F, 0F,-0.95F, 0F, 0F,3F, 0.5F, 0F); // Import ImportBox5
		gunModel[14].setRotationPoint(-4.9F, 2.9F, -0.5F);
		gunModel[14].rotateAngleZ = 0.17453293F;

		gunModel[15].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,-1F, 0F, 0F); // Import ImportBox20
		gunModel[15].setRotationPoint(-0.5F, 3.5F, -0.5F);

		gunModel[16].addShapeBox(0F, -2F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.4F,0F, -0.2F, -0.4F,0F, -0.2F, -0.4F,0F, -0.2F, -0.4F,0F, -0.2F, -0.4F,0F, -0.2F, -0.4F,0F, -0.2F, -0.4F,0F, -0.2F, -0.4F); // Import ImportBox2
		gunModel[16].setRotationPoint(14.5F, 2.25F, 1.5F);
		gunModel[16].rotateAngleX = 1.57079633F;

		gunModel[17].addShapeBox(0F, -2F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.4F,0F, -0.1F, -0.4F,0F, -0.1F, -0.4F,0F, -0.1F, -0.4F,0F, -0.1F, -0.4F,0F, -0.1F, -0.4F,0F, -0.1F, -0.4F,0F, -0.1F, -0.4F); // Import ImportBox10
		gunModel[17].setRotationPoint(14.5F, 2.9F, -0.77F);

		gunModel[18].addShapeBox(0F, -2F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.4F,0F, -0.2F, -0.4F,0F, -0.2F, -0.4F,0F, -0.2F, -0.4F,0F, -0.2F, -0.4F,0F, -0.2F, -0.4F,0F, -0.2F, -0.4F,0F, -0.2F, -0.4F); // Import ImportBox11
		gunModel[18].setRotationPoint(14.5F, 1.5F, 1.5F);
		gunModel[18].rotateAngleX = 1.57079633F;

		gunModel[19].addShapeBox(0F, -2F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.4F,0F, -0.1F, -0.4F,0F, -0.1F, -0.4F,0F, -0.1F, -0.4F,0F, -0.1F, -0.4F,0F, -0.1F, -0.4F,0F, -0.1F, -0.4F,0F, -0.1F, -0.4F); // Import ImportBox4
		gunModel[19].setRotationPoint(14.5F, 2.9F, -0.23F);


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Import ImportImportMagazine
		ammoModel[1] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import ImportImportMagazine

		ammoModel[0].addShapeBox(3F, 4.7F, -0.5F, 2, 4, 1, 0F,0F, 0F, 0F,0F, -0.3F, 0F,0F, -0.3F, 0F,0F, 0F, 0F,0F, 0.5F, 0F,0F, 0.5F, 0F,0F, 0.5F, 0F,0F, 0.5F, 0F); // Import ImportImportMagazine
		ammoModel[0].setRotationPoint(-0.48F, 2.85F, 0F);
		ammoModel[0].rotateAngleZ = 0.26179939F;

		ammoModel[1].addShapeBox(3F, 2F, -0.5F, 2, 3, 1, 0F,0F, -0.66F, 0F,0F, -0.77F, 0F,0F, -0.77F, 0F,0F, -0.66F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportMagazine
		ammoModel[1].setRotationPoint(0.18F, 2F, 0F);
		ammoModel[1].rotateAngleZ = 0.10471976F;


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Import ImportImportbolt

		slideModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F,-0.2F, -0.2F, 0F,-0.2F, -0.2F, 0F,-0.2F, -0.2F, 0F,-0.2F, -0.2F, 0F,-0.2F, -0.2F, 0F,-0.2F, -0.2F, 0F,-0.2F, -0.2F, 0F); // Import ImportImportbolt
		slideModel[0].setRotationPoint(5F, 2.2F, -1F);

		barrelAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		stockAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(0F / 16F, 5F / 16F, 0F / 16F);
		gripAttachPoint = new Vector3f(0 /16F, 0F /16F, 0F /16F);

		gunSlideDistance = 0.25F;
		animationType = EnumAnimationType.PISTOL_CLIP;

		translateAll(0F, -7F, 0F);


		flipAll();
	}
}