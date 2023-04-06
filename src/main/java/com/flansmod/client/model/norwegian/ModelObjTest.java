package com.flansmod.client.model.norwegian;

import net.minecraft.entity.Entity;

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelObjTest extends ModelPlane

{
public ModelObjTest()
	{

	int textureX = 256;
	int textureY = 128;

		bodyModel = new ModelRendererTurbo[1];
		//ammoModel = new ModelRendererTurbo[1];

  		bodyModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // barrel1
  		bodyModel[0].addObj("/Tyrants and Plebeians/assets/flansmod/models/Girl_Lili.obj");
  		bodyModel[0].setRotationPoint(3.5F, 2F, 0F);

  		//ammoModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // barrel1
  		//ammoModel[0].addObj("/Modern Weapons Pack/assets/flansmod/models/UKM2013_magazine.obj");
  		//ammoModel[0].setRotationPoint(3.5F, 2F, 0F);

		//animationType = EnumAnimationType.BOTTOM_CLIP;
		//numBulletsInReloadAnimation = 1;
		//tiltGunTime = 0.279F;
		//unloadClipTime = 0.0F;
		//loadClipTime = 0.6F;
		//untiltGunTime = 0.163F;

		translateAll(-3.5F, -1.8F, 0F);

		//flipAll();
	}
@Override
public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
{
	//GL11.glScalef(0.5F, 0.5F, 0.5F);
	for(ModelRendererTurbo mrt : bodyModel)
		mrt.render(1F);
}
}
