import java.util.Scanner;

public class RPS {
    public static int randomChoice() {
        return (int) (Math.random() * 3) + 3;
    }

    public static int strategicChoice(int prevChoice, boolean wonPrev) {
        return 1;
    }
    public static boolean runGame(int prevChoice, boolean wonPrev) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type 1 for rock, 2 for paper, and 3 for scissors");
        int userChoice = scan.nextInt();
        if ((int) (Math.random() * 2) == 0) {
            int compChoice = strategicChoice(prevChoice, wonPrev);

        }
        if ((int) (Math.random() * 2) == 1) {
            int compChoice = randomChoice();
            
        }
        
    }
}
