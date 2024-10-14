package Task;

public class FizzBuzz5
{
    public static void main(String[] a)
    {
        int number = 5;

        if (number % 3 == 0 && number % 5 == 0)
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Buzz");
        else if (number % 3 == 0)
            System.out.println("Fizz");
    }
}