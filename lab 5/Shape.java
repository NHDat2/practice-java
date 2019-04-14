/**
* class Shape set color and filled
* @author : Nguyen Huu Dat
* @version : 1.0
* @since : 1/10/2018
*/
public class Shape
{
	private String color = "red";
	private boolean filled = true;
	/**
	* Contructor of class Shape
	* @param none
	*/
	public Shape()
	{
		this.color = "red";
		this.filled = true;
	}
	/**
	* Contructor of class Shape
	* @param String color
	* @param boolen filled
	*/
	public Shape(String color, boolean filled)
	{
		this.color = color;
		this.filled = filled;
	}
	/**
	* method getColor get Color of Shape
	* @param none
	* @return Color of Shape
	*/
	public String getColor()
	{
		return this.color;
	}
	/**
	* method setColor set Color of Shape
	* @param String color
	* @return don't return anything
	*/
	public void setColor(String color)
	{
		this.color = color;
	}
	/**
	* method isFilled get Filled of Shape
	* @param none
	* @return true/false
	*/
	public boolean isFilled()
	{
		return this.filled;
	}
	/**
	* method setFilled set Filled of Shape
	* @param boolean filled
	* @return don't return anything
	*/
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	/**
	* method toString return a String
	* @param none
	* @return a String
	*/
	public String toString()
	{
		return this.color;
	}
}