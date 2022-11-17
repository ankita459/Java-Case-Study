
package com.book;
import com.bookutil.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BookStore<E> {
	ArrayList<Book> booklist=new ArrayList<Book>();
	Scanner sc=new Scanner(System.in);
	
public void addABook(Book b) {
	booklist.add(b);
}

public void modifyBook(String id) {
	Iterator itr=booklist.iterator();
	while(itr.hasNext()) {
		Book st=(Book)itr.next();
		String id1=st.getBookId();
		if(id1.equals(id)) {
			System.out.println("Enter to modify anything related to book");
			String field=sc.nextLine();
			switch(field) {
			
			case "id" :
				System.out.println("Enter to modify id ");
				String modid=sc.nextLine();
				st.setBookId(modid);
				break;
				
			case "title" :
				System.out.println("Enter to modify title");
				String modtitle=sc.nextLine();
				st.setTitle(modtitle);
				break;
				
			case "author" :
				System.out.println("Enter to modify author");
				String modauthor=sc.nextLine();
				st.setAuthor(modauthor);
				break;
				
			case "category" :
				System.out.println("Enter to modify category");
				String modcategory=sc.nextLine();
				st.setCategory(modcategory);
				break;
				
			case "price":
				System.out.println("Enter to modify price");
				Float modprice=sc.nextFloat();
				st.setPrice(modprice);
				break;
			}
		}
		}
}

public void deleteBook(String id) {
	Iterator<Book> itr=booklist.iterator();
	while(itr.hasNext()) {
		Book st=itr.next();
		String id1=st.getBookId();
		if(id1.equals(id)) {
			itr.remove();
		}
	}
}

public void displayAll() {
	Iterator<Book> itr=booklist.iterator();
	while(itr.hasNext()) {
		Book st=itr.next();
		String id1=st.getBookId();
		String title=st.getTitle();
		String author=st.getAuthor();
		String category=st.getCategory();
		float price=st.getprice();
		System.out.println("BookId:"+id1+"\tTitle:"+title+"\t"+"Author:"+author +"\tCategory:"+ category+"\tPrice:"+price+"");
		}
	}

public void displaySpecific(String id) {
	Iterator<Book> itr=booklist.iterator();
	while(itr.hasNext()) {
		Book st=itr.next();
		String id1=st.getBookId();
		String title=st.getTitle();
		String author=st.getAuthor();
		String category=st.getCategory();
		float price=st.getprice();
		if(id1.equals(id)) {
			System.out.println("BookId:"+id+"\tTitle:"+title+"\t"+"Author:"+author+"\t"+"Category:"+category+"\t"+"Price:"+price+"");
		}
	}

}
public void searchbyTitle(String title) {
	Iterator<Book> itr=booklist.iterator();
	while(itr.hasNext()) {
		Book st=itr.next();
		String id1=st.getBookId();
		String title1=st.getTitle();
		String author=st.getAuthor();
		String category=st.getCategory();
		float price=st.getprice();
		if(title1.equals(title)) {
			System.out.println("BookId:"+id1+"\tTitle:"+title+"\t"+"Author:"+author+"\t"+"Category:"+category+"\t"+"Price:"+price+"");
		}
	}

}


public void searchbyAuthor(String author) {
	Iterator<Book> itr=booklist.iterator();
	while(itr.hasNext()) {
		Book st=itr.next();
		String id1=st.getBookId();
		String title1=st.getTitle();
		String author1=st.getAuthor();
		String category=st.getCategory();
		float price=st.getprice();
		if(author1.equals(author)) {
			System.out.println("BookId:"+id1+"\tTitle:"+title1+"\t"+"Author:"+author+"\t"+"Category:"+category+"\t"+"Price:"+price+"");
		}
	}

}
}
