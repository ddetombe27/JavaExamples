//import java.util.*;
//
//public class TicTacToe {
//    public static HashSet<Integer> p1Squares = new HashSet<Integer>();
//    public static HashSet<Integer> p2Squares = new HashSet<Integer>();
//    public static HashSet<Integer> filledSquares = new HashSet<Integer>();
//
//    public static boolean checkWin() {
//        return false;
//    }
//
//    public static void reset() {
//        p1Squares.clear();
//        p2Squares.clear();
//        emptySquares.clear();
//        filledSquares.clear();
//        Collections.addAll(emptySquares, 1, 2, 3, 4, 5, 6, 7, 8, 9);
//    }
//
//    public static String getString(int square) {
//        if (p1Squares.contains(square)) {
//            return "X";
//        }
//        if (p2Squares.contains(square)) {
//            return "O";
//        }
//        return " ";
//
//    }
//
//    public static void playSquare(int square, int player) {
//            filledSquares.add(square);
//            if (player == 1) {
//                p1Squares.add(square);
//                return;
//            } else if (player == 2) {
//                p2Squares.add(square);
//                return;
//            }
//
//            System.out.println("Something went wrong...");
//
//        }
//    }
//
//    public static void printSquare() {
//
//    }
//
//    public static void main(String[] args){
//        System.out.println("Testing...");
//        reset();
//        //playSquare();
//    }
//}
