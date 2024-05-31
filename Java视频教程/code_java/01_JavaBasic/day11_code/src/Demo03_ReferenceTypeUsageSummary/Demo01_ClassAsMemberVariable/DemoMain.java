package Demo03_ReferenceTypeUsageSummary.Demo01_ClassAsMemberVariable;

public class DemoMain {
    public static void main(String[] args) {

        Hero hero = new Hero();

        hero.setName("盖伦");
        Weapon wp = new Weapon("暴风之剑");
        hero.setWeapon(wp);
        hero.attack();

    }
}
