package com.wolffsmod.render;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.TextureGroup;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import net.minecraft.client.Minecraft;

/** Read-only access to already-compiled geometry; never changes Flan texture flags. */
final class TurboGeometryAccess {
    private final Field compiled, lists, textures, defaultTexture, hidden, shown, children, glow, forced, legacy;
    private final Field transparent;
    final int profile;
    TurboGeometryAccess() throws Exception {
        try (InputStream stream = ModelRendererTurbo.class.getResourceAsStream("ModelRendererTurbo.class")) {
            profile = TurboRenderProfile.identify(stream);
        }
        if (profile == TurboRenderProfile.UNKNOWN) throw new IllegalStateException("Unreviewed ModelRendererTurbo implementation");
        compiled = field("compiled"); lists = field("displayListArray"); textures = field("textureGroup");
        defaultTexture = field("defaultTexture"); hidden = field("isHidden", "field_1402_i", "field_78807_k");
        shown = field("showModel", "field_78806_j"); children = field("childModels", "field_78805_m");
        glow = field("glow"); forced = field("forcedRecompile"); legacy = field("useLegacyCompiler");
        transparent = profile == TurboRenderProfile.FANCY_AND_TEXTURES
                ? Class.forName("com.flansmod.client.FlansModClient", false, ModelRendererTurbo.class.getClassLoader()).getField("allowTransparentTextures") : null;
    }
    private static Field field(String... names) throws NoSuchFieldException {
        for (String name : names) {
            try {
                // TMT shadows several vanilla fields; select its own declaration, not the parent's.
                Field found = ModelRendererTurbo.class.getDeclaredField(name);
                found.setAccessible(true); return found;
            } catch (NoSuchFieldException ignored) { }
        }
        throw new NoSuchFieldException(names[0]);
    }
    /** -1: unsafe; 0: let ordinary rendering warm up its child geometry. */
    int geometryList(ModelRendererTurbo part) throws IllegalAccessException {
        if (part == null || part.getClass() != ModelRendererTurbo.class || hidden.getBoolean(part) || !shown.getBoolean(part)
                || glow.getBoolean(part) || forced.getBoolean(part) || legacy.getBoolean(part)) return -1;
        List childList = (List)children.get(part);
        if (childList != null && !childList.isEmpty()) return -1;
        if (!"".equals(defaultTexture.get(part))) return -1;
        Map groups = (Map)textures.get(part);
        if (groups == null || groups.size() != 1) return -1;
        Object group = groups.get("0");
        if (!(group instanceof TextureGroup) || !"".equals(((TextureGroup)group).texture)) return -1;
        if (!compiled.getBoolean(part)) return 0;
        int[] ids = (int[])lists.get(part);
        return ids != null && ids.length == 1 && ids[0] > 0 ? ids[0] : -1;
    }
    boolean needsBlendSetup() throws IllegalAccessException {
        return profile == TurboRenderProfile.ALWAYS || (Minecraft.getMinecraft().gameSettings.fancyGraphics
                && (profile == TurboRenderProfile.FANCY || transparent.getBoolean(null)));
    }
}
