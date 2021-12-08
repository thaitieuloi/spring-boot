/**
 * 
 */
package com.ttl.oop.b4;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class InputUtils {
	
	public static Person inputBaseData(Scanner scanner) {
		System.out.print("Enter Name: ");
		String name = scanner.nextLine();
		
		System.out.print("Enter age: ");
		int age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Enter job: ");
		String job = scanner.nextLine();
		
		System.out.print("Enter passport: ");
		String passport = scanner.nextLine();

		Person person = new Person(name, age, job, passport);
		return person;
	}
	
	public static Person randomPersonInfo() {
		String name = RandomUtils.randomString(5);
		int age = RandomUtils.randomNumberLengh(1, 3);
		String job = "Job_" + RandomUtils.randomString(5);
		String passport = "passport_" + RandomUtils.randomString(5);

		Person person = new Person(name, age, job, passport);
		return person;
	}
}
