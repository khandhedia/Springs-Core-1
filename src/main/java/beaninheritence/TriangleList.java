package beaninheritence;

import java.util.List;
import java.util.Set;

/**
 * Created by nirk0816 on 9/1/2017.
 */
public class TriangleList implements Shape
{
    private List<Point> points;

    public List<Point> getPoints()
    {
        return points;
    }

    public void setPoints(List<Point> points)
    {
        this.points = points;
    }

    @Override
    public void draw()
    {
        System.out.println("Triangle Set Points: \n");
        for(Point point : points)
        {
            System.out.println(point);
        }
    }
}
