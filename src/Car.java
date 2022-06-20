public class Car extends  Vehicle {
    public Car(String modelName, int wheelsCount) {
         super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Check engine oil, coolant and brake fluid levels on car.");
    }

    public void changeTyre() {
        System.out.println("Change 4 tyres on car.");
    }
}


