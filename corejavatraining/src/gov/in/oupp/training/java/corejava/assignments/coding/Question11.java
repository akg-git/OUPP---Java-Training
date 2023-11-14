/**
 * Create a class Employee with a method calculateSalary(). Implement this class in two subclasses.
 * Manager and Developer both providing their own implementation for the calculateSalary() method.
 */
package gov.in.oupp.training.java.corejava.assignments.coding;

/**
 * @author AKG
 *
 */

class Employee{
	
	Employee(){
		
	}
	
	public void calculateSalary(float salary){
		float ebonus = salary * 0.05f;
		System.out.println("Employee Bonus = "+ebonus);
	}
	
}

class Manager extends Employee{
	
	Manager(){
		
	}
	
	public void calculateSalary(float salary){
		float mbonus = salary * 0.25f;
		System.out.println("Employee Bonus = "+mbonus);
	}
}

class Developer extends Employee{
	
	Developer(){
		
	}
	
	public void calculateSalary(float salary){
		float dbonus = salary * 0.10f;
		System.out.println("Employee Bonus = "+dbonus);
	}
	
}

public class Question11 {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.calculateSalary(30000.35f);
		
		Manager mgr = new Manager();
		mgr.calculateSalary(76080.34f);
		
		Developer dev = new Developer();
		dev.calculateSalary(45500.30f);
		
	}

}
