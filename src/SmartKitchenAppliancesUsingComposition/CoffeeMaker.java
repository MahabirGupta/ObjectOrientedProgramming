package SmartKitchenAppliancesUsingComposition;

public class CoffeeMaker {

    private boolean hasWorkToDo = false;

    // Default constructor
    public CoffeeMaker() {
    }
    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
        if (hasWorkToDo == true){
            brewCoffee();
        }else
            System.out.println("Coffee Maker is not brewing coffee");
    }

    public void brewCoffee(){


            System.out.println("Coffee Maker is brewing coffee");


    }

}
