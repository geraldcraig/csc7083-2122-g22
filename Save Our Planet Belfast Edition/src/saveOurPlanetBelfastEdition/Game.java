package saveOurPlanetBelfastEdition;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		validateNumPlayers();
		String numPlayers = "2";
		addPlayer(numPlayers);

	}

	//==================================================
	//===============::Add Player::=====================
	//==================================================
	/**
	 * asks for players name and adds them as a Player Object
	 * will repeat until players matches the number of players entered at the start of game 
	 */
	public static void addPlayer(String numPlayers) {

		Scanner sc = new Scanner(System.in);

		int players = 0;

		while (true) {
			if (players == Integer.parseInt(numPlayers)) {
				break;
			}

			System.out.println("Enter your name");
			String playerName = sc.nextLine();
			Player player = new Player(playerName);
			player.setPlayerName(playerName);
			players = players + 1;
		}

	}

	//==================================================
	//========::Validate Number of Players::============
	//==================================================
	/**
	 *asks user for the amount of players and validates the input
	 *will continue to ask player for num of players until it is within the satisfactory range of 2-4
	 */
	public static void validateNumPlayers() {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Please enter number of players, min 2... max 4...");
			String numPlayers = sc.nextLine();
			if (numPlayers == "") {
				System.out.println("Must enter a number between 2 and 4");
				flag = false;
			} else if ((Integer.parseInt(numPlayers) <= 1)) {
				System.out.println("Player limit too low, you must have at least 2 players to begin the game");
				flag = false;
			} else if ((Integer.parseInt(numPlayers) >= 5)) {
				System.out.println("Player limit too high, you can only have 4 players");
				flag = false;
			} else if ((Integer.parseInt(numPlayers) >= 2)) {
				flag = true;
				System.out.println("You have selected " + numPlayers + ".");
			}
		} while (!flag);

	}

}
