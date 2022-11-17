package ttt;


public class Board {

	private String boardName;

	char[][] board = new char [3][3];

	public void setBoardName(Player playerOne, Player playerTwo) {
		this.boardName = "Tick Tack Toe\n" + playerOne.getPlayerName() + " vs " + playerTwo.getPlayerName();
	}
	public String getBoardName() {
		return boardName;
	}
	public char[][] getBoard() {
		return board;
	}

}
