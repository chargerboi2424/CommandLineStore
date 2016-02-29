import java.util.Scanner;


public class Store {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// input
		Scanner keyboard = new Scanner(System.in);
		double balance = 0.00;
		int menuSelect = 0; //menu that user selects
		boolean exitMainMenu = true; //tells when to exit main menu
		boolean exitMenu = true; //exits individual menus
		int selection = 0;  //item that user selects
		int quantity = 0; //quantity of items
		// item count for dvd menu
		int dvd1 = 0;
		int dvd2 = 0;
		int dvd3 = 0;
		int dvd4 = 0;
		// item count for figurines menu
		int fig1 = 0;
		int fig2 = 0;
		int fig3 = 0;
		int fig4 = 0;
		// item count for food menu
		int food1 = 0;
		int food2 = 0;
		int food3 = 0;
		//invoice printing vars
		int count = 0;
		String itemName = "";
		double price =0;
		double shipping = 0.00;
		double total = 0.00;
		
		System.out.println("Welcome to Panther Gift Store");
		System.out.println();
		System.out.print("Please enter shopping budget ($):");
		balance = keyboard.nextDouble();
		while (balance < 0) {												//test to see if balance is valid
			System.out.println("Invalid budget.");							//if balance is not valid, it is indicated and requests
			System.out.print("Please enter shopping budget ($):");			//a new value
			balance = keyboard.nextDouble();
		}
		System.out.println();
		System.out.println("================================================================");
		while (exitMainMenu){
			exitMenu = true;
			System.out.println();
			System.out.print("Panther Gift Store                              Balance: $");
			System.out.printf("%5.2f", balance);
			System.out.print("\n");
			System.out.println("------------------");
			System.out.println("1 Panther DVDs");
			System.out.println("2 Panther Figurines");
			System.out.println("3 Panther Foods");
			do{
			System.out.print("Please select your category (0 to exit):");
			menuSelect = keyboard.nextInt();
			if (menuSelect<0 || menuSelect>3)
				System.out.println("Invalid category.");
			}
			while (menuSelect<0 || menuSelect>3);
			switch (menuSelect) {
			case 0:
				exitMainMenu = false;
				break;
			case 1:
				while (exitMenu){
					System.out.println();
					System.out.print("Panther DVDs                                    Balance: $");
					System.out.printf("%5.2f", balance);
					System.out.print("\n");
					System.out.println("------------");
				    System.out.println("1 The Jungle Book ($10.95)");
				    System.out.println("2 Monsoon Railway ($8.25)");
				    System.out.println("3 Great Peaks ($49.95)");
				    System.out.println("4 Thomas and Friends ($5.00)");
				    System.out.println();
				    do{
					System.out.print("Please select your DVD (1-4, 0 to main menu):");
					selection = keyboard.nextInt();
					if (selection<0 || selection>4)
						System.out.println("Invalid choice.");
					}
					while (selection<0 || selection>4);
				    switch (selection){
				    	case 0:
				    		exitMenu = false;
				    		break;
				    	case 1:
				    		System.out.print("Please enter quantity (0 to cancel):");
				    		quantity = keyboard.nextInt();
				    		if (quantity>0){
				    			if (balance > (quantity*10.95)+1){
				    				System.out.print("Added to shopping cart: The Jungle Book [" + quantity + "] ($");
				    				System.out.printf("%5.2f)", quantity*10.95);
				    				System.out.print("\n");
				    				balance = balance - (quantity*10.95);
				    				dvd1 = dvd1 + quantity;
				    			}
				    			else{
				    				System.out.println("Order amount exceeds budget -- cannot proceed.");
				    			}
				    		}
				    		break;	
				    	case 2:
				    		System.out.print("Please enter quantity (0 to cancel):");
				    		quantity = keyboard.nextInt();
				    		if (quantity>0){
				    			if (balance > (quantity*8.25)+1){
				    				System.out.print("Added to shopping cart: Monsoon Railway [" + quantity + "] ($");
				    				System.out.printf("%5.2f)", quantity*8.25);
				    				System.out.print("\n");
				    				balance = balance - (quantity*8.25);
				    				dvd2 = dvd2 + quantity;
				    			}
				    			else{
				    				System.out.println("Order amount exceeds budget -- cannot proceed.");
				    			}
				    		}
				    		break;	
				    	case 3:
				    		System.out.print("Please enter quantity (0 to cancel):");
				    		quantity = keyboard.nextInt();
				    		if (quantity>0){
				    			if (balance > (quantity*49.95)+1){
				    				System.out.print("Added to shopping cart: Great Peaks [" + quantity + "] ($");
				    				System.out.printf("%5.2f)", quantity*49.95);
				    				System.out.print("\n");
				    				balance = balance - (quantity*49.95);
				    				dvd3 = dvd3 + quantity;
				    			}
				    			else{
				    				System.out.println("Order amount exceeds budget -- cannot proceed.");
				    			}
				    		}
				    		break;	
				    	case 4:
				    		System.out.print("Please enter quantity (0 to cancel):");
				    		quantity = keyboard.nextInt();
				    		if (quantity>0){
				    			if (balance > (quantity*5.00)+1){
				    				System.out.print("Added to shopping cart: Thomas and Friends [" + quantity + "] ($");
				    				System.out.printf("%5.2f)", quantity*5.00);
				    				System.out.print("\n");
				    				balance = balance - (quantity*5.00);
				    				dvd4 = dvd4 + quantity;
				    			}
				    			else{
				    				System.out.println("Order amount exceeds budget -- cannot proceed.");
				    			}
				    		}
				    		break;						   
				   }
				}
			case 2:
				while (exitMenu){
					System.out.println();
					System.out.print("Panther Figurines                               Balance: $");
					System.out.printf("%5.2f", balance);
					System.out.print("\n");
					System.out.println("-----------------");
					System.out.println("1 Thomas the Tank-Engine ($5.75)");
				    System.out.println("2 Superman ($17.99)");
				    System.out.println("3 Mickey Mouse (6-piece Set) ($10.00)");
				    System.out.println("4 Florida Railroad Coach Model ($39.99)");
				    System.out.println();
				    do{
					System.out.print("Please select your figurine (1-4, 0 to main menu):");
					selection = keyboard.nextInt();
					if (selection<0 || selection>4)
						System.out.println("Invalid choice.");
					}
					while (selection<0 || selection>4);
				    switch (selection){
				    	case 0:
				    		exitMenu = false;
				    		break;
				    	case 1:
				    		System.out.print("Please enter quantity (0 to cancel):");
				    		quantity = keyboard.nextInt();
				    		if (quantity>0){
				    			if (balance > (quantity*5.75)+7){
				    				System.out.print("Added to shopping cart: Thomas the Tank-Engine [" + quantity + "] ($");
				    				System.out.printf("%5.2f)", quantity*5.75);
				    				System.out.print("\n");
				    				balance = balance - (quantity*5.75);
				    				fig1 = fig1 + quantity;
				    			}
				    			else{
				    				System.out.println("Order amount exceeds budget -- cannot proceed.");
				    			}
				    		}
				    		break;	
				    	case 2:
				    		System.out.print("Please enter quantity (0 to cancel):");
				    		quantity = keyboard.nextInt();
				    		if (quantity>0){
				    			if (balance > (quantity*17.99)+7){
				    				System.out.print("Added to shopping cart: Superman [" + quantity + "] ($");
				    				System.out.printf("%5.2f)", quantity*17.99);
				    				System.out.print("\n");
				    				balance = balance - (quantity*17.99);
				    				fig2 = fig2 + quantity;
				    			}
				    			else{
				    				System.out.println("Order amount exceeds budget -- cannot proceed.");
				    			}
				    		}
				    		break;	
				    	case 3:
				    		System.out.print("Please enter quantity (0 to cancel):");
				    		quantity = keyboard.nextInt();
				    		if (quantity>0){
				    			if (balance > (quantity*10.00)+7){
				    				System.out.print("Added to shopping cart: Mickey Mouse (6-piece Set) [" + quantity + "] ($");
				    				System.out.printf("%5.2f)", quantity*10.00);
				    				System.out.print("\n");
				    				balance = balance - (quantity*10.00);
				    				fig3 = fig3 + quantity;
				    			}
				    			else{
				    				System.out.println("Order amount exceeds budget -- cannot proceed.");
				    			}
				    		}
				    		break;	
				    	case 4:
				    		System.out.print("Please enter quantity (0 to cancel):");
				    		quantity = keyboard.nextInt();
				    		if (quantity>0){
				    			if (balance > (quantity*39.99)+7){
				    				System.out.print("Added to shopping cart: Florida Railroad Coach Model [" + quantity + "] ($");
				    				System.out.printf("%5.2f)", quantity*39.99);
				    				System.out.print("\n");
				    				balance = balance - (quantity*39.99);
				    				fig4 = fig4 + quantity;
				    			}
				    			else{
				    				System.out.println("Order amount exceeds budget -- cannot proceed.");
				    			}
				    		}
				    		break;						   
				   }
				}
			case 3:
				while (exitMenu){
					System.out.println();
					System.out.print("Panther Foods                                   Balance: $");
					System.out.printf("%5.2f", balance);
					System.out.print("\n");
					System.out.println("-------------");
					System.out.println("1 Sun Chips (2-pack) ($4.18)");
				    System.out.println("2 Corn on the Cob (6-pack) ($2.40)");
				    System.out.println("3 Orange Juice (12-pack) ($8.00)");
				    System.out.println();
				    do{
					System.out.print("Please select your food (1-3, 0 to main menu):");
					selection = keyboard.nextInt();
					if (selection<0 || selection>4)
						System.out.println("Invalid choice.");
					}
					while (selection<0 || selection>4);
				    switch (selection){
				    	case 0:
				    		exitMenu = false;
				    		break;
				    	case 1:
				    		System.out.print("Please enter quantity (0 to cancel):");
				    		quantity = keyboard.nextInt();
				    		if (quantity>0){
				    			if (balance > (quantity*4.18)+3){
				    				System.out.print("Added to shopping cart: Sun Chips (2-pack) [" + quantity + "] ($");
				    				System.out.printf("%5.2f)", quantity*4.18);
				    				System.out.print("\n");
				    				balance = balance - (quantity*4.18);
				    				food1 = food1 + quantity;
				    			}
				    			else{
				    				System.out.println("Order amount exceeds budget -- cannot proceed.");
				    			}
				    		}
				    		break;	
				    	case 2:
				    		System.out.print("Please enter quantity (0 to cancel):");
				    		quantity = keyboard.nextInt();
				    		if (quantity>0){
				    			if (balance > (quantity*2.40)+3){
				    				System.out.print("Added to shopping cart: Corn on the Cob (6-pack) [" + quantity + "] ($");
				    				System.out.printf("%5.2f)", quantity*2.40);
				    				System.out.print("\n");
				    				balance = balance - (quantity*2.40);
				    				food2 = food2 + quantity;
				    			}
				    			else{
				    				System.out.println("Order amount exceeds budget -- cannot proceed.");
				    			}
				    		}
				    		break;	
				    	case 3:
				    		System.out.print("Please enter quantity (0 to cancel):");
				    		quantity = keyboard.nextInt();
				    		if (quantity>0){
				    			if (balance > (quantity*8.00)+3){
				    				System.out.print("Added to shopping cart: Orange Juice (12-pack) [" + quantity + "] ($");
				    				System.out.printf("%5.2f)", quantity*8.00);
				    				System.out.print("\n");
				    				balance = balance - (quantity*8.00);
				    				food3 = food3 + quantity;
				    			}
				    			else{
				    				System.out.println("Order amount exceeds budget -- cannot proceed.");
				    			}
				    		}
				    		break;						   
				   }
				}			
			}
		}
		
		//------------------------------------------Output Starts Here-------------------------------------------------------------
		System.out.println("====================== Invoice - Panther Home ==================");
		System.out.println("    Item                                  Price    Qty    Amount");
		System.out.println("----------------------------------------------------------------");
		if (dvd1 > 0){																				//DVD1
			itemName = "The Jungle Book";
			price = 10.95;
			quantity = dvd1;
			System.out.printf("%-4d%-36s%7.2f%7d%10.2f%n", ++count,
              itemName, price, quantity, price * quantity);
			total = total + (price * quantity);
		}
		if (dvd2 > 0){																				//DVD2
			itemName = "Monsoon Railway";
			price = 8.25;
			quantity = dvd2;
			System.out.printf("%-4d%-36s%7.2f%7d%10.2f%n", ++count,
              itemName, price, quantity, price * quantity);
			total = total + (price * quantity);
		}
		if (dvd3 > 0){																				//DVD3
			itemName = "Great Peaks";
			price = 49.95;
			quantity = dvd3;
			System.out.printf("%-4d%-36s%7.2f%7d%10.2f%n", ++count,
              itemName, price, quantity, price * quantity);
			total = total + (price * quantity);
		}
		if (dvd4 > 0){																				//DVD4
			itemName = "Thomas and Friends";
			price = 5.00;
			quantity = dvd4;
			System.out.printf("%-4d%-36s%7.2f%7d%10.2f%n", ++count,
              itemName, price, quantity, price * quantity);
			total = total + (price * quantity);
		}
		if (fig1 > 0){																				//Figurine1
			itemName = "Thomas the Tank-Engine";
			price = 5.75;
			quantity = fig1;
			System.out.printf("%-4d%-36s%7.2f%7d%10.2f%n", ++count,
              itemName, price, quantity, price * quantity);
			total = total + (price * quantity);
		}
		if (fig2 > 0){																				//Figurine2
			itemName = "Superman";
			price = 17.99;
			quantity = fig2;
			System.out.printf("%-4d%-36s%7.2f%7d%10.2f%n", ++count,
              itemName, price, quantity, price * quantity);
			total = total + (price * quantity);
		}
		if (fig3 > 0){																				//Figurine3
			itemName = "Mickey Mouse (6-piece Set)";
			price = 10.00;
			quantity = fig3;
			System.out.printf("%-4d%-36s%7.2f%7d%10.2f%n", ++count,
              itemName, price, quantity, price * quantity);
			total = total + (price * quantity);
		}
		if (fig4 > 0){																				//Figurine4
			itemName = "Florida Railroad Coach Model";
			price = 39.99;
			quantity = fig4;
			System.out.printf("%-4d%-36s%7.2f%7d%10.2f%n", ++count,
              itemName, price, quantity, price * quantity);
			total = total + (price * quantity);
		}
		if (food1 > 0){																				//Food1
			itemName = "Sun Chips (2-pack)";
			price = 4.18;
			quantity = food1;
			System.out.printf("%-4d%-36s%7.2f%7d%10.2f%n", ++count,
              itemName, price, quantity, price * quantity);
			total = total + (price * quantity);
		}
		if (food2 > 0){																				//Food2
			itemName = "Corn on the Cob (6-pack)";
			price = 2.40;
			quantity = food2;
			System.out.printf("%-4d%-36s%7.2f%7d%10.2f%n", ++count,
              itemName, price, quantity, price * quantity);
			total = total + (price * quantity);
		}
		if (food3 > 0){																				//Food3
			itemName = "Orange Juice (12-pack)";
			price = 8.00;
			quantity = food3;
			System.out.printf("%-4d%-36s%7.2f%7d%10.2f%n", ++count,
              itemName, price, quantity, price * quantity);
			total = total + (price * quantity);
		}
		if (dvd1>0 || dvd2>0 || dvd3>0 || dvd4>0)
			shipping = shipping + 1.00;
		if (fig1>0 || fig2>0 || fig3>0 || fig4>0)
			shipping = shipping + 7.00;
		if (food1>0 || food2>0 || food3>0)
			shipping = shipping + 3.00;
		System.out.printf("%4s%-36s%24.2f%n", "", "Shipping:", shipping);
		System.out.println("----------------------------------------------------------------");
		System.out.printf("%20s%44.2f%n", "Total Amount:", total+shipping);
		System.out.println("----------------------------------------------------------------");
		System.out.println();
		System.out.println("Thank you for shopping at Panther Gift Store!");
	}

}
