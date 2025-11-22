public class Circle
{
    private double radius;
    private int x; //x center of circle
    private int y; //y center of circle

    public Circle()
    {
        radius = 1.0;
    }

    public Circle(double initRadius)
    {
       radius = initRadius;
    }

    public Circle(double initRadius, int initX, int initY)
    {
        radius = initRadius;
        x = initX;
        y = initY;
    }

    public void print()
    {
        System.out.println("Radius: " + radius);
        System.out.println("X-center: " + x);
        System.out.println("Y-center: " + y);
        System.out.println("Circle eq: (x - " + x + ")^2 + (y - " + y + ")^2 = " + (radius*radius));
    }

    public static void main(String[] args)
    {
        Circle billy = new Circle(5.0);
        Circle bob = new Circle(4, 6, 3);
        bob.print();

    }
}
