
/*

泛型通配符的高级使用---受限泛型

泛型的上限限定： <? extends E>  代表使用的泛型只能是E类型的子类、本身
泛型的下限限定： <? super E>    代表使用的泛型只能是E类型的父类、本身

 */

package Demo03Generic.Demo03GenericWildcard;

import java.util.ArrayList;
import java.util.Collection;

public class DemoMain02 {
    public static void main(String[] args) {

        Collection<Integer> list1 = new ArrayList<Integer>();
        Collection<Number> list2 = new ArrayList<Number>();
        Collection<String> list3 = new ArrayList<String>();
        Collection<Object> list4 = new ArrayList<Object>();

        getElement1(list1);
        getElement1(list2);
//      getElement1(list3); // 报错
//      getElement1(list4); // 报错

//      getElement2(list1); // 报错
        getElement2(list2);
//      getElement2(list3); // 报错
        getElement2(list4);

    }

    // 泛型的上限：此时的泛型?，只能是Number类型或者Number类型的子类
    public static void getElement1(Collection<? extends Number> coll){}

    // 泛型的下限：此时的泛型?，只能是Number类型或者Number类型的父类
    public static void getElement2(Collection<? super Number> coll){}

}

/*
    类与类之间的继承关系：
                        Integer extends Number extends Object
                        String extends Object
 */