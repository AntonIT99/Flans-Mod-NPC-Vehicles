package com.flansmod.api;

import net.minecraft.item.Item;

public interface IInfoType {
    /**
     * Content pack that this info type originated from.
     *
     * @return Content pack name.
     */
    String getContentPack();

    /**
     * Gets the item this is bound to.
     *
     * @return Related item.
     */
    Item getItem();

    /**
     * Gets the name of this item (without localization).
     *
     * @return Name of the item.
     */
    String getName();

    /**
     * Gets the short name of this item.
     *
     * @return Short/registry name.
     */
    String getShortName();

    /**
     * Gets the description of this item.
     *
     * @return Item description.
     */
    String getDescription();
}
