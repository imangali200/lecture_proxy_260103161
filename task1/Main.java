public class Main {
    public static void main(String[] args) {
        ProxyImage guest = new ProxyImage("salary_sheet.png", "GUEST");
        ProxyImage admin = new ProxyImage("salary_sheet.png", "ADMIN");

        guest.show();
        admin.show();
    }
}
