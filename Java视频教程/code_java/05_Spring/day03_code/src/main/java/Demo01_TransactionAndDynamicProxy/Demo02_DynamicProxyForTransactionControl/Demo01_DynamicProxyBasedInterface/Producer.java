package Demo01_TransactionAndDynamicProxy.Demo02_DynamicProxyForTransactionControl.Demo01_DynamicProxyBasedInterface;

public class Producer implements IProducer {

    public String saleProduct(float money) {
        return "此产品卖了" + money + "元";
    }

}
