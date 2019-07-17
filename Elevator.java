public class Elevator {

    /**
     * Author: Erik Burr
     * Issue #9 moveUp()
     */
    public void moveUp(){
	    int newCurrent = this.currentFloor - this.destinationFloor;
	    for(int i = 0; i < newCurrent; i++) {
		   while(this.currentFloor != this.destinationFloor) {
			   this.currentFloor--;}
	    }
    }
