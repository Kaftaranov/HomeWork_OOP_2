public class Truck extends Vehicle  {
    public Truck(String modelName, int wheelsCount){
         super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Check engine oil and coolant levels on truck.");
    }
    public void changeTyre() {
        System.out.println("Change all " + getWHEELSCOUNT() + " tyres on truck! :((");
    }
    public void checkTrailer(){
        System.out.println("Check safety devices of connected trailer!");
    }

}
