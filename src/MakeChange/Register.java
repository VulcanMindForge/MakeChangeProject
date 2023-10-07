/*
Synopsis: Calculate the amount of change returned to a customer based on the purchase price and the amount tendered. 
Notify the attendant how many of each type of currency ($100, $20, $10, $5, $1, .25c, .10c, .05c, .01c) is needed to make the change for the customer.
Author: Jacob Stuart
Version: 1.0
 */
package MakeChange;

import java.util.Scanner;

public class Register {

	public static void main(String[] args) {
		//Declare Scanner and other variables for Main
		Scanner kb = new Scanner(System.in);
		double amountPayed, amountChange, amountOwed;
		boolean customer = true;
		
		//begin loop by opening drawer and initializing transaction menu.
		cashDrawer();
		
		//TODO While loop with menu to determine function needed and allow shut down
		System.out.println("Please enter the cost of the item: ");
		amountOwed = kb.nextDouble();

		System.out.println("Please enter the amount the customer gave you for the item: ");
		amountPayed = kb.nextDouble();
		
		amountChange = amountPayed - amountOwed;
		
		//TODO handle transaction
		makeChange(amountChange);
		
		
		kb.close();
	}
	
	//function: Menu for deciding purchase/refund/side work
	
	public static void cashDrawer() {
		System.out.println();
		System.out.print("         ______________________________  \n"
						+"        /       /       /      /      /  \n"
						+"       /       /       /      /      /   \n"
						+"      / [$20] / [$10] / [$5] / [$1] /    \n"
						+"     /       /       /      /      /     \n"
						+"    /_______/_______/______/______/      \n"
						+"   /       /       /      /      /       \n"
						+"  / [25¢] / [10¢] / [5¢] / [1¢] /        \n"
						+" /_______/_______/______/______/         \n");
		System.out.println();
	}
	
	public static String transactionType(Scanner kb) {
		String menuChoice = "";
		
		
		
		return menuChoice;
	}

	//function: determine and print proper amounts of change for customer.
	public static void makeChange(double change) {
		double denPennyVal = 0.01;
		double denNickleVal = 0.05;
		double denDimeVal = 0.15;
		double denQuarterVal = 0.25;
		double den1DolVal = 0.05;
		double den2DolVal = 2.00;
		double den5DolVal = 5.00;
		double den10DolVal = 10.00;
		double den20DolVal = 20.00;
		int num20 = 0;
		int num10 = 0;
		int num5 = 0;
		int num2 = 0;
		int num1 = 0;
		int numQuart = 0;
		int numDime = 0;
		int numNickle = 0;
		int numPenny = 0;
		

			if (change / den20DolVal >= 0) {
				num20 = (int) (change / 20.00);
				change = change % 20.00;
			}
			if (change / den10DolVal >= 0) {
				num10 = (int) (change / 10.00);
				change = change % 10.00;
			}
			if (change / den5DolVal >= 0) {
				num5 = (int) (change / 5.00);
				change = change % 5.00;
			}
			if (change / den2DolVal >= 0) {
				num2 = (int) (change / den2DolVal);
				change = change % 2.00;
			}
			if (change / den1DolVal >= 0) {
				num1 = (int) (change / den1DolVal);
				change = change % 1.00;
			}
			if (change / denQuarterVal >= 0) {
				numQuart = (int) (change / 0.25);
				change = change % denQuarterVal;
			}
			if (change / denDimeVal >= 0) {
				numDime = (int) (change / denDimeVal);
				change = change % 0.10;
			}
			if (change / denNickleVal >= 0) {
				numNickle = (int) (change / denNickleVal);
				change = change % 0.05;
			}
			if (change / denPennyVal >= 0) {
				numPenny = (int) ((change + 0.005) / denPennyVal);
			}
			
			System.out.println(numPenny + " Pennies " + numNickle + " Nickles " + numDime + " Dimes " + numQuart + " Quarters " + num1 + " 1$ bills " + num2 + " 2$ bills " + num5 + " 5$ bills " + num10 + " 10$ bills " + num20 + " 20$ bills ");

	}
	
}
