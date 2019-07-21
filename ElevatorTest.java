/**
 *
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class  ElevatorTest {
    /**
     * Author: ES
     * Test method for moveDown
     */
	@Test
	public void testEvaluateMoveDown() {
        	Elevator elevator = new Elevator(5, 1, 5);
        	elevator.moveDown();
        	int newCurrent = elevator.getCurrentFloor();
        	assertEquals(1, newCurrent);
    	}
    
    /*
    * Author: Erik Burr
    * Test method for moveUp
    */
	@Test
	public void testEvaluateMoveUp() {
		Elevator elev = new Elevator(1,5,5);
		elev.moveUp();
		int newCurrent = elev.getCurrentFloor();
		assertEquals(1, newCurrent);	
	}
	
    /*
    * Author: Erik Burr
    * Test method for floorDifference
    */
	@Test
	public void testEvaluateFloorDifference() {
		Elevator elev = new Elevator(1,5,5);
		elev.floorDiffference(3, 5);
		int newCurrent = elev.getCurrentFloor();
		assertEquals(2, newCurrent);	
	}
	
}
