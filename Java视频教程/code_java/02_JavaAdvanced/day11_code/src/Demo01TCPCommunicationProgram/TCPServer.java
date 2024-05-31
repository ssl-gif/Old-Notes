
/*

    java.net.ServerSocket类实现服务器套接字，TCP通信的服务器端：接收客户端的请求，读取客户端发送的数据，给客户端回写数据

1.构造方法：

    public ServerSocket(int port)：创建绑定到指定端口的服务器套接字

创建一个ServerSocket对象，就是创建一个服务器端程序，操作系统会为其开一个进程并分配指定的端口号

2.成员方法：

    public Socket accept()：监听并接收到此套接字的连接，该方法会一直阻塞直到建立连接
    public void close()：关闭此套接字

(1).accept方法会监听服务端程序(后台进程)的端口号，使程序一直阻塞在这里等待客户端的连接请求，当有一个客户端发出连接请求后，
就会被accept方法监听到，这时accept方法就会获取到请求的客户端对象Socket，在经过三次握手交互后完成连接，此时服务器端程序才
会向下执行。所以当多个客户端同时和服务器端进行交互时，服务器端要想知道是哪个客户端发出的请求，可以调用accept方法监听并获取
请求的客户端对象Socket。
(2).服务器端是没有IO流的，服务器端是使用每个客户端Socket提供的IO流来和客户端进行数据交互，即使用客户端的网络字节输入流读
取客户端发送的数据，使用客户端的网络字节输出流给客户端回写数据

3.TCP通信程序服务器端代码实现步骤：

(1).创建服务器ServerSocket对象和系统要指定的端口号

(2).使用ServerSocket对象中的accept方法，获取到请求的客户端对象Socket

(3).使用Socket对象中的方法getInputStream()方法获取网络字节输入流InputStream对象
(4).使用网络字节输入流InputStream对象中的read方法，读取客户端发送的数据

(5).使用Socket对象中的方法getOutputStream()方法获取网络字节输出流OutputStream对象
(6).使用网络字节输出流OutputStream对象中的write方法，给客户端回写数据

(7).调用close方法关闭客户端、服务器端套接字(Socket、ServerSocket对象)，释放资源

 */
package Demo01TCPCommunicationProgram;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {

        // (1).创建服务器ServerSocket对象和系统要指定的端口号
        ServerSocket serverSocket = new ServerSocket(8888);

        // (2).使用ServerSocket对象中的accept方法，获取到请求的客户端对象Socket
        Socket clientSocket = serverSocket.accept();

        // (3).使用Socket对象中的方法getInputStream()方法获取网络字节输入流InputStream对象
        InputStream is = clientSocket.getInputStream();

        // (4).使用网络字节输入流InputStream对象中的read方法，读取客户端发送的数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));

        // (5).使用Socket对象中的方法getOutputStream()方法获取网络字节输出流OutputStream对象
        OutputStream os = clientSocket.getOutputStream();

        // (6).使用网络字节输出流OutputStream对象中的write方法，给客户端回写数据
        os.write("收到，谢谢！".getBytes());

        // (7).调用close方法关闭客户端、服务器端套接字(Socket、ServerSocket对象)，释放资源
        clientSocket.close();
        serverSocket.close();

    }
}