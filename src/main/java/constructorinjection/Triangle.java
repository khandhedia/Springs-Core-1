package constructorinjection;

/**
 * Created by nirk0816 on 9/1/2017.
 */
public class Triangle implements Shape
{
    public Triangle(String type)
    {
        this.type = type;
    }

    public Triangle(String type, int height)
    {
        this.height = height;
        this.type = type;
    }

    private int height;

    private String type;

    public void setType(String type)
    {
        this.type = type;
    }

    @Override
    public void draw()
    {
        System.out.println("Triangle of type "+this.type +" drawn with height "+ this.height);
    }
}
