package gov.in.oupp.training.java.corejava.logic;

import java.util.Scanner;

public class MovieTheatreSeating {
    private static char[][] seats;
    private static int rows;
    private static int cols;

    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        cols = sc.nextInt();

        seats = new char[rows][cols];

        initializeTheatre();
        bookSeats();

        sc.close();
    }

    private static void initializeTheatre(){
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                seats[i][j] = '0';
            }
        }
        displaySeats();

    }

    private static void bookSeats(){
        int row;
        int col;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your seat row and column to book your seat.");
        System.out.print("Enter the number of rows: ");
        row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        col = sc.nextInt();

        seats[row][col]='X';

        System.out.println("Your seat has been booked at your specified location.");
        displaySeats();

        sc.close();
    }
    private static void displaySeats(){
        System.out.println("Seat Layout: ");

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(seats[i][j]+" ");
            }
            System.out.println();
        }
    }
}
