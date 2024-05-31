package Demo01_Interface.Demo04_PrivateMethod;

public interface InterfacePrivateA {

    public default void methodDefault1() {
        // System.out.println("AAA");
        // System.out.println("BBB");
        // System.out.println("CCC");
        methodCommon();
        System.out.println("默认方法1");
    }

    public default void methodDefault2() {
        // System.out.println("AAA");
        // System.out.println("BBB");
        // System.out.println("CCC");
        methodCommon();
        System.out.println("默认方法2");
    }

    /*
        将公共代码提取出来封装成一个默认方法，以此来实现代码复用，但是此方法会被实现类继承下去。
    所以需要将该公共方法定义成普通私有方法，不会被实现类继承下去，仅限于本接口内部使用。
    public default void methodCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
     */
    private void methodCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

}
