package com.sb.main.util;

import java.security.MessageDigest;
import java.util.UUID;

public class UuidGenerator {

	public static String getUUIDCode() {
		String uuidToken=null;
		try {
		MessageDigest salt = MessageDigest.getInstance("SHA-256");
		salt.update(UUID.randomUUID().toString().getBytes("UTF-8"));
		//String digest = bytesToHex(salt.digest());
		UUID gfg = UUID.nameUUIDFromBytes(salt.digest());
		uuidToken = gfg.toString();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return uuidToken;
	}
}
