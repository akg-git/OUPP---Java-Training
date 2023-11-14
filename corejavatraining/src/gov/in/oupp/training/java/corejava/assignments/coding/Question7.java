/**
 * Create class Animal with a method eat(). Create two subclasses, Dog and Cat, which inherit from Animal.
	Override the eat() method in each subclass to print a message specific to the type of animal.
	Create an instance of each type and call the eat() method.
 */
package gov.in.oupp.training.java.corejava.assignments.coding;

/**
 * @author AKG
 *
 */

class Animal {

    public void eat() {
        System.out.println("Animal Eats");
    }
}

class Dog extends Animal {

    public void eat() {
        System.out.println("Dog Eats");
    }
}

class Cat extends Animal {

    public void eat() {
        System.out.println("Cat Eats");
    }
}

public class Question7 {


	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
		Dog dog = new Dog();
		dog.eat();
		Cat cat = new Cat();
		cat.eat();
	}

}
