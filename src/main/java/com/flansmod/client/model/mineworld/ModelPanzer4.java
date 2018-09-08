package com.flansmod.client.model.mineworld;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelPanzer4 extends ModelVehicle
{
    public ModelPanzer4()
    {
		int textureX = 512;
		int textureY = 512;
	
        bodyModel = new ModelRendererTurbo[61];	
     	bodyModel[0] = new ModelRendererTurbo(this, 203, 504, textureX, textureY);
     	bodyModel[1] = new ModelRendererTurbo(this, 19, 482, textureX, textureY);
     	bodyModel[2] = new ModelRendererTurbo(this, 38, 485, textureX, textureY);
     	bodyModel[3] = new ModelRendererTurbo(this, 378, 504, textureX, textureY);
     	bodyModel[4] = new ModelRendererTurbo(this, 0, 504, textureX, textureY);
     	bodyModel[5] = new ModelRendererTurbo(this, 162, 504, textureX, textureY);
     	bodyModel[6] = new ModelRendererTurbo(this, 0, 484, textureX, textureY);
     	bodyModel[7] = new ModelRendererTurbo(this, 203, 504, textureX, textureY);
     	bodyModel[8] = new ModelRendererTurbo(this, 19, 482, textureX, textureY);
     	bodyModel[9] = new ModelRendererTurbo(this, 38, 485, textureX, textureY);
     	bodyModel[10] = new ModelRendererTurbo(this, 378, 504, textureX, textureY);
     	bodyModel[11] = new ModelRendererTurbo(this, 0, 504, textureX, textureY);
     	bodyModel[12] = new ModelRendererTurbo(this, 162, 504, textureX, textureY);
     	bodyModel[13] = new ModelRendererTurbo(this, 0, 484, textureX, textureY);
     	bodyModel[14] = new ModelRendererTurbo(this, 0, 466, textureX, textureY);
     	bodyModel[15] = new ModelRendererTurbo(this, 106, 471, textureX, textureY);
     	bodyModel[16] = new ModelRendererTurbo(this, 106, 471, textureX, textureY);
     	bodyModel[17] = new ModelRendererTurbo(this, 106, 471, textureX, textureY);
     	bodyModel[18] = new ModelRendererTurbo(this, 106, 471, textureX, textureY);
     	bodyModel[19] = new ModelRendererTurbo(this, 33, 467, textureX, textureY);
     	bodyModel[20] = new ModelRendererTurbo(this, 64, 468, textureX, textureY);
     	bodyModel[21] = new ModelRendererTurbo(this, 64, 468, textureX, textureY);
     	bodyModel[22] = new ModelRendererTurbo(this, 64, 468, textureX, textureY);
     	bodyModel[23] = new ModelRendererTurbo(this, 64, 468, textureX, textureY);
     	bodyModel[24] = new ModelRendererTurbo(this, 0, 466, textureX, textureY);
     	bodyModel[25] = new ModelRendererTurbo(this, 106, 471, textureX, textureY);
     	bodyModel[26] = new ModelRendererTurbo(this, 106, 471, textureX, textureY);
     	bodyModel[27] = new ModelRendererTurbo(this, 106, 471, textureX, textureY);
     	bodyModel[28] = new ModelRendererTurbo(this, 106, 471, textureX, textureY);
     	bodyModel[29] = new ModelRendererTurbo(this, 33, 467, textureX, textureY);
     	bodyModel[30] = new ModelRendererTurbo(this, 64, 468, textureX, textureY);
     	bodyModel[31] = new ModelRendererTurbo(this, 64, 468, textureX, textureY);
     	bodyModel[32] = new ModelRendererTurbo(this, 64, 468, textureX, textureY);
     	bodyModel[33] = new ModelRendererTurbo(this, 64, 468, textureX, textureY);
     	bodyModel[34] = new ModelRendererTurbo(this, 152, 433, textureX, textureY);
     	bodyModel[35] = new ModelRendererTurbo(this, 97, 335, textureX, textureY);
     	bodyModel[36] = new ModelRendererTurbo(this, 193, 411, textureX, textureY);
     	bodyModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
     	bodyModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
     	bodyModel[39] = new ModelRendererTurbo(this, 0, 251, textureX, textureY);
     	bodyModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
     	bodyModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
     	bodyModel[42] = new ModelRendererTurbo(this, 0, 393, textureX, textureY);
     	bodyModel[43] = new ModelRendererTurbo(this, 0, 352, textureX, textureY);
     	bodyModel[44] = new ModelRendererTurbo(this, 0, 429, textureX, textureY);
     	bodyModel[45] = new ModelRendererTurbo(this, 329, 487, textureX, textureY);
     	bodyModel[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
     	bodyModel[47] = new ModelRendererTurbo(this, 0, 447, textureX, textureY);
     	bodyModel[48] = new ModelRendererTurbo(this, 329, 470, textureX, textureY);
     	bodyModel[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
     	bodyModel[50] = new ModelRendererTurbo(this, 66, 312, textureX, textureY);
     	bodyModel[51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
     	bodyModel[52] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
     	bodyModel[53] = new ModelRendererTurbo(this, 66, 297, textureX, textureY);
     	bodyModel[54] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
     	bodyModel[55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
     	bodyModel[56] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
     	bodyModel[57] = new ModelRendererTurbo(this, 0, 323, textureX, textureY);
     	bodyModel[58] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
     	bodyModel[59] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
     	bodyModel[60] = new ModelRendererTurbo(this, 0, 301, textureX, textureY);


		bodyModel[0].addBox(0F, 0F, 0F, 79, 1, 7, 0);
		bodyModel[0].setRotationPoint(-28F, -17F, 17F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 12, 7, 0F);
		bodyModel[1].setRotationPoint(-39F, -14F, 17F);
		bodyModel[1].rotateAngleZ = 1.745329F;

		bodyModel[2].addBox(-1F, 0F, 0F, 1, 9, 7, 0F);
		bodyModel[2].setRotationPoint(-39F, -14F, 17F);

		bodyModel[3].addBox(0F, 0F, 0F, 14, 1, 7, 0F);
		bodyModel[3].setRotationPoint(-40F, -5F, 24F);
		bodyModel[3].rotateAngleX = 3.141593F;
		bodyModel[3].rotateAngleZ = -0.541052F;

		bodyModel[4].addBox(0F, 0F, 0F, 72, 1, 7, 0);
		bodyModel[4].setRotationPoint(-28F, 1F, 17F);

		bodyModel[5].addBox(0F, 0F, 0F, 11, 1, 7, 0F);
		bodyModel[5].setRotationPoint(52F, -6F, 17F);
		bodyModel[5].rotateAngleZ = -2.356194F;

		bodyModel[6].addBox(0F, 0F, 0F, 1, 10, 7, 0F);
		bodyModel[6].setRotationPoint(51F, -16F, 17F);

		bodyModel[7].addBox(0F, 0F, 0F, 79, 1, 7, 0);
		bodyModel[7].setRotationPoint(-28F, -17F, -24F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 12, 7, 0F);
		bodyModel[8].setRotationPoint(-39F, -14F, -24F);
		bodyModel[8].rotateAngleZ = 1.745329F;

		bodyModel[9].addBox(-1F, 0F, 0F, 1, 9, 7, 0F);
		bodyModel[9].setRotationPoint(-39F, -14F, -24F);

		bodyModel[10].addBox(0F, 0F, 0F, 14, 1, 7, 0F);
		bodyModel[10].setRotationPoint(-40F, -5F, -17F);
		bodyModel[10].rotateAngleX = 3.141593F;
		bodyModel[10].rotateAngleZ = -0.541052F;

		bodyModel[11].addBox(0F, 0F, 0F, 72, 1, 7, 0);
		bodyModel[11].setRotationPoint(-28F, 1F, -24F);

		bodyModel[12].addBox(0F, 0F, 0F, 11, 1, 7, 0F);
		bodyModel[12].setRotationPoint(52F, -6F, -24F);
		bodyModel[12].rotateAngleZ = -2.356194F;

		bodyModel[13].addBox(0F, 0F, 0F, 1, 10, 7, 0F);
		bodyModel[13].setRotationPoint(51F, -16F, -24F);

		bodyModel[14].addBox(0F, 0F, 0F, 9, 9, 6, 0F);
		bodyModel[14].setRotationPoint(42F, -16F, 17F);

		bodyModel[15].addBox(0F, 0F, 0F, 4, 4, 6, 0F);
		bodyModel[15].setRotationPoint(36F, -16F, 17F);

		bodyModel[16].addBox(0F, 0F, 0F, 4, 4, 6, 0F);
		bodyModel[16].setRotationPoint(16F, -16F, 17F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 4, 6, 0F);
		bodyModel[17].setRotationPoint(-4F, -16F, 17F);

		bodyModel[18].addBox(0F, 0F, 0F, 4, 4, 6, 0F);
		bodyModel[18].setRotationPoint(-24F, -16F, 17F);

		bodyModel[19].addBox(-1F, 0F, 0F, 8, 8, 6, 0F);
		bodyModel[19].setRotationPoint(-38F, -14F, 17F);

		bodyModel[20].addBox(0F, 0F, 0F, 14, 7, 6, 0F);
		bodyModel[20].setRotationPoint(-29F, -6F, 17F);

		bodyModel[21].addBox(0F, 0F, 0F, 14, 7, 6, 0F);
		bodyModel[21].setRotationPoint(-9F, -6F, 17F);

		bodyModel[22].addBox(0F, 0F, 0F, 14, 7, 6, 0F);
		bodyModel[22].setRotationPoint(11F, -6F, 17F);

		bodyModel[23].addBox(0F, 0F, 0F, 14, 7, 6, 0F);
		bodyModel[23].setRotationPoint(31F, -6F, 17F);

		bodyModel[24].addBox(0F, 0F, 0F, 9, 9, 6, 0F);
		bodyModel[24].setRotationPoint(42F, -16F, -23F);

		bodyModel[25].addBox(0F, 0F, 0F, 4, 4, 6, 0F);
		bodyModel[25].setRotationPoint(36F, -16F, -23F);

		bodyModel[26].addBox(0F, 0F, 0F, 4, 4, 6, 0F);
		bodyModel[26].setRotationPoint(16F, -16F, -23F);

		bodyModel[27].addBox(0F, 0F, 0F, 4, 4, 6, 0F);
		bodyModel[27].setRotationPoint(-4F, -16F, -23F);

		bodyModel[28].addBox(0F, 0F, 0F, 4, 4, 6, 0F);
		bodyModel[28].setRotationPoint(-24F, -16F, -23F);

		bodyModel[29].addBox(-1F, 0F, 0F, 8, 8, 6, 0F);
		bodyModel[29].setRotationPoint(-38F, -14F, -23F);

		bodyModel[30].addBox(0F, 0F, 0F, 14, 7, 6, 0F);
		bodyModel[30].setRotationPoint(-29F, -6F, -23F);

		bodyModel[31].addBox(0F, 0F, 0F, 14, 7, 6, 0F);
		bodyModel[31].setRotationPoint(-9F, -6F, -23F);

		bodyModel[32].addBox(0F, 0F, 0F, 14, 7, 6, 0F);
		bodyModel[32].setRotationPoint(11F, -6F, -23F);

		bodyModel[33].addBox(0F, 0F, 0F, 14, 7, 6, 0F);
		bodyModel[33].setRotationPoint(31F, -6F, -23F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 9, 34, 0F);
		bodyModel[34].setRotationPoint(35F, -27F, -17F);

		bodyModel[35].addBox(0F, 0F, 0F, 16, 1, 34, 0F);
		bodyModel[35].setRotationPoint(35F, -18F, -17F);
		bodyModel[35].rotateAngleZ = -0.1745329F;

		bodyModel[36].addBox(0F, 0F, 0F, 1, 7, 34, 0F);
		bodyModel[36].setRotationPoint(50F, -15F, -17F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 8, 32, 0F);
		bodyModel[37].setRotationPoint(43F, -5F, -16F);
		bodyModel[37].rotateAngleZ = 1.937315F;

		bodyModel[38].addBox(0F, 0F, 0F, 1, 7, 44, 0F);
		bodyModel[38].setRotationPoint(-36F, -26F, -22F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 11, 32, 0F);
		bodyModel[39].setRotationPoint(-36F, -19F, -16F);
		bodyModel[39].rotateAngleZ = 0.1396263F;

		bodyModel[40].addBox(0F, 0F, 0F, 1, 7, 32, 0F);
		bodyModel[40].setRotationPoint(-27.5F, -6F, -16F);
		bodyModel[40].rotateAngleZ = -2.024582F;

		bodyModel[41].addBox(0F, 0F, 0F, 71, 1, 34, 0F);
		bodyModel[41].setRotationPoint(-28F, -6F, -17F);

		bodyModel[42].addBox(0F, 0F, 0F, 50, 1, 32, 0F);
		bodyModel[42].setRotationPoint(-35F, -27F, -16F);

		bodyModel[43].addBox(0F, 0F, 0F, 20, 1, 34, 0F);
		bodyModel[43].setRotationPoint(15F, -27F, -17F);

		bodyModel[44].addBox(0F, 0F, 0F, 90, 13, 1, 0F);
		bodyModel[44].setRotationPoint(-39F, -19F, 16F);

		bodyModel[45].addBox(0F, 0F, 0F, 50, 8, 6, 0F);
		bodyModel[45].setRotationPoint(-35F, -27F, 16F);

		bodyModel[46].addBox(0F, 0F, 0F, 21, 6, 8, 0F); //Seite
		bodyModel[46].setRotationPoint(15F, -27F, 22F);
		bodyModel[46].rotateAngleX = -1.570796F;
		bodyModel[46].rotateAngleY = -0.2443461F;

		bodyModel[47].addBox(0F, 0F, 0F, 90, 13, 1, 0F);
		bodyModel[47].setRotationPoint(-39F, -19F, -17F);

		bodyModel[48].addBox(0F, 0F, 0F, 50, 8, 6, 0F);
		bodyModel[48].setRotationPoint(-35F, -27F, -22F);

		bodyModel[49].addBox(0F, 0F, 0F, 21, 8, 6, 0F); //
		bodyModel[49].setRotationPoint(15F, -27F, -22F);
		bodyModel[49].rotateAngleY = 0.2443461F;

		bodyModel[50].addBox(0F, 0F, 0F, 90, 1, 7, 0F);
		bodyModel[50].setRotationPoint(-39F, -19F, 17F);

		bodyModel[51].addBox(0F, 0F, 0F, 7, 1, 8, 0F);
		bodyModel[51].setRotationPoint(51F, -19F, 16F);
		bodyModel[51].rotateAngleZ = -0.6981317F;

		bodyModel[52].addBox(0F, 0F, 0F, 1, 7, 8, 0F);
		bodyModel[52].setRotationPoint(-39F, -19F, 16F);
		bodyModel[52].rotateAngleZ = -0.6981317F;

		bodyModel[53].addBox(0F, 0F, 0F, 90, 1, 7, 0F);
		bodyModel[53].setRotationPoint(-39F, -19F, -24F);

		bodyModel[54].addBox(0F, 0F, 0F, 7, 1, 8, 0F);
		bodyModel[54].setRotationPoint(51F, -19F, -24F);
		bodyModel[54].rotateAngleZ = -0.6981317F;

		bodyModel[55].addBox(0F, 0F, 0F, 1, 7, 8, 0F);
		bodyModel[55].setRotationPoint(-39F, -19F, -24F);
		bodyModel[55].rotateAngleZ = -0.6981317F;

		bodyModel[56].addBox(0F, 0F, 0F, 1, 1, 12, 0F);
		bodyModel[56].setRotationPoint(36F, -26F, 3F);

		bodyModel[57].addBox(0F, 0F, 0F, 5, 5, 20, 0F);
		bodyModel[57].setRotationPoint(-40F, -18F, -13F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 5, 5, 0F);
		bodyModel[58].setRotationPoint(36F, -25F, -13F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 3, 3, 0F);
		bodyModel[59].setRotationPoint(37F, -24F, -12F);

		bodyModel[60].addBox(0F, 0F, 0F, 5, 1, 1, 0F);
		bodyModel[60].setRotationPoint(38F, -23F, -11F);



		
		turretModel = new ModelRendererTurbo[4];
     	turretModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
     	turretModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);		
     	turretModel[2] = new ModelRendererTurbo(this, 194, 457, textureX, textureY);		
     	turretModel[3] = new ModelRendererTurbo(this, 0, 305, textureX, textureY);
					


		turretModel[0].addBox(-23F, -39F, -7F, 2, 10, 14, 0F);

		turretModel[1].addBox(-21F, -39F, -9F, 11, 10, 18, 0F);
		
		turretModel[2].addTrapezoid(-15F, -39F, -16F, 30, 12, 32, 0.0F, -3.0F, ModelRendererTurbo.MR_TOP);

		turretModel[3].addBox(-7F, -41F, -7F, 14, 2, 14, 0F);

		
		barrelModel = new ModelRendererTurbo[6];
     	barrelModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
     	barrelModel[1] = new ModelRendererTurbo(this, 0, 301, textureX, textureY);
     	barrelModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
     	barrelModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
     	barrelModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
     	barrelModel[5] = new ModelRendererTurbo(this, 131, 470, textureX, textureY);		

		barrelModel[0].addBox(0F, 0F, 0F, 8, 6, 14, 0F);
		barrelModel[0].setRotationPoint(11F, -36F, -7F);

		barrelModel[1].addBox(8F, 2.5F, 2F, 5, 1, 1, 0F);
		barrelModel[1].setRotationPoint(11F, -36F, -7F);

		barrelModel[2].addBox(8F, 1F, 5F, 7, 4, 4, 0F);
		barrelModel[2].setRotationPoint(11F, -36F, -7F);

		barrelModel[3].addBox(15F, 1.5F, 5.5F, 7, 3, 3, 0F);
		barrelModel[3].setRotationPoint(11F, -36F, -7F);

		barrelModel[4].addBox(22F, 2F, 6F, 29, 2, 2, 0F);
		barrelModel[4].setRotationPoint(11F, -36F, -7F);

		barrelModel[5].addBox(45F, 1.5F, 5.5F, 7, 3, 3, 0F);
		barrelModel[5].setRotationPoint(11F, -36F, -7F);
	


		
		//This should be defined even when not used.
		/*gunModel = new ModelRendererTurbo[0];
		ammoModel = new ModelRendererTurbo[0];
		leftFrontWheelModel = new ModelRendererTurbo[0];	
		leftBackWheelModel = new ModelRendererTurbo[0];	
		rightFrontWheelModel = new ModelRendererTurbo[0];	
		rightBackWheelModel = new ModelRendererTurbo[0];*/
		
		flipAll(); //For old models
		translateAll(-8, -8, 0);
		
		/*collisionBoxes = new CollisionBox[5];
		collisionBoxes[0] = new CollisionBox(-16, 8, -30, 0);
 		collisionBoxes[1] = new CollisionBox(16, 8, -30, 0);
 		collisionBoxes[2] = new CollisionBox(16, 8, 30, 0);
 		collisionBoxes[3] = new CollisionBox(-16, 8, 30, 0);
		collisionBoxes[4] = new CollisionBox(0, 32, 0, 4);*/
    }
}
