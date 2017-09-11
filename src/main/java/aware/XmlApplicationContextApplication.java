package aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlApplicationContextApplication
{
    public static void main(String[] args)
    {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring12.xml");
        System.out.println("Context Created");
        System.out.println("Doing getbean for Triangle - Singleton");
        Triangle triangle1 = (Triangle) applicationContext.getBean("triangle");
        Triangle triangle2 = (Triangle) applicationContext.getBean("triangle-alias");
        System.out.println("Doing getbean for circle - prototype");
        Circle circle1 = (Circle) applicationContext.getBean("circle");
        Circle circle2 = (Circle) applicationContext.getBean("circle-name");

        /*
        Output:

        Bean name : triangle
        Context Created
        Doing getbean for Triangle - Singleton
        Doing getbean for circle - prototype
        Bean Name : circle
        Bean Name : circle

         */

    }
}
