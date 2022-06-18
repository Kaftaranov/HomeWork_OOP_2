public interface ServiceStation {
    void checkEngine();
    void changeTyre();

    void checkTrailer();

    class Car implements ServiceStation{
        @Override
        public void checkEngine() {
            System.out.println("Check engine oil, coolant and brake fluid levels on car.");
        }

        @Override
        public void changeTyre() {
            System.out.println("Change 4 tyres on car.");
        }

        @Override
        public void checkTrailer() {
            System.out.println("Make sure all lights are operative, cargo fixed and tent is tightened.");
        }
    }
    class Truck implements ServiceStation{
        @Override
        public void checkEngine() {
            System.out.println("Check engine oil and coolant levels on truck.");
        }
        @Override
        public void changeTyre() {
            System.out.println("Change all tyres on truck! :((");
        }
        public void checkTrailer(){
            System.out.println("Check safety devices of connected trailer!");
        }

    }
    class Bicycle implements ServiceStation{
        @Override
        public void checkEngine() {}
        @Override
        public void changeTyre() {
            System.out.println("No need to change tyres on bicycle." );
        }

        @Override
        public void checkTrailer() {

        }
    }

}
