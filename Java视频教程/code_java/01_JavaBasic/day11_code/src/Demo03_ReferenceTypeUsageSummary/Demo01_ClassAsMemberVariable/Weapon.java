package Demo03_ReferenceTypeUsageSummary.Demo01_ClassAsMemberVariable;

// 英雄的武器类
public class Weapon {

    private String name; // 武器的名字

    public Weapon() {
    }

    public Weapon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
