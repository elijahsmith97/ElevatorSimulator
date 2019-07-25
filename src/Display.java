/*
 *
 * Author: Matthew Frankel
 * Issue 56
 * */

public class Display 
{
    Elevator el;
    PassengerManager pm;

    public Display(PassengerManager pm, Elevator el) 
    {   
        this.pm = pm;
        this.el = el;
    }
    
    public void start()
    {
        System.out.println("Starting simulation...");
        System.out.println("Press \"s\" to exit at any time);
    }
    
    public void goingUp()
    {
        System.out.println("Elevator going up...");                
    }
    
    public void goingDown()
    {
        System.out.println("Elevator going down...");                   
    }
     
    public void exit()
    {
        System.out.println("Exiting simulation...");                   
    }
                           
    public void displayCurrentFloor()
    {
        System.out.println("Elevator is currently on floor " + el.getCurrentFloor());
    }
}
