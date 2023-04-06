//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPlagueDoctor extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 128;

	public ModelPlagueDoctor() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[7];
		leftArmModel = new ModelRendererTurbo[3];
		rightArmModel = new ModelRendererTurbo[3];
		leftLegModel = new ModelRendererTurbo[4];
		rightLegModel = new ModelRendererTurbo[4];
		skirtFrontModel = new ModelRendererTurbo[1];
		skirtRearModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
		initskirtFrontModel_1();
		initskirtRearModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 15
		bodyModel[1] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 19
		bodyModel[2] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 290
		bodyModel[3] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 291
		bodyModel[4] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 292
		bodyModel[5] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 294
		bodyModel[6] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 297

		bodyModel[0].addShapeBox(-4F, 8.6F, -2F, 8, 1, 4, 0F,0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.3F); // Box 15
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 10.3F, -2F, 8, 10, 4, 0F,0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.8F, 0.7F, 0.8F, 0.8F, 0.7F, 0.8F, 0.8F, 0.7F, 0.8F, 0.8F, 0.7F, 0.8F); // Box 19
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 0F, -2F, 8, 8, 4, 0F,0.35F, 0.1F, 0.35F, 0.35F, 0.1F, 0.35F, 0.35F, 0.1F, 0.35F, 0.35F, 0.1F, 0.35F, 0.35F, 0.1F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F); // Box 290
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 8F, -2F, 8, 1, 4, 0F,0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 291
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 9.3F, -2F, 8, 1, 4, 0F,0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.3F, -0.1F, 0.3F, 0.3F, -0.1F, 0.3F, 0.3F, -0.1F, 0.3F, 0.3F, -0.1F, 0.3F); // Box 292
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-0.5F, -0.4F, -2F, 5, 1, 4, 0F,-0.3F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.4F, 3F, 0.7F, 0.2F, 2F, 0.5F, 0.2F, 2F, 0.5F, -0.5F, 3F, 0.7F); // Box 294
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4.8F, -0.4F, -2F, 5, 1, 4, 0F,0.2F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 2F, 0.5F, -0.3F, 3F, 0.7F, -0.5F, 3F, 0.7F, 0.2F, 2F, 0.5F); // Box 297
		bodyModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 21
		leftArmModel[1] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 1
		leftArmModel[2] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 296

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 10, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F); // Box 21
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 8F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 1
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-0.0999999999999996F, -2.4F, -2F, 2, 1, 4, 0F,0.2F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0.2F, 2F, 0.5F); // Box 296
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 20
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 0
		rightArmModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 298

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 10, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F); // Box 20
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 8F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 0
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-2.1F, -2.4F, -2F, 2, 1, 4, 0F,-0.4F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, -0.4F, 0F, 0.5F, 0F, 0.2F, 0.5F, 0.2F, 2F, 0.5F, 0.2F, 2F, 0.5F, 0F, 0.2F, 0.5F); // Box 298
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 2
		leftLegModel[1] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 3
		leftLegModel[2] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 4
		leftLegModel[3] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 5

		leftLegModel[0].addShapeBox(-2F, 1F, -2F, 4, 6, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 2
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 7F, -2F, 4, 1, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 3
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 7.4F, -2F, 4, 4, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 4
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 5
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 22
		rightLegModel[2] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 0
		rightLegModel[3] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 1

		rightLegModel[0].addShapeBox(-2F, 7.4F, -2F, 4, 4, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 1F, -2F, 4, 6, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 22
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 7F, -2F, 4, 1, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 1
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 2


		skirtFrontModel[0].addShapeBox(-4F, -1.7F, -2F, 8, 10, 1, 0F,0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.8F, 0.7F, 0.8F, 0.8F, 0.7F, 0.8F, 0.8F, 0.7F, 0.8F, 0.8F, 0.7F, 0.8F); // Box 2
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);


	}
	
	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 3



		skirtRearModel[0].addShapeBox(-4F, -1.7F, 1F, 8, 10, 1, 0F,0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.8F, 0.7F, 0.8F, 0.8F, 0.7F, 0.8F, 0.8F, 0.7F, 0.8F, 0.8F, 0.7F, 0.8F); // Box 3
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);
	}
}