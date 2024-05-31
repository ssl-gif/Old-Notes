package Demo03_ArrayListClass.Demo02_ArrayListUsage;

import Demo03_ArrayListClass.Demo01_ObjectArray.Student;

import java.util.ArrayList;

public class Demo02_ArrayListObject {
    public static void main(String[] args) {

        // 创建三个Student类的对象
        Student one = new Student("迪丽热巴", 18);
        Student two = new Student("古力娜扎", 28);
        Student three = new Student("玛尔扎哈", 38);

        // 泛型是引用数据类型"Student类"，则list集合用来存储"Student类"这一数据类型的数据，即Student类的对象
        ArrayList<Student> list = new ArrayList<>();

        // 将对象存储到list集合中，是将引用类型变量存储到集合中
        list.add(one);
        list.add(two);
        list.add(three);

        /*
        由于list集合里面存储的是引用类型变量，则直接打印对象名list，得到的是如下地址值：
        [Demo03_ArrayListClass.Demo01_ObjectArray.Student@75412c2f, Demo03_ArrayListClass.Demo01_ObjectArray.Student@282ba1e, Demo03_ArrayListClass.Demo01_ObjectArray.Student@13b6d03]
         */
        System.out.println(list);

        // 遍历"Student类"类型的list集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + "，年龄：" + stu.getAge());
        }

    }
}
