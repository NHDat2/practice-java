/**
* @author Nguyen Huu Dat
* @version 1.0
* @since 23-10-2018
*/

public class Square extends Expression
{
	Expression expression;
	/**
	* Contructor Square
	* @param expression
	*/
	public Square(Expression expression)
	{
		this.expression = expression;
	}
	/**
	* overrding toString method
	*/
	@Override
	public String toString()
	{
		int result = expression.evaluate() * expression.evaluate();
		return result + "";
	}
	/**
	* overrding evaluate method
	*/
	@Override
	public int evaluate()
	{
		int result = expression.evaluate() * expression.evaluate();
		return result;
	}
}