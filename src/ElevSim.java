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
        int current = elev.getCurrentFloor();
        //Controller control = new Controller(elev);
        System.out.println("Welcome to our Elevator Simulation \n\n\n");
        
        
        while(Character.toLowerCase(decision) != 's') {
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            System.out.println("The elevator has arrived: \nFloor Level " + current + "\n\n");
            System.out.println("The doors are opening, please enter the elevator...");
            
            
            
            
            System.out.print("Which direction would you like to go? \n Please enter: \n u for up, \n d for down."/* + elev.setCurrentFloor()*/);
            System.out.println();
            System.out.println();
            System.out.println();
            
            
            
            decision = kb.next().charAt(0);
            switch(Character.toLowerCase(decision)) {
                case 'u':
                System.out.println("Going up to floor " + (current + 1));
                time.run();
                current++;
                    break;
                
                case 'd':
                    System.out.println("Going down to floor " + (current - 1));
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
                System.out.println("\nPlease enter: \nn for No, \ny for Yes \n\n\n");
                decision2 = kb.next().charAt(0);
                switch(Character.toLowerCase(decision2)) {
                    case 'y':
                        //passManager.newPassenger(//whatever this entails);
                        System.out.print("New passenger added to list!\n");
                        break;
                    case 'n':
                        decision2 = 'n';
                        System.out.print("There are no new passengers, continuing simulation...\n\n"); 
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
        }
    }
}
