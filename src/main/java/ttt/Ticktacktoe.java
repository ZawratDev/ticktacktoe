package ttt;

public class Ticktacktoe {

	public static void main(String[] args) {

		Player playerOne = new Player();
		Player playerTwo = new Player();

		try  {
			GameInitializer.startGame(playerOne, playerTwo);
		}
		catch (Exception e) {
			System.out.println("Something went wrong. Exiting...");
			System.exit(1);
		}
	}
}
