//AUTHOR: BARBARA CONDRON//
//COURSE: CPT 167//
//PURPOSE: Program 4, Travel program designed to help users pick travel destination packages

git clone https://github.com/bacondron/Travel-Planner-Program.git;
	
package edu.cpt167.condron.project4;

import java.util.Scanner;

public class TravelProgram {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//Constants & Variables//
		final String DESTINATION_NAME_ROME = "Rome, Italy";
		final String DESTINATION_NAME_LONDON = "London, England";
		final String DESTINATION_NAME_KEYWEST = "Key West, Florida"; 
		final double DESTINATION_PRICE_ROME = 500.00;
		final double DESTINATION_PRICE_LONDON = 500.00;
		final double DESTINATION_PRICE_KEYWEST = 500.00;
		final String TRANSPORTATION_NAME_AIRPLANE = "Airplane";
		final String TRANSPORTATION_NAME_SHIP = "Passenger Ship";
		final double TRANSPORTATION_PRICE_AIRPLANE = 500.00; 
		final double TRANSPORTATION_PRICE_SHIP = 250.00;
		final String UPGRADE_NAME_TRANSPORTATION = "Upgrade to First Class Airplane Ticket";
		final String UPGRADE_NAME_LODGING = "First Class Lodging";
		final String UPGRADE_NAME_TOURS = "Guided Tours";
		final String UPGRADE_NAME_ALL = "VIP Package: All Upgrades";
		final String UPGRADE_NAME_NONE = "No Upgrades";
		final double UPGRADE_PRICE_TRANSPORTATION = 75.00;
		final double UPGRADE_PRICE_LODGING = 125.00;
		final double UPGRADE_PRICE_TOURS = 50.00;
		final double UPGRADE_PRICE_ALL = 200.00;
		final double UPGRADE_PRICE_NONE = 0.00;
		String userName = "";
		char destinationSelection = '0';
		char transportationSelection = '0';
		char upgradeSelection = '0';
		double lodgingCost = 0.0;
		double totalCost = 0.0;
		double transportationCost = 0.0;
		double upgradeCost = 0.0;
		String destinationName = "";
		String transportationName = "";
		String upgradeName = "";
		//Welcome//
		System.out.printf("%-30s\n", "Welcome to Travel Planner!");
		//Input//
		System.out.printf("%30s\n", "To begin please enter your name: ");
		userName = input.nextLine();
		System.out.printf("%-10s%1s\n", "Thank you", userName);
		//Destination Menu//
		System.out.printf("%30s\n", "~~~ Destination Selection Menu ~~~");
		System.out.printf("%-10s\n", "You may only select one destination. All packages are priced for one person and are 5 days long.");
		System.out.printf("%-1s%-20s%-1s%-1.2f\n", "Select A for ", DESTINATION_NAME_ROME, "$", DESTINATION_PRICE_ROME);
		System.out.printf("%-1s%-20s%-1s%-1.2f\n", "Select B for ", DESTINATION_NAME_LONDON, "$", DESTINATION_PRICE_LONDON);
		System.out.printf("%-1s%-20s%-1s%-1.2f\n", "Select A for ", DESTINATION_NAME_KEYWEST, "$", DESTINATION_PRICE_KEYWEST);
		System.out.printf("%-1s\n", "Enter Selection Here: ");
		destinationSelection = input.next().toUpperCase().charAt(0);
		//Validation Loop//
		while (destinationSelection != 'A' && destinationSelection != 'B' && destinationSelection != 'C') {
			System.out.printf("%30s\n", "~~~ Destination Selection Menu ~~~");
			System.out.printf("%-10s\n", "You may only select one destination. All packages are priced for one person and are 5 days long.");
			System.out.printf("%-1s%-20s%-1s%-1.2f\n", "Select A for ", DESTINATION_NAME_ROME, "$", DESTINATION_PRICE_ROME);
			System.out.printf("%-1s%-20s%-1s%-1.2f\n", "Select B for ", DESTINATION_NAME_LONDON, "$", DESTINATION_PRICE_LONDON);
			System.out.printf("%-1s%-20s%-1s%-1.2f\n", "Select A for ", DESTINATION_NAME_KEYWEST, "$", DESTINATION_PRICE_KEYWEST);
			System.out.printf("%-1s\n", "Enter Selection Here: ");
			destinationSelection = input.next().toUpperCase().charAt(0);
		}
		System.out.printf("%-10s%1s\n", "Great Choice! ", userName);
		//Transportation Menu//
		System.out.printf("%-30s\n", "~~~ Transportation Menu ~~~");
		System.out.printf("%-1s%-20s%-1s%-1.2f\n", "Select A for ", TRANSPORTATION_NAME_AIRPLANE, "$", TRANSPORTATION_PRICE_AIRPLANE);
		System.out.printf("%-1s%-20s%-1s%-1.2f\n", "Select B for ", TRANSPORTATION_NAME_SHIP, "$", TRANSPORTATION_PRICE_SHIP);
		System.out.printf("%-30s\n", "Enter Selection Here: ");
		transportationSelection = input.next().toUpperCase().charAt(0);
		//validation loop//
		while (transportationSelection != 'A' && transportationSelection != 'B') {
			System.out.printf("%-30s\n", "~~~ Transportation Menu ~~~");
			System.out.printf("%-1s%-20s%-1s%-1.2f\n", "Select A for ", TRANSPORTATION_NAME_AIRPLANE, "$", TRANSPORTATION_PRICE_AIRPLANE);
			System.out.printf("%-1s%-20s%-1s%-1.2f\n", "Select B for ", TRANSPORTATION_NAME_SHIP, "$", TRANSPORTATION_PRICE_SHIP);
			System.out.printf("%-30s\n", "Enter Selection Here: ");
			transportationSelection = input.next().toUpperCase().charAt(0);
		}
		//Upgrade Menu//
		System.out.printf("%-30s\n", "~~~ Upgrade Menu ~~~");
		System.out.printf("%-30s\n", "Only one upgrade may be selected per trip.");
		System.out.printf("%-30s\n", "If no upgrade is selected, travel includes economy seats, and a stay in a standard room.");
		System.out.printf("%-30s\n", "The best deal is the VIP Package: All Upgrades! This package saves you $50 and gives you all the best upgrades available.");
		System.out.printf("%-1s%-50s%-1s%-1.2f\n", "Select A for ", UPGRADE_NAME_TRANSPORTATION, "$", UPGRADE_PRICE_TRANSPORTATION);
		System.out.printf("%-1s%-50s%-1s%-1.2f\n", "Select B for ", UPGRADE_NAME_LODGING, "$", UPGRADE_PRICE_LODGING);
		System.out.printf("%-1s%-50s%-1s%-1.2f\n", "Select C for ", UPGRADE_NAME_TOURS, "$", UPGRADE_PRICE_TOURS);
		System.out.printf("%-1s%-50s%-1s%-1.2f\n", "Select D for ", UPGRADE_NAME_ALL, "$", UPGRADE_PRICE_ALL);
		System.out.printf("%-1s%-50s%-1s%-1.2f\n", "Select E for ", UPGRADE_NAME_NONE, "$", UPGRADE_PRICE_NONE);
		System.out.printf("%-1s\n", "Enter Selection Here: ");
		upgradeSelection = input.next().toUpperCase().charAt(0);
		//validation loop//
		while (upgradeSelection != 'A' && upgradeSelection != 'B' && upgradeSelection != 'C' && upgradeSelection != 'D' && upgradeSelection != 'E') {
			System.out.printf("%-30s\n", "~~~Invalid Selection~~~");
			System.out.printf("%-30s\n", "~~~ Upgrade Menu ~~~");
			System.out.printf("%-30s%-10s%-1s%10.2f%\n", "Select A for ", UPGRADE_NAME_TRANSPORTATION, "$", UPGRADE_PRICE_TRANSPORTATION);
			System.out.printf("%-30s%-10s%-1s%10.2f%\n", "Select B for ", UPGRADE_NAME_LODGING, "$", UPGRADE_PRICE_LODGING);
			System.out.printf("%-30s%-10s%-1s%10.2f%\n", "Select C for ", UPGRADE_NAME_TOURS, "$", UPGRADE_PRICE_TOURS);
			System.out.printf("%-30s%-10s%-1s%10.2f%\n", "Select D for ", UPGRADE_NAME_ALL, "$", UPGRADE_PRICE_ALL);
			System.out.printf("%-30s%-10s%-1s%10.2f%\n", "Select E for ", UPGRADE_NAME_NONE, "$", UPGRADE_PRICE_NONE);
			System.out.printf("%-30s\n", "Enter Selection Here: ");
		}
		//if/else desitnationSelection//
		if (destinationSelection == 'A') {
			destinationName = DESTINATION_NAME_ROME;
			lodgingCost = DESTINATION_PRICE_ROME;
		}
		else if (destinationSelection == 'B') {
			destinationName = DESTINATION_NAME_LONDON;
			lodgingCost = DESTINATION_PRICE_LONDON;
		}
		else {
			destinationName = DESTINATION_NAME_KEYWEST;
			lodgingCost = DESTINATION_PRICE_KEYWEST;
		}
		//if/else transportatonSelection//
		if (transportationSelection == 'A') {
			transportationName = TRANSPORTATION_NAME_AIRPLANE;
			transportationCost = TRANSPORTATION_PRICE_AIRPLANE;
		}
		else {
			transportationName = TRANSPORTATION_NAME_SHIP;
			transportationCost = TRANSPORTATION_PRICE_SHIP;
		}
		//if/else upgradeSelection//
		if (upgradeSelection == 'A') {
			upgradeName = UPGRADE_NAME_TRANSPORTATION;
			upgradeCost = UPGRADE_PRICE_TRANSPORTATION;
		}
		else if (upgradeSelection == 'B') {
			upgradeName = UPGRADE_NAME_LODGING;
			upgradeCost = UPGRADE_PRICE_LODGING;
		}
		else if (upgradeSelection == 'C') {
			upgradeName = UPGRADE_NAME_TOURS;
			upgradeCost = UPGRADE_PRICE_TOURS;
		}
		else if (upgradeSelection == 'D') {
			upgradeName = UPGRADE_NAME_ALL;
			upgradeCost = UPGRADE_PRICE_ALL;
		}
		else {
			upgradeName = UPGRADE_NAME_NONE;
			upgradeCost = UPGRADE_PRICE_NONE;
		}
		//Process//
		totalCost = lodgingCost + transportationCost + upgradeCost;
		//Display//
		System.out.printf("%-30s\n", "~~~~~~~~~~~~~~~~~~~~");
		System.out.printf("%-30s\n", "~~ Travel Report ~~");
		System.out.printf("%-30s\n", "~~~~~~~~~~~~~~~~~~~~");
		System.out.printf("%-30s\n", "");
		System.out.printf("%-30s%-1s\n", "Destination: ", destinationName);
		System.out.printf("%-30s%-1.2f\n", "Lodging Cost: ", lodgingCost);
		System.out.printf("%-30s\n", "");
		System.out.printf("%-30s%-1s\n", "Transportation Type: ", transportationName);
		System.out.printf("%-30s%-1.2f\n", "Transportation Cost: ", transportationCost);
		System.out.printf("%-30s\n", "");
		System.out.printf("%-30s%-1s\n", "Upgrade Selection: ", upgradeName);
		System.out.printf("%-30s%-1.2f\n", "Upgrade Cost: ", upgradeCost);
		System.out.printf("%-30s\n", "");
		System.out.printf("%-30s%-1.2f\n", "Total Cost: ", totalCost);
		//farewell//
		System.out.printf("%-30s\n", "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.printf("%-30s%-1s%-1s\n", "Thank you for using Travel Planner ", userName, "!");
		System.out.printf("%-30s\n", "Have a great day! We hope you enjoy your trip!");

















































    input.close();
} 
}
