package ch3Labs;

public class VendingMachine {
	private int tokenCount;
	private int canCount;
	
	public void fillUp(int cans) {
		canCount+=cans;
	}
	public void insertToken() {
		tokenCount++;
		canCount--;
	}
	
	public int getTokenCount() {
		return tokenCount;
	}
	public void setTokenCount(int tokenCount) {
		this.tokenCount = tokenCount;
	}
	public int getCanCount() {
		return canCount;
	}
	public void setCanCount(int canCount) {
		this.canCount = canCount;
	}

}
