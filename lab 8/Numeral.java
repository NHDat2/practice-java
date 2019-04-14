/**
* @author Nguyen Huu Dat
* @version 1.0
* @since 23-10-2018
*/

public class Numeral extends Expression
{
	private int value;
	/**
	* Contructor Numeral
	* @param value
	*/
	public Numeral(int value)
	{
		this.value = value;
	}
	/**
	* Contructor Numeral
	* @param value
	*/
	public Numeral()
	{
		this.value = 0;
	}
	/**
	* overrding toString method
	*/
	@Override
	public String toString()
	{
		return this.value + "";
	}
	/**
	* overrding evaluate method
	*/
	@Override
	public int evaluate()
	{
		return this.value;
	}
}