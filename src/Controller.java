public abstract class Controller
{
   protected Elevator elevator;
   protected boolean[] pushedUp;
   protected boolean[] pushedDown;

   /**
    * Editor: Elijah Smith
    * initialized size of new pushed fields.
    */  
   protected Controller(Elevator elevator)
   {
      this.elevator = elevator;
      pushedUp = new boolean[elevator.getNumberOfFloors() + 1];
      pushedDown = new boolean[elevator.getNumberOfFloors() + 1];
   }

   public abstract void next();
   public abstract void pushUp(int currentFloor);
   public abstract void pushDown(int currentFloor);
   public abstract boolean pushTrue();
}
