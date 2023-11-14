/**
 * 
 */
package gov.in.oupp.training.java.corejava.myprograms;

/**
 * @author AKG
 *
 */

class Motorcycle{
	
	Motorcycle()
	{
		
	}

	public void addMotorcycleFeatures(String... features) {
		
	    StringBuilder str = new StringBuilder(this.getFeatures());
	    for (String feature : features) {
	        if (str != null)
	            str.append(", ");
	        str.append(feature);
	    }
	    this.setFeatures(str.toString());
	}
	
	private void setFeatures(String string) {
		
		//this.str = string;
	}

	private String getFeatures() {
		
		return null;
	}

	protected int largestNumber(int... numbers) {
	     int currentLargest = numbers[0];
	     for (int number : numbers) {
	        if (number > currentLargest) {
	            currentLargest = number;
	        }
	     }
	     return currentLargest;
	}
}

public class VariableArguments {


	public static void main(String[] args) {

		Motorcycle motorcycle = new Motorcycle();
		
		// we can pass variable number of arguments of similar type
		motorcycle.addMotorcycleFeatures("abs");
		motorcycle.addMotorcycleFeatures("navi", "charger");
		motorcycle.addMotorcycleFeatures("wifi", "phone", "satellite");
		motorcycle.addMotorcycleFeatures("Ducati", "Monster", "red");
		
		int largest = motorcycle.largestNumber(5,3,8,2,0,-2,6,4);
		System.out.println("Largest Numbers are: "+ largest);
		
	}

}
