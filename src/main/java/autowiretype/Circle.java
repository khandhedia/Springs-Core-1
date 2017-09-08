package autowiretype;

/**
 * Created by nirk0816 on 9/1/2017.
 */
public class Circle implements Shape
{
    private int size;

    private Point center;

    public int getSize()
    {
        return size;
    }

    public Point getCenter()
    {
        return center;
    }

    public void setCenter(Point center)
    {
        this.center = center;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    @Override
    public void draw()
    {
        System.out.println("Circle of size " + this.size + " with centre as " + center + "is drawn.");
    }
}
