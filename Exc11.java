package Exc11;

import java.util.HashSet;
import java.util.Set;

public class Exc11
{
    public static void main(String[] args)
    {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(1);
        set2.add(2);
        set2.add(4);
        System.out.println(symmetricSetDifference(set1,set2));

    }
    private static Set<Integer> symmetricSetDifference (Set<Integer> set1, Set<Integer> set2)
    {
        Set<Integer> set = new HashSet<>();

        for (Integer i:set1)
        {
            if (!set2.contains(i))
            {
                set.add(i);
            }
        }
        for (Integer i:set2)
        {
            if (!set1.contains(i))
            {
                set.add(i);
            }
        }
        return set;
    }
}
