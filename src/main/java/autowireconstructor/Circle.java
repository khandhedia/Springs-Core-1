package autowireconstructor;

/**
 * Created by nirk0816 on 9/1/2017.
 */
public class Circle implements Shape
{
    private int size;

    private Point center;

    public Circle(int size, Point center)
    {
        this.size = size;
        this.center = center;
    }

    @Override
    public void draw()
    {
        System.out.println("Circle of size " + this.size + " with centre as " + center + "is drawn.");
    }
}
