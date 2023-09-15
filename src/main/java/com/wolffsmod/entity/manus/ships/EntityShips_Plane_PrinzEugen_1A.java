package com.wolffsmod.entity.manus.ships;

import com.wolffsmod.entity.EntityFlanPlaneNPC;
import com.wolffsmod.entity.EntityFlanShipNPC;

import net.minecraft.world.World;

public class EntityShips_Plane_PrinzEugen_1A extends EntityFlanPlaneNPC
{
    public EntityShips_Plane_PrinzEugen_1A(World w)
    {
        super(w);
        setSize(20F, 40F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.01F);
        setDriver("807 285 0");
        setPassenger("1 1231 191 0 core -90 90 0 30 Ships_MG_20cmGun_1A PassengerGun1");
        setPassenger("2 997 247 0 core -90 90 0 30 Ships_MG_20cmGun_1A PassengerGun2");
        setPassenger("3 -1079 247 0 core 90 270 0 30 Ships_MG_20cmGun_1A PassengerGun3");
        setPassenger("4 -1315 191 0 core 90 270 0 30 Ships_MG_20cmGun_1A PassengerGun4");
        setPassenger("5 599 222 -178 core -90 90 0 50 Ships_MG_10cmGun_1A PassengerGun5");
        setPassenger("6 599 222 178 core -90 90 0 50 Ships_MG_10cmGun_1A PassengerGun6");
        setPassenger("7 -326 168 -164 core -90 90 0 50 Ships_MG_10cmGun_1A PassengerGun7");
        setPassenger("8 -326 172 164 core -90 90 0 50 Ships_MG_10cmGun_1A PassengerGun8");
        setPassenger("9 -703 222 -177 core 90 270 0 50 Ships_MG_10cmGun_1A PassengerGun9");
        setPassenger("10 -703 222 177 core 90 270 0 50 Ships_MG_10cmGun_1A PassengerGun10");
        setPassenger("11 827 193 -102 core -180 0 0 70 Ships_MG_2cmGun_1A PassengerGun11");
        setPassenger("12 827 193 102 core 0 180 0 70 Ships_MG_2cmGun_1A PassengerGun12");
        setPassenger("13 671 235 -107 core -180 0 0 70 Ships_MG_2cmGun_1A PassengerGun13");
        setPassenger("14 671 235 107 core 0 180 0 70 Ships_MG_2cmGun_1A PassengerGun14");
        setPassenger("15 464 316 28 core -100 100 0 70 Ships_MG_2cmGun_1A PassengerGun15");
        setPassenger("16 364 527 -38 core -180 0 0 70 Ships_MG_2cmGun_1A PassengerGun16");
        setPassenger("17 364 527 38 core 0 180 0 70 Ships_MG_2cmGun_1A PassengerGun17");
        setPassenger("18 166 275 -53 core -180 0 0 70 Ships_MG_2cmGun_1A PassengerGun18");
        setPassenger("19 166 275 53 core 0 180 0 70 Ships_MG_2cmGun_1A PassengerGun19");
        setPassenger("20 -572 239 90 core 0 180 0 70 Ships_MG_2cmGun_1A PassengerGun20");
        setPassenger("21 -572 239 -90 core -180 0 0 70 Ships_MG_2cmGun_1A PassengerGun21");
        setPassenger("22 -841 239 -77 core -180 0 0 70 Ships_MG_2cmGun_1A PassengerGun22");
        setPassenger("23 -841 239 77 core 0 180 0 70 Ships_MG_2cmGun_1A PassengerGun23");
        addShootPointSecondary("-35 0 0 core");
        addGunOrigin("1 -1231 -179 0");
        addGunOrigin("2 -997 -235 0");
        addGunOrigin("3 1079 -235 0");
        addGunOrigin("4 1315 -179 0");
        addGunOrigin("5 -599 -222 -178");
        addGunOrigin("6 -599 -222 178");
        addGunOrigin("7 326 -172 -164");
        addGunOrigin("8 326 -172 164");
        addGunOrigin("9 703 -222 -177");
        addGunOrigin("10 703 -222 177");
        addGunOrigin("11 -874 -212 -102");
        addGunOrigin("12 -874 -212 102");
        addGunOrigin("13 -710 -253 -112");
        addGunOrigin("14 -710 -253 112");
        addGunOrigin("15 -490 -335 0");
        addGunOrigin("16 -320 -546 -65");
        addGunOrigin("17 -320 -546 65");
        addGunOrigin("18 -138 -294 -86");
        addGunOrigin("19 -138 -294 86");
        addGunOrigin("20 618 -259 90");
        addGunOrigin("21 618 -259 -90");
        addGunOrigin("22 884 -259 -77");
        addGunOrigin("23 884 -259 77");
        
    }
}
