package com.ttl.oop.b1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
    	/*
    	 * Bài 1
			Một đơn vị sản xuất gồm có các cán bộ là công nhân, kỹ sư, nhân viên. Mỗi cán bộ cần quản lý các dữ liệu: Họ tên, tuổi, giới tính(name, nữ, khác), địa chỉ.
			
			Cấp công nhân sẽ có thêm các thuộc tính riêng: Bậc (1 đến 10).
			Cấp kỹ sư có thuộc tính riêng: Nghành đào tạo.
			Các nhân viên có thuộc tính riêng: công việc.
			Yêu cầu 1: Xây dựng các lớp CongNhan, KySu, NhanVien kế thừa từ lớp CanBo.
			
			Yêu cầu 2: Xây dựng lớp QLCB(quản lý cán bộ) cài đặt các phương thức thực hiện các chức năng sau:
			
			Thêm mới cán bộ.
			Tìm kiếm theo họ tên.
			Hiện thị thông tin về danh sách các cán bộ.
			Thoát khỏi chương trình.
    	 */
    	
        Scanner scanner = new Scanner(System.in);
        
        ManagerOfficer managerOfficer = new ManagerOfficer();
        
        while (true) {
            System.out.println("Application Manager Officer");
            System.out.println("Enter 1: To insert officer");
            System.out.println("Enter 2: To search officer by name: ");
            System.out.println("Enter 3: To show information officers");
            System.out.println("Enter 4: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter a: to insert Enginner");
                    System.out.println("Enter b: to insert Worker");
                    System.out.println("Enter c: to insert Staff");
                    String type = scanner.nextLine();
                    Officer officer = null;
                    switch (type) {
                        case "a": {
                        	officer = InputUtils.inputBaseData(scanner);
                        	InputUtils.addOfficerEngineer(scanner, managerOfficer, officer);
                            break;
                        }
                        case "b": {
                        	officer = InputUtils.inputBaseData(scanner);
                        	InputUtils.addOfficerWorker(scanner, managerOfficer, officer);
                            break;
                        }
                        case "c": {
                        	officer = InputUtils.inputBaseData(scanner);
                        	InputUtils.addOfficerStaff(scanner, managerOfficer, officer);
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.print("Enter name to search: ");
                    String name = scanner.nextLine();
                    managerOfficer.searchOfficerByName(name).forEach(officer -> {
                        System.out.println(officer.toString());
                    });
                    break;
                }
                case "3": {
                    managerOfficer.showListInforOfficer();
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }

        }
    }
}
