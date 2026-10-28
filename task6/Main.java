public class Main {
    public static void main(String[] args) {
        Hero knight1 = new Knight(new Sword());
        Hero knight2 = new Knight(new MagicWand());

        knight1.attack();
        knight2.attack();
    }
}
