package Demo02_InnerClass.Demo01_MemberInnerClass.Demo01_MemberInnerClassUsages;

// 外部类
public class Body {

    private boolean live = true;

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    // 外部类的方法
    public void methodBody() {
        new Heart().beat(); // 在外部类中：创建内部类对象访问内部类成员
    }

    // 成员内部类
    public class Heart {

        // 内部类的方法
        public void beat() {
            if (live) {
                System.out.println("心脏在跳动");
            } else {
                System.out.println("心脏不跳了");
            }
        }

    }

}
