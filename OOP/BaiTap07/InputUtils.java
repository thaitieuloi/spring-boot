/**
 * 
 */
package com.ttl.oop.b7;

/**
 * @author Administrator
 *
 */
public class InputUtils {
	
	public static Teacher randomTeacherInfoV01() {
		String id = RandomUtils.randomString(5);
		String name = RandomUtils.randomString(5);
		int age = RandomUtils.randomNumberLengh(1, 3);
		String hometown = RandomUtils.randomString(2);
		
		double salary = RandomUtils.randomNumberLengh(1, 3);
		double bonus = RandomUtils.randomNumberLengh(1, 3);
		double penaty = RandomUtils.randomNumberLengh(1, 3);
		double realSalary = RandomUtils.randomNumberLengh(1, 3);
		
		Teacher teacher = new Teacher(id, name, age, hometown, salary, bonus, penaty, realSalary);
		return teacher;
	}
	
	
}
