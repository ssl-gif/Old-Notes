
/*

File类创建、删除功能的方法：

public boolean createNewFile() throws IOException：当且仅当具有该名称的文件尚不存在时，会创建一个新的空文件
                                                   文件尚不存在，会创建文件并返回true
                                                   文件存在，则不会创建并返回false

(1).此方法只能创建文件，不能创建文件夹
(2).此方法声明抛出了异常IOException，我们调用这个方法时必须处理这个异常，要么throws，要么try...catch
(3).创建文件的路径必须存在，否则会抛出异常IOException


public boolean mkdir()：创建单级空文件夹
public boolean mkdirs()：既可以创建单级空文件夹，也可以创建多级文件夹
                        文件夹不存在，会创建文件夹并返回true
                        文件夹存在，则不会创建并返回false；构造方法中的路径不存在也会返回false

public boolean delete()：删除由此File表示的文件或目录
                        文件、文件夹删除成功，返回true
                        文件夹中有内容，不会删除返回false；构造方法中的路径不存在也会返回false

#.注意：delete方法是直接在硬盘删除文件、文件夹、不走回收站，删除要谨慎

 */

package FileClass.CommonMemberMethod;

import java.io.File;
import java.io.IOException;

public class CreatAndDeleteFunctionMethod {
    public static void main(String[] args) {
    }

    // createNewFile()方法
    private static void demo01() {

        File f1 = new File("E:\\code_ssl\\advanced_code\\day08_code\\src\\FileClass\\123.txt");
        try {
            System.out.println(f1.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        File f2 = new File("E:\\code_ssl\\advanced_code\\day08_code\\src\\FileClassClass\\123.txt");
        try {
            System.out.println(f2.createNewFile()); // 路径不存在抛出异常IOException
        } catch (IOException e) {
            e.printStackTrace();
        }

        File f3 = new File("E:\\code_ssl\\advanced_code\\day08_code\\src\\FileClassClass\\123");
        try {
            System.out.println(f3.createNewFile()); // 不要被名称所迷惑，创建的仍然是一个名为"123"的文件
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // mkdir()、mkdirs()方法
    private static void demo02() {

        File f1 = new File("E:\\code_ssl\\advanced_code\\day08_code\\src\\FileClass\\aaa");
        System.out.println(f1.mkdir()); // true

        File f2 = new File("E:\\code_ssl\\advanced_code\\day08_code\\src\\FileClass\\aaa\\bbb\\ccc");
        System.out.println(f2.mkdirs()); // true

        File f3 = new File("E:\\code_ssl\\advanced_code\\day08_code\\src\\FileClassClass\\aaa");
        System.out.println(f3.mkdir()); // false    路径不存在

        File f4 = new File("E:\\code_ssl\\advanced_code\\day08_code\\src\\FileClassClass\\aaa.txt");
        System.out.println(f4.mkdir()); // 不要被名称所迷惑，创建的仍然是一个名为"aaa.txt"的文件夹

    }

    // delete()方法
    private static void demo03() {

        File f1 = new File("E:\\code_ssl\\advanced_code\\day08_code\\src\\FileClass\\aaa");
        System.out.println(f1.delete()); // true

        File f2 = new File("E:\\code_ssl\\advanced_code\\day08_code\\src\\FileClassClass\\aaa");
        System.out.println(f2.delete()); // false   路径不存在

    }

}
