import java.util.Scanner;

public class RPS {
    public static int randomChoice() { //Computer randomly chooses what to play
        return (int) (Math.random() * 3) + 3;
    }

    public static int strategicChoice(int prevChoice, boolean wonPrev) { //Computer plays based on previous round
        return 1;
    }
    public static boolean runGame(int prevChoice, boolean wonPrev) {
        boolean userWin = false;
        Scanner scan = new Scanner(System.in);
        System.out.print("Type 1 for rock, 2 for paper, and 3 for scissors");
        scan.close();
        int userChoice = scan.nextInt();

        if ((int) (Math.random() * 2) == 0) { //Computer chooses whether to play randomly or strategicly.
            int compChoice = strategicChoice(prevChoice, wonPrev);
        } else {
            int compChoice = randomChoice();
        }

        if ((compChoice - userChoice + 3) % 3 == 1) {

        }

        return userWin;

    }
        public static void main(String[] args){

        }
    }
}
