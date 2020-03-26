/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] suits = new String[]{"Hearts", "Clubs", "Diamonds", "Spades"};
		String[] ranks1 = new String[]{"Jack", "Four", "Nine"};
		String[] ranks2 = new String[]{"Queen", "Five", "Eight"};
		String[] ranks3 = new String[]{"King", "Three", "Seven"};
		int[] values1 = new int[]{1, 3, 5};
		int[] values2 = new int[]{2, 4, 6};
		int[] values3 = new int[]{9, 8, 7};

		Deck deck1 = new Deck(ranks1, suits, values1);
		Deck deck2 = new Deck(ranks2, suits, values2);
		Deck deck3 = new Deck(ranks3, suits, values3);

		while (!deck1.isEmpty()) {
			System.out.println(deck1.deal().toString());
		}
		while (!deck2.isEmpty()) {
			System.out.println(deck2.deal().toString());
		}
		while (!deck3.isEmpty()) {
			System.out.println(deck3.deal().toString());
		}
	}
}
