/**
 * WAP in Java to check its an even or odd number.
 */
package gov.in.oupp.training.java.corejava.basics;

import java.util.Scanner;

/**
 * @author AKG
 *
 */
public class CheckEvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		System.out.print("Enter a Number: ");
		num = sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println(num+" is an Even Number");
		}
		else{
			System.out.println(num+" is an Odd Number");
		}
		
		sc.close();
	}

}
