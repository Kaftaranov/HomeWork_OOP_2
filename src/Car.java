public class Car extends  Vehicle implements Service{
    public Car(String modelName, int wheelsCount) {
         super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Check engine oil, coolant and brake fluid levels on car.");
    }

    public void changeTyre() {
        System.out.println("Change 4 tyres on car.");
    }
    @Override
    public void check(Car car){
        System.out.println("Servicing of " + car.getMODELNAME() + ":");
        car.changeTyre();
        car.checkEngine();
    }
}


