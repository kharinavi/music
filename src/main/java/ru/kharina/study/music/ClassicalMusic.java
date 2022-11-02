package ru.kharina.study.music;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Bean
public class ClassicalMusic implements Music{
    @Override
    public String playSong() {
        return "Shopin Cantabile";
    }
}
