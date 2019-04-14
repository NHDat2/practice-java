/**
* class Lab05OOP perform class Shape, Circle, Rectangle and Square
* @author : Nguyen Huu Dat
* @version : 1.0
* @since : 1/10/2018
*/

public class Lab05OOP
{
	/**
	* method main perform class Shape, Circle, Rectangle and Square
	* @param String[] args does't use
	* @return don't return anything
	*/
	public static void main(String[] args)
	{
		Shape shape = new Shape("White", false);
		String color_Shape = shape.getColor();
		boolean filled_Shape = shape.isFilled();
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Color and filled of Shape : " + color_Shape + " and " + filled_Shape);

		Circle circle = new Circle(4, "Blue", true);
		String color_Circle = circle.getColor();
		boolean filled_Circle = circle.isFilled();
		double area_Circle = circle.getArea();
		double perimeter_Circle = circle.getPerimeter();
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Color and filled of Circle : " + color_Circle + " and " + filled_Circle);
		System.out.println("Area and perimeter of Circle :" + area_Circle + " and " + perimeter_Circle);

		Rectangle rect = new Rectangle(4, 5, "Black", false);
		String color_Rectangle = rect.getColor();
		boolean filled_Rectangle = rect.isFilled();
		double area_Rectangle = rect.getArea();
		double perimeter_Rectangle = rect.getPerimeter();
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Color and filled of Rectangle : " + color_Rectangle + " and " + filled_Rectangle);
		System.out.println("Area and perimeter of Rectangle :" + area_Rectangle + " and " + perimeter_Rectangle);

		Square square = new Square(4, "Gray", true);
		String color_Square = square.getColor();
		boolean filled_Square = square.isFilled();
		double side = square.getSide();
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Color and filled and side of Square : " + color_Square + " and " + filled_Square + " and " + side);
		System.out.println("---------------------------------------------------------------------");
	}
}