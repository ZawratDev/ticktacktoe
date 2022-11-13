public class WinnerChecker {

	public byte winCheck(byte[][] board) {

		for (byte i = 0; i < 3; i++) {

			if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
				return board[i][0];
			}
		}

		for (byte j = 0; j < 3; j++) {

			if (board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
				return board[0][j];
			}
		}

		if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {

			return board[0][0];

		} else if (board[0][2] == board[1][1] && board[1][1] == board[2][0])

			return board[1][1];

		return 3;
	}
}

