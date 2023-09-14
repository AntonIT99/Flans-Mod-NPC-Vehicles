//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.manus.sifi;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelImperialThrone extends ModelFlanAAGun
{
    int textureX;
    int textureY;
    
    public ModelImperialThrone() {
        this.textureX = 128;
        this.textureY = 128;
        (this.baseModel = new ModelRendererTurbo[4])[0] = new ModelRendererTurbo((ModelBase)this, 0, 99, this.textureX, this.textureY);
        this.baseModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 82, this.textureX, this.textureY);
        this.baseModel[2] = new ModelRendererTurbo((ModelBase)this, 58, 90, this.textureX, this.textureY);
        this.baseModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 99, this.textureX, this.textureY);
        this.baseModel[0].addBox(0.0f, 0.0f, 0.0f, 26, 1, 26, 0.0f);
        this.baseModel[0].setRotationPoint(-13.0f, -1.0f, -13.0f);
        this.baseModel[1].addTrapezoid(0.0f, 0.0f, 0.0f, 14, 2, 14, 0.0f, -3.0f, 4);
        this.baseModel[1].setRotationPoint(-7.0f, -3.0f, -7.0f);
        this.baseModel[2].addTrapezoid(0.0f, 0.0f, 0.0f, 7, 1, 7, 0.0f, -1.5f, 4);
        this.baseModel[2].setRotationPoint(-3.5f, -4.0f, -3.5f);
        this.baseModel[3].addBox(0.0f, 0.0f, 0.0f, 4, 4, 4, 0.0f);
        this.baseModel[3].setRotationPoint(-2.0f, -8.0f, -2.0f);
        (this.seatModel = new ModelRendererTurbo[7])[0] = new ModelRendererTurbo((ModelBase)this, 0, 54, this.textureX, this.textureY);
        this.seatModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.seatModel[2] = new ModelRendererTurbo((ModelBase)this, 79, 0, this.textureX, this.textureY);
        this.seatModel[3] = new ModelRendererTurbo((ModelBase)this, 79, 18, this.textureX, this.textureY);
        this.seatModel[4] = new ModelRendererTurbo((ModelBase)this, 91, 59, this.textureX, this.textureY);
        this.seatModel[5] = new ModelRendererTurbo((ModelBase)this, 41, 0, this.textureX, this.textureY);
        this.seatModel[6] = new ModelRendererTurbo((ModelBase)this, 79, 36, this.textureX, this.textureY);
        this.seatModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 21, 3, 24, 0.0f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.seatModel[0].setRotationPoint(-8.0f, -11.0f, -12.0f);
        this.seatModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 6, 29, 24, 0.0f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.seatModel[1].setRotationPoint(-8.0f, -40.0f, -12.0f);
        this.seatModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 12, 8, 9, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -1.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.seatModel[2].setRotationPoint(1.0f, -19.0f, -15.0f);
        this.seatModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 12, 8, 9, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, -1.0f, -5.0f, 0.0f, -3.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f);
        this.seatModel[3].setRotationPoint(1.0f, -19.0f, 6.0f);
        this.seatModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 9, 8, 9, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.seatModel[4].setRotationPoint(-8.0f, -19.0f, -15.0f);
        this.seatModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 9, 8, 9, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f);
        this.seatModel[5].setRotationPoint(-8.0f, -19.0f, 6.0f);
        this.seatModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 7, 4, 17, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.4827586f, 0.0f, 0.0f, 0.4827586f, 0.0f, 0.0f, 0.4827586f, 0.0f, 0.0f, 0.4827586f);
        this.seatModel[6].setRotationPoint(-2.0f, -40.0f, -8.5f);
        this.gunModel = new ModelRendererTurbo[0];
        this.barrelModel = new ModelRendererTurbo[0][0];
        this.ammoModel = new ModelRendererTurbo[0][0];
        this.barrelX = 0;
        this.barrelY = 0;
        this.barrelZ = 0;
        this.flipAll();
    }
}
