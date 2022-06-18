public class Main {
    private static final String[] BICYCLEMODELS = new String[]{"Kama", "Orlenok", "Sport"};
    private static final String[] CARMODELS = new String[]{"Lada Kalina", "Moskvich 412", "Zaporozhets 965"};
    private static final String[] TRUCKMODELS = new String[]{"KamAZ", "Ural", "GAZ-66"};
    private static final int[] TRUCKWHEELSNUMBER = new int[]{10,6,4};
    private static final Bicycle[] BICYCLE = new Bicycle[BICYCLEMODELS.length];
    private static final Car[] CAR = new Car[CARMODELS.length];
    private static final Truck[] TRUCK = new Truck[TRUCKMODELS.length];
    private static final ServiceStation BICYCLESERVICE = new ServiceStation.Bicycle();
    private static final ServiceStation CARSERVICE= new ServiceStation.Car();
    private static final ServiceStation TRUCKSERVICE= new ServiceStation.Truck();

    public static void vehiclesInitializing(){
        for (int i = 0; i < BICYCLEMODELS.length; i++) {
            BICYCLE[i] = new Bicycle(BICYCLEMODELS[i], 2);
            CAR[i] = new Car(CARMODELS[i],4);
            TRUCK[i] = new Truck(TRUCKMODELS[i],TRUCKWHEELSNUMBER[i]);
        }
    }

    public static void main(String[] args) {
        vehiclesInitializing();

        for (Bicycle bicycle : BICYCLE) {
            System.out.println(bicycle.getmodelName() + ", " + bicycle.getwheelsCount() + " wheels.");
            BICYCLESERVICE.changeTyre();
        }
        for (Car car : CAR) {
            System.out.println(car.getmodelName() + ", " + car.getwheelsCount() + " wheels.");
            CARSERVICE.checkEngine();
            CARSERVICE.changeTyre();
        }
        for (Truck truck : TRUCK) {
            System.out.println(truck.getmodelName() + ", " + truck.getwheelsCount() + " wheels.");
            TRUCKSERVICE.checkEngine();
            TRUCKSERVICE.changeTyre();
            TRUCKSERVICE.checkTrailer();
        }
    }
}