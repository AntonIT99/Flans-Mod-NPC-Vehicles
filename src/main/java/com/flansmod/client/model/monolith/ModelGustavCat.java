//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Gatling
// Model Creator: 
// Created on: 06.07.2019 - 17:27:39
// Last changed on: 06.07.2019 - 17:27:39

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGustavCat extends ModelVehicle //Same as Filename
{
	int textureX = 690;
	int textureY = 550;

	public ModelGustavCat() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[1];
		barrelModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initbarrelModel_1();


		translateAll(0F, 0F, 0F);



	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Core1




  		bodyModel[0].addObj("/Tyrants and Plebeians/assets/flansmod/models/GustavBodyFix.obj");
		bodyModel[0].setRotationPoint(0F, -0.5F, 0F);
	//	bodyModel[0].rotateAngleX = 1.57079632679f;

	}


	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box14
		
		barrelModel[0].addObj("/Tyrants and Plebeians/assets/flansmod/models/GustavBarrelFix.obj");
		barrelModel[0].setRotationPoint(0F, 9F, 0F);

	}

	
}