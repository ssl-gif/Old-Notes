
// 定义含有泛型的类
package Demo03Generic.Demo01GenericUsages.GenericClass;

public class GenericClass<E> {

    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

}
