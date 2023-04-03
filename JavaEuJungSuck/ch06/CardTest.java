package ch06;

public class CardTest {

	public static void main(String[] args) {
	

		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.length = " + Card.length);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.numbers = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.numbers = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.numbers + "이며, 크기는 (" + c1.width + ", " + c1.length + ")" );
		System.out.println("c2은 " + c2.kind + ", " + c2.numbers + "이며, 크기는 (" + c2.width + ", " + c2.length + ")" );
	}

}
