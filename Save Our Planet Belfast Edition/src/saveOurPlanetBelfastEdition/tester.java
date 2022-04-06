package saveOurPlanetBelfastEdition;

public class tester extends Game {

	public static void main(String[] args) {
		Game game = new Game();
		Marker[] markers = game.getMarker();
		int size = markers.length;
		for (int i = 0; i < markers.length; i++) {
			System.out.println(markers[i]);
		}
		//System.out.println(game.getMarker());
		//Marker marker = game.selectMarker();
		Marker mark = game.selectMarker();
		System.out.println("...........");
		System.out.println(mark.toString());

	}

}
