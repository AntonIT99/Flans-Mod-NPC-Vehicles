package com.flansmod.common;

import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EnumPlaneMode;
import com.flansmod.common.driveables.ItemPlane;
import com.flansmod.common.driveables.ItemVehicle;
import com.flansmod.common.guns.*;
import com.flansmod.common.types.IFlanItem;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CreativeTabFlan extends CreativeTabs {
    public int type; //0 = Guns, 1 = Vehicles + Planes, 2 = Teams, 3 = Parts, 4 = Mechas
    public int icon;
    public int time = 0;

    public CreativeTabFlan(int i) {
        super("tabFlan" + i);
        type = i;
    }

    @Override
    public Item getTabIconItem() {
        return null;
    }


    @Override
    public ItemStack getIconItemStack() {
        icon = FlansMod.ticker / 20;
        switch (type) {
            case 0:
                if(GunType.gunList.size() == 0) {
                    return new ItemStack(Blocks.wool, 1, 4);
                } else {
                    Item item = GunType.gunList.get(icon % GunType.gunList.size()).item;
                    if(item != null)
                        return new ItemStack(item);
                    return new ItemStack(Blocks.wool, 1, 4);
                }
            case 1:
                if(DriveableType.types.size() == 0) {
                    return new ItemStack(Blocks.wool, 1, 14);
                } else {
                    Item item = DriveableType.types.get(icon % DriveableType.types.size()).item;
                    if(item != null)
                        return new ItemStack(item);
                    return new ItemStack(Blocks.wool, 1, 14);
                }
            case 2:
                if(FlansMod.partItems.size() == 0) {
                    return new ItemStack(Blocks.wool, 1, 5);
                } else {
                    Item item = FlansMod.partItems.get(icon % FlansMod.partItems.size());
                    if(item != null)
                        return new ItemStack(item);
                    return new ItemStack(Blocks.wool, 1, 5);
                }
            case 3:
                if(FlansMod.armourItems.size() == 0) {
                    return new ItemStack(Blocks.wool, 1, 11);
                } else {
                    Item item = FlansMod.armourItems.get(icon % FlansMod.armourItems.size());
                    if(item != null)
                        return new ItemStack(item);
                    return new ItemStack(Blocks.wool, 1, 11);
                }
            case 4:
                if(FlansMod.mechaItems.size() == 0) {
                    return new ItemStack(Blocks.wool, 1, 10);
                } else {
                    Item item = FlansMod.mechaItems.get(icon % FlansMod.mechaItems.size());
                    if(item != null)
                        return new ItemStack(item);
                    return new ItemStack(Blocks.wool, 1, 10);
                }
        }
        return new ItemStack(FlansMod.workbench);
    }

    @SideOnly(Side.CLIENT)
    public void displayAllReleventItems(List list) {
        super.displayAllReleventItems(list);

        Comparator cmp = new Comparator<ItemStack>() {
            public int compare(ItemStack is1, ItemStack is2) {
                String s1 = is1.getUnlocalizedName();
                String s2 = is2.getUnlocalizedName();
                Item i1 = is1.getItem();
                Item i2 = is2.getItem();

                if (i1 instanceof IFlanItem && i2 instanceof IFlanItem) {
                    String it1 = ((IFlanItem) i1).getInfoType().packName;
                    String it2 = ((IFlanItem) i2).getInfoType().packName;
                    int cmp = it1.compareTo(it2);
                    if (cmp != 0) {
                        return cmp;
                    }
                }

                if (i1 instanceof ItemBlockManyNames && !(i2 instanceof ItemBlockManyNames)) return -1;
                if (!(i1 instanceof ItemBlockManyNames) && i2 instanceof ItemBlockManyNames) return 1;
                if (i1 instanceof ItemBlock && !(i2 instanceof ItemBlock)) return -1;
                if (!(i1 instanceof ItemBlock) && i2 instanceof ItemBlock) return 1;
                if (i1 instanceof ItemAttachment && !(i2 instanceof ItemAttachment)) return -1;
                if (!(i1 instanceof ItemAttachment) && i2 instanceof ItemAttachment) return 1;
                if (i1 instanceof ItemAAGun && !(i2 instanceof ItemAAGun)) return -1;
                if (!(i1 instanceof ItemAAGun) && i2 instanceof ItemAAGun) return 1;

                if (i1 instanceof ItemVehicle && i2 instanceof ItemBullet) return 1;
                if (i1 instanceof ItemBullet && i2 instanceof ItemVehicle) return -1;
                if (i1 instanceof ItemPlane && i2 instanceof ItemBullet) return 1;
                if (i1 instanceof ItemBullet && i2 instanceof ItemPlane) return -1;

                DriveableType dt1 = null;
                DriveableType dt2 = null;
                if (i1 instanceof ItemVehicle) dt1 = ((ItemVehicle) i1).type;
                if (i2 instanceof ItemVehicle) dt2 = ((ItemVehicle) i2).type;
                if (i1 instanceof ItemPlane) dt1 = ((ItemPlane) i1).type;
                if (i2 instanceof ItemPlane) dt2 = ((ItemPlane) i2).type;
                if (dt1 != null && dt2 != null) {
                    String ct1 = "";
                    String ct2 = "";
                    if (dt1.modelString.indexOf(".") >= 1)
                        ct1 = dt1.modelString.substring(0, dt1.modelString.indexOf(".") - 1);
                    if (dt2.modelString.indexOf(".") >= 1)
                        ct1 = dt2.modelString.substring(0, dt2.modelString.indexOf(".") - 1);
                    if (!ct1.equals(ct2)) {
                        return ct1.compareTo(ct2);
                    }
                }

                if (i1 instanceof ItemVehicle && !(i2 instanceof ItemVehicle)) return -1;
                if (!(i1 instanceof ItemVehicle) && i2 instanceof ItemVehicle) return 1;
                if (i1 instanceof ItemPlane && !(i2 instanceof ItemPlane)) return -1;
                if (!(i1 instanceof ItemPlane) && i2 instanceof ItemPlane) return 1;
                if (i1 instanceof ItemPlane) {
                    EnumPlaneMode epm1 = ((ItemPlane) i1).type.mode;
                    EnumPlaneMode epm2 = ((ItemPlane) i2).type.mode;
                    return epm1.compareTo(epm2);
                }

                if (!(i1 instanceof ItemGrenade) && i2 instanceof ItemGrenade) return -1;
                if (i1 instanceof ItemGrenade && !(i2 instanceof ItemGrenade)) return 1;

                return s1.compareTo(s2);
            }
        };
        try {
            Collections.sort(list, cmp);
        } catch (Exception e) {
//			e.printStackTrace();
        }
		/*
		FlansMod.log("===============================================================");
		for(int i=0; i<list.size(); i++)
		{
			ItemStack is = (ItemStack)list.get(i);
			FlansMod.log(is.getItem() + " : " + is.getDisplayName() + "("+ is.getUnlocalizedName() +")");
		}
		*/
    }
}
