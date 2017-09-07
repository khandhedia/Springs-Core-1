package shapemembervariable;

/**
 * Created by nirk0816 on 9/1/2017.
 */
public class Application
{
    public static void main(String[] args)
    {
        Drawing triangleDrawing = new Drawing();
        Triangle triangle = new Triangle();
        triangleDrawing.setShape(triangle);
        triangleDrawing.performDrawing();

        Drawing circleDrawing = new Drawing();
        Circle circle = new Circle();
        circleDrawing.setShape(circle);
        circleDrawing.performDrawing();
    }
}
