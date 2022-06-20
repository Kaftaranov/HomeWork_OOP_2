public class ServiceStation implements Service {

   @Override
   public void check(Bicycle bicycle) {
       System.out.println("Servicing of " + bicycle.getMODELNAME() + ":");
       bicycle.changeTyre();
   }
    @Override
    public void check(Car car){
        System.out.println("Servicing of " + car.getMODELNAME() + ":");
        car.changeTyre();
        car.checkEngine();
    }
    @Override
    public void check(Truck truck) {
            System.out.println("Servicing of " + truck.getMODELNAME() + ":");
            truck.changeTyre();
            truck.checkEngine();
            truck.checkTrailer();
   }

}
