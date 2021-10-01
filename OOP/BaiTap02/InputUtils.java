/**
 * 
 */
package com.ttl.oop.b2;

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
	public static Document inputBaseData(Scanner scanner) {
		System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter nxb:");
        String nxb = scanner.nextLine();
        System.out.print("Enter number<number>: ");
        int number = scanner.nextInt();
		
		Document document = new Document(id, nxb, number);
		return document; 
	}

	
	/**
	 * 
	 * @param scanner
	 * @param managerDocument
	 * @param document
	 */
	public static void addDocumentJournal(Scanner scanner, ManagerDocument managerDocument, Document document) {
		System.out.print("Enter issue number <number>: ");
        int issueNumber = scanner.nextInt();
        System.out.print("Enter issue month <number>: ");
        int issueMonth = scanner.nextInt();
     
        Document journal = new Journal(document, issueNumber, issueMonth);
        managerDocument.addDocument(journal);
        
        System.out.println(journal.toString());
        scanner.nextLine();
	}

	
	/**
	 * 
	 * @param scanner
	 * @param managerDocument
	 * @param document
	 */
	public static void addDocumentNewspaper(Scanner scanner, ManagerDocument managerDocument, Document document) {
		System.out.print("Enter Day issue<number>: ");
        int dayIssue = scanner.nextInt();
        
        Document newspaper = new Newspaper(document, dayIssue);
        managerDocument.addDocument(newspaper);
        
        System.out.println(newspaper.toString());
        scanner.nextLine();
	}

	
	/**
	 * 
	 * @param scanner
	 * @param managerDocument
	 * @param document
	 */
	public static void addDocumentBook(Scanner scanner, ManagerDocument managerDocument, Document document) {
		System.out.print("Enter author: ");
		scanner.nextLine();
        String author = scanner.nextLine();
        System.out.print("Enter page number<number>: ");
        int pageNumber = scanner.nextInt();
		
        Document book = new Book(document, author, pageNumber);
        managerDocument.addDocument(book);
        System.out.println(book.toString());
        
        scanner.nextLine();
	}
	
	public static void addDocument(Scanner scanner, ManagerDocument managerDocument, String type) {
		Document document = null;
        switch (type) {
            case "a": {
            	document = InputUtils.inputBaseData(scanner);
            	InputUtils.addDocumentBook(scanner, managerDocument, document);
                break;
            }
            case "b": {
            	
            	document = InputUtils.inputBaseData(scanner);
            	InputUtils.addDocumentNewspaper(scanner, managerDocument, document);
                break;
            }
            case "c": {
                document = InputUtils.inputBaseData(scanner);
            	InputUtils.addDocumentJournal(scanner, managerDocument, document);
                break;
            }
            default:
                break;
        }
		
	}
}
