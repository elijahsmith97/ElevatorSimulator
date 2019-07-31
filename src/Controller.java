public abstract class Controller
{
   protected Elevator[] elevators;
   protected boolean[] pushedUp;
   protected boolean[] pushedDown;
   
   /**
    * Editor: Elijah Smith
    * initialized size of new pushed fields.
    */  
   protected Controller(Elevator[] elevators)
   {
      this.elevators = elevators;
      pushedUp = new boolean[elevators[1].getNumberOfFloors() + 1];
      pushedDown = new boolean[elevators[1].getNumberOfFloors() + 1];
   }

   public abstract void next();
   public abstract void pushUp(int currentFloor);
   public abstract void pushDown(int currentFloor);
   public abstract boolean pushTrue();
}
