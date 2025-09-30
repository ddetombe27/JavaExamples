//import java.util.*;
//
//public class TicTacToe {
//    public static HashSet<Integer> p1Squares = new HashSet<Integer>();
//    public static HashSet<Integer> p2Squares = new HashSet<Integer>();
//    public static HashSet<Integer> emptySquares = new HashSet<Integer>();
//
//    public static boolean checkWin() {
//        return false;
//    }
//
//    public static void reset() {
//        p1Squares.clear();
//        p2Squares.clear();
//        emptySquares.clear();
//        Collections.addAll(emptySquares, 1, 2, 3, 4, 5, 6, 7, 8, 9);
//    }
//
//    public static void playSquare(int square, int player) {
//        if (emptySquares.contains(square)) {
//            emptySquares.remove(square);
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
//    public static void main(String[] args){
//        System.out.println("Testing...");
//        reset();
//        playSquare()
//    }
//}
