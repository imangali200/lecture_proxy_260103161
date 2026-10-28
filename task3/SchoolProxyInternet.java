public class SchoolProxyInternet implements Internet {
    private RealInternet realInternet;

    public void connectTo(String site) {
        if (site.equals("gaming.com") || site.equals("socialmedia.com")) {
            System.out.println("[BLOCKED BY FIREWALL] Cannot access: " + site);
        } else {
            if (realInternet == null) {
                realInternet = new RealInternet();
            }
            realInternet.connectTo(site);
        }
    }
}
