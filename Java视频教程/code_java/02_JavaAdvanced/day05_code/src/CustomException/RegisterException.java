
/*
    java中不同的异常类，分别表示着某一种具体的异常情况。但是在开发中总有些异常情况是SUN没有定义好的，
此时就需要我们根据自己业务的异常情况来自定义异常类，例如年龄负数问题、考试成绩负数问题等等。

                public class XXXException extends Exception | RuntimeException{
                    // 添加一个空参数的构造方法
                    // 添加一个带异常信息的构造方法
                }

#.注意事项：

(1).自定义异常类一般都是以Exception结尾，说明该类是一个异常类

(2).自定义异常类必须继承Exception或者RuntimeException
        继承Exception：那么自定义的异常类就是一个编译期异常
        继承RuntimeException：那么自定义的异常类就是一个运行期异常

 */
package CustomException;

public class RegisterException extends Exception {

    public RegisterException() {
    }

    // 所有的异常类带有异常信息的有参构造方法，都会在方法内部会调用父类带有异常信息的有参构造方法，让父类来处理这个异常信息
    public RegisterException(String message) {
        super(message);
    }

}

