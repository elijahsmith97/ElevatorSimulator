import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Elevator {

    private int currentFloor;
    private boolean[] destinationFloors;
    private int numberOfFloors;
    private boolean stopped;

    /**
     * Author: Elijah Smith
     * Issue #61 new Constructor
     */ 
    public Elevator(int numberOfFloors) {
        this.currentFloor = 1;
        this.numberOfFloors = numberOfFloors;
        destinationFloors = new boolean[numberOfFloors+1];
   }
    /**
     * Author: Elijah Smith
     * Issue #18 Constructor
     */ 
    public Elevator(int currentFloor, int numberOfFloors) {
        this.currentFloor = currentFloor;
        this.numberOfFloors = numberOfFloors;
        destinationFloors = new boolean[numberOfFloors+1];
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
    
    public boolean hasDestFloor()
    {
        for(int loop = 0; loop < destinationFloors.length; loop++)
        {
            if(destinationFloors[loop])
               return true;
        }

        return false;
    }
    
      public int getCurrentFloor() {
        return this.currentFloor;
      }

      public void addDestinationFloor(int currentFloor) {
          destinationFloors[currentFloor] = true;
      }
  
      public boolean[] getDestinationFloor() {
        return this.destinationFloors;
      }
      
      public int getNumberOfFloors() {
        return this.numberOfFloors;
      }

      public void stop() {
        this.stopped = true;
        destinationFloors[currentFloor] = false;
        pushedUp[currentFloor] = false;
        pushedDown[currentFloor] = false;
      }

      public boolean getStopped() {
        return this.stopped;
      }

      public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
      }


      public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
      }
}
