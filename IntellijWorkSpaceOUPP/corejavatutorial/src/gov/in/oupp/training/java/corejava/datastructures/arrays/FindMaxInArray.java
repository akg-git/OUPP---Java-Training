package gov.in.oupp.training.java.corejava.datastructures.arrays;

public class FindMaxInArray {

    private static int findMax(int[] narr){
        if(narr.length==0){
            throw new IllegalArgumentException("Array is Empty");
        }

        int max = narr[0];
        for(int x: narr){
            if(x>max){
                max = x;
            }
        }

        return max;
    }


    //main method
    public static void main(String[] args) {
        int[] numarr = {56,-189,67,90,45};
        int max = findMax(numarr);
        System.out.println("Maximum Number in the array is = "+max);
    }
}
