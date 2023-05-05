package com.wolffsmod;

import com.wolffsmod.render.RenderFlansModEntity;
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
		if (ContentPacks.officialWW2)
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

		}

		//Ye Olde Official Pack
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.yeolde.EntityBiplane.class, new RenderFlansModEntity(new com.wolffsmod.model.official.yeolde.ModelBiplane()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.yeolde.EntityTwoSeatBiplane.class, new RenderFlansModEntity(new com.wolffsmod.model.official.yeolde.ModelTwoSeatBiplane()));

		if (ContentPacks.worldAtWar)
		{
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
		}


		if (ContentPacks.officialMW)
		{
			//Modern Warfare Official Pack
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.mw.EntityA10.class, new RenderFlansModEntity(new com.wolffsmod.model.official.mw.ModelA10()).scale(1.28F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.mw.EntityAbrams.class, new RenderFlansModEntity(new com.wolffsmod.model.official.mw.ModelAbrams()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.mw.EntityApache.class, new RenderFlansModEntity(new com.wolffsmod.model.official.mw.ModelApacheAH64()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.mw.EntityB52.class, new RenderFlansModEntity(new com.wolffsmod.model.official.mw.ModelB52()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.mw.EntityBlackHawk.class, new RenderFlansModEntity(new com.wolffsmod.model.official.mw.ModelBlackHawk()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.mw.EntityChallyIISimple.class, new RenderFlansModEntity(new com.wolffsmod.model.official.mw.ModelChallengerII()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.mw.EntityChinook.class, new RenderFlansModEntity(new com.wolffsmod.model.official.mw.ModelChinook()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.mw.EntityCobra.class, new RenderFlansModEntity(new com.wolffsmod.model.official.mw.ModelCobra()).setTranslation(0F, RenderFlansModEntity.DEFAULT_Y_TRANSLATION - 0.875F, 0F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.mw.EntityF22.class, new RenderFlansModEntity(new com.wolffsmod.model.official.mw.ModelF22()).scale(1.19F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.mw.EntityHind.class, new RenderFlansModEntity(new com.wolffsmod.model.official.mw.ModelHind()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.mw.EntityHumvee.class, new RenderFlansModEntity(new com.wolffsmod.model.official.mw.ModelHumvee()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.mw.EntityLeopard2A6.class, new RenderFlansModEntity(new com.wolffsmod.model.official.mw.ModelLeopard2A6()).setTranslation(0F, -1.77F, 0F).setScale(0.77F, 0.77F, 0.77F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.mw.EntityLittleBird.class, new RenderFlansModEntity(new com.wolffsmod.model.official.mw.ModelLittleBird()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.mw.EntityMIM23.class, new RenderFlansModEntity(new com.wolffsmod.model.official.mw.ModelMIM23()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.mw.EntitySentryGun.class, new RenderFlansModEntity(new com.wolffsmod.model.official.mw.ModelSentryGun()).setTranslation(0F, -2.2F, 0F).setScale(1.1F, 1.1F, 1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.mw.EntitySU25.class, new RenderFlansModEntity(new com.wolffsmod.model.official.mw.ModelSU25()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.mw.EntityT90.class, new RenderFlansModEntity(new com.wolffsmod.model.official.mw.ModelT90()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.mw.EntityTiger.class, new RenderFlansModEntity(new com.wolffsmod.model.official.mw.ModelEC665()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.mw.EntityTornado.class, new RenderFlansModEntity(new com.wolffsmod.model.official.mw.ModelTornado()).scale(1.2F));
		}

		//Titan Pack
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.titan.EntityAlphaTitan.class, new RenderFlansModEntity(new com.wolffsmod.model.official.titan.ModelProtoTitan(), "ProtoTitan/AlphaTitan.png").scale(2F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.titan.EntityProtoTitan.class, new RenderFlansModEntity(new com.wolffsmod.model.official.titan.ModelProtoTitan(), "ProtoTitan/ProtoTitan.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.titan.EntityZeroTitan.class, new RenderFlansModEntity(new com.wolffsmod.model.official.titan.ModelZeroTitan()));

		//Apocalypse Pack
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.apocalypse.EntityBuggy.class, new RenderFlansModEntity(new com.wolffsmod.model.official.apocalypse.ModelBuggy()));

		//Utility Pack
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.official.utility.EntityTunnelBore.class, new RenderFlansModEntity(new com.wolffsmod.model.official.utility.ModelTunnelBore()));

		//Wolff's Pack
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.wolff.EntityPanzerIVJ.class, new RenderFlansModEntity(new com.wolffsmod.model.wolff.ModelPanzerIVJ()).setTranslation(0F, -2F, 0F).setScale(0.9F, 0.9F, 0.9F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.wolff.EntitySdKfz251D.class, new RenderFlansModEntity(new com.wolffsmod.model.wolff.ModelSdKfz251D()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.wolff.EntitySdKfz251DManned.class, new RenderFlansModEntity(new com.wolffsmod.model.wolff.ModelSdKfz251DManned(), "SdKfz251D_Manned/SdKfz251D.png").setTranslation(0F, 0.9F, 0F).setRotation(0F, 90F, 0F));

		//Kikkoceccato
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.kikkoceccato.EntityPanzerI.class, new RenderFlansModEntity(new com.wolffsmod.model.kikkoceccato.ModelPanzerI()).setTranslation(0F, -1.5F, 0F).setScale(0.55F, 0.55F, 0.55F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.kikkoceccato.EntitySkwI.class, new RenderFlansModEntity(new com.wolffsmod.model.kikkoceccato.ModelSkwI(), "PanzerI/SkwI.png").setTranslation(0F, -1.5F, 0F).setScale(0.55F, 0.55F, 0.55F));

		if (ContentPacks.manusWW2)
		{
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
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_B17G_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Plane_B17G_1(), "B17G_Manus/B17G_Sally_B.png"));
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
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_GMCTruck_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_GMCTruck_1(), "GMCTruck_Manus/GMCTruck.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_GMCTruck_2A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_GMCTruck_2(), "GMCTruck_Manus/GMCTruck_open.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_HigginsBoat_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_HigginsBoat_1(), "HigginsBoat/HigginsBoat.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_Jagdpanther_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_Jagdpanther_1(), "Jagdpanther/Jagdpanther.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_JagdpanzerIV_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_JagdpanzerIV_1(), "JagdpanzerIV/JagdpanzerIV.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_Jagdtiger_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_Jagdtiger_1(), "Jagdtiger/Jagdtiger.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_M4A1_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_M4A1_1(), "M4A1/M4A1.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_M4A1_2A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_M4A1_2(), "M4A1/M4A1Calliope.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_M4A3_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_M4A3_1(), "M4A3/M4A3.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_OpelBlitz_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_OpelBlitz_1(), "OpelBlitz/OpelBlitz.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_OpelBlitz_2A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_OpelBlitz_2(), "OpelBlitz/OpelBlitz_Afrikakorps.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_Panther_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.ww2.ModelWW2_Vehicle_Panther_1(), "PantherG_Manus/PantherG.png"));
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
		}

		if (ContentPacks.manusMW)
		{
			//Manus Modern Warfare Pack
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntityA10.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelA10(), "A10_Manus/A10.png"));
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
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntityF22.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelF22(), "F22_Manus/F22.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntityHMMWV1.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelHMMWV1(), "HMMWV/HMMWV.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntityHMMWV2.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelHMMWV2(), "HMMWV/HMMWV.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntityHMMWV3.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelHMMWV3(), "HMMWV/HMMWV.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntityHMMWV4.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelHMMWV4(), "HMMWV/HMMWV.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntityLeopard2A6.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelLeopard2A6(), "Leopard2A6_Manus/Leopard2A6.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntityLeopard2A7.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelLeopard2A7()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntityMIG15.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelMIG15(), "MIG15_Manus/MIG15.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntitySkyshield.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelSkyshield()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.mw.EntityTU22M.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.mw.ModelTU22M()));
		}

		if (ContentPacks.extraZero8)
		{
			//Extra Zero 8
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.Entity2B9Vasilek.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.Model2B9()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.Entity38t.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.Model38t()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityA39Tortoise.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelA39()).scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityAH1G.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelAH1Gv2()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityBM21.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelBM21()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityBMD1.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelBMD1()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityBMD2.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelBMD2()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityBMP1.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelBMP1()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityBMP2.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelBMP2()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityBTR80.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelBTR80()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityBTRRD.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelBTRD()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityBTRZD.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelBTRZD()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityDzhighit.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelDzhighit()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityJagdpanzer38t.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelHetzer()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityLVT2.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelLVT2()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityLVTA1.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelLVTA1()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityM1.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelM1()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityM48A3.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelM48A3()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityM551.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelM551()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityMi24P.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelMi24P()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityML20.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelML20()).setTranslation(0F, -2.3F, 0F).setScale(1.1F, 1.1F, 1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityPz2.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelPzkpfw2()).scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityPz3.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelPzkpfw3()).scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityPz8.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelMaus()).scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityPz6.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelTiger1E()).scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityStug3.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelStug3()).scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntitySturmtiger.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelSturmtiger()).scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityT35.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelT35()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityT62.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelT62()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityT62MV.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelT62MV()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityT64A.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelT64A()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityTKS.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelTKS()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityTKS20mm.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelTKS20()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityType95HaGo.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelType95()).scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityType97ChiHa.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelType97()).scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityUH1B.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelUH1Bv2()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityUH1C.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelUH1C()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityUral4320.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelUral4320C(), "Ural4320/Ural4320C.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityZiS3.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelZis3()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityZSU234.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelZSU23v2()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.ez8.EntityZU232.class, new RenderFlansModEntity(new com.wolffsmod.model.ez8.ModelZU232(), "BTRZD/BTRZD.png"));
		}

		if (ContentPacks.lizard)
		{
			//Lizard
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.lizard.EntityM113A1.class, new RenderFlansModEntity(new com.wolffsmod.model.lizard.ModelM113A1()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.lizard.EntityM113A3.class, new RenderFlansModEntity(new com.wolffsmod.model.lizard.ModelM113A3()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.lizard.EntityM41.class, new RenderFlansModEntity(new com.wolffsmod.model.lizard.ModelM41()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.lizard.EntityT55A.class, new RenderFlansModEntity(new com.wolffsmod.model.lizard.ModelT55A()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.lizard.EntityT72A.class, new RenderFlansModEntity(new com.wolffsmod.model.lizard.ModelT72A(), "T72A1979/T72A1979.png"));
		}

		//Tankcraft
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.tankcraft.EntityM60A1.class, new RenderFlansModEntity(new com.wolffsmod.model.tankcraft.ModelTCM60A1(), "M60A1/M60A1.png"));

		if (ContentPacks.monolithAndTaP)
		{
			//Monolith Pack
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntityBMPT72.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelBMPT()).scale(0.9F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntityChengdu.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelSkyMao(), "ChengduJ20/ChengduJ20.png").scale(0.7F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntityF15J.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelGalmOne(), "GalmOne/F15J.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntityFalken.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelFalken()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntityFerdinand.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelFerdinand()).scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntityGalmOne.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelGalmOne()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntityGalmTwo.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelGalmTwo()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntityKV2.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelKV2(), "KV2_Monolith/KV2.png").scale(1.2F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntityMonitor.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelMonitorMk5()).scale(2.5F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntityMorgan.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelADFX02Morgan()).scale(1.2F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntityMsta.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelMsta()).scale(1.2F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntityPorsche.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelPorsche(), "TigerPorsche/TigerPorsche.png").scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntityRobertLee.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelRobertLee(), "M3Lee_Monolith/M3Lee.png").scale(1.2F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntitySchwererGustav.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelGustav()).scale(3.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntityShinden.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelShinden()).scale(1.3F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntityStug.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelStug()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntitySzhatie.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelSzhatie()).scale(1.2F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntityT72.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelT72Mark3(), "T72A/T72A.png").scale(1.2F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntityT80.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelT80Fixed(), "T80/T80.png").scale(1.2F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntityT80Clone.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelT80BVotsu(), "T80Cammo/T80Cammo.png").scale(1.2F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntityT90.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelT90A()).scale(1.2F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntityTog2.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelTog()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntityTos1a.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelTos2(), "Tos/Tos.png").scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntityType74.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelType74()).scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntityWZ123.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelNorinco(), "WZ123/WZ123.png").scale(1.2F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.Entityhashidate.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelHashidate()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.Entitytype10.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelType10Kai()).scale(1.2F));

			//Monolith TaP
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntityA7V.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelA7V()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntityK2BlackPanther.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelK2overdrive(), "K2/K2.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntityKimJongSub.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelRomeo(), "RomeoClassSub/RomeoClassSub.png").scale(3.0F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntityRomeoSub.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelRomeo(), "RomeoClassSub/KimJongSub.png").scale(3.0F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntitySlava.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelSlava()).scale(3.0F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntityT14Armata.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelArmataMBT(), "T14Armata/T14Armata.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntityT26.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelT26()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.monolith.EntityType90.class, new RenderFlansModEntity(new com.wolffsmod.model.monolith.ModelKyuMaru(), "Type90KyuMaru/Type90KyuMaru.png").scale(0.85F));

			//Other TaP
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.baf.EntityHurricane.class, new RenderFlansModEntity(new com.wolffsmod.model.baf.ModelHurricane(), "HawkerHurricane/HawkerHurricane.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.newage.EntityBF109E3.class, new RenderFlansModEntity(new com.wolffsmod.model.newage.ModelBF109E3()).scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.newage.EntityEurocopterTigerHAD.class, new RenderFlansModEntity(new com.wolffsmod.model.newage.ModelEurocopterTigerHAP()).scale(0.95F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.newage.EntityEurocopterTigerUHT.class, new RenderFlansModEntity(new com.wolffsmod.model.newage.ModelEurocopterTigerUHT()).scale(0.95F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.newage.EntityHurricaneMk2c.class, new RenderFlansModEntity(new com.wolffsmod.model.newage.ModelHurricanemk2(), "HurricaneMkII/HurricaneMkII.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.newage.EntityHurricaneMk2d.class, new RenderFlansModEntity(new com.wolffsmod.model.newage.ModelHurricane40(), "HurricaneMkIId/HurricaneMkIId.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.newage.EntityMirageF1.class, new RenderFlansModEntity(new com.wolffsmod.model.newage.ModelMirageF1()).scale(1.2F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.newage.EntityT3TToyotaHiluxBMP1.class, new RenderFlansModEntity(new com.wolffsmod.model.newage.ModelToyotaHiluxBMP1()).scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.newage.EntityT3TToyotaHiluxDSHK.class, new RenderFlansModEntity(new com.wolffsmod.model.newage.ModelToyotaHiluxDSHK()).scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.newage.EntityT3TToyotaHiluxKornet.class, new RenderFlansModEntity(new com.wolffsmod.model.newage.ModelToyotaHiluxKornet()).scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.newage.EntityT3TToyotaHiluxS5.class, new RenderFlansModEntity(new com.wolffsmod.model.newage.ModelToyotaHiluxS5()).scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.newage.EntityT3TToyotaHiluxSPG9.class, new RenderFlansModEntity(new com.wolffsmod.model.newage.ModelToyotaHiluxSPG9()).scale(1.1F));

		}

		//Price additions
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.price.EntityMCOMStation.class, new RenderFlansModEntity(new com.wolffsmod.model.price.ModelMCOMStation()).setTranslation(0F, -1.65F, 0F).setScale(1.1F, 1.1F, 1.1F).setRotation(180F, -180F, 0F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.price.EntityMilitaryCrate.class, new RenderFlansModEntity(new com.wolffsmod.model.price.ModelMilitaryCrate()).setTranslation(0F, -1.65F, 0F).setScale(1.1F, 1.1F, 1.1F).setRotation(180F, -180F, 0F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.price.EntityRadioStation.class, new RenderFlansModEntity(new com.wolffsmod.model.price.ModelRadioStation()).setTranslation(0F, -1.65F, 0F).setScale(1.1F, 1.1F, 1.1F).setRotation(180F, -180F, 0F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.price.EntityRadioStationSmall.class, new RenderFlansModEntity(new com.wolffsmod.model.price.ModelRadioStationSmall()).setTranslation(0F, -2.85F, 0F).setScale(1.1F, 1.1F, 1.1F).setRotation(180F, -180F, 0F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.price.EntitySandBags1.class, new RenderFlansModEntity(new com.wolffsmod.model.price.ModelSandBags1()).setTranslation(0F, -1.5F, 0F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.price.EntitySandBags2.class, new RenderFlansModEntity(new com.wolffsmod.model.price.ModelSandBags2()).setTranslation(0F, -0.5F, 0F).setScale(0.25F, 0.25F, 0.25F).setRotation(180F, 0F, 0F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.price.EntitySupplies.class, new RenderFlansModEntity(new com.wolffsmod.model.price.ModelSupplies()).setTranslation(0F, -2.2F, 0F).setScale(1.1F, 1.1F, 1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.price.EntityPak43.class, new RenderFlansModEntity(new com.wolffsmod.model.price.ModelPak43()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.price.EntitySoDa.class, new RenderFlansModEntity(new com.wolffsmod.model.price.ModelSoDa()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.price.EntityTeKe.class, new RenderFlansModEntity(new com.wolffsmod.model.price.ModelTeKe()).scale(1.1F));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.price.EntityTKlate.class, new RenderFlansModEntity(new com.wolffsmod.model.price.ModelTKlate()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.price.EntityOccupier.class, new RenderFlansModEntity(new com.wolffsmod.model.price.ModelOccupier()));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.price.EntityP51D.class, new RenderFlansModEntity(new com.wolffsmod.model.price.ModelP51D()));

		if (ContentPacks.warfare44)
		{
			//Warfare 44
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_50CalTripod.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.Model50CalTripod()).scale(0.45F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_A6M5Zero.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelA6M5Zero()).scale(1.05F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Achilles.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelAchilles()).scale(1.15F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_B17G.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelB17G()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_BF109G10.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelBF109G10()).scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_BF110G2.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelBF110G2()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_BF110G4.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelBF110G4()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Bishop.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelBishop()).scale(0.95F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Bofors40mm.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelBofors40mm(), "Bofors40mm/Bofors_American.png").scale(0.8F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Challenger.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelChallenger()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_ChiHa.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelChiHa(), "ChiHa_w44/ChiHa.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_ChiHaKai.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelChiHaKai()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_ChiHe.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelChiHe()).scale(1.25F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_ChiNu.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelChiNu(), "ChiNu_w44/ChiNu.png").scale(1.25F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_ChiNu2.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelChiNu2(), "ChiNu_w44/ChiNu.png").scale(1.25F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_ChiRi.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelChiRi()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Churchill3.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelChurchill3()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Churchill3AVRE.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelChurchill3AVRE()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Churchill3GunCarrier.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelChurchill3GunCarrier()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Cromwell.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelCromwell(), "Cromwell_w44/Cromwell.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_CrusaderMkIII.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelCrusaderMkIII()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_D3A.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelD3A()).scale(1.05F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Firefly.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelFirefly()).scale(1.15F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Flak37mm.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelFlak37()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Flak88.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelFlak88(), "Flak88_w44/Flak88.png").scale(1.2F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_GMCTruck.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelGMCTruck()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_GMCTruckT27Xylophone.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelGMCTruckT27Xylophone()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_HaGo.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelHaGo()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_HigginsLCVP.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelHigginsLCVP()).scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_HoI.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelHoI(), "ChiNu_w44/ChiNu.png").scale(1.25F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_IGo.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelIGo()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_IS2.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelIS2(), "IS2_w44/IS2.png").scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Ju87D3.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelJu87D3()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Ju87G1.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelJu87G1()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_KV1E.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelKV1E()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_KV2.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelKV2()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_KubelwagenMg34.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelKubelwagenMg34(), "Kubelwagen/Kubelwagen.png").scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_KubelwagenMg42.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelKubelwagenMg42(), "Kubelwagen/Kubelwagen.png").scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Kurogane.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelKurogane()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_M10Wolverine.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelM10Wolverine()).scale(1.15F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_M157mm.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelM157mm(), "M157mmGun/M157mmGun.png").scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_M18Hellcat.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelM18Hellcat()).scale(1.25F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_M20ArmoredCar.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelM20ArmoredCar(), "M8Greyhound/M8Greyhound.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_M24Chaffee.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelM24Chaffee()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_M26.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelM26()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_M38Wolfhound.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelM38Wolfhound()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_M3Halftrack.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelM3Halftrack(), "M3Halftrack_w44/M3Halftrack.png").scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_M3Lee.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelM3Lee()).scale(1.15F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_M4A1Sherman.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelM4A1ShermanDD()).scale(1.15F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_M4A3E2Sherman.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelM4A3E2Sherman()).scale(1.15F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_M4A3E8Sherman.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelM4A3E8Sherman(), "M4A3E8Sherman_w44/M4A3E8Sherman.png").scale(1.15F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_M4Sherman.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelM4Sherman()).scale(1.15F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_M4ShermanT34Calliope.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelM4ShermanT34Calliope()).scale(1.15F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_M5A1Stuart.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelM5A1Stuart()).scale(0.95F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_M8A1GMC.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelM8A1GMC(), "M8/M8.png").scale(0.95F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_M8Greyhound.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelM8Greyhound()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_M8HMCScott.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelM8HMCScott(), "M8/M8.png").scale(0.95F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Marder2.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelMarder2()).scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Mg34Tripod.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelMg34Tripod()).scale(1.25F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_OI.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelOI()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Opelblitz.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelOpelblitz(), "Opelblitz_w44/Opelblitz.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_P47D.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelP47D()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_P51DMustang.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelP51DMustang()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Pak40.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelPak40(), "Pak40_w44/Pak40.png").scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_PantherCommand.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelPantherCommand()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_PantherG.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelPantherG()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Panzer2C.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelPanzer2C()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Panzer38t.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelPanzer38t()).scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_PanzerIIIF.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelPanzerIIIF(), "PanzerIII/PanzerIII.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_PanzerIIIM.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelPanzerIIIM(), "PanzerIII/PanzerIII.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_PanzerIVF1.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelPanzerIVF1(), "PanzerIVF/PanzerIVF.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_PanzerIVF2.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelPanzerIVF2(), "PanzerIVF/PanzerIVF.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_PanzerIVH.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelPanzerIVH()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Puma.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelPuma()).scale(1.15F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_QF2Pdr.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelQF2Pdr()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_S100.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelS100(), "S100_w44/S100.png").scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_SU100.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelSU100(), "SU/SU.png").scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_SU76M.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelSU76M(), "SU76M/SU76M.png").scale(0.9F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_SU85.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelSU85(), "SU/SU.png").scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_SdKfz251Hanomag.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelSdKfz251Hanomag()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_SdkFz1401.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelSdKfz1401()).scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Spitfire.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelSpitfire(), "Spitfire_w44/Spitfire.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_StuG3G.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelStuG3G()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_StuGIV.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelStuGIV(), "StuGIV_w44/StuGIV.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_StudebackerUS6.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelStudebakerUS6()).scale(1.15F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_StudebakerBM13N.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelStudebakerBM13N()).scale(1.15F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_T20.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelT20()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_T26E1.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelT26E1(), "M26/M26.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_T34100.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelT34100()).scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_T3476.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelT3476Mod1942()).scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_T3476Mod1940.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelT3476Mod1940()).scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_T3485.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelT3485(), "T3485_w44/T3485.png").scale(1.1F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_T70.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelT70()).scale(0.9F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Tiger1H.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelTiger1H()).scale(1.2F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Tiger2.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelTiger2()).scale(1.2F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_TigerP.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelTigerP()).scale(1.2F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Type1HoNi1.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelType1HoNi1()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Type2KaMi.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelType2KaMi()).scale(1.4F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Type3HoNi3.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelType3HoNi3()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Type4HoRo.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelType4HoRo(), "Type4HoRo_w44/Type4HoRo.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Type92Tripod.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelType92Tripod()).scale(0.15F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Type98AA.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelType98AA()));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_ValentineII.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelValentineII()).scale(0.95F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Wespe.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelWespe()).scale(0.95F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Willys30Cal.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelWillys30Cal(), "Willys/Willys.png").scale(0.9F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Willys50Cal.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelWillys50Cal(), "Willys/Willys.png").scale(0.9F));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_Yak9.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelYak9(), "Yak9_w44/Yak9.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_ZiS2.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelZiS2(), "ZiS23/ZiS23.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_ZiS3.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelZiS3(), "ZiS23/ZiS23.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.w44.Entity44_ZiS30.class, new RenderFlansModEntity(new com.wolffsmod.model.w44.ModelZiS30()));
		}

		//Exufo's cop cars
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.exufo.EntityCopvic.class, new RenderFlansModEntity(new com.wolffsmod.model.exufo.ModelCopvic(), "FordCrownVictoria_Police/FordCrownVictoria_Police.png"));
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.exufo.EntityCV.class, new RenderFlansModEntity(new com.wolffsmod.model.exufo.ModelCV(), "FordCrownVictoria/FordCrownVictoria.png"));

		//Prototype
		RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.prototype.EntityRatte.class, new RenderFlansModEntity(new com.wolffsmod.model.prototype.ModelRatte()).setTranslation(0F, -5F, 0F).setScale(2.4F, 2.4F, 2.4F));

		if (ContentPacks.manusCivil)
		{
			//Manus Civil Pack
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.civil.EntityCivil_Plane_Boeing707_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.civil.ModelCivil_Plane_Boeing707_1(), "Boeing707/Boeing707_Lufthansa.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.civil.EntityCivil_Plane_Learjet28_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.civil.ModelCivil_Plane_Learjet28_1(), "Learjet28/Learjet28.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_ATeam_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.civil.ModelCivil_Vehicle_ATeam_1(), "ATeam/ATeam.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_BankTruck_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.civil.ModelCivil_Vehicle_BankTruck_1(), "BankTruck/BankTruck.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_Car_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.civil.ModelCivil_Vehicle_Car_1(), "Car1/Car_Black.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_Car_2A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.civil.ModelCivil_Vehicle_Car_2(), "Car2/Cadillac_Pink.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_Cop_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.civil.ModelCivil_Vehicle_Cop_1(), "CopCar/CopCar.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_F1_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.civil.ModelCivil_Vehicle_F1_1(), "Formula1/F1_Red.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_GolfCart_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.civil.ModelCivil_Vehicle_GolfCart_1(), "GolfCart/GolfCart.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_LKW1_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.civil.ModelCivil_Vehicle_LKW1_1(), "LKW1_1/LKW.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_LKW1_2A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.civil.ModelCivil_Vehicle_LKW1_2(), "LKW1_2/LKW.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_LKW1_3A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.civil.ModelCivil_Vehicle_LKW1_3(), "LKW1_3/LKW.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_LKW2_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.civil.ModelCivil_Vehicle_LKW2_1(), "LKW2_1/LKW.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_LKW2_2A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.civil.ModelCivil_Vehicle_LKW2_2(), "LKW2_2/LKW.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_LKW2_3A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.civil.ModelCivil_Vehicle_LKW2_3(), "LKW2_3/LKW.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_LKW3_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.civil.ModelCivil_Vehicle_LKW3_1(), "LKW3_1/LKW.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_LKW3_2A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.civil.ModelCivil_Vehicle_LKW3_2(), "LKW3_2/LKW.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_Medic_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.civil.ModelCivil_Vehicle_Medic_1(), "AmbulanceVan/AmbulanceVan.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_PoliceTruck_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.civil.ModelCivil_Vehicle_PoliceTruck_1(), "PoliceTruck1/PoliceTruck.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_PoliceTruck_2A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.civil.ModelCivil_Vehicle_PoliceTruck_2(), "PoliceTruck2/PoliceTruck.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_Ram_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.civil.ModelCivil_Vehicle_Ram_1(), "DogdeRam/DogdeRam.png"));
			RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_Taxi_1A.class, new RenderFlansModEntity(new com.wolffsmod.model.manus.civil.ModelCivil_Vehicle_Taxi_1(), "Taxi/Taxi.png"));

		}
	}
}
