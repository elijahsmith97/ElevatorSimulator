/*
*
* Author: Matthew Frankel
* Issue 56
* */

public class Display 
{
   static Elevator el = new Elevator(100);
   PassengerManager pm;
   Timer time = new Timer(3000);
   Timer time2 = new Timer(2000);

   public Display(PassengerManager pm, Elevator el) 
   {   
       this.pm = pm;
       this.el = el;
   }
   
   public void display()
   {
      start();
      goingUp();
      goingDown();
   }
   
   public void start()
   {
       System.out.println("Welcome to our Elevator Simulation:\n  (Enter Ctrl+C to exit simulation) \n\n\n");
       time2.run();
       System.out.println("The doors are opening...\n");
       time2.run();
   }
   
   public void goingUp()
   {
       System.out.println("\nGoing up to floor " + (el.getCurrentFloor() + 1) + "\n");
       time.run();
       System.out.print("\007");
       current++;
   }
   
   public void goingDown()
   {   
       System.out.println("\nGoing down to floor " + (el.getCurrentFloor() - 1) + "\n");
       time.run();
       System.out.print("\007");
       current--;
   }

   public void displayCurrentFloor()
   {
       System.out.println("Elevator is currently on floor " + el.getCurrentFloor();
   }
}
