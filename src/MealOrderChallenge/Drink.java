package MealOrderChallenge;

public class Drink extends MealOrder {

    private String typeOfDrink, sizeOfDrink;
    private double costOfDrink;

    public Drink() {
        super();
    }

    public Drink( String sizeOfDrink, double costOfDrink) {

        this.sizeOfDrink = sizeOfDrink;
        this.costOfDrink = costOfDrink;
    }

    public String getTypeOfDrink() {
        return typeOfDrink;
    }

    public void setTypeOfDrink(String typeOfDrink) {
        this.typeOfDrink = typeOfDrink;
    }

    public String getSizeOfDrink() {
        return sizeOfDrink;
    }

    public void setSizeOfDrink(String sizeOfDrink) {
        this.sizeOfDrink = sizeOfDrink;
    }

    public double getCostOfDrink() {
        return costOfDrink;
    }

    public void setCostOfDrink(double costOfDrink) {
        this.costOfDrink = costOfDrink;
    }
}
