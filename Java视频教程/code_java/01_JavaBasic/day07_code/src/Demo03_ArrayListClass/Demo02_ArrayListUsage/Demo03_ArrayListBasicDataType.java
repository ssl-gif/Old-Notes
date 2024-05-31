package Demo03_ArrayListClass.Demo02_ArrayListUsage;

import java.util.ArrayList;

public class Demo03_ArrayListBasicDataType {
    public static void main(String[] args) {

        // 使用包装类Integer，创建一个ArrayList<E>集合类的对象list，用来存储int类型数据
        ArrayList<Integer> list = new ArrayList<>();

        // 自动装箱
        list.add(10);
        list.add(20);

        // 自动拆箱
        int num = list.get(1);

        System.out.println(list); // [10, 20]

    }
}
