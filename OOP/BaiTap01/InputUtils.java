/**
 * 
 */
package com.ttl.oop.b1;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class InputUtils {
	/**
	 * 
	 * @param scanner
	 * @return
	 */
	public static Officer inputBaseData(Scanner scanner) {
		System.out.print("Enter name: ");
		String name = scanner.nextLine();
		System.out.print("Enter age:<number>");
		int age = scanner.nextInt();
		System.out.print("Enter gender: ");
		scanner.nextLine();
		String gender = scanner.nextLine();
		System.out.print("Enter address: ");
		String address = scanner.nextLine();
		System.out.print("Enter branch: ");
		Officer officer = new Officer(name, age, gender, address);
		return officer; 
	}

	/**
	 * 
	 * @param scanner
	 * @param managerOfficer
	 * @param officer
	 */
	public static void addOfficerStaff(Scanner scanner, ManagerOfficer managerOfficer, Officer officer) {
		System.out.print("Enter task: ");
		String task = scanner.nextLine();
		Officer staff = new Staff(officer, task);
		managerOfficer.addOfficer(staff);
		System.out.println(staff.toString());
	}

	/**
	 * 
	 * @param scanner
	 * @param managerOfficer
	 * @param officer
	 */
	public static void addOfficerWorker(Scanner scanner, ManagerOfficer managerOfficer, Officer officer) {
		System.out.print("Enter level <number>: ");
		int level = scanner.nextInt();
		Officer worker = new Worker(officer, level);
		managerOfficer.addOfficer(worker);
		System.out.println(worker.toString());
	}

	/**
	 * 
	 * @param scanner
	 * @param managerOfficer
	 * @param officer
	 */
	public static void addOfficerEngineer(Scanner scanner, ManagerOfficer managerOfficer, Officer officer) {
		System.out.print("Enter branch: ");
		String branch = scanner.nextLine();
		Officer engineer = new Engineer(officer, branch);
		managerOfficer.addOfficer(engineer);
		System.out.println(engineer.toString());
	}
}
