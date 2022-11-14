package ttt;

import java.util.Scanner;

public class GameInitializer {

	static Scanner scanner = new Scanner(System.in);

	public static void startGame(Player playerOne, Player playerTwo) {

		boolean validator = false;

			System.out.println("Player one: Choose your name: \n");
			playerOne.setPlayerName(scanner.nextLine());

			System.out.println(playerOne.getPlayerName() + " choose your sign (for example: \"x\" or \"o\"): ");
			playerOne.setPlayerChar(scanner.next().charAt(0));
			scanner.nextLine();

			do {

				System.out.println("Player two: Choose your name: \n");
				playerTwo.setPlayerName(scanner.nextLine());

				if (playerTwo.getPlayerName().equals(playerOne.getPlayerName())) {

					System.out.println("Choose a different name than the player one!: ");

				} else validator = true;

			} while (!validator);

			do {

				System.out.println(playerTwo.getPlayerName() + " choose your sign (for example: \"x\" or \"o\"): ");
				playerTwo.setPlayerChar(scanner.next().charAt(0));
				scanner.nextLine();

				if (playerTwo.getPlayerChar() == (playerOne.getPlayerChar())) {

					System.out.println("Choose a different char than the player one!: ");
					validator = false;

				} else validator = true;

			} while (!validator);

		System.out.println("Player one: " + playerOne.getPlayerName() + " has chosen char: " + playerOne.getPlayerChar());
		System.out.println("Player two: " + playerTwo.getPlayerName() + " has chosen char: " + playerTwo.getPlayerChar());

		System.out.println(
				"""
      
						Let's start the game! Quick guide:
						The board has rows (A-C) and columns (1-3). To choose where you want to put in your sign,
						type a row letter and a column number, for example: "B2"
						
				""");

		Board board = new Board();

		board.setBoardName(playerOne, playerTwo);

		Gameplay game = new Gameplay();
		game.playTurn(playerOne, playerTwo, board);
	}
}
