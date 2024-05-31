package Demo02_StaticKeyWord.Demo01_StaticField;

public class Student {

    private String name; // 姓名
    private int age; // 年龄

    // 静态成员变量
    static String room; // 教室

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}