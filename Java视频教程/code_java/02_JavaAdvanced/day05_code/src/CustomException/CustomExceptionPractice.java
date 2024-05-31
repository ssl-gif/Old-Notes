
// 练习：模拟注册操作，如果用户名已存在，则抛出异常并提示：该用户名已经被注册
package CustomException;

import java.util.Scanner;

public class CustomExceptionPractice {

    // 使用数组保存已经注册过的用户名
    static String[] userNames = {"张三", "李四", "王五"};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名：");
        String userName = sc.next();
        try {
            checkUsername(userName);
        } catch (RegisterException e) {
            e.printStackTrace();
        }

    }

    // 定义一个方法，判断用户输入的注册名是否已存在
    private static void checkUsername(String userName) throws RegisterException {
        // 遍历存储用户名的数组，将获取到的每个用户名和用户输入的名字进行比较
        for (String name : userNames) {
            if(name.equals(userName)){
                throw new RegisterException("该用户名已被注册！");
            }
        }
        System.out.println("恭喜您，注册成功！");
    }
}
