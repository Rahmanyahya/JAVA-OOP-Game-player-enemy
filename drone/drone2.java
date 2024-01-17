package drone;

public class drone2 {
 public static void main(String[] args) {
   drone Drone = new drone();

   Drone.merek = "F MACHINA";
   Drone.energi = 100;
   Drone.ketinggian = 0;

   Drone.terbang();
   Drone.belokKanan();
   Drone.belokKiri();
   Drone.maju();
   Drone.mundur();
   Drone.turun();
   Drone.matikanMesin();
  

 }
}
