package interfacedriven;

/**
 * Created by nirk0816 on 9/1/2017.
 */
public class Application
{
    public static void main(String[] args)
    {
        Application application = new Application();

        Triangle triangle = new Triangle();
        Circle circle = new Circle();

        application.drawShape(triangle);
        application.drawShape(circle);
    }

    private void drawShape(Shape shape)
    {
        shape.draw();
    }
}
