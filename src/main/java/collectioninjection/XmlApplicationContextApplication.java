package collectioninjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlApplicationContextApplication
{
    public static void main(String[] args)
    {
        Drawing triangleDrawing = new Drawing();
        Drawing triangleSetDrawing = new Drawing();
        Drawing triangleMapDrawing = new Drawing();

        Drawing circleDrawing = new Drawing();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring7.xml");
        Triangle triangle1 = (Triangle) applicationContext.getBean("triangle-name");
        TriangleSet triangle2 = (TriangleSet) applicationContext.getBean("triangleset-name");
        TriangleMap triangle3 = (TriangleMap) applicationContext.getBean("trianglemap-name");
        Circle circle1 = (Circle) applicationContext.getBean("circle-alias");

        triangleDrawing.setShape(triangle1);
        triangleSetDrawing.setShape(triangle2);
        triangleMapDrawing.setShape(triangle3);

        triangleDrawing.performDrawing();
        triangleSetDrawing.performDrawing();
        triangleMapDrawing.performDrawing();

        circleDrawing.setShape(circle1);
        circleDrawing.performDrawing();
    }
}
