import static org.junit.Assert.*;
import org.junit.Test;

public class Tests
{
   /**
    * Author: Elijah Smith
    * 
    */
   @Test
   public void testMoveDown() {
        Elevator elevator = new Elevator(5, 1, 5);
        elevator.moveDown();
        int newCurrent = elevator.getCurrentFloor();
        assertEquals(1, newCurrent);      
   }
   
   /**
    * Author: Erik Burr
    *
    */
   @Test
   public void testMoveUp() {
        Elevator elev = new Elevator(1, 5, 5);
        elev.moveUp();
        int newCurrent = elev.getCurrentFloor();
        assertEquals(1, newCurrent);
   }

   
   /**
    * Author: Elijah Smith
    * 
    */
   @Test
   public void testCurrentFloor() {
        int currentFloor = 60;
        int destinationFloor = 420;
        int totalFloors = 600;
        Elevator elevator = new Elevator(currentFloor, destinationFloor, totalFloors);
   }

   @Test
   public void testPassengerConstructor1()
   {
      Passenger pass = new Passenger(3, 10);
 
      assertEquals(3, pass.getStartFloor());
      assertEquals(10, pass.getDestinationFloor());
   }

   @Test
   public void testPassengerConstructor2()
   {
      Passenger pass = new Passenger(50);

      assertEquals(1, pass.getStartFloor());
      assertEquals(50, pass.getDestinationFloor());
   }

   @Test
   public void testDefaultController1()
   {
      Elevator elev = new Elevator(1, 10);
      DefaultController control = new DefaultController(elev);

      elev.pushUp(5);
      control.next();

      assertEquals(2, elev.getCurrentFloor());
   }
}
