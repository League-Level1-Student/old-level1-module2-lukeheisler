package GameOfWar;

import java.util.Random;

public class Deck {
	private int cards[];
	private int nextCardIndex = 0;
	Random rnd = new Random();

	public Deck() {
		cards = new int[40];
		int index = 0;
		for (int i = 1; i <= 10; i++) {
			cards[index] = i;
			index++;
			cards[index] = i;
			index++;
			cards[index] = i;
			index++;
			cards[index] = i;
			index++;
		}
	}

	public void shuffle() {
		for (int i = 0; i < 10000; i++) {
			int cardIndex1 = rnd.nextInt(cards.length);
			int cardIndex2 = rnd.nextInt(cards.length);
			int cardValue1 = cards[cardIndex1];
			int cardValue2 = cards[cardIndex2];
			cards[cardIndex1] = cardValue2;
			cards[cardIndex2] = cardValue1;
		}
	}

	public int getCardsLeft() {
		return cards.length - nextCardIndex;
	}

	public int dealCard() {
		if (getCardsLeft() > 0) {
			int card = cards[nextCardIndex];
			nextCardIndex++;
			return card;
		}
		else {
			return(-1);
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < cards.length; i++) {
			builder.append(cards[i] + " ");
		}
		return builder.toString();
	}
}
