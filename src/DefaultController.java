import java.util.ArrayList;

public class DefaultController extends Controller
{
   private bool movingUp;
   private bool movingDown;
   
   public DefaultController(Elevator elevator)
   {
      super(elevator);

      this.movingUp = false;
      this.movingDown = false;
   }

   public void next()
   {
      int maxFloor = elevator.getNumberOfFloors();
      int currentFloor = elevator.getCurrentFloor();

      ArrayList<int> destFloors = elevator.//getDestFloors
      boolean pushUpFloors[] = elevator.//getPushUpFloors
      boolean pushDownFloors[] = elevator.//getPushDownFloors


      if(currentFloor == 0 || currentFloor == maxFloor)
      {
         movingUp = false;
         movingDown = false;
      }

      if(currentFloor == 0 && (destFloors.size() > 0 || elevator.//pushTrue))
      {
         movingUp = true;
      }
      else if (currentFloor == maxFloor && (destFloors.size() > 0 || elevator.//pushTrue))
      {
         movingDown = true;
      }

      if(destFloors.contains(currentFloor))
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
