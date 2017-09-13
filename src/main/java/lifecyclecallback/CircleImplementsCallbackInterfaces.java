package lifecyclecallback;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by nirk0816 on 9/1/2017.
 */
public class CircleImplementsCallbackInterfaces implements Shape, InitializingBean, DisposableBean
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

    @Override
    public void afterPropertiesSet() throws Exception
    {
        System.out.println("CircleImplementsCallbackInterfaces implements InitializingBean - afterPropertiesSet() called, soon after bean creation.");
    }

    @Override
    public void destroy() throws Exception
    {
        System.out.println("CircleImplementsCallbackInterfaces implements DisposableBean - destroy() called, before bean destruction, as AbstractApplicationContext.registerShutdownHook() is configured.");
    }
}
