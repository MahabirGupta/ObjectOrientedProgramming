package MealOrderChallenge;

import java.util.Scanner;

public class MealOrder {

    private Burger selectionburger;
    private Drink drink;
    private SideItem sideItem;

    public static void main(String[] args) {

        MealOrder mealOrder = new MealOrder();
        mealOrder.orderDetails();

    }

    public void orderDetails() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Bill Restaurant");
        while (true) {
            System.out.print("Please select the following opions: \n1 for Regular Meal \n2 for Other Meals and \n3 to exit: ");
            System.out.print("\nEnter option: ");
            int chooseSelection = scanner.nextInt();
            switch (chooseSelection) {
                case 1:
                    Burger mealOrder = new Burger();
                    mealOrder.setTypeOfBurger("Regular Burger");
                    mealOrder.drink.setTypeOfDrink("Coke");
                    mealOrder.sideItem.setTypeOfSideItem("French fries");
                    System.out.println("You have chosen regular meal consisting of a " + mealOrder.getTypeOfBurger() + ", small " + mealOrder.drink.getTypeOfDrink() + " and small " + mealOrder.sideItem.getTypeOfSideItem());
                    mealOrder.setCostOfBurger(4.90);
                    double totalCostOfRegularMeal = mealOrder.getCostOfBurger();
                    System.out.println("Total cost of Regular Meal: $ " + String.format("%.2f", totalCostOfRegularMeal));
                    break;
                case 2:
                    burgerSelectionMenu();
                    break;
                case 3:
                    System.out.println("Thank you for visiting. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid selection");
                    System.out.print("Please select Option 1 for Regular Meal and 2 for Other Meals: ");
                    continue;
            }
            break;
        }
    }

    public void burgerSelectionMenu() {
        Scanner scanner = new Scanner(System.in);
        double totalCostOFOtherMealOrders = 0;
        while (true) {
            System.out.println("Bil Restaurant Menu");
            System.out.println("1 -> Ham burger -> $3.50");
            System.out.println("2 -> Chicken burger -> $4.80");
            System.out.println("3 -> Fish burger -> $3.20");
            System.out.println("4 -> Vegetarian burger -> $2.75");
            System.out.print("Enter choice of burger: ");
            int chooseBurgerSelection = scanner.nextInt();
//            Burger selectionburger; already declared as field
            switch (chooseBurgerSelection) {
                case 1:
                    selectionburger = new Burger("Ham burger", 3.50);
//                    add setters if you want to change the initialise value
//                    selectionburger.setTypeOfBurger("Cheese Burger");
//                    selectionburger.setCostOfBurger(3.90);
                    break;
                case 2:
                    selectionburger = new Burger("Chicken burger", 4.80);
//                    System.out.println("You have chosen " + selectionburger.getTypeOfBurger() + " and the cost is $" + String.format("%.2f", selectionburger.getCostOfBurger()));
//                    totalCostOFOtherMealOrders = selectionburger.getCostOfBurger();
                    break;
                case 3:
                    selectionburger = new Burger("Fish burger", 3.20);
//                    System.out.println("You have chosen " + selectionburger.getTypeOfBurger() + " and the cost is $" + String.format("%.2f", selectionburger.getCostOfBurger()));
//                    totalCostOFOtherMealOrders = selectionburger.getCostOfBurger();
                    break;
                case 4:
                    selectionburger = new Burger("Vegetarian burger", 2.75);
//                    System.out.println("You have chosen " + selectionburger.getTypeOfBurger() + " and the cost is $" + String.format("%.2f", selectionburger.getCostOfBurger()));
//                    totalCostOFOtherMealOrders = selectionburger.getCostOfBurger();
                    break;
                default:
                    System.out.println("Invalid burger selection");
//                    System.out.print("Enter choice of burger: ");
                    System.out.println();
                    continue;

            }
            break;
        }
        System.out.println("You have chosen " + selectionburger.getTypeOfBurger() + " and the cost is $" + String.format("%.2f", selectionburger.getCostOfBurger()));
        totalCostOFOtherMealOrders = selectionburger.getCostOfBurger();

        Burger selectionOfTopping = new Burger();
        double costOfTopping = 0;

        while (true) {
            System.out.println("Would you like to add toppings?");
            System.out.println("Yes add topping -> 1");
            System.out.println("No -> 2");
            System.out.print("Enter selection to add toppings: ");
            int toppingSelection = scanner.nextInt();
            switch (toppingSelection) {
                case 1:
                    costOfTopping = selectionOfTopping.addToppings();
                    totalCostOFOtherMealOrders = costOfTopping + totalCostOFOtherMealOrders;
                    String formattedCostOfTopping = String.format("%.2f", costOfTopping);
                    System.out.println("Total cost of toppings: $" + formattedCostOfTopping);
                    System.out.println("Total cost of " + selectionburger.getTypeOfBurger() + " with toppings = $" + String.format("%.2f", totalCostOFOtherMealOrders));
                    break;
                case 2:
                    costOfTopping = 0;
                    System.out.println("No toppings to be added");
                    System.out.println("Total cost of " + selectionburger.getTypeOfBurger() + " without toppings = $" + String.format("%.2f", totalCostOFOtherMealOrders));
                    break;
                default:
                    System.out.println("Invalid selection");
                    continue;
            }
            break;
        }


        double costOfDrink = drinkSelectionMenu();
        System.out.println("Cost of drink = $" + costOfDrink);
        System.out.println("Total cost of " + selectionburger.getTypeOfBurger() + " with toppings = $" + String.format("%.2f", totalCostOFOtherMealOrders));
        totalCostOFOtherMealOrders = costOfDrink + totalCostOFOtherMealOrders;
        System.out.println("Type of drink = " + drink.getTypeOfDrink());
        System.out.println("Total cost of " + selectionburger.getTypeOfBurger() + " meal with " + drink.getTypeOfDrink() + " drink = $" + String.format("%.2f",totalCostOFOtherMealOrders));

        double costOfSideItem = selectSideItem();
        System.out.println("Cost of side item= $" + String.format("%.2f",costOfSideItem));
        totalCostOFOtherMealOrders = costOfSideItem + totalCostOFOtherMealOrders;
        System.out.println("Side item = " + sideItem.getTypeOfSideItem());
        System.out.println("Total cost of meal with drink and side item = $" + String.format("%.2f",totalCostOFOtherMealOrders));
        System.out.println("Meal selected  \n" + selectionburger.getTypeOfBurger() + " $" + String.format("%.2f",selectionburger.getCostOfBurger()));
        System.out.println(drink.getTypeOfDrink() + " $" + String.format("%.2f",drink.getCostOfDrink() ));
        System.out.println(sideItem.getTypeOfSideItem() + " $" + String.format("%.2f",sideItem.getCostOfSideItem()));
        System.out.println( "Cost of Toppings: $"+ String.format("%.2f",selectionOfTopping.getCostOfToppings()));
        System.out.println("Total cost of " + selectionburger.getTypeOfBurger() + " meal with " + drink.getTypeOfDrink() + " drink and side item " + sideItem.getTypeOfSideItem() + " = $ "  + String.format("%.2f",totalCostOFOtherMealOrders));

    }

    public double drinkSelectionMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Drinks Menu");
            System.out.println("1 -> Coke");
            System.out.println("2 -> Sprite ");
            System.out.println("3 -> Orange Juice ");
            System.out.println("4 -> Mineral Water");
            System.out.print("Enter choice of drink: ");
            int chooseDrinkSelection = scanner.nextInt();
            switch (chooseDrinkSelection) {
                case 1:
//                    drink.setTypeOfDrink("Coke");
                    double costOfDrink =selectDrinkSize("Coke");
                    return costOfDrink;
//                    System.out.println("Drink type = " + drink.getTypeOfDrink());
//                    break;
                case 2:
                    costOfDrink =selectDrinkSize("Sprite");
                    return costOfDrink;
//                    break;
                case 3:
                    costOfDrink =selectDrinkSize("Orange Juice");
                    return costOfDrink;
//                    break;
                case 4:
                    costOfDrink =selectDrinkSize("Mineral Water");
                    return costOfDrink;
//                    break;
                default:
                    System.out.println("Invalid drink selection");
                    continue;
            }
//            break;
        }
    }

    public double selectDrinkSize(String drinkType) {
        Scanner scanner = new Scanner(System.in);
//        Drink drink = new Drink();
        while (true) {
            System.out.println("Select size of drink: ");
            System.out.println("1 -> Small -> $2.65");
            System.out.println("2 -> Medium -> $3.20");
            System.out.println("3 -> Large -> $3.95");
            System.out.print("Enter size of drink: ");
            int chooseDrinkSize = scanner.nextInt();
            switch (chooseDrinkSize){
                case 1:
                    drink = new Drink("Small",2.65);
                    //add setters if you want to change the initialise value
//                    drink.setSizeOfDrink("Small");
//                    drink.setCostOfDrink(2.65);
                    break;
                case 2:
                    drink = new Drink("Medium",3.20);
//                    drink.setSizeOfDrink("Medium");
//                    drink.setCostOfDrink(3.20);
                    break;
                case 3:
                    drink = new Drink("Large",3.95);
//                    drink.setSizeOfDrink("Large");
//                    drink.setCostOfDrink(3.95);
                    break;
                default:
                    System.out.println("Invalid drink size selection");
                    continue;
            }
            break;
        }
        drink.setTypeOfDrink(drinkType);
        System.out.println("Drink type: " + drink.getTypeOfDrink()+ "\nSize of drink is " + drink.getSizeOfDrink() + " and cost is $" + String.format("%.2f",drink.getCostOfDrink()));
        return drink.getCostOfDrink();


    }

    public double selectSideItem() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Side Item Menu");
            System.out.println("1 -> French Fries -> $2.20");
            System.out.println("2 -> Apple Pie -> $1.50");
            System.out.println("3 -> Ice-cream -> $2.45");
            System.out.println("4 -> Coleshaw -> $3.55");
            System.out.print("Enter selection for Side Item: ");
            int sideItemSelection = scanner.nextInt();
            switch (sideItemSelection){
                case 1:
                    sideItem = new SideItem("French Fries",2.20);
                    //add setters if you want to change the initialise value
//                    sideItem.setTypeOfSideItem("French Fries");
//                    sideItem.setCostOfSideItem(2.20);
                    return sideItem.getCostOfSideItem();
//                    break;
                case 2:
                    sideItem = new SideItem("Apple Pie",1.50);
//                    sideItem.setTypeOfSideItem("Apple Pie");
//                    sideItem.setCostOfSideItem(1.50);
                    return sideItem.getCostOfSideItem();
//                    break;
                case 3:
                    sideItem = new SideItem("Ice-cream",2.45);
//                    sideItem.setTypeOfSideItem("Ice-cream");
//                    sideItem.setCostOfSideItem(2.45);
                    return sideItem.getCostOfSideItem();
//                    break;
                case 4:
                    sideItem = new SideItem("Coleslaw",3.55);
//                    sideItem.setTypeOfSideItem("Coleshaw");
//                    sideItem.setCostOfSideItem(3.55);
                    return sideItem.getCostOfSideItem();
//                    break;
                default:
                    System.out.println("Invalid Selection");
                    continue;
            }
//            break;
        }
//        System.out.println("Side item selected: " + sideItem.getTypeOfSideItem() + " cost = $" + String.format("%.2f", sideItem.getCostOfSideItem()));
    }
}


