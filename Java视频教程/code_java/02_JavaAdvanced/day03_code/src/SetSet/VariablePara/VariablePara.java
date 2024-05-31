
/*

	可变参数是 JDK1.5 之后出现的新特性，如果一个方法的参数列表有多个相同数据类型的参数，
那么可以简化成如下格式：
                    修饰符 返回值类型 方法名(数据类型...变量名){ }

可变参数底层是一个数组，根据传递参数个数的不同，会创建不同长度的数组来存储这些参数。

#.注意事项：
a.一个方法的参数列表，只能有一个可变参数
b.如果方法的参数有多个，那么可变参数必须写在参数列表的末尾
c.不仅可以传递多个相同类型的数据给可变参数，还可以直接传递一个数组给可变参数

 */
package SetSet.VariablePara;

public class VariablePara {
    public static void main(String[] args) {

        // 传递多个相同类型的数据给可变参数
        add();
        add(10);
        add(10, 20);
        add(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);

        // 直接传递一个数组给可变参数
        int[] array = {10, 20, 30};
        add(array);

    }

    /*
    定义计算0-n个整数的和的方法，参数类型一样，参数个数不确定
        add(); 就会创建一个长度为0的数组，即 int arr = new int[0];
        add(10); 就会创建一个长度为1的数组，即 int arr = new int[]{10};
        add(10, 20); 就会创建一个长度为2的数组，即 int arr = new int[]{10, 20};
        add(array);就会创建一个长度为3的数组，即 int arr = array;
     */
    public static int add(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
