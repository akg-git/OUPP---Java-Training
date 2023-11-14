/**
 * Create a Calculator class with a method calculate(int a, int b) that adds two integers. Override the calculate method 
 * to handle addition, substraction, multiplication and division.
 */
package gov.in.oupp.training.java.corejava.assignments.coding;

/**
 * @author AKG
 *
 */

	class Calculator {
	
		Calculator() {
	
		}
	
		public int calculate(int a, int b) {
			
			return 1;
		}
	
	}

	class Addition extends Calculator {
	
		Addition() {
	
		}
		
		//addition operation
		@Override
		public int calculate(int a, int b) {
			return (a + b);
		}
	}
	
	class Substraction extends Calculator{
		Substraction(){
			
		}
		
		//substraction operation
		@Override
		public int calculate(int a, int b) {
			return (a - b);
		}
	}
	
	class Multiplication extends Calculator{
		Multiplication(){
			
		}
		
		//multiplication operation
		@Override
		public int calculate(int a, int b) {
			return (a * b);
		}
	}
	
	class Division extends Calculator{
		Division(){
			
		}
		
		//division operation
		@Override
		public int calculate(int a, int b) {
			return (a / b);
		}
		
	}


public class Question10 {

	public static void main(String[] args) {

		Calculator addition = new Addition();
		System.out.println("Addition = "+addition.calculate(10, 5));
		
		Calculator substraction = new Substraction();
		System.out.println("Substraction = "+substraction.calculate(10, 5));
		
		
		Calculator multiplication = new Multiplication();
		System.out.println("Multiplication = "+multiplication.calculate(10, 5));
		
		
		Calculator division = new Division();
		System.out.println("Division = "+division.calculate(10, 5));
		
		
		

	}

}
