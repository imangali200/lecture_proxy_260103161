public class MagicWand implements Weapon {
    public int damage() {
        return 35;
    }

    public void use() {
        System.out.println("Zap! Dealing " + damage() + " magic damage.");
    }
}
