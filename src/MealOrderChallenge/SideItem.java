package MealOrderChallenge;

public class SideItem extends MealOrder {

    private String typeOfSideItem;
    private double costOfSideItem;

    public SideItem(String typeOfSideItem, double costOfSideItem) {
        this.typeOfSideItem = typeOfSideItem;
        this.costOfSideItem = costOfSideItem;
    }

    public SideItem() {
        super();
    }

    public String getTypeOfSideItem() {
        return typeOfSideItem;
    }

    public void setTypeOfSideItem(String typeOfSideItem) {
        this.typeOfSideItem = typeOfSideItem;
    }

    public double getCostOfSideItem() {
        return costOfSideItem;
    }

    public void setCostOfSideItem(double costOfSideItem) {
        this.costOfSideItem = costOfSideItem;
    }
}
