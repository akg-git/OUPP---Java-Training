/**
 * 
 */
package gov.in.oupp.training.java.corejava.basics;

import java.util.Scanner;

/**
 * @author AKG
 *
 */
public class ArmstrongNumber {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		
		if(num<10)
		{
			System.out.println(num+" is an Armstrong Number.");
		}
		
		int temp = num;
		int countDigits=0;
		while(temp != 0){
			countDigits++;
			temp = temp/10;
		}
		
		
		int digSum=0;
		int tmp = num;
		while(tmp!= 0)
		{
			digSum += Math.pow(tmp%10, countDigits);
			tmp = tmp/10;
		}
		
		if(digSum==num)
		{
			System.out.println(num+" is an Armstrong Number.");
		}
		else{
			System.out.println(num+" is not an Armstrong Number.");
		}
		
		
		sc.close();
	}

}
