
/*

File类的四个静态成员变量：

        static String pathSeparator：与系统有关的路径分隔符，字符串类型，即分号：";"
        static char pathSeparatorChar：与系统有关的路径分隔符，字符类型，即分号：';'

        static String separator：与系统有关的文件名称分隔符，字符串类型，即反斜杠："\"
        static char separatorChar：与系统有关的文件名称分隔符，字符类型，即反斜杠：'\'

#.注意事项：
Windows下的路径分隔符是分号 ";"           Linux下的路径分隔符是冒号 ":"
Windows下的文件名称分隔符是反斜杠 "\"      Linux下的文件名称分隔符是正斜杠 "/"

所以为了保证程序的通用性，文件的路径不能写死了：
Windows：C:\develop\a\a.txt
Linux：  C:/develop/a/a.txt
        "C:" + File.separator + "develop" + File.separator + "a" + File.separator + "a.txt"

 */

package FileClass;

import java.io.File;

public class FourStaticMemberVariable {
    public static void main(String[] args) {

        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator); // ;

        String separator = File.separator;
        System.out.println(separator);     // \

    }
}
