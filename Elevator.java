/**
 * 
 */ 

public class Elevator {

    private int currentFloor;
    private int destinationFloor;
    private int numberOfFloors;
    
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
        while(this.currentFloor != this.destinationFloor) {
            this.currentFloor--;
        }
    }

    /**
     * Author: Elijah Smith
     * Issue #22 getter method
     */ 
    public int getCurrentFloor() {
        return this.currentFloor;
    }

}


