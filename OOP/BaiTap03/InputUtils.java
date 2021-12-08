/**
 * 
 */
package com.ttl.oop.b3;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class InputUtils {
	
	public static Candidate inputBaseData(Scanner scanner) {
		System.out.print("Enter ID: ");
		String id = scanner.nextLine();
		System.out.print("Enter name: ");
		String name = scanner.nextLine();
		System.out.print("Enter address: ");
		String address = scanner.nextLine();
		System.out.print("Enter Priotity: ");
		int priority = scanner.nextInt();
		scanner.nextLine();

		Candidate candidate = new Candidate(id, name, address, priority);
		return candidate;
	}
}
