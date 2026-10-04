import java.util.Scanner;

public class GroceryBill {
	
	public static void main (String [] args) {
		
		double couponDecimal;
		double monthlyTotal = 0;
		double monthlyAverage;
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("This program will calculate the average weekly and the average monthly grocery bill for a family of four");
		
		System.out.print("\nPlease enter the coupon % as a decimal (for 12% type .12 or 0.12): ");
		couponDecimal = scnr.nextDouble();
		
		if ((couponDecimal <= 0 ) || (couponDecimal > 1)) {
			couponDecimal = 0.10;
			System.out.println("\nWARNING: The value you entered either exceeds 100% OR is equal to/less than 0%, entry will default 10%");
		}
		
		System.out.print("\nThe coupon:  ");
		
		
		System.out.print("\nNow, please enter the total grocery bill of week 1: ");
		monthlyTotal = scnr.nextDouble() + monthlyTotal;
		System.out.print("\nNow, please enter the total grocery bill of week 2: ");
		monthlyTotal = scnr.nextDouble() + monthlyTotal;
		System.out.print("\nNow, please enter the total grocery bill of week 3: ");
		monthlyTotal = scnr.nextDouble() + monthlyTotal;
		System.out.print("\nNow, please enter the total grocery bill of week 4: ");
		monthlyTotal = scnr.nextDouble() + monthlyTotal;
		
		monthlyAverage = monthlyTotal / 4;
		
		System.out.println("\nThe monthly total without the coupon is: $" + String.format("%.2f", monthlyTotal));
		System.out.println("The average weekly cost without the coupon: $" + String.format("%.2f", monthlyAverage));
		System.out.println("The monthly total with the " + + "coupon is: $" + String.format("%.2f", monthlyTotal * (1 - couponDecimal)));
		System.out.println("The average weekly cost with the coupon: $" + String.format("%.2f", monthlyAverage * (1 - couponDecimal )));
	}
}



/*
Create a program that can be used to calculate the average weekly and monthly grocery bill for a family of four:

Prompt the user for the coupon amount as a decimal (example, .10).
Ensure the value is set to 10% if the value exceeds 100% or is less than or equal to zero.
Prompt the user for weeks 1-4 grocery bills.
Calculate the monthly total and weekly average for groceries.
Display monthly total and weekly average without the coupon.
Display monthly total and weekly average with the coupon.
*/