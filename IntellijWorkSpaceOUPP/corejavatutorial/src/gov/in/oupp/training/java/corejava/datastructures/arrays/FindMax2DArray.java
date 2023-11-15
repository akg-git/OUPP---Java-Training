package gov.in.oupp.training.java.corejava.datastructures.arrays;

import java.util.Scanner;

public class FindMax2DArray {

    private static int findMax(int[][] matrix){
        if(matrix[0].length==0 || matrix.length==0){
            throw new IllegalArgumentException("Matrix is Empty");
        }

        int max = matrix[0][0];
        for(int x=0; x< matrix.length;x++){
            for(int y=0; y< matrix[x].length; y++){
                if(matrix[x][y]>max) {
                    max = matrix[x][y];
                }
            }
        }

        return max;
    }

    //main method
    public static void main(String[] args) {
//        int[][] matrix = {
//                {56,-189,67},
//                {12,90,45},
//                {11,20,93}
//        };

        int row, col;
        //read matrix inputs
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row Size = ");
        row = sc.nextInt();
        System.out.print("Enter Column Size= ");
        col = sc.nextInt();

        int[][] matrix = new int[row][col];
        // Enter values into Matrix

        for(int x=0; x< matrix.length;x++){
            for(int y=0; y< matrix[x].length; y++){
                System.out.print("Enter value for ["+x+"]["+y+"] = ");
                matrix[x][y] = sc.nextInt();
            }
        }



        int max = findMax(matrix);
        System.out.println("Maximum Number in the array is = "+max);
    }
}
