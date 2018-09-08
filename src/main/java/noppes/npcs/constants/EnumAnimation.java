// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.constants;

public enum EnumAnimation
{
    NONE, 
    SITTING, 
    LYING, 
    SNEAKING, 
    DANCING, 
    AIMING, 
    CRAWLING, 
    HUG, 
    CRY, 
    WAVING, 
    BOW;
    
    public int getWalkingAnimation() {
        if (this == EnumAnimation.SNEAKING) {
            return 1;
        }
        if (this == EnumAnimation.AIMING) {
            return 2;
        }
        if (this == EnumAnimation.DANCING) {
            return 3;
        }
        if (this == EnumAnimation.CRAWLING) {
            return 4;
        }
        if (this == EnumAnimation.HUG) {
            return 5;
        }
        return 0;
    }
}
