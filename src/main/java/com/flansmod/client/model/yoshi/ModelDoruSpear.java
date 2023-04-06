//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Dory Spear
// Model Creator: 
// Created on: 24.04.2019 - 17:01:17
// Last changed on: 24.04.2019 - 17:01:17

package com.flansmod.client.model.yoshi; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelDoruSpear extends ModelGun //Same as Filename
{
	int textureX = 80;
	int textureY = 19;

	public ModelDoruSpear() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[32];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 3, textureX, textureY); // Left Body
		gunModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Middle Body
		gunModel[2] = new ModelRendererTurbo(this, 1, 6, textureX, textureY); // Right Body
		gunModel[3] = new ModelRendererTurbo(this, 44, 12, textureX, textureY); // Blade Holder 1 Right
		gunModel[4] = new ModelRendererTurbo(this, 44, 16, textureX, textureY); // Blade Holder 1 Left
		gunModel[5] = new ModelRendererTurbo(this, 44, 14, textureX, textureY); // Blade Holder 1 Mid
		gunModel[6] = new ModelRendererTurbo(this, 38, 14, textureX, textureY); // Blade Holder Mid Left
		gunModel[7] = new ModelRendererTurbo(this, 38, 12, textureX, textureY); // Blade Holder Mid Right
		gunModel[8] = new ModelRendererTurbo(this, 32, 12, textureX, textureY); // Blade Holder Tip Right
		gunModel[9] = new ModelRendererTurbo(this, 32, 14, textureX, textureY); // Blade Holder Tip Left
		gunModel[10] = new ModelRendererTurbo(this, 25, 12, textureX, textureY); // Box 17
		gunModel[11] = new ModelRendererTurbo(this, 25, 14, textureX, textureY); // Box 18
		gunModel[12] = new ModelRendererTurbo(this, 19, 14, textureX, textureY); // Box 14
		gunModel[13] = new ModelRendererTurbo(this, 13, 14, textureX, textureY); // Box 15
		gunModel[14] = new ModelRendererTurbo(this, 19, 12, textureX, textureY); // Box 17
		gunModel[15] = new ModelRendererTurbo(this, 13, 12, textureX, textureY); // Box 18
		gunModel[16] = new ModelRendererTurbo(this, 7, 14, textureX, textureY); // Box 18
		gunModel[17] = new ModelRendererTurbo(this, 7, 12, textureX, textureY); // Box 19
		gunModel[18] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 20
		gunModel[19] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 23
		gunModel[20] = new ModelRendererTurbo(this, 50, 16, textureX, textureY); // Box 24
		gunModel[21] = new ModelRendererTurbo(this, 50, 14, textureX, textureY); // Box 26
		gunModel[22] = new ModelRendererTurbo(this, 50, 12, textureX, textureY); // Box 27
		gunModel[23] = new ModelRendererTurbo(this, 56, 12, textureX, textureY); // Box 29
		gunModel[24] = new ModelRendererTurbo(this, 56, 14, textureX, textureY); // Box 30
		gunModel[25] = new ModelRendererTurbo(this, 56, 16, textureX, textureY); // Box 31
		gunModel[26] = new ModelRendererTurbo(this, 60, 14, textureX, textureY); // Box 33
		gunModel[27] = new ModelRendererTurbo(this, 60, 12, textureX, textureY); // Box 34
		gunModel[28] = new ModelRendererTurbo(this, 65, 12, textureX, textureY); // Box 35
		gunModel[29] = new ModelRendererTurbo(this, 69, 12, textureX, textureY); // Box 36
		gunModel[30] = new ModelRendererTurbo(this, 69, 14, textureX, textureY); // Box 37
		gunModel[31] = new ModelRendererTurbo(this, 65, 14, textureX, textureY); // Box 38

		gunModel[0].addShapeBox(-20F, 0F, 0F, 38, 1, 1, 0F,0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Left Body
		gunModel[0].setRotationPoint(-2F, -2.5F, -0.25F);

		gunModel[1].addShapeBox(-20F, 0F, 0F, 38, 1, 1, 0F,0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F); // Middle Body
		gunModel[1].setRotationPoint(-2F, -2.5F, -0.5F);

		gunModel[2].addShapeBox(-20F, 0F, 0F, 38, 1, 1, 0F,0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F); // Right Body
		gunModel[2].setRotationPoint(-2F, -2.5F, -0.75F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.325F, -0.325F, 0F, -0.375F, -0.45F, 0F, -0.125F, -0.25F, 0F, -0.075F, -0.375F, 0F, -0.325F, -0.325F, 0F, -0.375F, -0.45F, 0F, -0.125F, -0.25F, 0F, -0.075F, -0.375F); // Blade Holder 1 Right
		gunModel[3].setRotationPoint(16F, -2.5F, -0.75F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.075F, -0.375F, 0F, -0.125F, -0.25F, 0F, -0.375F, -0.45F, 0F, -0.325F, -0.325F, 0F, -0.075F, -0.375F, 0F, -0.125F, -0.25F, 0F, -0.375F, -0.45F, 0F, -0.325F, -0.325F); // Blade Holder 1 Left
		gunModel[4].setRotationPoint(16F, -2.5F, -0.25F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.075F, -0.375F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.075F, -0.375F, 0F, -0.075F, -0.375F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.075F, -0.375F); // Blade Holder 1 Mid
		gunModel[5].setRotationPoint(16F, -2.5F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.125F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.575F, 0F, -0.375F, -0.45F, 0F, -0.125F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.575F, 0F, -0.375F, -0.45F); // Blade Holder Mid Left
		gunModel[6].setRotationPoint(18F, -2.5F, -0.25F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.375F, -0.45F, 0F, -0.5F, -0.575F, 0F, -0.25F, -0.3F, 0F, -0.125F, -0.3F, 0F, -0.375F, -0.45F, 0F, -0.5F, -0.575F, 0F, -0.25F, -0.25F, 0F, -0.125F, -0.25F); // Blade Holder Mid Right
		gunModel[7].setRotationPoint(18F, -2.5F, -0.75F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, -0.575F, 0.125F, -0.5F, -0.775F, 0.125F, -0.475F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.575F, 0.125F, -0.5F, -0.775F, 0.125F, -0.475F, -0.25F, 0F, -0.25F, -0.25F); // Blade Holder Tip Right
		gunModel[8].setRotationPoint(20F, -2.5F, -0.75F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0.125F, -0.475F, -0.25F, 0.125F, -0.5F, -0.775F, 0F, -0.5F, -0.575F, 0F, -0.25F, -0.25F, 0.125F, -0.475F, -0.25F, 0.125F, -0.5F, -0.775F, 0F, -0.5F, -0.575F); // Blade Holder Tip Left
		gunModel[9].setRotationPoint(20F, -2.5F, -0.25F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.25F, -0.725F, -0.25F, 0F, -0.675F, -0.25F, 0.125F, -0.25F, -0.75F, -0.125F, -0.25F, -0.75F, -0.25F, -0.725F, -0.25F, 0F, -0.675F, -0.25F, 0.125F, -0.25F, -0.75F, -0.125F, -0.25F); // Box 17
		gunModel[10].setRotationPoint(16.75F, -2.5F, -0.75F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.25F, -0.725F, -0.25F, 0F, -0.675F, -0.25F, 0.125F, -0.25F, -0.75F, -0.125F, -0.25F, -0.75F, -0.25F, -0.725F, -0.25F, 0F, -0.675F, -0.25F, 0.125F, -0.25F, -0.75F, -0.125F, -0.25F); // Box 18
		gunModel[11].setRotationPoint(16.75F, -1.5F, 0.75F);
		gunModel[11].rotateAngleX = 3.14159265F;

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.675F, -0.5F, -0.1F, -0.625F, -0.5F, 0.025F, -0.25F, -0.75F, 0.125F, -0.25F, -0.75F, 0F, -0.675F, -0.5F, -0.1F, -0.625F, -0.5F, 0.025F, -0.25F, -0.75F, 0.125F, -0.25F); // Box 14
		gunModel[12].setRotationPoint(17.75F, -1.5F, 0.75F);
		gunModel[12].rotateAngleX = 3.14159265F;

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, -0.625F, -0.25F, -0.225F, -0.625F, -0.25F, -0.1F, -0.25F, -0.75F, 0.025F, -0.25F, -0.75F, -0.1F, -0.625F, -0.25F, -0.225F, -0.625F, -0.25F, -0.1F, -0.25F, -0.75F, 0.025F, -0.25F); // Box 15
		gunModel[13].setRotationPoint(18.5F, -1.5F, 0.75F);
		gunModel[13].rotateAngleX = 3.14159265F;

		gunModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.675F, -0.5F, -0.1F, -0.625F, -0.5F, 0.025F, -0.25F, -0.75F, 0.125F, -0.25F, -0.75F, 0F, -0.675F, -0.5F, -0.1F, -0.625F, -0.5F, 0.025F, -0.25F, -0.75F, 0.125F, -0.25F); // Box 17
		gunModel[14].setRotationPoint(17.75F, -2.5F, -0.75F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, -0.625F, -0.25F, -0.225F, -0.625F, -0.25F, -0.1F, -0.25F, -0.75F, 0.025F, -0.25F, -0.75F, -0.1F, -0.625F, -0.25F, -0.225F, -0.625F, -0.25F, -0.1F, -0.25F, -0.75F, 0.025F, -0.25F); // Box 18
		gunModel[15].setRotationPoint(18.5F, -2.5F, -0.75F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.225F, -0.625F, -0.25F, -0.4F, -0.725F, -0.25F, -0.275F, -0.25F, -0.75F, -0.1F, -0.25F, -0.75F, -0.225F, -0.625F, -0.25F, -0.4F, -0.725F, -0.25F, -0.275F, -0.25F, -0.75F, -0.1F, -0.25F); // Box 18
		gunModel[16].setRotationPoint(19.5F, -1.5F, 0.75F);
		gunModel[16].rotateAngleX = 3.14159265F;

		gunModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.225F, -0.625F, -0.25F, -0.4F, -0.725F, -0.25F, -0.275F, -0.25F, -0.75F, -0.1F, -0.25F, -0.75F, -0.225F, -0.625F, -0.25F, -0.4F, -0.725F, -0.25F, -0.275F, -0.25F, -0.75F, -0.1F, -0.25F); // Box 19
		gunModel[17].setRotationPoint(19.5F, -2.5F, -0.75F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.4F, -0.725F, -0.375F, -0.5F, -0.75F, -0.375F, -0.475F, -0.25F, -0.75F, -0.275F, -0.25F, -0.75F, -0.4F, -0.725F, -0.375F, -0.5F, -0.75F, -0.375F, -0.475F, -0.25F, -0.75F, -0.275F, -0.25F); // Box 20
		gunModel[18].setRotationPoint(20.5F, -2.5F, -0.75F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.4F, -0.725F, -0.375F, -0.5F, -0.75F, -0.375F, -0.475F, -0.25F, -0.75F, -0.275F, -0.25F, -0.75F, -0.4F, -0.725F, -0.375F, -0.5F, -0.75F, -0.375F, -0.475F, -0.25F, -0.75F, -0.275F, -0.25F); // Box 23
		gunModel[19].setRotationPoint(20.5F, -1.5F, 0.75F);
		gunModel[19].rotateAngleX = 3.14159265F;

		gunModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.1F, -0.375F, 0F, -0.225F, -0.25F, 0F, -0.475F, -0.5F, 0F, -0.35F, -0.35F, 0F, -0.1F, -0.375F, 0F, -0.225F, -0.25F, 0F, -0.475F, -0.5F, 0F, -0.35F, -0.35F); // Box 24
		gunModel[20].setRotationPoint(-22F, -1.5F, -0.25F);
		gunModel[20].rotateAngleX = 3.14159265F;
		gunModel[20].rotateAngleY = -3.14159265F;

		gunModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.1F, -0.375F, 0F, -0.225F, -0.5F, 0F, -0.225F, -0.5F, 0F, -0.1F, -0.375F, 0F, -0.1F, -0.375F, 0F, -0.225F, -0.5F, 0F, -0.225F, -0.5F, 0F, -0.1F, -0.375F); // Box 26
		gunModel[21].setRotationPoint(-22F, -1.5F, -0.5F);
		gunModel[21].rotateAngleX = 3.14159265F;
		gunModel[21].rotateAngleY = -3.14159265F;

		gunModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.475F, -0.5F, 0F, -0.225F, -0.25F, 0F, -0.1F, -0.375F, 0F, -0.35F, -0.35F, 0F, -0.475F, -0.5F, 0F, -0.225F, -0.25F, 0F, -0.1F, -0.375F); // Box 27
		gunModel[22].setRotationPoint(-22F, -1.5F, -0.75F);
		gunModel[22].rotateAngleX = 3.14159265F;
		gunModel[22].rotateAngleY = -3.14159265F;

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.5F, 0F, -0.475F, -0.6F, 0F, -0.325F, -0.25F, 0F, -0.225F, -0.375F, 0F, -0.45F, -0.5F, 0F, -0.475F, -0.6F, 0F, -0.325F, -0.25F, 0F, -0.225F, -0.375F); // Box 29
		gunModel[23].setRotationPoint(-24F, -1.5F, -0.75F);
		gunModel[23].rotateAngleX = 3.14159265F;
		gunModel[23].rotateAngleY = -3.14159265F;

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.225F, -0.375F, 0F, -0.325F, -0.5F, 0F, -0.325F, -0.5F, 0F, -0.225F, -0.375F, 0F, -0.225F, -0.375F, 0F, -0.325F, -0.5F, 0F, -0.325F, -0.5F, 0F, -0.225F, -0.375F); // Box 30
		gunModel[24].setRotationPoint(-24F, -1.5F, -0.5F);
		gunModel[24].rotateAngleX = 3.14159265F;
		gunModel[24].rotateAngleY = -3.14159265F;

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.225F, -0.375F, 0F, -0.325F, -0.25F, 0F, -0.475F, -0.6F, 0F, -0.45F, -0.5F, 0F, -0.225F, -0.375F, 0F, -0.325F, -0.25F, 0F, -0.475F, -0.6F, 0F, -0.45F, -0.5F); // Box 31
		gunModel[25].setRotationPoint(-24F, -1.5F, -0.25F);
		gunModel[25].rotateAngleX = 3.14159265F;
		gunModel[25].rotateAngleY = -3.14159265F;

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.325F, -0.25F, 0F, -0.325F, -0.25F, 0F, -0.475F, -0.6F, 0F, -0.475F, -0.6F, 0F, -0.325F, -0.25F, 0F, -0.325F, -0.25F, 0F, -0.475F, -0.6F, 0F, -0.475F, -0.6F); // Box 33
		gunModel[26].setRotationPoint(-25F, -1.5F, -0.25F);
		gunModel[26].rotateAngleX = 3.14159265F;
		gunModel[26].rotateAngleY = -3.14159265F;

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.475F, -0.6F, 0F, -0.475F, -0.6F, 0F, -0.325F, -0.25F, 0F, -0.325F, -0.25F, 0F, -0.475F, -0.6F, 0F, -0.475F, -0.6F, 0F, -0.325F, -0.25F, 0F, -0.325F, -0.25F); // Box 34
		gunModel[27].setRotationPoint(-25F, -1.5F, -0.75F);
		gunModel[27].rotateAngleX = 3.14159265F;
		gunModel[27].rotateAngleY = -3.14159265F;

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.7F, -0.85F, -0.5F, -0.6F, -0.85F, -0.325F, -0.25F, 0F, -0.425F, -0.25F, 0F, -0.5F, -0.7F, -0.85F, -0.5F, -0.6F, -0.85F, -0.325F, -0.25F, 0F, -0.425F, -0.25F); // Box 35
		gunModel[28].setRotationPoint(-26F, -1.5F, -0.75F);
		gunModel[28].rotateAngleX = 3.14159265F;
		gunModel[28].rotateAngleY = -3.14159265F;

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.6F, -0.85F, -0.5F, -0.75F, -0.85F, -0.5F, -0.25F, 0F, -0.325F, -0.25F, 0F, -0.5F, -0.6F, -0.85F, -0.5F, -0.75F, -0.85F, -0.5F, -0.25F, 0F, -0.325F, -0.25F); // Box 36
		gunModel[29].setRotationPoint(-26.15F, -1.5F, -0.75F);
		gunModel[29].rotateAngleX = 3.14159265F;
		gunModel[29].rotateAngleY = -3.14159265F;

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.75F, -0.85F, -0.5F, -0.6F, -0.85F, -0.325F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.75F, -0.85F, -0.5F, -0.6F, -0.85F, -0.325F, -0.25F, 0F, -0.5F, -0.25F); // Box 37
		gunModel[30].setRotationPoint(-26.3F, -1.5F, 0.75F);
		gunModel[30].rotateAngleX = 3.14159265F;

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.6F, -0.85F, -0.5F, -0.7F, -0.85F, -0.425F, -0.25F, 0F, -0.325F, -0.25F, 0F, -0.5F, -0.6F, -0.85F, -0.5F, -0.7F, -0.85F, -0.425F, -0.25F, 0F, -0.325F, -0.25F); // Box 38
		gunModel[31].setRotationPoint(-26.15F, -1.5F, 0.75F);
		gunModel[31].rotateAngleX = 3.14159265F;
	}
}