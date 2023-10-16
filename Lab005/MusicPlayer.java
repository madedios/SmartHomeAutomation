package Lab005;

public class MusicPlayer {
    private boolean isPlaying;
    public void play() {
        isPlaying = true;
        System.out.println("Music is now playing.");
    }

    public void stop() {
        isPlaying = false;
        System.out.println("Music is stopped.");
    }
}
