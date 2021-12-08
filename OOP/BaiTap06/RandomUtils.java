/**
 * 
 */
package com.ttl.oop.b6;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * @author Administrator
 *
 */
public class RandomUtils {
	
	public static String randomString(int size) {
		return RandomStringUtils.randomAlphanumeric(size);
	}
	
	public static Integer randomNumberLengh(int from, int to) {
		return Integer.valueOf(RandomStringUtils.randomNumeric(from, to));
	}

	public static Integer randomNumber(int min, int max) {
		int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
		return random_int;
	}
	
	 
}
