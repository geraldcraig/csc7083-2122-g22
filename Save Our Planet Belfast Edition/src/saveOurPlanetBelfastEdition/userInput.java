package saveOurPlanetBelfastEdition;

import java.util.Scanner;

public class userInput {

	Scanner userInput ;

	public userInput() {
		
		this.userInput = new Scanner(System.in);
	}
	
	//PERHAPS HANDLE USER ENTERING AN INT WHEN WE EXPECT A STRING AND HANDLE, I.E. LOOP UNTIL EXPECTED DATA TYPE IS ENTERED
	public String contintuePlaying() {
		
		String response = userInput.next();
		
		return response;
	}
	
	public String getPlayerName() {
		
		String response = userInput.next();
		
		return response;
	
	}
}
