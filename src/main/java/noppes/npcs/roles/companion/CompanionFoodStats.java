// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.roles.companion;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.EnumDifficulty;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;

public class CompanionFoodStats
{
    private int foodLevel;
    private float foodSaturationLevel;
    private float foodExhaustionLevel;
    private int foodTimer;
    private int prevFoodLevel;
    
    public CompanionFoodStats() {
        this.foodLevel = 20;
        this.foodSaturationLevel = 5.0f;
        this.prevFoodLevel = 20;
    }
    
    private void addStats(final int p_75122_1_, final float p_75122_2_) {
        this.foodLevel = Math.min(p_75122_1_ + this.foodLevel, 20);
        this.foodSaturationLevel = Math.min(this.foodSaturationLevel + p_75122_1_ * p_75122_2_ * 2.0f, this.foodLevel);
    }
    
    public void onFoodEaten(final ItemFood food, final ItemStack itemstack) {
        this.addStats(food.func_150905_g(itemstack), food.func_150906_h(itemstack));
    }
    
    public void onUpdate(final EntityNPCInterface npc) {
        final EnumDifficulty enumdifficulty = npc.worldObj.difficultySetting;
        this.prevFoodLevel = this.foodLevel;
        if (this.foodExhaustionLevel > 4.0f) {
            this.foodExhaustionLevel -= 4.0f;
            if (this.foodSaturationLevel > 0.0f) {
                this.foodSaturationLevel = Math.max(this.foodSaturationLevel - 1.0f, 0.0f);
            }
            else if (enumdifficulty != EnumDifficulty.PEACEFUL) {
                this.foodLevel = Math.max(this.foodLevel - 1, 0);
            }
        }
        if (npc.worldObj.getGameRules().getGameRuleBooleanValue("naturalRegeneration") && this.foodLevel >= 18 && npc.getHealth() > 0.0f && npc.getHealth() < npc.getMaxHealth()) {
            ++this.foodTimer;
            if (this.foodTimer >= 80) {
                npc.heal(1.0f);
                this.addExhaustion(3.0f);
                this.foodTimer = 0;
            }
        }
        else if (this.foodLevel <= 0) {
            ++this.foodTimer;
            if (this.foodTimer >= 80) {
                if (npc.getHealth() > 10.0f || enumdifficulty == EnumDifficulty.HARD || (npc.getHealth() > 1.0f && enumdifficulty == EnumDifficulty.NORMAL)) {
                    npc.attackEntityFrom(DamageSource.starve, 1.0f);
                }
                this.foodTimer = 0;
            }
        }
        else {
            this.foodTimer = 0;
        }
    }
    
    public void readNBT(final NBTTagCompound p_75112_1_) {
        if (p_75112_1_.hasKey("foodLevel", 99)) {
            this.foodLevel = p_75112_1_.getInteger("foodLevel");
            this.foodTimer = p_75112_1_.getInteger("foodTickTimer");
            this.foodSaturationLevel = p_75112_1_.getFloat("foodSaturationLevel");
            this.foodExhaustionLevel = p_75112_1_.getFloat("foodExhaustionLevel");
        }
    }
    
    public void writeNBT(final NBTTagCompound p_75117_1_) {
        p_75117_1_.setInteger("foodLevel", this.foodLevel);
        p_75117_1_.setInteger("foodTickTimer", this.foodTimer);
        p_75117_1_.setFloat("foodSaturationLevel", this.foodSaturationLevel);
        p_75117_1_.setFloat("foodExhaustionLevel", this.foodExhaustionLevel);
    }
    
    public int getFoodLevel() {
        return this.foodLevel;
    }
    
    @SideOnly(Side.CLIENT)
    public int getPrevFoodLevel() {
        return this.prevFoodLevel;
    }
    
    public boolean needFood() {
        return this.foodLevel < 20;
    }
    
    public void addExhaustion(final float p_75113_1_) {
        this.foodExhaustionLevel = Math.min(this.foodExhaustionLevel + p_75113_1_, 40.0f);
    }
    
    public float getSaturationLevel() {
        return this.foodSaturationLevel;
    }
    
    @SideOnly(Side.CLIENT)
    public void setFoodLevel(final int p_75114_1_) {
        this.foodLevel = p_75114_1_;
    }
    
    @SideOnly(Side.CLIENT)
    public void setFoodSaturationLevel(final float p_75119_1_) {
        this.foodSaturationLevel = p_75119_1_;
    }
}
