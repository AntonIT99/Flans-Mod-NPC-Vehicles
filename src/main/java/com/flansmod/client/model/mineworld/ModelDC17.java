//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.6
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.mineworld;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelDC17 extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelDC17()
	{
		gunModel = new ModelRendererTurbo[8];
		gunModel[0] = new ModelRendererTurbo(this, 100, 165, textureX, textureY); // Import Release
		gunModel[1] = new ModelRendererTurbo(this, 113, 150, textureX, textureY); // Import Body
		gunModel[2] = new ModelRendererTurbo(this, 100, 150, textureX, textureY); // Import Grip
		gunModel[3] = new ModelRendererTurbo(this, 100, 175, textureX, textureY); // Import Body2
		gunModel[4] = new ModelRendererTurbo(this, 113, 150, textureX, textureY); // Import Body3
		gunModel[5] = new ModelRendererTurbo(this, 100, 165, textureX, textureY); // Import Body5
		gunModel[6] = new ModelRendererTurbo(this, 100, 175, textureX, textureY); // Import Body4
		gunModel[7] = new ModelRendererTurbo(this, 113, 150, textureX, textureY); // Import Barrel

		gunModel[0].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Import Release
		gunModel[0].setRotationPoint(1.5F, -3.8F, -1F);
		gunModel[0].rotateAngleZ = -1.57079633F;

		gunModel[1].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Import Body
		gunModel[1].setRotationPoint(-3F, -4.25F, -1F);

		gunModel[2].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Import Grip
		gunModel[2].setRotationPoint(-1F, -5F, -1F);
		gunModel[2].rotateAngleZ = -0.34906585F;

		gunModel[3].addBox(-0.89F, 0F, 0F, 2, 1, 2, 0F); // Import Body2
		gunModel[3].setRotationPoint(-2.5F, -4F, -1F);
		gunModel[3].rotateAngleZ = 1.11701072F;

		gunModel[4].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Import Body3
		gunModel[4].setRotationPoint(-2F, -5F, -1F);

		gunModel[5].addBox(0F, 0F, 0F, 1, 8, 2, 0F); // Import Body5
		gunModel[5].setRotationPoint(5F, -3.75F, -1F);
		gunModel[5].rotateAngleZ = -1.57079633F;

		gunModel[6].addBox(-1.1F, 0F, 0F, 2, 1, 2, 0F); // Import Body4
		gunModel[6].setRotationPoint(4.5F, -4F, -1F);
		gunModel[6].rotateAngleZ = -1.11701072F;

		gunModel[7].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Barrel
		gunModel[7].setRotationPoint(4.5F, -4F, -0.5F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 100, 150, textureX, textureY); // Import Magazine

		ammoModel[0].addBox(0F, 2F, 0F, 2, 3, 1, 0F); // Import Magazine
		ammoModel[0].setRotationPoint(-1F, -5F, -0.5F);
		ammoModel[0].rotateAngleZ = -0.34906585F;



		barrelAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		stockAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		gripAttachPoint = new Vector3f(0 /16F, 0F /16F, 0F /16F);

		gunSlideDistance = 0F;
		animationType = EnumAnimationType.PISTOL_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}