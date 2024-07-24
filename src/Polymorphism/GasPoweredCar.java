package Polymorphism;

public class GasPoweredCar extends Car{

    private double avgKmPerLitre;
    private int cylinders = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println(getDescription() + " drives at 120km/h");
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println(getDescription() + " has started engine");
        System.out.println("All " + cylinders + " cylinders are fired up! ");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println(getDescription() + " engine is running");
        System.out.println("Gas usage exceeds the " + avgKmPerLitre + " litres/km");
    }

    public void totalDistanceTravelled(){
        double totalDistanceTravelled = 0;
        double amountOfPetrolUsed = 6.8;
        totalDistanceTravelled = Math.round(this.avgKmPerLitre * amountOfPetrolUsed);
        System.out.println("Total distance travelled by " + getDescription() + " = " + totalDistanceTravelled +"km");
    }
}
