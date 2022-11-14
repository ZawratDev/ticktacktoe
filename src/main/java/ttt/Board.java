package ttt;

public class Board {

	private String boardName;

	char[][] board = new char [3][3];

	public void setBoardName(Player playerOne, Player playerTwo) {

		this.boardName = "Tick Tack Toe\n" + playerOne.getPlayerName() + " vs " + playerTwo.getPlayerName();

	}

	public boolean setMove(byte row, byte column, char mark) {

		if (board[row][column] == 0) {
			board[row][column] = mark;
			return true;

		} else {
			System.out.println("There is a sign already! Choose different socket!");
			return false;
		}

	}

	public String getBoardName() {
		return boardName;
	}

	public char[][] getBoard() {
		return board;
	}

}
