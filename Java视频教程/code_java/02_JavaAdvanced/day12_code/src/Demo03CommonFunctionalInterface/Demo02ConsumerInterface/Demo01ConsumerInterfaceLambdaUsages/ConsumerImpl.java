package Demo03CommonFunctionalInterface.Demo02ConsumerInterface.Demo01ConsumerInterfaceLambdaUsages;

import java.util.function.Consumer;

public class ConsumerImpl implements Consumer<String> {
    // 制定数据的消费规则：将字符串转换成大写形式输出
    @Override
    public void accept(String s) {
        System.out.println(s.toUpperCase());
    }
}
