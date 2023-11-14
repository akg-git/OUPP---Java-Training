/**
 * Create a class Shape with a method draw(). Create two subclasses, Circle and Rectangle, 
 * that inherit from Shape and provide their implementation of the draw() method.
 */
package gov.in.oupp.training.java.corejava.assignments.coding;

/**
 * @author AKG
 *
 */


class Shape {

    public void draw() {
        System.out.println("Draw a Shape");
    }
}

class Circle extends Shape {

    public void draw() {
        System.out.println("Draw a Circle");
    }
}

class Rectangles extends Shape {

    public void draw() {
        System.out.println("Draw a Rectangle");
    }
}


public class Question8 {

	public static void main(String[] args) {
		
		Shape shape = new Shape();
		shape.draw();
		
		Circle circle = new Circle();
		circle.draw();
		
		Rectangles rectangle = new Rectangles();
		rectangle.draw();
		
	}

}
