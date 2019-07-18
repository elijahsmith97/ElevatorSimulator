/*
 * JUnit5 test for Evelator class in the move method
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
public class ElevatorTest {



	@Test
	public void testEvaluate() {
	Elevator elev = new Elevator(1,5,5);

		elev.moveUp();
		int newCurrent = elev.getCurrentFloor();
		assertEquals(1, newCurrent);	}
}
