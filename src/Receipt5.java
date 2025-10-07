//import java.util.Scanner;
//
//public class Receipt5 {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        Product product1 = new Product("Cheese Wheel", 39.99);
//        Product product2 = new Product("Milk Bottle", 1.79);
//        Product product3 = new Product("Yogurt", 3.49);
//
//        String fullLine = "**********************************";
//        String emptyLine = "*                                *";
//        int numProducts = 3; //set this when choosing what products to stock
//        String space = " ";
//        String dot = ".";
//
//        System.out.println(fullLine);
//        System.out.println("*   Thank you for shopping at    *");
//        System.out.println("*     Dave's Dairy Delights      *");
//        System.out.println(fullLine);
//
//        if (numProducts >= 1) {
//            System.out.println("*    " + product1.getName() + dot.repeat(15 - product1.getName().length()  + dot.repeat(5 - (Double.toString(product1.getCost())).length()) + Double.toString(product1.getCost())));
//        }
//
//    }
//
//}
//
//class Product {
//    private String name;
//    private double cost;
//    private int qty;
//
//    public Product(String n, double c) {
//        name = n;
//        cost = c;
//    }
//
//    public void setName(String n) {
//        name = n;
//    }
//
//    public void setCost(double c) {
//        cost = c;
//    }
//
//    public void setQuantity(int q) {
//        qty = q;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getCost() {
//        return cost;
//    }
//
//    public int getQuantity() {
//        return qty;
//    }
//}
