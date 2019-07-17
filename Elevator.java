public class Elevator {

    /**
     * Author: Erik Burr
     * Issue #5 move()
     */
    public void move()
    	{ System.out.println("Current floor: " + currentFloor);  
    	if (destinationFloor > currentFloor) {
      	moveUp(); 
    	}
    	else {
      	moveDown();
    	}
    }


}
