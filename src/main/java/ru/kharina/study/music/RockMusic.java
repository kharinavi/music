package ru.kharina.study.music;

import org.springframework.stereotype.Component;

public class RockMusic implements Music{
    @Override
    public String playSong() {
        return "Nothing else matters";
    }
}
