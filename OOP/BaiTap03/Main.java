package com.ttl.oop.b3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	/**
    	 * Bài 3
			Các thí sinh dự thi đại học bao gồm các thí sinh thi khối A, B, và khối C. Các thí sinh cần quản lý các thông tin sau: Số báo danh, họ tên, địa chỉ, mức ưu tiên.
			
			Thí sinh thi khối A thi các môn: Toán, Lý, Hoá.
			
			Thí sinh thi khối B thi các môn: Toán, Hoá, Sinh.
			
			Thí sinh thi khối C thi các môn: Văn, Sử, Địa.
			
			Yêu cầu 1: Xây dựng các lớp để quản lý các thi sinh dự thi đại học.
			
			Yêu cầu 2: Xây dựng lớp TuyenSinh có các chức năng:
			
			Thêm mới thí sinh.
			Hiện thị thông tin của thí sinh và khối thi của thí sinh.
			Tìm kiếm theo số báo danh.
			Thoát khỏi chương trình.
    	 */
    	
        Scanner scanner = new Scanner(System.in);
        ManagerCandidate managerCandidate = new ManagerCandidate();
        while (true) {
            System.out.println("Application Manager Candidate");
            System.out.println("Enter 1: To insert candidate");
            System.out.println("Enter 2: To show information of candidate: ");
            System.out.println("Enter 3: To search candidate by id");
            System.out.println("Enter 4: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter a: to insert Candidate A");
                    System.out.println("Enter b: to insert Candidate B");
                    System.out.println("Enter c: to insert Candidate C");
                    String type = scanner.nextLine();
                    Candidate candidate = null;
                    switch (type) {
					case "a": {
						candidate = InputUtils.inputBaseData(scanner);
						managerCandidate.add(new CandidateA(candidate));
						break;
					}
					case "b": {
						candidate = InputUtils.inputBaseData(scanner);
						managerCandidate.add(new CandidateB(candidate));
						break;
					}
					case "c": {
						candidate = InputUtils.inputBaseData(scanner);
						managerCandidate.add(new CandidateC(candidate));
						break;
					}
					default:
						System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "2": {
                    managerCandidate.showInfor();
                    break;
                }
                case "3": {
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    Candidate candidate = managerCandidate.searchById(id);
                    if (candidate == null) {
                        System.out.println("Not found");
                    } else {
                        System.out.println(candidate.toString());
                    }
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
