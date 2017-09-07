package refbeaninjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Created by nirk0816 on 9/1/2017.
 */
public class XMLBeanFactoryApplication
{
    public static void main(String[] args)
    {
        Drawing triangleDrawing = new Drawing();
        Drawing circleDrawing = new Drawing();

        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("src/main/java/refbeaninjection/spring.xml"));
        Triangle triangle1 = (Triangle) beanFactory.getBean("triangle");
        Circle circle1 = (Circle) beanFactory.getBean("circle");


        triangleDrawing.setShape(triangle1);
        triangleDrawing.performDrawing();

        circleDrawing.setShape(circle1);
        circleDrawing.performDrawing();
    }
}
