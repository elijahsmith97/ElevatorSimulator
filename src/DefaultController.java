import java.util.ArrayList;

public class DefaultController extends Controller
{
   private boolean movingUp;
   private boolean movingDown;
   
   public DefaultController(Elevator[] elevators)
   {
      super(elevators);

      this.movingUp = false;
      this.movingDown = false;
   }

   public void next()
   {
      int maxFloor = elevator.getNumberOfFloors();
      int currentFloor = elevator.getCurrentFloor();

      boolean[] destFloors = elevator.getDestinationFloor();
      boolean pushUpFloors[] = elevator.getPushedUp();
      boolean pushDownFloors[] = elevator.getPushedDown();
      boolean pushTrue = elevator.pushTrue();


      if(currentFloor == 1 || currentFloor == maxFloor)
      {
         movingUp = false;
         movingDown = false;
      }

      if(currentFloor == 1 && (destFloors.length > 0 || pushTrue))
      {
         movingUp = true;
      }
      else if (currentFloor == maxFloor && (destFloors.length > 0 || pushTrue))
      {
         movingDown = true;
      }

      if(destFloors[currentFloor])
      {
         elevator.stop();
      }
      else if(movingUp && pushUpFloors[currentFloor])
      {
         elevator.stop();
      }
      else if(movingDown && pushDownFloors[currentFloor])
      {
         elevator.stop();
      }

      if(movingUp)
      {
         elevator.moveUp();
      }
      else if(movingDown)
      {
         elevator.moveDown();
      }

   }
}
