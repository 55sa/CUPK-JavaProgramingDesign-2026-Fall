class UpcastMediaPracticeAnswer {
    void play() {
        System.out.println("Playing media");
    }
}

class UpcastMusicPracticeAnswer extends UpcastMediaPracticeAnswer {
    @Override
    void play() {
        System.out.println("Playing music");
    }

    void showLyrics() {
        System.out.println("Lyrics");
    }
}

public class UpcastingPracticeAnswer {
    public static void main(String[] args) {
        UpcastMediaPracticeAnswer media = new UpcastMusicPracticeAnswer();
        media.play();
        if (media instanceof UpcastMusicPracticeAnswer) {
            UpcastMusicPracticeAnswer music = (UpcastMusicPracticeAnswer) media;
            music.showLyrics();
        }
    }
}
