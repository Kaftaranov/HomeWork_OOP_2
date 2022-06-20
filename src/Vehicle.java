public abstract class Vehicle implements Serviceable {
    private final String MODELNAME;
    private final int WHEELSCOUNT;

    Vehicle(String modelName, int wheelsCount) {
        this.MODELNAME = modelName;
        this.WHEELSCOUNT = wheelsCount;
    }
    String getMODELNAME() {
        return MODELNAME;
    }

    int getWHEELSCOUNT() {
        return WHEELSCOUNT;
    }


    @Override
    public void check() {

    }


}
