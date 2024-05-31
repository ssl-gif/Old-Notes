package Demo03CommonFunctionalInterface.Demo02ConsumerInterface.Demo02ConsumerInterfaceDefaultMethod;

import java.util.function.Consumer;

public class ConsumerImpl02 implements Consumer<String> {
    // 制定数据的消费规则：将字符串转换成小写形式输出
    @Override
    public void accept(String s) {
        System.out.println(s.toLowerCase());
    }
}
