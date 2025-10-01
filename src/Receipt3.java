/**
 * Receipt1.java  
 *
 * @author – David deTombe
 * @author – Class period
 */
public class Receipt3 {
    public static void main(String[] args) {

        String school = "Short Name";
        String whitespace = "                     *".substring(school.length());

        double costDrink = 1.50;
        double costCandy = 1.25;
        double costHotDog = 2.75;
        double costHamburger = 3.50;
        int orderNumber = (int) (Math.random() * 100) + 1;
        int numDrink = (int) (Math.random() * 3);
        int numCandy = (int) (Math.random() * 3);
        int numHotDog = (int) (Math.random() * 3);
        int numHamburger = (int) (Math.random() * 3);
        double subtotal = numDrink * costDrink + numCandy * costCandy + numHotDog * costHotDog + numHamburger * costHamburger;
        double taxRate = 0.13;
        double totalTax = subtotal * taxRate;
        double total = subtotal + totalTax;

        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*     " + school + " Snack Bar" + whitespace);
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
        System.out.println("*     " + numDrink + "       Drink        " + String.format("%.2f", costDrink * numDrink) + "      *");
        System.out.println("*     " + numCandy + "       Candy        " + String.format("%.2f", costCandy * numCandy) + "      *");
        System.out.println("*     " + numHotDog + "       Hot Dog      " + String.format("%.2f", costHotDog * numHotDog) + "      *");
        System.out.println("*     " + numHamburger + "       Hamburger    " + String.format("%.2f", costHamburger * numHamburger) + "      *");
        System.out.println("**************************************");
        if (subtotal < 10) {
            System.out.println("*     Subtotal: " + String.format("%.2f", subtotal) + "                 *");
        } else {
            System.out.println("*     Subtotal: " + String.format("%.2f", subtotal) + "                *");
        }
        System.out.println("*     Tax:      " + String.format("%.2f", totalTax) + "                 *");
        if (total < 10) {
            System.out.println("*     Total:    " + String.format("%.2f", total) + "                 *");
        } else {
            System.out.println("*     Total:    " + String.format("%.2f", total) + "                *");
        }
        System.out.println("**************************************");
    }
}