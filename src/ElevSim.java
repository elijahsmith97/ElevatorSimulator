package solution;
import java.util.Scanner; 

public class ElevSim {
    

    public static void main(String[] args) throws InterruptedException {

        int maxFloors = 10;
        Scanner kb = new Scanner(System.in);
        Elevator elev = new Elevator(maxFloors);
        PassengerManager passengerManager= new PassengerManager(elev);
        Controller control = new DefaultController(elev);
      
        System.out.println("Welcome to the Elevator Simulator.\n\nElevator is currently on: " + elev.getCurrentFloor());
        
        Passenger p1 = passengerManager.newPassenger();
        Passenger p2 = passengerManager.newPassenger();
        
        
        while(true)
        {
            passengerManager.next();
            control.next();
            System.out.println("\nPassenger 1 is on floor " + p1.getDestinationFloor());
            System.out.println("Passenger 2 is on floor " + p2.getDestinationFloor());
            
            System.out.println("\nElevator is currently on: " + elev.getCurrentFloor());
            
        }
   }
}
