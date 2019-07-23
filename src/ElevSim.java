/**
 * Author: Elijah Smith
 * version: Mon Jul 15, 2019
 * Issue #2
 */
import java.util.Scanner; 

public class ElevSim {
    public static void main(String[] args) {
         Scanner kb = new Scanner(System.in);
         System.out.println("Enter the desired floor: ");
         int df = kb.nextInt(); //df is desired floor

         //hard coded 5 as the numberOfFloor parameter because Im not quite sure how to handle that now
         Elevator elevator = new Elevator(elevator.getCurrentFloor(), df, 5);
    }
}
