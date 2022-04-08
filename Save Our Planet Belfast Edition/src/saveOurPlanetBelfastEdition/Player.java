package saveOurPlanetBelfastEdition;

public class Player {
	
	
	
	
	
	private String playerName = "";
	private Marker marker = null;
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
	//================::Set Player Name::===============
	//==================================================
	/**
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

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
