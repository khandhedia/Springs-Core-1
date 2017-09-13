package lifecyclecallback;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlApplicationContextApplication
{
    public static void main(String[] args)
    {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring14.xml");
        applicationContext.registerShutdownHook();

        Shape shape;

        shape = applicationContext.getBean("circleImplementsCallbackInterfaces", Shape.class);
        shape.draw();

                /*
        CircleImplementsCallbackInterfaces implements InitializingBean - afterPropertiesSet() called, soon after bean creation.
        CircleImplementsCallbackInterfaces drawn.
        CircleImplementsCallbackInterfaces implements DisposableBean - destroy() called, before bean destruction, as AbstractApplicationContext.registerShutdownHook() is configured.
         */

        shape = applicationContext.getBean("circleAnnotateCallback", Shape.class);
        shape.draw();

        shape = applicationContext.getBean("circleCallbackAnnotationAndImplementationBoth", Shape.class);
        shape.draw();





    }
}
