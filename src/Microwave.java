/**
 * @author David deTombe
 * @since 10/9/2025
 * @param String brand the brand of the microwave, int maxPower the maximum power of the microwave
 * @version 1.0
 */ 

public class Microwave {
    //attributes
    private String brand;
    private int maxPower;

    public Microwave (String manufacturer, int power) {
        brand = manufacturer;
        maxPower = power;
    }
    //behaviors
    public void spin(int numSpins) {
        for (int i = 1; i < (numSpins + 1); i ++) {
            System.out.println("Spinning...");
        }
    }

    public void beep() {
        System.out.println("Beep Beep");
    }

    public void isSpinning(boolean spinVal) {
        System.out.println("Is spinning: " + spinVal);
    }

    public void cook() {
        System.out.println("Cooking");
    }

    public void cook(int seconds, int power) {
        System.out.println("Cooking for " + seconds + " seconds at " + power + " power.");
        spin(seconds);
        beep();
    }

    public void cook30() {
        cook(30, maxPower);
    }


    public static void main (String[] args) {
        Microwave m = new Microwave("Casio", 1000);
        Microwave s = new Microwave("Samsung", 10);
        m.cook(3, 5);
    }


}