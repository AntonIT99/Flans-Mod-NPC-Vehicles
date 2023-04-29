package com.wolffsmod.entity.config;

public interface ConfigMecha
{
    /** LeftArmOrigin [...] */
    void setLeftArmOrigin(String data);

    /** RightArmOrigin [...] */
    void setRightArmOrigin(String data);

    /** LegLength [length] */
    void setLegLength(float length);

    /** ArmLength [length] */
    void setArmLength(float length);

    /** UpperArmLimit [angle] */
    void setUpperArmLimit(float angle);

    /** LowerArmLimit [angle] */
    void setLowerArmLimit(float angle);

    /** LegSwingTime [time] */
    void setLegSwingTime(float time);

    /** LeftHandModifier [...] */
    void setLeftHandModifier(String data);

    /** RightHandModifier [...] */
    void setRightHandModifier(String data);

    /** LegSwingLimit [limit] */
    void setLegSwingLimit(float limit);

    /** LegAnimSpeed [speed] */
    void setLegAnimSpeed(float speed);

    /** LegNode [...] */
    void addLegNode(String data);
}
