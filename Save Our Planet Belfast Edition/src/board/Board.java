package board;

import java.util.HashMap;
import java.util.Map;

public class Board {

	private Map<Integer, BoardLocation> boardLocations;

	/**
	 * Creates a Hash Map of boardLocations
	 */
	public Board() {
		this.boardLocations = new HashMap<>();
	}

	/**
	 * Prints error to console if location doesn't exist
	 * 
	 * @param index
	 * @return index
	 */
	public BoardLocation getLocation(int index) {
		if (!boardLocations.containsKey(index)) {
			System.out.println("Cannot access location with insex " + index + " on board!");
		}

		return boardLocations.get(index);
	}
	
	/**
	 * adds a location to the board
	 * @param location
	 */
	public void addLocation(BoardLocation location) {
		if (boardLocations.containsKey(location.getIndex())) {
			System.out.println("Cannot add location to index " + location.getIndex() + ", location already exists");
		}
		boardLocations.put(location.getIndex(), location);
	}
	
	/**
	 * returns the name of the location
	 * @param areaName
	 * @return location name
	 */
	public BoardLocation getLocationByName(String areaName) {
		for (BoardLocation location : boardLocations.values()) {
			//if hash map contains the areaName return it
			if (location.getAreaName().equalsIgnoreCase(areaName)) {
				return location;
			} 
		}
		//else return null
		return null;
		
	}

	@Override
	public String toString() {
		return "Board [boardLocations=" + boardLocations + "]";
	}

	//Method to print the name of the areas in the board and their relative position within the board
	public void printBoard() {
		
		for (Integer key : boardLocations.keySet()) {
			System.out.println("Board Position: "+key + ": " + "Board Position Name: "+boardLocations.get(key).getAreaName());
		}
	}

}
