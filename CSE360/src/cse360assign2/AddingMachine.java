package cse360assign2;

public class AddingMachine {

	private int total;
	private String history;
	
	/**
	 * 
	 * Constructors
	 * total is initialized as 0.
	 */
	public AddingMachine () {
		total = 0;  
		history = "0";
	}
	
	/**
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * @param value add value with total and store in total
	 */
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
	
	/**
	 * @param value subtract value from total
	 */
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	
	/**
	 * @see java.lang.Object#toString()
	 * @return the history of transactions
	 */
	public String toString () {
		return history;
	}
	
	/**
	 * Reset history and total.
	 */
	public void clear() {
		total =0;
		history ="0";
	}
}
