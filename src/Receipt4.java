/**
 * Receipt1.java  
 *
 * @author – David deTombe
 * @author – Class period
 */

import java.util.Scanner;

public class Receipt4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What school do you go to? (4 words)");
        String school = scan.nextLine();
        String schoolLast3 = school.substring(school.indexOf(" ") + 1);
        String schoolLast2 = schoolLast3.substring(schoolLast3.indexOf(" ") + 1);
        String schoolLast = schoolLast2.substring(schoolLast2.indexOf(" ") + 1);
        String schoolAcronym = school.substring(0, 1) + schoolLast3.substring(0, 1) + schoolLast2.substring(0, 1) + schoolLast.substring(0, 1);

        String whitespace = "                     *";
        String schoolWhitespace = whitespace.substring(schoolAcronym.length());

        double costDrink = 1.50;
        double costCandy = 1.25;
        double costHotDog = 2.75;
        double costHamburger = 3.30;
        int orderNumber = (int) (Math.random() * 100) + 1;

        System.out.println("Please buy no more than three of an item.");

        System.out.println("How many drinks would you like?");
        int numDrink = scan.nextInt();
        System.out.println("How many candies would you like?");
        int numCandy = scan.nextInt();
        System.out.println("How many hotdogs would you like?");
        int numHotDog = scan.nextInt();
        System.out.println("How many hamburgers would you like?");
        int numHamburger = scan.nextInt();

        scan.close();

        double subtotal = numDrink * costDrink + numCandy * costCandy + numHotDog * costHotDog + numHamburger * costHamburger;
        double taxRate = 0.13;
        double totalTax = subtotal * taxRate;
        double total = subtotal + totalTax;

        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*     " + schoolAcronym + " Snack Bar" + schoolWhitespace);
        System.out.println("*                                    *");
        System.out.println("*     Drink ..........." + String.format("%.2f", costDrink) + "€         *");
        System.out.println("*     Candy ..........." + String.format("%.2f", costCandy) + "€         *");
        System.out.println("*     Hot Dog ........." + String.format("%.2f", costHotDog) + "€         *");
        System.out.println("*     Hamburger ......." + String.format("%.2f", costHamburger) + "€         *");
        System.out.println("*                                    *");
        System.out.println("**************************************");
        if (orderNumber < 10) {
            System.out.println("*     Order Number: " + orderNumber + "                *");
        } else {
            System.out.println("*     Order Number: " + orderNumber + "               *");
        }
        System.out.println("*                                    *");
        System.out.println("*     QTY     ITEM         TOTAL     *");
        System.out.println("**************************************");
        System.out.println("*     " + numDrink + "       Drink        " + String.format("%.2f", costDrink * numDrink) + "€     *");
        System.out.println("*     " + numCandy + "       Candy        " + String.format("%.2f", costCandy * numCandy) + "€     *");
        System.out.println("*     " + numHotDog + "       Hot Dog      " + String.format("%.2f", costHotDog * numHotDog) + "€     *");
        System.out.println("*     " + numHamburger + "       Hamburger    " + String.format("%.2f", costHamburger * numHamburger) + "€     *");
        System.out.println("**************************************");
        if (subtotal < 10) {
            System.out.println("*     Subtotal: " + String.format("%.2f", subtotal) + "€                *");
        } else {
            System.out.println("*     Subtotal: " + String.format("%.2f", subtotal) + "€               *");
        }
        System.out.println("*     Tax:      " + String.format("%.2f", totalTax) + "€                *");
        if (total < 10) {
            System.out.println("*     Total:    " + String.format("%.2f", total) + "€                *");
        } else {
            System.out.println("*     Total:    " + String.format("%.2f", total) + "€               *");
        }
        System.out.println("**************************************");
    }
}