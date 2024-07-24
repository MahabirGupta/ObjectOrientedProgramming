package BillBurgerChallenge;

public class Drink  {

    private String typeOfDrink, sizeOfDrink;
    private double costOfDrink;

    public Drink() {
    }

    public Drink(String typeOfDrink, double costOfDrink) {
        this.typeOfDrink = typeOfDrink;
        this.costOfDrink = costOfDrink;
    }

    public Drink(String typeOfDrink, String sizeOfDrink) {
        this.typeOfDrink = typeOfDrink;
        this.sizeOfDrink = sizeOfDrink;
    }

    public Drink(String typeOfDrink, String sizeOfDrink, double costOfDrink) {
        this.typeOfDrink = typeOfDrink;
        this.sizeOfDrink = sizeOfDrink;
        this.costOfDrink = costOfDrink;
    }

    public String getSizeOfDrink() {
        return sizeOfDrink;
    }

    public String getTypeOfDrink() {
        return typeOfDrink;
    }

    public double getCostOfDrink() {
        return costOfDrink;
    }

    public void setTypeOfDrink(String typeOfDrink) {
        this.typeOfDrink = typeOfDrink;
    }

    public void setSizeOfDrink(String sizeOfDrink) {
        this.sizeOfDrink = sizeOfDrink;
    }

    public void setCostOfDrink(double costOfDrink) {
        this.costOfDrink = costOfDrink;
    }


}
