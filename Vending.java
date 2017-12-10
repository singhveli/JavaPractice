import java.util.Scanner;

public class Vending {
	public static void main(String[] args) {
		double v1;
		double v2;
		double chng;
		double dollars, quarters, dimes, nickels, pennies;
		
		
	Scanner input=new Scanner(System.in);
		System.out.print("Enter the cost of an item");
			v1 = input.nextDouble( ); 
		System.out.print("Enter amount of money being paid");
			v2 = input.nextDouble( ); 
			
			chng = v2-v1;  
			
			chng = chng*100; 
			dollars = (int) (chng/100); 
			
			chng = chng%100; 
			quarters = (int) (chng/25); 
		    
			chng = chng%25; 
		    dimes = (int) (chng/10);
			
			chng = chng%10;
			nickels = (int) (chng/5);
			
			chng = chng%5;
			pennies = (int) (chng);

	System.out.print(" Dollars: " + dollars);
	System.out.println(" Quarters: " + quarters);
	System.out.println(" Dimes: " + dimes);
    System.out.println(" Nickels: " + nickels);
	System.out.println(" Pennies: " + pennies);
	
	}
		
	
}

		      