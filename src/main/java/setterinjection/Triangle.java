package setterinjection;

/**
 * Created by nirk0816 on 9/1/2017.
 */
public class Triangle implements Shape
{
    private String type;

    public void setType(String type)
    {
        this.type = type;
    }

    @Override
    public void draw()
    {
        System.out.println("Triangle of type "+this.type +" drawn");
    }
}
