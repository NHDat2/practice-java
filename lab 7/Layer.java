/**
* Layer
* @author Nguyen Huu Dat
* @version 1.0
*/
import java.util.ArrayList;

public class Layer
{
    private ArrayList<Shape> arr;
    private boolean visible;
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
     * Remove all the Rectangle off the Layer
     */
    public void removeRectangle()
    {
        for(int i = 0; i< arr.size(); i++)
        {
            if(arr.get(i) instanceof Rectangle)
            {
                arr.remove(i);
                i--;
            }
        }
    }
    /**
     * Remove all the Square off the Layer
     */
    public void removeSquare()
    {
        for(int i = 0; i< arr.size(); i++)
        {
            if(arr.get(i) instanceof Square)
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
    /**
    * set visible
    * @param ablibilyApear
    * @return none
    */

    public void setVisible(boolean ablibilyAppear)
    {
    	this.visible = ablibilyAppear;
    }
    /**
    * get visible
    * @param none
    * @return true/false
    */
    public boolean getVisible()
    {
    	return this.visible;
    }
    
    public void removeDuplicateShape()
    {
        for (int i = 0; i < arr.size() - 1; i++)
        {
            for (int j = i + 1; j < arr.size(); j++)
            {
                if (arr.get(i) instanceof Circle && arr.get(j) instanceof Circle)
                {
                    Circle tempi = (Circle) arr.get(i);
                    Circle tempj = (Circle) arr.get(j);
                    if ((arr.get(i).getX() == arr.get(j).getX() && arr.get(i).getY() == arr.get(j).getY()) && (tempi.getRadius() == tempj.getRadius()))
                    {
                        removeCircle();
                    }
                    
                }
                if (arr.get(i) instanceof Rectangle && arr.get(j) instanceof Rectangle)
                {
                    Rectangle tempi = (Rectangle) arr.get(i);
                    Rectangle tempj = (Rectangle) arr.get(j);
                    if ((arr.get(i).getX() == arr.get(j).getX() && arr.get(i).getY() == arr.get(j).getY()) && (tempi.getWidth() == tempj.getWidth()) && (tempi.getHeight() == tempj.getHeight()))
                    {
                        removeRectangle();
                    }                    
                }
                if (arr.get(i) instanceof Square && arr.get(j) instanceof Square)
                {
                    Square tempi = (Square) arr.get(i);
                    Square tempj = (Square) arr.get(j);
                    if ((arr.get(i).getX() == arr.get(j).getX() && arr.get(i).getY() == arr.get(j).getY()) && (tempi.getHeight() == tempj.getHeight()))
                    {
                        removeSquare();
                    }                    
                }
                if (arr.get(i) instanceof Triangle && arr.get(j) instanceof Triangle)
                {
                    Triangle tempi = (Triangle) arr.get(i);
                    Triangle tempj = (Triangle) arr.get(j);
                    if ((arr.get(i).getX() == arr.get(j).getX() && arr.get(i).getY() == arr.get(j).getY()) && (tempi.getA() == tempj.getA()) && (tempi.getB() == tempj.getB()) && (tempi.getC() == tempj.getC()))
                    {
                        removeTriangle();
                    }                    
                }
            }
        }
    }

}