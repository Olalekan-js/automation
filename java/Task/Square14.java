package Task;

class Shape
{
    private int shapeSides = 4;
    private double length;
    private double breadth;

    public void setLength(double length)
    {
        this.length = length;
    }

    public double getLength()
    {
        return this.length;
    }

    public void setBreadth(double breadth)
    {
        this.breadth = breadth;
    }

    public double getBreadth()
    {
        return this.breadth;
    }

    public int getNumberOfSides()
    {
        return this.shapeSides;
    }
}

public class Square14
{
    public static void main(String a[])
    {
        // Instantiation
        Shape square = new Shape();
        square.setLength(8);
        square.setBreadth(8);

        double area = square.getLength() * square.getBreadth();
        System.out.println("The area of a square of length "+square.getLength()+" and breadth "+ square.getBreadth() + " is " + area);
    }
}