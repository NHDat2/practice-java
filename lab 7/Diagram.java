/**
* Diagram
* @author Nguyen Huu Dat
* @version 1.0
*/
import java.util.*;

import java.util.ArrayList;

public class Diagram {
    private ArrayList<Layer> ar;

    public Diagram(ArrayList<Layer> ar)
    {
        this.ar = ar; 
    }

    /**
     * Remove all the Circle instance off the Diagram
     */
    public void removeCircle()
    {
        for(int i = 0; i < ar.size(); i++)
        {
            ar.get(i).removeCircle();
        }
    }

    /**
     * Print all Shape of the Diagram
     */
    public void print() {
        for(int i = 0; i < ar.size(); i++)
        {
            if (ar.get(i).getVisible())
            {
                ar.get(i).print();
                System.out.println();
            }
        }
    }
}