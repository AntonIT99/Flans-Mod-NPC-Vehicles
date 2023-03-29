package com.flansmod.common.types;

import java.util.ArrayList;
import java.util.HashMap;
import java.lang.StringBuilder;

public class TypeFile {
    public EnumType type;
    public String name;
    public final String pack;
    public ArrayList<String> lines;
    public static HashMap<EnumType, ArrayList<TypeFile>> files;
    private int readerPosition = 0;

    static {
        files = new HashMap<>();
        for (EnumType type : EnumType.values()) {
            files.put(type, new ArrayList<TypeFile>());
        }

    }

    public TypeFile(EnumType t, String s, String packName) {
        this(t, s, packName, true);
    }

    public TypeFile(EnumType type, String name, String packName, boolean addToTypeFileList) {
        this.type = type;
        this.name = name;
        pack = packName;
        lines = new ArrayList<>();
        if (addToTypeFileList)
            files.get(this.type).add(this);
    }

    public String readLine() {
        if (readerPosition == lines.size())
            return null;
        return lines.get(readerPosition++);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String s : lines) {
            sb.append(s);
            sb.append("\n");
        }
        return sb.toString();
    }
}
