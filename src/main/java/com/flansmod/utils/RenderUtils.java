package com.flansmod.utils;

import org.lwjgl.opengl.GL11;

public class RenderUtils {
    public static void rotate(float x, float y, float z) {
        GL11.glRotatef(x, 1f, 0f, 0f);
        GL11.glRotatef(y, 0f, 1f, 0f);
        GL11.glRotatef(z, 0f, 0f, 1f);
    }
}
