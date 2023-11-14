/**
 * Create a class Student with instance variables name and rollNumber. Write a parameterized constructor to initialize 
 * these variables and print all the information 
 */
package gov.in.oupp.training.java.corejava.assignments.coding;

/**
 * @author AKG
 *
 */

 class Student {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void printStudentInfo() {
    	System.out.println("Student Details\n-------------\n" );
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class Question5 {


	public static void main(String[] args) {
		Student student = new Student("Asish", 158);
		student.printStudentInfo();
		

	}

}
