package noppes.npcs;

import com.flansmod.common.guns.EntityBullet;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import noppes.npcs.util.EntityNPCFlanBullet;

@Mod(modid = FlanCompatibilityMod.MOD_ID, name = FlanCompatibilityMod.MOD_NAME, version = FlanCompatibilityMod.MOD_VERSION, dependencies="required-after: customnpcs; required-after: flansmod")
public class FlanCompatibilityMod
{
    public static final String MOD_ID = "npcflancompatibility";
    public static final String MOD_NAME = "CustomNPCs Flan Compatibility Mod";
    public static final String MOD_VERSION = "1.0";

    @SidedProxy(clientSide = "noppes.npcs.FlanCompatibilityClientProxy", serverSide = "noppes.npcs.FlanCompatibilityCommonProxy")
    public static FlanCompatibilityCommonProxy PROXY;

    @Mod.Instance(FlanCompatibilityMod.MOD_ID)
    public static FlanCompatibilityMod INSTANCE;

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event)
    {
        EntityRegistry.registerGlobalEntityID(EntityNPCFlanBullet.class, "NPCBullet", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntityNPCFlanBullet.class, "NPCBullet", 196, INSTANCE, 200, 20, false);
        PROXY.registerRenderers();
    }
}
