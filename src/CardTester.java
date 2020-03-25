/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operatins for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("ace", "spades", 7);
		Card card2 = new Card("queen", "hearts", 10);
		Card card3 = new Card("seven", "diamonds", 4);
		Card card1Duplicate = new Card("ace", "spades", 7);

		System.out.println(card1.rank());
		System.out.println(card2.rank());
		System.out.println(card3.rank());
		System.out.println(card1.suit());
		System.out.println(card2.suit());
		System.out.println(card3.suit());
		System.out.println(card1.pointValue());
		System.out.println(card2.pointValue());
		System.out.println(card3.pointValue());
		System.out.println(card1.matches(card2));
		System.out.println(card1.matches(card3));
		System.out.println(card2.matches(card1));
		System.out.println(card2.matches(card3));
		System.out.println(card3.matches(card1));
		System.out.println(card3.matches(card2));
		System.out.println(card1.matches(card1Duplicate));
		System.out.println(card1.toString());
		System.out.println(card2.toString());
		System.out.println(card3.toString());
	}
}
