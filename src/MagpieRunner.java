/**
 * MagpieRunner.java
 * A program to carry on conversations with a human user.
 * Create a Magpie, give it user input, and print its replies.
 */

import java.util.Scanner;      // class necessary to read input from the keyboard
public class MagpieRunner
{
    public static void main(String[] args)
    {
        boolean crazy = false;
        int index = 0;
        Magpie maggie = new Magpie();  // creates a Magpie object named maggie
        String greeting = maggie.getGreeting();  // calls the getGreeting method
        //     on the maggie object
        System.out.println(greeting);
        Scanner in = new Scanner (System.in);   // creates a Scanner object
        //   to read from the keyboard

        String statement = in.nextLine();       // reads a line of text
        //   from the keyboard

        while (!statement.equals("Bye"))       // loop stopping condition
        {                  // calls the getResponse method on the maggie object
            String response = maggie.getResponse(statement);
            if (response == null) {
                break;
            }

            if (response.equals("crazy") || crazy) {
                crazy = true;
                if (index % 5 == 0)
                    response = "Crazy? I was crazy once. eh?";
                else if (index % 5 == 1)
                    response = "They locked me in a room. eh?";
                else if (index % 5 == 2)
                    response = "A rubber room. eh?";
                else if (index % 5 == 3)
                    response = "A rubber room with rats. eh?";
                else
                    response = "And rats make me crazy. eh?";
                index++;
            }

            System.out.println(response);
            statement = in.nextLine();          // reads in the users response
        }


        in.close();                            // closes the input file
    }
}