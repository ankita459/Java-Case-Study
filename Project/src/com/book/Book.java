
package com.book;
import com.book.InavalidBookException.*;

public class Book {
	//create members
private String bookId;
private String title;
private String author;
private String category;
private float price;


//creating parameterized constructor
public Book(String bookId, String title, String author, String category, float price ){
	try {
		try {
			String a="Science";
			String b="Fiction";
			String c="Technology";
			String d="Others";
			
			if(category.equals(a) || category.equals(b) || category.equals(c) || category.equals(d)) {
				this.category=category;
				//String msg;
				//throw new InavalidBookException();
		}
			else
			{
				String msg="Category must be Science or Fiction or Technology or Others";
						throw new InavalidBookException(msg);
			}
		}
		catch(InavalidBookException msg) {
			System.out.println(msg);
		}
		
		try {
			if(price < 0) {
				String msg="Price cannot be negative";
						throw new InavalidBookException(msg);
			}
		}
		
		catch(InavalidBookException msg) {
			System.out.println(msg);
		}
		
		try {
			
			char ch=((String) bookId).charAt(0);
			int len=((String) bookId).length();
			if((ch!='B') || (len<4)){
				String msg="bookID must start with ‘B’and must be of length 4 characters";
				throw new InavalidBookException(msg);
			}
		}
		catch(InavalidBookException msg) {
			System.out.println(msg);
		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	

this.bookId = bookId;
this.title = title;
this.author = author;
this.category = category;
this.price = price;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

public void setBookID(String bookID) {
	this.bookId = bookID;
}

//Using Getter and Setter
//getter for bookID
public String getBookID() {
	return bookId;
}

//getter for author
public String getauthor() {
	return author;
}

//getter for title
public String title() {
	return title;
}

//getter for category
public String getcategory() {
	return category;
}

//getter for price
public float getprice() {
	return price;
}

public String getBookId() {
	// TODO Auto-generated method stub
	return null;
}

public void setBookId(String modid) {
	// TODO Auto-generated method stub
	
}


}
