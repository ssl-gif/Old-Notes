package ComprehensiveCase;

import java.io.File;
import java.io.FileFilter;

public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File file) {

        // 如果传递进来的file对象是一个文件夹：返回true，继续遍历这个文件夹
        if(file.isDirectory()){
            return true;
        }

        // 如果传递进来的file对象是一个文件：以.java结尾的文件返回true，否则返回false
        return file.getName().endsWith(".java");

    }
}
