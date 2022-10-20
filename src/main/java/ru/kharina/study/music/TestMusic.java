package ru.kharina.study.music;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMusic {
    public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
            "applicationContext.xml"
    );
    //Music music = context.getBean("musicBean", Music.class);
    //MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusicList();
        System.out.println("name = "+musicPlayer.getName());
        System.out.println("volume = "+musicPlayer.getVolume());
        context.close();
    }
}
