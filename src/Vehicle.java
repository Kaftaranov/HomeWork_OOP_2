public class Vehicle {
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


}
