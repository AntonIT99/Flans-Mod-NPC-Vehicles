//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPalmyraMail extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelPalmyraMail() //Same as Filename
	{
		headModel = new ModelRendererTurbo[4];
		bodyModel = new ModelRendererTurbo[9];
		leftArmModel = new ModelRendererTurbo[2];
		rightArmModel = new ModelRendererTurbo[2];
		leftLegModel = new ModelRendererTurbo[2];
		rightLegModel = new ModelRendererTurbo[2];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 13
		headModel[1] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 11
		headModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 12
		headModel[3] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 7

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 13
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -1F, -4F, 16, 5, 4, 0F,0.1F, -0.2F, 0.1F, -7.9F, -0.2F, 0.1F, -7.9F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -3.9F, 0.1F, -7.9F, -3.9F, 0.1F, -7.9F, -1.9F, 0.1F, 0.1F, -1.9F, 0.1F); // Box 11
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -5F, -3F, 16, 10, 7, 0F,0.1F, 0F, 0.1F, -7.9F, 0F, 0.1F, -7.9F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -5.7F, 1.1F, -7.9F, -5.7F, 1.1F, -7.9F, -5.9F, 0.1F, 0.1F, -5.9F, 0.1F); // Box 12
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -1F, 0F, 16, 5, 4, 0F,0.1F, 0F, 0.1F, -7.9F, 0F, 0.1F, -7.9F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -1.9F, 0.1F, -7.9F, -1.9F, 0.1F, -7.9F, -3.9F, 0.1F, 0.1F, -3.9F, 0.1F); // Box 7
		headModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 33
		bodyModel[1] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 34
		bodyModel[3] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 15
		bodyModel[4] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 294
		bodyModel[5] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 297
		bodyModel[6] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 5
		bodyModel[7] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 6
		bodyModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 12

		bodyModel[0].addShapeBox(-8F, 1.9F, -4F, 16, 7, 8, 0F,-3.9F, 0.5F, -1.9F, -3.9F, 0.5F, -1.9F, -3.9F, 0.5F, -1.9F, -3.9F, 0.5F, -1.9F, -3.9F, 0.1F, -1.9F, -3.9F, 0.1F, -1.9F, -3.9F, 0.1F, -1.9F, -3.9F, 0.1F, -1.9F); // Box 33
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, -0.1F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 1
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0F, -0.1F, -2F, 4, 2, 4, 0F,0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 34
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 8.5F, -2F, 8, 1, 4, 0F,0.4F, 0.5F, 0.4F, 0.4F, 0.5F, 0.4F, 0.4F, 0.5F, 0.4F, 0.4F, 0.5F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F); // Box 15
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-0.5F, -0.4F, -2F, 15, 6, 4, 0F,-0.3F, 0F, 0.5F, -9.7F, -0.2F, 0.5F, -9.7F, -0.2F, 0.5F, -0.3F, 0F, 0.5F, -0.4F, -2F, 0.7F, -10.4F, -4F, 0.5F, -10.4F, -4F, 0.5F, -0.4F, -2F, 0.7F); // Box 294
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4.8F, -0.4F, -2F, 15, 6, 4, 0F,0F, -0.2F, 0.5F, -10.3F, 0F, 0.5F, -10.3F, 0F, 0.5F, 0F, -0.2F, 0.5F, -0.8F, -4F, 0.5F, -10.3F, -2F, 0.7F, -10.3F, -2F, 0.7F, -0.8F, -4F, 0.5F); // Box 297
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 7.4F, -4F, 8, 10, 8, 0F,0.1F, -2F, -1.9F, 0.1F, -2F, -1.9F, 0.1F, -2F, -1.9F, 0.1F, -2F, -1.9F, 0.4F, -2F, -1.6F, 0.4F, -2F, -1.6F, 0.4F, -2F, -1.6F, 0.4F, -2F, -1.6F); // Box 5
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 9.9F, -2F, 8, 7, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 6
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(2F, 8F, -2.3F, 1, 8, 1, 0F,0.4F, 0.5F, 0.4F, 0.4F, 0.5F, 0.4F, 0.4F, 0.5F, 0.4F, 0.4F, 0.5F, 0.4F, 0.4F, 0.1F, 0.6F, 0.4F, 0.1F, 0.6F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F); // Box 12
		bodyModel[8].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13
		leftArmModel[1] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 14

		leftArmModel[0].addShapeBox(-3F, -6.1F, -4F, 8, 16, 8, 0F,-1.8F, -3.8F, -1.8F, -1.8F, -3.8F, -1.8F, -1.8F, -3.8F, -1.8F, -1.8F, -3.8F, -1.8F, -1.8F, -3.8F, -1.8F, -1.8F, -3.8F, -1.8F, -1.8F, -3.8F, -1.8F, -1.8F, -3.8F, -1.8F); // Box 13
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 14
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 7

		rightArmModel[0].addShapeBox(-5F, -6.1F, -4F, 8, 16, 8, 0F,-1.8F, -3.8F, -1.8F, -1.8F, -3.8F, -1.8F, -1.8F, -3.8F, -1.8F, -1.8F, -3.8F, -1.8F, -1.8F, -3.8F, -1.8F, -1.8F, -3.8F, -1.8F, -1.8F, -3.8F, -1.8F, -1.8F, -3.8F, -1.8F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 7
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 161
		leftLegModel[1] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 162

		leftLegModel[0].addShapeBox(-2F, 4.7F, -2F, 4, 7, 4, 0F,0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 161
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 11.1F, -3F, 4, 1, 5, 0F,0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0.5F, 0.1F, 0.2F, 0.5F, 0.1F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 162
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 402

		rightLegModel[0].addShapeBox(-2F, 11.1F, -3F, 4, 1, 5, 0F,0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0.5F, 0.1F, 0.2F, 0.5F, 0.1F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 4.7F, -2F, 4, 7, 4, 0F,0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 402
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);
	}
}