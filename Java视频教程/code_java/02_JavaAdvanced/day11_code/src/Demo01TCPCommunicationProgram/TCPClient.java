
/*

    java.net.Socket类实现客户端套接字，TCP通信的客户端：向服务器发送连接请求，给服务器发送数据，读取服务器回写的数据。

1.构造方法：

    public Socket(String host, int port)：创建客户端套接字对象并将其连接到指定主机上的指定端口号
    参数：
            String host：服务器主机的名称、服务器的IP地址(如果指定的host是null，则默认地址为本机回送地址)
            int port：服务器的端口号

(1).当我们创建客户端对象Socket的时候，就会向指定的服务器发送连接请求，并和服务器通过3次握手交互建立连接。这时如果服务器
没有启动，那么就会抛出ConnectException连接异常；如果服务器已经启动，那么就可以进行交互并建立连接了
(2).当我们创建客户端对象Socket的时候，会创建两个相应的网络字节输出流、输入流，用来向服务端发送、读取数据

2.成员方法：

    public OutputStream getOutputStream()：返回此套接字的输出流
    public InputStream getInputStream()：返回此套接字的输入流
    public void close()：关闭此套接字(同时会关闭该套接字的输入、输出流对象)
    public void shutdownOutput()：禁用此套接字的输出流(任何先前写出的数据将被发送，随后终止输出流)

可以调用getOutputStream、getInputStream方法来获取该套接字的网络字节输出、输入流，进而用这两个字节流向服务器发送、读取数据

3.TCP通信程序客户端代码实现步骤：

(1).创建一个客户端对象Socket，构造方法绑定服务器的IP地址和端口号

(2).使用Socket对象中的方法getOutputStream()获取网络字节输出流OutputStream对象
(3).使用网络字节输出流OutputStream对象中的write方法，给服务器发送数据

(4).使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
(5).使用网络字节输入流InputStream对象中的read方法，读取服务器回写的数据

(6).调用close方法关闭客户端套接字(Socket对象)，释放资源

 */
package Demo01TCPCommunicationProgram;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {

        // (1).创建一个客户端对象Socket，构造方法绑定服务器的IP地址和端口号
        Socket clientSocket = new Socket("127.0.0.1", 8888);

        // (2).使用Socket对象中的方法getOutputStream()获取网络字节输出流OutputStream对象
        OutputStream os = clientSocket.getOutputStream();

        // (3).使用网络字节输出流OutputStream对象中的write方法，给服务器发送数据
        os.write("你好，服务器！".getBytes());

        // (4).使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
        InputStream is = clientSocket.getInputStream();

        // (5).使用网络字节输入流InputStream对象中的read方法，读取服务器回写的数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));

        // (6).调用close方法关闭客户端套接字(Socket对象)，释放资源
        clientSocket.close();

    }
}
