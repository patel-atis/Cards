import java.util.Scanner;


public class CardTest {

	/**
	 * This program takes a rank and suit as input
	 * then returns the Card and Suit
	 */
	public static void main(String[] args) {
		
		//create instance of card & scanner class
		Card myCard = new Card();
		Scanner scn = new Scanner( System.in );
		//declare variables to keep track of values
		char suit;
		int rank;
		
		//take suit as input until a valid suit is entered
		System.out.println("Please enter the suit of the card: ");
		suit = scn.next().toUpperCase().charAt(0);
				
		while (!myCard.setSuit(suit)) {
			System.out.println("Invalit suit. Try again.");
			System.out.println("Please enter the suit of the card: ");
			suit = scn.next().toUpperCase().charAt(0);
		} 
		
		
		//take the rank as input until a valid rank is entered
		System.out.println("Please enter the rank of the card");
		rank = scn.nextInt();
		
		while (!myCard.setRank(rank)){
			System.out.println("Invalid rank. Try again.");
			System.out.println("Please enter the rank of the card");
			rank = scn.nextInt();
		}
		
		//Return the String value of the Suit and Card
		System.out.printf("Your card is the %s of %s", myCard.getRankStrings(), myCard.getSuitStrings());
		
	}

}
