package lifecyclecallback;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by nirk0816 on 9/1/2017.
 */
public class CircleAnnotateCallback implements Shape
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
        System.out.println("CircleAnnotateCallback PostConstruct called, soon after bean creation.");
    }

    @PreDestroy
    public void destroy() throws Exception
    {
        System.out.println("CircleAnnotateCallback PreDestroy called, before bean destruction, as AbstractApplicationContext.registerShutdownHook() is configured.");
    }
}
