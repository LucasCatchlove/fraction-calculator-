// -------------------------------------------------------
// Assignment 1
// Written by: Lucas catchlove 27145640
// For COMP 248 Section (section U) – Winter 2020
// -------------------------------------------------------

/* this program receives two fractions (in the form of two couples of two integers), 
 * computes the sum and product of said fractions, and then displays the results 
 * as well as the original fractions for the user to see.
 */
import java.util.Scanner;

public class FractionCalculator {

	public static void main(String[] args) {
		
		//welcome message :) 
				System.out.println("*****************************************\n" +
						"           Fraction Calculator           \n" + 
						"*****************************************\n"); 
		//declaring variables
		double fractionProduct, fractionSum;
		int commonDenominator, numeratorSum, numeratorProduct,denominatorProduct,
			numerator1, denominator1, numerator2, denominator2;
			
		//creating new user input (Scanner) object
		Scanner keyboardInput = new Scanner(System.in);
		
		//declaring input variables and receiving their respective values from user
		System.out.println("Enter numerators and non-zero denomiators");
		
		System.out.print("	* for the 1st fraction:");
			numerator1 = keyboardInput.nextInt();
			denominator1 = keyboardInput.nextInt();
		
		System.out.print("	* for the 2nd fraction:");
			numerator2 = keyboardInput.nextInt();	
			denominator2 = keyboardInput.nextInt();
		
			
		//product of fraction logic 
		numeratorProduct = numerator1 * numerator2;
		denominatorProduct = denominator1 * denominator2;
		fractionProduct = (double)numeratorProduct / denominatorProduct; 
		
		//sum of fraction logic 
		commonDenominator = denominator1 * denominator2; 
		numeratorSum = (denominator1*numerator2) + (denominator2*numerator1);
		fractionSum = (double)numeratorSum / commonDenominator; 
		
		//displays product as fraction and then as a decimal number
		System.out.println("\n" + "The product of " + numerator1 + "/" + denominator1 +
				" and " + numerator2 + "/" + denominator2 + " is " + numeratorProduct + 
				"/" + denominatorProduct + " or " + fractionProduct + "\n");
		
		//displays sum as fraction and then as a decimal number
		System.out.println("The sum of " + numerator1 + "/" + denominator1 +
				" and " + numerator2 + "/" + denominator2 + " is " + numeratorSum + 
				"/" + commonDenominator + " or " + fractionSum + "\n");
		
		
		//displays goodbye message 
		System.out.println("Calculations have been completed successfully! Goodbye!");
		
		//closes the Scanner 
		keyboardInput.close();
	}

}
