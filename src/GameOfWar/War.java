package GameOfWar;

public class War {

	public static void main(String[] args) {
		testDeck();
	}

	private static void testDeck() {
		Deck d = new Deck();
		d.shuffle();
		System.out.println(d);
		int card = d.dealCard();
		System.out.println(d.dealCard());
		card = d.dealCard();
		card = d.dealCard();
		card = d.dealCard();
	}
}
