/**
 * Author: Elijah Smith
 * version: Mon Jul 15, 2019
 * Issue #2
 */
import java.util.Scanner; 
import java.util.concurrent.TimeUnit;
public class ElevSim {
    public static void main(String[] args) {
        
        
        
        /*displaying current floor or pasenger and elevator
         status.display_currentP();
         status.display_currentE();
        
         System.out.println("Press 'W' for up or 'S' for down: ");
        */
        
        
        
        
         
         /*this isnt going to be used in this iteration of the project because there is only one trip the elevator will take
         Scanner button = new Scanner();
         elev.getCurrentFloor() = pass.getCurrentFloor();
        */
        
         /*Elevator has arrived
         elev.display_destE();//could cause trouble check with team about this method call
         */
        
         System.out.println("Elevator has arrived...");   
         Scanner kb = new Scanner(System.in);
         System.out.print("Enter the desired floor: ");
         int df = kb.nextInt(); //df is desired floor
         
         Passenger pass = new Passenger(df);
         Elevator elev = new Elevator(pass.getStartFloor(), pass.getDestinationFloor(), 100);
         Display status = new Display(pass, elev);
         
         //display floor passenger has picked
         status.display_selectP();
 
 
         /* This will all be useful in the next iteration including the controller.
         pass.setDestinationFloor(df);
         //ask team about following mutation of destination floor field for the elevator class
         elev.setDestinationFloor(df);

         if (df > elev.getCurrentFloor()) {
             elev.moveUp();
             pass.setCurrentfloor(elev.getCurrentFloor());
         }
         else if (df < elev.getCurrentFloor()) {
            elev.moveDown();
            pass.setCurrentFloor(elev.getCurrentFloor());
         }
         */


         //display elevator and passenger arriving at destination
         status.display_destE();
         status.display_destP();

    }
}
