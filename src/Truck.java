public class Truck extends Vehicle implements Serviceable {
    public Truck(String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }
private void changeTyre(){
    System.out.println("Change all " + getWHEELSCOUNT() + " tyres on truck " + getMODELNAME());
}
private void checkEngine(){
    System.out.println("Check engine oil and coolant levels on truck " + getMODELNAME()) ;
}
private void checkTrailer(){
    System.out.println("Check safety devices of trailer connected to " +getMODELNAME() );
}
    @Override
    public void check() {
    checkEngine();
    checkTrailer();
    changeTyre();
    }

    @Override
    public String getMODELNAME() {
        return super.getMODELNAME();
    }
}
