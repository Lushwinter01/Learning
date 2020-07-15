package javacore.collection;

import java.util.*;

/**
 * @author LushWinter (ahbbhywmd@163.com)
 * @Description
 * @create 2020-03-09
 */
public class LearnCollectionUtils {
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(9);
        list.add(7);
        System.out.println(list);
        Set<Integer> set = new HashSet<Integer>(list);
        set.add(8);
        set.add(2);
        System.out.println(set);

        Collections.sort(list);
        System.out.println(list);



    }
}
