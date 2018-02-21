public class Card {
	
	//create private variables that store the rank & suit, and the array that stores the values of the 
	private int rank = 0;
	private char suit = 'J';
	private String[] rankStrings = {"Joker", "Ace", "Two", "Three", "Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
	
	//create public variables for each suit
	public final static char JOKER = 'J';
	public final static char HEARTS = 'H';
	public final static char CLUBS = 'C';
	public final static char DIAMONDS = 'D';
	public final static char SPADES = 'S';
	
	//no argument constructor
	public Card(){
		this.rank = 0;
		this.suit = JOKER;
	}
	
	//two argument constructor
	public Card(int rank, char suit){
		setRank(rank);
		setSuit(suit);
	}
	
	//create a method to return the string description of the card
	public String toString(){
		String s;
		if (this.rank==0||this.suit==JOKER){
			s = "Joker";
		} else {
			s = getRankStrings() + " of " + getSuitStrings();
		}
		return s;
	}
	
	
	/**
	 * method to return the current value stored in rank
	 */
	public int getRank() {
		return rank;
	}

	
	/**
	 *  method to set the value of rank
	 */
	public boolean setRank(int rank) {
		if (rank >= 0 && rank <= 13){
			this.rank = rank;
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 *  method to get the value stored in suit
	 */
	public char getSuit() {
		return suit;
	}
	
	
	/**
	 *  method to set the value in suit 
	 */
	public boolean setSuit(char suit) {
		if (suit==HEARTS||suit==DIAMONDS||suit==HEARTS||suit==CLUBS||suit==JOKER){
			this.suit = suit;
			return true;
		} else {
			return false;
		}
	}
	
	
	/**
	 * method to get the string associated with the rank
	 * 	i just used the array indices
	 */
	public String getRankStrings() {	
		return rankStrings[rank];
	}
	
	
	/**
	 * method to return the suit string when the letter is entered
	 */
	public String getSuitStrings() {
		if (suit == HEARTS){
			return "Hearts";
		} else if (suit == SPADES) {
			return "Spades";
		} else if (suit == DIAMONDS) {
			return "Diamonds";
		} else if (suit == CLUBS) {
			return "Clubs";
		} else {
			return "Joker";
		}
	}	
}
