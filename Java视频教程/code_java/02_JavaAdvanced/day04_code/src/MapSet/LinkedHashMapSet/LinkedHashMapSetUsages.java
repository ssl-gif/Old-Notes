package MapSet.LinkedHashMapSet;

import java.util.LinkedHashMap;

public class LinkedHashMapSetUsages {
    public static void main(String[] args) {

        LinkedHashMap<String, String> linked = new LinkedHashMap<>();
        linked.put("a", "a");
        linked.put("c", "c");
        linked.put("b", "b");
        linked.put("a", "d");
        System.out.println(linked); // {a=d, c=c, b=b}  key不允许重复，有序

    }
}
