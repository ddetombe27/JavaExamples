import java.util.*;

public class TicTacToe {
    public static HashSet<Integer> p1Squares = new HashSet<Integer>();
    public static HashSet<Integer> p2Squares = new HashSet<Integer>();
    public static HashSet<Integer> filledSquares = new HashSet<Integer>();
    public static HashSet<Integer> win1 = new HashSet<Integer>();
    public static HashSet<Integer> win2 = new HashSet<Integer>();
    public static HashSet<Integer> win3 = new HashSet<Integer>();
    public static HashSet<Integer> win4 = new HashSet<Integer>();
    public static HashSet<Integer> win5 = new HashSet<Integer>();
    public static HashSet<Integer> win6 = new HashSet<Integer>();
    public static HashSet<Integer> win7 = new HashSet<Integer>();
    public static HashSet<Integer> win8 = new HashSet<Integer>();
    public static HashMap<String, HashSet<Integer>> winConditions = new HashMap<>();
    public static int winner = 0;

    public static boolean checkWin() {
        return false;
    }

    public static void reset() {
        p1Squares.clear();
        p2Squares.clear();
        filledSquares.clear();

        win1.clear();
        win2.clear();
        win3.clear();
        win4.clear();
        win5.clear();
        win6.clear();
        win7.clear();
        win8.clear();
        winConditions.clear();

        win1.add(1);
        win1.add(2);
        win1.add(3);

        win2.add(4);
        win2.add(5);
        win2.add(6);

        win3.add(7);
        win3.add(8);
        win3.add(9);

        win4.add(1);
        win4.add(4);
        win4.add(7);

        win5.add(2);
        win5.add(5);
        win5.add(8);

        win6.add(3);
        win6.add(6);
        win6.add(9);

        win7.add(1);
        win7.add(5);
        win7.add(9);

        win8.add(3);
        win8.add(5);
        win8.add(7);

        winConditions.put("1", win1);
        winConditions.put("2", win2);
        winConditions.put("3", win3);
        winConditions.put("4", win4);
        winConditions.put("5", win5);
        winConditions.put("6", win6);
        winConditions.put("7", win7);
        winConditions.put("8", win8);
    }

    public static String getSquare(int square) {
        if (p1Squares.contains(square)) {
            return "X";
        }
        if (p2Squares.contains(square)) {
            return "O";
        }
        return String.valueOf(square);

    }

    public static void playSquare(int square, int player) {
        filledSquares.add(square);
        if (player == 1) {
            p1Squares.add(square);
            return;
        } else if (player == 2) {
            p2Squares.add(square);
            return;
        }

        System.out.println("Something went wrong...");

    }

    public static int winDetect() {
        for (int i = 1; i <= 8; i++) {  // only 8 win conditions
            HashSet<Integer> winSet = winConditions.get(String.valueOf(i));
            if (p1Squares.containsAll(winSet)) {
                return 1;
            } else if (p2Squares.containsAll(winSet)) {
                return 2;
            }
        }
        return 0;
    }


    public static void printBoard() {
        System.out.println(getSquare(1) + " | " + getSquare(2) + " | " + getSquare(3));
        System.out.println("—————————");
        System.out.println(getSquare(4) + " | " + getSquare(5) + " | " + getSquare(6));
        System.out.println("—————————");
        System.out.println(getSquare(7) + " | " + getSquare(8) + " | " + getSquare(9));
    }

    public static void gameplay() {
        Scanner scan = new Scanner(System.in);
        int play;
        int currentPlayer;
        reset();
        System.out.println("Welcome to Tic-Tac-Toe!\n");
        System.out.println("These are the positions on the board:");
        printBoard();

        for (int loop = 0; loop < 9; loop++) {
            currentPlayer = (loop % 2) + 1;
            System.out.println("Player " + currentPlayer + "'s turn: ");
            play = scan.nextInt();
            playSquare(play, currentPlayer);
            printBoard();
            winner = winDetect();
            if (winDetect() > 0) {
                break;
            }
        }

        System.out.println("Player " + winner + " wins!");
    }


    public static void main(String[] args) {
        gameplay();
    }
}

