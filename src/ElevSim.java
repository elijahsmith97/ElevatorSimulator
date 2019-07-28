import java.util.Scanner; 

public class ElevSim {
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
        //Controller control = new Controller(elev);
        System.out.println("Welcome to our Elevator Simulation \n\n\n");
        
        while(Character.toLowerCase(decision) != 's') {
            time2.run();
            System.out.println("The elevator has arrived: \nFloor Level " + current + "\n\n");
            System.out.println("The doors are opening, please enter the elevator...");
            System.out.print("Which direction would you like to go? \n Please enter: \n u for up, \n d for down. \n\n");
            decision = kb.next().charAt(0);
            switch(Character.toLowerCase(decision)) {
                case 'u':
                System.out.println("\nGoing up to floor " + (current + 1));
                time.run();
                current++;
                    break;
                
                case 'd':
                    System.out.println("\nGoing down to floor " + (current - 1));
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
            while(Character.toLowerCase(decision2) != 'n' && decision != 's') {
                System.out.println("\nAre there new passengers? ");
                System.out.println(" Please enter: \n n for No, \n y for Yes \n");
                decision2 = kb.next().charAt(0);
                switch(Character.toLowerCase(decision2)) {
                    case 'y':
                        //passManager.newPassenger(//whatever this entails);
                        System.out.println("\nNew passenger added to list!\n");
                        break;
                    case 'n':
                        decision2 = 'n';
                        System.out.println("There are no new passengers, continuing simulation...\n\n"); 
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
