//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ChiHa
// Model Creator:
// Created on:-
// Last changed on: -

package com.wolffsmod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelChiHa extends ModelBase
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelChiHa()
	{
		chihaModel = new ModelRendererTurbo[67];
		chihaModel[0] = new ModelRendererTurbo(this, 50, 300, textureX, textureY); // Import CR.MainBody
		chihaModel[1] = new ModelRendererTurbo(this, 50, 350, textureX, textureY); // Import CR.Beak
		chihaModel[2] = new ModelRendererTurbo(this, 50, 410, textureX, textureY); // Import CR.BeakSupport
		chihaModel[3] = new ModelRendererTurbo(this, 50, 660, textureX, textureY); // Import CR.EngineBlock
		chihaModel[4] = new ModelRendererTurbo(this, 50, 720, textureX, textureY); // Import CR.BackCorner
		chihaModel[5] = new ModelRendererTurbo(this, 50, 770, textureX, textureY); // Import CR.TrackWeldRight
		chihaModel[6] = new ModelRendererTurbo(this, 50, 770, textureX, textureY); // Import CR.TrackWeldLeft
		chihaModel[7] = new ModelRendererTurbo(this, 50, 850, textureX, textureY); // Import CR.RightTrackTopRight
		chihaModel[8] = new ModelRendererTurbo(this, 50, 850, textureX, textureY); // Import CR.RightTrackTopLeft
		chihaModel[9] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import CR.RightWheelfront
		chihaModel[10] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Import CR.RightWheelback
		chihaModel[11] = new ModelRendererTurbo(this, 0, 720, textureX, textureY); // Import CR.miniwheelrightfront
		chihaModel[12] = new ModelRendererTurbo(this, 0, 720, textureX, textureY); // Import CR.miniwheelrightcenter
		chihaModel[13] = new ModelRendererTurbo(this, 0, 720, textureX, textureY); // Import CR.miniwheelrightback
		chihaModel[14] = new ModelRendererTurbo(this, 0, 910, textureX, textureY); // Import CR.RightTubethingy
		chihaModel[15] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import CR.LeftWheelfront
		chihaModel[16] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Import CR.LeftWheelback
		chihaModel[17] = new ModelRendererTurbo(this, 0, 720, textureX, textureY); // Import CR.miniwheelleftfront
		chihaModel[18] = new ModelRendererTurbo(this, 0, 720, textureX, textureY); // Import CR.miniwheelleftcenter
		chihaModel[19] = new ModelRendererTurbo(this, 0, 720, textureX, textureY); // Import CR.miniwheelleftback
		chihaModel[20] = new ModelRendererTurbo(this, 0, 910, textureX, textureY); // Import CR.LeftTubethingy
		chihaModel[21] = new ModelRendererTurbo(this, 0, 116, textureX, textureY); // Import CR.SideThingLeft
		chihaModel[22] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Import Turret
		chihaModel[23] = new ModelRendererTurbo(this, 121, 48, textureX, textureY); // Import Mantle
		chihaModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import UpperTurret
		chihaModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import LowerTurret
		chihaModel[26] = new ModelRendererTurbo(this, 90, 60, textureX, textureY); // Import AngledTurret
		chihaModel[27] = new ModelRendererTurbo(this, 90, 81, textureX, textureY); // Import AngledTurret
		chihaModel[28] = new ModelRendererTurbo(this, 130, 90, textureX, textureY); // Import AmmoRacket
		chihaModel[29] = new ModelRendererTurbo(this, 0, 77, textureX, textureY); // Import CH
		chihaModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Rail
		chihaModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Rail
		chihaModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Rail
		chihaModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Rail
		chihaModel[34] = new ModelRendererTurbo(this, 0, 3, textureX, textureY); // Import RailConnecter
		chihaModel[35] = new ModelRendererTurbo(this, 0, 3, textureX, textureY); // Import RailConnecter
		chihaModel[36] = new ModelRendererTurbo(this, 0, 3, textureX, textureY); // Import RailConnecter
		chihaModel[37] = new ModelRendererTurbo(this, 0, 3, textureX, textureY); // Import RailConnecter
		chihaModel[38] = new ModelRendererTurbo(this, 29, 126, textureX, textureY); // Import 
		chihaModel[39] = new ModelRendererTurbo(this, 0, 50, textureX, textureY); // Import Barrel
		chihaModel[40] = new ModelRendererTurbo(this, 0, 41, textureX, textureY); // Import UnderBarrel
		chihaModel[41] = new ModelRendererTurbo(this, 0, 64, textureX, textureY); // Import BarrelConnecter
		chihaModel[42] = new ModelRendererTurbo(this, 61, 53, textureX, textureY); // Import BarrelMantle
		chihaModel[43] = new ModelRendererTurbo(this, 500, 500, textureX, textureY); // Import LT.Wheel1
		chihaModel[44] = new ModelRendererTurbo(this, 500, 500, textureX, textureY); // Import LT.Wheel2
		chihaModel[45] = new ModelRendererTurbo(this, 500, 500, textureX, textureY); // Import LT.Wheel3
		chihaModel[46] = new ModelRendererTurbo(this, 500, 500, textureX, textureY); // Import LT.Wheel4
		chihaModel[47] = new ModelRendererTurbo(this, 500, 500, textureX, textureY); // Import LT.Wheel5
		chihaModel[48] = new ModelRendererTurbo(this, 500, 500, textureX, textureY); // Import LT.Wheel6
		chihaModel[49] = new ModelRendererTurbo(this, 600, 400, textureX, textureY); // Import LT.Top
		chihaModel[50] = new ModelRendererTurbo(this, 600, 430, textureX, textureY); // Import LT.Front
		chihaModel[51] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Import LT.Bottom
		chihaModel[52] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Import LT.Back
		chihaModel[53] = new ModelRendererTurbo(this, 600, 530, textureX, textureY); // Import LT.Frontcorner
		chihaModel[54] = new ModelRendererTurbo(this, 600, 570, textureX, textureY); // Import LT.Backcorner
		chihaModel[55] = new ModelRendererTurbo(this, 500, 500, textureX, textureY); // Import RT.Wheel1
		chihaModel[56] = new ModelRendererTurbo(this, 500, 500, textureX, textureY); // Import RT.Wheel2
		chihaModel[57] = new ModelRendererTurbo(this, 500, 500, textureX, textureY); // Import RT.Wheel3
		chihaModel[58] = new ModelRendererTurbo(this, 500, 500, textureX, textureY); // Import RT.Wheel4
		chihaModel[59] = new ModelRendererTurbo(this, 500, 500, textureX, textureY); // Import RT.Wheel5
		chihaModel[60] = new ModelRendererTurbo(this, 500, 500, textureX, textureY); // Import RT.Wheel6
		chihaModel[61] = new ModelRendererTurbo(this, 600, 400, textureX, textureY); // Import RT.Top
		chihaModel[62] = new ModelRendererTurbo(this, 600, 430, textureX, textureY); // Import RT.Front
		chihaModel[63] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Import RT.Bottom
		chihaModel[64] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Import RT.Back
		chihaModel[65] = new ModelRendererTurbo(this, 600, 530, textureX, textureY); // Import RT.Frontcorner
		chihaModel[66] = new ModelRendererTurbo(this, 600, 570, textureX, textureY); // Import RT.Backcorner

		chihaModel[0].addBox(0F, 0F, 0F, 77, 12, 30, 0F); // Import CR.MainBody
		chihaModel[0].setRotationPoint(-40F, -8F, -12F);

		chihaModel[1].addBox(0F, 0F, 0F, 8, 14, 30, 0F); // Import CR.Beak
		chihaModel[1].setRotationPoint(40F, -12F, -12F);
		chihaModel[1].rotateAngleZ = 0.6632251F;

		chihaModel[2].addBox(0F, 0F, 0F, 16, 10, 30, 0F); // Import CR.BeakSupport
		chihaModel[2].setRotationPoint(24F, -12.5F, -12F);
		chihaModel[2].rotateAngleZ = 0.03490658F;

		chihaModel[3].addBox(0F, 0F, 0F, 22, 8, 30, 0F); // Import CR.EngineBlock
		chihaModel[3].setRotationPoint(-32F, -16F, -12F);

		chihaModel[4].addBox(0F, 0F, 0F, 6, 11, 30, 0F); // Import CR.BackCorner
		chihaModel[4].setRotationPoint(-32F, -16F, -12F);
		chihaModel[4].rotateAngleZ = 0.7853982F;

		chihaModel[5].addBox(0F, 0F, 0F, 62, 6, 0, 0F); // Import CR.TrackWeldRight
		chihaModel[5].setRotationPoint(-40F, -14F, 18F);

		chihaModel[6].addBox(0F, 0F, 0F, 62, 6, 0, 0F); // Import CR.TrackWeldLeft
		chihaModel[6].setRotationPoint(-40F, -14F, -12F);

		chihaModel[7].addBox(0F, 0F, 0F, 66, 1, 7, 0F); // Import CR.RightTrackTopRight
		chihaModel[7].setRotationPoint(-44F, -14F, 18F);

		chihaModel[8].addBox(0F, 0F, 0F, 66, 1, 7, 0F); // Import CR.RightTrackTopLeft
		chihaModel[8].setRotationPoint(-44F, -14F, -19F);

		chihaModel[9].addBox(0F, 0F, 0F, 9, 9, 6, 0F); // Import CR.RightWheelfront
		chihaModel[9].setRotationPoint(36F, -11F, 18F);

		chihaModel[10].addBox(0F, 0F, 0F, 9, 9, 6, 0F); // Import CR.RightWheelback
		chihaModel[10].setRotationPoint(-42F, -11F, 18F);

		chihaModel[11].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Import CR.miniwheelrightfront
		chihaModel[11].setRotationPoint(24F, -11F, 18F);

		chihaModel[12].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Import CR.miniwheelrightcenter
		chihaModel[12].setRotationPoint(-1F, -11F, 18F);

		chihaModel[13].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Import CR.miniwheelrightback
		chihaModel[13].setRotationPoint(-26F, -11F, 18F);

		chihaModel[14].addBox(0F, 0F, 0F, 30, 3, 3, 0F); // Import CR.RightTubethingy
		chihaModel[14].setRotationPoint(-14F, -4F, 18F);

		chihaModel[15].addBox(0F, 0F, 0F, 9, 9, 6, 0F); // Import CR.LeftWheelfront
		chihaModel[15].setRotationPoint(36F, -11F, -18F);

		chihaModel[16].addBox(0F, 0F, 0F, 9, 9, 6, 0F); // Import CR.LeftWheelback
		chihaModel[16].setRotationPoint(-42F, -11F, -18F);

		chihaModel[17].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Import CR.miniwheelleftfront
		chihaModel[17].setRotationPoint(24F, -11F, -16F);

		chihaModel[18].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Import CR.miniwheelleftcenter
		chihaModel[18].setRotationPoint(-1F, -11F, -19F);

		chihaModel[19].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Import CR.miniwheelleftback
		chihaModel[19].setRotationPoint(-26F, -11F, -16F);

		chihaModel[20].addBox(0F, 0F, 0F, 30, 3, 3, 0F); // Import CR.LeftTubethingy
		chihaModel[20].setRotationPoint(-14F, -4F, -15F);

		chihaModel[21].addBox(0F, -1F, 0F, 35, 12, 30, 0F); // Import CR.SideThingLeft
		chihaModel[21].setRotationPoint(-11F, -19F, -12F);

		chihaModel[22].addBox(-3F, -30F, -10F, 15, 10, 20, 0F); // Import Turret
		chihaModel[22].setRotationPoint(0F, 0F, 0F);

		chihaModel[23].addBox(14F, -28F, -8F, 5, 8, 16, 0F); // Import Mantle
		chihaModel[23].setRotationPoint(0F, 0F, 0F);
		chihaModel[23].rotateAngleZ = -0.06981317F;

		chihaModel[24].addBox(12F, -30F, -8F, 5, 2, 16, 0F); // Import UpperTurret
		chihaModel[24].setRotationPoint(0F, 0F, 0F);

		chihaModel[25].addBox(12.5F, -22F, -8F, 5, 2, 16, 0F); // Import LowerTurret
		chihaModel[25].setRotationPoint(0F, 0F, 0F);

		chihaModel[26].addBox(12F, -30F, -11F, 2, 10, 5, 0F); // Import AngledTurret
		chihaModel[26].setRotationPoint(0F, 0F, 0F);
		chihaModel[26].rotateAngleY = -1.082104F;

		chihaModel[27].addBox(12F, -30F, 6F, 2, 10, 5, 0F); // Import AngledTurret
		chihaModel[27].setRotationPoint(0F, 0F, 0F);
		chihaModel[27].rotateAngleY = 1.082104F;

		chihaModel[28].addBox(-8F, -30F, -7F, 8, 9, 15, 0F); // Import AmmoRacket
		chihaModel[28].setRotationPoint(-3F, 0F, 0F);

		chihaModel[29].addBox(-2F, -34F, -8F, 12, 4, 12, 0F); // Import CH
		chihaModel[29].setRotationPoint(0F, 0F, 0F);

		chihaModel[30].addBox(1F, -32F, -12.5F, 12, 1, 1, 0F); // Import Rail
		chihaModel[30].setRotationPoint(0F, 0F, 0F);
		chihaModel[30].rotateAngleY = -0.08726646F;

		chihaModel[31].addBox(-6F, -32F, -17F, 12, 1, 1, 0F); // Import Rail
		chihaModel[31].setRotationPoint(0F, 0F, 0F);
		chihaModel[31].rotateAngleY = -1.239184F;

		chihaModel[32].addBox(-2F, -32F, 14F, 12, 1, 1, 0F); // Import Rail
		chihaModel[32].setRotationPoint(0F, 0F, 0F);
		chihaModel[32].rotateAngleY = 0.9773844F;

		chihaModel[33].addBox(-1.5F, -32F, 10F, 12, 1, 1, 0F); // Import Rail
		chihaModel[33].setRotationPoint(0F, 0F, 0F);
		chihaModel[33].rotateAngleY = 0.08726646F;

		chihaModel[34].addBox(0F, -31F, -12F, 1, 5, 1, 0F); // Import RailConnecter
		chihaModel[34].setRotationPoint(0F, 0F, 0F);
		chihaModel[34].rotateAngleX = -0.6806784F;

		chihaModel[35].addBox(4F, -32F, 10.2F, 1, 5, 1, 0F); // Import RailConnecter
		chihaModel[35].setRotationPoint(0F, 0F, 0F);
		chihaModel[35].rotateAngleX = 0.6806784F;

		chihaModel[36].addBox(7.133333F, -33F, -10F, 1, 5, 1, 0F); // Import RailConnecter
		chihaModel[36].setRotationPoint(0F, 0F, 0F);
		chihaModel[36].rotateAngleX = -0.6806784F;
		chihaModel[36].rotateAngleY = 0.7853982F;

		chihaModel[37].addBox(5.1F, -34.5F, -7.5F, 1, 5, 1, 0F); // Import RailConnecter
		chihaModel[37].setRotationPoint(0F, 0F, 0F);
		chihaModel[37].rotateAngleX = -0.6806784F;
		chihaModel[37].rotateAngleY = 1.850049F;

		chihaModel[38].addBox(-1F, -35F, -7F, 10, 1, 10, 0F); // Import 
		chihaModel[38].setRotationPoint(0F, 0F, 0F);

		chihaModel[39].addBox(14F, -28F, -2F, 21, 3, 3, 0F); // Import Barrel
		chihaModel[39].setRotationPoint(0F, 0F, 0F);

		chihaModel[40].addBox(15F, -24.5F, -1.5F, 11, 2, 2, 0F); // Import UnderBarrel
		chihaModel[40].setRotationPoint(0F, 0F, 0F);

		chihaModel[41].addBox(22F, -25F, -1F, 3, 1, 1, 0F); // Import BarrelConnecter
		chihaModel[41].setRotationPoint(0F, 0F, 0F);

		chihaModel[42].addBox(18.5F, -29F, -5F, 1, 8, 9, 0F); // Import BarrelMantle
		chihaModel[42].setRotationPoint(0F, 0F, 0F);
		chihaModel[42].rotateAngleZ = -0.01745329F;

		chihaModel[43].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // Import LT.Wheel1
		chihaModel[43].setRotationPoint(28F, 2F, -18F);

		chihaModel[44].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // Import LT.Wheel2
		chihaModel[44].setRotationPoint(17F, 2F, -18F);

		chihaModel[45].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // Import LT.Wheel3
		chihaModel[45].setRotationPoint(3F, 2F, -18F);

		chihaModel[46].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // Import LT.Wheel4
		chihaModel[46].setRotationPoint(-8F, 2F, -18F);

		chihaModel[47].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // Import LT.Wheel5
		chihaModel[47].setRotationPoint(-22F, 2F, -18F);

		chihaModel[48].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // Import LT.Wheel6
		chihaModel[48].setRotationPoint(-33F, 2F, -18F);

		chihaModel[49].addBox(0F, 0F, 0F, 88, 1, 6, 0F); // Import LT.Top
		chihaModel[49].setRotationPoint(-42.5F, -12F, -18F);

		chihaModel[50].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // Import LT.Front
		chihaModel[50].setRotationPoint(45F, -11.5F, -18F);

		chihaModel[51].addBox(0F, 0F, 0F, 70, 1, 6, 0F); // Import LT.Bottom
		chihaModel[51].setRotationPoint(-33.5F, 9F, -18F);

		chihaModel[52].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // Import LT.Back
		chihaModel[52].setRotationPoint(-43F, -11.5F, -18F);

		chihaModel[53].addBox(0F, 0F, 0F, 1, 15, 6, 0F); // Import LT.Frontcorner
		chihaModel[53].setRotationPoint(45F, -2.5F, -18F);
		chihaModel[53].rotateAngleZ = 0.6632251F;

		chihaModel[54].addBox(0F, 0F, 0F, 1, 15, 6, 0F); // Import LT.Backcorner
		chihaModel[54].setRotationPoint(-43F, -2F, -18F);
		chihaModel[54].rotateAngleZ = -0.6632251F;

		chihaModel[55].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // Import RT.Wheel1
		chihaModel[55].setRotationPoint(28F, 2F, 18F);

		chihaModel[56].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // Import RT.Wheel2
		chihaModel[56].setRotationPoint(17F, 2F, 18F);

		chihaModel[57].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // Import RT.Wheel3
		chihaModel[57].setRotationPoint(3F, 2F, 18F);

		chihaModel[58].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // Import RT.Wheel4
		chihaModel[58].setRotationPoint(-8F, 2F, 18F);

		chihaModel[59].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // Import RT.Wheel5
		chihaModel[59].setRotationPoint(-22F, 2F, 18F);

		chihaModel[60].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // Import RT.Wheel6
		chihaModel[60].setRotationPoint(-33F, 2F, 18F);

		chihaModel[61].addBox(0F, 0F, 0F, 88, 1, 6, 0F); // Import RT.Top
		chihaModel[61].setRotationPoint(-42.5F, -12F, 18F);

		chihaModel[62].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // Import RT.Front
		chihaModel[62].setRotationPoint(45F, -11.5F, 18F);

		chihaModel[63].addBox(0F, 0F, 0F, 70, 1, 6, 0F); // Import RT.Bottom
		chihaModel[63].setRotationPoint(-33.5F, 9F, 18F);

		chihaModel[64].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // Import RT.Back
		chihaModel[64].setRotationPoint(-43F, -11.5F, 18F);

		chihaModel[65].addBox(0F, 0F, 0F, 1, 15, 6, 0F); // Import RT.Frontcorner
		chihaModel[65].setRotationPoint(45F, -2.5F, 18F);
		chihaModel[65].rotateAngleZ = 0.6632251F;

		chihaModel[66].addBox(0F, 0F, 3F, 1, 15, 6, 0F); // Import RT.Backcorner
		chihaModel[66].setRotationPoint(-43F, -2F, 15F);
		chihaModel[66].rotateAngleZ = -0.6632251F;


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 67; i++)
		{
			chihaModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo chihaModel[];
}