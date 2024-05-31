package Demo02_Encapsulation;

public class DemoMain {
    public static void main(String[] args) {

        // 调用无参构造方法创建对象
        Student stu1 = new Student();
        stu1.setName("迪丽热巴");
        stu1.setAge(20);
        System.out.println("姓名：" + stu1.getName() + "，年龄：" + stu1.getAge());

        // 调用有参构造方法创建对象
        Student stu2 = new Student("古力娜扎", 22);
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());

    }
}
