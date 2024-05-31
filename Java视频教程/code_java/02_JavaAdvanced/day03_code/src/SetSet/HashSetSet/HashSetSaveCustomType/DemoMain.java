package SetSet.HashSetSet.HashSetSaveCustomType;

import java.util.HashSet;

public class DemoMain {
    public static void main(String[] args) {

        HashSet<Person> hashSet = new HashSet<>();
        Person p1 = new Person("张三", 18);
        Person p2 = new Person("张三", 18);
        Person p3 = new Person("张三", 30);
        Person p4 = new Person("李四", 30);

        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        hashSet.add(p4);

        System.out.println(hashSet); // Person{name='张三', age=18}, Person{name='张三', age=30}, Person{name='李四', age=30}]  保证了对象不重复

        System.out.println(p1.hashCode()); // 24022538
        System.out.println(p2.hashCode()); // 24022538  重写了hashCode()方法后，属性相同的对象哈希值也一样
        System.out.println(p3.hashCode()); // 24022550
        System.out.println(p4.hashCode()); // 26104882

    }
}
