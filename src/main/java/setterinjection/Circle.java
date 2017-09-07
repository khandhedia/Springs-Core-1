package setterinjection;

/**
 * Created by nirk0816 on 9/1/2017.
 */
public class Circle implements Shape
{
    private int size;

    public void setSize(int size)
    {
        this.size = size;
    }

    @Override
    public void draw()
    {
        System.out.println("Circle of size " + this.size + " drawn.");
    }
}
