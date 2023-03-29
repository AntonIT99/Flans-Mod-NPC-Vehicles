package com.flansmod.common.sync;

import org.apache.commons.codec.binary.Hex;

import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.TreeMap;

import com.flansmod.common.FlansMod;



public class Sync {
	private static TreeMap<String, String> hashes = new TreeMap<String, String>();

	private static String cachedHash = "";

	public static String getStringHash(String str) {
		String hash = "";
		try {
			MessageDigest digester = MessageDigest.getInstance("SHA-512");
			byte[] encodedHash = digester.digest(validateString(str).getBytes(StandardCharsets.US_ASCII));
			hash =  Hex.encodeHexString(encodedHash);
		} catch (Exception e) {
			FlansMod.log("[Sync] Error has occured.");
			e.printStackTrace(); 
		}
		return hash;
	}

	public static String getUnifiedHash() {
		if (cachedHash.isEmpty()) {
			StringBuilder str = new StringBuilder();
			for (Map.Entry<String, String> hash : hashes.entrySet()) {
				str.append(hash.getKey());
				FlansMod.log(hash.getKey() + " " + hash.getValue());
			}

			cachedHash = getStringHash(str.toString());
		}

		return cachedHash;
	}

	public static void addHash(String str, String shortname) {
		hashes.put(getStringHash(str), shortname);
	}

	private static String validateString(String e) {
		StringBuilder out = new StringBuilder();
		for (char c : e.toCharArray()) {
			if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ+=-()[]{}#%^&$£@?.,<>0123456789".contains("" + Character.toUpperCase(c))) {
				out.append(c);
			}
		}
		return out.toString();

	}
}
