package beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlApplicationContextApplication
{
    public static void main(String[] args)
    {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring11.xml");
        Triangle triangle1 = (Triangle) applicationContext.getBean("triangle");
        Triangle triangle2 = (Triangle) applicationContext.getBean("triangle");
        Circle circle1 = (Circle) applicationContext.getBean("circle");
        Circle circle2 = (Circle) applicationContext.getBean("circle");

        System.out.println("Triangle Beans are same : " + (triangle1==triangle2));//true because singleton
        System.out.printf("Circle Beans are same : " + (circle1 == circle2));//false because prototype

    }
}
