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
		// Declare Scanner and loop variable
		Scanner kb = new Scanner(System.in);
		boolean isCustomer = true;

		// print a greeting
		greeting();

		// infinite loop based on user input custPrompt()
		while (isCustomer) {

			if (custReady(kb) == 1) {
				doTransaction(kb);
			} else {
				isCustomer = false;
				farewell();
			}
		}

		kb.close();
	}

	// function: prompt user for input if ready.
	public static int custReady(Scanner kb) {
		System.out.println();
		System.out.println("Are you ready to take the next customer?");
		System.out.println("\t1: Yes");
		System.out.println("\t2: No");
		System.out.println();
		int nextCustomer = kb.nextInt();
		kb.nextLine();
		
		String readyMsg = nextCustomer < 3 && nextCustomer > 0 ? "" : "I'm sorry that is not a valid option, please restart me.";
		System.out.println(readyMsg);
		return nextCustomer;
	}
	
	// function: perform transaction
	public static void doTransaction(Scanner kb) {
		double amountPayed, amountChange, itemCost;
		System.out.print("Please enter the cost of the item being purchased: \n$");
		itemCost = kb.nextDouble();
		kb.nextLine();

		System.out.print("Please enter the amount the customer gave you for the item: \n$");
		amountPayed = kb.nextDouble();
		kb.nextLine();

		amountChange = amountPayed - itemCost;

		if (amountChange == 0) {
			System.out.println("Thank you for providing exact change.");
		} else if (amountChange < 0) {
			itemCost = itemCost - amountPayed;
			System.out.printf("I am sorry, this is not enough. You still owe: $%.2f\n", itemCost);
		} else {
			cashDrawer();

			System.out.printf("The customer's change is $%.2f\n", amountChange);
			System.out.println();
			changeLoop(amountChange);
	    }

	}

	// value to match number of cases in changeSwitch
	public static void changeLoop(double change) {
		for (int i = 8; i > 0; i--) {
			change = changeSwitch(i, change);
		}
	}

	// function: switch to set denominations. Modify to whichever monetary system is
	// needed.
	public static double changeSwitch(int switchNum, double change) {
		double denomValue = 0.0;
		String denomination = "";

		switch (switchNum) {
		case 1:
			denomination = "Pennies";
			denomValue = 0.01;
			change = numMonies(denomination, denomValue, change);
			return change;
		case 2:
			denomination = "Nickles";
			denomValue = 0.05;
			change = numMonies(denomination, denomValue, change);
			return change;
		case 3:
			denomination = "Dimes";
			denomValue = 0.10;
			change = numMonies(denomination, denomValue, change);
			return change;
		case 4:
			denomination = "Quarters";
			denomValue = 0.25;
			change = numMonies(denomination, denomValue, change);
			return change;
		case 5:
			denomination = "$1 bills";
			denomValue = 1.00;
			change = numMonies(denomination, denomValue, change);
			return change;
		case 6:
			denomination = "$5 bills";
			denomValue = 5.00;
			change = numMonies(denomination, denomValue, change);
			return change;
		case 7:
			denomination = "$10 bills";
			denomValue = 10.00;
			change = numMonies(denomination, denomValue, change);
			return change;
		case 8:
			denomination = "$20 bills";
			denomValue = 20.00;
			change = numMonies(denomination, denomValue, change);
			return change;
		default:
			System.out.println("Something has gone horribly wrong!");
			return change;
		}
	}

	// function: calculate and print proper amounts of change for customer. Modify
	// "Pennies" string to match lowest denomination and round appropriately
	public static double numMonies(String denomName, double denomination, double amount) {
		double amountLeft = 0;
		double preNumMonies = 0;
		int numMonies = 0;

		if (amount / denomination >= 0) {
			preNumMonies = amount / denomination;
			amountLeft = amount % denomination;
		}

		if ("Pennies".equals(denomName)) {
			preNumMonies = preNumMonies + 0.01;
		}

		numMonies = (int) preNumMonies;

		if (numMonies > 0) {
			System.out.println(numMonies + " " + denomName);
		}

		return amountLeft;
	}

	// fun image
	public static void cashDrawer() {
		System.out.println();
		System.out.print("         ______________________________  \n" + "        /       /       /      /      /  \n"
				+ "       /       /       /      /      /   \n" + "      / [$20] / [$10] / [$5] / [$1] /    \n"
				+ "     /       /       /      /      /     \n" + "    /_______/_______/______/______/      \n"
				+ "   /       /       /      /      /       \n" + "  / [25¢] / [10¢] / [5¢] / [1¢] /        \n"
				+ " /_______/_______/______/______/         \n");
		System.out.println();
	}

	// Greeting image
	public static void greeting() {
		System.out.println();
		System.out.print("        _____   _____   _____  ___   \n" + "       /    /  /    /  /    / /   \\ \n"
				+ "      /    /  /    /  /    / /    /  \n" + "     /  __   /    /  /    / /    /   \n"
				+ "    /____/  /____/  /____/ /____/    \n" + "        ___                          \n"
				+ "       /   \\   /\\   \\   /         \n" + "      /    /  /__\\   \\ /           \n"
				+ "     /    /  /    \\   /             \n" + "    /____/  /      \\ /              \n");
		System.out.println();
	}

	// farewell image
	public static void farewell() {
		System.out.println();
		System.out.print("        _____   _____   _____  ___   \n" + "       /       /    /  /    / /   \\ \n"
				+ "      /       /    /  /    / /    /  \n" + "     /  __   /    /  /    / /    /   \n"
				+ "    /____/  /____/  /____/ /____/    \n" + "        ___                _____     \n"
				+ "       /   \\   \\   /     /        \n" + "      /____/    \\ /     /____      \n"
				+ "     /    /      /     /            \n" + "    /____/      /     /_____        \n");
		System.out.println();
	}

}
