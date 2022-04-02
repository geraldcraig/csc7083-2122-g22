package saveOurPlanetBelfastEdition;

public class Player {
	
	
	
	
	/**
	 * Only playerName is valid for now for testing as board is not currently 
	 * made so cant get index and im unsure of how to add an Enum to an object so cant add marker yet
	 */

	private String playerName = "";
	//private Marker marker = null;
	//private int playerPosition = 0;

	//==================================================
	//==============::Player Constructor::==============
	//==================================================
	/**
	 *constructs player using playerName, marker and playerPosition
	 */
	public Player(String playerName) {

		this.playerName = playerName;
		//this.marker = marker;
		//this.playerPosition = playerPosition;

	}

	//==================================================
	//================::Get Player Name::===============
	//==================================================
	/**
	 * returns playerName
	 */
	private String getPlayerName() {
		return playerName;
	}


	//==================================================
	//================::Set Player Name::===============
	//==================================================
	/**
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	//private Marker getMarker() {
	//return marker;
	//}

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
