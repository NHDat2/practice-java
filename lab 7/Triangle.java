/**
* Triangle
* @author Nguyen Huu Dat
* @version 1.0
*/
import java.util.ArrayList;

public class Triangle extends Shape
{
	private double a;
	private double b;
	private double c;

    public Triangle(String color, double x, double y, double a, double b, double c)
    {
        super(color, x, y);
    }

    public double getA()
    {
    	return this.a;
    }
    public double getB()
    {
    	return this.b;
    }
    public double getC()
    {
    	return this.c;
    }

}
