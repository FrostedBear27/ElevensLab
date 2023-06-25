/**
 * This is a class that tests the Card class.
 */
public class CardTester
{

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args)
	{
		Card card1 = new Card("5","hearts",5);
		Card card2 = new Card("Ace", "spades", 1);
		Card card3 = new Card("3", "clubs", 3);

		System.out.println(card1.matches(card1));
		System.out.println(card1.matches(card2));
		System.out.println(card1.toString());
		System.out.println();
		System.out.println(card2.matches(card2));
		System.out.println(card2.matches(card3));
		System.out.println(card2.toString());
		System.out.println();
		System.out.println(card3.matches(card3));
		System.out.println(card3.matches(card1));
		System.out.println(card3.toString());
	}
}
