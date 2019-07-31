public abstract class Controller
{
   protected Elevator[] elevators;

   protected Controller(Elevator[] elevators)
   {
      this.elevators = elevators;
   }

   public abstract void next();
}
