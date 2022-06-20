public class Vehicle implements Service{
    private final String MODELNAME;
    private final int WHEELSCOUNT;

    public Vehicle(String modelName, int wheelsCount) {
        this.MODELNAME = modelName;
        this.WHEELSCOUNT = wheelsCount;
    }
    public String getMODELNAME() {
        return MODELNAME;
    }

    public int getWHEELSCOUNT() {
        return WHEELSCOUNT;
    }


    @Override
    public void check(Bicycle bicycle) {

    }

    @Override
    public void check(Car car) {

    }

    @Override
    public void check(Truck truck) {

    }
}
