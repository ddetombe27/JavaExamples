import java.util.Scanner;

public class Main {
    public static int myRandom(int a, int b) {
        int range = b - a + 1;
        int offset = a;
        return (int) (Math.random() * range) + offset;
    }

    public static int mySmallRandom(int a, int b) {
        return myRandom(a + 1, b - 1);
    }

    public static double myRoundRandom(int a, int b) {
        return (double) myRandom(2 * a, 2 * b) / 2;
    }

    public static int userRandom() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in 2 integers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        return myRandom(a, b);
    }
    public static void main(String[] args) {
        System.out.println(userRandom());
    }
}