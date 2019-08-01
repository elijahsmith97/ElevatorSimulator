
import java.util.ArrayList;

public class DefaultController extends Controller
{
   private boolean movingUp;
   private boolean movingDown;
   private Elevator elevator;
   
   public DefaultController(Elevator[] elevators)
   {
      super(elevators);
      
      elevator = elevators[0];

      this.movingUp = false;
      this.movingDown = false;
   }

   public void next()
   {
      int maxFloor = elevator.getNumberOfFloors();
      int currentFloor = elevator.getCurrentFloor();

      boolean[] destFloors = elevator.getDestinationFloor();

     // boolean pushUpFloors[] = elevator.getPushedUp();
     // boolean pushDownFloors[] = elevator.getPushedDown();
     // boolean pushTrue = elevator.pushTrue();

      int destFloorCount = elevator.hasDestFloors();

      if(currentFloor == 1 || currentFloor == maxFloor)
      {
         movingUp = false;
         movingDown = false;
      }


      if(currentFloor == 1 && (destFloorCount == 0 /*|| pushTrue*/))
      {
         movingUp = true;
      }
      else if (currentFloor == maxFloor && (destFloorCount == 0 /*|| pushTrue*/))
      {
         movingDown = true;
      }

      if(destFloors[currentFloor] || (movingUp /*&& pushUpFloors[currentFloor]*/) || (movingDown /*&& pushDownFloors[currentFloor]*/))
      {
         elevator.stop();
      }
      else if(movingUp)
      {
         elevator.moveUp();
      }
      else if(movingDown)
      {
         elevator.moveDown();
      }
   }
   
       /**
     * Editor: Elijah Smith
     * Issue #108 moving this method from Elevator
     */ 
    public void pushUp(int currentFloor) {
        pushedUp[currentFloor] = true;    
    }

    /**
     * Editor: Elijah Smith
     * Issue #108 moving this method from Elevator
     */ 
    public void pushDown(int currentFloor) {
        pushedDown[currentFloor] = true;
    }

    /**
     * Editor: Elijah Smith
     * Issue #108 moving this method from Elevator
     */ 
    public int pushTrue()
    {
        int counter = 0;
        for(int loop = 0; loop < pushedUp.length; loop++)
        {
            if(pushedUp[loop] || pushedDown[loop])
               counter++;
        }
        return counter;
    }
}
