public class Bicycle extends Vehicle implements Service{
    public Bicycle (String modelName, int wheelsCount){
         super(modelName, wheelsCount);
    }
    public void changeTyre() {
        System.out.println("No need to change tyres on bicycle." );
    }
    @Override
    public void check(Bicycle bicycle) {
        System.out.println("Servicing of " + bicycle.getMODELNAME() + ":");
        bicycle.changeTyre();
    }

}


