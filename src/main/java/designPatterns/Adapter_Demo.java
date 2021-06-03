package designPatterns;

/**
 * Created by Ramesh on 030 30.May.21.
 */
interface MediaPlayer {
    void play(String format, String fileName);
}

interface AdvancedMediaPlayer {
    void playMP4(String fileName);
    void playMKV(String fileName);
}

class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing MP4");
    }
    public void playMKV(String fileName){
        //
    }
}

class MKVPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMP4(String fileName) {
        //
    }
    public void playMKV(String fileName){
        System.out.println("Playing MKV");
    }
}
class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;
    MediaAdapter(String format) {
        if(format.equals("MP4")) {
            advancedMediaPlayer = new MP4Player();
        }
        if(format.equals("MKV")) {
            advancedMediaPlayer = new MKVPlayer();
        }
    }
    @Override
    public void play(String format, String fileName) {
        if(format.equals("MP4")) {
            advancedMediaPlayer.playMP4(fileName);
        } else if(format.equals("MKV")) {
            advancedMediaPlayer.playMKV(fileName);
        }
    }
}

class AudioPlayer implements MediaPlayer {
    MediaAdapter adapter;

    @Override
    public void play(String format, String fileName) {
        if(format.equals("MP3")) {
            System.out.println("Playing MP3");
        } else if(format.equals("MP4") || format.equals("MKV")) {
            adapter = new MediaAdapter(format);
            adapter.play(format, fileName);
        }
    }
}

public class Adapter_Demo {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.play("MP4" ,"Welcome.mp4");
    }
}
