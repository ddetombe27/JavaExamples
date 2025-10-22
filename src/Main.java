import java.util.Scanner;

public class Main {
    public static boolean check3Kind(int a, int b, int c, int d, int e) {
        if (a == b && a == c || b == c && b == d || c == d && c == d) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean checkPair(int a, int b, int c, int d, int e) {
        if (a == b || b == c || c == d || d == e) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkStraight(int a, int b, int c, int d, int e) {
        if (e - d == 1 && d - c == 1 && c - b == 1 && (b - a == 1) || ( a == 10 && b == 11 && c == 12 && d == 13 && e == 1)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkFullHouse(int a, int b, int c, int d, int e) {
        if (a == b && a == c & d == e) {
            return true;
        } else if (a == b && c == d && c == e) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean check4Kind(int a, int b, int c, int d, int e) {
        if (a == b && a == c && a == d && a != e) {
            return true;
        } else if (b == e && b == c && b == d && b != a) {
            return true;
        } else {
            return false;
        }
    }

    public static String checkHand(int a, int b, int c, int d, int e) {
        if (check4Kind(a, b, c, d, e)) {
            return "You have a 4 of a kind.";
        } else if (checkFullHouse(a, b, c, d, e)) {
            return "You have a full house.";
        } else if (checkStraight(a, b, c, d, e)) {
            return "You have a straight.";
        } else if (check3Kind(a, b, c, d, e)) {
            return "You have a 3 of a kind.";
        } else if (checkPair(a, b, c, d, e)) {
            return "You have a pair.";
        } else
            return "Your hand sucks.";

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your poker hand in 5 seperate lines.\n(Sort low to high, Ace is high, Jack->11, Queen->12, King->13)");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        System.out.println(checkHand(a, b, c, d, e));
        scan.close();
    }
}