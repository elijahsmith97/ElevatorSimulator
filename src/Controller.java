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
  
   public Elevator[] getElevators()
   {
      return elevators;
   }

   /**
    * Author: Elijah Smith
    * accessor for boolean array pushedUp[]
    */
   public boolean[] getPushedUpArray() {
        return this.pushedUp;
   }

   /**
    * Author: Elijah Smith
    * accessor for boolean array pushedDown[]
    */ 
   public boolean[] getPushedDownArray() {
        return this.pushedDown;
   }
}
