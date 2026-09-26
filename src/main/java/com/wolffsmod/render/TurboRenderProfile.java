package com.wolffsmod.render;

import java.io.InputStream;
import java.security.MessageDigest;

/** Fail closed for an unreviewed Flan renderer. No filename/version-string guessing. */
public final class TurboRenderProfile {
    public static final int UNKNOWN = 0, FANCY = 1, FANCY_AND_TEXTURES = 2, ALWAYS = 3;
    private TurboRenderProfile() {}
    public static int identify(InputStream stream) throws Exception {
        if (stream == null) return UNKNOWN;
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] buffer = new byte[8192]; int count;
        while ((count = stream.read(buffer)) != -1) digest.update(buffer, 0, count);
        StringBuilder hash = new StringBuilder();
        for (byte b : digest.digest()) {
            hash.append(Character.forDigit((b >>> 4) & 15, 16));
            hash.append(Character.forDigit(b & 15, 16));
        }
        return identifyHash(hash.toString());
    }
    public static int identifyHash(String hash) {
        if (hash.equalsIgnoreCase("8CCB7A49B13EEFE8A10BD3A082D7AD42207B85C7A9A5DF5C2E24C9A978AE2705")
                || hash.equalsIgnoreCase("C662244970587D9DF0FB51AEC9578CEFD3FD2BB1BA48644FBA1C797237115A94")) return FANCY;
        if (hash.equalsIgnoreCase("7A6DD7C2FBAEFDAE67CBD3659DD719F7D1FD1B3F6F809F5C8069C9CB874A4C2A")) return FANCY_AND_TEXTURES;
        if (hash.equalsIgnoreCase("0ED9AD8C09B33EC61880262CFE8052E55CD9027C0DE4A4374AF664E17721667F")) return ALWAYS;
        return UNKNOWN;
    }
}
