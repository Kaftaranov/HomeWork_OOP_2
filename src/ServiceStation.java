public class ServiceStation{

    public static void Service(Bicycle bicycle, Car car, Truck truck) {
        if (bicycle != null) {bicycle.check(bicycle);}
        else if (car != null) {car.check(car);}
        else if (truck != null) {truck.check(truck);}
    }

}
