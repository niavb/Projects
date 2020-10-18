package projects09;

import java.util.Random;

public class Project09_zad1 {

	public static void main(String[] args) {
		int sum = 0;
		sum = sumPoints();
		if(sum == 2 || sum == 3 || sum == 12)System.out.println("You lose");
		else if (sum == 7 || sum == 11) System.out.println("You win");
		else {
			int point = sum;
			do {
			  System.out.println("point is " + sum);
			  sum = sumPoints();
			  if(sum == 7)System.out.println("You lose");
			  else if (sum == point) System.out.println("You win");
			}while(sum != 7 && sum != point);
		}

	}
	
	public static int roll() {
		Random rd = new Random();
		int x;
		int[] dice = {1,2,3,4,5,6};
		int numFromDice = rd.nextInt(dice.length);
		x = dice[numFromDice];
		return x;
	}
	public static int sumPoints() {
		int sum = 0;
		int roll1,roll2;
		roll1 = roll();
		roll2 = roll();
		sum = roll1 + roll2;
		System.out.println("You rolled " + roll1 + " + " + roll2 + " = " + sum);
		return sum;
	}
	

}
