import java.util.ArrayList;

public class Elevator {

    private int currentFloor;
    private int destinationFloor;
    private int numberOfFloors;
    boolean[] pushedUp;
    boolean[] pushedDown;    
    private boolean stopped;    
    
    /**
     * Author: Elijah Smith
     * Issue #18 Constructor
     */ 
    public Elevator(int currentFloor, int destinationFloor, int numberOfFloors) {
        this.currentFloor = currentFloor;
        this.destinationFloor = destinationFloor;
    	this.numberOfFloors = numberOfFloors;
   	boolean[] pushedUp = new boolean[numberOfFloors];
	boolean[] pushedDown = new boolean[numberOfFloors];
    }

    /**
     * Author: Elijah Smith
     * Issue #16 moveDown()
     */
    public void moveDown() {
        int decrementValue = this.currentFloor - this.destinationFloor;
        for(int i = 0; i < decrementValue; i++) {
            this.currentFloor--;
        }
    }
    
   /**
    * Author: Erik Burr
    * Issue #9 moveUp
    */
    public void moveUp(){
        int newCurrent = this.destinationFloor - this.currentFloor;
        for(int i = 0; i < newCurrent; i++) {
            this.currentFloor++;
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

      public boolean stop() {
        this.stopped = true;
      }

      public boolean getStopped() {
        return this.stopped;
      }

      public int getNumberOfFloors() {
        return this.numberOfFloors;
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


