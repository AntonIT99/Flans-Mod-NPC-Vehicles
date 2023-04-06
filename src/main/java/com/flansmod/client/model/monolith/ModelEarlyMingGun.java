//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Kuai Qiang
// Model Creator: 
// Created on: 22.03.2020 - 12:09:14
// Last changed on: 22.03.2020 - 12:09:14

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelEarlyMingGun extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelEarlyMingGun() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[27];
		gunModel[0] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 0, 8, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 0, 6, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 28, 2, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 28, 0, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 28, 4, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 24, 0, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 24, 2, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 0, 4, textureX, textureY); // Box 25
		gunModel[10] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 26
		gunModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 27
		gunModel[12] = new ModelRendererTurbo(this, 20, 4, textureX, textureY); // Box 28
		gunModel[13] = new ModelRendererTurbo(this, 20, 2, textureX, textureY); // Box 29
		gunModel[14] = new ModelRendererTurbo(this, 20, 0, textureX, textureY); // Box 30
		gunModel[15] = new ModelRendererTurbo(this, 16, 4, textureX, textureY); // Box 31
		gunModel[16] = new ModelRendererTurbo(this, 16, 2, textureX, textureY); // Box 32
		gunModel[17] = new ModelRendererTurbo(this, 16, 0, textureX, textureY); // Box 33
		gunModel[18] = new ModelRendererTurbo(this, 12, 4, textureX, textureY); // Box 34
		gunModel[19] = new ModelRendererTurbo(this, 12, 2, textureX, textureY); // Box 35
		gunModel[20] = new ModelRendererTurbo(this, 12, 0, textureX, textureY); // Box 36
		gunModel[21] = new ModelRendererTurbo(this, 8, 4, textureX, textureY); // Box 37
		gunModel[22] = new ModelRendererTurbo(this, 8, 2, textureX, textureY); // Box 38
		gunModel[23] = new ModelRendererTurbo(this, 8, 0, textureX, textureY); // Box 39
		gunModel[24] = new ModelRendererTurbo(this, 4, 4, textureX, textureY); // Box 40
		gunModel[25] = new ModelRendererTurbo(this, 4, 2, textureX, textureY); // Box 41
		gunModel[26] = new ModelRendererTurbo(this, 4, 0, textureX, textureY); // Box 42

		gunModel[0].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F, 0F, -0.7916666F, 0F, 0F, -0.7916666F, 0F, 0F, -0.7916666F, 0F, 0F, -0.7916666F, 0F, 0F, 0.125F, -0.2F, 0F, 0.125F, -0.2F, 0F, 0.125F, -0.2F, 0F, 0.125F, -0.2F); // Box 0
		gunModel[0].setRotationPoint(-12F, -3F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F, 0F, -0.4583333F, 0F, 0F, -0.4583333F, 0F, 0F, -0.4583333F, 0F, 0F, -0.4583333F, 0F, 0F, -0.2083333F, 0F, 0F, -0.2083333F, 0F, 0F, -0.2083333F, 0F, 0F, -0.2083333F, 0F); // Box 1
		gunModel[1].setRotationPoint(-12F, -3F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.5416666F, 0F, 0F, -0.5416666F, 0F, 0F, -0.5416666F, 0F, 0F, -0.5416666F, 0F); // Box 2
		gunModel[2].setRotationPoint(-12F, -3F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.4583333F, 0F, 0F, -0.4583333F, 0F, 0F, -0.4583333F, 0F, 0F, -0.4583333F, 0F, 0F, -0.2083333F, 0F, 0F, -0.2083333F, 0F, 0F, -0.2083333F, 0F, 0F, -0.2083333F, 0F); // Box 3
		gunModel[3].setRotationPoint(16F, -3F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.5416666F, 0F, 0F, -0.5416666F, 0F, 0F, -0.5416666F, 0F, 0F, -0.5416666F, 0F); // Box 4
		gunModel[4].setRotationPoint(16F, -3F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.7916666F, 0F, 0F, -0.7916666F, 0F, 0F, -0.7916666F, 0F, 0F, -0.7916666F, 0F, 0F, 0.125F, -0.2F, 0F, 0.125F, -0.2F, 0F, 0.125F, -0.2F, 0F, 0.125F, -0.2F); // Box 5
		gunModel[5].setRotationPoint(16F, -3F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, 0F, -0.5416666F, 0.125F); // Box 6
		gunModel[6].setRotationPoint(22F, -3F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, 0F, -0.4583333F, 0.125F, 0F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, 0F, -0.2083333F, 0.125F); // Box 7
		gunModel[7].setRotationPoint(22F, -3F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, 0F, -0.7916666F, 0.125F, 0F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 8
		gunModel[8].setRotationPoint(22F, -3F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, 0F, -0.7916666F, 0.125F, 0F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 25
		gunModel[9].setRotationPoint(-12.25F, -3F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, 0F, -0.4583333F, 0.125F, 0F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, 0F, -0.2083333F, 0.125F); // Box 26
		gunModel[10].setRotationPoint(-12.25F, -3F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, 0F, -0.5416666F, 0.125F); // Box 27
		gunModel[11].setRotationPoint(-12.25F, -3F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, 0F, -0.7916666F, 0.125F, 0F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 28
		gunModel[12].setRotationPoint(20F, -3F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, 0F, -0.4583333F, 0.125F, 0F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, 0F, -0.2083333F, 0.125F); // Box 29
		gunModel[13].setRotationPoint(20F, -3F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, 0F, -0.5416666F, 0.125F); // Box 30
		gunModel[14].setRotationPoint(20F, -3F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, 0F, -0.7916666F, 0.125F, 0F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 31
		gunModel[15].setRotationPoint(18F, -3F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, 0F, -0.4583333F, 0.125F, 0F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, 0F, -0.2083333F, 0.125F); // Box 32
		gunModel[16].setRotationPoint(18F, -3F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, 0F, -0.5416666F, 0.125F); // Box 33
		gunModel[17].setRotationPoint(18F, -3F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, 0F, -0.7916666F, 0.125F, 0F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 34
		gunModel[18].setRotationPoint(16F, -3F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, 0F, -0.4583333F, 0.125F, 0F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, 0F, -0.2083333F, 0.125F); // Box 35
		gunModel[19].setRotationPoint(16F, -3F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, 0F, -0.5416666F, 0.125F); // Box 36
		gunModel[20].setRotationPoint(16F, -3F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, 0F, -0.7916666F, 0.125F, 0F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 37
		gunModel[21].setRotationPoint(14F, -3F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, 0F, -0.4583333F, 0.125F, 0F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, 0F, -0.2083333F, 0.125F); // Box 38
		gunModel[22].setRotationPoint(14F, -3F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, 0F, -0.5416666F, 0.125F); // Box 39
		gunModel[23].setRotationPoint(14F, -3F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0F, -0.75F, -0.7916666F, 0F, 0F, -0.7916666F, 0.125F, 0F, 0.25F, -0.2F, -0.75F, 0.125F, -0.2F, -0.75F, 0.125F, -0.2F, 0F, 0.25F, -0.2F); // Box 40
		gunModel[24].setRotationPoint(11F, -3F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0F, -0.75F, -0.4583333F, 0F, 0F, -0.4583333F, 0.125F, 0F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0F, -0.75F, -0.2083333F, 0F, 0F, -0.2083333F, 0.125F); // Box 41
		gunModel[25].setRotationPoint(11F, -3F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.75F, -0.125F, -0.2F, -0.75F, -0.125F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0F, -0.75F, -0.5416666F, 0F, 0F, -0.5416666F, 0.125F); // Box 42
		gunModel[26].setRotationPoint(11F, -3F, -0.5F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 54, 0, textureX, textureY); // Box 43

		ammoModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F); // Box 43
		ammoModel[0].setRotationPoint(21.7F, -2.88F, -0.5F);



		animationType = EnumAnimationType.END_LOADED;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}