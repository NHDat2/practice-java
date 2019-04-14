/**
* Layer
* @author Nguyen Huu Dat
* @version 1.0
*/
import java.util.ArrayList;

public class Layer
{
    private ArrayList<Shape> arr;
    public Layer(ArrayList<Shape> arr)
    {
        this.arr = arr;
    }

    /**
     * Remove all the Triangle off the Layer
     */
    public void removeTriangle()
    {
        for(int i = 0; i< arr.size(); i++)
        {
            if(arr.get(i) instanceof Triangle)
            {
                arr.remove(i);
                i--;
            }
        }
    }

    /**
     * Remove all the Circle off the Layer
     */
    public void removeCircle()
    {
        for(int i = 0; i< arr.size(); i++)
        {
            if(arr.get(i) instanceof Circle)
            {
                arr.remove(i);
                i--;
            }
        }
    }

    /**
     * Print all Shape in the Layer
     */
    public void print()
    {
        for(int i = 0; i < arr.size(); i++)
        {
            System.out.println(arr.get(i));
        }
    }   

}