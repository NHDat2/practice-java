/**
* @author Nguyen Huu Dat
* @version 1.0
* @since 23-10-2018
*/

public class Division extends BinaryExpression
{
	Expression left;
	Expression right;
	/**
	* Contructor Division
	* @param left
	* @param right
	*/
	public Division(Expression left, Expression right)
	{
		this.left = left;
		this.right = right;
	}
	/**
	* Override expression
	*/
	@Override
	public Expression left()
	{
		return this.left;
	}
	/**
	* Override expression
	*/
	@Override
	public Expression right()
	{
		return this.right;
	}
	/**
	* set Left
	*/
	public void setLeft(Expression left)
	{
		this.left = left;
	}
	/**
	* set Right
	*/
	public void setRight(Expression right)
	{
		this.right = right;
	}
	/**
	* Get lEFT
	*/
	public Expression getLeft()
	{
		return this.left;
	}
	/**
	* Get Right
	*/
	public Expression getRight()
	{
		return this.right;
	}
	/**
	* Ovverride toString method
	*/
	@Override
	public String toString()
	{
		int result = this.left.evaluate() / this.right.evaluate();
		return result + "";
	}
	/**
	* Ovverride evaluate method
	*/
	@Override
	public int evaluate()
	{
		int result = this.left.evaluate() / this.right.evaluate();
		return result;
	}
}