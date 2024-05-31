package Demo01_FinalKeyWords.Demo03_FinalVariable.Demo03_MemberVariable;

// 法二：通过构造方法赋值：必须保证类中所有重载的构造方法，都能对final成员变量进行赋值
public class Student02 {

    private final String STU_MANE;

    public Student02() {
        STU_MANE = "张三";
    }

    public Student02(String STU_MANE) {
        this.STU_MANE = STU_MANE;
    }

    public String getSTU_MANE() {
        return STU_MANE;
    }

//  此时set方法会改变成员变量的值，不可使用
//    public void setSTU_MANE(String STU_MANE) {
//        this.STU_MANE = STU_MANE;
//    }

}
