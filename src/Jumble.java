import java.util.Scanner;

public class Jumble {
    public static void main(String[] args) {
        Scanner better_than_calc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String input = better_than_calc.nextLine();
        while (!input.equals("-")) {
            deJumble(input);
            System.out.println("Enter a word:");
            input = better_than_calc.nextLine();
        }
    }

    public static void deJumble6(String input) {
        int count = 0;
        int COL = 12   ;
        for (int h = 0; h < 6; h++) {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    for (int k = 0; k < 6; k++) {
                        for (int l = 0; l < 6; l++) {
                            for (int m = 0; m < 6; m++) {
                                if (h != i && h != j && h != k && h != l && h != m && i != j && i != k && i != l && i != m && j != k && j != l && j != m && k != l && k != m && l != m) {
                                    System.out.print(input.substring(h, h + 1) + input.substring(i, i + 1) + input.substring(j, j + 1) + input.substring(k, k + 1) + input.substring(l, l + 1) + input.substring(m, m + 1) + " ");
                                    if (count % COL == COL - 1) {
                                        System.out.println();
                                    }
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void deJumble5(String input) {
        int count = 0;
        int COL = 6;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    for (int l = 0; l < 5; l++) {
                        for (int m = 0; m < 5; m++) {
                            String combo = "" + i + j + k + l + m;
                            if (i != j && i != k && i != l && i != m && j != k && j != l && j != m && k != l && k != m && l != m) {
                                System.out.print(input.substring(i, i + 1) + input.substring(j, j + 1) + input.substring(k, k + 1) + input.substring(l, l + 1) + input.substring(m, m + 1) + " ");
                                if (count % COL == COL - 1) {
                                    System.out.println();
                                }
                                count++;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void deJumble(String input) {
        if (input.length() == 5) {
            deJumble5(input);
        }
        else if (input.length() == 6) {
            deJumble6(input);
        }
        else {
            System.out.println("I can not do that word length yet.");
        }
    }


}