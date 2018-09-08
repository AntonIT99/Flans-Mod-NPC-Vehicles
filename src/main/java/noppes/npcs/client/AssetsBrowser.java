// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client;

import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.Iterator;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.ResourcePackRepository;
import cpw.mods.fml.common.ModContainer;
import cpw.mods.fml.common.Loader;
import java.io.File;
import net.minecraft.client.resources.NPCResourceHelper;
import net.minecraft.client.resources.AbstractResourcePack;
import net.minecraft.client.resources.IResourcePack;
import java.util.List;
import net.minecraft.client.resources.FallbackResourceManager;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import java.util.Map;
import net.minecraft.client.resources.SimpleReloadableResourceManager;
import net.minecraft.client.Minecraft;
import org.apache.commons.lang3.StringUtils;
import java.util.HashSet;

public class AssetsBrowser
{
    public boolean isRoot;
    private int depth;
    private String folder;
    public HashSet<String> folders;
    public HashSet<String> files;
    private String[] extensions;
    
    public AssetsBrowser(final String folder, final String[] extensions) {
        this.folders = new HashSet<String>();
        this.files = new HashSet<String>();
        this.extensions = extensions;
        this.setFolder(folder);
    }
    
    public void setFolder(String folder) {
        if (!folder.endsWith("/")) {
            folder += "/";
        }
        this.isRoot = (folder.length() <= 1);
        this.folder = "/assets" + folder;
        this.depth = StringUtils.countMatches((CharSequence)this.folder, (CharSequence)"/");
        this.getFiles();
    }
    
    public AssetsBrowser(final String[] extensions) {
        this.folders = new HashSet<String>();
        this.files = new HashSet<String>();
        this.extensions = extensions;
    }
    
    private void getFiles() {
        this.folders.clear();
        this.files.clear();
        final ResourcePackRepository repos = Minecraft.getMinecraft().getResourcePackRepository();
        final SimpleReloadableResourceManager simplemanager = (SimpleReloadableResourceManager)Minecraft.getMinecraft().getResourceManager();
        final Map<String, IResourceManager> map = (Map<String, IResourceManager>)ObfuscationReflectionHelper.getPrivateValue((Class)SimpleReloadableResourceManager.class, (Object)simplemanager, 2);
        final HashSet<String> set = new HashSet<String>();
        for (final String name : map.keySet()) {
            if (!(map.get(name) instanceof FallbackResourceManager)) {
                continue;
            }
            final FallbackResourceManager manager = (FallbackResourceManager)map.get(name);
            final List<IResourcePack> list = (List<IResourcePack>)ObfuscationReflectionHelper.getPrivateValue((Class)FallbackResourceManager.class, (Object)manager, 0);
            for (final IResourcePack pack : list) {
                if (pack instanceof AbstractResourcePack) {
                    final AbstractResourcePack p = (AbstractResourcePack)pack;
                    final File file = NPCResourceHelper.getPackFile(p);
                    if (file == null) {
                        continue;
                    }
                    set.add(file.getAbsolutePath());
                }
            }
        }
        for (final String file2 : set) {
            this.progressFile(new File(file2));
        }
        for (final ModContainer mod : Loader.instance().getModList()) {
            if (mod.getSource().exists()) {
                this.progressFile(mod.getSource());
            }
        }
    }
    
    private void progressFile(final File file) {
        try {
            if (!file.isDirectory() && (file.getName().endsWith(".jar") || file.getName().endsWith(".zip"))) {
                final ZipFile zip = new ZipFile(file);
                final Enumeration<? extends ZipEntry> entries = zip.entries();
                while (entries.hasMoreElements()) {
                    final ZipEntry zipentry = (ZipEntry)entries.nextElement();
                    final String entryName = zipentry.getName();
                    this.checkFile(entryName);
                }
                zip.close();
            }
            else if (file.isDirectory()) {
                final int length = file.getAbsolutePath().length();
                this.checkFolder(file, length);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void checkFolder(final File file, final int length) {
        final File[] files = file.listFiles();
        if (files == null) {
            return;
        }
        for (final File f : files) {
            String name = f.getAbsolutePath().substring(length);
            name = name.replace("\\", "/");
            if (!name.startsWith("/")) {
                name = "/" + name;
            }
            if (f.isDirectory() && (this.folder.startsWith(name) || name.startsWith(this.folder))) {
                this.checkFile(name + "/");
                this.checkFolder(f, length);
            }
            else {
                this.checkFile(name);
            }
        }
    }
    
    private void checkFile(String name) {
        if (!name.startsWith("/")) {
            name = "/" + name;
        }
        if (!name.startsWith(this.folder)) {
            return;
        }
        final String[] split = name.split("/");
        final int count = split.length;
        if (count == this.depth + 1) {
            if (this.validExtension(name)) {
                this.files.add(split[this.depth]);
            }
        }
        else if (this.depth + 1 < count) {
            this.folders.add(split[this.depth]);
        }
    }
    
    private boolean validExtension(final String entryName) {
        final int index = entryName.indexOf(".");
        if (index < 0) {
            return false;
        }
        final String extension = entryName.substring(index + 1);
        for (final String ex : this.extensions) {
            if (ex.equalsIgnoreCase(extension)) {
                return true;
            }
        }
        return false;
    }
    
    public String getAsset(final String asset) {
        final String[] split = this.folder.split("/");
        if (split.length < 3) {
            return null;
        }
        String texture = split[2] + ":";
        texture = texture + this.folder.substring(texture.length() + 8) + asset;
        return texture;
    }
    
    public static String getRoot(String asset) {
        String mod = "minecraft";
        int index = asset.indexOf(":");
        if (index > 0) {
            mod = asset.substring(0, index);
            asset = asset.substring(index + 1);
        }
        if (asset.startsWith("/")) {
            asset = asset.substring(1);
        }
        String location = "/" + mod + "/" + asset;
        index = location.lastIndexOf("/");
        if (index > 0) {
            location = location.substring(0, index);
        }
        return location;
    }
}
