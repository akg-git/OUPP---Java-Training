/**
 * Create a Java program to represent a book with non-static methods for setting and retrieving book information
 */
package gov.in.oupp.training.java.corejava.assignments.coding;

/**
 * @author AKG
 *
 */

class Books{
	 private String title;
	 private String author;
	 private double price;
	 
	 Books(){
		 
	 }
	 
	 Books(String title, String author, double price){
		 this.title = title;
		 this.author = author;
		 this.price = price;
	 }
	 
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book Details\n--------------\ntitle=" + title + "\nauthor=" + author + "\nprice=" + price + "]";
	}
	    
	 
	    
}

public class Question12 {

	public static void main(String[] args) {
		
		Books book = new Books("Panchatantra", "Bishnu Sharma", 1250);
		System.out.println(book);

	}

}
