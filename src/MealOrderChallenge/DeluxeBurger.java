package MealOrderChallenge;

import java.util.Scanner;

public class DeluxeBurger extends MealOrder {

    private String deluxeBurger;
    private double costOfDeluxeBurgerMeal = 8.90;
    private String typeOfDrink;
    private String typeOfSideItem;
    private String typeOfToppings;
    private String sizeOfDrink;
//    private Burger burger;
//    private Drink drink= new Drink(); not required


    public DeluxeBurger() {
    }

    public String getDeluxeBurger() {
        return deluxeBurger;
    }

    public void setDeluxeBurger(String deluxeBurger) {
        this.deluxeBurger = deluxeBurger;
    }

    public double getCostOfDeluxeBurgerMeal() {
        return costOfDeluxeBurgerMeal;
    }

    public void setCostOfDeluxeBurgerMeal(double costOfDeluxeBurgerMeal) {
        this.costOfDeluxeBurgerMeal = costOfDeluxeBurgerMeal;
    }

    public String getTypeOfDrink() {
        return typeOfDrink;
    }

    public void setTypeOfDrink(String typeOfDrink) {
        this.typeOfDrink = typeOfDrink;
    }

    public String getTypeOfSideItem() {
        return typeOfSideItem;
    }

    public void setTypeOfSideItem(String typeOfSideItem) {
        this.typeOfSideItem = typeOfSideItem;
    }

    public String getTypeOfToppings() {
        return typeOfToppings;
    }

    public void setTypeOfToppings(String typeOfToppings) {
        this.typeOfToppings = typeOfToppings;
    }

    public String getSizeOfDrink() {
        return sizeOfDrink;
    }

    public void setSizeOfDrink(String sizeOfDrink) {
        this.sizeOfDrink = sizeOfDrink;
    }

    public void deluxeBurgerDrinkSelectionMenu() {
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
                    setTypeOfDrink("Coke");
                    selectDeluxeMealDrinkSize(getTypeOfDrink());
                    break;
                case 2:
                    setTypeOfDrink("Sprite");
                    selectDeluxeMealDrinkSize(getTypeOfDrink());
                    break;
                case 3:
                    setTypeOfDrink("Orange Juice");
                    selectDeluxeMealDrinkSize(getTypeOfDrink());
                    break;
                case 4:
                    setTypeOfDrink("Mineral Water");
                    selectDeluxeMealDrinkSize(getTypeOfDrink());
                    break;
                default:
                    System.out.println("Invalid drink selection");
                    continue;
            }
            break;
        }
    }

    public void selectDeluxeMealDrinkSize(String typeOfDrink) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select size of drink: ");
            System.out.println("1 -> Small ");
            System.out.println("2 -> Medium ");
            System.out.println("3 -> Large ");
            System.out.print("Enter size of drink: ");
            int chooseDrinkSize = scanner.nextInt();
            switch (chooseDrinkSize) {
                case 1:
                    setSizeOfDrink("Small");
                    costOfDeluxeBurgerMeal = 8.90;
                    break;
                case 2:

                    setSizeOfDrink("Medium");
                    costOfDeluxeBurgerMeal = costOfDeluxeBurgerMeal + 2.10;
                    break;
                case 3:
                    setSizeOfDrink("Large");
                    costOfDeluxeBurgerMeal = costOfDeluxeBurgerMeal + 2.80;
                    break;
                default:
                    System.out.println("Invalid drink size selection");
                    continue;
            }
            break;
        }


    }

    public void deluxeBurgerMeal() {
        addDeluxeBurgerToppings();
        deluxeBurgerDrinkSelectionMenu();
        selectDeluxeBurgerSideItem();
        System.out.println("Type of drink = " + getTypeOfDrink());
        System.out.println("Size of drink = " + getSizeOfDrink());
        System.out.println("Type of side item = " + getTypeOfSideItem());
        System.out.println("Total cost of Deluxe Burger meal with " + getTypeOfDrink() + " and side item " + getTypeOfSideItem() + " = $" + String.format("%.2f", getCostOfDeluxeBurgerMeal()));


    }

    public void selectDeluxeBurgerSideItem() {

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Side Item Menu");
            System.out.println("1 -> French Fries ");
            System.out.println("2 -> Apple Pie ");
            System.out.println("3 -> Ice-cream ");
            System.out.println("4 -> Coleshaw ");
            System.out.print("Enter selection for Side Item: ");
            int sideItemSelection = scanner.nextInt();
            switch (sideItemSelection){
                case 1:
                    setTypeOfSideItem("French Fries");
                    break;
                case 2:
                    setTypeOfSideItem("Apple Pie");
                    break;
                case 3:
                    setTypeOfSideItem("Ice-cream");
                    break;
                case 4:

                    setTypeOfSideItem("Coleshaw");
                    break;
                default:
                    System.out.println("Invalid Selection");
                    continue;
            }
            break;
        }
    }

    public void addDeluxeBurgerToppings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to add toppings?");
        System.out.println("Yes add topping -> 1");
        System.out.println("No -> 2");
        System.out.print("Enter selection to add toppings: ");
        int toppingSelection = scanner.nextInt();
        while (true) {
            switch (toppingSelection) {
                case 1:
                    int count = 0;
                    while (count < 5) {
                        System.out.println("Toppings menu");
                        System.out.println("1 -> Chill Sauce");
                        System.out.println("2 -> Mayonise Sauce");
                        System.out.println("3 -> Tartar Sauce");
                        System.out.println("4 -> Barbacue Sauce");
                        System.out.println("5 -> Soya Sauce");
                        System.out.print("Enter selection for toppings up to a maximun of 5 toppings: ");
                        int selectTopping = scanner.nextInt();
                        boolean validSelection = true;
                        switch (selectTopping) {
                            case 1:
                                setTypeOfToppings("Chill Sauce");
                                System.out.println("Added topping: " + getTypeOfToppings());
                                break;
                            case 2:
                                setTypeOfToppings("Mayonise Sauce");
                                System.out.println("Added topping: " + getTypeOfToppings());
                                break;
                            case 3:
                                setTypeOfToppings("Tartar Sauce");
                                System.out.println("Added topping: " + getTypeOfToppings());
                                break;
                            case 4:
                                setTypeOfToppings("Barbacue Sauce");
                                System.out.println("Added topping: " + getTypeOfToppings());
                                break;
                            case 5:
                                setTypeOfToppings("Soya Sauce");
                                System.out.println("Added topping: " + getTypeOfToppings());
                                break;
                            default:
                                System.out.println("Invalid selection for burger toppings:");
                                validSelection = false;
//                    continue;
                        }

                        if (validSelection) {
//                costOfTotalToppings = costOfTopping + costOfTotalToppings;
                            count = count + 1;

                            if (count == 5) {
                                break;
                            }

                            System.out.println("Would you like to add more toppings?");
                            System.out.println("Yes -> 1");
                            System.out.println("No -> 2");
                            System.out.print("Enter selection: ");
                            int continueAddTopping = scanner.nextInt();
                            if (continueAddTopping == 2) {
                                break;
                            } else if (continueAddTopping != 1) {
                                System.out.println("Invalid selection for adding more toppings.");
                            }

                        }

//        System.out.println("Total cost of toppings: " + costOfTotalToppings);

                    }
                    break;
                case 2:
                    System.out.println("No toppings to be added");
                    break;
                default:
                    System.out.println("Invalid selection");
                    continue;
//            break;
//        this.costOfToppings = costOfTotalToppings;  // Set the field to the total cost of toppings
            }

            break;
        }
    }
}