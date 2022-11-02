package ru.kharina.study.music;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private Music music;
    private ClassicalMusic classicalMusic;

    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusicList(){
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String playMusic() {
        Random random = new Random();

        return "Playing: " + musicList.get(random.nextInt(musicList.size())).playSong();
    }
}
