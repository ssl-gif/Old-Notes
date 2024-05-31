public class Demo02_MethodOverride {

    // 正确重载
    public static void open(){}
    public static void open(int a){}
    public static void open(int a,int b){}
    public static void open(double a,int b){}
    public static void open(int b,double a){}

    // 错误重载
    // public static void open(int i,int j){}
    // public static void open(int a,int b){}   与参数名称无关
    // static void open(int i,int j){}          与修饰符无关
    // public static int open(int i,int j){}    与返回值类型无关
    // public static void OPEN(int i,int j){}   代码正确不会报错，但并不是有效重载

}
