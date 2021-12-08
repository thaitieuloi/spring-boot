/**
 * 
 */
package com.ttl.oop.b6;

/**
 * @author Administrator
 *
 */
public class InputUtils {
	
	public static Student randomStudentInfoV01() {
		String name = RandomUtils.randomString(5);
		int age = RandomUtils.randomNumberLengh(1, 3);
		String hometown = RandomUtils.randomString(2);
		int classStudent = RandomUtils.randomNumberLengh(1, 3);

		Student student = new Student(name, age, hometown, classStudent);
		return student;
	}
	
	public static Student randomStudentInfoV02(int age, String hometown) {
		String name = RandomUtils.randomString(5);
		int classStudent = RandomUtils.randomNumberLengh(1, 3);

		Student student = new Student(name, age, hometown, classStudent);
		return student;
	}
}
