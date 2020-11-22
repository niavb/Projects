package projects16;

import java.util.Scanner;

import projects14.Account;

public class Bankomat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Account[] accounts = new Account[10];
		
		for(int i=0; i<10; i++) {
			accounts[i] = new Account(i, 100);
		}
		int id, choice = 4;
		
		do {
		    System.out.print("Enter an id: ");
		    id = sc.nextInt();
		    do {
		        if(id<0 || id>9) {
			        System.out.print("Please enter an correct id: ");
			        id = sc.nextInt();
		        }else {
			        System.out.print("Main menu\r\n" + 
					 "1: check balance\r\n" + 
					 "2: withdraw\r\n" + 
					 "3: deposit\r\n" + 
					 "4: exit\r\n" + 
					 "Enter a choice:\r\n");
			        choice = sc.nextInt();
			        if(choice == 1) {
				        System.out.println("The balance is " + accounts[id].getBalance());
			        }else if(choice == 2) {
				        System.out.println("Enter an amount to withdraw: ");
				        double withdraw = sc.nextDouble();
				        accounts[id].withdraw(withdraw);
			        }else if(choice == 3) {
				        System.out.println("Enter an amount to deposit: ");
				        double deposit = sc.nextDouble();
				        accounts[id].deposit(deposit);
			        }else if(choice == 4) {
				        break;
			        }
			
		        }
		    }while(choice != 4);
		    continue;
		}while(choice < 5 && choice > 0);
		
		sc.close();
		

	}

}
