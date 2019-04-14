/**
* Main
* @author Nguyen Huu Dat
* @version 1.0
*/
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Shape circle = new Circle("black", 10);
        Shape triagle = new Triangle("green");
        Shape rectangle = new Rectangle(22, 99, "red");
        Shape square = new Square(8);

        ArrayList<Layer> layers = new ArrayList<Layer>();
        ArrayList<Shape> shapes1 = new ArrayList<Shape>();
        ArrayList<Shape> shapes2 = new ArrayList<Shape>();

        shapes1.add(circle);
        shapes1.add(triagle);
        shapes1.add(rectangle);
        shapes1.add(square);

        shapes2.add(circle);
        shapes2.add(triagle);
        shapes2.add(triagle);
        shapes2.add(rectangle);
        shapes2.add(circle);
        shapes2.add(square);
        
        layers.add(new Layer(shapes1));
        layers.add(new Layer(shapes2));

        Diagram diagram = new Diagram(layers);
        System.out.println("Before Remove");
        diagram.print();
        diagram.removeCircle();
        layers.get(0).removeTriangle();
        layers.get(1).removeTriangle();
        System.out.println("After Remove");
        diagram.print();
    }

}