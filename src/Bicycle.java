public class Bicycle extends Vehicle implements Serviceable {
    public Bicycle (String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }
private void changeTyre(){
    System.out.println("No need to change tyres on bicycle " + getMODELNAME() );
}
    @Override
    public void check() {
       changeTyre();
    }
}


