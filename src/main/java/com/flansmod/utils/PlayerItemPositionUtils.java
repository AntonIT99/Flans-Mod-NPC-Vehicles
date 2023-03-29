package com.flansmod.utils;

import com.flansmod.common.FlansMod;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.vector.Vector;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.entity.player.EntityPlayer;

public class PlayerItemPositionUtils {
    public static Vector3f GetPlayerHandPosition (EntityPlayer p, Vector3f shoulderOffset, Vector3f handOffset, Boolean accountForSneak) {
        // Good luck. This is gonna be wild.

        // World origin -> Body Origin
        Vector3f pos = new Vector3f(p.posX, p.posY, p.posZ);
        // Body origin -> Arm joint
        RotatedAxes bodyAxes = new RotatedAxes(p.renderYawOffset+90, 0, 0);
        if (p.isSneaking() && accountForSneak) {
            Vector3f.sub(pos, (Vector3f) bodyAxes.getYAxis().scale(3F/16F), pos);
        }

        Vector3f.add(pos, (Vector3f) bodyAxes.getYAxis().scale(22F/16F), pos);
        Vector3f.sub(pos, (Vector3f) bodyAxes.getZAxis().scale(6F/16F), pos);
        Vector3f.add(pos, bodyAxes.findLocalVectorGlobally(shoulderOffset), pos);

        // Arm joint -> End of arm
        RotatedAxes armAxes = new RotatedAxes(p.rotationYawHead+90-8, p.rotationPitch, 0);
        Vector3f.add(pos, (Vector3f)armAxes.getXAxis().scale(10F/16F), pos);

        Vector3f.add(pos, armAxes.findLocalVectorGlobally(handOffset), pos);


        return pos;
    }
}
