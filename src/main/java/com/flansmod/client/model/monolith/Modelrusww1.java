//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: rusww1
// Model Creator: 
// Created on: 29.12.2019 - 15:40:32
// Last changed on: 29.12.2019 - 15:40:32

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelrusww1 extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 32;

	public Modelrusww1() //Same as Filename
	{
		headModel = new ModelRendererTurbo[6];
		headModel[0] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 28
		headModel[1] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 29
		headModel[2] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 30
		headModel[3] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 31
		headModel[4] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 32
		headModel[5] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 33

		headModel[0].addShapeBox(-4.5F, -9F, -4.5F, 9, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4.5F, -10F, -4.5F, 9, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-2F, -7F, -6.5F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 30
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -7F, -6.5F, 2, 1, 3, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F); // Box 31
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(2F, -7F, -6.5F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F); // Box 32
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4.5F, -11F, -4.5F, 9, 3, 9, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, -2F, 1F, 1F, -2F, 1F, 1F, -2F, 1F, 1F, -2F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 33
		headModel[5].setRotationPoint(0F, 0F, 0F);


		bodyModel = new ModelRendererTurbo[11];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 10
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 12
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 13
		bodyModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 14
		bodyModel[5] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 16
		bodyModel[6] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 17
		bodyModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 19
		bodyModel[8] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 20
		bodyModel[9] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 21
		bodyModel[10] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 23

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 8, 12, 4, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 8F, 1F, 8, 1, 1, 0F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F); // Box 10
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 8F, -2F, 3, 1, 1, 0F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F); // Box 12
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(1F, 8F, -2F, 3, 1, 1, 0F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F); // Box 13
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-0.4F, 8F, -2F, 1, 1, 1, 0F, 0.325F, 0F, 0.4F, 0.325F, 0F, 0.4F, 0.325F, 0F, 0.4F, 0.325F, 0F, 0.4F, 0.325F, 0F, 0.4F, 0.325F, 0F, 0.4F, 0.325F, 0F, 0.4F, 0.325F, 0F, 0.4F); // Box 14
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 0F, -2F, 8, 12, 4, 0F, 2.15F, 0.25F, 0.45F, -8.3F, 0.5F, 0.45F, -8.3F, 0.5F, 0.45F, 2.15F, 0.25F, 0.45F, -6.45F, 0F, 0.45F, 1.2F, 0F, 0.45F, 1.2F, 0F, 0.45F, -6.8F, 0F, 0.45F); // Box 16
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(3F, 10F, -2F, 3, 3, 4, 0F, 1.95F, 0F, 0.45F, -2.15F, 0F, 0.45F, -2.15F, 0F, 0.45F, 1.65F, 0F, 0.45F, -1F, 1F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, -1F, 1F, 0.45F); // Box 17
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-3.5F, 8F, -3F, 2, 2, 1, 0F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F); // Box 19
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-3.5F, 8F, 2F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 20
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-3F, 7.2F, 2.3F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 21
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-0.5F, 0F, -2F, 1, 5, 1, 0F, 0.2F, 0F, 0.325F, 0.2F, 0F, 0.325F, 0.2F, 0F, 0.325F, 0.2F, 0F, 0.325F, 0.2F, 0F, 0.325F, 0.2F, 0F, 0.325F, 0.2F, 0F, 0.325F, 0.2F, 0F, 0.325F); // Box 23
		bodyModel[10].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[2];
		leftArmModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		leftArmModel[1] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 25

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 10, 4, 0F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2F, -0.5F, 4, 1, 1, 0F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, -0.8F, 0.125F, 0.125F, -0.8F, 0.125F, 0.125F, -0.8F, 0.125F, 0.125F, -0.8F, 0.125F); // Box 25
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[2];
		rightArmModel[0] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 24

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 10, 4, 0F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -2F, -0.5F, 4, 1, 1, 0F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, -0.8F, 0.125F, 0.125F, -0.8F, 0.125F, 0.125F, -0.8F, 0.125F, 0.125F, -0.8F, 0.125F); // Box 24
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[3];
		leftLegModel[0] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 4
		leftLegModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 6
		leftLegModel[2] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 9

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 6, 4, 0F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 4
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 6F, -2F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 10F, -3F, 4, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[3];
		rightLegModel[0] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 5
		rightLegModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 7
		rightLegModel[2] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 8

		rightLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 6, 4, 0F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 5
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 6F, -2F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 10F, -3F, 4, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);


	}
}