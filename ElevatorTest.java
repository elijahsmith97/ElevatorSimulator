/*
 * JUnit5 test for Evelator class in the move method
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
public class ElevatorTest {

	Elevator elev = new Elevator(1,5,5);

	@Test
	public void testEvaluate() {
		elev.move();
		int newCurrent = getCurrentFloor();
		assertEquals(1, newCurrent);	}

}
