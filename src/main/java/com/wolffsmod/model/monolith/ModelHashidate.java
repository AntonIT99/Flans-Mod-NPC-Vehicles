//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelHashidate extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelHashidate() {
        this.textureX = 2048;
        this.textureY = 2048;
        (this.bodyModel = new ModelRendererTurbo[37])[0] = new ModelRendererTurbo((ModelBase)this, 800, 1750, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 850, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 600, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 1700, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 1300, 1800, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 1250, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 0, 1250, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 0, 1450, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 0, 1450, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 0, 1000, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 400, 1000, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 800, 1900, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 800, 1900, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 800, 1500, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 1600, 1000, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 1800, 600, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 1800, 600, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 1750, 750, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 1800, 1200, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 1600, 1200, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 1400, 1400, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 1400, 1700, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 800, 1200, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 800, 1000, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 950, 850, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[0].addBox(0.0f, 0.0f, 0.0f, 160, 52, 40, 0.0f);
        this.bodyModel[0].setRotationPoint(-160.0f, -20.0f, -20.0f);
        this.bodyModel[1].addBox(0.0f, 0.0f, 0.0f, 400, 90, 20, 0.0f);
        this.bodyModel[1].setRotationPoint(760.0f, -58.0f, -10.0f);
        this.bodyModel[2].addBox(0.0f, 0.0f, 0.0f, 560, 52, 160, 0.0f);
        this.bodyModel[2].setRotationPoint(0.0f, -20.0f, -80.0f);
        this.bodyModel[3].addBox(0.0f, 0.0f, 0.0f, 200, 90, 160, 0.0f);
        this.bodyModel[3].setRotationPoint(560.0f, -58.0f, -80.0f);
        this.bodyModel[4].addBox(0.0f, 0.0f, 0.0f, 225, 45, 100, 0.0f);
        this.bodyModel[4].setRotationPoint(570.0f, -103.0f, -50.0f);
        this.bodyModel[5].addBox(-180.0f, 0.0f, -10.0f, 180, 90, 20, 0.0f);
        this.bodyModel[5].setRotationPoint(1157.0f, -58.0f, 0.0f);
        this.bodyModel[5].rotateAngleY = -0.2617994f;
        this.bodyModel[6].addBox(-180.0f, 0.0f, -10.0f, 180, 90, 20, 0.0f);
        this.bodyModel[6].setRotationPoint(1157.0f, -58.0f, 0.0f);
        this.bodyModel[6].rotateAngleY = 0.2617994f;
        this.bodyModel[7].addBox(-235.0f, 0.0f, -60.0f, 230, 90, 70, 0.0f);
        this.bodyModel[7].setRotationPoint(990.0f, -58.0f, 46.0f);
        this.bodyModel[7].rotateAngleY = -0.1047198f;
        this.bodyModel[8].addBox(-235.0f, 0.0f, -10.0f, 230, 90, 70, 0.0f);
        this.bodyModel[8].setRotationPoint(990.0f, -58.0f, -46.0f);
        this.bodyModel[8].rotateAngleY = 0.1047198f;
        this.bodyModel[9].addBox(0.0f, 0.0f, 0.0f, 60, 90, 80, 0.0f);
        this.bodyModel[9].setRotationPoint(978.0f, -58.0f, -40.0f);
        this.bodyModel[10].addBox(0.0f, 0.0f, 0.0f, 45, 90, 60, 0.0f);
        this.bodyModel[10].setRotationPoint(1038.0f, -58.0f, -30.0f);
        this.bodyModel[11].addBox(0.0f, 0.0f, -20.0f, 171, 52, 40, 0.0f);
        this.bodyModel[11].setRotationPoint(-153.0f, -20.0f, 0.0f);
        this.bodyModel[11].rotateAngleY = 0.3665192f;
        this.bodyModel[12].addBox(0.0f, 0.0f, -20.0f, 171, 52, 40, 0.0f);
        this.bodyModel[12].setRotationPoint(-153.0f, -20.0f, 0.0f);
        this.bodyModel[12].rotateAngleY = -0.3665192f;
        this.bodyModel[13].addBox(0.0f, 0.0f, 0.0f, 50, 52, 80, 0.0f);
        this.bodyModel[13].setRotationPoint(-50.0f, -20.0f, -40.0f);
        this.bodyModel[14].addBox(0.0f, 0.0f, 0.0f, 70, 22, 120, 0.0f);
        this.bodyModel[14].setRotationPoint(560.0f, -125.0f, -60.0f);
        this.bodyModel[15].addBox(0.0f, 0.0f, -35.0f, 80, 58, 35, 0.0f);
        this.bodyModel[15].setRotationPoint(625.0f, -160.0f, 50.0f);
        this.bodyModel[15].rotateAngleY = -0.3141593f;
        this.bodyModel[16].addBox(0.0f, 0.0f, 0.0f, 80, 58, 35, 0.0f);
        this.bodyModel[16].setRotationPoint(625.0f, -160.0f, -50.0f);
        this.bodyModel[16].rotateAngleY = 0.3141593f;
        this.bodyModel[17].addBox(0.0f, 0.0f, 0.0f, 80, 58, 50, 0.0f);
        this.bodyModel[17].setRotationPoint(622.0f, -160.0f, -25.0f);
        this.bodyModel[18].addBox(-21.0f, 0.0f, -21.0f, 42, 28, 42, 0.0f);
        this.bodyModel[18].setRotationPoint(620.0f, -188.0f, 0.0f);
        this.bodyModel[19].addBox(0.0f, -8.0f, 0.0f, 34, 46, 32, 0.0f);
        this.bodyModel[19].setRotationPoint(595.0f, -161.0f, -16.0f);
        this.bodyModel[19].rotateAngleZ = -0.3717861f;
        this.bodyModel[20].addBox(0.0f, 0.0f, 0.0f, 8, 400, 8, 0.0f);
        this.bodyModel[20].setRotationPoint(550.0f, -500.0f, -4.0f);
        this.bodyModel[20].rotateAngleZ = 0.05235988f;
        this.bodyModel[21].addBox(-2.5f, -2.0f, -6.0f, 12, 30, 12, 0.0f);
        this.bodyModel[21].setRotationPoint(550.0f, -500.0f, 0.0f);
        this.bodyModel[21].rotateAngleZ = 0.05235988f;
        this.bodyModel[22].addBox(0.0f, 50.0f, 0.0f, 10, 10, 120, 0.0f);
        this.bodyModel[22].setRotationPoint(563.0f, -400.0f, -60.0f);
        this.bodyModel[22].rotateAngleZ = 0.05235988f;
        this.bodyModel[23].addBox(-2.0f, 0.0f, 0.0f, 10, 8, 50, 0.0f);
        this.bodyModel[23].setRotationPoint(560.0f, -375.0f, 0.0f);
        this.bodyModel[23].rotateAngleX = 0.1396263f;
        this.bodyModel[23].rotateAngleY = 0.3490658f;
        this.bodyModel[23].rotateAngleZ = -0.3490658f;
        this.bodyModel[24].addBox(-2.0f, 0.0f, -50.0f, 10, 8, 50, 0.0f);
        this.bodyModel[24].setRotationPoint(560.0f, -375.0f, 0.0f);
        this.bodyModel[24].rotateAngleX = -0.1396263f;
        this.bodyModel[24].rotateAngleY = -0.3490658f;
        this.bodyModel[24].rotateAngleZ = -0.3490658f;
        this.bodyModel[25].addBox(0.0f, 66.0f, 0.0f, 10, 6, 70, 0.0f);
        this.bodyModel[25].setRotationPoint(557.0f, -500.0f, -35.0f);
        this.bodyModel[25].rotateAngleZ = 0.05235988f;
        this.bodyModel[26].addBox(-4.0f, 0.0f, -4.0f, 8, 350, 8, 0.0f);
        this.bodyModel[26].setRotationPoint(560.0f, -350.0f, 0.0f);
        this.bodyModel[26].rotateAngleX = -0.1570796f;
        this.bodyModel[26].rotateAngleZ = -0.1570796f;
        this.bodyModel[27].addBox(-4.0f, 0.0f, -4.0f, 8, 350, 8, 0.0f);
        this.bodyModel[27].setRotationPoint(560.0f, -350.0f, 0.0f);
        this.bodyModel[27].rotateAngleX = 0.1570796f;
        this.bodyModel[27].rotateAngleZ = -0.1570796f;
        this.bodyModel[28].addBox(0.0f, 0.0f, 0.0f, 40, 160, 30, 0.0f);
        this.bodyModel[28].setRotationPoint(430.0f, -170.0f, -15.0f);
        this.bodyModel[28].rotateAngleZ = 0.03490658f;
        this.bodyModel[29].addBox(0.0f, 0.0f, 0.0f, 100, 30, 40, 0.0f);
        this.bodyModel[29].setRotationPoint(380.0f, -48.0f, -20.0f);
        this.bodyModel[30].addBox(0.0f, 0.0f, 0.0f, 120, 50, 85, 0.0f);
        this.bodyModel[30].setRotationPoint(260.0f, -70.0f, -42.5f);
        this.bodyModel[31].addBox(0.0f, 0.0f, 0.0f, 100, 50, 85, 0.0f);
        this.bodyModel[31].setRotationPoint(100.0f, -70.0f, -42.5f);
        this.bodyModel[32].addBox(0.0f, 0.0f, 0.0f, 60, 50, 60, 0.0f);
        this.bodyModel[32].setRotationPoint(200.0f, -70.0f, -30.0f);
        this.bodyModel[33].addBox(-350.0f, 0.0f, 0.0f, 8, 330, 8, 0.0f);
        this.bodyModel[33].setRotationPoint(550.0f, -410.0f, -4.0f);
        this.bodyModel[33].rotateAngleZ = 0.05235988f;
        this.bodyModel[34].addBox(0.0f, 0.0f, 0.0f, 10, 10, 100, 0.0f);
        this.bodyModel[34].setRotationPoint(200.0f, -345.0f, -50.0f);
        this.bodyModel[34].rotateAngleZ = 0.05235988f;
        this.bodyModel[35].addBox(0.0f, -280.0f, 40.0f, 8, 207, 8, 0.0f);
        this.bodyModel[35].setRotationPoint(162.0f, 11.0f, 0.0f);
        this.bodyModel[35].rotateAngleX = 0.1570796f;
        this.bodyModel[35].rotateAngleZ = -0.1570796f;
        this.bodyModel[36].addBox(0.0f, -280.0f, -48.0f, 8, 207, 8, 0.0f);
        this.bodyModel[36].setRotationPoint(162.0f, 11.0f, 0.0f);
        this.bodyModel[36].rotateAngleX = -0.1570796f;
        this.bodyModel[36].rotateAngleZ = -0.1570796f;
        final ModelRendererTurbo[][] FrontGunModel = { new ModelRendererTurbo[1], null, null };
        (FrontGunModel[0][0] = new ModelRendererTurbo((ModelBase)this, 1850, 250, this.textureX, this.textureY)).addBox(-20.0f, 0.0f, -25.0f, 40, 36, 50, 0.0f);
        FrontGunModel[0][0].setRotationPoint(940.0f, -95.0f, 0.0f);
        for (final ModelRendererTurbo FrontGunPart : FrontGunModel[0]) {
            FrontGunPart.setRotationPoint(940.0f, -95.0f, 0.0f);
        }
        (FrontGunModel[1] = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 1900, 350, this.textureX, this.textureY);
        FrontGunModel[1][1] = new ModelRendererTurbo((ModelBase)this, 1900, 350, this.textureX, this.textureY);
        FrontGunModel[1][0].addBox(-25.0f, -2.5f, -10.0f, 80, 5, 5, 0.0f);
        FrontGunModel[1][0].setRotationPoint(940.0f, -81.0f, 0.0f);
        FrontGunModel[1][1].addBox(-25.0f, -2.5f, 5.0f, 80, 5, 5, 0.0f);
        FrontGunModel[1][1].setRotationPoint(940.0f, -81.0f, 0.0f);
        for (final ModelRendererTurbo FrontGunPart : FrontGunModel[1]) {
            FrontGunPart.setRotationPoint(940.0f, -81.0f, 0.0f);
        }
        (FrontGunModel[2] = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 1900, 350, this.textureX, this.textureY);
        FrontGunModel[2][1] = new ModelRendererTurbo((ModelBase)this, 1900, 350, this.textureX, this.textureY);
        FrontGunModel[2][0].addBox(-25.0f, -2.5f, -10.0f, 80, 5, 5, 0.0f);
        FrontGunModel[2][0].setRotationPoint(940.0f, -81.0f, 0.0f);
        FrontGunModel[2][1].addBox(-25.0f, -2.5f, 5.0f, 80, 5, 5, 0.0f);
        FrontGunModel[2][1].setRotationPoint(940.0f, -81.0f, 0.0f);
        for (final ModelRendererTurbo FrontGunPart : FrontGunModel[2]) {
            FrontGunPart.setRotationPoint(940.0f, -81.0f, 0.0f);
        }
        this.registerGunModel("FrontGun", FrontGunModel);
        final ModelRendererTurbo[][] AAGUN2Model = { new ModelRendererTurbo[1], null, null };
        (AAGUN2Model[0][0] = new ModelRendererTurbo((ModelBase)this, 1900, 150, this.textureX, this.textureY)).addBox(-10.0f, 0.0f, -15.0f, 20, 20, 30, 0.0f);
        AAGUN2Model[0][0].setRotationPoint(150.0f, -90.0f, 0.0f);
        for (final ModelRendererTurbo AAGUN2Part : AAGUN2Model[0]) {
            AAGUN2Part.setRotationPoint(150.0f, -90.0f, 0.0f);
        }
        AAGUN2Model[1] = new ModelRendererTurbo[1];
        (AAGUN2Model[1][0] = new ModelRendererTurbo((ModelBase)this, 1900, 100, this.textureX, this.textureY)).addBox(-12.0f, -1.0f, -1.0f, 40, 2, 2, 0.0f);
        AAGUN2Model[1][0].setRotationPoint(150.0f, -80.0f, 0.0f);
        for (final ModelRendererTurbo AAGUN2Part : AAGUN2Model[1]) {
            AAGUN2Part.setRotationPoint(150.0f, -80.0f, 0.0f);
        }
        AAGUN2Model[2] = new ModelRendererTurbo[1];
        (AAGUN2Model[2][0] = new ModelRendererTurbo((ModelBase)this, 1900, 100, this.textureX, this.textureY)).addBox(-12.0f, -1.0f, -1.0f, 40, 2, 2, 0.0f);
        AAGUN2Model[2][0].setRotationPoint(150.0f, -80.0f, 0.0f);
        for (final ModelRendererTurbo AAGUN2Part : AAGUN2Model[2]) {
            AAGUN2Part.setRotationPoint(150.0f, -80.0f, 0.0f);
        }
        this.registerGunModel("AAGunTwo", AAGUN2Model);
        final ModelRendererTurbo[][] AAGUN1Model = { new ModelRendererTurbo[1], null, null };
        (AAGUN1Model[0][0] = new ModelRendererTurbo((ModelBase)this, 1900, 150, this.textureX, this.textureY)).addBox(-10.0f, 0.0f, -15.0f, 20, 20, 30, 0.0f);
        AAGUN1Model[0][0].setRotationPoint(751.0f, -123.0f, 0.0f);
        for (final ModelRendererTurbo AAGUN1Part : AAGUN1Model[0]) {
            AAGUN1Part.setRotationPoint(751.0f, -123.0f, 0.0f);
        }
        AAGUN1Model[1] = new ModelRendererTurbo[1];
        (AAGUN1Model[1][0] = new ModelRendererTurbo((ModelBase)this, 1900, 100, this.textureX, this.textureY)).addBox(-12.0f, -1.0f, -1.0f, 40, 2, 2, 0.0f);
        AAGUN1Model[1][0].setRotationPoint(751.0f, -113.0f, 0.0f);
        for (final ModelRendererTurbo AAGUN1Part : AAGUN1Model[1]) {
            AAGUN1Part.setRotationPoint(751.0f, -113.0f, 0.0f);
        }
        AAGUN1Model[2] = new ModelRendererTurbo[1];
        (AAGUN1Model[2][0] = new ModelRendererTurbo((ModelBase)this, 1900, 100, this.textureX, this.textureY)).addBox(-12.0f, -1.0f, -1.0f, 40, 2, 2, 0.0f);
        AAGUN1Model[2][0].setRotationPoint(751.0f, -113.0f, 0.0f);
        for (final ModelRendererTurbo AAGUN1Part : AAGUN1Model[2]) {
            AAGUN1Part.setRotationPoint(751.0f, -113.0f, 0.0f);
        }
        this.registerGunModel("AAGunOne", AAGUN1Model);
        this.turretModel = new ModelRendererTurbo[1];
        (this.turretModel[0] = new ModelRendererTurbo((ModelBase)this, 1850, 250, this.textureX, this.textureY)).addBox(-20.0f, 0.0f, -25.0f, 40, 36, 50, 0.0f);
        this.turretModel[0].setRotationPoint(0.0f, -56.0f, 0.0f);
        (this.barrelModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 1900, 350, this.textureX, this.textureY);
        this.barrelModel[1] = new ModelRendererTurbo((ModelBase)this, 1900, 350, this.textureX, this.textureY);
        this.barrelModel[0].addBox(-25.0f, -2.5f, -10.0f, 80, 5, 5, 0.0f);
        this.barrelModel[0].setRotationPoint(0.0f, -42.0f, 0.0f);
        this.barrelModel[1].addBox(-25.0f, -2.5f, 5.0f, 80, 5, 5, 0.0f);
        this.barrelModel[1].setRotationPoint(0.0f, -42.0f, 0.0f);
        this.translateAll(0, 0, 0);
        this.flipAll();
    }
}
