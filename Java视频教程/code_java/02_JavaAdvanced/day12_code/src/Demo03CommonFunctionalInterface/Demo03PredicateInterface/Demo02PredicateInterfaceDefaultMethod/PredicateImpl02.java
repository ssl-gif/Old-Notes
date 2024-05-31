package Demo03CommonFunctionalInterface.Demo03PredicateInterface.Demo02PredicateInterfaceDefaultMethod;

import java.util.function.Predicate;

public class PredicateImpl02 implements Predicate<String> {
    // 制定数据的条件判断规则：字符串的长度是否包含字母a
    @Override
    public boolean test(String s) {
        return s.contains("a");
    }
}
