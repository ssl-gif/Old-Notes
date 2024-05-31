package Demo03LambdaExpression.Demo02Pratice;

import java.util.Comparator;

public class ComparatorImpl implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
    }
}
