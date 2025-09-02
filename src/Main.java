import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        int currentYear;
        int birthYear;
        int dogBirthYear;

        (1 - 1 == 0) {
            System.out.println("Math is working");
        }

        System.out.println("What is the current year?");

        Scanner scan = new Scanner(System.in);
        currentYear = scan.nextInt();
        System.out.println("What is your birth year?");
        birthYear = scan.nextInt();
        System.out.println("What is your dog's birth year?");
        dogBirthYear = scan.nextInt();

        boolean isTrilogy = scan.nextBoolean();
        scan.close();

        System.out.println("You are " + (currentYear - birthYear) + " years old.");
        System.out.println("Your dog is " + (currentYear - dogBirthYear) + " years old.");
        System.out.println("Your dog is " + ((currentYear - dogBirthYear) * 7) + " dog years old.");




    }
}


