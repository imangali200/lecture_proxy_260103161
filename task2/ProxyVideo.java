public class ProxyVideo implements Video {
    private String file;
    private RealVideo realVideo;
    private int viewCount = 0;

    public ProxyVideo(String file) {
        this.file = file;
    }

    public void play() {
        viewCount = viewCount + 1;
        System.out.println("--> [AUDIT] Video has been played " + viewCount + " time(s).");

        if (realVideo == null) {
            realVideo = new RealVideo(file);
        }
        realVideo.play();
    }
}
