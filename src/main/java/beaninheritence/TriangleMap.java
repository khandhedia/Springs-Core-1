package beaninheritence;

import java.util.Map;

/**
 * Created by nirk0816 on 9/1/2017.
 */
public class TriangleMap implements Shape
{
    private Map<Integer, Point> points;

    public Map<Integer, Point> getPoints()
    {
        return points;
    }

    public void setPoints(Map<Integer, Point> points)
    {
        this.points = points;
    }

    @Override
    public void draw()
    {
        System.out.println("Triangle Map Points: \n");
        for(Integer integer: points.keySet())
        {
            System.out.println(points.get(integer));
        }
    }
}
