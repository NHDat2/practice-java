/**
* @author Nguyen Huu Dat
* @version 1.0
* @since 23-10-2018
*/

public class Addition extends BinaryExpression
{
	Expression left;
	Expression right;

	/**
	* Contructor Addition
	* @param left
	* @param right
	*/
	public Addition(Expression left, Expression right)
	{
		this.left = left;
		this.right = right;
	}

	/**
	* 0verride expression method of class Expression
	*/
	@Override
	public Expression left()
	{
		return this.left;
	}
	/**
	* 0verride expression method of class Expression
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
	* Get Left
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
	* Override toString method of class Expression
	*/
	@Override
	public String toString()
	{
		int result = this.left.evaluate() + this.right.evaluate();
		return result + "";
	}
	/**
	* Overriding evaluate method of class Expression
	*/
	@Override
	public int evaluate()
	{
		int result = this.left.evaluate() + this.right.evaluate();
		return result;
	}
}