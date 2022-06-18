public class Car extends  Vehicle {
    public Car(String modelName, int wheelsCount){
        super(modelName, wheelsCount);

    }
    public String getmodelName(){
        return modelName;
    }
    public int getwheelsCount(){
        return  wheelsCount;
    }

}

