
// 文件上传案例的客户端代码实现：读取本地文件，上传到服务器，读取服务器回写的数据
package Demo02ComprehensiveCase.Demo01FileUploadCase;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {

        // (1).创建一个本地文件字节输入流FileInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("day11_code\\src\\Demo02ComprehensiveCase\\Demo01FileUploadCase\\test.jpg");

        // (2).创建一个客户端Socket对象，构造方法中绑定服务器的IP地址和端口号
        Socket clientSocket = new Socket("127.0.0.1", 8888);

        // (3).使用Socket中的getOutputStream方法获取网络字节输出流OutputStream对象
        OutputStream os = clientSocket.getOutputStream();

        // (4).使用本地文件字节输入流FileInputStream对象中的read方法读取本地文件，并使用网络字节输出流OutputStream对象中的write方法把读取到的文件上传到服务器
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            os.write(bytes, 0, len);
        }

        // 调用shutdownOutput方法：对于TCP套接字，任何以前写入的数据都将被发送，并且后跟TCP的正常连接终止序列
        clientSocket.shutdownOutput();

        // (5).使用Socket中的getInputStream方法获取网络字节输入流InputStream对象
        InputStream is = clientSocket.getInputStream();

        // (6).使用网络字节输入流InputStream对象中的read方法读取服务器端回写的数据
        while ((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }

        // (7).释放资源(FileInputStream、Socket对象)
        fis.close();
        clientSocket.close();

    }
}
