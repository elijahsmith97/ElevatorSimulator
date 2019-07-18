/**
 *
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class  ElevatorTest {
    /**
     * Author: ES
     */ 
    @Test
    public void testEvaluate() {
        Elevator elevator = new Elevator(5, 1, 5);
        elevator.moveDown();
        int newCurrent = elevator.getCurrentFloor();
        assertEquals(1, newCurrent);
    }
    
    
    /*
    * Author: Erik Burr
    * Test method for move up
    */
    
	@Test
	public void testEvaluate() {
	    Elevator elev = new Elevator(1,5,5);
		elev.moveUp();
		int newCurrent = elev.getCurrentFloor();
		assertEquals(1, newCurrent);	}
}
