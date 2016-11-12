public class Card {
	
	//create private variables that store the rank & suit, and the array that stores the values of the 
	private int rank = 0;
	private char suit = 'J';
	private String[] rankStrings = {"Joker", "Ace", "Two", "Three", "Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
	
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
		if (suit=='H'||suit=='D'||suit=='S'||suit=='C'||suit=='J'){
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
		if (suit == 'H'){
			return "Hearts";
		} else if (suit == 'S') {
			return "Spades";
		} else if (suit == 'D') {
			return "Diamonds";
		} else if (suit == 'C') {
			return "Clubs";
		} else {
			return "Joker";
		}
	}	
}
