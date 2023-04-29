package com.wolffsmod.entity;

import com.flansmod.common.vector.Vector3f;
import com.wolffsmod.entity.config.ConfigMecha;
import noppes.npcs.entity.EntityCustomNpc;

import net.minecraft.world.World;

import java.util.ArrayList;

public abstract class EntityFlanMechaNPC extends EntityFlanDriveableNPC implements ConfigMecha
{
    public static class LegNode
    {
        public int rotation;
        public float lowerBound;
        public float upperBound;
        public int speed;
        public int legPart;
    }

    public Vector3f leftArmOrigin = new Vector3f();
    public Vector3f rightArmOrigin = new Vector3f();
    public ArrayList<LegNode> legNodes = new ArrayList<>();

    // Upper/Lower Arm Limit
    public float upperArmLimit = 90;
    public float lowerArmLimit = 90;

    public float legAnimSpeed = 0;

    public float armLength = 1F;
    public float legLength = 1F;
    public float legSwingTime = 5F;

    public float legSwing;
    public float legSwingLimit = 2F;

    // Modifier for Weapons in Hand
    public float leftHandModifierX = 0;
    public float leftHandModifierY = 0;
    public float leftHandModifierZ = 0;
    public float rightHandModifierX = 0;
    public float rightHandModifierY = 0;
    public float rightHandModifierZ = 0;

    //Animation speeds
    public int targetLeftUpper;
    public int targetLeftLower;
    public int targetLeftFoot;
    public int targetLeftUpperSpeed = 1;
    public int targetLeftLowerSpeed = 1;
    public int targetLeftFootSpeed = 1;

    int targetRightUpper;
    int targetRightLower;
    int targetRightFoot;
    int targetRightUpperSpeed = 1;
    int targetRightLowerSpeed = 1;
    int targetRightFootSpeed = 1;

    //Animation positions
    public float leftLegUpperAngle;
    public float leftLegLowerAngle;
    public float leftFootAngle;
    public float rightLegUpperAngle;
    public float rightLegLowerAngle;
    public float rightFootAngle;
    public float prevLeftLegUpperAngle;
    public float prevLeftLegLowerAngle;
    public float prevLeftFootAngle;
    public float prevRightLegUpperAngle;
    public float prevRightLegLowerAngle;
    public float prevRightFootAngle;

    public float legPosition;

    public EntityFlanMechaNPC(World w)
    {
        super(w);
        setupConfig();
    }

    @Override
    public void updateNpc(EntityCustomNpc npc)
    {
        super.updateNpc(npc);

        if(legPosition > 1)
        {
            legPosition = 0;
        }

        prevLeftLegUpperAngle = leftLegUpperAngle;
        prevLeftLegLowerAngle = leftLegLowerAngle;
        prevLeftFootAngle = leftFootAngle;
        prevRightLegUpperAngle = rightLegUpperAngle;
        prevRightLegLowerAngle = rightLegLowerAngle;;
        prevRightFootAngle = rightFootAngle;

        readLegNodes();
        moveLegParts();

        float moveX = Math.abs(posX - prevPosX) > 0.01F ? (float) Math.signum(posX - prevPosY) : 0F;
        float moveZ = Math.abs(posZ - prevPosZ) > 0.01F ? (float) Math.signum(posZ - prevPosZ) : 0F;

        Vector3f intent = new Vector3f(moveX, 0, moveZ);
        if(Math.abs(intent.lengthSquared()) > 0.1F)
        {
            legSwing++;
            legPosition += legAnimSpeed;
        }
        else
        {
            legPosition = 0F;
        }

        legSwing = legSwing / legSwingLimit;
    }

    @Override
    public void setLeftArmOrigin(String data)
    {
        String[] split = data.split(" ");
        leftArmOrigin = new Vector3f(Float.parseFloat(split[0]) / 16F, Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F);
    }

    @Override
    public void setRightArmOrigin(String data)
    {
        String[] split = data.split(" ");
        rightArmOrigin = new Vector3f(Float.parseFloat(split[0]) / 16F, Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F);
    }

    @Override
    public void setLegLength(float length)
    {
        legLength = length / 16F;
    }

    @Override
    public void setArmLength(float length)
    {
        armLength = length / 16F;
    }

    @Override
    public void setLegSwingTime(float time)
    {
        legSwingTime = time;
    }

    @Override
    public void setUpperArmLimit(float angle)
    {
        upperArmLimit = angle;
    }

    @Override
    public void setLowerArmLimit(float angle)
    {
        lowerArmLimit = angle;
    }

    @Override
    public void setLeftHandModifier(String data)
    {
        String[] split = data.split(" ");
        leftHandModifierX = Float.parseFloat(split[0])/16F;
        leftHandModifierY = Float.parseFloat(split[1])/16F;
        leftHandModifierZ = Float.parseFloat(split[2])/16F;
    }

    @Override
    public void setRightHandModifier(String data)
    {
        String[] split = data.split(" ");
        rightHandModifierX = Float.parseFloat(split[0])/16F;
        rightHandModifierY = Float.parseFloat(split[1])/16F;
        rightHandModifierZ = Float.parseFloat(split[2])/16F;
    }

    @Override
    public void setLegSwingLimit(float limit)
    {
        legSwingLimit = limit;
    }

    @Override
    public void setLegAnimSpeed(float speed)
    {
        legAnimSpeed = speed;
    }

    @Override
    public void addLegNode(String data)
    {
        String[] split = data.split(" ");
        LegNode node = new LegNode();
        node.rotation = Integer.parseInt(split[0]);
        node.lowerBound = Float.parseFloat(split[1]);
        node.upperBound = Float.parseFloat(split[2]);
        node.speed = Integer.parseInt(split[3]);
        node.legPart = Integer.parseInt(split[4]);
        legNodes.add(node);
    }

    protected void readLegNodes()
    {
        for(LegNode node : legNodes)
        {
            if(legPosition >= node.lowerBound && legPosition <= node.upperBound)
            {
                if(node.legPart == (1))
                {
                    targetLeftUpper = node.rotation;
                    targetLeftUpperSpeed = node.speed;
                }
                else if (node.legPart == (2))
                {
                    targetLeftLower = node.rotation;
                    targetLeftLowerSpeed = node.speed;
                }
                else if (node.legPart == (3))
                {
                    targetLeftFoot = node.rotation;
                    targetLeftFootSpeed = node.speed;
                }
                else if(node.legPart == (4))
                {
                    targetRightUpper = node.rotation;
                    targetRightUpperSpeed = node.speed;
                }
                else if (node.legPart == (5))
                {
                    targetRightLower = node.rotation;
                    targetRightLowerSpeed = node.speed;
                }
                else if (node.legPart == (6))
                {
                    targetRightFoot = node.rotation;
                    targetRightFootSpeed = node.speed;
                }
            }
        }
    }

    protected void moveLegParts()
    {
        if(leftLegUpperAngle < targetLeftUpper)
        {
            leftLegUpperAngle += targetLeftUpperSpeed;
        }
        else if(leftLegUpperAngle > targetLeftUpper)
        {
            leftLegUpperAngle -= targetLeftUpperSpeed;
        }

        if((float)Math.sqrt((leftLegUpperAngle-targetLeftUpper)*(leftLegUpperAngle-targetLeftUpper)) <= targetLeftUpperSpeed/2)
        {
            leftLegUpperAngle = targetLeftUpper;
        }


        if(rightLegUpperAngle < targetRightUpper)
        {
            rightLegUpperAngle += targetRightUpperSpeed;
        }
        else if(rightLegUpperAngle > targetRightUpper)
        {
            rightLegUpperAngle -= targetRightUpperSpeed;
        }

        if((float)Math.sqrt((rightLegUpperAngle-targetRightUpper)*(rightLegUpperAngle-targetRightUpper)) <= targetRightUpperSpeed/2)
        {
            rightLegUpperAngle = targetRightUpper;
        }

        if(leftLegLowerAngle < targetLeftLower)
        {
            leftLegLowerAngle += targetLeftLowerSpeed;
        }
        else if(leftLegLowerAngle > targetLeftLower)
        {
            leftLegLowerAngle -= targetRightLowerSpeed;
        }

        if(rightLegLowerAngle < targetRightLower)
        {
            rightLegLowerAngle += targetRightLowerSpeed;
        }
        else if(rightLegLowerAngle > targetRightLower)
        {
            rightLegLowerAngle -= targetRightLowerSpeed;
        }

        if((float)Math.sqrt((leftLegLowerAngle-targetLeftLower)*(leftLegLowerAngle-targetLeftLower)) <= targetLeftLowerSpeed/2)
        {
            leftLegLowerAngle = targetLeftLower;
        }

        if((float)Math.sqrt((rightLegLowerAngle-targetRightLower)*(rightLegLowerAngle-targetRightLower)) <= targetRightLowerSpeed/2)
        {
            rightLegLowerAngle = targetRightLower;
        }

        if(leftFootAngle < targetLeftFoot)
        {
            leftFootAngle += targetLeftFootSpeed;
        }
        else if(leftFootAngle > targetLeftFoot)
        {
            leftFootAngle -= targetLeftFootSpeed;
        }

        if(rightFootAngle < targetRightFoot)
        {

            rightFootAngle += targetRightFootSpeed;
        }
        else if(rightFootAngle > targetRightFoot)
        {
            rightFootAngle -= targetRightFootSpeed;
        }

        if((float)Math.sqrt((rightFootAngle-targetRightFoot)*(rightFootAngle-targetRightFoot)) <= targetRightFootSpeed/2)
        {
            rightFootAngle = targetRightFoot;
        }
        if((float)Math.sqrt((leftFootAngle-targetLeftFoot)*(leftFootAngle-targetLeftFoot)) <= targetLeftFootSpeed/2)
        {
            leftFootAngle = targetLeftFoot;
        }
    }
}
