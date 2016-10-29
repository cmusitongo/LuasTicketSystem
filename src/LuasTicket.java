/**
 * @author Chris Musitongo
 *
 */
import java.util.Scanner;

public class LuasTicket {
	
	static double AdultSingle= 1.90;		//The ticket price for a Single Adult
	static double ChildSingle= 1.00;		//The ticket price for a Single Child
	static double AdultReturn= 3.50;		//The ticket price for a Adult Return
	static double ChildReturn= 1.70;		//The Ticket price for a Child Return
	static int numZones= 0; 				//The numZones global variable represents the zone the User will choose
	static String ticket; 					//A regular ticket.
	static double transactionDiscount= 0;	//The global variable for adding the discount to the transaction
	static double transactionCost= 0;		//Total fare displayed at the end
	static double payment;					//The amount the User enters
	static int getTrans= 0; 				//For the administrator console
	private static int PIN= 1234; 			//The pin for the administrator console
	static double average= 0;				//Calculates the average amount of Cash
	static double change= 0;				//The User's change
	static double totalCash= 0;				//Cash total for the administrator console
	
	
	static Scanner input= new Scanner(System.in); 		//This imports a scanner to the class

	public static void main(String[] args) {
		menu();											//Calls the menu method.

	}
	
	private static void menu() { 		//The main menu is displayed to the User
		System.out.println("---------------------------------------------");		//Lines 30 to 37 will be displayed to the User.
		System.out.println("     Welcome to the Luas Ticket System!   ");
		System.out.println("---------------------------------------------");
		System.out.println("      NOTE: 50c DISCOUNT ON ALL FARES!    ");
		System.out.println("---------------------------------------------");
		System.out.println("Press 1 for Red Zone");
		System.out.println("Press 2 for Green Zone");
		System.out.println("Press 3 to check the fares");
		System.out.println("Press 4 to enter the Admin Panel");
		System.out.println("---------------------------------------------");
		
		String choice= input.next(); 		//It then saves the users choice so it can be added to the switch statement
		
		switch(choice) { 			//The switch statement for choices 1 to 4
		
			case "1": {
				zoneType();			//It will called the method zoneType if the User selects any of the 4 methods.
				break; 				//so it doesn't execute another line of code instantly
			}
		
			case "2": {
				zoneType();			//It will also call the zoneType method
				break;
			}
			
			case"3": {	
				fares();			//It will call the fares method
				break;
			}
			
			case"4": {
				admin();			//It will call the administrator method
				break;
			}
			
			default: { 				//This will display if the User does not pick an option between 1 and 4.
				System.out.println("Please choose an option between 1 and 4");
			}
		}
	}

	private static void admin() { 								//administrator method
		
		System.out.println("Please enter the PIN.");			//It promts the User or in this case the Administrator, to enter a pin
		int enteredPIN= input.nextInt();						//Once they enter the PIN it is saved as an integer in the enteredPIN variable
		
		if(enteredPIN== PIN) {									//If the enteredPIN variable is equal to the PIN global variable, then it will display the following information to the Administrator
			System.out.println("---------------------------------------------");
			System.out.println("      Luas Ticket Administrator Panel   ");
			System.out.println("---------------------------------------------");
			System.out.println("Total Transactions: " +getTrans);					//It will display the total transactions here
			System.out.println("Total Cash: €" +totalCash);							//The total amount of money in the machine here
			System.out.println("Average Cash: €" +average);							//Displays the average to the User
			System.out.println("---------------------------------------------");
			System.out.println("---------------------------------------------");
			System.out.println("Press 1 to return to Main Menu");
			System.out.println("---------------------------------------------");
			
			String choice= input.next();
			
			switch(choice) {
				case"1": {
					System.out.println("Returning to Main Menu....");
					try {
					    Thread.sleep(5000);
					} catch(InterruptedException ex) {
					    Thread.currentThread().interrupt();
					}
					menu();
				}
			}
			
		}
		else {				//If the enteredPIN variable doesn't match the PIN global variable, it displays the following
			System.out.println("PIN incorrect, returning to Main Menu...");
			try {
			    Thread.sleep(3000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			menu();			//It then calls the menu method and returns the User/Administrator back to the start
		}
		
		

	}

	private static void fares() { 	//This method displays the fare prices to the User
		System.out.println("-------------------------------");
		System.out.println("          Luas Fares:");
		System.out.println("-------------------------------");
		System.out.println("*******************************");
		System.out.println("    TODAY ONLY: 50c Discount ");
		System.out.println("*******************************");
		System.out.println("Type: \t                 Price:");
		System.out.println("*******************************");
		System.out.println("Single Adult Ticket \t €1.90");
		System.out.println("Single Child Ticket \t €1.00");
		System.out.println("*******************************");
		System.out.println("Return Adult Ticket \t €3.50");
		System.out.println("Return Child Ticket \t €1.70");
		System.out.println("*******************************");
		
		try {													//This displays the fare for five seconds
		    Thread.sleep(5000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		
		menu();						//After displaying the fares it calls the menu method
		
	}

	private static void zoneType() {
		System.out.println("---------------------------------------------"); 	//Lines 120 to 130 display to the User to pick a zone.
		System.out.println("     Welcome to the Luas Ticket System!   ");
		System.out.println("---------------------------------------------");
		System.out.println("         Please select an option:            ");
		System.out.println("---------------------------------------------");
		System.out.println("Press 1 \t 		Zone 1");
		System.out.println("Press 2 \t 		Zone 2");
		System.out.println("Press 3 \t 		Zone 3");
		System.out.println("Press 4 \t		Zone 4");
		System.out.println("Press 5 \t 		Zone 5");
		System.out.println("---------------------------------------------");
		
		try {													//This adds a delay of two seconds so the system can process the input
		    Thread.sleep(2000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		
		int value= input.nextInt();
		String choice= Integer.toString(value); 	//Conversion 1,changes the choice from a int to a String
		
		switch(choice) {							//creates a switch statement so the User can choose from 5 different options
		
		case"1": {
			ticketType();							//calls the ticketType method
			break;
		}
		
		case"2": {
			ticketType();
			break;
		}
		
		case"3": {
			ticketType();
			break;
		}
		
		case"4": {
			ticketType();
			break;
		}
		
		case"5": {
			ticketType();
			break;
		}
		
		default: {
			System.out.println("Please choose an option between 1 and 5");		//If the User presses another number instead of 1 or 5, it prints this
		}
		
		}
	}

	private static void ticketType() {
	
		System.out.println("---------------------------------------------");	//Lines 170 to 177 will display to the User
		System.out.println("     Welcome to the Luas Ticket System!   ");
		System.out.println("---------------------------------------------");
		System.out.println("Press 1 for Adult Single");
		System.out.println("Press 2 for Adult Return");
		System.out.println("Press 3 to Child Single");
		System.out.println("Press 4 to Child Return");
		System.out.println("---------------------------------------------");
		
		String choice= input.next();	//saves the Users choice, which then brings it to a switch statement
		
		switch(choice) {
		
		case"1": {
			ticket= "AdultSingle";		//When the User chooses choice 1, the ticket global variable is now set to AdultSingle
			calculateFare();			//It then calls the calculateFare method
			break;
		}
		
		case"2": {
			ticket= "AdultReturn";
			calculateFare();
			break;
		}
		
		case"3": {
			ticket= "ChildSingle";
			calculateFare();
			break;
		}
		
		case"4": {
			ticket= "ChildReturn";
			calculateFare();
			break;
		}
		
		default: {
			System.out.println("Please choose an option between 1 and 4"); 	//If the User presses another number instead of 1 or 4, it prints this
		}
				
		
		}
	}

	private static void calculateFare() {
		if (ticket=="AdultSingle") {
			transactionCost= AdultSingle; 		//the transaction cost will equal to whatever value is in the global variable
			enterfare();	
		}
		
		if (ticket=="AdultReturn") {
			transactionCost= AdultReturn;
			enterfare();
		}
		
		if (ticket=="ChildSingle") {
			transactionCost= ChildSingle; 
			enterfare();
		}
		
		if (ticket=="ChildReturn") {
			transactionCost= ChildReturn;
			enterfare();
		}
		
	}

	private static void enterfare() {
		System.out.println("---------------------------------------------");
		System.out.println("     Welcome to the Luas Ticket System!   ");
		System.out.println("---------------------------------------------");
		System.out.println("Thank you for using The Luas System.");
		System.out.println("Transaction Cost: \t €" +transactionCost);
		System.out.println("Please enter payment.");
		System.out.println("---------------------------------------------");
		payment= input.nextDouble();
		String choice= Double.toString(payment);				//Conversion 2, it turns a double to String variable
		
		
		System.out.println("---------------------------------------------");
		System.out.println("     Welcome to the Luas Ticket System!   ");
		System.out.println("---------------------------------------------");
		System.out.println("Thank you, processing...");
		System.out.println("---------------------------------------------");
		try {													//This adds a delay of five seconds so the system can process the transaction
		    Thread.sleep(5000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		
		if (payment >= transactionCost) {						//If the entered amount is greater than or equal to the cost of the ticket it displays the following
			change= payment-transactionCost;
			System.out.println("---------------------------------------------");
			System.out.println("     Welcome to the Luas Ticket System!   ");
			System.out.println("---------------------------------------------");
			System.out.println("You paid: €" +payment);								//Displays the amount the User paid
			System.out.println("Change: €" +change);								//Displays the change to the User
			System.out.println("Transaction successful. Please take ticket.");
			System.out.println("---------------------------------------------");
			
			getTrans++;								//Once the above proccess is finished, it add 1 to the amount of transactions finished at this machine and continues to do so				
			totalCash= transactionCost+totalCash;	//To add to the total amount in the machine, it add the cost of the ticket to the totalCash variable
			average= totalCash/getTrans; 			//It calculates the average amount of money in the machine
			
			System.out.println("*******************************************"); //It prompts the User to add another ticket if they wish
			System.out.println("     Welcome to the Luas Ticket System!   ");
			System.out.println("*******************************************");
			System.out.println("Press 1 \t 		Add Ticket");
			System.out.println("Press 2 \t 		Main Menu");
			System.out.println("*******************************************");
			
			String choice2= input.next();		//It saves the Users choice here as a local variable to add to the switch statement
			
			switch(choice2) {		//The beginning of the switch statement
			
				case"1": {
					zoneType();		//If the User chooses case 1, it brings them back towards the zone type method
					break;
				}
				
				case"2": {			//If the User picks case 2 they return to the main menu
					menu();
					break;
				}
				
				default: {
					System.out.println("Please choose number 1 or 2");	//If the User presses another number instead of 1 or 2, it prints this
				}
			}
			
		}
		else {
			System.out.println("---------------------------------------------");
			System.out.println("     Welcome to the Luas Ticket System!   ");
			System.out.println("---------------------------------------------");
			System.out.println("You entered: €" +payment);		//Displays the amount  they entered if it's short
			System.out.println("Insufficient funds, please add more money.");
			System.out.println("---------------------------------------------");
			double lowamount= input.nextDouble(); 		//It collects the amount the user entered into the machine
			
			payment= payment+lowamount; 				//It then adds more money onto the amount you entered in the first place.
			
			System.out.println("---------------------------------------------");
			System.out.println("     Welcome to the Luas Ticket System!   ");
			System.out.println("---------------------------------------------");
			System.out.println("Thank you, processing...");
			System.out.println("---------------------------------------------");
			try {													//This adds a delay of five seconds so the system can process the transaction
			    Thread.sleep(2000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			
			change= payment-transactionCost;
			System.out.println("---------------------------------------------");
			System.out.println("     Welcome to the Luas Ticket System!   ");
			System.out.println("---------------------------------------------");
			System.out.println("You paid: €" +payment);							//Displays how much the user entered in the machine
			System.out.println("Change: €" +change);							//Displays the change to the User
			System.out.println("Transaction successful. Please take ticket.");
			System.out.println("---------------------------------------------");
			
			getTrans++;									//It collects and adds this as 1 transaction					
			totalCash= transactionCost+totalCash;		//To add to the total amount in the machine, it add the cost of the ticket to the totalCash variable
			average= totalCash/getTrans;				//It calculates the average amount of money in the machine
			
			System.out.println("**********************************************");
			System.out.println("      Welcome to the Luas Ticket System!   ");
			System.out.println("**********************************************");
			System.out.println("Press 1 \t 		Add Ticket");
			System.out.println("Press 2 \t 		Main Menu");
			System.out.println("**********************************************");
			
			String choice2= input.next(); 				//Saves the users choice as a local variable
			
			switch(choice2) {							//The choice is then used in a switch statement
			
				case"1": {								//Case 1 brings the User back to the zone type method
					zoneType();
					break;
				}
				
				case"2": {								//Case 2 brings the User back to the main menu
					menu();
					break;
				}
				
				default: {
					System.out.println("Please choose number 1 or 2");	//If the User presses another number instead of 1 or 2, it prints this
				}
			}
		}
	}

}
