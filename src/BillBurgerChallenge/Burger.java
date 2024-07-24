package BillBurgerChallenge;

import java.util.Scanner;

public class Burger {

    //    private String hamburger,chicken,fish, vegetarian, regular;
    private String typeOfBurger;
    private double costOfBurger;
    private boolean addTopping = false;
    private String toppingType;
    private double costOfTopping = 0;

    public Burger(boolean addTopping, String toppingType) {
        this.addTopping = addTopping;
        this.toppingType = toppingType;
    }

    public Burger(Burger burger) {
        super();
    }

    public Burger() {

    }

    public String getTypeOfBurger() {
        return typeOfBurger;
    }

    public double getCostOfBurger() {
        return costOfBurger;
    }

    public void setTypeOfBurger(String typeOfBurger) {
        this.typeOfBurger = typeOfBurger;
    }

    public void setCostOfBurger(double costOfBurger) {
        this.costOfBurger = costOfBurger;
    }

    public Burger(String typeOfBurger, double costOfBurger) {

        this.typeOfBurger = typeOfBurger;
        this.costOfBurger = costOfBurger;

    }

    public double addToppings(int toppingSelection) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double costOfTotalToppings = 0;
        while (count < 3) {
            System.out.println("Toppings menu");
            System.out.println("1 -> Chill Sauce -> $2.35");
            System.out.println("2 -> Mayonise Sauce -> $2.95");
            System.out.println("3 -> Tartar Sauce -> $3.45");
            System.out.print("Enter selection for toppings up to a maximun of- 3 toppings: ");
            int selectTopping = scanner.nextInt();

            double costOfTopping = 0;
            String toppingType = "";
            boolean validSelection = true;
            switch (selectTopping) {
                case 1:
                    toppingType = "Chilli Sauce";
                    costOfTopping = 2.35;
                    break;
                case 2:
                    toppingType = "Mayonise Sauce";
                    costOfTopping = 2.95;
                    break;
                case 3:
                    toppingType = "Tartar Sauce";
                    costOfTopping = 3.45;
                    break;
                default:
                    System.out.println("Invalid selection for burger toppings:");
                    validSelection = false;
//                    continue;
            }

            if (validSelection) {
                costOfTotalToppings = costOfTopping + costOfTotalToppings;
                count = count + 1;

                if (count == 3) {
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
        return costOfTotalToppings;
    }
}