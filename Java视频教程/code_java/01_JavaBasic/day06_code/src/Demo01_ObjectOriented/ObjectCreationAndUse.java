package Demo01_ObjectOriented;

// 2.对象的创建与使用
public class ObjectCreationAndUse {
    public static void main(String[] args) {

        // 根据Student类，创建了一个名为stu的对象
        Student stu = new Student();

        // 访问成员变量
        stu.name = "赵丽颖";
        stu.age = 18;
        System.out.println(stu.name); // 赵丽颖
        System.out.println(stu.age);  // 18

        // 访问成员方法
        stu.eat();
        stu.sleep();
        stu.study();

    }
}
