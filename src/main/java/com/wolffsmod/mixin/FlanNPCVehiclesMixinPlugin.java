package com.wolffsmod.mixin;

import org.spongepowered.asm.lib.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FlanNPCVehiclesMixinPlugin implements IMixinConfigPlugin {
    @Override
    public void onLoad(String mixinPackage) {}

    @Override
    public String getRefMapperConfig() {
        return null;
    }

    @Override
    public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
        return true;
    }

    @Override
    public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {}

    @Override
    public List<String> getMixins()
    {
        List<String> mixins = new ArrayList<>();
        mixins.add("MixinEntityAIAnimation");
        mixins.add("MixinEntityAIRangedAttack");
        mixins.add("MixinGuiNPCInv");
        mixins.add("MixinEntityNPCInterface");
        mixins.add("MixinEntityCustomNpc");
        mixins.add("MixinDataInventory");
        mixins.add("MixinDataStats");
        mixins.add("MixinResistances");
        return mixins;
    }

    @Override
    public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {}

    @Override
    public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {}
}