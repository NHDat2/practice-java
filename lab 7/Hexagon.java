/**
* Hexagon
* @author Nguyen Huu Dat
* @version 1.0
*/

import java.util.ArrayList;

public class Hexagon extends Shape
{
	private double size;
	public Hexagon(String color, double x, double y, double size)
	{
		super(color, x, y);
		this.size = size;
	}
	public void setSize(double size)
	{
		this.size = size;
	}
	public double getSize()
	{
		return this.size;
	}
}