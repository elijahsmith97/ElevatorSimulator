import java.util.Scanner; 

public class ElevSim {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int elevCurrent = 1;
        int passCurrent = 1;
        char decision = 'u';
        int maxFloors = 100;
        Elevator elev = new Elevator(maxFloors);
        PassengerManager passengerManager= new PassengerManager(elev);
        Controller control = new DefaultController(elev);
      
        System.out.println("Welcome to the Elevator Simulator.");
        while(true)
        {
            passengerManager.next();
            controller.next();

            System.out.println(elev.getCurrentFloor());
        }
   }
}
