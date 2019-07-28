import static org.junit.Assert.*;
import org.junit.Test;

//brought in from TimerTest.java
interface TimerClient {
   public void timerCallBack();
}

public class Tests implements TimerClient
{
   /**
    * Author: Elijah Smith
    * 
    */
   @Test
   public void testMoveDown() {
        Elevator elevator = new Elevator(5, 5);
        elevator.moveDown();
        int newCurrent = elevator.getCurrentFloor();
        assertEquals(4, newCurrent);      
   }
   
   /**
    * Author: Erik Burr
    *
    */
   @Test
   public void testMoveUp() {
        Elevator elev = new Elevator(1, 5);
        elev.moveUp();
        int newCurrent = elev.getCurrentFloor();
        assertEquals(2, newCurrent);
   }
   
      /**
    * Author: Erik Burr
    *
    */
   @Test
   public void testPushUp() {
        Elevator elev = new Elevator(1, 5);   
        int newCurrent = elev.getCurrentFloor();
        elev.pushUp(newCurrent);
        assertEquals(1, newCurrent);   
   }

   /**
    * Author: Erik Burr
    *
    */
   @Test
   public void testPushDown() {
        Elevator elev = new Elevator(1, 5);   
        int newCurrent = elev.getCurrentFloor();
        elev.pushDown(newCurrent);
        assertEquals(1, newCurrent);  
   }
   
    //simple values needed for TimerTest 
    double numSeconds = 4.5;
    double pollDelay = 0.25;
    int numPolls = 0; 
    int numExpectedPolls = (int)(numSeconds / pollDelay) - 1; // last poll will work!
    boolean timerExpired = false;
    boolean state = false;
    //method needed for TimerTest
    public void timerCallback() {
        timerExpired = true;
    }   
    
    /**
     * Author: Elijah Smith
     */ 
    public void runPollTest() {
            pollDelay *= 1000;
            System.out.println("Testing using poll method:");
            System.out.println("\tTest will sleep for " 
                        + pollDelay + "ms then poll timer to see if expired.");
            System.out.println("\tEach poll will print a dot.");

            System.out.println("\tCreating " + numSeconds + " second timer...");        
            Timer t = new Timer((int)(numSeconds*1000));

            System.out.println("\tStarting timer...");
            System.out.print("\t");
            t.start();

            while(true)
            {
                try
                {
                    Thread.sleep((int)pollDelay);
                    
                }
                catch(Exception e)
                {
                }

                if(!t.expired())
                {
                    numPolls++;
                    System.out.print(".");
                }
                else
                {
                    break;
                }
            }
            System.out.println();
            System.out.println("\tNumber of polls was " + numPolls);    
            System.out.println("\tNumber of expected polls was " + numExpectedPolls);   
            if (numExpectedPolls == numPolls) {
                System.out.println("Poll Test PASSED!");
                assertEquals(numExpectedPolls, numPolls);
            }
            else if (numExpectedPolls-1 <= numPolls && numPolls <= numExpectedPolls+1) { 
                System.out.println("Poll Test PASSED! (small timing variance between threads is allowed)");
                state = true; 
                assertTrue(state);
            }
            else {   
                System.out.println("Poll Test FAILED!");
                assertTrue(state);
            }
        }
    
    /**
     * Author: Elijah Smith
     * test brought from TimerTest.java
     */ 
    @Test
    public void runInterruptTest() {
            numPolls = 0;
            System.out.println("Testing using interrupt method:");
            System.out.println("\tTest will sleep for " 
                        + pollDelay + "ms and then awake and print a dot.");
            System.out.println("\tWhen timer expires it will interrupt causing sleeping to stop.");

            System.out.println("\tCreating " + numSeconds + " second timer...");        
            Timer t = new Timer((int)(numSeconds*1000), this); // pass object with callback method

            System.out.println("\tStarting timer...");
            System.out.print("\t");
            t.start();

            while(! timerExpired)
            {
                try
                {
                   Thread.sleep((int)pollDelay);
                    
                }
                catch(Exception e)
                {
                }

                numPolls++;
                System.out.print(".");
            }
            System.out.println();
            System.out.println("\tNumber of sleeps was " + numPolls);   
            System.out.println("\tNumber of expected sleeps was " + numExpectedPolls);  
       
            if (numExpectedPolls == numPolls) {
                System.out.println("Interrupt Test PASSED!");
                assertEquals(numExpectedPolls, numPolls);
            }
            else if (numExpectedPolls-1 <= numPolls && numPolls <= numExpectedPolls+1) {
                System.out.println("Interrupt Test PASSED! (small timing variance between threads is allowed)"); 
                state = true;
                assertTrue(state);
            }
            else { 
                state = false;
                System.out.println("Interrupt Test FAILED!");
                assertTrue(state);   
            }
    }
     
   /**
    * Author: Elijah Smith
    * 
    */
   @Test
   public void testCurrentFloor() {
        int currentFloor = 60;
        int totalFloors = 600;
        Elevator elevator = new Elevator(currentFloor, totalFloors);

        assertEquals(60, elevator.getCurrentFloor());
   }

    @Test
    public void testElevatorConstructor1() {
        Elevator elev = new Elevator(100);

        assertEquals(1, elev.getCurrentFloor());
        assertEquals(100, elev.getNumberOfFloors());
    }

    /**
     * Author: Elijah Smith
     */ 
    @Test
    public void testElevatorConstructor2() {
        Elevator elev = new Elevator(2, 100);

        assertEquals(2, elev.getCurrentFloor());
        assertEquals(100, elev.getNumberOfFloors());
    }
    /**
     *this is a comment
      */
   @Test
   public void testPushTrue1()
   {
      Elevator elev = new Elevator(1, 10);

      assertEquals(false, elev.pushTrue());
   }

   @Test 
   public void testPushTrue2()
   {
      Elevator elev = new Elevator(1, 10);
      elev.pushUp(4);

      assertEquals(true, elev.pushTrue());

   }

   @Test
   public void testPassengerNext1()
   {
      Elevator elev = new Elevator(1, 10);
      Passenger pass = new Passenger(elev, 7);

      pass.next();

      assertEquals(true, elev.pushTrue());      
   }

    public void testGetPushedUpArray() {
        Elevator elev = new Elevator(100);
        elev.pushUp(3);
        elev.pushDown(4);
        
        boolean[] goingUp = elev.getPushedUpArray();
        boolean[] goingDown = elev.getPushedDownArray();

        boolean up = goingUp[3];
        boolean down = goingDown[4];
    
        assertEquals(true, up);
        assertEquals(true, down);
    }
   
   /**
    * Author: Elijah Smith
      
    */  
   @Test
   public void testPassengerConstructor1()
   {
        
   }

   @Test
   public void testPassengerConstructor2()
   {

   }
}
