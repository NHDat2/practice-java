/**
* class Shape set color and filled
* @author Nguyen Huu Dat
* @version 1.0
*/

import java.util.ArrayList;

public class Shape
{
    private String color;
    private double x;
    private double y;
    public Shape(String color, double x, double y)
    {
        this.color = color;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
    public void setX(double x)
    {
        this.x = x;
    }
    public double getX()
    {
        return this.x;
    }
    public void setY(double y)
    {
        this.y = y;
    }
    public double getY()
    {
        return this.y;
    }
    
}