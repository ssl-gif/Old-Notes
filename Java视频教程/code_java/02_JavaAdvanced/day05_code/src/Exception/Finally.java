
/*

    当try中捕获到异常时，产生异常的那行代码后的所有语句都不会被执行。而且有时异常会引发程序的跳转，导致
try...catch后面的代码执行不到。当我们想让某些代码无论是否有异常都会被执行时，就可以使用finally代码块。

                        try {
                            // 可能产生异常的代码
                        } catch (定义一个异常变量，用来接收try中抛出的异常对象){
                            // 异常的处理逻辑
                        }
                        ...
                        catch (异常类型 变量名) {

                        } finally {
                            // 无论是否出现异常都会执行
                        }

#.注意事项：

(1).finally不能单独使用，必须和try...catch一起使用

(2).finally一般用于资源释放(资源回收)，当我们在try语句块中打开了一些物理资源(磁盘文件、网络连接、数据库连接等)，无论是否产生异常，我们都得在使用完之后，关闭打开的资源。

 */

package Exception;

import java.io.IOException;

public class Finally {
    public static void main(String[] args) {

        try {
            readFile("c://a.md");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("无论是否出现异常都会被执行！");
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
