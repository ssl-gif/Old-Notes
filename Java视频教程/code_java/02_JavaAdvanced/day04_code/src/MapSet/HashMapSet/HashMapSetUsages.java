package MapSet.HashMapSet;

import java.util.HashMap;

public class HashMapSetUsages {
    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        map.put("a","d");
        System.out.println(map); // {a=d, b=b, c=c} key不允许重复，无序

    }
}
