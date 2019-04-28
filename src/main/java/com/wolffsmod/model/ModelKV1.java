//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: KV1
// Model Creator: 
// Created on: -
// Last changed on: -

package com.wolffsmod.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

import net.minecraft.entity.Entity;

public class ModelKV1 extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelKV1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[58];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import ImportCR,MainBody
		bodyModel[1] = new ModelRendererTurbo(this, 0, 100, textureX, textureY); // Import ImportCR,TopBeak
		bodyModel[2] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Import ImportCR,BottomBeak
		bodyModel[3] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Import ImportCR,FrontSlope
		bodyModel[4] = new ModelRendererTurbo(this, 0, 250, textureX, textureY); // Import ImportCR,Backthingy
		bodyModel[5] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import ImportCR,Backslope
		bodyModel[6] = new ModelRendererTurbo(this, 0, 360, textureX, textureY); // Import ImportCR,LeftTrackCover
		bodyModel[7] = new ModelRendererTurbo(this, 0, 360, textureX, textureY); // Import ImportCR,rightTrackCover
		bodyModel[8] = new ModelRendererTurbo(this, 350, 0, textureX, textureY); // Import ImportCR,FrontRightWheel
		bodyModel[9] = new ModelRendererTurbo(this, 350, 50, textureX, textureY); // Import ImportCR,BackRightWheel
		bodyModel[10] = new ModelRendererTurbo(this, 350, 150, textureX, textureY); // Import ImportCR,RightTopWheel1
		bodyModel[11] = new ModelRendererTurbo(this, 350, 150, textureX, textureY); // Import ImportCR,RightTopWheel2
		bodyModel[12] = new ModelRendererTurbo(this, 350, 150, textureX, textureY); // Import ImportCR,RightTopWheel3
		bodyModel[13] = new ModelRendererTurbo(this, 350, 0, textureX, textureY); // Import ImportCR,FrontLeftWheel
		bodyModel[14] = new ModelRendererTurbo(this, 350, 50, textureX, textureY); // Import ImportCR,BackLeftWheel
		bodyModel[15] = new ModelRendererTurbo(this, 350, 150, textureX, textureY); // Import ImportCR,LeftTopWheel1
		bodyModel[16] = new ModelRendererTurbo(this, 350, 150, textureX, textureY); // Import ImportCR,LeftTopWheel2
		bodyModel[17] = new ModelRendererTurbo(this, 350, 150, textureX, textureY); // Import ImportCR,LeftTopWheel3
		bodyModel[18] = new ModelRendererTurbo(this, 350, 200, textureX, textureY); // Import ImportRT,Wheel1
		bodyModel[19] = new ModelRendererTurbo(this, 350, 200, textureX, textureY); // Import ImportRT,Wheel2
		bodyModel[20] = new ModelRendererTurbo(this, 350, 200, textureX, textureY); // Import ImportRT,Wheel3
		bodyModel[21] = new ModelRendererTurbo(this, 350, 200, textureX, textureY); // Import ImportRT,Wheel4
		bodyModel[22] = new ModelRendererTurbo(this, 350, 200, textureX, textureY); // Import ImportRT,Wheel5
		bodyModel[23] = new ModelRendererTurbo(this, 350, 200, textureX, textureY); // Import ImportRT,Wheel6
		bodyModel[24] = new ModelRendererTurbo(this, 350, 275, textureX, textureY); // Import ImportRT,BottomThread
		bodyModel[25] = new ModelRendererTurbo(this, 350, 300, textureX, textureY); // Import ImportRT,FrontCornerThread
		bodyModel[26] = new ModelRendererTurbo(this, 350, 320, textureX, textureY); // Import ImportRT,FrontThread
		bodyModel[27] = new ModelRendererTurbo(this, 350, 350, textureX, textureY); // Import ImportRT,TopThread
		bodyModel[28] = new ModelRendererTurbo(this, 350, 370, textureX, textureY); // Import ImportRT,BackThread
		bodyModel[29] = new ModelRendererTurbo(this, 350, 400, textureX, textureY); // Import ImportRT,BackCornerThread
		bodyModel[30] = new ModelRendererTurbo(this, 350, 200, textureX, textureY); // Import ImportLT,Wheel1
		bodyModel[31] = new ModelRendererTurbo(this, 350, 200, textureX, textureY); // Import ImportLT,Wheel2
		bodyModel[32] = new ModelRendererTurbo(this, 350, 200, textureX, textureY); // Import ImportLT,Wheel3
		bodyModel[33] = new ModelRendererTurbo(this, 350, 200, textureX, textureY); // Import ImportLT,Wheel4
		bodyModel[34] = new ModelRendererTurbo(this, 350, 200, textureX, textureY); // Import ImportLT,Wheel5
		bodyModel[35] = new ModelRendererTurbo(this, 350, 200, textureX, textureY); // Import ImportLT,Wheel6
		bodyModel[36] = new ModelRendererTurbo(this, 350, 275, textureX, textureY); // Import ImportLT,BottomThread
		bodyModel[37] = new ModelRendererTurbo(this, 350, 300, textureX, textureY); // Import ImportLT,FrontCornerThread
		bodyModel[38] = new ModelRendererTurbo(this, 350, 320, textureX, textureY); // Import ImportLT,FrontThread
		bodyModel[39] = new ModelRendererTurbo(this, 350, 350, textureX, textureY); // Import ImportLT,TopThread
		bodyModel[40] = new ModelRendererTurbo(this, 350, 370, textureX, textureY); // Import ImportLT,BackThread
		bodyModel[41] = new ModelRendererTurbo(this, 350, 400, textureX, textureY); // Import ImportLT,BackCornerThread
		bodyModel[42] = new ModelRendererTurbo(this, 350, 600, textureX, textureY); // Import ImportCR,RightTrackDetail1
		bodyModel[43] = new ModelRendererTurbo(this, 350, 600, textureX, textureY); // Import ImportCR,RightTrackDetail2
		bodyModel[44] = new ModelRendererTurbo(this, 350, 650, textureX, textureY); // Import ImportCR,RightTrackDetail3
		bodyModel[45] = new ModelRendererTurbo(this, 350, 600, textureX, textureY); // Import ImportCR,RightTrackDetail2
		bodyModel[46] = new ModelRendererTurbo(this, 350, 700, textureX, textureY); // Import ImportCR,LeftTrackDetail1
		bodyModel[47] = new ModelRendererTurbo(this, 350, 700, textureX, textureY); // Import ImportCR,LeftTrackDetail2
		bodyModel[48] = new ModelRendererTurbo(this, 350, 750, textureX, textureY); // Import ImportCR,LeftTrackDetail3
		bodyModel[49] = new ModelRendererTurbo(this, 350, 700, textureX, textureY); // Import ImportCR,LeftTrackDetail4
		bodyModel[50] = new ModelRendererTurbo(this, 500, 0, textureX, textureY); // Import ImportTR,TurretSpinny
		bodyModel[51] = new ModelRendererTurbo(this, 500, 75, textureX, textureY); // Import ImportTR,MainPart
		bodyModel[52] = new ModelRendererTurbo(this, 500, 120, textureX, textureY); // Import ImportTR,RightCheeck
		bodyModel[53] = new ModelRendererTurbo(this, 500, 150, textureX, textureY); // Import ImportTR,LeftCheeck
		bodyModel[54] = new ModelRendererTurbo(this, 500, 180, textureX, textureY); // Import ImportTR,FrontAngle
		bodyModel[55] = new ModelRendererTurbo(this, 600, 180, textureX, textureY); // Import ImportBL,GunBase
		bodyModel[56] = new ModelRendererTurbo(this, 600, 150, textureX, textureY); // Import ImportBL,Gunthingy
		bodyModel[57] = new ModelRendererTurbo(this, 600, 120, textureX, textureY); // Import ImportBL,75MM

		bodyModel[0].addBox(0F, 0F, 0F, 79, 18, 32, 0F); // Import ImportCR,MainBody
		bodyModel[0].setRotationPoint(-54F, -16F, -16F);

		bodyModel[1].addBox(0F, 0F, 0F, 16, 8, 32, 0F); // Import ImportCR,TopBeak
		bodyModel[1].setRotationPoint(25F, -11F, -16F);
		bodyModel[1].rotateAngleZ = 0.20943951F;

		bodyModel[2].addBox(0F, 0F, 0F, 14, 6, 32, 0F); // Import ImportCR,BottomBeak
		bodyModel[2].setRotationPoint(24F, -4F, -16F);
		bodyModel[2].rotateAngleZ = - 0.13962634F;

		bodyModel[3].addBox(0F, 0F, 0F, 2, 6, 32, 0F); // Import ImportCR,FrontSlope
		bodyModel[3].setRotationPoint(23.2F, -15F, -16F);
		bodyModel[3].rotateAngleZ = - 0.43633231F;

		bodyModel[4].addBox(0F, 0F, 0F, 6, 6, 31, 0F); // Import ImportCR,Backthingy
		bodyModel[4].setRotationPoint(-59.8F, -14.8F, -15.5F);
		bodyModel[4].rotateAngleZ = - 0.20943951F;

		bodyModel[5].addBox(0F, 0F, 0F, 10, 12, 32, 0F); // Import ImportCR,Backslope
		bodyModel[5].setRotationPoint(-57F, -10F, -16F);
		bodyModel[5].rotateAngleZ = - 0.2443461F;

		bodyModel[6].addBox(0F, 0F, 0F, 100, 2, 12, 0F); // Import ImportCR,LeftTrackCover
		bodyModel[6].setRotationPoint(-59F, -11.5F, -28F);

		bodyModel[7].addBox(0F, 0F, 0F, 100, 2, 12, 0F); // Import ImportCR,rightTrackCover
		bodyModel[7].setRotationPoint(-59F, -11.5F, 16F);

		bodyModel[8].addBox(0F, 0F, 0F, 8, 8, 11, 0F); // Import ImportCR,FrontRightWheel
		bodyModel[8].setRotationPoint(32F, -7.5F, 16F);

		bodyModel[9].addBox(0F, 0F, 0F, 9, 9, 11, 0F); // Import ImportCR,BackRightWheel
		bodyModel[9].setRotationPoint(-56F, -7.5F, 16F);

		bodyModel[10].addBox(0F, 0F, 0F, 4, 4, 9, 0F); // Import ImportCR,RightTopWheel1
		bodyModel[10].setRotationPoint(14F, -7.5F, 16F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 4, 9, 0F); // Import ImportCR,RightTopWheel2
		bodyModel[11].setRotationPoint(-12F, -7.5F, 16F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 4, 9, 0F); // Import ImportCR,RightTopWheel3
		bodyModel[12].setRotationPoint(-38F, -7.5F, 16F);

		bodyModel[13].addBox(0F, 0F, 0F, 8, 8, 11, 0F); // Import ImportCR,FrontLeftWheel
		bodyModel[13].setRotationPoint(32F, -7.5F, -27F);

		bodyModel[14].addBox(0F, 0F, 0F, 9, 9, 11, 0F); // Import ImportCR,BackLeftWheel
		bodyModel[14].setRotationPoint(-56F, -7.5F, -27F);

		bodyModel[15].addBox(0F, 0F, 0F, 4, 4, 9, 0F); // Import ImportCR,LeftTopWheel1
		bodyModel[15].setRotationPoint(14F, -7.5F, -25F);

		bodyModel[16].addBox(0F, 0F, 0F, 4, 4, 9, 0F); // Import ImportCR,LeftTopWheel2
		bodyModel[16].setRotationPoint(-12F, -7.5F, -25F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 4, 9, 0F); // Import ImportCR,LeftTopWheel3
		bodyModel[17].setRotationPoint(-38F, -7.5F, -25F);

		bodyModel[18].addBox(0F, 0F, 0F, 7, 7, 10, 0F); // Import ImportRT,Wheel1
		bodyModel[18].setRotationPoint(20F, 0F, 16F);

		bodyModel[19].addBox(0F, 0F, 0F, 7, 7, 10, 0F); // Import ImportRT,Wheel2
		bodyModel[19].setRotationPoint(7.5F, 0F, 16F);

		bodyModel[20].addBox(0F, 0F, 0F, 7, 7, 10, 0F); // Import ImportRT,Wheel3
		bodyModel[20].setRotationPoint(-5F, 0F, 16F);

		bodyModel[21].addBox(0F, 0F, 0F, 7, 7, 10, 0F); // Import ImportRT,Wheel4
		bodyModel[21].setRotationPoint(-17.5F, 0F, 16F);

		bodyModel[22].addBox(0F, 0F, 0F, 7, 7, 10, 0F); // Import ImportRT,Wheel5
		bodyModel[22].setRotationPoint(-30F, 0F, 16F);

		bodyModel[23].addBox(0F, 0F, 0F, 7, 7, 10, 0F); // Import ImportRT,Wheel6
		bodyModel[23].setRotationPoint(-42.5F, 0F, 16F);

		bodyModel[24].addBox(0F, 0F, 0F, 71, 1, 12, 0F); // Import ImportRT,BottomThread
		bodyModel[24].setRotationPoint(-43F, 7F, 16F);

		bodyModel[25].addBox(0F, 0F, 0F, 15, 1, 12, 0F); // Import ImportRT,FrontCornerThread
		bodyModel[25].setRotationPoint(27.5F, 7F, 16F);
		bodyModel[25].rotateAngleZ = - 0.52359878F;

		bodyModel[26].addBox(0F, 0F, 0F, 1, 8, 12, 0F); // Import ImportRT,FrontThread
		bodyModel[26].setRotationPoint(40F, -8F, 16F);

		bodyModel[27].addBox(0F, 0F, 0F, 97, 1, 12, 0F); // Import ImportRT,TopThread
		bodyModel[27].setRotationPoint(-56.5F, -8.6F, 16F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 9, 12, 0F); // Import ImportRT,BackThread
		bodyModel[28].setRotationPoint(-57F, -8F, 16F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 16, 12, 0F); // Import ImportRT,BackCornerThread
		bodyModel[29].setRotationPoint(-57F, 1F, 16F);
		bodyModel[29].rotateAngleZ = - 1.11701072F;

		bodyModel[30].addBox(0F, 0F, 0F, 7, 7, 10, 0F); // Import ImportLT,Wheel1
		bodyModel[30].setRotationPoint(20F, 0F, -26F);

		bodyModel[31].addBox(0F, 0F, 0F, 7, 7, 10, 0F); // Import ImportLT,Wheel2
		bodyModel[31].setRotationPoint(7.5F, 0F, -26F);

		bodyModel[32].addBox(0F, 0F, 0F, 7, 7, 10, 0F); // Import ImportLT,Wheel3
		bodyModel[32].setRotationPoint(-5F, 0F, -26F);

		bodyModel[33].addBox(0F, 0F, 0F, 7, 7, 10, 0F); // Import ImportLT,Wheel4
		bodyModel[33].setRotationPoint(-17.5F, 0F, -26F);

		bodyModel[34].addBox(0F, 0F, 0F, 7, 7, 10, 0F); // Import ImportLT,Wheel5
		bodyModel[34].setRotationPoint(-30F, 0F, -26F);

		bodyModel[35].addBox(0F, 0F, 0F, 7, 7, 10, 0F); // Import ImportLT,Wheel6
		bodyModel[35].setRotationPoint(-42.5F, 0F, -26F);

		bodyModel[36].addBox(0F, 0F, 0F, 71, 1, 12, 0F); // Import ImportLT,BottomThread
		bodyModel[36].setRotationPoint(-43F, 7F, -28F);

		bodyModel[37].addBox(0F, 0F, 0F, 15, 1, 12, 0F); // Import ImportLT,FrontCornerThread
		bodyModel[37].setRotationPoint(27.5F, 7F, -28F);
		bodyModel[37].rotateAngleZ = - 0.52359878F;

		bodyModel[38].addBox(0F, 0F, 0F, 1, 8, 12, 0F); // Import ImportLT,FrontThread
		bodyModel[38].setRotationPoint(40F, -8F, -28F);

		bodyModel[39].addBox(0F, 0F, 0F, 97, 1, 12, 0F); // Import ImportLT,TopThread
		bodyModel[39].setRotationPoint(-56.5F, -8.6F, -28F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 9, 12, 0F); // Import ImportLT,BackThread
		bodyModel[40].setRotationPoint(-57F, -8F, -28F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 16, 12, 0F); // Import ImportLT,BackCornerThread
		bodyModel[41].setRotationPoint(-57F, 1F, -28F);
		bodyModel[41].rotateAngleZ = - 1.11701072F;

		bodyModel[42].addBox(0F, 0F, 0F, 0, 4, 12, 0F); // Import ImportCR,RightTrackDetail1
		bodyModel[42].setRotationPoint(22F, -15F, 16F);
		bodyModel[42].rotateAngleX = -0.31415927F;

		bodyModel[43].addBox(0F, 0F, 0F, 0, 4, 12, 0F); // Import ImportCR,RightTrackDetail2
		bodyModel[43].setRotationPoint(4F, -15F, 16F);
		bodyModel[43].rotateAngleX = -0.31415927F;

		bodyModel[44].addBox(0F, 0F, 0F, 25, 4, 12, 0F); // Import ImportCR,RightTrackDetail3
		bodyModel[44].setRotationPoint(-36F, -15.5F, 16F);
		bodyModel[44].rotateAngleX = -0.06981317F;

		bodyModel[45].addBox(0F, 0F, 0F, 0, 4, 12, 0F); // Import ImportCR,RightTrackDetail2
		bodyModel[45].setRotationPoint(-50F, -15F, 16F);
		bodyModel[45].rotateAngleX = -0.31415927F;

		bodyModel[46].addBox(0F, 0F, 0F, 0, 4, 12, 0F); // Import ImportCR,LeftTrackDetail1
		bodyModel[46].setRotationPoint(21F, -11.5F, -27F);
		bodyModel[46].rotateAngleX = 0.31415927F;

		bodyModel[47].addBox(0F, 0F, 0F, 0, 4, 12, 0F); // Import ImportCR,LeftTrackDetail2
		bodyModel[47].setRotationPoint(4F, -11.5F, -27F);
		bodyModel[47].rotateAngleX = 0.31415927F;

		bodyModel[48].addBox(0F, 0F, 0F, 25, 4, 12, 0F); // Import ImportCR,LeftTrackDetail3
		bodyModel[48].setRotationPoint(-36F, -14.5F, -27F);
		bodyModel[48].rotateAngleX = 0.06981317F;

		bodyModel[49].addBox(0F, 0F, 0F, 0, 4, 12, 0F); // Import ImportCR,LeftTrackDetail4
		bodyModel[49].setRotationPoint(-50F, -11.5F, -27F);
		bodyModel[49].rotateAngleX = 0.31415927F;

		bodyModel[50].addBox(0F, 0F, 0F, 30, 4, 30, 0F); // Import ImportTR,TurretSpinny
		bodyModel[50].setRotationPoint(-15F, -20F, -15F);

		bodyModel[51].addBox(-32F, 0F, -10F, 41, 11, 20, 0F); // Import ImportTR,MainPart
		bodyModel[51].setRotationPoint(0F, -31F, 0F);

		bodyModel[52].addBox(-15F, 0F, 6F, 24, 13, 5, 0F); // Import ImportTR,RightCheeck
		bodyModel[52].setRotationPoint(0F, -27F, 0F);
		bodyModel[52].rotateAngleX = 0.34906585F;

		bodyModel[53].addBox(-15F, 3.8F, -9.5F, 24, 13, 5, 0F); // Import ImportTR,LeftCheeck
		bodyModel[53].setRotationPoint(0F, -31F, 0F);
		bodyModel[53].rotateAngleX = -0.34906585F;

		bodyModel[54].addBox(2F, 0F, -10F, 8, 13, 20, 0F); // Import ImportTR,FrontAngle
		bodyModel[54].setRotationPoint(0F, -26.5F, 0F);
		bodyModel[54].rotateAngleZ = - 0.45378561F;

		bodyModel[55].addBox(7F, -3F, -8F, 9, 7, 16, 0F); // Import ImportBL,GunBase
		bodyModel[55].setRotationPoint(0F, -26F, 0F);

		bodyModel[56].addShapeBox(1F, -2F, -2F, 12, 5, 4, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Import ImportBL,Gunthingy
		bodyModel[56].setRotationPoint(15F, -26F, 0F);

		bodyModel[57].addBox(5F, -1.5F, -1F, 32, 2, 2, 0F); // Import ImportBL,75MM
		bodyModel[57].setRotationPoint(15F, -26F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 58; i++)
		{
			bodyModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo bodyModel[];
}