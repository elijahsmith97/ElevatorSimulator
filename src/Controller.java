import java.util.ArrayList;

public abstract class Controller
{
   protected ArrayList<Elevator> elevators;

   protected Controller(ArrayList<Elevator> elevators)
   {
      this.elevators = elevators;
   }

   public abstract void next();
}
