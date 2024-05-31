package SetSet.HashSetSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetUsages {
    public static void main(String[] args) {

        // 创建一个Set集合对象，形成多态
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);

        System.out.println(set); // [1, 2, 3]  不能存储重复元素，且存取无序


        // Set系集合有两种遍历方式

        // a.使用迭代器遍历
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            Integer n = it.next();
            System.out.println(n);
        }

        // b.使用增强for遍历
        for (Integer i : set) {
            System.out.println(i);
        }

    }
}
