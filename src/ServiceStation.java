public interface ServiceStation {

        default void check(Bicycle bicycle, Car car, Truck truck) {
        if (car != null) {
            System.out.println("Servicing of " + car.getModelName() + ":");
            car.changeTyre();
            car.checkEngine();
        } else if (truck != null) {
            System.out.println("Servicing of " + truck.getModelName() + ":");
            truck.changeTyre();
            truck.checkEngine();
            truck.checkTrailer();}
          else if (bicycle != null) {
            System.out.println("Servicing of " + bicycle.getModelName() + ":");
            bicycle.changeTyre();
            }
        }

}
