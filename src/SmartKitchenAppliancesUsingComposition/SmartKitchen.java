package SmartKitchenAppliancesUsingComposition;

public class SmartKitchen {

    public static void main(String[] args) {
        SmartKitchen smartKitchen = new SmartKitchen();
        smartKitchen.addWater();
        smartKitchen.pourMilk();
        smartKitchen.loadDishwasher();
        System.out.println();
        smartKitchen.getBrewMaster().brewCoffee();
        smartKitchen.getDishWasher().doDishes();
        smartKitchen.getIcebox().orderFood();
        System.out.println();
        smartKitchen.getIcebox().setHasWorkToDo(true);
        smartKitchen.getDishWasher().setHasWorkToDo(false);
        smartKitchen.getBrewMaster().setHasWorkToDo(true);
        System.out.println();
        smartKitchen.setKitchenState(true,false,true);
        System.out.println();
        smartKitchen.doKitchenWork();
    }

    private Refrigerator icebox;
    private DishWasher dishWasher;
    private CoffeeMaker brewMaster;

    public SmartKitchen() {
        // Initialize the appliances to avoid NullPointerException
        this.icebox = new Refrigerator();
        this.dishWasher = new DishWasher();
        this.brewMaster = new CoffeeMaker();
    }

    public Refrigerator getIcebox() {
        return icebox;
    }

    public void setIcebox(Refrigerator icebox) {
        this.icebox = icebox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void setDishWasher(DishWasher dishWasher) {
        this.dishWasher = dishWasher;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public void setBrewMaster(CoffeeMaker brewMaster) {
        this.brewMaster = brewMaster;
    }

    public void addWater(){
        // Setting the brewMaster's work to do flag
        brewMaster.setHasWorkToDo(true);
    }
    public void pourMilk(){
        // Setting the brewMaster's work to do flag
        icebox.setHasWorkToDo(true);
    }
    public void loadDishwasher() {
        dishWasher.setHasWorkToDo(true);
    }
    public void setKitchenState(boolean coffeeFlag,boolean fridgeFlag,boolean dishWasherFlag){
        brewMaster.setHasWorkToDo(coffeeFlag);
        icebox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        icebox.orderFood();
        dishWasher.doDishes();
    }
}
