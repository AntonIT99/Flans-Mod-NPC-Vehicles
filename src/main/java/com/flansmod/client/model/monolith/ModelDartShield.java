//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelDartShield extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelDartShield() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[34];
		ammoModel = new ModelRendererTurbo[6];

		initgunModel_1();
		initammoModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 0
		gunModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 0
		gunModel[3] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 0
		gunModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 0
		gunModel[5] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 0
		gunModel[6] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 0
		gunModel[7] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 0
		gunModel[8] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 0
		gunModel[9] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 0
		gunModel[10] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 0
		gunModel[11] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 0
		gunModel[12] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 0
		gunModel[13] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 0
		gunModel[14] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 0
		gunModel[15] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 0
		gunModel[16] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 0
		gunModel[17] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 0
		gunModel[18] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 0
		gunModel[19] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 0
		gunModel[20] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 0
		gunModel[21] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 0
		gunModel[22] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 0
		gunModel[23] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 0
		gunModel[24] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 0
		gunModel[25] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 0
		gunModel[26] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 0
		gunModel[27] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 0
		gunModel[28] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 0
		gunModel[29] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 0
		gunModel[30] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 0
		gunModel[31] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 0
		gunModel[32] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 0
		gunModel[33] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 0

		gunModel[0].addBox(0F, 0F, 0F, 1, 6, 14, 0F); // Box 0
		gunModel[0].setRotationPoint(3F, 0F, 2F);

		gunModel[1].addShapeBox(0F, 10F, 0F, 1, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
		gunModel[1].setRotationPoint(3F, -4F, 2F);

		gunModel[2].addShapeBox(0F, 10F, 0F, 1, 4, 14, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[2].setRotationPoint(3F, -14F, 2F);

		gunModel[3].addShapeBox(0F, 14F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 0
		gunModel[3].setRotationPoint(3F, -4F, 3F);

		gunModel[4].addShapeBox(0F, 17F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 0
		gunModel[4].setRotationPoint(3F, -4F, 5F);

		gunModel[5].addShapeBox(0F, 14F, 0F, 1, 3, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[5].setRotationPoint(3F, -21F, 3F);

		gunModel[6].addShapeBox(0F, 17F, 0F, 1, 1, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[6].setRotationPoint(3F, -25F, 5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[7].setRotationPoint(3.3F, 1F, 7F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		gunModel[8].setRotationPoint(3.3F, 3F, 7F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 0
		gunModel[9].setRotationPoint(4.3F, 2.5F, 7.5F);

		gunModel[10].addShapeBox(0F, -1F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -0.95F, -1F, 0F, -0.95F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 0
		gunModel[10].setRotationPoint(4.3F, 2.51F, 7.5F);

		gunModel[11].addShapeBox(0F, -1F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.95F, -1F, 0F, -0.95F, -1F, 0F, 0F, -1F); // Box 0
		gunModel[11].setRotationPoint(4.3F, 4.51F, 7.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 30, 24, 0F,-0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -10F, -0.45F, 0F, -10F, -0.45F, -10F, 0F, -0.45F, -10F, 0F, -0.45F, -10F, -10F, -0.45F, -10F, -10F); // Box 0
		gunModel[12].setRotationPoint(3.5F, -7.5F, 2F);

		gunModel[13].addBox(0F, 0F, 0F, 1, 1, 13, 0F); // Box 0
		gunModel[13].setRotationPoint(2.5F, 3F, 2.5F);

		gunModel[14].addShapeBox(-0.5F, -6.5F, -0.5F, 1, 7, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		gunModel[14].setRotationPoint(2.5F, 4F, 4F);

		gunModel[15].addShapeBox(-0.5F, 4.5F, -0.5F, 1, 5, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 0
		gunModel[15].setRotationPoint(2.5F, -1F, 4F);

		gunModel[16].addShapeBox(-0.5F, 4.5F, -0.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 0
		gunModel[16].setRotationPoint(2.5F, 4F, 4F);

		gunModel[17].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 0
		gunModel[17].setRotationPoint(2.5F, 5F, 4F);

		gunModel[18].addShapeBox(-0.5F, -6F, -1.5F, 1, 3, 3, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, -1F); // Box 0
		gunModel[18].setRotationPoint(2.5F, 4F, 4F);

		gunModel[19].addShapeBox(-1.5F, -6F, -0.5F, 3, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F); // Box 0
		gunModel[19].setRotationPoint(2.5F, 4F, 4F);

		gunModel[20].addShapeBox(-0.5F, 4.5F, -0.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 0
		gunModel[20].setRotationPoint(2.5F, 4F, 5.5F);

		gunModel[21].addShapeBox(-0.5F, 4.5F, -0.5F, 1, 5, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 0
		gunModel[21].setRotationPoint(2.5F, -1F, 5.5F);

		gunModel[22].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 0
		gunModel[22].setRotationPoint(2.5F, 5F, 5.5F);

		gunModel[23].addShapeBox(-0.5F, -6.5F, -0.5F, 1, 7, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		gunModel[23].setRotationPoint(2.5F, 4F, 5.5F);

		gunModel[24].addShapeBox(-1.5F, -6F, -0.5F, 3, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F); // Box 0
		gunModel[24].setRotationPoint(2.5F, 4F, 5.5F);

		gunModel[25].addShapeBox(-0.5F, -6F, -1.5F, 1, 3, 3, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, -1F); // Box 0
		gunModel[25].setRotationPoint(2.5F, 4F, 5.5F);

		gunModel[26].addShapeBox(-0.5F, 4.5F, -0.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 0
		gunModel[26].setRotationPoint(2.5F, 4F, 7F);

		gunModel[27].addShapeBox(-0.5F, 4.5F, -0.5F, 1, 5, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 0
		gunModel[27].setRotationPoint(2.5F, -1F, 7F);

		gunModel[28].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 0
		gunModel[28].setRotationPoint(2.5F, 5F, 7F);

		gunModel[29].addShapeBox(-0.5F, -6.5F, -0.5F, 1, 7, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		gunModel[29].setRotationPoint(2.5F, 4F, 7F);

		gunModel[30].addShapeBox(-1.5F, -7F, -0.5F, 3, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F); // Box 0
		gunModel[30].setRotationPoint(2.5F, 5F, 7F);

		gunModel[31].addShapeBox(-0.5F, -6F, -1.5F, 1, 3, 3, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, -1F); // Box 0
		gunModel[31].setRotationPoint(2.5F, 4F, 7F);

		gunModel[32].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[32].setRotationPoint(2.2F, 3F, 3F);

		gunModel[33].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 0
		gunModel[33].setRotationPoint(2.2F, 9.5F, 3.5F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		ammoModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 0
		ammoModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 0
		ammoModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 3
		ammoModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 0
		ammoModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 0

		ammoModel[0].addShapeBox(-0.5F, -6.5F, -0.5F, 1, 7, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		ammoModel[0].setRotationPoint(1F, -2F, 0F);
		ammoModel[0].rotateAngleZ = 1.57079633F;

		ammoModel[1].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 5, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 0
		ammoModel[1].setRotationPoint(1F, -2F, 0F);
		ammoModel[1].rotateAngleZ = 1.57079633F;

		ammoModel[2].addShapeBox(-0.5F, 4.5F, -0.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 0
		ammoModel[2].setRotationPoint(1F, -2F, 0F);
		ammoModel[2].rotateAngleZ = 1.57079633F;

		ammoModel[3].addShapeBox(-0.5F, 0.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 3
		ammoModel[3].setRotationPoint(1F, -2F, 0F);
		ammoModel[3].rotateAngleZ = 1.57079633F;

		ammoModel[4].addShapeBox(-0.5F, -6F, -1.5F, 1, 3, 3, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, -1F); // Box 0
		ammoModel[4].setRotationPoint(1F, -2F, 0F);
		ammoModel[4].rotateAngleZ = 1.57079633F;

		ammoModel[5].addShapeBox(-1.5F, -6F, -0.5F, 3, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F); // Box 0
		ammoModel[5].setRotationPoint(1F, -2F, 0F);
		ammoModel[5].rotateAngleZ = 1.57079633F;
	}
}