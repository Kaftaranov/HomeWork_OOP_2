public class Bicycle extends Vehicle {
    public Bicycle (String modelName, int wheelsCount){
         super(modelName, wheelsCount);
    }
    public void changeTyre() {
        System.out.println("No need to change tyres on bicycle." );
    }

}


