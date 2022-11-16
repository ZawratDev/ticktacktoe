package ttt;

import java.util.Arrays;
import java.util.Scanner;

public class Move {

	Scanner scanner = new Scanner(System.in);

	public boolean setMove(byte row, byte column, char mark, char[][] board) {

		if (board[row][column] == 0) {
			board[row][column] = mark;
			return true;

		} else {
			System.out.println("\nThere is a sign already! Choose a different socket!");
			return false;
		}

	}

	public void makeLegalMove(Player player, Board board) {

		boolean legalMove;

		do {

			System.out.println(player.getPlayerName() + " - Please choose your row! (for example: 1/2/3): ");

			byte playerRow = scanner.nextByte();
			scanner.nextLine();


			System.out.println(player.getPlayerName() + " - Please choose your column! (for example: 1/2/3): ");

			byte playerColumn = scanner.nextByte();
			scanner.nextLine();

			legalMove = setMove(playerRow, playerColumn, player.getPlayerChar(), board.getBoard());

			System.out.println(Arrays.deepToString(board.getBoard()) + "\n");

		} while (!legalMove);
	}
}
