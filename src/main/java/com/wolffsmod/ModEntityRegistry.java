package com.wolffsmod;

import com.wolffsmod.entity.*;

import cpw.mods.fml.common.registry.EntityRegistry;

import net.minecraft.entity.Entity;


public class ModEntityRegistry {
	private ModEntityRegistry() {}

	private static int EntityID = 0;

	public static void registerEntities()
	{
		createEntity(EntitySdKfz251D.class, "SdKfz251 Ausf. D (Wolff's Pack)");

		createEntity(EntityTiger.class, "Panzer VI Tiger (Official Pack)");
		createEntity(EntitySherman.class, "M4A3E8 Sherman Easy Eight (Official Pack)");
		createEntity(EntityChaffee.class, "M24 Chaffee (Official Pack)");
		createEntity(Entity105leFH18B2.class, "105 mm leFH 18 B2 (Official Pack)");
		createEntity(EntityCromwell.class, "Cromwell (Official Pack)");
		createEntity(EntityChiHa.class, "Type 97 Chi-Ha (Official Pack)");
		createEntity(EntityChiNu.class, "Type 3 Chi-Nu (Official Pack)");
		createEntity(EntityChurchill.class, "Churchill Mk VII (Official Pack)");
		createEntity(EntityCrusader.class, "Cruiser Mk. VI Crusader (Official Pack)");
		createEntity(EntityIS2.class, "IS-2 (Official Pack)");
		createEntity(EntityKV1.class, "KV-1 (Official Pack)");
		createEntity(EntityLuchs.class, "Panzer II Ausf.L Luchs (Official Pack)");
		createEntity(EntityPanzerIV.class, "Panzer IV Ausf. H (Official Pack)");
		createEntity(EntityShermanFury.class, "M4A3E8 Sherman Fury (Official Pack)");
		createEntity(EntityStuGIV.class, "StuG IV (Official Pack)");
		createEntity(EntityT3476.class, "T-34/76 (Official Pack)");
		createEntity(EntityT3485.class, "T-34/85 (Official Pack)");
		createEntity(EntityTiger131.class, "Panzer VI Tiger 131 (Official Pack)");
		createEntity(EntityTigerII.class, "Panzer VI Tiger II (Official Pack)");
		createEntity(EntityType4HoRo.class, "Type 4 Ho-Ro (Official Pack)");
		createEntity(EntityB1.class, "B1 (Official Pack)");
		
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
		
		createEntity(EntityPanzerIVJ.class, "Panzer IV Ausf. J (Wolff's Pack)");
		createEntity(EntityPanzer.class, "Panzer IV");
		createEntity(EntityM4.class, "M4 Sherman");
		createEntity(EntityT34.class, "T-34");
		createEntity(EntityPanzerI.class, "Panzer I Ausf. A (Kikkoceccato)");
		createEntity(EntitySkwI.class, "Sanitaetskraftwagen I Ausf. A (Kikkoceccato)");

		createEntity(EntityJagdpanther.class, "Jagdpanzer V Jagdpanther (Manus Pack)");
		createEntity(EntityJagdpanzerIV.class, "Jagdpanzer IV/70 Guderian Ente (Manus Pack)");
		createEntity(EntityJagdtiger.class, "Jagdpanzer VI Jagdtiger (Manus Pack)");
		createEntity(EntityPantherG.class, "Panzer V Panther Ausf. G (Manus Pack)");
		createEntity(EntityPanzerIVG.class, "Panzer IV Ausf. G (Manus Pack)");
		createEntity(EntityPanzerIVH.class, "Panzer IV Ausf. H (Manus Pack)");
		createEntity(EntityTigerIE.class, "Panzer VI Tiger Ausf. E (Manus Pack)");
		createEntity(EntityTigerIIB.class, "Panzer VI Tiger II Ausf. B (Manus Pack)");

		createEntity(EntityFlakpanzerIV.class, "Flakpanzer IV Wirbelwind (Manus Pack)");
		createEntity(EntityHummel.class, "Panzerhaubitze Hummel (Manus Pack)");
		createEntity(EntityM4A1.class, "M4A1 Sherman (Manus Pack)");
		createEntity(EntityM4A1Calliope.class, "M4A1 Sherman with T-34 Calliope (Manus Pack)");
		createEntity(EntityM4A3.class, "M4A3 Sherman (Manus Pack)");
		createEntity(EntityRenaultFT17.class, "Renault FT-17 (Manus Pack)");
		createEntity(EntitySU100.class, "SU-100 (Manus Pack)");
		createEntity(EntitySU122.class, "SU-122 (Manus Pack)");
		createEntity(EntitySU85.class, "SU-85 (Manus Pack)");
		createEntity(EntityT34_76.class, "T-34/76 (Manus Pack)");
		createEntity(EntityT34_85.class, "T-34/85 (Manus Pack)");

		createEntity(EntityStuG3G.class, "StuG III Ausf. G (Warfare 44)");

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
	
		//Price additions
		createEntity(EntityM41.class, "M41");
		createEntity(EntityA6M1.class, "A6M1");
		createEntity(EntityRomeoClassSub.class, "Romeo Class Sub (Monolith Pack)");
		createEntity(EntityMirageF1.class, "Mirage F1");
		createEntity(EntitySupplies.class, "Supplies (Price)");
		createEntity(EntityHigginsBoat.class, "HigginsBoat ");
		createEntity(EntitySlava.class, "Slava");
		createEntity(EntityA7V.class, "A7V"); // Monolith Pack ?
		createEntity(EntityEurocopterTigerHAP.class, "EurocopterTigerHAP");
		createEntity(EntityT26.class, "T-26"); // Monolith Pack ?
		createEntity(EntitySandBags1.class, "SandBags (low res) (Price)");
		createEntity(EntitySandBags2.class, "SandBags (high res) (Price)");
		createEntity(EntityPak43.class, "Pak-43");
		createEntity(EntitySoDa.class, "So-Da");
		createEntity(EntityTeKe.class, "Te-Ke");
		createEntity(EntityTKlate.class, "TKlate");
		createEntity(EntityBF109E3.class, "BF-109 E3");
		createEntity(EntityBF109G10.class, "BF-109 G10");
		createEntity(EntityHawkerHurricane.class, "Hawker Hurricane");
		createEntity(EntityMilitaryCrate.class, "Military Crate (Somberfob)");
		createEntity(EntityOccupier.class, "Occupier");
		createEntity(EntityP51D.class, "P-51D");
		createEntity(EntityJihadBMP1.class, "Jihad BMP-1D");
		createEntity(EntityMCOMStation.class, "MCOM Station (Price)");
		createEntity(EntityRadioStation.class, "Radio Station (Price)");
		createEntity(EntityRadioStationSmall.class, "Radio Station Small (Price)");

		// 2.2
		createEntity(EntityBMWR75.class, "BMW R 75 Gespann (Official Pack)");
		createEntity(EntityBofors.class, "40mm Bofors (Official Pack)");
		createEntity(EntityFlak88.class, "88mm Flak 36 (Official Pack)");
		createEntity(EntityFlakvierling.class, "20mm Flakvierling 38 (Official Pack)");
		createEntity(EntityGreyhound.class, "M8 Greyhound (Official Pack)");
		createEntity(EntityHellcat.class, "M18 Hellcat (Official Pack)");
		createEntity(EntityJeep.class, "Jeep (Official Pack)");
		createEntity(EntityKubel.class, "Kuebelwagen (Official Pack)");
		createEntity(EntityM3Halftrack.class, "M3 Halftrack (Official Pack)");
		createEntity(EntityM10.class, "M10 Wolverine (Official Pack)");
		createEntity(EntityM45Quad.class, "M45 Quadmount (Official Pack)");
		createEntity(EntityM157MM.class, "57mm M1 (Official Pack)");
		createEntity(EntityPak40.class, "75mm PaK 40 (Official Pack)");
		createEntity(EntitySASJeep.class, "SAS Jeep (Official Pack)");
		createEntity(EntitySU112.class, "SU-1-12 (Official Pack)");
		createEntity(EntityUC2Pdr.class, "Universal Carrier 2Pdr (Official Pack)");
		createEntity(EntitySentryGun.class, "Sentry Gun (Official Pack)");

		createEntity(EntitySdkFz2.class, "SdKfz 2 Kettenkrad (Official Pack)");
		createEntity(EntitySdkFz222.class, "SdKfz 222 (Official Pack)");
		createEntity(EntitySdkFz251.class, "SdKfz 251 (Official Pack)");
		createEntity(EntityBoxer1.class, "GTK Boxer (Manus Pack)");
		createEntity(EntityBoxer2.class, "GTK Boxer with HK Grenade Machine Gun (Manus Pack)");
		createEntity(EntityBoxer3.class, "GTK Boxer with Cal. 50 Gun (Manus Pack)");
		createEntity(EntityBoxer4.class, "GTK Boxer with with 20mm Cannon (Manus Pack)");
		createEntity(EntityBoxer5.class, "GTK Boxer with Skyranger AD (Manus Pack)");
		createEntity(EntityBwTruck.class, "German Bundeswehr Truck (Manus Pack)");
		createEntity(EntityHMMWV1.class, "M998 HMMWV (Manus Pack)");
		createEntity(EntityHMMWV2.class, "M998 HMMWV with open load area (Manus Pack)");
		createEntity(EntityHMMWV3.class, "M998 HMMWV with Cal. 50 Gun (Manus Pack)");
		createEntity(EntityHMMWV4.class, "M998 HMMWV with M134(Manus Pack)");
		createEntity(EntityLeopardIIA6.class, "Leopard 2 A6 (Manus Pack)");
		createEntity(EntityLeopard2A7.class, "Leopard 2 A7+ PSO (Manus Pack)");

		// WIP
		//createEntity(EntityMark3.class, "Mark 3");
	}
	public static void createEntity(Class<? extends Entity> entityClass, String entityName)
	{
		EntityRegistry.registerModEntity(entityClass, entityName, EntityID++, WolffNPCMod.INSTANCE, 64, 1, true);
	}
}