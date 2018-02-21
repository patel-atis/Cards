
/**
 * @author PATEL_ATIS
 * Test the implementation of the Deck class
 */
public class DeckTest {
	
	public static void main(String[] args) {
		
		//create an array with 5 elements and initiate them
		Card[] cards = new Card[5];
		cards[0] = new Card(5, 'H');
		cards[1] = new Card(13, 'D');
		cards[2] = new Card(1, 'H');		
		cards[3] = new Card();
		cards[4] = new Card(10, 'C');
		
		//Create a instance of Deck that takes the cards array
		Deck myDeck = new Deck(cards);
		
		//print out the cards stored in the deck
		System.out.println(myDeck.toString());
		
		//create a new array of cards and update the last value and update myDeck to include the newCards array
		Card[] newCards = myDeck.getCards();
		newCards[newCards.length - 1] = new Card(4, 'H');
		myDeck = new Deck(newCards);
		
		//shuffle the deck
		myDeck.shuffle();
		
		//print the new
		System.out.println(myDeck.toString());
		
	}

}
