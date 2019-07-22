public class Passenger
{
   private int startFloor;
   private int destinationFloor;

   public Passenger(int startFloor, int destinationFloor)
   {
      this.startFloor = startFloor;
      this.destinationFloor = destinationFloor;
   }

   public Passenger(int destinationFloor)
   {
      this.startFloor = 1;
      this.destinationFloor = destinationFloor;
   }

   public int getStartFloor()
   {
      return this.startFloor;
   }

   public int getDestinationFloor()
   {
      return this.destinationFloor;
   }

   public void setStartFloor(int startFloor) 
   {
      this.startFloor = startFloor;
   }

   public void setDestinationFloor(int destinationFloor)
   {
       this.destinationFloor = destinationFloor;
   }
}
