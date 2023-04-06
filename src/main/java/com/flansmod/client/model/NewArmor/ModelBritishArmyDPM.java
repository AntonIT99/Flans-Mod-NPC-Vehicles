//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: class
// Model Creator: 
// Created on: 27.05.2020 - 12:42:52
// Last changed on: 27.05.2020 - 12:42:52

package com.flansmod.client.model.NewArmor; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBritishArmyDPM extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelBritishArmyDPM() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[28];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import 
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import 
		bodyModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import 
		bodyModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import 
		bodyModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import 
		bodyModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import 
		bodyModel[7] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import 
		bodyModel[8] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import 
		bodyModel[9] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import 
		bodyModel[10] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import 
		bodyModel[11] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import 
		bodyModel[12] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import 
		bodyModel[13] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Import 
		bodyModel[14] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Import 
		bodyModel[15] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import 
		bodyModel[16] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Import 
		bodyModel[17] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import 
		bodyModel[18] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import 
		bodyModel[19] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Import 
		bodyModel[20] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Import 
		bodyModel[21] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Import 
		bodyModel[22] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import 
		bodyModel[23] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Import 
		bodyModel[24] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Import 
		bodyModel[25] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import 
		bodyModel[26] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Import 
		bodyModel[27] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Import 

		bodyModel[0].addShapeBox(-3.9F, 7.5F, -2.2F, 3, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-0.5F, 1.4F, -2.15F, 1, 9, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F); // Import 
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-0.5F, 1.5F, -2.5F, 1, 1, 1, 0F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F); // Import 
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-0.5F, 4F, -2.5F, 1, 1, 1, 0F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F); // Import 
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-0.5F, 6.5F, -2.5F, 1, 1, 1, 0F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F); // Import 
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-0.5F, 9F, -2.5F, 1, 1, 1, 0F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F); // Import 
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, -0.1F, -2F, 4, 2, 4, 0F, 0.1F, 0.0F, 0.1F, -1.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Import 
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-0.5F, -0.1F, -2.15F, 2, 2, 1, 0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import 
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-1.5F, -0.1F, -2.12F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F); // Import 
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0F, -0.1F, -2F, 4, 2, 4, 0F, -1.0F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F); // Import 
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, 1.9F, -2F, 8, 10, 4, 0F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F); // Import 
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(2.05F, 1.25F, -1.5F, 1, 2, 3, 0F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F); // Import 
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(2.1F, 0F, -1.5F, 1, 1, 3, 0F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F); // Import 
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(1.1F, 0.5F, -1.5F, 1, 1, 3, 0F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F); // Import 
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(1.05F, 1.5F, -1.5F, 1, 3, 3, 0F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F); // Import 
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-2.1F, 0.5F, -1.5F, 1, 1, 3, 0F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F); // Import 
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-2.05F, 1.5F, -1.5F, 1, 3, 3, 0F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F); // Import 
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-2.9F, 7F, -2.55F, 1, 1, 1, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Import 
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(1.9F, 7F, -2.55F, 1, 1, 1, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Import 
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addBox(0.9F, 6.5F, -2.2F, 3, 1, 1, 0F); // Import 
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addBox(-3.9F, 6.5F, -2.2F, 3, 1, 1, 0F); // Import 
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addBox(0.9F, 7.5F, -2.15F, 3, 2, 1, 0F); // Import 
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-3.16F, 1.5F, -2.2F, 3, 1, 1, 0F, -0.35F, 0.05F, 0.0F, -0.5F, -0.7F, 0.0F, -0.5F, -0.7F, 0.0F, -0.35F, 0.05F, 0.0F, 0.0F, 0.0F, 0.0F, -0.88F, 0.75F, 0.0F, -0.88F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-3.8F, 3F, -2.15F, 3, 2, 1, 0F, -1.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 1.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.3F, 0.0F, -1.0F, 0.3F, 0.0F, 0.0F, -0.5F, 0.0F); // Import 
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(0.800000000000001F, 3F, -2.15F, 3, 2, 1, 0F, 0.0F, 0.5F, 0.0F, -1.0F, 1.5F, 0.0F, -1.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.3F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.3F, 0.0F); // Import 
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(0.16F, 1.5F, -2.2F, 3, 1, 1, 0F, -0.5F, -0.7F, 0.0F, -0.35F, 0.05F, 0.0F, -0.35F, 0.05F, 0.0F, -0.5F, -0.7F, 0.0F, -0.88F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.88F, 0.75F, 0.0F); // Import 
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-2.6F, 2.35F, -2.52F, 1, 1, 1, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Import 
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(1.6F, 2.35F, -2.52F, 1, 1, 1, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Import 
		bodyModel[27].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[4];
		leftArmModel[0] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import 
		leftArmModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import 
		leftArmModel[2] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 3
		leftArmModel[3] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import 

		leftArmModel[0].addShapeBox(-0.95F, -2.3F, -1F, 4, 1, 2, 0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F); // Import 
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(2.11F, -1.25F, -0.9F, 1, 8, 13, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -11.25F, 0.0F, 0.0F, -11.25F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, -11.25F, 0.0F, -7.0F, -11.25F); // Import 
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-0.95F, 5.5F, -2F, 4, 2, 4, 0F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 3
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1.1F, -2F, -2.1F, 8, 22, 8, 0F, 0.0F, 0.1F, 0.0F, -3.8F, 0.1F, 0.0F, -3.8F, 0.1F, -3.8F, 0.0F, 0.1F, -3.8F, 0.0F, -13F, 0.0F, -3.8F, -13F, 0.0F, -3.8F, -13F, -3.8F, 0.0F, -13F, -3.8F); // Import 
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[3];
		rightArmModel[0] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Import 
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 2
		rightArmModel[2] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Import 

		rightArmModel[0].addShapeBox(-3.05F, -2.3F, -1F, 4, 1, 2, 0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F); // Import 
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 5.5F, -2F, 4, 2, 4, 0F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 2
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3.1F, -2F, -2.1F, 8, 22, 8, 0F, 0.0F, 0.1F, 0.0F, -3.8F, 0.1F, 0.0F, -3.8F, 0.1F, -3.8F, 0.0F, 0.1F, -3.8F, 0.0F, -13F, 0.0F, -3.8F, -13F, 0.0F, -3.8F, -13F, -3.8F, 0.0F, -13F, -3.8F); // Import 
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[4];
		leftLegModel[0] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import 
		leftLegModel[1] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 144
		leftLegModel[2] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 145
		leftLegModel[3] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 146

		leftLegModel[0].addShapeBox(-2.1F, -1F, -2.1F, 8, 20, 8, 0F, 0.0F, 0.1F, 0.0F, -3.8F, 0.1F, 0.0F, -3.8F, 0.1F, -3.8F, 0.0F, 0.1F, -3.8F, 0.0F, -12.0F, 0.0F, -3.8F, -12.0F, 0.0F, -3.8F, -12.0F, -3.8F, 0.0F, -12.0F, -3.8F); // Import 
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 10F, -2.75F, 4, 2, 1, 0F, -0.375F, 0F, 0.27F, -0.375F, 0F, 0.125F, 0.125F, 0F, -0.125F, 0.025F, 0F, -0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, 0.125F, 0F, -0.125F, 0.075F, 0F, -0.125F); // Box 144
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 8.05F, -2F, 4, 4, 4, 0F, 0.145F, 0F, 0.145F, 0.145F, 0F, 0.145F, 0.145F, 0F, 0.145F, 0.145F, 0F, 0.145F, 0.145F, 0F, 0.145F, 0.145F, 0F, 0.145F, 0.145F, 0F, 0.145F, 0.145F, 0F, 0.145F); // Box 145
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 7F, -2F, 4, 1, 4, 0F, 0.205F, 0F, 0.205F, 0.205F, 0F, 0.205F, 0.205F, 0F, 0.205F, 0.205F, 0F, 0.205F, 0.205F, 0.1F, 0.205F, 0.205F, 0.1F, 0.205F, 0.205F, 0.1F, 0.205F, 0.205F, 0.1F, 0.205F); // Box 146
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[4];
		rightLegModel[0] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Import 
		rightLegModel[1] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Import Box115
		rightLegModel[2] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import Box76
		rightLegModel[3] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Import Box87

		rightLegModel[0].addShapeBox(-2.1F, -1F, -2.1F, 8, 20, 8, 0F, 0.0F, 0.1F, 0.0F, -3.8F, 0.1F, 0.0F, -3.8F, 0.1F, -3.8F, 0.0F, 0.1F, -3.8F, 0.0F, -12.0F, 0.0F, -3.8F, -12.0F, 0.0F, -3.8F, -12.0F, -3.8F, 0.0F, -12.0F, -3.8F); // Import 
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 8.05F, -2F, 4, 4, 4, 0F, 0.145F, 0F, 0.145F, 0.145F, 0F, 0.145F, 0.145F, 0F, 0.145F, 0.145F, 0F, 0.145F, 0.145F, 0F, 0.145F, 0.145F, 0F, 0.145F, 0.145F, 0F, 0.145F, 0.145F, 0F, 0.145F); // Import Box115
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 10F, -2.75F, 4, 2, 1, 0F, -0.375F, 0F, 0.27F, -0.375F, 0F, 0.125F, 0.125F, 0F, -0.125F, 0.025F, 0F, -0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, 0.125F, 0F, -0.125F, 0.075F, 0F, -0.125F); // Import Box76
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 7F, -2F, 4, 1, 4, 0F, 0.205F, 0F, 0.205F, 0.205F, 0F, 0.205F, 0.205F, 0F, 0.205F, 0.205F, 0F, 0.205F, 0.205F, 0.1F, 0.205F, 0.205F, 0.1F, 0.205F, 0.205F, 0.1F, 0.205F, 0.205F, 0.1F, 0.205F); // Import Box87
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);


	}
}