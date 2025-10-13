//import java.util.Scanner;
//
//public class Main
//{
//    private static Scanner scan = new Scanner(System.in);
//
//    public static void main(String[] args)
//    {
//        // TODO #1. Change the adventure text below, especially the ?'s.
//        // Be creative!
//        System.out.println("You are on an island surrounded by water.");
//        System.out.println("There is a path to the forest to the north, "
//                + "the sea to the south.");
//        System.out.println("Which way do you want to go (n,s)?");
//        String command = scan.next(); // use nextLine() in your own IDE
//        if (command.equals("n"))
//        {
//            System.out.println("You go north.");
//            forest();
//        } else if (command.equals("s")) {
//            System.out.println("You walk south");
//            cave();
//        }
//        // TODO #2: Add else-ifs for command equals s, e, or w,
//        // calling a method you will write below for each location.
//        // Add an else error message "You can't go in that direction!"
//        // Change the input below the coding area to test these.
//
//
//
//
//        System.out.println("End of adventure!");
//        scan.close();
//    }
//
//    // TODO #3: Complete this method
//    // north from main goes to the forest
//    public static void forest()
//    {
//        System.out.println("You enter a dark forest and see ?");
//        System.out.println("Do you want to walk e or w?");
//
//        // Add more if/else-if statements for the next action
//        //  and call your other methods to move to other locations
//        String command = scan.next(); // use nextLine() in your own IDE
//        if (command.equals("e"))
//        {
//            System.out.println("You move east and reach the sea");
//            sea();
//        } else if (command.equals("w")) {
//            System.out.println("You walk west");
//            cave();
//        }
//    }
//
//    // TODO #4: Complete this method
//    // south from main or east from forest goes to the sea
//    // (feel free to rename to another location of your choice)
//    public static void sea()
//    {
//        System.out.println("You see the beach before you");
//        System.out.println("Do you want to walk n or e or s");
//        String command = scan.next(); // use nextLine() in your own IDE
//        if (command.equals("e"))
//        {
//            System.out.println("You drown");
//        } else if (command.equals("n")) {
//            System.out.println("You trip over some driftwood and die");
//        } else if (command.equals("s")) {
//            System.out.println("You walk into a crab, which pinches you to death");
//        }
//
//    }
//
//    public static void cave() {
//        System.out.println("You fall into a cave and die");
//    }
//
//    // TODO #5:  Add at least 2 more static methods for 2 more locations
//
//}
