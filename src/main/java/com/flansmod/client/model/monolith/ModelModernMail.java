//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelModernMail extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelModernMail() //Same as Filename
	{
		headModel = new ModelRendererTurbo[18];
		bodyModel = new ModelRendererTurbo[2];
		leftArmModel = new ModelRendererTurbo[2];
		rightArmModel = new ModelRendererTurbo[2];
		leftLegModel = new ModelRendererTurbo[3];
		rightLegModel = new ModelRendererTurbo[3];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		headModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		headModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 4
		headModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 5
		headModel[4] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 7
		headModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 9
		headModel[6] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 11
		headModel[7] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 12
		headModel[8] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 13
		headModel[9] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 15
		headModel[10] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 17
		headModel[11] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 30
		headModel[12] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 31
		headModel[13] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 32
		headModel[14] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 33
		headModel[15] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 34
		headModel[16] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 35
		headModel[17] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 36

		headModel[0].addShapeBox(-4F, -2F, -4F, 4, 2, 8, 0F,0.1F, 0.5F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 0
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -7.5F, -4F, 2, 3, 8, 0F,0.1F, 0.6F, 0.1F, 0F, 0.6F, 0.1F, 0F, 0.6F, 0.1F, 0.1F, 0.6F, 0.1F, 0.1F, 1F, 0.1F, 0F, 0.3F, 0.1F, 0F, 2F, 0.1F, 0.1F, 2F, 0.1F); // Box 2
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-2F, -7.5F, -4F, 4, 4, 8, 0F,0F, 0.6F, 0.1F, 0F, 0.6F, 0.1F, 0F, 0.6F, 0.1F, 0F, 0.6F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, 0F, 1F, 0.1F, 0F, 1F, 0.1F); // Box 4
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -3.5F, -4F, 1, 1, 8, 0F,0.1F, 0F, 0.1F, -0.6F, 0.5F, 0.1F, -0.3F, 0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, -0.3F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0.1F, 0F, 0.1F); // Box 5
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -7.5F, -4F, 2, 3, 8, 0F,0.3F, 0.8F, 0.3F, 0F, 1F, 0.3F, 0F, 1F, 0.3F, 0.3F, 0.8F, 0.3F, 0.3F, 0.2F, 0.3F, 1.5F, 0.5F, 0.3F, 0.8F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F); // Box 7
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-2F, -7.5F, -4F, 4, 3, 8, 0F,0F, 1F, 0.3F, 0F, 1F, 0.3F, 0F, 1F, 0.3F, 0F, 1F, 0.3F, -1.5F, 0.5F, 0.3F, -1.5F, 0.5F, 0.3F, -0.8F, 0.2F, 0.3F, -0.8F, 0.2F, 0.3F); // Box 9
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -4.1F, -4F, 1, 4, 8, 0F,0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F); // Box 11
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-3F, -4.1F, 3F, 6, 4, 1, 0F,0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 12
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-3F, -2F, -4F, 3, 2, 1, 0F,0.3F, 0F, 0.3F, 0F, -1F, 0.3F, 0F, -1F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, -0.3F, 0.3F, 0.2F, -0.3F); // Box 13
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, 0.5F, -4F, 2, 2, 8, 0F,0.3F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, -0.5F, 0F, 0.3F, 0.5F, 1F, 0.3F, 0.5F, 1F, 0.3F, -0.5F, 0F, 0.3F); // Box 15
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-1.5F, 0.5F, -4F, 3, 3, 8, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 17
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(2F, -7.5F, -4F, 2, 3, 8, 0F,0F, 1F, 0.3F, 0.3F, 0.8F, 0.3F, 0.3F, 0.8F, 0.3F, 0F, 1F, 0.3F, 1.5F, 0.5F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.8F, 0.2F, 0.3F); // Box 30
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(3F, -4.1F, -4F, 1, 4, 8, 0F,0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 31
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(2F, 0.5F, -4F, 2, 2, 8, 0F,0.5F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 1F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0.5F, 1F, 0.3F); // Box 32
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(2F, -7.5F, -4F, 2, 3, 8, 0F,0F, 0.6F, 0.1F, 0.1F, 0.6F, 0.1F, 0.1F, 0.6F, 0.1F, 0F, 0.6F, 0.1F, 0F, 0.3F, 0.1F, 0.1F, 1F, 0.1F, 0.1F, 2F, 0.1F, 0F, 2F, 0.1F); // Box 33
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(3F, -3.5F, -4F, 1, 1, 8, 0F,-0.6F, 0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, -0.3F, 0.5F, 0.1F, -0.3F, 0.2F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0.2F, 0.1F); // Box 34
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(0F, -2F, -4F, 4, 2, 8, 0F,0F, 0.1F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 35
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(0F, -2F, -4F, 3, 2, 1, 0F,0F, -1F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.3F, 0F, -1F, -0.3F, 0F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, -0.3F, 0F, 0.2F, -0.3F); // Box 36
		headModel[17].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 18
		bodyModel[1] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 23

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 8, 10, 4, 0F,0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F); // Box 18
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 8.5F, -2F, 8, 6, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F); // Box 23
		bodyModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 37
		leftArmModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 38

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 10, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F); // Box 37
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 8F, -2F, 4, 2, 4, 0F,0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 38
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 17
		rightArmModel[1] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 21

		rightArmModel[0].addShapeBox(-3F, 8F, -2F, 4, 2, 4, 0F,0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 17
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -2F, -2F, 4, 10, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F); // Box 21
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 39
		leftLegModel[1] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 40
		leftLegModel[2] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 41

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 9, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 39
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 7.8F, -2F, 4, 3, 4, 0F,0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 40
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 41
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 24
		rightLegModel[1] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 11
		rightLegModel[2] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 61

		rightLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 9, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 24
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 11
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 7.8F, -2F, 4, 3, 4, 0F,0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 61
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);
	}
}