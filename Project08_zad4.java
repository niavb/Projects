package projects08;

import java.util.Random;

public class Project08_zad4 {

	public static void main(String[] args) {
		Random rd = new Random();
		String[] cardDeck = {"2♣", "2♦", "2♥", "2♠",
				"3♣", "3♦", "3♥", "3♠",
				"4♣", "4♦", "4♥", "4♠",
				"5♣", "5♦", "5♥", "5♠",
				"6♣", "6♦", "6♥", "6♠",
				"7♣", "7♦", "7♥", "7♠",
				"8♣", "8♦", "8♥", "8♠",
				"9♣", "9♦", "9♥", "9♠",
				"10♣", "10♦", "10♥", "10♠",
				"J♣", "J♦", "J♥", "J♠",
				"D♣", "D♦", "D♥", "D♠",
				"K♣", "K♦", "K♥", "K♠",
				"A♣", "A♦", "A♥", "A♠"};

		
		for (int i = 0; i < 4; i++) {
			int randomCard = rd.nextInt(cardDeck.length);
			if(cardDeck[randomCard]=="0") {
				i--;
				continue;
			}else {
			System.out.print(cardDeck[randomCard] + " ");
			cardDeck[randomCard] = "0";
			}

		}

	}

}
