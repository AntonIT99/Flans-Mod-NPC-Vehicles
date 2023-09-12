package com.wolffsmod;

import com.wolffsmod.flan.EntityNPCFlanBullet;
import cpw.mods.fml.common.registry.EntityRegistry;

import net.minecraft.entity.Entity;


public class ModEntityRegistry
{
	private static int entityID = 0;

	private ModEntityRegistry() {}

	public static void registerEntities()
	{
		EntityRegistry.registerGlobalEntityID(EntityNPCFlanBullet.class, "NPCBullet", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityNPCFlanBullet.class, "NPCBullet", entityID++, WolffNPCMod.instance, 200, 20, false);

		if (ContentPacks.officialWW2)
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
			createEntity(com.wolffsmod.entity.official.ww2.EntityFlak88.class, "88mm FlaK 36 (Official Pack)");
			createEntity(com.wolffsmod.entity.official.ww2.EntityFlakvierling.class, "20mm Flakvierling 38 (Official Pack)");
			createEntity(com.wolffsmod.entity.official.ww2.EntityFokker.class, "Fokker Dr.I (Official Pack)");
			createEntity(com.wolffsmod.entity.official.ww2.EntityFury.class, "M4A3E8 Sherman Fury (Official Pack)");
			createEntity(com.wolffsmod.entity.official.ww2.EntityGreyhound.class, "M8 Greyhound (Official Pack)");
			createEntity(com.wolffsmod.entity.official.ww2.EntityHellcat.class, "M18 Hellcat (Official Pack)");
			createEntity(com.wolffsmod.entity.official.ww2.EntityIS2.class, "IS-2 (Official Pack)");
			createEntity(com.wolffsmod.entity.official.ww2.EntityJeep.class, "M38 Willy's Jeep (Official Pack)");
			createEntity(com.wolffsmod.entity.official.ww2.EntityKubel.class, "VW Typ 82 Kuebelwagen (Official Pack)");
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
			createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityJeep.class, "M38 Willy's Jeep (Official Pack Legacy)");
			createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityKubel.class, "VW Typ 82 Kuebelwagen (Official Pack Legacy)");
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
		}

		if (ContentPacks.officialYeOlde)
		{
			//Ye Olde Official Pack
			createEntity(com.wolffsmod.entity.official.yeolde.EntityBiplane.class, "Biplane (Official Pack)");
			createEntity(com.wolffsmod.entity.official.yeolde.EntityTwoSeatBiplane.class, "Two Seat Biplane (Official Pack)");
		}

		if (ContentPacks.officialMW)
		{
			//Modern Warfare Official Pack
			createEntity(com.wolffsmod.entity.official.mw.EntityA10.class, "Fairchild Republic A-10 Thunderbolt II (Official Pack)");
			createEntity(com.wolffsmod.entity.official.mw.EntityAbrams.class, "M1A2 Abrams (Official Pack)");
			createEntity(com.wolffsmod.entity.official.mw.EntityApache.class, "Boeing AH-64D Apache (Official Pack)");
			createEntity(com.wolffsmod.entity.official.mw.EntityB52.class, "Boeing B-52 Stratofortress (Official Pack)");
			createEntity(com.wolffsmod.entity.official.mw.EntityBlackHawk.class, "UH-60 Black Hawk (Official Pack)");
			createEntity(com.wolffsmod.entity.official.mw.EntityChallyIISimple.class, "FV4034 Challenger 2 (Official Pack)");
			createEntity(com.wolffsmod.entity.official.mw.EntityChinook.class, "Boeing CH-47 Chinook (Official Pack)");
			createEntity(com.wolffsmod.entity.official.mw.EntityCobra.class, "Bell AH-1 Cobra (Official Pack)");
			createEntity(com.wolffsmod.entity.official.mw.EntityF22.class, "Lockheed Martin F-22 Raptor (Official Pack)");
			createEntity(com.wolffsmod.entity.official.mw.EntityHind.class, "Mil Mi-24 (Official Pack)");
			createEntity(com.wolffsmod.entity.official.mw.EntityHumvee.class, "HMMWV Humvee (Official Pack)");
			createEntity(com.wolffsmod.entity.official.mw.EntityLeopard2A6.class, "Leopard 2 A6 (Official Pack)");
			createEntity(com.wolffsmod.entity.official.mw.EntityLittleBird.class, "MH-6 Little Bird (Official Pack)");
			createEntity(com.wolffsmod.entity.official.mw.EntityMIM23.class, "MIM-23 HAWK (Official Pack)");
			createEntity(com.wolffsmod.entity.official.mw.EntitySentryGun.class, "Sentry Gun (Official Pack)");
			createEntity(com.wolffsmod.entity.official.mw.EntitySU25.class, "Sukhoi Su-25 Grach (Official Pack)");
			createEntity(com.wolffsmod.entity.official.mw.EntityT90.class, "T-90MS (Official Pack)");
			createEntity(com.wolffsmod.entity.official.mw.EntityTiger.class, "Eurocopter EC-665 Tiger (Official Pack)");
			createEntity(com.wolffsmod.entity.official.mw.EntityTornado.class, "Panavia Tornado GR4 (Official Pack)");
		}

		if (ContentPacks.officialTitan)
		{
			//Titan Pack
			createEntity(com.wolffsmod.entity.official.titan.EntityAlphaTitan.class, "Alpha Titan (Official Pack)");
			createEntity(com.wolffsmod.entity.official.titan.EntityProtoTitan.class, "Proto Titan (Official Pack)");
			createEntity(com.wolffsmod.entity.official.titan.EntityZeroTitan.class, "Zero Titan (Official Pack)");
		}

		if (ContentPacks.officialApocalypse)
		{
			//Apocalypse Pack
			createEntity(com.wolffsmod.entity.official.apocalypse.EntityBuggy.class, "Apocalypse Buggy (Official Pack)");
		}

		if (ContentPacks.officialUtility)
		{
			//Utility Pack
			createEntity(com.wolffsmod.entity.official.utility.EntityTunnelBore.class, "Tunnel Bore (Utility Pack)");
		}

		if (ContentPacks.worldAtWar)
		{
			//World at War Pack
			createEntity(com.wolffsmod.entity.waw.EntityB24.class, "Consolidated B-24 Liberator (World at War Pack)");
			createEntity(com.wolffsmod.entity.waw.EntityB71.class, "Avia B-71 (World at War Pack)");
			createEntity(com.wolffsmod.entity.waw.EntityBlackPrince.class, "Black Prince (World at War Pack)");
			createEntity(com.wolffsmod.entity.waw.EntityC202.class, "Macchi C.202 Folgore (World at War Pack)");
			createEntity(com.wolffsmod.entity.waw.EntityCarro.class, "Carro Armato M15 (World at War Pack)");
			createEntity(com.wolffsmod.entity.waw.EntityDo17.class, "Dornier Do 17 (World at War Pack)");
			createEntity(com.wolffsmod.entity.waw.EntityFokker.class, "Fokker Dr.I (World at War Pack)");
			createEntity(com.wolffsmod.entity.waw.EntityLA7.class, "Lavochkin La-7 (World at War Pack)");
			createEntity(com.wolffsmod.entity.waw.EntityLusac.class, "LUSAC-11 (World at War Pack)");
			createEntity(com.wolffsmod.entity.waw.EntityRenault.class, "AMC-35 Renault (World at War Pack)");
			createEntity(com.wolffsmod.entity.waw.EntitySopwith.class, "Sopwith Camel (World at War Pack)");
			createEntity(com.wolffsmod.entity.waw.EntityType4.class, "Type 4 Chi-To (World at War Pack)");
		}

		if (ContentPacks.wolff)
		{
			//Wolff's Pack
			createEntity(com.wolffsmod.entity.wolff.EntityPanzerIVJ.class, "Panzer IV Ausf. J (Wolff's Pack)");
			createEntity(com.wolffsmod.entity.wolff.EntitySdKfz251D.class, "SdKfz 251 Ausf. D (Wolff's Pack)");
			createEntity(com.wolffsmod.entity.wolff.EntitySdKfz251DManned.class, "SdKfz 251 Ausf. D - Manned (Wolff's Pack)");
		}

		if (ContentPacks.kikkoceccato)
		{
			//Kikkoceccato
			createEntity(com.wolffsmod.entity.kikkoceccato.EntityPanzerI.class, "Panzer I Ausf. A (Kikkoceccato)");
			createEntity(com.wolffsmod.entity.kikkoceccato.EntitySkwI.class, "Sanitaetskraftwagen I Ausf. A (Kikkoceccato)");
		}

		if (ContentPacks.manusWW2)
		{
			//Manus WW2 Pack
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_AAGun_Flak20mmVierling_1A.class, "20mm Flakvierling 38 (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_AAGun_Flak20mmVierling_2A.class, "20mm Flakvierling 38 without shield (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_AAGun_Flak20mmVierling_3A.class, "20mm Flakvierling 38 - Manned (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_AAGun_Flak20mmVierling_4A.class, "20mm Flakvierling 38 without shield - Manned (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_AAGun_Flak88_1A.class, "88mm FlaK 36 (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_AAGun_Flak88_2A.class, "88mm FlaK 36 Anti tank (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_AAGun_Flak88_3A.class, "88mm FlaK 36 Anti tank - cover East/West (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_AAGun_Flak88_4A.class, "88mm FlaK 36 Anti tank - cover North/South (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_A6M_1A.class, "Mitsubishi A6M Zero (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_Arado196_1A.class, "Arado Ar 196 (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_B17G_1A.class, "Boeing B-17G Flying Fortress (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_Bf109E_1A.class, "Messerschmitt Bf 109 E-3 (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_F4U_1A.class, "F4U-4 Corsair VMF-214 Black Sheep (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_F4U_2A.class, "F4U-4 Corsair VBF-10 The Twilight Warriors (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_Fw190_1A.class, "Focke-Wulf Fw 190 A-4 (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_HE111_1A.class, "Heinkel He 111 (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_Hurricane_1A.class, "Hawker Hurricane (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_IL2_1A.class, "Ilyushin Il-2 - Missiles (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_IL2_3A.class, "Ilyushin Il-2 - Bombs (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_IL2M_1A.class, "Ilyushin Il-2M - Missiles (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_IL2M_3A.class, "Ilyushin Il-2M - Bombs (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_IL2M_4A.class, "Ilyushin Il-2M 6. GvShAP - Missiles (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_IL2M_6A.class, "Ilyushin Il-2M 6. GvShAP - Bombs  (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_JU87_1A.class, "Junker Ju 87 Stuka (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_JU87_2A.class, "Junker Ju 87 Kanonenvogel (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_ME262A_1A.class, "Messerschmitt Me 262A Schwalbe (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_P38_1A.class, "P-38 Lightning (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_P51_1A.class, "North American P-51 Mustang (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_Spitfire_1A.class, "Supermarine Spitfire (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_SpitFireMkVB_1A.class, "Supermarine Spitfire Mk VB (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_YAK3_1A.class, "Yakovlev Yak-3 (Manus Pack Legacy)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_YAK3_1Aneu.class, "Yakovlev Yak-3 (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_FlakpanzerIV_1A.class, "Flakpanzer IV Wirbelwind (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_GMCTruck_1A.class, "GMC Truck (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_GMCTruck_2A.class, "GMC Truck open Back (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_HigginsBoat_1A.class, "LCVP 2 Higgins Boat (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_Jagdpanther_1A.class, "Jagdpanzer V Jagdpanther (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_JagdpanzerIV_1A.class, "Jagdpanzer IV/70 Guderian Ente (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_Jagdtiger_1A.class, "Jagdpanzer VI Jagdtiger (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_M4A1_1A.class, "M4A1 Sherman (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_M4A1_2A.class, "M4A1 Sherman T34 Calliope (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_M4A3_1A.class, "M4A3 Sherman (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_OpelBlitz_1A.class, "Opel Blitz (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_OpelBlitz_2A.class, "Opel Blitz Afrikakorps (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_Panther_1A.class, "Panzer V Panther Ausf. G (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_PanzerhaubitzeHummel_1A.class, "Panzerhaubitze Hummel (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_PanzerIV_1A.class, "Panzer IV Ausf. G (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_PanzerIV_2A.class, "Panzer IV Ausf. H (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_RenaultFT17_1A.class, "Renault FT-17 (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_SU85_1A.class, "SU-85 (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_SU100_1A.class, "SU-100 (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_SU122_1A.class, "SU-122 (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_T34_1A.class, "T-34/76 (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_T34_2A.class, "T-34/85 (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_TigerI_1A.class, "Panzer VI Tiger Ausf. E (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_TigerII_1A.class, "Panzer VI Tiger II Ausf. B (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_VWType82_1A.class, "VW Typ 82 Kuebelwagen (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_WillyJeep_1A.class, "M38 Willy's Jeep (Manus Pack)");

			//Manus WW2 Pack Legacy
			createEntity(com.wolffsmod.entity.manus.ww2.legacy.EntityM4.class, "M4 Sherman (Manus Pack Legacy)");
			createEntity(com.wolffsmod.entity.manus.ww2.legacy.EntityME109.class, "Messerschmitt Bf 109 (Manus Pack Legacy)");
			createEntity(com.wolffsmod.entity.manus.ww2.legacy.EntityME262.class, "Messerschmitt Me 262 (Manus Pack Legacy)");
			createEntity(com.wolffsmod.entity.manus.ww2.legacy.EntityPanzer4G.class, "Panzer IV Ausf. G (Manus Pack Legacy)");
			createEntity(com.wolffsmod.entity.manus.ww2.legacy.EntityPanzer4H.class, "Panzer IV Ausf. H (Manus Pack Legacy)");
			createEntity(com.wolffsmod.entity.manus.ww2.legacy.EntityT34.class, "T-34/85 (Manus Pack Legacy)");
		}

		if (ContentPacks.manusMW)
		{
			//Manus Modern Warfare Pack
			createEntity(com.wolffsmod.entity.manus.mw.EntityA10.class, "Fairchild Republic A-10 Thunderbolt II (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.mw.EntityAC130A.class, "Lockheed AC-130A Spectre (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.mw.EntityAH1Z.class, "Bell AH-1Z Viper (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.mw.EntityBoxer1.class, "GTK Boxer (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.mw.EntityBoxer2.class, "GTK Boxer with HK Grenade Machine Gun (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.mw.EntityBoxer3.class, "GTK Boxer with Cal. 50 Gun (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.mw.EntityBoxer4.class, "GTK Boxer with with 20mm Cannon (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.mw.EntityBoxer5.class, "GTK Boxer with Skyranger AD (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.mw.EntityBwTruck.class, "German Bundeswehr Truck (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.mw.EntityC130H.class, "Lockheed C-130H Hercules (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.mw.EntityE3D.class, "Boeing E-3D Sentry (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.mw.EntityF22.class, "Lockheed Martin F-22 Raptor (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.mw.EntityHMMWV1.class, "M998 HMMWV (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.mw.EntityHMMWV2.class, "M998 HMMWV with open load area (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.mw.EntityHMMWV3.class, "M998 HMMWV with Cal. 50 Gun (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.mw.EntityHMMWV4.class, "M998 HMMWV with M134 (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.mw.EntityLeopard2A6.class, "Leopard 2 A6 (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.mw.EntityLeopard2A7.class, "Leopard 2 A7+ PSO (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.mw.EntityMIG15.class, "Mikoyan-Gurevich MiG 15 (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.mw.EntitySkyshield.class, "35mm Oerlikon Skyshield (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.mw.EntityTU22M.class, "Tupolev Tu-22M (Manus Pack)");
		}

		if (ContentPacks.extraZero8)
		{
			//Extra Zero 8
			createEntity(com.wolffsmod.entity.ez8.Entity2B9Vasilek.class, "82mm 2B9 Vasilek (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.Entity38t.class, "Panzer 38(t) (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityA39Tortoise.class, "A39 Tortoise (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityAH1G.class, "Bell AH-1G Cobra (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityBM21.class, "BM-21 Grad (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityBMD1.class, "BMD-1 (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityBMD2.class, "BMD-1 (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityBMP1.class, "BMP-1 (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityBMP2.class, "BMP-2 (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityBTR80.class, "BTR-80 (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityBTRRD.class, "BTR-RD Robot (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityBTRZD.class, "BTR-ZD Skrezhet (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityDzhighit.class, "Dzhighit (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityJagdpanzer38t.class, "Jagdpanzer 38(t) Hetzer (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityLeopard1A1.class, "Leopard 1 A1 (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityLVT2.class, "LVT-2 (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityLVTA1.class, "LVT(A)-1 (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityM1.class, "M1 Abrams (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityM48A3.class, "M48A3 Patton (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityM551.class, "M551 Sheridan (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityMi24P.class, "Mil Mi-24P (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityML20.class, "152mm ML-20 (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityPz2.class, "Panzer II Ausf. F (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityPz3.class, "Panzer III Ausf. N (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityPz6.class, "Panzer VI Tiger Ausf. E (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityPz8.class, "Panzer VIII Maus (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityStug3.class, "StuG III Ausf. F (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntitySturmtiger.class, "Sturmpanzer VI Sturmtiger (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityT35.class, "T-35 (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityT62.class, "T-62 (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityT62MV.class, "T-62MV (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityT64A.class, "T-64A (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityTKS.class, "TKS MG (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityTKS20mm.class, "TKS 20mm (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityType95HaGo.class, "Type 95 Ha-Go (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityType97ChiHa.class, "Type 97 Chi-Ha (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityUH1B.class, "Bell UH-1B Iroquois (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityUH1C.class, "Bell UH-1C Iroquois (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityUral4320.class, "Ural-4320 (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityZiS3.class, "76mm ZiS-3 (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityZSU234.class, "ZSU-23-4 Shilka (Extra Zero 8)");
			createEntity(com.wolffsmod.entity.ez8.EntityZU232.class, "23mm ZU-23-2 (Extra Zero 8)");
		}

		if (ContentPacks.lizard)
		{
			//Lizard
			createEntity(com.wolffsmod.entity.lizard.EntityM113A1.class, "M113A1 (Lizard)");
			createEntity(com.wolffsmod.entity.lizard.EntityM113A3.class, "M113A3 (Lizard)");
			createEntity(com.wolffsmod.entity.lizard.EntityM41.class, "M41 Walker Bulldog (Lizard)");
			createEntity(com.wolffsmod.entity.lizard.EntityT55A.class, "T-55A (Lizard)");
			createEntity(com.wolffsmod.entity.lizard.EntityT72A.class, "T-72A 1979 (Lizard)");
		}

		if (ContentPacks.monolith)
		{
			//Monolith Pack
			createEntity(com.wolffsmod.entity.monolith.EntityBananaHeavy.class, "Banana Mech Heavy (Monolith Pack)");
			createEntity(com.wolffsmod.entity.monolith.EntityBananaLight.class, "Banana Mech Standard (Monolith Pack)");
			createEntity(com.wolffsmod.entity.monolith.EntityBMPT72.class, "BMPT-72 (Monolith Pack)");
			createEntity(com.wolffsmod.entity.monolith.EntityCanon.class, "Generic Canon (Monolith Pack)");
			createEntity(com.wolffsmod.entity.monolith.EntityChengdu.class, "Chengdu J-20 (Monolith Pack)");
			createEntity(com.wolffsmod.entity.monolith.EntityF15J.class, "McDonnell Douglas F-15J (Monolith Pack)");
			createEntity(com.wolffsmod.entity.monolith.EntityFalken.class, "ADF-01 Falken (Monolith Pack)");
			createEntity(com.wolffsmod.entity.monolith.EntityFerdinand.class, "Panzerjaeger Ferdinand (Monolith Pack)");
			createEntity(com.wolffsmod.entity.monolith.EntityGalmOne.class, "McDonnell Douglas F-15 Galm One (Monolith Pack)");
			createEntity(com.wolffsmod.entity.monolith.EntityGalmTwo.class, "McDonnell Douglas F-15 Galm Two (Monolith Pack)");
			createEntity(com.wolffsmod.entity.monolith.EntityKV2.class, "KV-2 (Monolith Pack)");
			createEntity(com.wolffsmod.entity.monolith.EntityMonitor.class, "USS Monitor (Monolith Pack)");
			createEntity(com.wolffsmod.entity.monolith.EntityMorgan.class, "ADFX-02 Morgan (Monolith Pack)");
			createEntity(com.wolffsmod.entity.monolith.EntityMsta.class, "2S19 Msta (Monolith Pack)");
			createEntity(com.wolffsmod.entity.monolith.EntityPorsche.class, "Panzer VI Tiger Porsche (Monolith Pack)");
			createEntity(com.wolffsmod.entity.monolith.EntityRobertLee.class, "M3 Lee (Monolith Pack)");
			createEntity(com.wolffsmod.entity.monolith.EntitySchwererGustav.class, "800mm Schwerer Gustav (Monolith Pack)");
			createEntity(com.wolffsmod.entity.monolith.EntityShinden.class, "Kyushu J7W Shinden (Monolith Pack)");
			createEntity(com.wolffsmod.entity.monolith.EntityStug.class, "StuG III Ausf. F (Monolith Pack)");
			createEntity(com.wolffsmod.entity.monolith.EntitySzhatie.class, "1K17 Szhatie (Monolith Pack)");
			createEntity(com.wolffsmod.entity.monolith.EntityT72.class, "T-72A (Monolith Pack)");
			createEntity(com.wolffsmod.entity.monolith.EntityT80.class, "T-80BV (Monolith Pack)");
			createEntity(com.wolffsmod.entity.monolith.EntityT80Clone.class, "T-80BV Cammo (Monolith Pack)");
			createEntity(com.wolffsmod.entity.monolith.EntityT90.class, "T-90A (Monolith Pack)");
			createEntity(com.wolffsmod.entity.monolith.EntityTog2.class, "TOG II (Monolith Pack)");
			createEntity(com.wolffsmod.entity.monolith.EntityTos1a.class, "TOS-1A Solntsepyok (Monolith Pack)");
			createEntity(com.wolffsmod.entity.monolith.EntityType74.class, "Type 74 (Monolith Pack)");
			createEntity(com.wolffsmod.entity.monolith.EntityWZ123.class, "WZ-123 (Monolith Pack)");
			createEntity(com.wolffsmod.entity.monolith.EntityHashidate.class, "Hashidate Class Gunboat (Monolith Pack)");
			createEntity(com.wolffsmod.entity.monolith.Entitytype10.class, "Type 10 Hitomaru (Monolith Pack)");
			createEntity(com.wolffsmod.entity.monolith.EntityYamato.class, "46cm Type 94 Naval Gun (Monolith Pack)");
		}

		if (ContentPacks.tap)
		{
			//Monolith TaP
			createEntity(com.wolffsmod.entity.monolith.EntityA7V.class, "Sturmpanzerwagen A7V (TaP)");
			createEntity(com.wolffsmod.entity.monolith.EntityK2BlackPanther.class, "K2 Black Panther (TaP)");
			createEntity(com.wolffsmod.entity.monolith.EntityKimJongSub.class, "Type 033 Class Submarine (TaP)");
			createEntity(com.wolffsmod.entity.monolith.EntityRomeoSub.class, "Project 633 Class Submarine (TaP)");
			createEntity(com.wolffsmod.entity.monolith.EntitySlava.class, "Project 1164 Atlant Slava Class Cruiser (TaP)");
			createEntity(com.wolffsmod.entity.monolith.EntityT14Armata.class, "T-14 Armata (TaP)");
			createEntity(com.wolffsmod.entity.monolith.EntityT26.class, "T-26 1933 (TaP)");
			createEntity(com.wolffsmod.entity.monolith.EntityType90.class, "Type 90 Kyu-maru (TaP)");

			//Other TaP
			createEntity(com.wolffsmod.entity.baf.EntityT0FHurricane.class, "Hawker Hurricane Mk.I (TaP)");
			createEntity(com.wolffsmod.entity.baf.EntityT1TMosquito.class, "De Havilland Mosquito F Mk II (TaP)");
			createEntity(com.wolffsmod.entity.baf.EntityT1p5FVickersValiant.class, "Vickers Valiant (TaP)");
			createEntity(com.wolffsmod.entity.baf.EntityT1p5Fwyvern.class, "Westland Wyvern (TaP)");
			createEntity(com.wolffsmod.entity.newage.EntityBF109E3.class, "Messerschmitt Bf 109 E-3 (TaP)");
			createEntity(com.wolffsmod.entity.newage.EntityEurocopterTigerHAD.class, "Eurocopter EC-665 Tigre HAD (TaP)");
			createEntity(com.wolffsmod.entity.newage.EntityEurocopterTigerUHT.class, "Eurocopter EC-665 Tiger UHT (TaP)");
			createEntity(com.wolffsmod.entity.newage.EntityHurricaneMk2c.class, "Hawker Hurricane Mk.II C (TaP)");
			createEntity(com.wolffsmod.entity.newage.EntityHurricaneMk2d.class, "Hawker Hurricane Mk.II D (TaP)");
			createEntity(com.wolffsmod.entity.newage.EntityMirageF1.class, "Dassault Mirage F1 (TaP)");
			createEntity(com.wolffsmod.entity.newage.EntityT3TToyotaHiluxBMP1.class, "Toyota Hilux Technical w/ BMP-1 Turret (TaP)");
			createEntity(com.wolffsmod.entity.newage.EntityT3TToyotaHiluxDSHK.class, "Toyota Hilux Technical w/ DShK (TaP)");
			createEntity(com.wolffsmod.entity.newage.EntityT3TToyotaHiluxKornet.class, "Toyota Hilux Technical w/ Kornet (TaP)");
			createEntity(com.wolffsmod.entity.newage.EntityT3TToyotaHiluxS5.class, "Toyota Hilux Technical w/ UB-32 RocketPod (TaP)");
			createEntity(com.wolffsmod.entity.newage.EntityT3TToyotaHiluxSPG9.class, "Toyota Hilux Technical w/ SPG-9 (TaP)");
			createEntity(com.wolffsmod.entity.tankcraft.EntityM60A1.class, "M60A1 Patton RISE 1975 (TaP)");

			//Additional Warfare 44 models found in TaP
			createEntity(com.wolffsmod.entity.w44.EntityFlak20mm.class, "20mm FlaK 30/38 (TaP)");
			createEntity(com.wolffsmod.entity.w44.EntityLeFH18.class, "105mm leFH 18 (TaP)");
			createEntity(com.wolffsmod.entity.w44.EntityLeIG18.class, "75mm leIG 18 (TaP)");
			createEntity(com.wolffsmod.entity.w44.EntityM7Priest.class, "M7 Priest (TaP)");
			createEntity(com.wolffsmod.entity.w44.EntityOstwind.class, "Flakpanzer IV Ostwind (TaP)");
		}

		if (ContentPacks.price)
		{
			//Price additions
			createEntity(com.wolffsmod.entity.price.EntityMCOMStation.class, "MCOM Station (Price)");
			createEntity(com.wolffsmod.entity.price.EntityMilitaryCrate.class, "Military Crate (Somberfob)");
			createEntity(com.wolffsmod.entity.price.EntityRadioStation.class, "Radio Station (Price)");
			createEntity(com.wolffsmod.entity.price.EntityRadioStationSmall.class, "Radio Station Small (Price)");
			createEntity(com.wolffsmod.entity.price.EntitySandBags1.class, "SandBags (low res) (Price)");
			createEntity(com.wolffsmod.entity.price.EntitySandBags2.class, "SandBags (high res) (Price)");
			createEntity(com.wolffsmod.entity.price.EntitySupplies.class, "Supplies (Price)");
			createEntity(com.wolffsmod.entity.price.EntityPak43.class, "88mm PaK 43");
			createEntity(com.wolffsmod.entity.price.EntitySoDa.class, "Type 98 So-Da");
			createEntity(com.wolffsmod.entity.price.EntityTeKe.class, "Type 97 Te-Ke");
			createEntity(com.wolffsmod.entity.price.EntityTKlate.class, "Type 94 TK late");
			createEntity(com.wolffsmod.entity.price.EntityOccupier.class, "TX-225 GAVw Occupier");
			createEntity(com.wolffsmod.entity.price.EntityP51D.class, "North American P-51D Mustang");
		}

		if (ContentPacks.warfare44)
		{
			//Warfare 44
			createEntity(com.wolffsmod.entity.w44.Entity44_50CalTripod.class, "M2 Browning .50 Cal Tripod (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_A6M5Zero.class, "Mitsubishi A6M5 Zero (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Achilles.class, "17Pdr SP Achilles (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_B17G.class, "Boeing B-17G Flying Fortress (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_BF109G10.class, "Messerschmitt Bf 109 G-10 (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_BF110G2.class, "Messerschmitt Bf 110 G2 (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_BF110G4.class, "Messerschmitt Bf 110 G4 (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Bishop.class, "Valentine Mk. 1 Bishop (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Bofors40mm.class, "40mm Bofors (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Challenger.class, "Cruiser Mk. VIII Challenger (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_ChiHa.class, "Type 97 Chi-Ha (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_ChiHaKai.class, "Type 97 Chi-Ha Kai (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_ChiHe.class, "Type 1 Chi-He (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_ChiNu.class, "Type 3 Chi-Nu (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_ChiNu2.class, "Type 3 Chi-Nu II (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_ChiRi.class, "Type 5 Chi-Ri II (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Churchill3.class, "Churchill Mk. III (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Churchill3AVRE.class, "Churchill Mk. III AVRE (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Churchill3GunCarrier.class, "Churchill Mk. III Gun Carrier (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Cromwell.class, "Cromwell Mk. IV (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_CrusaderMkIII.class, "Crusader Mk. III (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_D3A.class, "Aichi D3A (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Firefly.class, "Sherman Firefly (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Flak37mm.class, "37mm FlaK 37 (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Flak88.class, "88mm FlaK 36 (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_GMCTruck.class, "GMC CCKW Truck (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_GMCTruckT27Xylophone.class, "GMC Truck T27 Xylophone (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_HaGo.class, "Type 95 Ha-Go (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_HigginsLCVP.class, "LCVP Higgins Boat (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_HoI.class, "Type 2 Ho-I (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_IGo.class, "Type 89 I-Go Ko (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_IS2.class, "IS-2 1944 (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Ju87D3.class, "JU-87 D3 (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Ju87G1.class, "JU-87 G1 (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_KV1E.class, "KV-1E (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_KV2.class, "KV-2 1940 (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_KubelwagenMg34.class, "VW Typ 82 Kuebelwagen MG-34 (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_KubelwagenMg42.class, "VW Typ 82 Kuebelwagen MG-42 (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Kurogane.class, "Type 95 Kurogane (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_M10Wolverine.class, "M10 Wolverine (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_M157mm.class, "57mm M1 (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_M18Hellcat.class, "M18 Hellcat (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_M20ArmoredCar.class, "M20 Armored Car (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_M24Chaffee.class, "M24 Chaffee (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_M26.class, "M26 Pershing (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_M38Wolfhound.class, "M38 Wolfhound (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_M3Halftrack.class, "SdKfz 251 Hanomag (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_M3Lee.class, "M3 Lee (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_M4A1Sherman.class, "M4A1 Sherman DD (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_M4A3E2Sherman.class, "M4A3E2 Sherman Jumbo (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_M4A3E8Sherman.class, "M4A3E8 Sherman (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_M4Sherman.class, "M4 Sherman (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_M4ShermanT34Calliope.class, "M4 Sherman T34 Calliope (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_M5A1Stuart.class, "M5A1 Stuart (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_M8A1GMC.class, "M8A1 GMC (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_M8Greyhound.class, "M8 Greyhound (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_M8HMCScott.class, "M8 HMC Scott (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Marder2.class, "Marder II (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Mg34Tripod.class, "MG-34 Tripod (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_OI.class, "O-I (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Opelblitz.class, "Opel Blitz (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_P47D.class, "Republic P-47D Thunderbolt (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_P51DMustang.class, "North American P-51D Mustang (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Pak40.class, "75mm PaK 40 (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_PantherCommand.class, "Befehlspanzer V Panther (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_PantherG.class, "Panzer V Panther Ausf. G (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Panzer2C.class, "Panzer II Ausf. C (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Panzer38t.class, "Panzer 38(t) Ausf. A (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_PanzerIIIF.class, "Panzer III Ausf. F (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_PanzerIIIM.class, "Panzer III Ausf. M (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_PanzerIVF1.class, "Panzer IV Ausf. F1 (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_PanzerIVF2.class, "Panzer IV Ausf. F2 (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_PanzerIVH.class, "Panzer IV Ausf. H (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Puma.class, "SdKfz 234 Puma (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_QF2Pdr.class, "40mm Ordnance QF 2Pdr (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_S100.class, "S-100 Schnellboot 1945 (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_SU100.class, "SU-100 (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_SU76M.class, "SU-76M (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_SU85.class, "SU-85 (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_SdKfz251Hanomag.class, "SdKfz 251 Hanomag (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_SdkFz1401.class, "SdKfz 140/1 (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Spitfire.class, "Supermarine Mk.IX Spitfire (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_StuG3G.class, "StuG III Ausf. G (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_StuGIV.class, "StuG IV (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_StudebackerUS6.class, "Studebaker US6 (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_StudebakerBM13N.class, "Studebaker BM13-N Katyusha (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_T20.class, "T-20 (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_T26E1.class, "T26E1 Super Pershing (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_T34100.class, "T-34/100 (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_T3476.class, "T-34/76 1942 (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_T3476Mod1940.class, "T-34/76 1940 (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_T3485.class, "T-34/85 (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_T70.class, "T-70 (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Tiger1H.class, "Panzer VI Tiger Ausf. H (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Tiger2.class, "Panzer VI Tiger II Ausf. B (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_TigerP.class, "Panzer VI Tiger Porsche (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Type1HoNi1.class, "Type 1 Ho-Ni I (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Type2KaMi.class, "Type 2 Ka-Mi (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Type3HoNi3.class, "Type 3 Ho-Ni III (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Type4HoRo.class, "Type 4 Ho-Ro (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Type92Tripod.class, "Type 92 Tripod (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Type98AA.class, "20mm Type 98 (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_ValentineII.class, "Valentine Mk. II (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Wespe.class, "Wespe (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Willys30Cal.class, "M38 Willy's Jeep .30 Cal (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Willys50Cal.class, "M38 Willy's Jeep .50 Cal (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_Yak9.class, "Yak-9T (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_ZiS2.class, "57mm ZiS-2 (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_ZiS3.class, "76mm ZiS-3 (Warfare 44)");
			createEntity(com.wolffsmod.entity.w44.Entity44_ZiS30.class, "57mm ZiS-30 (Warfare 44)");
		}

		if (ContentPacks.exufo)
		{
			//Exufo's cop cars
			createEntity(com.wolffsmod.entity.exufo.EntityCopvic.class, "Ford Crown Victoria Police (Exufo)");
			createEntity(com.wolffsmod.entity.exufo.EntityCV.class, "Ford Crown Victoria (Exufo)");
		}

		if (ContentPacks.prototype)
		{
			//Prototype
			createEntity(com.wolffsmod.entity.prototype.EntityRatte.class, "Landkreuzer P.1000 Ratte (Prototype)");
		}

		if (ContentPacks.manusCivil)
		{
			//Manus Civil Pack
			createEntity(com.wolffsmod.entity.manus.civil.EntityCivil_Plane_Boeing707_1A.class, "Boeing 707 (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.civil.EntityCivil_Plane_Learjet28_1A.class, "Learjet 28 (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_ATeam_1A.class, "GMC Van A-Team Style (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_BankTruck_1A.class, "Bank Truck (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_Car_1A.class, "Large Black Car (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_Car_2A.class, "Pink Cadillac (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_Cop_1A.class, "Police Car (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_F1_1A.class, "Formula 1 Racer (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_GolfCart_1A.class, "Chevrolet Suburban 2010 White (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_LKW1_1A.class, "Small Panel Truck (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_LKW1_2A.class, "Small Tipper (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_LKW1_3A.class, "Small Tipper with Load (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_LKW2_1A.class, "Large Panel Truck (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_LKW2_2A.class, "Large Tank Truck (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_LKW2_3A.class, "Large Cement Transporter (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_LKW3_1A.class, "Fire Department Equipment Truck (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_LKW3_2A.class, "Fire Department Ladder Truck (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_Medic_1A.class, "Ambulance Van (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_PoliceTruck_1A.class, "Police Truck (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_PoliceTruck_2A.class, "SWAT Truck (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_Ram_1A.class, "Dogde Ram (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.civil.EntityCivil_Vehicle_Taxi_1A.class, "Taxi Car (Manus Pack)");
		}

		if (ContentPacks.manusDayZ)
		{
			//Manus DayZ Pack
			createEntity(com.wolffsmod.entity.manus.dayz.EntityDayZ_Vehicle_ChevroletSuburban2010_1A.class, "Chevrolet Suburban 2010 (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.dayz.EntityDayZ_Vehicle_ChevroletSuburban2010_2A.class, "Chevrolet Suburban Police (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.dayz.EntityDayZ_Vehicle_ChevroletSuburban2010_3A.class, "Chevrolet Suburban Police K-9 (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.dayz.EntityDayZ_Vehicle_GAZ24Volga_1A.class, "GAZ-24 Volga (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.dayz.EntityDayZ_Vehicle_GAZ24Volga_2A.class, "GAZ-24 Volga Russian Police (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.dayz.EntityDayZ_Vehicle_IkarusZ260_1A.class, "Ikarus Z260 (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.dayz.EntityDayZ_Vehicle_IkarusZ60_1A.class, "Ikarus Z60 (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.dayz.EntityDayZ_Vehicle_LandRoverDefender_1A.class, "Land Rover Defender (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.dayz.EntityDayZ_Vehicle_LandRoverDefender_2A.class, "Land Rover Defender Military (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.dayz.EntityDayZ_Vehicle_LandRoverDefender_3A.class, "Land Rover Defender Hart Top (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.dayz.EntityDayZ_Vehicle_LandRoverDefender_4A.class, "Land Rover Defender Open Roof (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.dayz.EntityDayZ_Vehicle_UAZ469_1A.class, "UAZ-469 (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.dayz.EntityDayZ_Vehicle_UAZ469_2A.class, "UAZ-469 Open Roof (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.dayz.EntityDayZ_Vehicle_UAZ469_3A.class, "UAZ-469 Paradnyj Parade Car (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.dayz.EntityDayZ_Vehicle_VWPassatB2_1A.class, "VW Passat B2 Yellow Hatchback (Manus Pack)");
			createEntity(com.wolffsmod.entity.manus.dayz.EntityDayZ_Vehicle_VWPassatB2_2A.class, "VW Passat B2 Red Hatchback (Manus Pack)");
		}

		if (ContentPacks.sturmgeschuetz)
		{
			createEntity(com.wolffsmod.entity.sturmgeschuetz.EntityBobSemple.class, "Bob Semple Tank (Sturmgeschuetz)");
			createEntity(com.wolffsmod.entity.sturmgeschuetz.EntityDisstonTractor.class, "Disston Tractor Tank (Sturmgeschuetz)");
			createEntity(com.wolffsmod.entity.sturmgeschuetz.EntityFerdinand.class, "Panzerjaeger Ferdinand (Sturmgeschuetz)");
		}

		if (ContentPacks.akaku)
		{
			createEntity(com.wolffsmod.entity.akaku.EntityHanomag.class, "Hanomag SS 100 (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityMeillerwagen.class, "Hanomag Towing Meillerwagen Lowered with A4/V2 (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityMeillerwagenN.class, "Hanomag Towing Meillerwagen Lowered (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityMeillerwagenR.class, "Hanomag Towing Meillerwagen Raised with A4/V2 (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityMeillerwagenRN.class, "Hanomag Towing Meillerwagen Raised (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityOpelBlitzCCE.class, "Opel Blitz Kfz 305 Carrier Empty (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityOpelBlitzCCEAK.class, "Opel Blitz Kfz 305 Carrier Afrikakorps Empty (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityOpelBlitzCCF1.class, "Opel Blitz Kfz 305 Carrier Full w/ Misc. (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityOpelBlitzCCF1AK.class, "Opel Blitz Kfz 305 Carrier Afrikakorps Full w/ Misc. (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityOpelBlitzCCFB.class, "Opel Blitz Kfz 305 Carrier Full w/ Barrels (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityOpelBlitzCCFBAK.class, "Opel Blitz Kfz 305 Carrier Afrikakorps Full w/ Barrels (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityOpelBlitzCCFT.class, "Opel Blitz Kfz 305 Troop Carrier (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityOpelBlitzCCFTAK.class, "Opel Blitz Kfz 305 Troop Carrier Afrikakorps (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityOpelBlitzDamaged.class, "Opel Blitz Kfz 305 Carrier Damaged (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityOpelBlitzDamagedAK.class, "Opel Blitz Kfz 305 Carrier Afrikakorps Damaged (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityOpelBlitzTCFB.class, "Opel Blitz Kfz 305 Transport Full w/ Barrels (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityOpelBlitzTCFBAK.class, "Opel Blitz Kfz 305 Transport Afrikakorps Full w/ Barrels (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityOpelBlitzTNE.class, "Opel Blitz Kfz 305 Transport Empty (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityOpelBlitzTNEAK.class, "Opel Blitz Kfz 305 Transport Afrikakorps Empty (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityOpelBlitzTNF1.class, "Opel Blitz Kfz 305 Transport Full w/ Misc. (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityOpelBlitzTNF1AK.class, "Opel Blitz Kfz 305 Transport Afrikakorps Full w/ Misc. (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityOpelBlitzTNF2.class, "Opel Blitz Kfz 305 Transport Full w/ Crates (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityOpelBlitzTNF2AK.class, "Opel Blitz Kfz 305 Transport Afrikakorps Full w/ Crates (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntitySS.class, "Mercedes Benz SS Red (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntitySSBlack.class, "Mercedes Benz SS Black (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntitySSK.class, "Mercedes Benz SSK (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntitySSKFlug.class, "Mercedes Benz SSK The Flug's (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntitySSKL1.class, "Mercedes Benz SSKL Red No.1 (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntitySSKL2.class, "Mercedes Benz SSKL Blue No.2 (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntitySSKL3.class, "Mercedes Benz SSKL Green No.3 (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntitySSKL4.class, "Mercedes Benz SSKL Yellow No.4 (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntitySSKL5.class, "Mercedes Benz SSKL Brown No.5 (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntitySSKL6.class, "Mercedes Benz SSKL White No.6 (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntitySSWehr.class, "Mercedes Benz SS Wehrmacht (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityTankwagen.class, "Opel Blitz Kfz 385 Tankwagen (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityTankwagenAK.class, "Opel Blitz Kfz 385 Tankwagen Afrikakorps (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityTankwagenAKH.class, "Opel Blitz Kfz 385 Tankwagen H Afrikakorps (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityTankwagenH.class, "Opel Blitz Kfz 385 Tankwagen H (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityW31.class, "Mercedes Benz W31 G4 (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityW31AK.class, "Wehrmacht W31 G4 Afrikakorps (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityW31M.class, "Wehrmacht W31 G4 (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityZundapp.class, "Zundapp KS 750 S (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityZundappAK.class, "Zundapp KS 750 S Afrikakorps (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityZundappAKN.class, "Zundapp KS 750 Afrikakorps (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityZundappC.class, "Zundapp K800 S (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityZundappCN.class, "Zundapp K800 (Akaku)");
			createEntity(com.wolffsmod.entity.akaku.EntityZundappN.class, "Zundapp KS 750 (Akaku)");
		}

		if (ContentPacks.aoba)
		{
			createEntity(com.wolffsmod.entity.aoba.EntityT95.class, "T95 Gun Motor Carriage");
		}

		if (ContentPacks.cow)
		{
			createEntity(com.wolffsmod.entity.cow.EntityKa27.class, "Kamov Ka-27 (Cow West)");
			createEntity(com.wolffsmod.entity.cow.EntityPantherG.class, "Panzer V Panther Ausf. G (Cow West)");
			createEntity(com.wolffsmod.entity.cow.EntityTiger2.class, "Panzer VI Tiger II (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entityamx30.class, "AMX-30 (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entityamx30dca.class, "AMX-30 DCA (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entityamx40.class, "AMX-40 (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entitycl13a5.class, "CL-13A Mk5 Sabre (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entitycl13b.class, "CL-13B Mk6 Sabre (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entitydickermax.class, "Dicker Max (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entitydshkgaz.class, "4M GAZ DSHK (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entityf4cphantom.class, "McDonnell F-4C Phantom II (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entityf86f2.class, "North American F-86F-2 Sabre (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entityf86f40.class, "North American F-86F-40 Sabre (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entityhmswarspite.class, "HMS Warspite (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entityis4.class, "IS-4 (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entityjpz45.class, "Kanonenjagdpanzer (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entitykpz70.class, "Kampfpanzer 70 (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entityleclerc.class, "Leclerc (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entityleo2a4.class, "Leopard 2A4 (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entityleo2k.class, "Leopard 2K (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entitym103.class, "M103 Heavy (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entitym1abrams.class, "M1 Abrams (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entitym26italy.class, "M26 Ariete (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entitym26pershing.class, "M26 Pershing (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entitym3bradley.class, "M3 Bradley (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entitymbt70.class, "MBT-70 (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entitymig19pt.class, "Mikoyan-Gurevich MiG-19PT (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entitymitsut2.class, "Mitsubishi T-2 (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entityraketenjagdpanzer.class, "Raketenjagdpanzer (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entityreaperdrone.class, "MQ-9 Reaper (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entityt10m.class, "T-10M (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entityt26super.class, "T26 SuperPershing (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entityt3485.class, "T-34/85 (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entityt44100.class, "T-44-100 (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entityt4485.class, "T-44-85 (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entityt55a.class, "T-55A (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entityt72a.class, "T-72A (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entityt80b.class, "T-80B (Cow West)");
			createEntity(com.wolffsmod.entity.cow.Entityt80u.class, "T-80U (Cow West)");
		}

		if (ContentPacks.moneybuster)
		{
			createEntity(com.wolffsmod.entity.moneybuster.EntityMortaio35.class, "Mortaio da 81 Mod. 35 (Moneybuster)");
			createEntity(com.wolffsmod.entity.moneybuster.EntityCarroArmato.class, "Carro Armato L6/40 (Moneybuster)");
		}

		if (ContentPacks.wot)
		{
			createEntity(com.wolffsmod.entity.wot.EntityE75.class, "Panzer E-75 (World of Tanks)");
		}

		if (ContentPacks.berggeit)
		{
			createEntity(com.wolffsmod.entity.berggeit.EntityKV2.class, "KV-2 (Berggeit)");
		}
	}

	public static void createEntity(Class<? extends Entity> entityClass, String entityName)
	{
		EntityRegistry.registerModEntity(entityClass, entityName, entityID++, WolffNPCMod.instance, 64, 1, true);
	}
}