package com.Arrays;

public class CaesarCipher {

	protected char[] encoder = new char[26];
	protected char[] decoder = new char[26];
	
	public CaesarCipher(int rotation) {
		for(int i = 0; i < 26; i++) {
			encoder[i] = (char)('A' + (i + rotation) % 26);
			/* You start at the first character, and add the rotation
			 * which is the amount of characters to shift by, run against the current
			 * array. This causes an entire array of letters, but shifted over by a certain 
			 * amount. */
			decoder[i] = (char)('A' + (i - rotation + 26) % 26);
			/* The decoder does the exact opposite, and subtracts the current value by the
			 * rotation. We then add 26.*/
		}
	}
	
	public String encrypt(String message) {
		return transform(message, encoder);
	}
	
	public String decrypt(String secret) {
		return transform(secret, decoder);
	}
	
	private String transform(String original, char[] code) {
		char[] msg = original.toCharArray();
		for(int i = 0; i < msg.length; i++)
			if(Character.isUpperCase(msg[i])) {
				int j = msg[i] - 'A';
				msg[i] = code[j];
			}
		return new String(msg);
	}
	
	public static void main(String [] args) {
		CaesarCipher cipher = new CaesarCipher(1);
		System.out.println("Encryption Code: " + new String(cipher.encoder));
		System.out.println("Decryption Code: " + new String(cipher.decoder));
		
		String message = "THE EAGLE IS IN PLAY";
		
		String coded = cipher.encrypt(message);
		System.out.println(coded);
		
		String decoded = cipher.decrypt(coded);
		System.out.println(decoded);
		
	}
}
