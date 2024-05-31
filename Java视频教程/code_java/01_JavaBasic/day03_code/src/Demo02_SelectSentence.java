public class Demo02_SelectSentence {
    public static void main(String[] args) {

        // switch语句举例：根据数字判断输出星期几
        int num = 10;
        switch (num) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("数据不合理");
                break;     // 最后一个break语句可以省略，但是强烈推荐不要省略
        }

        // case 的穿透性
        int i = 5;
        switch (i) {
            case 0:
                System.out.println("执行case0");
                break;
            case 5:
                System.out.println("执行case5");
            case 10:
                System.out.println("执行case10");
            case 15:
                System.out.println("执行case15");
                break;
            default:
                System.out.println("执行default");
        }
    }
}