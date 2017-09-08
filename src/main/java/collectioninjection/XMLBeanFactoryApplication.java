package collectioninjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nirk0816 on 9/1/2017.
 */
public class XMLBeanFactoryApplication
{
    public static void main(String[] args)
    {
        Drawing triangleDrawing = new Drawing();
        Drawing triangleSetDrawing = new Drawing();
        Drawing triangleMapDrawing = new Drawing();
        Drawing circleDrawing = new Drawing();

        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("src/main/java/collectioninjection/spring.xml"));
        Triangle triangle1 = (Triangle) beanFactory.getBean("triangle-name");
        TriangleSet triangle2 = (TriangleSet) beanFactory.getBean("triangleset-name");
        TriangleMap triangle3 = (TriangleMap) beanFactory.getBean("trianglemap-name");
        Circle circle1 = (Circle) beanFactory.getBean("circle-alias");


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
