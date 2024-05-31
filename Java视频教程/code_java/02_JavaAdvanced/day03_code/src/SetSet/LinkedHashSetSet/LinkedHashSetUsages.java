package SetSet.LinkedHashSetSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetUsages {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("itcast");
        System.out.println(set);    // [abc, www, itcast]  无序，不允许重复

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("www");
        linked.add("abc");
        linked.add("abc");
        linked.add("itcast");
        System.out.println(linked); // [www, abc, itcast]  有序，不允许重复
    }
}
