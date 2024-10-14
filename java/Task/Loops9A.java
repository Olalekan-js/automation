package Task;

public class Loops9A
{
    public static void main(String[] a)
    {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int n: numbers)
        {
            if (n%2==0)
                System.out.println(n + ": Even");
            else
                System.out.println(n + ": Odd");
        }
    }
}