package Demo02_StaticKeyWord.Demo01_StaticField;

public class DemoStudent {
    public static void main(String[] args) {

        // 使用类名调用静态成员变量
        Student.room = "101教室";

        Student one = new Student("郭靖", 20);
        System.out.println("姓名：" + one.getName());
        System.out.println("年龄：" + one.getAge());
        System.out.println("教室：" + Student.room);

        Student two = new Student("黄蓉", 18);
        System.out.println("姓名：" + two.getName());
        System.out.println("年龄：" + two.getAge());
        System.out.println("教室：" + Student.room);

    }
}
