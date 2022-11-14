package ttt;

import java.util.Arrays;
import java.util.Scanner;

public class Gameplay {


	Scanner scanner = new Scanner(System.in);

	public void playTurn(Player playerOne, Player playerTwo, Board board) {

		boolean winner = false;

		System.out.println(board.getBoardName());

//		System.out.println(playerOne.getPlayerName() + " - Please choose your socket! (for example: \"B2\"");

		for (byte i = 1; i < 5; i++) {

			System.out.println(playerOne.getPlayerName() + " - Please choose your row! (for example: 1/2/3): ");

			byte playerRow = scanner.nextByte();
			scanner.nextLine();

			System.out.println(playerOne.getPlayerName() + " - Please choose your column! (for example: 1/2/3): ");
			byte playerColumn = scanner.nextByte();
			scanner.nextLine();

			board.setMove(playerRow, playerColumn, playerOne.getPlayerChar());
			System.out.println(Arrays.deepToString(board.getBoard()) + "\n");


			if (WinnerChecker.winCheck(board.getBoard()) != 0) {

				System.out.println(playerOne.getPlayerName() + " has won the game!");
				playerOne.setPlayerScore((byte) 1);
				winner = true;
				break;
			}

			System.out.println(playerTwo.getPlayerName() + " - Please choose your row! (for example: 1/2/3): ");

			playerRow = scanner.nextByte();
			scanner.nextLine();

			System.out.println(playerTwo.getPlayerName() + " - Please choose your column! (for example: 1/2/3): ");
			playerColumn = scanner.nextByte();
			scanner.nextLine();

			board.setMove(playerRow, playerColumn, playerTwo.getPlayerChar());
			System.out.println(Arrays.deepToString(board.getBoard()) + "\n");

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