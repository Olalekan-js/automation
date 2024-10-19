package Task;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SimpleInterest8
{
    public static void main(String[] a)
    {
        DecimalFormat df = new DecimalFormat("0.00");
        // SI = principal * rate * time/ 100
        System.out.print("Enter amount: ");

        try (Scanner scanner = new Scanner(System.in)) {
            double amount = Double.parseDouble(df.format(scanner.nextDouble()));
            System.out.print("Enter rate (%): ");
            double rate = Double.parseDouble(df.format(scanner.nextFloat()));
            System.out.print("Enter period (in years): ");
            int time = scanner.nextInt();
            System.out.println();
            System.out.println("Principal amount: " + amount);
            System.out.println("Rate: " + rate + '%');
            System.out.println("Time: " + time + " years");
            
            System.out.println();
            System.out.println("Formualae: ");
            System.out.println();
            System.out.println("S.I = P x R x T      " + df.format(amount) + " x " + df.format(rate) + " x " + time);
            System.out.println("      ---------   =  ---------------");
            System.out.println("         100              100");
            System.out.println();
            System.out.println();
            System.out.println("    = " + df.format((amount * rate * time)/100));
        }
    }
}