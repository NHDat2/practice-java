/**
* Template2
* @author Nguyen Huu Dat
* @version 1.0
*/
import java.util.*;

public class Template2
{
	public static <T extends Comparable<T>> T max(ArrayList<T> ar)
	{
		T m = ar.get(0);
		for (T value : ar)
		{
			if (m.compareTo(value) < 0)
			{
				m = value;
			}
		}
		return m;
	}
	public static void main(String[] args)
	{
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(2);
		ar1.add(4);
		ar1.add(1);
		ar1.add(2);
		ar1.add(10);
		ar1.add(7);


		ArrayList<Character> ar2 = new ArrayList<Character>();
		ar2.add('C');
		ar2.add('A');
		ar2.add('E');
		ar2.add('B');
		ar2.add('D');
		ar2.add('F');

		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("sdCf");
		ar3.add("Aas");
		ar3.add("asdw");
		ar3.add("esdfB");
		ar3.add("defef");
		ar3.add("asdfwd");
        System.out.print(max(ar1) + "\n");
        System.out.print(max(ar2) + "\n");
        System.out.print(max(ar3) + "\n");
	}
}