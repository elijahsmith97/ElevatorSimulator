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
      
        Elevator[] elevators = new Elevator[2];
        Elevator elevator = Elevators[0];
        
        PassengerManager passengerManager= new PassengerManager(elev);
        Controller control = new DefaultController(elevators);
      
        System.out.println("Welcome to the Elevator Simulator.");
        
        Passenger p1 = passengerManager.newPassenger();
        Passenger p2 = passengerManager.newPassenger();
        
        while(true)
        {
            passengerManager.next();
            control.next();

            System.out.println(elev.getCurrentFloor());
        }
   }
}

