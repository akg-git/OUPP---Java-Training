/**
 * Create a class Rectangle with instance variables length and width. Write a parameterized constructor to initialize 
 * these variables and a method to calculate the area of the rectangle
 */
package gov.in.oupp.training.java.corejava.assignments.coding;

/**
 * @author AKG
 *
 */

 class Rectangle {

    int length;
    int width;

    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    int calculateArea() {
        return length * width;
    }
}

public class Question4 {

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle(5,7);
		System.out.println("Area of Rectangle = "+rec.calculateArea());
		

	}

}
