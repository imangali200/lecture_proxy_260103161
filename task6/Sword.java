public class Sword implements Weapon {
    public int damage() {
        return 20;
    }

    public void use() {
        int dmg = damage();
        System.out.println("Slash! Dealing " + dmg + " physical damage.");
    }
}
