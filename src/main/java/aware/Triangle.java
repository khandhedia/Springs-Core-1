package aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by nirk0816 on 9/1/2017.
 */
public class Triangle implements Shape, ApplicationContextAware, BeanNameAware
{
    ApplicationContext ctx;

    @Override
    public void draw()
    {
        System.out.println("Triangle drawn");
    }

    @Override
    public void setBeanName(String s)
    {
        System.out.println("Bean name : " + s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
    {
        this.ctx = applicationContext;
    }
}
