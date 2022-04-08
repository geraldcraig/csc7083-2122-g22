package saveOurPlanetBelfastEdition;

import java.util.ArrayList;
import java.util.Scanner;

import board.Board;
import board.BoardSetup;

public class Game {
	
	
	
	public static void main(String[] args) {
		
		Board board = BoardSetup.getNewBoard();
		
		System.out.println(board);

		
		/*
		 * ArrayList<Player> gamePlayers = new ArrayList<Player>();
		 * 
		 * validateNumPlayers(); String numPlayers = "2"; addPlayer(numPlayers);
		 */

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
			//Ask user to select a marker
			Marker marker = selectMarker();
			//LC. Commenting out for now as i'm adding the marker to the player constructor and it's broken the below code
			//Player player = new Player(playerName, marker);
			//players = players + 1;
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
	
	//Method to return an array game markers that are available for selection
	public static Marker[] getMarker() {

		return Marker.values();
		
	}
	
	//Method to ask user to select a marker and return it for selection
	//Will need to add validation to check whether a marker has been taken yet
	public static Marker selectMarker() {
		
		//Get list of markers that are currently available within the system
		Marker[] markers = getMarker();
		System.out.println("Please select a marker");
		for (Marker marker : markers) {
			System.out.println(marker);
		}
		
		//Ask user to select a marker
		Scanner sc = new Scanner(System.in);
		String markerSelection = sc.next();
		
		Marker markerToReturn = null;

		//Validation to confirm user selection
		//NEED TO ADD HANDLING FOR WHEN USER INPUT IS INCORRECT
		for (int i = 0; i < markers.length; i++) {

			if (markers[i].toString().equalsIgnoreCase(markerSelection)) {
			
				markerToReturn = markers[i]; 
				
			}
		}
		
		//NEED TO ADD CHECK TO SEE IF SELECTED MARKER IS ALREADY TAKEN
		
		return markerToReturn;
	}

}
