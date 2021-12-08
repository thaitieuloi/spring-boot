/**
 * 
 */
package com.ttl.oop.b5;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class InputUtils {

	public static void inputBaseData(Scanner scanner, ManagerHotel hotel) {
		System.out.print("Enter name: ");
		String name = scanner.nextLine();
		System.out.print("Enter age<number>: ");
		int age = scanner.nextInt();
		System.out.print("Enter passport: ");
		scanner.nextLine();
		String passport = scanner.nextLine();
		System.out.println("Choise a to rent room type A");
		System.out.println("Choise b to rent room type B");
		System.out.println("Choise c to rent room type C");
		String choise = scanner.nextLine();
		Room room;
		if (choise.equals("a")) {
			room = new RoomA();
		} else if (choise.equals("b")) {
			room = new RoomB();
		} else if (choise.equals("c")) {
			room = new RoomC();
		} else {
			return;
		}
		System.out.print("Enter number day for rent<number>: ");
		int numberRent = scanner.nextInt();
		Person person = new Person(name, age, passport, room, numberRent);
		hotel.add(person);
		scanner.nextLine();
	}
}
