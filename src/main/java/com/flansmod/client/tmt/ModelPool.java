package com.flansmod.client.tmt;

import com.flansmod.common.FlansMod;
import cpw.mods.fml.common.Loader;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ModelPool {
    public static final Class<ModelPoolObjEntry> OBJ = ModelPoolObjEntry.class;
    private static final Map<String, ModelPoolEntry> modelMap = new HashMap<>();
    private static final String[] resourceDir = new String[]{
            "/resources/models/",
            "/resources/mod/models/",
            "/Flan/"
    };

    public static ModelPoolEntry addFile(String file, Class<?> modelClass, Map<String, TransformGroup> group, Map<String, TextureGroup> textureGroup) {
        ModelPoolEntry entry = null;
        if (modelMap.containsKey(file)) {
            entry = modelMap.get(file);
            entry.applyGroups(group, textureGroup);
            return entry;
        }
        try {
            entry = (ModelPoolEntry) modelClass.newInstance();
        } catch (Exception e) {
            FlansMod.log("A new " + entry.getClass().getName() + " could not be initialized.");
            FlansMod.log(e.getMessage());
            return null;
        }
        File modelFile = null;
        for (int i = 0; i < resourceDir.length && (modelFile == null || !modelFile.exists()); i++) {
            String absPath = new File(Loader.instance().getConfigDir().getParent(), resourceDir[i]).getAbsolutePath();
            if (!absPath.endsWith("/") || !absPath.endsWith("\\"))
                absPath += "/";
            modelFile = entry.checkValidPath(absPath + file);
        }
        if (modelFile == null || !modelFile.exists()) {
            FlansMod.log("The model with the name " + file + " does not exist.");
            return null;
        }
        entry.groups = new HashMap<>();
        entry.textures = new HashMap<>();
        entry.name = file;
        entry.setGroup("0");
        entry.setTextureGroup("0");
        entry.getModel(modelFile);
        entry.applyGroups(group, textureGroup);
        modelMap.put(file, entry);
        return entry;
    }
}
