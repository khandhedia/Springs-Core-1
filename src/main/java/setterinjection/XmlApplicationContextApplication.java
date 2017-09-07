package setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlApplicationContextApplication
{
    public static void main(String[] args)
    {
        Drawing triangleDrawing = new Drawing();
        Drawing circleDrawing = new Drawing();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");
        Triangle triangle1 = (Triangle) applicationContext.getBean("triangle");
        Circle circle1 = (Circle) applicationContext.getBean("circle");

        triangleDrawing.setShape(triangle1);
        triangleDrawing.performDrawing();

        circleDrawing.setShape(circle1);
        circleDrawing.performDrawing();
    }
}
