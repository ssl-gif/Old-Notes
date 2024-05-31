
/*

(1).获取Collection集合的迭代器：
    Collection接口继承了Iterator接口中的iterator()方法，那么其实现类都要重写iterator()
方法。使用实现类对象调用iterator()方法，会返回一个Iterator接口的实现类对象，即该集合上的
一个迭代器。

(2).Iterator接口两个常用的方法：
public E next()：取出集合中的下一个元素
public boolean hasNext()：判断集合中还有没有下一个元素，有就返回true，没有就返回false

 */

package Demo02Iterator.Demo01IteratorInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoMain {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        /*
        (1).调用iterator方法返回一个Iterator接口的实现类对象，然后使用Iterator接口接收，形成多态
        (2).Iterator<E>接口也是有泛型的，集合是什么泛型，使用集合对象得到的迭代器就是什么泛型
         */
        Iterator<String> it = list.iterator();

        //往集合中添加元素
        list.add("姚明");
        list.add("科比");
        list.add("麦迪");

        // 循环迭代集合中的元素
        while (it.hasNext()) {
            String e = it.next();
            System.out.println(e);
        }

    }

    // 使用多态的方式获取集合的迭代器
    private static void demo(){

        Collection<String> coll = new ArrayList<>();
        Iterator<String> it = coll.iterator();
    }

}
