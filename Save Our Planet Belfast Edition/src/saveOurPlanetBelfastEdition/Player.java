package saveOurPlanetBelfastEdition;

public class Player {
	
	/**
	 * Only playerName is valid for now for testing as board is not currently 
	 * made so can't get index
	 */

	private String playerName;
	private Marker marker;
	//private int playerPosition = 0;

	//==================================================
	//==============::Player Constructor::==============
	//==================================================
	/**
	 *constructs player using playerName, marker and playerPosition
	 */
	public Player(String playerName, Marker marker) {

		this.playerName = playerName;
		this.marker = marker;
		//this.playerPosition = playerPosition;

	}

	//==================================================
	//================::Get Player Name::===============
	//==================================================
	/**
	 * returns playerName
	 */
	public String getPlayerName() {
		return playerName;
	}
	
	//==================================================
	//================::Get Player Marker::===============
	//==================================================
	/**
	 * returns playerName
	 */

	public Marker getMarker() {
		return marker;
	}

	//private int getPlayerPostion() {
	//return playerPosition;
	//}

	//==================================================
	//=================::Name ToString::================
	//==================================================
	/**
	 * basic toString to display playerName to the console
	 */
	@Override
	public String toString() {
		return playerName;
	}
}
