package collectioninjection;

import java.util.List;
import java.util.Set;

/**
 * Created by nirk0816 on 9/1/2017.
 */
public class TriangleSet implements Shape
{
    private Set<Point> points;

    public Set<Point> getPoints()
    {
        return points;
    }

    public void setPoints(Set<Point> points)
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
