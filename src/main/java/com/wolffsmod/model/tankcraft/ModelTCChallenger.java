//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 22.03.2016 - 12:31:26
// Last changed on: 22.03.2016 - 12:31:26

package com.wolffsmod.model.tankcraft; //Path where the model is located

import com.wolffsmod.model.ModelFlanVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;
import com.flansmod.common.vector.Vector3f;

public class ModelTCChallenger extends ModelFlanVehicle //Same as Filename
{
	int textureX = 2048;
	int textureY = 4096;

	public ModelTCChallenger() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[535];
		turretModel = new ModelRendererTurbo[235];
		animBarrelModel = new ModelRendererTurbo[23];
		leftTrackWheelModels = new ModelRendererTurbo[6];
		rightTrackWheelModels = new ModelRendererTurbo[174];
		
		leftAnimTrackModel = new ModelRendererTurbo[3][];
		rightAnimTrackModel = new ModelRendererTurbo[3][];
		
		leftAnimTrackModel[0] = new ModelRendererTurbo[11];
		leftAnimTrackModel[0][0] = new ModelRendererTurbo(this, 300, 108, textureX, textureY); // Import Box1515
		leftAnimTrackModel[0][1] = new ModelRendererTurbo(this, 300, 124, textureX, textureY); // Import Box1516
		leftAnimTrackModel[0][2] = new ModelRendererTurbo(this, 300, 139, textureX, textureY); // Import Box1518
		leftAnimTrackModel[0][3] = new ModelRendererTurbo(this, 300, 154, textureX, textureY); // Import Box1520
		leftAnimTrackModel[0][4] = new ModelRendererTurbo(this, 300, 169, textureX, textureY); // Import Box1522
		leftAnimTrackModel[0][5] = new ModelRendererTurbo(this, 300, 185, textureX, textureY); // Import Box1526
		leftAnimTrackModel[0][6] = new ModelRendererTurbo(this, 300, 200, textureX, textureY); // Import Box1528
		leftAnimTrackModel[0][7] = new ModelRendererTurbo(this, 300, 215, textureX, textureY); // Import Box1530
		leftAnimTrackModel[0][8] = new ModelRendererTurbo(this, 300, 230, textureX, textureY); // Import Box1532
		leftAnimTrackModel[0][9] = new ModelRendererTurbo(this, 300, 246, textureX, textureY); // Import Box1534
		leftAnimTrackModel[0][10] = new ModelRendererTurbo(this, 300, 261, textureX, textureY); // Import Box1536

		leftAnimTrackModel[0][0].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1515
		leftAnimTrackModel[0][0].setRotationPoint(62F, -11.5F, 19.5F);
		leftAnimTrackModel[0][0].rotateAngleZ = -0.73303829F;

		leftAnimTrackModel[0][1].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1516
		leftAnimTrackModel[0][1].setRotationPoint(65.7F, -8.15F, 19.5F);
		leftAnimTrackModel[0][1].rotateAngleZ = -1.57079633F;

		leftAnimTrackModel[0][2].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1518
		leftAnimTrackModel[0][2].setRotationPoint(65.7F, -4.15F, 19.5F);
		leftAnimTrackModel[0][2].rotateAngleZ = -2.32128791F;

		leftAnimTrackModel[0][3].addShapeBox(0F, 0F, 0F, 19, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1520
		leftAnimTrackModel[0][3].setRotationPoint(62.3F, -0.5F, 19.5F);
		leftAnimTrackModel[0][3].rotateAngleZ = -2.55690735F;

		leftAnimTrackModel[0][4].addShapeBox(0F, 0F, 0F, 97, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1522
		leftAnimTrackModel[0][4].setRotationPoint(46.5F, 10F, 19.5F);
		leftAnimTrackModel[0][4].rotateAngleZ = -3.14159265F;

		leftAnimTrackModel[0][5].addShapeBox(0F, 0F, 0F, 15, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1526
		leftAnimTrackModel[0][5].setRotationPoint(-50.5F, 10F, 19.5F);
		leftAnimTrackModel[0][5].rotateAngleZ = -3.66519143F;

		leftAnimTrackModel[0][6].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1528
		leftAnimTrackModel[0][6].setRotationPoint(-63.5F, 2.5F, 19.5F);
		leftAnimTrackModel[0][6].rotateAngleZ = -3.82227106F;

		leftAnimTrackModel[0][7].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1530
		leftAnimTrackModel[0][7].setRotationPoint(-69F, -1.9F, 19.5F);
		leftAnimTrackModel[0][7].rotateAngleZ = -4.71238898F;

		leftAnimTrackModel[0][8].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1532
		leftAnimTrackModel[0][8].setRotationPoint(-69F, -7.9F, 19.5F);
		leftAnimTrackModel[0][8].rotateAngleZ = -5.58505361F;

		leftAnimTrackModel[0][9].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0.4F, -0.24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -0.24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1534
		leftAnimTrackModel[0][9].setRotationPoint(-64F, -12F, 19.5F);

		leftAnimTrackModel[0][10].addShapeBox(0F, 0F, 0F, 120, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1536
		leftAnimTrackModel[0][10].setRotationPoint(-58F, -12F, 19.5F);
		leftAnimTrackModel[0][10].rotateAngleZ = -0.00523599F;

		rightAnimTrackModel[0] = new ModelRendererTurbo[11];
		rightAnimTrackModel[0][0] = new ModelRendererTurbo(this, 300, 108, textureX, textureY); // Import Box1514
		rightAnimTrackModel[0][1] = new ModelRendererTurbo(this, 300, 124, textureX, textureY); // Import Box1517
		rightAnimTrackModel[0][2] = new ModelRendererTurbo(this, 300, 139, textureX, textureY); // Import Box1519
		rightAnimTrackModel[0][3] = new ModelRendererTurbo(this, 300, 154, textureX, textureY); // Import Box1524
		rightAnimTrackModel[0][4] = new ModelRendererTurbo(this, 300, 169, textureX, textureY); // Import Box1525
		rightAnimTrackModel[0][5] = new ModelRendererTurbo(this, 300, 185, textureX, textureY); // Import Box1527
		rightAnimTrackModel[0][6] = new ModelRendererTurbo(this, 300, 200, textureX, textureY); // Import Box1529
		rightAnimTrackModel[0][7] = new ModelRendererTurbo(this, 300, 215, textureX, textureY); // Import Box1531
		rightAnimTrackModel[0][8] = new ModelRendererTurbo(this, 300, 230, textureX, textureY); // Import Box1533
		rightAnimTrackModel[0][9] = new ModelRendererTurbo(this, 300, 246, textureX, textureY); // Import Box1538
		rightAnimTrackModel[0][10] = new ModelRendererTurbo(this, 300, 261, textureX, textureY); // Import Box1539

		rightAnimTrackModel[0][0].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1514
		rightAnimTrackModel[0][0].setRotationPoint(62F, -11.5F, -31.5F);
		rightAnimTrackModel[0][0].rotateAngleZ = -0.73303829F;

		rightAnimTrackModel[0][1].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1517
		rightAnimTrackModel[0][1].setRotationPoint(65.7F, -8.15F, -31.5F);
		rightAnimTrackModel[0][1].rotateAngleZ = -1.57079633F;

		rightAnimTrackModel[0][2].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1519
		rightAnimTrackModel[0][2].setRotationPoint(65.7F, -4.15F, -31.5F);
		rightAnimTrackModel[0][2].rotateAngleZ = -2.32128791F;

		rightAnimTrackModel[0][3].addShapeBox(0F, 0F, 0F, 19, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1524
		rightAnimTrackModel[0][3].setRotationPoint(62.3F, -0.5F, -31.5F);
		rightAnimTrackModel[0][3].rotateAngleZ = -2.55690735F;

		rightAnimTrackModel[0][4].addShapeBox(0F, 0F, 0F, 97, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1525
		rightAnimTrackModel[0][4].setRotationPoint(46.5F, 10F, -31.5F);
		rightAnimTrackModel[0][4].rotateAngleZ = -3.14159265F;

		rightAnimTrackModel[0][5].addShapeBox(0F, 0F, 0F, 15, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1527
		rightAnimTrackModel[0][5].setRotationPoint(-50.5F, 10F, -31.5F);
		rightAnimTrackModel[0][5].rotateAngleZ = -3.66519143F;

		rightAnimTrackModel[0][6].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1529
		rightAnimTrackModel[0][6].setRotationPoint(-63.5F, 2.5F, -31.5F);
		rightAnimTrackModel[0][6].rotateAngleZ = -3.82227106F;

		rightAnimTrackModel[0][7].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1531
		rightAnimTrackModel[0][7].setRotationPoint(-69F, -1.9F, -31.5F);
		rightAnimTrackModel[0][7].rotateAngleZ = -4.71238898F;

		rightAnimTrackModel[0][8].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1533
		rightAnimTrackModel[0][8].setRotationPoint(-69F, -7.9F, -31.5F);
		rightAnimTrackModel[0][8].rotateAngleZ = -5.58505361F;

		rightAnimTrackModel[0][9].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0.4F, -0.24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -0.24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1538
		rightAnimTrackModel[0][9].setRotationPoint(-64F, -12F, -31.5F);

		rightAnimTrackModel[0][10].addShapeBox(0F, 0F, 0F, 120, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1539
		rightAnimTrackModel[0][10].setRotationPoint(-58F, -12F, -31.5F);
		rightAnimTrackModel[0][10].rotateAngleZ = -0.00523599F;
		
		
		leftAnimTrackModel[1] = new ModelRendererTurbo[11];
		leftAnimTrackModel[1][0] = new ModelRendererTurbo(this, 600, 108, textureX, textureY); // Import ImportBox1515
		leftAnimTrackModel[1][1] = new ModelRendererTurbo(this, 600, 124, textureX, textureY); // Import ImportBox1516
		leftAnimTrackModel[1][2] = new ModelRendererTurbo(this, 600, 139, textureX, textureY); // Import ImportBox1518
		leftAnimTrackModel[1][3] = new ModelRendererTurbo(this, 600, 154, textureX, textureY); // Import ImportBox1520
		leftAnimTrackModel[1][4] = new ModelRendererTurbo(this, 600, 169, textureX, textureY); // Import ImportBox1522
		leftAnimTrackModel[1][5] = new ModelRendererTurbo(this, 600, 185, textureX, textureY); // Import ImportBox1526
		leftAnimTrackModel[1][6] = new ModelRendererTurbo(this, 600, 200, textureX, textureY); // Import ImportBox1528
		leftAnimTrackModel[1][7] = new ModelRendererTurbo(this, 600, 215, textureX, textureY); // Import ImportBox1530
		leftAnimTrackModel[1][8] = new ModelRendererTurbo(this, 600, 230, textureX, textureY); // Import ImportBox1532
		leftAnimTrackModel[1][9] = new ModelRendererTurbo(this, 600, 246, textureX, textureY); // Import ImportBox1534
		leftAnimTrackModel[1][10] = new ModelRendererTurbo(this, 600, 261, textureX, textureY); // Import ImportBox1536

		leftAnimTrackModel[1][0].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1515
		leftAnimTrackModel[1][0].setRotationPoint(62F, -11.5F, 19.5F);
		leftAnimTrackModel[1][0].rotateAngleZ = -0.73303829F;

		leftAnimTrackModel[1][1].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1516
		leftAnimTrackModel[1][1].setRotationPoint(65.7F, -8.15F, 19.5F);
		leftAnimTrackModel[1][1].rotateAngleZ = -1.57079633F;

		leftAnimTrackModel[1][2].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1518
		leftAnimTrackModel[1][2].setRotationPoint(65.7F, -4.15F, 19.5F);
		leftAnimTrackModel[1][2].rotateAngleZ = -2.32128791F;

		leftAnimTrackModel[1][3].addShapeBox(0F, 0F, 0F, 19, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1520
		leftAnimTrackModel[1][3].setRotationPoint(62.3F, -0.5F, 19.5F);
		leftAnimTrackModel[1][3].rotateAngleZ = -2.55690735F;

		leftAnimTrackModel[1][4].addShapeBox(0F, 0F, 0F, 97, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1522
		leftAnimTrackModel[1][4].setRotationPoint(46.5F, 10F, 19.5F);
		leftAnimTrackModel[1][4].rotateAngleZ = -3.14159265F;

		leftAnimTrackModel[1][5].addShapeBox(0F, 0F, 0F, 15, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1526
		leftAnimTrackModel[1][5].setRotationPoint(-50.5F, 10F, 19.5F);
		leftAnimTrackModel[1][5].rotateAngleZ = -3.66519143F;

		leftAnimTrackModel[1][6].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1528
		leftAnimTrackModel[1][6].setRotationPoint(-63.5F, 2.5F, 19.5F);
		leftAnimTrackModel[1][6].rotateAngleZ = -3.82227106F;

		leftAnimTrackModel[1][7].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1530
		leftAnimTrackModel[1][7].setRotationPoint(-69F, -1.9F, 19.5F);
		leftAnimTrackModel[1][7].rotateAngleZ = -4.71238898F;

		leftAnimTrackModel[1][8].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1532
		leftAnimTrackModel[1][8].setRotationPoint(-69F, -7.9F, 19.5F);
		leftAnimTrackModel[1][8].rotateAngleZ = -5.58505361F;

		leftAnimTrackModel[1][9].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F, 0.4F, -0.24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -0.24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1534
		leftAnimTrackModel[1][9].setRotationPoint(-64F, -12F, 19.5F);

		leftAnimTrackModel[1][10].addShapeBox(0F, 0F, 0F, 120, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1536
		leftAnimTrackModel[1][10].setRotationPoint(-58F, -12F, 19.5F);
		leftAnimTrackModel[1][10].rotateAngleZ = -0.00523599F;

		rightAnimTrackModel[1] = new ModelRendererTurbo[11];
		rightAnimTrackModel[1][0] = new ModelRendererTurbo(this, 600, 108, textureX, textureY); // Import ImportBox1514
		rightAnimTrackModel[1][1] = new ModelRendererTurbo(this, 600, 124, textureX, textureY); // Import ImportBox1517
		rightAnimTrackModel[1][2] = new ModelRendererTurbo(this, 600, 139, textureX, textureY); // Import ImportBox1519
		rightAnimTrackModel[1][3] = new ModelRendererTurbo(this, 600, 154, textureX, textureY); // Import ImportBox1524
		rightAnimTrackModel[1][4] = new ModelRendererTurbo(this, 600, 169, textureX, textureY); // Import ImportBox1525
		rightAnimTrackModel[1][5] = new ModelRendererTurbo(this, 600, 185, textureX, textureY); // Import ImportBox1527
		rightAnimTrackModel[1][6] = new ModelRendererTurbo(this, 600, 200, textureX, textureY); // Import ImportBox1529
		rightAnimTrackModel[1][7] = new ModelRendererTurbo(this, 600, 215, textureX, textureY); // Import ImportBox1531
		rightAnimTrackModel[1][8] = new ModelRendererTurbo(this, 600, 230, textureX, textureY); // Import ImportBox1533
		rightAnimTrackModel[1][9] = new ModelRendererTurbo(this, 600, 246, textureX, textureY); // Import ImportBox1538
		rightAnimTrackModel[1][10] = new ModelRendererTurbo(this, 600, 261, textureX, textureY); // Import ImportBox1539

		rightAnimTrackModel[1][0].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1514
		rightAnimTrackModel[1][0].setRotationPoint(62F, -11.5F, -31.5F);
		rightAnimTrackModel[1][0].rotateAngleZ = -0.73303829F;

		rightAnimTrackModel[1][1].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1517
		rightAnimTrackModel[1][1].setRotationPoint(65.7F, -8.15F, -31.5F);
		rightAnimTrackModel[1][1].rotateAngleZ = -1.57079633F;

		rightAnimTrackModel[1][2].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1519
		rightAnimTrackModel[1][2].setRotationPoint(65.7F, -4.15F, -31.5F);
		rightAnimTrackModel[1][2].rotateAngleZ = -2.32128791F;

		rightAnimTrackModel[1][3].addShapeBox(0F, 0F, 0F, 19, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1524
		rightAnimTrackModel[1][3].setRotationPoint(62.3F, -0.5F, -31.5F);
		rightAnimTrackModel[1][3].rotateAngleZ = -2.55690735F;

		rightAnimTrackModel[1][4].addShapeBox(0F, 0F, 0F, 97, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1525
		rightAnimTrackModel[1][4].setRotationPoint(46.5F, 10F, -31.5F);
		rightAnimTrackModel[1][4].rotateAngleZ = -3.14159265F;

		rightAnimTrackModel[1][5].addShapeBox(0F, 0F, 0F, 15, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1527
		rightAnimTrackModel[1][5].setRotationPoint(-50.5F, 10F, -31.5F);
		rightAnimTrackModel[1][5].rotateAngleZ = -3.66519143F;

		rightAnimTrackModel[1][6].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1529
		rightAnimTrackModel[1][6].setRotationPoint(-63.5F, 2.5F, -31.5F);
		rightAnimTrackModel[1][6].rotateAngleZ = -3.82227106F;

		rightAnimTrackModel[1][7].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1531
		rightAnimTrackModel[1][7].setRotationPoint(-69F, -1.9F, -31.5F);
		rightAnimTrackModel[1][7].rotateAngleZ = -4.71238898F;

		rightAnimTrackModel[1][8].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1533
		rightAnimTrackModel[1][8].setRotationPoint(-69F, -7.9F, -31.5F);
		rightAnimTrackModel[1][8].rotateAngleZ = -5.58505361F;

		rightAnimTrackModel[1][9].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F, 0.4F, -0.24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -0.24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1538
		rightAnimTrackModel[1][9].setRotationPoint(-64F, -12F, -31.5F);

		rightAnimTrackModel[1][10].addShapeBox(0F, 0F, 0F, 120, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1539
		rightAnimTrackModel[1][10].setRotationPoint(-58F, -12F, -31.5F);
		rightAnimTrackModel[1][10].rotateAngleZ = -0.00523599F;
		
		leftAnimTrackModel[2] = new ModelRendererTurbo[11];
		leftAnimTrackModel[2][0] = new ModelRendererTurbo(this, 900, 108, textureX, textureY); // Import ImportBox1515
		leftAnimTrackModel[2][1] = new ModelRendererTurbo(this, 900, 124, textureX, textureY); // Import ImportBox1516
		leftAnimTrackModel[2][2] = new ModelRendererTurbo(this, 900, 139, textureX, textureY); // Import ImportBox1518
		leftAnimTrackModel[2][3] = new ModelRendererTurbo(this, 900, 154, textureX, textureY); // Import ImportBox1520
		leftAnimTrackModel[2][4] = new ModelRendererTurbo(this, 900, 169, textureX, textureY); // Import ImportBox1522
		leftAnimTrackModel[2][5] = new ModelRendererTurbo(this, 900, 185, textureX, textureY); // Import ImportBox1526
		leftAnimTrackModel[2][6] = new ModelRendererTurbo(this, 900, 200, textureX, textureY); // Import ImportBox1528
		leftAnimTrackModel[2][7] = new ModelRendererTurbo(this, 900, 215, textureX, textureY); // Import ImportBox1530
		leftAnimTrackModel[2][8] = new ModelRendererTurbo(this, 900, 230, textureX, textureY); // Import ImportBox1532
		leftAnimTrackModel[2][9] = new ModelRendererTurbo(this, 900, 246, textureX, textureY); // Import ImportBox1534
		leftAnimTrackModel[2][10] = new ModelRendererTurbo(this, 900, 261, textureX, textureY); // Import ImportBox1536

		leftAnimTrackModel[2][0].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1515
		leftAnimTrackModel[2][0].setRotationPoint(62F, -11.5F, 19.5F);
		leftAnimTrackModel[2][0].rotateAngleZ = -0.73303829F;

		leftAnimTrackModel[2][1].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1516
		leftAnimTrackModel[2][1].setRotationPoint(65.7F, -8.15F, 19.5F);
		leftAnimTrackModel[2][1].rotateAngleZ = -1.57079633F;

		leftAnimTrackModel[2][2].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1518
		leftAnimTrackModel[2][2].setRotationPoint(65.7F, -4.15F, 19.5F);
		leftAnimTrackModel[2][2].rotateAngleZ = -2.32128791F;

		leftAnimTrackModel[2][3].addShapeBox(0F, 0F, 0F, 19, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1520
		leftAnimTrackModel[2][3].setRotationPoint(62.3F, -0.5F, 19.5F);
		leftAnimTrackModel[2][3].rotateAngleZ = -2.55690735F;

		leftAnimTrackModel[2][4].addShapeBox(0F, 0F, 0F, 97, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1522
		leftAnimTrackModel[2][4].setRotationPoint(46.5F, 10F, 19.5F);
		leftAnimTrackModel[2][4].rotateAngleZ = -3.14159265F;

		leftAnimTrackModel[2][5].addShapeBox(0F, 0F, 0F, 15, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1526
		leftAnimTrackModel[2][5].setRotationPoint(-50.5F, 10F, 19.5F);
		leftAnimTrackModel[2][5].rotateAngleZ = -3.66519143F;

		leftAnimTrackModel[2][6].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1528
		leftAnimTrackModel[2][6].setRotationPoint(-63.5F, 2.5F, 19.5F);
		leftAnimTrackModel[2][6].rotateAngleZ = -3.82227106F;

		leftAnimTrackModel[2][7].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1530
		leftAnimTrackModel[2][7].setRotationPoint(-69F, -1.9F, 19.5F);
		leftAnimTrackModel[2][7].rotateAngleZ = -4.71238898F;

		leftAnimTrackModel[2][8].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1532
		leftAnimTrackModel[2][8].setRotationPoint(-69F, -7.9F, 19.5F);
		leftAnimTrackModel[2][8].rotateAngleZ = -5.58505361F;

		leftAnimTrackModel[2][9].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F, 0.4F, -0.24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -0.24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1534
		leftAnimTrackModel[2][9].setRotationPoint(-64F, -12F, 19.5F);

		leftAnimTrackModel[2][10].addShapeBox(0F, 0F, 0F, 120, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1536
		leftAnimTrackModel[2][10].setRotationPoint(-58F, -12F, 19.5F);
		leftAnimTrackModel[2][10].rotateAngleZ = -0.00523599F;


		rightAnimTrackModel[2] = new ModelRendererTurbo[11];
		rightAnimTrackModel[2][0] = new ModelRendererTurbo(this, 900, 108, textureX, textureY); // Import ImportBox1514
		rightAnimTrackModel[2][1] = new ModelRendererTurbo(this, 900, 124, textureX, textureY); // Import ImportBox1517
		rightAnimTrackModel[2][2] = new ModelRendererTurbo(this, 900, 139, textureX, textureY); // Import ImportBox1519
		rightAnimTrackModel[2][3] = new ModelRendererTurbo(this, 900, 154, textureX, textureY); // Import ImportBox1524
		rightAnimTrackModel[2][4] = new ModelRendererTurbo(this, 900, 169, textureX, textureY); // Import ImportBox1525
		rightAnimTrackModel[2][5] = new ModelRendererTurbo(this, 900, 185, textureX, textureY); // Import ImportBox1527
		rightAnimTrackModel[2][6] = new ModelRendererTurbo(this, 900, 200, textureX, textureY); // Import ImportBox1529
		rightAnimTrackModel[2][7] = new ModelRendererTurbo(this, 900, 215, textureX, textureY); // Import ImportBox1531
		rightAnimTrackModel[2][8] = new ModelRendererTurbo(this, 900, 230, textureX, textureY); // Import ImportBox1533
		rightAnimTrackModel[2][9] = new ModelRendererTurbo(this, 900, 246, textureX, textureY); // Import ImportBox1538
		rightAnimTrackModel[2][10] = new ModelRendererTurbo(this, 900, 261, textureX, textureY); // Import ImportBox1539

		rightAnimTrackModel[2][0].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1514
		rightAnimTrackModel[2][0].setRotationPoint(62F, -11.5F, -31.5F);
		rightAnimTrackModel[2][0].rotateAngleZ = -0.73303829F;

		rightAnimTrackModel[2][1].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1517
		rightAnimTrackModel[2][1].setRotationPoint(65.7F, -8.15F, -31.5F);
		rightAnimTrackModel[2][1].rotateAngleZ = -1.57079633F;

		rightAnimTrackModel[2][2].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1519
		rightAnimTrackModel[2][2].setRotationPoint(65.7F, -4.15F, -31.5F);
		rightAnimTrackModel[2][2].rotateAngleZ = -2.32128791F;

		rightAnimTrackModel[2][3].addShapeBox(0F, 0F, 0F, 19, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1524
		rightAnimTrackModel[2][3].setRotationPoint(62.3F, -0.5F, -31.5F);
		rightAnimTrackModel[2][3].rotateAngleZ = -2.55690735F;

		rightAnimTrackModel[2][4].addShapeBox(0F, 0F, 0F, 97, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1525
		rightAnimTrackModel[2][4].setRotationPoint(46.5F, 10F, -31.5F);
		rightAnimTrackModel[2][4].rotateAngleZ = -3.14159265F;

		rightAnimTrackModel[2][5].addShapeBox(0F, 0F, 0F, 15, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1527
		rightAnimTrackModel[2][5].setRotationPoint(-50.5F, 10F, -31.5F);
		rightAnimTrackModel[2][5].rotateAngleZ = -3.66519143F;

		rightAnimTrackModel[2][6].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1529
		rightAnimTrackModel[2][6].setRotationPoint(-63.5F, 2.5F, -31.5F);
		rightAnimTrackModel[2][6].rotateAngleZ = -3.82227106F;

		rightAnimTrackModel[2][7].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1531
		rightAnimTrackModel[2][7].setRotationPoint(-69F, -1.9F, -31.5F);
		rightAnimTrackModel[2][7].rotateAngleZ = -4.71238898F;

		rightAnimTrackModel[2][8].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1533
		rightAnimTrackModel[2][8].setRotationPoint(-69F, -7.9F, -31.5F);
		rightAnimTrackModel[2][8].rotateAngleZ = -5.58505361F;

		rightAnimTrackModel[2][9].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F, 0.4F, -0.24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -0.24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1538
		rightAnimTrackModel[2][9].setRotationPoint(-64F, -12F, -31.5F);

		rightAnimTrackModel[2][10].addShapeBox(0F, 0F, 0F, 120, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1539
		rightAnimTrackModel[2][10].setRotationPoint(-58F, -12F, -31.5F);
		rightAnimTrackModel[2][10].rotateAngleZ = -0.00523599F;


		initbodyModel_1();
		initbodyModel_2();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 0, 65, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 0, 100, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 0, 137, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 0, 161, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 0, 137, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 0, 161, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 0, 183, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 0, 205, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 0, 227, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 0, 252, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 0, 279, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 0, 303, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 0, 322, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 0, 344, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 0, 344, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 0, 252, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 0, 279, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 0, 303, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 0, 322, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 0, 344, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 0, 344, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 0, 368, textureX, textureY); // Box 26
		bodyModel[24] = new ModelRendererTurbo(this, 0, 399, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 0, 416, textureX, textureY); // Box 30
		bodyModel[26] = new ModelRendererTurbo(this, 0, 443, textureX, textureY); // Box 31
		bodyModel[27] = new ModelRendererTurbo(this, 0, 459, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 0, 443, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 0, 459, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 0, 474, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 0, 474, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 0, 512, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 0, 368, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 0, 399, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 0, 512, textureX, textureY); // Box 40
		bodyModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 41
		bodyModel[37] = new ModelRendererTurbo(this, 0, 528, textureX, textureY); // Box 42
		bodyModel[38] = new ModelRendererTurbo(this, 0, 549, textureX, textureY); // Box 43
		bodyModel[39] = new ModelRendererTurbo(this, 0, 528, textureX, textureY); // Box 44
		bodyModel[40] = new ModelRendererTurbo(this, 0, 549, textureX, textureY); // Box 45
		bodyModel[41] = new ModelRendererTurbo(this, 0, 570, textureX, textureY); // Box 46
		bodyModel[42] = new ModelRendererTurbo(this, 0, 625, textureX, textureY); // Box 47
		bodyModel[43] = new ModelRendererTurbo(this, 0, 678, textureX, textureY); // Box 48
		bodyModel[44] = new ModelRendererTurbo(this, 0, 690, textureX, textureY); // Box 49
		bodyModel[45] = new ModelRendererTurbo(this, 0, 702, textureX, textureY); // Box 50
		bodyModel[46] = new ModelRendererTurbo(this, 0, 712, textureX, textureY); // Box 51
		bodyModel[47] = new ModelRendererTurbo(this, 0, 727, textureX, textureY); // Box 52
		bodyModel[48] = new ModelRendererTurbo(this, 0, 727, textureX, textureY); // Box 53
		bodyModel[49] = new ModelRendererTurbo(this, 0, 739, textureX, textureY); // Box 54
		bodyModel[50] = new ModelRendererTurbo(this, 0, 739, textureX, textureY); // Box 55
		bodyModel[51] = new ModelRendererTurbo(this, 0, 678, textureX, textureY); // Box 60
		bodyModel[52] = new ModelRendererTurbo(this, 0, 690, textureX, textureY); // Box 61
		bodyModel[53] = new ModelRendererTurbo(this, 0, 702, textureX, textureY); // Box 62
		bodyModel[54] = new ModelRendererTurbo(this, 0, 712, textureX, textureY); // Box 63
		bodyModel[55] = new ModelRendererTurbo(this, 0, 727, textureX, textureY); // Box 64
		bodyModel[56] = new ModelRendererTurbo(this, 0, 739, textureX, textureY); // Box 65
		bodyModel[57] = new ModelRendererTurbo(this, 0, 727, textureX, textureY); // Box 66
		bodyModel[58] = new ModelRendererTurbo(this, 0, 739, textureX, textureY); // Box 67
		bodyModel[59] = new ModelRendererTurbo(this, 0, 711, textureX, textureY); // Box 72
		bodyModel[60] = new ModelRendererTurbo(this, 0, 773, textureX, textureY); // Box 73
		bodyModel[61] = new ModelRendererTurbo(this, 0, 792, textureX, textureY); // Box 74
		bodyModel[62] = new ModelRendererTurbo(this, 0, 773, textureX, textureY); // Box 75
		bodyModel[63] = new ModelRendererTurbo(this, 0, 792, textureX, textureY); // Box 76
		bodyModel[64] = new ModelRendererTurbo(this, 0, 803, textureX, textureY); // Box 77
		bodyModel[65] = new ModelRendererTurbo(this, 0, 824, textureX, textureY); // Box 78
		bodyModel[66] = new ModelRendererTurbo(this, 0, 803, textureX, textureY); // Box 79
		bodyModel[67] = new ModelRendererTurbo(this, 0, 824, textureX, textureY); // Box 80
		bodyModel[68] = new ModelRendererTurbo(this, 0, 829, textureX, textureY); // Box 81
		bodyModel[69] = new ModelRendererTurbo(this, 0, 847, textureX, textureY); // Box 82
		bodyModel[70] = new ModelRendererTurbo(this, 0, 867, textureX, textureY); // Box 83
		bodyModel[71] = new ModelRendererTurbo(this, 0, 886, textureX, textureY); // Box 84
		bodyModel[72] = new ModelRendererTurbo(this, 0, 867, textureX, textureY); // Box 85
		bodyModel[73] = new ModelRendererTurbo(this, 0, 904, textureX, textureY); // Box 86
		bodyModel[74] = new ModelRendererTurbo(this, 0, 867, textureX, textureY); // Box 87
		bodyModel[75] = new ModelRendererTurbo(this, 0, 921, textureX, textureY); // Box 88
		bodyModel[76] = new ModelRendererTurbo(this, 0, 938, textureX, textureY); // Box 89
		bodyModel[77] = new ModelRendererTurbo(this, 0, 955, textureX, textureY); // Box 90
		bodyModel[78] = new ModelRendererTurbo(this, 0, 955, textureX, textureY); // Box 91
		bodyModel[79] = new ModelRendererTurbo(this, 0, 955, textureX, textureY); // Box 92
		bodyModel[80] = new ModelRendererTurbo(this, 0, 955, textureX, textureY); // Box 93
		bodyModel[81] = new ModelRendererTurbo(this, 0, 955, textureX, textureY); // Box 94
		bodyModel[82] = new ModelRendererTurbo(this, 0, 955, textureX, textureY); // Box 95
		bodyModel[83] = new ModelRendererTurbo(this, 0, 955, textureX, textureY); // Box 96
		bodyModel[84] = new ModelRendererTurbo(this, 0, 955, textureX, textureY); // Box 97
		bodyModel[85] = new ModelRendererTurbo(this, 0, 960, textureX, textureY); // Box 98
		bodyModel[86] = new ModelRendererTurbo(this, 0, 829, textureX, textureY); // Box 99
		bodyModel[87] = new ModelRendererTurbo(this, 0, 847, textureX, textureY); // Box 100
		bodyModel[88] = new ModelRendererTurbo(this, 0, 867, textureX, textureY); // Box 101
		bodyModel[89] = new ModelRendererTurbo(this, 0, 886, textureX, textureY); // Box 102
		bodyModel[90] = new ModelRendererTurbo(this, 0, 867, textureX, textureY); // Box 103
		bodyModel[91] = new ModelRendererTurbo(this, 0, 904, textureX, textureY); // Box 104
		bodyModel[92] = new ModelRendererTurbo(this, 0, 867, textureX, textureY); // Box 105
		bodyModel[93] = new ModelRendererTurbo(this, 0, 921, textureX, textureY); // Box 106
		bodyModel[94] = new ModelRendererTurbo(this, 0, 938, textureX, textureY); // Box 107
		bodyModel[95] = new ModelRendererTurbo(this, 0, 955, textureX, textureY); // Box 108
		bodyModel[96] = new ModelRendererTurbo(this, 0, 955, textureX, textureY); // Box 109
		bodyModel[97] = new ModelRendererTurbo(this, 0, 955, textureX, textureY); // Box 110
		bodyModel[98] = new ModelRendererTurbo(this, 0, 955, textureX, textureY); // Box 111
		bodyModel[99] = new ModelRendererTurbo(this, 0, 955, textureX, textureY); // Box 112
		bodyModel[100] = new ModelRendererTurbo(this, 0, 955, textureX, textureY); // Box 113
		bodyModel[101] = new ModelRendererTurbo(this, 0, 955, textureX, textureY); // Box 114
		bodyModel[102] = new ModelRendererTurbo(this, 0, 955, textureX, textureY); // Box 115
		bodyModel[103] = new ModelRendererTurbo(this, 0, 960, textureX, textureY); // Box 116
		bodyModel[104] = new ModelRendererTurbo(this, 0, 965, textureX, textureY); // Box 117
		bodyModel[105] = new ModelRendererTurbo(this, 0, 965, textureX, textureY); // Box 118
		bodyModel[106] = new ModelRendererTurbo(this, 0, 975, textureX, textureY); // Box 120
		bodyModel[107] = new ModelRendererTurbo(this, 0, 965, textureX, textureY); // Box 121
		bodyModel[108] = new ModelRendererTurbo(this, 0, 965, textureX, textureY); // Box 122
		bodyModel[109] = new ModelRendererTurbo(this, 0, 975, textureX, textureY); // Box 123
		bodyModel[110] = new ModelRendererTurbo(this, 0, 993, textureX, textureY); // Box 124
		bodyModel[111] = new ModelRendererTurbo(this, 0, 998, textureX, textureY); // Box 125
		bodyModel[112] = new ModelRendererTurbo(this, 0, 1039, textureX, textureY); // Box 126
		bodyModel[113] = new ModelRendererTurbo(this, 0, 1056, textureX, textureY); // Box 127
		bodyModel[114] = new ModelRendererTurbo(this, 0, 993, textureX, textureY); // Box 128
		bodyModel[115] = new ModelRendererTurbo(this, 0, 1039, textureX, textureY); // Box 129
		bodyModel[116] = new ModelRendererTurbo(this, 0, 1056, textureX, textureY); // Box 130
		bodyModel[117] = new ModelRendererTurbo(this, 0, 1078, textureX, textureY); // Box 131
		bodyModel[118] = new ModelRendererTurbo(this, 0, 1078, textureX, textureY); // Box 135
		bodyModel[119] = new ModelRendererTurbo(this, 0, 1078, textureX, textureY); // Box 138
		bodyModel[120] = new ModelRendererTurbo(this, 0, 1078, textureX, textureY); // Box 140
		bodyModel[121] = new ModelRendererTurbo(this, 0, 1078, textureX, textureY); // Box 144
		bodyModel[122] = new ModelRendererTurbo(this, 0, 1078, textureX, textureY); // Box 147
		bodyModel[123] = new ModelRendererTurbo(this, 0, 1084, textureX, textureY); // Box 151
		bodyModel[124] = new ModelRendererTurbo(this, 0, 1084, textureX, textureY); // Box 152
		bodyModel[125] = new ModelRendererTurbo(this, 0, 1084, textureX, textureY); // Box 155
		bodyModel[126] = new ModelRendererTurbo(this, 0, 1084, textureX, textureY); // Box 158
		bodyModel[127] = new ModelRendererTurbo(this, 0, 1084, textureX, textureY); // Box 163
		bodyModel[128] = new ModelRendererTurbo(this, 0, 1084, textureX, textureY); // Box 164
		bodyModel[129] = new ModelRendererTurbo(this, 0, 1084, textureX, textureY); // Box 167
		bodyModel[130] = new ModelRendererTurbo(this, 0, 1084, textureX, textureY); // Box 170
		bodyModel[131] = new ModelRendererTurbo(this, 0, 1088, textureX, textureY); // Box 173
		bodyModel[132] = new ModelRendererTurbo(this, 0, 1099, textureX, textureY); // Box 174
		bodyModel[133] = new ModelRendererTurbo(this, 0, 1099, textureX, textureY); // Box 175
		bodyModel[134] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Box 176
		bodyModel[135] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Box 177
		bodyModel[136] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Box 178
		bodyModel[137] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Box 179
		bodyModel[138] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Box 180
		bodyModel[139] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Box 181
		bodyModel[140] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Box 182
		bodyModel[141] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Box 183
		bodyModel[142] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Box 184
		bodyModel[143] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Box 185
		bodyModel[144] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Box 186
		bodyModel[145] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Box 187
		bodyModel[146] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Box 188
		bodyModel[147] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Box 189
		bodyModel[148] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Box 190
		bodyModel[149] = new ModelRendererTurbo(this, 0, 1116, textureX, textureY); // Box 191
		bodyModel[150] = new ModelRendererTurbo(this, 0, 1121, textureX, textureY); // Box 192
		bodyModel[151] = new ModelRendererTurbo(this, 0, 1088, textureX, textureY); // Box 193
		bodyModel[152] = new ModelRendererTurbo(this, 0, 1099, textureX, textureY); // Box 194
		bodyModel[153] = new ModelRendererTurbo(this, 0, 1099, textureX, textureY); // Box 195
		bodyModel[154] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Box 196
		bodyModel[155] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Box 197
		bodyModel[156] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Box 198
		bodyModel[157] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Box 199
		bodyModel[158] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Box 200
		bodyModel[159] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Box 201
		bodyModel[160] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Box 202
		bodyModel[161] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Box 203
		bodyModel[162] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Box 204
		bodyModel[163] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Box 205
		bodyModel[164] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Box 206
		bodyModel[165] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Box 207
		bodyModel[166] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Box 208
		bodyModel[167] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Box 209
		bodyModel[168] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Box 210
		bodyModel[169] = new ModelRendererTurbo(this, 0, 1116, textureX, textureY); // Box 211
		bodyModel[170] = new ModelRendererTurbo(this, 0, 1121, textureX, textureY); // Box 212
		bodyModel[171] = new ModelRendererTurbo(this, 0, 1125, textureX, textureY); // Box 213
		bodyModel[172] = new ModelRendererTurbo(this, 0, 1125, textureX, textureY); // Box 214
		bodyModel[173] = new ModelRendererTurbo(this, 0, 1128, textureX, textureY); // Box 215
		bodyModel[174] = new ModelRendererTurbo(this, 0, 1128, textureX, textureY); // Box 216
		bodyModel[175] = new ModelRendererTurbo(this, 0, 1141, textureX, textureY); // Box 217
		bodyModel[176] = new ModelRendererTurbo(this, 0, 1141, textureX, textureY); // Box 218
		bodyModel[177] = new ModelRendererTurbo(this, 0, 1145, textureX, textureY); // Box 219
		bodyModel[178] = new ModelRendererTurbo(this, 0, 1141, textureX, textureY); // Box 220
		bodyModel[179] = new ModelRendererTurbo(this, 0, 1141, textureX, textureY); // Box 221
		bodyModel[180] = new ModelRendererTurbo(this, 0, 1150, textureX, textureY); // Box 222
		bodyModel[181] = new ModelRendererTurbo(this, 0, 1153, textureX, textureY); // Box 223
		bodyModel[182] = new ModelRendererTurbo(this, 0, 1159, textureX, textureY); // Box 224
		bodyModel[183] = new ModelRendererTurbo(this, 0, 1164, textureX, textureY); // Box 225
		bodyModel[184] = new ModelRendererTurbo(this, 0, 1168, textureX, textureY); // Box 226
		bodyModel[185] = new ModelRendererTurbo(this, 0, 1171, textureX, textureY); // Box 227
		bodyModel[186] = new ModelRendererTurbo(this, 0, 1178, textureX, textureY); // Box 228
		bodyModel[187] = new ModelRendererTurbo(this, 0, 1170, textureX, textureY); // Box 229
		bodyModel[188] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Box 230
		bodyModel[189] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Box 231
		bodyModel[190] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Box 232
		bodyModel[191] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Box 233
		bodyModel[192] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Box 234
		bodyModel[193] = new ModelRendererTurbo(this, 0, 1141, textureX, textureY); // Box 235
		bodyModel[194] = new ModelRendererTurbo(this, 0, 1141, textureX, textureY); // Box 236
		bodyModel[195] = new ModelRendererTurbo(this, 0, 1145, textureX, textureY); // Box 237
		bodyModel[196] = new ModelRendererTurbo(this, 0, 1141, textureX, textureY); // Box 238
		bodyModel[197] = new ModelRendererTurbo(this, 0, 1141, textureX, textureY); // Box 239
		bodyModel[198] = new ModelRendererTurbo(this, 0, 1150, textureX, textureY); // Box 240
		bodyModel[199] = new ModelRendererTurbo(this, 0, 1153, textureX, textureY); // Box 241
		bodyModel[200] = new ModelRendererTurbo(this, 0, 1159, textureX, textureY); // Box 242
		bodyModel[201] = new ModelRendererTurbo(this, 0, 1164, textureX, textureY); // Box 243
		bodyModel[202] = new ModelRendererTurbo(this, 0, 1168, textureX, textureY); // Box 244
		bodyModel[203] = new ModelRendererTurbo(this, 0, 1171, textureX, textureY); // Box 245
		bodyModel[204] = new ModelRendererTurbo(this, 0, 1178, textureX, textureY); // Box 246
		bodyModel[205] = new ModelRendererTurbo(this, 0, 1170, textureX, textureY); // Box 247
		bodyModel[206] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Box 248
		bodyModel[207] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Box 249
		bodyModel[208] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Box 250
		bodyModel[209] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Box 251
		bodyModel[210] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Box 252
		bodyModel[211] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 253
		bodyModel[212] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 254
		bodyModel[213] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 255
		bodyModel[214] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 256
		bodyModel[215] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 257
		bodyModel[216] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 258
		bodyModel[217] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 259
		bodyModel[218] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 260
		bodyModel[219] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 261
		bodyModel[220] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 262
		bodyModel[221] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 264
		bodyModel[222] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 265
		bodyModel[223] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 266
		bodyModel[224] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 267
		bodyModel[225] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 268
		bodyModel[226] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 269
		bodyModel[227] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 270
		bodyModel[228] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 271
		bodyModel[229] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 272
		bodyModel[230] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 273
		bodyModel[231] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 274
		bodyModel[232] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 275
		bodyModel[233] = new ModelRendererTurbo(this, 0, 1216, textureX, textureY); // Box 276
		bodyModel[234] = new ModelRendererTurbo(this, 0, 1219, textureX, textureY); // Box 277
		bodyModel[235] = new ModelRendererTurbo(this, 0, 1227, textureX, textureY); // Box 278
		bodyModel[236] = new ModelRendererTurbo(this, 0, 1231, textureX, textureY); // Box 279
		bodyModel[237] = new ModelRendererTurbo(this, 0, 1216, textureX, textureY); // Box 280
		bodyModel[238] = new ModelRendererTurbo(this, 0, 1219, textureX, textureY); // Box 281
		bodyModel[239] = new ModelRendererTurbo(this, 0, 1227, textureX, textureY); // Box 282
		bodyModel[240] = new ModelRendererTurbo(this, 0, 1241, textureX, textureY); // Box 283
		bodyModel[241] = new ModelRendererTurbo(this, 0, 1134, textureX, textureY); // Box 284
		bodyModel[242] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 285
		bodyModel[243] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 286
		bodyModel[244] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 287
		bodyModel[245] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 288
		bodyModel[246] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 289
		bodyModel[247] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 290
		bodyModel[248] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 291
		bodyModel[249] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 292
		bodyModel[250] = new ModelRendererTurbo(this, 50, 1197, textureX, textureY); // Box 293
		bodyModel[251] = new ModelRendererTurbo(this, 0, 1256, textureX, textureY); // Box 294
		bodyModel[252] = new ModelRendererTurbo(this, 0, 1256, textureX, textureY); // Box 295
		bodyModel[253] = new ModelRendererTurbo(this, 0, 1263, textureX, textureY); // Box 296
		bodyModel[254] = new ModelRendererTurbo(this, 0, 1084, textureX, textureY); // Box 298
		bodyModel[255] = new ModelRendererTurbo(this, 0, 1084, textureX, textureY); // Box 300
		bodyModel[256] = new ModelRendererTurbo(this, 0, 1084, textureX, textureY); // Box 303
		bodyModel[257] = new ModelRendererTurbo(this, 0, 1084, textureX, textureY); // Box 306
		bodyModel[258] = new ModelRendererTurbo(this, 0, 1084, textureX, textureY); // Box 310
		bodyModel[259] = new ModelRendererTurbo(this, 0, 1084, textureX, textureY); // Box 312
		bodyModel[260] = new ModelRendererTurbo(this, 0, 1084, textureX, textureY); // Box 315
		bodyModel[261] = new ModelRendererTurbo(this, 0, 1084, textureX, textureY); // Box 318
		bodyModel[262] = new ModelRendererTurbo(this, 0, 1078, textureX, textureY); // Box 322
		bodyModel[263] = new ModelRendererTurbo(this, 0, 1078, textureX, textureY); // Box 325
		bodyModel[264] = new ModelRendererTurbo(this, 0, 1072, textureX, textureY); // Box 327
		bodyModel[265] = new ModelRendererTurbo(this, 0, 1078, textureX, textureY); // Box 328
		bodyModel[266] = new ModelRendererTurbo(this, 0, 1078, textureX, textureY); // Box 331
		bodyModel[267] = new ModelRendererTurbo(this, 0, 1078, textureX, textureY); // Box 334
		bodyModel[268] = new ModelRendererTurbo(this, 0, 1078, textureX, textureY); // Box 337
		bodyModel[269] = new ModelRendererTurbo(this, 0, 1078, textureX, textureY); // Box 340
		bodyModel[270] = new ModelRendererTurbo(this, 0, 1078, textureX, textureY); // Box 343
		bodyModel[271] = new ModelRendererTurbo(this, 0, 1277, textureX, textureY); // Box 345
		bodyModel[272] = new ModelRendererTurbo(this, 0, 1277, textureX, textureY); // Box 346
		bodyModel[273] = new ModelRendererTurbo(this, 0, 1277, textureX, textureY); // Box 347
		bodyModel[274] = new ModelRendererTurbo(this, 0, 1277, textureX, textureY); // Box 348
		bodyModel[275] = new ModelRendererTurbo(this, 0, 1281, textureX, textureY); // Box 342
		bodyModel[276] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Box 344
		bodyModel[277] = new ModelRendererTurbo(this, 0, 1305, textureX, textureY); // Box 345
		bodyModel[278] = new ModelRendererTurbo(this, 0, 1305, textureX, textureY); // Box 346
		bodyModel[279] = new ModelRendererTurbo(this, 0, 1305, textureX, textureY); // Box 347
		bodyModel[280] = new ModelRendererTurbo(this, 0, 1305, textureX, textureY); // Box 348
		bodyModel[281] = new ModelRendererTurbo(this, 0, 1311, textureX, textureY); // Box 349
		bodyModel[282] = new ModelRendererTurbo(this, 0, 1311, textureX, textureY); // Box 350
		bodyModel[283] = new ModelRendererTurbo(this, 0, 1311, textureX, textureY); // Box 351
		bodyModel[284] = new ModelRendererTurbo(this, 0, 1311, textureX, textureY); // Box 352
		bodyModel[285] = new ModelRendererTurbo(this, 0, 1317, textureX, textureY); // Box 353
		bodyModel[286] = new ModelRendererTurbo(this, 0, 1324, textureX, textureY); // Box 354
		bodyModel[287] = new ModelRendererTurbo(this, 0, 1324, textureX, textureY); // Box 355
		bodyModel[288] = new ModelRendererTurbo(this, 0, 1331, textureX, textureY); // Box 356
		bodyModel[289] = new ModelRendererTurbo(this, 0, 1335, textureX, textureY); // Box 357
		bodyModel[290] = new ModelRendererTurbo(this, 0, 1340, textureX, textureY); // Box 358
		bodyModel[291] = new ModelRendererTurbo(this, 0, 1340, textureX, textureY); // Box 359
		bodyModel[292] = new ModelRendererTurbo(this, 0, 1324, textureX, textureY); // Box 360
		bodyModel[293] = new ModelRendererTurbo(this, 0, 1331, textureX, textureY); // Box 361
		bodyModel[294] = new ModelRendererTurbo(this, 0, 1317, textureX, textureY); // Box 362
		bodyModel[295] = new ModelRendererTurbo(this, 0, 1324, textureX, textureY); // Box 363
		bodyModel[296] = new ModelRendererTurbo(this, 0, 1335, textureX, textureY); // Box 364
		bodyModel[297] = new ModelRendererTurbo(this, 0, 1326, textureX, textureY); // Box 365
		bodyModel[298] = new ModelRendererTurbo(this, 0, 1326, textureX, textureY); // Box 366
		bodyModel[299] = new ModelRendererTurbo(this, 0, 1360, textureX, textureY); // Box 367
		bodyModel[300] = new ModelRendererTurbo(this, 0, 1415, textureX, textureY); // Box 368
		bodyModel[301] = new ModelRendererTurbo(this, 0, 1469, textureX, textureY); // Box 369
		bodyModel[302] = new ModelRendererTurbo(this, 0, 1479, textureX, textureY); // Box 370
		bodyModel[303] = new ModelRendererTurbo(this, 0, 1479, textureX, textureY); // Box 371
		bodyModel[304] = new ModelRendererTurbo(this, 0, 1469, textureX, textureY); // Box 372
		bodyModel[305] = new ModelRendererTurbo(this, 0, 1484, textureX, textureY); // Box 373
		bodyModel[306] = new ModelRendererTurbo(this, 0, 1497, textureX, textureY); // Box 374
		bodyModel[307] = new ModelRendererTurbo(this, 0, 1505, textureX, textureY); // Box 375
		bodyModel[308] = new ModelRendererTurbo(this, 0, 1505, textureX, textureY); // Box 377
		bodyModel[309] = new ModelRendererTurbo(this, 0, 1505, textureX, textureY); // Box 378
		bodyModel[310] = new ModelRendererTurbo(this, 0, 1505, textureX, textureY); // Box 379
		bodyModel[311] = new ModelRendererTurbo(this, 0, 1505, textureX, textureY); // Box 380
		bodyModel[312] = new ModelRendererTurbo(this, 0, 1505, textureX, textureY); // Box 381
		bodyModel[313] = new ModelRendererTurbo(this, 0, 1505, textureX, textureY); // Box 382
		bodyModel[314] = new ModelRendererTurbo(this, 0, 1505, textureX, textureY); // Box 383
		bodyModel[315] = new ModelRendererTurbo(this, 0, 1469, textureX, textureY); // Box 388
		bodyModel[316] = new ModelRendererTurbo(this, 0, 1479, textureX, textureY); // Box 389
		bodyModel[317] = new ModelRendererTurbo(this, 0, 1479, textureX, textureY); // Box 390
		bodyModel[318] = new ModelRendererTurbo(this, 0, 1469, textureX, textureY); // Box 391
		bodyModel[319] = new ModelRendererTurbo(this, 0, 1484, textureX, textureY); // Box 392
		bodyModel[320] = new ModelRendererTurbo(this, 0, 1497, textureX, textureY); // Box 393
		bodyModel[321] = new ModelRendererTurbo(this, 0, 1505, textureX, textureY); // Box 394
		bodyModel[322] = new ModelRendererTurbo(this, 0, 1505, textureX, textureY); // Box 395
		bodyModel[323] = new ModelRendererTurbo(this, 0, 1505, textureX, textureY); // Box 396
		bodyModel[324] = new ModelRendererTurbo(this, 0, 1505, textureX, textureY); // Box 397
		bodyModel[325] = new ModelRendererTurbo(this, 0, 1505, textureX, textureY); // Box 398
		bodyModel[326] = new ModelRendererTurbo(this, 0, 1505, textureX, textureY); // Box 399
		bodyModel[327] = new ModelRendererTurbo(this, 0, 1505, textureX, textureY); // Box 400
		bodyModel[328] = new ModelRendererTurbo(this, 0, 1505, textureX, textureY); // Box 401
		bodyModel[329] = new ModelRendererTurbo(this, 0, 1502, textureX, textureY); // Box 402
		bodyModel[330] = new ModelRendererTurbo(this, 0, 1516, textureX, textureY); // Box 403
		bodyModel[331] = new ModelRendererTurbo(this, 0, 1529, textureX, textureY); // Box 404
		bodyModel[332] = new ModelRendererTurbo(this, 0, 1541, textureX, textureY); // Box 405
		bodyModel[333] = new ModelRendererTurbo(this, 0, 1552, textureX, textureY); // Box 406
		bodyModel[334] = new ModelRendererTurbo(this, 0, 1552, textureX, textureY); // Box 407
		bodyModel[335] = new ModelRendererTurbo(this, 0, 1552, textureX, textureY); // Box 408
		bodyModel[336] = new ModelRendererTurbo(this, 0, 1552, textureX, textureY); // Box 409
		bodyModel[337] = new ModelRendererTurbo(this, 0, 1556, textureX, textureY); // Box 410
		bodyModel[338] = new ModelRendererTurbo(this, 0, 1569, textureX, textureY); // Box 411
		bodyModel[339] = new ModelRendererTurbo(this, 0, 1579, textureX, textureY); // Box 412
		bodyModel[340] = new ModelRendererTurbo(this, 0, 1579, textureX, textureY); // Box 413
		bodyModel[341] = new ModelRendererTurbo(this, 0, 1587, textureX, textureY); // Box 414
		bodyModel[342] = new ModelRendererTurbo(this, 0, 1587, textureX, textureY); // Box 415
		bodyModel[343] = new ModelRendererTurbo(this, 0, 1592, textureX, textureY); // Box 416
		bodyModel[344] = new ModelRendererTurbo(this, 0, 1502, textureX, textureY); // Box 417
		bodyModel[345] = new ModelRendererTurbo(this, 0, 1516, textureX, textureY); // Box 418
		bodyModel[346] = new ModelRendererTurbo(this, 0, 1529, textureX, textureY); // Box 419
		bodyModel[347] = new ModelRendererTurbo(this, 0, 1541, textureX, textureY); // Box 420
		bodyModel[348] = new ModelRendererTurbo(this, 0, 1552, textureX, textureY); // Box 421
		bodyModel[349] = new ModelRendererTurbo(this, 0, 1552, textureX, textureY); // Box 422
		bodyModel[350] = new ModelRendererTurbo(this, 0, 1552, textureX, textureY); // Box 423
		bodyModel[351] = new ModelRendererTurbo(this, 0, 1552, textureX, textureY); // Box 424
		bodyModel[352] = new ModelRendererTurbo(this, 0, 1556, textureX, textureY); // Box 425
		bodyModel[353] = new ModelRendererTurbo(this, 0, 1569, textureX, textureY); // Box 426
		bodyModel[354] = new ModelRendererTurbo(this, 0, 1579, textureX, textureY); // Box 427
		bodyModel[355] = new ModelRendererTurbo(this, 0, 1579, textureX, textureY); // Box 428
		bodyModel[356] = new ModelRendererTurbo(this, 0, 1587, textureX, textureY); // Box 429
		bodyModel[357] = new ModelRendererTurbo(this, 0, 1587, textureX, textureY); // Box 430
		bodyModel[358] = new ModelRendererTurbo(this, 0, 1592, textureX, textureY); // Box 431
		bodyModel[359] = new ModelRendererTurbo(this, 0, 1599, textureX, textureY); // Box 432-------
		bodyModel[360] = new ModelRendererTurbo(this, 0, 1615, textureX, textureY); // Box 433
		bodyModel[361] = new ModelRendererTurbo(this, 0, 1615, textureX, textureY); // Box 434
		bodyModel[362] = new ModelRendererTurbo(this, 0, 1619, textureX, textureY); // Box 435
		bodyModel[363] = new ModelRendererTurbo(this, 0, 1631, textureX, textureY); // Box 436
		bodyModel[364] = new ModelRendererTurbo(this, 0, 1635, textureX, textureY); // Box 437
		bodyModel[365] = new ModelRendererTurbo(this, 0, 1631, textureX, textureY); // Box 438
		bodyModel[366] = new ModelRendererTurbo(this, 0, 1635, textureX, textureY); // Box 439
		bodyModel[367] = new ModelRendererTurbo(this, 0, 1639, textureX, textureY); // Box 440
		bodyModel[368] = new ModelRendererTurbo(this, 0, 1643, textureX, textureY); // Box 441
		bodyModel[369] = new ModelRendererTurbo(this, 0, 1639, textureX, textureY); // Box 442
		bodyModel[370] = new ModelRendererTurbo(this, 0, 1643, textureX, textureY); // Box 443
		bodyModel[371] = new ModelRendererTurbo(this, 0, 1646, textureX, textureY); // Box 444
		bodyModel[372] = new ModelRendererTurbo(this, 0, 1655, textureX, textureY); // Box 445
		bodyModel[373] = new ModelRendererTurbo(this, 0, 1665, textureX, textureY); // Box 446
		bodyModel[374] = new ModelRendererTurbo(this, 0, 1670, textureX, textureY); // Box 447
		bodyModel[375] = new ModelRendererTurbo(this, 0, 1675, textureX, textureY); // Box 448
		bodyModel[376] = new ModelRendererTurbo(this, 0, 1670, textureX, textureY); // Box 449
		bodyModel[377] = new ModelRendererTurbo(this, 0, 1675, textureX, textureY); // Box 450
		bodyModel[378] = new ModelRendererTurbo(this, 0, 1679, textureX, textureY); // Box 451
		bodyModel[379] = new ModelRendererTurbo(this, 0, 1679, textureX, textureY); // Box 452
		bodyModel[380] = new ModelRendererTurbo(this, 0, 1683, textureX, textureY); // Box 453
		bodyModel[381] = new ModelRendererTurbo(this, 0, 1687, textureX, textureY); // Box 454
		bodyModel[382] = new ModelRendererTurbo(this, 0, 1696, textureX, textureY); // Box 455
		bodyModel[383] = new ModelRendererTurbo(this, 0, 1702, textureX, textureY); // Box 456
		bodyModel[384] = new ModelRendererTurbo(this, 0, 1706, textureX, textureY); // Box 457
		bodyModel[385] = new ModelRendererTurbo(this, 0, 1706, textureX, textureY); // Box 458
		bodyModel[386] = new ModelRendererTurbo(this, 0, 1710, textureX, textureY); // Box 459
		bodyModel[387] = new ModelRendererTurbo(this, 0, 1710, textureX, textureY); // Box 460
		bodyModel[388] = new ModelRendererTurbo(this, 0, 1715, textureX, textureY); // Box 461
		bodyModel[389] = new ModelRendererTurbo(this, 0, 1723, textureX, textureY); // Box 462
		bodyModel[390] = new ModelRendererTurbo(this, 0, 1723, textureX, textureY); // Box 463
		bodyModel[391] = new ModelRendererTurbo(this, 0, 1733, textureX, textureY); // Box 464
		bodyModel[392] = new ModelRendererTurbo(this, 0, 1733, textureX, textureY); // Box 465
		bodyModel[393] = new ModelRendererTurbo(this, 0, 1777, textureX, textureY); // Box 502
		bodyModel[394] = new ModelRendererTurbo(this, 0, 1777, textureX, textureY); // Box 503
		bodyModel[395] = new ModelRendererTurbo(this, 0, 1783, textureX, textureY); // Box 504
		bodyModel[396] = new ModelRendererTurbo(this, 0, 1789, textureX, textureY); // Box 505
		bodyModel[397] = new ModelRendererTurbo(this, 0, 1795, textureX, textureY); // Box 506
		bodyModel[398] = new ModelRendererTurbo(this, 0, 1789, textureX, textureY); // Box 530
		bodyModel[399] = new ModelRendererTurbo(this, 0, 1783, textureX, textureY); // Box 531
		bodyModel[400] = new ModelRendererTurbo(this, 0, 1777, textureX, textureY); // Box 532
		bodyModel[401] = new ModelRendererTurbo(this, 0, 1777, textureX, textureY); // Box 533
		bodyModel[402] = new ModelRendererTurbo(this, 0, 1807, textureX, textureY); // Box 570
		bodyModel[403] = new ModelRendererTurbo(this, 0, 1812, textureX, textureY); // Box 607
		bodyModel[404] = new ModelRendererTurbo(this, 0, 1818, textureX, textureY); // Box 608
		bodyModel[405] = new ModelRendererTurbo(this, 0, 1823, textureX, textureY); // Box 609
		bodyModel[406] = new ModelRendererTurbo(this, 0, 1827, textureX, textureY); // Box 610
		bodyModel[407] = new ModelRendererTurbo(this, 0, 1834, textureX, textureY); // Box 611
		bodyModel[408] = new ModelRendererTurbo(this, 0, 1842, textureX, textureY); // Box 612
		bodyModel[409] = new ModelRendererTurbo(this, 0, 1847, textureX, textureY); // Box 613
		bodyModel[410] = new ModelRendererTurbo(this, 0, 1852, textureX, textureY); // Box 614
		bodyModel[411] = new ModelRendererTurbo(this, 0, 1856, textureX, textureY); // Box 615====
		bodyModel[412] = new ModelRendererTurbo(this, 0, 1863, textureX, textureY); // Box 616
		bodyModel[413] = new ModelRendererTurbo(this, 0, 1863, textureX, textureY); // Box 617
		bodyModel[414] = new ModelRendererTurbo(this, 0, 1872, textureX, textureY); // Box 618
		bodyModel[415] = new ModelRendererTurbo(this, 0, 1872, textureX, textureY); // Box 623
		bodyModel[416] = new ModelRendererTurbo(this, 0, 1872, textureX, textureY); // Box 624
		bodyModel[417] = new ModelRendererTurbo(this, 0, 1872, textureX, textureY); // Box 627
		bodyModel[418] = new ModelRendererTurbo(this, 0, 1872, textureX, textureY); // Box 630
		bodyModel[419] = new ModelRendererTurbo(this, 0, 1856, textureX, textureY); // Box 648
		bodyModel[420] = new ModelRendererTurbo(this, 0, 1863, textureX, textureY); // Box 649
		bodyModel[421] = new ModelRendererTurbo(this, 0, 1863, textureX, textureY); // Box 650
		bodyModel[422] = new ModelRendererTurbo(this, 0, 1878, textureX, textureY); // Box 651
		bodyModel[423] = new ModelRendererTurbo(this, 0, 1884, textureX, textureY); // Box 652
		bodyModel[424] = new ModelRendererTurbo(this, 0, 1884, textureX, textureY); // Box 653
		bodyModel[425] = new ModelRendererTurbo(this, 0, 1888, textureX, textureY); // Box 654
		bodyModel[426] = new ModelRendererTurbo(this, 0, 1878, textureX, textureY); // Box 655
		bodyModel[427] = new ModelRendererTurbo(this, 0, 1884, textureX, textureY); // Box 656
		bodyModel[428] = new ModelRendererTurbo(this, 0, 1884, textureX, textureY); // Box 657
		bodyModel[429] = new ModelRendererTurbo(this, 0, 1888, textureX, textureY); // Box 658
		bodyModel[430] = new ModelRendererTurbo(this, 0, 1861, textureX, textureY); // Box 659
		bodyModel[431] = new ModelRendererTurbo(this, 0, 1902, textureX, textureY); // Box 660
		bodyModel[432] = new ModelRendererTurbo(this, 0, 1902, textureX, textureY); // Box 661
		bodyModel[433] = new ModelRendererTurbo(this, 0, 1901, textureX, textureY); // Box 662
		bodyModel[434] = new ModelRendererTurbo(this, 0, 1922, textureX, textureY); // Box 663
		bodyModel[435] = new ModelRendererTurbo(this, 0, 1922, textureX, textureY); // Box 664
		bodyModel[436] = new ModelRendererTurbo(this, 0, 1930, textureX, textureY); // Box 665
		bodyModel[437] = new ModelRendererTurbo(this, 0, 1938, textureX, textureY); // Box 666
		bodyModel[438] = new ModelRendererTurbo(this, 0, 1943, textureX, textureY); // Box 667
		bodyModel[439] = new ModelRendererTurbo(this, 0, 1948, textureX, textureY); // Box 668
		bodyModel[440] = new ModelRendererTurbo(this, 0, 1943, textureX, textureY); // Box 669
		bodyModel[441] = new ModelRendererTurbo(this, 0, 1953, textureX, textureY); // Box 670
		bodyModel[442] = new ModelRendererTurbo(this, 0, 1953, textureX, textureY); // Box 671
		bodyModel[443] = new ModelRendererTurbo(this, 0, 1953, textureX, textureY); // Box 672
		bodyModel[444] = new ModelRendererTurbo(this, 0, 1960, textureX, textureY); // Box 673
		bodyModel[445] = new ModelRendererTurbo(this, 0, 1969, textureX, textureY); // Box 678
		bodyModel[446] = new ModelRendererTurbo(this, 0, 1969, textureX, textureY); // Box 679
		bodyModel[447] = new ModelRendererTurbo(this, 0, 1969, textureX, textureY); // Box 680
		bodyModel[448] = new ModelRendererTurbo(this, 0, 1969, textureX, textureY); // Box 681
		bodyModel[449] = new ModelRendererTurbo(this, 0, 1922, textureX, textureY); // Box 682
		bodyModel[450] = new ModelRendererTurbo(this, 0, 1922, textureX, textureY); // Box 683
		bodyModel[451] = new ModelRendererTurbo(this, 0, 1930, textureX, textureY); // Box 684
		bodyModel[452] = new ModelRendererTurbo(this, 0, 1938, textureX, textureY); // Box 685
		bodyModel[453] = new ModelRendererTurbo(this, 0, 1943, textureX, textureY); // Box 686
		bodyModel[454] = new ModelRendererTurbo(this, 0, 1948, textureX, textureY); // Box 687
		bodyModel[455] = new ModelRendererTurbo(this, 0, 1943, textureX, textureY); // Box 688
		bodyModel[456] = new ModelRendererTurbo(this, 0, 1953, textureX, textureY); // Box 689
		bodyModel[457] = new ModelRendererTurbo(this, 0, 1953, textureX, textureY); // Box 690
		bodyModel[458] = new ModelRendererTurbo(this, 0, 1953, textureX, textureY); // Box 691
		bodyModel[459] = new ModelRendererTurbo(this, 0, 1960, textureX, textureY); // Box 692
		bodyModel[460] = new ModelRendererTurbo(this, 0, 1969, textureX, textureY); // Box 697
		bodyModel[461] = new ModelRendererTurbo(this, 0, 1969, textureX, textureY); // Box 698
		bodyModel[462] = new ModelRendererTurbo(this, 0, 1969, textureX, textureY); // Box 699
		bodyModel[463] = new ModelRendererTurbo(this, 0, 1969, textureX, textureY); // Box 700
		bodyModel[464] = new ModelRendererTurbo(this, 0, 1984, textureX, textureY); // Box 998
		bodyModel[465] = new ModelRendererTurbo(this, 0, 1989, textureX, textureY); // Box 1001
		bodyModel[466] = new ModelRendererTurbo(this, 0, 1998, textureX, textureY); // Box 1002
		bodyModel[467] = new ModelRendererTurbo(this, 0, 1984, textureX, textureY); // Box 1003
		bodyModel[468] = new ModelRendererTurbo(this, 0, 1989, textureX, textureY); // Box 1005
		bodyModel[469] = new ModelRendererTurbo(this, 0, 1998, textureX, textureY); // Box 1006
		bodyModel[470] = new ModelRendererTurbo(this, 0, 1984, textureX, textureY); // Box 1009
		bodyModel[471] = new ModelRendererTurbo(this, 0, 1989, textureX, textureY); // Box 1010
		bodyModel[472] = new ModelRendererTurbo(this, 0, 1998, textureX, textureY); // Box 1013
		bodyModel[473] = new ModelRendererTurbo(this, 0, 1984, textureX, textureY); // Box 1015
		bodyModel[474] = new ModelRendererTurbo(this, 0, 1989, textureX, textureY); // Box 1017
		bodyModel[475] = new ModelRendererTurbo(this, 0, 1998, textureX, textureY); // Box 1018
		bodyModel[476] = new ModelRendererTurbo(this, 0, 1984, textureX, textureY); // Box 1020
		bodyModel[477] = new ModelRendererTurbo(this, 0, 1989, textureX, textureY); // Box 1021
		bodyModel[478] = new ModelRendererTurbo(this, 0, 1998, textureX, textureY); // Box 1024
		bodyModel[479] = new ModelRendererTurbo(this, 0, 1984, textureX, textureY); // Box 1026
		bodyModel[480] = new ModelRendererTurbo(this, 0, 1989, textureX, textureY); // Box 1028
		bodyModel[481] = new ModelRendererTurbo(this, 0, 1998, textureX, textureY); // Box 1029
		bodyModel[482] = new ModelRendererTurbo(this, 0, 1984, textureX, textureY); // Box 1031
		bodyModel[483] = new ModelRendererTurbo(this, 0, 1989, textureX, textureY); // Box 1032
		bodyModel[484] = new ModelRendererTurbo(this, 0, 1998, textureX, textureY); // Box 1035
		bodyModel[485] = new ModelRendererTurbo(this, 0, 1984, textureX, textureY); // Box 1037
		bodyModel[486] = new ModelRendererTurbo(this, 0, 1989, textureX, textureY); // Box 1039
		bodyModel[487] = new ModelRendererTurbo(this, 0, 1998, textureX, textureY); // Box 1040
		bodyModel[488] = new ModelRendererTurbo(this, 0, 1984, textureX, textureY); // Box 1042
		bodyModel[489] = new ModelRendererTurbo(this, 0, 1989, textureX, textureY); // Box 1043
		bodyModel[490] = new ModelRendererTurbo(this, 0, 1998, textureX, textureY); // Box 1046
		bodyModel[491] = new ModelRendererTurbo(this, 0, 1984, textureX, textureY); // Box 1048
		bodyModel[492] = new ModelRendererTurbo(this, 0, 1989, textureX, textureY); // Box 1050
		bodyModel[493] = new ModelRendererTurbo(this, 0, 1998, textureX, textureY); // Box 1051
		bodyModel[494] = new ModelRendererTurbo(this, 0, 1984, textureX, textureY); // Box 1053
		bodyModel[495] = new ModelRendererTurbo(this, 0, 1989, textureX, textureY); // Box 1054
		bodyModel[496] = new ModelRendererTurbo(this, 0, 1998, textureX, textureY); // Box 1057
		bodyModel[497] = new ModelRendererTurbo(this, 0, 1984, textureX, textureY); // Box 1059
		bodyModel[498] = new ModelRendererTurbo(this, 0, 1989, textureX, textureY); // Box 1061
		bodyModel[499] = new ModelRendererTurbo(this, 0, 1998, textureX, textureY); // Box 1062

		bodyModel[0].addShapeBox(0F, 0F, 0F, 9, 14, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, -3F, -6.814F, -2F, -3F, -8F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 1
		bodyModel[0].setRotationPoint(54F, -12.5F, -18.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 9, 14, 18, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, -8F, -0.5F, 0.5F, -6.814F, -2F, -3F, 0F, -2F, -3F); // Box 2
		bodyModel[1].setRotationPoint(54F, -12.5F, 0.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 15, 9, 11, 0F,0F, 0.5F, -5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, -5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(35F, -21.5F, -18F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 13, 7, 11, 0F,0F, 0F, 0.5F, 0F, -6.9F, 0.5F, 0F, -6.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(50F, -19.5F, -18F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 15, 9, 11, 0F,0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, 0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -5F); // Box 5
		bodyModel[4].setRotationPoint(35F, -21.5F, 7F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 13, 7, 11, 0F,0F, 0F, 0F, 0F, -6.9F, 0F, 0F, -6.9F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 6
		bodyModel[5].setRotationPoint(50F, -19.5F, 7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 12, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(35F, -17.5F, -7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 9, 5, 14, 0F,0F, 0F, 0F, 0F, -1.1846153F, 0F, 0F, -1.1846153F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(47F, -17.5F, -7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 7, 5, 14, 0F,0F, -1.1846153F, 0F, 0F, -4.9F, 0F, 0F, -4.9F, 0F, 0F, -1.1846153F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(56F, -17.5F, -7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 15, 9, 14, 0F,7F, -1F, 0F, 2F, -4F, 0F, 0F, -2F, 0F, 0F, 0.5F, 5.5F, 7F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.5F); // Box 11
		bodyModel[9].setRotationPoint(35F, -21.5F, -32.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 6, 5, 14, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -2.2461538F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 12
		bodyModel[10].setRotationPoint(52F, -17.5F, -32.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 6, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7538462F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[11].setRotationPoint(58F, -14.5F, -32.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 3, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 15
		bodyModel[12].setRotationPoint(64F, -14.5F, -32.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[13].setRotationPoint(64F, -11.5F, -32.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[14].setRotationPoint(64F, -11.5F, -19.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 18
		bodyModel[15].setRotationPoint(68F, -11.5F, -31.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 15, 9, 14, 0F,0F, 0.5F, 5.5F, 0F, -2F, 0F, 2F, -4F, 0F, 7F, -1F, 0F, 0F, 0F, 5.5F, 0F, 0F, 0F, 2F, 0F, 0F, 7F, 0F, 0F); // Box 19
		bodyModel[16].setRotationPoint(35F, -21.5F, 18.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 6, 5, 14, 0F,2F, 2F, 0F, 0F, -2.2461538F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[17].setRotationPoint(52F, -17.5F, 18.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 6, 2, 14, 0F,0F, 0.7538462F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[18].setRotationPoint(58F, -14.5F, 18.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 3, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 22
		bodyModel[19].setRotationPoint(64F, -14.5F, 18.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[20].setRotationPoint(64F, -11.5F, 31.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[21].setRotationPoint(64F, -11.5F, 18.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 25
		bodyModel[22].setRotationPoint(68F, -11.5F, 19.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 8, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 7F, 1.5F, 0.5F, 0F, 1.5F, -13.5F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0.5F, 0F, 0F, -13.5F); // Box 26
		bodyModel[23].setRotationPoint(23F, -20.5F, -32.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 12, 9, 4, 0F,0F, 1F, 9F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[24].setRotationPoint(23F, -21.5F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 12, 9, 14, 0F,0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[25].setRotationPoint(23F, -21.5F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 12, 9, 4, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[26].setRotationPoint(24F, -21.5F, -6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 14, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[27].setRotationPoint(24F, -21.5F, -7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 12, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[28].setRotationPoint(24F, -21.5F, 2F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 14, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[29].setRotationPoint(24F, -21.5F, 6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 100, 14, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 35
		bodyModel[30].setRotationPoint(-46F, -12.5F, -18.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 100, 14, 18, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -2F, -3F, 0F, -2F, -3F); // Box 36
		bodyModel[31].setRotationPoint(-46F, -12.5F, 0.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 12, 9, 4, 0F,0F, 0.5F, 12F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 1F, -9F, 0F, 0F, 12F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -9F); // Box 37
		bodyModel[32].setRotationPoint(23F, -21.5F, -15F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 8, 19, 0F,0F, 1.5F, -13.5F, 7F, 1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13.5F, 7F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[33].setRotationPoint(23F, -20.5F, 13.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 12, 9, 4, 0F,0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F); // Box 39
		bodyModel[34].setRotationPoint(23F, -21.5F, 7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 12, 9, 4, 0F,0F, 1F, -9F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, 12F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 12F); // Box 40
		bodyModel[35].setRotationPoint(23F, -21.5F, 11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 60, 10, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[36].setRotationPoint(-37F, -22.5F, -20F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 71, 10, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[37].setRotationPoint(-48F, -22.5F, -27F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 71, 10, 5, 0F,0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[38].setRotationPoint(-48F, -22.5F, -32F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 71, 10, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[39].setRotationPoint(-48F, -22.5F, 20F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 71, 10, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 45
		bodyModel[40].setRotationPoint(-48F, -22.5F, 27F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 11, 11, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 46
		bodyModel[41].setRotationPoint(-48F, -23.6F, -20F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 6, 9, 40, 0F,0F, -0.4F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[42].setRotationPoint(-37F, -24F, -20F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 11, 5, 2, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[43].setRotationPoint(-48F, -23.6F, -22F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 8, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[44].setRotationPoint(-48F, -23.6F, -24F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 8, 5, 2, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[45].setRotationPoint(-48F, -23.6F, -26F);

		bodyModel[46].addShapeBox(0F, 0F, -7F, 6, 5, 7, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 51
		bodyModel[46].setRotationPoint(-46F, -23.6F, -26F);
		bodyModel[46].rotateAngleX = 0.4712389F;
		bodyModel[46].rotateAngleZ = 0.01745329F;

		bodyModel[47].addShapeBox(0F, -2F, -6.5F, 1, 2, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[47].setRotationPoint(-46F, -23.6F, -26F);
		bodyModel[47].rotateAngleX = 0.4712389F;
		bodyModel[47].rotateAngleZ = 0.01745329F;

		bodyModel[48].addShapeBox(4F, -2F, -6.5F, 1, 2, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[48].setRotationPoint(-46F, -23.6F, -26F);
		bodyModel[48].rotateAngleX = 0.4712389F;
		bodyModel[48].rotateAngleZ = 0.01745329F;

		bodyModel[49].addShapeBox(1F, -2F, -6.5F, 3, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[49].setRotationPoint(-46F, -23.6F, -26F);
		bodyModel[49].rotateAngleX = 0.4712389F;
		bodyModel[49].rotateAngleZ = 0.01745329F;

		bodyModel[50].addShapeBox(1F, -2F, -1.5F, 3, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[50].setRotationPoint(-46F, -23.6F, -26F);
		bodyModel[50].rotateAngleX = 0.4712389F;
		bodyModel[50].rotateAngleZ = 0.01745329F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 11, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[51].setRotationPoint(-48F, -23.6F, 20F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 8, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[52].setRotationPoint(-48F, -23.6F, 22F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 8, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 62
		bodyModel[53].setRotationPoint(-48F, -23.6F, 24F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 6, 5, 7, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 63
		bodyModel[54].setRotationPoint(-46F, -23.6F, 26F);
		bodyModel[54].rotateAngleX = -0.4712389F;
		bodyModel[54].rotateAngleZ = 0.01745329F;

		bodyModel[55].addShapeBox(4F, -2F, 0.5F, 1, 2, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[55].setRotationPoint(-46F, -23.6F, 26F);
		bodyModel[55].rotateAngleX = -0.4712389F;
		bodyModel[55].rotateAngleZ = 0.01745329F;

		bodyModel[56].addShapeBox(1F, -2F, 0.5F, 3, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[56].setRotationPoint(-46F, -23.6F, 26F);
		bodyModel[56].rotateAngleX = -0.4712389F;
		bodyModel[56].rotateAngleZ = 0.01745329F;

		bodyModel[57].addShapeBox(0F, -2F, 0.5F, 1, 2, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[57].setRotationPoint(-46F, -23.6F, 26F);
		bodyModel[57].rotateAngleX = -0.4712389F;
		bodyModel[57].rotateAngleZ = 0.01745329F;

		bodyModel[58].addShapeBox(1F, -2F, 5.5F, 3, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[58].setRotationPoint(-46F, -23.6F, 26F);
		bodyModel[58].rotateAngleX = -0.4712389F;
		bodyModel[58].rotateAngleZ = 0.01745329F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 31, 9, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F); // Box 72
		bodyModel[59].setRotationPoint(-79F, -23.6F, -24F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 31, 7, 7, 0F,-1.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F); // Box 73
		bodyModel[60].setRotationPoint(-79F, -21.6F, -32.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 31, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -4.5F, 0F, 0.5F); // Box 74
		bodyModel[61].setRotationPoint(-79F, -22.6F, -25.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 31, 7, 7, 0F,-0.5F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1.5F, -1F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F); // Box 75
		bodyModel[62].setRotationPoint(-79F, -21.6F, 25.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 31, 8, 1, 0F,-0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -4.5F, 0F, 0F); // Box 76
		bodyModel[63].setRotationPoint(-79F, -22.6F, 24.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[64].setRotationPoint(-74.5F, -14.6F, -32.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[65].setRotationPoint(-73.5F, -14.6F, -32.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[66].setRotationPoint(-74.5F, -14.6F, 18.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[67].setRotationPoint(-73.5F, -14.6F, 31.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 16, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[68].setRotationPoint(48F, -14.5F, -34F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 11, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[69].setRotationPoint(37F, -14.5F, -34F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[70].setRotationPoint(36F, -14.5F, -34F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 36, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[71].setRotationPoint(0F, -14.5F, -34F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[72].setRotationPoint(-1F, -14.5F, -34F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 35, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[73].setRotationPoint(-36F, -14.5F, -34F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[74].setRotationPoint(-37F, -14.5F, -34F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 8, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[75].setRotationPoint(-45F, -14.5F, -34F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 26, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F); // Box 89
		bodyModel[76].setRotationPoint(-71F, -14.5F, -34F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[77].setRotationPoint(-70.5F, -15.5F, -33.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[78].setRotationPoint(-40.5F, -15.5F, -33.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[79].setRotationPoint(-34F, -15.5F, -33.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[80].setRotationPoint(-3.5F, -15.5F, -33.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[81].setRotationPoint(2.5F, -15.5F, -33.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[82].setRotationPoint(32F, -15.5F, -33.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[83].setRotationPoint(38F, -15.5F, -33.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[84].setRotationPoint(54F, -15.5F, -33.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[85].setRotationPoint(62.5F, -15.5F, -33.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 16, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[86].setRotationPoint(48F, -14.5F, 33F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 11, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[87].setRotationPoint(37F, -14.5F, 33F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 101
		bodyModel[88].setRotationPoint(36F, -14.5F, 33F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 36, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[89].setRotationPoint(0F, -14.5F, 33F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[90].setRotationPoint(-1F, -14.5F, 33F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 35, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[91].setRotationPoint(-36F, -14.5F, 33F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 105
		bodyModel[92].setRotationPoint(-37F, -14.5F, 33F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 8, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[93].setRotationPoint(-45F, -14.5F, 33F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 26, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F); // Box 107
		bodyModel[94].setRotationPoint(-71F, -14.5F, 33F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[95].setRotationPoint(-70.5F, -15.5F, 32.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[96].setRotationPoint(-40.5F, -15.5F, 32.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[97].setRotationPoint(-34F, -15.5F, 32.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[98].setRotationPoint(-3.5F, -15.5F, 32.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[99].setRotationPoint(2.5F, -15.5F, 32.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[100].setRotationPoint(32F, -15.5F, 32.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[101].setRotationPoint(38F, -15.5F, 32.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[102].setRotationPoint(54F, -15.5F, 32.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[103].setRotationPoint(62.5F, -15.5F, 30.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[104].setRotationPoint(-64F, -24.3F, -22.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[105].setRotationPoint(-64F, -24.3F, -16F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 15, 1, 14, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 120
		bodyModel[106].setRotationPoint(-64.5F, -24.1F, -23F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[107].setRotationPoint(-64F, -24.3F, 16.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[108].setRotationPoint(-64F, -24.3F, 10F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 15, 1, 14, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[109].setRotationPoint(-64.5F, -24.1F, 9F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[110].setRotationPoint(-32F, -22F, -32F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[111].setRotationPoint(-46.5F, -25.5F, -18.5F);

		bodyModel[112].addShapeBox(0F, 0F, -10F, 1, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[112].setRotationPoint(-46F, -25.5F, -19.5F);
		bodyModel[112].rotateAngleY = 0.80285146F;

		bodyModel[113].addShapeBox(0F, 0F, -18F, 1, 5, 8, 0F,0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[113].setRotationPoint(-46F, -25.5F, -19.5F);
		bodyModel[113].rotateAngleY = 0.80285146F;

		bodyModel[114].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[114].setRotationPoint(-32F, -22F, 31F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[115].setRotationPoint(-46F, -25.5F, 19.5F);
		bodyModel[115].rotateAngleY = -0.80285146F;

		bodyModel[116].addShapeBox(0F, 0F, 10F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[116].setRotationPoint(-46F, -25.5F, 19.5F);
		bodyModel[116].rotateAngleY = -0.80285146F;

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[117].setRotationPoint(-49.5F, -24.1F, -22.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[118].setRotationPoint(-49.5F, -24.1F, -15.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[119].setRotationPoint(-49.5F, -24.1F, -12F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[120].setRotationPoint(-49.5F, -24.1F, 20.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[121].setRotationPoint(-49.5F, -24.1F, 13.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[122].setRotationPoint(-49.5F, -24.1F, 10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, -1F, -0.4F, -0.5F); // Box 151
		bodyModel[123].setRotationPoint(-66F, -24.7F, -21F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, -1F, -0.4F, -0.5F); // Box 152
		bodyModel[124].setRotationPoint(-66F, -24.7F, -18.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, -1F, -0.4F, -0.5F); // Box 155
		bodyModel[125].setRotationPoint(-66F, -24.7F, -15.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, -1F, -0.4F, -0.5F); // Box 158
		bodyModel[126].setRotationPoint(-66F, -24.7F, -11.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, -1F, -0.4F, 0F); // Box 163
		bodyModel[127].setRotationPoint(-66F, -24.7F, 20F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, -1F, -0.4F, 0F); // Box 164
		bodyModel[128].setRotationPoint(-66F, -24.7F, 17.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, -1F, -0.4F, 0F); // Box 167
		bodyModel[129].setRotationPoint(-66F, -24.7F, 14.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, -1F, -0.4F, 0F); // Box 170
		bodyModel[130].setRotationPoint(-66F, -24.7F, 10.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 15, 1, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 173
		bodyModel[131].setRotationPoint(-64.5F, -24.1F, -8.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 3F, 0F, -0.5F); // Box 174
		bodyModel[132].setRotationPoint(-64.5F, -24.5F, -9F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 3F, 0F, -0.5F); // Box 175
		bodyModel[133].setRotationPoint(-64.5F, -24.5F, -2F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 176
		bodyModel[134].setRotationPoint(-64.5F, -24.5F, -8.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 177
		bodyModel[135].setRotationPoint(-63.5F, -24.5F, -8.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 178
		bodyModel[136].setRotationPoint(-62.5F, -24.5F, -8.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 179
		bodyModel[137].setRotationPoint(-61.5F, -24.5F, -8.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 180
		bodyModel[138].setRotationPoint(-60.5F, -24.5F, -8.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 181
		bodyModel[139].setRotationPoint(-59.5F, -24.5F, -8.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 182
		bodyModel[140].setRotationPoint(-58.5F, -24.5F, -8.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 183
		bodyModel[141].setRotationPoint(-57.5F, -24.5F, -8.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 184
		bodyModel[142].setRotationPoint(-56.5F, -24.5F, -8.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 185
		bodyModel[143].setRotationPoint(-55.5F, -24.5F, -8.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 186
		bodyModel[144].setRotationPoint(-54.5F, -24.5F, -8.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 187
		bodyModel[145].setRotationPoint(-53.5F, -24.5F, -8.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 188
		bodyModel[146].setRotationPoint(-52.5F, -24.5F, -8.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 189
		bodyModel[147].setRotationPoint(-51.5F, -24.5F, -8.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 190
		bodyModel[148].setRotationPoint(-50.5F, -24.5F, -8.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,-0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F); // Box 191
		bodyModel[149].setRotationPoint(-64.5F, -24.5F, -5.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 192
		bodyModel[150].setRotationPoint(-50F, -24.5F, -7F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 15, 1, 7, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[151].setRotationPoint(-64.5F, -24.1F, 1.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 3F, 0F, 0F); // Box 194
		bodyModel[152].setRotationPoint(-64.5F, -24.5F, 8F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 3F, 0F, 0F); // Box 195
		bodyModel[153].setRotationPoint(-64.5F, -24.5F, 1F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 196
		bodyModel[154].setRotationPoint(-64.5F, -24.5F, 1.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 197
		bodyModel[155].setRotationPoint(-63.5F, -24.5F, 1.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 198
		bodyModel[156].setRotationPoint(-62.5F, -24.5F, 1.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 199
		bodyModel[157].setRotationPoint(-61.5F, -24.5F, 1.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 200
		bodyModel[158].setRotationPoint(-60.5F, -24.5F, 1.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 201
		bodyModel[159].setRotationPoint(-59.5F, -24.5F, 1.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 202
		bodyModel[160].setRotationPoint(-58.5F, -24.5F, 1.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 203
		bodyModel[161].setRotationPoint(-57.5F, -24.5F, 1.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 204
		bodyModel[162].setRotationPoint(-56.5F, -24.5F, 1.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 205
		bodyModel[163].setRotationPoint(-55.5F, -24.5F, 1.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 206
		bodyModel[164].setRotationPoint(-54.5F, -24.5F, 1.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 207
		bodyModel[165].setRotationPoint(-53.5F, -24.5F, 1.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 208
		bodyModel[166].setRotationPoint(-52.5F, -24.5F, 1.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 209
		bodyModel[167].setRotationPoint(-51.5F, -24.5F, 1.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 210
		bodyModel[168].setRotationPoint(-50.5F, -24.5F, 1.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,-0.5F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, 0F, -0.5F, -0.6F, 0F); // Box 211
		bodyModel[169].setRotationPoint(-64.5F, -24.5F, 4.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[170].setRotationPoint(-50F, -24.5F, 6F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[171].setRotationPoint(-48.5F, -24.1F, -18.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[172].setRotationPoint(-48.5F, -24.1F, 17.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 3F, 0F, -0.5F); // Box 215
		bodyModel[173].setRotationPoint(-64.5F, -24.5F, -16.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 3F, 0F, 0F); // Box 216
		bodyModel[174].setRotationPoint(-64.5F, -24.5F, 15.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 217
		bodyModel[175].setRotationPoint(-78F, -24.1F, -23F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 218
		bodyModel[176].setRotationPoint(-78F, -24.1F, -19.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[177].setRotationPoint(-78F, -24.1F, -15.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 220
		bodyModel[178].setRotationPoint(-78F, -24.1F, -10.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 221
		bodyModel[179].setRotationPoint(-78F, -24.1F, -7.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 222
		bodyModel[180].setRotationPoint(-78.5F, -24.1F, -7F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[181].setRotationPoint(-78F, -24.1F, -22.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[182].setRotationPoint(-78F, -24.1F, -19F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 225
		bodyModel[183].setRotationPoint(-77.5F, -24.1F, -17.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 226
		bodyModel[184].setRotationPoint(-76.5F, -24.1F, -17F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[185].setRotationPoint(-78F, -24.1F, -14.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 228
		bodyModel[186].setRotationPoint(-78F, -24.1F, -10F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[187].setRotationPoint(-68.5F, -24.1F, -23.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[188].setRotationPoint(-77.5F, -23.7F, -22.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[189].setRotationPoint(-76F, -23.7F, -19F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 232
		bodyModel[190].setRotationPoint(-77.5F, -23.7F, -19F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[191].setRotationPoint(-77.5F, -23.7F, -14.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 234
		bodyModel[192].setRotationPoint(-77.5F, -23.7F, -10F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[193].setRotationPoint(-78F, -24.1F, 22F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[194].setRotationPoint(-78F, -24.1F, 18.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[195].setRotationPoint(-78F, -24.1F, 14.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[196].setRotationPoint(-78F, -24.1F, 9.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[197].setRotationPoint(-78F, -24.1F, 6.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[198].setRotationPoint(-78.5F, -24.1F, 6F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[199].setRotationPoint(-78F, -24.1F, 19.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[200].setRotationPoint(-78F, -24.1F, 17F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[201].setRotationPoint(-77.5F, -24.1F, 16.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[202].setRotationPoint(-76.5F, -24.1F, 15F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[203].setRotationPoint(-78F, -24.1F, 10.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[204].setRotationPoint(-78F, -24.1F, 7F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[205].setRotationPoint(-68.5F, -24.1F, 6.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[206].setRotationPoint(-77.5F, -23.7F, 19.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[207].setRotationPoint(-76F, -23.7F, 15F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[208].setRotationPoint(-77.5F, -23.7F, 17F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[209].setRotationPoint(-77.5F, -23.7F, 10.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[210].setRotationPoint(-77.5F, -23.7F, 7F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[211].setRotationPoint(-77F, -24.1F, -22.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[212].setRotationPoint(-76F, -24.1F, -22.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[213].setRotationPoint(-75F, -24.1F, -22.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[214].setRotationPoint(-74F, -24.1F, -22.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[215].setRotationPoint(-73F, -24.1F, -22.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[216].setRotationPoint(-72F, -24.1F, -22.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[217].setRotationPoint(-71F, -24.1F, -22.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[218].setRotationPoint(-70F, -24.1F, -22.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[219].setRotationPoint(-69F, -24.1F, -22.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 262
		bodyModel[220].setRotationPoint(-77F, -24.1F, -19F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[221].setRotationPoint(-77F, -24.1F, -14.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[222].setRotationPoint(-77F, -24.1F, 19.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[223].setRotationPoint(-76F, -24.1F, 7.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[224].setRotationPoint(-75F, -24.1F, 7.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[225].setRotationPoint(-74F, -24.1F, 7.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[226].setRotationPoint(-73F, -24.1F, 7.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[227].setRotationPoint(-72F, -24.1F, 7.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[228].setRotationPoint(-71F, -24.1F, 7.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[229].setRotationPoint(-70F, -24.1F, 7.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[230].setRotationPoint(-69F, -24.1F, 7.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[231].setRotationPoint(-77F, -24.1F, 17F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[232].setRotationPoint(-77F, -24.1F, 7.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 276
		bodyModel[233].setRotationPoint(-76.5F, -24.1F, -6F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 277
		bodyModel[234].setRotationPoint(-76.5F, -24.1F, -5.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 278
		bodyModel[235].setRotationPoint(-78.5F, -24.1F, -4.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[236].setRotationPoint(-78.5F, -24.1F, -4F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[237].setRotationPoint(-76.5F, -24.1F, 5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[238].setRotationPoint(-76.5F, -24.1F, 3.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[239].setRotationPoint(-78.5F, -24.1F, 3.5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[240].setRotationPoint(-68.5F, -24.1F, -6F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 284
		bodyModel[241].setRotationPoint(-78F, -24.1F, -0.25F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[242].setRotationPoint(-77.5F, -24.1F, -4F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[243].setRotationPoint(-76.5F, -24.1F, -4F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[244].setRotationPoint(-75.5F, -24.1F, -5.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[245].setRotationPoint(-74.5F, -24.1F, -5.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[246].setRotationPoint(-73.5F, -24.1F, -5.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[247].setRotationPoint(-72.5F, -24.1F, -5.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[248].setRotationPoint(-71.5F, -24.1F, -5.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[249].setRotationPoint(-70.5F, -24.1F, -5.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[250].setRotationPoint(-69.5F, -24.1F, -5.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[251].setRotationPoint(-68F, -26.1F, -6F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[252].setRotationPoint(-68F, -26.1F, 4F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[253].setRotationPoint(-68F, -26.1F, -4F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 298
		bodyModel[254].setRotationPoint(-68.5F, -24.7F, -8F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 300
		bodyModel[255].setRotationPoint(-68.5F, -24.7F, -13.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 303
		bodyModel[256].setRotationPoint(-68.5F, -24.7F, -16F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 306
		bodyModel[257].setRotationPoint(-68.5F, -24.7F, -21F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, -0.4F, -0.5F, -1F, -0.4F, -0.5F, -1F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 310
		bodyModel[258].setRotationPoint(-68.5F, -24.7F, 7F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, -0.4F, -0.5F, -1F, -0.4F, -0.5F, -1F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 312
		bodyModel[259].setRotationPoint(-68.5F, -24.7F, 12.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, -0.4F, -0.5F, -1F, -0.4F, -0.5F, -1F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 315
		bodyModel[260].setRotationPoint(-68.5F, -24.7F, 15F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, -0.4F, -0.5F, -1F, -0.4F, -0.5F, -1F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 318
		bodyModel[261].setRotationPoint(-68.5F, -24.7F, 20F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[262].setRotationPoint(-78.5F, -24.4F, -23F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[263].setRotationPoint(-78.5F, -24.4F, -20F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 327
		bodyModel[264].setRotationPoint(-78.5F, -24.4F, -12F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[265].setRotationPoint(-78.5F, -24.4F, -14F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[266].setRotationPoint(-78.5F, -24.4F, -10F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[267].setRotationPoint(-78.5F, -24.4F, 21F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[268].setRotationPoint(-78.5F, -24.4F, 18F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[269].setRotationPoint(-78.5F, -24.4F, 12F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[270].setRotationPoint(-78.5F, -24.4F, 8F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 345
		bodyModel[271].setRotationPoint(-78.5F, -24.1F, -16.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[272].setRotationPoint(-78.5F, -24.1F, 15.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[273].setRotationPoint(-78.5F, -24.1F, -6F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 348
		bodyModel[274].setRotationPoint(-78.5F, -24.1F, 5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 20, 8, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[275].setRotationPoint(-67F, -24F, 24.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 20, 4, 6, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 1F, 0F, 0.5F, 1F); // Box 344
		bodyModel[276].setRotationPoint(-67F, -25F, 25.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[277].setRotationPoint(-66F, -25F, 26.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[278].setRotationPoint(-66F, -25F, 28.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 347
		bodyModel[279].setRotationPoint(-56F, -25F, 28.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,-7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[280].setRotationPoint(-56F, -25F, 26.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,-7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[281].setRotationPoint(-65F, -25F, 28.7F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[282].setRotationPoint(-57F, -25F, 28.7F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 351
		bodyModel[283].setRotationPoint(-65F, -25F, 26.3F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[284].setRotationPoint(-57F, -25F, 26.3F);

		bodyModel[285].addShapeBox(0F, -0.5F, 2F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[285].setRotationPoint(-71.5F, -22.6F, 25.5F);
		bodyModel[285].rotateAngleX = -0.27829973F;

		bodyModel[286].addShapeBox(2F, -0.5F, 2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 354
		bodyModel[286].setRotationPoint(-71.5F, -22.6F, 25.5F);
		bodyModel[286].rotateAngleX = -0.27829973F;

		bodyModel[287].addShapeBox(-1F, -0.5F, 2F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 355
		bodyModel[287].setRotationPoint(-71.5F, -22.6F, 25.5F);
		bodyModel[287].rotateAngleX = -0.27829973F;

		bodyModel[288].addShapeBox(-1F, -1F, 3.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[288].setRotationPoint(-71.5F, -22.6F, 25.5F);
		bodyModel[288].rotateAngleX = -0.27829973F;

		bodyModel[289].addShapeBox(-2F, -1F, 3F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[289].setRotationPoint(-71.5F, -22.6F, 25.5F);
		bodyModel[289].rotateAngleX = -0.27829973F;

		bodyModel[290].addShapeBox(1F, -1F, 3.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[290].setRotationPoint(-71.5F, -22.6F, 25.5F);
		bodyModel[290].rotateAngleX = -0.27829973F;

		bodyModel[291].addShapeBox(1F, -1F, -3.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[291].setRotationPoint(-71.5F, -22.6F, -25.5F);
		bodyModel[291].rotateAngleX = 0.27829973F;

		bodyModel[292].addShapeBox(2F, -0.5F, -5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 360
		bodyModel[292].setRotationPoint(-71.5F, -22.6F, -25.5F);
		bodyModel[292].rotateAngleX = 0.27829973F;

		bodyModel[293].addShapeBox(-1F, -1F, -3.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[293].setRotationPoint(-71.5F, -22.6F, -25.5F);
		bodyModel[293].rotateAngleX = 0.27829973F;

		bodyModel[294].addShapeBox(0F, -0.5F, -5F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[294].setRotationPoint(-71.5F, -22.6F, -25.5F);
		bodyModel[294].rotateAngleX = 0.27829973F;

		bodyModel[295].addShapeBox(-1F, -0.5F, -5F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 363
		bodyModel[295].setRotationPoint(-71.5F, -22.6F, -25.5F);
		bodyModel[295].rotateAngleX = 0.27829973F;

		bodyModel[296].addShapeBox(-2F, -1F, -4F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[296].setRotationPoint(-71.5F, -22.6F, -25.5F);
		bodyModel[296].rotateAngleX = 0.27829973F;

		bodyModel[297].addShapeBox(0F, 0F, 0F, 7, 14, 18, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 2F, 0.5F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F); // Box 365
		bodyModel[297].setRotationPoint(-53F, -12.5F, -18.5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 7, 14, 18, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -2F, -3F, 0F, 0F, -3F); // Box 366
		bodyModel[298].setRotationPoint(-53F, -12.5F, 0.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 10, 16, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 367
		bodyModel[299].setRotationPoint(-63F, -14.5F, -18.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 11, 16, 37, 0F,0.5F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.1F, 0F, -7F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -7F, -2F, -3F); // Box 368
		bodyModel[300].setRotationPoint(-74F, -14.5F, -18.5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 369
		bodyModel[301].setRotationPoint(-78F, -17.6F, -31F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 370
		bodyModel[302].setRotationPoint(-78F, -17.6F, -25F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 371
		bodyModel[303].setRotationPoint(-78F, -14.6F, -25F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 372
		bodyModel[304].setRotationPoint(-78F, -14.6F, -31F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 373
		bodyModel[305].setRotationPoint(-77F, -17.1F, -31F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 374
		bodyModel[306].setRotationPoint(-77F, -17.1F, -25F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[307].setRotationPoint(-77.7F, -15.6F, -30.7F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F); // Box 377
		bodyModel[308].setRotationPoint(-77.7F, -15.6F, -29.7F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[309].setRotationPoint(-77.7F, -16.6F, -29.7F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[310].setRotationPoint(-77.7F, -16.6F, -30.7F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[311].setRotationPoint(-77.7F, -16.6F, -26.7F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[312].setRotationPoint(-77.7F, -16.6F, -27.7F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F); // Box 382
		bodyModel[313].setRotationPoint(-77.7F, -15.6F, -26.7F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[314].setRotationPoint(-77.7F, -15.6F, -27.7F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 388
		bodyModel[315].setRotationPoint(-78F, -17.6F, 25F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 389
		bodyModel[316].setRotationPoint(-78F, -17.6F, 23F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 390
		bodyModel[317].setRotationPoint(-78F, -14.6F, 23F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 391
		bodyModel[318].setRotationPoint(-78F, -14.6F, 25F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 392
		bodyModel[319].setRotationPoint(-77F, -17.1F, 25F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 393
		bodyModel[320].setRotationPoint(-77F, -17.1F, 23F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F); // Box 394
		bodyModel[321].setRotationPoint(-77.7F, -15.6F, 29.7F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[322].setRotationPoint(-77.7F, -15.6F, 28.7F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[323].setRotationPoint(-77.7F, -16.6F, 28.7F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[324].setRotationPoint(-77.7F, -16.6F, 29.7F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[325].setRotationPoint(-77.7F, -16.6F, 25.7F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[326].setRotationPoint(-77.7F, -16.6F, 26.7F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[327].setRotationPoint(-77.7F, -15.6F, 25.7F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F); // Box 401
		bodyModel[328].setRotationPoint(-77.7F, -15.6F, 26.7F);

		bodyModel[329].addShapeBox(-3.5F, 1F, 0F, 3, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[329].setRotationPoint(-79F, -23.6F, -16.5F);
		bodyModel[329].rotateAngleZ = 0.46364846F;

		bodyModel[330].addShapeBox(-3.5F, 4F, 0F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[330].setRotationPoint(-79F, -23.6F, -16.5F);
		bodyModel[330].rotateAngleZ = 0.46364846F;

		bodyModel[331].addShapeBox(-3.5F, 5F, 0F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F); // Box 404
		bodyModel[331].setRotationPoint(-79F, -23.6F, -16.5F);
		bodyModel[331].rotateAngleZ = 0.46364846F;

		bodyModel[332].addShapeBox(-3.5F, 0F, 0F, 3, 1, 8, 0F,-0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, -1F, -0.2F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[332].setRotationPoint(-79F, -23.6F, -16.5F);
		bodyModel[332].rotateAngleZ = 0.46364846F;

		bodyModel[333].addShapeBox(-4.5F, 1.5F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		bodyModel[333].setRotationPoint(-79F, -23.6F, -17.5F);
		bodyModel[333].rotateAngleZ = 0.46364846F;

		bodyModel[334].addShapeBox(-4.5F, 6.5F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[334].setRotationPoint(-79F, -23.6F, -16.5F);
		bodyModel[334].rotateAngleZ = 0.46364846F;

		bodyModel[335].addShapeBox(-4.5F, 6.5F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 408
		bodyModel[335].setRotationPoint(-79F, -23.6F, -8.5F);
		bodyModel[335].rotateAngleZ = 0.46364846F;

		bodyModel[336].addShapeBox(-4.5F, 1.5F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 409
		bodyModel[336].setRotationPoint(-79F, -23.6F, -7.5F);
		bodyModel[336].rotateAngleZ = 0.46364846F;

		bodyModel[337].addShapeBox(-4.5F, 1.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[337].setRotationPoint(-79F, -23.6F, -16.5F);
		bodyModel[337].rotateAngleZ = 0.46364846F;

		bodyModel[338].addShapeBox(-4.5F, 6.5F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[338].setRotationPoint(-79F, -23.6F, -15.5F);
		bodyModel[338].rotateAngleZ = 0.46364846F;

		bodyModel[339].addShapeBox(-4.5F, 2.5F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[339].setRotationPoint(-79F, -23.6F, -14.5F);
		bodyModel[339].rotateAngleZ = 0.46364846F;

		bodyModel[340].addShapeBox(-4.5F, 2.5F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[340].setRotationPoint(-79F, -23.6F, -10.5F);
		bodyModel[340].rotateAngleZ = 0.46364846F;

		bodyModel[341].addShapeBox(-4.5F, -0.5F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[341].setRotationPoint(-79F, -23.6F, -14.5F);
		bodyModel[341].rotateAngleZ = 0.46364846F;

		bodyModel[342].addShapeBox(-4.5F, -0.5F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[342].setRotationPoint(-79F, -23.6F, -10.5F);
		bodyModel[342].rotateAngleZ = 0.46364846F;

		bodyModel[343].addShapeBox(-4.5F, -1.5F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[343].setRotationPoint(-79F, -23.6F, -14.5F);
		bodyModel[343].rotateAngleZ = 0.46364846F;

		bodyModel[344].addShapeBox(-3.5F, 1F, 0F, 3, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[344].setRotationPoint(-79F, -23.6F, 8.5F);
		bodyModel[344].rotateAngleZ = 0.46364846F;

		bodyModel[345].addShapeBox(-3.5F, 4F, 0F, 3, 1, 9, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[345].setRotationPoint(-79F, -23.6F, 7.5F);
		bodyModel[345].rotateAngleZ = 0.46364846F;

		bodyModel[346].addShapeBox(-3.5F, 5F, 0F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F); // Box 419
		bodyModel[346].setRotationPoint(-79F, -23.6F, 7.5F);
		bodyModel[346].rotateAngleZ = 0.46364846F;

		bodyModel[347].addShapeBox(-3.5F, 0F, 0F, 3, 1, 8, 0F,-0.2F, 0.5F, -1F, -0.2F, 0.5F, -1F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[347].setRotationPoint(-79F, -23.6F, 8.5F);
		bodyModel[347].rotateAngleZ = 0.46364846F;

		bodyModel[348].addShapeBox(-4.5F, 1.5F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 421
		bodyModel[348].setRotationPoint(-79F, -23.6F, 16.5F);
		bodyModel[348].rotateAngleZ = 0.46364846F;

		bodyModel[349].addShapeBox(-4.5F, 6.5F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 422
		bodyModel[349].setRotationPoint(-79F, -23.6F, 15.5F);
		bodyModel[349].rotateAngleZ = 0.46364846F;

		bodyModel[350].addShapeBox(-4.5F, 6.5F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[350].setRotationPoint(-79F, -23.6F, 7.5F);
		bodyModel[350].rotateAngleZ = 0.46364846F;

		bodyModel[351].addShapeBox(-4.5F, 1.5F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[351].setRotationPoint(-79F, -23.6F, 6.5F);
		bodyModel[351].rotateAngleZ = 0.46364846F;

		bodyModel[352].addShapeBox(-4.5F, 1.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[352].setRotationPoint(-79F, -23.6F, 7.5F);
		bodyModel[352].rotateAngleZ = 0.46364846F;

		bodyModel[353].addShapeBox(-4.5F, 6.5F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyModel[353].setRotationPoint(-79F, -23.6F, 8.5F);
		bodyModel[353].rotateAngleZ = 0.46364846F;

		bodyModel[354].addShapeBox(-4.5F, 2.5F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[354].setRotationPoint(-79F, -23.6F, 13.5F);
		bodyModel[354].rotateAngleZ = 0.46364846F;

		bodyModel[355].addShapeBox(-4.5F, 2.5F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[355].setRotationPoint(-79F, -23.6F, 9.5F);
		bodyModel[355].rotateAngleZ = 0.46364846F;

		bodyModel[356].addShapeBox(-4.5F, -0.5F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		bodyModel[356].setRotationPoint(-79F, -23.6F, 13.5F);
		bodyModel[356].rotateAngleZ = 0.46364846F;

		bodyModel[357].addShapeBox(-4.5F, -0.5F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[357].setRotationPoint(-79F, -23.6F, 9.5F);
		bodyModel[357].rotateAngleZ = 0.46364846F;

		bodyModel[358].addShapeBox(-4.5F, -1.5F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[358].setRotationPoint(-79F, -23.6F, 9.5F);
		bodyModel[358].rotateAngleZ = 0.46364846F;

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 432-------
		bodyModel[359].setRotationPoint(-80.5F, -24F, -6.5F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, -0.5F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 4F); // Box 433
		bodyModel[360].setRotationPoint(-85.5F, -24F, -6.5F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -0.5F, 4F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, -2.5F); // Box 434
		bodyModel[361].setRotationPoint(-85.5F, -24F, 5.5F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 435
		bodyModel[362].setRotationPoint(-87.5F, -24F, -4F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[363].setRotationPoint(-87.5F, -25F, -4F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
		bodyModel[364].setRotationPoint(-87.5F, -26F, -4F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[365].setRotationPoint(-87.5F, -25F, 3F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[366].setRotationPoint(-87.5F, -26F, 3F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 440
		bodyModel[367].setRotationPoint(-87.5F, -25.5F, -3F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, -0.5F, 0F, 0F, -0.5F); // Box 441
		bodyModel[368].setRotationPoint(-84.5F, -25.5F, -3F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[369].setRotationPoint(-87.5F, -25.5F, 2F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, -0.33F, -0.5F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.33F, -0.5F, 0F, -0.33F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[370].setRotationPoint(-84.5F, -25.5F, 2F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 444
		bodyModel[371].setRotationPoint(-87.5F, -25.5F, -3F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 445
		bodyModel[372].setRotationPoint(-86F, -25.5F, -3.9F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 446
		bodyModel[373].setRotationPoint(-84F, -25.7F, -1F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.5F); // Box 447
		bodyModel[374].setRotationPoint(-86F, -25.5F, -2F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[375].setRotationPoint(-83F, -25.5F, -2.8F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F); // Box 449
		bodyModel[376].setRotationPoint(-86F, -25.5F, 1F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 450
		bodyModel[377].setRotationPoint(-83F, -25.5F, 1.8F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, 1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 451
		bodyModel[378].setRotationPoint(-84.5F, -25.5F, -2F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 1F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 452
		bodyModel[379].setRotationPoint(-84.5F, -25.5F, 1F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 453
		bodyModel[380].setRotationPoint(-84.5F, -25.5F, -1F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 454
		bodyModel[381].setRotationPoint(-84.5F, -24F, -3F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 455
		bodyModel[382].setRotationPoint(-83.5F, -24F, -0.5F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 2F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 456
		bodyModel[383].setRotationPoint(-82.5F, -24F, -0.5F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 457
		bodyModel[384].setRotationPoint(-87.5F, -23.5F, -4F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 458
		bodyModel[385].setRotationPoint(-87.5F, -23.5F, 3F);

		bodyModel[386].addShapeBox(-5F, -0.5F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		bodyModel[386].setRotationPoint(-79.5F, -23.5F, -4F);
		bodyModel[386].rotateAngleZ = 0.9424778F;

		bodyModel[387].addShapeBox(-5F, -0.5F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
		bodyModel[387].setRotationPoint(-79.5F, -23.5F, 2F);
		bodyModel[387].rotateAngleZ = 0.9424778F;

		bodyModel[388].addShapeBox(-5F, -0.5F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[388].setRotationPoint(-79.5F, -23.5F, -2F);
		bodyModel[388].rotateAngleZ = 0.9424778F;

		bodyModel[389].addShapeBox(-5F, -6F, 0F, 1, 6, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 462
		bodyModel[389].setRotationPoint(-79.5F, -23.5F, -4F);
		bodyModel[389].rotateAngleZ = 0.9424778F;

		bodyModel[390].addShapeBox(-5F, -6F, 0F, 1, 6, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 463
		bodyModel[390].setRotationPoint(-79.5F, -23.5F, 3F);
		bodyModel[390].rotateAngleZ = 0.9424778F;

		bodyModel[391].addShapeBox(-5F, 0.5F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F); // Box 464
		bodyModel[391].setRotationPoint(-79.5F, -23.5F, -4F);
		bodyModel[391].rotateAngleZ = 0.9424778F;

		bodyModel[392].addShapeBox(-5F, 0.5F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F); // Box 465
		bodyModel[392].setRotationPoint(-79.5F, -23.5F, 3F);
		bodyModel[392].rotateAngleZ = 0.9424778F;

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 502
		bodyModel[393].setRotationPoint(-58F, -19F, -33.5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 503
		bodyModel[394].setRotationPoint(-53.5F, -19F, -33.5F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		bodyModel[395].setRotationPoint(-57.5F, -19F, -34.5F);

		bodyModel[396].addTrapezoid(0F, 0F, 0F, 3, 2, 2, 0F, -0.80F, ModelRendererTurbo.MR_LEFT); // Box 505
		bodyModel[396].setRotationPoint(-52.5F, -18.5F, -34.3F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.2F, -0.8F, 66F, -0.8F, -0.8F, 66F, -0.8F, -0.8F, 0F, -0.2F, -0.8F, 0F, -1.4F, -0.8F, 66F, -0.8F, -0.8F, 66F, -0.8F, -0.8F, 0F, -1.4F, -0.8F); // Box 506
		bodyModel[397].setRotationPoint(-49.5F, -18.5F, -34.3F);

		bodyModel[398].addTrapezoid(0F, 0F, 0F, 3, 2, 2, 0F, -0.80F, ModelRendererTurbo.MR_RIGHT); // Box 530
		bodyModel[398].setRotationPoint(19.5F, -18.5F, -34.3F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531
		bodyModel[399].setRotationPoint(22F, -19F, -34.5F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[400].setRotationPoint(26.5F, -19F, -33.5F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533
		bodyModel[401].setRotationPoint(22F, -19F, -33.5F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 570
		bodyModel[402].setRotationPoint(61F, -13.5F, 33.2F);

		bodyModel[403].addShapeBox(0F, -0.5F, -3F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 607
		bodyModel[403].setRotationPoint(-49.5F, -22.6F, -25.5F);
		bodyModel[403].rotateAngleX = 0.27829973F;

		bodyModel[404].addShapeBox(0F, -0.5F, -2.25F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 608
		bodyModel[404].setRotationPoint(-58.5F, -22.6F, -25.5F);
		bodyModel[404].rotateAngleX = 0.27829973F;

		bodyModel[405].addShapeBox(0F, -0.5F, -2.25F, 3, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F); // Box 609
		bodyModel[405].setRotationPoint(-61.5F, -22.6F, -25.5F);
		bodyModel[405].rotateAngleX = 0.27829973F;

		bodyModel[406].addShapeBox(0F, -1.5F, -3.75F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 610
		bodyModel[406].setRotationPoint(-64.5F, -22.6F, -25.5F);
		bodyModel[406].rotateAngleX = 0.27829973F;

		bodyModel[407].addShapeBox(0F, -1.5F, -3.75F, 2, 1, 4, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -1.5F, 0F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1.5F); // Box 611
		bodyModel[407].setRotationPoint(-66.5F, -22.6F, -25.5F);
		bodyModel[407].rotateAngleX = 0.27829973F;

		bodyModel[408].addShapeBox(-1F, -2F, -5.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 612
		bodyModel[408].setRotationPoint(-49.5F, -22.6F, -25.5F);
		bodyModel[408].rotateAngleX = 0.27829973F;

		bodyModel[409].addShapeBox(-1F, -1F, -5.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 613
		bodyModel[409].setRotationPoint(-64.5F, -22.6F, -25.5F);
		bodyModel[409].rotateAngleX = 0.27829973F;

		bodyModel[410].addShapeBox(-1F, -1F, -5.5F, 13, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 614
		bodyModel[410].setRotationPoint(-62.5F, -22.6F, -25.5F);
		bodyModel[410].rotateAngleX = 0.27829973F;

		bodyModel[411].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 615====
		bodyModel[411].setRotationPoint(-30F, -22.5F, -25.5F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 616
		bodyModel[412].setRotationPoint(-31F, -22.5F, -25.5F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 617
		bodyModel[413].setRotationPoint(-28F, -22.5F, -25.5F);

		bodyModel[414].addShapeBox(0F, -0.5F, -4F, 1, 1, 3, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 618
		bodyModel[414].setRotationPoint(-20F, -22F, -27F);
		bodyModel[414].rotateAngleX = 0.29145602F;

		bodyModel[415].addShapeBox(0F, -0.5F, -4F, 1, 1, 3, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 623
		bodyModel[415].setRotationPoint(11F, -22F, -27F);
		bodyModel[415].rotateAngleX = 0.29145602F;

		bodyModel[416].addShapeBox(0F, -0.5F, -4F, 1, 1, 3, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 624
		bodyModel[416].setRotationPoint(20F, -22F, -27F);
		bodyModel[416].rotateAngleX = 0.29145602F;

		bodyModel[417].addShapeBox(0F, 0F, -4F, 1, 1, 3, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 627
		bodyModel[417].setRotationPoint(31F, -22F, -21F);
		bodyModel[417].rotateAngleX = 0.13437639F;
		bodyModel[417].rotateAngleZ = -0.15707963F;

		bodyModel[418].addShapeBox(0F, 0F, -4F, 1, 1, 3, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 630
		bodyModel[418].setRotationPoint(33F, -21F, -27F);
		bodyModel[418].rotateAngleX = 0.0994698F;
		bodyModel[418].rotateAngleZ = -0.15707963F;

		bodyModel[419].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 648
		bodyModel[419].setRotationPoint(-30F, -22.5F, 21.5F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 649
		bodyModel[420].setRotationPoint(-31F, -22.5F, 21.5F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 650
		bodyModel[421].setRotationPoint(-28F, -22.5F, 21.5F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F); // Box 651
		bodyModel[422].setRotationPoint(58F, -15.5F, -18.5F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 652
		bodyModel[423].setRotationPoint(58F, -16.5F, -18.5F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 653
		bodyModel[424].setRotationPoint(61F, -16.5F, -18.5F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 654
		bodyModel[425].setRotationPoint(58F, -17.5F, -18.5F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F); // Box 655
		bodyModel[426].setRotationPoint(58F, -15.5F, 17.5F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 656
		bodyModel[427].setRotationPoint(58F, -16.5F, 17.5F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 657
		bodyModel[428].setRotationPoint(61F, -16.5F, 17.5F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 658
		bodyModel[429].setRotationPoint(58F, -17.5F, 17.5F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 3, 35, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 659
		bodyModel[430].setRotationPoint(61.5F, -15F, -17.5F);

		bodyModel[431].addShapeBox(11F, -1F, 0F, 1, 1, 1, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 660
		bodyModel[431].setRotationPoint(50F, -19.5F, -10F);
		bodyModel[431].rotateAngleZ = -0.48795915F;

		bodyModel[432].addShapeBox(11F, -1F, 0F, 1, 1, 1, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 661
		bodyModel[432].setRotationPoint(50F, -19.5F, 9F);
		bodyModel[432].rotateAngleZ = -0.48795915F;

		bodyModel[433].addShapeBox(11F, -1F, 0F, 1, 1, 18, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 662
		bodyModel[433].setRotationPoint(50F, -19.5F, -9F);
		bodyModel[433].rotateAngleZ = -0.48795915F;

		bodyModel[434].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 663
		bodyModel[434].setRotationPoint(57F, -17.5F, -21.5F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 664
		bodyModel[435].setRotationPoint(57F, -17.5F, -25.5F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 665
		bodyModel[436].setRotationPoint(57F, -17.5F, -25F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 666
		bodyModel[437].setRotationPoint(58F, -18F, -25F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 667
		bodyModel[438].setRotationPoint(58F, -18F, -24F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 668
		bodyModel[439].setRotationPoint(58F, -18F, -23F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 669
		bodyModel[440].setRotationPoint(58F, -18F, -22F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 670
		bodyModel[441].setRotationPoint(58F, -16.5F, -24.25F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 671
		bodyModel[442].setRotationPoint(58F, -15.5F, -24.25F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 672
		bodyModel[443].setRotationPoint(58F, -17.5F, -24.25F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 673
		bodyModel[444].setRotationPoint(58F, -17F, -26F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.33F, -0.33F, 0F); // Box 678
		bodyModel[445].setRotationPoint(55F, -16.5F, -26F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.33F, -0.33F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 679
		bodyModel[446].setRotationPoint(55F, -17.5F, -26F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.33F, -0.33F, -0.5F, -0.33F, -0.33F, 0F, 0F, 0F, 0F); // Box 680
		bodyModel[447].setRotationPoint(56F, -16.5F, -26F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -0.5F, -0.33F, -0.33F, -0.5F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 681
		bodyModel[448].setRotationPoint(56F, -17.5F, -26F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 682
		bodyModel[449].setRotationPoint(57F, -17.5F, 20.5F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 683
		bodyModel[450].setRotationPoint(57F, -17.5F, 24.5F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 684
		bodyModel[451].setRotationPoint(57F, -17.5F, 21F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 685
		bodyModel[452].setRotationPoint(58F, -18F, 24F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 686
		bodyModel[453].setRotationPoint(58F, -18F, 23F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 687
		bodyModel[454].setRotationPoint(58F, -18F, 22F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 688
		bodyModel[455].setRotationPoint(58F, -18F, 21F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 689
		bodyModel[456].setRotationPoint(58F, -16.5F, 21.25F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 690
		bodyModel[457].setRotationPoint(58F, -15.5F, 21.25F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 691
		bodyModel[458].setRotationPoint(58F, -17.5F, 21.25F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 692
		bodyModel[459].setRotationPoint(58F, -17F, 25F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.33F, -0.33F, -0.5F); // Box 697
		bodyModel[460].setRotationPoint(55F, -16.5F, 20F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.33F, -0.33F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 698
		bodyModel[461].setRotationPoint(55F, -17.5F, 20F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.33F, -0.33F, -0.5F, 0F, 0F, -0.5F); // Box 699
		bodyModel[462].setRotationPoint(56F, -16.5F, 20F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.33F, -0.33F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 700
		bodyModel[463].setRotationPoint(56F, -17.5F, 20F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 998
		bodyModel[464].setRotationPoint(-42F, -3.5F, -17.5F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1001
		bodyModel[465].setRotationPoint(-41F, -3.5F, -20.5F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 1002
		bodyModel[466].setRotationPoint(-48F, -3.5F, -21.5F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1003
		bodyModel[467].setRotationPoint(-42F, -3.5F, 15.5F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1005
		bodyModel[468].setRotationPoint(-41F, -3.5F, 17.5F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 1006
		bodyModel[469].setRotationPoint(-48F, -3.5F, 20.5F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1009
		bodyModel[470].setRotationPoint(-24F, -3.5F, 15.5F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1010
		bodyModel[471].setRotationPoint(-23F, -3.5F, 17.5F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 1013
		bodyModel[472].setRotationPoint(-30F, -3.5F, 20.5F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1015
		bodyModel[473].setRotationPoint(-24F, -3.5F, -17.5F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1017
		bodyModel[474].setRotationPoint(-23F, -3.5F, -20.5F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 1018
		bodyModel[475].setRotationPoint(-30F, -3.5F, -21.5F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1020
		bodyModel[476].setRotationPoint(-6F, -3.5F, 15.5F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1021
		bodyModel[477].setRotationPoint(-5F, -3.5F, 17.5F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 1024
		bodyModel[478].setRotationPoint(-12F, -3.5F, 20.5F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1026
		bodyModel[479].setRotationPoint(-6F, -3.5F, -17.5F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1028
		bodyModel[480].setRotationPoint(-5F, -3.5F, -20.5F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 1029
		bodyModel[481].setRotationPoint(-12F, -3.5F, -21.5F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1031
		bodyModel[482].setRotationPoint(12F, -3.5F, 15.5F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1032
		bodyModel[483].setRotationPoint(13F, -3.5F, 17.5F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 1035
		bodyModel[484].setRotationPoint(6F, -3.5F, 20.5F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1037
		bodyModel[485].setRotationPoint(12F, -3.5F, -17.5F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1039
		bodyModel[486].setRotationPoint(13F, -3.5F, -20.5F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 1040
		bodyModel[487].setRotationPoint(6F, -3.5F, -21.5F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1042
		bodyModel[488].setRotationPoint(30F, -3.5F, 15.5F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1043
		bodyModel[489].setRotationPoint(31F, -3.5F, 17.5F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 1046
		bodyModel[490].setRotationPoint(24F, -3.5F, 20.5F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1048
		bodyModel[491].setRotationPoint(30F, -3.5F, -17.5F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1050
		bodyModel[492].setRotationPoint(31F, -3.5F, -20.5F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 1051
		bodyModel[493].setRotationPoint(24F, -3.5F, -21.5F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1053
		bodyModel[494].setRotationPoint(48F, -3.5F, 15.5F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1054
		bodyModel[495].setRotationPoint(49F, -3.5F, 17.5F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 1057
		bodyModel[496].setRotationPoint(42F, -3.5F, 20.5F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1059
		bodyModel[497].setRotationPoint(48F, -3.5F, -17.5F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1061
		bodyModel[498].setRotationPoint(49F, -3.5F, -20.5F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 1062
		bodyModel[499].setRotationPoint(42F, -3.5F, -21.5F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 0, 2004, textureX, textureY); // Box 1480
		bodyModel[501] = new ModelRendererTurbo(this, 0, 2004, textureX, textureY); // Box 1481
		bodyModel[502] = new ModelRendererTurbo(this, 0, 2004, textureX, textureY); // Box 1482
		bodyModel[503] = new ModelRendererTurbo(this, 0, 2053, textureX, textureY); // Box 1500
		bodyModel[504] = new ModelRendererTurbo(this, 0, 2072, textureX, textureY); // Box 1501
		bodyModel[505] = new ModelRendererTurbo(this, 0, 2081, textureX, textureY); // Box 1502
		bodyModel[506] = new ModelRendererTurbo(this, 0, 2095, textureX, textureY); // Box 1503
		bodyModel[507] = new ModelRendererTurbo(this, 0, 2108, textureX, textureY); // Box 1504
		bodyModel[508] = new ModelRendererTurbo(this, 0, 2122, textureX, textureY); // Box 1505
		bodyModel[509] = new ModelRendererTurbo(this, 0, 2129, textureX, textureY); // Box 1506
		bodyModel[510] = new ModelRendererTurbo(this, 0, 2053, textureX, textureY); // Box 1507
		bodyModel[511] = new ModelRendererTurbo(this, 0, 2072, textureX, textureY); // Box 1508
		bodyModel[512] = new ModelRendererTurbo(this, 0, 2081, textureX, textureY); // Box 1509
		bodyModel[513] = new ModelRendererTurbo(this, 0, 2095, textureX, textureY); // Box 1510
		bodyModel[514] = new ModelRendererTurbo(this, 0, 2108, textureX, textureY); // Box 1511
		bodyModel[515] = new ModelRendererTurbo(this, 0, 2122, textureX, textureY); // Box 1512
		bodyModel[516] = new ModelRendererTurbo(this, 0, 2129, textureX, textureY); // Box 1513
		bodyModel[517] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Box 1539
		bodyModel[518] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Box 1540
		bodyModel[519] = new ModelRendererTurbo(this, 0, 1872, textureX, textureY); // Box 1223
		bodyModel[520] = new ModelRendererTurbo(this, 0, 1872, textureX, textureY); // Box 1224
		bodyModel[521] = new ModelRendererTurbo(this, 0, 1872, textureX, textureY); // Box 1225
		bodyModel[522] = new ModelRendererTurbo(this, 0, 1872, textureX, textureY); // Box 1226
		bodyModel[523] = new ModelRendererTurbo(this, 0, 1872, textureX, textureY); // Box 1227
		bodyModel[524] = new ModelRendererTurbo(this, 0, 1872, textureX, textureY); // Box 1228
		bodyModel[525] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Shape 1230
		bodyModel[526] = new ModelRendererTurbo(this, 0, 1777, textureX, textureY); // Box 1231
		bodyModel[527] = new ModelRendererTurbo(this, 0, 1777, textureX, textureY); // Box 1232
		bodyModel[528] = new ModelRendererTurbo(this, 0, 1783, textureX, textureY); // Box 1233
		bodyModel[529] = new ModelRendererTurbo(this, 0, 1789, textureX, textureY); // Box 1234
		bodyModel[530] = new ModelRendererTurbo(this, 0, 1795, textureX, textureY); // Box 1235
		bodyModel[531] = new ModelRendererTurbo(this, 0, 1789, textureX, textureY); // Box 1236
		bodyModel[532] = new ModelRendererTurbo(this, 0, 1783, textureX, textureY); // Box 1237
		bodyModel[533] = new ModelRendererTurbo(this, 0, 1777, textureX, textureY); // Box 1238
		bodyModel[534] = new ModelRendererTurbo(this, 0, 1777, textureX, textureY); // Box 1239

		bodyModel[500].addShapeBox(0F, 0F, 0F, 9, 3, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1480
		bodyModel[500].setRotationPoint(-67F, -6F, -22F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 9, 3, 44, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1481
		bodyModel[501].setRotationPoint(-67F, -9F, -22F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 9, 3, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 1482
		bodyModel[502].setRotationPoint(-67F, -3F, -22F);

		bodyModel[503].addShapeBox(0F, -0.5F, 0F, 1, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1500
		bodyModel[503].setRotationPoint(60F, -9.5F, -21.5F);
		bodyModel[503].rotateAngleZ = -0.54105207F;

		bodyModel[504].addShapeBox(1F, -0.5F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 1501
		bodyModel[504].setRotationPoint(60F, -9.5F, -21.5F);
		bodyModel[504].rotateAngleZ = -0.54105207F;

		bodyModel[505].addShapeBox(1F, 2.5F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1502
		bodyModel[505].setRotationPoint(60F, -9.5F, -21.5F);
		bodyModel[505].rotateAngleZ = -0.54105207F;

		bodyModel[506].addShapeBox(2F, 0.5F, 0F, 2, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1503
		bodyModel[506].setRotationPoint(60F, -9.5F, -21.5F);
		bodyModel[506].rotateAngleZ = -0.54105207F;

		bodyModel[507].addShapeBox(4F, 0.5F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1504
		bodyModel[507].setRotationPoint(60F, -9.5F, -21.5F);
		bodyModel[507].rotateAngleZ = -0.54105207F;

		bodyModel[508].addShapeBox(2F, 3.5F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1505
		bodyModel[508].setRotationPoint(60F, -9.5F, -18.5F);
		bodyModel[508].rotateAngleZ = -0.54105207F;

		bodyModel[509].addShapeBox(3F, 3.5F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1506
		bodyModel[509].setRotationPoint(60F, -9.5F, -18.5F);
		bodyModel[509].rotateAngleZ = -0.54105207F;

		bodyModel[510].addShapeBox(0F, -0.5F, 0F, 1, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1507
		bodyModel[510].setRotationPoint(60F, -9.5F, 15.5F);
		bodyModel[510].rotateAngleZ = -0.54105207F;

		bodyModel[511].addShapeBox(1F, -0.5F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1508
		bodyModel[511].setRotationPoint(60F, -9.5F, 17.5F);
		bodyModel[511].rotateAngleZ = -0.54105207F;

		bodyModel[512].addShapeBox(1F, 2.5F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1509
		bodyModel[512].setRotationPoint(60F, -9.5F, 16.5F);
		bodyModel[512].rotateAngleZ = -0.54105207F;

		bodyModel[513].addShapeBox(2F, 0.5F, 0F, 2, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1510
		bodyModel[513].setRotationPoint(60F, -9.5F, 18.5F);
		bodyModel[513].rotateAngleZ = -0.54105207F;

		bodyModel[514].addShapeBox(4F, 0.5F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1511
		bodyModel[514].setRotationPoint(60F, -9.5F, 18.5F);
		bodyModel[514].rotateAngleZ = -0.54105207F;

		bodyModel[515].addShapeBox(2F, 3.5F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1512
		bodyModel[515].setRotationPoint(60F, -9.5F, 16.5F);
		bodyModel[515].rotateAngleZ = -0.54105207F;

		bodyModel[516].addShapeBox(3F, 3.5F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1513
		bodyModel[516].setRotationPoint(60F, -9.5F, 16.5F);
		bodyModel[516].rotateAngleZ = -0.54105207F;

		bodyModel[517].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1539
		bodyModel[517].setRotationPoint(-76F, -23.7F, -5.5F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1540
		bodyModel[518].setRotationPoint(-78F, -23.7F, -4F);

		bodyModel[519].addShapeBox(0F, -0.5F, 1F, 1, 1, 3, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 1223
		bodyModel[519].setRotationPoint(-20F, -22F, 27F);
		bodyModel[519].rotateAngleX = -0.29145602F;

		bodyModel[520].addShapeBox(0F, -0.5F, 1F, 1, 1, 3, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 1224
		bodyModel[520].setRotationPoint(11F, -22F, 27F);
		bodyModel[520].rotateAngleX = -0.29145602F;

		bodyModel[521].addShapeBox(0F, -0.5F, 1F, 1, 1, 3, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 1225
		bodyModel[521].setRotationPoint(20F, -22F, 27F);
		bodyModel[521].rotateAngleX = -0.29145602F;

		bodyModel[522].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 1226
		bodyModel[522].setRotationPoint(33F, -21F, 27F);
		bodyModel[522].rotateAngleX = -0.48344224F;
		bodyModel[522].rotateAngleZ = -0.15707963F;

		bodyModel[523].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 1227
		bodyModel[523].setRotationPoint(33F, -21F, 27F);
		bodyModel[523].rotateAngleX = -0.0994698F;
		bodyModel[523].rotateAngleZ = -0.15707963F;

		bodyModel[524].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 1228
		bodyModel[524].setRotationPoint(31F, -22F, 21F);
		bodyModel[524].rotateAngleX = -0.13437639F;
		bodyModel[524].rotateAngleZ = -0.15707963F;

		bodyModel[525].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(10, 10, 10, 10) }), 1, 10, 10, 35, 1, ModelRendererTurbo.MR_FRONT, new float[] {15 ,10 ,10}); // Shape 1230
		bodyModel[525].setRotationPoint(0F, 0F, 0F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1231
		bodyModel[526].setRotationPoint(-58F, -19F, 32.5F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1232
		bodyModel[527].setRotationPoint(-53.5F, -19F, 32.5F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 1233
		bodyModel[528].setRotationPoint(-57.5F, -19F, 33.5F);

		bodyModel[529].addTrapezoid(0F, 0F, 0F, 3, 2, 2, 0F, -0.80F, ModelRendererTurbo.MR_LEFT); // Box 1234
		bodyModel[529].setRotationPoint(-52.5F, -18.5F, 32.3F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.2F, -0.8F, 66F, -0.8F, -0.8F, 66F, -0.8F, -0.8F, 0F, -0.2F, -0.8F, 0F, -1.4F, -0.8F, 66F, -0.8F, -0.8F, 66F, -0.8F, -0.8F, 0F, -1.4F, -0.8F); // Box 1235
		bodyModel[530].setRotationPoint(-49.5F, -18.5F, 32.3F);

		bodyModel[531].addTrapezoid(0F, 0F, 0F, 3, 2, 2, 0F, -0.80F, ModelRendererTurbo.MR_RIGHT); // Box 1236
		bodyModel[531].setRotationPoint(19.5F, -18.5F, 32.3F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 1237
		bodyModel[532].setRotationPoint(22F, -19F, 33.5F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1238
		bodyModel[533].setRotationPoint(26.5F, -19F, 32.5F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1239
		bodyModel[534].setRotationPoint(22F, -19F, 32.5F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 0, 2140, textureX, textureY); // Box 701
		turretModel[1] = new ModelRendererTurbo(this, 0, 2170, textureX, textureY); // Box 702
		turretModel[2] = new ModelRendererTurbo(this, 0, 2185, textureX, textureY); // Box 705
		turretModel[3] = new ModelRendererTurbo(this, 0, 2198, textureX, textureY); // Box 706
		turretModel[4] = new ModelRendererTurbo(this, 0, 2170, textureX, textureY); // Box 707
		turretModel[5] = new ModelRendererTurbo(this, 0, 2239, textureX, textureY); // Box 709
		turretModel[6] = new ModelRendererTurbo(this, 0, 2260, textureX, textureY); // Box 710
		turretModel[7] = new ModelRendererTurbo(this, 0, 2281, textureX, textureY); // Box 711
		turretModel[8] = new ModelRendererTurbo(this, 0, 2307, textureX, textureY); // Box 712
		turretModel[9] = new ModelRendererTurbo(this, 0, 2330, textureX, textureY); // Box 713
		turretModel[10] = new ModelRendererTurbo(this, 0, 2343, textureX, textureY); // Box 714
		turretModel[11] = new ModelRendererTurbo(this, 0, 2354, textureX, textureY); // Box 715
		turretModel[12] = new ModelRendererTurbo(this, 0, 2352, textureX, textureY); // Box 716
		turretModel[13] = new ModelRendererTurbo(this, 0, 2411, textureX, textureY); // Box 717
		turretModel[14] = new ModelRendererTurbo(this, 0, 2432, textureX, textureY); // Box 718
		turretModel[15] = new ModelRendererTurbo(this, 0, 2461, textureX, textureY); // Box 719
		turretModel[16] = new ModelRendererTurbo(this, 0, 2480, textureX, textureY); // Box 720
		turretModel[17] = new ModelRendererTurbo(this, 0, 2495, textureX, textureY); // Box 721
		turretModel[18] = new ModelRendererTurbo(this, 0, 2510, textureX, textureY); // Box 722
		turretModel[19] = new ModelRendererTurbo(this, 0, 2525, textureX, textureY); // Box 723
		turretModel[20] = new ModelRendererTurbo(this, 0, 2536, textureX, textureY); // Box 724
		turretModel[21] = new ModelRendererTurbo(this, 0, 2547, textureX, textureY); // Box 726
		turretModel[22] = new ModelRendererTurbo(this, 0, 2569, textureX, textureY); // Box 727
		turretModel[23] = new ModelRendererTurbo(this, 0, 2589, textureX, textureY); // Box 728
		turretModel[24] = new ModelRendererTurbo(this, 0, 2609, textureX, textureY); // Box 729
		turretModel[25] = new ModelRendererTurbo(this, 0, 2627, textureX, textureY); // Box 730
		turretModel[26] = new ModelRendererTurbo(this, 0, 2646, textureX, textureY); // Box 731
		turretModel[27] = new ModelRendererTurbo(this, 0, 2625, textureX, textureY); // Box 732
		turretModel[28] = new ModelRendererTurbo(this, 0, 2684, textureX, textureY); // Box 733
		turretModel[29] = new ModelRendererTurbo(this, 0, 2714, textureX, textureY); // Box 734
		turretModel[30] = new ModelRendererTurbo(this, 0, 2746, textureX, textureY); // Box 735
		turretModel[31] = new ModelRendererTurbo(this, 0, 2807, textureX, textureY); // Box 736
		turretModel[32] = new ModelRendererTurbo(this, 0, 2863, textureX, textureY); // Box 737
		turretModel[33] = new ModelRendererTurbo(this, 0, 2893, textureX, textureY); // Box 738
		turretModel[34] = new ModelRendererTurbo(this, 0, 2915, textureX, textureY); // Box 739
		turretModel[35] = new ModelRendererTurbo(this, 0, 2940, textureX, textureY); // Box 740
		turretModel[36] = new ModelRendererTurbo(this, 0, 2962, textureX, textureY); // Box 741
		turretModel[37] = new ModelRendererTurbo(this, 0, 2981, textureX, textureY); // Box 742
		turretModel[38] = new ModelRendererTurbo(this, 0, 2992, textureX, textureY); // Box 743
		turretModel[39] = new ModelRendererTurbo(this, 0, 3007, textureX, textureY); // Box 744
		turretModel[40] = new ModelRendererTurbo(this, 0, 3019, textureX, textureY); // Box 745
		turretModel[41] = new ModelRendererTurbo(this, 0, 3032, textureX, textureY); // Box 746
		turretModel[42] = new ModelRendererTurbo(this, 0, 3028, textureX, textureY); // Box 747
		turretModel[43] = new ModelRendererTurbo(this, 0, 3041, textureX, textureY); // Box 748
		turretModel[44] = new ModelRendererTurbo(this, 0, 3041, textureX, textureY); // Box 749
		turretModel[45] = new ModelRendererTurbo(this, 0, 3041, textureX, textureY); // Box 750
		turretModel[46] = new ModelRendererTurbo(this, 0, 3041, textureX, textureY); // Box 751
		turretModel[47] = new ModelRendererTurbo(this, 0, 3050, textureX, textureY); // Box 752
		turretModel[48] = new ModelRendererTurbo(this, 0, 3055, textureX, textureY); // Box 753
		turretModel[49] = new ModelRendererTurbo(this, 0, 3055, textureX, textureY); // Box 754
		turretModel[50] = new ModelRendererTurbo(this, 0, 3055, textureX, textureY); // Box 755
		turretModel[51] = new ModelRendererTurbo(this, 0, 3066, textureX, textureY); // Box 756
		turretModel[52] = new ModelRendererTurbo(this, 0, 3076, textureX, textureY); // Box 757
		turretModel[53] = new ModelRendererTurbo(this, 0, 3084, textureX, textureY); // Box 758
		turretModel[54] = new ModelRendererTurbo(this, 0, 3091, textureX, textureY); // Box 759
		turretModel[55] = new ModelRendererTurbo(this, 0, 3066, textureX, textureY); // Box 760
		turretModel[56] = new ModelRendererTurbo(this, 0, 3041, textureX, textureY); // Box 761
		turretModel[57] = new ModelRendererTurbo(this, 0, 3101, textureX, textureY); // Box 762
		turretModel[58] = new ModelRendererTurbo(this, 0, 3111, textureX, textureY); // Box 763===
		turretModel[59] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Box 764
		turretModel[60] = new ModelRendererTurbo(this, 0, 3123, textureX, textureY); // Box 765
		turretModel[61] = new ModelRendererTurbo(this, 0, 3123, textureX, textureY); // Box 766
		turretModel[62] = new ModelRendererTurbo(this, 0, 3129, textureX, textureY); // Box 767
		turretModel[63] = new ModelRendererTurbo(this, 0, 3129, textureX, textureY); // Box 768
		turretModel[64] = new ModelRendererTurbo(this, 0, 3136, textureX, textureY); // Box 769
		turretModel[65] = new ModelRendererTurbo(this, 0, 3136, textureX, textureY); // Box 770
		turretModel[66] = new ModelRendererTurbo(this, 0, 3142, textureX, textureY); // Box 771
		turretModel[67] = new ModelRendererTurbo(this, 0, 3155, textureX, textureY); // Box 772
		turretModel[68] = new ModelRendererTurbo(this, 0, 3155, textureX, textureY); // Box 773
		turretModel[69] = new ModelRendererTurbo(this, 0, 3155, textureX, textureY); // Box 774
		turretModel[70] = new ModelRendererTurbo(this, 0, 3155, textureX, textureY); // Box 775
		turretModel[71] = new ModelRendererTurbo(this, 0, 3142, textureX, textureY); // Box 776
		turretModel[72] = new ModelRendererTurbo(this, 0, 3159, textureX, textureY); // Box 778
		turretModel[73] = new ModelRendererTurbo(this, 0, 3163, textureX, textureY); // Box 779
		turretModel[74] = new ModelRendererTurbo(this, 0, 3176, textureX, textureY); // Box 780
		turretModel[75] = new ModelRendererTurbo(this, 0, 3196, textureX, textureY); // Box 781
		turretModel[76] = new ModelRendererTurbo(this, 0, 3229, textureX, textureY); // Box 786
		turretModel[77] = new ModelRendererTurbo(this, 0, 3237, textureX, textureY); // Box 787
		turretModel[78] = new ModelRendererTurbo(this, 0, 3255, textureX, textureY); // Box 789
		turretModel[79] = new ModelRendererTurbo(this, 0, 3255, textureX, textureY); // Box 790
		turretModel[80] = new ModelRendererTurbo(this, 0, 3258, textureX, textureY); // Box 791
		turretModel[81] = new ModelRendererTurbo(this, 0, 3266, textureX, textureY); // Box 792
		turretModel[82] = new ModelRendererTurbo(this, 0, 3258, textureX, textureY); // Box 793
		turretModel[83] = new ModelRendererTurbo(this, 0, 3278, textureX, textureY); // Box 794
		turretModel[84] = new ModelRendererTurbo(this, 0, 3283, textureX, textureY); // Box 795
		turretModel[85] = new ModelRendererTurbo(this, 0, 3292, textureX, textureY); // Box 796
		turretModel[86] = new ModelRendererTurbo(this, 0, 3292, textureX, textureY); // Box 797
		turretModel[87] = new ModelRendererTurbo(this, 0, 3292, textureX, textureY); // Box 798
		turretModel[88] = new ModelRendererTurbo(this, 0, 3292, textureX, textureY); // Box 799
		turretModel[89] = new ModelRendererTurbo(this, 0, 3292, textureX, textureY); // Box 800
		turretModel[90] = new ModelRendererTurbo(this, 0, 3129, textureX, textureY); // Box 808
		turretModel[91] = new ModelRendererTurbo(this, 0, 3129, textureX, textureY); // Box 809
		turretModel[92] = new ModelRendererTurbo(this, 0, 3136, textureX, textureY); // Box 810
		turretModel[93] = new ModelRendererTurbo(this, 0, 3136, textureX, textureY); // Box 811
		turretModel[94] = new ModelRendererTurbo(this, 0, 3302, textureX, textureY); // Box 812
		turretModel[95] = new ModelRendererTurbo(this, 0, 3270, textureX, textureY); // Box 813
		turretModel[96] = new ModelRendererTurbo(this, 0, 3312, textureX, textureY); // Box 814
		turretModel[97] = new ModelRendererTurbo(this, 0, 3352, textureX, textureY); // Box 815
		turretModel[98] = new ModelRendererTurbo(this, 0, 3392, textureX, textureY); // Box 816
		turretModel[99] = new ModelRendererTurbo(this, 0, 3392, textureX, textureY); // Box 817
		turretModel[100] = new ModelRendererTurbo(this, 0, 3396, textureX, textureY); // Box 818
		turretModel[101] = new ModelRendererTurbo(this, 0, 3396, textureX, textureY); // Box 819
		turretModel[102] = new ModelRendererTurbo(this, 0, 3396, textureX, textureY); // Box 820
		turretModel[103] = new ModelRendererTurbo(this, 0, 3396, textureX, textureY); // Box 821
		turretModel[104] = new ModelRendererTurbo(this, 0, 3392, textureX, textureY); // Box 822
		turretModel[105] = new ModelRendererTurbo(this, 0, 3392, textureX, textureY); // Box 823
		turretModel[106] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 824
		turretModel[107] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 825
		turretModel[108] = new ModelRendererTurbo(this, 0, 3399, textureX, textureY); // Box 826
		turretModel[109] = new ModelRendererTurbo(this, 0, 3399, textureX, textureY); // Box 827
		turretModel[110] = new ModelRendererTurbo(this, 0, 3399, textureX, textureY); // Box 828
		turretModel[111] = new ModelRendererTurbo(this, 0, 3399, textureX, textureY); // Box 829
		turretModel[112] = new ModelRendererTurbo(this, 0, 3399, textureX, textureY); // Box 830
		turretModel[113] = new ModelRendererTurbo(this, 0, 3399, textureX, textureY); // Box 831
		turretModel[114] = new ModelRendererTurbo(this, 0, 3408, textureX, textureY); // Box 832
		turretModel[115] = new ModelRendererTurbo(this, 0, 3408, textureX, textureY); // Box 833
		turretModel[116] = new ModelRendererTurbo(this, 0, 3399, textureX, textureY); // Box 834
		turretModel[117] = new ModelRendererTurbo(this, 0, 3399, textureX, textureY); // Box 835
		turretModel[118] = new ModelRendererTurbo(this, 0, 3418, textureX, textureY); // Box 836
		turretModel[119] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 837
		turretModel[120] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 838
		turretModel[121] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 839
		turretModel[122] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 840
		turretModel[123] = new ModelRendererTurbo(this, 0, 3399, textureX, textureY); // Box 841
		turretModel[124] = new ModelRendererTurbo(this, 0, 3431, textureX, textureY); // Box 842
		turretModel[125] = new ModelRendererTurbo(this, 0, 3456, textureX, textureY); // Box 843---
		turretModel[126] = new ModelRendererTurbo(this, 0, 3473, textureX, textureY); // Box 844
		turretModel[127] = new ModelRendererTurbo(this, 0, 3488, textureX, textureY); // Box 845
		turretModel[128] = new ModelRendererTurbo(this, 0, 3500, textureX, textureY); // Box 846
		turretModel[129] = new ModelRendererTurbo(this, 0, 3500, textureX, textureY); // Box 847
		turretModel[130] = new ModelRendererTurbo(this, 0, 3500, textureX, textureY); // Box 848
		turretModel[131] = new ModelRendererTurbo(this, 0, 3515, textureX, textureY); // Box 849
		turretModel[132] = new ModelRendererTurbo(this, 0, 3522, textureX, textureY); // Box 850
		turretModel[133] = new ModelRendererTurbo(this, 0, 3526, textureX, textureY); // Box 851
		turretModel[134] = new ModelRendererTurbo(this, 0, 3530, textureX, textureY); // Box 853
		turretModel[135] = new ModelRendererTurbo(this, 0, 3544, textureX, textureY); // Box 854
		turretModel[136] = new ModelRendererTurbo(this, 0, 3544, textureX, textureY); // Box 855
		turretModel[137] = new ModelRendererTurbo(this, 0, 3570, textureX, textureY); // Box 864
		turretModel[138] = new ModelRendererTurbo(this, 0, 3582, textureX, textureY); // Box 865
		turretModel[139] = new ModelRendererTurbo(this, 0, 3570, textureX, textureY); // Box 866
		turretModel[140] = new ModelRendererTurbo(this, 0, 3582, textureX, textureY); // Box 867
		turretModel[141] = new ModelRendererTurbo(this, 0, 3594, textureX, textureY); // Box 868
		turretModel[142] = new ModelRendererTurbo(this, 0, 3594, textureX, textureY); // Box 869
		turretModel[143] = new ModelRendererTurbo(this, 0, 3594, textureX, textureY); // Box 870
		turretModel[144] = new ModelRendererTurbo(this, 0, 3594, textureX, textureY); // Box 871
		turretModel[145] = new ModelRendererTurbo(this, 0, 3603, textureX, textureY); // Box 876
		turretModel[146] = new ModelRendererTurbo(this, 0, 3603, textureX, textureY); // Box 877
		turretModel[147] = new ModelRendererTurbo(this, 0, 3599, textureX, textureY); // Box 878
		turretModel[148] = new ModelRendererTurbo(this, 0, 3615, textureX, textureY); // Box 885
		turretModel[149] = new ModelRendererTurbo(this, 0, 3624, textureX, textureY); // Box 886
		turretModel[150] = new ModelRendererTurbo(this, 0, 3624, textureX, textureY); // Box 887
		turretModel[151] = new ModelRendererTurbo(this, 0, 3633, textureX, textureY); // Box 888
		turretModel[152] = new ModelRendererTurbo(this, 0, 3653, textureX, textureY); // Box 889
		turretModel[153] = new ModelRendererTurbo(this, 0, 3639, textureX, textureY); // Box 890
		turretModel[154] = new ModelRendererTurbo(this, 0, 3649, textureX, textureY); // Box 891
		turretModel[155] = new ModelRendererTurbo(this, 0, 3649, textureX, textureY); // Box 892
		turretModel[156] = new ModelRendererTurbo(this, 0, 3649, textureX, textureY); // Box 893
		turretModel[157] = new ModelRendererTurbo(this, 0, 3649, textureX, textureY); // Box 894
		turretModel[158] = new ModelRendererTurbo(this, 0, 3649, textureX, textureY); // Box 895
		turretModel[159] = new ModelRendererTurbo(this, 0, 3649, textureX, textureY); // Box 896
		turretModel[160] = new ModelRendererTurbo(this, 0, 3649, textureX, textureY); // Box 897
		turretModel[161] = new ModelRendererTurbo(this, 0, 3649, textureX, textureY); // Box 898
		turretModel[162] = new ModelRendererTurbo(this, 0, 3649, textureX, textureY); // Box 899
		turretModel[163] = new ModelRendererTurbo(this, 0, 3649, textureX, textureY); // Box 900
		turretModel[164] = new ModelRendererTurbo(this, 0, 3653, textureX, textureY); // Box 901
		turretModel[165] = new ModelRendererTurbo(this, 0, 3639, textureX, textureY); // Box 902
		turretModel[166] = new ModelRendererTurbo(this, 0, 3662, textureX, textureY); // Box 903
		turretModel[167] = new ModelRendererTurbo(this, 0, 3674, textureX, textureY); // Box 904
		turretModel[168] = new ModelRendererTurbo(this, 0, 3681, textureX, textureY); // Box 905
		turretModel[169] = new ModelRendererTurbo(this, 0, 3684, textureX, textureY); // Box 906
		turretModel[170] = new ModelRendererTurbo(this, 0, 3692, textureX, textureY); // Box 907
		turretModel[171] = new ModelRendererTurbo(this, 0, 3703, textureX, textureY); // Box 908
		turretModel[172] = new ModelRendererTurbo(this, 0, 3696, textureX, textureY); // Box 909
		turretModel[173] = new ModelRendererTurbo(this, 0, 3710, textureX, textureY); // Box 910
		turretModel[174] = new ModelRendererTurbo(this, 0, 3717, textureX, textureY); // Box 911
		turretModel[175] = new ModelRendererTurbo(this, 0, 3730, textureX, textureY); // Box 913
		turretModel[176] = new ModelRendererTurbo(this, 0, 3737, textureX, textureY); // Box 914
		turretModel[177] = new ModelRendererTurbo(this, 0, 3747, textureX, textureY); // Box 916
		turretModel[178] = new ModelRendererTurbo(this, 0, 3767, textureX, textureY); // Box 917
		turretModel[179] = new ModelRendererTurbo(this, 0, 3789, textureX, textureY); // Box 918
		turretModel[180] = new ModelRendererTurbo(this, 0, 3812, textureX, textureY); // Box 919
		turretModel[181] = new ModelRendererTurbo(this, 0, 3767, textureX, textureY); // Box 942
		turretModel[182] = new ModelRendererTurbo(this, 0, 3789, textureX, textureY); // Box 943
		turretModel[183] = new ModelRendererTurbo(this, 0, 3812, textureX, textureY); // Box 944
		turretModel[184] = new ModelRendererTurbo(this, 0, 3767, textureX, textureY); // Box 947
		turretModel[185] = new ModelRendererTurbo(this, 0, 3789, textureX, textureY); // Box 948
		turretModel[186] = new ModelRendererTurbo(this, 0, 3812, textureX, textureY); // Box 949
		turretModel[187] = new ModelRendererTurbo(this, 0, 3767, textureX, textureY); // Box 952
		turretModel[188] = new ModelRendererTurbo(this, 0, 3789, textureX, textureY); // Box 953
		turretModel[189] = new ModelRendererTurbo(this, 0, 3812, textureX, textureY); // Box 954
		turretModel[190] = new ModelRendererTurbo(this, 0, 3767, textureX, textureY); // Box 957
		turretModel[191] = new ModelRendererTurbo(this, 0, 3789, textureX, textureY); // Box 958
		turretModel[192] = new ModelRendererTurbo(this, 0, 3812, textureX, textureY); // Box 959
		turretModel[193] = new ModelRendererTurbo(this, 0, 3767, textureX, textureY); // Box 962
		turretModel[194] = new ModelRendererTurbo(this, 0, 3789, textureX, textureY); // Box 963
		turretModel[195] = new ModelRendererTurbo(this, 0, 3812, textureX, textureY); // Box 964
		turretModel[196] = new ModelRendererTurbo(this, 0, 3838, textureX, textureY); // Box 965
		turretModel[197] = new ModelRendererTurbo(this, 0, 3871, textureX, textureY); // Box 966
		turretModel[198] = new ModelRendererTurbo(this, 0, 3851, textureX, textureY); // Box 967
		turretModel[199] = new ModelRendererTurbo(this, 0, 3884, textureX, textureY); // Box 970
		turretModel[200] = new ModelRendererTurbo(this, 0, 3892, textureX, textureY); // Box 971
		turretModel[201] = new ModelRendererTurbo(this, 0, 3892, textureX, textureY); // Box 972
		turretModel[202] = new ModelRendererTurbo(this, 0, 3896, textureX, textureY); // Box 921
		turretModel[203] = new ModelRendererTurbo(this, 0, 3903, textureX, textureY); // Box 922
		turretModel[204] = new ModelRendererTurbo(this, 0, 3913, textureX, textureY); // Box 923
		turretModel[205] = new ModelRendererTurbo(this, 0, 3924, textureX, textureY); // Box 924
		turretModel[206] = new ModelRendererTurbo(this, 0, 3924, textureX, textureY); // Box 925
		turretModel[207] = new ModelRendererTurbo(this, 0, 3932, textureX, textureY); // Box 926
		turretModel[208] = new ModelRendererTurbo(this, 0, 3938, textureX, textureY); // Box 927
		turretModel[209] = new ModelRendererTurbo(this, 0, 3946, textureX, textureY); // Box 928
		turretModel[210] = new ModelRendererTurbo(this, 0, 3946, textureX, textureY); // Box 929
		turretModel[211] = new ModelRendererTurbo(this, 0, 3950, textureX, textureY); // Box 930
		turretModel[212] = new ModelRendererTurbo(this, 0, 3954, textureX, textureY); // Box 932
		turretModel[213] = new ModelRendererTurbo(this, 0, 3963, textureX, textureY); // Box 933
		turretModel[214] = new ModelRendererTurbo(this, 0, 3963, textureX, textureY); // Box 934
		turretModel[215] = new ModelRendererTurbo(this, 0, 3971, textureX, textureY); // Box 935
		turretModel[216] = new ModelRendererTurbo(this, 0, 3991, textureX, textureY); // Box 1008
		turretModel[217] = new ModelRendererTurbo(this, 0, 3991, textureX, textureY); // Box 1009
		turretModel[218] = new ModelRendererTurbo(this, 0, 3997, textureX, textureY); // Box 1010
		turretModel[219] = new ModelRendererTurbo(this, 0, 4003, textureX, textureY); // Box 1523
		turretModel[220] = new ModelRendererTurbo(this, 0, 4003, textureX, textureY); // Box 1524
		turretModel[221] = new ModelRendererTurbo(this, 0, 4003, textureX, textureY); // Box 1525
		turretModel[222] = new ModelRendererTurbo(this, 0, 4009, textureX, textureY); // Box 1526
		turretModel[223] = new ModelRendererTurbo(this, 0, 4009, textureX, textureY); // Box 1527
		turretModel[224] = new ModelRendererTurbo(this, 0, 4009, textureX, textureY); // Box 1528
		turretModel[225] = new ModelRendererTurbo(this, 0, 4016, textureX, textureY); // Box 1529
		turretModel[226] = new ModelRendererTurbo(this, 0, 4021, textureX, textureY); // Box 1530
		turretModel[227] = new ModelRendererTurbo(this, 0, 4003, textureX, textureY); // Box 1531
		turretModel[228] = new ModelRendererTurbo(this, 0, 4003, textureX, textureY); // Box 1532
		turretModel[229] = new ModelRendererTurbo(this, 0, 4009, textureX, textureY); // Box 1533
		turretModel[230] = new ModelRendererTurbo(this, 0, 4009, textureX, textureY); // Box 1534
		turretModel[231] = new ModelRendererTurbo(this, 0, 4009, textureX, textureY); // Box 1535
		turretModel[232] = new ModelRendererTurbo(this, 0, 4003, textureX, textureY); // Box 1536
		turretModel[233] = new ModelRendererTurbo(this, 0, 4016, textureX, textureY); // Box 1537
		turretModel[234] = new ModelRendererTurbo(this, 0, 4021, textureX, textureY); // Box 1538

		turretModel[0].addShapeBox(0F, 0F, 0F, 29, 10, 17, 0F,0F, 0F, 0F, -24F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 701
		turretModel[0].setRotationPoint(17F, -32.5F, -22F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 29, 10, 2, 0F,0F, 0F, 0F, -14F, 0F, 0F, -12.8235294F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F); // Box 702
		turretModel[1].setRotationPoint(17F, -32.5F, -5F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 31, 4, 7, 0F,0.5F, 0F, -2.5F, -9.729411F, 0F, 0F, -5.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, -4.529411F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 705
		turretModel[2].setRotationPoint(4F, -26.5F, -29F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 29, 10, 24, 0F,0F, 0F, 0F, -14F, 0F, 0F, -28F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14.5F, 0F, 0F, 0F, 0F, 0F); // Box 706
		turretModel[3].setRotationPoint(17F, -32.5F, 6F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 29, 10, 2, 0F,0F, 0F, 0F, -12.8235294F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 707
		turretModel[4].setRotationPoint(17F, -32.5F, 4F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 18, 11, 6, 0F,0F, 0F, 1F, 0F, 1F, 0F, 0F, 0F, -1.23529F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -1.23529F, 0F, -1F, -2F); // Box 709
		turretModel[5].setRotationPoint(-14F, -33.5F, 24F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 13, 11, 6, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1.23529F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.23529F); // Box 710
		turretModel[6].setRotationPoint(4F, -33.5F, 24F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 13, 3, 17, 0F,0F, 0.5F, 0F, -1F, -1.5F, -5F, -7F, -2.5F, 0F, 10F, -1F, 0F, 0F, 0F, 0F, 1.5F, 0F, -5F, -5.5F, 0F, 0F, 10F, 0F, 0F); // Box 711
		turretModel[7].setRotationPoint(14F, -35.5F, 7F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 18, 3, 17, 0F,0F, 0.5F, 0F, 0F, -2F, 0F, -6F, -1.5F, -9F, 0F, 0.5F, -14F, 0F, 0F, 0F, 1.1764706F, 0F, 0F, -3.5F, 0F, -9F, 0F, 0F, -14F); // Box 712
		turretModel[8].setRotationPoint(14F, -35.5F, 4F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 18, 3, 7, 0F,0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1.1764706F, 0F, 0F, 1.1764706F, 0F, 0F, 0F, 0F, 0F); // Box 713
		turretModel[9].setRotationPoint(14F, -35.5F, -3F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 18, 3, 4, 0F,0F, 0.5F, 0F, -2.1764706F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.1764706F, 0F, 0F, 1.1764706F, 0F, 0F, 0F, 0F, 0F); // Box 714
		turretModel[10].setRotationPoint(14F, -35.5F, -7F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 14, 3, 4, 0F,3.5F, 0.5F, 0F, -2.3F, -1.5F, 0F, 0F, -1.5F, 0F, 3.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 2.35294F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 715
		turretModel[11].setRotationPoint(8F, -36F, -22F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 19, 10, 45, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 716
		turretModel[12].setRotationPoint(-2F, -32.5F, -21F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 11, 4, 14, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -5F); // Box 717
		turretModel[13].setRotationPoint(3F, -37F, -7F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 11, 4, 22, 0F,0F, 0F, 0F, 0F, -1F, -5F, -10F, -2.5F, 0F, 20F, -3.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, -5F, -10F, 0.5F, 0F, 20F, 0.5F, -1F); // Box 718
		turretModel[14].setRotationPoint(3F, -37F, 2F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 14, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 719
		turretModel[15].setRotationPoint(3.5F, -36.5F, -27F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 14, 9, 2, 0F,-6F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 720
		turretModel[16].setRotationPoint(3.5F, -36.5F, -29F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 12, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 721
		turretModel[17].setRotationPoint(4.5F, -36.5F, -23F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 12, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 722
		turretModel[18].setRotationPoint(4.5F, -36.5F, -22F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 723
		turretModel[19].setRotationPoint(9.5F, -27.5F, -29F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 724
		turretModel[20].setRotationPoint(3.5F, -27.5F, -29F);

		turretModel[21].addShapeBox(0F, 0F, 0F, 2, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 726
		turretModel[21].setRotationPoint(3F, -37F, -21F);

		turretModel[22].addShapeBox(0F, 0F, 0F, 2, 4, 14, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 727
		turretModel[22].setRotationPoint(5F, -37F, -21F);

		turretModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 728
		turretModel[23].setRotationPoint(7F, -36F, -21F);

		turretModel[24].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 729
		turretModel[24].setRotationPoint(-15F, -33.5F, 24F);

		turretModel[25].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 730
		turretModel[25].setRotationPoint(-17F, -33.5F, 26F);

		turretModel[26].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 731
		turretModel[26].setRotationPoint(-17F, -32.5F, 24F);

		turretModel[27].addShapeBox(0F, 0F, 0F, 15, 10, 45, 0F,6F, 0F, -2F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -1F, -2F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 732
		turretModel[27].setRotationPoint(-17F, -32.5F, -21F);

		turretModel[28].addShapeBox(0F, 0F, 0F, 26, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, -20F, -3.5F, 0F, 17F, -3.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -20F, 0.5F, 0F, 17F, 0.5F, 0F); // Box 733
		turretModel[28].setRotationPoint(-23F, -37F, 2F);

		turretModel[29].addShapeBox(0F, 0F, 0F, 26, 4, 23, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 734
		turretModel[29].setRotationPoint(-23F, -37F, -21F);

		turretModel[30].addShapeBox(0F, 0F, 0F, 12, 9, 45, 0F,0F, 0F, -2.3529F, -6F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.3529F, -6F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 735
		turretModel[30].setRotationPoint(-29F, -32.5F, -21F);

		turretModel[31].addShapeBox(0F, 0F, 0F, 11, 8, 42, 0F,0F, 0F, 0F, 0F, 0F, 0.6471F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6471F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 736
		turretModel[31].setRotationPoint(-40F, -32.5F, -18F);

		turretModel[32].addShapeBox(0F, 0F, 0F, 17, 4, 21, 0F,0F, -3.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 21F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 21F); // Box 737
		turretModel[32].setRotationPoint(-40F, -37F, -19F);

		turretModel[33].addShapeBox(-19F, 0F, 0F, 19, 14, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F); // Box 738
		turretModel[33].setRotationPoint(3.5F, -36.5F, -26.5F);
		turretModel[33].rotateAngleY = -0.13962634F;

		turretModel[34].addShapeBox(-20F, 0F, 0F, 1, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F); // Box 739
		turretModel[34].setRotationPoint(3.5F, -36.5F, -26.5F);
		turretModel[34].rotateAngleY = -0.13962634F;

		turretModel[35].addShapeBox(-22F, 0F, 0F, 2, 14, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 740
		turretModel[35].setRotationPoint(3.5F, -36.5F, -26.5F);
		turretModel[35].rotateAngleY = -0.13962634F;

		turretModel[36].addShapeBox(-22F, 0F, 2F, 2, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 741
		turretModel[36].setRotationPoint(3.5F, -35.5F, -26.5F);
		turretModel[36].rotateAngleY = -0.13962634F;

		turretModel[37].addTrapezoid(-18.5F, 0F, -1F, 4, 7, 1, 0F, -0.50F, ModelRendererTurbo.MR_FRONT); // Box 742
		turretModel[37].setRotationPoint(3.5F, -35F, -26.5F);
		turretModel[37].rotateAngleY = -0.13962634F;

		turretModel[38].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 743
		turretModel[38].setRotationPoint(-18F, -33F, 24F);

		turretModel[39].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 744
		turretModel[39].setRotationPoint(-18F, -32F, 27F);

		turretModel[40].addShapeBox(0F, 0F, 0F, 20, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 745
		turretModel[40].setRotationPoint(-38F, -27F, 24F);

		turretModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 746
		turretModel[41].setRotationPoint(-40F, -27F, 24F);

		turretModel[42].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 747
		turretModel[42].setRotationPoint(-38F, -33F, 28F);

		turretModel[43].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 748
		turretModel[43].setRotationPoint(-36F, -32F, 28F);

		turretModel[44].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 749
		turretModel[44].setRotationPoint(-31F, -32F, 28F);

		turretModel[45].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 750
		turretModel[45].setRotationPoint(-26F, -32F, 28F);

		turretModel[46].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 751
		turretModel[46].setRotationPoint(-21F, -32F, 28F);

		turretModel[47].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 752
		turretModel[47].setRotationPoint(-35F, -29F, 28F);

		turretModel[48].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 753
		turretModel[48].setRotationPoint(-35F, -32F, 28F);

		turretModel[49].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 754
		turretModel[49].setRotationPoint(-30F, -32F, 28F);

		turretModel[50].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 755
		turretModel[50].setRotationPoint(-25F, -32F, 28F);

		turretModel[51].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 756
		turretModel[51].setRotationPoint(-20F, -32F, 28F);

		turretModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 757
		turretModel[52].setRotationPoint(-40F, -33F, 24F);

		turretModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, 0F); // Box 758
		turretModel[53].setRotationPoint(-40F, -33F, 27F);

		turretModel[54].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, -0.5F); // Box 759
		turretModel[54].setRotationPoint(-40F, -32F, 27F);

		turretModel[55].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 760
		turretModel[55].setRotationPoint(-38F, -32F, 28F);

		turretModel[56].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 761
		turretModel[56].setRotationPoint(-40F, -32F, 26F);

		turretModel[57].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 762
		turretModel[57].setRotationPoint(-40F, -32F, 24F);

		turretModel[58].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 763===
		turretModel[58].setRotationPoint(-40F, -33F, 23F);

		turretModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 764
		turretModel[59].setRotationPoint(-41F, -33.5F, 17F);

		turretModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 765
		turretModel[60].setRotationPoint(-42F, -33.5F, 19F);

		turretModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 766
		turretModel[61].setRotationPoint(-42F, -33.5F, 17F);

		turretModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.333F, 0F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, 0F, -0.333F, 0F, 0F, 0F); // Box 767
		turretModel[62].setRotationPoint(-42F, -34F, 18.5F);
		turretModel[62].rotateAngleY = -0.31415927F;

		turretModel[63].addShapeBox(0F, 0F, -1F, 1, 3, 1, 0F,0F, 0F, 0F, -0.333F, 0F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, 0F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 768
		turretModel[63].setRotationPoint(-42F, -34F, 18.5F);
		turretModel[63].rotateAngleY = -0.31415927F;

		turretModel[64].addShapeBox(-1F, 0F, -1F, 1, 3, 1, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -0.8F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 769
		turretModel[64].setRotationPoint(-42F, -34F, 18.5F);
		turretModel[64].rotateAngleY = -0.31415927F;

		turretModel[65].addShapeBox(-1F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 770
		turretModel[65].setRotationPoint(-42F, -34F, 18.5F);
		turretModel[65].rotateAngleY = -0.31415927F;

		turretModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 771
		turretModel[66].setRotationPoint(-40.5F, -33.5F, 16F);

		turretModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 772
		turretModel[67].setRotationPoint(-41F, -33.5F, 22.5F);

		turretModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 773
		turretModel[68].setRotationPoint(-41F, -32.5F, 22.5F);

		turretModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 774
		turretModel[69].setRotationPoint(-41F, -25.9F, 22.5F);

		turretModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 775
		turretModel[70].setRotationPoint(-41F, -26.9F, 22.5F);

		turretModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 776
		turretModel[71].setRotationPoint(-40.5F, -26.9F, 16F);

		turretModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 778
		turretModel[72].setRotationPoint(-40.5F, -29F, 20F);

		turretModel[73].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 779
		turretModel[73].setRotationPoint(-40.2F, -32.5F, 16F);

		turretModel[74].addShapeBox(0F, 0F, 0F, 4, 11, 7, 0F,0F, 0F, 0.3F, 0F, 0F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 780
		turretModel[74].setRotationPoint(-22.5F, -35.5F, -26F);

		turretModel[75].addShapeBox(0F, 0F, 0F, 8, 11, 7, 0F,0F, -2F, 0.9375F, 0.5F, 0F, 0.3F, 0.5F, 1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0.9375F, 0.5F, -0.5F, 0.3F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 781
		turretModel[75].setRotationPoint(-31F, -35.5F, -26F);

		turretModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 786
		turretModel[76].setRotationPoint(-22F, -36F, -25.5F);
		turretModel[76].rotateAngleX = 0.10471976F;
		turretModel[76].rotateAngleY = -0.08726646F;

		turretModel[77].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 787
		turretModel[77].setRotationPoint(-32F, -33.5F, -26F);

		turretModel[78].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 789
		turretModel[78].setRotationPoint(-45F, -26.5F, -26F);

		turretModel[79].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,-1F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 790
		turretModel[79].setRotationPoint(-45F, -30.5F, -26F);

		turretModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 791
		turretModel[80].setRotationPoint(-45F, -26.5F, -25F);

		turretModel[81].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F); // Box 792
		turretModel[81].setRotationPoint(-46F, -32.5F, -20F);

		turretModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 793
		turretModel[82].setRotationPoint(-45F, -30.5F, -25F);

		turretModel[83].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 794
		turretModel[83].setRotationPoint(-45F, -26.5F, -20F);

		turretModel[84].addShapeBox(0F, 0F, 0F, 13, 1, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 795
		turretModel[84].setRotationPoint(-45F, -26.5F, -25F);

		turretModel[85].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 796
		turretModel[85].setRotationPoint(-43F, -30.5F, -26F);

		turretModel[86].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 797
		turretModel[86].setRotationPoint(-40.5F, -31F, -26F);

		turretModel[87].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 798
		turretModel[87].setRotationPoint(-37.5F, -32F, -26F);

		turretModel[88].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 799
		turretModel[88].setRotationPoint(-34.5F, -33F, -26F);

		turretModel[89].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 800
		turretModel[89].setRotationPoint(-45F, -29.5F, -24F);

		turretModel[90].addShapeBox(0F, 0F, -1F, 1, 3, 1, 0F,0F, 0F, 0F, -0.333F, 0F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, 0F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 808
		turretModel[90].setRotationPoint(-41F, -34F, -17F);
		turretModel[90].rotateAngleY = 0.31415927F;

		turretModel[91].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.333F, 0F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, 0F, -0.333F, 0F, 0F, 0F); // Box 809
		turretModel[91].setRotationPoint(-41F, -34F, -17F);
		turretModel[91].rotateAngleY = 0.31415927F;

		turretModel[92].addShapeBox(-1F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 810
		turretModel[92].setRotationPoint(-41F, -34F, -17F);
		turretModel[92].rotateAngleY = 0.31415927F;

		turretModel[93].addShapeBox(-1F, 0F, -1F, 1, 3, 1, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -0.8F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 811
		turretModel[93].setRotationPoint(-41F, -34F, -17F);
		turretModel[93].rotateAngleY = 0.31415927F;

		turretModel[94].addShapeBox(0F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 812
		turretModel[94].setRotationPoint(-40.9F, -33.3F, -17F);
		turretModel[94].rotateAngleY = 0.31415927F;

		turretModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 39, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 813
		turretModel[95].setRotationPoint(-40F, -34F, -17.5F);

		turretModel[96].addShapeBox(0F, 0F, 0F, 9, 7, 31, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 814
		turretModel[96].setRotationPoint(-49F, -32.5F, -15F);

		turretModel[97].addShapeBox(0F, 0F, 0F, 3, 7, 31, 0F,0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 815
		turretModel[97].setRotationPoint(-52F, -32.5F, -15F);

		turretModel[98].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 816
		turretModel[98].setRotationPoint(-49F, -33F, -16F);

		turretModel[99].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 817
		turretModel[99].setRotationPoint(-49F, -26.5F, -16F);

		turretModel[100].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 6F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 6F); // Box 818
		turretModel[100].setRotationPoint(-53F, -26.5F, -16F);

		turretModel[101].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -7F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 6F, 0F, 0F, -7F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 6F); // Box 819
		turretModel[101].setRotationPoint(-53F, -32F, -16F);

		turretModel[102].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 6F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -7F, -1F, 0F, 6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -7F); // Box 820
		turretModel[102].setRotationPoint(-53F, -32F, 16F);

		turretModel[103].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -1F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 821
		turretModel[103].setRotationPoint(-53F, -26.5F, 16F);

		turretModel[104].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 822
		turretModel[104].setRotationPoint(-49F, -33F, 16F);

		turretModel[105].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 823
		turretModel[105].setRotationPoint(-49F, -26.5F, 16F);

		turretModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 824
		turretModel[106].setRotationPoint(-53F, -32F, -9F);

		turretModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 825
		turretModel[107].setRotationPoint(-53F, -26.5F, -9F);

		turretModel[108].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 826
		turretModel[108].setRotationPoint(-47F, -32.5F, -16F);

		turretModel[109].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 827
		turretModel[109].setRotationPoint(-52F, -31.5F, -11F);

		turretModel[110].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 828
		turretModel[110].setRotationPoint(-53F, -31.5F, -8F);

		turretModel[111].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 829
		turretModel[111].setRotationPoint(-53F, -31.5F, 0F);

		turretModel[112].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 830
		turretModel[112].setRotationPoint(-53F, -31.5F, 8F);

		turretModel[113].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 831
		turretModel[113].setRotationPoint(-52F, -31.5F, 11F);

		turretModel[114].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 832
		turretModel[114].setRotationPoint(-52.8F, -30.5F, 3F);

		turretModel[115].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 833
		turretModel[115].setRotationPoint(-52.8F, -30.5F, -6F);

		turretModel[116].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 834
		turretModel[116].setRotationPoint(-47F, -32.5F, 16F);

		turretModel[117].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 835
		turretModel[117].setRotationPoint(-44F, -33.5F, 16F);

		turretModel[118].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 836
		turretModel[118].setRotationPoint(-46F, -31.5F, 16F);

		turretModel[119].addShapeBox(-5F, -1F, 0F, 5, 1, 1, 0F,-3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 837
		turretModel[119].setRotationPoint(-40F, -33.5F, -15F);
		turretModel[119].rotateAngleZ = 0.12217305F;

		turretModel[120].addShapeBox(-5F, -1F, 0F, 5, 1, 1, 0F,-3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 838
		turretModel[120].setRotationPoint(-40F, -33.5F, 2F);
		turretModel[120].rotateAngleZ = 0.12217305F;

		turretModel[121].addShapeBox(-5F, -1F, 0F, 5, 1, 1, 0F,-3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 839
		turretModel[121].setRotationPoint(-40F, -33.5F, 4F);
		turretModel[121].rotateAngleZ = 0.12217305F;

		turretModel[122].addShapeBox(-5F, -1F, 0F, 5, 1, 1, 0F,-3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 840
		turretModel[122].setRotationPoint(-40F, -33.5F, 15F);
		turretModel[122].rotateAngleZ = 0.12217305F;

		turretModel[123].addShapeBox(-2F, -0.5F, 0F, 1, 1, 29, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 841
		turretModel[123].setRotationPoint(-40F, -33.5F, -14F);
		turretModel[123].rotateAngleZ = 0.12217305F;

		turretModel[124].addShapeBox(-8.5F, -0.5F, 0F, 3, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 842
		turretModel[124].setRotationPoint(-40F, -33.5F, -11F);
		turretModel[124].rotateAngleZ = 0.12217305F;

		turretModel[125].addShapeBox(0F, 0F, 0F, 1, 6, 9, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 843---
		turretModel[125].setRotationPoint(8.5F, -37.5F, -17F);

		turretModel[126].addShapeBox(0F, 0F, 0F, 3, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 844
		turretModel[126].setRotationPoint(9.5F, -37.5F, -17F);

		turretModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 845
		turretModel[127].setRotationPoint(12.5F, -37.5F, -17F);

		turretModel[128].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 846
		turretModel[128].setRotationPoint(12.5F, -36.5F, -17F);

		turretModel[129].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 847
		turretModel[129].setRotationPoint(12.5F, -36.5F, -9F);

		turretModel[130].addShapeBox(0F, 0F, 0F, 32, 2, 11, 0F,-5F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5.64706F, 0F, 0F, 0.8235294F, 0F, 0F, 0F, 0F, 0F); // Box 848
		turretModel[130].setRotationPoint(-2F, -34.5F, -18F);

		turretModel[131].addShapeBox(-15F, -0.5F, 0F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 849
		turretModel[131].setRotationPoint(-23F, -37F, -15F);
		turretModel[131].rotateAngleZ = 0.20420352F;

		turretModel[132].addShapeBox(-15F, -0.5F, 0F, 12, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 850
		turretModel[132].setRotationPoint(-23F, -37F, -16F);
		turretModel[132].rotateAngleZ = 0.20420352F;

		turretModel[133].addShapeBox(-15F, -0.5F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 851
		turretModel[133].setRotationPoint(-23F, -37F, -11F);
		turretModel[133].rotateAngleZ = 0.20420352F;

		turretModel[134].addShapeBox(0F, -0.3F, 5F, 6, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 853
		turretModel[134].setRotationPoint(-29F, -37F, 2F);
		turretModel[134].rotateAngleX = -0.16580628F;
		turretModel[134].rotateAngleY = 0.05235988F;

		turretModel[135].addShapeBox(-1F, -0.3F, 5F, 1, 1, 11, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 854
		turretModel[135].setRotationPoint(-29F, -37F, 2F);
		turretModel[135].rotateAngleX = -0.16580628F;
		turretModel[135].rotateAngleY = 0.05235988F;

		turretModel[136].addShapeBox(5F, -0.3F, 5F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 855
		turretModel[136].setRotationPoint(-28F, -37F, 2F);
		turretModel[136].rotateAngleX = -0.16580628F;
		turretModel[136].rotateAngleY = 0.05235988F;

		turretModel[137].addShapeBox(1F, -1F, 5F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 864
		turretModel[137].setRotationPoint(-15F, -37F, 2F);
		turretModel[137].rotateAngleX = -0.16580628F;
		turretModel[137].rotateAngleY = -0.33161256F;

		turretModel[138].addShapeBox(-1F, -1F, 5F, 2, 1, 9, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 865
		turretModel[138].setRotationPoint(-15F, -37F, 2F);
		turretModel[138].rotateAngleX = -0.16580628F;
		turretModel[138].rotateAngleY = -0.33161256F;

		turretModel[139].addShapeBox(4.5F, -1F, 5F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 866
		turretModel[139].setRotationPoint(-15F, -37F, 2F);
		turretModel[139].rotateAngleX = -0.16580628F;
		turretModel[139].rotateAngleY = -0.33161256F;

		turretModel[140].addShapeBox(7.5F, -1F, 5F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 867
		turretModel[140].setRotationPoint(-15F, -37F, 2F);
		turretModel[140].rotateAngleX = -0.16580628F;
		turretModel[140].rotateAngleY = -0.33161256F;

		turretModel[141].addShapeBox(-3F, -1.5F, 7F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 868
		turretModel[141].setRotationPoint(-15F, -37F, 2F);
		turretModel[141].rotateAngleX = -0.16580628F;
		turretModel[141].rotateAngleY = -0.33161256F;

		turretModel[142].addShapeBox(-3F, -1.5F, 11F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 869
		turretModel[142].setRotationPoint(-15F, -37F, 2F);
		turretModel[142].rotateAngleX = -0.16580628F;
		turretModel[142].rotateAngleY = -0.33161256F;

		turretModel[143].addShapeBox(7.5F, -1.5F, 11F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 870
		turretModel[143].setRotationPoint(-15F, -37F, 2F);
		turretModel[143].rotateAngleX = -0.16580628F;
		turretModel[143].rotateAngleY = -0.33161256F;

		turretModel[144].addShapeBox(7.5F, -1.5F, 7F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 871
		turretModel[144].setRotationPoint(-15F, -37F, 2F);
		turretModel[144].rotateAngleX = -0.16580628F;
		turretModel[144].rotateAngleY = -0.33161256F;

		turretModel[145].addShapeBox(-2.5F, -1F, 6F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 876
		turretModel[145].setRotationPoint(-15F, -37F, 2F);
		turretModel[145].rotateAngleX = -0.16580628F;
		turretModel[145].rotateAngleY = -0.33161256F;

		turretModel[146].addShapeBox(10F, -1F, 6F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 877
		turretModel[146].setRotationPoint(-15F, -37F, 2F);
		turretModel[146].rotateAngleX = -0.16580628F;
		turretModel[146].rotateAngleY = -0.33161256F;

		turretModel[147].addShapeBox(9.5F, -1F, 5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 878
		turretModel[147].setRotationPoint(-11F, -37F, 2F);
		turretModel[147].rotateAngleX = -0.16580628F;
		turretModel[147].rotateAngleY = -0.33161256F;

		turretModel[148].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 885
		turretModel[148].setRotationPoint(5.5F, -35.8F, 11F);

		turretModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 886
		turretModel[149].setRotationPoint(4.5F, -35.8F, 11F);

		turretModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 887
		turretModel[150].setRotationPoint(8.5F, -35.8F, 11F);

		turretModel[151].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -0.5F, -0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 888
		turretModel[151].setRotationPoint(5.5F, -37.8F, 12F);

		turretModel[152].addShapeBox(-1F, 0F, -2F, 3, 2, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 889
		turretModel[152].setRotationPoint(35.5F, -27.5F, -14F);
		turretModel[152].rotateAngleY = -0.52359878F;

		turretModel[153].addShapeBox(2F, 0F, -2F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 890
		turretModel[153].setRotationPoint(35.5F, -27.5F, -14F);
		turretModel[153].rotateAngleY = -0.52359878F;

		turretModel[154].addShapeBox(3F, 2F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 891
		turretModel[154].setRotationPoint(35.5F, -27.5F, -14F);
		turretModel[154].rotateAngleY = -0.52359878F;

		turretModel[155].addShapeBox(3F, 2F, -1F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 892
		turretModel[155].setRotationPoint(35.5F, -27.5F, -14F);
		turretModel[155].rotateAngleY = -0.52359878F;

		turretModel[156].addShapeBox(3F, 2F, 1F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 893
		turretModel[156].setRotationPoint(35.5F, -27.5F, -14F);
		turretModel[156].rotateAngleY = -0.52359878F;

		turretModel[157].addShapeBox(3F, 0F, 0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 894
		turretModel[157].setRotationPoint(35.5F, -27.5F, -14F);
		turretModel[157].rotateAngleY = -0.52359878F;

		turretModel[158].addShapeBox(3F, 0F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 895
		turretModel[158].setRotationPoint(35.5F, -27.5F, -14F);
		turretModel[158].rotateAngleY = -0.52359878F;

		turretModel[159].addShapeBox(3F, 2F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 896
		turretModel[159].setRotationPoint(35.5F, -27.5F, 16F);
		turretModel[159].rotateAngleY = 0.52359878F;

		turretModel[160].addShapeBox(3F, 2F, -2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 897
		turretModel[160].setRotationPoint(35.5F, -27.5F, 16F);
		turretModel[160].rotateAngleY = 0.52359878F;

		turretModel[161].addShapeBox(3F, 0F, -1.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 898
		turretModel[161].setRotationPoint(35.5F, -27.5F, 16F);
		turretModel[161].rotateAngleY = 0.52359878F;

		turretModel[162].addShapeBox(3F, 0F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 899
		turretModel[162].setRotationPoint(35.5F, -27.5F, 16F);
		turretModel[162].rotateAngleY = 0.52359878F;

		turretModel[163].addShapeBox(3F, 2F, -1F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 900
		turretModel[163].setRotationPoint(35.5F, -27.5F, 16F);
		turretModel[163].rotateAngleY = 0.52359878F;

		turretModel[164].addShapeBox(-1F, 0F, -3F, 3, 2, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 901
		turretModel[164].setRotationPoint(35.5F, -27.5F, 16F);
		turretModel[164].rotateAngleY = 0.52359878F;

		turretModel[165].addShapeBox(2F, 0F, -3F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 902
		turretModel[165].setRotationPoint(35.5F, -27.5F, 16F);
		turretModel[165].rotateAngleY = 0.52359878F;

		turretModel[166].addShapeBox(0F, 0F, 0F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 903
		turretModel[166].setRotationPoint(24.5F, -28F, 23F);

		turretModel[167].addShapeBox(0F, 0F, 0F, 14, 4, 1, 0F,0F, -2F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 7F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 904
		turretModel[167].setRotationPoint(24.5F, -28F, 22F);

		turretModel[168].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 905
		turretModel[168].setRotationPoint(22.5F, -33F, 28F);

		turretModel[169].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 906
		turretModel[169].setRotationPoint(31.5F, -33F, 28F);

		turretModel[170].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 907
		turretModel[170].setRotationPoint(18.5F, -31F, 28F);

		turretModel[171].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 908
		turretModel[171].setRotationPoint(22.5F, -32F, 28F);

		turretModel[172].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 909
		turretModel[172].setRotationPoint(18.5F, -32F, 28F);

		turretModel[173].addShapeBox(0F, 0F, 0F, 14, 4, 1, 0F,0F, -5F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -7F, 0F, 1.5F, 7F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, -7F); // Box 910
		turretModel[173].setRotationPoint(24.5F, -31.5F, 22F);

		turretModel[174].addShapeBox(0F, 0F, 0F, 17, 4, 6, 0F,0F, -5F, 0F, 1F, -1F, -1F, -3F, 0F, 4F, 0F, -5F, -3F, 0F, 3F, 0F, 1F, -2F, -1F, -3F, -3F, 4F, 0F, 2F, -3F); // Box 911
		turretModel[174].setRotationPoint(24.5F, -31.5F, 12F);

		turretModel[175].addShapeBox(0F, 0F, 0F, 18, 4, 1, 0F,0F, -5F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, 2F, 3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, -1F); // Box 913
		turretModel[175].setRotationPoint(24.5F, -30.5F, 12F);

		turretModel[176].addShapeBox(0F, 0F, 0F, 18, 8, 1, 0F,0F, -5F, 3F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -5F, -3F, 0F, 2F, 3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, -3F); // Box 914
		turretModel[176].setRotationPoint(24.5F, -35.5F, 12F);

		turretModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, -10.5F, 0F, 0F, 10.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10.5F, 0F, 0F, 10.5F, 0F, 0F); // Box 916
		turretModel[177].setRotationPoint(32F, -31.4F, 11F);

		turretModel[178].addShapeBox(-2.5F, 0F, -9.5F, 5, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 917
		turretModel[178].setRotationPoint(-10F, -38F, -9F);

		turretModel[179].addShapeBox(-2.5F, -2F, -9.5F, 5, 2, 19, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 918
		turretModel[179].setRotationPoint(-10F, -38F, -9F);

		turretModel[180].addShapeBox(-2.5F, 0F, -9.5F, 5, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 919
		turretModel[180].setRotationPoint(-10F, -40.5F, -9F);

		turretModel[181].addShapeBox(-2.5F, 0F, -9.5F, 5, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 942
		turretModel[181].setRotationPoint(-10F, -38F, -9F);
		turretModel[181].rotateAngleY = -0.52359878F;

		turretModel[182].addShapeBox(-2.5F, -2F, -9.5F, 5, 2, 19, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 943
		turretModel[182].setRotationPoint(-10F, -38F, -9F);
		turretModel[182].rotateAngleY = -0.52359878F;

		turretModel[183].addShapeBox(-2.5F, 0F, -9.5F, 5, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 944
		turretModel[183].setRotationPoint(-10F, -40.5F, -9F);
		turretModel[183].rotateAngleY = -0.52359878F;

		turretModel[184].addShapeBox(-2.5F, 0F, -9.5F, 5, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 947
		turretModel[184].setRotationPoint(-10F, -38F, -9F);
		turretModel[184].rotateAngleY = -1.04719755F;

		turretModel[185].addShapeBox(-2.5F, -2F, -9.5F, 5, 2, 19, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 948
		turretModel[185].setRotationPoint(-10F, -38F, -9F);
		turretModel[185].rotateAngleY = -1.04719755F;

		turretModel[186].addShapeBox(-2.5F, 0F, -9.5F, 5, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 949
		turretModel[186].setRotationPoint(-10F, -40.5F, -9F);
		turretModel[186].rotateAngleY = -1.04719755F;

		turretModel[187].addShapeBox(-2.5F, 0F, -9.5F, 5, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 952
		turretModel[187].setRotationPoint(-10F, -38F, -9F);
		turretModel[187].rotateAngleY = -1.57079633F;

		turretModel[188].addShapeBox(-2.5F, -2F, -9.5F, 5, 2, 19, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 953
		turretModel[188].setRotationPoint(-10F, -38F, -9F);
		turretModel[188].rotateAngleY = -1.57079633F;

		turretModel[189].addShapeBox(-2.5F, 0F, -9.5F, 5, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 954
		turretModel[189].setRotationPoint(-10F, -40.5F, -9F);
		turretModel[189].rotateAngleY = -1.57079633F;

		turretModel[190].addShapeBox(-2.5F, 0F, -9.5F, 5, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 957
		turretModel[190].setRotationPoint(-10F, -38F, -9F);
		turretModel[190].rotateAngleY = -2.0943951F;

		turretModel[191].addShapeBox(-2.5F, -2F, -9.5F, 5, 2, 19, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 958
		turretModel[191].setRotationPoint(-10F, -38F, -9F);
		turretModel[191].rotateAngleY = -2.0943951F;

		turretModel[192].addShapeBox(-2.5F, 0F, -9.5F, 5, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 959
		turretModel[192].setRotationPoint(-10F, -40.5F, -9F);
		turretModel[192].rotateAngleY = -2.0943951F;

		turretModel[193].addShapeBox(-2.5F, 0F, -9.5F, 5, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		turretModel[193].setRotationPoint(-10F, -38F, -9F);
		turretModel[193].rotateAngleY = -2.61799388F;

		turretModel[194].addShapeBox(-2.5F, -2F, -9.5F, 5, 2, 19, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 963
		turretModel[194].setRotationPoint(-10F, -38F, -9F);
		turretModel[194].rotateAngleY = -2.61799388F;

		turretModel[195].addShapeBox(-2.5F, 0F, -9.5F, 5, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		turretModel[195].setRotationPoint(-10F, -40.5F, -9F);
		turretModel[195].rotateAngleY = -2.61799388F;

		turretModel[196].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 965
		turretModel[196].setRotationPoint(-14F, -41.5F, -14.5F);

		turretModel[197].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 966
		turretModel[197].setRotationPoint(-16F, -41.5F, -14.5F);

		turretModel[198].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 967
		turretModel[198].setRotationPoint(-10F, -41.5F, -14.5F);

		turretModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 970
		turretModel[199].setRotationPoint(-17.5F, -42F, -12F);

		turretModel[200].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 971
		turretModel[200].setRotationPoint(-18F, -42.5F, -11F);

		turretModel[201].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 972
		turretModel[201].setRotationPoint(-18F, -42.5F, -9F);

		turretModel[202].addShapeBox(0.5F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 921
		turretModel[202].setRotationPoint(-14F, -43.5F, -1.5F);
		turretModel[202].rotateAngleY = -0.29670597F;

		turretModel[203].addShapeBox(5.5F, 0F, 0F, 5, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 922
		turretModel[203].setRotationPoint(-14F, -43.5F, -1.5F);
		turretModel[203].rotateAngleY = -0.29670597F;

		turretModel[204].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 923
		turretModel[204].setRotationPoint(-7F, -44.5F, -13F);

		turretModel[205].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 924
		turretModel[205].setRotationPoint(-6F, -44.5F, -13F);

		turretModel[206].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 925
		turretModel[206].setRotationPoint(-6F, -44.5F, -9F);

		turretModel[207].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 926
		turretModel[207].setRotationPoint(-6F, -44.5F, -12F);

		turretModel[208].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 927
		turretModel[208].setRotationPoint(-6F, -43.5F, -12F);

		turretModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 928
		turretModel[209].setRotationPoint(-5F, -44.5F, -14F);

		turretModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 929
		turretModel[210].setRotationPoint(-5F, -42.5F, -14F);

		turretModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 930
		turretModel[211].setRotationPoint(-5F, -43.5F, -15.5F);

		turretModel[212].addShapeBox(0F, -0.5F, -5F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 932
		turretModel[212].setRotationPoint(-5F, -43.5F, -15.5F);
		turretModel[212].rotateAngleY = 1.15191731F;

		turretModel[213].addShapeBox(0F, -0.5F, -5F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 933
		turretModel[213].setRotationPoint(-5F, -44.5F, -15.5F);
		turretModel[213].rotateAngleY = 1.15191731F;

		turretModel[214].addShapeBox(0F, 3F, -5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 934
		turretModel[214].setRotationPoint(-5F, -44.5F, -15.5F);
		turretModel[214].rotateAngleY = 1.15191731F;

		turretModel[215].addShapeBox(0F, 0F, 0F, 16, 9, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 935
		turretModel[215].setRotationPoint(14F, -32.5F, -3F);

		turretModel[216].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0.1764706F, 0F, 0F, 0.1764706F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1.5F, -1F, 0F, 0F, -1F, 0F); // Box 1008
		turretModel[216].setRotationPoint(30F, -32.5F, -3F);

		turretModel[217].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0.1764706F, 0F, 0F, 0.1764706F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1.5F, -1F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 1009
		turretModel[217].setRotationPoint(30F, -32.5F, 2F);

		turretModel[218].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0.1764706F, 0F, 0F, 0.1764706F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1.5F, -1F, 0F, 1.5F, -1F, 0F, 0F, -1F, 0F); // Box 1010
		turretModel[218].setRotationPoint(30F, -32.5F, -1F);

		turretModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 1523
		turretModel[219].setRotationPoint(-29F, -36F, -26.5F);

		turretModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1524
		turretModel[220].setRotationPoint(-28F, -36F, -26.5F);

		turretModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 1525
		turretModel[221].setRotationPoint(-27F, -36F, -26.5F);

		turretModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.33F, 0F, -1F, -0.33F, 0F, -1F, -0.33F, 0F, -1F, -0.33F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1526
		turretModel[222].setRotationPoint(-28F, -38F, -26.5F);

		turretModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1F, 0F, -1F, 0.33F, 0F, -1F, 0.33F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 1527
		turretModel[223].setRotationPoint(-29F, -38F, -26.5F);

		turretModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0.33F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0.33F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 1528
		turretModel[224].setRotationPoint(-27F, -38F, -26.5F);

		turretModel[225].addTrapezoid(0F, 0F, 0F, 1, 3, 1, 0F, -0.30F, ModelRendererTurbo.MR_TOP); // Box 1529
		turretModel[225].setRotationPoint(-28F, -41F, -25.5F);

		turretModel[226].addShapeBox(0F, 0F, 0F, 1, 21, 1, 0F,-0.4F, 0F, -0.3F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 1530
		turretModel[226].setRotationPoint(-28F, -62F, -25.5F);

		turretModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1531
		turretModel[227].setRotationPoint(-33.5F, -35.5F, 18.5F);

		turretModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 1532
		turretModel[228].setRotationPoint(-34.5F, -35.5F, 18.5F);

		turretModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1F, 0F, -1F, 0.33F, 0F, -1F, 0.33F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 1533
		turretModel[229].setRotationPoint(-34.5F, -37.5F, 18.5F);

		turretModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.33F, 0F, -1F, -0.33F, 0F, -1F, -0.33F, 0F, -1F, -0.33F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1534
		turretModel[230].setRotationPoint(-33.5F, -37.5F, 18.5F);

		turretModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0.33F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0.33F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 1535
		turretModel[231].setRotationPoint(-32.5F, -37.5F, 18.5F);

		turretModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 1536
		turretModel[232].setRotationPoint(-32.5F, -35.5F, 18.5F);

		turretModel[233].addTrapezoid(0F, 0F, 0F, 1, 3, 1, 0F, -0.30F, ModelRendererTurbo.MR_TOP); // Box 1537
		turretModel[233].setRotationPoint(-33.5F, -40.5F, 19.5F);

		turretModel[234].addShapeBox(0F, 0F, 0F, 1, 21, 1, 0F,-0.4F, 0F, -0.3F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 1538
		turretModel[234].setRotationPoint(-33.5F, -61.5F, 19.5F);
	}

	private void initbarrelModel_1()
	{
		animBarrelModel[0] = new ModelRendererTurbo(this, 300, 0, textureX, textureY); // Box 937
		animBarrelModel[1] = new ModelRendererTurbo(this, 300, 10, textureX, textureY); // Box 940
		animBarrelModel[2] = new ModelRendererTurbo(this, 300, 20, textureX, textureY); // Box 955
		animBarrelModel[3] = new ModelRendererTurbo(this, 300, 35, textureX, textureY); // Box 958
		animBarrelModel[4] = new ModelRendererTurbo(this, 300, 61, textureX, textureY); // Box 962
		animBarrelModel[5] = new ModelRendererTurbo(this, 300, 61, textureX, textureY); // Box 965
		animBarrelModel[6] = new ModelRendererTurbo(this, 300, 61, textureX, textureY); // Box 968
		animBarrelModel[7] = new ModelRendererTurbo(this, 300, 61, textureX, textureY); // Box 971
		animBarrelModel[8] = new ModelRendererTurbo(this, 300, 61, textureX, textureY); // Box 974
		animBarrelModel[9] = new ModelRendererTurbo(this, 300, 61, textureX, textureY); // Box 977
		animBarrelModel[10] = new ModelRendererTurbo(this, 300, 61, textureX, textureY); // Box 980
		animBarrelModel[11] = new ModelRendererTurbo(this, 300, 35, textureX, textureY); // Box 983
		animBarrelModel[12] = new ModelRendererTurbo(this, 300, 71, textureX, textureY); // Box 986
		animBarrelModel[13] = new ModelRendererTurbo(this, 300, 35, textureX, textureY); // Box 989
		animBarrelModel[14] = new ModelRendererTurbo(this, 300, 61, textureX, textureY); // Box 992
		animBarrelModel[15] = new ModelRendererTurbo(this, 300, 61, textureX, textureY); // Box 995
		animBarrelModel[16] = new ModelRendererTurbo(this, 300, 61, textureX, textureY); // Box 998
		animBarrelModel[17] = new ModelRendererTurbo(this, 300, 61, textureX, textureY); // Box 1001
		animBarrelModel[18] = new ModelRendererTurbo(this, 300, 81, textureX, textureY); // Box 1003
		animBarrelModel[19] = new ModelRendererTurbo(this, 300, 84, textureX, textureY); // Box 1004
		animBarrelModel[20] = new ModelRendererTurbo(this, 300, 88, textureX, textureY); // Box 1005
		animBarrelModel[21] = new ModelRendererTurbo(this, 300, 94, textureX, textureY); // Box 1006
		animBarrelModel[22] = new ModelRendererTurbo(this, 300, 100, textureX, textureY); // Box 1007

		animBarrelModel[0].addShapeBox(0F, -1F, -3F, 9, 2, 6, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 937
		animBarrelModel[0].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[1].addShapeBox(10F, -1F, -3F, 6, 2, 6, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 940
		animBarrelModel[1].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[2].addShapeBox(9F, -1F, -2F, 89, 2, 4, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 955
		animBarrelModel[2].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[3].addShapeBox(17F, -1.5F, -2.5F, 2, 3, 5, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 958
		animBarrelModel[3].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[4].addShapeBox(21F, -1.5F, -2.5F, 1, 3, 5, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 962
		animBarrelModel[4].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[5].addShapeBox(25F, -1.5F, -2.5F, 1, 3, 5, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 965
		animBarrelModel[5].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[6].addShapeBox(30F, -1.5F, -2.5F, 1, 3, 5, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 968
		animBarrelModel[6].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[7].addShapeBox(34F, -1.5F, -2.5F, 1, 3, 5, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 971
		animBarrelModel[7].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[8].addShapeBox(39F, -1.5F, -2.5F, 1, 3, 5, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 974
		animBarrelModel[8].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[9].addShapeBox(43F, -1.5F, -2.5F, 1, 3, 5, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 977
		animBarrelModel[9].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[10].addShapeBox(48F, -1.5F, -2.5F, 1, 3, 5, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 980
		animBarrelModel[10].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[11].addShapeBox(54F, -1.5F, -2.5F, 2, 3, 5, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 983
		animBarrelModel[11].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[12].addShapeBox(59F, -1F, -3F, 12, 2, 6, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 986
		animBarrelModel[12].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[13].addShapeBox(72F, -1.5F, -2.5F, 2, 3, 5, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 989
		animBarrelModel[13].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[14].addShapeBox(78F, -1.5F, -2.5F, 1, 3, 5, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 992
		animBarrelModel[14].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[15].addShapeBox(83F, -1.5F, -2.5F, 1, 3, 5, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 995
		animBarrelModel[15].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[16].addShapeBox(87F, -1.5F, -2.5F, 1, 3, 5, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 998
		animBarrelModel[16].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[17].addShapeBox(92F, -1.5F, -2.5F, 1, 3, 5, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 1001
		animBarrelModel[17].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[18].addShapeBox(98F, -0.5F, -1.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1003
		animBarrelModel[18].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[19].addShapeBox(98F, -0.5F, 0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1004
		animBarrelModel[19].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[20].addShapeBox(98F, -1.5F, -1.5F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1005
		animBarrelModel[20].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[21].addShapeBox(98F, 0.5F, -1.5F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1006
		animBarrelModel[21].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[22].addShapeBox(98F, -2.5F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1007
		animBarrelModel[22].setRotationPoint(0F, 0F, 0F);

		
		barrelAttach = new Vector3f(29F/16F, 26.6F/16F, 0.5F/16F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 900, 68, textureX, textureY); // Box 1486
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 900, 68, textureX, textureY); // Box 1487
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 900, 68, textureX, textureY); // Box 1488
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 900, 86, textureX, textureY); // Box 1497
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 900, 86, textureX, textureY); // Box 1498
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 900, 86, textureX, textureY); // Box 1499

		leftTrackWheelModels[0].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1486
		leftTrackWheelModels[0].setRotationPoint(-62F, -5F, 21.5F);

		leftTrackWheelModels[1].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 1487
		leftTrackWheelModels[1].setRotationPoint(-62F, -5F, 21.5F);

		leftTrackWheelModels[2].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1488
		leftTrackWheelModels[2].setRotationPoint(-62F, -5F, 21.5F);

		leftTrackWheelModels[3].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1497
		leftTrackWheelModels[3].setRotationPoint(60F, -6F, 21.5F);

		leftTrackWheelModels[4].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1498
		leftTrackWheelModels[4].setRotationPoint(60F, -6F, 21.5F);

		leftTrackWheelModels[5].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 1499
		leftTrackWheelModels[5].setRotationPoint(60F, -6F, 21.5F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 900, 46, textureX, textureY); // Box 1446
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 900, 34, textureX, textureY); // Box 1447
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 900, 46, textureX, textureY); // Box 1448
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1449
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1450
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1451
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 900, 24, textureX, textureY); // Box 1452
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1453
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1454
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1455
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 900, 24, textureX, textureY); // Box 1456
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1457
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1458
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1459
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1546
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1547
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1549
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1550
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1551
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1552
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1553
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1554
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 900, 24, textureX, textureY); // Box 1555
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1556
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 900, 46, textureX, textureY); // Box 1557
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 900, 34, textureX, textureY); // Box 1558
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 900, 46, textureX, textureY); // Box 1559
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1560
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1561
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1563
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1564
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1565
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1566
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1567
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1568
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 900, 24, textureX, textureY); // Box 1569
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1570
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 900, 46, textureX, textureY); // Box 1571
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 900, 34, textureX, textureY); // Box 1572
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 900, 46, textureX, textureY); // Box 1573
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1574
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1575
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1577
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1578
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1579
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1580
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1581
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1582
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 900, 24, textureX, textureY); // Box 1583
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1584
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 900, 46, textureX, textureY); // Box 1585
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 900, 34, textureX, textureY); // Box 1586
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 900, 46, textureX, textureY); // Box 1587
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1588
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1589
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1591
		rightTrackWheelModels[56] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1592
		rightTrackWheelModels[57] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1593
		rightTrackWheelModels[58] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1594
		rightTrackWheelModels[59] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1595
		rightTrackWheelModels[60] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1596
		rightTrackWheelModels[61] = new ModelRendererTurbo(this, 900, 24, textureX, textureY); // Box 1597
		rightTrackWheelModels[62] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1598
		rightTrackWheelModels[63] = new ModelRendererTurbo(this, 900, 46, textureX, textureY); // Box 1599
		rightTrackWheelModels[64] = new ModelRendererTurbo(this, 900, 34, textureX, textureY); // Box 1600
		rightTrackWheelModels[65] = new ModelRendererTurbo(this, 900, 46, textureX, textureY); // Box 1601
		rightTrackWheelModels[66] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1602
		rightTrackWheelModels[67] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1603
		rightTrackWheelModels[68] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1605
		rightTrackWheelModels[69] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1606
		rightTrackWheelModels[70] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1607
		rightTrackWheelModels[71] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1608
		rightTrackWheelModels[72] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1609
		rightTrackWheelModels[73] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1610
		rightTrackWheelModels[74] = new ModelRendererTurbo(this, 900, 24, textureX, textureY); // Box 1611
		rightTrackWheelModels[75] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1612
		rightTrackWheelModels[76] = new ModelRendererTurbo(this, 900, 46, textureX, textureY); // Box 1613
		rightTrackWheelModels[77] = new ModelRendererTurbo(this, 900, 34, textureX, textureY); // Box 1614
		rightTrackWheelModels[78] = new ModelRendererTurbo(this, 900, 46, textureX, textureY); // Box 1615
		rightTrackWheelModels[79] = new ModelRendererTurbo(this, 900, 24, textureX, textureY); // Box 1700
		rightTrackWheelModels[80] = new ModelRendererTurbo(this, 900, 24, textureX, textureY); // Box 1701
		rightTrackWheelModels[81] = new ModelRendererTurbo(this, 900, 24, textureX, textureY); // Box 1702
		rightTrackWheelModels[82] = new ModelRendererTurbo(this, 900, 24, textureX, textureY); // Box 1703
		rightTrackWheelModels[83] = new ModelRendererTurbo(this, 900, 24, textureX, textureY); // Box 1704
		rightTrackWheelModels[84] = new ModelRendererTurbo(this, 900, 46, textureX, textureY); // Box 1705
		rightTrackWheelModels[85] = new ModelRendererTurbo(this, 900, 34, textureX, textureY); // Box 1706
		rightTrackWheelModels[86] = new ModelRendererTurbo(this, 900, 46, textureX, textureY); // Box 1707
		rightTrackWheelModels[87] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1708
		rightTrackWheelModels[88] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1709
		rightTrackWheelModels[89] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1710
		rightTrackWheelModels[90] = new ModelRendererTurbo(this, 900, 24, textureX, textureY); // Box 1711
		rightTrackWheelModels[91] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1712
		rightTrackWheelModels[92] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1713
		rightTrackWheelModels[93] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1714
		rightTrackWheelModels[94] = new ModelRendererTurbo(this, 900, 24, textureX, textureY); // Box 1715
		rightTrackWheelModels[95] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1716
		rightTrackWheelModels[96] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1717
		rightTrackWheelModels[97] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1718
		rightTrackWheelModels[98] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1719
		rightTrackWheelModels[99] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1720
		rightTrackWheelModels[100] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1721
		rightTrackWheelModels[101] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1722
		rightTrackWheelModels[102] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1723
		rightTrackWheelModels[103] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1724
		rightTrackWheelModels[104] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1725
		rightTrackWheelModels[105] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1726
		rightTrackWheelModels[106] = new ModelRendererTurbo(this, 900, 24, textureX, textureY); // Box 1727
		rightTrackWheelModels[107] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1728
		rightTrackWheelModels[108] = new ModelRendererTurbo(this, 900, 46, textureX, textureY); // Box 1729
		rightTrackWheelModels[109] = new ModelRendererTurbo(this, 900, 34, textureX, textureY); // Box 1730
		rightTrackWheelModels[110] = new ModelRendererTurbo(this, 900, 46, textureX, textureY); // Box 1731
		rightTrackWheelModels[111] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1732
		rightTrackWheelModels[112] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1733
		rightTrackWheelModels[113] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1734
		rightTrackWheelModels[114] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1735
		rightTrackWheelModels[115] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1736
		rightTrackWheelModels[116] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1737
		rightTrackWheelModels[117] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1738
		rightTrackWheelModels[118] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1739
		rightTrackWheelModels[119] = new ModelRendererTurbo(this, 900, 24, textureX, textureY); // Box 1740
		rightTrackWheelModels[120] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1741
		rightTrackWheelModels[121] = new ModelRendererTurbo(this, 900, 46, textureX, textureY); // Box 1742
		rightTrackWheelModels[122] = new ModelRendererTurbo(this, 900, 34, textureX, textureY); // Box 1743
		rightTrackWheelModels[123] = new ModelRendererTurbo(this, 900, 46, textureX, textureY); // Box 1744
		rightTrackWheelModels[124] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1745
		rightTrackWheelModels[125] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1746
		rightTrackWheelModels[126] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1747
		rightTrackWheelModels[127] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1748
		rightTrackWheelModels[128] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1749
		rightTrackWheelModels[129] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1750
		rightTrackWheelModels[130] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1751
		rightTrackWheelModels[131] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1752
		rightTrackWheelModels[132] = new ModelRendererTurbo(this, 900, 24, textureX, textureY); // Box 1753
		rightTrackWheelModels[133] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1754
		rightTrackWheelModels[134] = new ModelRendererTurbo(this, 900, 46, textureX, textureY); // Box 1755
		rightTrackWheelModels[135] = new ModelRendererTurbo(this, 900, 34, textureX, textureY); // Box 1756
		rightTrackWheelModels[136] = new ModelRendererTurbo(this, 900, 46, textureX, textureY); // Box 1757
		rightTrackWheelModels[137] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1758
		rightTrackWheelModels[138] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1759
		rightTrackWheelModels[139] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1760
		rightTrackWheelModels[140] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1761
		rightTrackWheelModels[141] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1762
		rightTrackWheelModels[142] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1763
		rightTrackWheelModels[143] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1764
		rightTrackWheelModels[144] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1765
		rightTrackWheelModels[145] = new ModelRendererTurbo(this, 900, 24, textureX, textureY); // Box 1766
		rightTrackWheelModels[146] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1767
		rightTrackWheelModels[147] = new ModelRendererTurbo(this, 900, 46, textureX, textureY); // Box 1768
		rightTrackWheelModels[148] = new ModelRendererTurbo(this, 900, 34, textureX, textureY); // Box 1769
		rightTrackWheelModels[149] = new ModelRendererTurbo(this, 900, 46, textureX, textureY); // Box 1770
		rightTrackWheelModels[150] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1771
		rightTrackWheelModels[151] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1772
		rightTrackWheelModels[152] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1773
		rightTrackWheelModels[153] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1774
		rightTrackWheelModels[154] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1775
		rightTrackWheelModels[155] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1776
		rightTrackWheelModels[156] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1777
		rightTrackWheelModels[157] = new ModelRendererTurbo(this, 900, 0, textureX, textureY); // Box 1778
		rightTrackWheelModels[158] = new ModelRendererTurbo(this, 900, 24, textureX, textureY); // Box 1779
		rightTrackWheelModels[159] = new ModelRendererTurbo(this, 900, 12, textureX, textureY); // Box 1780
		rightTrackWheelModels[160] = new ModelRendererTurbo(this, 900, 46, textureX, textureY); // Box 1781
		rightTrackWheelModels[161] = new ModelRendererTurbo(this, 900, 34, textureX, textureY); // Box 1782
		rightTrackWheelModels[162] = new ModelRendererTurbo(this, 900, 46, textureX, textureY); // Box 1783
		rightTrackWheelModels[163] = new ModelRendererTurbo(this, 900, 24, textureX, textureY); // Box 1784
		rightTrackWheelModels[164] = new ModelRendererTurbo(this, 900, 24, textureX, textureY); // Box 1785
		rightTrackWheelModels[165] = new ModelRendererTurbo(this, 900, 24, textureX, textureY); // Box 1786
		rightTrackWheelModels[166] = new ModelRendererTurbo(this, 900, 24, textureX, textureY); // Box 1787
		rightTrackWheelModels[167] = new ModelRendererTurbo(this, 900, 24, textureX, textureY); // Box 1788
		rightTrackWheelModels[168] = new ModelRendererTurbo(this, 900, 68, textureX, textureY); // Box 1483
		rightTrackWheelModels[169] = new ModelRendererTurbo(this, 900, 68, textureX, textureY); // Box 1484
		rightTrackWheelModels[170] = new ModelRendererTurbo(this, 900, 68, textureX, textureY); // Box 1485
		rightTrackWheelModels[171] = new ModelRendererTurbo(this, 900, 86, textureX, textureY); // Box 1493
		rightTrackWheelModels[172] = new ModelRendererTurbo(this, 900, 86, textureX, textureY); // Box 1495
		rightTrackWheelModels[173] = new ModelRendererTurbo(this, 900, 86, textureX, textureY); // Box 1496

		rightTrackWheelModels[0].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1446
		rightTrackWheelModels[0].setRotationPoint(43F, 1F, -28.5F);

		rightTrackWheelModels[1].addShapeBox(-2.5F, -1.5F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1447
		rightTrackWheelModels[1].setRotationPoint(43F, 1F, -28.5F);

		rightTrackWheelModels[2].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1448
		rightTrackWheelModels[2].setRotationPoint(43F, 1F, -28.5F);

		rightTrackWheelModels[3].addShapeBox(-6F, -2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1449
		rightTrackWheelModels[3].setRotationPoint(43F, 1F, -27.5F);

		rightTrackWheelModels[4].addShapeBox(-6F, -6F, 0F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1450
		rightTrackWheelModels[4].setRotationPoint(43F, 1F, -27.5F);

		rightTrackWheelModels[5].addShapeBox(-6F, 2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 1451
		rightTrackWheelModels[5].setRotationPoint(43F, 1F, -27.5F);

		rightTrackWheelModels[6].addShapeBox(-2F, 6F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 5F, 1F, 0F, 5F); // Box 1452
		rightTrackWheelModels[6].setRotationPoint(43F, 1F, -29.5F);

		rightTrackWheelModels[7].addShapeBox(-8F, 2F, 0F, 2, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, 5F, -5F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 5F, -5F, 2F, 5F); // Box 1453
		rightTrackWheelModels[7].setRotationPoint(43F, 1F, -29.5F);

		rightTrackWheelModels[8].addShapeBox(-8F, -2F, 0F, 2, 4, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, 5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, 5F); // Box 1454
		rightTrackWheelModels[8].setRotationPoint(43F, 1F, -29.5F);

		rightTrackWheelModels[9].addShapeBox(-8F, -6F, 0F, 2, 4, 3, 0F,-5F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 5F, -5F, 2F, 5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, 5F); // Box 1455
		rightTrackWheelModels[9].setRotationPoint(43F, 1F, -29.5F);

		rightTrackWheelModels[10].addShapeBox(-2F, -8F, 0F, 4, 2, 3, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 5F, 1F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 1456
		rightTrackWheelModels[10].setRotationPoint(43F, 1F, -29.5F);

		rightTrackWheelModels[11].addShapeBox(6F, -6F, 0F, 2, 4, 3, 0F,4F, 0F, 0F, -5F, 2F, 0F, -5F, 2F, 5F, 4F, 0F, 5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 5F, 0F, 0F, 5F); // Box 1457
		rightTrackWheelModels[11].setRotationPoint(43F, 1F, -29.5F);

		rightTrackWheelModels[12].addShapeBox(6F, -2F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 5F, 0F, 0F, 5F); // Box 1458
		rightTrackWheelModels[12].setRotationPoint(43F, 1F, -29.5F);

		rightTrackWheelModels[13].addShapeBox(6F, 2F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 5F, 0F, 0F, 5F, 4F, 0F, 0F, -5F, 2F, 0F, -5F, 2F, 5F, 4F, 0F, 5F); // Box 1459
		rightTrackWheelModels[13].setRotationPoint(43F, 1F, -29.5F);

		rightTrackWheelModels[14].addShapeBox(-8F, -2F, 0F, 2, 4, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, 5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, 5F); // Box 1546
		rightTrackWheelModels[14].setRotationPoint(25F, 1F, -29.5F);

		rightTrackWheelModels[15].addShapeBox(-8F, -6F, 0F, 2, 4, 3, 0F,-5F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 5F, -5F, 2F, 5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, 5F); // Box 1547
		rightTrackWheelModels[15].setRotationPoint(25F, 1F, -29.5F);

		rightTrackWheelModels[16].addShapeBox(6F, -6F, 0F, 2, 4, 3, 0F,4F, 0F, 0F, -5F, 2F, 0F, -5F, 2F, 5F, 4F, 0F, 5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 5F, 0F, 0F, 5F); // Box 1549
		rightTrackWheelModels[16].setRotationPoint(25F, 1F, -29.5F);

		rightTrackWheelModels[17].addShapeBox(6F, -2F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 5F, 0F, 0F, 5F); // Box 1550
		rightTrackWheelModels[17].setRotationPoint(25F, 1F, -29.5F);

		rightTrackWheelModels[18].addShapeBox(6F, 2F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 5F, 0F, 0F, 5F, 4F, 0F, 0F, -5F, 2F, 0F, -5F, 2F, 5F, 4F, 0F, 5F); // Box 1551
		rightTrackWheelModels[18].setRotationPoint(25F, 1F, -29.5F);

		rightTrackWheelModels[19].addShapeBox(-6F, 2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 1552
		rightTrackWheelModels[19].setRotationPoint(25F, 1F, -27.5F);

		rightTrackWheelModels[20].addShapeBox(-6F, -2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1553
		rightTrackWheelModels[20].setRotationPoint(25F, 1F, -27.5F);

		rightTrackWheelModels[21].addShapeBox(-6F, -6F, 0F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1554
		rightTrackWheelModels[21].setRotationPoint(25F, 1F, -27.5F);

		rightTrackWheelModels[22].addShapeBox(-2F, 6F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 5F, 1F, 0F, 5F); // Box 1555
		rightTrackWheelModels[22].setRotationPoint(25F, 1F, -29.5F);

		rightTrackWheelModels[23].addShapeBox(-8F, 2F, 0F, 2, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, 5F, -5F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 5F, -5F, 2F, 5F); // Box 1556
		rightTrackWheelModels[23].setRotationPoint(25F, 1F, -29.5F);

		rightTrackWheelModels[24].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1557
		rightTrackWheelModels[24].setRotationPoint(25F, 1F, -28.5F);

		rightTrackWheelModels[25].addShapeBox(-2.5F, -1.5F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1558
		rightTrackWheelModels[25].setRotationPoint(25F, 1F, -28.5F);

		rightTrackWheelModels[26].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1559
		rightTrackWheelModels[26].setRotationPoint(25F, 1F, -28.5F);

		rightTrackWheelModels[27].addShapeBox(-8F, -2F, 0F, 2, 4, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, 5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, 5F); // Box 1560
		rightTrackWheelModels[27].setRotationPoint(7F, 1F, -29.5F);

		rightTrackWheelModels[28].addShapeBox(-8F, -6F, 0F, 2, 4, 3, 0F,-5F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 5F, -5F, 2F, 5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, 5F); // Box 1561
		rightTrackWheelModels[28].setRotationPoint(7F, 1F, -29.5F);

		rightTrackWheelModels[29].addShapeBox(6F, -6F, 0F, 2, 4, 3, 0F,4F, 0F, 0F, -5F, 2F, 0F, -5F, 2F, 5F, 4F, 0F, 5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 5F, 0F, 0F, 5F); // Box 1563
		rightTrackWheelModels[29].setRotationPoint(7F, 1F, -29.5F);

		rightTrackWheelModels[30].addShapeBox(6F, -2F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 5F, 0F, 0F, 5F); // Box 1564
		rightTrackWheelModels[30].setRotationPoint(7F, 1F, -29.5F);

		rightTrackWheelModels[31].addShapeBox(6F, 2F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 5F, 0F, 0F, 5F, 4F, 0F, 0F, -5F, 2F, 0F, -5F, 2F, 5F, 4F, 0F, 5F); // Box 1565
		rightTrackWheelModels[31].setRotationPoint(7F, 1F, -29.5F);

		rightTrackWheelModels[32].addShapeBox(-6F, 2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 1566
		rightTrackWheelModels[32].setRotationPoint(7F, 1F, -27.5F);

		rightTrackWheelModels[33].addShapeBox(-6F, -2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1567
		rightTrackWheelModels[33].setRotationPoint(7F, 1F, -27.5F);

		rightTrackWheelModels[34].addShapeBox(-6F, -6F, 0F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1568
		rightTrackWheelModels[34].setRotationPoint(7F, 1F, -27.5F);

		rightTrackWheelModels[35].addShapeBox(-2F, 6F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 5F, 1F, 0F, 5F); // Box 1569
		rightTrackWheelModels[35].setRotationPoint(7F, 1F, -29.5F);

		rightTrackWheelModels[36].addShapeBox(-8F, 2F, 0F, 2, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, 5F, -5F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 5F, -5F, 2F, 5F); // Box 1570
		rightTrackWheelModels[36].setRotationPoint(7F, 1F, -29.5F);

		rightTrackWheelModels[37].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1571
		rightTrackWheelModels[37].setRotationPoint(7F, 1F, -28.5F);

		rightTrackWheelModels[38].addShapeBox(-2.5F, -1.5F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1572
		rightTrackWheelModels[38].setRotationPoint(7F, 1F, -28.5F);

		rightTrackWheelModels[39].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1573
		rightTrackWheelModels[39].setRotationPoint(7F, 1F, -28.5F);

		rightTrackWheelModels[40].addShapeBox(-8F, -2F, 0F, 2, 4, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, 5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, 5F); // Box 1574
		rightTrackWheelModels[40].setRotationPoint(-11F, 1F, -29.5F);

		rightTrackWheelModels[41].addShapeBox(-8F, -6F, 0F, 2, 4, 3, 0F,-5F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 5F, -5F, 2F, 5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, 5F); // Box 1575
		rightTrackWheelModels[41].setRotationPoint(-11F, 1F, -29.5F);

		rightTrackWheelModels[42].addShapeBox(6F, -6F, 0F, 2, 4, 3, 0F,4F, 0F, 0F, -5F, 2F, 0F, -5F, 2F, 5F, 4F, 0F, 5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 5F, 0F, 0F, 5F); // Box 1577
		rightTrackWheelModels[42].setRotationPoint(-11F, 1F, -29.5F);

		rightTrackWheelModels[43].addShapeBox(6F, -2F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 5F, 0F, 0F, 5F); // Box 1578
		rightTrackWheelModels[43].setRotationPoint(-11F, 1F, -29.5F);

		rightTrackWheelModels[44].addShapeBox(6F, 2F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 5F, 0F, 0F, 5F, 4F, 0F, 0F, -5F, 2F, 0F, -5F, 2F, 5F, 4F, 0F, 5F); // Box 1579
		rightTrackWheelModels[44].setRotationPoint(-11F, 1F, -29.5F);

		rightTrackWheelModels[45].addShapeBox(-6F, 2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 1580
		rightTrackWheelModels[45].setRotationPoint(-11F, 1F, -27.5F);

		rightTrackWheelModels[46].addShapeBox(-6F, -2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1581
		rightTrackWheelModels[46].setRotationPoint(-11F, 1F, -27.5F);

		rightTrackWheelModels[47].addShapeBox(-6F, -6F, 0F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1582
		rightTrackWheelModels[47].setRotationPoint(-11F, 1F, -27.5F);

		rightTrackWheelModels[48].addShapeBox(-2F, 6F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 5F, 1F, 0F, 5F); // Box 1583
		rightTrackWheelModels[48].setRotationPoint(-11F, 1F, -29.5F);

		rightTrackWheelModels[49].addShapeBox(-8F, 2F, 0F, 2, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, 5F, -5F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 5F, -5F, 2F, 5F); // Box 1584
		rightTrackWheelModels[49].setRotationPoint(-11F, 1F, -29.5F);

		rightTrackWheelModels[50].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1585
		rightTrackWheelModels[50].setRotationPoint(-11F, 1F, -28.5F);

		rightTrackWheelModels[51].addShapeBox(-2.5F, -1.5F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1586
		rightTrackWheelModels[51].setRotationPoint(-11F, 1F, -28.5F);

		rightTrackWheelModels[52].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1587
		rightTrackWheelModels[52].setRotationPoint(-11F, 1F, -28.5F);

		rightTrackWheelModels[53].addShapeBox(-8F, -2F, 0F, 2, 4, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, 5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, 5F); // Box 1588
		rightTrackWheelModels[53].setRotationPoint(-29F, 1F, -29.5F);

		rightTrackWheelModels[54].addShapeBox(-8F, -6F, 0F, 2, 4, 3, 0F,-5F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 5F, -5F, 2F, 5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, 5F); // Box 1589
		rightTrackWheelModels[54].setRotationPoint(-29F, 1F, -29.5F);

		rightTrackWheelModels[55].addShapeBox(6F, -6F, 0F, 2, 4, 3, 0F,4F, 0F, 0F, -5F, 2F, 0F, -5F, 2F, 5F, 4F, 0F, 5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 5F, 0F, 0F, 5F); // Box 1591
		rightTrackWheelModels[55].setRotationPoint(-29F, 1F, -29.5F);

		rightTrackWheelModels[56].addShapeBox(6F, -2F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 5F, 0F, 0F, 5F); // Box 1592
		rightTrackWheelModels[56].setRotationPoint(-29F, 1F, -29.5F);

		rightTrackWheelModels[57].addShapeBox(6F, 2F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 5F, 0F, 0F, 5F, 4F, 0F, 0F, -5F, 2F, 0F, -5F, 2F, 5F, 4F, 0F, 5F); // Box 1593
		rightTrackWheelModels[57].setRotationPoint(-29F, 1F, -29.5F);

		rightTrackWheelModels[58].addShapeBox(-6F, 2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 1594
		rightTrackWheelModels[58].setRotationPoint(-29F, 1F, -27.5F);

		rightTrackWheelModels[59].addShapeBox(-6F, -2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1595
		rightTrackWheelModels[59].setRotationPoint(-29F, 1F, -27.5F);

		rightTrackWheelModels[60].addShapeBox(-6F, -6F, 0F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1596
		rightTrackWheelModels[60].setRotationPoint(-29F, 1F, -27.5F);

		rightTrackWheelModels[61].addShapeBox(-2F, 6F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 5F, 1F, 0F, 5F); // Box 1597
		rightTrackWheelModels[61].setRotationPoint(-29F, 1F, -29.5F);

		rightTrackWheelModels[62].addShapeBox(-8F, 2F, 0F, 2, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, 5F, -5F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 5F, -5F, 2F, 5F); // Box 1598
		rightTrackWheelModels[62].setRotationPoint(-29F, 1F, -29.5F);

		rightTrackWheelModels[63].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1599
		rightTrackWheelModels[63].setRotationPoint(-29F, 1F, -28.5F);

		rightTrackWheelModels[64].addShapeBox(-2.5F, -1.5F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1600
		rightTrackWheelModels[64].setRotationPoint(-29F, 1F, -28.5F);

		rightTrackWheelModels[65].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1601
		rightTrackWheelModels[65].setRotationPoint(-29F, 1F, -28.5F);

		rightTrackWheelModels[66].addShapeBox(-8F, -2F, 0F, 2, 4, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, 5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, 5F); // Box 1602
		rightTrackWheelModels[66].setRotationPoint(-47F, 1F, -29.5F);

		rightTrackWheelModels[67].addShapeBox(-8F, -6F, 0F, 2, 4, 3, 0F,-5F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 5F, -5F, 2F, 5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, 5F); // Box 1603
		rightTrackWheelModels[67].setRotationPoint(-47F, 1F, -29.5F);

		rightTrackWheelModels[68].addShapeBox(6F, -6F, 0F, 2, 4, 3, 0F,4F, 0F, 0F, -5F, 2F, 0F, -5F, 2F, 5F, 4F, 0F, 5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 5F, 0F, 0F, 5F); // Box 1605
		rightTrackWheelModels[68].setRotationPoint(-47F, 1F, -29.5F);

		rightTrackWheelModels[69].addShapeBox(6F, -2F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 5F, 0F, 0F, 5F); // Box 1606
		rightTrackWheelModels[69].setRotationPoint(-47F, 1F, -29.5F);

		rightTrackWheelModels[70].addShapeBox(6F, 2F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 5F, 0F, 0F, 5F, 4F, 0F, 0F, -5F, 2F, 0F, -5F, 2F, 5F, 4F, 0F, 5F); // Box 1607
		rightTrackWheelModels[70].setRotationPoint(-47F, 1F, -29.5F);

		rightTrackWheelModels[71].addShapeBox(-6F, 2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 1608
		rightTrackWheelModels[71].setRotationPoint(-47F, 1F, -27.5F);

		rightTrackWheelModels[72].addShapeBox(-6F, -2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1609
		rightTrackWheelModels[72].setRotationPoint(-47F, 1F, -27.5F);

		rightTrackWheelModels[73].addShapeBox(-6F, -6F, 0F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1610
		rightTrackWheelModels[73].setRotationPoint(-47F, 1F, -27.5F);

		rightTrackWheelModels[74].addShapeBox(-2F, 6F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 5F, 1F, 0F, 5F); // Box 1611
		rightTrackWheelModels[74].setRotationPoint(-47F, 1F, -29.5F);

		rightTrackWheelModels[75].addShapeBox(-8F, 2F, 0F, 2, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, 5F, -5F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 5F, -5F, 2F, 5F); // Box 1612
		rightTrackWheelModels[75].setRotationPoint(-47F, 1F, -29.5F);

		rightTrackWheelModels[76].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1613
		rightTrackWheelModels[76].setRotationPoint(-47F, 1F, -28.5F);

		rightTrackWheelModels[77].addShapeBox(-2.5F, -1.5F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1614
		rightTrackWheelModels[77].setRotationPoint(-47F, 1F, -28.5F);

		rightTrackWheelModels[78].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1615
		rightTrackWheelModels[78].setRotationPoint(-47F, 1F, -28.5F);

		rightTrackWheelModels[79].addShapeBox(-2F, -8F, 0F, 4, 2, 3, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 5F, 1F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 1700
		rightTrackWheelModels[79].setRotationPoint(25F, 1F, -29.5F);

		rightTrackWheelModels[80].addShapeBox(-2F, -8F, 0F, 4, 2, 3, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 5F, 1F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 1701
		rightTrackWheelModels[80].setRotationPoint(7F, 1F, -29.5F);

		rightTrackWheelModels[81].addShapeBox(-2F, -8F, 0F, 4, 2, 3, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 5F, 1F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 1702
		rightTrackWheelModels[81].setRotationPoint(-11F, 1F, -29.5F);

		rightTrackWheelModels[82].addShapeBox(-2F, -8F, 0F, 4, 2, 3, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 5F, 1F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 1703
		rightTrackWheelModels[82].setRotationPoint(-29F, 1F, -29.5F);

		rightTrackWheelModels[83].addShapeBox(-2F, -8F, 0F, 4, 2, 3, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 5F, 1F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 1704
		rightTrackWheelModels[83].setRotationPoint(-47F, 1F, -29.5F);

		rightTrackWheelModels[84].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1705
		rightTrackWheelModels[84].setRotationPoint(43F, 1F, 21.5F);

		rightTrackWheelModels[85].addShapeBox(-2.5F, -1.5F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1706
		rightTrackWheelModels[85].setRotationPoint(43F, 1F, 21.5F);

		rightTrackWheelModels[86].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1707
		rightTrackWheelModels[86].setRotationPoint(43F, 1F, 21.5F);

		rightTrackWheelModels[87].addShapeBox(-6F, -2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1708
		rightTrackWheelModels[87].setRotationPoint(43F, 1F, 22.5F);

		rightTrackWheelModels[88].addShapeBox(-6F, -6F, 0F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1709
		rightTrackWheelModels[88].setRotationPoint(43F, 1F, 22.5F);

		rightTrackWheelModels[89].addShapeBox(-6F, 2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 1710
		rightTrackWheelModels[89].setRotationPoint(43F, 1F, 22.5F);

		rightTrackWheelModels[90].addShapeBox(-2F, 6F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 5F, 1F, 0F, 5F); // Box 1711
		rightTrackWheelModels[90].setRotationPoint(43F, 1F, 20.5F);

		rightTrackWheelModels[91].addShapeBox(-8F, 2F, 0F, 2, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, 5F, -5F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 5F, -5F, 2F, 5F); // Box 1712
		rightTrackWheelModels[91].setRotationPoint(43F, 1F, 20.5F);

		rightTrackWheelModels[92].addShapeBox(-8F, -2F, 0F, 2, 4, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, 5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, 5F); // Box 1713
		rightTrackWheelModels[92].setRotationPoint(43F, 1F, 20.5F);

		rightTrackWheelModels[93].addShapeBox(-8F, -6F, 0F, 2, 4, 3, 0F,-5F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 5F, -5F, 2F, 5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, 5F); // Box 1714
		rightTrackWheelModels[93].setRotationPoint(43F, 1F, 20.5F);

		rightTrackWheelModels[94].addShapeBox(-2F, -8F, 0F, 4, 2, 3, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 5F, 1F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 1715
		rightTrackWheelModels[94].setRotationPoint(43F, 1F, 20.5F);

		rightTrackWheelModels[95].addShapeBox(6F, -6F, 0F, 2, 4, 3, 0F,4F, 0F, 0F, -5F, 2F, 0F, -5F, 2F, 5F, 4F, 0F, 5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 5F, 0F, 0F, 5F); // Box 1716
		rightTrackWheelModels[95].setRotationPoint(43F, 1F, 20.5F);

		rightTrackWheelModels[96].addShapeBox(6F, -2F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 5F, 0F, 0F, 5F); // Box 1717
		rightTrackWheelModels[96].setRotationPoint(43F, 1F, 20.5F);

		rightTrackWheelModels[97].addShapeBox(6F, 2F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 5F, 0F, 0F, 5F, 4F, 0F, 0F, -5F, 2F, 0F, -5F, 2F, 5F, 4F, 0F, 5F); // Box 1718
		rightTrackWheelModels[97].setRotationPoint(43F, 1F, 20.5F);

		rightTrackWheelModels[98].addShapeBox(-8F, -2F, 0F, 2, 4, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, 5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, 5F); // Box 1719
		rightTrackWheelModels[98].setRotationPoint(25F, 1F, 20.5F);

		rightTrackWheelModels[99].addShapeBox(-8F, -6F, 0F, 2, 4, 3, 0F,-5F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 5F, -5F, 2F, 5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, 5F); // Box 1720
		rightTrackWheelModels[99].setRotationPoint(25F, 1F, 20.5F);

		rightTrackWheelModels[100].addShapeBox(6F, -6F, 0F, 2, 4, 3, 0F,4F, 0F, 0F, -5F, 2F, 0F, -5F, 2F, 5F, 4F, 0F, 5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 5F, 0F, 0F, 5F); // Box 1721
		rightTrackWheelModels[100].setRotationPoint(25F, 1F, 20.5F);

		rightTrackWheelModels[101].addShapeBox(6F, -2F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 5F, 0F, 0F, 5F); // Box 1722
		rightTrackWheelModels[101].setRotationPoint(25F, 1F, 20.5F);

		rightTrackWheelModels[102].addShapeBox(6F, 2F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 5F, 0F, 0F, 5F, 4F, 0F, 0F, -5F, 2F, 0F, -5F, 2F, 5F, 4F, 0F, 5F); // Box 1723
		rightTrackWheelModels[102].setRotationPoint(25F, 1F, 20.5F);

		rightTrackWheelModels[103].addShapeBox(-6F, 2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 1724
		rightTrackWheelModels[103].setRotationPoint(25F, 1F, 22.5F);

		rightTrackWheelModels[104].addShapeBox(-6F, -2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1725
		rightTrackWheelModels[104].setRotationPoint(25F, 1F, 22.5F);

		rightTrackWheelModels[105].addShapeBox(-6F, -6F, 0F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1726
		rightTrackWheelModels[105].setRotationPoint(25F, 1F, 22.5F);

		rightTrackWheelModels[106].addShapeBox(-2F, 6F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 5F, 1F, 0F, 5F); // Box 1727
		rightTrackWheelModels[106].setRotationPoint(25F, 1F, 20.5F);

		rightTrackWheelModels[107].addShapeBox(-8F, 2F, 0F, 2, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, 5F, -5F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 5F, -5F, 2F, 5F); // Box 1728
		rightTrackWheelModels[107].setRotationPoint(25F, 1F, 20.5F);

		rightTrackWheelModels[108].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1729
		rightTrackWheelModels[108].setRotationPoint(25F, 1F, 21.5F);

		rightTrackWheelModels[109].addShapeBox(-2.5F, -1.5F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1730
		rightTrackWheelModels[109].setRotationPoint(25F, 1F, 21.5F);

		rightTrackWheelModels[110].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1731
		rightTrackWheelModels[110].setRotationPoint(25F, 1F, 21.5F);

		rightTrackWheelModels[111].addShapeBox(-8F, -2F, 0F, 2, 4, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, 5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, 5F); // Box 1732
		rightTrackWheelModels[111].setRotationPoint(7F, 1F, 20.5F);

		rightTrackWheelModels[112].addShapeBox(-8F, -6F, 0F, 2, 4, 3, 0F,-5F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 5F, -5F, 2F, 5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, 5F); // Box 1733
		rightTrackWheelModels[112].setRotationPoint(7F, 1F, 20.5F);

		rightTrackWheelModels[113].addShapeBox(6F, -6F, 0F, 2, 4, 3, 0F,4F, 0F, 0F, -5F, 2F, 0F, -5F, 2F, 5F, 4F, 0F, 5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 5F, 0F, 0F, 5F); // Box 1734
		rightTrackWheelModels[113].setRotationPoint(7F, 1F, 20.5F);

		rightTrackWheelModels[114].addShapeBox(6F, -2F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 5F, 0F, 0F, 5F); // Box 1735
		rightTrackWheelModels[114].setRotationPoint(7F, 1F, 20.5F);

		rightTrackWheelModels[115].addShapeBox(6F, 2F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 5F, 0F, 0F, 5F, 4F, 0F, 0F, -5F, 2F, 0F, -5F, 2F, 5F, 4F, 0F, 5F); // Box 1736
		rightTrackWheelModels[115].setRotationPoint(7F, 1F, 20.5F);

		rightTrackWheelModels[116].addShapeBox(-6F, 2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 1737
		rightTrackWheelModels[116].setRotationPoint(7F, 1F, 22.5F);

		rightTrackWheelModels[117].addShapeBox(-6F, -2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1738
		rightTrackWheelModels[117].setRotationPoint(7F, 1F, 22.5F);

		rightTrackWheelModels[118].addShapeBox(-6F, -6F, 0F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1739
		rightTrackWheelModels[118].setRotationPoint(7F, 1F, 22.5F);

		rightTrackWheelModels[119].addShapeBox(-2F, 6F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 5F, 1F, 0F, 5F); // Box 1740
		rightTrackWheelModels[119].setRotationPoint(7F, 1F, 20.5F);

		rightTrackWheelModels[120].addShapeBox(-8F, 2F, 0F, 2, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, 5F, -5F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 5F, -5F, 2F, 5F); // Box 1741
		rightTrackWheelModels[120].setRotationPoint(7F, 1F, 20.5F);

		rightTrackWheelModels[121].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1742
		rightTrackWheelModels[121].setRotationPoint(7F, 1F, 21.5F);

		rightTrackWheelModels[122].addShapeBox(-2.5F, -1.5F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1743
		rightTrackWheelModels[122].setRotationPoint(7F, 1F, 21.5F);

		rightTrackWheelModels[123].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1744
		rightTrackWheelModels[123].setRotationPoint(7F, 1F, 21.5F);

		rightTrackWheelModels[124].addShapeBox(-8F, -2F, 0F, 2, 4, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, 5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, 5F); // Box 1745
		rightTrackWheelModels[124].setRotationPoint(-11F, 1F, 20.5F);

		rightTrackWheelModels[125].addShapeBox(-8F, -6F, 0F, 2, 4, 3, 0F,-5F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 5F, -5F, 2F, 5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, 5F); // Box 1746
		rightTrackWheelModels[125].setRotationPoint(-11F, 1F, 20.5F);

		rightTrackWheelModels[126].addShapeBox(6F, -6F, 0F, 2, 4, 3, 0F,4F, 0F, 0F, -5F, 2F, 0F, -5F, 2F, 5F, 4F, 0F, 5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 5F, 0F, 0F, 5F); // Box 1747
		rightTrackWheelModels[126].setRotationPoint(-11F, 1F, 20.5F);

		rightTrackWheelModels[127].addShapeBox(6F, -2F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 5F, 0F, 0F, 5F); // Box 1748
		rightTrackWheelModels[127].setRotationPoint(-11F, 1F, 20.5F);

		rightTrackWheelModels[128].addShapeBox(6F, 2F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 5F, 0F, 0F, 5F, 4F, 0F, 0F, -5F, 2F, 0F, -5F, 2F, 5F, 4F, 0F, 5F); // Box 1749
		rightTrackWheelModels[128].setRotationPoint(-11F, 1F, 20.5F);

		rightTrackWheelModels[129].addShapeBox(-6F, 2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 1750
		rightTrackWheelModels[129].setRotationPoint(-11F, 1F, 22.5F);

		rightTrackWheelModels[130].addShapeBox(-6F, -2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1751
		rightTrackWheelModels[130].setRotationPoint(-11F, 1F, 22.5F);

		rightTrackWheelModels[131].addShapeBox(-6F, -6F, 0F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1752
		rightTrackWheelModels[131].setRotationPoint(-11F, 1F, 22.5F);

		rightTrackWheelModels[132].addShapeBox(-2F, 6F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 5F, 1F, 0F, 5F); // Box 1753
		rightTrackWheelModels[132].setRotationPoint(-11F, 1F, 20.5F);

		rightTrackWheelModels[133].addShapeBox(-8F, 2F, 0F, 2, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, 5F, -5F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 5F, -5F, 2F, 5F); // Box 1754
		rightTrackWheelModels[133].setRotationPoint(-11F, 1F, 20.5F);

		rightTrackWheelModels[134].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1755
		rightTrackWheelModels[134].setRotationPoint(-11F, 1F, 21.5F);

		rightTrackWheelModels[135].addShapeBox(-2.5F, -1.5F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1756
		rightTrackWheelModels[135].setRotationPoint(-11F, 1F, 21.5F);

		rightTrackWheelModels[136].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1757
		rightTrackWheelModels[136].setRotationPoint(-11F, 1F, 21.5F);

		rightTrackWheelModels[137].addShapeBox(-8F, -2F, 0F, 2, 4, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, 5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, 5F); // Box 1758
		rightTrackWheelModels[137].setRotationPoint(-29F, 1F, 20.5F);

		rightTrackWheelModels[138].addShapeBox(-8F, -6F, 0F, 2, 4, 3, 0F,-5F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 5F, -5F, 2F, 5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, 5F); // Box 1759
		rightTrackWheelModels[138].setRotationPoint(-29F, 1F, 20.5F);

		rightTrackWheelModels[139].addShapeBox(6F, -6F, 0F, 2, 4, 3, 0F,4F, 0F, 0F, -5F, 2F, 0F, -5F, 2F, 5F, 4F, 0F, 5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 5F, 0F, 0F, 5F); // Box 1760
		rightTrackWheelModels[139].setRotationPoint(-29F, 1F, 20.5F);

		rightTrackWheelModels[140].addShapeBox(6F, -2F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 5F, 0F, 0F, 5F); // Box 1761
		rightTrackWheelModels[140].setRotationPoint(-29F, 1F, 20.5F);

		rightTrackWheelModels[141].addShapeBox(6F, 2F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 5F, 0F, 0F, 5F, 4F, 0F, 0F, -5F, 2F, 0F, -5F, 2F, 5F, 4F, 0F, 5F); // Box 1762
		rightTrackWheelModels[141].setRotationPoint(-29F, 1F, 20.5F);

		rightTrackWheelModels[142].addShapeBox(-6F, 2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 1763
		rightTrackWheelModels[142].setRotationPoint(-29F, 1F, 22.5F);

		rightTrackWheelModels[143].addShapeBox(-6F, -2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1764
		rightTrackWheelModels[143].setRotationPoint(-29F, 1F, 22.5F);

		rightTrackWheelModels[144].addShapeBox(-6F, -6F, 0F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1765
		rightTrackWheelModels[144].setRotationPoint(-29F, 1F, 22.5F);

		rightTrackWheelModels[145].addShapeBox(-2F, 6F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 5F, 1F, 0F, 5F); // Box 1766
		rightTrackWheelModels[145].setRotationPoint(-29F, 1F, 20.5F);

		rightTrackWheelModels[146].addShapeBox(-8F, 2F, 0F, 2, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, 5F, -5F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 5F, -5F, 2F, 5F); // Box 1767
		rightTrackWheelModels[146].setRotationPoint(-29F, 1F, 20.5F);

		rightTrackWheelModels[147].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1768
		rightTrackWheelModels[147].setRotationPoint(-29F, 1F, 21.5F);

		rightTrackWheelModels[148].addShapeBox(-2.5F, -1.5F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1769
		rightTrackWheelModels[148].setRotationPoint(-29F, 1F, 21.5F);

		rightTrackWheelModels[149].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1770
		rightTrackWheelModels[149].setRotationPoint(-29F, 1F, 21.5F);

		rightTrackWheelModels[150].addShapeBox(-8F, -2F, 0F, 2, 4, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, 5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, 5F); // Box 1771
		rightTrackWheelModels[150].setRotationPoint(-47F, 1F, 20.5F);

		rightTrackWheelModels[151].addShapeBox(-8F, -6F, 0F, 2, 4, 3, 0F,-5F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 5F, -5F, 2F, 5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, 5F); // Box 1772
		rightTrackWheelModels[151].setRotationPoint(-47F, 1F, 20.5F);

		rightTrackWheelModels[152].addShapeBox(6F, -6F, 0F, 2, 4, 3, 0F,4F, 0F, 0F, -5F, 2F, 0F, -5F, 2F, 5F, 4F, 0F, 5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 5F, 0F, 0F, 5F); // Box 1773
		rightTrackWheelModels[152].setRotationPoint(-47F, 1F, 20.5F);

		rightTrackWheelModels[153].addShapeBox(6F, -2F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 5F, 0F, 0F, 5F); // Box 1774
		rightTrackWheelModels[153].setRotationPoint(-47F, 1F, 20.5F);

		rightTrackWheelModels[154].addShapeBox(6F, 2F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 5F, 0F, 0F, 5F, 4F, 0F, 0F, -5F, 2F, 0F, -5F, 2F, 5F, 4F, 0F, 5F); // Box 1775
		rightTrackWheelModels[154].setRotationPoint(-47F, 1F, 20.5F);

		rightTrackWheelModels[155].addShapeBox(-6F, 2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 1776
		rightTrackWheelModels[155].setRotationPoint(-47F, 1F, 22.5F);

		rightTrackWheelModels[156].addShapeBox(-6F, -2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1777
		rightTrackWheelModels[156].setRotationPoint(-47F, 1F, 22.5F);

		rightTrackWheelModels[157].addShapeBox(-6F, -6F, 0F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1778
		rightTrackWheelModels[157].setRotationPoint(-47F, 1F, 22.5F);

		rightTrackWheelModels[158].addShapeBox(-2F, 6F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 5F, 1F, 0F, 5F); // Box 1779
		rightTrackWheelModels[158].setRotationPoint(-47F, 1F, 20.5F);

		rightTrackWheelModels[159].addShapeBox(-8F, 2F, 0F, 2, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, 5F, -5F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 5F, -5F, 2F, 5F); // Box 1780
		rightTrackWheelModels[159].setRotationPoint(-47F, 1F, 20.5F);

		rightTrackWheelModels[160].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1781
		rightTrackWheelModels[160].setRotationPoint(-47F, 1F, 21.5F);

		rightTrackWheelModels[161].addShapeBox(-2.5F, -1.5F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1782
		rightTrackWheelModels[161].setRotationPoint(-47F, 1F, 21.5F);

		rightTrackWheelModels[162].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1783
		rightTrackWheelModels[162].setRotationPoint(-47F, 1F, 21.5F);

		rightTrackWheelModels[163].addShapeBox(-2F, -8F, 0F, 4, 2, 3, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 5F, 1F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 1784
		rightTrackWheelModels[163].setRotationPoint(25F, 1F, 20.5F);

		rightTrackWheelModels[164].addShapeBox(-2F, -8F, 0F, 4, 2, 3, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 5F, 1F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 1785
		rightTrackWheelModels[164].setRotationPoint(7F, 1F, 20.5F);

		rightTrackWheelModels[165].addShapeBox(-2F, -8F, 0F, 4, 2, 3, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 5F, 1F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 1786
		rightTrackWheelModels[165].setRotationPoint(-11F, 1F, 20.5F);

		rightTrackWheelModels[166].addShapeBox(-2F, -8F, 0F, 4, 2, 3, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 5F, 1F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 1787
		rightTrackWheelModels[166].setRotationPoint(-29F, 1F, 20.5F);

		rightTrackWheelModels[167].addShapeBox(-2F, -8F, 0F, 4, 2, 3, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 5F, 1F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 1788
		rightTrackWheelModels[167].setRotationPoint(-47F, 1F, 20.5F);

		rightTrackWheelModels[168].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1483
		rightTrackWheelModels[168].setRotationPoint(-62F, -5F, -29.5F);

		rightTrackWheelModels[169].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 1484
		rightTrackWheelModels[169].setRotationPoint(-62F, -5F, -29.5F);

		rightTrackWheelModels[170].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1485
		rightTrackWheelModels[170].setRotationPoint(-62F, -5F, -29.5F);

		rightTrackWheelModels[171].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1493
		rightTrackWheelModels[171].setRotationPoint(60F, -6F, -29.5F);

		rightTrackWheelModels[172].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1495
		rightTrackWheelModels[172].setRotationPoint(60F, -6F, -29.5F);

		rightTrackWheelModels[173].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 1496
		rightTrackWheelModels[173].setRotationPoint(60F, -6F, -29.5F);
	}
}