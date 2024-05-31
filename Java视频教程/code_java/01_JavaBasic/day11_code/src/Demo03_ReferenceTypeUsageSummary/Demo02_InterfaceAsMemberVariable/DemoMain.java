package Demo03_ReferenceTypeUsageSummary.Demo02_InterfaceAsMemberVariable;

public class DemoMain {
    public static void main(String[] args) {

        // 使用单独定义的实现类
        Hero hero1 = new Hero();
        hero1.setName("艾希");
        SkillImpl wSkill = new SkillImpl();
        hero1.setSkill(wSkill);
        hero1.attack();


        // 使用匿名内部类
        Hero hero2 = new Hero();
        hero2.setName("蛮王");
        hero2.setSkill(new Skill() {
            @Override
            public void releaseSkills() {
                System.out.println("蛮王冲撞");
            }
        });
        hero2.attack();

    }
}
