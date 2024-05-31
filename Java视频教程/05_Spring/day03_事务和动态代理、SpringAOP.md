# day03_事务和动态代理、SpringAOP



## 一.事务和动态代理

​	转账案例的实现：在之前 "使用SpringIOC实现对账户表的CRUD-基于XML配置" 的案例中，我们实现了对单表的CRUD操作。下面我们将在此案例的基础之上，进一步完善这个案例，在其中添加转账的方法，实现两个账户之间的转账操作。

​	转账案例的分析：在完成上述转账的案例之后，我们发现：如果在 "更新转出账户的余额" 这一步骤后发生了异常，那么后续 "更新转入账户的余额" 这一步骤将不再会执行。此时转出账户的余额已经减少、但转入账户的余额却没有增加，那么转账操作就出现了问题。

```java
// 实现转账方法
public void transfer(String sourceName, String targetName, Float money) {

    // ①.根据名称查询要转出、转入的账户
    Account sourceAccount = accountDao.findAccountByName(sourceName).get(0);
    Account targetAccount = accountDao.findAccountByName(targetName).get(0);

    // ②.设置转出、转入账户的金额
    sourceAccount.setMoney(sourceAccount.getMoney() - money);
    targetAccount.setMoney(targetAccount.getMoney() + money);

    // ③.更新转出、转入账户的金额
    accountDao.updateAccount(sourceAccount);
    int i = 1 / 0; // 模拟转账异常
    accountDao.updateAccount(targetAccount);

}
```

​	在上述转账操作中，每一条SQL语句的执行都会创建一个单独的数据库连接Connection，由于每个Connection都有一个独立的事务，所以每一条SQL语句的执行都会被一个独立的事务进行管理。如果我们将所有的转账操作使用同一个数据库连接Connection来执行，那么这些操作就可以被同一个事务进行管理，所以操作要么同时成功，要么同时失败。这样就可以解决上述案例中出现的转账异常问题。



### 1.使用事务来解决转账案例中的异常问题

​	可以使用 ThreadLocal<> 将数据库连接Connection和线程绑定，这样在执行转账操作时，就可以使用当前线程上的同一个Connection来执行所有的SQL语句，同时还可以用当前线程上的Connection对这些SQL语句进行事务管理，实现所有转账操作被同一个事务管理的目的。[待学完JDBC、DBUtils、ThreadLocal后再进行补充]

### 2.使用动态代理来实现事务控制

​	动态代理：在程序运行期间，创建目标对象的代理对象，并对目标对象中的方法进行增强的一种技术。即：如果我们想在不修改源码的基础之上，对目标对象的方法做一个增强补充，就可以使用动态代理来创建一个代理对象，再对目标对象的方法做一个增强补充。

#### (1).基于接口的动态代理

#### (2).基于子类的动态代理

#### (3).使用动态代理来实现事务控制



## 二、SpringAOP

### 1.基于XML的SpringAOP

### 2.SpringAOP的通知类型

### 3.基于注解的SpringAOP

### 4.基于纯注解的SpringAOP

### 5.使用SpringAOP来实现事务控制
