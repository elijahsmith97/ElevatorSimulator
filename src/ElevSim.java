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
        PassengerManager passman = new PassengerManager(elev);
        Display disp = new Display(passman,elev);
        Timer time = new Timer(3000);
        Timer time2 = new Timer(2000);
        int current = elev.getCurrentFloor();
        int passenger = 1;

        disp.start();
 
        while(Character.toLowerCase(decision) != 's') {
            System.out.println("Which direction would you like to go? \n Please enter: \n u for up, \n d for down \n\n");
            decision = kb.next().charAt(0);
            
            switch(Character.toLowerCase(decision)) {
                case 'u':  
                    decision = 'u';
                    disp.goingUp();
                    break;

                //elevator going Down case
                case 'd':
                    decision = 'd';
                    disp.goingDown(); 
                    break;
                
                default:
                    decision = 's';
                    disp.exit();
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
                        
                        
                    default:
                        decision2 = 's';
                        disp.exit();
                        break;
                }  
            }
           
             
    
}}}
