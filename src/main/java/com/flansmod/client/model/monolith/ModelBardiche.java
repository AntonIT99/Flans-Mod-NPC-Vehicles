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

public class ModelBardiche extends ModelGun //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public ModelBardiche() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[9];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 2
		gunModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 6
		gunModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 7
		gunModel[4] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 0
		gunModel[5] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 1
		gunModel[6] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 2
		gunModel[7] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 3
		gunModel[8] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 4

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 26, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(0F, -13F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 2
		gunModel[1].setRotationPoint(0F, -13F, 0F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.3F, 0F, -0.1F, -0.0999999999999996F, 4F, -0.3F, -0.0999999999999996F, 4F, -0.3F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, -0.0999999999999999F, 1.8F, -0.299999999999999F, -0.0999999999999999F, 1.8F, -0.300000000000001F, 0.3F, 0F, -0.1F); // Box 6
		gunModel[2].setRotationPoint(1.2F, -13F, 0F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0.1F, 0.4F, -0.3F, 0.3F, 0.4F, -0.4F, 0.3F, 0.4F, -0.4F, 0.1F, 0.4F, -0.3F, 0.1F, 0F, -0.3F, -0.0999999999999999F, 0F, -0.4F, -0.0999999999999999F, 0F, -0.4F, 0.1F, 0F, -0.3F); // Box 7
		gunModel[3].setRotationPoint(2.2F, -12.5F, 0F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.1F, 0F, -0.3F, -0.0999999999999996F, 0F, -0.4F, -0.0999999999999996F, 0F, -0.4F, 0.1F, 0F, -0.3F, 1.1F, 1F, -0.3F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, 1.1F, 1F, -0.3F); // Box 0
		gunModel[4].setRotationPoint(2.2F, -6.5F, 0F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 1
		gunModel[5].setRotationPoint(0F, 13F, 0F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0.1F, 0F, -0.3F, -0.0999999999999999F, -2F, -0.4F, -0.0999999999999999F, -2F, -0.4F, 0.1F, 0F, -0.3F, 0.1F, 0.4F, -0.3F, 0.3F, 0.4F, -0.4F, 0.3F, 0.4F, -0.4F, 0.1F, 0.4F, -0.3F); // Box 2
		gunModel[6].setRotationPoint(2.2F, -19.3F, 0F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1F, 1.8F, -0.4F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 1F, 1.8F, -0.4F, 0.8F, -0.5F, -0.4F, 0.1F, 1.5F, -0.3F, 0.1F, 1.5F, -0.3F, 0.8F, -0.5F, -0.4F); // Box 3
		gunModel[7].setRotationPoint(1F, -19.3F, 0F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.4F); // Box 4
		gunModel[8].setRotationPoint(1F, -18.3F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}