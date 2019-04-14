
/**
* Circle is extends to class Shape. Using set and get side, color, filled and calculate area and perimeter of Circle
* @author : Nguyen Huu Dat
* @version : 1.0
* @since : 1/10/2018
*/
public class Circle extends Shape
{
	private double radius = 1.0;
	private final double pi = 3.14;
	/**
	* Contructor of class Cricle
	* @param none
	*/
	public Circle()
	{
		this.radius = 1.0;
	}
	/**
	* Contructor of class Cricle
	* @param double radius
	*/
	public Circle(double radius)
	{
		this.radius = radius;
	}
	/**
	* Contructor of class Cricle
	* @param double radius
	* @param String color
	* @param boolean filled
	*/
	public Circle(double radius, String color, boolean filled)
	{
		this.radius = radius;
		this.setColor(color);
		this.setFilled(filled);
	}
	/**
	* method getRadius get radius of Circle
	* @param none
	* @return radius of Circle
	*/
	public double getRadius()
	{
		return this.radius;
	}
	/**
	* method setRadius set radius of Circle
	* @param double radius
	* @return don't return anything
	*/
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	/**
	* method getArea get area of Circle
	* @param none
	* @return area of Circle
	*/
	public double getArea()
	{
		double area = this.pi * this.getRadius() * this.getRadius();
		return area;
	}
	/**
	* method getPerimeter get length of Circle
	* @param none
	* @return perimeter of Circle
	*/
	public double getPerimeter()
	{
		double perimeter = this.pi * 2 * this.getRadius();
		return perimeter;
	}
	/**
	* method toString return a String
	* @param none
	* @return a String
	*/
	@Override
	public String toString()
	{
		return this.getColor();
	}
}