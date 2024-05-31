
// 我们前面所说的list()、listFiles()方法只能遍历文件夹的子文件夹、子文件名称，下面我们使用递归打印多级目录下的所有文件名称

package Recursive;

import java.io.File;

public class RecursivePrintDirectory {
    public static void main(String[] args) {

        File file = new File("E:\\code_ssl\\advanced_code\\day08_code\\src\\FileClass");
        getAllFile(file);

    }

    private static void getAllFile(File dir) {

        // 遍历该目录下的文件、文件夹名称存储到File[]数组中
        File[] files = dir.listFiles();

        // 遍历该File[]数组
        for (File f : files) {
            // 判断该路径是否是文件夹
            if (f.isDirectory()) {
                // 如果是一个文件夹，则继续递归调用getAllFile方法遍历这个文件夹
                getAllFile(f);
            } else {
                // 否则直接打印输出即可
                System.out.println(f);
            }
        }
    }

}
