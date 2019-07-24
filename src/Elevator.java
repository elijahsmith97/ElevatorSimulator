import java.util.ArrayList;

public class Elevator {

    private int currentFloor;
    private int destinationFloor;
    private int numberOfFloors;
    ArrayList<Passenger> pushedUp = new ArrayList<Passenger>();
    ArrayList<Passenger> pushedDown = new ArrayList<Passenger>();
    Passenger pass = new Passenger(currentFloor); 

    
    
    /**
     * Author: Elijah Smith
     * Issue #18 Constructor
     */ 
    public Elevator(int currentFloor, int destinationFloor, int numberOfFloors) {
        this.currentFloor = currentFloor;
        this.destinationFloor = destinationFloor;
        this.numberOfFloors = numberOfFloors;
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
    public void pushUp(){
        pushedUp.add(pass);   
    }
	
    /**
    * Author: Erik Burr
    * Issue #17 pushUp/pushDown
    */           
    public void pushDown(){
        pushedDown.add(pass);
    }
    
    /**
     * Author: Elijah Smith
     * Issue #22 getter method
     */ 
    public int getCurrentFloor() {
        return this.currentFloor;
     }
        
     /**
      * Author: Erik Burr
      * Issue #9 moveUp
      */
     public int getDestinationFloor() {
      return this.destinationFloor;
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


