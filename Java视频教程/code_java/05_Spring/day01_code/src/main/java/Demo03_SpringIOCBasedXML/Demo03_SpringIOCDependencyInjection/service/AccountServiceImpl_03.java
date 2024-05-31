package Demo03_SpringIOCBasedXML.Demo03_SpringIOCDependencyInjection.service;

import java.util.*;

// 账户的业务层实现类：复杂类型、集合类型的数据注入
public class AccountServiceImpl_03 implements IAccountService {

    private String[] array;
    private List<String> list;
    private Set<String> set;
    private Map<String, String> map;
    private Properties properties;

    public void setArray(String[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public void saveAccount() {
        System.out.println(Arrays.toString(array));
        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
        System.out.println(properties);
    }

}
