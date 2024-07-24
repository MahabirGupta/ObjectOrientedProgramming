package SmartKitchenAppliancesUsingComposition;

public class Refrigerator {

    private boolean hasWorkToDo = false;

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
        if (hasWorkToDo == true){
            orderFood();
        }else
            System.out.println("Food is not being ordered");
    }

    public void orderFood() {
        System.out.println("Food is being ordered");
    }
}
