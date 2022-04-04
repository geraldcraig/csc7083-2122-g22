package saveOurPlanetBelfastEdition;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlayerTest {
	
	//Test Data
	String validName;
	Marker marker;

	@BeforeEach
	void setUp() throws Exception {
		
		validName = "Lee Clark";
		marker = Marker.WINDMILL;
		
	}

	//Test case tests the instantiation of a player object
	@Test
	void testPlayerContructor() {
		Player Lee = new Player(validName, marker);
		assertEquals(validName, Lee.getPlayerName());
		assertEquals(marker.toString(), Lee.getMarker().toString());
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
