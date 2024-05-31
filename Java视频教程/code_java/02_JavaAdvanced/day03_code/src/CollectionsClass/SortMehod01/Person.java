package CollectionsClass.SortMehod01;

public class Person implements Comparable<Person>{

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
    重写compareTo方法，在其中自定义排序的规则
        return this.getAge() - o.getAge();  按照年龄升序排序
        return o.getAge() - this.getAge();  按照年龄降序排序
        return 0;                           默认二者相同
     */
    @Override
    public int compareTo(Person o) {
        return this.getAge() - o.getAge();
    }

}
