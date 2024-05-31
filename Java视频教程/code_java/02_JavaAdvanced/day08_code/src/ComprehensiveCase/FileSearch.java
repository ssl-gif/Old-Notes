
// 文件搜索：使用递归打印多级目录下的所有文件名称时，只打印以.java结尾的文件、文件夹(过滤文件)

package ComprehensiveCase;

import java.io.File;

public class FileSearch {
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
                // 如果是以.java结尾的文件则打印输出
                if (f.getName().endsWith(".java")) {
                    System.out.println(f);
                }
            }
        }
    }
}
