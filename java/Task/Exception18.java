package Task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception18
{
    public static void main(String[] a)
    {
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);

        try {
            
            int age = sc.nextInt();
           System.out.println("Awesome! You are "+ age + " years old.");
        }
        catch(InputMismatchException e) {
            System.out.println("Sorry, only number is allowed!");
        }
        finally {
            sc.close();
        }

    }
}