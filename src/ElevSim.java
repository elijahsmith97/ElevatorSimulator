import java.util.Scanner; 

public class ElevSim 
{    
    
    public static void main(String[] args) 
    {
      
        Controller control = new DefaultController(10, 2);
        PassengerManager passengerManager = new PassengerManager(control); 
        Display disp = new Display(passengerManager, control);

        Passenger pass = new Passenger(control, 0);
        Passenger p1 = passengerManager.newPassenger();
        Passenger p2 = passengerManager.newPassenger();
        
        Elevator[] elevs = control.getElevators();
        
        while(true)
        {
            disp.display();
            disp.printPassenger(1, p1);
            disp.printPassenger(2, p2);
            disp.printElevator(1, elevs[0]);
            disp.printElevator(2, elevs[1]);     
            passengerManager.next();
            control.next(); 
        }
   }
}
