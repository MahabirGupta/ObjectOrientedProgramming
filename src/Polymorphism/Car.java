package Polymorphism;

public class Car {

    public static void main(String[] args) {
        Car car = new Car("Red car");
        car.drive();
        car.startEngine();
        System.out.println();
        Car car1 = new GasPoweredCar("Gas Powered Car",28.9,6);
        runRace(car1);
        car1.drive();
        car1.startEngine();
        car1.runEngine();
        ((GasPoweredCar) car1).totalDistanceTravelled();
        System.out.println();
        System.out.println();
        Car car2 = new ElectricCar("2022 Red Tesla Model 3",568,75);
        runRace(car2);
        car2.drive();
        car2.startEngine();
        ((ElectricCar) car2).totalCharges();
        System.out.println();
        Car car3 = new HybridCar("2022 Black Ferarri SF90 Stradale",8,16,8);
        runRace(car3);
        car3.drive();
        car3.startEngine();
//        car2.totalDistanceTravelled();
        ((HybridCar) car3).totalCharges();
        System.out.println();
        runRace(car);
    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void startEngine(){
        System.out.println("Car Engine Started");
    }
    public void drive(){
        System.out.println("Car is driving at 90km/h. Type is " + getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine(){
        System.out.println("Car Engine is running ");
    }


}
