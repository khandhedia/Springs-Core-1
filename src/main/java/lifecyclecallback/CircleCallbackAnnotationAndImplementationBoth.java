package lifecyclecallback;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by nirk0816 on 9/1/2017.
 */
public class CircleCallbackAnnotationAndImplementationBoth implements Shape, InitializingBean, DisposableBean
{

    Point center;

    public Point getCenter()
    {
        return center;
    }

    public void setCenter(Point center)
    {
        this.center = center;
    }

    @Override
    public void draw()
    {
        System.out.println("CircleImplementsCallbackInterfaces drawn.");
    }

    @PostConstruct
    public void init() throws Exception
    {
        System.out.println("CircleCallbackAnnotationAndImplementationBoth PostConstruct called, soon after bean creation.");
    }

    @PreDestroy
    public void predestroy() throws Exception
    {
        System.out.println("CircleCallbackAnnotationAndImplementationBoth PreDestroy called, before bean destruction, as AbstractApplicationContext.registerShutdownHook() is configured.");
    }

    @Override
    public void afterPropertiesSet() throws Exception
    {
        System.out.println("CircleCallbackAnnotationAndImplementationBoth implements InitializingBean - afterPropertiesSet() called, soon after bean creation.");
    }

    @Override
    public void destroy() throws Exception
    {
        System.out.println("CircleCallbackAnnotationAndImplementationBoth implements DisposableBean - destroy() called, before bean destruction, as AbstractApplicationContext.registerShutdownHook() is configured.");
    }
}
