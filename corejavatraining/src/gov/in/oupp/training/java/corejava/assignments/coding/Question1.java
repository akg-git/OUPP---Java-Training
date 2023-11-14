/**
 * Write a Java program to calculate the factorial of a given number using a staic method.
 */
package gov.in.oupp.training.java.corejava.assignments.coding;

import java.util.Scanner;

/**
 * @author AKG
 *
 */

class Factorial{
	
	static int fact = 1;
	
	public long calculateFactorial(int num){
		
		if(num<0){
			System.out.println("Enter a valid input!! Try with Positive Integers.");
		}
		
		if(num==1 || num==0){
			return 1;
		}
		else{
			for(int i=1; i <=num; i++){
				fact *=  i;
			}
		}
		
		return fact;
	}
}

public class Question1 {

	public static void main(String[] args) {
		System.out.println("Factorial Calculation");
		int number;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\nEnter a Number: ");
		number = sc.nextInt();
		
		Factorial f = new Factorial();
		System.out.println("Fcatorial of "+ number+ " = "+f.calculateFactorial(number));
		
		sc.close();
	}

}
