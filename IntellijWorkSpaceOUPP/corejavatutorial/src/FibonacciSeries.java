// Create a method that will print the Fibonacci series up to a given number.

import java.util.Scanner;


public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = scanner.nextInt();

        if(n<1){
            System.out.println("Invalid input!! Try Again with Positive Integers!!");
        }

        int a = 0, b = 1, c;
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    } // end of main method.

} // end of FibonacciSeries class.
