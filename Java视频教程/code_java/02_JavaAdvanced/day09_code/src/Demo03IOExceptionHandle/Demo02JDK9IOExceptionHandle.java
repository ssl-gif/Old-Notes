
/*

JDK9新特性：

    在try的前边可以定义流对象，在try后边的()中直接引入流对象的名称(变量名)。当try{}中的代码执行完毕之后，流对象也会自动释放掉，
不需要在finally代码块中调用close()方法。

                                        A a = new A();
                                        B b = new B();
                                        try(a; b) {
                                            // 可能会产生异常的代码
                                        } catch(异常类变量 变量名) {
                                            // 异常处理逻辑
                                        }

 */
package Demo03IOExceptionHandle;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02JDK9IOExceptionHandle {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("day09_code\\test.jpg");
        FileOutputStream fos = new FileOutputStream("day09_code\\test_copy.jpg");

        try (fis; fos) {

            byte[] bytes = new byte[1024];
            int length = 0;
            while ((length = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, length);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
