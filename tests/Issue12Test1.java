import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Issue12Test1
{
   @Test
   public void testPassengerConstructor1()
   {
      Passenger pass = new Passenger(3, 10);
      
      assertEquals(3, pass.getStartFloor());
      assertEquals(10, pass.getDestinatonFloor());
   }

   @Test
   public void testPassengerConstructor2()
   {
      Passenger pass = new Passenger(50);

      assertEquals(1, pass.getStartFloor());
      assertEquals(50, pass.getDestinationFloor());
   }
}
