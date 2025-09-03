import java.util.Scanner;

public class Unicode {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        // System.out.println("Please type a number that you want the character for.");
        // int userInput = scan.nextInt();
        scan.close();

        // System.out.println("Your character is " + Character.toString(userInput));

        for (int i = 128512; i < 128592; i++) {
            System.out.print(Character.toString(i));
            if ((i + 9) % 10 == 0) {
                System.out.print("\n");
            }
        }

    }
}
