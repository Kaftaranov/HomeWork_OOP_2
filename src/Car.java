public class Car extends  Vehicle implements Serviceable {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    private void changeTyre(){
        System.out.println("Change " + getWHEELSCOUNT() + " tyres on car " + getMODELNAME());
    }
    private  void  checkengine(){
        System.out.println("Check engine oil, coolant and brake fluid levels on car " + getMODELNAME());
    }
    @Override
    public void check() {
       checkengine();
       changeTyre();
    }


}


