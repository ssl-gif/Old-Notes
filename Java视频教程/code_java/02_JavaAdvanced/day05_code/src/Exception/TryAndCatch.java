
/*

try...catch捕获异常：异常处理的第二种方式，自己处理异常不会向外抛出

                    try {
                        // 可能产生异常的代码
                    } catch (定义一个异常变量，用来接收try中抛出的异常对象){
                        // 异常的处理逻辑
                    }
                    ...
                    catch (异常类型 变量名) {

                    }

    如果try中产生了异常，那么就会将异常对象传递给catch，然后执行catch中的异常处理逻辑，执行完毕
catch中的处理逻辑，继续执行try...catch之后的代码。如果try中没有产生异常，那么就不会执行catch中
的代码，执行完try中的代码后，继续执行try...catch之后的代码。

#.注意事项：

(1).try中可能会抛出多个异常对象，那么就可以使用多个catch来接收处理这些异常对象

(2).如果try中的某行代码产生了异常，那么就直接跳转到catch中执行，这行代码之后的所有代码都不会再被执行。

(3).Throwable类中定义了3个对异常对象进行处理的方法：

            String getMessage()：返回此异常对象的简短描述
            String toString()：返回此异常对象的详细消息字符串(重写了Object类的toString方法)
            void printStackTrace()：将异常对象的详细信息打印到控制台(catch中的默认方法，打印了最详细的异常描述信息，JVM处理异常时就是调用的该方法)

 */

package Exception;

import java.io.IOException;

public class TryAndCatch {
    public static void main(String[] args) {

        try {
            readFile("c://a.md");
            System.out.println("如果产生了异常，这行代码是否会执行？"); // 产生异常后try中不会被执行的代码
        } catch (IOException e) {
            // System.out.println("捕获到的异常是：传递的文件后缀不是.txt");

            // System.out.println(e.getMessage()); // 文件的后缀名不对

            // System.out.println(e.toString()); // java.io.IOException: 文件的后缀名不对

            /*
            java.io.IOException: 文件的后缀名不对
	            at Exception.TryAndCatch.readFile(TryAndCatch.java:57)
	            at Exception.TryAndCatch.main(TryAndCatch.java:42)
             */
            e.printStackTrace();
        }

    }

    private static void readFile(String fileName) throws IOException {

        // 如果路径不是".txt"结尾，那么就抛出IO异常 IOException，告知方法的调用者
        if (!fileName.endsWith(".txt")) {
            throw new IOException("文件的后缀名不对");
        }

        System.out.println("文件路径没有问题，读取文件");

    }

}
