package com.ttl.oop.b4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// This is sudo code. To overview how to do it.
// You can finish by fill you code

public class Main {
    public static void main(String[] args) {
        Town town = new Town();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter is Town n:");
        int n = scanner.nextInt();
        
        // VD: Khu phố A có 5 hộ dân
        //	Hộ A1
        //		có 3 người
        //	Hộ A2
        // 		có 1 người
        // 	Hộ A3
        //		có 2 người
        // 	Hộ A4
        //		có 5 người
        // 	Hộ A5
        // 		có 1 người

		for (int i = 0; i < n; i++) {
			// Input foreach family
			String address = "address_" + RandomUtils.randomString(10);

			// Enter person number in family
			List<Person> persons = new ArrayList<>();
			int number = RandomUtils.randomNumber(1, 10);

			for (int j = 0; j < number; j++) {
				// Inout person for family
				persons.add(InputUtils.randomPersonInfo());
			}

			// After done input
			town.addFamily(new Family(persons, address));
		}
		
		town.showInfor();
		
    }
}
