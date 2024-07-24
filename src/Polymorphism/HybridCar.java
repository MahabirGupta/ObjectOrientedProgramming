package Polymorphism;

public class HybridCar extends Car{

    private int batterySize;
    private double avgKmPerLitre;
    private int cylinders;



    public HybridCar(String description, int batterySize, double avgKmPerLitre, int cylinders) {
        super(description);
        this.batterySize = batterySize;
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public void totalCharges() {
        double totalCharge;
        double chargePerKm = 5.75;
        totalCharge = Math.round(avgKmPerLitre * chargePerKm);
        System.out.println("Total charges for " + getDescription() + " = $" + totalCharge);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println(getDescription() + " engine started");
        System.out.println("Hybrid -> " + cylinders + " cylinders are fired up" );
        System.out.println("BEV -> switch on " + batterySize + " kwh battery on");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println(getDescription() + " started driving");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println(getDescription() + " engine is running");
        System.out.println("Hybrid -> usage exceeds the " + avgKmPerLitre + " litres/km");
    }
}
