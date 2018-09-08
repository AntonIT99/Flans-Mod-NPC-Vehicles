// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.ai;

import java.util.Random;
import net.minecraft.util.Vec3;
import net.minecraft.util.MathHelper;
import noppes.npcs.constants.AiMutex;
import net.minecraft.world.World;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAIMoveIndoors extends EntityAIBase
{
    private EntityCreature theCreature;
    private double shelterX;
    private double shelterY;
    private double shelterZ;
    private World theWorld;
    
    public EntityAIMoveIndoors(final EntityCreature par1EntityCreature) {
        this.theCreature = par1EntityCreature;
        this.theWorld = par1EntityCreature.worldObj;
        this.setMutexBits((int)AiMutex.PASSIVE);
    }
    
    public boolean shouldExecute() {
        final int x = MathHelper.floor_double(this.theCreature.posX);
        final int y = (int)this.theCreature.boundingBox.minY;
        final int z = MathHelper.floor_double(this.theCreature.posZ);
        if ((this.theCreature.worldObj.isDaytime() && !this.theCreature.worldObj.isRaining()) || this.theCreature.worldObj.provider.hasNoSky) {
            return false;
        }
        if (!this.theWorld.canBlockSeeTheSky(x, y, z) && this.theWorld.getFullBlockLightValue(x, y, z) > 8) {
            return false;
        }
        final Vec3 var1 = this.findPossibleShelter();
        if (var1 == null) {
            return false;
        }
        this.shelterX = var1.xCoord;
        this.shelterY = var1.yCoord;
        this.shelterZ = var1.zCoord;
        return true;
    }
    
    public boolean continueExecuting() {
        return !this.theCreature.getNavigator().noPath();
    }
    
    public void startExecuting() {
        this.theCreature.getNavigator().tryMoveToXYZ(this.shelterX, this.shelterY, this.shelterZ, 1.0);
    }
    
    private Vec3 findPossibleShelter() {
        final Random var1 = this.theCreature.getRNG();
        for (int var2 = 0; var2 < 10; ++var2) {
            final int var3 = MathHelper.floor_double(this.theCreature.posX + var1.nextInt(20) - 10.0);
            final int var4 = MathHelper.floor_double(this.theCreature.boundingBox.minY + var1.nextInt(6) - 3.0);
            final int var5 = MathHelper.floor_double(this.theCreature.posZ + var1.nextInt(20) - 10.0);
            if (!this.theWorld.canBlockSeeTheSky(var3, var4, var5) && this.theWorld.getFullBlockLightValue(var3, var4, var5) > 8) {
                return Vec3.createVectorHelper((double)var3, (double)var4, (double)var5);
            }
        }
        return null;
    }
}
