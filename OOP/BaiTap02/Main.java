package com.ttl.oop.b2;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
    	
    	/*
    	 * 
    	 * Một thư viện cần quản lý các tài liệu bao gồm Sách, Tạp chí, Báo. Mỗi tài liệu gồm có các thuộc tính sau: Mã tài liệu(Mã tài liệu là duy nhất), Tên nhà xuất bản, số bản phát hành.

			Các loại sách cần quản lý thêm các thuộc tính: tên tác giả, số trang.
			
			
			 
			Các tạp chí cần quản lý thêm: Số phát hành, tháng phát hành.
			
			Các báo cần quản lý thêm: Ngày phát hành.
			
			Yêu cầu 1: Xây dựng các lớp để quản lý tài liệu cho thư viện một cách hiệu quả.
			
			Yêu cầu 2: Xây dựng lớp QuanLySach có các chức năng sau
			
			Thêm mới tài liêu: Sách, tạp chí, báo.
			Xoá tài liệu theo mã tài liệu.
			Hiện thị thông tin về tài liệu.
			Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.
			Thoát khỏi chương trình.
    	 */
    	
        Scanner scanner = new Scanner(System.in);
        ManagerDocument managerDocument = new ManagerDocument();
        while (true) {
            System.out.println("Application Manager Document");
            System.out.println("Enter 1: To insert document");
            System.out.println("Enter 2: To search document by category: ");
            System.out.println("Enter 3: To show information documents");
            System.out.println("Enter 4: To remove document by id");
            System.out.println("Enter 5: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                	
                	System.out.println("Enter a: to insert Book");
                    System.out.println("Enter b: to insert Newspaper");
                    System.out.println("Enter c: to insert Journal");
                    String type = scanner.nextLine();
                    
                    InputUtils.addDocument(scanner, managerDocument, type);
                    
                    break;
                }
                case "2": {
                    System.out.println("Enter a to search book");
                    System.out.println("Enter b to search newspaper");
                    System.out.println("Enter c to search journal");
                    String choise = scanner.nextLine();
                    switch (choise) {
                        case "a": {
                            managerDocument.searchByBook();
                            break;
                        }
                        case "b": {
                            managerDocument.searchByNewspaper();
                            break;
                        }
                        case "c":
                            managerDocument.searchByJournal();
                            break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "3": {
                    managerDocument.showInfor();
                    break;
                }
                case "4": {
                    System.out.print("Enter id to remove: ");
                    String id = scanner.nextLine();
                    System.out.println(managerDocument.deleteDocument(id) ? "Success" : "Fail");
                }
                break;
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
