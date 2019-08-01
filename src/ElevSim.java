import java.util.Scanner; 

public class ElevSim {
    
    
    public static void main(String[] args) throws InterruptedException {
      
        Controller control = new DefaultController(10, 2);
        PassengerManager passengerManager = new PassengerManager(control); 
        Passenger pass = new Passenger(control, 0);
        
        Passenger p1 = passengerManager.newPassenger();
        Passenger p2 = passengerManager.newPassenger();
        
        
        while(true)
        {
            passengerManager.next();
            control.next(); 
        }
   }
}
