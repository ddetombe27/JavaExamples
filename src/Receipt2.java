/**
 * Receipt1.java  
 *
 * @author – David deTombe
 * @author – Class period
 */
public class Receipt2 {
    public static void main(String[] args) {

        String school = "Black Forest Academy";
        String whitespace = "                     ".substring(school.length());

        double costDrink = 1.50;
        double costCandy = 1.25;
        double costHotDog = 2.75;
        double costHamburger = 3.50;

        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*     " + school + " Snack Bar" + whitespace + "*");
        System.out.println("*                                    *");
        System.out.println("*     Drink ..........€" + String.format("%.2f", costDrink) + "          *");
        System.out.println("*     Candy ..........€" + String.format("%.2f", costCandy) + "          *");
        System.out.println("*     Hot Dog ........€" + String.format("%.2f", costHotDog) + "          *");
        System.out.println("*     Hamburger ......€" + String.format("%.2f", costHamburger) + "          *");
        System.out.println("*                                    *");
        System.out.println("**************************************");
    }
}