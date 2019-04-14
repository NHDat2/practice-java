/**
* Rectangle is extends to class Shape. Using set and get side, color, filled and calculate area and perimeter of Rectangle
* @author : Nguyen Huu Dat
* @version : 1.0
* @since : 1/10/2018
*/

public class Rectangle extends Shape
{
	private double width = 1.0;
	private double length = 1.0;
	/**
	* Contructor of class Rectangle
	* @param none
	*/
	public Rectangle()
	{
		this.width = 1.0;
		this.length = 1.0;
	}
	/**
	* Contructor of class Rectangle
	* @param double width
	* @param double length
	*/
	public Rectangle(double width, double length)
	{
		this.width = width;
		this.length = length;
	}
	/**
	* Contructor of class Rectangle
	* @param double width
	* @param double length
	* @param String color
	* @param boolean filled
	*/
	public Rectangle(double width, double length, String color, boolean filled)
	{
		this.width = width;
		this.length = length;
		this.setColor(color);
		this.setFilled(filled);
	}
	/**
	* method getWidth get width of Rectangle
	* @param none
	* @return width of Rect
	*/
	public double getWidth()
	{
		return this.width;
	}
	/**
	* method setWidth set width of Rectangle
	* @param double width
	* @return don't return anything
	*/
	public void setWidth(double width)
	{
		this.width = width;
	}
	/**
	* method getLength get length of Rectangle
	* @param none
	* @return length of Rect
	*/
	public double getLength()
	{
		return this.length;
	}
	/**
	* method setLength set length of Rectangle
	* @param double length
	* @return don't return anything
	*/
	public void setLength(double length)
	{
		this.length = length;
	}
	/**
	* method getArea get area of Rectangle
	* @param none
	* @return area of Rect
	*/
	public double getArea()
	{
		double area = this.getWidth() * this.getLength();
		return area;
	}
	/**
	* method getPerimeter get length of Rectangle
	* @param none
	* @return perimeter of Rect
	*/
	public double getPerimeter()
	{
		double perimeter = (this.getLength() + this.getWidth()) * 2;
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