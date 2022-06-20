import java.security.Provider;

public class Main {
    private static final String[] BICYCLEMODELS = new String[]{"Kama", "Orlenok", "Sport"};
    private static final String[] CARMODELS = new String[]{"Lada Kalina", "Moskvich 412", "Zaporozhets 965"};
    private static final String[] TRUCKMODELS = new String[]{"KamAZ", "Ural", "GAZ-66"};
    private static final int[] TRUCKWHEELSNUMBER = new int[]{10, 6, 4};
    private static final Bicycle[] BICYCLE = new Bicycle[BICYCLEMODELS.length];
    private static final Car[] CAR = new Car[CARMODELS.length];
    private static final Truck[] TRUCK = new Truck[TRUCKMODELS.length];

    public static void vehiclesInitializing() {
            for (int i = 0; i < BICYCLEMODELS.length; i++) {
                BICYCLE[i] = new Bicycle(BICYCLEMODELS[i], 2);
                CAR[i] = new Car(CARMODELS[i], 4);
                TRUCK[i] = new Truck(TRUCKMODELS[i], TRUCKWHEELSNUMBER[i]);
            }
        }
    private static void Service(Service serviceStation, Bicycle bicycle, Car car, Truck truck) {
        if (bicycle != null) {serviceStation.check(bicycle);}
        else if (car != null) {serviceStation.check(car);}
        else if (truck != null) {serviceStation.check(truck);}
    }

        public static void main(String[] args) {
            vehiclesInitializing();
            Service serviceStation = new ServiceStation();
            Service(serviceStation, null, null, TRUCK[0]);
        }

}
