package BillBurgerChallenge;

import java.util.Scanner;

public class MealOrder {

    private Burger selectionburger;

    private Burger burger;
    private Drink drink;
    private MealOrder mealOrder;
    private SideItem sideItem;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Bill Restaurant");
        System.out.print("Please select Option 1 for Regular Meal and 2 for Other Meals: ");

        while (true) {
            int chooseSelection = scanner.nextInt();
            switch (chooseSelection) {
                case 1:
                    MealOrder mealOrder = new MealOrder();
                    mealOrder.burger.setTypeOfBurger("Regular Burger");
                    mealOrder.drink.setTypeOfDrink("Coke");
                    mealOrder.sideItem.setTypeOfSideItem("French fries");
                    System.out.println("You have chosen regular meal consisting of a " + mealOrder.burger.getTypeOfBurger() + ", small " + mealOrder.drink.getTypeOfDrink() + " and small " + mealOrder.sideItem.getTypeOfSideItem());
                    double totalCostOfRegularMeal = mealOrder.burger.getCostOfBurger();
                    System.out.println("Total cost of Regular Meal: $ " + String.format("%.2f", totalCostOfRegularMeal));
                    break;
                case 2:
                    burgerSelectionMenu();
                    Burger burger = new Burger();
                    burger.getTypeOfBurger();
                    burger.getCostOfBurger();
                    System.out.println(burger.getTypeOfBurger() + " " + burger.getCostOfBurger());
                    break;
                default:
                    System.out.println("Invalid selection");
                    System.out.print("Please select Option 1 for Regular Meal and 2 for Other Meals: ");
                    continue;
            }
            break;
        }

    }

    public MealOrder() {
        this.burger = new Burger("Regular Meal", 6.90);

        this.drink = new Drink("Standard drink", 0);
        this.sideItem = new SideItem("Regular Fries", 0);
    }

    public static void burgerSelectionMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Bil Restaurant Menu");
            System.out.println("1 -> Ham burger -> $3.50");
            System.out.println("2 -> Chicken burger -> $4.20");
            System.out.println("3 -> Fish burger -> $3.20");
            System.out.println("4 -> Vegetarian burger -> $3.50");
            System.out.print("Enter choice of burger: ");
            int chooseBurgerSelection = scanner.nextInt();
            Burger selectionburger = new Burger();
            switch (chooseBurgerSelection) {
                case 1:
//                    Burger selectionburger = new Burger("Ham burger", 3.50);
                    selectionburger.setTypeOfBurger("Ham Burger");
                    selectionburger.setCostOfBurger(3.50);
                    System.out.println("You have chosen " + selectionburger.getTypeOfBurger() + " and the cost is $" + String.format("%.2f", selectionburger.getCostOfBurger()));
                    break;
                case 2:
                    selectionburger = new Burger("Chicken burger", 4.20);
                    System.out.println("You have chosen " + selectionburger.getTypeOfBurger() + " and the cost is $" + String.format("%.2f", selectionburger.getCostOfBurger()));
                    break;
                case 3:
                    selectionburger = new Burger("Fish burger", 3.20);
                    System.out.println("You have chosen " + selectionburger.getTypeOfBurger() + " and the cost is $" + String.format("%.2f", selectionburger.getCostOfBurger()));
                    break;
                case 4:
                    selectionburger = new Burger("Vegetarian burger", 3.50);
                    System.out.println("You have chosen " + selectionburger.getTypeOfBurger() + " and the cost is $" + String.format("%.2f", selectionburger.getCostOfBurger()));
                    break;
                default:
                    System.out.println("Invalid burger selection");
//                    System.out.print("Enter choice of burger: ");
                    System.out.println();
                    continue;

            }
            break;
        }
        Burger selectionOfTopping = new Burger();

        while (true) {
            System.out.println("Would you like to add toppings?");
            System.out.println("Yes add topping -> 1");
            System.out.println("No -> 2");
            System.out.print("Enter selection to add toppings: ");
            int toppingSelection = scanner.nextInt();
            switch (toppingSelection) {
                case 1:
                    double costOfTopping = selectionOfTopping.addToppings(1);
                    String formattedCostOfTopping = String.format("%.2f", costOfTopping);
                    System.out.println("Total cost of toppings: $" + formattedCostOfTopping);
                    break;
                case 2:
                    System.out.println("No toppings to be added");
                    break;
                default:
                    System.out.println("Invalid selection");
                    continue;
            }
            break;
        }

        drinkSelectionMenu();

    }

    private static void drinkSelectionMenu() {
        Scanner scanner = new Scanner(System.in);
        Drink drink = new Drink();
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
                    selectDrinkSize("Coke");
//                    System.out.println("Drink type = " + drink.getTypeOfDrink());
                    break;
                case 2:
                    selectDrinkSize("Sprite");
                    break;
                case 3:
                    selectDrinkSize("Orange Juice");
                    break;
                case 4:
                    selectDrinkSize("Mineral Water");
                    break;
                default:
                    System.out.println("Invalid drink selection");
                    continue;
            }
            break;
        }
    }

    private static void selectDrinkSize(String drinkType) {
        Scanner scanner = new Scanner(System.in);
        Drink drink = new Drink();
        while (true) {
            System.out.println("Select size of drink: ");
            System.out.println("1 -> Small -> $2.65");
            System.out.println("2 -> Medium -> $3.20");
            System.out.println("3 -> Large -> $3.95");
            System.out.print("Enter size of drink: ");
            int chooseDrinkSize = scanner.nextInt();
            switch (chooseDrinkSize){
                case 1:
                    drink.setSizeOfDrink("Small");
                    drink.setCostOfDrink(2.65);
                    break;
                case 2:
                    drink.setSizeOfDrink("Medium");
                    drink.setCostOfDrink(3.20);
                    break;
                case 3:
                    drink.setSizeOfDrink("Large");
                    drink.setCostOfDrink(3.95);
                    break;
                default:
                    System.out.println("Invalid drink size selection");
                    continue;
            }
            break;
        }
        drink.setTypeOfDrink(drinkType);
        System.out.println("Drink type: " + drink.getTypeOfDrink()+ "\nSize of drink is " + drink.getSizeOfDrink() + " and cost is $" + String.format("%.2f",drink.getCostOfDrink()));

        selectSideItem();
    }

    private static void selectSideItem() {
        Scanner scanner = new Scanner(System.in);
        SideItem sideItem = new SideItem();
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
                    sideItem.setTypeOfSideItem("French Fries");
                    sideItem.setCostOfSideItem(2.20);
                    break;
                case 2:
                    sideItem.setTypeOfSideItem("Apple Pie");
                    sideItem.setCostOfSideItem(1.50);
                    break;
                case 3:
                    sideItem.setTypeOfSideItem("Ice-cream");
                    sideItem.setCostOfSideItem(2.45);
                    break;
                case 4:
                    sideItem.setTypeOfSideItem("Coleshaw");
                    sideItem.setCostOfSideItem(3.55);
                    break;
                default:
                    System.out.println("Invalid Selection");
                    continue;
            }
            break;
        }
        System.out.println("Side item selected: " + sideItem.getTypeOfSideItem() + " cost = $" + String.format("%.2f", sideItem.getCostOfSideItem()));
    }
}