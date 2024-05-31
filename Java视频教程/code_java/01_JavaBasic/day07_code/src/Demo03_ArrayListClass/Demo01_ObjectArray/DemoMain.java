package Demo03_ArrayListClass.Demo01_ObjectArray;

public class DemoMain {
    public static void main(String[] args) {

        // 创建三个Student类的对象
        Student one = new Student("迪丽热巴", 18);
        Student two = new Student("古力娜扎", 28);
        Student three = new Student("玛尔扎哈", 38);

        // 创建一个长度为3的数组，用来保存上述Student类的三个对象，则此数组就称为对象数组
        Student[] array = new Student[3];

        // 数组存储对象：将对象的地址值保存到f数组元素中，则这三个数组元素分别指向上述三个对象
        array[0] = one;
        array[1] = two;
        array[2] = three;

        // 此时数组元素array[i]保存的是对象的堆内存地址值，是上述三个对象的引用
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            System.out.println("我叫：" + array[i].getName() + "，年龄：" + array[i].getAge());
        }

    }
}