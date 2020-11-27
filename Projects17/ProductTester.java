package inventory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {
		//create a Scanner object for keyboard input
		Scanner in = new Scanner(System.in);	
		int maxSize, menuChoice;
		
		maxSize = getNumProducts(in);
		if(maxSize ==0) {
			//Display a no products message if zero is entered
			System.out.println("No products required!");
		}else {
			Product[] products = new Product[maxSize];
	        addToInventory(products, in);
	        do {
	        	menuChoice = getMenuOption(in);
	        	executeMenuChoice(menuChoice, products, in);
	        }while(menuChoice!=0);
	   
		}//endif
		
	}//end method main
	
	public static void executeMenuChoice(int menuOption, Product[] products, Scanner in) {
		switch(menuOption) {
		case 1:
			System.out.println("View Product List");
			displayInventory(products);
			break;
		case 2:
			System.out.println("Add Stock");
			addInventory(products, in);
			break;
		case 3:
			System.out.println("Deduct Stock");
			deductInventory(products, in);
			break;
		case 4:
			System.out.println("Discontinue Stock");
			discontinueInventory(products, in);
			break;
			
		}
	}
	
	public static void discontinueInventory(Product[] products, Scanner in) {
		int productChoice;
		productChoice = getProductNumber(products, in);
		products[productChoice].setActive(false);
		
	}
	
	public static void deductInventory(Product[] products, Scanner in) {
		int productChoice;
		int updateValue = -1;
		
		productChoice = getProductNumber(products, in);
		System.out.println("How many products do you want to deduct? ");
		do {
			updateValue = in.nextInt();
			if(updateValue < 0) System.out.println("Error. Please enter correct number of product to deduct: ");
		}while(updateValue < 0);
		products[productChoice].deductFromInventory(updateValue);
		
	}
	
	public static void addInventory(Product[] products, Scanner in) {
		int productChoice;
		int updateValue = -1;
		
		productChoice = getProductNumber(products, in);
		System.out.println("How many products do you want to add? ");
		do {
			updateValue = in.nextInt();
			if(updateValue < 0) System.out.println("Error. Please enter correct number of product to add: ");
		}while(updateValue < 0);
		products[productChoice].addToInventory(updateValue);
		
	}
	
	public static int getProductNumber(Product[] products, Scanner in) {
    	int productChoice = -1;
    	System.out.println("Please, enter product number: ");
    	for(int i=0; i<products.length; i++) {
    		System.out.println(i + ": " + products[i].getName());
    	}
    	do {
    	productChoice = in.nextInt();
    	if(productChoice < 0 || productChoice > products.length) {
    		System.out.println("Error. Please enter another number: ");	
    	}
    	}while(productChoice < 0 || productChoice > products.length);
    	return productChoice;
    }
	
	public static void displayInventory(Product[] products) {
		for(Product product: products)
        	System.out.println(product);
	}
	
    public static int getMenuOption(Scanner in) {
    	int option = -1;
		System.out.println("1. View Inventory\r\n" + 
				"2. Add Stock\r\n" + 
				"3. Deduct Stock\r\n" + 
				"4. Discontinue Product\r\n" + 
				"0. Exit\r\n" + 
				"Please enter a menu option:");
		do {
		option = in.nextInt();
		if(option<0||option>4) {
			System.out.println("Please enter correct menu option: ");
		}
		}while(option<0||option>4);
		return option;
	}
	
	public static void addToInventory(Product[] products, Scanner in) {
		int tempNumber;
		String tempName;
		int tempQty;
		double tempPrice;
		for(int i = 0; i<products.length; i++) {
        	in.nextLine();
        	//ask the user to enter the product information
    		System.out.print("\n\nPlease enter the product name: ");
    		tempName = in.nextLine();
    		System.out.print("Please enter the quantity of stock for this product: ");
    		tempQty = in.nextInt();
    		System.out.print("Please enter the price for this product: ");
    		tempPrice = in.nextDouble();
    		System.out.print("Please enter the item number: ");
    		tempNumber = in.nextInt();
    		//create a product object and store it in the products array
    		products[i] = new Product(tempNumber, tempName, tempQty, tempPrice);
        }//endfor
	}
	
	public static int getNumProducts(Scanner in) {
		int maxSize=-1;
		do {
			try{
				//display prompt to user		
				System.out.println("Enter the number of products you would like to add.");
				System.out.print("Enter 0 (zero) if you do not wish to add products: ");
				//assume that the user enters a valid 
				maxSize = in.nextInt();	
				if(maxSize<0)
					System.out.println("Incorrect Value entered");
				//endif
			}
			catch(InputMismatchException e) {
				System.out.println("Incorrect data type entered!");
				in.nextLine();
			}
			catch(Exception e){
				System.out.println(e);
				in.nextLine();
			}
		}while(maxSize<0);
		return maxSize;
	}
	

}//end class ProductTaster
