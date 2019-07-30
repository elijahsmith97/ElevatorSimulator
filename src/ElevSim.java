import java.util.Scanner; 

public class ElevSim {
    

    public static void main(String[] args) throws InterruptedException {
        Scanner kb = new Scanner(System.in);
        int elevCurrent = 1;
        int passDestination = 1;
        int passCurrent = 1;
        char decision = 'u';
        int floorDecision = 1;
        String stringDecision = "";
        int maxFloors = 100;
      
        Elevator elev = new Elevator(maxFloors);
        PassengerManager passengerManager= new PassengerManager(elev);
        Controller control = new DefaultController(elev);
      
        System.out.println("Welcome to the Elevator Simulator.");
        
        Passenger p1 = passengerManager.newPassenger();
        Passenger p2 = passengerManager.newPassenger();
        
        while(true)
        {
            passengerManager.next();
            control.next();
            System.out.println("\nPassanger 1 is currently on " + p1.getStartFloor());
            System.out.println("Passanger 2 is currently on " + p2.getStartFloor());
            System.out.println("\nElevator is currently on " + elev.getCurrentFloor()); 
        }
   }
}

