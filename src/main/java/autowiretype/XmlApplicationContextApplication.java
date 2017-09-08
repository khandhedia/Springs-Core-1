package autowiretype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlApplicationContextApplication
{
    public static void main(String[] args)
    {
        Drawing circleDrawing = new Drawing();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring9.xml");
        Circle circle1 = (Circle) applicationContext.getBean("circle");

        circleDrawing.setShape(circle1);
        circleDrawing.performDrawing();
    }
}
