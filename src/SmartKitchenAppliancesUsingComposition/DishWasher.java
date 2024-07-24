package SmartKitchenAppliancesUsingComposition;

public class DishWasher {

    private boolean hasWorkToDo = false;

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
        if (hasWorkToDo == true){
            doDishes();
        }else
            System.out.println("Dishes is not being washed");
    }

    public void doDishes() {
        System.out.println("Dishes is being washed");
    }
}
