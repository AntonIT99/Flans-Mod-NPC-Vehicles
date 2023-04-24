package com.wolffsmod;

import com.wolffsmod.entity.*;
import com.wolffsmod.model.*;
import com.wolffsmod.model.wolff.ModelSdKfz251DManned;
import com.wolffsmod.render.*;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{

	/**
	 * When using RenderFlansModEntity, a default Y-translation of -2.133F is applied
	 * The scale() method automatically scales the translation as well.
	 * Use setTranslation(), setScale() and setRotation() to override the values in OpenGL
	 * <p>
	 * Scale Factor		Default Y-Translation
	 * 	0.5					-1.07
	 * 	0.75				-1.60
	 *	0.80				-1.71
	 *	0.90				-1.92
	 *	1.00				-2.13
	 * 	1.10				-2.35
	 * 	1.20				-2.56
	 * 	1.25				-2.67
	 * 	1.30				-2.77
	 * 	1.40				-2.99
	 * 	1.5					-3.20
	 * 	2.0					-4.26
	 */

	@Override
	public void registerRenderers()
	{
		//WW2 Official Pack
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.Entity105leFH18B2.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.Model105leFH18B2()).setTranslation(0F, -2.2F, 0F).setScale(1.1F, 1.1F, 1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityB1.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelB1()).setTranslation(0F, -2.2F, 0F).setScale(1.1F, 1.1F, 1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityBF109.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelBF109()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityBMWR75.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelBMWR75()).setTranslation(0F, -2.1F, 0F).setScale(1.1F, 1.1F, 1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityBofors.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelBofors()).setTranslation(0F, -2.3F, 0F).setScale(1.1F, 1.1F, 1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityCamel.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelCamel()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityChaffee.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelChaffee()).setTranslation(0F, -2.133F, 0F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityChiHa.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelChiHa()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityChiNu.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelChiNu()).setTranslation(0F, -2.5F, 0F).setScale(1.25F, 1.25F, 1.25F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityChurchill.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelChurchill()).setTranslation(0F, -1.8F, 0F).setScale(0.8F, 0.8F, 0.8F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityCromwell.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelCromwell()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityCrusader.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelCrusader()).setTranslation(0F, -2.2F, 0F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityFlak88.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelFlak88()).setTranslation(0F, -2.1F, 0F).setScale(1.1F, 1.1F, 1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityFlakvierling.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelFlakvierling()).setTranslation(0F, -2.1F, 0F).setScale(1.1F, 1.1F, 1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityFokker.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelFokker()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityFury.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelFury(), "M4A3E8ShermanFury/Sherman_Fury.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityGreyhound.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelGreyhound()).setTranslation(0F, -2.4F, 0F).setScale(1.1F, 1.1F, 1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityHellcat.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelHellcat()).setTranslation(0F, -2.1F, 0F).setScale(1.1F, 1.1F, 1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityIS2.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelIS2()).setTranslation(0F, -2.6F, 0F).setScale(1.3F, 1.3F, 1.3F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityJeep.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelJeep()).scale(1.1F));
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
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityTigerII.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelTigerII()).scale(1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityType4HoRo.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelType4HoRo()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityUC2Pdr.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelUC2Pdr()).setTranslation(0F, -2.1F, 0F).setScale(1.1F, 1.1F, 1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityYak9.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelYak9()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.EntityZero.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelZero()));

		//WW2 Official Pack Legacy
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.legacy.EntityBF109.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelBF109Legacy(), "BF109Legacy/BF109.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.legacy.EntityBofors.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelBoforsLegacy(), "BoforsLegacy/Bofors.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.ww2.legacy.EntityFlakvierling.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelFlakvierlingLegacy(), "FlakvierlingLegacy/Flakvierling.png"));
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
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.waw.EntityB24.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelLancaster(), "Lancaster/B24.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.waw.EntityB71.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelLancaster(), "Lancaster/B71.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.waw.EntityBlackPrince.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.legacy.ModelPanzer4(), "Panzer4/EnglishTank.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.waw.EntityC202.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Plane_YAK3_1(), "Yak3_old/Thunderbolt.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.waw.EntityCarro.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.legacy.ModelT34(), "T34/CarroArmato.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.waw.EntityDo17.class, new RenderFlansModEntity(new com.wolffsmod.model.official.ww2.ModelLancaster(), "Lancaster/Do17.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.waw.EntityFokker.class, new RenderFlansModEntity(new com.wolffsmod.model.waw.ModelFokkerDr1(), "FokkerDr1/FokkerDr1.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.waw.EntityLA7.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Plane_YAK3_1(), "Yak3_old/LA7.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.waw.EntityLusac.class, new RenderFlansModEntity(new com.wolffsmod.model.waw.ModelSopwithCamel(), "SopwithCamel/Lusac.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.waw.EntityRenault.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.legacy.ModelM41(), "M4/AMC.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.waw.EntitySopwith.class, new RenderFlansModEntity(new com.wolffsmod.model.waw.ModelSopwithCamel(), "SopwithCamel/SopwithCamel.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.waw.EntityType4.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.legacy.ModelM41(), "M4/Type4.png"));

		//Modern Warfare Official Pack
		RenderingRegistry.registerEntityRenderingHandler(EntitySentryGun.class, new RenderFlansModEntity(new ModelSentryGun()).setTranslation(0F, -2.2F, 0F).setScale(1.1F, 1.1F, 1.1F));

		//Wolff's Pack
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.wolff.EntityPanzerIVJ.class, new RenderFlansModEntity(new com.wolffsmod.model.wolff.ModelPanzerIVJ()).setTranslation(0F, -2F, 0F).setScale(0.9F, 0.9F, 0.9F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.wolff.EntitySdKfz251D.class, new RenderFlansModEntity(new com.wolffsmod.model.wolff.ModelSdKfz251D()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.wolff.EntitySdKfz251DManned.class, new RenderFlansModEntity(new com.wolffsmod.model.wolff.ModelSdKfz251DManned(), "SdKfz251D_Manned/SdKfz251D.png").setTranslation(0F, 0.9F, 0F).setRotation(0F, 90F, 0F));

		//Kikkoceccato
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.kikkoceccato.EntityPanzerI.class, new RenderFlansModEntity(new com.wolffsmod.model.kikkoceccato.ModelPanzerI()).setTranslation(0F, -1.5F, 0F).setScale(0.55F, 0.55F, 0.55F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.kikkoceccato.EntitySkwI.class, new RenderFlansModEntity(new com.wolffsmod.model.kikkoceccato.ModelSkwI(), "PanzerI/SkwI.png").setTranslation(0F, -1.5F, 0F).setScale(0.55F, 0.55F, 0.55F));

		//Manus WW2 Pack
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_AAGun_Flak20mmVierling_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_AAGun_Flak20mmVierling_1(), "Flakvierling_Manus/Flakvierling.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_AAGun_Flak20mmVierling_2A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_AAGun_Flak20mmVierling_2(), "Flakvierling_Manus/Flakvierling.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_AAGun_Flak20mmVierling_3A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_AAGun_Flak20mmVierling_3(), "Flakvierling_Manus/Flakvierling.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_AAGun_Flak20mmVierling_4A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_AAGun_Flak20mmVierling_4(), "Flakvierling_Manus/Flakvierling.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_AAGun_Flak88_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_AAGun_Flak88_1(), "Flak88_Manus/Flak88.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_AAGun_Flak88_2A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_AAGun_Flak88_2(), "Flak88_Manus/Flak88.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_AAGun_Flak88_3A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_AAGun_Flak88_3(), "Flak88_Manus/Flak88.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_AAGun_Flak88_4A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_AAGun_Flak88_4(), "Flak88_Manus/Flak88.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_A6M_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Plane_A6M_1(), "A6M/A6M_grey_red.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_Arado196_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Plane_Arado196_1(), "Arado196/Arado196.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_B17G_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Plane_B17G_1(), "B17G/B17G_Sally_B.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_Bf109E_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Plane_Bf109E_1(), "BF109_E3/BF109_E3_JG26.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_F4U_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Plane_F4U_1(), "F4U/F4U_Black_Sheep.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_F4U_2A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Plane_F4U_2(), "F4U/F4U_The_Twilight_Warriors.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_Fw190_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Plane_Fw190_1(), "Fw190A4/Fw190A4_JG2.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_HE111_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Plane_HE111_1(), "He111/He111.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_Hurricane_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Plane_Hurricane_1(), "Hurricane/Hurricane.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_IL2_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Plane_IL2_1(), "IL2_Missiles/IL2_174_ShAP.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_IL2_3A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Plane_IL2_3(), "IL2_Bombs/IL2_174_ShAP.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_IL2M_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Plane_IL2M_1(), "IL2M_Missiles/IL2M_233_ShAP.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_IL2M_3A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Plane_IL2M_3(), "IL2M_Bombs/IL2M_233_ShAP.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_IL2M_4A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Plane_IL2M_4(), "IL2M_6_GvShAP_Missiles/IL2M_6_GvShAP.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_IL2M_6A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Plane_IL2M_6(), "IL2M_6_GvShAP_Bombs/IL2M_6_GvShAP.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_JU87_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Plane_JU87_1(), "Ju87_Stuka/Ju87_Stuka.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_JU87_2A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Plane_JU87_2(), "Ju87_Kanonenvogel/Ju87_Kanonenvogel.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_ME262A_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Plane_ME262A_1(), "ME262A/ME262A_KG54.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_P38_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Plane_P38_1(), "P38/P38_metal.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_P51_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Plane_P51_1(), "P51/P51_CR_Y.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_Spitfire_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Plane_Spitfire_1(), "Spitfire_Manus/Spitfire_grey.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_SpitFireMkVB_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Plane_SpitFireMkVB_1(), "SpitfireMkVB/SpitFireMkVB_603_Squadron.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_YAK3_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Plane_YAK3_1(), "Yak3_old/Yak3.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_YAK3_1Aneu.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Plane_YAK3_1neu(), "Yak3/Yak3_303_FAD.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_FlakpanzerIV_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_FlakpanzerIV_1(), "FlakpanzerIV/FlakpanzerIV.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_GMCTruck_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_GMCTruck_1(), "GMCTruck/GMCTruck.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_GMCTruck_2A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_GMCTruck_2(), "GMCTruck/GMCTruck_open.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_HigginsBoat_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_HigginsBoat_1(), "HigginsBoat/HigginsBoat.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_Jagdpanther_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_Jagdpanther_1(), "Jagdpanther/Jagdpanther.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_JagdpanzerIV_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_JagdpanzerIV_1(), "JagdpanzerIV/JagdpanzerIV.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_Jagdtiger_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_Jagdtiger_1(), "Jagdtiger/Jagdtiger.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_M4A1_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_M4A1_1(), "M4A1/M4A1.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_M4A1_2A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_M4A1_2(), "M4A1/M4A1Calliope.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_M4A3_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_M4A3_1(), "M4A3/M4A3.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_OpelBlitz_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_OpelBlitz_1(), "OpelBlitz/OpelBlitz.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_OpelBlitz_2A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_OpelBlitz_2(), "OpelBlitz/OpelBlitz_Afrikakorps.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_Panther_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_Panther_1(), "PantherG/PantherG.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_PanzerhaubitzeHummel_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_PanzerhaubitzeHummel_1(), "Hummel/Hummel.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_PanzerIV_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_PanzerIV_1(), "PanzerIV_Manus/PanzerIVG.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_PanzerIV_2A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_PanzerIV_2(), "PanzerIV_Manus/PanzerIVH.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_RenaultFT17_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_RenaultFT17_1(), "RenaultFT17/RenaultFT17.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_SU85_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_SU85_1(), "SU85/SU85.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_SU100_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_SU100_1(), "SU100/SU100.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_SU122_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_SU122_1(), "SU122/SU122.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_T34_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_T34_1(), "T34_76/T34_76.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_T34_2A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_T34_2(), "T34_85/T34_85.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_TigerI_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_TigerI_1(), "TigerIE/TigerIE.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_TigerII_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_TigerII_1(), "TigerIIB/TigerIIB.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_VWType82_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_VWType82_1(), "VWType82/VWType82.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_WillyJeep_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_WillyJeep_1(), "WillyJeep/WillyJeep.png"));

		//Manus WW2 Pack Legacy
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.legacy.EntityM4.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.legacy.ModelM41(), "M4/M4Sherman.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.legacy.EntityME109.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Plane_ME109_1(), "BF109Old/BF109.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.legacy.EntityME262.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Plane_ME262_1(), "ME262/ME262.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.legacy.EntityPanzer4G.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.legacy.ModelPanzer4(), "Panzer4/PanzerIVG.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.legacy.EntityPanzer4H.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.legacy.ModelPanzer4(), "Panzer4/PanzerIVH.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.legacy.EntityT34.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.legacy.ModelT34()));

		//Manus Modern Warfare Pack
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntityA10.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelA10()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntityAC130A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelAC130A()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntityAH1Z.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelAH1Z(), "AH1Z/AH1Z_Green.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntityBoxer1.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelBoxer1(), "Boxer/Boxer.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntityBoxer2.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelBoxer2(), "Boxer/Boxer.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntityBoxer3.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelBoxer3(), "Boxer/Boxer.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntityBoxer4.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelBoxer4(), "Boxer/Boxer.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntityBoxer5.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelBoxer5(), "Boxer/Boxer.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntityBwTruck.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelBwTruck()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntityC130H.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelC130H(), "C130H/C130H_AirForce.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntityE3D.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelE3D()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntityF22.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelF22()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntityHMMWV1.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelHMMWV1(), "HMMWV/HMMWV.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntityHMMWV2.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelHMMWV2(), "HMMWV/HMMWV.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntityHMMWV3.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelHMMWV3(), "HMMWV/HMMWV.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntityHMMWV4.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelHMMWV4(), "HMMWV/HMMWV.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntityLeopard2A6.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelLeopard2A6(), "Leopard2A6_Manus/Leopard2A6.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntityLeopard2A7.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelLeopard2A7()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntityMIG15.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelMIG15()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntitySkyshield.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelSkyshield()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntityTU22M.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelTU22M()));

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
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.EntityLeopard2A6.class, new RenderLeopard2A6(new ModelLeopard2A6(), 0));
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
		RenderingRegistry.registerEntityRenderingHandler(EntityRomeoClassSub.class, new RenderRomeoClassSub(new ModelRomeoClassSub(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityMirageF1.class, new RenderMirageF1(new ModelMirageF1(), 0));
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
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.EntityJu87D3.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelJu87D3()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.EntityPanzerIVF1.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelPanzerIVF1(), "PanzerIVF/PanzerIVF.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.EntityStuG3G.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelStuG3G()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.EntityTiger1H.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelTiger1H()).scale(1.2F));

		//Exufo's cop cars
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.exufo.EntityCopvic.class, new RenderFlansModEntity(new com.wolffsmod.model.exufo.ModelCopvic(), "CopCar/CopCar1.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.exufo.EntityCV.class, new RenderFlansModEntity(new com.wolffsmod.model.exufo.ModelCV(), "CopCar/CopCar2.png"));
	}
}
