
/*

JDK7的新特性：

    在try的后边可以增加一个()，可以在括号中定义流对象。那么这个流对象的作用域就在try代码块中有效，当try{}中的代码执行完毕时，
会自动把流对象释放，不需要在finally代码块中调用close()方法。

                                    try(定义流对象; 定义流对象....){
                                        // 可能会产生异常的代码
                                    }catch(异常类变量 变量名){
                                        // 异常处理逻辑
                                    }

 */
package Demo03IOExceptionHandle;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01JDK7IOExceptionHandle {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("day09_code\\test.jpg");
             FileOutputStream fos = new FileOutputStream("day09_code\\test_copy.jpg")) {

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
