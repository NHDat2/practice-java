/**
* class Square is extends to class Rectangle. Using set and get side and get color, filled
* @author : Nguyen Huu Dat
* @version : 1.0
* @since : 1/10/2018
*/

public class Square extends Rectangle
{
	double side = 1.0;
	/**
	* Contructor of class Square
	* @param none
	*/
	public Square()
	{
		//this.setLength(0);
		this.side = 1.0;
	}
	/**
	* Contructor of class Square
	* @param double side
	*/
	public Square(double side)
	{
		//this.setLength(side);
		this.side = side;
	}
	/**
	* Contructor of class Square
	* @param double side
	* @param String color
	* @param boolean filled
	*/
	public Square(double side, String color, boolean filled)
	{
		//this.setLength(side);
		this.side = side;
		this.setColor(color);
		this.setFilled(filled);
	}
	/**
	* method getSide get side of square
	* @param none
	* @return return side of square
	*/
	public double getSide()
	{
		//return this.getLength();
		return this.side;
	}
	/**
	* method setSide set side of square
	* @param double side
	* @return don't return anything
	*/
	public void setSide(double side)
	{
		//this.setLength(side);
		this.side = side;
	}
	/**
	* method setWidth override method setWidth of class Rectangle
	* @param double side
	* @return don't return anything
	*/
	@Override
	public void setWidth(double side)
	{
		this.side = side;
	}
	/**
	* method setWidth override method setLength of class Rectangle
	* @param double side
	* @return don't return anything
	*/
	@Override
	public void setLength(double side)
	{
		this.side = side;
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