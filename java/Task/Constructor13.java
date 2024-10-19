package Task;

class Person
{
    String name;
    int age;
    boolean isDark;

    public Person(String name)
    {
        this.name = name;
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, boolean isDark)
    {
        this.name = name;
        this.age = age;
        this.isDark = isDark;
    }
}

public class Constructor13
{
    public static void main(String a[])
    {
        // Instantiate grace
        Person grace = new Person("Grace");
        System.out.println(grace.name);
        System.out.println(grace.age);
        System.out.println(grace.isDark);

        // Instantiate Tola
        Person tola = new Person("Omotolani", 25);

        // Instantiate Lekan
        Person lekan = new Person("Olalekan", 18, true);


    }
}