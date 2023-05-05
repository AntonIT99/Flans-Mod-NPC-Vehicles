//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelGustav extends ModelFlanVehicle
{
    public ModelGustav() {
        final int textureX = 350;
        final int textureY = 300;
        (this.bodyModel = new ModelRendererTurbo[26])[0] = new ModelRendererTurbo((ModelBase)this, 0, 227, textureX, textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 227, textureX, textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 2, 164, textureX, textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 2, 164, textureX, textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 27, 198, textureX, textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 27, 198, textureX, textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 0, 71, textureX, textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 135, 44, textureX, textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 135, 44, textureX, textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 0, 0, textureX, textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 0, 0, textureX, textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 115, 23, textureX, textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 115, 23, textureX, textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 228, 0, textureX, textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 228, 0, textureX, textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 228, 0, textureX, textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 228, 0, textureX, textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 236, 0, textureX, textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 236, 0, textureX, textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 236, 0, textureX, textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 236, 0, textureX, textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 270, 0, textureX, textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 270, 0, textureX, textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 0, 21, textureX, textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 0, 21, textureX, textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 0, 0, textureX, textureY);
        this.bodyModel[0].addBox(0.0f, 0.0f, 0.0f, 7, 20, 20, 0.0f);
        this.bodyModel[0].setRotationPoint(-40.0f, 0.0f, 7.0f);
        this.bodyModel[0].rotateAngleX = -0.7853982f;
        this.bodyModel[0].rotateAngleY = 1.570796f;
        this.bodyModel[1].addBox(0.0f, 0.0f, 0.0f, 7, 20, 20, 0.0f);
        this.bodyModel[1].setRotationPoint(-40.0f, 0.0f, -13.0f);
        this.bodyModel[1].rotateAngleX = -0.7853982f;
        this.bodyModel[1].rotateAngleY = 1.570796f;
        this.bodyModel[2].addBox(0.0f, 0.0f, 0.0f, 39, 14, 9, 0.0f);
        this.bodyModel[2].setRotationPoint(-63.0f, 14.0f, -15.0f);
        this.bodyModel[3].addBox(0.0f, 0.0f, 0.0f, 39, 14, 9, 0.0f);
        this.bodyModel[3].setRotationPoint(-63.0f, 14.0f, 7.0f);
        this.bodyModel[4].addBox(0.0f, 0.0f, 0.0f, 59, 10, 9, 0.0f);
        this.bodyModel[4].setRotationPoint(-104.0f, 7.0f, -15.0f);
        this.bodyModel[5].addBox(0.0f, 0.0f, 0.0f, 59, 10, 9, 0.0f);
        this.bodyModel[5].setRotationPoint(-104.0f, 7.0f, 7.0f);
        this.bodyModel[6].addBox(0.0f, 0.0f, 0.0f, 1, 26, 13, 0.0f);
        this.bodyModel[6].setRotationPoint(-104.0f, 7.0f, -6.0f);
        this.bodyModel[7].addBox(0.0f, 0.0f, 0.0f, 22, 7, 9, 0.0f);
        this.bodyModel[7].setRotationPoint(-24.0f, 21.0f, 7.0f);
        this.bodyModel[7].rotateAngleZ = -0.2268928f;
        this.bodyModel[8].addBox(0.0f, 0.0f, 0.0f, 22, 7, 9, 0.0f);
        this.bodyModel[8].setRotationPoint(-24.0f, 21.0f, -15.0f);
        this.bodyModel[8].rotateAngleZ = -0.2268928f;
        this.bodyModel[9].addBox(0.0f, 0.0f, 0.0f, 102, 7, 9, 0.0f);
        this.bodyModel[9].setRotationPoint(-104.0f, 26.0f, -15.0f);
        this.bodyModel[10].addBox(0.0f, 0.0f, 0.0f, 102, 7, 9, 0.0f);
        this.bodyModel[10].setRotationPoint(-104.0f, 26.0f, 7.0f);
        this.bodyModel[11].addBox(0.0f, 0.0f, 0.0f, 41, 4, 11, 0.0f);
        this.bodyModel[11].setRotationPoint(-69.0f, 31.0f, 7.0f);
        this.bodyModel[12].addBox(0.0f, 0.0f, 0.0f, 41, 4, 11, 0.0f);
        this.bodyModel[12].setRotationPoint(-69.0f, 31.0f, -17.0f);
        this.bodyModel[13].addBox(0.0f, 0.0f, 0.0f, 1, 18, 1, 0.0f);
        this.bodyModel[13].setRotationPoint(-104.0f, -11.0f, -15.0f);
        this.bodyModel[14].addBox(0.0f, 0.0f, 0.0f, 1, 18, 1, 0.0f);
        this.bodyModel[14].setRotationPoint(-104.0f, -11.0f, 15.0f);
        this.bodyModel[15].addBox(0.0f, 0.0f, 0.0f, 1, 18, 1, 0.0f);
        this.bodyModel[15].setRotationPoint(-104.0f, -11.0f, 7.0f);
        this.bodyModel[16].addBox(0.0f, 0.0f, 0.0f, 1, 18, 1, 0.0f);
        this.bodyModel[16].setRotationPoint(-104.0f, -11.0f, -7.0f);
        this.bodyModel[17].addBox(0.0f, 0.0f, 0.0f, 1, 1, 9, 0.0f);
        this.bodyModel[17].setRotationPoint(-104.0f, -4.0f, 7.0f);
        this.bodyModel[18].addBox(0.0f, 0.0f, 0.0f, 1, 1, 9, 0.0f);
        this.bodyModel[18].setRotationPoint(-104.0f, -4.0f, -15.0f);
        this.bodyModel[19].addBox(0.0f, 0.0f, 0.0f, 1, 1, 9, 0.0f);
        this.bodyModel[19].setRotationPoint(-104.0f, -11.0f, 7.0f);
        this.bodyModel[20].addBox(0.0f, 0.0f, 0.0f, 1, 1, 9, 0.0f);
        this.bodyModel[20].setRotationPoint(-104.0f, -11.0f, -15.0f);
        this.bodyModel[21].addBox(0.0f, 0.0f, 0.0f, 15, 9, 9, 0.0f);
        this.bodyModel[21].setRotationPoint(-77.0f, 26.0f, 7.0f);
        this.bodyModel[21].rotateAngleZ = 0.3839724f;
        this.bodyModel[22].addBox(0.0f, 0.0f, 0.0f, 15, 9, 9, 0.0f);
        this.bodyModel[22].setRotationPoint(-77.0f, 26.0f, -15.0f);
        this.bodyModel[22].rotateAngleZ = 0.3839724f;
        this.bodyModel[23].addBox(0.0f, 0.0f, 0.0f, 10, 1, 9, 0.0f);
        this.bodyModel[23].setRotationPoint(-114.0f, 29.0f, -15.0f);
        this.bodyModel[24].addBox(0.0f, 0.0f, 0.0f, 10, 1, 9, 0.0f);
        this.bodyModel[24].setRotationPoint(-114.0f, 29.0f, 7.0f);
        this.bodyModel[25].addBox(0.0f, 0.0f, 0.0f, 20, 12, 13, 0.0f);
        this.bodyModel[25].setRotationPoint(-50.0f, 14.0f, -6.0f);
        this.leftBackWheelModel = new ModelRendererTurbo[1];
        (this.leftBackWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 110, 65, textureX, textureY)).addBox(0.0f, 0.0f, 0.0f, 35, 8, 11, 0.0f);
        this.leftBackWheelModel[0].setRotationPoint(-104.0f, 30.0f, -17.0f);
        this.rightBackWheelModel = new ModelRendererTurbo[1];
        (this.rightBackWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 110, 65, textureX, textureY)).addBox(0.0f, 0.0f, 0.0f, 35, 8, 11, 0.0f);
        this.rightBackWheelModel[0].setRotationPoint(-104.0f, 30.0f, 7.0f);
        this.leftFrontWheelModel = new ModelRendererTurbo[1];
        (this.leftFrontWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 110, 65, textureX, textureY)).addBox(0.0f, 0.0f, 0.0f, 35, 8, 11, 0.0f);
        this.leftFrontWheelModel[0].setRotationPoint(-28.0f, 30.0f, -17.0f);
        this.rightFrontWheelModel = new ModelRendererTurbo[1];
        (this.rightFrontWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 110, 65, textureX, textureY)).addBox(0.0f, 0.0f, 0.0f, 35, 8, 11, 0.0f);
        this.rightFrontWheelModel[0].setRotationPoint(-28.0f, 30.0f, 7.0f);
        final ModelRendererTurbo[][] BigAssGunModel = { new ModelRendererTurbo[0], new ModelRendererTurbo[5], null };
        BigAssGunModel[1][0] = new ModelRendererTurbo((ModelBase)this, 190, 250, textureX, textureY);
        BigAssGunModel[1][1] = new ModelRendererTurbo((ModelBase)this, 65, 34, textureX, textureY);
        BigAssGunModel[1][2] = new ModelRendererTurbo((ModelBase)this, 180, 200, textureX, textureY);
        BigAssGunModel[1][3] = new ModelRendererTurbo((ModelBase)this, 0, 36, textureX, textureY);
        BigAssGunModel[1][4] = new ModelRendererTurbo((ModelBase)this, 137, 114, textureX, textureY);
        BigAssGunModel[1][0].addBox(46.0f, -4.5f, -2.5f, 55, 6, 6, 0.0f);
        BigAssGunModel[1][1].addBox(38.0f, -5.0f, -3.0f, 22, 7, 7, 0.0f);
        BigAssGunModel[1][2].addBox(-21.0f, -6.0f, -4.0f, 60, 9, 9, 0.0f);
        BigAssGunModel[1][3].addBox(-20.0f, -7.0f, -5.0f, 32, 11, 11, 0.0f);
        BigAssGunModel[1][4].addBox(-32.0f, -6.0f, -5.5f, 12, 11, 11, 0.0f);
        for (final ModelRendererTurbo gunPart : BigAssGunModel[1]) {
            gunPart.setRotationPoint(-40.0f, 2.0f, 1.0f);
        }
        BigAssGunModel[2] = new ModelRendererTurbo[0];
        this.registerGunModel("BigAssGun", BigAssGunModel);
        this.flipAll();
        this.translateAll(30, 35, 0);
    }
}
