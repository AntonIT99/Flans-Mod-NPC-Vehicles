package com.flansmod.client;

import com.flansmod.common.FlansMod;
import cpw.mods.fml.common.ICrashCallable;

import java.io.File;
import java.lang.reflect.Method;
import java.util.List;

public class FlansCrash implements ICrashCallable {
    @Override
    public String getLabel() {
        return "Flan's Mod Content Packs";
    }

    @Override
    public String call() throws Exception {
        ClassLoader classloader = (net.minecraft.server.MinecraftServer.class).getClassLoader();
        Method method = (java.net.URLClassLoader.class).getDeclaredMethod("addURL", java.net.URL.class);
        method.setAccessible(true);

        List<File> contentPacks = FlansMod.proxy.getContentList(method, classloader);
        StringBuilder builder = new StringBuilder();
        for(File file: contentPacks) {
            builder.append("\n").append(file.getName()).append(" (filepath: ").append(file.getAbsolutePath()).append(")");
        }
        return builder.toString();
    }
}
