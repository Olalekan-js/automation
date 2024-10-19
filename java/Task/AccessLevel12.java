package Task;

import Task.AccessModifier1.A;
import Task.AccessModifier2.B;

public class AccessLevel12
{
    public static void main(String a[])
    {
        // Instantiate A obj
        A objA = new A();
        objA.aMethod();

        // Instantiate B obj
        B objB = new B();
        objB.bMethod();
    }
}