public class Elevator{

private int currentFloor;
private int destinationFloor;
private int numberOfFloors;
	    
	    /**
	     *      * Author: Elijah Smith
	     *           * Issue #18 Constructor
	     *                */ 
	public Elevator(int currentFloor, int destinationFloor, int numberOfFloors) {
		            this.currentFloor = currentFloor;
			    this.destinationFloor = destinationFloor;
		            this.numberOfFloors = numberOfFloors;
					        }


	public void moveUp(){
       		int newCurrent = this.currentFloor - this.destinationFloor;
		for(int i = 0; i < newCurrent; i++) {
			while(this.currentFloor != this.destinationFloor) {
			this.currentFloor--;}						   	 
}
		    /**
     * Author: Elijah Smith
     * Issue #22 getter method
     */ 
    public int getCurrentFloor() {
        return this.currentFloor;
    }
		
}
