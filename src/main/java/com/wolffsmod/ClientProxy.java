package com.wolffsmod;

import com.wolffsmod.entity.*;
import com.wolffsmod.entity.kikkoceccato.EntityPanzerI;
import com.wolffsmod.entity.kikkoceccato.EntitySkwI;
import com.wolffsmod.entity.w44.*;
import com.wolffsmod.model.*;
import com.wolffsmod.render.*;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{
	
	@Override
	public void registerRenderers()
	{
		/**
		* When using RenderFlansModEntity, a default Y-translation of -2.1F is applied
		* The scale() method adapts automatically the translation to its scaled value.
		* Use setScale() and setTranslation() to override the values in OpenGL
		*
		* Scale Factor		Default Y-Translation
		* 	0.5					-1.05
		* 	0.75				-1.58
		*	0.80				-1.68
		*	0.90				-1.89
		*	1.00				-2.10
		* 	1.10				-2.31
		* 	1.20				-2.52
		* 	1.25				-2.63
		* 	1.30				-2.73
		* 	1.40				-2.94
		* 	1.5					-3.15
		* 	2.0					-4.20
		*
		*/

		//WW2 Official Pack
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.Entity105leFH18B2.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.Model105leFH18B2()).setTranslation(0F, -2.2F, 0F).setScale(1.1F, 1.1F, 1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityB1.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelB1()).setTranslation(0F, -2.2F, 0F).setScale(1.1F, 1.1F, 1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityBF109.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelBF109()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityBMWR75.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelBMWR75()).setTranslation(0F, -2.1F, 0F).setScale(1.1F, 1.1F, 1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityBofors.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelBofors()).setTranslation(0F, -2.3F, 0F).setScale(1.1F, 1.1F, 1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityCamel.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelCamel()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityChaffee.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelChaffee()).setTranslation(0F, -2.133F, 0F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityChiHa.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelChiHa()).setTranslation(0F, -2.133F, 0F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityChiNu.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelChiNu()).setTranslation(0F, -2.5F, 0F).setScale(1.25F, 1.25F, 1.25F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityChurchill.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelChurchill()).setTranslation(0F, -1.8F, 0F).setScale(0.8F, 0.8F, 0.8F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityCromwell.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelCromwell()).setTranslation(0F, -2.133F, 0F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityCrusader.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelCrusader()).setTranslation(0F, -2.2F, 0F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityFlak88.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelFlak88()).setTranslation(0F, -2.1F, 0F).setScale(1.1F, 1.1F, 1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityFlakvierling.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelFlakvierling()).setTranslation(0F, -2.1F, 0F).setScale(1.1F, 1.1F, 1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityFokker.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelFokker()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityFury.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelFury(), "M4A3E8ShermanFury/Sherman_Fury.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityGreyhound.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelGreyhound()).setTranslation(0F, -2.4F, 0F).setScale(1.1F, 1.1F, 1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityHellcat.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelHellcat()).setTranslation(0F, -2.1F, 0F).setScale(1.1F, 1.1F, 1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityIS2.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelIS2()).setTranslation(0F, -2.6F, 0F).setScale(1.3F, 1.3F, 1.3F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityJeep.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelJeep()).setTranslation(0F, -2.1F, 0F).setScale(1.1F, 1.1F, 1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityKubel.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelKubel()).setTranslation(0F, -2.1F, 0F).setScale(1.1F, 1.1F, 1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityKV1.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelKV1()).setTranslation(0F, -2.4F, 0F).setScale(1.2F, 1.2F, 1.2F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityLancaster.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelLancaster()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityLuchs.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelLuchs()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityM3Halftrack.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelM3Halftrack()).setTranslation(0F, -2.1F, 0F).setScale(1.1F, 1.1F, 1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityM10.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelM10()).setTranslation(0F, -2.2F, 0F).setScale(1.1F, 1.1F, 1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityM157mm.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelM157MM()).setTranslation(0F, -2.2F, 0F).setScale(1.1F, 1.1F, 1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityM45QuadMount.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelM45Quad()).setTranslation(0F, -2.2F, 0F).setScale(1.1F, 1.1F, 1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityMustang.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelMustang()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityPak40.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelPak40()).scale(1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityPanzerIV.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelPanzer(), "PanzerIV/PanzerIV.png").setTranslation(0F, -2F, 0F).setScale(0.9F, 0.9F, 0.9F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityS100.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelS100()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntitySASJeep.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelSASJeep()).setTranslation(0F, -2.2F, 0F).setScale(1.1F, 1.1F, 1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntitySdkFz2.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelSdkFz2()).scale(0.9F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntitySdkFz222.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelSdkFz222()).setTranslation(0F, -2.5F, 0F).setScale(1.3F, 1.3F, 1.3F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntitySdkFz251.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelSdkFz251()).scale(0.9F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntitySherman.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelSherman(), "M4A3E8Sherman/Sherman.png").setScale(1.15F, 1.15F, 1.15F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntitySpitfire.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelSpitfire()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityStuG.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelStuG(), "StuGIV/StuGIV.png").setTranslation(0.3F, -1.9F, 0F).setScale(0.85F, 0.85F, 0.85F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntitySU112.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelSU112()).setTranslation(0F, -2.1F, 0F).setScale(1.1F, 1.1F, 1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityT3476.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelT34(), "T3476/T3476.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityT3485.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelT3485()).setTranslation(0F, -2.6F, 0F).setScale(1.3F, 1.3F, 1.3F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityTiger.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelTiger()).setTranslation(0F, -2.4F, 0F).setScale(1.2F, 1.2F, 1.2F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityTiger131.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelTiger131()).setTranslation(0F, -2.4F, 0F).setScale(1.2F, 1.2F, 1.2F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityTigerII.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelTigerII()).setTranslation(0F, -2.133F, 0F).scale(1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityType4HoRo.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelType4HoRo()).setTranslation(0F, -2.133F, 0F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityUC2Pdr.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelUC2Pdr()).setTranslation(0F, -2.1F, 0F).setScale(1.1F, 1.1F, 1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityYak9.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelYak9()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityZero.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelZero()));

		//WW2 Official Pack Legacy
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.legacy.EntityBF109.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelBF109Legacy(), "BF109Legacy/BF109.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.legacy.EntityBofors.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelBoforsLegacy(), "BoforsLegacy/Bofors.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.legacy.EntityFlakvierling.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelFlakvierlingLegacy(), "FlakvierlingLegacy/Flakvierling.png").setTranslation(0, -1.5F, 0));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.legacy.EntityJeep.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelJeepLegacy(), "JeepLegacy/Jeep.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.legacy.EntityKubel.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelKubelLegacy(), "KubelLegacy/Kubel.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.legacy.EntityM157mm.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelM157MMLegacy(), "M157MMLegacy/M157MM.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.legacy.EntityMustang.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelBF109Legacy(), "BF109Legacy/Mustang.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.legacy.EntityPak40.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelPak40Legacy(), "Pak40Legacy/Pak40.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.legacy.EntityPanzerIV.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelPanzerLegacy(), "PanzerIVLegacy/PanzerIV.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.legacy.EntityPanzerIVOld.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelPanzerLegacyIII(), "Panzer/PanzerIV.png").setTranslation(0F, 0F, 0F).setRotation(0F, 0F, 0F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.legacy.EntityPanzer.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelPanzerLegacyII(), "PanzerLegacy/PanzerIV.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.legacy.EntityM4Sherman.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelShermanLegacy(), "M4ShermanLegacy/M4Sherman.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.legacy.EntitySherman.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelShermanLegacyII(), "ShermanLegacy/Sherman.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.legacy.EntityPanzerIIL.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelPanzerIILuchs(), "LuchsLegacy/Luchs.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.legacy.EntityYak9.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelSpitfire(), "Spitfire/Yak9.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.legacy.EntityZero.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelSpitfire(), "Spitfire/Zero.png"));

		//Ye Olde Official Pack
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.yeolde.EntityBiplane.class, new RenderFlansModEntity(new com.wolffsmod.model.official.yeolde.ModelBiplane()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.yeolde.EntityTwoSeatBiplane.class, new RenderFlansModEntity(new com.wolffsmod.model.official.yeolde.ModelTwoSeatBiplane()));

		//World at War Pack
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.waw.EntityBlackPrince.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.legacy.ModelPanzer4(), "Panzer4/EnglishTank.png"));

		//Modern Official Pack
		RenderingRegistry.registerEntityRenderingHandler(EntitySentryGun.class, new RenderFlansModEntity(new ModelSentryGun()).setTranslation(0F, -2.2F, 0F).setScale(1.1F, 1.1F, 1.1F));

		//Wolff's Pack
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.wolff.EntitySdKfz251D.class, new RenderFlansModEntity(new com.wolffsmod.model.wolff.ModelSdKfz251D()).setTranslation(0F, -2.2F, 0F).setRotation(0F, 90F, 0F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.wolff.EntityPanzerIVJ.class, new RenderFlansModEntity(new com.wolffsmod.model.wolff.ModelPanzerIVJ()).setTranslation(0F, -2F, 0F).setScale(0.9F, 0.9F, 0.9F));

		//Kikkoceccato
		RenderingRegistry.registerEntityRenderingHandler(EntityPanzerI.class, new RenderFlansModEntity(new com.wolffsmod.model.kikkoceccato.ModelPanzerI()).setTranslation(0F, -1.5F, 0F).setScale(0.55F, 0.55F, 0.55F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySkwI.class, new RenderFlansModEntity(new com.wolffsmod.model.kikkoceccato.ModelSkwI(), "PanzerI/SkwI.png").setTranslation(0F, -1.5F, 0F).setScale(0.55F, 0.55F, 0.55F));

		//Manus WW2 Pack
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_FlakpanzerIV_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_FlakpanzerIV_1(), "FlakpanzerIV/FlakpanzerIV.png"));

		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_Jagdpanther_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_Jagdpanther_1(), "Jagdpanther/Jagdpanther.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_JagdpanzerIV_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_JagdpanzerIV_1(), "JagdpanzerIV/JagdpanzerIV.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_Jagdtiger_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_Jagdtiger_1(), "Jagdtiger/Jagdtiger.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_M4A1_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_M4A1_1(), "M4A1/M4A1.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_M4A1_2A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_M4A1_2(), "M4A1/M4A1Calliope.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_M4A3_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_M4A3_1(), "M4A3/M4A3.png"));

		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_Panther_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_Panther_1(), "PantherG/PantherG.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_PanzerhaubitzeHummel_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_PanzerhaubitzeHummel_1(), "Hummel/Hummel.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_PanzerIV_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_PanzerIV_1(), "PanzerIV_Manus/PanzerIVG.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_PanzerIV_2A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_PanzerIV_2(), "PanzerIV_Manus/PanzerIVH.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_RenaultFT17_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_RenaultFT17_1(), "RenaultFT17/RenaultFT17.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_SU85_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_SU85_1(), "SU85/SU85.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_SU100_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_SU100_1(), "SU100/SU100.pn"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_SU122_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_SU122_1(), "SU122/SU122.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_T34_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_T34_1(), "T34_76/T34_76.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_T34_2A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_T34_2(), "T34_85/T34_85.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_TigerI_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_TigerI_1(), "TigerIE/TigerIE.pn"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_TigerII_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_TigerII_1(), "TigerIIB/TigerIIB.png"));

		//Manus WW2 Pack Legacy
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.legacy.EntityM4.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.legacy.ModelM41(), "M4/M4Sherman.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.legacy.EntityPanzer4G.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.legacy.ModelPanzer4(), "Panzer4/PanzerIVG.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.legacy.EntityPanzer4H.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.legacy.ModelPanzer4(), "Panzer4/PanzerIVH.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.legacy.EntityT34.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.legacy.ModelT34()));

		//Manus Modern Warfare Pack
		RenderingRegistry.registerEntityRenderingHandler(EntityBwTruck.class, new RenderFlansModEntity(new ModelBwTruck()));
		RenderingRegistry.registerEntityRenderingHandler(EntityBoxer1.class, new RenderFlansModEntity(new ModelBoxer1(), "Boxer/Boxer.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityBoxer2.class, new RenderFlansModEntity(new ModelBoxer2(), "Boxer/Boxer.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityBoxer3.class, new RenderFlansModEntity(new ModelBoxer3(), "Boxer/Boxer.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityBoxer4.class, new RenderFlansModEntity(new ModelBoxer4(), "Boxer/Boxer.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityBoxer5.class, new RenderFlansModEntity(new ModelBoxer5(), "Boxer/Boxer.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityHMMWV1.class, new RenderFlansModEntity(new ModelHMMWV1(), "HMMWV/HMMWV.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityHMMWV2.class, new RenderFlansModEntity(new ModelHMMWV2(), "HMMWV/HMMWV.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityHMMWV3.class, new RenderFlansModEntity(new ModelHMMWV3(), "HMMWV/HMMWV.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityHMMWV4.class, new RenderFlansModEntity(new ModelHMMWV4(), "HMMWV/HMMWV.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityLeopardIIA6.class, new RenderFlansModEntity(new ModelLeopardIIA6()));
		RenderingRegistry.registerEntityRenderingHandler(EntityLeopard2A7.class, new RenderFlansModEntity(new ModelLeopard2A7()));

		//Extra Zero 8
		RenderingRegistry.registerEntityRenderingHandler(Entity38t.class, new Render38t(new Model38t(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityA39.class, new RenderA39(new ModelA39(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityHetzer.class, new RenderHetzer(new ModelHetzer(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityLVT2.class, new RenderLVT2(new ModelLVT2(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityLVTA1.class, new RenderLVTA1(new ModelLVTA1(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityMaus.class, new RenderMaus(new ModelMaus(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityML20.class, new RenderML20(new ModelML20(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityPzkpfw2.class, new RenderPzkpfw2(new ModelPzkpfw2(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityPzkpfw3.class, new RenderPzkpfw3(new ModelPzkpfw3(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityStug3.class, new RenderStug3(new ModelStug3(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntitySturmtiger.class, new RenderSturmtiger(new ModelSturmtiger(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityT35.class, new RenderT35(new ModelT35(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityTiger1E.class, new RenderTiger1E(new ModelTiger1E(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityTKS.class, new RenderTKS(new ModelTKS(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityTKS20.class, new RenderTKS20(new ModelTKS20(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityType95.class, new RenderType95(new ModelType95(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityType97.class, new RenderType97(new ModelType97(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityZis3.class, new RenderZis3(new ModelZis3(), 0));

		//TaP
		RenderingRegistry.registerEntityRenderingHandler(EntityM113A1.class, new RenderM113A1(new ModelM113A1(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityT72A1979.class, new RenderT72A1979(new ModelT72A1979(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityT55A.class, new RenderT55A(new ModelT55A(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityType90KyuMaru.class, new RenderType90KyuMaru(new ModelType90KyuMaru(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityT14Armata.class, new RenderT14Armata(new ModelT14Armata(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityK2.class, new RenderK2(new ModelK2(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityM60A1.class, new RenderM60A1(new ModelM60A1(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityM1Abrams.class, new RenderM1Abrams(new ModelM1Abrams(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityLeopard2A6.class, new RenderLeopard2A6(new ModelLeopard2A6(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityT90.class, new RenderT90(new ModelT90(), 0));

		//Price additions
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.price.EntityMCOMStation.class, new RenderFlansModEntity(new com.wolffsmod.model.price.ModelMCOMStation()).setTranslation(0F, -1.65F, 0F).setScale(1.1F, 1.1F, 1.1F).setRotation(180F, -180F, 0F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.price.EntityMilitaryCrate.class, new RenderFlansModEntity(new com.wolffsmod.model.price.ModelMilitaryCrate()).setTranslation(0F, -1.65F, 0F).setScale(1.1F, 1.1F, 1.1F).setRotation(180F, -180F, 0F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.price.EntityRadioStation.class, new RenderFlansModEntity(new com.wolffsmod.model.price.ModelRadioStation()).setTranslation(0F, -1.65F, 0F).setScale(1.1F, 1.1F, 1.1F).setRotation(180F, -180F, 0F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.price.EntityRadioStationSmall.class, new RenderFlansModEntity(new com.wolffsmod.model.price.ModelRadioStationSmall()).setTranslation(0F, -2.85F, 0F).setScale(1.1F, 1.1F, 1.1F).setRotation(180F, -180F, 0F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.price.EntitySandBags1.class, new RenderFlansModEntity(new com.wolffsmod.model.price.ModelSandBags1()).setTranslation(0F, -1.5F, 0F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.price.EntitySandBags2.class, new RenderFlansModEntity(new com.wolffsmod.model.price.ModelSandBags2()).setTranslation(0F, -0.5F, 0F).setScale(0.25F, 0.25F, 0.25F).setRotation(180F, 0F, 0F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.price.EntitySupplies.class, new RenderFlansModEntity(new com.wolffsmod.model.price.ModelSupplies()).setTranslation(0F, -2.2F, 0F).setScale(1.1F, 1.1F, 1.1F));

		RenderingRegistry.registerEntityRenderingHandler(EntityM41.class, new RenderM41(new ModelM41(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityA6M1.class, new RenderA6M1(new ModelA6M1(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityRomeoClassSub.class, new RenderRomeoClassSub(new ModelRomeoClassSub(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityMirageF1.class, new RenderMirageF1(new ModelMirageF1(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityHigginsBoat.class, new RenderHigginsBoat(new ModelHigginsBoat(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntitySlava.class, new RenderSlava(new ModelSlava(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityA7V.class, new RenderA7V(new ModelA7V(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityEurocopterTigerHAP.class, new RenderEurocopterTigerHAP(new ModelEurocopterTigerHAP(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityT26.class, new RenderT26(new ModelT26(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityPak43.class, new RenderPak43(new ModelPak43(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntitySoDa.class, new RenderSoDa(new ModelSoDa(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityTeKe.class, new RenderTeKe(new ModelTeKe(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityTKlate.class, new RenderTKlate(new ModelTKlate(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityBF109E3.class, new RenderBF109E3(new ModelBF109E3(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityBF109G10.class, new RenderBF109G10(new ModelBF109G10(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityHawkerHurricane.class, new RenderHawkerHurricane(new ModelHawkerHurricane(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityOccupier.class, new RenderOccupier(new ModelOccupier(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityP51D.class, new RenderP51D(new ModelP51D(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityJihadBMP1.class, new RenderJihadBMP1(new ModelJihadBMP1(), 0));	

		//Warfare 44
		RenderingRegistry.registerEntityRenderingHandler(EntityPanzerIVF1.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelPanzerIVF1(), "PanzerIVF/PanzerIVF.png").setTranslation(0F, -2.133F, 0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityJu87D3.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelJu87D3()).setTranslation(0F, -2.133F, 0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityStuG3G.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelStuG3G()).setTranslation(0F, -2.133F, 0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTiger1H.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelTiger1H()).setTranslation(0F, -2.133F, 0F).scale(1.2F));
	}
}
