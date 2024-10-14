package Task;

public class StringDemo3
{
    public static void main(String[] a)
    {
        String text = "What is number ";
        int age = 5;

        System.out.println(text + age+"?");
        System.out.println(text.concat(age+"?"));
    }
}