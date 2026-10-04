import java.util.Scanner;

public class GroceryBill {
	public static void main (String [] args) {
		Scanner scnr = new Scanner(System.in);
		double couponDecimal;
		double couponPercentage;
		double monthlyTotal = 0;
		double monthlyAverage;
		
		System.out.println("This program will calculate the average weekly and total monthly grocery bill for a family of four with and without a coupon.\n");
		
		System.out.print("Please enter the coupon % as a decimal (for example to enter 12% type .12 or 0.12): ");
		couponDecimal = scnr.nextDouble();
		
		if ((couponDecimal <= 0 ) || (couponDecimal > 1)) {
			couponDecimal = 0.10;
			System.out.println("\nWARNING: Your coupon entry is invalid, the coupon will default to 10%.");
		}
		
		couponPercentage = couponDecimal * 100.00;
		
		System.out.println("\nThe coupon entered is " + couponPercentage + "%\n");
		
		System.out.print("Total grocery bill of Week 1: $");
		monthlyTotal = scnr.nextDouble() + monthlyTotal;
		System.out.print("Total grocery bill of Week 2: $");
		monthlyTotal = scnr.nextDouble() + monthlyTotal;
		System.out.print("Total grocery bill of Week 3: $");
		monthlyTotal = scnr.nextDouble() + monthlyTotal;
		System.out.print("Total grocery bill of Week 4: $");
		monthlyTotal = scnr.nextDouble() + monthlyTotal;

		
		monthlyAverage = (monthlyTotal / 4);
		
		System.out.println("\nMonthly Total Cost: $" + String.format("%.2f", monthlyTotal));
		System.out.println("Monthly Total Cost with " + couponPercentage + "% coupon is: $" + String.format("%.2f", monthlyTotal * (1 - couponDecimal)));
		System.out.println("Weekly Average Cost: $" + String.format("%.2f", monthlyAverage));
		System.out.println("Average Weekly Cost with " + couponPercentage + "% coupon is: $" + String.format("%.2f", monthlyAverage * (1 - couponDecimal )));
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