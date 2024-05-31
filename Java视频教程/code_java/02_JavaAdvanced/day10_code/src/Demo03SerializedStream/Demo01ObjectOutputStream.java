
/*

    java.io.ObjectOutputStream extends OutputStream，是对象的序列化流。它会覆盖重写其父类OutputStream的所有成员方法，
并且ObjectOutputStream流对象对这些成员方法的使用，和另一个子类FileOutputStream流对象使用这些成员方法无异。

构造方法:
        ObjectOutputStream(OutputStream out) 创建写入指定 OutputStream 的 ObjectOutputStream。
        参数:
            OutputStream out:字节输出流
特有成员方法:
        void writeObject(Object obj) 将指定的对象写入 ObjectOutputStream。

 */
package Demo03SerializedStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {

        //1.创建ObjectOutputStream对象,构造方法中传递字节输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day10_code\\src\\Demo03SerializedStream\\Person.txt"));

        //2.使用ObjectOutputStream对象中的方法writeObject,把对象写入到文件中
        oos.writeObject(new Person("迪丽热巴",18));

        //3.释放资源
        oos.close();

    }
}
