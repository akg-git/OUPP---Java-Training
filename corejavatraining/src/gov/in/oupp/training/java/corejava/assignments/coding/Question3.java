/**
 * Create a class Person with instance variables name and age. Write a parameterized constructor to initialize these 
 * variables and a method to display the person's details 
 */
package gov.in.oupp.training.java.corejava.assignments.coding;

/**
 * @author AKG
 *
 */

class Person {
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display() {
        System.out.println("Name: "+name+" Age: "+age);
    }
}

public class Question3 {

	public static void main(String[] args) {
		
		Person p = new Person("Apurba",23);
		p.display();
	}

}
