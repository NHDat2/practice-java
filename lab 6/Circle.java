/**
* Circle is extends to class Shape. Using set and get side, color, filled and calculate area and perimeter of Circle
* @author Nguyen Huu Dat
* @version 1.0
*/

import java.util.ArrayList;

public class Circle extends Shape
{
    private double radius;
    private final double PI = 3.14;
    public Circle(String color, double radius)
    {
        super(color);
        radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    /**
     * @return Circle's Perimeter
     */
    public double getPerimeter()
    {
        return 2 * PI * radius;
    }


    /**
     * @return Circle's Area
     */
    public double getArea()
    {
        return 2 * PI * radius * radius;
    }
}