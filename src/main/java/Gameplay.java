import java.util.Arrays;
import java.util.Scanner;

public class Gameplay {


	Scanner scanner = new Scanner(System.in);

	public void playTurn(Player playerOne, Player playerTwo, Board board) {

		System.out.println(board.getBoardName());
		;

//		System.out.println(playerOne.getPlayerName() + " - Please choose your socket! (for example: \"B2\"");
		System.out.println(playerOne.getPlayerName() + " - Please choose your row! (for example: 1/2/3): ");

		byte playerRow = scanner.nextByte();
		scanner.nextLine();

		System.out.println(playerOne.getPlayerName() + " - Please choose your column! (for example: 1/2/3): ");
		byte playerColumn = scanner.nextByte();
		scanner.nextLine();

		board.setMove(playerRow, playerColumn, playerOne.getPlayerChar());
		System.out.println(Arrays.deepToString(board.getBoard()));
	}
}
