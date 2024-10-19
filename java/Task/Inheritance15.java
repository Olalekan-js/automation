package Task;

// import java.lang.Math.*;

class Calculator
{
    public int add(int a, int b)
    {
        return a + b;
    }

    public int subtract(int a, int b)
    {
        return a - b;
    }

    public int multiply(int a, int b)
    {
        return a * b;
    }
}

class SciCalculator extends Calculator
{
    public double squareRoot(int number)
    {
        return Math.sqrt(number);
    }

    public double power(int number, int index)
    {
        return Math.pow(number, index);
    }
}

public class Inheritance15
{
    public static void main(String[] a)
    {
        // Instantiate
        SciCalculator cal = new SciCalculator();
        System.out.println(cal.add(3, 2));
        System.out.println(cal.squareRoot(4));
        System.out.println(cal.subtract(3, 9));
        System.out.println(cal.multiply(5, 0));
        System.out.println(cal.power(9, 2));
    }
}