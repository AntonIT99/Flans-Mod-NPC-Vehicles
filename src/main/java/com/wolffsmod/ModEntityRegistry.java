package com.wolffsmod;

import com.wolffsmod.entity.*;
import com.wolffsmod.entity.kikkoceccato.EntityPanzerI;
import com.wolffsmod.entity.kikkoceccato.EntitySkwI;
import com.wolffsmod.entity.manus.ww2.legacy.EntityT34;
import com.wolffsmod.entity.manus.ww2.legacy.EntityM4;
import com.wolffsmod.entity.manus.ww2.legacy.EntityPanzer4G;
import com.wolffsmod.entity.manus.ww2.legacy.EntityPanzer4H;
import com.wolffsmod.entity.w44.*;
import com.wolffsmod.entity.wolff.EntityPanzerIVJ;
import com.wolffsmod.entity.wolff.EntitySdKfz251D;
import cpw.mods.fml.common.registry.EntityRegistry;

import net.minecraft.entity.Entity;


public class ModEntityRegistry {
	private ModEntityRegistry() {}

	private static int EntityID = 0;

	public static void registerEntities()
	{
		//WW2 Official Pack
		createEntity(com.wolffsmod.entity.official.ww2.Entity105leFH18B2.class, "105mm leFH 18 B2 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityB1.class, "Renault Char B1 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityBF109.class, "Messerschmitt Bf 109 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityBMWR75.class, "BMW R 75 Gespann (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityBofors.class, "40mm Bofors (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityCamel.class, "Sopwith Camel (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityChaffee.class, "M24 Chaffee (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityChiHa.class, "Type 97 Chi-Ha (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityChiNu.class, "Type 3 Chi-Nu (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityChurchill.class, "Churchill Mk VII (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityCromwell.class, "Cromwell (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityCrusader.class, "Cruiser Mk. VI Crusader (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityFlak88.class, "88mm Flak 36 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityFlakvierling.class, "20mm Flakvierling 38 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityFokker.class, "Fokker Dr.1 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityFury.class, "M4A3E8 Sherman Fury (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityGreyhound.class, "M8 Greyhound (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityHellcat.class, "M18 Hellcat (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityIS2.class, "IS-2 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityJeep.class, "Jeep (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityKubel.class, "Kuebelwagen (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityKV1.class, "KV-1 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityLancaster.class, "Avro Lancaster (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityLuchs.class, "Panzer II Ausf. L Luchs (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityM3Halftrack.class, "M3 Halftrack (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityM10.class, "M10 Wolverine (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityM45QuadMount.class, "M45 Quadmount (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityM157mm.class, "57mm M1 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityMustang.class, "North American P-51 Mustang (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityPak40.class, "75mm PaK 40 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityPanzerIV.class, "Panzer IV Ausf. H (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityS100.class, "S-100 Schnellboot (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntitySASJeep.class, "SAS Jeep (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntitySdkFz2.class, "SdKfz 2 Kettenkrad (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntitySdkFz222.class, "SdKfz 222 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntitySdkFz251.class, "SdKfz 251 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntitySherman.class, "M4A3E8 Sherman Easy Eight (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntitySpitfire.class, "Supermarine Spitfire (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityStuG.class, "StuG IV (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntitySU112.class, "SU-1-12 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityT3476.class, "T-34/76 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityT3485.class, "T-34/85 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityTiger.class, "Panzer VI Tiger (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityTiger131.class, "Panzer VI Tiger 131 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityTigerII.class, "Panzer VI Tiger II (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityType4HoRo.class, "Type 4 Ho-Ro (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityUC2Pdr.class, "Universal Carrier 2Pdr (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityYak9.class, "Yakovlev Yak-9 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityZero.class, "Mitsubishi A6M Zero (Official Pack)");

		//WW2 Official Pack Legacy
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityBF109.class, "Messerschmitt Bf 109 (Official Pack Legacy)");
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityBofors.class, "40mm Bofors (Official Pack Legacy)");
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityFlakvierling.class, "20mm Flakvierling 38 (Official Pack Legacy)");
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityJeep.class, "Jeep (Official Pack Legacy)");
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityKubel.class, "Kuebelwagen (Official Pack Legacy)");
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityM4Sherman.class, "M4 Sherman (Official Pack Legacy)");
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityM157mm.class, "57mm M1 (Official Pack Legacy)");
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityMustang.class, "North American P-51 Mustang (Official Pack Legacy)");
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityPak40.class, "75mm PaK 40 (Official Pack Legacy)");
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityPanzerIIL.class, "Panzer II Ausf. L Luchs (Official Pack Legacy)");
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityPanzerIV.class, "Panzer IV Ausf. H (Official Pack Legacy)");
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityPanzerIVOld.class, "Panzer IV (Official Pack Legacy)");
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityPanzer.class, "Panzer (Official Pack Legacy)");
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntitySherman.class, "Sherman (Official Pack Legacy)");
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityYak9.class, "Yakovlev Yak-9 (Official Pack Legacy)");
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityZero.class, "Mitsubishi A6M Zero (Official Pack Legacy)");

		//Ye Olde Official Pack
		createEntity(com.wolffsmod.entity.official.yeolde.EntityBiplane.class, "Biplane (Official Pack)");
		createEntity(com.wolffsmod.entity.official.yeolde.EntityTwoSeatBiplane.class, "Two Seat Biplane (Official Pack)");

		//World at War Pack
		createEntity(com.wolffsmod.entity.waw.EntityBlackPrince.class, "Black Prince (World at War Pack)");

		//Modern Official Pack
		createEntity(EntitySentryGun.class, "Sentry Gun (Official Pack)");

		//Wolff's Pack
		createEntity(com.wolffsmod.entity.wolff.EntityPanzerIVJ.class, "Panzer IV Ausf. J (Wolff's Pack)");
		createEntity(com.wolffsmod.entity.wolff.EntitySdKfz251D.class, "SdKfz 251 Ausf. D (Wolff's Pack)");

		//Kikkoceccato
		createEntity(com.wolffsmod.entity.kikkoceccato.EntityPanzerI.class, "Panzer I Ausf. A (Kikkoceccato)");
		createEntity(com.wolffsmod.entity.kikkoceccato.EntitySkwI.class, "Sanitaetskraftwagen I Ausf. A (Kikkoceccato)");

		//Manus WW2 Pack
		//createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_A6M_1A
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_FlakpanzerIV_1A.class, "Flakpanzer IV Wirbelwind (Manus Pack)");

		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_Jagdpanther_1A.class, "Jagdpanzer V Jagdpanther (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_JagdpanzerIV_1A.class, "Jagdpanzer IV/70 Guderian Ente (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_Jagdtiger_1A.class, "Jagdpanzer VI Jagdtiger (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_M4A1_1A.class, "M4A1 Sherman (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_M4A1_2A.class, "M4A1 Sherman with T-34 Calliope (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_M4A3_1A.class, "M4A3 Sherman (Manus Pack)");

		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_Panther_1A.class, "Panzer V Panther Ausf. G (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_PanzerhaubitzeHummel_1A.class, "Panzerhaubitze Hummel (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_PanzerIV_1A.class, "Panzer IV Ausf. G (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_PanzerIV_2A.class, "Panzer IV Ausf. H (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_RenaultFT17_1A.class, "Renault FT-17 (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_SU85_1A.class, "SU-85 (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_SU100_1A.class, "SU-100 (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_SU122_1A.class, "SU-122 (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_TigerI_1A.class, "Panzer VI Tiger Ausf. E (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_TigerII_1A.class, "Panzer VI Tiger II Ausf. B (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_T34_1A.class, "T-34/76 (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_T34_2A.class, "T-34/85 (Manus Pack)");

		//Manus WW2 Pack Legacy
		createEntity(EntityM4.class, "M4 Sherman (Manus Pack Legacy)");
		createEntity(EntityPanzer4G.class, "Panzer IV Ausf. G (Manus Pack Legacy)");
		createEntity(EntityPanzer4H.class, "Panzer IV Ausf. H (Manus Pack Legacy)");
		createEntity(EntityT34.class, "T-34/85 (Manus Pack Legacy)");

		//Manus Modern Warfare Pack
		createEntity(EntityBoxer1.class, "GTK Boxer (Manus Pack)");
		createEntity(EntityBoxer2.class, "GTK Boxer with HK Grenade Machine Gun (Manus Pack)");
		createEntity(EntityBoxer3.class, "GTK Boxer with Cal. 50 Gun (Manus Pack)");
		createEntity(EntityBoxer4.class, "GTK Boxer with with 20mm Cannon (Manus Pack)");
		createEntity(EntityBoxer5.class, "GTK Boxer with Skyranger AD (Manus Pack)");
		createEntity(EntityBwTruck.class, "German Bundeswehr Truck (Manus Pack)");
		createEntity(EntityHMMWV1.class, "M998 HMMWV (Manus Pack)");
		createEntity(EntityHMMWV2.class, "M998 HMMWV with open load area (Manus Pack)");
		createEntity(EntityHMMWV3.class, "M998 HMMWV with Cal. 50 Gun (Manus Pack)");
		createEntity(EntityHMMWV4.class, "M998 HMMWV with M134 (Manus Pack)");
		createEntity(EntityLeopardIIA6.class, "Leopard 2 A6 (Manus Pack)");
		createEntity(EntityLeopard2A7.class, "Leopard 2 A7+ PSO (Manus Pack)");

		//Extra Zero 8
		createEntity(Entity38t.class, "Panzer 38(t) (Extra Zero 8)");
		createEntity(EntityA39.class, "A39 Tortoise (Extra Zero 8)");
		createEntity(EntityHetzer.class, "Jagdpanzer 38(t) Hetzer (Extra Zero 8)");
		createEntity(EntityLVT2.class, "LVT-2 (Extra Zero 8)");
		createEntity(EntityLVTA1.class, "LVT(A)-1 (Extra Zero 8)");
		createEntity(EntityMaus.class, "Panzer VIII Maus (Extra Zero 8)");
		createEntity(EntityML20.class, "152mm ML-20 (Extra Zero 8)");
		createEntity(EntityPzkpfw2.class, "Panzer II Ausf. F (Extra Zero 8)");
		createEntity(EntityPzkpfw3.class, "Panzer III Ausf. N (Extra Zero 8)");
		createEntity(EntityStug3.class, "StuG III Ausf. F (Extra Zero 8)");
		createEntity(EntitySturmtiger.class, "Sturmpanzer VI Sturmtiger (Extra Zero 8)");
		createEntity(EntityT35.class, "T-35 (Extra Zero 8)");
		createEntity(EntityTiger1E.class, "Panzer VI Tiger Ausf. E (Extra Zero 8)");
		createEntity(EntityTKS.class, "TKS MG (Extra Zero 8)");
		createEntity(EntityTKS20.class, "TKS 20mm (Extra Zero 8)");
		createEntity(EntityType95.class, "Type 95 Ha-Go (Extra Zero 8)");
		createEntity(EntityType97.class, "Type 97 Chi-Ha (Extra Zero 8)");
		createEntity(EntityZis3.class, "76.2mm ZiS-3 (Extra Zero 8)");

		//TaP
		createEntity(EntityM113A1.class, "M113A1 APC");
		createEntity(EntityT72A1979.class, "T-72A 1979");
		createEntity(EntityT55A.class, "T-55A (Lizard)");
		createEntity(EntityType90KyuMaru.class, "Type 90 Kyu-maru (Monolith Pack)");
		createEntity(EntityT14Armata.class, "T-14 Armata");
		createEntity(EntityK2.class, "K2 Black Panther (Monolith Pack)");
		createEntity(EntityM60A1.class, "M60A1 Patton");
		createEntity(EntityM1Abrams.class, "M1 Abrams");
		createEntity(EntityLeopard2A6.class, "Leopard 2 A6");
		createEntity(EntityT90.class, "T-90");
	
		//Price additions
		createEntity(com.wolffsmod.entity.price.EntityMCOMStation.class, "MCOM Station (Price)");
		createEntity(com.wolffsmod.entity.price.EntityMilitaryCrate.class, "Military Crate (Somberfob)");
		createEntity(com.wolffsmod.entity.price.EntityRadioStation.class, "Radio Station (Price)");
		createEntity(com.wolffsmod.entity.price.EntityRadioStationSmall.class, "Radio Station Small (Price)");
		createEntity(com.wolffsmod.entity.price.EntitySandBags1.class, "SandBags (low res) (Price)");
		createEntity(com.wolffsmod.entity.price.EntitySandBags2.class, "SandBags (high res) (Price)");
		createEntity(com.wolffsmod.entity.price.EntitySupplies.class, "Supplies (Price)");

		createEntity(EntityM41.class, "M41");
		createEntity(EntityRomeoClassSub.class, "Romeo Class Sub (Monolith Pack)");
		createEntity(EntityMirageF1.class, "Mirage F1");
		createEntity(EntitySlava.class, "Slava");
		createEntity(EntityA7V.class, "A7V"); // Monolith Pack ?
		createEntity(EntityEurocopterTigerHAP.class, "EurocopterTigerHAP");
		createEntity(EntityT26.class, "T-26"); // Monolith Pack ?
		createEntity(EntityPak43.class, "Pak-43");
		createEntity(EntitySoDa.class, "So-Da");
		createEntity(EntityTeKe.class, "Te-Ke");
		createEntity(EntityTKlate.class, "TKlate");
		createEntity(EntityBF109E3.class, "BF-109 E3");
		createEntity(EntityBF109G10.class, "BF-109 G10");
		createEntity(EntityHawkerHurricane.class, "Hawker Hurricane");
		createEntity(EntityOccupier.class, "Occupier");
		createEntity(EntityP51D.class, "P-51D");
		createEntity(EntityJihadBMP1.class, "Jihad BMP-1D");

		//Warfare 44
		createEntity(EntityPanzerIVF1.class, "Panzer IV Ausf. F1 (Warfare 44)");
		createEntity(EntityJu87D3.class, "Junker Ju 87 D-3 (Warfare 44)");
		createEntity(EntityStuG3G.class, "StuG III Ausf. G (Warfare 44)");
		createEntity(EntityTiger1H.class, "Panzer VI Tiger Ausf. H (Warfare 44)");

	}
	public static void createEntity(Class<? extends Entity> entityClass, String entityName)
	{
		EntityRegistry.registerModEntity(entityClass, entityName, EntityID++, WolffNPCMod.INSTANCE, 64, 1, true);
	}
}