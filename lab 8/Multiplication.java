/**
* @author Nguyen Huu Dat
* @version 1.0
* @since 23-10-2018
*/

public class Multiplication extends BinaryExpression
{
	Expression left;
	Expression right;

	/**
	* Multiplication is use to multipli 2 number
	* @param left
	* @param right
	*/
	public Multiplication(Expression left, Expression right)
	{
		this.left = left;
		this.right = right;
	}
	/**
	* Overriding left method
	*/
	@Override
	public Expression left()
	{
		return this.left;
	}
	/**
	* Overriding left method
	*/
	@Override
	public Expression right()
	{
		return this.right;
	}
	/**
	* set left
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
	* Get left
	*/
	public Expression getLeft()
	{
		return this.left;
	}
	/**
	* get Right
	*/
	public Expression getRight()
	{
		return this.right;
	}
	/**
	* Overriding toString
	*/
	@Override
	public String toString()
	{
		int result = this.left.evaluate() * this.right.evaluate();
		return result + "";
	}
	/**
	* Overriding evaluate 
	*/
	@Override
	public int evaluate()
	{
		int result = this.left.evaluate() * this.right.evaluate();
		return result;
	}
}