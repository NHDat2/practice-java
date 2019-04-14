/**
* @author Nguyen Huu Dat
* @version 1.0
* @since 23-10-2018
*/

public class Subtraction extends BinaryExpression
{
	Expression left;
	Expression right;

	/**
	* Contructor Subtracion
	* @param left
	* @param right
	*/
	public Subtraction(Expression left, Expression right)
	{
		this.left = left;
		this.right = right;
	}

	/**
	* overrding left method
	*/
	@Override
	public Expression left()
	{
		return this.left;
	}
	/**
	* overrding right method
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
	* set right
	*/
	public void setRight(Expression right)
	{
		this.right = right;
	}
	/**
	* get Left
	*/
	public Expression getLeft()
	{
		return this.left;
	}
	/**
	* get right
	*/
	public Expression getRight()
	{
		return this.right;
	}
	/**
	* overriding tostring method
	*/
	@Override
	public String toString()
	{
		int result = this.left.evaluate() - this.right.evaluate();
		return result + "";
	}
	/**
	* overriding evaluate method
	*/
	@Override
	public int evaluate()
	{
		int result = this.left.evaluate() - this.right.evaluate();
		return result;
	}
}