package Demo01_FinalKeyWords.Demo03_FinalVariable.Demo03_MemberVariable;

// 法一：直接赋值
public class Student01 {

    private final String STU_MANE = "张三"; // 成员变量可以直接进行赋值

    public Student01() {
    }

//  此时有参构造会改变成员变量的值，不可使用
//    public Student01(String STU_MANE) {
//        this.STU_MANE = STU_MANE;
//    }

    public String getSTU_MANE() {
        return STU_MANE;
    }

//  此时set方法会改变成员变量的值，不可使用
//    public void setSTU_MANE(String STU_MANE) {
//        this.STU_MANE = STU_MANE;
//    }

}
