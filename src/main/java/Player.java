public class Player {

	private String playerName;
	private byte playerScore = 0;

	private char playerChar;


	public void setPlayerName(String playerName) {
		this.playerName = playerName;
		this.playerScore = 0;
	}

	public void setPlayerScore(byte point) {
		this.playerScore += point;
	}

	public byte getPlayerScore() {
		return this.playerScore;
	}

	public String getPlayerName() {
		return this.playerName;
	}

	public void setPlayerChar(char chosenChar) {
		this.playerChar = chosenChar;
	}

	public char getPlayerChar() {
		return this.playerChar;
	}
}
