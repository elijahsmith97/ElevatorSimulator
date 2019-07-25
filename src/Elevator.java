import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Elevator {

    private int currentFloor;
    private int destinationFloor;
    private int numberOfFloors;
    private boolean[] pushedUp;
    private boolean[] pushedDown;
    private boolean stopped;

    /**
     * Author: Elijah Smith
     * Issue #61 new Constructor
     */ 
    public Elevator(int numberOfFloors) {
        this.currentFloor = 1;
        pushedUp = new boolean[numberOfFloors + 1];
        pushedDown = new boolean[numberOfFloors + 1];
    }
    /**
     * Author: Elijah Smith
     * Issue #18 Constructor
     */ 
    public Elevator(int currentFloor, int destinationFloor, int numberOfFloors) {
        this.currentFloor = currentFloor;
        this.destinationFloor = destinationFloor;
        this.numberOfFloors = numberOfFloors;
        pushedUp = new boolean[numberOfFloors + 1];
        pushedDown = new boolean[numberOfFloors + 1];
    }

    /**
     * Author: Elijah Smith
     * Issue #57/51 moveDown()
     * @throws Exception 
     */
    public void moveDown() {
        currentFloor--;
        stopped = false;

        try {
            Thread.sleep(3000);
            System.out.println("Elevator going down...");
        } 
        
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
   /**
    * Author: Elijah Smith
    * Issue #57/51 moveUp
    */
    public void moveUp() {
        currentFloor++;
        stopped = false;
        try {
            Thread.sleep(3000);
            System.out.println("Elevator going up...");
        } 
        
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    /**
    * Author: Erik Burr
    * Issue #17 pushUp/pushDown
    */
    public void pushUp(int currentFloor){
        pushedUp[currentFloor] = true;   
    }
             
    public void pushDown(int currentFloor){
        pushedDown[currentFloor] = true;  
        stopped = false;        
    }
    
    /**
    * Author: Erik Burr
    * Issue #17 pushUp/pushDown
    */
    public void pushUp(int currentFloor){
        pushedUp[currentFloor] = true;   
    }
             
    public void pushDown(int currentFloor){
        pushedDown[currentFloor] = true;  
    }

    public boolean pushTrue()
    {
        for(int loop = 0; loop < pushedUp.length; loop++)
        {
            if(pushedUp[loop] || pushedDown[loop])
               return true;
        }

        return false;
    }
    
    /**
     * Author: Elijah Smith
     * Issue #22 getter method
     */ 
      public int getCurrentFloor() {
        return this.currentFloor;
      }
  
      public int getDestinationFloor() {
      return this.destinationFloor;
      }
      
      public int getNumberOfFloors() {
        return this.numberOfFloors;
      }

      public void stop() {
        this.stopped = true;
      }

      public boolean getStopped() {
        return this.stopped;
      }

      public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
      }

      public void setDestinationFloor(int destinationFloor) {
        this.destinationFloor = destinationFloor;
      }

      public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
      }
}
