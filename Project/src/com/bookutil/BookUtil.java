
package com.bookutil;

import java.util.Scanner;

import com.book.*;
import com.book.InavalidBookException.*;


 
public class BookUtil {


	private static Scanner sc;
	private static String bookId;

	public static void main(String[] args) {
		
		BookStore bs=new BookStore();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		
		while(choice!=8) {
			System.out.println("Enter 1 to Add book");
			System.out.println("Enter 2 to Modify book details");
			System.out.println("Enter 3 to Delete book details");
			System.out.println("Enter 4 to Display All the book details");
			System.out.println("Enter 5 to Display specific book details");
			System.out.println("Enter 6 to Search book by title");
			System.out.println("Enter 7 to Search book by author");
			System.out.println("Enter 8 to Exit");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				
				System.out.println("BookId");
				String bookId=sc.nextLine();
				
				System.out.println("Title");
				String title1=sc.nextLine();
				
				System.out.println("Author");
				String author1=sc.nextLine();
				
				System.out.println("Category");
				String category1=sc.nextLine();
				
				System.out.println("price");
				float price=sc.nextFloat();
				sc.nextLine();
				
				Book b = new Book(bookId, title1, author1, category1,price);
				bs.addABook(b);
				System.out.println("Book is Added");
				break;
				
			case 2:
				System.out.println("Modify book details enter anything related to book");
				String id1=sc.next();
				bs.modifyBook(id1);
				System.out.println("Book is Modified");
			    break;
				
				
			case 3:
				System.out.println("Delete book details");
				String id2=sc.next();
				bs.deleteBook(id2);
				System.out.println("Book details are Removed");
				break;
			
			case 4:
				bs.displayAll();
				System.out.println("Display All the book details");
				break;
				
			case 5:
				System.out.println("Display specific book details");
				String id3=sc.next();
				bs.displaySpecific();
				System.out.println("Display specific book details");
				break;
				
			case 6:	
				System.out.println("Enter book title");
				String title11=sc.next();
				bs.searchByTitle(title11);
				System.out.println("Search Completed");
				break;	
				
			case 7:	
				System.out.println("Enter author name");
				String title2=sc.next();
				bs.searchByAuthor(title2);
				System.out.println("Search is Completed");
				break;	
				
			case 8:	
				bs.displayByExit();
				
			}
		}
				
				
			}

}

	
		
	

	
	
		
		
	




				
			
			
		
	
	

				
			
			


