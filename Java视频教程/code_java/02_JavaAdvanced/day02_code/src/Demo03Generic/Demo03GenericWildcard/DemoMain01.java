
// 泛型通配符的基本使用
package Demo03Generic.Demo03GenericWildcard;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoMain01 {
    public static void main(String[] args) {

        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");

        printArray(list01);
        printArray(list02);

        // ArrayList<?> list03 = new ArrayList<?>(); 泛型通配符不能在定义时使用，只能用在方法的参数中

    }

    /*
        定义一个方法，能遍历所有类型的ArrayList集合
        此时我们不知道ArrayList集合使用什么数据类型，可以使用泛型的通配符 ? 来接收多个数据类型
     */
    public static void printArray(ArrayList<?> list){
        Iterator<?> it = list.iterator();
        while(it.hasNext()){
            Object obj = it.next(); // 此时next()方法返回的数据是Object类型
            System.out.println(obj);
        }
    }

}
