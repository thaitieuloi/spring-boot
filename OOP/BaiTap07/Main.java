package com.ttl.oop.b7;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerTeacher managerTeacher = new ManagerTeacher();
        
        while (true) {
            System.out.println("Application Manager Teacher");
            System.out.println("Enter 1: To insert Teacher");
            System.out.println("Enter 2: To remove Teacher by id");
            System.out.println("Enter 3: To calculator Teacher by id");
            System.out.println("Enter 4: To show infor");
            System.out.println("Enter 5: To exit:");
            String line = scanner.nextLine();
            switch(line) {
                case "1": {
                	Teacher teacher = InputUtils.randomTeacherInfoV01();
                	managerTeacher.add(teacher);
                    break;
                }
                case "2": {
                    System.out.print("Enter id: ");
                    String id = scanner.nextLine();
                    managerTeacher.deleteById(id);
                    break;
                }
                case "3": {
                    System.out.print("Enter id: ");
                    String id = scanner.nextLine();
                    System.out.println("Salary = " + managerTeacher.getSalary(id));
                    break;
                }
                case "4": {
                	managerTeacher.show();
                    break;
                }
                case "5": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }

    }

}
