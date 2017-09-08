package autowireconstructor;

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
        Drawing circleDrawing = new Drawing();

        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("src/main/java/autowireconstructor/spring.xml"));
        Circle circle1 = (Circle) beanFactory.getBean("circle");

        circleDrawing.setShape(circle1);
        circleDrawing.performDrawing();
    }
}
