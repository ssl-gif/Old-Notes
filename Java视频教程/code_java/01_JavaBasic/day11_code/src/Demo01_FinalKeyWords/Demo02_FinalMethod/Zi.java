package Demo01_FinalKeyWords.Demo02_FinalMethod;

public class Zi extends Fu {

    // 可以对普通方法进行覆盖重写
    @Override
    public void methodNormal() {
        super.methodNormal();
    }

    // final方法不能进行覆盖重写
//    @Override
//    public final void methodFinal() {
//        super.methodFinal();
//    }

}
