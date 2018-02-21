import java.util.Random;




/**
 * @author PATEL_ATIS
 * class that creates a deck of Card objects and perform actions on it
 */
public class Deck {

	private Card cards[];
	private int current = 0;
	
	//no argument constructor that creates a 52 card deck
	public Deck(){
		this.cards = new Card[52];
	}
	
	//constructor that takes an array of cards as input
	public Deck(Card[] card){
		this.cards = card;
	}
	
	//pick a card 
	public Card draw(){	
		Card temp = this.cards[current];
		current++;
		
		return temp;
	}
	
	//gets the card array from this instance
	public Card[] getCards(){
		return this.cards;
	}
	
	//calculates how many cards are left in the deck
	public int remaining(){
		int cardsLeft = 52 - current;
		return cardsLeft;
	}
	
	//shuffles the deck 
	public void shuffle() {
		this.current = 0;
		Random r = new Random();
		
		for (int i = cards.length - 1; i > 0; i--){
		int index = r.nextInt(i);
		
		Card tmp = cards[index];
		cards[index] = cards[i];
		cards[i] = tmp;
		}
	}
	
	//print out the members of the cards array as strings
	public String toString(){
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < cards.length; i++){
			if (this.cards[i].getRankStrings().equals("Joker")||this.cards[i].getSuitStrings().equals("Joker")){
				sb.append("Joker\n");
			} else {
			sb.append(this.cards[i].getRankStrings() + " of " + this.cards[i].getSuitStrings() + "\n");
			}
		}
		
		return sb.toString();
	}

}
