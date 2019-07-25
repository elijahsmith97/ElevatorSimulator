/**
 * Author: Elijah Smith
 * version: Mon Jul 15, 2019
 * Issue #2
 */
import java.util.Scanner; 

public class ElevSim {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int elevCurrent = 1;
        int passDestination = 1;
        int passCurrent = 1;
        char decision = 'u';
        int floorDecision = 1;
        String stringDecision = "";
        int maxFloors = 100;
        
        Elevator elev = new Elevator(maxFloors);
        //Controller control = new Controller(elev);
        PassengerManager passManager = new PassengerManager(maxFloors);
        //
        System.out.println("Entering elevator simulation... Type \"s\" to exit at anytime.");
        
        while(Character.toLowerCase(decision) != 's') {
            System.out.print("Which floor are you currently on? ");
            passCurrent = kb.nextInt();

            //base cases for maxFloor level and lowest floor level(1)
            if(passCurrent == 1)
                decision = 'u';
            else if(passCurrent == maxFloors)
                decision = 'd';
            else {
                System.out.print("Which direction would you like to go? ");
                decision = kb.next().charAt(0);
            }
            
            switch(Character.toLowerCase(decision)) {
                //elevator going Up case
                case 'u':
                    System.out.print("Waiting on Elevator to go Up...\n");
                    elev.pushUp();
                    System.out.print("To which floor would you like to go up to? ");
                    floorDecision = kb.nextInt();
                    if(floorDecision > maxFloors || floorDecision <=  passCurrent)
                        decision = 's';
                    //elev.addDestinationFloor(floorDecision);
                    break;

                //elevator going Down case
                case 'd':
                     System.out.print("Waiting on elevator to go Down...\n");
                     elev.pushDown();
                     System.out.print("To which floor would you like to go down to? ");
                     floorDecision = kb.nextInt();
                     if(floorDecision > maxFloors || floorDecision >= passCurrent)
                        decision = 's';
                     //elev.addDestinationFloor(floorDecision);
                     break;
                
                default:
                     decision = 's';
                     System.out.print("Exiting simulation...\n");
                     break;
            }
           
            /* cycle for next passenger
            passManager.next();
            control.next();
            status.display();
            */

            /*if(display.getStatus() == 's')
                decision = "s";
            */

            char decision2 = 'y';
            while(Character.toLowerCase(decision2) != 'n' && decision != 's') {
                System.out.print("Are there new passengers? ");
                decision2 = kb.next().charAt(0);
                switch(Character.toLowerCase(decision2)) {
                    case 'y':
                        //passManager.newPassenger(//whatever this entails);
                        System.out.print("New passenger added to list!\n");
                        break;
                    case 'n':
                        decision2 = 'n';
                        System.out.print("There are no new passengers, continuing simulation...\n"); 
                        break;
                    case 's':
                        decision = 's';
                        System.out.print("Exiting simulation...\n");
                        break;
                    default:
                        decision2 = 'n';
                        break;
                }  
            }
           
            switch(decision) {
                case 'u':
                    System.out.print("Going up to floor " + floorDecision + "\n");
                    break;
                case 'd':
                    System.out.print("Going down to floor " + floorDecision + "\n");   
                    break;
                default:
                    decision = 's';
                    System.out.print("Exiting simulation...\n");
                    break;
            }
        }
    }
}
