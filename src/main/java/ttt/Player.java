package ttt;

public class Player {

	private String playerName;
	private byte playerScore;
	private char playerChar;

	Player() {

		byte playerScore = 0;

	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerScore(byte point) {
		this.playerScore += point;
	}

	public byte getPlayerScore() {
		return playerScore;
	}


	public void setPlayerChar(char playerChar) {
		this.playerChar = playerChar;
	}

	public char getPlayerChar() {
		return playerChar;
	}
}
