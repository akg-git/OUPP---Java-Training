/**
 * Create a class Book with instance variables title, author, and price. Write a parameterized constructor to initialize 
 * these variables and print all the information.
 */
package gov.in.oupp.training.java.corejava.assignments.coding;

/**
 * @author AKG
 *
 */


 class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void printBookInfo() {
    	System.out.println("Book Info\n---------------");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Question6 {


	public static void main(String[] args) {
		Book book = new Book("Math Book", "R D Sharma", 1200.50);
		book.printBookInfo();

	}

}
