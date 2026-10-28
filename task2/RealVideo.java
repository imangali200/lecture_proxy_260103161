public class RealVideo implements Video {
    private String file;

    public RealVideo(String file) {
        this.file = file;
        System.out.println("--> [DOWNLOADING] Connecting to server & buffering 4K video: " + file);
    }

    public void play() {
        System.out.println("Playing video: " + file);
    }
}
