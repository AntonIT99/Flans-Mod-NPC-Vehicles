//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelmilanPlate extends ModelCustomArmour //Same as Filename
{
	int textureX = 256;
	int textureY = 64;

	public ModelmilanPlate() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[35];
		leftArmModel = new ModelRendererTurbo[13];
		rightArmModel = new ModelRendererTurbo[14];
		leftLegModel = new ModelRendererTurbo[7];
		rightLegModel = new ModelRendererTurbo[7];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 33
		bodyModel[1] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 68
		bodyModel[2] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 69
		bodyModel[3] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 91
		bodyModel[4] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 92
		bodyModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 105
		bodyModel[6] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 106
		bodyModel[7] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 107
		bodyModel[8] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 108
		bodyModel[9] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 15
		bodyModel[10] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 89
		bodyModel[11] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 50
		bodyModel[12] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 54
		bodyModel[13] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 59
		bodyModel[14] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 60
		bodyModel[15] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 61
		bodyModel[16] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 62
		bodyModel[17] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 56
		bodyModel[18] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 69
		bodyModel[19] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 55
		bodyModel[20] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 68
		bodyModel[21] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 66
		bodyModel[22] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 71
		bodyModel[23] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 105
		bodyModel[24] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 52
		bodyModel[25] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 76
		bodyModel[26] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 46
		bodyModel[27] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 47
		bodyModel[28] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 48
		bodyModel[29] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 49
		bodyModel[30] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // skirtmail
		bodyModel[31] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box mail
		bodyModel[32] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 53
		bodyModel[33] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 54
		bodyModel[34] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 55

		bodyModel[0].addShapeBox(-4F, 0.4F, -2F, 8, 13, 4, 0F,0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, -0.6F, 0.1F, 0.1F, -0.6F, 0.1F, 0.1F, -0.6F, 0.1F, 0.1F, -0.6F, 0.1F); // Box 33
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 0F, -2.2F, 4, 2, 4, 0F,0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, -2F, -0.3F, 1F, 0F, 0.5F, 2F, 0F, -0.7F, 0.5F, -2F, -1F, 0.5F); // Box 68
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, -2.2F, 4, 2, 4, 0F,0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, 0.5F, 2F, -2F, -0.3F, 1F, -2F, -1F, 0.5F, 0F, -0.7F, 0.5F); // Box 69
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, -0.5F, -1F, 4, 2, 3, 0F,0.2F, -0.3F, 0.3F, -1.5F, -0.3F, 1.2F, 0F, -0.3F, 0.8F, -0.8F, -0.3F, 0.5F, -0.2F, 0.5F, 0.5F, 0F, 0.5F, 0.8F, 0F, 0.5F, 1F, -0.2F, 0.5F, 0.7F); // Box 91
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(0F, -0.5F, -1F, 4, 2, 3, 0F,-1.5F, -0.3F, 1.2F, 0.2F, -0.3F, 0.3F, -0.8F, -0.3F, 0.5F, 0F, -0.3F, 0.8F, 0F, 0.5F, 0.8F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.7F, 0F, 0.5F, 1F); // Box 92
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 9.4F, -2F, 8, 1, 4, 0F,0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F); // Box 105
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 9.8F, -2F, 8, 1, 4, 0F,0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Box 106
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 10.8F, -2F, 4, 1, 4, 0F,0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1F, 0F, 1F, 0F, 0.5F, 1.2F, 0F, 0.5F, 1.2F, 1F, 0F, 1F); // Box 107
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0F, 10.8F, -2F, 4, 1, 4, 0F,0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 1.2F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0.5F, 1.2F); // Box 108
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4F, 6.5F, -2F, 4, 2, 4, 0F,0.8F, -1F, 1.2F, 0F, 0F, 2.2F, 0F, 0F, 1.2F, 0.9F, -1F, 0.6F, 0.25F, 0.5F, 0.3F, 0F, 0.5F, 0.7F, 0F, 0.5F, 0.4F, 0.3F, 0.5F, 0.15F); // Box 15
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, 5.5F, -2F, 4, 1, 4, 0F,1.1F, 0F, 1.5F, 0F, 0F, 2.5F, 0F, 0F, 1.3F, 1.2F, 0F, 0.9F, 0.8F, 1F, 1.2F, 0F, 0F, 2.2F, 0F, 0F, 1.2F, 0.9F, 1F, 0.6F); // Box 89
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-4F, 3.5F, -2F, 4, 2, 4, 0F,0.9F, 0F, 1.2F, 0F, 0F, 2.2F, 0F, 0F, 1.2F, 1.2F, 0F, 0.8F, 1.1F, 0F, 1.5F, 0F, 0F, 2.5F, 0F, 0F, 1.3F, 1.2F, 0F, 0.9F); // Box 50
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-4F, 1.5F, -2F, 4, 2, 4, 0F,0.1F, 0.5F, 0.2F, 0F, 0.5F, 0.4F, 0F, 1F, 0.4F, 0.2F, 1F, 0.3F, 0.9F, 0F, 1.2F, 0F, 0F, 2.2F, 0F, 0F, 1.2F, 1.2F, 0F, 0.8F); // Box 54
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0F, 1.5F, -2F, 4, 2, 4, 0F,0F, 0.5F, 0.4F, 0.1F, 0.5F, 0.2F, 0.2F, 1F, 0.3F, 0F, 1F, 0.4F, 0F, 0F, 2.2F, 0.9F, 0F, 1.2F, 1.2F, 0F, 0.8F, 0F, 0F, 1.2F); // Box 59
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(0F, 3.5F, -2F, 4, 2, 4, 0F,0F, 0F, 2.2F, 0.9F, 0F, 1.2F, 1.2F, 0F, 0.8F, 0F, 0F, 1.2F, 0F, 0F, 2.5F, 1.1F, 0F, 1.5F, 1.2F, 0F, 0.9F, 0F, 0F, 1.3F); // Box 60
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(0F, 5.5F, -2F, 4, 1, 4, 0F,0F, 0F, 2.5F, 1.1F, 0F, 1.5F, 1.2F, 0F, 0.9F, 0F, 0F, 1.3F, 0F, 0F, 2.2F, 0.8F, 1F, 1.2F, 0.9F, 1F, 0.6F, 0F, 0F, 1.2F); // Box 61
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(0F, 6.5F, -2F, 4, 2, 4, 0F,0F, 0F, 2.2F, 0.8F, -1F, 1.2F, 0.9F, -1F, 0.6F, 0F, 0F, 1.2F, 0F, 0.5F, 0.7F, 0.25F, 0.5F, 0.3F, 0.3F, 0.5F, 0.15F, 0F, 0.5F, 0.4F); // Box 62
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-5.6F, 13.2F, -2F, 5, 1, 4, 0F,0F, 0.3F, 0.9F, 1.4F, 0F, 1.5F, 2.5F, 0F, 1.7F, 0F, 0.3F, 0.9F, 0.3F, 0F, 1.1F, 1.2F, 0.2F, 1.8F, 2.5F, 0.2F, 2F, 0.3F, 0F, 1.1F); // Box 56
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(0.6F, 13.2F, -2F, 5, 1, 4, 0F,1.4F, 0F, 1.5F, 0F, 0.3F, 0.9F, 0F, 0.3F, 0.9F, 2.5F, 0F, 1.7F, 1.2F, 0.2F, 1.8F, 0.3F, 0F, 1.1F, 0.3F, 0F, 1.1F, 2.5F, 0.2F, 2F); // Box 69
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-5.5F, 12.2F, -2F, 5, 1, 4, 0F,-0.2F, 0.5F, 1F, 1F, 0F, 1.4F, 1.5F, 0F, 1.6F, -0.2F, 0.5F, 1F, 0.3F, -0.3F, 1F, 0.5F, 0F, 1.7F, 1.5F, 0F, 1.9F, 0.3F, -0.3F, 1F); // Box 55
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(0.5F, 12.2F, -2F, 5, 1, 4, 0F,1F, 0F, 1.4F, -0.2F, 0.5F, 1F, -0.2F, 0.5F, 1F, 1.5F, 0F, 1.6F, 0.5F, 0F, 1.7F, 0.3F, -0.3F, 1F, 0.3F, -0.3F, 1F, 1.5F, 0F, 1.9F); // Box 68
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-5.8F, 13.5F, -2.5F, 4, 2, 1, 0F,0.2F, 0.5F, 0.9F, 0.2F, 0F, 1.6F, 0.2F, 0F, 0.9F, 0.2F, 0F, 2.9F, 0.4F, 1.5F, 1.1F, -0.8F, 1.2F, 1.8F, -1.8F, 1.2F, 1.1F, 0.4F, 1.5F, 0.1F); // Box 66
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(1.8F, 13.5F, -2.5F, 4, 2, 1, 0F,0.2F, 0F, 1.6F, 0.2F, 0.5F, 0.9F, 0.2F, 0F, 2.9F, 0.2F, 0F, 0.9F, -0.8F, 1F, 1.8F, 0.4F, 1.5F, 1.1F, 0.4F, 1.5F, 0.1F, -1.8F, 1F, 1.1F); // Box 71
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-4F, 9.2F, -2F, 8, 1, 4, 0F,0.3F, -0.2F, 0.5F, 0.3F, -0.2F, 0.5F, 0.3F, -0.2F, 0.5F, 0.3F, -0.2F, 0.5F, 0.3F, -0.2F, 0.5F, 0.3F, -0.2F, 0.5F, 0.3F, -0.2F, 0.5F, 0.3F, -0.2F, 0.5F); // Box 105
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-4F, 9.5F, -2F, 4, 1, 4, 0F,0.25F, 0.5F, 0.3F, 0F, 0.5F, 0.7F, 0F, 0.5F, 0.4F, 0.3F, 0.5F, 0.15F, 0.15F, -1F, 0.15F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0.15F, -1F, 0.15F); // Box 52
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(0F, 9.5F, -2F, 4, 1, 4, 0F,0F, 0.5F, 0.7F, 0.25F, 0.5F, 0.3F, 0.3F, 0.5F, 0.15F, 0F, 0.5F, 0.4F, 0F, -1F, 0.2F, 0.15F, -1F, 0.15F, 0.15F, -1F, 0.15F, 0F, -1F, 0.2F); // Box 76
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-2.8F, 12.5F, -3.8F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(1.8F, 12.5F, -3.8F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 47
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-5.8F, 12.5F, -1.2F, 1, 2, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 48
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(4.8F, 12.5F, -1.2F, 1, 2, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-5F, 13.8F, -3F, 5, 2, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F); // skirtmail
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(0F, 13.8F, -3F, 5, 2, 6, 0F,0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F); // Box mail
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-0.5F, 1.5F, -4F, 1, 4, 1, 0F,-0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.9F, -0.1F, 0F, 0.9F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 53
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(0F, 5.5F, -2F, 4, 1, 4, 0F,0F, 0.5F, 3F, 1.1F, -0.5F, 1.5F, 1.2F, 0F, 0.9F, 0F, 0F, 1.3F, 0F, 0F, 2.2F, 0.8F, 1F, 1.2F, 0.9F, 1F, 0.6F, 0F, 0F, 1.2F); // Box 54
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-4F, 5.5F, -2F, 4, 1, 4, 0F,1.1F, -0.5F, 1.5F, 0F, 0.5F, 3F, 0F, 0F, 1.3F, 1.2F, 0F, 0.9F, 0.8F, 1F, 1.2F, 0F, 0F, 2.2F, 0F, 0F, 1.2F, 0.9F, 1F, 0.6F); // Box 55
		bodyModel[34].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		leftArmModel[1] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 57
		leftArmModel[2] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 60
		leftArmModel[3] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 62
		leftArmModel[4] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 100
		leftArmModel[5] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 101
		leftArmModel[6] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 57
		leftArmModel[7] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 58
		leftArmModel[8] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 60
		leftArmModel[9] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 67
		leftArmModel[10] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 68
		leftArmModel[11] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 72
		leftArmModel[12] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 21

		leftArmModel[0].addShapeBox(-1F, -2.1F, -2F, 4, 8, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 8.5F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 57
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 4.9F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 60
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(2F, 1.4F, -2F, 1, 3, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 62
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-0.5F, 2.9F, -2F, 4, 2, 4, 0F,0.2F, -0.8F, 0.4F, 0.2F, 1.2F, 0.6F, 0.2F, 1.2F, 0.6F, 0.2F, -0.8F, 0.4F, 0.2F, -0.8F, 0.4F, 0.2F, 1.2F, 0.6F, 0.2F, 1.2F, 0.6F, 0.2F, -0.8F, 0.4F); // Box 100
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(0.51F, -4.1F, -1F, 1, 2, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, -1F, 0.7F, 0F, 0F, 0F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 101
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(0F, -2.1F, -2F, 3, 2, 4, 0F,1.3F, 0.7F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.5F, 0.7F, 0.8F, -1F, 2F, 1.5F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 3.3F, 1.5F); // Box 57
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(0F, -4.1F, -3.01F, 1, 2, 2, 0F,1F, -2.3F, 1F, -2F, -2.5F, 1.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 2F, -0.5F, -2F, 2F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F); // Box 58
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(-3F, -1.6F, -5.01F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, -0.2F, -0.5F, 0.5F, 0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 1.5F, 0.5F, 0.3F, 1.5F); // Box 60
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(-1F, -0.1F, -3F, 2, 2, 1, 0F,0F, 0F, 0.2F, -0.5F, 1.5F, -0.6F, 0F, 1F, 0.5F, 0F, -0.5F, 0F, 0F, 2F, 2F, 0F, 0F, 0.5F, 0F, 0.2F, -1F, 0F, 2F, -2.5F); // Box 67
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(-3F, -0.1F, -3F, 2, 2, 1, 0F,0.5F, -0.5F, 0.5F, 0F, 0F, 0.2F, 0F, -0.5F, 0F, 1F, -0.5F, -0.5F, 0F, 1F, 2F, 0F, 2F, 2F, 0F, 2F, -2.5F, 0F, 1.2F, -2.5F); // Box 68
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);

		leftArmModel[11].addShapeBox(-4.59F, -2.1F, -1.99F, 1, 2, 4, 0F,-1.7F, -1.2F, 1.3F, 1.31F, 0.7F, 0.3F, 2.1F, 0.7F, 0.8F, 1F, -1F, 1F, -1.5F, 1F, 1.5F, 2.3F, -0.7F, 0.8F, 2.1F, 3.3F, 1.5F, -0.5F, 3F, 1.3F); // Box 72
		leftArmModel[11].setRotationPoint(1F, 0F, 0F);

		leftArmModel[12].addShapeBox(-1F, 6F, -2F, 4, 3, 4, 0F,0.3F, -0.8F, 0.5F, 1F, 0.2F, 0.5F, 1F, 0.2F, 0.5F, 0.3F, -0.8F, 0.5F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 21
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 42
		rightArmModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 55
		rightArmModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 56
		rightArmModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 59
		rightArmModel[5] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 61
		rightArmModel[6] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 63
		rightArmModel[7] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 61
		rightArmModel[8] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 62
		rightArmModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 63
		rightArmModel[10] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 66
		rightArmModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 69
		rightArmModel[12] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 70
		rightArmModel[13] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 50

		rightArmModel[0].addShapeBox(-3F, -2.1F, -2F, 4, 8, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -2.1F, -2F, 3, 2, 4, 0F,0.3F, 0.3F, 0.3F, 1.3F, 0.3F, 0.3F, 1.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.5F, 0F, 0.3F, 1.3F, 1.3F, 1.3F, 1.3F, 1.3F, 1.3F, 0.5F, 0F, 0.3F); // Box 42
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 8.5F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 55
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, 6F, -2F, 4, 3, 4, 0F,1F, 0.2F, 0.5F, 0.3F, -0.8F, 0.5F, 0.3F, -0.8F, 0.5F, 1F, 0.2F, 0.5F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 56
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3F, 4.9F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 59
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3F, 2.4F, -2F, 3, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 61
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3.5F, 2.9F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.4F, 0.2F, -0.8F, 0.4F, 0.2F, -0.8F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, -0.8F, 0.4F, 0.2F, -0.8F, 0.4F, 0.2F, 0.2F, 0.4F); // Box 63
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-1.51F, -4.1F, -1F, 1, 2, 3, 0F,0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -1F, -0.1F, 0F, 0.5F, -0.13F, 0F, -0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 61
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-1F, -4.1F, -3.01F, 1, 2, 2, 0F,-2F, -2.9F, 1.5F, 1F, -2.7F, 1F, -1F, -0.4F, 0F, 0.5F, -0.4F, 0F, -2F, 2F, 0F, 1F, 2F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.5F, -0.5F); // Box 62
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(1F, -1.6F, -5.01F, 2, 2, 1, 0F,0F, -0.4F, -0.5F, 0F, -0.9F, 0F, 0F, -0.6F, -0.5F, 0F, -0.2F, 0F, 0F, -0.5F, -2F, 0.5F, 0F, -1.5F, 0.5F, -0.2F, 1F, 0F, -0.5F, 1.5F); // Box 63
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(-3F, -2.1F, -2F, 3, 2, 4, 0F,0.3F, 0.3F, 0.3F, 1.3F, 0.7F, 0.3F, 0.5F, 0.7F, 0.8F, 0.3F, 0.3F, 0.3F, 0.7F, 1F, 0.3F, -0.9F, 1.5F, 1.3F, 0.5F, 3.3F, 1.5F, 0.7F, 1F, 0.3F); // Box 66
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);

		rightArmModel[11].addShapeBox(1F, -0.1F, -3F, 2, 1, 1, 0F,0F, 0F, 0.2F, 0.5F, -0.5F, 0.5F, 1F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0.1F, 1F, 0F, 0.3F, -1.5F, 0F, 0F, -1.5F); // Box 69
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);

		rightArmModel[12].addShapeBox(-1F, -0.1F, -3F, 2, 1, 1, 0F,-0.5F, 1.5F, -0.6F, 0F, 0F, 0.2F, 0F, -0.5F, 0F, 0F, 1F, 0.5F, 0F, 0.5F, 0.3F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0.5F, -0.5F); // Box 70
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);

		rightArmModel[13].addShapeBox(1.59F, -2.1F, -1.99F, 1, 2, 4, 0F,1.31F, 0.7F, 0.3F, -1.7F, -1.2F, 1.3F, 1F, -1F, 1F, 2.1F, 0.7F, 0.8F, 2.3F, -0.7F, 0.8F, -1.5F, 1F, 1.5F, -0.5F, 3F, 1.3F, 2.1F, 3.3F, 1.5F); // Box 50
		rightArmModel[13].setRotationPoint(1F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 99
		leftLegModel[1] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 82
		leftLegModel[2] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 83
		leftLegModel[3] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 84
		leftLegModel[4] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 85
		leftLegModel[5] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 87
		leftLegModel[6] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 90

		leftLegModel[0].addShapeBox(-2F, 0.9F, -2F, 4, 10, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 99
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-1.5F, 11.1F, -1.3F, 4, 1, 4, 0F,0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, -0.4F, 0.4F, 0.5F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Box 82
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-1.5F, 0.0999999999999996F, -2F, 4, 6, 4, 0F,0.4F, 0F, 0.6F, 0.8F, 0.5F, 0.6F, 0.8F, 0.5F, 0.5F, -2F, 0F, 0.5F, 0.2F, 0.5F, 0.4F, 0.2F, 0.5F, 0.4F, 0.2F, -1F, 0.2F, -2F, -1F, 0.2F); // Box 83
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-1.5F, 5.1F, -2.8F, 4, 1, 3, 0F,0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Box 84
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-1.5F, 6.1F, -2F, 4, 4, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -1F, 0.6F, 0.2F, -1F, 0.6F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F); // Box 85
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-1.5F, 6.1F, -2.8F, 4, 1, 3, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F); // Box 87
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-1.5F, 11.1F, -3.3F, 4, 1, 2, 0F,0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.6F, 0F, 0.2F, 0.6F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 90
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 98
		rightLegModel[1] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 25
		rightLegModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 20
		rightLegModel[3] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 21
		rightLegModel[4] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 29
		rightLegModel[5] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 78
		rightLegModel[6] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 81

		rightLegModel[0].addShapeBox(-2F, 0.9F, -2F, 4, 10, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 98
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2.5F, 11.1F, -1.3F, 4, 1, 4, 0F,0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, -0.4F, 0.4F, 0.5F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Box 25
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2.5F, 0.0999999999999996F, -2F, 4, 6, 4, 0F,0.8F, 0.5F, 0.6F, 0.4F, 0F, 0.6F, -2F, 0F, 0.5F, 0.8F, 0.5F, 0.5F, 0.2F, 0.5F, 0.4F, 0.2F, 0.5F, 0.4F, -2F, -1F, 0.2F, 0.2F, -1F, 0.2F); // Box 20
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2.5F, 5.1F, -2.8F, 4, 1, 3, 0F,0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Box 21
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2.5F, 6.1F, -2F, 4, 4, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -1F, 0.6F, 0.2F, -1F, 0.6F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F); // Box 29
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2.5F, 6.1F, -2.8F, 4, 1, 3, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F); // Box 78
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-2.5F, 11.1F, -3.3F, 4, 1, 2, 0F,0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.6F, 0F, 0.2F, 0.6F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 81
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);
	}
}