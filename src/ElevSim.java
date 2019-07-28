import java.util.Scanner; 

/**
 * Author: Elijah Smith
 */ 
interface TimerClient {
    public void timerCallback();
}

public class ElevSim implements TimerClient {
    
    /**
     * Author: Elijah Smith
     * needed for Timer/TimerClient
     */ 
    boolean timerExpired = false;
    public  void timerCallback() {
        timerExpired = true;
    }
   
    public static void main(String[] args) throws InterruptedException {
        Scanner kb = new Scanner(System.in);
        int elevCurrent = 1;
        int passCurrent = 1;
        char decision = 'u';
        int maxFloors = 100;
        Elevator elev = new Elevator(maxFloors);
        Timer time = new Timer(3000);
        Timer time2 = new Timer(2000);
        int current = elev.getCurrentFloor();
        int passenger = 1;
        //Controller control = new Controller(elev);
        System.out.println("Welcome to our Elevator Simulation:\n  (Enter s to exit simulation) \n\n\n");
        time2.run();
        System.out.println("The doors are opening...\n");
        time2.run();
        System.out.println("Please enter the elevator:");
        time2.run();
 
        while(Character.toLowerCase(decision) != 's') {

            System.out.println("Which direction would you like to go? \n Please enter: \n u for up, \n d for down \n\n");
            decision = kb.next().charAt(0);
            
            switch(Character.toLowerCase(decision)) {
                case 'u':
                System.out.println("\nGoing up to floor " + (current + 1) + "\n");
                time.run();
                current++;
                    break;
                
                case 'd':
                    System.out.println("\nGoing down to floor " + (current - 1) + "\n");
                    time.run();
                    current--;   
                    break;
                
                default:
                    decision = 's';
                    System.out.println("Exiting simulation...");
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
            System.out.println("The elevator has arrived: \nFloor Level: " + current);
            System.out.println("____________________________\n\n");
            while(Character.toLowerCase(decision2) != 'n' && decision != 's') {
                System.out.println("\nAre there new passengers? \n\nNumber of Passengers: " + passenger);
                System.out.println(" Please enter: \n n for No, \n y for Yes, \n l to enter number of passengers that have left.\n");
                decision2 = kb.next().charAt(0);
                switch(Character.toLowerCase(decision2)) {
                    case 'y':
                        passenger++;
                        //passManager.newPassenger(//whatever this entails);
                        System.out.println("\nNew passenger added to list!");
                        break;
                    case 'n':
                        decision2 = 'n';
                        System.out.println("There are no new passengers, doors closing...\n\n"); 
                        break;
                    
                    case 'l':
                        decision2 = 'l';
                        int departing;
                        System.out.println("Enter number of passengers leaving:");
                        departing = kb.nextInt();
                        passenger -= departing;
                        System.out.println(departing + " passenger(s) have left, " + passenger + " passengers remain."); 
                        break;
                        
                    case 's':
                        decision = 's';
                        System.out.println("Exiting simulation...\n");
                        break;
                    default:
                        decision2 = 'n';
                        break;
                }
                
            }
        }
    }
}
