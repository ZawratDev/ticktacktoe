package ttt;


public class Gameplay {


	public void playTurn(Player playerOne, Player playerTwo, Board board) {

		Move move = new Move();

		boolean winner = false;

		System.out.println(board.getBoardName());


//		System.out.println(playerOne.getPlayerName() + " - Please choose your socket! (for example: \"B2\"");


		for (byte i = 1; i < 5; i++) {

			move.makeLegalMove(playerOne, board);


			if (WinnerChecker.winCheck(board.getBoard()) != 0) {

				System.out.println(playerOne.getPlayerName() + " has won the game!");
				playerOne.setPlayerScore((byte) 1);
				winner = true;
				break;
			}

			move.makeLegalMove(playerTwo, board);

			if (WinnerChecker.winCheck(board.getBoard()) != 0) {

				System.out.println(playerTwo.getPlayerName() + " has won the game!");
				playerTwo.setPlayerScore((byte) 1);
				winner = true;
				break;
			}

		}
		if (!winner) {
			System.out.println("There is NO winner!");
		}
	}
}