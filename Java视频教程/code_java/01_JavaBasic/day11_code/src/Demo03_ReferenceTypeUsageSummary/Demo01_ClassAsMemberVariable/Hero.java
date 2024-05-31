package Demo03_ReferenceTypeUsageSummary.Demo01_ClassAsMemberVariable;

// 游戏当中的英雄角色类
public class Hero {

    private String name; // 英雄的名字
    private Weapon weapon; // 英雄的武器，Weapon类类型

    public Hero() {
    }

    public Hero(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    // 英雄的武器攻击方法
    public void attack(){
        System.out.println(name + "用" + weapon.getName() + "攻击敌方！");
    }

}
