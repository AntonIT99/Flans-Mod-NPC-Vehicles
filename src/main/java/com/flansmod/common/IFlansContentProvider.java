package com.flansmod.common;

public interface IFlansContentProvider {
    /**
     * Get the content pack directory.
     *
     * @return The content pack directory (mainly for deobfuscated environments).
     */
    String getContentDirectory();

    /**
     * Registers model locations for this provider.
     */
    void registerModelLocations();
}
