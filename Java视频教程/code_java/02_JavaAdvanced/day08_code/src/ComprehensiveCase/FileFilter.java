
/*

    前面我们使用File类中的listFiles()方法对目录进行递归遍历，可以获得目录下所有文件的路径。然后在此基础上，我们
又使用文件搜索的方式对文件进行了过滤。其实在File类中有一个listFiles()方法的重载方法，该方法不仅可以对目录进行遍
历，还可以过滤掉不符合条件的文件。

                                File[] listFiles(FileFilter filter)

    java.io.FileFilter是一个文件过滤器接口，在使用该listFiles()方法时需要给其传递一个FileFilter接口类型的实现
类对象。并且此接口中只有一个抽象方法(函数式接口)： boolean accept(File pathname) 用于制定文件的过滤规则


文件过滤器的实现原理：
    listFiles()方法首先会对路径进行遍历，获取目录下的每一个文件、文件夹，并将其封装为File对象。然后listFiles()
方法会把File对象传递给accept()方法的参数pathname，accept()方法返回true就把该对象存入File[]数组中，返回false则
不会存入。所以我们可以在accept()方法中设置过滤条件，让符合过滤条件的File对象返回true并存入File[]数组中。

 */

package ComprehensiveCase;

import java.io.File;

public class FileFilter {
    public static void main(String[] args) {

        File file = new File("E:\\code_ssl\\advanced_code\\day08_code\\src\\FileClass");
        getAllFile(file);

    }

    private static void getAllFile(File dir) {

        // (1).创建实现类的方式

        File[] files01 = dir.listFiles(new FileFilterImpl()); // 遍历该目录下的文件、文件夹，并将过滤后的文件、文件夹存储到File[]数组中

        // (2).使用匿名内部类的方式
        File[] files02 = dir.listFiles(new java.io.FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isDirectory() || file.getName().endsWith(".java");
            }
        });

        // (3).使用Lambda表达式优化
        File[] files03 = dir.listFiles((File file) -> {
            return file.isDirectory() || file.getName().endsWith(".java");
        }); // 标准格式

        File[] files04 = dir.listFiles(file -> file.isDirectory() || file.getName().endsWith(".java")); // 省略格式


        // 遍历该File[]数组
        for (File f : files01) {
            // 判断该路径是否是文件夹
            if (f.isDirectory()) {
                // 如果是一个文件夹，则继续递归调用getAllFile方法遍历这个文件夹
                getAllFile(f);
            } else {
                // 否则直接打印输出
                System.out.println(f);
            }
        }
    }
}
