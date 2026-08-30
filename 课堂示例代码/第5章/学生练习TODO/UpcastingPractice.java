class UpcastMediaPractice {
    void play() {
        // TODO 1: 输出通用播放信息。
    }
}

class UpcastMusicPractice extends UpcastMediaPractice {
    // TODO 2: 重写 play()。
    void showLyrics() {
        System.out.println("Lyrics");
    }
}

public class UpcastingPractice {
    public static void main(String[] args) {
        // TODO 3: 把 UpcastMusicPractice 对象向上转型为 UpcastMediaPractice。
        // TODO 4: 调用 play()，再安全向下转型并调用 showLyrics()。
    }
}
