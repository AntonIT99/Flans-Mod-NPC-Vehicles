// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.scripted;

import noppes.npcs.controllers.PixelmonHelper;
import noppes.npcs.util.ValueUtil;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.passive.EntityTameable;

public class ScriptPixelmon extends ScriptAnimal
{
    private EntityTameable pixelmon;
    private NBTTagCompound compound;
    
    public ScriptPixelmon(final EntityTameable pixelmon) {
        super((EntityAnimal)pixelmon);
        this.compound = null;
        (this.pixelmon = pixelmon).writeEntityToNBT(this.compound = new NBTTagCompound());
    }
    
    public ScriptPixelmon(final EntityTameable pixelmon, final NBTTagCompound compound) {
        this(pixelmon);
        this.compound = compound;
    }
    
    public boolean getIsShiny() {
        return this.compound.getBoolean("IsShiny");
    }
    
    public void setIsShiny(final boolean bo) {
        this.compound.setBoolean("IsShiny", bo);
        this.pixelmon.readEntityFromNBT(this.compound);
    }
    
    public int getLevel() {
        return this.compound.getInteger("Level");
    }
    
    public void setLevel(final int level) {
        this.compound.setInteger("Level", level);
        this.pixelmon.readEntityFromNBT(this.compound);
    }
    
    public int getIV(final int type) {
        if (type == 0) {
            return this.compound.getInteger("IVHP");
        }
        if (type == 1) {
            return this.compound.getInteger("IVAttack");
        }
        if (type == 2) {
            return this.compound.getInteger("IVDefence");
        }
        if (type == 3) {
            return this.compound.getInteger("IVSpAtt");
        }
        if (type == 4) {
            return this.compound.getInteger("IVSpDef");
        }
        if (type == 5) {
            return this.compound.getInteger("IVSpeed");
        }
        return -1;
    }
    
    public void setIV(final int type, final int value) {
        if (type == 0) {
            this.compound.setInteger("IVHP", value);
        }
        else if (type == 1) {
            this.compound.setInteger("IVAttack", value);
        }
        else if (type == 2) {
            this.compound.setInteger("IVDefence", value);
        }
        else if (type == 3) {
            this.compound.setInteger("IVSpAtt", value);
        }
        else if (type == 4) {
            this.compound.setInteger("IVSpDef", value);
        }
        else if (type == 5) {
            this.compound.setInteger("IVSpeed", value);
        }
        this.pixelmon.readEntityFromNBT(this.compound);
    }
    
    public int getEV(final int type) {
        if (type == 0) {
            return this.compound.getInteger("EVHP");
        }
        if (type == 1) {
            return this.compound.getInteger("EVAttack");
        }
        if (type == 2) {
            return this.compound.getInteger("EVDefence");
        }
        if (type == 3) {
            return this.compound.getInteger("EVSpecialAttack");
        }
        if (type == 4) {
            return this.compound.getInteger("EVSpecialDefence");
        }
        if (type == 5) {
            return this.compound.getInteger("EVSpeed");
        }
        return -1;
    }
    
    public void setEV(final int type, final int value) {
        if (type == 0) {
            this.compound.setInteger("EVHP", value);
        }
        else if (type == 1) {
            this.compound.setInteger("EVAttack", value);
        }
        else if (type == 2) {
            this.compound.setInteger("EVDefence", value);
        }
        else if (type == 3) {
            this.compound.setInteger("EVSpecialAttack", value);
        }
        else if (type == 4) {
            this.compound.setInteger("EVSpecialDefence", value);
        }
        else if (type == 5) {
            this.compound.setInteger("EVSpeed", value);
        }
        this.pixelmon.readEntityFromNBT(this.compound);
    }
    
    public int getStat(final int type) {
        if (type == 0) {
            return this.compound.getInteger("StatsHP");
        }
        if (type == 1) {
            return this.compound.getInteger("StatsAttack");
        }
        if (type == 2) {
            return this.compound.getInteger("StatsDefence");
        }
        if (type == 3) {
            return this.compound.getInteger("StatsSpecialAttack");
        }
        if (type == 4) {
            return this.compound.getInteger("StatsSpecialDefence");
        }
        if (type == 5) {
            return this.compound.getInteger("StatsSpeed");
        }
        return -1;
    }
    
    public void setStat(final int type, final int value) {
        if (type == 0) {
            this.compound.setInteger("StatsHP", value);
        }
        else if (type == 1) {
            this.compound.setInteger("StatsAttack", value);
        }
        else if (type == 2) {
            this.compound.setInteger("StatsDefence", value);
        }
        else if (type == 3) {
            this.compound.setInteger("StatsSpecialAttack", value);
        }
        else if (type == 4) {
            this.compound.setInteger("StatsSpecialDefence", value);
        }
        else if (type == 5) {
            this.compound.setInteger("StatsSpeed", value);
        }
        this.pixelmon.readEntityFromNBT(this.compound);
    }
    
    public int getSize() {
        return this.compound.getShort("Growth");
    }
    
    public void setSize(final int type) {
        this.compound.setShort("Growth", (short)type);
        this.pixelmon.readEntityFromNBT(this.compound);
    }
    
    public int getHapiness() {
        return this.compound.getInteger("Friendship");
    }
    
    public void setHapiness(int value) {
        value = ValueUtil.CorrectInt(value, 0, 255);
        this.compound.setInteger("Friendship", value);
        this.pixelmon.readEntityFromNBT(this.compound);
    }
    
    public int getNature() {
        return this.compound.getShort("Nature");
    }
    
    public void setNature(final int type) {
        this.compound.setShort("Nature", (short)type);
        this.pixelmon.readEntityFromNBT(this.compound);
    }
    
    public int getPokeball() {
        if (this.compound.hasKey("CaughtBall")) {
            return -1;
        }
        return this.compound.getInteger("CaughtBall");
    }
    
    public void setPokeball(final int type) {
        this.compound.setInteger("CaughtBall", type);
        this.pixelmon.readEntityFromNBT(this.compound);
    }
    
    public String getNickname() {
        return this.compound.getString("Nickname");
    }
    
    public boolean hasNickname() {
        return !this.getNickname().isEmpty();
    }
    
    public void setNickname(final String name) {
        this.compound.setString("Nickname", name);
        this.pixelmon.readEntityFromNBT(this.compound);
    }
    
    public String getMove(final int slot) {
        if (!this.compound.hasKey("PixelmonMoveID" + slot)) {
            return null;
        }
        return PixelmonHelper.getAttackName(this.compound.getInteger("PixelmonMoveID" + slot));
    }
    
    public void setMove(int slot, final String move) {
        slot = ValueUtil.CorrectInt(slot, 0, 3);
        final int id = PixelmonHelper.getAttackID(move);
        this.compound.removeTag("PixelmonMovePP" + slot);
        this.compound.removeTag("PixelmonMovePPBase" + slot);
        if (id < 0) {
            this.compound.removeTag("PixelmonMoveID" + slot);
        }
        else {
            this.compound.setInteger("PixelmonMoveID" + slot, id);
        }
        int size = 0;
        for (int i = 0; i < 4; ++i) {
            if (this.compound.hasKey("PixelmonMoveID" + i)) {
                ++size;
            }
        }
        this.compound.setInteger("PixelmonNumberMoves", size);
        this.pixelmon.readEntityFromNBT(this.compound);
    }
}
