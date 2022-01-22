package com.intellekta.mavenlearn;

public class Viewer {
    private String nickname;
    private int age;
    private int countOfFilms;

    public Viewer(String nickname, int age, int countOfFilms) {
        this.nickname = nickname;
        this.age = age;
        this.countOfFilms = countOfFilms;
    }


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCountOfFilms() {
        return countOfFilms;
    }

    public void setCountOfFilms(int countOfFilms) {
        this.countOfFilms = countOfFilms;
    }
}
