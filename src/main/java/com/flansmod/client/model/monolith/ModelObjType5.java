//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelObjType5 extends ModelVehicle //Same as Filename
{
	int textureX = 84;
	int textureY = 101;

	public ModelObjType5() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[1];
		turretModel = new ModelRendererTurbo[1];
		barrelModel = new ModelRendererTurbo[1];
	//	leftTrackModel = new ModelRendererTurbo[1];
	//	rightTrackModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
	//	initleftTrackModel_1();
	//	initrightTrackModel_1();

		translateAll(0F, 0F, 0F);


	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 444, 174, textureX, textureY); // Core1




  		bodyModel[0].addObj("/Tyrants and Plebeians/assets/flansmod/models/T5Hull.obj");
		bodyModel[0].setRotationPoint(0.4F, 4.3F, -0.2F);
	//	bodyModel[0].rotateAngleX = 1.57079632679f;

	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Core1
		
		
		turretModel[0].addObj("/Tyrants and Plebeians/assets/flansmod/models/T5TurretFix.obj");
		turretModel[0].setRotationPoint(0F, 5.15F, 0F);
		//bodyModel[0].rotateAngleX = 1.57079632679f;

	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 444, 174, textureX, textureY); // Core1

		barrelModel[0].addObj("/Tyrants and Plebeians/assets/flansmod/models/T5Barrelfix.obj");
		barrelModel[0].setRotationPoint(0.5F, 1.7F, 0.0F);
		//bodyModel[0].rotateAngleX = 1.57079632679f;
	}

	
//	private void initleftTrackModel_1()
//	{
//		leftTrackModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // TrackLeft1
		
//		leftTrackModel[0].addObj("/Tyrants and Plebeians/assets/flansmod/models/T5Ltrack.obj");
//		leftTrackModel[0].setRotationPoint(1F, 3F, 1F);
//		bodyModel[0].rotateAngleX = 1.57079632679f;

		
//	}

//	private void initrightTrackModel_1()
//	{
//		rightTrackModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // TrackRight1
		

//		rightTrackModel[0].addObj("/Tyrants and Plebeians/assets/flansmod/models/T5Rtrack.obj");
//		rightTrackModel[0].setRotationPoint(1F, 3F, 1F);
//		bodyModel[0].rotateAngleX = 1.57079632679f;

		
	//}
}