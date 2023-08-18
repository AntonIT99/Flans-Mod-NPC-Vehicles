package com.wolffsmod.mixin;

import com.wolffsmod.WolffNPCMod;
import cpw.mods.fml.relauncher.CoreModManager;
import org.spongepowered.asm.lib.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import net.minecraft.launchwrapper.LaunchClassLoader;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class FlanNPCVehiclesMixinPlugin implements IMixinConfigPlugin
{
    @Override
    public void onLoad(String mixinPackage)
    {
        boolean modFound = false;
        for (File mod : getModFiles())
        {
            String modID = getModID(mod);
            if (modID.equals("flansmod"))
            {
                modFound = true;
                try
                {
                    loadMod(mod);
                }
                catch (MalformedURLException e)
                {
                    WolffNPCMod.log.error("Error while trying to load Flan's Mod");
                    e.printStackTrace();
                }
            }
        }
        if (!modFound)
            WolffNPCMod.log.error("Flan's Mod could not be found");
    }

    private static List<File> getModFiles()
    {
        List<File> modFiles = new ArrayList<>();
        Path modsPath = Paths.get("./mods");

        if (!Files.exists(modsPath) || !Files.isDirectory(modsPath))
        {
            return modFiles;
        }

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(modsPath, "*.{jar,zip}"))
        {
            for (Path path : stream)
            {
                modFiles.add(path.toFile());
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return modFiles;
    }

    public static String getModID(File mod)
    {
        String modid = "";
        try (ZipFile zipFile = new ZipFile(mod))
        {
            ZipEntry mcModInfoEntry = zipFile.getEntry("mcmod.info");
            if (mcModInfoEntry != null)
            {
                InputStream inputStream = zipFile.getInputStream(mcModInfoEntry);
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                while ((line = reader.readLine()) != null)
                {
                    if (line.contains("\"modid\":") && line.split("\"").length > 3)
                    {
                        modid = line.split("\"")[3];
                    }
                }
                reader.close();
                inputStream.close();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return modid;
    }

    private void loadMod(File mod) throws MalformedURLException
    {
        ((LaunchClassLoader) getClass().getClassLoader()).addURL(mod.toURI().toURL());
        CoreModManager.getReparseableCoremods().add(mod.getName());
    }

    @Override
    public String getRefMapperConfig() {
        return null;
    }

    @Override
    public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
        return true;
    }

    @Override
    public void acceptTargets(Set<String> myTargets, Set<String> otherTargets)
    {
        /* Do nothing */
    }

    @Override
    public List<String> getMixins()
    {
        return Collections.emptyList();
    }

    @Override
    public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo)
    {
        /* Do nothing */
    }

    @Override
    public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo)
    {
        /* Do nothing */
    }
}