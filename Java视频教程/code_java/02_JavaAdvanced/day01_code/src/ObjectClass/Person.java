package ObjectClass;

import java.util.Objects;

public class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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

    // 系统已经为我们重写好toString方法了：按照对象的属性得到相应的字符串表现形式
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 自己重写的equals方法
    /*
    @Override
    public boolean equals(Object obj) {

        if (obj == this) { // 如果传递的参数是this本身，直接返回true，提高程序的效率
            return true;
        }

        if (obj == null) { // 如果传递的参数是null，直接返回false，提高程序的效率
            return false;
        }

        // 防止出现类型转换异常 ClassCastException
        if (obj instanceof Person) {
            // 把obj向下转型为Person类型，便于使用子类特有的内容
            Person p = (Person) obj;
            return this.name.equals(p.name) && this.age == p.age;
        }
        return false;
    }
    */

    // 系统已经为我们重写好equals方法了，直接插入使用即可，建议使用(java7+)版本
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // getClass() != o.getClass() 使用反射技术，判断o是否是Person类型，等效于 obj instanceof Person
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

}
