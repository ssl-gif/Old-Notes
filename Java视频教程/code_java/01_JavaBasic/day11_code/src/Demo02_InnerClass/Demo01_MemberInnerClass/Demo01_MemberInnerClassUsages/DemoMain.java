package Demo02_InnerClass.Demo01_MemberInnerClass.Demo01_MemberInnerClassUsages;

import Demo02_InnerClass.Demo01_MemberInnerClass.Demo01_MemberInnerClassUsages.Body;

public class DemoMain {
    public static void main(String[] args) {

        // 在其它类中：创建内部类对象访问内部类成员
        Body.Heart heart = new Body().new Heart();
        heart.beat();

    }
}
