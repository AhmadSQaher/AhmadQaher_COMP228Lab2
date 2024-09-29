package Exercise3;

public class Add
{
    public static int add(int a, int b)
    {
        return a + b;
    }
    public static double addThree(double a, double b, double c)
    {
        return a + b + c;
    }
    public static double addFour(double a, double b, double c, double d)
    {
        return a + b + c + d;
    }

    public static void main(String[] args)
    {
        int sumResult = add(4, 9);
        System.out.println("Sum of 4 & 9 = " + sumResult);

        double sumThree = addThree(1.0, 2.5, 8.1);
        System.out.println( "Sum of 1.0, 2.5 and 8.1 = " + sumThree);

        double sumFour = addFour(1.0, 2.5, 8.1, 4.9);
        System.out.println( "Sum of 1.0, 2.5, 8.1 and 4.9 = " + sumFour);

    }
}