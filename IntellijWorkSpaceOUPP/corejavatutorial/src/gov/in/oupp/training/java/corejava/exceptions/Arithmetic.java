package gov.in.oupp.training.java.corejava.exceptions;

public class Arithmetic {
    public static void main(String[] args) {
        int data;
        try{
            data = 10/0;
        }catch(ArithmeticException ae){
            //throw new RuntimeException(ae);
            System.out.println(ae);
        }

        //System.out.println("data = "+data);
    }
}
