// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.config;

import java.io.IOException;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;
import noppes.npcs.LogWriter;
import java.util.HashMap;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.io.File;

public class ConfigLoader
{
    private boolean updateFile;
    private File dir;
    private String fileName;
    private Class<?> configClass;
    private LinkedList<Field> configFields;
    
    public ConfigLoader(final Class<?> clss, final File dir, final String fileName) {
        this.updateFile = false;
        if (!dir.exists()) {
            dir.mkdir();
        }
        this.dir = dir;
        this.configClass = clss;
        this.configFields = new LinkedList<Field>();
        this.fileName = fileName + ".cfg";
        final Field[] declaredFields;
        final Field[] fields = declaredFields = this.configClass.getDeclaredFields();
        for (final Field field : declaredFields) {
            if (field.isAnnotationPresent(ConfigProp.class)) {
                this.configFields.add(field);
            }
        }
    }
    
    public void loadConfig() {
        try {
            final File configFile = new File(this.dir, this.fileName);
            final HashMap<String, Field> types = new HashMap<String, Field>();
            for (final Field field : this.configFields) {
                final ConfigProp prop = field.getAnnotation(ConfigProp.class);
                types.put(prop.name().isEmpty() ? field.getName() : prop.name(), field);
            }
            if (configFile.exists()) {
                final HashMap<String, Object> properties = this.parseConfig(configFile, types);
                for (final String prop2 : properties.keySet()) {
                    final Field field2 = types.get(prop2);
                    final Object obj = properties.get(prop2);
                    if (!obj.equals(field2.get(null))) {
                        field2.set(null, obj);
                    }
                }
                for (final String type : types.keySet()) {
                    if (!properties.containsKey(type)) {
                        this.updateFile = true;
                    }
                }
            }
            else {
                this.updateFile = true;
            }
        }
        catch (Exception e) {
            this.updateFile = true;
            LogWriter.except(e);
        }
        if (this.updateFile) {
            this.updateConfig();
        }
        this.updateFile = false;
    }
    
    private HashMap<String, Object> parseConfig(final File file, final HashMap<String, Field> types) throws Exception {
        final HashMap<String, Object> config = new HashMap<String, Object>();
        final BufferedReader reader = new BufferedReader(new FileReader(file));
        String strLine;
        while ((strLine = reader.readLine()) != null) {
            if (!strLine.startsWith("#")) {
                if (strLine.length() == 0) {
                    continue;
                }
                final int index = strLine.indexOf("=");
                if (index <= 0 || index == strLine.length()) {
                    this.updateFile = true;
                }
                else {
                    final String name = strLine.substring(0, index);
                    final String prop = strLine.substring(index + 1);
                    if (!types.containsKey(name)) {
                        this.updateFile = true;
                    }
                    else {
                        Object obj = null;
                        final Class<?> class2 = types.get(name).getType();
                        if (class2.isAssignableFrom(String.class)) {
                            obj = prop;
                        }
                        else if (class2.isAssignableFrom(Integer.TYPE)) {
                            obj = Integer.parseInt(prop);
                        }
                        else if (class2.isAssignableFrom(Short.TYPE)) {
                            obj = Short.parseShort(prop);
                        }
                        else if (class2.isAssignableFrom(Byte.TYPE)) {
                            obj = Byte.parseByte(prop);
                        }
                        else if (class2.isAssignableFrom(Boolean.TYPE)) {
                            obj = Boolean.parseBoolean(prop);
                        }
                        else if (class2.isAssignableFrom(Float.TYPE)) {
                            obj = Float.parseFloat(prop);
                        }
                        else if (class2.isAssignableFrom(Double.TYPE)) {
                            obj = Double.parseDouble(prop);
                        }
                        if (obj == null) {
                            continue;
                        }
                        config.put(name, obj);
                    }
                }
            }
        }
        reader.close();
        return config;
    }
    
    public void updateConfig() {
        final File file = new File(this.dir, this.fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            final BufferedWriter out = new BufferedWriter(new FileWriter(file));
            for (final Field field : this.configFields) {
                final ConfigProp prop = field.getAnnotation(ConfigProp.class);
                if (prop.info().length() != 0) {
                    out.write("#" + prop.info() + System.getProperty("line.separator"));
                }
                final String name = prop.name().isEmpty() ? field.getName() : prop.name();
                try {
                    out.write(name + "=" + field.get(null).toString() + System.getProperty("line.separator"));
                    out.write(System.getProperty("line.separator"));
                }
                catch (IllegalArgumentException e) {
                    e.printStackTrace();
                }
                catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                }
            }
            out.close();
        }
        catch (IOException e3) {
            e3.printStackTrace();
        }
    }
}
