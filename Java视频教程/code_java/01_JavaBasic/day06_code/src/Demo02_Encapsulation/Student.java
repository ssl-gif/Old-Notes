package Demo02_Encapsulation;

public class Student {

    private String name;
    private int age;

    // 无参数的构造方法
    public Student() {
    }

    // 有参数的构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // get、set方法
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
