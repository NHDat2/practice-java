/**
* Template
* @author Nguyen Huu Dat
* @version 1.0
*/
public class Template
{
    public static <T extends Comparable<T>> void sort(T[] ar)
    {
        for (int i = 0; i < ar.length - 1 ; i++)
        {
            for (int j = i + 1; j < ar.length ; j++)
            {
                if (ar[i].compareTo(ar[j]) > 0)
                {
                    T temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        System.out.print("\n");
        for (T value : ar)
        {
            System.out.print(value + " ");
        }
        System.out.print("\n");

    }

    public static void main(String[] args)
    {
        Integer[] ar = {5, 6, 1, 9, 0, 10, 3};
        Character[] ar2 = {'a', 't', 'v', 'z', 'b', 'o'};
        String[] ar3 = {"asa", "ftg", "gv", "z", "eb", "ko"};
        sort(ar);
        sort(ar2);
        sort(ar3);
    }
}