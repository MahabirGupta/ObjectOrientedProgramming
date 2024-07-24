package Polymorphism;

public class ElectricCar extends Car{

    private double avgKmPerCharge;
    private int batterySize;



    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }



    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println(getDescription() + " engine started");
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
        System.out.println("BEV -> usage under the average:  " + avgKmPerCharge);
    }
    public void totalCharges(){
        double totalCharge;
        double chargePerKm = 9.65;
        totalCharge = Math.round(avgKmPerCharge * chargePerKm);
        System.out.println("Total charges for " + getDescription() + " = $" + totalCharge);
    }
}
