
// 游戏当中的英雄角色类
package Demo03_ReferenceTypeUsageSummary.Demo02_InterfaceAsMemberVariable;

public class Hero {

    private String name; // 英雄的名字
    private Skill skill; // 英雄的技能，Skill接口类型

    public Hero() {
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    // 英雄的技能攻击方法
    public void attack() {
        System.out.println(name + "开始施放技能：");
        skill.releaseSkills(); // 调用接口中的抽象方法
        System.out.println(name + "施放技能结束！");
    }

}
