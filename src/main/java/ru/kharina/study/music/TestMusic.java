package ru.kharina.study.music;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMusic {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.playMusic());

        //Music music = context.getBean("rockMusic", Music.class);
    //Music music1 = context.getBean("classicalMusic", Music.class);
    //MusicPlayer musicPlayer = new MusicPlayer(music);
    //MusicPlayer musicPlayer1 = new MusicPlayer(music1);
    //musicPlayer.playMusic();
    //musicPlayer1.playMusic();
        context.close();
    }
}
