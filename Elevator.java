public class Elevator {
    /**
     * Author: Elijah Smith
     * Issue #9 moveUp() method
     */ 
    public void moveUp() {
        int newCurrent = this.destinationFloor - this.currentFloor;
        for(int i = 0; i < newCurrent; i++) {
            this.currentFloor++;
        }
    }
}
