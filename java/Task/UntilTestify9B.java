package Task;

import java.util.Scanner;

public class UntilTestify9B
{
    public static void main(String[] a)
    {
        System.out.print("Enter a guess word: ");
        Scanner sc = new Scanner(System.in);

        try
        {    
            while(true)
            {
                String inputWord = sc.nextLine();
                boolean isTestify = inputWord.equals("testify");
    
                if (isTestify)
                {
                    System.out.println("Correct!");
                    break;
                }
                System.out.print("Try again!: ");
            }
        }
        
        finally
        {
            sc.close();
        }
    }
}