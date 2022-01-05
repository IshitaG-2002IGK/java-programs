import java.util.*;
public class reverseArray
{
    static void reverse(Integer a[])
    {
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));

    }

    public static void main(String[] args)
    {
        Integer [] a = {10,20,30,20,40,50};
        reverse(a);
    }
}