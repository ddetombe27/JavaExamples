import java.util.Scanner;

public class RPS {
    public static int randomChoice() { //Computer randomly chooses what to play
        return (int) (Math.random() * 3) + 3;
    }

    public static int strategicChoice(int prevChoice, boolean wonPrev) { //Computer plays based on previous round
        if (wonPrev) {
            return prevChoice;
        } else {
            return (prevChoice + 3) % 3;
        }
    }

    public static void playRound(int prevChoice, boolean wonPrev) {
        boolean userWin = false;
        boolean tie = false;
        Scanner scan = new Scanner(System.in);
        System.out.print("Type 1 for rock, 2 for paper, and 3 for scissors: ");
        int userChoice = scan.nextInt();
        scan.close();
        int compChoice = 0;

        if ((int) (Math.random() * 2) == 0) { //Computer chooses whether to play randomly or strategicly.
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

    }

    public static void runGame() {
        playRound(1, true);
        if (userWin && !tie) {
            System.out.println
        }
    }
    public static void main(String[] args){
        playRound(1, true);
    }
}

