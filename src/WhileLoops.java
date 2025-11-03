public class WhileLoops
{   // n! = n*(n-1)*(n-2)*...*2*1
    // precondition: n > 0
    public static double factorial(int n)
    {
        double runningProduct = 1;
        for (int i = n; i > 1; i--) // Doesn't need to multiply by 1 at the end so i > 1
        {
            runningProduct *= i;
        }
        return runningProduct;
    }

    // returns sum of all digits
    // n > 0
    public static int sumDigits(int n)
    {
        int buffer = n;
        int runningSum = 0;
        while (buffer > 0)
        {
            runningSum += buffer % 10;
            buffer /= 10;
        }
        return runningSum;
    }

    public static double summation(int i, int n)
    {
        double runningSum = 0;
        for (int j = i; j <= n; j++)
        {
            runningSum += (1.0 / (j * j));
        }

        return runningSum;
    }

    public static void main(String[] args)
    {
        System.out.println(summation(1, 10000));
    }
}