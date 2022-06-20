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

        public static void main(String[] args) {
            vehiclesInitializing();
            ServiceStation.Service (BICYCLE[0],null,null);
            ServiceStation.Service (null, CAR[1],null);
            ServiceStation.Service (null, null, TRUCK[2]);
        }

}
