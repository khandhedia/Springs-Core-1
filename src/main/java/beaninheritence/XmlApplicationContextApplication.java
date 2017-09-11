package beaninheritence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlApplicationContextApplication
{
    public static void main(String[] args)
    {
        Drawing triangleDrawing = new Drawing();
        Drawing triangle2Drawing = new Drawing();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring13.xml");
        Triangle triangle1 = (Triangle) applicationContext.getBean("triangle");
        Triangle triangle2 = (Triangle) applicationContext.getBean("triangle2");

        triangleDrawing.setShape(triangle1);
        triangleDrawing.performDrawing();

        triangle2Drawing.setShape(triangle2);
        triangle2Drawing.performDrawing();

        /*

        Output:

        Triangle Points:
        Point{x=0, y=0}
        Point{x=0, y=20}
        Point{x=-20, y=0}
        Triangle Points:
        Point{x=0, y=0}
        Point{x=0, y=20}
        Point{x=0, y=30}
         */
    }
}
