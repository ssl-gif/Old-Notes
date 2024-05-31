
// 文件上传案例服务器端代码实现：读取客户端上传的文件，保存到服务器的硬盘，给客户端回写"上传成功"信息
package Demo02ComprehensiveCase.Demo01FileUploadCase;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {

        // (1).创建一个服务器ServerSocket对象，和系统要指定的端口号
        ServerSocket serverSocket = new ServerSocket(8888);

        // (2).使用ServerSocket对象中的accept方法获取到请求的客户端Socket对象
        Socket clientSocket = serverSocket.accept();

        // (3).使用Socket对象中的getInputStream方法获取到网络字节输入流InputStream对象
        InputStream is = clientSocket.getInputStream();

        // (4).创建一个本地文件字节输出流FileOutputStream对象，构造方法中绑定要输出的目的地
        FileOutputStream fos = new FileOutputStream("day11_code\\src\\Demo02ComprehensiveCase\\Demo01FileUploadCase\\test_copy.jpg");

        // (5).使用网络字节输入流InputStream对象中的read方法读取客户端上传的文件，并使用本地文件字节输出流FileOutputStream对象中的write方法把读取到的文件保存到服务器硬盘上
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = is.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

        // (6).使用Socket对象中的getOutputStream方法获取到网络字节输出流OutputStream对象
        OutputStream os = clientSocket.getOutputStream();

        // (7).使用网络字节输出流OutputStream对象中的write方法给客户端回写"上传成功"信息
        os.write("上传成功".getBytes());

        // (8).释放资源(FileOutputStream、Socket、ServerSocket对象)
        fos.close();
        clientSocket.close();
        serverSocket.close();

    }
}
