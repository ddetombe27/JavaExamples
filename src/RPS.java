import java.util.Scanner;
import java.util.HashMap;

public class RPS {

    static boolean userWin;
    static boolean tie;
    static HashMap<Integer, String> key = new HashMap<>();
    static Scanner scan = new Scanner(System.in);

    public static int randomChoice() { //Computer randomly chooses what to play
        return (int) (Math.random() * 3) + 1;
    }

    public static int strategicChoice(int prevChoice, boolean wonPrev) {
        if (wonPrev) {
            return prevChoice;
        } else {
            return (prevChoice % 3) + 1;
        }
    }

    public static void playRound(int prevChoice, boolean wonPrev) {
        userWin = false;
        tie = false;
        System.out.print("Type 1 for rock, 2 for paper, and 3 for scissors: ");
        int userChoice = scan.nextInt();
        int compChoice = 0;

        if ((int) (Math.random() * 2) == 0) { // Computer chooses randomly or strategically.
            compChoice = strategicChoice(prevChoice, wonPrev);
        } else {
            compChoice = randomChoice();
        }

        if ((userChoice - compChoice + 3) % 3 == 1) {
            userWin = true;
        }

        if (userChoice == compChoice) {
            tie = true;
        }

        System.out.println("Computer chose " + key.get(compChoice) + ", You played " + key.get(userChoice));
        if (userWin && !tie) {
            System.out.println("Congratulations! You Won!");
        } else if (tie) {
            System.out.println("You tied.");
        } else if (!userWin && !tie) {
            System.out.println("Womp, Womp. You lost. D:");
        }
    }




    public static void main(String[] args) {
        key.put(1, "Rock");
        key.put(2, "Paper");
        key.put(3, "Scissors");

        while (true) {
            playRound(1, true);
            System.out.print("Play again? (y/n): ");
            String again = scan.next();
            if (!again.equalsIgnoreCase("y")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }
        scan.close();
    }
}

