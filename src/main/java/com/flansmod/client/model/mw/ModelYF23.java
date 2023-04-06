//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 30.09.2016 - 15:21:38
// Last changed on: 30.09.2016 - 15:21:38

package com.flansmod.client.model.mw; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelYF23 extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelYF23() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[33];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Shape 7
		bodyModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 11
		bodyModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 13
		bodyModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 14
		bodyModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 17
		bodyModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 18
		bodyModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 55
		bodyModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 57
		bodyModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 60
		bodyModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 61
		bodyModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 63
		bodyModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 66
		bodyModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 67
		bodyModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 68
		bodyModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 71
		bodyModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 76
		bodyModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 77
		bodyModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 79
		bodyModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 80
		bodyModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 81
		bodyModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 82
		bodyModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 83
		bodyModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 84
		bodyModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 85
		bodyModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 86
		bodyModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 87
		bodyModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 88
		bodyModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 89

		bodyModel[0].addShapeBox(-1F, 0F, 0F, 18, 6, 7, 0F, 0.1F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 1.8F, 0F, 0F, -6.8F, 0F, -5.8F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5.85F, -6.85F); // Box 1
		bodyModel[0].setRotationPoint(-207F, -21.5F, 0F);

		bodyModel[1].addShapeBox(-1F, 0F, 0F, 18, 6, 7, 0F, 0F, -5.8F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -5.85F, -6.85F, 0.1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0.6F, 0F, 0F, -6.8F); // Box 3
		bodyModel[1].setRotationPoint(-207F, -27.5F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 18, 8, 13, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -4.2F, 0F, -2F, 0F, 0F, -0.5F, -6F, 0F, -2F, -4.5F, 0F, -4F, -6F); // Box 5
		bodyModel[2].setRotationPoint(-190F, -21.5F, 0F);

		bodyModel[3].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(12, 0, 12, 0), new Coord2D(6, 18, 6, 18) }), 1, 18, 18, 50, 1, ModelRendererTurbo.MR_FRONT, new float[] {19 ,19 ,12}); // Shape 7
		bodyModel[3].setRotationPoint(-172F, -15F, -6F);
		bodyModel[3].rotateAngleX = 1.48764884F;
		bodyModel[3].rotateAngleY = -1.57079633F;

		bodyModel[4].addShapeBox(0F, 0F, 0F, 18, 8, 13, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 1.5F, -8F, 0F, -3F, -8F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -2.5F, 0F, -2F, -5.4F); // Box 8
		bodyModel[4].setRotationPoint(-190F, -29.5F, 0F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 43, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -1F, 0F); // Box 10
		bodyModel[5].setRotationPoint(-172F, -15F, -6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 43, 8, 13, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -1.5F, 0F, -0.5F, -7.5F, 0F, -0.5F, 0F, 0F, 0.5F, -3F, 0F, -1F, -6F, 0F, -2F, -10.5F); // Box 11
		bodyModel[6].setRotationPoint(-172F, -21.5F, 6F);

		bodyModel[7].addShapeBox(-1F, 0F, 0F, 18, 1, 7, 0F, 0F, -0.3F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0.6F, 0F, -0.35F, -6.85F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 2.5F, 0F, -0.5F, -6.8F); // Box 13
		bodyModel[7].setRotationPoint(-207F, -22F, 0F);

		bodyModel[8].addShapeBox(-1F, 0F, 0F, 18, 1, 7, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, -0.5F, -6.8F, 0F, -0.3F, 0F, 0F, 0F, -0.25F, 0F, 0F, 1.75F, 0F, -0.35F, -6.85F); // Box 14
		bodyModel[8].setRotationPoint(-207F, -22F, 0F);

		bodyModel[9].addShapeBox(-1F, 0F, 0F, 18, 1, 7, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 3.5F, 0F, 1.5F, 0.6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 6F, 0F, -1F, 2.5F); // Box 17
		bodyModel[9].setRotationPoint(-189F, -22F, 0F);

		bodyModel[10].addShapeBox(-1F, 0F, 0F, 18, 1, 7, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 6F, 0F, -1F, 2.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 4.5F, 0F, 1F, 1.8F); // Box 18
		bodyModel[10].setRotationPoint(-189F, -23F, 0F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 43, 8, 13, 0F, 0F, -0.5F, -7.5F, 0F, 0.5F, 0F, 0F, 0.5F, -3F, 0F, -0.5F, 0F, 0F, -2F, -10.5F, 0F, -1F, -6F, 0F, 0.5F, -3F, 0F, -0.5F, 0F); // Box 55
		bodyModel[11].setRotationPoint(-172F, -21.5F, -19F);

		bodyModel[12].addShapeBox(-1F, 0F, 0F, 18, 1, 7, 0F, 0F, -0.5F, -6.8F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.35F, -6.85F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.3F, 0F); // Box 57
		bodyModel[12].setRotationPoint(-207F, -22F, -7F);

		bodyModel[13].addShapeBox(-1F, 0F, 0F, 43, 1, 7, 0F, 0F, -1F, -6F, 0F, -0.5F, -9F, 0F, -0.5F, 12.5F, 0F, -1F, 6F, 0F, 1F, -6F, 0F, 1F, -9F, 0F, 1F, 10.5F, 0F, 1F, 4.5F); // Box 60
		bodyModel[13].setRotationPoint(-171F, -23F, 0F);

		bodyModel[14].addShapeBox(-1F, 0F, 0F, 43, 1, 7, 0F, 0F, 2F, -6F, 0F, 2.5F, -9F, 0F, 2.5F, 10.5F, 0F, 2F, 3.5F, 0F, -1F, -6F, 0F, -1.5F, -9F, 0F, -1.5F, 12.5F, 0F, -1F, 6F); // Box 61
		bodyModel[14].setRotationPoint(-171F, -22F, 0F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 43, 7, 17, 0F, 0F, 0F, 0F, 0F, 4F, -9F, 0F, 4F, -5.5F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, -0.5F, -9F, 0F, -0.5F, 0.5F, 0F, 0F, -6.5F); // Box 63
		bodyModel[15].setRotationPoint(-172F, -31F, 0F);

		bodyModel[16].addShapeBox(-1F, 0F, 0F, 43, 1, 7, 0F, 0F, -1F, 6F, 0F, -0.5F, 12.5F, 0F, -0.5F, -9F, 0F, -1F, -6F, 0F, 1F, 4.5F, 0F, 1F, 10.5F, 0F, 1F, -9F, 0F, 1F, -6F); // Box 66
		bodyModel[16].setRotationPoint(-171F, -23F, -7F);

		bodyModel[17].addShapeBox(-1F, 0F, 0F, 43, 1, 7, 0F, 0F, 2F, 3.5F, 0F, 2.5F, 10.5F, 0F, 2.5F, -9F, 0F, 2F, -6F, 0F, -1F, 6F, 0F, -1.5F, 12.5F, 0F, -1.5F, -9F, 0F, -1F, -6F); // Box 67
		bodyModel[17].setRotationPoint(-171F, -22F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 19, 8, 5, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -1.767F, 0F, 4F, -2.1395F, 3.4767F, -1F, -0.093F, 0.155116F); // Box 68
		bodyModel[18].setRotationPoint(-172F, -39F, 0F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 43, 7, 17, 0F, 0F, 0F, -12F, 0F, 4F, -5.5F, 0F, 4F, -9F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -9F, 0F, 0F, 0F); // Box 71
		bodyModel[19].setRotationPoint(-172F, -31F, -17F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 19, 8, 5, 0F, 0F, -8F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, -1F, -0.093F, 0.155116F, 4F, -2.1395F, 3.4767F, 0F, -1.767F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[20].setRotationPoint(-172F, -39F, -5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 10, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 2F, -4F, 0F, 0F, 0F, -1.767F, 0F, 0F, -2.6976F, -6.069F, 0F, -2.6976F, 4.3837F, -4F, -2.1395F, 3.4767F); // Box 77
		bodyModel[21].setRotationPoint(-153F, -39F, 0F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 10, 8, 5, 0F, -4F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -6F, 0F, 0F, 0F, -4F, -2.1395F, 3.4767F, 0F, -2.6976F, 4.3837F, 0F, -2.6976F, -6.069F, 0F, -1.767F, 0F); // Box 79
		bodyModel[22].setRotationPoint(-153F, -39F, -5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 14, 8, 5, 0F, 0F, 0F, -6F, 0F, -1F, -9F, 0F, -1F, 5F, 0F, 0F, 2F, 0F, -2.6976F, -6.069F, 0F, -4F, -9F, 0F, -4F, 6.5F, 0F, -2.6976F, 4.3837F); // Box 80
		bodyModel[23].setRotationPoint(-143F, -39F, 0F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 14, 8, 5, 0F, 0F, 0F, 2F, 0F, -1F, 5F, 0F, -1F, -9F, 0F, 0F, -6F, 0F, -2.6976F, 4.3837F, 0F, -4F, 6.5F, 0F, -4F, -9F, 0F, -2.6976F, -6.069F); // Box 81
		bodyModel[24].setRotationPoint(-143F, -39F, -5F);

		bodyModel[25].addShapeBox(-1F, 0F, 0F, 18, 6, 7, 0F, 0F, 0F, -6.8F, 0F, -0.5F, 1.8F, 0F, 0.5F, 0F, 0.1F, 0F, 0F, 0F, -5.85F, -6.85F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5.8F, 0F); // Box 82
		bodyModel[25].setRotationPoint(-207F, -21.5F, -7F);

		bodyModel[26].addShapeBox(-1F, 0F, 0F, 18, 6, 7, 0F, 0F, -5.85F, -6.85F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, -5.8F, 0F, 0F, 0F, -6.8F, 0F, -2F, 0.6F, 0F, -0.5F, 0F, 0.1F, 0F, 0F); // Box 83
		bodyModel[26].setRotationPoint(-207F, -27.5F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 18, 8, 13, 0F, 0F, -0.5F, -4.2F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -4F, -6F, 0F, -2F, -4.5F, 0F, -0.5F, -6F, 0F, -2F, 0F); // Box 84
		bodyModel[27].setRotationPoint(-190F, -21.5F, -13F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 18, 8, 13, 0F, 0F, -3F, -8F, 0F, 1.5F, -8F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -2F, -5.4F, 0F, -2.5F, -2.5F, 0F, -2.5F, 0F, 0F, -0.5F, 0F); // Box 85
		bodyModel[28].setRotationPoint(-190F, -29.5F, -13F);

		bodyModel[29].addShapeBox(-1F, 0F, 0F, 18, 1, 7, 0F, 0F, -0.35F, -6.85F, 0F, 1.5F, 0.6F, 0F, 0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, -6.8F, 0F, -1F, 2.5F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 86
		bodyModel[29].setRotationPoint(-207F, -22F, -7F);

		bodyModel[30].addShapeBox(-1F, 0F, 0F, 18, 1, 7, 0F, 0F, -0.5F, -6.8F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.35F, -6.85F, 0F, 0F, 1.75F, 0F, 0F, -0.25F, 0F, -0.3F, 0F); // Box 87
		bodyModel[30].setRotationPoint(-207F, -22F, -7F);

		bodyModel[31].addShapeBox(-1F, 0F, 0F, 18, 1, 7, 0F, 0F, 1.5F, 0.6F, 0F, 2F, 3.5F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, -1F, 2.5F, 0F, -1F, 6F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 88
		bodyModel[31].setRotationPoint(-189F, -22F, -7F);

		bodyModel[32].addShapeBox(-1F, 0F, 0F, 18, 1, 7, 0F, 0F, -1F, 2.5F, 0F, -1F, 6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 1.8F, 0F, 1F, 4.5F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 89
		bodyModel[32].setRotationPoint(-189F, -23F, -7F);







		translateAll(0F, 0F, 0F);


		flipAll();
	}
}