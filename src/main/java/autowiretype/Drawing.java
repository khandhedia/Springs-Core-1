package autowiretype;

/**
 * Created by nirk0816 on 9/1/2017.
 */
public class Drawing
{
    private Shape shape;

    public Shape getShape()
    {
        return shape;
    }

    public void setShape(Shape shape)
    {
        this.shape = shape;
    }

    public void performDrawing()
    {
        this.shape.draw();
    }
}
