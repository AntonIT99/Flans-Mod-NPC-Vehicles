package com.wolffsmod.model;

import com.flansmod.client.model.ModelAAGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.wolffsmod.entity.EntityFlanAAGunNPC;

import net.minecraft.entity.Entity;

public abstract class ModelFlanAAGun extends ModelAAGun
{
    public ModelFlanAAGun() {}

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        EntityFlanAAGunNPC aagun = ((EntityFlanAAGunNPC) entity);

        for (ModelRendererTurbo aBaseModel : baseModel)
        {
            aBaseModel.render(f5);
        }

        for (ModelRendererTurbo aSeatModel : seatModel)
        {
            aSeatModel.render(f5);
        }

        for (ModelRendererTurbo aGunModel : gunModel)
        {
            aGunModel.setPosition(barrelX, barrelY, barrelZ);
            aGunModel.rotateAngleZ = -aagun.driver.getPitch() / 180F * (float) Math.PI;
            aGunModel.render(f5);
        }

        for (ModelRendererTurbo aGunsightModel : gunsightModel)
        {
            aGunsightModel.rotateAngleZ = -aagun.driver.getPitch() / 180F * (float) Math.PI;
            aGunsightModel.render(f5);
        }

        for(int i = 0; i < barrelModel.length; i++)
        {
            for(int j = 0; j < barrelModel[i].length; j++)
            {
                barrelModel[i][j].setPosition(-aagun.barrelRecoil[i] * (float)(Math.cos(-aagun.driver.getPitch() * (float) Math.PI / 180F)) + barrelX, - aagun.barrelRecoil[i] * (float)(Math.sin(-aagun.driver.getPitch() * (float) Math.PI / 180F)) + barrelY, barrelZ);
                barrelModel[i][j].rotateAngleZ = -aagun.driver.getPitch() / 180F * (float) Math.PI;
                barrelModel[i][j].render(f5);
            }
        }

        for(int i = 0; i < ammoModel.length; i++)
        {
            if(i < aagun.hasAmmo.length && aagun.hasAmmo[i])
            {
                for(int j = 0; j < ammoModel[i].length; j++)
                {
                    ammoModel[i][j].setPosition(barrelX, barrelY, barrelZ);
                    ammoModel[i][j].rotateAngleZ = -aagun.driver.getPitch() / 180F * (float) Math.PI;
                    ammoModel[i][j].render(f5);
                }
            }
        }
    }
}
