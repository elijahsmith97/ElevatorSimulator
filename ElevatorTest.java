/**
 *
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class  ElevatorTest {
    /**
     * Author :
     */ 
    @Test
    public void testEvaluate() {
        Elevator elevator = new Elevator(5, 1, 5);
        elevator.moveDown();
        int newCurrent = elevator.getCurrentFloor();
        assertEquals(1, newCurrent);
    }


}
