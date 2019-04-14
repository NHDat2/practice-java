/**
* Rectangle is extends to class Shape. Using set and get side, color, filled and calculate area and perimeter of Rectangle
* @author Nguyen Huu Dat
* @version 1.0
*/

import java.util.ArrayList;

public class Rectangle extends Shape
{
    private double width, height;

    public Rectangle(double with, double length, String color, double x, double y)
    {
        super(color, x, y);
        this.width = width;
        this.height = height;

    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    /**
     * @return Rectangle Perimeter
     */
    public double getPerimeter()
    {
        return (width + height) * 2;
    }

    /**
     * @return Rectangle Area
     */
    public double getArea()
    {
        return width * height;
    }
}