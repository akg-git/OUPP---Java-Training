/**
 * Create a Java program to count the number of instances of  class using a static variable
 */
package gov.in.oupp.training.java.corejava.assignments.coding;

/**
 * @author AKG
 *
 */

class StaticInstances{
	
	public static int counter=0;
    StaticInstances() {
        counter++;
    }
    
    public int countInstances(){
    	return counter;
    }
}

public class Question2 {
	
	public static void main(String args[]){
		
		StaticInstances si = new StaticInstances();
		StaticInstances si1 = new StaticInstances();
		StaticInstances si2 = new StaticInstances();
		StaticInstances si3 = new StaticInstances();
		StaticInstances si4 = new StaticInstances();
		
		System.out.println("Number of instances created: " + si.countInstances());
		
	}
	
	
}
